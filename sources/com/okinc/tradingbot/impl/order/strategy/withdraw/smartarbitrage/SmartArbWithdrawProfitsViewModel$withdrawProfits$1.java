package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56033xvF;
import o.C56391yDq;
import o.C56442yFn;
import o.uLP;
import o.vNF;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsViewModel$withdrawProfits$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SmartArbWithdrawProfitsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsViewModel$withdrawProfits$1(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, Continuation<? super SmartArbWithdrawProfitsViewModel$withdrawProfits$1> continuation) {
        super(2, continuation);
        this.this$0 = smartArbWithdrawProfitsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbWithdrawProfitsViewModel$withdrawProfits$1 smartArbWithdrawProfitsViewModel$withdrawProfits$1 = new SmartArbWithdrawProfitsViewModel$withdrawProfits$1(this.this$0, continuation);
        smartArbWithdrawProfitsViewModel$withdrawProfits$1.L$0 = obj;
        return smartArbWithdrawProfitsViewModel$withdrawProfits$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbWithdrawProfitsViewModel$withdrawProfits$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String strKWHzl;
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel2 = this.this$0;
            Result.Application application2 = Result.Companion;
            SmartArbWithdrawProfitsViewModel.Dialog dialog = (SmartArbWithdrawProfitsViewModel.Dialog) ((Map) smartArbWithdrawProfitsViewModel2.OLrzqt.getValue()).get(smartArbWithdrawProfitsViewModel2.EZpvd.getValue());
            Pair pairKWHzl = dialog != null ? dialog.KWHzl() : null;
            if (pairKWHzl != null && (strKWHzl = SmartArbWithdrawProfitsViewModel.Dialog.KWHzl(pairKWHzl)) != null) {
                TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel2.hDKMBd();
                if (tacticsDataHDKMBd != null) {
                    vNF vnf = smartArbWithdrawProfitsViewModel2.hDKMBd;
                    vNF.Activity activity = new vNF.Activity(tacticsDataHDKMBd.getAlgoId(), smartArbWithdrawProfitsViewModel2.AhwBna(), strKWHzl);
                    this.L$0 = smartArbWithdrawProfitsViewModel2;
                    this.label = 1;
                    Object objKWHzl = vnf.KWHzl(activity, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    smartArbWithdrawProfitsViewModel = smartArbWithdrawProfitsViewModel2;
                    obj = objKWHzl;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    smartArbWithdrawProfitsViewModel3.EZpvd(new SmartArbWithdrawProfitsViewModel.Application.StateListAnimator(thM7380exceptionOrNullimpl));
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        smartArbWithdrawProfitsViewModel = (SmartArbWithdrawProfitsViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        vNF.Application application3 = (vNF.Application) obj;
        smartArbWithdrawProfitsViewModel.EZpvd(new SmartArbWithdrawProfitsViewModel.Application.TaskDescription(uLP.EZpvd(C56033xvF.copydefault(application3.KWHzl(), smartArbWithdrawProfitsViewModel.AhwBna(), (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null), application3.KWHzl()), smartArbWithdrawProfitsViewModel.AhwBna(), null));
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
