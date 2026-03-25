package com.okinc.business.defi.wallet.home.walletconnect;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C16916esu;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class WalletConnectConnectionMgmtActivity$initView$1$1$1$2 extends FunctionReferenceImpl implements yHO<LayoutInflater, ViewGroup, Boolean, C16916esu> {
    public static final WalletConnectConnectionMgmtActivity$initView$1$1$1$2 INSTANCE = new WalletConnectConnectionMgmtActivity$initView$1$1$1$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletConnectConnectionMgmtActivity$initView$1$1$1$2() {
        super(3, C16916esu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/okinc/business/defi/wallet/databinding/ItemWalletConnectDappBinding;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHO
    public /* synthetic */ C16916esu invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final C16916esu invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return C16916esu.copydefault(layoutInflater, viewGroup, z);
    }
}
