package com.okinc.kline.ui.view.setting;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37844pCu;
import o.C56391yDq;
import o.C56442yFn;
import o.oUN;
import o.pFP;

/* JADX INFO: loaded from: classes19.dex */
public final class IndicatorListActivity$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC37844pCu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorListActivity$onCreate$1(ActivityC37844pCu activityC37844pCu, Continuation<? super IndicatorListActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC37844pCu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndicatorListActivity$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndicatorListActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.view.setting.IndicatorListActivity$onCreate$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChartViewOutSideConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC37844pCu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC37844pCu activityC37844pCu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC37844pCu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChartViewOutSideConfig chartViewOutSideConfig, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(chartViewOutSideConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ChartViewOutSideConfig chartViewOutSideConfig = (ChartViewOutSideConfig) this.L$0;
                this.this$0.valueOf = Intrinsics.EZpvd((Object) chartViewOutSideConfig.getChartTag(), (Object) "sp_timeinterval_okx_lite");
                if (this.this$0.valueOf) {
                    RecyclerView recyclerView = this.this$0.AhwBna;
                    if (recyclerView == null) {
                        Intrinsics.gEmmrt("");
                        recyclerView = null;
                    }
                    recyclerView.setPadding(this.this$0.OLrzqt, 0, 0, 0);
                }
                if (Intrinsics.EZpvd((Object) chartViewOutSideConfig.getChartTag(), (Object) "kline_dex_market_time_preference") || Intrinsics.EZpvd((Object) chartViewOutSideConfig.getChartTag(), (Object) "wallet_trade_kline_tag") || Intrinsics.EZpvd((Object) chartViewOutSideConfig.getChartTag(), (Object) "sp_timeinterval_okx_lite") || Intrinsics.EZpvd((Object) chartViewOutSideConfig.getChartTag(), (Object) "sp_timeinterval_okx_cedefi") || !pFP.OLrzqt.OLrzqt()) {
                    this.this$0.djBIcL = true;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC37844pCu activityC37844pCu = this.this$0;
            oUN oun = activityC37844pCu.AEQbTJ;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (activityC37844pCu.EZpvd(oun, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
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
