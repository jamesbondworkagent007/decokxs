package com.okinc.business.market.features.scanner.surge.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29289kqo;
import o.C29464kuD;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SurgeTabViewModel$onSignalChainSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ SmartMoneyConfig $existingConfig;
    int label;
    final /* synthetic */ SurgeTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeTabViewModel$onSignalChainSelected$1(SurgeTabViewModel surgeTabViewModel, String str, SmartMoneyConfig smartMoneyConfig, Continuation<? super SurgeTabViewModel$onSignalChainSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = surgeTabViewModel;
        this.$chainId = str;
        this.$existingConfig = smartMoneyConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SurgeTabViewModel$onSignalChainSelected$1(this.this$0, this.$chainId, this.$existingConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SurgeTabViewModel$onSignalChainSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29464kuD c29464kuD = this.this$0.AkhnZx;
            String str = this.$chainId;
            this.label = 1;
            if (c29464kuD.KWHzl(str, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow = this.this$0.copydefault;
        SmartMoneyConfig smartMoneyConfig = this.$existingConfig;
        String str2 = this.$chainId;
        while (true) {
            Object value = mutableStateFlow.getValue();
            SmartMoneyConfig smartMoneyConfig2 = smartMoneyConfig;
            String str3 = str2;
            SmartMoneyConfig smartMoneyConfig3 = smartMoneyConfig;
            if (mutableStateFlow.compareAndSet(value, smartMoneyConfig2.KWHzl((TypedValues.PositionType.TYPE_POSITION_TYPE & 1) != 0 ? smartMoneyConfig2.KWHzl : str2, (TypedValues.PositionType.TYPE_POSITION_TYPE & 2) != 0 ? smartMoneyConfig2.AEQbTJ : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 4) != 0 ? smartMoneyConfig2.AYXKKw : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 8) != 0 ? smartMoneyConfig2.OLrzqt : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 16) != 0 ? smartMoneyConfig2.valueOf : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 32) != 0 ? smartMoneyConfig2.djBIcL : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 64) != 0 ? smartMoneyConfig2.EZpvd : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 128) != 0 ? smartMoneyConfig2.copydefault : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 256) != 0 ? smartMoneyConfig2.AhwBna : null))) {
                break;
            }
            str2 = str3;
            smartMoneyConfig = smartMoneyConfig3;
        }
        C29289kqo c29289kqo = this.this$0.gEmmrt;
        String str4 = this.$chainId;
        this.label = 2;
        if (c29289kqo.AEQbTJ(str4, false, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
