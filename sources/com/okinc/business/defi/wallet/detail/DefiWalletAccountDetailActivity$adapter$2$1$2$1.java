package com.okinc.business.defi.wallet.detail;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.ActivityC15218eAe;
import o.C14325djN;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletAccountDetailActivity$adapter$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC15218eAe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletAccountDetailActivity$adapter$2$1$2$1(ActivityC15218eAe activityC15218eAe, Continuation<? super DefiWalletAccountDetailActivity$adapter$2$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC15218eAe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletAccountDetailActivity$adapter$2$1$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletAccountDetailActivity$adapter$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV = this.this$0.gEmmrt;
            AbstractC12782ctV abstractC12782ctV2 = null;
            if (abstractC12782ctV == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            }
            if (abstractC12782ctV.zLjUOn()) {
                dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
                ActivityC15218eAe activityC15218eAe = this.this$0;
                AbstractC12782ctV abstractC12782ctV3 = activityC15218eAe.gEmmrt;
                if (abstractC12782ctV3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC12782ctV2 = abstractC12782ctV3;
                }
                ActivateTeeGuideModel activateTeeGuideModel = new ActivateTeeGuideModel(abstractC12782ctV2.DbNXlk(), false, false, (String) null, 0, 0, 0, "sa_wallet_accountdetail", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null);
                this.label = 1;
                if (dtq.KWHzl(activityC15218eAe, activateTeeGuideModel, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C14325djN c14325djN = new C14325djN();
                ActivityC15218eAe activityC15218eAe2 = this.this$0;
                FragmentManager supportFragmentManager = activityC15218eAe2.getSupportFragmentManager();
                AbstractC12782ctV abstractC12782ctV4 = this.this$0.gEmmrt;
                if (abstractC12782ctV4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV4 = null;
                }
                C14325djN.showBackupTipDialog$default(c14325djN, activityC15218eAe2, supportFragmentManager, abstractC12782ctV4, null, 8, null);
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
