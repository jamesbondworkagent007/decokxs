package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.vNG;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inputAmount;
    final /* synthetic */ SmartArbWithdrawType $type;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmartArbWithdrawProfitsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, String str, SmartArbWithdrawType smartArbWithdrawType, Continuation<? super SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbWithdrawProfitsViewModel;
        this.$inputAmount = str;
        this.$type = smartArbWithdrawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1 smartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1 = new SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1(this.this$0, this.$inputAmount, this.$type, continuation);
        smartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1.L$0 = obj;
        return smartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel;
        Unit unit;
        SmartArbWithdrawType smartArbWithdrawType;
        Object value;
        Map mapIsConnected;
        Object value2;
        Map mapIsConnected2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            smartArbWithdrawProfitsViewModel = this.this$0;
            String str = this.$inputAmount;
            SmartArbWithdrawType smartArbWithdrawType2 = this.$type;
            Result.Application application2 = Result.Companion;
            TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel.hDKMBd();
            unit = null;
            if (tacticsDataHDKMBd != null) {
                if (str.length() == 0) {
                    MutableStateFlow mutableStateFlow = smartArbWithdrawProfitsViewModel.AEQbTJ;
                    do {
                        value = mutableStateFlow.getValue();
                        mapIsConnected = C56424yEw.isConnected((Map) value);
                        mapIsConnected.put(smartArbWithdrawType2, null);
                    } while (!mutableStateFlow.compareAndSet(value, C56424yEw.values(mapIsConnected)));
                    unit = Unit.INSTANCE;
                } else {
                    vNG vng = smartArbWithdrawProfitsViewModel.gEmmrt;
                    vNG.Application application3 = new vNG.Application(tacticsDataHDKMBd.getAlgoId(), smartArbWithdrawProfitsViewModel.AhwBna(), str);
                    this.L$0 = smartArbWithdrawProfitsViewModel;
                    this.L$1 = smartArbWithdrawType2;
                    this.label = 1;
                    obj = vng.KWHzl(application3, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    smartArbWithdrawType = smartArbWithdrawType2;
                }
            }
            Result.m7377constructorimpl(unit);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        smartArbWithdrawType = (SmartArbWithdrawType) this.L$1;
        smartArbWithdrawProfitsViewModel = (SmartArbWithdrawProfitsViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        vNG.TaskDescription taskDescription = (vNG.TaskDescription) obj;
        MutableStateFlow mutableStateFlow2 = smartArbWithdrawProfitsViewModel.AEQbTJ;
        do {
            value2 = mutableStateFlow2.getValue();
            mapIsConnected2 = C56424yEw.isConnected((Map) value2);
            mapIsConnected2.put(smartArbWithdrawType, taskDescription.EZpvd());
        } while (!mutableStateFlow2.compareAndSet(value2, C56424yEw.values(mapIsConnected2)));
        unit = Unit.INSTANCE;
        Result.m7377constructorimpl(unit);
        return Unit.INSTANCE;
    }
}
