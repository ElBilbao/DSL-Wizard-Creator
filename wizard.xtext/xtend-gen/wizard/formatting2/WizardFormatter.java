/**
 * generated by Xtext 2.21.0
 */
package wizard.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import wizard.Boton;
import wizard.Campo;
import wizard.Casilla;
import wizard.Pagina;
import wizard.Wizard;
import wizard.services.WizardGrammarAccess;

@SuppressWarnings("all")
public class WizardFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private WizardGrammarAccess _wizardGrammarAccess;
  
  protected void _format(final Wizard wizard, @Extension final IFormattableDocument document) {
    EList<Pagina> _paginas = wizard.getPaginas();
    for (final Pagina pagina : _paginas) {
      document.<Pagina>format(pagina);
    }
  }
  
  protected void _format(final Pagina pagina, @Extension final IFormattableDocument document) {
    EList<Campo> _campos = pagina.getCampos();
    for (final Campo campo : _campos) {
      document.<Campo>format(campo);
    }
    EList<Casilla> _casillas = pagina.getCasillas();
    for (final Casilla casilla : _casillas) {
      document.<Casilla>format(casilla);
    }
    EList<Boton> _botones = pagina.getBotones();
    for (final Boton boton : _botones) {
      document.<Boton>format(boton);
    }
  }
  
  public void format(final Object pagina, final IFormattableDocument document) {
    if (pagina instanceof XtextResource) {
      _format((XtextResource)pagina, document);
      return;
    } else if (pagina instanceof Pagina) {
      _format((Pagina)pagina, document);
      return;
    } else if (pagina instanceof Wizard) {
      _format((Wizard)pagina, document);
      return;
    } else if (pagina instanceof EObject) {
      _format((EObject)pagina, document);
      return;
    } else if (pagina == null) {
      _format((Void)null, document);
      return;
    } else if (pagina != null) {
      _format(pagina, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pagina, document).toString());
    }
  }
}
