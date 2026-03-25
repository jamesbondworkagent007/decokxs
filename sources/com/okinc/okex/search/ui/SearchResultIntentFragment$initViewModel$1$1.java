package com.okinc.okex.search.ui;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1;
import com.okinc.okex.search.viewmodel.SearchResultIntentViewModel;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC47355toV;
import o.C45363soQ;
import o.C45433sph;
import o.C54979xbL;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultIntentFragment$initViewModel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchResultIntentFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultIntentFragment$initViewModel$1$1(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super SearchResultIntentFragment$initViewModel$1$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultIntentFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultIntentFragment$initViewModel$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultIntentFragment$initViewModel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SearchResultIntentFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchResultIntentFragment;
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchResultIntentFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05551(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super C05551> continuation) {
                super(2, continuation);
                this.this$0 = searchResultIntentFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05551(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05561 extends SuspendLambda implements Function2<SearchResultIntentViewModel.Activity, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchResultIntentFragment this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05561(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super C05561> continuation) {
                    super(2, continuation);
                    this.this$0 = searchResultIntentFragment;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05561 c05561 = new C05561(this.this$0, continuation);
                    c05561.L$0 = obj;
                    return c05561;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchResultIntentViewModel.Activity activity, Continuation<? super Unit> continuation) {
                    return ((C05561) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        final SearchResultIntentViewModel.Activity activity = (SearchResultIntentViewModel.Activity) this.L$0;
                        AbstractC47355toV abstractC47355toV = this.this$0.fIwbmz;
                        if (abstractC47355toV == null) {
                            Intrinsics.gEmmrt("");
                            abstractC47355toV = null;
                        }
                        SearchResultIntentFragment searchResultIntentFragment = this.this$0;
                        if (activity instanceof SearchResultIntentViewModel.Activity.Application) {
                            ConstraintLayout constraintLayout = abstractC47355toV.copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                            constraintLayout.setVisibility(0);
                            if (searchResultIntentFragment.AuCTel > 0) {
                                searchResultIntentFragment.OLrzqt(searchResultIntentFragment.AuCTel, searchResultIntentFragment.djBIcL());
                            } else {
                                C54979xbL.collapse$default(abstractC47355toV.EZpvd, false, 1, null);
                            }
                            TextView textView = abstractC47355toV.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            textView.setVisibility(4);
                            C45433sph c45433sph = abstractC47355toV.djBIcL.copydefault;
                            Intrinsics.checkNotNullExpressionValue(c45433sph, "");
                            c45433sph.setVisibility(0);
                            searchResultIntentFragment.copydefault(true, false);
                        } else if (activity instanceof SearchResultIntentViewModel.Activity.StateListAnimator) {
                            ConstraintLayout constraintLayout2 = abstractC47355toV.copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                            constraintLayout2.setVisibility(0);
                            C54979xbL.collapse$default(abstractC47355toV.EZpvd, false, 1, null);
                            TextView textView2 = abstractC47355toV.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(textView2, "");
                            textView2.setVisibility(0);
                            C45433sph c45433sph2 = abstractC47355toV.djBIcL.copydefault;
                            Intrinsics.checkNotNullExpressionValue(c45433sph2, "");
                            c45433sph2.setVisibility(8);
                            searchResultIntentFragment.copydefault(true, searchResultIntentFragment.fIwbmz().copydefault());
                            searchResultIntentFragment.AEQbTJ(((SearchResultIntentViewModel.Activity.StateListAnimator) activity).EZpvd());
                            C45363soQ.onSessionIdEvent$default("SupportCenterSearch_SearchResult_AIAnswer_View", false, new Function1() { // from class: o.sAs
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return SearchResultIntentFragment$initViewModel$1$1.AnonymousClass1.C05551.C05561.invokeSuspend$lambda$1$lambda$0(activity, (EventParamsList) obj2);
                                }
                            }, 1, null);
                        } else if (activity instanceof SearchResultIntentViewModel.Activity.Dialog) {
                            searchResultIntentFragment.EZpvd(searchResultIntentFragment.djBIcL());
                            searchResultIntentFragment.copydefault(false, searchResultIntentFragment.fIwbmz().copydefault());
                        } else if (activity instanceof SearchResultIntentViewModel.Activity.C0566Activity) {
                            searchResultIntentFragment.AYXKKw();
                        } else if (activity instanceof SearchResultIntentViewModel.Activity.TaskDescription) {
                            searchResultIntentFragment.OLrzqt(((SearchResultIntentViewModel.Activity.TaskDescription) activity).AEQbTJ());
                        } else {
                            if (!(activity instanceof SearchResultIntentViewModel.Activity.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ConstraintLayout constraintLayout3 = abstractC47355toV.copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                            constraintLayout3.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$1$lambda$0(SearchResultIntentViewModel.Activity activity, EventParamsList eventParamsList) {
                    EventParamsList.put$default(eventParamsList, "intent_id", ((SearchResultIntentViewModel.Activity.StateListAnimator) activity).OLrzqt(), false, 4, null);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<SearchResultIntentViewModel.Activity> stateFlowValueOf = this.this$0.fIwbmz().valueOf();
                    C05561 c05561 = new C05561(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowValueOf, c05561, this) == objCopydefault) {
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
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C05551(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchResultIntentFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchResultIntentFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultIntentFragment$initViewModel$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C05571 extends SuspendLambda implements Function2<SupportSearchViewModel.Activity, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchResultIntentFragment this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05571(SearchResultIntentFragment searchResultIntentFragment, Continuation<? super C05571> continuation) {
                    super(2, continuation);
                    this.this$0 = searchResultIntentFragment;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05571 c05571 = new C05571(this.this$0, continuation);
                    c05571.L$0 = obj;
                    return c05571;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportSearchViewModel.Activity activity, Continuation<? super Unit> continuation) {
                    return ((C05571) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.fIwbmz().AEQbTJ(((SupportSearchViewModel.Activity) this.L$0).OLrzqt());
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
                    StateFlow<SupportSearchViewModel.Activity> stateFlowAYXKKw = this.this$0.fARcdN().AYXKKw();
                    C05571 c05571 = new C05571(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowAYXKKw, c05571, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SearchResultIntentFragment searchResultIntentFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchResultIntentFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(searchResultIntentFragment, state, anonymousClass1, this) == objCopydefault) {
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
