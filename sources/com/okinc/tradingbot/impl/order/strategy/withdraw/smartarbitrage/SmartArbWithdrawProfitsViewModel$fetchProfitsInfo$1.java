package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.uLU;
import o.vNI;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmartArbWithdrawProfitsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, Continuation<? super SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbWithdrawProfitsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1 smartArbWithdrawProfitsViewModel$fetchProfitsInfo$1 = new SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1(this.this$0, continuation);
        smartArbWithdrawProfitsViewModel$fetchProfitsInfo$1.L$0 = obj;
        return smartArbWithdrawProfitsViewModel$fetchProfitsInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:13:0x0029, B:49:0x00e1, B:51:0x00e8, B:16:0x0036, B:46:0x00cc, B:19:0x0041, B:41:0x00a9, B:43:0x00b1, B:22:0x004d, B:31:0x007f, B:33:0x008f, B:38:0x0099, B:25:0x005c, B:27:0x0064), top: B:62:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel;
        TacticsData tacticsData;
        Unit unit;
        vNI.ActionBar actionBar;
        MutableStateFlow mutableStateFlow;
        TickersData tickersDataCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel2 = this.this$0;
            Result.Application application2 = Result.Companion;
            TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel2.hDKMBd();
            if (tacticsDataHDKMBd != null) {
                MutableStateFlow mutableStateFlow2 = smartArbWithdrawProfitsViewModel2.copydefault;
                uLU uluLoading$default = uLU.StateListAnimator.loading$default(uLU.Companion, false, 1, null);
                this.L$0 = smartArbWithdrawProfitsViewModel2;
                this.L$1 = tacticsDataHDKMBd;
                this.label = 1;
                if (mutableStateFlow2.emit(uluLoading$default, this) == objCopydefault) {
                    return objCopydefault;
                }
                smartArbWithdrawProfitsViewModel = smartArbWithdrawProfitsViewModel2;
                tacticsData = tacticsDataHDKMBd;
            }
            unit = null;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel3 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                smartArbWithdrawProfitsViewModel = (SmartArbWithdrawProfitsViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                actionBar = (vNI.ActionBar) obj;
                if (actionBar.EZpvd() != null) {
                    MutableStateFlow mutableStateFlow3 = smartArbWithdrawProfitsViewModel.copydefault;
                    uLU uluAEQbTJ = uLU.Companion.AEQbTJ(actionBar.EZpvd());
                    this.L$0 = smartArbWithdrawProfitsViewModel;
                    this.L$1 = actionBar;
                    this.label = 3;
                    if (mutableStateFlow3.emit(uluAEQbTJ, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableStateFlow = smartArbWithdrawProfitsViewModel.djBIcL;
                    tickersDataCopydefault = actionBar.copydefault();
                    this.L$0 = smartArbWithdrawProfitsViewModel;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableStateFlow.emit(tickersDataCopydefault, this) == objCopydefault) {
                    }
                    smartArbWithdrawProfitsViewModel.isConnected();
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel32 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            if (i == 3) {
                vNI.ActionBar actionBar2 = (vNI.ActionBar) this.L$1;
                SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel4 = (SmartArbWithdrawProfitsViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                actionBar = actionBar2;
                smartArbWithdrawProfitsViewModel = smartArbWithdrawProfitsViewModel4;
                mutableStateFlow = smartArbWithdrawProfitsViewModel.djBIcL;
                tickersDataCopydefault = actionBar.copydefault();
                this.L$0 = smartArbWithdrawProfitsViewModel;
                this.L$1 = null;
                this.label = 4;
                if (mutableStateFlow.emit(tickersDataCopydefault, this) == objCopydefault) {
                    return objCopydefault;
                }
                smartArbWithdrawProfitsViewModel.isConnected();
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            smartArbWithdrawProfitsViewModel = (SmartArbWithdrawProfitsViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            smartArbWithdrawProfitsViewModel.isConnected();
            unit = Unit.INSTANCE;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel32222 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow4 = smartArbWithdrawProfitsViewModel32222.copydefault;
                uLU uluKWHzl = uLU.Companion.KWHzl(thM7380exceptionOrNullimpl);
                this.L$0 = objM7377constructorimpl;
                this.L$1 = null;
                this.label = 5;
                if (mutableStateFlow4.emit(uluKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        TacticsData tacticsData2 = (TacticsData) this.L$1;
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel5 = (SmartArbWithdrawProfitsViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        tacticsData = tacticsData2;
        smartArbWithdrawProfitsViewModel = smartArbWithdrawProfitsViewModel5;
        vNI vni = smartArbWithdrawProfitsViewModel.values;
        String algoId = tacticsData.getAlgoId();
        SmartArbPlanLeg smartArbPlanLegDjBIcL = smartArbWithdrawProfitsViewModel.djBIcL();
        String instId = smartArbPlanLegDjBIcL != null ? smartArbPlanLegDjBIcL.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        vNI.TaskDescription taskDescription = new vNI.TaskDescription(algoId, instId);
        this.L$0 = smartArbWithdrawProfitsViewModel;
        this.L$1 = null;
        this.label = 2;
        obj = vni.KWHzl(taskDescription, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        actionBar = (vNI.ActionBar) obj;
        if (actionBar.EZpvd() != null) {
        }
        unit = null;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel322222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
