package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.wallethardware.onekey.EVMTypedData;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.SignEvmTypedDataUseCase$signEvmTypedData$1;
import com.okinc.wallet.hardware.api.onekey.EVMSignTypedDataParams;
import com.okinc.wallet.hardware.api.onekey.EthereumMessageSignature;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import o.InterfaceC57039yar;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15451eIv {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC57039yar AEQbTJ;

    /* JADX INFO: renamed from: o.eIv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public C15451eIv(@NotNull InterfaceC57039yar interfaceC57039yar) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        this.AEQbTJ = interfaceC57039yar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull ChainAddress chainAddress, @NotNull EVMTypedData eVMTypedData, @NotNull Continuation<? super eHO> continuation) throws java.lang.Throwable {
        SignEvmTypedDataUseCase$signEvmTypedData$1 signEvmTypedDataUseCase$signEvmTypedData$1;
        if (continuation instanceof SignEvmTypedDataUseCase$signEvmTypedData$1) {
            signEvmTypedDataUseCase$signEvmTypedData$1 = (SignEvmTypedDataUseCase$signEvmTypedData$1) continuation;
            int i = signEvmTypedDataUseCase$signEvmTypedData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signEvmTypedDataUseCase$signEvmTypedData$1.label = i - Integer.MIN_VALUE;
            } else {
                signEvmTypedDataUseCase$signEvmTypedData$1 = new SignEvmTypedDataUseCase$signEvmTypedData$1(this, continuation);
            }
        }
        SignEvmTypedDataUseCase$signEvmTypedData$1 signEvmTypedDataUseCase$signEvmTypedData$12 = signEvmTypedDataUseCase$signEvmTypedData$1;
        java.lang.Object objSignEVMTypedData$default = signEvmTypedDataUseCase$signEvmTypedData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signEvmTypedDataUseCase$signEvmTypedData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSignEVMTypedData$default);
            InterfaceC57039yar interfaceC57039yar = this.AEQbTJ;
            java.lang.String connectId = oneKeyConnectedDevice.getDevice().getConnectId();
            java.lang.String deviceId = oneKeyConnectedDevice.getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            EVMSignTypedDataParams eVMSignTypedDataParams = new EVMSignTypedDataParams(chainAddress.getDerivePath(), false, JsonElementKt.getJsonObject(C33489mxS.KWHzl.AEQbTJ().parseToJsonElement(eVMTypedData.getData())), eVMTypedData.getDomainHash(), eVMTypedData.getMessageHash(), C56443yFo.KWHzl(chainAddress.getChainId()));
            signEvmTypedDataUseCase$signEvmTypedData$12.label = 1;
            objSignEVMTypedData$default = InterfaceC57039yar.Activity.signEVMTypedData$default(interfaceC57039yar, connectId, deviceId, eVMSignTypedDataParams, null, signEvmTypedDataUseCase$signEvmTypedData$12, 8, null);
            if (objSignEVMTypedData$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSignEVMTypedData$default);
        }
        EthereumMessageSignature ethereumMessageSignature = (EthereumMessageSignature) objSignEVMTypedData$default;
        if (ethereumMessageSignature.copydefault().length() == 0) {
            pUU.copydefault("SignEvmTypedDataUseCase", "signEvmTypedData: sign result is empty");
            return new eHO.Application(new OneKeyException("Sign result is empty"));
        }
        return new eHO.Activity(C54910xZw.OLrzqt(ethereumMessageSignature.copydefault()));
    }
}
