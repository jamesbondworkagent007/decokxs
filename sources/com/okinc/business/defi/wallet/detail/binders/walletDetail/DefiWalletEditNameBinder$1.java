package com.okinc.business.defi.wallet.detail.binders.walletDetail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC16717epG;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class DefiWalletEditNameBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, AbstractC16717epG> {
    public static final DefiWalletEditNameBinder$1 INSTANCE = new DefiWalletEditNameBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletEditNameBinder$1() {
        super(3, AbstractC16717epG.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemDefiEditWalletNameBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ AbstractC16717epG invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final AbstractC16717epG invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return AbstractC16717epG.OLrzqt(layoutInflater, viewGroup, z);
    }
}
