package com.okinc.business.defi.wallet.tx.history;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C17133ewz;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class CustomCoinDetailFragment$initRecycleview$1$2$5 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C17133ewz> {
    public static final CustomCoinDetailFragment$initRecycleview$1$2$5 INSTANCE = new CustomCoinDetailFragment$initRecycleview$1$2$5();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomCoinDetailFragment$initRecycleview$1$2$5() {
        super(3, C17133ewz.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ViewDefiEmptyLayoutBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C17133ewz invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C17133ewz invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C17133ewz.EZpvd(layoutInflater, viewGroup, z);
    }
}
