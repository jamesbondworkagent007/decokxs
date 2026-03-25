package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC20923gpz;
import o.C13754dXa;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$9(ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$9> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMultiTransferInputAddressActivity$observeData$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$9$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC20923gpz this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC20923gpz activityC20923gpz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC20923gpz;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$9$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03241 extends SuspendLambda implements Function2<MultiTransferInputAddressViewModel.Companion.LoadingStatus, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC20923gpz this$0;

            /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$9$1$1$ActionBar */
            public final /* synthetic */ class ActionBar {
                public static final /* synthetic */ int[] AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[MultiTransferInputAddressViewModel.Companion.LoadingStatus.values().length];
                    try {
                        iArr[MultiTransferInputAddressViewModel.Companion.LoadingStatus.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MultiTransferInputAddressViewModel.Companion.LoadingStatus.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MultiTransferInputAddressViewModel.Companion.LoadingStatus.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    AEQbTJ = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03241(ActivityC20923gpz activityC20923gpz, Continuation<? super C03241> continuation) {
                super(2, continuation);
                this.this$0 = activityC20923gpz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03241 c03241 = new C03241(this.this$0, continuation);
                c03241.L$0 = obj;
                return c03241;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MultiTransferInputAddressViewModel.Companion.LoadingStatus loadingStatus, Continuation<? super Unit> continuation) {
                return ((C03241) create(loadingStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    int i = ActionBar.AEQbTJ[((MultiTransferInputAddressViewModel.Companion.LoadingStatus) this.L$0).ordinal()];
                    if (i == 1) {
                        this.this$0.showLoadingAtOnce();
                    } else if (i == 2) {
                        this.this$0.dismissLoading();
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.dismissLoading();
                        C55326xho.toast$default(C13754dXa.FragmentManager.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
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
                Flow<MultiTransferInputAddressViewModel.Companion.LoadingStatus> flowGEmmrt = this.this$0.AEQbTJ().gEmmrt();
                C03241 c03241 = new C03241(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowGEmmrt, c03241, this) == objCopydefault) {
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
            ActivityC20923gpz activityC20923gpz = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC20923gpz, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC20923gpz, state, anonymousClass1, this) == objCopydefault) {
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
