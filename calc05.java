//código do MainActivity.java

//

//

/*                    */ implements ViewOnClickListener

    private Button numeroZero,numeroUm,numeroDois,numeroTres,numeroQuatro,numeroCinco,
    numeroSeis,numeroSete,numeroOito,numeroNove,ponto,soma,subtracao,multiplicacao,divisao,igual,botao_limpar;

    private TextView txtExpressao,txtResultado;

    private ImageView backspace;

//
//
    //
    //
        IniciarComponentes();

    //
    numeroZero.setOnClickListener(this);
    numeroUm.setOnClickListener(this);
    numeroDois.setOnClickListener(this);
    numeroTres.setOnClickListener(this);
    numeroQuatro.setOnClickListener(this);
    numeroCinco.setOnClickListener(this);
    numeroSeis.setOnClickListener(this);
    numeroSete.setOnClickListener(this);
    numeroOito.setOnClickListener(this);
    numeroNove.setOnClickListener(this);
    ponto.setOnClickListener(this);
    soma.setOnClickListener(this);
    subtracao.setOnClickListener(this);
    multiplicacao.setOnClickListener(this);
    divisao.setOnClickListener(this);
    
    botao_limpar.setOnClickListener(new View.setOnClickListener() {
        @Override
        public void onClick(View v) {

            txtExpressao.setText("");
            txtResultado.setText("");
        }
    });

    backspace.setOnClickListener(new View.setOnClickListener() {
        @Override
        public void onClick(View v) {

            TextView expressao = findViewById(R.id.txt_expressao);
            String string = expressao.getText().toString();

            if (!string.isEmpty()) {

                byte var0 = 0;
                int var1 = string.legth()-1;
                String txtExpressao = string.substring(var0,var1);
                expressao.setText(txtExpressao);
            }
            txtResultado.setText("");
        }
    });

    igual.setOnClickListener(new View.setOnClickListener() {
        @Override
        public void onClick(View v) {

            Expression expressao = new ExpressionBuilder(txtExpressao.getText().toString()).build();
            double resultado = expressao.evaluate();
            long longResult = (long) resultado;

            if (resultado == (double)longResult){
                txtResultado.setText((CharSequence) String.valueOf(longResult));
            
        }
    //

    private void IniciarComponentes(){
        numeroZero = findViewById(R.id.numero_zero);
        numeroUm = findViewById(R.id.numero_um);
        numeroDois = findViewById(R.id.numero_dois);
        numeroTres = findViewById(R.id.numero_tres);
        numeroQuatro = findViewById(R.id.numero_quatro);
        numeroCinco = findViewById(R.id.numero_cinco);
        numemorSeis = findViewById(R.id.numero_seis);
        numeroSete = findViewById(R.id.numero_sete);
        numeroito = findViewById(R.id.numero_oito);
        numeroNove = findViewById(R.id.numero_nove);
        ponto = findViewById(R.id.ponto);
        soma = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.divisao);
        igual = findViewById(R.id.igual);
        botao_limpar = findViewById(R.id.bt_limpar);
        textExpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
        backspace = findViewById(R.id.backspace);
    }

    public void AcrecentarUmaExpressao(String string,boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtExpressao.setText("");
        }

        if (limpar_dados){
            txtResultado.setText("");
            txtExpressao.append(string);
        } else{
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_zero:
            AcrecentarUmaExpressao(string "0", limpar_dados true);
            break;

            case R.id.numero_um:
            AcrecentarUmaExpressao(string "1", limpar_dados true);
            break;

            case R.id.numero_dois:
            AcrecentarUmaExpressao(string "2", limpar_dados true);
            break;

            case R.id.numero_tres:
            AcrecentarUmaExpressao(string "3", limpar_dados true);
            break;

            case R.id.numero_quatro:
            AcrecentarUmaExpressao(string "4", limpar_dados true);
            break;

            case R.id.numero_cinco:
            AcrecentarUmaExpressao(string "5", limpar_dados true);
            break;

            case R.id.numero_seis:
            AcrecentarUmaExpressao(string "6", limpar_dados true);
            break;

            case R.id.numero_sete:
            AcrecentarUmaExpressao(string "7", limpar_dados true);
            break;

            case R.id.numero_oito:
            AcrecentarUmaExpressao(string "8", limpar_dados true);
            break;

            case R.id.numero_nove:
            AcrecentarUmaExpressao(string "9", limpar_dados true);
            break;

            case R.id.ponto:
            AcrecentarUmaExpressao(string ".", limpar_dados true);
            break;

            case R.id.soma:
            AcrecentarUmaExpressao(string "+", limpar_dados false);
            break;

            case R.id.subtracao:
            AcrecentarUmaExpressao(string "-", limpar_dados false);
            break;

            case R.id.multiplicacao:
            AcrecentarUmaExpressao(string "*", limpar_dados false);
            break;

            case R.id.divisao:
            AcrecentarUmaExpressao(string "/", limpar_dados false);
            break;
        }
    }