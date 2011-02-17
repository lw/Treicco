package treicco.client.ui;

import java.util.Date;

import treicco.client.api.DirectoryPresenter;
import treicco.client.api.DirectoryView;
import treicco.client.ui.widgets.TextBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DirectoryCreateImpl extends Composite implements DirectoryView {

	interface DirectoryCreateImplUiBinder extends UiBinder<Widget, DirectoryCreateImpl> {
	}

	private static DirectoryCreateImplUiBinder uiBinder = GWT.create(DirectoryCreateImplUiBinder.class);

	DirectoryPresenter presenter;

	@UiField
	TextBox codeName;

	public DirectoryCreateImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(DirectoryPresenter presenter) {
		this.presenter = presenter;
	}

	public void show(AcceptsOneWidget target) {
		target.setWidget(this);

		codeName.setValue("");
	}

	public LeafValueEditor<String> codeName() {
		return codeName.asEditor();
	}

	public LeafValueEditor<String> shortName() {
		return codeName.asEditor();
	}

	public LeafValueEditor<String> fullName() {
		return codeName.asEditor();
	}

	public LeafValueEditor<Date> startDate() {
		return null;
	}

	public LeafValueEditor<Date> endDate() {
		return null;
	}

	public LeafValueEditor<String> location() {
		return null;
	}

	public LeafValueEditor<String> website() {
		return null;
	}

	@UiHandler("commit_top")
	public void commitChangesTop(ClickEvent e) {
		presenter.commit();
	}

	@UiHandler("commit_bottom")
	public void commitChangesBottom(ClickEvent e) {
		presenter.commit();
	}

	@UiHandler("cancel_top")
	public void cancelChangesTop(ClickEvent e) {
		presenter.toDisplay();
	}

	@UiHandler("cancel_bottom")
	public void cancelChangesBottom(ClickEvent e) {
		presenter.toDisplay();
	}
}
