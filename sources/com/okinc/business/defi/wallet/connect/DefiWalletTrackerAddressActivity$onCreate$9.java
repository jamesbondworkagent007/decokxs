package com.okinc.business.defi.wallet.connect;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.AddressCheckRes;
import com.okinc.network.okg.response.OKServerException;
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
import o.C13754dXa;
import o.C16297ehK;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressActivity$onCreate$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16297ehK $binding;
    int label;
    final /* synthetic */ ActivityC16031ecJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressActivity$onCreate$9(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super DefiWalletTrackerAddressActivity$onCreate$9> continuation) {
        super(2, continuation);
        this.this$0 = activityC16031ecJ;
        this.$binding = c16297ehK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressActivity$onCreate$9(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressActivity$onCreate$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$9$1, reason: invalid class name */
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
                Flow<Result<AddressCheckRes>> flowEZpvd = this.this$0.OLrzqt().EZpvd();
                final ActivityC16031ecJ activityC16031ecJ = this.this$0;
                final C16297ehK c16297ehK = this.$binding;
                FlowCollector<? super Result<AddressCheckRes>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity.onCreate.9.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                        ActivityC16031ecJ activityC16031ecJ2 = activityC16031ecJ;
                        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                            AddressCheckRes addressCheckRes = (AddressCheckRes) objM7386unboximpl;
                            if (addressCheckRes.KWHzl()) {
                                activityC16031ecJ2.dismissLoading();
                                activityC16031ecJ2.AYXKKw().KWHzl(addressCheckRes.copydefault(), addressCheckRes.OLrzqt());
                            } else {
                                activityC16031ecJ2.dismissLoading();
                            }
                        }
                        ActivityC16031ecJ activityC16031ecJ3 = activityC16031ecJ;
                        C16297ehK c16297ehK2 = c16297ehK;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("DefiWalletTrackerAddressActivity", "addressCheckResultEvent", thM7380exceptionOrNullimpl);
                            activityC16031ecJ3.dismissLoading();
                            TextView textView = c16297ehK2.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            textView.setVisibility(0);
                            if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                                if (((OKServerException) thM7380exceptionOrNullimpl).getOrigin() != null) {
                                    c16297ehK2.AEQbTJ.setText(C13754dXa.FragmentManager.OHqIaq);
                                } else {
                                    TextView textView2 = c16297ehK2.AEQbTJ;
                                    String message = thM7380exceptionOrNullimpl.getMessage();
                                    if (message == null) {
                                        message = activityC16031ecJ3.getString(C13754dXa.FragmentManager.ODXsMY);
                                        Intrinsics.checkNotNullExpressionValue(message, "");
                                    }
                                    textView2.setText(message);
                                }
                            } else {
                                TextView textView3 = c16297ehK2.AEQbTJ;
                                String message2 = thM7380exceptionOrNullimpl.getMessage();
                                if (message2 == null) {
                                    message2 = activityC16031ecJ3.getString(C13754dXa.FragmentManager.OHqIaq);
                                    Intrinsics.checkNotNullExpressionValue(message2, "");
                                }
                                textView3.setText(message2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
