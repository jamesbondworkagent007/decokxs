package com.okinc.business.defi.wallet.mpc;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$2;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC16309ehW;
import o.ActivityC17435fFf;
import o.C13754dXa;
import o.C33070mpX;
import o.C55173xeu;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapeMpcWalletAccountListActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17435fFf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapeMpcWalletAccountListActivity$onCreate$2(ActivityC17435fFf activityC17435fFf, Continuation<? super EscapeMpcWalletAccountListActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC17435fFf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapeMpcWalletAccountListActivity$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapeMpcWalletAccountListActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC17435fFf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17435fFf activityC17435fFf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17435fFf;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03051 extends SuspendLambda implements Function2<EscapeMpcWalletAccountListViewModel.RequestStatus, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC17435fFf this$0;

            /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$2$1$1$TaskDescription */
            public final /* synthetic */ class TaskDescription {
                public static final /* synthetic */ int[] OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[EscapeMpcWalletAccountListViewModel.RequestStatus.values().length];
                    try {
                        iArr[EscapeMpcWalletAccountListViewModel.RequestStatus.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EscapeMpcWalletAccountListViewModel.RequestStatus.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EscapeMpcWalletAccountListViewModel.RequestStatus.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    OLrzqt = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03051(ActivityC17435fFf activityC17435fFf, Continuation<? super C03051> continuation) {
                super(2, continuation);
                this.this$0 = activityC17435fFf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03051 c03051 = new C03051(this.this$0, continuation);
                c03051.L$0 = obj;
                return c03051;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EscapeMpcWalletAccountListViewModel.RequestStatus requestStatus, Continuation<? super Unit> continuation) {
                return ((C03051) create(requestStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C55173xeu c55173xeu;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    int i = TaskDescription.OLrzqt[((EscapeMpcWalletAccountListViewModel.RequestStatus) this.L$0).ordinal()];
                    AbstractC16309ehW abstractC16309ehW = null;
                    if (i == 1) {
                        AbstractC16309ehW abstractC16309ehW2 = this.this$0.EZpvd;
                        if (abstractC16309ehW2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16309ehW2 = null;
                        }
                        abstractC16309ehW2.copydefault.setStatus(StatefulView.Status.Loading);
                    } else if (i == 2) {
                        AbstractC16309ehW abstractC16309ehW3 = this.this$0.EZpvd;
                        if (abstractC16309ehW3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16309ehW3 = null;
                        }
                        abstractC16309ehW3.copydefault.setStatus(StatefulView.Status.Content);
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (i == 3) {
                        AbstractC16309ehW abstractC16309ehW4 = this.this$0.EZpvd;
                        if (abstractC16309ehW4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16309ehW4 = null;
                        }
                        C55237xgE c55237xgE = abstractC16309ehW4.copydefault;
                        StatefulView.Status status = StatefulView.Status.Error;
                        c55237xgE.setStatus(status);
                        AbstractC16309ehW abstractC16309ehW5 = this.this$0.EZpvd;
                        if (abstractC16309ehW5 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16309ehW5 = null;
                        }
                        View viewAEQbTJ = abstractC16309ehW5.copydefault.AEQbTJ(status);
                        if (viewAEQbTJ != null && (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C13754dXa.ActionBar.setMediaButtonReceiver)) != null) {
                            final ActivityC17435fFf activityC17435fFf = this.this$0;
                            c55173xeu.setEmptyTypeImage(6);
                            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendQueue));
                            c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.skipToNext));
                            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fFv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    EscapeMpcWalletAccountListActivity$onCreate$2.AnonymousClass1.C03051.invokeSuspend$lambda$1$lambda$0(activityC17435fFf, view);
                                }
                            });
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC16309ehW abstractC16309ehW6 = this.this$0.EZpvd;
                    if (abstractC16309ehW6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16309ehW = abstractC16309ehW6;
                    }
                    abstractC16309ehW.AEQbTJ.setVisibility(8);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$1$lambda$0(ActivityC17435fFf activityC17435fFf, View view) {
                activityC17435fFf.AEQbTJ().EZpvd(activityC17435fFf.AhwBna);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<EscapeMpcWalletAccountListViewModel.RequestStatus> flowEZpvd = this.this$0.AEQbTJ().EZpvd();
                C03051 c03051 = new C03051(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowEZpvd, c03051, this) == objCopydefault) {
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
            ActivityC17435fFf activityC17435fFf = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC17435fFf, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC17435fFf, state, anonymousClass1, this) == objCopydefault) {
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
