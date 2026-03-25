package o;

import com.okinc.wallet.hardware.api.onekey.BTCAddress;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.EVMAddress;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMGetMultipleAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignTypedDataParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignedTx;
import com.okinc.wallet.hardware.api.onekey.EthereumMessageSignature;
import com.okinc.wallet.hardware.api.onekey.Features;
import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.PassphraseState;
import com.okinc.wallet.hardware.api.onekey.SignedTransaction;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57039yar {

    /* JADX INFO: renamed from: o.yar$ActionBar */
    public interface ActionBar {
        void EZpvd(@NotNull OneKeyAuthStage oneKeyAuthStage);
    }

    /* JADX INFO: renamed from: o.yar$Application */
    public interface Application {
        void KWHzl();

        void OLrzqt();
    }

    /* JADX INFO: renamed from: o.yar$TaskDescription */
    public interface TaskDescription {
        void KWHzl();

        void OLrzqt(@NotNull OneKeyDevice oneKeyDevice);
    }

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BTCGetAddressParams bTCGetAddressParams, CommonParams commonParams, @NotNull Continuation<? super BTCAddress> continuation) throws OneKeyException;

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, @NotNull Continuation<? super EVMSignedTx> continuation) throws OneKeyException;

    void AEQbTJ(@NotNull InterfaceC57025yad interfaceC57025yad);

    void AEQbTJ(@NotNull ActionBar actionBar);

    void AEQbTJ(@NotNull Application application);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams, @NotNull Continuation<? super SignedTransaction> continuation) throws OneKeyException;

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws OneKeyException;

    void EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull ActionBar actionBar);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<BTCGetAddressParams> list, CommonParams commonParams, @NotNull Continuation<? super java.util.List<BTCAddress>> continuation) throws OneKeyException;

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super PassphraseState> continuation) throws OneKeyException;

    void KWHzl();

    void KWHzl(@NotNull OneKeyDevice oneKeyDevice);

    void KWHzl(@NotNull Application application);

    void KWHzl(@NotNull TaskDescription taskDescription);

    OneKeyDevice OLrzqt(@NotNull java.lang.String str);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMGetMultipleAddressParams eVMGetMultipleAddressParams, CommonParams commonParams, @NotNull Continuation<? super java.util.List<EVMAddress>> continuation) throws OneKeyException;

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignTypedDataParams eVMSignTypedDataParams, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws OneKeyException;

    java.util.List<OneKeyDevice> OLrzqt();

    void OLrzqt(@NotNull TaskDescription taskDescription);

    java.lang.Object copydefault(@NotNull OneKeyDevice oneKeyDevice, @NotNull Continuation<? super OneKeyDevice> continuation) throws OneKeyException;

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, @NotNull Continuation<? super EVMAddress> continuation) throws OneKeyException;

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EVMSignMessageParams eVMSignMessageParams, CommonParams commonParams, @NotNull Continuation<? super EthereumMessageSignature> continuation) throws OneKeyException;

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Features> continuation) throws OneKeyException;

    void copydefault();

    void copydefault(@NotNull InterfaceC57025yad interfaceC57025yad);

    /* JADX INFO: renamed from: o.yar$Activity */
    public static final class Activity {
        public static /* synthetic */ java.lang.Object getBTCAddress$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, BTCGetAddressParams bTCGetAddressParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBTCAddress");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.AEQbTJ(str, str2, bTCGetAddressParams, commonParams, (Continuation<? super BTCAddress>) continuation);
        }

        public static /* synthetic */ java.lang.Object getMultipleBTCAddresses$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, java.util.List list, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultipleBTCAddresses");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.KWHzl(str, str2, list, commonParams, continuation);
        }

        public static /* synthetic */ java.lang.Object signBTCTransaction$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signBTCTransaction");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.EZpvd(str, str2, bTCSignTransactionParams, commonParams, (Continuation<? super SignedTransaction>) continuation);
        }

        public static /* synthetic */ java.lang.Object getEVMAddress$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEVMAddress");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.copydefault(str, str2, eVMGetAddressParams, commonParams, (Continuation<? super EVMAddress>) continuation);
        }

        public static /* synthetic */ java.lang.Object getMultipleEVMAddresses$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMGetMultipleAddressParams eVMGetMultipleAddressParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultipleEVMAddresses");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.OLrzqt(str, str2, eVMGetMultipleAddressParams, commonParams, (Continuation<? super java.util.List<EVMAddress>>) continuation);
        }

        public static /* synthetic */ java.lang.Object signEVMMessage$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMSignMessageParams eVMSignMessageParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signEVMMessage");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.copydefault(str, str2, eVMSignMessageParams, commonParams, (Continuation<? super EthereumMessageSignature>) continuation);
        }

        public static /* synthetic */ java.lang.Object signEVMEIP712Message$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signEVMEIP712Message");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.EZpvd(str, str2, eVMSignMessageEIP712Params, commonParams, (Continuation<? super EthereumMessageSignature>) continuation);
        }

        public static /* synthetic */ java.lang.Object signEVMTypedData$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMSignTypedDataParams eVMSignTypedDataParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signEVMTypedData");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.OLrzqt(str, str2, eVMSignTypedDataParams, commonParams, (Continuation<? super EthereumMessageSignature>) continuation);
        }

        public static /* synthetic */ java.lang.Object signEVMTransaction$default(InterfaceC57039yar interfaceC57039yar, java.lang.String str, java.lang.String str2, EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, Continuation continuation, int i, java.lang.Object obj) throws OneKeyException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signEVMTransaction");
            }
            if ((i & 8) != 0) {
                commonParams = null;
            }
            return interfaceC57039yar.AEQbTJ(str, str2, eVMSignTransactionParams, commonParams, (Continuation<? super EVMSignedTx>) continuation);
        }
    }
}
