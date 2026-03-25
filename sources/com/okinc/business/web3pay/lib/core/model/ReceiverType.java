package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ReceiverType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReceiverType[] $VALUES;
    public static final Activity Companion;
    public static final ReceiverType EMAIL = new ReceiverType("EMAIL", 0, 1);
    public static final ReceiverType PHONE_NUMBER = new ReceiverType("PHONE_NUMBER", 1, 2);
    public static final ReceiverType UID = new ReceiverType("UID", 2, 3);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReceiverType[] $values() {
        return new ReceiverType[]{EMAIL, PHONE_NUMBER, UID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReceiverType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ReceiverType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ReceiverType[] receiverTypeArr$values = $values();
        $VALUES = receiverTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(receiverTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ReceiverType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ReceiverType EZpvd(Integer num) {
            for (ReceiverType receiverType : ReceiverType.values()) {
                int value = receiverType.getValue();
                if (num != null && value == num.intValue()) {
                    return receiverType;
                }
            }
            return null;
        }
    }

    public static ReceiverType valueOf(String str) {
        return (ReceiverType) Enum.valueOf(ReceiverType.class, str);
    }

    public static ReceiverType[] values() {
        return (ReceiverType[]) $VALUES.clone();
    }
}
