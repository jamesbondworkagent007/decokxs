package com.okinc.auth.api.passkey;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PasskeyFido1State {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyFido1State.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeyFido1State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeyFido1State() {
    }

    public static final class Compatible extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final Compatible INSTANCE = new Compatible();

        private Compatible() {
            super(null);
        }
    }

    public static final class BiometricNotEnrolled extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final BiometricNotEnrolled INSTANCE = new BiometricNotEnrolled();

        private BiometricNotEnrolled() {
            super(null);
        }
    }

    public static final class NotInGreyScale extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final NotInGreyScale INSTANCE = new NotInGreyScale();

        private NotInGreyScale() {
            super(null);
        }
    }

    public static final class HardwareIncompatible extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final HardwareIncompatible INSTANCE = new HardwareIncompatible();

        private HardwareIncompatible() {
            super(null);
        }
    }

    public static final class AndroidVersionIncompatible extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final AndroidVersionIncompatible INSTANCE = new AndroidVersionIncompatible();

        private AndroidVersionIncompatible() {
            super(null);
        }
    }

    public static final class DeviceIncompatible extends PasskeyFido1State {
        public static final int $stable = 0;
        public static final DeviceIncompatible INSTANCE = new DeviceIncompatible();

        private DeviceIncompatible() {
            super(null);
        }
    }

    public final PasskeyVersionState toPasskeyVersionState(@NotNull PasskeyFido1State passkeyFido1State) {
        Intrinsics.checkNotNullParameter(passkeyFido1State, "");
        if (passkeyFido1State instanceof Compatible) {
            return PasskeyVersionState.Fido1v1Compatible.INSTANCE;
        }
        if (passkeyFido1State instanceof BiometricNotEnrolled) {
            return PasskeyVersionState.Fido1BiometricNotEnrolled.INSTANCE;
        }
        if (passkeyFido1State instanceof NotInGreyScale) {
            return PasskeyVersionState.Fido1NotInGreyScale.INSTANCE;
        }
        if (passkeyFido1State instanceof HardwareIncompatible) {
            return PasskeyVersionState.Fido1HardwareIncompatible.INSTANCE;
        }
        if (passkeyFido1State instanceof AndroidVersionIncompatible) {
            return PasskeyVersionState.Fido1AndroidVersionIncompatible.INSTANCE;
        }
        if (passkeyFido1State instanceof DeviceIncompatible) {
            return PasskeyVersionState.DeviceIncompatible.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
