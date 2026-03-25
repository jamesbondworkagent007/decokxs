package com.okinc.business.defi.dapp.webview;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C13241dEa;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DappWebView$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappWebView$1(Object obj) {
        super(0, obj, C13241dEa.class, "shouledcollectWalletDailogShow", "shouledcollectWalletDailogShow()Z", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((C13241dEa) this.receiver).accept());
    }
}
