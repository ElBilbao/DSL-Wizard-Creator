package wizard.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import wizard.services.WizardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWizardParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard'", "':'", "'Pagina'", "'inicial'", "'Campo'", "'obligatorio'", "'Casilla'", "'seleccionada'", "'destino'", "'Navegar'", "'dependencias'", "'{'", "','", "'}'", "'Mostrar:'", "'diciendo'", "'Cerrar:'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWizardParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWizardParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWizardParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWizard.g"; }



     	private WizardGrammarAccess grammarAccess;

        public InternalWizardParser(TokenStream input, WizardGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Wizard";
       	}

       	@Override
       	protected WizardGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWizard"
    // InternalWizard.g:64:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // InternalWizard.g:64:47: (iv_ruleWizard= ruleWizard EOF )
            // InternalWizard.g:65:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalWizard.g:71:1: ruleWizard returns [EObject current=null] : (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_paginas_3_0= rulePagina ) ) ( (lv_paginas_4_0= rulePagina ) )* ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_titulo_1_0 = null;

        EObject lv_paginas_3_0 = null;

        EObject lv_paginas_4_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:77:2: ( (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_paginas_3_0= rulePagina ) ) ( (lv_paginas_4_0= rulePagina ) )* ) )
            // InternalWizard.g:78:2: (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_paginas_3_0= rulePagina ) ) ( (lv_paginas_4_0= rulePagina ) )* )
            {
            // InternalWizard.g:78:2: (otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_paginas_3_0= rulePagina ) ) ( (lv_paginas_4_0= rulePagina ) )* )
            // InternalWizard.g:79:3: otherlv_0= 'Wizard' ( (lv_titulo_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_paginas_3_0= rulePagina ) ) ( (lv_paginas_4_0= rulePagina ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWizardAccess().getWizardKeyword_0());
            		
            // InternalWizard.g:83:3: ( (lv_titulo_1_0= ruleEString ) )
            // InternalWizard.g:84:4: (lv_titulo_1_0= ruleEString )
            {
            // InternalWizard.g:84:4: (lv_titulo_1_0= ruleEString )
            // InternalWizard.g:85:5: lv_titulo_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_titulo_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					set(
            						current,
            						"titulo",
            						lv_titulo_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWizardAccess().getColonKeyword_2());
            		
            // InternalWizard.g:106:3: ( (lv_paginas_3_0= rulePagina ) )
            // InternalWizard.g:107:4: (lv_paginas_3_0= rulePagina )
            {
            // InternalWizard.g:107:4: (lv_paginas_3_0= rulePagina )
            // InternalWizard.g:108:5: lv_paginas_3_0= rulePagina
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_paginas_3_0=rulePagina();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					add(
            						current,
            						"paginas",
            						lv_paginas_3_0,
            						"wizard.Wizard.Pagina");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:125:3: ( (lv_paginas_4_0= rulePagina ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWizard.g:126:4: (lv_paginas_4_0= rulePagina )
            	    {
            	    // InternalWizard.g:126:4: (lv_paginas_4_0= rulePagina )
            	    // InternalWizard.g:127:5: lv_paginas_4_0= rulePagina
            	    {

            	    					newCompositeNode(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_paginas_4_0=rulePagina();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWizardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paginas",
            	    						lv_paginas_4_0,
            	    						"wizard.Wizard.Pagina");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleBoton"
    // InternalWizard.g:148:1: entryRuleBoton returns [EObject current=null] : iv_ruleBoton= ruleBoton EOF ;
    public final EObject entryRuleBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoton = null;


        try {
            // InternalWizard.g:148:46: (iv_ruleBoton= ruleBoton EOF )
            // InternalWizard.g:149:2: iv_ruleBoton= ruleBoton EOF
            {
             newCompositeNode(grammarAccess.getBotonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoton=ruleBoton();

            state._fsp--;

             current =iv_ruleBoton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoton"


    // $ANTLR start "ruleBoton"
    // InternalWizard.g:155:1: ruleBoton returns [EObject current=null] : (this_Navegar_0= ruleNavegar | this_Mostrar_1= ruleMostrar | this_Cerrar_2= ruleCerrar ) ;
    public final EObject ruleBoton() throws RecognitionException {
        EObject current = null;

        EObject this_Navegar_0 = null;

        EObject this_Mostrar_1 = null;

        EObject this_Cerrar_2 = null;



        	enterRule();

        try {
            // InternalWizard.g:161:2: ( (this_Navegar_0= ruleNavegar | this_Mostrar_1= ruleMostrar | this_Cerrar_2= ruleCerrar ) )
            // InternalWizard.g:162:2: (this_Navegar_0= ruleNavegar | this_Mostrar_1= ruleMostrar | this_Cerrar_2= ruleCerrar )
            {
            // InternalWizard.g:162:2: (this_Navegar_0= ruleNavegar | this_Mostrar_1= ruleMostrar | this_Cerrar_2= ruleCerrar )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWizard.g:163:3: this_Navegar_0= ruleNavegar
                    {

                    			newCompositeNode(grammarAccess.getBotonAccess().getNavegarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navegar_0=ruleNavegar();

                    state._fsp--;


                    			current = this_Navegar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWizard.g:172:3: this_Mostrar_1= ruleMostrar
                    {

                    			newCompositeNode(grammarAccess.getBotonAccess().getMostrarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mostrar_1=ruleMostrar();

                    state._fsp--;


                    			current = this_Mostrar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWizard.g:181:3: this_Cerrar_2= ruleCerrar
                    {

                    			newCompositeNode(grammarAccess.getBotonAccess().getCerrarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cerrar_2=ruleCerrar();

                    state._fsp--;


                    			current = this_Cerrar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoton"


    // $ANTLR start "entryRuleEString"
    // InternalWizard.g:193:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWizard.g:193:47: (iv_ruleEString= ruleEString EOF )
            // InternalWizard.g:194:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWizard.g:200:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWizard.g:206:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalWizard.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalWizard.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWizard.g:208:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWizard.g:216:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePagina"
    // InternalWizard.g:227:1: entryRulePagina returns [EObject current=null] : iv_rulePagina= rulePagina EOF ;
    public final EObject entryRulePagina() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagina = null;


        try {
            // InternalWizard.g:227:47: (iv_rulePagina= rulePagina EOF )
            // InternalWizard.g:228:2: iv_rulePagina= rulePagina EOF
            {
             newCompositeNode(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePagina=rulePagina();

            state._fsp--;

             current =iv_rulePagina; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalWizard.g:234:1: rulePagina returns [EObject current=null] : (otherlv_0= 'Pagina' ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) ) otherlv_4= ':' ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* ) ) ;
    public final EObject rulePagina() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inicial_1_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_campos_5_0 = null;

        EObject lv_campos_6_0 = null;

        EObject lv_casillas_7_0 = null;

        EObject lv_casillas_8_0 = null;

        EObject lv_botones_9_0 = null;

        EObject lv_botones_10_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:240:2: ( (otherlv_0= 'Pagina' ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) ) otherlv_4= ':' ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* ) ) )
            // InternalWizard.g:241:2: (otherlv_0= 'Pagina' ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) ) otherlv_4= ':' ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* ) )
            {
            // InternalWizard.g:241:2: (otherlv_0= 'Pagina' ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) ) otherlv_4= ':' ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* ) )
            // InternalWizard.g:242:3: otherlv_0= 'Pagina' ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) ) otherlv_4= ':' ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPaginaAccess().getPaginaKeyword_0());
            		
            // InternalWizard.g:246:3: ( ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) ) | ( (lv_name_3_0= ruleEString ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWizard.g:247:4: ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) )
                    {
                    // InternalWizard.g:247:4: ( ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) ) )
                    // InternalWizard.g:248:5: ( (lv_inicial_1_0= 'inicial' ) ) ( (lv_name_2_0= ruleEString ) )
                    {
                    // InternalWizard.g:248:5: ( (lv_inicial_1_0= 'inicial' ) )
                    // InternalWizard.g:249:6: (lv_inicial_1_0= 'inicial' )
                    {
                    // InternalWizard.g:249:6: (lv_inicial_1_0= 'inicial' )
                    // InternalWizard.g:250:7: lv_inicial_1_0= 'inicial'
                    {
                    lv_inicial_1_0=(Token)match(input,14,FOLLOW_3); 

                    							newLeafNode(lv_inicial_1_0, grammarAccess.getPaginaAccess().getInicialInicialKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPaginaRule());
                    							}
                    							setWithLastConsumed(current, "inicial", true, "inicial");
                    						

                    }


                    }

                    // InternalWizard.g:262:5: ( (lv_name_2_0= ruleEString ) )
                    // InternalWizard.g:263:6: (lv_name_2_0= ruleEString )
                    {
                    // InternalWizard.g:263:6: (lv_name_2_0= ruleEString )
                    // InternalWizard.g:264:7: lv_name_2_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_4);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"wizard.Wizard.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:283:4: ( (lv_name_3_0= ruleEString ) )
                    {
                    // InternalWizard.g:283:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalWizard.g:284:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalWizard.g:284:5: (lv_name_3_0= ruleEString )
                    // InternalWizard.g:285:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaginaRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"wizard.Wizard.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPaginaAccess().getColonKeyword_2());
            		
            // InternalWizard.g:307:3: ( ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )* )
            // InternalWizard.g:308:4: ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )? ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )? ( (lv_botones_9_0= ruleBoton ) ) ( (lv_botones_10_0= ruleBoton ) )*
            {
            // InternalWizard.g:308:4: ( ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWizard.g:309:5: ( (lv_campos_5_0= ruleCampo ) ) ( (lv_campos_6_0= ruleCampo ) )*
                    {
                    // InternalWizard.g:309:5: ( (lv_campos_5_0= ruleCampo ) )
                    // InternalWizard.g:310:6: (lv_campos_5_0= ruleCampo )
                    {
                    // InternalWizard.g:310:6: (lv_campos_5_0= ruleCampo )
                    // InternalWizard.g:311:7: lv_campos_5_0= ruleCampo
                    {

                    							newCompositeNode(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_0_0());
                    						
                    pushFollow(FOLLOW_8);
                    lv_campos_5_0=ruleCampo();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    							}
                    							add(
                    								current,
                    								"campos",
                    								lv_campos_5_0,
                    								"wizard.Wizard.Campo");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalWizard.g:328:5: ( (lv_campos_6_0= ruleCampo ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalWizard.g:329:6: (lv_campos_6_0= ruleCampo )
                    	    {
                    	    // InternalWizard.g:329:6: (lv_campos_6_0= ruleCampo )
                    	    // InternalWizard.g:330:7: lv_campos_6_0= ruleCampo
                    	    {

                    	    							newCompositeNode(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_campos_6_0=ruleCampo();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"campos",
                    	    								lv_campos_6_0,
                    	    								"wizard.Wizard.Campo");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalWizard.g:348:4: ( ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWizard.g:349:5: ( (lv_casillas_7_0= ruleCasilla ) ) ( (lv_casillas_8_0= ruleCasilla ) )*
                    {
                    // InternalWizard.g:349:5: ( (lv_casillas_7_0= ruleCasilla ) )
                    // InternalWizard.g:350:6: (lv_casillas_7_0= ruleCasilla )
                    {
                    // InternalWizard.g:350:6: (lv_casillas_7_0= ruleCasilla )
                    // InternalWizard.g:351:7: lv_casillas_7_0= ruleCasilla
                    {

                    							newCompositeNode(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_8);
                    lv_casillas_7_0=ruleCasilla();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    							}
                    							add(
                    								current,
                    								"casillas",
                    								lv_casillas_7_0,
                    								"wizard.Wizard.Casilla");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalWizard.g:368:5: ( (lv_casillas_8_0= ruleCasilla ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalWizard.g:369:6: (lv_casillas_8_0= ruleCasilla )
                    	    {
                    	    // InternalWizard.g:369:6: (lv_casillas_8_0= ruleCasilla )
                    	    // InternalWizard.g:370:7: lv_casillas_8_0= ruleCasilla
                    	    {

                    	    							newCompositeNode(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_casillas_8_0=ruleCasilla();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPaginaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"casillas",
                    	    								lv_casillas_8_0,
                    	    								"wizard.Wizard.Casilla");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalWizard.g:388:4: ( (lv_botones_9_0= ruleBoton ) )
            // InternalWizard.g:389:5: (lv_botones_9_0= ruleBoton )
            {
            // InternalWizard.g:389:5: (lv_botones_9_0= ruleBoton )
            // InternalWizard.g:390:6: lv_botones_9_0= ruleBoton
            {

            						newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_9);
            lv_botones_9_0=ruleBoton();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPaginaRule());
            						}
            						add(
            							current,
            							"botones",
            							lv_botones_9_0,
            							"wizard.Wizard.Boton");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalWizard.g:407:4: ( (lv_botones_10_0= ruleBoton ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==25||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWizard.g:408:5: (lv_botones_10_0= ruleBoton )
            	    {
            	    // InternalWizard.g:408:5: (lv_botones_10_0= ruleBoton )
            	    // InternalWizard.g:409:6: lv_botones_10_0= ruleBoton
            	    {

            	    						newCompositeNode(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_botones_10_0=ruleBoton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPaginaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"botones",
            	    							lv_botones_10_0,
            	    							"wizard.Wizard.Boton");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCampo"
    // InternalWizard.g:431:1: entryRuleCampo returns [EObject current=null] : iv_ruleCampo= ruleCampo EOF ;
    public final EObject entryRuleCampo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampo = null;


        try {
            // InternalWizard.g:431:46: (iv_ruleCampo= ruleCampo EOF )
            // InternalWizard.g:432:2: iv_ruleCampo= ruleCampo EOF
            {
             newCompositeNode(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampo=ruleCampo();

            state._fsp--;

             current =iv_ruleCampo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalWizard.g:438:1: ruleCampo returns [EObject current=null] : (otherlv_0= 'Campo' ( (lv_obligatorio_1_0= 'obligatorio' ) )? otherlv_2= ':' ( (lv_etiqueta_3_0= ruleEString ) ) ) ;
    public final EObject ruleCampo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_obligatorio_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_etiqueta_3_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:444:2: ( (otherlv_0= 'Campo' ( (lv_obligatorio_1_0= 'obligatorio' ) )? otherlv_2= ':' ( (lv_etiqueta_3_0= ruleEString ) ) ) )
            // InternalWizard.g:445:2: (otherlv_0= 'Campo' ( (lv_obligatorio_1_0= 'obligatorio' ) )? otherlv_2= ':' ( (lv_etiqueta_3_0= ruleEString ) ) )
            {
            // InternalWizard.g:445:2: (otherlv_0= 'Campo' ( (lv_obligatorio_1_0= 'obligatorio' ) )? otherlv_2= ':' ( (lv_etiqueta_3_0= ruleEString ) ) )
            // InternalWizard.g:446:3: otherlv_0= 'Campo' ( (lv_obligatorio_1_0= 'obligatorio' ) )? otherlv_2= ':' ( (lv_etiqueta_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCampoAccess().getCampoKeyword_0());
            		
            // InternalWizard.g:450:3: ( (lv_obligatorio_1_0= 'obligatorio' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWizard.g:451:4: (lv_obligatorio_1_0= 'obligatorio' )
                    {
                    // InternalWizard.g:451:4: (lv_obligatorio_1_0= 'obligatorio' )
                    // InternalWizard.g:452:5: lv_obligatorio_1_0= 'obligatorio'
                    {
                    lv_obligatorio_1_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_obligatorio_1_0, grammarAccess.getCampoAccess().getObligatorioObligatorioKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCampoRule());
                    					}
                    					setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCampoAccess().getColonKeyword_2());
            		
            // InternalWizard.g:468:3: ( (lv_etiqueta_3_0= ruleEString ) )
            // InternalWizard.g:469:4: (lv_etiqueta_3_0= ruleEString )
            {
            // InternalWizard.g:469:4: (lv_etiqueta_3_0= ruleEString )
            // InternalWizard.g:470:5: lv_etiqueta_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCampoAccess().getEtiquetaEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_etiqueta_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCampoRule());
            					}
            					set(
            						current,
            						"etiqueta",
            						lv_etiqueta_3_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCampo"


    // $ANTLR start "entryRuleCasilla"
    // InternalWizard.g:491:1: entryRuleCasilla returns [EObject current=null] : iv_ruleCasilla= ruleCasilla EOF ;
    public final EObject entryRuleCasilla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCasilla = null;


        try {
            // InternalWizard.g:491:48: (iv_ruleCasilla= ruleCasilla EOF )
            // InternalWizard.g:492:2: iv_ruleCasilla= ruleCasilla EOF
            {
             newCompositeNode(grammarAccess.getCasillaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCasilla=ruleCasilla();

            state._fsp--;

             current =iv_ruleCasilla; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCasilla"


    // $ANTLR start "ruleCasilla"
    // InternalWizard.g:498:1: ruleCasilla returns [EObject current=null] : (otherlv_0= 'Casilla' ( (lv_seleccionado_1_0= 'seleccionada' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_etiqueta_4_0= ruleEString ) ) (otherlv_5= 'destino' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleCasilla() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_seleccionado_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_etiqueta_4_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:504:2: ( (otherlv_0= 'Casilla' ( (lv_seleccionado_1_0= 'seleccionada' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_etiqueta_4_0= ruleEString ) ) (otherlv_5= 'destino' ( ( ruleEString ) ) )? ) )
            // InternalWizard.g:505:2: (otherlv_0= 'Casilla' ( (lv_seleccionado_1_0= 'seleccionada' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_etiqueta_4_0= ruleEString ) ) (otherlv_5= 'destino' ( ( ruleEString ) ) )? )
            {
            // InternalWizard.g:505:2: (otherlv_0= 'Casilla' ( (lv_seleccionado_1_0= 'seleccionada' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_etiqueta_4_0= ruleEString ) ) (otherlv_5= 'destino' ( ( ruleEString ) ) )? )
            // InternalWizard.g:506:3: otherlv_0= 'Casilla' ( (lv_seleccionado_1_0= 'seleccionada' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_etiqueta_4_0= ruleEString ) ) (otherlv_5= 'destino' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCasillaAccess().getCasillaKeyword_0());
            		
            // InternalWizard.g:510:3: ( (lv_seleccionado_1_0= 'seleccionada' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWizard.g:511:4: (lv_seleccionado_1_0= 'seleccionada' )
                    {
                    // InternalWizard.g:511:4: (lv_seleccionado_1_0= 'seleccionada' )
                    // InternalWizard.g:512:5: lv_seleccionado_1_0= 'seleccionada'
                    {
                    lv_seleccionado_1_0=(Token)match(input,18,FOLLOW_3); 

                    					newLeafNode(lv_seleccionado_1_0, grammarAccess.getCasillaAccess().getSeleccionadoSeleccionadaKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCasillaRule());
                    					}
                    					setWithLastConsumed(current, "seleccionado", true, "seleccionada");
                    				

                    }


                    }
                    break;

            }

            // InternalWizard.g:524:3: ( (lv_name_2_0= ruleEString ) )
            // InternalWizard.g:525:4: (lv_name_2_0= ruleEString )
            {
            // InternalWizard.g:525:4: (lv_name_2_0= ruleEString )
            // InternalWizard.g:526:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCasillaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasillaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCasillaAccess().getColonKeyword_3());
            		
            // InternalWizard.g:547:3: ( (lv_etiqueta_4_0= ruleEString ) )
            // InternalWizard.g:548:4: (lv_etiqueta_4_0= ruleEString )
            {
            // InternalWizard.g:548:4: (lv_etiqueta_4_0= ruleEString )
            // InternalWizard.g:549:5: lv_etiqueta_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCasillaAccess().getEtiquetaEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_etiqueta_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasillaRule());
            					}
            					set(
            						current,
            						"etiqueta",
            						lv_etiqueta_4_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:566:3: (otherlv_5= 'destino' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWizard.g:567:4: otherlv_5= 'destino' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCasillaAccess().getDestinoKeyword_5_0());
                    			
                    // InternalWizard.g:571:4: ( ( ruleEString ) )
                    // InternalWizard.g:572:5: ( ruleEString )
                    {
                    // InternalWizard.g:572:5: ( ruleEString )
                    // InternalWizard.g:573:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCasillaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCasillaAccess().getNuevoDestinoPaginaCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCasilla"


    // $ANTLR start "entryRuleNavegar"
    // InternalWizard.g:592:1: entryRuleNavegar returns [EObject current=null] : iv_ruleNavegar= ruleNavegar EOF ;
    public final EObject entryRuleNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavegar = null;


        try {
            // InternalWizard.g:592:48: (iv_ruleNavegar= ruleNavegar EOF )
            // InternalWizard.g:593:2: iv_ruleNavegar= ruleNavegar EOF
            {
             newCompositeNode(grammarAccess.getNavegarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavegar=ruleNavegar();

            state._fsp--;

             current =iv_ruleNavegar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavegar"


    // $ANTLR start "ruleNavegar"
    // InternalWizard.g:599:1: ruleNavegar returns [EObject current=null] : (otherlv_0= 'Navegar' otherlv_1= ':' ( (lv_etiqueta_2_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_etiqueta_2_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:605:2: ( (otherlv_0= 'Navegar' otherlv_1= ':' ( (lv_etiqueta_2_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? ) )
            // InternalWizard.g:606:2: (otherlv_0= 'Navegar' otherlv_1= ':' ( (lv_etiqueta_2_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? )
            {
            // InternalWizard.g:606:2: (otherlv_0= 'Navegar' otherlv_1= ':' ( (lv_etiqueta_2_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )? )
            // InternalWizard.g:607:3: otherlv_0= 'Navegar' otherlv_1= ':' ( (lv_etiqueta_2_0= ruleEString ) ) ( ( ruleEString ) ) (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNavegarAccess().getNavegarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNavegarAccess().getColonKeyword_1());
            		
            // InternalWizard.g:615:3: ( (lv_etiqueta_2_0= ruleEString ) )
            // InternalWizard.g:616:4: (lv_etiqueta_2_0= ruleEString )
            {
            // InternalWizard.g:616:4: (lv_etiqueta_2_0= ruleEString )
            // InternalWizard.g:617:5: lv_etiqueta_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNavegarAccess().getEtiquetaEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_etiqueta_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavegarRule());
            					}
            					set(
            						current,
            						"etiqueta",
            						lv_etiqueta_2_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:634:3: ( ( ruleEString ) )
            // InternalWizard.g:635:4: ( ruleEString )
            {
            // InternalWizard.g:635:4: ( ruleEString )
            // InternalWizard.g:636:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavegarRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNavegarAccess().getDestinoPaginaCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:650:3: (otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWizard.g:651:4: otherlv_4= 'dependencias' otherlv_5= '{' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavegarAccess().getDependenciasKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getNavegarAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalWizard.g:659:4: ( ( ruleEString ) )
                    // InternalWizard.g:660:5: ( ruleEString )
                    {
                    // InternalWizard.g:660:5: ( ruleEString )
                    // InternalWizard.g:661:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavegarRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:675:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalWizard.g:676:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNavegarAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalWizard.g:680:5: ( ( ruleEString ) )
                    	    // InternalWizard.g:681:6: ( ruleEString )
                    	    {
                    	    // InternalWizard.g:681:6: ( ruleEString )
                    	    // InternalWizard.g:682:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNavegarRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getNavegarAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavegar"


    // $ANTLR start "entryRuleMostrar"
    // InternalWizard.g:706:1: entryRuleMostrar returns [EObject current=null] : iv_ruleMostrar= ruleMostrar EOF ;
    public final EObject entryRuleMostrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMostrar = null;


        try {
            // InternalWizard.g:706:48: (iv_ruleMostrar= ruleMostrar EOF )
            // InternalWizard.g:707:2: iv_ruleMostrar= ruleMostrar EOF
            {
             newCompositeNode(grammarAccess.getMostrarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMostrar=ruleMostrar();

            state._fsp--;

             current =iv_ruleMostrar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMostrar"


    // $ANTLR start "ruleMostrar"
    // InternalWizard.g:713:1: ruleMostrar returns [EObject current=null] : (otherlv_0= 'Mostrar:' ( (lv_etiqueta_1_0= ruleEString ) ) otherlv_2= 'diciendo' ( (lv_mensaje_3_0= ruleEString ) ) ) ;
    public final EObject ruleMostrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_etiqueta_1_0 = null;

        AntlrDatatypeRuleToken lv_mensaje_3_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:719:2: ( (otherlv_0= 'Mostrar:' ( (lv_etiqueta_1_0= ruleEString ) ) otherlv_2= 'diciendo' ( (lv_mensaje_3_0= ruleEString ) ) ) )
            // InternalWizard.g:720:2: (otherlv_0= 'Mostrar:' ( (lv_etiqueta_1_0= ruleEString ) ) otherlv_2= 'diciendo' ( (lv_mensaje_3_0= ruleEString ) ) )
            {
            // InternalWizard.g:720:2: (otherlv_0= 'Mostrar:' ( (lv_etiqueta_1_0= ruleEString ) ) otherlv_2= 'diciendo' ( (lv_mensaje_3_0= ruleEString ) ) )
            // InternalWizard.g:721:3: otherlv_0= 'Mostrar:' ( (lv_etiqueta_1_0= ruleEString ) ) otherlv_2= 'diciendo' ( (lv_mensaje_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMostrarAccess().getMostrarKeyword_0());
            		
            // InternalWizard.g:725:3: ( (lv_etiqueta_1_0= ruleEString ) )
            // InternalWizard.g:726:4: (lv_etiqueta_1_0= ruleEString )
            {
            // InternalWizard.g:726:4: (lv_etiqueta_1_0= ruleEString )
            // InternalWizard.g:727:5: lv_etiqueta_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMostrarAccess().getEtiquetaEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_etiqueta_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMostrarRule());
            					}
            					set(
            						current,
            						"etiqueta",
            						lv_etiqueta_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMostrarAccess().getDiciendoKeyword_2());
            		
            // InternalWizard.g:748:3: ( (lv_mensaje_3_0= ruleEString ) )
            // InternalWizard.g:749:4: (lv_mensaje_3_0= ruleEString )
            {
            // InternalWizard.g:749:4: (lv_mensaje_3_0= ruleEString )
            // InternalWizard.g:750:5: lv_mensaje_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMostrarAccess().getMensajeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_mensaje_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMostrarRule());
            					}
            					set(
            						current,
            						"mensaje",
            						lv_mensaje_3_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMostrar"


    // $ANTLR start "entryRuleCerrar"
    // InternalWizard.g:771:1: entryRuleCerrar returns [EObject current=null] : iv_ruleCerrar= ruleCerrar EOF ;
    public final EObject entryRuleCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCerrar = null;


        try {
            // InternalWizard.g:771:47: (iv_ruleCerrar= ruleCerrar EOF )
            // InternalWizard.g:772:2: iv_ruleCerrar= ruleCerrar EOF
            {
             newCompositeNode(grammarAccess.getCerrarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCerrar=ruleCerrar();

            state._fsp--;

             current =iv_ruleCerrar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCerrar"


    // $ANTLR start "ruleCerrar"
    // InternalWizard.g:778:1: ruleCerrar returns [EObject current=null] : (otherlv_0= 'Cerrar:' ( (lv_etiqueta_1_0= ruleEString ) ) ) ;
    public final EObject ruleCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_etiqueta_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:784:2: ( (otherlv_0= 'Cerrar:' ( (lv_etiqueta_1_0= ruleEString ) ) ) )
            // InternalWizard.g:785:2: (otherlv_0= 'Cerrar:' ( (lv_etiqueta_1_0= ruleEString ) ) )
            {
            // InternalWizard.g:785:2: (otherlv_0= 'Cerrar:' ( (lv_etiqueta_1_0= ruleEString ) ) )
            // InternalWizard.g:786:3: otherlv_0= 'Cerrar:' ( (lv_etiqueta_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCerrarAccess().getCerrarKeyword_0());
            		
            // InternalWizard.g:790:3: ( (lv_etiqueta_1_0= ruleEString ) )
            // InternalWizard.g:791:4: (lv_etiqueta_1_0= ruleEString )
            {
            // InternalWizard.g:791:4: (lv_etiqueta_1_0= ruleEString )
            // InternalWizard.g:792:5: lv_etiqueta_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCerrarAccess().getEtiquetaEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_etiqueta_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCerrarRule());
            					}
            					set(
            						current,
            						"etiqueta",
            						lv_etiqueta_1_0,
            						"wizard.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCerrar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000A128000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A128002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}