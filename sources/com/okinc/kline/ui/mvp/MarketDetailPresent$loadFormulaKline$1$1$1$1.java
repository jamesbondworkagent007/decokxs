package com.okinc.kline.ui.mvp;

import com.okinc.kline.library.data.DataSource;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C39562pug;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;
import o.oLY;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$loadFormulaKline$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oLY> $convertedData;
    final /* synthetic */ Ref.BooleanRef $hasSetCandleData;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.oLY> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketDetailPresent$loadFormulaKline$1$1$1$1(List<? extends oLY> list, Ref.BooleanRef booleanRef, C39562pug c39562pug, Continuation<? super MarketDetailPresent$loadFormulaKline$1$1$1$1> continuation) {
        super(2, continuation);
        this.$convertedData = list;
        this.$hasSetCandleData = booleanRef;
        this.this$0 = c39562pug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$loadFormulaKline$1$1$1$1(this.$convertedData, this.$hasSetCandleData, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailPresent$loadFormulaKline$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pug.OLrzqt(o.pug):o.puh$Application */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        oLY oly;
        InterfaceC39563puh.Application application;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$convertedData.isEmpty() && !this.$hasSetCandleData.element && (application = this.this$0.wlaJM) != null) {
                application.RKDWNf();
            }
            InterfaceC39563puh.Application application2 = this.this$0.wlaJM;
            if (application2 != null) {
                application2.AYXKKw(this.$convertedData);
            }
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            DataSource dataSource = c36246oUrCopydefault.sSMYrx().get("ds0");
            DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource != null ? dataSource.AEQbTJ : null;
            if (!this.$hasSetCandleData.element && dataArrayList != null && !dataArrayList.isEmpty() && (oly = (oLY) CollectionsKt___CollectionsKt.wlaJM(this.$convertedData)) != null) {
                this.$hasSetCandleData.element = true;
                c36246oUrCopydefault.iwGUEr().AEQbTJ(oly.KWHzl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
