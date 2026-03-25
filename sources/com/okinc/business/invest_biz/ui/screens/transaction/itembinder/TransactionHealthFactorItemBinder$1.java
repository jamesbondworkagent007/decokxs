package com.okinc.business.invest_biz.ui.screens.transaction.itembinder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23838iLe;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class TransactionHealthFactorItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C23838iLe> {
    public static final TransactionHealthFactorItemBinder$1 INSTANCE = new TransactionHealthFactorItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionHealthFactorItemBinder$1() {
        super(3, C23838iLe.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/LayoutTransactionHealthfactorViewBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C23838iLe invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C23838iLe invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C23838iLe.KWHzl(layoutInflater, viewGroup, z);
    }
}
