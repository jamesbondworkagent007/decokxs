package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.wallethardware.onekey.EvmTransactionData;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.SignEvmTransactionUseCase$signEvmTransaction$1;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignedTx;
import com.okinc.wallet.hardware.api.onekey.EVMTransaction;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57039yar;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15453eIx {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC57039yar KWHzl;
    public final C8377bBa OLrzqt;

    @yCM
    public C15453eIx(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull C8377bBa c8377bBa) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(c8377bBa, "");
        this.KWHzl = interfaceC57039yar;
        this.OLrzqt = c8377bBa;
    }

    /* JADX INFO: renamed from: o.eIx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull ChainAddress chainAddress, @NotNull EvmTransactionData evmTransactionData, @NotNull Continuation<? super eHO> continuation) throws java.lang.Throwable {
        SignEvmTransactionUseCase$signEvmTransaction$1 signEvmTransactionUseCase$signEvmTransaction$1;
        C15453eIx c15453eIx;
        if (continuation instanceof SignEvmTransactionUseCase$signEvmTransaction$1) {
            signEvmTransactionUseCase$signEvmTransaction$1 = (SignEvmTransactionUseCase$signEvmTransaction$1) continuation;
            int i = signEvmTransactionUseCase$signEvmTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signEvmTransactionUseCase$signEvmTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                signEvmTransactionUseCase$signEvmTransaction$1 = new SignEvmTransactionUseCase$signEvmTransaction$1(this, continuation);
            }
        }
        SignEvmTransactionUseCase$signEvmTransaction$1 signEvmTransactionUseCase$signEvmTransaction$12 = signEvmTransactionUseCase$signEvmTransaction$1;
        java.lang.Object objSignEVMTransaction$default = signEvmTransactionUseCase$signEvmTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signEvmTransactionUseCase$signEvmTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSignEVMTransaction$default);
            if (evmTransactionData.getUnsignedTx().length() == 0) {
                pUU.copydefault("SignEvmTransactionUseCase", "signEvmTransaction: unsignedTx is empty");
                return new eHO.Application(new OneKeyException("Data or unsignedTx is empty"));
            }
            InterfaceC57039yar interfaceC57039yar = this.KWHzl;
            java.lang.String connectId = oneKeyConnectedDevice.getDevice().getConnectId();
            java.lang.String deviceId = oneKeyConnectedDevice.getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            EVMSignTransactionParams eVMSignTransactionParams = new EVMSignTransactionParams(chainAddress.getDerivePath(), EZpvd(evmTransactionData));
            signEvmTransactionUseCase$signEvmTransaction$12.L$0 = this;
            signEvmTransactionUseCase$signEvmTransaction$12.L$1 = evmTransactionData;
            signEvmTransactionUseCase$signEvmTransaction$12.label = 1;
            objSignEVMTransaction$default = InterfaceC57039yar.Activity.signEVMTransaction$default(interfaceC57039yar, connectId, deviceId, eVMSignTransactionParams, null, signEvmTransactionUseCase$signEvmTransaction$12, 8, null);
            if (objSignEVMTransaction$default == objCopydefault) {
                return objCopydefault;
            }
            c15453eIx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            evmTransactionData = (EvmTransactionData) signEvmTransactionUseCase$signEvmTransaction$12.L$1;
            c15453eIx = (C15453eIx) signEvmTransactionUseCase$signEvmTransaction$12.L$0;
            C56391yDq.AEQbTJ(objSignEVMTransaction$default);
        }
        EVMSignedTx eVMSignedTx = (EVMSignedTx) objSignEVMTransaction$default;
        java.lang.String strEZpvd = c15453eIx.OLrzqt.EZpvd(evmTransactionData.getTxType(), evmTransactionData.getFactionChainId(), evmTransactionData.getSigChainId(), evmTransactionData.getUnsignedTx(), C54910xZw.EZpvd(eVMSignedTx.getR()), C54910xZw.EZpvd(eVMSignedTx.getS()), C54910xZw.EZpvd(eVMSignedTx.getV()));
        if (strEZpvd.length() == 0) {
            pUU.copydefault("SignEvmTransactionUseCase", "signEvmTransaction: sign result is empty");
            return new eHO.Application(new OneKeyException("Sign result is empty"));
        }
        return new eHO.Activity(strEZpvd);
    }

    public final EVMTransaction EZpvd(EvmTransactionData evmTransactionData) {
        java.lang.String maxPriorityFeePerGas;
        java.lang.String maxFeePerGas;
        java.lang.String gasLimit;
        java.lang.String gasPrice;
        java.lang.String value;
        java.lang.String nonce;
        java.lang.String to;
        BaseAccountTransaction transaction = evmTransactionData.getTransaction();
        if (transaction instanceof AccountTokenTransaction) {
            java.lang.String contract_address = ((AccountTokenTransaction) evmTransactionData.getTransaction()).getContract_address();
            java.lang.String strCopydefault = C33491mxU.copydefault(((AccountTokenTransaction) evmTransactionData.getTransaction()).getNonce());
            java.lang.String strCopydefault2 = C33491mxU.copydefault(((AccountTokenTransaction) evmTransactionData.getTransaction()).getValue());
            java.lang.String strCopydefault3 = C33491mxU.copydefault(((AccountTokenTransaction) evmTransactionData.getTransaction()).getGasPrice());
            java.lang.String strCopydefault4 = C33491mxU.copydefault(((AccountTokenTransaction) evmTransactionData.getTransaction()).getGasLimit());
            java.lang.String maxFeePerGas2 = ((AccountTokenTransaction) evmTransactionData.getTransaction()).getMaxFeePerGas();
            java.lang.String strCopydefault5 = maxFeePerGas2 != null ? C33491mxU.copydefault(maxFeePerGas2) : null;
            java.lang.String maxPriorityFeePerGas2 = ((AccountTokenTransaction) evmTransactionData.getTransaction()).getMaxPriorityFeePerGas();
            return new EVMTransaction(contract_address, strCopydefault2, strCopydefault3, strCopydefault4, strCopydefault, ((AccountTokenTransaction) evmTransactionData.getTransaction()).getData(), C33129mqd.AhwBna(((AccountTokenTransaction) evmTransactionData.getTransaction()).getChainId()), null, strCopydefault5, maxPriorityFeePerGas2 != null ? C33491mxU.copydefault(maxPriorityFeePerGas2) : null, 128, null);
        }
        if (transaction instanceof AccountTransaction) {
            java.lang.String to2 = ((AccountTransaction) evmTransactionData.getTransaction()).getTo();
            java.lang.String strCopydefault6 = C33491mxU.copydefault(((AccountTransaction) evmTransactionData.getTransaction()).getNonce());
            java.lang.String strCopydefault7 = C33491mxU.copydefault(((AccountTransaction) evmTransactionData.getTransaction()).getValue());
            java.lang.String strCopydefault8 = C33491mxU.copydefault(((AccountTransaction) evmTransactionData.getTransaction()).getGasPrice());
            java.lang.String strCopydefault9 = C33491mxU.copydefault(((AccountTransaction) evmTransactionData.getTransaction()).getGasLimit());
            java.lang.String maxFeePerGas3 = ((AccountTransaction) evmTransactionData.getTransaction()).getMaxFeePerGas();
            java.lang.String strCopydefault10 = maxFeePerGas3 != null ? C33491mxU.copydefault(maxFeePerGas3) : null;
            java.lang.String maxPriorityFeePerGas3 = ((AccountTransaction) evmTransactionData.getTransaction()).getMaxPriorityFeePerGas();
            return new EVMTransaction(to2, strCopydefault7, strCopydefault8, strCopydefault9, strCopydefault6, ((AccountTransaction) evmTransactionData.getTransaction()).getData(), C33129mqd.AhwBna(((AccountTransaction) evmTransactionData.getTransaction()).getChainId()), null, strCopydefault10, maxPriorityFeePerGas3 != null ? C33491mxU.copydefault(maxPriorityFeePerGas3) : null, 128, null);
        }
        SigData signData = evmTransactionData.getSignData();
        java.lang.String str = (signData == null || (to = signData.getTo()) == null) ? "" : to;
        SigData signData2 = evmTransactionData.getSignData();
        java.lang.String str2 = (signData2 == null || (nonce = signData2.getNonce()) == null) ? "" : nonce;
        SigData signData3 = evmTransactionData.getSignData();
        java.lang.String str3 = (signData3 == null || (value = signData3.getValue()) == null) ? "" : value;
        SigData signData4 = evmTransactionData.getSignData();
        java.lang.String str4 = (signData4 == null || (gasPrice = signData4.getGasPrice()) == null) ? "" : gasPrice;
        SigData signData5 = evmTransactionData.getSignData();
        java.lang.String str5 = (signData5 == null || (gasLimit = signData5.getGasLimit()) == null) ? "" : gasLimit;
        SigData signData6 = evmTransactionData.getSignData();
        java.lang.String str6 = (signData6 == null || (maxFeePerGas = signData6.getMaxFeePerGas()) == null) ? "" : maxFeePerGas;
        SigData signData7 = evmTransactionData.getSignData();
        java.lang.String str7 = (signData7 == null || (maxPriorityFeePerGas = signData7.getMaxPriorityFeePerGas()) == null) ? "" : maxPriorityFeePerGas;
        int iAhwBna = C33129mqd.AhwBna(evmTransactionData.getSigChainId());
        SigData signData8 = evmTransactionData.getSignData();
        return new EVMTransaction(str, str3, str4, str5, str2, signData8 != null ? signData8.getData() : null, iAhwBna, null, str6, str7, 128, null);
    }
}
