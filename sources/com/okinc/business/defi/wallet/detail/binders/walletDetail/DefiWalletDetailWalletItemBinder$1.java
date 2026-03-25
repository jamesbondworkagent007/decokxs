package com.okinc.business.defi.wallet.detail.binders.walletDetail;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C16761epy;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class DefiWalletDetailWalletItemBinder$1 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C16761epy> {
    public static final DefiWalletDetailWalletItemBinder$1 INSTANCE = new DefiWalletDetailWalletItemBinder$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletDetailWalletItemBinder$1() {
        super(3, C16761epy.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemDefiDetailWalletBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C16761epy invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C16761epy invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C16761epy.EZpvd(layoutInflater, viewGroup, z);
    }
}
