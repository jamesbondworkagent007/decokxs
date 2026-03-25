package com.okinc.business.defi.wallet.tee.review.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$3;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16363eiX;
import o.C13754dXa;
import o.C17922fXg;
import o.C32866mlf;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.fVU;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$3(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$3> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ fVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fVU fvu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fvu;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03151 extends SuspendLambda implements Function2<ReNewEnableViewModel.Activity, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fVU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03151(fVU fvu, Continuation<? super C03151> continuation) {
                super(2, continuation);
                this.this$0 = fvu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03151 c03151 = new C03151(this.this$0, continuation);
                c03151.L$0 = obj;
                return c03151;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReNewEnableViewModel.Activity activity, Continuation<? super Unit> continuation) {
                return ((C03151) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ConstraintLayout constraintLayout;
                ConstraintLayout constraintLayout2;
                ConstraintLayout constraintLayout3;
                C52794wYp c52794wYp;
                TeeMetadata value;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ReNewEnableViewModel.Activity activity = (ReNewEnableViewModel.Activity) this.L$0;
                    if (activity == null) {
                        return Unit.INSTANCE;
                    }
                    boolean z = false;
                    if (activity instanceof ReNewEnableViewModel.Activity.StateListAnimator) {
                        this.this$0.showLoadingWithLogo();
                    } else if (activity instanceof ReNewEnableViewModel.Activity.Fragment) {
                        this.this$0.finish();
                    } else if (activity instanceof ReNewEnableViewModel.Activity.TaskDescription) {
                        AbstractC16363eiX abstractC16363eiX = this.this$0.gEmmrt;
                        if (abstractC16363eiX != null && (constraintLayout3 = abstractC16363eiX.uzCIH) != null) {
                            constraintLayout3.setVisibility(0);
                        }
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_Page_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fWf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$3.AnonymousClass1.C03151.invokeSuspend$lambda$0((EventParamsList) obj2);
                            }
                        }, 1, (Object) null);
                        this.this$0.EZpvd((ReNewEnableViewModel.Activity.TaskDescription) activity);
                    } else if (activity instanceof ReNewEnableViewModel.Activity.ActionBar) {
                        AbstractC16363eiX abstractC16363eiX2 = this.this$0.gEmmrt;
                        if (abstractC16363eiX2 != null && (constraintLayout2 = abstractC16363eiX2.uzCIH) != null) {
                            constraintLayout2.setVisibility(0);
                        }
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_Page_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fWe
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$3.AnonymousClass1.C03151.invokeSuspend$lambda$1((EventParamsList) obj2);
                            }
                        }, 1, (Object) null);
                        this.this$0.EZpvd((ReNewEnableViewModel.Activity.ActionBar) activity);
                    } else if (activity instanceof ReNewEnableViewModel.Activity.C0321Activity) {
                        AbstractC16363eiX abstractC16363eiX3 = this.this$0.gEmmrt;
                        if (abstractC16363eiX3 != null && (constraintLayout = abstractC16363eiX3.uzCIH) != null) {
                            constraintLayout.setVisibility(0);
                        }
                        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_Page_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fWl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return ReNewEnableActivity$observeViewModelState$3.AnonymousClass1.C03151.invokeSuspend$lambda$2((EventParamsList) obj2);
                            }
                        }, 1, (Object) null);
                        this.this$0.OLrzqt((ReNewEnableViewModel.Activity.C0321Activity) activity);
                    } else if (activity instanceof ReNewEnableViewModel.Activity.Application) {
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.QVMIlxQVMIlx, 0, 1, (Object) null);
                        this.this$0.finish();
                    }
                    AbstractC16363eiX abstractC16363eiX4 = this.this$0.gEmmrt;
                    if (abstractC16363eiX4 != null && (c52794wYp = abstractC16363eiX4.copydefault) != null) {
                        if (!this.this$0.gEmmrt().isConnected().getValue().booleanValue() && ((value = this.this$0.gEmmrt().fetchVPNInfo().getValue()) == null || C17922fXg.EZpvd(value) != 1)) {
                            z = true;
                        }
                        c52794wYp.setEnabled(z);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(EventParamsList eventParamsList) {
                EventParamsList.put$default(eventParamsList, "tee_status", "expiring", false, 4, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(EventParamsList eventParamsList) {
                EventParamsList.put$default(eventParamsList, "tee_status", "enable", false, 4, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(EventParamsList eventParamsList) {
                EventParamsList.put$default(eventParamsList, "tee_status", "disabled", false, 4, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<ReNewEnableViewModel.Activity> stateFlowValueOf = this.this$0.gEmmrt().valueOf();
                C03151 c03151 = new C03151(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowValueOf, c03151, this) == objCopydefault) {
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
