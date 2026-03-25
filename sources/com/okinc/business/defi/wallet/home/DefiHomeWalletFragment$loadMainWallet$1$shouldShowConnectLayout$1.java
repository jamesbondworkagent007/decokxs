package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C15935eaT;
import o.C16058eck;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AbstractC12782ctV $selectedWallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1(AbstractC12782ctV abstractC12782ctV, Continuation<? super DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1> continuation) {
        super(2, continuation);
        this.$selectedWallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1(this.$selectedWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DefiHomeWalletFragment$loadMainWallet$1$shouldShowConnectLayout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!C33129mqd.KWHzl((Collection) WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AhwBna(this.$selectedWallet.DbNXlk())) && !C33129mqd.KWHzl((Collection) C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).KWHzl(this.$selectedWallet.DbNXlk()))) {
                C15935eaT instance$default = C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null);
                String strDbNXlk = this.$selectedWallet.DbNXlk();
                this.label = 1;
                obj = instance$default.EZpvd(strDbNXlk, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (!C33129mqd.KWHzl((Collection) obj)) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
