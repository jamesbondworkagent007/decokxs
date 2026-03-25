package com.okinc.business.defi.wallet.hardware;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$mergeOrAddWallet$2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C13458dMb;
import o.C13758dXe;
import o.C56391yDq;
import o.C56442yFn;
import o.eEG;
import o.eEL;
import o.eFI;
import o.eFJ;

/* JADX INFO: loaded from: classes15.dex */
public final class HardwareWalletSelectAddressActivity$mergeOrAddWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ eFJ $infoGroup;
    int label;
    final /* synthetic */ eEL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressActivity$mergeOrAddWallet$2(eEL eel, eFJ efj, Continuation<? super HardwareWalletSelectAddressActivity$mergeOrAddWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = eel;
        this.$infoGroup = efj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressActivity$mergeOrAddWallet$2(this.this$0, this.$infoGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressActivity$mergeOrAddWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AYXKKw == null) {
                return Unit.INSTANCE;
            }
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.this$0).isConnected();
            eFI efi = (eFI) CollectionsKt___CollectionsKt.firstOrNull(this.$infoGroup.copydefault());
            ChainAddress chainAddressCopydefault = efi != null ? efi.copydefault() : null;
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
            eEL eel = this.this$0;
            C10854bwM c10854bwM = eel.AYXKKw;
            Intrinsics.copydefault(c10854bwM);
            long jAEQbTJ = c10854bwM.AEQbTJ();
            eFJ efj = this.$infoGroup;
            final eEL eel2 = this.this$0;
            Function1<? super AbstractC12782ctV, Unit> function1 = new Function1() { // from class: o.eET
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return HardwareWalletSelectAddressActivity$mergeOrAddWallet$2.invokeSuspend$lambda$0(eel2, (AbstractC12782ctV) obj2);
                }
            };
            final eEL eel3 = this.this$0;
            eegAhwBna.EZpvd(eel, jAEQbTJ, efj, function1, new Function1() { // from class: o.eFa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return HardwareWalletSelectAddressActivity$mergeOrAddWallet$2.invokeSuspend$lambda$1(eel3, (java.lang.Throwable) obj2);
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
