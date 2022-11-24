class veiculo:
    def __init__( self, cor, VeloM, placa, marca, motor, num_rodas):
        self.cor=cor
        self.marca=marca
        self.VeloM=VeloM
        self.placa=placa
        self.motor=motor
        self.num_rodas=num_rodas

    def ligar_motor(self):
        print("ligando motor....")
    
    def __str__(self):
        return f"{self.__class__.__name__}: {', '.join([f'{chave}={valor}' for chave, valor in self.__dict__.items()])}"

class moto(veiculo):
    pass

class carro(veiculo):
    pass

class caminhao(veiculo):
    def __init__(self, cor, VeloM, placa, marca, motor, num_rodas, carregado):
        super().__init__(cor, VeloM, placa, marca, motor, num_rodas)
        self.carregado = carregado

    def estar_carregado(self):
        print(f"{'sim' if self.carregado else 'não'} estou carregado!!!")

class hoverboard(veiculo):
    pass



cb160= moto("preto", 125, "abc-1829", "Honda", "160cc", 2)
Uno= carro("verde", 150, "ABC-1974", "Fiat", "1.4", 4)
Vm270 = caminhao("branco", 270, "abd-4358","volvo", "7.2", 6, False)
print(Vm270)
print(Uno)
print(cb160)
