package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment;

import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;
import o.wTM;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageManualViewModel$fetchArbitrageInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isStaking;
    final /* synthetic */ Float $leveragePrincipal;
    final /* synthetic */ String $spreadRatio;
    final /* synthetic */ String $totalAmt;
    final /* synthetic */ String $userUnitAmt;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmartArbitrageManualViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageManualViewModel$fetchArbitrageInfo$1(SmartArbitrageManualViewModel smartArbitrageManualViewModel, String str, String str2, Float f, String str3, boolean z, Continuation<? super SmartArbitrageManualViewModel$fetchArbitrageInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbitrageManualViewModel;
        this.$totalAmt = str;
        this.$spreadRatio = str2;
        this.$leveragePrincipal = f;
        this.$userUnitAmt = str3;
        this.$isStaking = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbitrageManualViewModel$fetchArbitrageInfo$1 smartArbitrageManualViewModel$fetchArbitrageInfo$1 = new SmartArbitrageManualViewModel$fetchArbitrageInfo$1(this.this$0, this.$totalAmt, this.$spreadRatio, this.$leveragePrincipal, this.$userUnitAmt, this.$isStaking, continuation);
        smartArbitrageManualViewModel$fetchArbitrageInfo$1.L$0 = obj;
        return smartArbitrageManualViewModel$fetchArbitrageInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbitrageManualViewModel$fetchArbitrageInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objKWHzl;
        SmartArbitrageManualViewModel smartArbitrageManualViewModel;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartArbitrageManualViewModel smartArbitrageManualViewModel2 = this.this$0;
            String str2 = this.$totalAmt;
            String str3 = this.$spreadRatio;
            Float f = this.$leveragePrincipal;
            String str4 = this.$userUnitAmt;
            boolean z = this.$isStaking;
            Result.Application application2 = Result.Companion;
            wTM wtm = smartArbitrageManualViewModel2.KWHzl;
            String strAYXKKw = smartArbitrageManualViewModel2.AYXKKw();
            if (StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                str2 = "10000";
            }
            wTM.Activity activity = new wTM.Activity(strAYXKKw, str2, "simpleFundingFee", str3, null, "open", smartArbitrageManualViewModel2.OLrzqt() ? f : null, (smartArbitrageManualViewModel2.KWHzl() && z) ? SubArbitrageType4Remote.STAKE : null, null, 272, null);
            this.L$0 = smartArbitrageManualViewModel2;
            this.L$1 = str4;
            this.label = 1;
            objKWHzl = wtm.KWHzl(activity, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            smartArbitrageManualViewModel = smartArbitrageManualViewModel2;
            str = str4;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                SmartArbitrageManualViewModel smartArbitrageManualViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = smartArbitrageManualViewModel3.AEQbTJ;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            String str5 = (String) this.L$1;
            smartArbitrageManualViewModel = (SmartArbitrageManualViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
            str = str5;
        }
        ArbitrageInfoResponse arbitrageInfoResponseCopy = (ArbitrageInfoResponse) objKWHzl;
        MutableStateFlow mutableStateFlow2 = smartArbitrageManualViewModel.AEQbTJ;
        if (str != null) {
            arbitrageInfoResponseCopy = arbitrageInfoResponseCopy.copy((16777211 & 1) != 0 ? arbitrageInfoResponseCopy.spreadRatio : null, (16777211 & 2) != 0 ? arbitrageInfoResponseCopy.marketSpreadRatio : null, (16777211 & 4) != 0 ? arbitrageInfoResponseCopy.unitAmt : str, (16777211 & 8) != 0 ? arbitrageInfoResponseCopy.minUnitAmt : null, (16777211 & 16) != 0 ? arbitrageInfoResponseCopy.userExpectSpreadRatio : null, (16777211 & 32) != 0 ? arbitrageInfoResponseCopy.userExpectUnitAmt : null, (16777211 & 64) != 0 ? arbitrageInfoResponseCopy.arbitrageTotalPnlInfo : null, (16777211 & 128) != 0 ? arbitrageInfoResponseCopy.estimatingEnlargeArbPnl : null, (16777211 & 256) != 0 ? arbitrageInfoResponseCopy.arbItems : null, (16777211 & 512) != 0 ? arbitrageInfoResponseCopy.enlargedAmt : null, (16777211 & 1024) != 0 ? arbitrageInfoResponseCopy.interestDebt : null, (16777211 & 2048) != 0 ? arbitrageInfoResponseCopy.estimatedStaking : null, (16777211 & 4096) != 0 ? arbitrageInfoResponseCopy.estimatedAutoStaking : null, (16777211 & 8192) != 0 ? arbitrageInfoResponseCopy.minAmt : null, (16777211 & 16384) != 0 ? arbitrageInfoResponseCopy.displayMinPaybackDays : null, (16777211 & 32768) != 0 ? arbitrageInfoResponseCopy.highestApyPeriod : null, (16777211 & 65536) != 0 ? arbitrageInfoResponseCopy.estimatedApyList : null, (16777211 & 131072) != 0 ? arbitrageInfoResponseCopy.estimatedOpenCost : null, (16777211 & 262144) != 0 ? arbitrageInfoResponseCopy.estimatedClosePnl : null, (16777211 & 524288) != 0 ? arbitrageInfoResponseCopy.closeCost : null, (16777211 & 1048576) != 0 ? arbitrageInfoResponseCopy.openCost : null, (16777211 & 2097152) != 0 ? arbitrageInfoResponseCopy.minimalPaybackDays : null, (16777211 & 4194304) != 0 ? arbitrageInfoResponseCopy.realizedClosePnl : null, (16777211 & 8388608) != 0 ? arbitrageInfoResponseCopy.allowLeverPrincipal : false);
        }
        vNB.TaskDescription taskDescription = new vNB.TaskDescription(arbitrageInfoResponseCopy);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        SmartArbitrageManualViewModel smartArbitrageManualViewModel32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
