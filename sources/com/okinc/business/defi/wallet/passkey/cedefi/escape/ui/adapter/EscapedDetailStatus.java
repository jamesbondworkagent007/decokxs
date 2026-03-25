package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EscapedDetailStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EscapedDetailStatus[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final EscapedDetailStatus IN_PROGRESS = new EscapedDetailStatus("IN_PROGRESS", 0, 2);
    public static final EscapedDetailStatus COMPLETED = new EscapedDetailStatus("COMPLETED", 1, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EscapedDetailStatus[] $values() {
        return new EscapedDetailStatus[]{IN_PROGRESS, COMPLETED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EscapedDetailStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private EscapedDetailStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        EscapedDetailStatus[] escapedDetailStatusArr$values = $values();
        $VALUES = escapedDetailStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(escapedDetailStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedDetailStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final EscapedDetailStatus EZpvd(int i) {
            EscapedDetailStatus escapedDetailStatus;
            EscapedDetailStatus[] escapedDetailStatusArrValues = EscapedDetailStatus.values();
            int length = escapedDetailStatusArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    escapedDetailStatus = null;
                    break;
                }
                escapedDetailStatus = escapedDetailStatusArrValues[i2];
                if (escapedDetailStatus.getValue() == i) {
                    break;
                }
                i2++;
            }
            return escapedDetailStatus == null ? EscapedDetailStatus.IN_PROGRESS : escapedDetailStatus;
        }
    }

    public static EscapedDetailStatus valueOf(String str) {
        return (EscapedDetailStatus) Enum.valueOf(EscapedDetailStatus.class, str);
    }

    public static EscapedDetailStatus[] values() {
        return (EscapedDetailStatus[]) $VALUES.clone();
    }
}
