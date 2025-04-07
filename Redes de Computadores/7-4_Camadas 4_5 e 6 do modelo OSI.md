# Camadas 4, 5 e 6 do modelo OSI | 07/04/2025

## Camada 4 - Transporte

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
    - 20/21;
    - 69;

- Um dos principais padrões dentro dessa camada é o IEEE
