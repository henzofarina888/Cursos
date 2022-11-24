opcao= -1

while opcao !=0:
    opcao = int(input("[1]sacar, [2] extrato, [0] sair: \n"))

    if opcao ==1:
        print("Sacando....")
    elif opcao == 2:
        print("Exibindo extrato.....")
else:
    print("\nObrigado")