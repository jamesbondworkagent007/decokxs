package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.kline.features.contractinfo.ui.model.ContractInfoItemType;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$loadUnderlyingIndex$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<IndexTickersData> $data;
    final /* synthetic */ BizInstrument $instrument;
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$loadUnderlyingIndex$1$result$1(List<IndexTickersData> list, BizInstrument bizInstrument, ContractInfoViewModel contractInfoViewModel, Continuation<? super ContractInfoViewModel$loadUnderlyingIndex$1$result$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.$instrument = bizInstrument;
        this.this$0 = contractInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractInfoViewModel$loadUnderlyingIndex$1$result$1(this.$data, this.$instrument, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$loadUnderlyingIndex$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String underlying;
        String strReplace$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<IndexTickersData> list = this.$data;
            IndexTickersData indexTickersData = list != null ? list.get(0) : null;
            if (indexTickersData != null) {
                BizInstrument bizInstrument = this.$instrument;
                ContractInfoViewModel contractInfoViewModel = this.this$0;
                String str = "";
                if (bizInstrument != null && (underlying = bizInstrument.getUnderlying()) != null && (strReplace$default = C59449zhJ.replace$default(underlying, "-", "", false, 4, (Object) null)) != null) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String upperCase = strReplace$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (upperCase != null) {
                        str = upperCase;
                    }
                }
                String str2 = str + " " + indexTickersData.getIdxPx();
                ContractInfoItemType contractInfoItemType = ContractInfoItemType.UNDERLYING_INDEX;
                this.label = 1;
                if (contractInfoViewModel.AEQbTJ(contractInfoItemType, str2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
