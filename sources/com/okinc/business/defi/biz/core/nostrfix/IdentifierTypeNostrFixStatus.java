package com.okinc.business.defi.biz.core.nostrfix;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class IdentifierTypeNostrFixStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IdentifierTypeNostrFixStatus[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final IdentifierTypeNostrFixStatus IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT = new IdentifierTypeNostrFixStatus("IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT", 0, 0);
    public static final IdentifierTypeNostrFixStatus IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX = new IdentifierTypeNostrFixStatus("IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX", 1, 1);
    public static final IdentifierTypeNostrFixStatus IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED = new IdentifierTypeNostrFixStatus("IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED", 2, 2);
    public static final IdentifierTypeNostrFixStatus IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT = new IdentifierTypeNostrFixStatus("IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IdentifierTypeNostrFixStatus[] $values() {
        return new IdentifierTypeNostrFixStatus[]{IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT, IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX, IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED, IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IdentifierTypeNostrFixStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private IdentifierTypeNostrFixStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        IdentifierTypeNostrFixStatus[] identifierTypeNostrFixStatusArr$values = $values();
        $VALUES = identifierTypeNostrFixStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(identifierTypeNostrFixStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final IdentifierTypeNostrFixStatus AEQbTJ(int i) {
            if (i == 0) {
                return IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT;
            }
            if (i == 1) {
                return IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX;
            }
            if (i == 2) {
                return IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED;
            }
            if (i == 3) {
                return IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT;
            }
            return IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT;
        }
    }

    public static IdentifierTypeNostrFixStatus valueOf(String str) {
        return (IdentifierTypeNostrFixStatus) Enum.valueOf(IdentifierTypeNostrFixStatus.class, str);
    }

    public static IdentifierTypeNostrFixStatus[] values() {
        return (IdentifierTypeNostrFixStatus[]) $VALUES.clone();
    }
}
