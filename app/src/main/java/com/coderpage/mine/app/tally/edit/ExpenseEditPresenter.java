package com.coderpage.mine.app.tally.edit;

import com.coderpage.framework.PresenterImpl;

/**
 * @author abner-l. 2017-04-16
 */

class ExpenseEditPresenter extends PresenterImpl {

    ExpenseEditPresenter(ExpenseEditModel model,
                         ExpenseEditActivity view,
                         ExpenseEditModel.EditUserActionEnum[] validUserActions,
                         ExpenseEditModel.EditQueryEnum[] initialQueries) {
        super(model, view, validUserActions, initialQueries);
    }
}
