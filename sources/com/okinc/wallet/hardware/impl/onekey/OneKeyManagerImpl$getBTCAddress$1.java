package com.okinc.wallet.hardware.impl.onekey;

import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C57138yck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyManagerImpl$getBTCAddress$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C57138yck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyManagerImpl$getBTCAddress$1(C57138yck c57138yck, Continuation<? super OneKeyManagerImpl$getBTCAddress$1> continuation) {
        super(continuation);
        this.this$0 = c57138yck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((String) null, (String) null, (BTCGetAddressParams) null, (CommonParams) null, this);
    }
}
