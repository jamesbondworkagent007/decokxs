package o;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.okuser.data.User;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5937aFr {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC47278tmy copydefault;

    /* JADX INFO: renamed from: o.aFr$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    @yCM
    public C5937aFr(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.copydefault = interfaceC47278tmy;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super PasskeyVersionState> continuation) {
        java.lang.Object obj;
        com.okinc.okuser.data.UserInfo info;
        User userOLrzqt = this.copydefault.OLrzqt();
        boolean z = (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null || !info.isInHousePasskeyV2GreyScaleOn()) ? false : true;
        pUU.KWHzl("CheckFido1V2UseCase", "isGreyScaleOn: " + z);
        if (!z) {
            obj = PasskeyVersionState.Fido1NotInGreyScale.INSTANCE;
        } else {
            obj = PasskeyVersionState.Fido1v2Compatible.INSTANCE;
        }
        int i = Activity.KWHzl[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            obj = PasskeyVersionState.DeviceIncompatible.INSTANCE;
        }
        pUU.KWHzl("CheckFido1V2UseCase", "finalState: " + obj);
        return obj;
    }

    /* JADX INFO: renamed from: o.aFr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
