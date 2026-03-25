package com.okinc.business.defi.wallet.imported;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class WalletAddressSelectUtilsKt$splitAddress$1 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    public static final WalletAddressSelectUtilsKt$splitAddress$1 INSTANCE = new WalletAddressSelectUtilsKt$splitAddress$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAddressSelectUtilsKt$splitAddress$1() {
        super(1, StringsKt.class, "isNotBlank", "isNotBlank(Ljava/lang/CharSequence;)Z", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Boolean.valueOf(!StringsKt__StringsKt.fARcdN((CharSequence) str));
    }
}
