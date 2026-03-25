package com.okinc.business.defi.wallet.mine.checkversion.ui;

import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.model.SupportService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18813fpW;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.C6811aWS;
import o.InterfaceC6804aWL;
import o.InterfaceC6817aWY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C18813fpW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1(C18813fpW c18813fpW, Continuation<? super WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = c18813fpW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1 walletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1 = new WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1(this.this$0, continuation);
        walletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1.L$0 = obj;
        return walletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentActivity fragmentActivity;
        C18813fpW c18813fpW;
        FragmentActivity fragmentActivity2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        FragmentActivity fragmentActivity3 = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18813fpW c18813fpW2 = this.this$0;
            Result.Application application2 = Result.Companion;
            FragmentActivity activity = c18813fpW2.getActivity();
            if (activity != null) {
                C6811aWS c6811aWS = new C6811aWS("web3_user_center_support", null, null, null, 14, null);
                InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43248rlh.KWHzl.AEQbTJ(InterfaceC6804aWL.class);
                this.L$0 = c18813fpW2;
                this.L$1 = activity;
                this.L$2 = activity;
                this.label = 1;
                Object objAEQbTJ = interfaceC6804aWL.AEQbTJ(c6811aWS, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                fragmentActivity = activity;
                c18813fpW = c18813fpW2;
                obj = objAEQbTJ;
                fragmentActivity2 = fragmentActivity;
            }
            Result.m7377constructorimpl(fragmentActivity3);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FragmentActivity fragmentActivity4 = (FragmentActivity) this.L$1;
            c18813fpW = (C18813fpW) this.L$0;
            C56391yDq.AEQbTJ(obj);
            fragmentActivity3 = fragmentActivity4;
            c18813fpW.dismissAllowingStateLoss();
            Result.m7377constructorimpl(fragmentActivity3);
            return Unit.INSTANCE;
        }
        FragmentActivity fragmentActivity5 = (FragmentActivity) this.L$2;
        FragmentActivity fragmentActivity6 = (FragmentActivity) this.L$1;
        C18813fpW c18813fpW3 = (C18813fpW) this.L$0;
        C56391yDq.AEQbTJ(obj);
        fragmentActivity2 = fragmentActivity5;
        c18813fpW = c18813fpW3;
        fragmentActivity = fragmentActivity6;
        InterfaceC6817aWY serviceAction = ((SupportService) obj).getServiceAction();
        this.L$0 = c18813fpW;
        this.L$1 = fragmentActivity;
        this.L$2 = null;
        this.label = 2;
        if (serviceAction.OLrzqt(fragmentActivity2, this) == objCopydefault) {
            return objCopydefault;
        }
        fragmentActivity3 = fragmentActivity;
        c18813fpW.dismissAllowingStateLoss();
        Result.m7377constructorimpl(fragmentActivity3);
        return Unit.INSTANCE;
    }
}
