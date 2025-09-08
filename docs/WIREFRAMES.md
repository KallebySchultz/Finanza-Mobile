# 5. WIREFRAMES - FINANZA

## 📱 **WIREFRAMES MOBILE (Android)**

### 5.1 Tela de Login
```
┌─────────────────────────────────────┐
│  FINANZA                     [☰]    │ ← Status bar padrão Android
├─────────────────────────────────────┤
│                                     │
│              [🏦]                   │ ← Logo Finanza
│             FINANZA                 │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 📧 Email                        │ │ ← Campo de email
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 🔒 Senha                    👁   │ │ ← Campo senha com toggle
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │         ENTRAR                  │ │ ← Botão principal
│  └─────────────────────────────────┘ │
│                                     │
│  Esqueceu a senha?                  │ ← Link recuperação
│                                     │
│  ────────── OU ──────────           │ ← Divisor
│                                     │
│  ┌─────────────────────────────────┐ │
│  │       CRIAR CONTA               │ │ ← Botão secundário
│  └─────────────────────────────────┘ │
│                                     │
│  Versão 2.5.0                      │ ← Info da versão
└─────────────────────────────────────┘
```
**Legenda:** Tela inicial de autenticação com design Material, permitindo login de usuários existentes ou navegação para criação de nova conta. Inclui validação de campos e feedback visual.

---

### 5.2 Dashboard Principal
```
┌─────────────────────────────────────┐
│  Dashboard              [🔄] [👤]   │ ← Header com sync e perfil
├─────────────────────────────────────┤
│  Olá, Kalleby! 👋                   │ ← Saudação personalizada
│                                     │
│  ┌─────────────────────────────────┐ │
│  │  💰 SALDO ATUAL                 │ │
│  │      R$ 2.847,50               │ │ ← Card saldo principal
│  │  ↗️ +R$ 150,00 (este mês)       │ │
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────┬─────────────────────┬─────┐ │
│  │ 📈  │ RECEITAS            │+R$  │ │ ← Cards resumo
│  │3.2K │ Novembro            │780  │ │
│  └─────┴─────────────────────┴─────┘ │
│  ┌─────┬─────────────────────┬─────┐ │
│  │ 📉  │ DESPESAS            │-R$  │ │
│  │2.9K │ Novembro            │630  │ │
│  └─────┴─────────────────────┴─────┘ │
│                                     │
│  📊 GRÁFICO MENSAL                  │ ← Seção gráficos
│  ┌─────────────────────────────────┐ │
│  │     🥧 [Pizza Chart]            │ │
│  │   Alimentação: 35%              │ │
│  │   Transporte: 25%               │ │
│  │   Lazer: 20%                    │ │
│  │   Outros: 20%                   │ │
│  └─────────────────────────────────┘ │
│                                     │
│  📝 ÚLTIMAS TRANSAÇÕES              │ ← Lista transações
│  ┌─────────────────────────────────┐ │
│  │ 🛒 Supermercado X    -R$ 89,50  │ │
│  │ 💰 Salário          +R$ 2800,00 │ │
│  │ ⛽ Posto de Gasolina -R$ 120,00 │ │
│  └─────────────────────────────────┘ │
│                                     │
├─────────────────────────────────────┤
│ [🏠] [📊] [➕] [💳] [👤]             │ ← Navigation bottom
└─────────────────────────────────────┘
```
**Legenda:** Dashboard principal com visão completa das finanças do usuário, incluindo saldo atual, resumo mensal, gráficos de categorias e últimas transações. Interface responsiva com navegação inferior.

---

