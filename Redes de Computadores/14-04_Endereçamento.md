# Endereçamento | 14/04/2025

- Para o endereçamento a gente usa o IP;



- 10000000 = 128
- 10101000 = 168
- 00010110 = 16+4+2 = 22
- 10001000 = 64+4 = 136

- 11000000 = 128+64 = 192
- 11001000 = 200
- 00101011 = 43
- 00100001 = 33

- 11011001 = 192+25 = 217
- 01100111 = 64+32+7 = 103
- 00000000 = 0
- 11111111 = 255

- 

1
2
4
8
16
32
64
128

128+32+8=

# 

- 192.168.0.1 -> Configuração do roteador.
- 192.168.0 -> id da rede
- .1 -> id do host (computador).

## Cast

- Unicast (roteador - manda para um só), multicast e broadcast (envia para todos dentro da rede - repetidor ou Hub)

- ## Classes de endereços

- A -> o primeiro octeto começa com 0
  - O primeiro octeto indentifica a rede.
  - O primeiro octeto vai de 1 a 126.
- B -> o primeiro octeto começa com 1
  - Os dois primeiros octetos identificam a rede.
  - O primeiro octeto vai de 128 a 191.
- C -> o primeiro octeto começa com 2
  - Os três primeiros octetos identificam a rede.
  - O primeiro octeto vai de 192 a 223.

- Tem as classes D e E que são apenas para classes especiais.
- O localhost também é chamado de loopback;
- O broadcast tem como endereço 255.255.255.255

## Mascara padrão

- Tem a mesma lógica do octeto da classe dos endereços. 

## Subredes

- Redução de trafico, optimização da performance, simplificação do gerencimento, distribuição coerente das LANs sobre grandes distancias.
- Fica mais fácil de saber o que cada um está fazendo dentro da rede.

- c d d d c.
- a 
