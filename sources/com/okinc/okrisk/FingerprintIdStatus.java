package com.okinc.okrisk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class FingerprintIdStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FingerprintIdStatus[] $VALUES;
    public static final Application Companion;
    private final int status;
    public static final FingerprintIdStatus SUCCESS = new FingerprintIdStatus("SUCCESS", 0, 0);
    public static final FingerprintIdStatus PARTIAL = new FingerprintIdStatus("PARTIAL", 1, 1);
    public static final FingerprintIdStatus FAIL = new FingerprintIdStatus("FAIL", 2, 3);
    public static final FingerprintIdStatus EXPIRED = new FingerprintIdStatus("EXPIRED", 3, 4);
    public static final FingerprintIdStatus NOT_PROFILE = new FingerprintIdStatus("NOT_PROFILE", 4, -1);
    public static final FingerprintIdStatus UNINITIALIZED = new FingerprintIdStatus("UNINITIALIZED", 5, -2);
    public static final FingerprintIdStatus INTERNAL_NETWORK_ABORT = new FingerprintIdStatus("INTERNAL_NETWORK_ABORT", 6, -777);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FingerprintIdStatus[] $values() {
        return new FingerprintIdStatus[]{SUCCESS, PARTIAL, FAIL, EXPIRED, NOT_PROFILE, UNINITIALIZED, INTERNAL_NETWORK_ABORT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FingerprintIdStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private FingerprintIdStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        FingerprintIdStatus[] fingerprintIdStatusArr$values = $values();
        $VALUES = fingerprintIdStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fingerprintIdStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.FingerprintIdStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final FingerprintIdStatus AEQbTJ(int i) {
            FingerprintIdStatus fingerprintIdStatus;
            FingerprintIdStatus[] fingerprintIdStatusArrValues = FingerprintIdStatus.values();
            int length = fingerprintIdStatusArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    fingerprintIdStatus = null;
                    break;
                }
                fingerprintIdStatus = fingerprintIdStatusArrValues[i2];
                if (fingerprintIdStatus.getStatus() == i) {
                    break;
                }
                i2++;
            }
            return fingerprintIdStatus == null ? FingerprintIdStatus.FAIL : fingerprintIdStatus;
        }
    }

    public static FingerprintIdStatus valueOf(String str) {
        return (FingerprintIdStatus) Enum.valueOf(FingerprintIdStatus.class, str);
    }

    public static FingerprintIdStatus[] values() {
        return (FingerprintIdStatus[]) $VALUES.clone();
    }
}
