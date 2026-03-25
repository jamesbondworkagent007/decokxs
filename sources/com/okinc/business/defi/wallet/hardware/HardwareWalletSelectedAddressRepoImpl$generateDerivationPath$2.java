package com.okinc.business.defi.wallet.hardware;

import com.okinc.wallet.api.bean.AddressType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C10854bwM;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<HardwareWalletDerivationPath>>, Object> {
    final /* synthetic */ C10854bwM $coinMeta;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2(C10854bwM c10854bwM, Continuation<? super HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2> continuation) {
        super(2, continuation);
        this.$coinMeta = c10854bwM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2(this.$coinMeta, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<HardwareWalletDerivationPath>> continuation) {
        return ((HardwareWalletSelectedAddressRepoImpl$generateDerivationPath$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$coinMeta.ejfBZ()) {
                pUU.OLrzqt(">>>ledger generateDerivationPath isEVM on thread:" + Thread.currentThread() + " ");
                ArrayList arrayListCopydefault = yDY.copydefault(new HardwareWalletDerivationPath(1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqP), "m/44/60'/0'/0/*'", AddressType.Legacy), new HardwareWalletDerivationPath(2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDIADVb), "m/44/60'/*'/0/0", AddressType.LedgerLegacy), new HardwareWalletDerivationPath(3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDDUqPf), "m/44/60'/*'/0/0", AddressType.LedgerLive));
                pUU.OLrzqt(">>>ledger generateDerivationPath isEVM on thread:" + Thread.currentThread() + " arrayListOf:" + arrayListCopydefault.size() + " ");
                return arrayListCopydefault;
            }
            if (this.$coinMeta.fdOvFl()) {
                return yDY.copydefault(new HardwareWalletDerivationPath(1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqP), "m/44'/501'/*'/0'", AddressType.LedgerBip44), new HardwareWalletDerivationPath(2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDDUqPf), "m/44'/501'/0'/*'", AddressType.LedgerLive));
            }
            return new ArrayList();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
