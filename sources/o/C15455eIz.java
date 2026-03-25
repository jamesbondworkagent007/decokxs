package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.SignEvmMessageUseCase$signEvmMessage$1;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageParams;
import com.okinc.wallet.hardware.api.onekey.EthereumMessageSignature;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57039yar;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15455eIz {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC57039yar AEQbTJ;

    /* JADX INFO: renamed from: o.eIz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public C15455eIz(@NotNull InterfaceC57039yar interfaceC57039yar) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        this.AEQbTJ = interfaceC57039yar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice, @NotNull ChainAddress chainAddress, @NotNull java.lang.String str, @NotNull Continuation<? super eHO> continuation) throws java.lang.Throwable {
        SignEvmMessageUseCase$signEvmMessage$1 signEvmMessageUseCase$signEvmMessage$1;
        if (continuation instanceof SignEvmMessageUseCase$signEvmMessage$1) {
            signEvmMessageUseCase$signEvmMessage$1 = (SignEvmMessageUseCase$signEvmMessage$1) continuation;
            int i = signEvmMessageUseCase$signEvmMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signEvmMessageUseCase$signEvmMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                signEvmMessageUseCase$signEvmMessage$1 = new SignEvmMessageUseCase$signEvmMessage$1(this, continuation);
            }
        }
        SignEvmMessageUseCase$signEvmMessage$1 signEvmMessageUseCase$signEvmMessage$12 = signEvmMessageUseCase$signEvmMessage$1;
        java.lang.Object objSignEVMMessage$default = signEvmMessageUseCase$signEvmMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signEvmMessageUseCase$signEvmMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSignEVMMessage$default);
            InterfaceC57039yar interfaceC57039yar = this.AEQbTJ;
            java.lang.String connectId = oneKeyConnectedDevice.getDevice().getConnectId();
            java.lang.String deviceId = oneKeyConnectedDevice.getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            EVMSignMessageParams eVMSignMessageParams = new EVMSignMessageParams(chainAddress.getDerivePath(), str, C56443yFo.KWHzl(chainAddress.getChainId()));
            signEvmMessageUseCase$signEvmMessage$12.label = 1;
            objSignEVMMessage$default = InterfaceC57039yar.Activity.signEVMMessage$default(interfaceC57039yar, connectId, deviceId, eVMSignMessageParams, null, signEvmMessageUseCase$signEvmMessage$12, 8, null);
            if (objSignEVMMessage$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSignEVMMessage$default);
        }
        EthereumMessageSignature ethereumMessageSignature = (EthereumMessageSignature) objSignEVMMessage$default;
        if (ethereumMessageSignature.copydefault().length() == 0) {
            pUU.copydefault("SignEvmMessageUseCase", "signEvmMessage: sign result is empty");
            return new eHO.Application(new OneKeyException("Sign result is empty"));
        }
        return new eHO.Activity(C54910xZw.OLrzqt(ethereumMessageSignature.copydefault()));
    }
}
