package com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.auth.api.passkey.PasskeyAuthenticateScenarioRequest;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalUpdateInfoResult;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.fMR;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class UpdateInfoFragment$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fMR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInfoFragment$onCreate$2(fMR fmr, Continuation<? super UpdateInfoFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = fmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateInfoFragment$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateInfoFragment$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.fragment.UpdateInfoFragment$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends PasskeyWalletCreateUopRes>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fMR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fMR fmr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends PasskeyWalletCreateUopRes> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strAYXKKw;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    pUU.copydefault("UpdateInfoFragment", "authenticate");
                    ActivityResultLauncher activityResultLauncher = this.this$0.KWHzl;
                    PasskeyScenario.CedefiWallet cedefiWallet = new PasskeyScenario.CedefiWallet(null, false, 3, null);
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    activityResultLauncher.launch(new PasskeyAuthenticateScenarioRequest(cedefiWallet, true, ((PasskeyWalletCreateUopRes) objM7386unboximpl).getServerOption()));
                } else {
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        fMR fmr = this.this$0;
                        if (!(thM7380exceptionOrNullimpl instanceof OKServerException) || (strAYXKKw = thM7380exceptionOrNullimpl.getMessage()) == null) {
                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty);
                        }
                        fmr.AEQbTJ(new InternalUpdateInfoResult.Failed(strAYXKKw));
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
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.OLrzqt().copydefault());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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
