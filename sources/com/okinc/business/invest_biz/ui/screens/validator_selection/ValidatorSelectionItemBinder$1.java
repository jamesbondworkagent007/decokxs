package com.okinc.business.invest_biz.ui.screens.validator_selection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC23846iLm;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class ValidatorSelectionItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, AbstractC23846iLm> {
    public static final ValidatorSelectionItemBinder$1 INSTANCE = new ValidatorSelectionItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValidatorSelectionItemBinder$1() {
        super(3, AbstractC23846iLm.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/RedeemValidatorItemBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ AbstractC23846iLm invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final AbstractC23846iLm invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return AbstractC23846iLm.KWHzl(layoutInflater, viewGroup, z);
    }
}
