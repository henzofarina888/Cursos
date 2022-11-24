class animal:
    def __init__(self, peso, qtd_patas):
        self.peso = peso
        self.qtd_patas = qtd_patas
    
    def __str__(self):
        return f"{self.__class__.__name__}: {', '.join([f'{chave}={valor}' for chave, valor in self.__dict__.items()])}"

class mamifero(animal):
    def __init__(self, cor_pelo, **km):
        super().__init__(**km)
        self.cor_pelo = cor_pelo

class ave(animal):
    def __init__(self, cor_bico, temp_sube, **km):
        super().__init__(**km)
        self.cor_bico = cor_bico
        self.temp_sube = temp_sube


class gato(mamifero):
    pass

class cachorro(mamifero):
    pass

class leao(mamifero):
    pass

class ornitorrinco(ave, mamifero):
    pass



pedro= gato(peso=12,qtd_patas= 4, cor_pelo="preto")
print(pedro)

joao= ornitorrinco(peso= 8, qtd_patas=4, cor_pelo="Verde escuro", cor_bico="laranja")
print(joao)