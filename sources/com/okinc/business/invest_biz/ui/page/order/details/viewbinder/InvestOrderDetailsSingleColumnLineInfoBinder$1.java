package com.okinc.business.invest_biz.ui.page.order.details.viewbinder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.iIU;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class InvestOrderDetailsSingleColumnLineInfoBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, iIU> {
    public static final InvestOrderDetailsSingleColumnLineInfoBinder$1 INSTANCE = new InvestOrderDetailsSingleColumnLineInfoBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderDetailsSingleColumnLineInfoBinder$1() {
        super(3, iIU.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/ItemInvestOrderDetailsSingleColumnInfoBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ iIU invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final iIU invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return iIU.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
