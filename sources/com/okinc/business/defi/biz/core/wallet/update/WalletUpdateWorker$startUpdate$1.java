package com.okinc.business.defi.biz.core.wallet.update;

import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$startUpdate$1;
import com.okinc.core.util.SPUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58227yxM;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletUpdateWorker$startUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WalletUpdateWorker this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUpdateWorker$startUpdate$1(WalletUpdateWorker walletUpdateWorker, Continuation<? super WalletUpdateWorker$startUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUpdateWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUpdateWorker$startUpdate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUpdateWorker$startUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C12827cuN c12827cuN = this.this$0.AhwBna;
            this.label = 1;
            obj = c12827cuN.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC58185ywX<Boolean> abstractC58185ywXAEQbTJ = this.this$0.AEQbTJ((List<? extends AbstractC12782ctV>) obj);
        final Function1 function1 = new Function1() { // from class: o.cFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WalletUpdateWorker$startUpdate$1.invokeSuspend$lambda$0((java.lang.Boolean) obj2);
            }
        };
        InterfaceC58227yxM<? super Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.cFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WalletUpdateWorker$startUpdate$1.invokeSuspend$lambda$2((java.lang.Throwable) obj2);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function12.invoke(obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Boolean bool) {
        pUU.copydefault("WalletUpdateWorker", "upgradeAllWallets finish");
        Boolean bool2 = Boolean.TRUE;
        SPUtils.put("recreate_btc_legacy_address_for_hardware", bool2);
        SPUtils.put("update_near_and_sui_pub_key", bool2, "wallet_biz_sp_file");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Throwable th) {
        pUU.copydefault("WalletUpdateWorker", "error message :" + th.getMessage());
        return Unit.INSTANCE;
    }
}
