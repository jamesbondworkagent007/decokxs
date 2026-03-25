package com.okinc.business.defi.wallet.connect;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.AAAddressCheck;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActivityC16031ecJ;
import o.ActivityC18418fhy;
import o.C13754dXa;
import o.C16297ehK;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressActivity$onCreate$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16297ehK $binding;
    int label;
    final /* synthetic */ ActivityC16031ecJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressActivity$onCreate$11(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super DefiWalletTrackerAddressActivity$onCreate$11> continuation) {
        super(2, continuation);
        this.this$0 = activityC16031ecJ;
        this.$binding = c16297ehK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressActivity$onCreate$11(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressActivity$onCreate$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$11$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C16297ehK $binding;
        int label;
        final /* synthetic */ ActivityC16031ecJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC16031ecJ;
            this.$binding = c16297ehK;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Result<AAAddressCheck>> flowCopydefault = this.this$0.OLrzqt().copydefault();
                final ActivityC16031ecJ activityC16031ecJ = this.this$0;
                final C16297ehK c16297ehK = this.$binding;
                FlowCollector<? super Result<AAAddressCheck>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity.onCreate.11.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                        ActivityC16031ecJ activityC16031ecJ2 = activityC16031ecJ;
                        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                            AAAddressCheck aAAddressCheck = (AAAddressCheck) objM7386unboximpl;
                            ActivityC18418fhy.Companion.OLrzqt(activityC16031ecJ2, (784 & 2) != 0 ? "" : aAAddressCheck.OLrzqt(), (784 & 4) != 0 ? "" : null, (784 & 8) != 0 ? "" : null, (784 & 16) == 0 ? null : "", (784 & 32) != 0 ? 1 : 0, (784 & 64) != 0 ? false : aAAddressCheck.copydefault(), (784 & 128) == 0 ? false : false, (784 & 256) != 0 ? null : null, (784 & 512) == 0 ? null : null);
                        }
                        C16297ehK c16297ehK2 = c16297ehK;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.KWHzl("DefiWalletTrackerAddressActivity", "aaAddressCheckResultEvent", thM7380exceptionOrNullimpl);
                            TextView textView = c16297ehK2.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            textView.setVisibility(0);
                            c16297ehK2.AEQbTJ.setText(C13754dXa.FragmentManager.OHqIaq);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC16031ecJ activityC16031ecJ = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC16031ecJ, this.$binding, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC16031ecJ, state, anonymousClass1, this) == objCopydefault) {
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
