package o;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.other.ChainInfo;
import com.okinc.wallet.core.other.DerivePath;
import com.okinc.wallet.hardware.api.onekey.EVMAddress;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15438eIi {
    public final InterfaceC57039yar AEQbTJ;
    public final xYW OLrzqt;

    @yCM
    public C15438eIi(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull xYW xyw) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Intrinsics.checkNotNullParameter(xyw, "");
        this.AEQbTJ = interfaceC57039yar;
        this.OLrzqt = xyw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super C15450eIu> continuation) throws java.lang.Throwable {
        GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1 getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1;
        java.lang.String path;
        java.lang.Object next;
        C15438eIi c15438eIi;
        java.lang.String str2;
        OneKeyConnectedDevice oneKeyConnectedDevice;
        if (continuation instanceof GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1) {
            getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1 = (GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1) continuation;
            int i2 = getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1 = new GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1(this, continuation);
            }
        }
        GetOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1 getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12 = getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$1;
        java.lang.Object obj = getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            DerivePath derivePath = (DerivePath) CollectionsKt___CollectionsKt.firstOrNull(this.OLrzqt.OLrzqt(C56402yEa.EZpvd(new ChainInfo(-2000L, i, AddressType.Legacy.getValue()))));
            if (derivePath == null || (path = derivePath.getPath()) == null) {
                throw new OneKeyException("Invalid index");
            }
            java.util.Iterator<T> it = this.AEQbTJ.OLrzqt().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((OneKeyDevice) next).getConnectId(), (java.lang.Object) str)) {
                    break;
                }
            }
            OneKeyDevice oneKeyDeviceOLrzqt = (OneKeyDevice) next;
            if (oneKeyDeviceOLrzqt == null) {
                oneKeyDeviceOLrzqt = this.AEQbTJ.OLrzqt(str);
            }
            InterfaceC57039yar interfaceC57039yar = this.AEQbTJ;
            getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$0 = this;
            getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$1 = path;
            getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.label = 1;
            java.lang.Object objKWHzl = C57043yav.KWHzl(interfaceC57039yar, oneKeyDeviceOLrzqt, getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c15438eIi = this;
            obj = objKWHzl;
            str2 = path;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oneKeyConnectedDevice = (OneKeyConnectedDevice) getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$0;
                C56391yDq.AEQbTJ(obj);
                return new C15450eIu(oneKeyConnectedDevice, ((EVMAddress) obj).EZpvd());
            }
            str2 = (java.lang.String) getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$1;
            c15438eIi = (C15438eIi) getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        OneKeyConnectedDevice oneKeyConnectedDevice2 = (OneKeyConnectedDevice) obj;
        OneKeyDevice device = oneKeyConnectedDevice2.getDevice();
        InterfaceC57039yar interfaceC57039yar2 = c15438eIi.AEQbTJ;
        java.lang.String deviceId = oneKeyConnectedDevice2.getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        EVMGetAddressParams eVMGetAddressParams = new EVMGetAddressParams("m/" + str2, C56443yFo.KWHzl(false), (java.lang.Integer) null, 4, (DefaultConstructorMarker) null);
        getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$0 = oneKeyConnectedDevice2;
        getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.L$1 = null;
        getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12.label = 2;
        java.lang.Object evmAddress$default = OneKeyDevice.getEvmAddress$default(device, interfaceC57039yar2, deviceId, eVMGetAddressParams, null, getOneKeyDeviceEvmAddressUseCase$getEvmAddressForIndex$12, 8, null);
        if (evmAddress$default == objCopydefault) {
            return objCopydefault;
        }
        obj = evmAddress$default;
        oneKeyConnectedDevice = oneKeyConnectedDevice2;
        return new C15450eIu(oneKeyConnectedDevice, ((EVMAddress) obj).EZpvd());
    }
}
