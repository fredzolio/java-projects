#Escreva um programa que receba o valor do salário mínimo 
#atual e calcule um aumento de 15%, exibindo o valor do 
#aumento e o salário final na tela

minsal = int(input('Insira o valor do salário mínimo atual: '))
inc = 0.15*minsal
increasedvalue = minsal + inc
print('O salário mínimo atual é:' + str(minsal) +'\n''O valor do aumento é ' + str(inc) + '\n''O valor com o aumento é '+ str(increasedvalue))
