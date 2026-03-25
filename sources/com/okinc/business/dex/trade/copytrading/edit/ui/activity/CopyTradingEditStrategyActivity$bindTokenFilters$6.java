package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C23428hxz;
import o.C56391yDq;
import o.C56442yFn;
import o.gTC;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindTokenFilters$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindTokenFilters;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindTokenFilters$6(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindTokenFilters$6> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindTokenFilters = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindTokenFilters$6(this.this$0, this.$this_bindTokenFilters, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindTokenFilters$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindTokenFilters$6$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ CopyTradingEditStrategyActivity EZpvd;
        public final /* synthetic */ C23428hxz OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz) {
            this.EZpvd = copyTradingEditStrategyActivity;
            this.OLrzqt = c23428hxz;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Result<gTC> result, Continuation<? super Unit> continuation) throws Throwable {
            CopyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1 copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1;
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity;
            C23428hxz c23428hxz;
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity2;
            C23428hxz c23428hxz2;
            TokenFilter tokenFilter;
            if (continuation instanceof CopyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1) {
                copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1 = (CopyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1) continuation;
                int i = copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1 = new CopyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1(this, continuation);
                }
            }
            Object obj = copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (result == null) {
                    return Unit.INSTANCE;
                }
                Object objM7386unboximpl = result.m7386unboximpl();
                copyTradingEditStrategyActivity = this.EZpvd;
                c23428hxz = this.OLrzqt;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    CopyTradeDetail copyTradeDetailEZpvd = ((gTC) objM7386unboximpl).EZpvd();
                    if (copyTradeDetailEZpvd == null || (tokenFilter = copyTradeDetailEZpvd.getTokenFilter()) == null) {
                        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt = copyTradingEditStrategyActivity.gEmmrt();
                        copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.L$0 = objM7386unboximpl;
                        copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.L$1 = copyTradingEditStrategyActivity;
                        copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.L$2 = c23428hxz;
                        copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.label = 1;
                        Object objAEQbTJ = copyTradingEditStrategyViewModelGEmmrt.AEQbTJ(copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        copyTradingEditStrategyActivity2 = copyTradingEditStrategyActivity;
                        obj = objAEQbTJ;
                        c23428hxz2 = c23428hxz;
                    }
                    if (tokenFilter != null) {
                        c23428hxz.DbNXlk.copydefault(tokenFilter, copyTradingEditStrategyActivity.gEmmrt().EZpvd());
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c23428hxz2 = (C23428hxz) copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.L$2;
            copyTradingEditStrategyActivity2 = (CopyTradingEditStrategyActivity) copyTradingEditStrategyActivity$bindTokenFilters$6$1$emit$1.L$1;
            C56391yDq.AEQbTJ(obj);
            tokenFilter = (TokenFilter) obj;
            c23428hxz = c23428hxz2;
            copyTradingEditStrategyActivity = copyTradingEditStrategyActivity2;
            if (tokenFilter != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Result<gTC>> stateFlowFJNWhG = this.this$0.gEmmrt().fJNWhG();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$this_bindTokenFilters);
            this.label = 1;
            if (stateFlowFJNWhG.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
