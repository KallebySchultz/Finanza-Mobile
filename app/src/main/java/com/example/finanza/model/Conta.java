package com.example.finanza.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(
        foreignKeys = @ForeignKey(
                entity = Usuario.class,
                parentColumns = "id",
                childColumns = "usuarioId",
                onDelete = ForeignKey.CASCADE
        )
)
public class Conta {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nome;
    public double saldoInicial;
    public int usuarioId;
    
    // Sync metadata for bidirectional synchronization
    @ColumnInfo(defaultValue = "''")
    public String uuid; // Universal unique identifier for cross-platform sync
    @ColumnInfo(defaultValue = "0")
    public long lastModified; // Timestamp of last modification for conflict resolution
    @ColumnInfo(defaultValue = "2")
    public int syncStatus; // 0=local_only, 1=synced, 2=needs_sync, 3=conflict
    @ColumnInfo(defaultValue = "0")
    public long lastSyncTime; // Timestamp of last successful sync
    @ColumnInfo(defaultValue = "''")
    public String serverHash; // Hash of server data to detect changes
    
    public Conta() {
        // Generate UUID for new accounts
        this.uuid = java.util.UUID.randomUUID().toString();
        this.lastModified = System.currentTimeMillis();
        this.syncStatus = 2; // needs_sync by default
        this.lastSyncTime = 0;
        this.serverHash = "";
    }
    
    public void markAsModified() {
        this.lastModified = System.currentTimeMillis();
        this.syncStatus = 2; // needs_sync
    }
    
    public void markAsSynced() {
        this.syncStatus = 1; // synced
        this.lastSyncTime = System.currentTimeMillis();
    }
    
    /**
     * Generate hash for duplicate detection and conflict resolution
     */
    public String generateDataHash() {
        String data = nome + "|" + saldoInicial + "|" + usuarioId;
        return String.valueOf(data.hashCode());
    }
}