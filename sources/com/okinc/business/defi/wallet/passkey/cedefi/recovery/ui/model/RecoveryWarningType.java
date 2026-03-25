package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class RecoveryWarningType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecoveryWarningType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final RecoveryWarningType OVER_LIMIT = new RecoveryWarningType("OVER_LIMIT", 0, 1);
    public static final RecoveryWarningType DEVICE_NOT_SUPPORT_PASSKEY = new RecoveryWarningType("DEVICE_NOT_SUPPORT_PASSKEY", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecoveryWarningType[] $values() {
        return new RecoveryWarningType[]{OVER_LIMIT, DEVICE_NOT_SUPPORT_PASSKEY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecoveryWarningType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RecoveryWarningType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RecoveryWarningType[] recoveryWarningTypeArr$values = $values();
        $VALUES = recoveryWarningTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recoveryWarningTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.model.RecoveryWarningType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RecoveryWarningType OLrzqt(int i) {
            RecoveryWarningType next;
            Iterator<RecoveryWarningType> it = RecoveryWarningType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            return next;
        }
    }

    public static RecoveryWarningType valueOf(String str) {
        return (RecoveryWarningType) Enum.valueOf(RecoveryWarningType.class, str);
    }

    public static RecoveryWarningType[] values() {
        return (RecoveryWarningType[]) $VALUES.clone();
    }
}
