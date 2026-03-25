package com.okinc.business.defi.wallet.detail.binders.accountDetail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C16714epD;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefiWalletAccountDetailLineBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C16714epD> {
    public static final DefiWalletAccountDetailLineBinder$1 INSTANCE = new DefiWalletAccountDetailLineBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletAccountDetailLineBinder$1() {
        super(3, C16714epD.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemDefiEditWalletLineBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C16714epD invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C16714epD invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C16714epD.AEQbTJ(layoutInflater, viewGroup, z);
    }
}
