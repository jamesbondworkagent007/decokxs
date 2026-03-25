package com.okinc.business.dexui.main.limitorder.orderdetail.itemviewbinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C21476hAu;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class LimitNetworkOrderItemViewBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C21476hAu> {
    public static final LimitNetworkOrderItemViewBinder$1 INSTANCE = new LimitNetworkOrderItemViewBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitNetworkOrderItemViewBinder$1() {
        super(3, C21476hAu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexFgItemOrderNetworkBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C21476hAu invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C21476hAu invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C21476hAu.KWHzl(layoutInflater, viewGroup, z);
    }
}