### 5.3 Adicionar Transação
```
┌─────────────────────────────────────┐
│  [←] Nova Transação        [💾]     │ ← Header com voltar e salvar
├─────────────────────────────────────┤
│                                     │
│  TIPO DE TRANSAÇÃO                  │
│  ┌─────────┐ ┌─────────┐           │
│  │RECEITA  │ │DESPESA  │           │ ← Toggle tipo
│  │   💰    │ │   💸    │           │
│  └─────────┘ └─────────┘           │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 💵 Valor: R$                    │ │ ← Campo valor
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 📝 Descrição                    │ │ ← Campo descrição
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 🏦 Conta: Banco do Brasil       │ │ ← Dropdown contas
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 🏷️ Categoria: Alimentação       │ │ ← Dropdown categorias
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 📅 Data: 15/12/2024             │ │ ← Seletor data
│  └─────────────────────────────────┘ │
│                                     │
│  📸 ANEXAR FOTO/NOTA                │ ← Opção anexos
│  ┌─────────────────────────────────┐ │
│  │    [📷] [📎] [🎤]              │ │
│  └─────────────────────────────────┘ │
│                                     │
│  ┌─────────────────────────────────┐ │
│  │         SALVAR                  │ │ ← Botão principal
│  └─────────────────────────────────┘ │
│                                     │
├─────────────────────────────────────┤
│ [🏠] [📊] [➕] [💳] [👤]             │
└─────────────────────────────────────┘
```
**Legenda:** Formulário completo para adicionar nova transação com todos os campos necessários, validação em tempo real e opções de anexos. Interface intuitiva com toggle entre receita/despesa.

---

### 5.4 Lista de Transações
```
┌─────────────────────────────────────┐
│  Movimentações         [🔍] [⚙️]    │ ← Header com busca e filtros
├─────────────────────────────────────┤
│  Dezembro 2024                      │ ← Seletor mês/ano
│  ┌─────┬─────────┬─────────────────┐ │
│  │ << │  DEZ/24 │        >>       │ │
│  └─────┴─────────┴─────────────────┘ │
│                                     │
│  RESUMO DO MÊS                      │
│  ┌─────────────────────────────────┐ │
│  │ 📈 Receitas:    R$ 3.200,00     │ │
│  │ 📉 Despesas:    R$ 2.890,00     │ │ ← Cards resumo mês
│  │ 💰 Saldo:       R$ +310,00      │ │
│  └─────────────────────────────────┘ │
│                                     │
│  🔍 Filtros: Todas as categorias ▼  │ ← Filtros ativos
│                                     │
│  ┌─────────────────────────────────┐ │
│  │ 15/12 🛒 Mercado Central        │ │
│  │ Alimentação      📍Conta Corrente│ │ ← Item transação
│  │                    -R$ 145,50   │ │
│  ├─────────────────────────────────┤ │
│  │ 14/12 💰 Freelance             │ │
│  │ Trabalho        📍PayPal        │ │
│  │                   +R$ 800,00    │ │
│  ├─────────────────────────────────┤ │
│  │ 13/12 ⛽ Posto Shell           │ │
│  │ Transporte      📍Cartão        │ │
│  │                   -R$ 95,00     │ │
│  ├─────────────────────────────────┤ │
│  │ 12/12 🏥 Farmácia              │ │
│  │ Saúde          📍Dinheiro       │ │
│  │                   -R$ 45,80     │ │
│  └─────────────────────────────────┘ │
│                                     │
│  [EXPORTAR MÊS] [+ NOVA TRANSAÇÃO]  │ ← Ações bottom
├─────────────────────────────────────┤
│ [🏠] [📊] [💰] [💳] [👤]             │
└─────────────────────────────────────┘
```
**Legenda:** Lista completa de transações com filtros por período, categoria e conta. Inclui resumo mensal, busca avançada e opções de exportação de dados.

---

## 🖥️ **WIREFRAMES DESKTOP (Java Swing)**

