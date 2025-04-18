# Camadas 4, 5 e 6 do modelo OSI | 07/04/2025

## Camada 4 - Transporte

- Conexão fim a fim;
- Protocolos:
  - TCP:
    - Mais confiável;
  - UDP:
    - Mais rápido;
    - Usado para carregar um volume grande de mídias.
    - Usa a <b>Janela deslizante</b>;
      - ![Image](https://github.com/user-attachments/assets/68f1f4b3-6c7f-4268-9ea7-8deba2b54e09)
      - Ele garante que a mensagem seja enviada, mas por conta dessa sequência de verificações ele acaba sendo mais lento.
      - Conexão fim a fim

## Camada 5 - Sessão

- A principal função é fazer login e reestabelecer conexões após uma eventual interrupção.

## Camada 6 - Apresentação

- É a camada de criptografia;
- Conversão de caracteres de ASCII para EBCDIC da IBM;
- Criptografar é embaralhar uma mensagem;

## Camada 7 - Aplicação

- Contém diversos protocolos que são bastante utilizados.
  - HTTP, HTTPs (Acesso a internet com segurança);
  - SMTP (enviar email);
    - 25;
  - POP3 (receber email);
    - 110;
  - SSH (acesso remoto (mais seguro));
    - 22;
  - TELNET (acesso remoto);
    - 23;
  - SNMP (gerenciamento de rede);
    - Todos os protocolos usam portas para que o firewall possa bloquear.
    - 161;
  - FTP e TFTP (transferencia de arquivos);
    - 20/21 (+ seguro, porque utiliza o TCP);
    - 69 (+ rápido, );

### Padrões

- IEEE;
  - Um dos principais padrões dentro dessa camada é o IEEE;
- Ethernet;
  - É mais usado para o cabeamento;
- DNS;
  - 53;
- DHCP
  - 67;

### Observações
- A cisco tem os seus próprios protocolos porque servem para os seus dispositivos.

## Trabalho 

- Mínimo de 7 referências.
- 50% por cento da nota.
- Terá a parte prática.

# Modelo TCP/IP

- Baixo indice de falha;
- Escalonado;
- Modelo de fácil configuração;
- 4 Camadas: Acesso a Rede/Interface (fisica e enlace), Internet/Redes (rede - roteamento), Transporte (transporte) e Aplicação (seção, apresentação e aplicação).
  - Ou seja, o OSI compactou e virou o TCP/IP.
 
## Acesso a Rede

- Cabeamento e MAC address;
- Controle de fluxo e confiabilidade de conexão;
- Essa camada liga o meio físico com o meio lógico;

## Internet

- A gente diferencia as redes pelo número do IP.

- IP - internet estável.
- ARP - endereço de hardware.
- ICMP - Comunicação de informações vitais do hardware.

<hr>

- O TCP é orientado a conexão;
- O UDP não tem entrega garantida, mas é um protocolo leve.
  - Alguns pacotes normalmente são perdidos.
  - Ele é leve porque o cabeçalho dele não é tão grande, por isso ele não vai garantir que os pacotes cheguem.
