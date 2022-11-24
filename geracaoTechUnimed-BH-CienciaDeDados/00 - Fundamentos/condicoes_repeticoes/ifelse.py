maior_idade= 18
idade_especial = 12

idade = int(input("informe sua idade:"))

if idade >= maior_idade:
    print("Maior de idade, pode tirar a carta.")

if idade < maior_idade:
    print("Menor de idade, não pode tirar a carta.")




if idade >= maior_idade:
    print("Maior de idade, pode tirar a carta.")
else:
    print("Menor de idade, não pode tirar a carta.")




if idade >= maior_idade:
    print("Maior de idade, pode tirar a carta.")

elif idade > idade_especial:
    print("pode fazer as aulas téoricas.")
else:
    print("Menor de idade, não pode tirar a carta.")