### 5.5 Interface Principal Desktop
```
┌────────────────────────────────────────────────────────────────────────┐
│ Finanza Desktop Server v2.5                               [─] [□] [✕] │ ← Window title bar
├────────────────────────────────────────────────────────────────────────┤
│ [Arquivo] [Editar] [Visualizar] [Ferramentas] [Ajuda]                  │ ← Menu bar
├────────────────────────────────────────────────────────────────────────┤
│ [🏠Home] [👥Users] [💰Trans] [🏦Contas] [🏷️Cat] [📊Rel] [⚙️Config]   │ ← Toolbar
├─────────────────┬──────────────────────────────────────────────────────┤
│  NAVEGAÇÃO      │  DASHBOARD PRINCIPAL                                 │
│                 │                                                      │
│ 🏠 Dashboard    │  📊 VISÃO GERAL FINANCEIRA                          │
│ 👥 Usuários     │  ┌──────────────────────────────────────────────────┐ │
│ 💰 Transações   │  │  Total Usuários Ativos: 8                       │ │
│ 🏦 Contas       │  │  Total Transações Hoje: 23                      │ │ ← Sidebar navigation
│ 🏷️ Categorias   │  │  Volume Financeiro: R$ 15.847,90                │ │
│ 📊 Relatórios   │  │  Última Sincronização: 14:35:20                 │ │
│ 🔄 Sincronização│  └──────────────────────────────────────────────────┘ │
│ 👤 Perfil       │                                                      │
│ ⚙️ Configurações│  📈 GRÁFICO ATIVIDADE DIÁRIA                        │
│                 │  ┌──────────────────────────────────────────────────┐ │
│ 🔌 CONEXÕES     │  │      [Chart Area - Line Graph]                  │ │
│ ● Online: 3     │  │   📊 ████▆▅▇███▅▆▇                              │ │
│ ● Idle: 2       │  │   📅 1  5  10 15 20 25 30 (Dezembro)            │ │
│ ● Offline: 3    │  └──────────────────────────────────────────────────┘ │
│                 │                                                      │
│ 📺 LOG SISTEMA  │  🔄 ATIVIDADE DE SINCRONIZAÇÃO                      │
│ [14:35:20] Sync │  ┌──────────────────────────────────────────────────┐ │
│ [14:30:15] Login│  │ ▶ User: kalleboy@email.com | 23 transações sync  │ │
│ [14:25:10] Error│  │ ▶ User: maria@email.com | 8 transações sync     │ │
│ [14:20:05] Conn │  │ ▶ User: joao@email.com | Conflito resolvido     │ │
│                 │  │ ▶ User: ana@email.com | 15 transações sync      │ │
│                 │  └──────────────────────────────────────────────────┘ │
│                 │                                                      │
│                 │  ⚠️ ALERTAS E NOTIFICAÇÕES                          │
│                 │  ┌──────────────────────────────────────────────────┐ │
│                 │  │ ! Backup agendado para 23:00                    │ │
│                 │  │ ! 2 conflitos pendentes de resolução            │ │
│                 │  │ ✓ Sistema funcionando normalmente               │ │
│                 │  └──────────────────────────────────────────────────┘ │
├─────────────────┴──────────────────────────────────────────────────────┤
│ Status: ●Servidor Ativo | Porto: 8080 | Uptime: 2h 15m | Mem: 256MB    │ ← Status bar
└────────────────────────────────────────────────────────────────────────┘
```
**Legenda:** Interface principal do servidor desktop com dashboard administrativo, mostrando status do sistema, conexões ativas, logs em tempo real e métricas de performance. Design profissional com navegação lateral.

---

