package com.okinc.business.dexui.api.serviceimpl;

import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetOrderParam;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C23285hvO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeApiImpl$smallAssetBatchCreateOrder$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C23285hvO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexTradeApiImpl$smallAssetBatchCreateOrder$1(C23285hvO c23285hvO, Continuation<? super DexTradeApiImpl$smallAssetBatchCreateOrder$1> continuation) {
        super(continuation);
        this.this$0 = c23285hvO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((SmallAssetOrderParam) null, this);
    }
}
