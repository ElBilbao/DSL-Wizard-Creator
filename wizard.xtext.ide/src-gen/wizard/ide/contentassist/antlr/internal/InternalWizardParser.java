package wizard.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import wizard.services.WizardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWizardParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Wizard'", "':'", "'Pagina'", "'Campo'", "'Casilla'", "'destino'", "'Navegar'", "'dependencias'", "'{'", "'}'", "','", "'Mostrar:'", "'diciendo'", "'Cerrar:'", "'inicial'", "'obligatorio'", "'seleccionada'"
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

    	public void setGrammarAccess(WizardGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWizard"
    // InternalWizard.g:53:1: entryRuleWizard : ruleWizard EOF ;
    public final void entryRuleWizard() throws RecognitionException {
        try {
            // InternalWizard.g:54:1: ( ruleWizard EOF )
            // InternalWizard.g:55:1: ruleWizard EOF
            {
             before(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            ruleWizard();

            state._fsp--;

             after(grammarAccess.getWizardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalWizard.g:62:1: ruleWizard : ( ( rule__Wizard__Group__0 ) ) ;
    public final void ruleWizard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:66:2: ( ( ( rule__Wizard__Group__0 ) ) )
            // InternalWizard.g:67:2: ( ( rule__Wizard__Group__0 ) )
            {
            // InternalWizard.g:67:2: ( ( rule__Wizard__Group__0 ) )
            // InternalWizard.g:68:3: ( rule__Wizard__Group__0 )
            {
             before(grammarAccess.getWizardAccess().getGroup()); 
            // InternalWizard.g:69:3: ( rule__Wizard__Group__0 )
            // InternalWizard.g:69:4: rule__Wizard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleBoton"
    // InternalWizard.g:78:1: entryRuleBoton : ruleBoton EOF ;
    public final void entryRuleBoton() throws RecognitionException {
        try {
            // InternalWizard.g:79:1: ( ruleBoton EOF )
            // InternalWizard.g:80:1: ruleBoton EOF
            {
             before(grammarAccess.getBotonRule()); 
            pushFollow(FOLLOW_1);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getBotonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoton"


    // $ANTLR start "ruleBoton"
    // InternalWizard.g:87:1: ruleBoton : ( ( rule__Boton__Alternatives ) ) ;
    public final void ruleBoton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:91:2: ( ( ( rule__Boton__Alternatives ) ) )
            // InternalWizard.g:92:2: ( ( rule__Boton__Alternatives ) )
            {
            // InternalWizard.g:92:2: ( ( rule__Boton__Alternatives ) )
            // InternalWizard.g:93:3: ( rule__Boton__Alternatives )
            {
             before(grammarAccess.getBotonAccess().getAlternatives()); 
            // InternalWizard.g:94:3: ( rule__Boton__Alternatives )
            // InternalWizard.g:94:4: rule__Boton__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boton__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBotonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoton"


    // $ANTLR start "entryRuleEString"
    // InternalWizard.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalWizard.g:104:1: ( ruleEString EOF )
            // InternalWizard.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWizard.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalWizard.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalWizard.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalWizard.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalWizard.g:119:3: ( rule__EString__Alternatives )
            // InternalWizard.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePagina"
    // InternalWizard.g:128:1: entryRulePagina : rulePagina EOF ;
    public final void entryRulePagina() throws RecognitionException {
        try {
            // InternalWizard.g:129:1: ( rulePagina EOF )
            // InternalWizard.g:130:1: rulePagina EOF
            {
             before(grammarAccess.getPaginaRule()); 
            pushFollow(FOLLOW_1);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getPaginaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePagina"


    // $ANTLR start "rulePagina"
    // InternalWizard.g:137:1: rulePagina : ( ( rule__Pagina__Group__0 ) ) ;
    public final void rulePagina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:141:2: ( ( ( rule__Pagina__Group__0 ) ) )
            // InternalWizard.g:142:2: ( ( rule__Pagina__Group__0 ) )
            {
            // InternalWizard.g:142:2: ( ( rule__Pagina__Group__0 ) )
            // InternalWizard.g:143:3: ( rule__Pagina__Group__0 )
            {
             before(grammarAccess.getPaginaAccess().getGroup()); 
            // InternalWizard.g:144:3: ( rule__Pagina__Group__0 )
            // InternalWizard.g:144:4: rule__Pagina__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePagina"


    // $ANTLR start "entryRuleCampo"
    // InternalWizard.g:153:1: entryRuleCampo : ruleCampo EOF ;
    public final void entryRuleCampo() throws RecognitionException {
        try {
            // InternalWizard.g:154:1: ( ruleCampo EOF )
            // InternalWizard.g:155:1: ruleCampo EOF
            {
             before(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getCampoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalWizard.g:162:1: ruleCampo : ( ( rule__Campo__Group__0 ) ) ;
    public final void ruleCampo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:166:2: ( ( ( rule__Campo__Group__0 ) ) )
            // InternalWizard.g:167:2: ( ( rule__Campo__Group__0 ) )
            {
            // InternalWizard.g:167:2: ( ( rule__Campo__Group__0 ) )
            // InternalWizard.g:168:3: ( rule__Campo__Group__0 )
            {
             before(grammarAccess.getCampoAccess().getGroup()); 
            // InternalWizard.g:169:3: ( rule__Campo__Group__0 )
            // InternalWizard.g:169:4: rule__Campo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCampo"


    // $ANTLR start "entryRuleCasilla"
    // InternalWizard.g:178:1: entryRuleCasilla : ruleCasilla EOF ;
    public final void entryRuleCasilla() throws RecognitionException {
        try {
            // InternalWizard.g:179:1: ( ruleCasilla EOF )
            // InternalWizard.g:180:1: ruleCasilla EOF
            {
             before(grammarAccess.getCasillaRule()); 
            pushFollow(FOLLOW_1);
            ruleCasilla();

            state._fsp--;

             after(grammarAccess.getCasillaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCasilla"


    // $ANTLR start "ruleCasilla"
    // InternalWizard.g:187:1: ruleCasilla : ( ( rule__Casilla__Group__0 ) ) ;
    public final void ruleCasilla() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:191:2: ( ( ( rule__Casilla__Group__0 ) ) )
            // InternalWizard.g:192:2: ( ( rule__Casilla__Group__0 ) )
            {
            // InternalWizard.g:192:2: ( ( rule__Casilla__Group__0 ) )
            // InternalWizard.g:193:3: ( rule__Casilla__Group__0 )
            {
             before(grammarAccess.getCasillaAccess().getGroup()); 
            // InternalWizard.g:194:3: ( rule__Casilla__Group__0 )
            // InternalWizard.g:194:4: rule__Casilla__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCasillaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCasilla"


    // $ANTLR start "entryRuleNavegar"
    // InternalWizard.g:203:1: entryRuleNavegar : ruleNavegar EOF ;
    public final void entryRuleNavegar() throws RecognitionException {
        try {
            // InternalWizard.g:204:1: ( ruleNavegar EOF )
            // InternalWizard.g:205:1: ruleNavegar EOF
            {
             before(grammarAccess.getNavegarRule()); 
            pushFollow(FOLLOW_1);
            ruleNavegar();

            state._fsp--;

             after(grammarAccess.getNavegarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavegar"


    // $ANTLR start "ruleNavegar"
    // InternalWizard.g:212:1: ruleNavegar : ( ( rule__Navegar__Group__0 ) ) ;
    public final void ruleNavegar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:216:2: ( ( ( rule__Navegar__Group__0 ) ) )
            // InternalWizard.g:217:2: ( ( rule__Navegar__Group__0 ) )
            {
            // InternalWizard.g:217:2: ( ( rule__Navegar__Group__0 ) )
            // InternalWizard.g:218:3: ( rule__Navegar__Group__0 )
            {
             before(grammarAccess.getNavegarAccess().getGroup()); 
            // InternalWizard.g:219:3: ( rule__Navegar__Group__0 )
            // InternalWizard.g:219:4: rule__Navegar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavegar"


    // $ANTLR start "entryRuleMostrar"
    // InternalWizard.g:228:1: entryRuleMostrar : ruleMostrar EOF ;
    public final void entryRuleMostrar() throws RecognitionException {
        try {
            // InternalWizard.g:229:1: ( ruleMostrar EOF )
            // InternalWizard.g:230:1: ruleMostrar EOF
            {
             before(grammarAccess.getMostrarRule()); 
            pushFollow(FOLLOW_1);
            ruleMostrar();

            state._fsp--;

             after(grammarAccess.getMostrarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMostrar"


    // $ANTLR start "ruleMostrar"
    // InternalWizard.g:237:1: ruleMostrar : ( ( rule__Mostrar__Group__0 ) ) ;
    public final void ruleMostrar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:241:2: ( ( ( rule__Mostrar__Group__0 ) ) )
            // InternalWizard.g:242:2: ( ( rule__Mostrar__Group__0 ) )
            {
            // InternalWizard.g:242:2: ( ( rule__Mostrar__Group__0 ) )
            // InternalWizard.g:243:3: ( rule__Mostrar__Group__0 )
            {
             before(grammarAccess.getMostrarAccess().getGroup()); 
            // InternalWizard.g:244:3: ( rule__Mostrar__Group__0 )
            // InternalWizard.g:244:4: rule__Mostrar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mostrar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMostrarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMostrar"


    // $ANTLR start "entryRuleCerrar"
    // InternalWizard.g:253:1: entryRuleCerrar : ruleCerrar EOF ;
    public final void entryRuleCerrar() throws RecognitionException {
        try {
            // InternalWizard.g:254:1: ( ruleCerrar EOF )
            // InternalWizard.g:255:1: ruleCerrar EOF
            {
             before(grammarAccess.getCerrarRule()); 
            pushFollow(FOLLOW_1);
            ruleCerrar();

            state._fsp--;

             after(grammarAccess.getCerrarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCerrar"


    // $ANTLR start "ruleCerrar"
    // InternalWizard.g:262:1: ruleCerrar : ( ( rule__Cerrar__Group__0 ) ) ;
    public final void ruleCerrar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:266:2: ( ( ( rule__Cerrar__Group__0 ) ) )
            // InternalWizard.g:267:2: ( ( rule__Cerrar__Group__0 ) )
            {
            // InternalWizard.g:267:2: ( ( rule__Cerrar__Group__0 ) )
            // InternalWizard.g:268:3: ( rule__Cerrar__Group__0 )
            {
             before(grammarAccess.getCerrarAccess().getGroup()); 
            // InternalWizard.g:269:3: ( rule__Cerrar__Group__0 )
            // InternalWizard.g:269:4: rule__Cerrar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cerrar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCerrarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCerrar"


    // $ANTLR start "rule__Boton__Alternatives"
    // InternalWizard.g:277:1: rule__Boton__Alternatives : ( ( ruleNavegar ) | ( ruleMostrar ) | ( ruleCerrar ) );
    public final void rule__Boton__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:281:1: ( ( ruleNavegar ) | ( ruleMostrar ) | ( ruleCerrar ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalWizard.g:282:2: ( ruleNavegar )
                    {
                    // InternalWizard.g:282:2: ( ruleNavegar )
                    // InternalWizard.g:283:3: ruleNavegar
                    {
                     before(grammarAccess.getBotonAccess().getNavegarParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNavegar();

                    state._fsp--;

                     after(grammarAccess.getBotonAccess().getNavegarParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:288:2: ( ruleMostrar )
                    {
                    // InternalWizard.g:288:2: ( ruleMostrar )
                    // InternalWizard.g:289:3: ruleMostrar
                    {
                     before(grammarAccess.getBotonAccess().getMostrarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMostrar();

                    state._fsp--;

                     after(grammarAccess.getBotonAccess().getMostrarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWizard.g:294:2: ( ruleCerrar )
                    {
                    // InternalWizard.g:294:2: ( ruleCerrar )
                    // InternalWizard.g:295:3: ruleCerrar
                    {
                     before(grammarAccess.getBotonAccess().getCerrarParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCerrar();

                    state._fsp--;

                     after(grammarAccess.getBotonAccess().getCerrarParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boton__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalWizard.g:304:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:308:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWizard.g:309:2: ( RULE_STRING )
                    {
                    // InternalWizard.g:309:2: ( RULE_STRING )
                    // InternalWizard.g:310:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:315:2: ( RULE_ID )
                    {
                    // InternalWizard.g:315:2: ( RULE_ID )
                    // InternalWizard.g:316:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Pagina__Alternatives_1"
    // InternalWizard.g:325:1: rule__Pagina__Alternatives_1 : ( ( ( rule__Pagina__Group_1_0__0 ) ) | ( ( rule__Pagina__NameAssignment_1_1 ) ) );
    public final void rule__Pagina__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:329:1: ( ( ( rule__Pagina__Group_1_0__0 ) ) | ( ( rule__Pagina__NameAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWizard.g:330:2: ( ( rule__Pagina__Group_1_0__0 ) )
                    {
                    // InternalWizard.g:330:2: ( ( rule__Pagina__Group_1_0__0 ) )
                    // InternalWizard.g:331:3: ( rule__Pagina__Group_1_0__0 )
                    {
                     before(grammarAccess.getPaginaAccess().getGroup_1_0()); 
                    // InternalWizard.g:332:3: ( rule__Pagina__Group_1_0__0 )
                    // InternalWizard.g:332:4: rule__Pagina__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPaginaAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWizard.g:336:2: ( ( rule__Pagina__NameAssignment_1_1 ) )
                    {
                    // InternalWizard.g:336:2: ( ( rule__Pagina__NameAssignment_1_1 ) )
                    // InternalWizard.g:337:3: ( rule__Pagina__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getPaginaAccess().getNameAssignment_1_1()); 
                    // InternalWizard.g:338:3: ( rule__Pagina__NameAssignment_1_1 )
                    // InternalWizard.g:338:4: rule__Pagina__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPaginaAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Alternatives_1"


    // $ANTLR start "rule__Wizard__Group__0"
    // InternalWizard.g:346:1: rule__Wizard__Group__0 : rule__Wizard__Group__0__Impl rule__Wizard__Group__1 ;
    public final void rule__Wizard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:350:1: ( rule__Wizard__Group__0__Impl rule__Wizard__Group__1 )
            // InternalWizard.g:351:2: rule__Wizard__Group__0__Impl rule__Wizard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Wizard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0"


    // $ANTLR start "rule__Wizard__Group__0__Impl"
    // InternalWizard.g:358:1: rule__Wizard__Group__0__Impl : ( 'Wizard' ) ;
    public final void rule__Wizard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:362:1: ( ( 'Wizard' ) )
            // InternalWizard.g:363:1: ( 'Wizard' )
            {
            // InternalWizard.g:363:1: ( 'Wizard' )
            // InternalWizard.g:364:2: 'Wizard'
            {
             before(grammarAccess.getWizardAccess().getWizardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getWizardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__0__Impl"


    // $ANTLR start "rule__Wizard__Group__1"
    // InternalWizard.g:373:1: rule__Wizard__Group__1 : rule__Wizard__Group__1__Impl rule__Wizard__Group__2 ;
    public final void rule__Wizard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:377:1: ( rule__Wizard__Group__1__Impl rule__Wizard__Group__2 )
            // InternalWizard.g:378:2: rule__Wizard__Group__1__Impl rule__Wizard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Wizard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1"


    // $ANTLR start "rule__Wizard__Group__1__Impl"
    // InternalWizard.g:385:1: rule__Wizard__Group__1__Impl : ( ( rule__Wizard__TituloAssignment_1 ) ) ;
    public final void rule__Wizard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:389:1: ( ( ( rule__Wizard__TituloAssignment_1 ) ) )
            // InternalWizard.g:390:1: ( ( rule__Wizard__TituloAssignment_1 ) )
            {
            // InternalWizard.g:390:1: ( ( rule__Wizard__TituloAssignment_1 ) )
            // InternalWizard.g:391:2: ( rule__Wizard__TituloAssignment_1 )
            {
             before(grammarAccess.getWizardAccess().getTituloAssignment_1()); 
            // InternalWizard.g:392:2: ( rule__Wizard__TituloAssignment_1 )
            // InternalWizard.g:392:3: rule__Wizard__TituloAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__TituloAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getTituloAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__1__Impl"


    // $ANTLR start "rule__Wizard__Group__2"
    // InternalWizard.g:400:1: rule__Wizard__Group__2 : rule__Wizard__Group__2__Impl rule__Wizard__Group__3 ;
    public final void rule__Wizard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:404:1: ( rule__Wizard__Group__2__Impl rule__Wizard__Group__3 )
            // InternalWizard.g:405:2: rule__Wizard__Group__2__Impl rule__Wizard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Wizard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2"


    // $ANTLR start "rule__Wizard__Group__2__Impl"
    // InternalWizard.g:412:1: rule__Wizard__Group__2__Impl : ( ':' ) ;
    public final void rule__Wizard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:416:1: ( ( ':' ) )
            // InternalWizard.g:417:1: ( ':' )
            {
            // InternalWizard.g:417:1: ( ':' )
            // InternalWizard.g:418:2: ':'
            {
             before(grammarAccess.getWizardAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWizardAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__2__Impl"


    // $ANTLR start "rule__Wizard__Group__3"
    // InternalWizard.g:427:1: rule__Wizard__Group__3 : rule__Wizard__Group__3__Impl rule__Wizard__Group__4 ;
    public final void rule__Wizard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:431:1: ( rule__Wizard__Group__3__Impl rule__Wizard__Group__4 )
            // InternalWizard.g:432:2: rule__Wizard__Group__3__Impl rule__Wizard__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Wizard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wizard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3"


    // $ANTLR start "rule__Wizard__Group__3__Impl"
    // InternalWizard.g:439:1: rule__Wizard__Group__3__Impl : ( ( rule__Wizard__PaginasAssignment_3 ) ) ;
    public final void rule__Wizard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:443:1: ( ( ( rule__Wizard__PaginasAssignment_3 ) ) )
            // InternalWizard.g:444:1: ( ( rule__Wizard__PaginasAssignment_3 ) )
            {
            // InternalWizard.g:444:1: ( ( rule__Wizard__PaginasAssignment_3 ) )
            // InternalWizard.g:445:2: ( rule__Wizard__PaginasAssignment_3 )
            {
             before(grammarAccess.getWizardAccess().getPaginasAssignment_3()); 
            // InternalWizard.g:446:2: ( rule__Wizard__PaginasAssignment_3 )
            // InternalWizard.g:446:3: rule__Wizard__PaginasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__PaginasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWizardAccess().getPaginasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__3__Impl"


    // $ANTLR start "rule__Wizard__Group__4"
    // InternalWizard.g:454:1: rule__Wizard__Group__4 : rule__Wizard__Group__4__Impl ;
    public final void rule__Wizard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:458:1: ( rule__Wizard__Group__4__Impl )
            // InternalWizard.g:459:2: rule__Wizard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wizard__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4"


    // $ANTLR start "rule__Wizard__Group__4__Impl"
    // InternalWizard.g:465:1: rule__Wizard__Group__4__Impl : ( ( rule__Wizard__PaginasAssignment_4 )* ) ;
    public final void rule__Wizard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:469:1: ( ( ( rule__Wizard__PaginasAssignment_4 )* ) )
            // InternalWizard.g:470:1: ( ( rule__Wizard__PaginasAssignment_4 )* )
            {
            // InternalWizard.g:470:1: ( ( rule__Wizard__PaginasAssignment_4 )* )
            // InternalWizard.g:471:2: ( rule__Wizard__PaginasAssignment_4 )*
            {
             before(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 
            // InternalWizard.g:472:2: ( rule__Wizard__PaginasAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWizard.g:472:3: rule__Wizard__PaginasAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Wizard__PaginasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getWizardAccess().getPaginasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__Group__4__Impl"


    // $ANTLR start "rule__Pagina__Group__0"
    // InternalWizard.g:481:1: rule__Pagina__Group__0 : rule__Pagina__Group__0__Impl rule__Pagina__Group__1 ;
    public final void rule__Pagina__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:485:1: ( rule__Pagina__Group__0__Impl rule__Pagina__Group__1 )
            // InternalWizard.g:486:2: rule__Pagina__Group__0__Impl rule__Pagina__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Pagina__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__0"


    // $ANTLR start "rule__Pagina__Group__0__Impl"
    // InternalWizard.g:493:1: rule__Pagina__Group__0__Impl : ( 'Pagina' ) ;
    public final void rule__Pagina__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:497:1: ( ( 'Pagina' ) )
            // InternalWizard.g:498:1: ( 'Pagina' )
            {
            // InternalWizard.g:498:1: ( 'Pagina' )
            // InternalWizard.g:499:2: 'Pagina'
            {
             before(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getPaginaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__0__Impl"


    // $ANTLR start "rule__Pagina__Group__1"
    // InternalWizard.g:508:1: rule__Pagina__Group__1 : rule__Pagina__Group__1__Impl rule__Pagina__Group__2 ;
    public final void rule__Pagina__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:512:1: ( rule__Pagina__Group__1__Impl rule__Pagina__Group__2 )
            // InternalWizard.g:513:2: rule__Pagina__Group__1__Impl rule__Pagina__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pagina__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__1"


    // $ANTLR start "rule__Pagina__Group__1__Impl"
    // InternalWizard.g:520:1: rule__Pagina__Group__1__Impl : ( ( rule__Pagina__Alternatives_1 ) ) ;
    public final void rule__Pagina__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:524:1: ( ( ( rule__Pagina__Alternatives_1 ) ) )
            // InternalWizard.g:525:1: ( ( rule__Pagina__Alternatives_1 ) )
            {
            // InternalWizard.g:525:1: ( ( rule__Pagina__Alternatives_1 ) )
            // InternalWizard.g:526:2: ( rule__Pagina__Alternatives_1 )
            {
             before(grammarAccess.getPaginaAccess().getAlternatives_1()); 
            // InternalWizard.g:527:2: ( rule__Pagina__Alternatives_1 )
            // InternalWizard.g:527:3: rule__Pagina__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__1__Impl"


    // $ANTLR start "rule__Pagina__Group__2"
    // InternalWizard.g:535:1: rule__Pagina__Group__2 : rule__Pagina__Group__2__Impl rule__Pagina__Group__3 ;
    public final void rule__Pagina__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:539:1: ( rule__Pagina__Group__2__Impl rule__Pagina__Group__3 )
            // InternalWizard.g:540:2: rule__Pagina__Group__2__Impl rule__Pagina__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__2"


    // $ANTLR start "rule__Pagina__Group__2__Impl"
    // InternalWizard.g:547:1: rule__Pagina__Group__2__Impl : ( ':' ) ;
    public final void rule__Pagina__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:551:1: ( ( ':' ) )
            // InternalWizard.g:552:1: ( ':' )
            {
            // InternalWizard.g:552:1: ( ':' )
            // InternalWizard.g:553:2: ':'
            {
             before(grammarAccess.getPaginaAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__2__Impl"


    // $ANTLR start "rule__Pagina__Group__3"
    // InternalWizard.g:562:1: rule__Pagina__Group__3 : rule__Pagina__Group__3__Impl ;
    public final void rule__Pagina__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:566:1: ( rule__Pagina__Group__3__Impl )
            // InternalWizard.g:567:2: rule__Pagina__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__3"


    // $ANTLR start "rule__Pagina__Group__3__Impl"
    // InternalWizard.g:573:1: rule__Pagina__Group__3__Impl : ( ( rule__Pagina__Group_3__0 ) ) ;
    public final void rule__Pagina__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:577:1: ( ( ( rule__Pagina__Group_3__0 ) ) )
            // InternalWizard.g:578:1: ( ( rule__Pagina__Group_3__0 ) )
            {
            // InternalWizard.g:578:1: ( ( rule__Pagina__Group_3__0 ) )
            // InternalWizard.g:579:2: ( rule__Pagina__Group_3__0 )
            {
             before(grammarAccess.getPaginaAccess().getGroup_3()); 
            // InternalWizard.g:580:2: ( rule__Pagina__Group_3__0 )
            // InternalWizard.g:580:3: rule__Pagina__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group__3__Impl"


    // $ANTLR start "rule__Pagina__Group_1_0__0"
    // InternalWizard.g:589:1: rule__Pagina__Group_1_0__0 : rule__Pagina__Group_1_0__0__Impl rule__Pagina__Group_1_0__1 ;
    public final void rule__Pagina__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:593:1: ( rule__Pagina__Group_1_0__0__Impl rule__Pagina__Group_1_0__1 )
            // InternalWizard.g:594:2: rule__Pagina__Group_1_0__0__Impl rule__Pagina__Group_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Pagina__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_1_0__0"


    // $ANTLR start "rule__Pagina__Group_1_0__0__Impl"
    // InternalWizard.g:601:1: rule__Pagina__Group_1_0__0__Impl : ( ( rule__Pagina__InicialAssignment_1_0_0 ) ) ;
    public final void rule__Pagina__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:605:1: ( ( ( rule__Pagina__InicialAssignment_1_0_0 ) ) )
            // InternalWizard.g:606:1: ( ( rule__Pagina__InicialAssignment_1_0_0 ) )
            {
            // InternalWizard.g:606:1: ( ( rule__Pagina__InicialAssignment_1_0_0 ) )
            // InternalWizard.g:607:2: ( rule__Pagina__InicialAssignment_1_0_0 )
            {
             before(grammarAccess.getPaginaAccess().getInicialAssignment_1_0_0()); 
            // InternalWizard.g:608:2: ( rule__Pagina__InicialAssignment_1_0_0 )
            // InternalWizard.g:608:3: rule__Pagina__InicialAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__InicialAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getInicialAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_1_0__0__Impl"


    // $ANTLR start "rule__Pagina__Group_1_0__1"
    // InternalWizard.g:616:1: rule__Pagina__Group_1_0__1 : rule__Pagina__Group_1_0__1__Impl ;
    public final void rule__Pagina__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:620:1: ( rule__Pagina__Group_1_0__1__Impl )
            // InternalWizard.g:621:2: rule__Pagina__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_1_0__1"


    // $ANTLR start "rule__Pagina__Group_1_0__1__Impl"
    // InternalWizard.g:627:1: rule__Pagina__Group_1_0__1__Impl : ( ( rule__Pagina__NameAssignment_1_0_1 ) ) ;
    public final void rule__Pagina__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:631:1: ( ( ( rule__Pagina__NameAssignment_1_0_1 ) ) )
            // InternalWizard.g:632:1: ( ( rule__Pagina__NameAssignment_1_0_1 ) )
            {
            // InternalWizard.g:632:1: ( ( rule__Pagina__NameAssignment_1_0_1 ) )
            // InternalWizard.g:633:2: ( rule__Pagina__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getPaginaAccess().getNameAssignment_1_0_1()); 
            // InternalWizard.g:634:2: ( rule__Pagina__NameAssignment_1_0_1 )
            // InternalWizard.g:634:3: rule__Pagina__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__NameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_1_0__1__Impl"


    // $ANTLR start "rule__Pagina__Group_3__0"
    // InternalWizard.g:643:1: rule__Pagina__Group_3__0 : rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1 ;
    public final void rule__Pagina__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:647:1: ( rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1 )
            // InternalWizard.g:648:2: rule__Pagina__Group_3__0__Impl rule__Pagina__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__0"


    // $ANTLR start "rule__Pagina__Group_3__0__Impl"
    // InternalWizard.g:655:1: rule__Pagina__Group_3__0__Impl : ( ( rule__Pagina__Group_3_0__0 )? ) ;
    public final void rule__Pagina__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:659:1: ( ( ( rule__Pagina__Group_3_0__0 )? ) )
            // InternalWizard.g:660:1: ( ( rule__Pagina__Group_3_0__0 )? )
            {
            // InternalWizard.g:660:1: ( ( rule__Pagina__Group_3_0__0 )? )
            // InternalWizard.g:661:2: ( rule__Pagina__Group_3_0__0 )?
            {
             before(grammarAccess.getPaginaAccess().getGroup_3_0()); 
            // InternalWizard.g:662:2: ( rule__Pagina__Group_3_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWizard.g:662:3: rule__Pagina__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__Group_3_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaginaAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__0__Impl"


    // $ANTLR start "rule__Pagina__Group_3__1"
    // InternalWizard.g:670:1: rule__Pagina__Group_3__1 : rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2 ;
    public final void rule__Pagina__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:674:1: ( rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2 )
            // InternalWizard.g:675:2: rule__Pagina__Group_3__1__Impl rule__Pagina__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__1"


    // $ANTLR start "rule__Pagina__Group_3__1__Impl"
    // InternalWizard.g:682:1: rule__Pagina__Group_3__1__Impl : ( ( rule__Pagina__Group_3_1__0 )? ) ;
    public final void rule__Pagina__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:686:1: ( ( ( rule__Pagina__Group_3_1__0 )? ) )
            // InternalWizard.g:687:1: ( ( rule__Pagina__Group_3_1__0 )? )
            {
            // InternalWizard.g:687:1: ( ( rule__Pagina__Group_3_1__0 )? )
            // InternalWizard.g:688:2: ( rule__Pagina__Group_3_1__0 )?
            {
             before(grammarAccess.getPaginaAccess().getGroup_3_1()); 
            // InternalWizard.g:689:2: ( rule__Pagina__Group_3_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWizard.g:689:3: rule__Pagina__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pagina__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaginaAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__1__Impl"


    // $ANTLR start "rule__Pagina__Group_3__2"
    // InternalWizard.g:697:1: rule__Pagina__Group_3__2 : rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3 ;
    public final void rule__Pagina__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:701:1: ( rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3 )
            // InternalWizard.g:702:2: rule__Pagina__Group_3__2__Impl rule__Pagina__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Pagina__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__2"


    // $ANTLR start "rule__Pagina__Group_3__2__Impl"
    // InternalWizard.g:709:1: rule__Pagina__Group_3__2__Impl : ( ( rule__Pagina__BotonesAssignment_3_2 ) ) ;
    public final void rule__Pagina__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:713:1: ( ( ( rule__Pagina__BotonesAssignment_3_2 ) ) )
            // InternalWizard.g:714:1: ( ( rule__Pagina__BotonesAssignment_3_2 ) )
            {
            // InternalWizard.g:714:1: ( ( rule__Pagina__BotonesAssignment_3_2 ) )
            // InternalWizard.g:715:2: ( rule__Pagina__BotonesAssignment_3_2 )
            {
             before(grammarAccess.getPaginaAccess().getBotonesAssignment_3_2()); 
            // InternalWizard.g:716:2: ( rule__Pagina__BotonesAssignment_3_2 )
            // InternalWizard.g:716:3: rule__Pagina__BotonesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__BotonesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getBotonesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__2__Impl"


    // $ANTLR start "rule__Pagina__Group_3__3"
    // InternalWizard.g:724:1: rule__Pagina__Group_3__3 : rule__Pagina__Group_3__3__Impl ;
    public final void rule__Pagina__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:728:1: ( rule__Pagina__Group_3__3__Impl )
            // InternalWizard.g:729:2: rule__Pagina__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__3"


    // $ANTLR start "rule__Pagina__Group_3__3__Impl"
    // InternalWizard.g:735:1: rule__Pagina__Group_3__3__Impl : ( ( rule__Pagina__BotonesAssignment_3_3 )* ) ;
    public final void rule__Pagina__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:739:1: ( ( ( rule__Pagina__BotonesAssignment_3_3 )* ) )
            // InternalWizard.g:740:1: ( ( rule__Pagina__BotonesAssignment_3_3 )* )
            {
            // InternalWizard.g:740:1: ( ( rule__Pagina__BotonesAssignment_3_3 )* )
            // InternalWizard.g:741:2: ( rule__Pagina__BotonesAssignment_3_3 )*
            {
             before(grammarAccess.getPaginaAccess().getBotonesAssignment_3_3()); 
            // InternalWizard.g:742:2: ( rule__Pagina__BotonesAssignment_3_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==22||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWizard.g:742:3: rule__Pagina__BotonesAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pagina__BotonesAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getBotonesAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3__3__Impl"


    // $ANTLR start "rule__Pagina__Group_3_0__0"
    // InternalWizard.g:751:1: rule__Pagina__Group_3_0__0 : rule__Pagina__Group_3_0__0__Impl rule__Pagina__Group_3_0__1 ;
    public final void rule__Pagina__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:755:1: ( rule__Pagina__Group_3_0__0__Impl rule__Pagina__Group_3_0__1 )
            // InternalWizard.g:756:2: rule__Pagina__Group_3_0__0__Impl rule__Pagina__Group_3_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Pagina__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_0__0"


    // $ANTLR start "rule__Pagina__Group_3_0__0__Impl"
    // InternalWizard.g:763:1: rule__Pagina__Group_3_0__0__Impl : ( ( rule__Pagina__CamposAssignment_3_0_0 ) ) ;
    public final void rule__Pagina__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:767:1: ( ( ( rule__Pagina__CamposAssignment_3_0_0 ) ) )
            // InternalWizard.g:768:1: ( ( rule__Pagina__CamposAssignment_3_0_0 ) )
            {
            // InternalWizard.g:768:1: ( ( rule__Pagina__CamposAssignment_3_0_0 ) )
            // InternalWizard.g:769:2: ( rule__Pagina__CamposAssignment_3_0_0 )
            {
             before(grammarAccess.getPaginaAccess().getCamposAssignment_3_0_0()); 
            // InternalWizard.g:770:2: ( rule__Pagina__CamposAssignment_3_0_0 )
            // InternalWizard.g:770:3: rule__Pagina__CamposAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CamposAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCamposAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_0__0__Impl"


    // $ANTLR start "rule__Pagina__Group_3_0__1"
    // InternalWizard.g:778:1: rule__Pagina__Group_3_0__1 : rule__Pagina__Group_3_0__1__Impl ;
    public final void rule__Pagina__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:782:1: ( rule__Pagina__Group_3_0__1__Impl )
            // InternalWizard.g:783:2: rule__Pagina__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_0__1"


    // $ANTLR start "rule__Pagina__Group_3_0__1__Impl"
    // InternalWizard.g:789:1: rule__Pagina__Group_3_0__1__Impl : ( ( rule__Pagina__CamposAssignment_3_0_1 )* ) ;
    public final void rule__Pagina__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:793:1: ( ( ( rule__Pagina__CamposAssignment_3_0_1 )* ) )
            // InternalWizard.g:794:1: ( ( rule__Pagina__CamposAssignment_3_0_1 )* )
            {
            // InternalWizard.g:794:1: ( ( rule__Pagina__CamposAssignment_3_0_1 )* )
            // InternalWizard.g:795:2: ( rule__Pagina__CamposAssignment_3_0_1 )*
            {
             before(grammarAccess.getPaginaAccess().getCamposAssignment_3_0_1()); 
            // InternalWizard.g:796:2: ( rule__Pagina__CamposAssignment_3_0_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWizard.g:796:3: rule__Pagina__CamposAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Pagina__CamposAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getCamposAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_0__1__Impl"


    // $ANTLR start "rule__Pagina__Group_3_1__0"
    // InternalWizard.g:805:1: rule__Pagina__Group_3_1__0 : rule__Pagina__Group_3_1__0__Impl rule__Pagina__Group_3_1__1 ;
    public final void rule__Pagina__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:809:1: ( rule__Pagina__Group_3_1__0__Impl rule__Pagina__Group_3_1__1 )
            // InternalWizard.g:810:2: rule__Pagina__Group_3_1__0__Impl rule__Pagina__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Pagina__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_1__0"


    // $ANTLR start "rule__Pagina__Group_3_1__0__Impl"
    // InternalWizard.g:817:1: rule__Pagina__Group_3_1__0__Impl : ( ( rule__Pagina__CasillasAssignment_3_1_0 ) ) ;
    public final void rule__Pagina__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:821:1: ( ( ( rule__Pagina__CasillasAssignment_3_1_0 ) ) )
            // InternalWizard.g:822:1: ( ( rule__Pagina__CasillasAssignment_3_1_0 ) )
            {
            // InternalWizard.g:822:1: ( ( rule__Pagina__CasillasAssignment_3_1_0 ) )
            // InternalWizard.g:823:2: ( rule__Pagina__CasillasAssignment_3_1_0 )
            {
             before(grammarAccess.getPaginaAccess().getCasillasAssignment_3_1_0()); 
            // InternalWizard.g:824:2: ( rule__Pagina__CasillasAssignment_3_1_0 )
            // InternalWizard.g:824:3: rule__Pagina__CasillasAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__CasillasAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPaginaAccess().getCasillasAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_1__0__Impl"


    // $ANTLR start "rule__Pagina__Group_3_1__1"
    // InternalWizard.g:832:1: rule__Pagina__Group_3_1__1 : rule__Pagina__Group_3_1__1__Impl ;
    public final void rule__Pagina__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:836:1: ( rule__Pagina__Group_3_1__1__Impl )
            // InternalWizard.g:837:2: rule__Pagina__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pagina__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_1__1"


    // $ANTLR start "rule__Pagina__Group_3_1__1__Impl"
    // InternalWizard.g:843:1: rule__Pagina__Group_3_1__1__Impl : ( ( rule__Pagina__CasillasAssignment_3_1_1 )* ) ;
    public final void rule__Pagina__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:847:1: ( ( ( rule__Pagina__CasillasAssignment_3_1_1 )* ) )
            // InternalWizard.g:848:1: ( ( rule__Pagina__CasillasAssignment_3_1_1 )* )
            {
            // InternalWizard.g:848:1: ( ( rule__Pagina__CasillasAssignment_3_1_1 )* )
            // InternalWizard.g:849:2: ( rule__Pagina__CasillasAssignment_3_1_1 )*
            {
             before(grammarAccess.getPaginaAccess().getCasillasAssignment_3_1_1()); 
            // InternalWizard.g:850:2: ( rule__Pagina__CasillasAssignment_3_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWizard.g:850:3: rule__Pagina__CasillasAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Pagina__CasillasAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPaginaAccess().getCasillasAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__Group_3_1__1__Impl"


    // $ANTLR start "rule__Campo__Group__0"
    // InternalWizard.g:859:1: rule__Campo__Group__0 : rule__Campo__Group__0__Impl rule__Campo__Group__1 ;
    public final void rule__Campo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:863:1: ( rule__Campo__Group__0__Impl rule__Campo__Group__1 )
            // InternalWizard.g:864:2: rule__Campo__Group__0__Impl rule__Campo__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Campo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__0"


    // $ANTLR start "rule__Campo__Group__0__Impl"
    // InternalWizard.g:871:1: rule__Campo__Group__0__Impl : ( 'Campo' ) ;
    public final void rule__Campo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:875:1: ( ( 'Campo' ) )
            // InternalWizard.g:876:1: ( 'Campo' )
            {
            // InternalWizard.g:876:1: ( 'Campo' )
            // InternalWizard.g:877:2: 'Campo'
            {
             before(grammarAccess.getCampoAccess().getCampoKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getCampoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__0__Impl"


    // $ANTLR start "rule__Campo__Group__1"
    // InternalWizard.g:886:1: rule__Campo__Group__1 : rule__Campo__Group__1__Impl rule__Campo__Group__2 ;
    public final void rule__Campo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:890:1: ( rule__Campo__Group__1__Impl rule__Campo__Group__2 )
            // InternalWizard.g:891:2: rule__Campo__Group__1__Impl rule__Campo__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Campo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__1"


    // $ANTLR start "rule__Campo__Group__1__Impl"
    // InternalWizard.g:898:1: rule__Campo__Group__1__Impl : ( ( rule__Campo__ObligatorioAssignment_1 )? ) ;
    public final void rule__Campo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:902:1: ( ( ( rule__Campo__ObligatorioAssignment_1 )? ) )
            // InternalWizard.g:903:1: ( ( rule__Campo__ObligatorioAssignment_1 )? )
            {
            // InternalWizard.g:903:1: ( ( rule__Campo__ObligatorioAssignment_1 )? )
            // InternalWizard.g:904:2: ( rule__Campo__ObligatorioAssignment_1 )?
            {
             before(grammarAccess.getCampoAccess().getObligatorioAssignment_1()); 
            // InternalWizard.g:905:2: ( rule__Campo__ObligatorioAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWizard.g:905:3: rule__Campo__ObligatorioAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Campo__ObligatorioAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCampoAccess().getObligatorioAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__1__Impl"


    // $ANTLR start "rule__Campo__Group__2"
    // InternalWizard.g:913:1: rule__Campo__Group__2 : rule__Campo__Group__2__Impl rule__Campo__Group__3 ;
    public final void rule__Campo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:917:1: ( rule__Campo__Group__2__Impl rule__Campo__Group__3 )
            // InternalWizard.g:918:2: rule__Campo__Group__2__Impl rule__Campo__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Campo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__2"


    // $ANTLR start "rule__Campo__Group__2__Impl"
    // InternalWizard.g:925:1: rule__Campo__Group__2__Impl : ( ':' ) ;
    public final void rule__Campo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:929:1: ( ( ':' ) )
            // InternalWizard.g:930:1: ( ':' )
            {
            // InternalWizard.g:930:1: ( ':' )
            // InternalWizard.g:931:2: ':'
            {
             before(grammarAccess.getCampoAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__2__Impl"


    // $ANTLR start "rule__Campo__Group__3"
    // InternalWizard.g:940:1: rule__Campo__Group__3 : rule__Campo__Group__3__Impl ;
    public final void rule__Campo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:944:1: ( rule__Campo__Group__3__Impl )
            // InternalWizard.g:945:2: rule__Campo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__3"


    // $ANTLR start "rule__Campo__Group__3__Impl"
    // InternalWizard.g:951:1: rule__Campo__Group__3__Impl : ( ( rule__Campo__EtiquetaAssignment_3 ) ) ;
    public final void rule__Campo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:955:1: ( ( ( rule__Campo__EtiquetaAssignment_3 ) ) )
            // InternalWizard.g:956:1: ( ( rule__Campo__EtiquetaAssignment_3 ) )
            {
            // InternalWizard.g:956:1: ( ( rule__Campo__EtiquetaAssignment_3 ) )
            // InternalWizard.g:957:2: ( rule__Campo__EtiquetaAssignment_3 )
            {
             before(grammarAccess.getCampoAccess().getEtiquetaAssignment_3()); 
            // InternalWizard.g:958:2: ( rule__Campo__EtiquetaAssignment_3 )
            // InternalWizard.g:958:3: rule__Campo__EtiquetaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Campo__EtiquetaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getEtiquetaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__3__Impl"


    // $ANTLR start "rule__Casilla__Group__0"
    // InternalWizard.g:967:1: rule__Casilla__Group__0 : rule__Casilla__Group__0__Impl rule__Casilla__Group__1 ;
    public final void rule__Casilla__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:971:1: ( rule__Casilla__Group__0__Impl rule__Casilla__Group__1 )
            // InternalWizard.g:972:2: rule__Casilla__Group__0__Impl rule__Casilla__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Casilla__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__0"


    // $ANTLR start "rule__Casilla__Group__0__Impl"
    // InternalWizard.g:979:1: rule__Casilla__Group__0__Impl : ( 'Casilla' ) ;
    public final void rule__Casilla__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:983:1: ( ( 'Casilla' ) )
            // InternalWizard.g:984:1: ( 'Casilla' )
            {
            // InternalWizard.g:984:1: ( 'Casilla' )
            // InternalWizard.g:985:2: 'Casilla'
            {
             before(grammarAccess.getCasillaAccess().getCasillaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCasillaAccess().getCasillaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__0__Impl"


    // $ANTLR start "rule__Casilla__Group__1"
    // InternalWizard.g:994:1: rule__Casilla__Group__1 : rule__Casilla__Group__1__Impl rule__Casilla__Group__2 ;
    public final void rule__Casilla__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:998:1: ( rule__Casilla__Group__1__Impl rule__Casilla__Group__2 )
            // InternalWizard.g:999:2: rule__Casilla__Group__1__Impl rule__Casilla__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Casilla__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__1"


    // $ANTLR start "rule__Casilla__Group__1__Impl"
    // InternalWizard.g:1006:1: rule__Casilla__Group__1__Impl : ( ( rule__Casilla__SeleccionadoAssignment_1 )? ) ;
    public final void rule__Casilla__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1010:1: ( ( ( rule__Casilla__SeleccionadoAssignment_1 )? ) )
            // InternalWizard.g:1011:1: ( ( rule__Casilla__SeleccionadoAssignment_1 )? )
            {
            // InternalWizard.g:1011:1: ( ( rule__Casilla__SeleccionadoAssignment_1 )? )
            // InternalWizard.g:1012:2: ( rule__Casilla__SeleccionadoAssignment_1 )?
            {
             before(grammarAccess.getCasillaAccess().getSeleccionadoAssignment_1()); 
            // InternalWizard.g:1013:2: ( rule__Casilla__SeleccionadoAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWizard.g:1013:3: rule__Casilla__SeleccionadoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Casilla__SeleccionadoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCasillaAccess().getSeleccionadoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__1__Impl"


    // $ANTLR start "rule__Casilla__Group__2"
    // InternalWizard.g:1021:1: rule__Casilla__Group__2 : rule__Casilla__Group__2__Impl rule__Casilla__Group__3 ;
    public final void rule__Casilla__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1025:1: ( rule__Casilla__Group__2__Impl rule__Casilla__Group__3 )
            // InternalWizard.g:1026:2: rule__Casilla__Group__2__Impl rule__Casilla__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Casilla__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__2"


    // $ANTLR start "rule__Casilla__Group__2__Impl"
    // InternalWizard.g:1033:1: rule__Casilla__Group__2__Impl : ( ( rule__Casilla__NameAssignment_2 ) ) ;
    public final void rule__Casilla__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1037:1: ( ( ( rule__Casilla__NameAssignment_2 ) ) )
            // InternalWizard.g:1038:1: ( ( rule__Casilla__NameAssignment_2 ) )
            {
            // InternalWizard.g:1038:1: ( ( rule__Casilla__NameAssignment_2 ) )
            // InternalWizard.g:1039:2: ( rule__Casilla__NameAssignment_2 )
            {
             before(grammarAccess.getCasillaAccess().getNameAssignment_2()); 
            // InternalWizard.g:1040:2: ( rule__Casilla__NameAssignment_2 )
            // InternalWizard.g:1040:3: rule__Casilla__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCasillaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__2__Impl"


    // $ANTLR start "rule__Casilla__Group__3"
    // InternalWizard.g:1048:1: rule__Casilla__Group__3 : rule__Casilla__Group__3__Impl rule__Casilla__Group__4 ;
    public final void rule__Casilla__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1052:1: ( rule__Casilla__Group__3__Impl rule__Casilla__Group__4 )
            // InternalWizard.g:1053:2: rule__Casilla__Group__3__Impl rule__Casilla__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Casilla__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__3"


    // $ANTLR start "rule__Casilla__Group__3__Impl"
    // InternalWizard.g:1060:1: rule__Casilla__Group__3__Impl : ( ':' ) ;
    public final void rule__Casilla__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1064:1: ( ( ':' ) )
            // InternalWizard.g:1065:1: ( ':' )
            {
            // InternalWizard.g:1065:1: ( ':' )
            // InternalWizard.g:1066:2: ':'
            {
             before(grammarAccess.getCasillaAccess().getColonKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCasillaAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__3__Impl"


    // $ANTLR start "rule__Casilla__Group__4"
    // InternalWizard.g:1075:1: rule__Casilla__Group__4 : rule__Casilla__Group__4__Impl rule__Casilla__Group__5 ;
    public final void rule__Casilla__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1079:1: ( rule__Casilla__Group__4__Impl rule__Casilla__Group__5 )
            // InternalWizard.g:1080:2: rule__Casilla__Group__4__Impl rule__Casilla__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Casilla__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__4"


    // $ANTLR start "rule__Casilla__Group__4__Impl"
    // InternalWizard.g:1087:1: rule__Casilla__Group__4__Impl : ( ( rule__Casilla__EtiquetaAssignment_4 ) ) ;
    public final void rule__Casilla__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1091:1: ( ( ( rule__Casilla__EtiquetaAssignment_4 ) ) )
            // InternalWizard.g:1092:1: ( ( rule__Casilla__EtiquetaAssignment_4 ) )
            {
            // InternalWizard.g:1092:1: ( ( rule__Casilla__EtiquetaAssignment_4 ) )
            // InternalWizard.g:1093:2: ( rule__Casilla__EtiquetaAssignment_4 )
            {
             before(grammarAccess.getCasillaAccess().getEtiquetaAssignment_4()); 
            // InternalWizard.g:1094:2: ( rule__Casilla__EtiquetaAssignment_4 )
            // InternalWizard.g:1094:3: rule__Casilla__EtiquetaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__EtiquetaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCasillaAccess().getEtiquetaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__4__Impl"


    // $ANTLR start "rule__Casilla__Group__5"
    // InternalWizard.g:1102:1: rule__Casilla__Group__5 : rule__Casilla__Group__5__Impl ;
    public final void rule__Casilla__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1106:1: ( rule__Casilla__Group__5__Impl )
            // InternalWizard.g:1107:2: rule__Casilla__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__5"


    // $ANTLR start "rule__Casilla__Group__5__Impl"
    // InternalWizard.g:1113:1: rule__Casilla__Group__5__Impl : ( ( rule__Casilla__Group_5__0 )? ) ;
    public final void rule__Casilla__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1117:1: ( ( ( rule__Casilla__Group_5__0 )? ) )
            // InternalWizard.g:1118:1: ( ( rule__Casilla__Group_5__0 )? )
            {
            // InternalWizard.g:1118:1: ( ( rule__Casilla__Group_5__0 )? )
            // InternalWizard.g:1119:2: ( rule__Casilla__Group_5__0 )?
            {
             before(grammarAccess.getCasillaAccess().getGroup_5()); 
            // InternalWizard.g:1120:2: ( rule__Casilla__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalWizard.g:1120:3: rule__Casilla__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Casilla__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCasillaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group__5__Impl"


    // $ANTLR start "rule__Casilla__Group_5__0"
    // InternalWizard.g:1129:1: rule__Casilla__Group_5__0 : rule__Casilla__Group_5__0__Impl rule__Casilla__Group_5__1 ;
    public final void rule__Casilla__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1133:1: ( rule__Casilla__Group_5__0__Impl rule__Casilla__Group_5__1 )
            // InternalWizard.g:1134:2: rule__Casilla__Group_5__0__Impl rule__Casilla__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Casilla__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Casilla__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group_5__0"


    // $ANTLR start "rule__Casilla__Group_5__0__Impl"
    // InternalWizard.g:1141:1: rule__Casilla__Group_5__0__Impl : ( 'destino' ) ;
    public final void rule__Casilla__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1145:1: ( ( 'destino' ) )
            // InternalWizard.g:1146:1: ( 'destino' )
            {
            // InternalWizard.g:1146:1: ( 'destino' )
            // InternalWizard.g:1147:2: 'destino'
            {
             before(grammarAccess.getCasillaAccess().getDestinoKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCasillaAccess().getDestinoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group_5__0__Impl"


    // $ANTLR start "rule__Casilla__Group_5__1"
    // InternalWizard.g:1156:1: rule__Casilla__Group_5__1 : rule__Casilla__Group_5__1__Impl ;
    public final void rule__Casilla__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1160:1: ( rule__Casilla__Group_5__1__Impl )
            // InternalWizard.g:1161:2: rule__Casilla__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group_5__1"


    // $ANTLR start "rule__Casilla__Group_5__1__Impl"
    // InternalWizard.g:1167:1: rule__Casilla__Group_5__1__Impl : ( ( rule__Casilla__NuevoDestinoAssignment_5_1 ) ) ;
    public final void rule__Casilla__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1171:1: ( ( ( rule__Casilla__NuevoDestinoAssignment_5_1 ) ) )
            // InternalWizard.g:1172:1: ( ( rule__Casilla__NuevoDestinoAssignment_5_1 ) )
            {
            // InternalWizard.g:1172:1: ( ( rule__Casilla__NuevoDestinoAssignment_5_1 ) )
            // InternalWizard.g:1173:2: ( rule__Casilla__NuevoDestinoAssignment_5_1 )
            {
             before(grammarAccess.getCasillaAccess().getNuevoDestinoAssignment_5_1()); 
            // InternalWizard.g:1174:2: ( rule__Casilla__NuevoDestinoAssignment_5_1 )
            // InternalWizard.g:1174:3: rule__Casilla__NuevoDestinoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Casilla__NuevoDestinoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCasillaAccess().getNuevoDestinoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__Group_5__1__Impl"


    // $ANTLR start "rule__Navegar__Group__0"
    // InternalWizard.g:1183:1: rule__Navegar__Group__0 : rule__Navegar__Group__0__Impl rule__Navegar__Group__1 ;
    public final void rule__Navegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1187:1: ( rule__Navegar__Group__0__Impl rule__Navegar__Group__1 )
            // InternalWizard.g:1188:2: rule__Navegar__Group__0__Impl rule__Navegar__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Navegar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__0"


    // $ANTLR start "rule__Navegar__Group__0__Impl"
    // InternalWizard.g:1195:1: rule__Navegar__Group__0__Impl : ( 'Navegar' ) ;
    public final void rule__Navegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1199:1: ( ( 'Navegar' ) )
            // InternalWizard.g:1200:1: ( 'Navegar' )
            {
            // InternalWizard.g:1200:1: ( 'Navegar' )
            // InternalWizard.g:1201:2: 'Navegar'
            {
             before(grammarAccess.getNavegarAccess().getNavegarKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getNavegarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__0__Impl"


    // $ANTLR start "rule__Navegar__Group__1"
    // InternalWizard.g:1210:1: rule__Navegar__Group__1 : rule__Navegar__Group__1__Impl rule__Navegar__Group__2 ;
    public final void rule__Navegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1214:1: ( rule__Navegar__Group__1__Impl rule__Navegar__Group__2 )
            // InternalWizard.g:1215:2: rule__Navegar__Group__1__Impl rule__Navegar__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Navegar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__1"


    // $ANTLR start "rule__Navegar__Group__1__Impl"
    // InternalWizard.g:1222:1: rule__Navegar__Group__1__Impl : ( ':' ) ;
    public final void rule__Navegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1226:1: ( ( ':' ) )
            // InternalWizard.g:1227:1: ( ':' )
            {
            // InternalWizard.g:1227:1: ( ':' )
            // InternalWizard.g:1228:2: ':'
            {
             before(grammarAccess.getNavegarAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__1__Impl"


    // $ANTLR start "rule__Navegar__Group__2"
    // InternalWizard.g:1237:1: rule__Navegar__Group__2 : rule__Navegar__Group__2__Impl rule__Navegar__Group__3 ;
    public final void rule__Navegar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1241:1: ( rule__Navegar__Group__2__Impl rule__Navegar__Group__3 )
            // InternalWizard.g:1242:2: rule__Navegar__Group__2__Impl rule__Navegar__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Navegar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__2"


    // $ANTLR start "rule__Navegar__Group__2__Impl"
    // InternalWizard.g:1249:1: rule__Navegar__Group__2__Impl : ( ( rule__Navegar__EtiquetaAssignment_2 ) ) ;
    public final void rule__Navegar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1253:1: ( ( ( rule__Navegar__EtiquetaAssignment_2 ) ) )
            // InternalWizard.g:1254:1: ( ( rule__Navegar__EtiquetaAssignment_2 ) )
            {
            // InternalWizard.g:1254:1: ( ( rule__Navegar__EtiquetaAssignment_2 ) )
            // InternalWizard.g:1255:2: ( rule__Navegar__EtiquetaAssignment_2 )
            {
             before(grammarAccess.getNavegarAccess().getEtiquetaAssignment_2()); 
            // InternalWizard.g:1256:2: ( rule__Navegar__EtiquetaAssignment_2 )
            // InternalWizard.g:1256:3: rule__Navegar__EtiquetaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__EtiquetaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getEtiquetaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__2__Impl"


    // $ANTLR start "rule__Navegar__Group__3"
    // InternalWizard.g:1264:1: rule__Navegar__Group__3 : rule__Navegar__Group__3__Impl rule__Navegar__Group__4 ;
    public final void rule__Navegar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1268:1: ( rule__Navegar__Group__3__Impl rule__Navegar__Group__4 )
            // InternalWizard.g:1269:2: rule__Navegar__Group__3__Impl rule__Navegar__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Navegar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__3"


    // $ANTLR start "rule__Navegar__Group__3__Impl"
    // InternalWizard.g:1276:1: rule__Navegar__Group__3__Impl : ( ( rule__Navegar__DestinoAssignment_3 ) ) ;
    public final void rule__Navegar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1280:1: ( ( ( rule__Navegar__DestinoAssignment_3 ) ) )
            // InternalWizard.g:1281:1: ( ( rule__Navegar__DestinoAssignment_3 ) )
            {
            // InternalWizard.g:1281:1: ( ( rule__Navegar__DestinoAssignment_3 ) )
            // InternalWizard.g:1282:2: ( rule__Navegar__DestinoAssignment_3 )
            {
             before(grammarAccess.getNavegarAccess().getDestinoAssignment_3()); 
            // InternalWizard.g:1283:2: ( rule__Navegar__DestinoAssignment_3 )
            // InternalWizard.g:1283:3: rule__Navegar__DestinoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__DestinoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getDestinoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__3__Impl"


    // $ANTLR start "rule__Navegar__Group__4"
    // InternalWizard.g:1291:1: rule__Navegar__Group__4 : rule__Navegar__Group__4__Impl ;
    public final void rule__Navegar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1295:1: ( rule__Navegar__Group__4__Impl )
            // InternalWizard.g:1296:2: rule__Navegar__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__4"


    // $ANTLR start "rule__Navegar__Group__4__Impl"
    // InternalWizard.g:1302:1: rule__Navegar__Group__4__Impl : ( ( rule__Navegar__Group_4__0 )? ) ;
    public final void rule__Navegar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1306:1: ( ( ( rule__Navegar__Group_4__0 )? ) )
            // InternalWizard.g:1307:1: ( ( rule__Navegar__Group_4__0 )? )
            {
            // InternalWizard.g:1307:1: ( ( rule__Navegar__Group_4__0 )? )
            // InternalWizard.g:1308:2: ( rule__Navegar__Group_4__0 )?
            {
             before(grammarAccess.getNavegarAccess().getGroup_4()); 
            // InternalWizard.g:1309:2: ( rule__Navegar__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWizard.g:1309:3: rule__Navegar__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Navegar__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavegarAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__4__Impl"


    // $ANTLR start "rule__Navegar__Group_4__0"
    // InternalWizard.g:1318:1: rule__Navegar__Group_4__0 : rule__Navegar__Group_4__0__Impl rule__Navegar__Group_4__1 ;
    public final void rule__Navegar__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1322:1: ( rule__Navegar__Group_4__0__Impl rule__Navegar__Group_4__1 )
            // InternalWizard.g:1323:2: rule__Navegar__Group_4__0__Impl rule__Navegar__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Navegar__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__0"


    // $ANTLR start "rule__Navegar__Group_4__0__Impl"
    // InternalWizard.g:1330:1: rule__Navegar__Group_4__0__Impl : ( 'dependencias' ) ;
    public final void rule__Navegar__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1334:1: ( ( 'dependencias' ) )
            // InternalWizard.g:1335:1: ( 'dependencias' )
            {
            // InternalWizard.g:1335:1: ( 'dependencias' )
            // InternalWizard.g:1336:2: 'dependencias'
            {
             before(grammarAccess.getNavegarAccess().getDependenciasKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getDependenciasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__0__Impl"


    // $ANTLR start "rule__Navegar__Group_4__1"
    // InternalWizard.g:1345:1: rule__Navegar__Group_4__1 : rule__Navegar__Group_4__1__Impl rule__Navegar__Group_4__2 ;
    public final void rule__Navegar__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1349:1: ( rule__Navegar__Group_4__1__Impl rule__Navegar__Group_4__2 )
            // InternalWizard.g:1350:2: rule__Navegar__Group_4__1__Impl rule__Navegar__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Navegar__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__1"


    // $ANTLR start "rule__Navegar__Group_4__1__Impl"
    // InternalWizard.g:1357:1: rule__Navegar__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Navegar__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1361:1: ( ( '{' ) )
            // InternalWizard.g:1362:1: ( '{' )
            {
            // InternalWizard.g:1362:1: ( '{' )
            // InternalWizard.g:1363:2: '{'
            {
             before(grammarAccess.getNavegarAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__1__Impl"


    // $ANTLR start "rule__Navegar__Group_4__2"
    // InternalWizard.g:1372:1: rule__Navegar__Group_4__2 : rule__Navegar__Group_4__2__Impl rule__Navegar__Group_4__3 ;
    public final void rule__Navegar__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1376:1: ( rule__Navegar__Group_4__2__Impl rule__Navegar__Group_4__3 )
            // InternalWizard.g:1377:2: rule__Navegar__Group_4__2__Impl rule__Navegar__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Navegar__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__2"


    // $ANTLR start "rule__Navegar__Group_4__2__Impl"
    // InternalWizard.g:1384:1: rule__Navegar__Group_4__2__Impl : ( ( rule__Navegar__CasillasAssignment_4_2 ) ) ;
    public final void rule__Navegar__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1388:1: ( ( ( rule__Navegar__CasillasAssignment_4_2 ) ) )
            // InternalWizard.g:1389:1: ( ( rule__Navegar__CasillasAssignment_4_2 ) )
            {
            // InternalWizard.g:1389:1: ( ( rule__Navegar__CasillasAssignment_4_2 ) )
            // InternalWizard.g:1390:2: ( rule__Navegar__CasillasAssignment_4_2 )
            {
             before(grammarAccess.getNavegarAccess().getCasillasAssignment_4_2()); 
            // InternalWizard.g:1391:2: ( rule__Navegar__CasillasAssignment_4_2 )
            // InternalWizard.g:1391:3: rule__Navegar__CasillasAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__CasillasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getCasillasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__2__Impl"


    // $ANTLR start "rule__Navegar__Group_4__3"
    // InternalWizard.g:1399:1: rule__Navegar__Group_4__3 : rule__Navegar__Group_4__3__Impl rule__Navegar__Group_4__4 ;
    public final void rule__Navegar__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1403:1: ( rule__Navegar__Group_4__3__Impl rule__Navegar__Group_4__4 )
            // InternalWizard.g:1404:2: rule__Navegar__Group_4__3__Impl rule__Navegar__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__Navegar__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__3"


    // $ANTLR start "rule__Navegar__Group_4__3__Impl"
    // InternalWizard.g:1411:1: rule__Navegar__Group_4__3__Impl : ( ( rule__Navegar__Group_4_3__0 )* ) ;
    public final void rule__Navegar__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1415:1: ( ( ( rule__Navegar__Group_4_3__0 )* ) )
            // InternalWizard.g:1416:1: ( ( rule__Navegar__Group_4_3__0 )* )
            {
            // InternalWizard.g:1416:1: ( ( rule__Navegar__Group_4_3__0 )* )
            // InternalWizard.g:1417:2: ( rule__Navegar__Group_4_3__0 )*
            {
             before(grammarAccess.getNavegarAccess().getGroup_4_3()); 
            // InternalWizard.g:1418:2: ( rule__Navegar__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWizard.g:1418:3: rule__Navegar__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Navegar__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNavegarAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__3__Impl"


    // $ANTLR start "rule__Navegar__Group_4__4"
    // InternalWizard.g:1426:1: rule__Navegar__Group_4__4 : rule__Navegar__Group_4__4__Impl ;
    public final void rule__Navegar__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1430:1: ( rule__Navegar__Group_4__4__Impl )
            // InternalWizard.g:1431:2: rule__Navegar__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__4"


    // $ANTLR start "rule__Navegar__Group_4__4__Impl"
    // InternalWizard.g:1437:1: rule__Navegar__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Navegar__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1441:1: ( ( '}' ) )
            // InternalWizard.g:1442:1: ( '}' )
            {
            // InternalWizard.g:1442:1: ( '}' )
            // InternalWizard.g:1443:2: '}'
            {
             before(grammarAccess.getNavegarAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4__4__Impl"


    // $ANTLR start "rule__Navegar__Group_4_3__0"
    // InternalWizard.g:1453:1: rule__Navegar__Group_4_3__0 : rule__Navegar__Group_4_3__0__Impl rule__Navegar__Group_4_3__1 ;
    public final void rule__Navegar__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1457:1: ( rule__Navegar__Group_4_3__0__Impl rule__Navegar__Group_4_3__1 )
            // InternalWizard.g:1458:2: rule__Navegar__Group_4_3__0__Impl rule__Navegar__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Navegar__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4_3__0"


    // $ANTLR start "rule__Navegar__Group_4_3__0__Impl"
    // InternalWizard.g:1465:1: rule__Navegar__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Navegar__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1469:1: ( ( ',' ) )
            // InternalWizard.g:1470:1: ( ',' )
            {
            // InternalWizard.g:1470:1: ( ',' )
            // InternalWizard.g:1471:2: ','
            {
             before(grammarAccess.getNavegarAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4_3__0__Impl"


    // $ANTLR start "rule__Navegar__Group_4_3__1"
    // InternalWizard.g:1480:1: rule__Navegar__Group_4_3__1 : rule__Navegar__Group_4_3__1__Impl ;
    public final void rule__Navegar__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1484:1: ( rule__Navegar__Group_4_3__1__Impl )
            // InternalWizard.g:1485:2: rule__Navegar__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4_3__1"


    // $ANTLR start "rule__Navegar__Group_4_3__1__Impl"
    // InternalWizard.g:1491:1: rule__Navegar__Group_4_3__1__Impl : ( ( rule__Navegar__CasillasAssignment_4_3_1 ) ) ;
    public final void rule__Navegar__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1495:1: ( ( ( rule__Navegar__CasillasAssignment_4_3_1 ) ) )
            // InternalWizard.g:1496:1: ( ( rule__Navegar__CasillasAssignment_4_3_1 ) )
            {
            // InternalWizard.g:1496:1: ( ( rule__Navegar__CasillasAssignment_4_3_1 ) )
            // InternalWizard.g:1497:2: ( rule__Navegar__CasillasAssignment_4_3_1 )
            {
             before(grammarAccess.getNavegarAccess().getCasillasAssignment_4_3_1()); 
            // InternalWizard.g:1498:2: ( rule__Navegar__CasillasAssignment_4_3_1 )
            // InternalWizard.g:1498:3: rule__Navegar__CasillasAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__CasillasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getCasillasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group_4_3__1__Impl"


    // $ANTLR start "rule__Mostrar__Group__0"
    // InternalWizard.g:1507:1: rule__Mostrar__Group__0 : rule__Mostrar__Group__0__Impl rule__Mostrar__Group__1 ;
    public final void rule__Mostrar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1511:1: ( rule__Mostrar__Group__0__Impl rule__Mostrar__Group__1 )
            // InternalWizard.g:1512:2: rule__Mostrar__Group__0__Impl rule__Mostrar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mostrar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mostrar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__0"


    // $ANTLR start "rule__Mostrar__Group__0__Impl"
    // InternalWizard.g:1519:1: rule__Mostrar__Group__0__Impl : ( 'Mostrar:' ) ;
    public final void rule__Mostrar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1523:1: ( ( 'Mostrar:' ) )
            // InternalWizard.g:1524:1: ( 'Mostrar:' )
            {
            // InternalWizard.g:1524:1: ( 'Mostrar:' )
            // InternalWizard.g:1525:2: 'Mostrar:'
            {
             before(grammarAccess.getMostrarAccess().getMostrarKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMostrarAccess().getMostrarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__0__Impl"


    // $ANTLR start "rule__Mostrar__Group__1"
    // InternalWizard.g:1534:1: rule__Mostrar__Group__1 : rule__Mostrar__Group__1__Impl rule__Mostrar__Group__2 ;
    public final void rule__Mostrar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1538:1: ( rule__Mostrar__Group__1__Impl rule__Mostrar__Group__2 )
            // InternalWizard.g:1539:2: rule__Mostrar__Group__1__Impl rule__Mostrar__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Mostrar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mostrar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__1"


    // $ANTLR start "rule__Mostrar__Group__1__Impl"
    // InternalWizard.g:1546:1: rule__Mostrar__Group__1__Impl : ( ( rule__Mostrar__EtiquetaAssignment_1 ) ) ;
    public final void rule__Mostrar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1550:1: ( ( ( rule__Mostrar__EtiquetaAssignment_1 ) ) )
            // InternalWizard.g:1551:1: ( ( rule__Mostrar__EtiquetaAssignment_1 ) )
            {
            // InternalWizard.g:1551:1: ( ( rule__Mostrar__EtiquetaAssignment_1 ) )
            // InternalWizard.g:1552:2: ( rule__Mostrar__EtiquetaAssignment_1 )
            {
             before(grammarAccess.getMostrarAccess().getEtiquetaAssignment_1()); 
            // InternalWizard.g:1553:2: ( rule__Mostrar__EtiquetaAssignment_1 )
            // InternalWizard.g:1553:3: rule__Mostrar__EtiquetaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mostrar__EtiquetaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMostrarAccess().getEtiquetaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__1__Impl"


    // $ANTLR start "rule__Mostrar__Group__2"
    // InternalWizard.g:1561:1: rule__Mostrar__Group__2 : rule__Mostrar__Group__2__Impl rule__Mostrar__Group__3 ;
    public final void rule__Mostrar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1565:1: ( rule__Mostrar__Group__2__Impl rule__Mostrar__Group__3 )
            // InternalWizard.g:1566:2: rule__Mostrar__Group__2__Impl rule__Mostrar__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Mostrar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mostrar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__2"


    // $ANTLR start "rule__Mostrar__Group__2__Impl"
    // InternalWizard.g:1573:1: rule__Mostrar__Group__2__Impl : ( 'diciendo' ) ;
    public final void rule__Mostrar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1577:1: ( ( 'diciendo' ) )
            // InternalWizard.g:1578:1: ( 'diciendo' )
            {
            // InternalWizard.g:1578:1: ( 'diciendo' )
            // InternalWizard.g:1579:2: 'diciendo'
            {
             before(grammarAccess.getMostrarAccess().getDiciendoKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMostrarAccess().getDiciendoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__2__Impl"


    // $ANTLR start "rule__Mostrar__Group__3"
    // InternalWizard.g:1588:1: rule__Mostrar__Group__3 : rule__Mostrar__Group__3__Impl ;
    public final void rule__Mostrar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1592:1: ( rule__Mostrar__Group__3__Impl )
            // InternalWizard.g:1593:2: rule__Mostrar__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mostrar__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__3"


    // $ANTLR start "rule__Mostrar__Group__3__Impl"
    // InternalWizard.g:1599:1: rule__Mostrar__Group__3__Impl : ( ( rule__Mostrar__MensajeAssignment_3 ) ) ;
    public final void rule__Mostrar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1603:1: ( ( ( rule__Mostrar__MensajeAssignment_3 ) ) )
            // InternalWizard.g:1604:1: ( ( rule__Mostrar__MensajeAssignment_3 ) )
            {
            // InternalWizard.g:1604:1: ( ( rule__Mostrar__MensajeAssignment_3 ) )
            // InternalWizard.g:1605:2: ( rule__Mostrar__MensajeAssignment_3 )
            {
             before(grammarAccess.getMostrarAccess().getMensajeAssignment_3()); 
            // InternalWizard.g:1606:2: ( rule__Mostrar__MensajeAssignment_3 )
            // InternalWizard.g:1606:3: rule__Mostrar__MensajeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mostrar__MensajeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMostrarAccess().getMensajeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__Group__3__Impl"


    // $ANTLR start "rule__Cerrar__Group__0"
    // InternalWizard.g:1615:1: rule__Cerrar__Group__0 : rule__Cerrar__Group__0__Impl rule__Cerrar__Group__1 ;
    public final void rule__Cerrar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1619:1: ( rule__Cerrar__Group__0__Impl rule__Cerrar__Group__1 )
            // InternalWizard.g:1620:2: rule__Cerrar__Group__0__Impl rule__Cerrar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cerrar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cerrar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cerrar__Group__0"


    // $ANTLR start "rule__Cerrar__Group__0__Impl"
    // InternalWizard.g:1627:1: rule__Cerrar__Group__0__Impl : ( 'Cerrar:' ) ;
    public final void rule__Cerrar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1631:1: ( ( 'Cerrar:' ) )
            // InternalWizard.g:1632:1: ( 'Cerrar:' )
            {
            // InternalWizard.g:1632:1: ( 'Cerrar:' )
            // InternalWizard.g:1633:2: 'Cerrar:'
            {
             before(grammarAccess.getCerrarAccess().getCerrarKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCerrarAccess().getCerrarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cerrar__Group__0__Impl"


    // $ANTLR start "rule__Cerrar__Group__1"
    // InternalWizard.g:1642:1: rule__Cerrar__Group__1 : rule__Cerrar__Group__1__Impl ;
    public final void rule__Cerrar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1646:1: ( rule__Cerrar__Group__1__Impl )
            // InternalWizard.g:1647:2: rule__Cerrar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cerrar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cerrar__Group__1"


    // $ANTLR start "rule__Cerrar__Group__1__Impl"
    // InternalWizard.g:1653:1: rule__Cerrar__Group__1__Impl : ( ( rule__Cerrar__EtiquetaAssignment_1 ) ) ;
    public final void rule__Cerrar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1657:1: ( ( ( rule__Cerrar__EtiquetaAssignment_1 ) ) )
            // InternalWizard.g:1658:1: ( ( rule__Cerrar__EtiquetaAssignment_1 ) )
            {
            // InternalWizard.g:1658:1: ( ( rule__Cerrar__EtiquetaAssignment_1 ) )
            // InternalWizard.g:1659:2: ( rule__Cerrar__EtiquetaAssignment_1 )
            {
             before(grammarAccess.getCerrarAccess().getEtiquetaAssignment_1()); 
            // InternalWizard.g:1660:2: ( rule__Cerrar__EtiquetaAssignment_1 )
            // InternalWizard.g:1660:3: rule__Cerrar__EtiquetaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cerrar__EtiquetaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCerrarAccess().getEtiquetaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cerrar__Group__1__Impl"


    // $ANTLR start "rule__Wizard__TituloAssignment_1"
    // InternalWizard.g:1669:1: rule__Wizard__TituloAssignment_1 : ( ruleEString ) ;
    public final void rule__Wizard__TituloAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1673:1: ( ( ruleEString ) )
            // InternalWizard.g:1674:2: ( ruleEString )
            {
            // InternalWizard.g:1674:2: ( ruleEString )
            // InternalWizard.g:1675:3: ruleEString
            {
             before(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getTituloEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__TituloAssignment_1"


    // $ANTLR start "rule__Wizard__PaginasAssignment_3"
    // InternalWizard.g:1684:1: rule__Wizard__PaginasAssignment_3 : ( rulePagina ) ;
    public final void rule__Wizard__PaginasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1688:1: ( ( rulePagina ) )
            // InternalWizard.g:1689:2: ( rulePagina )
            {
            // InternalWizard.g:1689:2: ( rulePagina )
            // InternalWizard.g:1690:3: rulePagina
            {
             before(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PaginasAssignment_3"


    // $ANTLR start "rule__Wizard__PaginasAssignment_4"
    // InternalWizard.g:1699:1: rule__Wizard__PaginasAssignment_4 : ( rulePagina ) ;
    public final void rule__Wizard__PaginasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1703:1: ( ( rulePagina ) )
            // InternalWizard.g:1704:2: ( rulePagina )
            {
            // InternalWizard.g:1704:2: ( rulePagina )
            // InternalWizard.g:1705:3: rulePagina
            {
             before(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePagina();

            state._fsp--;

             after(grammarAccess.getWizardAccess().getPaginasPaginaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wizard__PaginasAssignment_4"


    // $ANTLR start "rule__Pagina__InicialAssignment_1_0_0"
    // InternalWizard.g:1714:1: rule__Pagina__InicialAssignment_1_0_0 : ( ( 'inicial' ) ) ;
    public final void rule__Pagina__InicialAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1718:1: ( ( ( 'inicial' ) ) )
            // InternalWizard.g:1719:2: ( ( 'inicial' ) )
            {
            // InternalWizard.g:1719:2: ( ( 'inicial' ) )
            // InternalWizard.g:1720:3: ( 'inicial' )
            {
             before(grammarAccess.getPaginaAccess().getInicialInicialKeyword_1_0_0_0()); 
            // InternalWizard.g:1721:3: ( 'inicial' )
            // InternalWizard.g:1722:4: 'inicial'
            {
             before(grammarAccess.getPaginaAccess().getInicialInicialKeyword_1_0_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPaginaAccess().getInicialInicialKeyword_1_0_0_0()); 

            }

             after(grammarAccess.getPaginaAccess().getInicialInicialKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__InicialAssignment_1_0_0"


    // $ANTLR start "rule__Pagina__NameAssignment_1_0_1"
    // InternalWizard.g:1733:1: rule__Pagina__NameAssignment_1_0_1 : ( ruleEString ) ;
    public final void rule__Pagina__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1737:1: ( ( ruleEString ) )
            // InternalWizard.g:1738:2: ( ruleEString )
            {
            // InternalWizard.g:1738:2: ( ruleEString )
            // InternalWizard.g:1739:3: ruleEString
            {
             before(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__NameAssignment_1_0_1"


    // $ANTLR start "rule__Pagina__NameAssignment_1_1"
    // InternalWizard.g:1748:1: rule__Pagina__NameAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Pagina__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1752:1: ( ( ruleEString ) )
            // InternalWizard.g:1753:2: ( ruleEString )
            {
            // InternalWizard.g:1753:2: ( ruleEString )
            // InternalWizard.g:1754:3: ruleEString
            {
             before(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getNameEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__NameAssignment_1_1"


    // $ANTLR start "rule__Pagina__CamposAssignment_3_0_0"
    // InternalWizard.g:1763:1: rule__Pagina__CamposAssignment_3_0_0 : ( ruleCampo ) ;
    public final void rule__Pagina__CamposAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1767:1: ( ( ruleCampo ) )
            // InternalWizard.g:1768:2: ( ruleCampo )
            {
            // InternalWizard.g:1768:2: ( ruleCampo )
            // InternalWizard.g:1769:3: ruleCampo
            {
             before(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CamposAssignment_3_0_0"


    // $ANTLR start "rule__Pagina__CamposAssignment_3_0_1"
    // InternalWizard.g:1778:1: rule__Pagina__CamposAssignment_3_0_1 : ( ruleCampo ) ;
    public final void rule__Pagina__CamposAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1782:1: ( ( ruleCampo ) )
            // InternalWizard.g:1783:2: ( ruleCampo )
            {
            // InternalWizard.g:1783:2: ( ruleCampo )
            // InternalWizard.g:1784:3: ruleCampo
            {
             before(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCamposCampoParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CamposAssignment_3_0_1"


    // $ANTLR start "rule__Pagina__CasillasAssignment_3_1_0"
    // InternalWizard.g:1793:1: rule__Pagina__CasillasAssignment_3_1_0 : ( ruleCasilla ) ;
    public final void rule__Pagina__CasillasAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1797:1: ( ( ruleCasilla ) )
            // InternalWizard.g:1798:2: ( ruleCasilla )
            {
            // InternalWizard.g:1798:2: ( ruleCasilla )
            // InternalWizard.g:1799:3: ruleCasilla
            {
             before(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCasilla();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CasillasAssignment_3_1_0"


    // $ANTLR start "rule__Pagina__CasillasAssignment_3_1_1"
    // InternalWizard.g:1808:1: rule__Pagina__CasillasAssignment_3_1_1 : ( ruleCasilla ) ;
    public final void rule__Pagina__CasillasAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1812:1: ( ( ruleCasilla ) )
            // InternalWizard.g:1813:2: ( ruleCasilla )
            {
            // InternalWizard.g:1813:2: ( ruleCasilla )
            // InternalWizard.g:1814:3: ruleCasilla
            {
             before(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCasilla();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getCasillasCasillaParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__CasillasAssignment_3_1_1"


    // $ANTLR start "rule__Pagina__BotonesAssignment_3_2"
    // InternalWizard.g:1823:1: rule__Pagina__BotonesAssignment_3_2 : ( ruleBoton ) ;
    public final void rule__Pagina__BotonesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1827:1: ( ( ruleBoton ) )
            // InternalWizard.g:1828:2: ( ruleBoton )
            {
            // InternalWizard.g:1828:2: ( ruleBoton )
            // InternalWizard.g:1829:3: ruleBoton
            {
             before(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__BotonesAssignment_3_2"


    // $ANTLR start "rule__Pagina__BotonesAssignment_3_3"
    // InternalWizard.g:1838:1: rule__Pagina__BotonesAssignment_3_3 : ( ruleBoton ) ;
    public final void rule__Pagina__BotonesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1842:1: ( ( ruleBoton ) )
            // InternalWizard.g:1843:2: ( ruleBoton )
            {
            // InternalWizard.g:1843:2: ( ruleBoton )
            // InternalWizard.g:1844:3: ruleBoton
            {
             before(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoton();

            state._fsp--;

             after(grammarAccess.getPaginaAccess().getBotonesBotonParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pagina__BotonesAssignment_3_3"


    // $ANTLR start "rule__Campo__ObligatorioAssignment_1"
    // InternalWizard.g:1853:1: rule__Campo__ObligatorioAssignment_1 : ( ( 'obligatorio' ) ) ;
    public final void rule__Campo__ObligatorioAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1857:1: ( ( ( 'obligatorio' ) ) )
            // InternalWizard.g:1858:2: ( ( 'obligatorio' ) )
            {
            // InternalWizard.g:1858:2: ( ( 'obligatorio' ) )
            // InternalWizard.g:1859:3: ( 'obligatorio' )
            {
             before(grammarAccess.getCampoAccess().getObligatorioObligatorioKeyword_1_0()); 
            // InternalWizard.g:1860:3: ( 'obligatorio' )
            // InternalWizard.g:1861:4: 'obligatorio'
            {
             before(grammarAccess.getCampoAccess().getObligatorioObligatorioKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCampoAccess().getObligatorioObligatorioKeyword_1_0()); 

            }

             after(grammarAccess.getCampoAccess().getObligatorioObligatorioKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__ObligatorioAssignment_1"


    // $ANTLR start "rule__Campo__EtiquetaAssignment_3"
    // InternalWizard.g:1872:1: rule__Campo__EtiquetaAssignment_3 : ( ruleEString ) ;
    public final void rule__Campo__EtiquetaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1876:1: ( ( ruleEString ) )
            // InternalWizard.g:1877:2: ( ruleEString )
            {
            // InternalWizard.g:1877:2: ( ruleEString )
            // InternalWizard.g:1878:3: ruleEString
            {
             before(grammarAccess.getCampoAccess().getEtiquetaEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getEtiquetaEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__EtiquetaAssignment_3"


    // $ANTLR start "rule__Casilla__SeleccionadoAssignment_1"
    // InternalWizard.g:1887:1: rule__Casilla__SeleccionadoAssignment_1 : ( ( 'seleccionada' ) ) ;
    public final void rule__Casilla__SeleccionadoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1891:1: ( ( ( 'seleccionada' ) ) )
            // InternalWizard.g:1892:2: ( ( 'seleccionada' ) )
            {
            // InternalWizard.g:1892:2: ( ( 'seleccionada' ) )
            // InternalWizard.g:1893:3: ( 'seleccionada' )
            {
             before(grammarAccess.getCasillaAccess().getSeleccionadoSeleccionadaKeyword_1_0()); 
            // InternalWizard.g:1894:3: ( 'seleccionada' )
            // InternalWizard.g:1895:4: 'seleccionada'
            {
             before(grammarAccess.getCasillaAccess().getSeleccionadoSeleccionadaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCasillaAccess().getSeleccionadoSeleccionadaKeyword_1_0()); 

            }

             after(grammarAccess.getCasillaAccess().getSeleccionadoSeleccionadaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__SeleccionadoAssignment_1"


    // $ANTLR start "rule__Casilla__NameAssignment_2"
    // InternalWizard.g:1906:1: rule__Casilla__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Casilla__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1910:1: ( ( ruleEString ) )
            // InternalWizard.g:1911:2: ( ruleEString )
            {
            // InternalWizard.g:1911:2: ( ruleEString )
            // InternalWizard.g:1912:3: ruleEString
            {
             before(grammarAccess.getCasillaAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasillaAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__NameAssignment_2"


    // $ANTLR start "rule__Casilla__EtiquetaAssignment_4"
    // InternalWizard.g:1921:1: rule__Casilla__EtiquetaAssignment_4 : ( ruleEString ) ;
    public final void rule__Casilla__EtiquetaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1925:1: ( ( ruleEString ) )
            // InternalWizard.g:1926:2: ( ruleEString )
            {
            // InternalWizard.g:1926:2: ( ruleEString )
            // InternalWizard.g:1927:3: ruleEString
            {
             before(grammarAccess.getCasillaAccess().getEtiquetaEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasillaAccess().getEtiquetaEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__EtiquetaAssignment_4"


    // $ANTLR start "rule__Casilla__NuevoDestinoAssignment_5_1"
    // InternalWizard.g:1936:1: rule__Casilla__NuevoDestinoAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Casilla__NuevoDestinoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1940:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:1941:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:1941:2: ( ( ruleEString ) )
            // InternalWizard.g:1942:3: ( ruleEString )
            {
             before(grammarAccess.getCasillaAccess().getNuevoDestinoPaginaCrossReference_5_1_0()); 
            // InternalWizard.g:1943:3: ( ruleEString )
            // InternalWizard.g:1944:4: ruleEString
            {
             before(grammarAccess.getCasillaAccess().getNuevoDestinoPaginaEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCasillaAccess().getNuevoDestinoPaginaEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCasillaAccess().getNuevoDestinoPaginaCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Casilla__NuevoDestinoAssignment_5_1"


    // $ANTLR start "rule__Navegar__EtiquetaAssignment_2"
    // InternalWizard.g:1955:1: rule__Navegar__EtiquetaAssignment_2 : ( ruleEString ) ;
    public final void rule__Navegar__EtiquetaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1959:1: ( ( ruleEString ) )
            // InternalWizard.g:1960:2: ( ruleEString )
            {
            // InternalWizard.g:1960:2: ( ruleEString )
            // InternalWizard.g:1961:3: ruleEString
            {
             before(grammarAccess.getNavegarAccess().getEtiquetaEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNavegarAccess().getEtiquetaEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__EtiquetaAssignment_2"


    // $ANTLR start "rule__Navegar__DestinoAssignment_3"
    // InternalWizard.g:1970:1: rule__Navegar__DestinoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Navegar__DestinoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1974:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:1975:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:1975:2: ( ( ruleEString ) )
            // InternalWizard.g:1976:3: ( ruleEString )
            {
             before(grammarAccess.getNavegarAccess().getDestinoPaginaCrossReference_3_0()); 
            // InternalWizard.g:1977:3: ( ruleEString )
            // InternalWizard.g:1978:4: ruleEString
            {
             before(grammarAccess.getNavegarAccess().getDestinoPaginaEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNavegarAccess().getDestinoPaginaEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNavegarAccess().getDestinoPaginaCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__DestinoAssignment_3"


    // $ANTLR start "rule__Navegar__CasillasAssignment_4_2"
    // InternalWizard.g:1989:1: rule__Navegar__CasillasAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Navegar__CasillasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:1993:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:1994:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:1994:2: ( ( ruleEString ) )
            // InternalWizard.g:1995:3: ( ruleEString )
            {
             before(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_2_0()); 
            // InternalWizard.g:1996:3: ( ruleEString )
            // InternalWizard.g:1997:4: ruleEString
            {
             before(grammarAccess.getNavegarAccess().getCasillasCasillaEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNavegarAccess().getCasillasCasillaEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__CasillasAssignment_4_2"


    // $ANTLR start "rule__Navegar__CasillasAssignment_4_3_1"
    // InternalWizard.g:2008:1: rule__Navegar__CasillasAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Navegar__CasillasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2012:1: ( ( ( ruleEString ) ) )
            // InternalWizard.g:2013:2: ( ( ruleEString ) )
            {
            // InternalWizard.g:2013:2: ( ( ruleEString ) )
            // InternalWizard.g:2014:3: ( ruleEString )
            {
             before(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_3_1_0()); 
            // InternalWizard.g:2015:3: ( ruleEString )
            // InternalWizard.g:2016:4: ruleEString
            {
             before(grammarAccess.getNavegarAccess().getCasillasCasillaEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNavegarAccess().getCasillasCasillaEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getNavegarAccess().getCasillasCasillaCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__CasillasAssignment_4_3_1"


    // $ANTLR start "rule__Mostrar__EtiquetaAssignment_1"
    // InternalWizard.g:2027:1: rule__Mostrar__EtiquetaAssignment_1 : ( ruleEString ) ;
    public final void rule__Mostrar__EtiquetaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2031:1: ( ( ruleEString ) )
            // InternalWizard.g:2032:2: ( ruleEString )
            {
            // InternalWizard.g:2032:2: ( ruleEString )
            // InternalWizard.g:2033:3: ruleEString
            {
             before(grammarAccess.getMostrarAccess().getEtiquetaEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMostrarAccess().getEtiquetaEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__EtiquetaAssignment_1"


    // $ANTLR start "rule__Mostrar__MensajeAssignment_3"
    // InternalWizard.g:2042:1: rule__Mostrar__MensajeAssignment_3 : ( ruleEString ) ;
    public final void rule__Mostrar__MensajeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2046:1: ( ( ruleEString ) )
            // InternalWizard.g:2047:2: ( ruleEString )
            {
            // InternalWizard.g:2047:2: ( ruleEString )
            // InternalWizard.g:2048:3: ruleEString
            {
             before(grammarAccess.getMostrarAccess().getMensajeEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMostrarAccess().getMensajeEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mostrar__MensajeAssignment_3"


    // $ANTLR start "rule__Cerrar__EtiquetaAssignment_1"
    // InternalWizard.g:2057:1: rule__Cerrar__EtiquetaAssignment_1 : ( ruleEString ) ;
    public final void rule__Cerrar__EtiquetaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWizard.g:2061:1: ( ( ruleEString ) )
            // InternalWizard.g:2062:2: ( ruleEString )
            {
            // InternalWizard.g:2062:2: ( ruleEString )
            // InternalWizard.g:2063:3: ruleEString
            {
             before(grammarAccess.getCerrarAccess().getEtiquetaEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCerrarAccess().getEtiquetaEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cerrar__EtiquetaAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000142C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000142C002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});

}