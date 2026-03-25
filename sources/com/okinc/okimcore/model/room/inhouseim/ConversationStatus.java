package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ConversationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConversationStatus[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final ConversationStatus NORMAL = new ConversationStatus("NORMAL", 0, 0);
    public static final ConversationStatus HIDDEN = new ConversationStatus("HIDDEN", 1, 1);
    public static final ConversationStatus DELETED = new ConversationStatus("DELETED", 2, 2);
    public static final ConversationStatus FOREVER_HIDDEN = new ConversationStatus("FOREVER_HIDDEN", 3, 3);
    public static final ConversationStatus UNKNOWN = new ConversationStatus("UNKNOWN", 4, -999);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConversationStatus[] $values() {
        return new ConversationStatus[]{NORMAL, HIDDEN, DELETED, FOREVER_HIDDEN, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConversationStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ConversationStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ConversationStatus[] conversationStatusArr$values = $values();
        $VALUES = conversationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(conversationStatusArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.ConversationStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ConversationStatus copydefault(Integer num) {
            ConversationStatus conversationStatus;
            ConversationStatus[] conversationStatusArrValues = ConversationStatus.values();
            int length = conversationStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    conversationStatus = null;
                    break;
                }
                conversationStatus = conversationStatusArrValues[i];
                int value = conversationStatus.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
                i++;
            }
            return conversationStatus == null ? ConversationStatus.UNKNOWN : conversationStatus;
        }
    }

    public static ConversationStatus valueOf(String str) {
        return (ConversationStatus) Enum.valueOf(ConversationStatus.class, str);
    }

    public static ConversationStatus[] values() {
        return (ConversationStatus[]) $VALUES.clone();
    }
}
