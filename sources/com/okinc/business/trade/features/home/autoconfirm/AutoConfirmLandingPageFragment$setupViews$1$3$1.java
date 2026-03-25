package com.okinc.business.trade.features.home.autoconfirm;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9762bbh;
import o.InterfaceC9855bdU;
import o.kTN;

/* JADX INFO: loaded from: classes15.dex */
public final class AutoConfirmLandingPageFragment$setupViews$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kTN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoConfirmLandingPageFragment$setupViews$1$3$1(kTN ktn, Continuation<? super AutoConfirmLandingPageFragment$setupViews$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = ktn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoConfirmLandingPageFragment$setupViews$1$3$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoConfirmLandingPageFragment$setupViews$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9855bdU interfaceC9855bdU = (InterfaceC9855bdU) C43251rlk.copydefault(InterfaceC9855bdU.class);
            FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            this.label = 1;
            obj = interfaceC9855bdU.AEQbTJ(parentFragmentManager, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9762bbh interfaceC9762bbh = (InterfaceC9762bbh) obj;
        if (Intrinsics.EZpvd(interfaceC9762bbh, InterfaceC9762bbh.TaskDescription.AEQbTJ)) {
            this.this$0.AEQbTJ(DexTrackEventParameter.ButtonName.ON.getValue());
            C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.IResultReceiverStub, 0, 1, (Object) null);
            this.this$0.KWHzl().EZpvd();
        } else if (interfaceC9762bbh instanceof InterfaceC9762bbh.StateListAnimator) {
            C55326xho.toastWithFailedIcon$default(((InterfaceC9762bbh.StateListAnimator) interfaceC9762bbh).OLrzqt(), 0, 1, (Object) null);
        } else if (!Intrinsics.EZpvd(interfaceC9762bbh, InterfaceC9762bbh.Application.OLrzqt)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
