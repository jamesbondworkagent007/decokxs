package com.okinc.buysell.ui.bsc.fragment.sell;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.lGL;
import o.yHS;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class SellFragmentV3$updateCryptoFiatWidget$4 extends AdaptedFunctionReference implements yHS<String, Boolean, String, String, Continuation<? super lGL.TaskDescription>, Object> {
    public static final SellFragmentV3$updateCryptoFiatWidget$4 INSTANCE = new SellFragmentV3$updateCryptoFiatWidget$4();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SellFragmentV3$updateCryptoFiatWidget$4() {
        super(5, lGL.TaskDescription.class, "<init>", "<init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(String str, Boolean bool, String str2, String str3, Continuation<? super lGL.TaskDescription> continuation) {
        return invoke(str, bool.booleanValue(), str2, str3, continuation);
    }

    public final Object invoke(String str, boolean z, String str2, String str3, Continuation<? super lGL.TaskDescription> continuation) {
        return lGL.KWHzl(str, z, str2, str3, continuation);
    }
}
