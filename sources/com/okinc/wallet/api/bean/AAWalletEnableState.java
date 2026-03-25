package com.okinc.wallet.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AAWalletEnableState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AAWalletEnableState[] $VALUES;
    public static final TaskDescription Companion;
    private final int value;
    public static final AAWalletEnableState Normal = new AAWalletEnableState("Normal", 0, 0);
    public static final AAWalletEnableState ProxyAbnormal = new AAWalletEnableState("ProxyAbnormal", 1, 1);
    public static final AAWalletEnableState OwnerAbnormal = new AAWalletEnableState("OwnerAbnormal", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AAWalletEnableState[] $values() {
        return new AAWalletEnableState[]{Normal, ProxyAbnormal, OwnerAbnormal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AAWalletEnableState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AAWalletEnableState(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AAWalletEnableState[] aAWalletEnableStateArr$values = $values();
        $VALUES = aAWalletEnableStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aAWalletEnableStateArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.AAWalletEnableState.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static AAWalletEnableState valueOf(String str) {
        return (AAWalletEnableState) Enum.valueOf(AAWalletEnableState.class, str);
    }

    public static AAWalletEnableState[] values() {
        return (AAWalletEnableState[]) $VALUES.clone();
    }
}
