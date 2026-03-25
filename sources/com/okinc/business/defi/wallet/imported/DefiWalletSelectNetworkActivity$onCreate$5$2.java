package com.okinc.business.defi.wallet.imported;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C18380fhM;
import o.InterfaceC18392fhY;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class DefiWalletSelectNetworkActivity$onCreate$5$2 extends FunctionReferenceImpl implements Function1<InterfaceC18392fhY, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletSelectNetworkActivity$onCreate$5$2(Object obj) {
        super(1, obj, C18380fhM.class, "selectItem", "selectItem(Lcom/okinc/business/defi/wallet/imported/WalletNetworkState;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18392fhY interfaceC18392fhY) {
        invoke2(interfaceC18392fhY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC18392fhY interfaceC18392fhY) {
        Intrinsics.checkNotNullParameter(interfaceC18392fhY, "");
        ((C18380fhM) this.receiver).copydefault(interfaceC18392fhY);
    }
}
