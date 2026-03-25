package o;

import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.NativeBridgePlatformCheckUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUE implements kUC {
    public final kYD OLrzqt;

    @yCM
    public kUE(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.OLrzqt = kyd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kUC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super BridgeForceUpdateState> continuation) throws java.lang.Throwable {
        NativeBridgePlatformCheckUseCase$invoke$1 nativeBridgePlatformCheckUseCase$invoke$1;
        if (continuation instanceof NativeBridgePlatformCheckUseCase$invoke$1) {
            nativeBridgePlatformCheckUseCase$invoke$1 = (NativeBridgePlatformCheckUseCase$invoke$1) continuation;
            int i = nativeBridgePlatformCheckUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nativeBridgePlatformCheckUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                nativeBridgePlatformCheckUseCase$invoke$1 = new NativeBridgePlatformCheckUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = nativeBridgePlatformCheckUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nativeBridgePlatformCheckUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            kYD kyd = this.OLrzqt;
            nativeBridgePlatformCheckUseCase$invoke$1.label = 1;
            objAEQbTJ = kyd.AEQbTJ(nativeBridgePlatformCheckUseCase$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        BridgeForceUpdateState bridgeForceUpdateState = (BridgeForceUpdateState) ((AbstractC43419rot) objAEQbTJ).copydefault();
        return bridgeForceUpdateState == null ? new BridgeForceUpdateState(false, 1, null) : bridgeForceUpdateState;
    }
}
