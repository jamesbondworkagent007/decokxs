package com.okinc.planet.biz_plugin.future.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import com.okinc.planet.biz_plugin.future.data.FutureHistoryBean;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import com.okinc.planet.biz_plugin.future.data.PluginFuturesMetadata;
import com.okinc.planet_api.PlanetFutureTypeEnum;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import com.okinc.tradeshare.api.TradePositionPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.tBY;
import o.tCW;
import o.yDY;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes19.dex */
public final class FuturePluginContainerBottomSheet$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tCW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturePluginContainerBottomSheet$observeViewModel$1(tCW tcw, Continuation<? super FuturePluginContainerBottomSheet$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = tcw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturePluginContainerBottomSheet$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturePluginContainerBottomSheet$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_plugin.future.ui.FuturePluginContainerBottomSheet$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ tCW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tCW tcw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = tcw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<tBY.Application> sharedFlowAEQbTJ = this.this$0.copydefault().AEQbTJ();
                final tCW tcw = this.this$0;
                FlowCollector<? super tBY.Application> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_plugin.future.ui.FuturePluginContainerBottomSheet.observeViewModel.1.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: com.okinc.tradeshare.api.TradePositionPlanetBean */
                    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.tradeshare.api.TradeHisPositionPlanetBean */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(tBY.Application application, Continuation<? super Unit> continuation) {
                        List<TradeTickerChartEntry> listAhwBna;
                        List<TradeHisPositionHisOrderPlanetBean> listAhwBna2;
                        PluginFuturesMetadata pluginFuturesMetadata;
                        List<TradeTickerChartEntry> listAhwBna3;
                        List<TradeHisPositionHisOrderPlanetBean> listAhwBna4;
                        if (!(application instanceof tBY.Application.StateListAnimator)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tBY.Application.StateListAnimator stateListAnimator = (tBY.Application.StateListAnimator) application;
                        PlanetFutureTypeEnum planetFutureTypeEnumKWHzl = stateListAnimator.KWHzl();
                        PlanetFutureTypeEnum planetFutureTypeEnum = PlanetFutureTypeEnum.CURRENT;
                        if (planetFutureTypeEnumKWHzl == planetFutureTypeEnum) {
                            String type = planetFutureTypeEnum.getType();
                            FuturePositionBean futurePositionBeanCopydefault = stateListAnimator.copydefault();
                            if (futurePositionBeanCopydefault == null || (listAhwBna3 = futurePositionBeanCopydefault.getKlineList()) == null) {
                                listAhwBna3 = yDY.AhwBna();
                            }
                            List<TradeTickerChartEntry> list = listAhwBna3;
                            FuturePositionBean futurePositionBeanCopydefault2 = stateListAnimator.copydefault();
                            if (futurePositionBeanCopydefault2 == null || (listAhwBna4 = futurePositionBeanCopydefault2.getBuySellMarkerList()) == null) {
                                listAhwBna4 = yDY.AhwBna();
                            }
                            List<TradeHisPositionHisOrderPlanetBean> list2 = listAhwBna4;
                            FuturePositionBean futurePositionBeanCopydefault3 = stateListAnimator.copydefault();
                            pluginFuturesMetadata = new PluginFuturesMetadata((String) null, (String) null, (String) null, (String) null, type, (List) list, (List) list2, (TradePositionPlanetBean) (futurePositionBeanCopydefault3 != null ? futurePositionBeanCopydefault3.getTradePositionPlanetBean() : null), (TradeHisPositionPlanetBean) null, FutureCustomizeType.Future_Customize_PnlPercent.getValue(), 271, (DefaultConstructorMarker) null);
                        } else {
                            String type2 = PlanetFutureTypeEnum.HISTORY.getType();
                            FutureHistoryBean futureHistoryBeanEZpvd = stateListAnimator.EZpvd();
                            if (futureHistoryBeanEZpvd == null || (listAhwBna = futureHistoryBeanEZpvd.getKlineList()) == null) {
                                listAhwBna = yDY.AhwBna();
                            }
                            List<TradeTickerChartEntry> list3 = listAhwBna;
                            FutureHistoryBean futureHistoryBeanEZpvd2 = stateListAnimator.EZpvd();
                            if (futureHistoryBeanEZpvd2 == null || (listAhwBna2 = futureHistoryBeanEZpvd2.getBuySellMarkerList()) == null) {
                                listAhwBna2 = yDY.AhwBna();
                            }
                            List<TradeHisPositionHisOrderPlanetBean> list4 = listAhwBna2;
                            FutureHistoryBean futureHistoryBeanEZpvd3 = stateListAnimator.EZpvd();
                            pluginFuturesMetadata = new PluginFuturesMetadata((String) null, (String) null, (String) null, (String) null, type2, (List) list3, (List) list4, (TradePositionPlanetBean) null, (TradeHisPositionPlanetBean) (futureHistoryBeanEZpvd3 != null ? futureHistoryBeanEZpvd3.getTradeHisPositionPlanetBean() : null), FutureCustomizeType.Future_Customize_PnlPercent.getValue(), CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, (DefaultConstructorMarker) null);
                        }
                        Function1 function1 = tcw.djBIcL;
                        if (function1 != null) {
                            function1.invoke(pluginFuturesMetadata);
                        }
                        tcw.dismissAllowingStateLoss();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tCW tcw = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(tcw, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(tcw, state, anonymousClass1, this) == objCopydefault) {
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
