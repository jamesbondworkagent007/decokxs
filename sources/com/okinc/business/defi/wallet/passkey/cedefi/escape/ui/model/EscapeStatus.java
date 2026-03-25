package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class EscapeStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EscapeStatus[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final EscapeStatus ESCAPE_STATUS_NORMAL = new EscapeStatus("ESCAPE_STATUS_NORMAL", 0, 0);
    public static final EscapeStatus ESCAPE_STATUS_ESCAPING = new EscapeStatus("ESCAPE_STATUS_ESCAPING", 1, 1);
    public static final EscapeStatus ESCAPE_STATUS_ESCAPED = new EscapeStatus("ESCAPE_STATUS_ESCAPED", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EscapeStatus[] $values() {
        return new EscapeStatus[]{ESCAPE_STATUS_NORMAL, ESCAPE_STATUS_ESCAPING, ESCAPE_STATUS_ESCAPED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EscapeStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private EscapeStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        EscapeStatus[] escapeStatusArr$values = $values();
        $VALUES = escapeStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(escapeStatusArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static EscapeStatus valueOf(String str) {
        return (EscapeStatus) Enum.valueOf(EscapeStatus.class, str);
    }

    public static EscapeStatus[] values() {
        return (EscapeStatus[]) $VALUES.clone();
    }
}
