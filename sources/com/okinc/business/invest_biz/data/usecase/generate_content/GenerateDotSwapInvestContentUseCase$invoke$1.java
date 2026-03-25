package com.okinc.business.invest_biz.data.usecase.generate_content;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.iGI;
import o.iXB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class GenerateDotSwapInvestContentUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ iGI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDotSwapInvestContentUseCase$invoke$1(iGI igi, Continuation<? super GenerateDotSwapInvestContentUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = igi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault((TransactionConfig) null, (InitialInfoModel) null, (iXB) null, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
