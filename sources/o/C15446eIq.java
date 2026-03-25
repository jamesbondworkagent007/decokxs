package o;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.SignBtcTransactionUseCase$signBtcTransaction$1;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.SignedTransaction;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57039yar;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15446eIq {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC57039yar EZpvd;
    public final C8377bBa KWHzl;

    @yCM
    public C15446eIq(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull C8377bBa c8377bBa) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(c8377bBa, "");
        this.EZpvd = interfaceC57039yar;
        this.KWHzl = c8377bBa;
    }

    /* JADX INFO: renamed from: o.eIq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull UTXOTransaction uTXOTransaction, @NotNull Continuation<? super eHO> continuation) throws java.lang.Throwable {
        SignBtcTransactionUseCase$signBtcTransaction$1 signBtcTransactionUseCase$signBtcTransaction$1;
        if (continuation instanceof SignBtcTransactionUseCase$signBtcTransaction$1) {
            signBtcTransactionUseCase$signBtcTransaction$1 = (SignBtcTransactionUseCase$signBtcTransaction$1) continuation;
            int i = signBtcTransactionUseCase$signBtcTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signBtcTransactionUseCase$signBtcTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                signBtcTransactionUseCase$signBtcTransaction$1 = new SignBtcTransactionUseCase$signBtcTransaction$1(this, continuation);
            }
        }
        SignBtcTransactionUseCase$signBtcTransaction$1 signBtcTransactionUseCase$signBtcTransaction$12 = signBtcTransactionUseCase$signBtcTransaction$1;
        java.lang.Object objSignBTCTransaction$default = signBtcTransactionUseCase$signBtcTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signBtcTransactionUseCase$signBtcTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSignBTCTransaction$default);
            java.lang.String strOLrzqt = this.KWHzl.OLrzqt(uTXOTransaction);
            BTCSignTransactionParams bTCSignTransactionParams = strOLrzqt.length() == 0 ? null : (BTCSignTransactionParams) C54907xZt.OLrzqt(BTCSignTransactionParams.Companion.serializer(), strOLrzqt);
            if (bTCSignTransactionParams == null || bTCSignTransactionParams.getInputs().isEmpty() || bTCSignTransactionParams.getOutputs().isEmpty() || bTCSignTransactionParams.getRefTxs().isEmpty()) {
                pUU.copydefault("SignBtcTransactionUseCase", "signBtcTransaction: unsignedParam is empty");
                return new eHO.Application(new OneKeyException("UnsignedParam is empty"));
            }
            InterfaceC57039yar interfaceC57039yar = this.EZpvd;
            java.lang.String connectId = oneKeyConnectedDevice.getDevice().getConnectId();
            java.lang.String deviceId = oneKeyConnectedDevice.getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            signBtcTransactionUseCase$signBtcTransaction$12.label = 1;
            objSignBTCTransaction$default = InterfaceC57039yar.Activity.signBTCTransaction$default(interfaceC57039yar, connectId, deviceId, bTCSignTransactionParams, null, signBtcTransactionUseCase$signBtcTransaction$12, 8, null);
            if (objSignBTCTransaction$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSignBTCTransaction$default);
        }
        SignedTransaction signedTransaction = (SignedTransaction) objSignBTCTransaction$default;
        if (signedTransaction.copydefault().length() == 0) {
            pUU.copydefault("SignBtcTransactionUseCase", "signBtcTransaction: sign result is empty");
            return new eHO.Application(new OneKeyException("Sign result is empty"));
        }
        return new eHO.Activity(signedTransaction.copydefault());
    }
}
