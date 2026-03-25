package com.okinc.business.invest_biz.ui.page.order.details.viewbinder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.iIO;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class InvestOrderDetailsInvestmentBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, iIO> {
    public static final InvestOrderDetailsInvestmentBinder$1 INSTANCE = new InvestOrderDetailsInvestmentBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderDetailsInvestmentBinder$1() {
        super(3, iIO.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/ItemInvestOrderDetailsInvestmentBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ iIO invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final iIO invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return iIO.EZpvd(layoutInflater, viewGroup, z);
    }
}
