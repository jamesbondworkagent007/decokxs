package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeSearchHistoryFlow$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16686eoc;
import o.C18989fsn;
import o.C19003ftA;
import o.C19131fvW;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainFragment$observeSearchHistoryFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19003ftA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMainFragment$observeSearchHistoryFlow$1(C19003ftA c19003ftA, Continuation<? super SearchMainFragment$observeSearchHistoryFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c19003ftA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMainFragment$observeSearchHistoryFlow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchMainFragment$observeSearchHistoryFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeSearchHistoryFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C19003ftA this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19003ftA c19003ftA, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19003ftA;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeSearchHistoryFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02921 extends SuspendLambda implements Function2<List<? extends C18989fsn>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C19003ftA this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02921(C19003ftA c19003ftA, Continuation<? super C02921> continuation) {
                super(2, continuation);
                this.this$0 = c19003ftA;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02921 c02921 = new C02921(this.this$0, continuation);
                c02921.L$0 = obj;
                return c02921;
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
                return ((C02921) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                TextView textView;
                ConstraintLayout constraintLayout;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    if (list != null) {
                        C19131fvW c19131fvWOLrzqt = this.this$0.OLrzqt();
                        final C19003ftA c19003ftA = this.this$0;
                        c19131fvWOLrzqt.OLrzqt(list, new Function0() { // from class: o.ftI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return SearchMainFragment$observeSearchHistoryFlow$1.AnonymousClass1.C02921.invokeSuspend$lambda$0(c19003ftA);
                            }
                        });
                        boolean z = !list.isEmpty();
                        C16686eoc c16686eoc = this.this$0.KWHzl;
                        int iOLrzqt = 0;
                        if (c16686eoc != null && (constraintLayout = c16686eoc.djBIcL) != null) {
                            constraintLayout.setVisibility(z ? 0 : 8);
                        }
                        C16686eoc c16686eoc2 = this.this$0.KWHzl;
                        if (c16686eoc2 != null && (textView = c16686eoc2.AkhnZx) != null) {
                            C19003ftA c19003ftA2 = this.this$0;
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (z) {
                                    Context context = c19003ftA2.getContext();
                                    if (context == null) {
                                        return Unit.INSTANCE;
                                    }
                                    iOLrzqt = C55298xhM.OLrzqt(8, context);
                                }
                                marginLayoutParams.topMargin = iOLrzqt;
                                textView.setLayoutParams(marginLayoutParams);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(C19003ftA c19003ftA) {
                RecyclerView recyclerView;
                C16686eoc c16686eoc = c19003ftA.KWHzl;
                if (c16686eoc != null && (recyclerView = c16686eoc.AhwBna) != null) {
                    recyclerView.scrollToPosition(0);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<List<C18989fsn>> stateFlowCopydefault = this.this$0.isConnected().copydefault();
                C02921 c02921 = new C02921(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowCopydefault, c02921, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19003ftA c19003ftA = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c19003ftA, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c19003ftA, state, anonymousClass1, this) == objCopydefault) {
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
