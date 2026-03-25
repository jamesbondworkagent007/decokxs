package com.okinc.business.defi.wallet;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C14325djN;
import o.C43251rlk;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$handleSAAccountCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$handleSAAccountCheck$1(AbstractC12782ctV abstractC12782ctV, DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$handleSAAccountCheck$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$handleSAAccountCheck$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$handleSAAccountCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$wallet.AubY()) {
                C55328xhq.show$default(C55328xhq.OLrzqt, this.this$0.getString(C13754dXa.FragmentManager.fdazkH), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                return Unit.INSTANCE;
            }
            if (!this.$wallet.zLjUOn()) {
                C14325djN c14325djN = new C14325djN();
                DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                C14325djN.showBackupTipDialog$default(c14325djN, defiWalletMainActivity, defiWalletMainActivity.getSupportFragmentManager(), this.$wallet, null, 8, null);
                return Unit.INSTANCE;
            }
            if (this.$wallet.RJOkX()) {
                dTQ.TaskDescription.enterTeeReNewPageAndCheck$default((dTQ) C43251rlk.copydefault(dTQ.class), this.this$0, this.$wallet, null, "sa_wallet_deeplink", 4, null);
            } else {
                dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
                DefiWalletMainActivity defiWalletMainActivity2 = this.this$0;
                ActivateTeeGuideModel activateTeeGuideModel = new ActivateTeeGuideModel(this.$wallet.DbNXlk(), true, false, (String) null, 0, 0, 0, "sa_wallet_deeplink", 120, (DefaultConstructorMarker) null);
                this.label = 1;
                if (dtq.KWHzl(defiWalletMainActivity2, activateTeeGuideModel, this) == objCopydefault) {
                    return objCopydefault;
                }
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
