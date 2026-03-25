package com.okinc.planet.biz_onboarding;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC47938tzZ;
import o.C45892tAc;
import o.C45895tAf;
import o.C46221tMh;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class FollowTopOrbitersActivity$observe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC47938tzZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowTopOrbitersActivity$observe$1(ActivityC47938tzZ activityC47938tzZ, Continuation<? super FollowTopOrbitersActivity$observe$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC47938tzZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FollowTopOrbitersActivity$observe$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FollowTopOrbitersActivity$observe$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC47938tzZ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC47938tzZ activityC47938tzZ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC47938tzZ;
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47938tzZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06111(ActivityC47938tzZ activityC47938tzZ, Continuation<? super C06111> continuation) {
                super(2, continuation);
                this.this$0 = activityC47938tzZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06111(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06121 extends SuspendLambda implements Function2<C45895tAf.StateListAnimator, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC47938tzZ this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06121(ActivityC47938tzZ activityC47938tzZ, Continuation<? super C06121> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47938tzZ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06121 c06121 = new C06121(this.this$0, continuation);
                    c06121.L$0 = obj;
                    return c06121;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C45895tAf.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                    return ((C06121) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C45895tAf.StateListAnimator stateListAnimator = (C45895tAf.StateListAnimator) this.L$0;
                        C46221tMh c46221tMhOLrzqt = this.this$0.OLrzqt();
                        if (c46221tMhOLrzqt != null) {
                            ActivityC47938tzZ activityC47938tzZ = this.this$0;
                            if (stateListAnimator instanceof C45895tAf.StateListAnimator.C0954StateListAnimator) {
                                C55113xdn c55113xdn = c46221tMhOLrzqt.AYXKKw;
                                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                                c55113xdn.setVisibility(0);
                                c46221tMhOLrzqt.AYXKKw.playAnimation();
                                RecyclerView recyclerView = c46221tMhOLrzqt.AhwBna;
                                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                                recyclerView.setVisibility(8);
                                C55173xeu c55173xeu = c46221tMhOLrzqt.KWHzl;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                                c55173xeu.setVisibility(8);
                            } else if (stateListAnimator instanceof C45895tAf.StateListAnimator.ActionBar) {
                                c46221tMhOLrzqt.AYXKKw.cancelAnimation();
                                C55113xdn c55113xdn2 = c46221tMhOLrzqt.AYXKKw;
                                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                                c55113xdn2.setVisibility(8);
                                RecyclerView recyclerView2 = c46221tMhOLrzqt.AhwBna;
                                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                                recyclerView2.setVisibility(8);
                                C55173xeu c55173xeu2 = c46221tMhOLrzqt.KWHzl;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                                c55173xeu2.setVisibility(0);
                                if (!activityC47938tzZ.AEQbTJ) {
                                    activityC47938tzZ.AEQbTJ = true;
                                    rVN.reportFullyDrawn$default((Activity) activityC47938tzZ, false, (String) null, 2, (Object) null);
                                }
                            } else {
                                if (!(stateListAnimator instanceof C45895tAf.StateListAnimator.Application)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c46221tMhOLrzqt.AYXKKw.cancelAnimation();
                                C55113xdn c55113xdn3 = c46221tMhOLrzqt.AYXKKw;
                                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                                c55113xdn3.setVisibility(8);
                                C55173xeu c55173xeu3 = c46221tMhOLrzqt.KWHzl;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                                c55173xeu3.setVisibility(8);
                                RecyclerView recyclerView3 = c46221tMhOLrzqt.AhwBna;
                                Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                                recyclerView3.setVisibility(0);
                                C45892tAc c45892tAc = activityC47938tzZ.EZpvd;
                                if (c45892tAc == null) {
                                    Intrinsics.gEmmrt("");
                                    c45892tAc = null;
                                }
                                c45892tAc.submitList(((C45895tAf.StateListAnimator.Application) stateListAnimator).AEQbTJ());
                                if (!activityC47938tzZ.AEQbTJ) {
                                    activityC47938tzZ.AEQbTJ = true;
                                    rVN.reportFullyDrawn$default((Activity) activityC47938tzZ, true, (String) null, 2, (Object) null);
                                }
                            }
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
                    StateFlow<C45895tAf.StateListAnimator> stateFlowAEQbTJ = this.this$0.copydefault().AEQbTJ();
                    C06121 c06121 = new C06121(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowAEQbTJ, c06121, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C06111(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47938tzZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ActivityC47938tzZ activityC47938tzZ, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = activityC47938tzZ;
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

            /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C06131 extends SuspendLambda implements Function2<Set<? extends String>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC47938tzZ this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06131(ActivityC47938tzZ activityC47938tzZ, Continuation<? super C06131> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47938tzZ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06131 c06131 = new C06131(this.this$0, continuation);
                    c06131.L$0 = obj;
                    return c06131;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, Continuation<? super Unit> continuation) {
                    return invoke2((Set<String>) set, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Set<String> set, Continuation<? super Unit> continuation) {
                    return ((C06131) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        Set<String> set = (Set) this.L$0;
                        C45892tAc c45892tAc = this.this$0.EZpvd;
                        if (c45892tAc == null) {
                            Intrinsics.gEmmrt("");
                            c45892tAc = null;
                        }
                        c45892tAc.KWHzl(set);
                        this.this$0.copydefault(set.size());
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
                    StateFlow<Set<String>> stateFlowEZpvd = this.this$0.copydefault().EZpvd();
                    C06131 c06131 = new C06131(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowEZpvd, c06131, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47938tzZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ActivityC47938tzZ activityC47938tzZ, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = activityC47938tzZ;
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

            /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C06141 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ ActivityC47938tzZ this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06141(ActivityC47938tzZ activityC47938tzZ, Continuation<? super C06141> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47938tzZ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06141 c06141 = new C06141(this.this$0, continuation);
                    c06141.Z$0 = ((Boolean) obj).booleanValue();
                    return c06141;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C06141) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C52794wYp c52794wYp;
                    C52794wYp c52794wYp2;
                    C52794wYp c52794wYp3;
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        boolean z = this.Z$0;
                        C46221tMh c46221tMhOLrzqt = this.this$0.OLrzqt();
                        if (c46221tMhOLrzqt != null && (c52794wYp3 = c46221tMhOLrzqt.OLrzqt) != null) {
                            if (!z) {
                                boolean z2 = this.this$0.copydefault().EZpvd().getValue().isEmpty() ^ true;
                                c52794wYp3.setEnabled(z2);
                            }
                        }
                        if (z) {
                            C46221tMh c46221tMhOLrzqt2 = this.this$0.OLrzqt();
                            if (c46221tMhOLrzqt2 != null && (c52794wYp2 = c46221tMhOLrzqt2.OLrzqt) != null) {
                                c52794wYp2.OLrzqt(0L);
                            }
                        } else {
                            C46221tMh c46221tMhOLrzqt3 = this.this$0.OLrzqt();
                            if (c46221tMhOLrzqt3 != null && (c52794wYp = c46221tMhOLrzqt3.OLrzqt) != null) {
                                c52794wYp.fIwbmz();
                            }
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
                    StateFlow<Boolean> stateFlowKWHzl = this.this$0.copydefault().KWHzl();
                    C06141 c06141 = new C06141(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowKWHzl, c06141, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC47938tzZ this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityC47938tzZ activityC47938tzZ, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityC47938tzZ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1$1$4$1, reason: invalid class name and collision with other inner class name */
            public static final class C06151 extends SuspendLambda implements Function2<C45895tAf.Activity, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC47938tzZ this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06151(ActivityC47938tzZ activityC47938tzZ, Continuation<? super C06151> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC47938tzZ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06151 c06151 = new C06151(this.this$0, continuation);
                    c06151.L$0 = obj;
                    return c06151;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(C45895tAf.Activity activity, Continuation<? super Unit> continuation) {
                    return ((C06151) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C45895tAf.Activity activity = (C45895tAf.Activity) this.L$0;
                        if (activity instanceof C45895tAf.Activity.C0953Activity) {
                            this.this$0.finish();
                        } else if (activity instanceof C45895tAf.Activity.TaskDescription) {
                            this.this$0.KWHzl();
                        } else {
                            if (!(activity instanceof C45895tAf.Activity.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.this$0.finish();
                            this.this$0.AEQbTJ();
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
                    SharedFlow<C45895tAf.Activity> sharedFlowCopydefault = this.this$0.copydefault().copydefault();
                    C06151 c06151 = new C06151(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlowCopydefault, c06151, this) == objCopydefault) {
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
            ActivityC47938tzZ activityC47938tzZ = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC47938tzZ, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC47938tzZ, state, anonymousClass1, this) == objCopydefault) {
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
