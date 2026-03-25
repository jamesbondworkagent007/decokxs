package com.okinc.business.invest_biz.ui.widget.recyclerview.binder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.iHZ;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestDividerBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, iHZ> {
    public static final InvestDividerBinder$1 INSTANCE = new InvestDividerBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestDividerBinder$1() {
        super(3, iHZ.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/invest_biz/databinding/InvestItemDividerBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ iHZ invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final iHZ invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return iHZ.KWHzl(layoutInflater, viewGroup, z);
    }
}
