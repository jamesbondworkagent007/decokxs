package o;

import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eHd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15406eHd {

    /* JADX INFO: renamed from: o.eHd$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OneKeySDKError.values().length];
            try {
                iArr[OneKeySDKError.PinInvalid.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OneKeySDKError.PinCancelled.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OneKeySDKError.ActionCancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OneKeySDKError.DeviceOpenedPassphrase.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OneKeySDKError.BluetoothError.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OneKeySDKError.SDKUnavailable.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OneKeySDKError.CallMethodNeedUpgradeFirmware.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[OneKeySDKError.NewFirmwareUnRelease.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[OneKeySDKError.NewFirmwareForceUpdate.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[OneKeySDKError.RuntimeError.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final OneKeyConnectEvent.ShowNotification EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("OneKeyConnectEvent", "OneKeyConnectEvent", th);
        if (th instanceof OneKeyException) {
            OneKeySDKError error = ((OneKeyException) th).getError();
            switch (error == null ? -1 : TaskDescription.AEQbTJ[error.ordinal()]) {
                case 10:
                    java.lang.String message = th.getMessage();
                    if (message != null && StringsKt__StringsKt.AhwBna((java.lang.CharSequence) message, (java.lang.CharSequence) "Failure_UnexpectedMessage", true)) {
                    }
                    break;
            }
            return OneKeyConnectEvent.ShowNotification.GeneralError;
        }
        return OneKeyConnectEvent.ShowNotification.GeneralError;
    }

    public static final void KWHzl(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        java.lang.String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55097xdX.setTitle(string);
        c55097xdX.setType(1);
        c55097xdX.setState(3);
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }
}
