package o;

import com.okinc.wallet.hardware.api.onekey.Features;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyManagerKt$toConnectedDevice$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57043yav {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull InterfaceC57039yar interfaceC57039yar, @NotNull OneKeyDevice oneKeyDevice, @NotNull Continuation<? super OneKeyConnectedDevice> continuation) {
        OneKeyManagerKt$toConnectedDevice$1 oneKeyManagerKt$toConnectedDevice$1;
        OneKeyDevice oneKeyDevice2;
        if (continuation instanceof OneKeyManagerKt$toConnectedDevice$1) {
            oneKeyManagerKt$toConnectedDevice$1 = (OneKeyManagerKt$toConnectedDevice$1) continuation;
            int i = oneKeyManagerKt$toConnectedDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeyManagerKt$toConnectedDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeyManagerKt$toConnectedDevice$1 = new OneKeyManagerKt$toConnectedDevice$1(continuation);
            }
        }
        java.lang.Object objCopydefault = oneKeyManagerKt$toConnectedDevice$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = oneKeyManagerKt$toConnectedDevice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            oneKeyManagerKt$toConnectedDevice$1.L$0 = interfaceC57039yar;
            oneKeyManagerKt$toConnectedDevice$1.label = 1;
            objCopydefault = interfaceC57039yar.copydefault(oneKeyDevice, oneKeyManagerKt$toConnectedDevice$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oneKeyDevice2 = (OneKeyDevice) oneKeyManagerKt$toConnectedDevice$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                Features features = (Features) objCopydefault;
                return C57040yas.AEQbTJ(oneKeyDevice2, features.getDevice_id(), null, features.getLabel());
            }
            interfaceC57039yar = (InterfaceC57039yar) oneKeyManagerKt$toConnectedDevice$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        OneKeyDevice oneKeyDevice3 = (OneKeyDevice) objCopydefault;
        oneKeyManagerKt$toConnectedDevice$1.L$0 = oneKeyDevice3;
        oneKeyManagerKt$toConnectedDevice$1.label = 2;
        objCopydefault = oneKeyDevice3.getFeatures(interfaceC57039yar, true, oneKeyManagerKt$toConnectedDevice$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        oneKeyDevice2 = oneKeyDevice3;
        Features features2 = (Features) objCopydefault;
        return C57040yas.AEQbTJ(oneKeyDevice2, features2.getDevice_id(), null, features2.getLabel());
    }
}
