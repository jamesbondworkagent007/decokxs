package com.okinc.business.dexui.main.swap.route;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.hBA;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SmartRoutingListFragment$initView$1$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, hBA> {
    public static final SmartRoutingListFragment$initView$1$2 INSTANCE = new SmartRoutingListFragment$initView$1$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartRoutingListFragment$initView$1$2() {
        super(3, hBA.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/dexui/databinding/DexFgSmartRoutingDescListItemViewBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ hBA invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final hBA invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return hBA.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
