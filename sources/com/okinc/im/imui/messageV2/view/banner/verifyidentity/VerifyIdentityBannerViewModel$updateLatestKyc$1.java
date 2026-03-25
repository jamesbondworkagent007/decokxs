package com.okinc.im.imui.messageV2.view.banner.verifyidentity;

import com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C35799oEc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class VerifyIdentityBannerViewModel$updateLatestKyc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VerifyIdentityBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyIdentityBannerViewModel$updateLatestKyc$1(VerifyIdentityBannerViewModel verifyIdentityBannerViewModel, Continuation<? super VerifyIdentityBannerViewModel$updateLatestKyc$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyIdentityBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyIdentityBannerViewModel$updateLatestKyc$1 verifyIdentityBannerViewModel$updateLatestKyc$1 = new VerifyIdentityBannerViewModel$updateLatestKyc$1(this.this$0, continuation);
        verifyIdentityBannerViewModel$updateLatestKyc$1.L$0 = obj;
        return verifyIdentityBannerViewModel$updateLatestKyc$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyIdentityBannerViewModel$updateLatestKyc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            VerifyIdentityBannerViewModel verifyIdentityBannerViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            oDZ odz = verifyIdentityBannerViewModel.EZpvd;
            this.label = 1;
            obj = odz.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = C56443yFo.KWHzl(false);
        }
        if (((Boolean) objM7377constructorimpl).booleanValue()) {
            this.this$0.KWHzl.setValue(new C32989mnw(VerifyIdentityBannerViewModel.ActionBar.StateListAnimator.copydefault));
            pUU.KWHzl("VerifyIdentityBannerViewModel", "kyc passed: fetchRequireDataAfterKycUpdate");
            C35799oEc c35799oEc = this.this$0.AEQbTJ;
            String str = (String) this.this$0.OLrzqt.getValue();
            this.label = 2;
            if (c35799oEc.AEQbTJ(str, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
