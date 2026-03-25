package com.okinc.okex.search.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC47356toW;
import o.C44026sAp;
import o.C45358soL;
import o.C45426spa;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultListFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C44026sAp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultListFragment$initViewModel$1(C44026sAp c44026sAp, Continuation<? super SearchResultListFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c44026sAp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultListFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchResultListFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44026sAp this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C44026sAp c44026sAp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c44026sAp;
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

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C44026sAp this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05581(C44026sAp c44026sAp, Continuation<? super C05581> continuation) {
                super(2, continuation);
                this.this$0 = c44026sAp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05581(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$1$TaskDescription */
            public static final class TaskDescription implements Flow<SearchResultArticlesViewModel.ActionBar> {
                public final /* synthetic */ Flow AEQbTJ;
                public final /* synthetic */ C44026sAp OLrzqt;

                /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$1$TaskDescription$5, reason: invalid class name */
                public static final class AnonymousClass5<T> implements FlowCollector {
                    public final /* synthetic */ C44026sAp KWHzl;
                    public final /* synthetic */ FlowCollector OLrzqt;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass5(FlowCollector flowCollector, C44026sAp c44026sAp) {
                        this.OLrzqt = flowCollector;
                        this.KWHzl = c44026sAp;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        SearchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1 searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1;
                        if (continuation instanceof SearchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                            searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1 = (SearchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i = searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                            } else {
                                searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1 = new SearchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                            }
                        }
                        Object obj2 = searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        Object objCopydefault = C56442yFn.copydefault();
                        int i2 = searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i2 == 0) {
                            C56391yDq.AEQbTJ(obj2);
                            FlowCollector flowCollector = this.OLrzqt;
                            if (((SearchResultArticlesViewModel.ActionBar) obj).copydefault() == this.KWHzl.AhwBna()) {
                                searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, searchResultListFragment$initViewModel$1$1$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public TaskDescription(Flow flow, C44026sAp c44026sAp) {
                    this.AEQbTJ = flow;
                    this.OLrzqt = c44026sAp;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super SearchResultArticlesViewModel.ActionBar> flowCollector, Continuation continuation) {
                    Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
                    return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    TaskDescription taskDescription = new TaskDescription(this.this$0.AYXKKw().valueOf(), this.this$0);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(taskDescription, anonymousClass2, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<SearchResultArticlesViewModel.ActionBar, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ C44026sAp this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(C44026sAp c44026sAp, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = c44026sAp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchResultArticlesViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        SearchResultArticlesViewModel.ActionBar actionBar = (SearchResultArticlesViewModel.ActionBar) this.L$0;
                        if (actionBar instanceof SearchResultArticlesViewModel.ActionBar.Activity) {
                            SearchResultArticlesViewModel.ActionBar.Activity activity = (SearchResultArticlesViewModel.ActionBar.Activity) actionBar;
                            this.this$0.AEQbTJ(activity.EZpvd(), (List<SearchArticleDisplayModel>) activity.OLrzqt(), !activity.KWHzl());
                            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                        } else if (actionBar instanceof SearchResultArticlesViewModel.ActionBar.Application) {
                            this.this$0.EZpvd(((SearchResultArticlesViewModel.ActionBar.Application) actionBar).KWHzl());
                            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                        } else if (actionBar instanceof SearchResultArticlesViewModel.ActionBar.TaskDescription) {
                            this.this$0.AEQbTJ(C45358soL.serverErrorMessageOrDefault$default(((SearchResultArticlesViewModel.ActionBar.TaskDescription) actionBar).AEQbTJ(), null, 1, null));
                            rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                        } else if (actionBar instanceof SearchResultArticlesViewModel.ActionBar.StateListAnimator) {
                            this.this$0.gEmmrt();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C44026sAp this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C44026sAp c44026sAp, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = c44026sAp;
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

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$2$Activity */
            public static final class Activity implements Flow<Pair<? extends CategorySlug, ? extends List<? extends C45426spa.TaskDescription>>> {
                public final /* synthetic */ C44026sAp EZpvd;
                public final /* synthetic */ Flow OLrzqt;

                /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$2$Activity$3, reason: invalid class name */
                public static final class AnonymousClass3<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector AEQbTJ;
                    public final /* synthetic */ C44026sAp KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass3(FlowCollector flowCollector, C44026sAp c44026sAp) {
                        this.AEQbTJ = flowCollector;
                        this.KWHzl = c44026sAp;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1 searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1;
                        if (continuation instanceof SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                            searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1 = (SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i = searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                            } else {
                                searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1 = new SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                            }
                        }
                        Object obj2 = searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                        Object objCopydefault = C56442yFn.copydefault();
                        int i2 = searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i2 == 0) {
                            C56391yDq.AEQbTJ(obj2);
                            FlowCollector flowCollector = this.AEQbTJ;
                            if (((CategorySlug) ((Pair) obj).component1()) == this.KWHzl.AhwBna()) {
                                searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, searchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                public Activity(Flow flow, C44026sAp c44026sAp) {
                    this.OLrzqt = flow;
                    this.EZpvd = c44026sAp;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Pair<? extends CategorySlug, ? extends List<? extends C45426spa.TaskDescription>>> flowCollector, Continuation continuation) {
                    Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.EZpvd), continuation);
                    return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Activity activity = new Activity(this.this$0.AYXKKw().AYXKKw(), this.this$0);
                    C05592 c05592 = new C05592(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(activity, c05592, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1$1$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C05592 extends SuspendLambda implements Function2<Pair<? extends CategorySlug, ? extends List<? extends C45426spa.TaskDescription>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ C44026sAp this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05592(C44026sAp c44026sAp, Continuation<? super C05592> continuation) {
                    super(2, continuation);
                    this.this$0 = c44026sAp;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05592 c05592 = new C05592(this.this$0, continuation);
                    c05592.L$0 = obj;
                    return c05592;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Pair<? extends CategorySlug, ? extends List<? extends C45426spa.TaskDescription>> pair, Continuation<? super Unit> continuation) {
                    return invoke2((Pair<? extends CategorySlug, ? extends List<C45426spa.TaskDescription>>) pair, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Pair<? extends CategorySlug, ? extends List<C45426spa.TaskDescription>> pair, Continuation<? super Unit> continuation) {
                    return ((C05592) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        List<C45426spa.TaskDescription> list = (List) ((Pair) this.L$0).component2();
                        AbstractC47356toW abstractC47356toW = this.this$0.AkhnZx;
                        if (abstractC47356toW == null) {
                            Intrinsics.gEmmrt("");
                            abstractC47356toW = null;
                        }
                        C45426spa c45426spa = abstractC47356toW.KWHzl;
                        c45426spa.AEQbTJ(list);
                        Intrinsics.copydefault(c45426spa);
                        c45426spa.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C05581(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
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
            C44026sAp c44026sAp = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c44026sAp, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c44026sAp, state, anonymousClass1, this) == objCopydefault) {
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
