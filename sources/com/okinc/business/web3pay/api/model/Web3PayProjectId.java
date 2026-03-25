package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Web3PayProjectId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PayProjectId[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final Web3PayProjectId NATIVE_PAY = new Web3PayProjectId("NATIVE_PAY", 0, 1);
    public static final Web3PayProjectId IM_PAY = new Web3PayProjectId("IM_PAY", 1, 100);
    public static final Web3PayProjectId GIFT_PAY = new Web3PayProjectId("GIFT_PAY", 2, 200);
    public static final Web3PayProjectId REWARDS = new Web3PayProjectId("REWARDS", 3, 300);
    public static final Web3PayProjectId CARD = new Web3PayProjectId("CARD", 4, 400);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PayProjectId[] $values() {
        return new Web3PayProjectId[]{NATIVE_PAY, IM_PAY, GIFT_PAY, REWARDS, CARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PayProjectId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Web3PayProjectId(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Web3PayProjectId[] web3PayProjectIdArr$values = $values();
        $VALUES = web3PayProjectIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PayProjectIdArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayProjectId.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static Web3PayProjectId valueOf(String str) {
        return (Web3PayProjectId) Enum.valueOf(Web3PayProjectId.class, str);
    }

    public static Web3PayProjectId[] values() {
        return (Web3PayProjectId[]) $VALUES.clone();
    }
}
