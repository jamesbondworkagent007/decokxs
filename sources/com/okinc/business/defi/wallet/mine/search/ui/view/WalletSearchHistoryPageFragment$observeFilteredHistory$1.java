package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryPageFragment$observeFilteredHistory$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C18989fsn;
import o.C19131fvW;
import o.C19152fvr;
import o.C19188fwa;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryPageFragment$observeFilteredHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletSearchHistoryViewModel $viewModel;
    int label;
    final /* synthetic */ C19152fvr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryPageFragment$observeFilteredHistory$1(C19152fvr c19152fvr, WalletSearchHistoryViewModel walletSearchHistoryViewModel, Continuation<? super WalletSearchHistoryPageFragment$observeFilteredHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = c19152fvr;
        this.$viewModel = walletSearchHistoryViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryPageFragment$observeFilteredHistory$1(this.this$0, this.$viewModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryPageFragment$observeFilteredHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        HistoryFilterType historyFilterType = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$viewModel, null);
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
            String tag = this.this$0.getTAG();
            HistoryFilterType historyFilterType2 = this.this$0.EZpvd;
            if (historyFilterType2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                historyFilterType = historyFilterType2;
            }
            pUU.AEQbTJ(tag, "Error observing filtered history for " + historyFilterType + ": " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryPageFragment$observeFilteredHistory$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WalletSearchHistoryViewModel $viewModel;
        int label;
        final /* synthetic */ C19152fvr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19152fvr c19152fvr, WalletSearchHistoryViewModel walletSearchHistoryViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19152fvr;
            this.$viewModel = walletSearchHistoryViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$viewModel, continuation);
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
                String tag = this.this$0.getTAG();
                HistoryFilterType historyFilterType = this.this$0.EZpvd;
                if (historyFilterType == null) {
                    Intrinsics.gEmmrt("");
                    historyFilterType = null;
                }
                pUU.EZpvd(tag, "Starting to observe raw history for " + historyFilterType);
                StateFlow<List<C18989fsn>> stateFlowKWHzl = this.$viewModel.KWHzl();
                C02991 c02991 = new C02991(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowKWHzl, c02991, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryPageFragment$observeFilteredHistory$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02991 extends SuspendLambda implements Function2<List<? extends C18989fsn>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C19152fvr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02991(C19152fvr c19152fvr, Continuation<? super C02991> continuation) {
                super(2, continuation);
                this.this$0 = c19152fvr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02991 c02991 = new C02991(this.this$0, continuation);
                c02991.L$0 = obj;
                return c02991;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends C18989fsn> list, Continuation<? super Unit> continuation) {
                return invoke2((List<C18989fsn>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<C18989fsn> list, Continuation<? super Unit> continuation) {
                return ((C02991) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    HistoryFilterType historyFilterType = null;
                    if (list == null) {
                        String tag = this.this$0.getTAG();
                        HistoryFilterType historyFilterType2 = this.this$0.EZpvd;
                        if (historyFilterType2 == null) {
                            Intrinsics.gEmmrt("");
                            historyFilterType2 = null;
                        }
                        pUU.EZpvd(tag, "Page " + historyFilterType2 + " got null, showing empty");
                        C19188fwa.submitList$default(this.this$0.KWHzl(), yDY.AhwBna(), null, 2, null);
                        return Unit.INSTANCE;
                    }
                    if (!this.this$0.isAdded() || this.this$0.isDetached()) {
                        String tag2 = this.this$0.getTAG();
                        HistoryFilterType historyFilterType3 = this.this$0.EZpvd;
                        if (historyFilterType3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            historyFilterType = historyFilterType3;
                        }
                        pUU.valueOf(tag2, "Page " + historyFilterType + " not in valid state, skipping update");
                        return Unit.INSTANCE;
                    }
                    String tag3 = this.this$0.getTAG();
                    HistoryFilterType historyFilterType4 = this.this$0.EZpvd;
                    if (historyFilterType4 == null) {
                        Intrinsics.gEmmrt("");
                        historyFilterType4 = null;
                    }
                    pUU.EZpvd(tag3, "Page " + historyFilterType4 + " received " + list.size() + " raw items");
                    C19152fvr c19152fvr = this.this$0;
                    HistoryFilterType historyFilterType5 = c19152fvr.EZpvd;
                    if (historyFilterType5 == null) {
                        Intrinsics.gEmmrt("");
                        historyFilterType5 = null;
                    }
                    List listCopydefault = c19152fvr.copydefault(list, historyFilterType5);
                    String tag4 = this.this$0.getTAG();
                    HistoryFilterType historyFilterType6 = this.this$0.EZpvd;
                    if (historyFilterType6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        historyFilterType = historyFilterType6;
                    }
                    pUU.EZpvd(tag4, "Page " + historyFilterType + " showing " + listCopydefault.size() + " filtered items");
                    C19131fvW c19131fvWKWHzl = this.this$0.KWHzl();
                    final C19152fvr c19152fvr2 = this.this$0;
                    c19131fvWKWHzl.OLrzqt(listCopydefault, new Function0() { // from class: o.fvv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return WalletSearchHistoryPageFragment$observeFilteredHistory$1.AnonymousClass1.C02991.invokeSuspend$lambda$0(c19152fvr2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(C19152fvr c19152fvr) {
                try {
                    RecyclerView recyclerView = c19152fvr.AhwBna;
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(0);
                    }
                } catch (Exception e) {
                    pUU.AEQbTJ(c19152fvr.getTAG(), "Error scrolling to position 0: " + e.getMessage(), e);
                }
                rVN.reportFullyDrawn$default((Fragment) c19152fvr, true, (String) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
        }
    }
}