### 5.6 Gerenciamento de Usuários
```
┌────────────────────────────────────────────────────────────────────────┐
│ Finanza Desktop - Gerenciamento de Usuários               [─] [□] [✕] │
├────────────────────────────────────────────────────────────────────────┤
│ [Arquivo] [Editar] [Visualizar] [Ferramentas] [Ajuda]                  │
├────────────────────────────────────────────────────────────────────────┤
│ [🏠Home] [👥Users] [💰Trans] [🏦Contas] [🏷️Cat] [📊Rel] [⚙️Config]   │
├─────────────────┬──────────────────────────────────────────────────────┤
│  AÇÕES RÁPIDAS  │  👥 LISTA DE USUÁRIOS                               │
│                 │                                                      │
│ ┌─────────────┐ │  🔍 [Buscar usuário...        ] [🔍] [⚙️Filtros]   │
│ │[+ NOVO      │ │                                                      │
│ │  USUÁRIO]   │ │  ┌──────────────────────────────────────────────────┐ │
│ └─────────────┘ │  │ ID │ Nome          │ Email             │ Status  │ │
│                 │  ├────┼───────────────┼───────────────────┼─────────┤ │
│ ┌─────────────┐ │  │001 │ Kalleby S.    │kalleboy@email.com │●Online  │ │
│ │[📊 RELATÓRIO│ │  │002 │ Maria Silva   │maria@email.com   │●Online  │ │
│ │  USUÁRIOS]  │ │  │003 │ João Santos   │joao@email.com    │⚪Idle   │ │ ← User table
│ └─────────────┘ │  │004 │ Ana Costa     │ana@email.com     │●Online  │ │
│                 │  │005 │ Pedro Lima    │pedro@email.com   │⚫Offline│ │
│ ┌─────────────┐ │  │006 │ Julia Neves   │julia@email.com   │⚫Offline│ │
│ │[🔄 SYNC     │ │  │007 │ Carlos Rocha  │carlos@email.com  │⚪Idle   │ │
│ │  FORÇADA]   │ │  │008 │ Lucia Pereira │lucia@email.com   │⚫Offline│ │
│ └─────────────┘ │  └──────────────────────────────────────────────────┘ │
│                 │                                                      │
│ 📊 ESTATÍSTICAS │  📋 DETALHES DO USUÁRIO SELECIONADO                 │
│ Total: 8        │  ┌──────────────────────────────────────────────────┐ │
│ Online: 3       │  │ Nome: Kalleby Schultz                            │ │
│ Idle: 2         │  │ Email: kalleboy@email.com                        │ │
│ Offline: 3      │  │ Criado em: 15/07/2024                           │ │
│                 │  │ Último Login: 15/12/2024 14:30                  │ │
│ 🔄 ÚLTIMA SYNC  │  │ Transações: 1.247                               │ │
│ 14:35:20        │  │ Contas: 4                                        │ │
│                 │  │ Categorias: 12                                   │ │
│                 │  └──────────────────────────────────────────────────┘ │
│                 │                                                      │
│                 │  🔧 AÇÕES DISPONÍVEIS                               │
│                 │  [✏️Editar] [🔒Reset Senha] [🗑️Excluir] [🔄Sync]   │
├─────────────────┴──────────────────────────────────────────────────────┤
│ Usuários Conectados: 3 | Última Atualização: 14:35:20                  │
└────────────────────────────────────────────────────────────────────────┘
```
**Legenda:** Interface de gerenciamento de usuários com tabela de listagem, detalhes do usuário selecionado, estatísticas em tempo real e ações administrativas. Permite monitoramento completo da base de usuários.

---

