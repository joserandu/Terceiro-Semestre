# Camada de enlace do modelo OSI (Camada 2)

- 802.11 é um protocolo usado para redes sem fio.
- Essa camada vai corrigir os dados que estão tendo colisões.
  - Quem faz isso é o controle de fluxo.
  - Essas colisões são feitas pelos dispositivos.
- O enlace também é a ligação entre os dispositivos da rede.
- A segmentação das unidades de dados é feita para evitar a perda das informações.
- Também faz o sequenciamento das unidades de dados.
  - Pode ser que a informação venha embaralhada, como o 4 antes do 2 por exemplo.
  - Alguma informação pode se perder no caminho.

## Switch

- O Switch vai encaminhar quadros/frames
- O hub e o repetidor estão na camada 1 e o Switch está mais acima por ligar vários dispositivos
- Se ele quiser mandar uma informação apenas para um dispositivo ele vai pegar o endereço do MAC e enviar dados somente para ele.
- Pode colocar um roteador, hub ou até um repetidor no switch.

## subcamada MAC

## subcamada LLC

- Controle do fluxo de dados dentro do sistema.

# Camada 3 (Redes)

- Faz a parte de <b style="color: red;">ROTEAMENTO</b> dentro da rede.
- Vai conectar os dispositívos a partir dos endereços utilizando protocolos.
  - Isso é feito com uma tabela de roteamento que vai mostrar qual é o melhor caminho para distribuir a informação.
- Irá encaminhar os pacotes.
- Precisamos saber a origem e o destino das informações para se houver algum erro na mensagem ele enviar de volta para aquele que está enviando.
- Para testes usamos o localhost (endereço: 127.0.0.1)
- O endereço de IP é a identificação da sua máquina na rede: 192.168.0.1.
- Não pode ter dois IPs nem dois MACs iguais na mesma rede.
- Os dois não vão funcionar.

<hr>

1 - O que é um pacote?
  - Um conjunto de bits e frames.
  - um conjunto de roteadores.
  - Um conjunto de Switchs e Hubs.
  - Um conjunto de dados.
  - Um conjunto de computadores.
  
2 - Qual é o número da porta do protocolo https?
  - 80
  - 50
  - 21
  - 30
  - 400

3 - Qual é o nome da camada 2 do modelo OSI?

4 - Cite um protocolo de redes que não seja o OSI?

5 - O que quer dizer MAC?
