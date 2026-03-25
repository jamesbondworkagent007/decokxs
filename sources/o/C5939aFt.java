package o;

import androidx.biometric.BiometricManager;
import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.okuser.data.User;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5939aFt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC47278tmy EZpvd;

    /* JADX INFO: renamed from: o.aFt$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyDebugTool.PasskeyVersionStatus.values().length];
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO1_V1_V2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_INCOMPATIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C5939aFt(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.EZpvd = interfaceC47278tmy;
    }

    public final int KWHzl(@NotNull BiometricManager biometricManager, int i) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(biometricManager, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(biometricManager.canAuthenticate(i)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CheckFido1UseCase", "canAuthenticate exception: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = -1;
        }
        return ((java.lang.Number) objM7377constructorimpl).intValue();
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super PasskeyFido1State> continuation) {
        java.lang.Object obj;
        com.okinc.okuser.data.UserInfo info;
        BiometricManager biometricManagerFrom = BiometricManager.from(C32979mnm.EZpvd.OLrzqt().getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "");
        int iKWHzl = KWHzl(biometricManagerFrom, 255);
        int iKWHzl2 = KWHzl(biometricManagerFrom, 15);
        KWHzl(biometricManagerFrom, 255);
        boolean z = false;
        boolean z2 = KWHzl(biometricManagerFrom, 32768) == 0;
        boolean z3 = iKWHzl == 0;
        boolean z4 = iKWHzl2 == 0;
        boolean z5 = iKWHzl2 == 11;
        boolean z6 = iKWHzl2 == 12;
        boolean z7 = iKWHzl2 == -2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n                passkey getFido1State:\n                - isDeviceCredential: ");
        sb.append(z2);
        sb.append("\n                - isWeak: ");
        sb.append(z3);
        sb.append("\n                - isStrong: ");
        sb.append(z4);
        sb.append("\n                - isStrongEnrolled: ");
        sb.append(!z5);
        sb.append("\n                - isHardwareSupported: ");
        sb.append(!z6);
        sb.append("\n                - isAndroidVersionSupported: ");
        sb.append(!z7);
        sb.append("\n            ");
        pUU.KWHzl("CheckFido1UseCase", C59442zhC.fJNWhG(sb.toString()));
        User userOLrzqt = this.EZpvd.OLrzqt();
        if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null && info.isInHousePasskeyV1GreyScaleOn()) {
            z = true;
        }
        pUU.KWHzl("CheckFido1UseCase", C59442zhC.fJNWhG("\n                passkey getFido1State:\n                - isFido1GreyScaleOn: " + z + "\n            "));
        if (!z) {
            obj = PasskeyFido1State.NotInGreyScale.INSTANCE;
        } else if (z2) {
            obj = PasskeyFido1State.Compatible.INSTANCE;
        } else if (z6) {
            obj = PasskeyFido1State.HardwareIncompatible.INSTANCE;
        } else if (z7) {
            obj = PasskeyFido1State.AndroidVersionIncompatible.INSTANCE;
        } else if (z5) {
            obj = PasskeyFido1State.BiometricNotEnrolled.INSTANCE;
        } else if (z4) {
            obj = PasskeyFido1State.Compatible.INSTANCE;
        } else {
            obj = PasskeyFido1State.DeviceIncompatible.INSTANCE;
        }
        int i = TaskDescription.OLrzqt[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            obj = PasskeyFido1State.DeviceIncompatible.INSTANCE;
        }
        pUU.KWHzl("CheckFido1UseCase", "finalState: " + obj);
        return obj;
    }

    /* JADX INFO: renamed from: o.aFt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
