package com.okinc.business.defi.wallet.hardware;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$mergeOrAddWallet$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13458dMb;
import o.C13758dXe;
import o.C56391yDq;
import o.C56442yFn;
import o.eEG;
import o.eEL;
import o.eFI;

/* JADX INFO: loaded from: classes15.dex */
public final class HardwareWalletSelectAddressActivity$mergeOrAddWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eFI $info;
    int label;
    final /* synthetic */ eEL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressActivity$mergeOrAddWallet$1(eEL eel, eFI efi, Continuation<? super HardwareWalletSelectAddressActivity$mergeOrAddWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = eel;
        this.$info = efi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressActivity$mergeOrAddWallet$1(this.this$0, this.$info, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressActivity$mergeOrAddWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.this$0).isConnected();
            ChainAddress chainAddressCopydefault = this.$info.copydefault();
            this.label = 1;
            obj = c13758dXeIsConnected.copydefault(chainAddressCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.fetchVPNInfo();
        } else {
            this.this$0.showLoadingAtOnce();
            eEG eegAhwBna = this.this$0.AhwBna();
            final eEL eel = this.this$0;
            eFI efi = this.$info;
            Function1<? super AbstractC12782ctV, Unit> function1 = new Function1() { // from class: o.eEU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return HardwareWalletSelectAddressActivity$mergeOrAddWallet$1.invokeSuspend$lambda$0(eel, (AbstractC12782ctV) obj2);
                }
            };
            final eEL eel2 = this.this$0;
            eegAhwBna.KWHzl(eel, efi, function1, new Function1() { // from class: o.eEV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return HardwareWalletSelectAddressActivity$mergeOrAddWallet$1.invokeSuspend$lambda$1(eel2, (java.lang.Throwable) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(eEL eel, AbstractC12782ctV abstractC12782ctV) {
        eel.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(eEL eel, Throwable th) {
        eel.dismissLoading();
        return Unit.INSTANCE;
    }
}
