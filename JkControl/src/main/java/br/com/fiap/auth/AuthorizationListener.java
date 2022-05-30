/*package br.com.fiap.auth;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.fiap.model.User;

public class AuthorizationListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent arg0) {
		String page = FacesContext.getCurrentInstance().getViewRoot().getViewId();
		System.out.println("ACESSANDO A PÁGINA " + page);

		if (page.equals("/login.xhtml") || page.equals("/register.xhtml")) {
			return;
		}

		// early return

		// Se o usuário não está logado, vai para login
		User user = (User) FacesContext
							.getCurrentInstance()
							.getExternalContext()
							.getSessionMap()
							.get("user");

		if (user != null)
			return;

		FacesContext
			.getCurrentInstance()
			.getApplication()
			.getNavigationHandler()
			.handleNavigation(FacesContext.getCurrentInstance(), null, "login.xhtml");
		;

		// Caso contrário, deixa pra lá
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
*/