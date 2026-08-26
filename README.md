# TP1-1 — App de Boas-Vindas

Aplicativo Android desenvolvido em Kotlin como parte de um trabalho acadêmico.

## Funcionalidade
O app recebe o nome e a idade do usuário através de dois campos de texto (`EditText`). 
Ao clicar no botão de envio, exibe uma mensagem de boas-vindas personalizada na tela, 
combinando o nome e a idade informados.

## Tecnologias
- Kotlin
- Android SDK (AppCompatActivity, EditText, Button, TextView)

## Como funciona
1. O usuário digita o nome no campo `editNome`
2. O usuário digita a idade no campo `editNumero`
3. Ao clicar no botão "Enviar", o app monta a mensagem: 
   *"Bem-vindo(a), [nome] de [idade] anos."* e exibe no `TextView`
