package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EscapeSignStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EscapeSignStatus[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final EscapeSignStatus ESCAPE_SIGN_STATUS_UNSTARTED = new EscapeSignStatus("ESCAPE_SIGN_STATUS_UNSTARTED", 0, 0);
    public static final EscapeSignStatus ESCAPE_SIGN_STATUS_COMPLETED = new EscapeSignStatus("ESCAPE_SIGN_STATUS_COMPLETED", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EscapeSignStatus[] $values() {
        return new EscapeSignStatus[]{ESCAPE_SIGN_STATUS_UNSTARTED, ESCAPE_SIGN_STATUS_COMPLETED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EscapeSignStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private EscapeSignStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        EscapeSignStatus[] escapeSignStatusArr$values = $values();
        $VALUES = escapeSignStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(escapeSignStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static EscapeSignStatus valueOf(String str) {
        return (EscapeSignStatus) Enum.valueOf(EscapeSignStatus.class, str);
    }

    public static EscapeSignStatus[] values() {
        return (EscapeSignStatus[]) $VALUES.clone();
    }
}
