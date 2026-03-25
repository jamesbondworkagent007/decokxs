package com.okinc.business.defi.wallet.imported;

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
import o.ActivityC18418fhy;
import o.C13754dXa;
import o.C19605gIo;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletSelectNetworkActivity$onCreate$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18418fhy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletSelectNetworkActivity$onCreate$6(ActivityC18418fhy activityC18418fhy, Continuation<? super DefiWalletSelectNetworkActivity$onCreate$6> continuation) {
        super(2, continuation);
        this.this$0 = activityC18418fhy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletSelectNetworkActivity$onCreate$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletSelectNetworkActivity$onCreate$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$onCreate$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18418fhy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18418fhy activityC18418fhy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18418fhy;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Result<AddressCheckRes>> flowEZpvd = this.this$0.AhwBna().EZpvd();
                final ActivityC18418fhy activityC18418fhy = this.this$0;
                FlowCollector<? super Result<AddressCheckRes>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity.onCreate.6.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        String string;
                        Object objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                        ActivityC18418fhy activityC18418fhy2 = activityC18418fhy;
                        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                            AddressCheckRes addressCheckRes = (AddressCheckRes) objM7386unboximpl;
                            if (addressCheckRes.KWHzl()) {
                                activityC18418fhy2.dismissLoading();
                                activityC18418fhy2.copydefault(addressCheckRes.copydefault(), addressCheckRes.OLrzqt());
                            } else {
                                activityC18418fhy2.dismissLoading();
                            }
                        }
                        ActivityC18418fhy activityC18418fhy3 = activityC18418fhy;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ(activityC18418fhy3.getTAG(), "addressCheckResultEvent", thM7380exceptionOrNullimpl);
                            activityC18418fhy3.dismissLoading();
                            if (!(thM7380exceptionOrNullimpl instanceof OKServerException) || ((OKServerException) thM7380exceptionOrNullimpl).getOrigin() != null) {
                                string = activityC18418fhy3.getString(C13754dXa.FragmentManager.OHqIaq);
                            } else {
                                string = thM7380exceptionOrNullimpl.getMessage();
                                if (string == null) {
                                    string = activityC18418fhy3.getString(C13754dXa.FragmentManager.ODXsMY);
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                }
                            }
                            Intrinsics.copydefault((Object) string);
                            C19605gIo.OLrzqt(activityC18418fhy3, string, 2000);
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
            ActivityC18418fhy activityC18418fhy = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18418fhy, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18418fhy, state, anonymousClass1, this) == objCopydefault) {
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
