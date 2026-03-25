package com.okinc.business.defi.wallet.mine;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC18663fme;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.xWJ;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPreferencesActivity$updateUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18663fme this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPreferencesActivity$updateUI$1(ActivityC18663fme activityC18663fme, Continuation<? super WalletPreferencesActivity$updateUI$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18663fme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletPreferencesActivity$updateUI$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletPreferencesActivity$updateUI$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xWJ xwjDbNXlk = this.this$0.DbNXlk();
                this.label = 1;
                obj = xwjDbNXlk.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.OLrzqt((String) obj);
            this.this$0.fJNWhG();
            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
        } catch (Exception unused) {
            this.this$0.OLrzqt("");
            this.this$0.fJNWhG();
            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
