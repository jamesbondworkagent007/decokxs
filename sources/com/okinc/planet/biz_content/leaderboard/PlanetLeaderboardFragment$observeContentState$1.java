package com.okinc.planet.biz_content.leaderboard;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33070mpX;
import o.C33546myW;
import o.C47501trL;
import o.C47599ttE;
import o.C47638ttr;
import o.C47664tuQ;
import o.C55173xeu;
import o.C55237xgE;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46387tSl;
import o.pUU;
import o.rVN;
import o.tNQ;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetLeaderboardFragment$observeContentState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47599ttE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetLeaderboardFragment$observeContentState$1(C47599ttE c47599ttE, Continuation<? super PlanetLeaderboardFragment$observeContentState$1> continuation) {
        super(2, continuation);
        this.this$0 = c47599ttE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetLeaderboardFragment$observeContentState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetLeaderboardFragment$observeContentState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C47599ttE this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47599ttE c47599ttE, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47599ttE;
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ C47599ttE this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05941(C47599ttE c47599ttE, Continuation<? super C05941> continuation) {
                super(2, continuation);
                this.this$0 = c47599ttE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05941(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1$1$1$Activity */
            public static final class Activity implements Flow<C47664tuQ.TaskDescription> {
                public final /* synthetic */ Flow copydefault;

                /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1$1$1$Activity$3, reason: invalid class name */
                public static final class AnonymousClass3<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass3(FlowCollector flowCollector) {
                        this.AEQbTJ = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) throws Throwable {
                        PlanetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1 planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1;
                        if (continuation instanceof PlanetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                            planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1 = (PlanetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i = planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                            } else {
                                planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1 = new PlanetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                            }
                        }
                        Object obj2 = planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        Object objCopydefault = C56442yFn.copydefault();
                        int i2 = planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i2 == 0) {
                            C56391yDq.AEQbTJ(obj2);
                            FlowCollector flowCollector = this.AEQbTJ;
                            if (((C47664tuQ.TaskDescription) obj).KWHzl()) {
                                planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, planetLeaderboardFragment$observeContentState$1$1$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

                public Activity(Flow flow) {
                    this.copydefault = flow;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super C47664tuQ.TaskDescription> flowCollector, Continuation continuation) {
                    Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
                    return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Activity activity = new Activity(this.this$0.AYXKKw().OLrzqt());
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
                    this.label = 1;
                    if (activity.collect(anonymousClass3, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1$1$1$3, reason: invalid class name */
            public static final class AnonymousClass3<T> implements FlowCollector {
                public final /* synthetic */ C47599ttE KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass3(C47599ttE c47599ttE) {
                    this.KWHzl = c47599ttE;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(C47664tuQ.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                    C55237xgE c55237xgE;
                    C55237xgE c55237xgE2;
                    C55237xgE c55237xgE3;
                    C33546myW c33546myW;
                    C47638ttr c47638ttrKWHzl = this.KWHzl.copydefault;
                    if (c47638ttrKWHzl == null) {
                        c47638ttrKWHzl = this.KWHzl.KWHzl();
                    }
                    pUU.KWHzl("qjf", "contentState isEmpty = " + taskDescription.AhwBna());
                    tNQ tnq = this.KWHzl.OLrzqt;
                    if (tnq != null && (c33546myW = tnq.isConnected) != null) {
                        c33546myW.AEQbTJ();
                    }
                    if (taskDescription.djBIcL()) {
                        this.KWHzl.AYXKKw().djBIcL(true);
                    }
                    if (taskDescription.valueOf()) {
                        this.KWHzl.AYXKKw().gEmmrt(true);
                    }
                    if (taskDescription.OLrzqt()) {
                        this.KWHzl.AYXKKw().AEQbTJ(true);
                    }
                    if (taskDescription.copydefault()) {
                        this.KWHzl.AYXKKw().KWHzl(true);
                    }
                    if (taskDescription.EZpvd()) {
                        this.KWHzl.AYXKKw().OLrzqt(true);
                    }
                    if (taskDescription.AEQbTJ()) {
                        this.KWHzl.AYXKKw().EZpvd(true);
                    }
                    boolean zGEmmrt = InterfaceC46387tSl.Companion.KWHzl().gEmmrt();
                    boolean z = (c47638ttrKWHzl.copydefault().AEQbTJ() && taskDescription.EZpvd() && zGEmmrt) || (c47638ttrKWHzl.EZpvd().AEQbTJ() && taskDescription.copydefault()) || ((c47638ttrKWHzl.AEQbTJ().AEQbTJ() && taskDescription.djBIcL()) || ((c47638ttrKWHzl.AYXKKw().AEQbTJ() && taskDescription.valueOf()) || ((c47638ttrKWHzl.valueOf().AEQbTJ() && taskDescription.OLrzqt()) || (c47638ttrKWHzl.OLrzqt().AEQbTJ() && taskDescription.AEQbTJ()))));
                    if (!taskDescription.AhwBna() && z) {
                        tNQ tnq2 = this.KWHzl.OLrzqt;
                        if (tnq2 != null) {
                            C47599ttE c47599ttE = this.KWHzl;
                            tnq2.KWHzl.setVisibility((c47638ttrKWHzl.copydefault().AEQbTJ() && c47599ttE.AYXKKw().AEQbTJ() && zGEmmrt) ? 0 : 8);
                            tnq2.gEmmrt.setVisibility((c47638ttrKWHzl.AEQbTJ().AEQbTJ() && c47599ttE.AYXKKw().djBIcL()) ? 0 : 8);
                            tnq2.AhwBna.setVisibility((c47638ttrKWHzl.AYXKKw().AEQbTJ() && c47599ttE.AYXKKw().valueOf()) ? 0 : 8);
                            tnq2.AEQbTJ.setVisibility((c47638ttrKWHzl.valueOf().AEQbTJ() && c47599ttE.AYXKKw().AYXKKw()) ? 0 : 8);
                            tnq2.OLrzqt.setVisibility((c47638ttrKWHzl.EZpvd().AEQbTJ() && c47599ttE.AYXKKw().EZpvd()) ? 0 : 8);
                            tnq2.EZpvd.setVisibility((c47638ttrKWHzl.OLrzqt().AEQbTJ() && c47599ttE.AYXKKw().KWHzl()) ? 0 : 8);
                        }
                        this.KWHzl.AYXKKw().copydefault(true);
                        tNQ tnq3 = this.KWHzl.OLrzqt;
                        if (tnq3 != null && (c55237xgE3 = tnq3.AYXKKw) != null) {
                            c55237xgE3.setStatus(StatefulView.Status.Content);
                        }
                        if (!this.KWHzl.KWHzl) {
                            this.KWHzl.KWHzl = true;
                            rVN.reportFullyDrawn$default((Fragment) this.KWHzl, true, (String) null, 2, (Object) null);
                        }
                    } else {
                        boolean zDjBIcL = c47638ttrKWHzl.djBIcL();
                        if (!this.KWHzl.AYXKKw().copydefault() || zDjBIcL) {
                            tNQ tnq4 = this.KWHzl.OLrzqt;
                            if (tnq4 != null && (c55237xgE2 = tnq4.AYXKKw) != null) {
                                c55237xgE2.setStatus(StatefulView.Status.Empty);
                            }
                            tNQ tnq5 = this.KWHzl.OLrzqt;
                            View viewAEQbTJ = (tnq5 == null || (c55237xgE = tnq5.AYXKKw) == null) ? null : c55237xgE.AEQbTJ(StatefulView.Status.Empty);
                            C55173xeu c55173xeu = viewAEQbTJ != null ? (C55173xeu) viewAEQbTJ.findViewById(C47501trL.TaskDescription.swzYdv) : null;
                            if (c55173xeu != null) {
                                final C47599ttE c47599ttE2 = this.KWHzl;
                                c55173xeu.setEmptyTypeImage(8);
                                c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.DCUTEIddSDPG));
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.run));
                                c55173xeu.setRetry(C33070mpX.AYXKKw(C47501trL.Fragment.AkhnZx));
                                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ttM
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        PlanetLeaderboardFragment$observeContentState$1.AnonymousClass1.C05941.AnonymousClass3.AEQbTJ(c47599ttE2, view);
                                    }
                                });
                            }
                        } else {
                            C55326xho.toastWithFailedIcon$default(C47501trL.Fragment.isConnected, 0, 1, (Object) null);
                        }
                        if (!this.KWHzl.KWHzl) {
                            this.KWHzl.KWHzl = true;
                            rVN.reportFullyDrawn$default((Fragment) this.KWHzl, true, (String) null, 2, (Object) null);
                        }
                    }
                    return Unit.INSTANCE;
                }

                public static final void AEQbTJ(C47599ttE c47599ttE, View view) {
                    c47599ttE.copydefault();
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C05941(this.this$0, null), 3, null);
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
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.CREATED;
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
        return Unit.INSTANCE;
    }
}
