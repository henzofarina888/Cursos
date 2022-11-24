class bike:
  def __init__(self, cor, marca, ano, preco):
    self.cor = cor
    self.marca = marca
    self.ano = ano
    self.preco = preco
  
  def andar(self):
    print("pedalando")
  
  def __str__(self):
    return f"{self.__class__.__name__}: {', '.join([f'{chave}={valor}' for chave, valor in self.__dict__.items()])}".format()



caloi= bike("vermelho", "caloi", 2022, 1200)
print(caloi)

