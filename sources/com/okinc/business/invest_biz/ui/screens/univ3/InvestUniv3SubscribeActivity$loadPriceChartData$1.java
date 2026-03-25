package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23732iHg;
import o.C25493ixk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$loadPriceChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromCache;
    final /* synthetic */ String $period;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$loadPriceChartData$1(boolean z, String str, InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$loadPriceChartData$1> continuation) {
        super(2, continuation);
        this.$fromCache = z;
        this.$period = str;
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$loadPriceChartData$1(this.$fromCache, this.$period, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$loadPriceChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<InvestUniv3ChartData> listQVAiDq;
        int i;
        C23732iHg c23732iHg;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$fromCache) {
                listQVAiDq = this.this$0.isConnected().QVAiDq();
                c23732iHg = this.this$0.AhwBna;
                if (c23732iHg == null) {
                }
                c23732iHg.QUSxYX.setChartData(listQVAiDq, this.this$0.ejfBZ());
                return Unit.INSTANCE;
            }
            String str = this.$period;
            if (!Intrinsics.EZpvd((Object) str, (Object) this.this$0.getString(C25493ixk.FragmentManager.RuDPQV))) {
                if (Intrinsics.EZpvd((Object) str, (Object) this.this$0.getString(C25493ixk.FragmentManager.dIjzlO))) {
                    i = 1;
                } else {
                    i = Intrinsics.EZpvd((Object) str, (Object) this.this$0.getString(C25493ixk.FragmentManager.atDTRm)) ? 2 : 0;
                }
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
                this.label = 1;
                obj = investUniv3SubscribeViewModelIsConnected.OLrzqt(i, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            c23732iHg = this.this$0.AhwBna;
            if (c23732iHg == null) {
                Intrinsics.gEmmrt("");
                c23732iHg = null;
            }
            c23732iHg.QUSxYX.setChartData(listQVAiDq, this.this$0.ejfBZ());
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        listQVAiDq = (List) obj;
        c23732iHg = this.this$0.AhwBna;
        if (c23732iHg == null) {
        }
        c23732iHg.QUSxYX.setChartData(listQVAiDq, this.this$0.ejfBZ());
        return Unit.INSTANCE;
    }
}
