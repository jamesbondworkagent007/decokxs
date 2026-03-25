package com.okinc.auth.api.passkey;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PasskeyVersionState {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyVersionState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeyVersionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeyVersionState() {
    }

    public static final class Fido2Compatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido2Compatible INSTANCE = new Fido2Compatible();

        private Fido2Compatible() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido2ScreenLockDisabled extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido2ScreenLockDisabled INSTANCE = new Fido2ScreenLockDisabled();

        private Fido2ScreenLockDisabled() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido2ChinaIp extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido2ChinaIp INSTANCE = new Fido2ChinaIp();

        private Fido2ChinaIp() {
            super(null);
        }
    }

    public static final class Fido1v2Compatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1v2Compatible INSTANCE = new Fido1v2Compatible();

        private Fido1v2Compatible() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido1v1Compatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1v1Compatible INSTANCE = new Fido1v1Compatible();

        private Fido1v1Compatible() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido1BiometricNotEnrolled extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1BiometricNotEnrolled INSTANCE = new Fido1BiometricNotEnrolled();

        private Fido1BiometricNotEnrolled() {
            super(null);
        }
    }

    public static final class Fido1NotInGreyScale extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1NotInGreyScale INSTANCE = new Fido1NotInGreyScale();

        private Fido1NotInGreyScale() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido1HardwareIncompatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1HardwareIncompatible INSTANCE = new Fido1HardwareIncompatible();

        private Fido1HardwareIncompatible() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fido1AndroidVersionIncompatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final Fido1AndroidVersionIncompatible INSTANCE = new Fido1AndroidVersionIncompatible();

        private Fido1AndroidVersionIncompatible() {
            super(null);
        }
    }

    public static final class DeviceIncompatible extends PasskeyVersionState {
        public static final int $stable = 0;
        public static final DeviceIncompatible INSTANCE = new DeviceIncompatible();

        private DeviceIncompatible() {
            super(null);
        }
    }
}
