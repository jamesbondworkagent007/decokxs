package com.okinc.dexkline.market.features.overview.ui;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.market.features.overview.domain.BasicInfo;
import com.okinc.dexkline.market.features.overview.domain.MarketInfo;
import com.okinc.dexkline.market.features.overview.ui.OverviewFragment$displayInfoGrid$1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34338naG;
import o.C34354naW;
import o.C34412nbb;
import o.C56391yDq;
import o.C56442yFn;
import o.mQA;
import o.oNY;

/* JADX INFO: loaded from: classes15.dex */
public final class OverviewFragment$displayInfoGrid$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BasicInfo $basicInfo;
    final /* synthetic */ MarketInfo $marketInfo;
    int label;
    final /* synthetic */ C34338naG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$displayInfoGrid$1(C34338naG c34338naG, BasicInfo basicInfo, MarketInfo marketInfo, Continuation<? super OverviewFragment$displayInfoGrid$1> continuation) {
        super(2, continuation);
        this.this$0 = c34338naG;
        this.$basicInfo = basicInfo;
        this.$marketInfo = marketInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewFragment$displayInfoGrid$1(this.this$0, this.$basicInfo, this.$marketInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$displayInfoGrid$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C34412nbb c34412nbb;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            oNY onyAYXKKw = C34338naG.AYXKKw(this.this$0);
            if (onyAYXKKw != null && (c34412nbb = onyAYXKKw.AEQbTJ) != null) {
                String strCopydefault = this.$basicInfo.copydefault();
                String strGEmmrt = this.$marketInfo.gEmmrt();
                String strEZpvd = this.$marketInfo.EZpvd();
                String strCopydefault2 = this.$marketInfo.copydefault();
                String strOLrzqt = this.$marketInfo.OLrzqt();
                String strAhwBna = this.$marketInfo.AhwBna();
                String strAEQbTJ = this.$marketInfo.AEQbTJ();
                String strAYXKKw = this.$marketInfo.AYXKKw();
                LatestMarketInfoBean latestMarketInfoBeanAYXKKw = this.this$0.AYXKKw();
                C34354naW c34354naW = new C34354naW(latestMarketInfoBeanAYXKKw != null ? latestMarketInfoBeanAYXKKw.getNotSupportTxNativeToken() : false, strCopydefault, strGEmmrt, strEZpvd, strCopydefault2, strAhwBna, strOLrzqt, null, null, strAEQbTJ, strAYXKKw, null, null, this.$basicInfo.KWHzl(), this.$basicInfo.EZpvd(), this.$marketInfo.KWHzl(), 6528, null);
                final C34338naG c34338naG = this.this$0;
                c34412nbb.KWHzl(c34354naW, new Function1() { // from class: o.naQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OverviewFragment$displayInfoGrid$1.invokeSuspend$lambda$0(c34338naG, (kotlin.Pair) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C34338naG c34338naG, Pair pair) {
        c34338naG.valueOf().KWHzl(new mQA(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue()));
        return Unit.INSTANCE;
    }
}
