package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C19080fuY;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryFragment$observeChipVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19080fuY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryFragment$observeChipVisibility$1(C19080fuY c19080fuY, Continuation<? super WalletSearchHistoryFragment$observeChipVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = c19080fuY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryFragment$observeChipVisibility$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryFragment$observeChipVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Error observing chip visibility: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$observeChipVisibility$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C19080fuY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19080fuY c19080fuY, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19080fuY;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$observeChipVisibility$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02971 extends SuspendLambda implements Function2<Map<HistoryFilterType, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C19080fuY this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02971(C19080fuY c19080fuY, Continuation<? super C02971> continuation) {
                super(2, continuation);
                this.this$0 = c19080fuY;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02971 c02971 = new C02971(this.this$0, continuation);
                c02971.L$0 = obj;
                return c02971;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<HistoryFilterType, ? extends Boolean> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<HistoryFilterType, Boolean>) map, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<HistoryFilterType, Boolean> map, Continuation<? super Unit> continuation) {
                return ((C02971) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Map map = (Map) this.L$0;
                    if (!this.this$0.isAdded() || this.this$0.isDetached()) {
                        pUU.valueOf(this.this$0.getTAG(), "Fragment not in valid state, skipping chip visibility update");
                        return Unit.INSTANCE;
                    }
                    try {
                        List listAhwBna = yDY.AhwBna(HistoryFilterType.ALL);
                        HistoryFilterType historyFilterType = HistoryFilterType.CRYPTO;
                        if (Intrinsics.EZpvd(map.get(historyFilterType), C56443yFo.KWHzl(true))) {
                            listAhwBna.add(historyFilterType);
                        }
                        HistoryFilterType historyFilterType2 = HistoryFilterType.DAPPS;
                        if (Intrinsics.EZpvd(map.get(historyFilterType2), C56443yFo.KWHzl(true))) {
                            listAhwBna.add(historyFilterType2);
                        }
                        HistoryFilterType historyFilterType3 = HistoryFilterType.ADDRESS;
                        if (Intrinsics.EZpvd(map.get(historyFilterType3), C56443yFo.KWHzl(true))) {
                            listAhwBna.add(historyFilterType3);
                        }
                        HistoryFilterType historyFilterType4 = HistoryFilterType.MY_ASSET;
                        if (Intrinsics.EZpvd(map.get(historyFilterType4), C56443yFo.KWHzl(true))) {
                            listAhwBna.add(historyFilterType4);
                        }
                        if (!Intrinsics.EZpvd(listAhwBna, this.this$0.KWHzl)) {
                            this.this$0.EZpvd((List<? extends HistoryFilterType>) listAhwBna);
                        }
                    } catch (Exception e) {
                        pUU.AEQbTJ(this.this$0.getTAG(), "Error updating chip visibility: " + e.getMessage(), e);
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
                StateFlow<Map<HistoryFilterType, Boolean>> stateFlowAEQbTJ = this.this$0.valueOf().AEQbTJ();
                C02971 c02971 = new C02971(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAEQbTJ, c02971, this) == objCopydefault) {
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
}
