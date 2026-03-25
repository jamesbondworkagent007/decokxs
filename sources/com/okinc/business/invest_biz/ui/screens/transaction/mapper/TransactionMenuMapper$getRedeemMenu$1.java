package com.okinc.business.invest_biz.ui.screens.transaction.mapper;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26695jhF;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TransactionMenuMapper$getRedeemMenu$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26695jhF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionMenuMapper$getRedeemMenu$1(C26695jhF c26695jhF, Continuation<? super TransactionMenuMapper$getRedeemMenu$1> continuation) {
        super(continuation);
        this.this$0 = c26695jhF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((InitialInfoModel.RedeemInitialInfo) null, (TransactionConfig) null, (Continuation<? super InterfaceC26764jiV>) this);
    }
}