### 5.7 Monitor de Sincronização
```
┌────────────────────────────────────────────────────────────────────────┐
│ Finanza Desktop - Monitor de Sincronização                [─] [□] [✕] │
├────────────────────────────────────────────────────────────────────────┤
│ [Arquivo] [Editar] [Visualizar] [Ferramentas] [Ajuda]                  │
├────────────────────────────────────────────────────────────────────────┤
│ [🏠Home] [👥Users] [💰Trans] [🏦Contas] [🏷️Cat] [📊Rel] [⚙️Config]   │
├─────────────────┬──────────────────────────────────────────────────────┤
│  CONTROLES      │  🔄 STATUS DE SINCRONIZAÇÃO                         │
│                 │                                                      │
│ ┌─────────────┐ │  ⏱️ Última Sincronização: 14:35:20                  │
│ │[▶️ INICIAR  │ │  📊 Total Sincronizações Hoje: 156                  │
│ │ SYNC GERAL] │ │  ⚡ Média de Tempo: 1.2s                            │
│ └─────────────┘ │  📈 Taxa de Sucesso: 98.7%                          │
│                 │                                                      │
│ ┌─────────────┐ │  🔄 SINCRONIZAÇÕES ATIVAS                           │
│ │[⏸️ PAUSAR   │ │  ┌──────────────────────────────────────────────────┐ │
│ │ TODAS]      │ │  │ Usuario           │ Status      │ Progresso      │ │
│ └─────────────┘ │  ├───────────────────┼─────────────┼────────────────┤ │
│                 │  │ kalleboy@email    │🔄 Sincron.  │████████░░ 80% │ │
│ ┌─────────────┐ │  │ maria@email       │✅ Completa  │██████████100% │ │ ← Active syncs
│ │[🔄 SYNC     │ │  │ joao@email        │⏳ Aguard.   │░░░░░░░░░░  0% │ │
│ │ FORÇADA]    │ │  │ ana@email         │❌ Erro      │████░░░░░░ 40% │ │
│ └─────────────┘ │  └──────────────────────────────────────────────────┘ │
│                 │                                                      │
│ 📊 MÉTRICAS     │  📋 LOG DE SINCRONIZAÇÃO                            │
│ ┌─────────────┐ │  ┌──────────────────────────────────────────────────┐ │
│ │ Hoje: 156   │ │  │ [14:35:20] ✅ kalleboy@email - 23 transações     │ │
│ │ Semana: 892 │ │  │ [14:35:18] 🔄 Iniciando sync para kalleboy       │ │
│ │ Mês: 3.247  │ │  │ [14:35:15] ✅ maria@email - 8 transações         │ │ ← Sync logs
│ │ Erros: 12   │ │  │ [14:35:10] ⚠️ joao@email - Conflito detectado    │ │
│ └─────────────┘ │  │ [14:35:08] 🔄 Resolvendo conflito joao@email     │ │
│                 │  │ [14:35:05] ✅ ana@email - 15 transações           │ │
│ 🚨 ALERTAS      │  │ [14:34:58] ❌ pedro@email - Erro de conexão       │ │
│ ┌─────────────┐ │  │ [14:34:55] 🔄 Tentativa reconexão pedro@email    │ │
│ │ ⚠️ 2 Conflitos│ │  └──────────────────────────────────────────────────┘ │
│ │ ❌ 1 Erro    │ │                                                      │
│ │ ✅ 3 OK      │ │  🔧 RESOLUÇÃO DE CONFLITOS                          │
│ └─────────────┘ │  ┌──────────────────────────────────────────────────┐ │
│                 │  │ ⚠️ Conflito: joao@email - Transação duplicada    │ │
│                 │  │ Estratégia: [Usar servidor ▼] [Usar cliente ▼]  │ │
│                 │  │ [✅ Resolver] [❌ Ignorar] [⏳ Adiar]            │ │
│                 │  └──────────────────────────────────────────────────┘ │
├─────────────────┴──────────────────────────────────────────────────────┤
│ Sync Ativo: 1 | Filas: 3 | Última Atualização: 14:35:20 | Mem: 128MB   │
└────────────────────────────────────────────────────────────────────────┘
```
**Legenda:** Interface especializada para monitoramento de sincronização em tempo real, mostrando status das sincronizações ativas, logs detalhados, métricas de performance e ferramentas para resolução de conflitos.

---

## 📊 Resumo dos Wireframes

### **Mobile (4 telas principais):**
1. **Login** - Autenticação e entrada no sistema
2. **Dashboard** - Visão geral financeira e navegação
3. **Nova Transação** - Formulário completo de entrada
4. **Lista Transações** - Histórico e filtros avançados

### **Desktop (3 interfaces principais):**
1. **Dashboard Principal** - Administração e monitoramento geral
2. **Gestão Usuários** - Administração da base de usuários
3. **Monitor Sync** - Controle de sincronização especializado

### **Características dos Wireframes:**

#### **Mobile:**
- ✅ Design Material Design responsivo
- ✅ Navegação por bottom navigation
- ✅ Cards e componentes modernos
- ✅ Feedback visual em tempo real
- ✅ Otimizado para touch screen

#### **Desktop:**
- ✅ Interface Swing profissional
- ✅ Menu bar e toolbar completos
- ✅ Layout em painéis (sidebar + main)
- ✅ Tabelas de dados robustas
- ✅ Logs e monitoramento em tempo real

### **Princípios de Design Aplicados:**

1. **Consistência:** Cores, tipografia e iconografia padronizadas
2. **Usabilidade:** Fluxos intuitivos e feedback claro
3. **Acessibilidade:** Contraste adequado e navegação por teclado
4. **Performance:** Carregamento rápido e responsividade
5. **Escalabilidade:** Interface preparada para crescimento

---

*Wireframes criados seguindo padrões de UX/UI modernos*  
*Versão: 1.0 | Data: Dezembro 2024*  
*Ferramenta: ASCII Art + Análise de Requisitos*