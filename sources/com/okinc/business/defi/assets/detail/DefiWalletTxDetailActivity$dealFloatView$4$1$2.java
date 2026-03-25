package com.okinc.business.defi.assets.detail;

import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC10049bhC;
import o.C10148biw;
import o.C10854bwM;
import o.C13754dXa;
import o.C52761wXj;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes3.dex */
public final class DefiWalletTxDetailActivity$dealFloatView$4$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ ActivityC10049bhC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTxDetailActivity$dealFloatView$4$1$2(ActivityC10049bhC activityC10049bhC, String str, Continuation<? super DefiWalletTxDetailActivity$dealFloatView$4$1$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC10049bhC;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTxDetailActivity$dealFloatView$4$1$2(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTxDetailActivity$dealFloatView$4$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.getFieldNames();
            C10148biw c10148biwAkhnZx = this.this$0.AkhnZx();
            String strAYXKKw = this.this$0.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            String str = this.$walletId;
            C10854bwM c10854bwM = this.this$0.copydefault;
            long jFetchVPNInfo = c10854bwM != null ? c10854bwM.fetchVPNInfo() : 0L;
            this.label = 1;
            objEZpvd = c10148biwAkhnZx.EZpvd(strAYXKKw, str, jFetchVPNInfo, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        boolean zBooleanValue = ((Boolean) objEZpvd).booleanValue();
        this.this$0.values();
        if (zBooleanValue) {
            C55328xhq.show$default(C55328xhq.OLrzqt, this.this$0.getString(C13754dXa.FragmentManager.dLBcXg), ContextCompat.getDrawable(this.this$0, C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, this.this$0.getString(C13754dXa.FragmentManager.fIwbmz), ContextCompat.getDrawable(this.this$0, C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
