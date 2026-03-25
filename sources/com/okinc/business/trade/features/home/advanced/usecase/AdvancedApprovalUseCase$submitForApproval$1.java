package com.okinc.business.trade.features.home.advanced.usecase;

import android.os.Bundle;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import o.kQF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedApprovalUseCase$submitForApproval$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kQF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedApprovalUseCase$submitForApproval$1(kQF kqf, Continuation<? super AdvancedApprovalUseCase$submitForApproval$1> continuation) {
        super(continuation);
        this.this$0 = kqf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((AbstractActivityC33041mov) null, (AdvancedApproveState) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (Function1<? super Bundle, Unit>) null, this);
    }
}
