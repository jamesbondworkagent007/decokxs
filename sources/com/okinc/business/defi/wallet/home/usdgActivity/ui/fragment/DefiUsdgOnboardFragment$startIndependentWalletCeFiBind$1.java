package com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C18254fet;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54824xWr;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C18254fet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1(C18254fet c18254fet, String str, Continuation<? super DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1> continuation) {
        super(2, continuation);
        this.this$0 = c18254fet;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgOnboardFragment$startIndependentWalletCeFiBind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
            String str = this.$walletId;
            if (str != null && str.length() != 0 && abstractActivityC33041mov != null) {
                InterfaceC54824xWr interfaceC54824xWrAuCTel = this.this$0.AuCTel();
                String str2 = this.$walletId;
                this.label = 1;
                if (interfaceC54824xWrAuCTel.EZpvd(str2, abstractActivityC33041mov, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.copydefault(C18254fet.OLrzqt, "startIndependentWalletCeFiBind: walletId-" + this.$walletId + " or baseActivity-" + (abstractActivityC33041mov == null));
                return Unit.INSTANCE;
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
