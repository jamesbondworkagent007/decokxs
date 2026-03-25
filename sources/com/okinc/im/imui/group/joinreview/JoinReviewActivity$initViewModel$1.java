package com.okinc.im.imui.group.joinreview;

import android.app.Activity;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1;
import com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33850nId;
import o.ActivityC34183nUn;
import o.C44157sFk;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nUF;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class JoinReviewActivity$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC34183nUn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinReviewActivity$initViewModel$1(ActivityC34183nUn activityC34183nUn, Continuation<? super JoinReviewActivity$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC34183nUn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JoinReviewActivity$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JoinReviewActivity$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC34183nUn this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC34183nUn activityC34183nUn, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC34183nUn;
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

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC34183nUn this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04251(ActivityC34183nUn activityC34183nUn, Continuation<? super C04251> continuation) {
                super(2, continuation);
                this.this$0 = activityC34183nUn;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04251(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04261 extends SuspendLambda implements Function2<JoinReviewViewModel.Application, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ActivityC34183nUn this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04261(ActivityC34183nUn activityC34183nUn, Continuation<? super C04261> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC34183nUn;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04261 c04261 = new C04261(this.this$0, continuation);
                    c04261.L$0 = obj;
                    return c04261;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(JoinReviewViewModel.Application application, Continuation<? super Unit> continuation) {
                    return ((C04261) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        JoinReviewViewModel.Application application = (JoinReviewViewModel.Application) this.L$0;
                        this.this$0.DbNXlk();
                        T tKWHzl = this.this$0.KWHzl();
                        ActivityC34183nUn activityC34183nUn = this.this$0;
                        AbstractC33850nId abstractC33850nId = (AbstractC33850nId) tKWHzl;
                        if (application instanceof JoinReviewViewModel.Application.StateListAnimator) {
                            C55113xdn c55113xdn = abstractC33850nId.gEmmrt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(0);
                            C55173xeu c55173xeu = abstractC33850nId.valueOf;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                            C55173xeu c55173xeu2 = abstractC33850nId.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(8);
                            FragmentContainerView fragmentContainerView = abstractC33850nId.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
                            activityC34183nUn.EZpvd(fragmentContainerView);
                        } else if (application instanceof JoinReviewViewModel.Application.Activity) {
                            FragmentContainerView fragmentContainerView2 = abstractC33850nId.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
                            activityC34183nUn.copydefault(fragmentContainerView2);
                            C55113xdn c55113xdn2 = abstractC33850nId.gEmmrt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                            C55173xeu c55173xeu3 = abstractC33850nId.valueOf;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            C55173xeu c55173xeu4 = abstractC33850nId.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                            c55173xeu4.setVisibility(8);
                            rVN.reportFullyDrawn$default((Activity) activityC34183nUn, true, (String) null, 2, (Object) null);
                        } else if (application instanceof JoinReviewViewModel.Application.TaskDescription) {
                            C55173xeu c55173xeu5 = abstractC33850nId.valueOf;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu5, "");
                            c55173xeu5.setVisibility(0);
                            C55113xdn c55113xdn3 = abstractC33850nId.gEmmrt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                            C55173xeu c55173xeu6 = abstractC33850nId.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu6, "");
                            c55173xeu6.setVisibility(8);
                            FragmentContainerView fragmentContainerView3 = abstractC33850nId.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(fragmentContainerView3, "");
                            activityC34183nUn.EZpvd(fragmentContainerView3);
                            rVN.reportFullyDrawn$default((Activity) activityC34183nUn, true, (String) null, 2, (Object) null);
                        } else {
                            if (!(application instanceof JoinReviewViewModel.Application.C0434Application)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55173xeu c55173xeu7 = abstractC33850nId.AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu7, "");
                            c55173xeu7.setVisibility(0);
                            C55173xeu c55173xeu8 = abstractC33850nId.AhwBna;
                            String strCopydefault = C44157sFk.copydefault(((JoinReviewViewModel.Application.C0434Application) application).KWHzl());
                            if (strCopydefault == null) {
                                strCopydefault = "";
                            }
                            c55173xeu8.setSubTitle((CharSequence) strCopydefault);
                            C55113xdn c55113xdn4 = abstractC33850nId.gEmmrt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                            c55113xdn4.setVisibility(8);
                            C55173xeu c55173xeu9 = abstractC33850nId.valueOf;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu9, "");
                            c55173xeu9.setVisibility(8);
                            FragmentContainerView fragmentContainerView4 = abstractC33850nId.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(fragmentContainerView4, "");
                            fragmentContainerView4.setVisibility(8);
                            rVN.reportFullyDrawn$default((Activity) activityC34183nUn, false, (String) null, 2, (Object) null);
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
                    StateFlow<JoinReviewViewModel.Application> stateFlowGEmmrt = this.this$0.isConnected().gEmmrt();
                    C04261 c04261 = new C04261(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowGEmmrt, c04261, this) == objCopydefault) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C04251(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC34183nUn this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ActivityC34183nUn activityC34183nUn, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = activityC34183nUn;
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow<JoinReviewViewModel.ActionBar> sharedFlowAhwBna = this.this$0.isConnected().AhwBna();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
                    this.label = 1;
                    if (sharedFlowAhwBna.collect(anonymousClass4, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$2$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements FlowCollector {
                public final /* synthetic */ ActivityC34183nUn AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4(ActivityC34183nUn activityC34183nUn) {
                    this.AEQbTJ = activityC34183nUn;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(JoinReviewViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
                    if (actionBar instanceof JoinReviewViewModel.ActionBar.Activity) {
                        OKAlertBanner oKAlertBanner = ((AbstractC33850nId) this.AEQbTJ.KWHzl()).copydefault;
                        Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
                        oKAlertBanner.setVisibility(0);
                    } else if (actionBar instanceof JoinReviewViewModel.ActionBar.StateListAnimator) {
                        OKAlertBanner oKAlertBanner2 = ((AbstractC33850nId) this.AEQbTJ.KWHzl()).copydefault;
                        Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
                        oKAlertBanner2.setVisibility(8);
                    } else if (actionBar instanceof JoinReviewViewModel.ActionBar.C0433ActionBar) {
                        ActivityC34183nUn activityC34183nUn = this.AEQbTJ;
                        activityC34183nUn.EZpvd(activityC34183nUn.isConnected().EZpvd());
                    } else if (actionBar instanceof JoinReviewViewModel.ActionBar.Application) {
                        this.AEQbTJ.AhwBna();
                    } else if (actionBar instanceof JoinReviewViewModel.ActionBar.Fragment) {
                        nUF nuf = nUF.KWHzl;
                        ActivityC34183nUn activityC34183nUn2 = this.AEQbTJ;
                        JoinReviewViewModel.ActionBar.Fragment fragment = (JoinReviewViewModel.ActionBar.Fragment) actionBar;
                        String strAEQbTJ = fragment.AEQbTJ();
                        Map<GroupActionFailReason, List<String>> mapKWHzl = fragment.KWHzl();
                        final ActivityC34183nUn activityC34183nUn3 = this.AEQbTJ;
                        nuf.copydefault(activityC34183nUn2, strAEQbTJ, mapKWHzl, new Function0() { // from class: o.nUr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return JoinReviewActivity$initViewModel$1.AnonymousClass1.AnonymousClass2.AnonymousClass4.EZpvd(activityC34183nUn3);
                            }
                        });
                    } else if (actionBar instanceof JoinReviewViewModel.ActionBar.TaskDescription) {
                        this.AEQbTJ.djBIcL();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }

                public static final Unit EZpvd(ActivityC34183nUn activityC34183nUn) {
                    JoinReviewViewModel.refreshJoinRequests$default(activityC34183nUn.isConnected(), false, 1, null);
                    return Unit.INSTANCE;
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ActivityC34183nUn this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ActivityC34183nUn activityC34183nUn, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = activityC34183nUn;
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

            /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.JoinReviewActivity$initViewModel$1$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C04271 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ ActivityC34183nUn this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04271(ActivityC34183nUn activityC34183nUn, Continuation<? super C04271> continuation) {
                    super(2, continuation);
                    this.this$0 = activityC34183nUn;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C04271(this.this$0, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C04271) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.DbNXlk();
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
                    StateFlow<Boolean> stateFlowFJNWhG = this.this$0.isConnected().fJNWhG();
                    C04271 c04271 = new C04271(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowFJNWhG, c04271, this) == objCopydefault) {
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
            ActivityC34183nUn activityC34183nUn = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC34183nUn, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC34183nUn, state, anonymousClass1, this) == objCopydefault) {
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
