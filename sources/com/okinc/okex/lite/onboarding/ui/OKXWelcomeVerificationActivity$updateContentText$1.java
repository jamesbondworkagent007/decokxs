package com.okinc.okex.lite.onboarding.ui;

import com.okinc.okex.lite.home.bean.LiteHomeWelcomeData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.svI;

/* JADX INFO: loaded from: classes16.dex */
public final class OKXWelcomeVerificationActivity$updateContentText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OKXWelcomeVerificationActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXWelcomeVerificationActivity$updateContentText$1(OKXWelcomeVerificationActivity oKXWelcomeVerificationActivity, Continuation<? super OKXWelcomeVerificationActivity$updateContentText$1> continuation) {
        super(2, continuation);
        this.this$0 = oKXWelcomeVerificationActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXWelcomeVerificationActivity$updateContentText$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXWelcomeVerificationActivity$updateContentText$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LiteHomeWelcomeData liteHomeWelcomeData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            svI svi = (svI) C43251rlk.OLrzqt(svI.class);
            if (svi == null) {
                liteHomeWelcomeData = null;
                this.this$0.dismissLoading();
                if (liteHomeWelcomeData == null) {
                    this.this$0.OLrzqt(liteHomeWelcomeData);
                } else {
                    this.this$0.finish();
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = svi.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        liteHomeWelcomeData = (LiteHomeWelcomeData) obj;
        this.this$0.dismissLoading();
        if (liteHomeWelcomeData == null) {
        }
        return Unit.INSTANCE;
    }
}
