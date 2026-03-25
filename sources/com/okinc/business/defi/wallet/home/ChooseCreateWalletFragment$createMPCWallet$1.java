package com.okinc.business.defi.wallet.home;

import android.graphics.drawable.Drawable;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13754dXa;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eLN;

/* JADX INFO: loaded from: classes5.dex */
public final class ChooseCreateWalletFragment$createMPCWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eLN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseCreateWalletFragment$createMPCWallet$1(eLN eln, Continuation<? super ChooseCreateWalletFragment$createMPCWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = eln;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseCreateWalletFragment$createMPCWallet$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseCreateWalletFragment$createMPCWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.REGISTER)) {
                this.this$0.OLrzqt.invoke();
            } else {
                C55326xho.toast$default(C13754dXa.FragmentManager.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
