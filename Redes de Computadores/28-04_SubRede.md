# Sub-rede

- A ideia é diminuir o tráfego e otimizar performace.
- CIDR (Classless Inter-Domain Routing)
  - Serve para representar o tamanho de uma máscara de redes.
  - 255.255.255.0 são 3 octetos, também chamados de /24.
  - Se temos a mascara /26 teremos dois bits depois da /24, ou seja, 128+64=192, logo o CIDR é 225.225.225.192.
  - A gente usa os 4 octetos para identificar a rede e vão de um intervalo do último octeto de 0 a 63, de 64 a 127, de 128 a 191 e de 192 a 255.

 # Simulador para o nosso trabalho

 - Package Trace.
