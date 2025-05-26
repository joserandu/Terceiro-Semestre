# Cabeamento Estruturado | 26/05/2025

- Se tiver um problema com a rede:
  - Eletricidade
  - Cabeamento
  - Ver se os pacotes estão chegando por meio do comando ping.
    - Se tiver problema na placa de rede, vai mostrar.
  - Verificar o roteamento. (Traceroute)

  - ACL - Lista de Controle de Acesso.
    - É um programa para controlar o acesso.

  - Para saber o tanto de repetidores para colocar em uma rede, é preciso saber o alcance de cada repetidor.
  - De acordo com o número de antenas a qualidade do sinal é melhor.

- Tabela de roteamento
  - A gente vai ver os caminhos de roteador para roteador.  
 
# Comandos de rede

## Endereço de loopback
- **127.0.0.1**  
  - Utilizado para testes de rede e testes de programação.

## Configuração de rede
- **ipconfig /all**  
  - Exibe a configuração completa da rede, incluindo endereço IP, máscara de sub-rede, gateway padrão e servidores DNS (Windows).

## Diagnóstico de conectividade
- **ping**  
  - Envia pacotes ICMP para verificar a conectividade com um host remoto.  
  - Exemplo: `ping google.com`

- **traceroute** (Linux/macOS) / **tracert** (Windows)  
  - Mapeia o caminho que os pacotes seguem até um destino.  
  - Exemplo: `tracert google.com`

## Monitoramento de conexões
- **netstat**  
  - Exibe estatísticas de rede e conexões ativas.  
  - Opção `-an`: Mostra todas as conexões e portas usadas.  
  - Exemplo: `netstat -an`

## Manipulação de rotas
- **route**  
  - Mostra e manipula a tabela de roteamento da máquina.  
  - Exemplo: `route print` (Windows) / `route -n` (Linux)

## Endereçamento e resolução de IP
- **ARP**  
  - Exibe e manipula a tabela de resolução de endereços IP para endereços MAC.  
  - Exemplo: `arp -a`

## Resolução de nomes NetBIOS
- **NbtStat**  
  - Utilizado para diagnosticar problemas em redes com NetBIOS.  
  - Opção `-A <IP>`: Exibe informações de um computador remoto.  
  - Opção `-c`: Exibe a cache de nomes NetBIOS.  
  - Opção `-n`: Exibe os nomes NetBIOS registrados localmente.  
  - Exemplo: `nbtstat -A 192.168.1.1`

## Identificação do endereço MAC
- **getmac**  
  - Exibe os endereços MAC associados às interfaces de rede do sistema.  
  - Exemplo: `getmac`

## Comunicação remota
- **telnet**  
  - Permite a comunicação remota com um servidor utilizando o protocolo Telnet.  
  - Exemplo: `telnet <IP>`  
  - Observação: O Telnet pode não estar ativado por padrão em alguns sistemas por razões de segurança.

## Consulta de DNS
- **nslookup**  
  - Permite consultas a servidores DNS para obter endereços IP ou informações de domínios.  
  - Exemplo: `nslookup google.com`

## Configuração avançada de rede
- **netsh**  
  - Utilizado para configurar e gerenciar parâmetros de rede no Windows.  
  - Pode ser usado para modificar configurações de firewall, Wi-Fi e interfaces de rede.  
  - Exemplo: `netsh interface show interface`

# Lição de Casa

- Utilizar esses comandos na nossa casa e colocar os prints no moodle.
- E usar mais 6 comandos
- Quem fazer no linux


0
                                       
