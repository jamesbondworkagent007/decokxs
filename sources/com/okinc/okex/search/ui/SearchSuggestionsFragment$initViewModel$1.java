package com.okinc.okex.search.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1;
import com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter;
import com.okinc.okex.search.viewmodel.SearchSuggestionsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC44051sBn;
import o.AbstractC47413tpa;
import o.C45363soQ;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.sAK;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchSuggestionsFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ sAK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsFragment$initViewModel$1(sAK sak, Continuation<? super SearchSuggestionsFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = sak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSuggestionsFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchSuggestionsFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sAK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sAK sak, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sak;
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

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ sAK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05601(sAK sak, Continuation<? super C05601> continuation) {
                super(2, continuation);
                this.this$0 = sak;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05601(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05611 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ sAK this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05611(sAK sak, Continuation<? super C05611> continuation) {
                    super(2, continuation);
                    this.this$0 = sak;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05611 c05611 = new C05611(this.this$0, continuation);
                    c05611.L$0 = obj;
                    return c05611;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C05611) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.djBIcL().KWHzl((String) this.L$0);
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
                    Flow<String> flowEZpvd = this.this$0.valueOf().EZpvd();
                    C05611 c05611 = new C05611(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowEZpvd, c05611, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C05601(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ sAK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(sAK sak, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sak;
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

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C05621 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ sAK this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05621(sAK sak, Continuation<? super C05621> continuation) {
                    super(2, continuation);
                    this.this$0 = sak;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05621 c05621 = new C05621(this.this$0, continuation);
                    c05621.L$0 = obj;
                    return c05621;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C05621) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.valueOf().KWHzl((String) this.L$0);
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
                    StateFlow<String> stateFlowKWHzl = this.this$0.djBIcL().KWHzl();
                    C05621 c05621 = new C05621(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowKWHzl, c05621, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ sAK this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(sAK sak, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = sak;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.okex.search.ui.SearchSuggestionsFragment$initViewModel$1$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C05631 extends SuspendLambda implements Function2<SearchSuggestionsViewModel.TaskDescription, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ sAK this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05631(sAK sak, Continuation<? super C05631> continuation) {
                    super(2, continuation);
                    this.this$0 = sak;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05631 c05631 = new C05631(this.this$0, continuation);
                    c05631.L$0 = obj;
                    return c05631;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchSuggestionsViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                    return ((C05631) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        SearchSuggestionsViewModel.TaskDescription taskDescription = (SearchSuggestionsViewModel.TaskDescription) this.L$0;
                        AbstractC47413tpa abstractC47413tpa = this.this$0.fetchVPNInfo;
                        if (abstractC47413tpa == null) {
                            Intrinsics.gEmmrt("");
                            abstractC47413tpa = null;
                        }
                        final sAK sak = this.this$0;
                        if (taskDescription instanceof SearchSuggestionsViewModel.TaskDescription.Application) {
                            C55113xdn c55113xdn = abstractC47413tpa.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(0);
                            RecyclerView recyclerView = abstractC47413tpa.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                            recyclerView.setVisibility(8);
                            C55173xeu c55173xeu = abstractC47413tpa.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                        } else if (taskDescription instanceof SearchSuggestionsViewModel.TaskDescription.Activity) {
                            sak.valueOf().AEQbTJ(false);
                            C55113xdn c55113xdn2 = abstractC47413tpa.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                            RecyclerView recyclerView2 = abstractC47413tpa.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                            recyclerView2.setVisibility(8);
                            C55173xeu c55173xeu2 = abstractC47413tpa.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(0);
                            rVN.reportFullyDrawn$default((Fragment) sak, true, (String) null, 2, (Object) null);
                        } else {
                            if (!(taskDescription instanceof SearchSuggestionsViewModel.TaskDescription.C0567TaskDescription)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55113xdn c55113xdn3 = abstractC47413tpa.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                            C55173xeu c55173xeu3 = abstractC47413tpa.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            RecyclerView recyclerView3 = abstractC47413tpa.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                            recyclerView3.setVisibility(0);
                            SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapterAhwBna = sak.AhwBna();
                            AbstractC47413tpa abstractC47413tpa2 = sak.fetchVPNInfo;
                            if (abstractC47413tpa2 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC47413tpa2 = null;
                            }
                            RecyclerView recyclerView4 = abstractC47413tpa2.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                            SearchSuggestionsViewModel.TaskDescription.C0567TaskDescription c0567TaskDescription = (SearchSuggestionsViewModel.TaskDescription.C0567TaskDescription) taskDescription;
                            supportSearchSuggestionsAdapterAhwBna.copydefault(recyclerView4, (List) c0567TaskDescription.KWHzl());
                            List<AbstractC44051sBn> listKWHzl = c0567TaskDescription.KWHzl();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listKWHzl) {
                                if (obj2 instanceof AbstractC44051sBn.TaskDescription) {
                                    arrayList.add(obj2);
                                }
                            }
                            Triple triple = new Triple(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.sAP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return ((AbstractC44051sBn.TaskDescription) obj3).KWHzl();
                                }
                            }, 30, null), CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.sAO
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return SearchSuggestionsFragment$initViewModel$1.AnonymousClass1.AnonymousClass3.C05631.invokeSuspend$lambda$5$lambda$3$lambda$1((AbstractC44051sBn.TaskDescription) obj3);
                                }
                            }, 30, null), CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.sAQ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return SearchSuggestionsFragment$initViewModel$1.AnonymousClass1.AnonymousClass3.C05631.invokeSuspend$lambda$5$lambda$3$lambda$2((AbstractC44051sBn.TaskDescription) obj3);
                                }
                            }, 30, null));
                            final String str = (String) triple.component1();
                            final String str2 = (String) triple.component2();
                            final String str3 = (String) triple.component3();
                            sak.valueOf().AEQbTJ(!StringsKt__StringsKt.fARcdN((CharSequence) str));
                            rVN.reportFullyDrawn$default((Fragment) sak, true, (String) null, 2, (Object) null);
                            if (sak.valueOf().KWHzl()) {
                                C45363soQ.onSessionIdEvent$default("SupportCenterSearch_Search_AIsearchRecommendationsDetails_View", false, new Function1() { // from class: o.sAN
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return SearchSuggestionsFragment$initViewModel$1.AnonymousClass1.AnonymousClass3.C05631.invokeSuspend$lambda$5$lambda$4(str, str2, sak, str3, (EventParamsList) obj3);
                                    }
                                }, 1, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CharSequence invokeSuspend$lambda$5$lambda$3$lambda$1(AbstractC44051sBn.TaskDescription taskDescription) {
                    return String.valueOf(taskDescription.EZpvd());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CharSequence invokeSuspend$lambda$5$lambda$3$lambda$2(AbstractC44051sBn.TaskDescription taskDescription) {
                    return String.valueOf(taskDescription.OLrzqt());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$5$lambda$4(String str, String str2, sAK sak, String str3, EventParamsList eventParamsList) {
                    EventParamsList.put$default(eventParamsList, "intent_showed_details", str, false, 4, null);
                    EventParamsList.put$default(eventParamsList, "intent_confidence_level", str2, false, 4, null);
                    eventParamsList.put("page", sak.valueOf().djBIcL(), true);
                    EventParamsList.put$default(eventParamsList, "query", sak.valueOf().OLrzqt(), false, 4, null);
                    EventParamsList.put$default(eventParamsList, "intent_confidence_score", str3, false, 4, null);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<SearchSuggestionsViewModel.TaskDescription> stateFlowCopydefault = this.this$0.djBIcL().copydefault();
                    C05631 c05631 = new C05631(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowCopydefault, c05631, this) == objCopydefault) {
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
            sAK sak = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(sak, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(sak, state, anonymousClass1, this) == objCopydefault) {
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
