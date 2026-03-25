package com.okinc.tradingbot.impl.planet.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ PlanetPublisherPluginPreviewType $previewType;
    final /* synthetic */ Integer $selectedBotIndex;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1(Integer num, PlanetPublisherPluginPreviewType planetPublisherPluginPreviewType, LazyListState lazyListState, Density density, Continuation<? super PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1> continuation) {
        super(2, continuation);
        this.$selectedBotIndex = num;
        this.$previewType = planetPublisherPluginPreviewType;
        this.$listState = lazyListState;
        this.$density = density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1 planetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1 = new PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1(this.$selectedBotIndex, this.$previewType, this.$listState, this.$density, continuation);
        planetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1.L$0 = obj;
        return planetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (this.$selectedBotIndex != null && this.$previewType == null && !this.$listState.isScrollInProgress()) {
                LazyListLayoutInfo layoutInfo = this.$listState.getLayoutInfo();
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                Integer num = this.$selectedBotIndex;
                Iterator<T> it = visibleItemsInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    int index = ((LazyListItemInfo) next).getIndex();
                    if (num != null && index == num.intValue()) {
                        break;
                    }
                }
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                if (lazyListItemInfo == null || lazyListItemInfo.getOffset() < layoutInfo.getViewportStartOffset()) {
                    LazyListState lazyListState = this.$listState;
                    int iIntValue = this.$selectedBotIndex.intValue();
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (LazyListState.animateScrollToItem$default(lazyListState, iIntValue, 0, this, 2, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                coroutineScope = coroutineScope2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
        C56391yDq.AEQbTJ(obj);
        coroutineScope = coroutineScope3;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$listState, this.$selectedBotIndex, this.$density, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Density $density;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Integer $selectedBotIndex;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, Integer num, Density density, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$listState = lazyListState;
            this.$selectedBotIndex = num;
            this.$density = density;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$listState, this.$selectedBotIndex, this.$density, continuation);
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
                final Ref.IntRef intRef = new Ref.IntRef();
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                final LazyListState lazyListState = this.$listState;
                final Integer num = this.$selectedBotIndex;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: o.wqy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PlanetOngoingBotsListComposeKt$PlanetOngoingBotsList$2$1.AnonymousClass1.invokeSuspend$lambda$1(lazyListState, num);
                    }
                });
                final Density density = this.$density;
                final LazyListState lazyListState2 = this.$listState;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsListComposeKt.PlanetOngoingBotsList.2.1.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Triple<Integer, Integer, Integer> triple, Continuation<? super Unit> continuation) {
                        if (triple != null) {
                            int iIntValue = triple.component1().intValue();
                            int iIntValue2 = triple.component2().intValue();
                            int iIntValue3 = triple.component3().intValue();
                            Ref.BooleanRef booleanRef2 = booleanRef;
                            if (booleanRef2.element) {
                                intRef.element = iIntValue;
                                booleanRef2.element = false;
                            } else {
                                if (iIntValue > intRef.element && iIntValue2 > iIntValue3) {
                                    lazyListState2.dispatchRawDelta((iIntValue2 - iIntValue3) + density.mo516toPx0680j_4(Dp.m5414constructorimpl(1)));
                                }
                                intRef.element = iIntValue;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowSnapshotFlow.collect(flowCollector, this) == objCopydefault) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Triple invokeSuspend$lambda$1(LazyListState lazyListState, Integer num) {
            Object next;
            Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int index = ((LazyListItemInfo) next).getIndex();
                if (num != null && index == num.intValue()) {
                    break;
                }
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
            if (lazyListItemInfo == null) {
                return null;
            }
            return new Triple(Integer.valueOf(lazyListItemInfo.getSize()), Integer.valueOf(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()), Integer.valueOf(lazyListState.getLayoutInfo().getViewportEndOffset()));
        }
    }
}
