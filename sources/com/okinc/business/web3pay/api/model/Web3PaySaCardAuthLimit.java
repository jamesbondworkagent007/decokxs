package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Web3PaySaCardAuthLimit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PaySaCardAuthLimit[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final Web3PaySaCardAuthLimit LIMITED = new Web3PaySaCardAuthLimit("LIMITED", 0, 1);
    public static final Web3PaySaCardAuthLimit UNLIMITED = new Web3PaySaCardAuthLimit("UNLIMITED", 1, 2);
    public static final Web3PaySaCardAuthLimit DEACTIVATE = new Web3PaySaCardAuthLimit("DEACTIVATE", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PaySaCardAuthLimit[] $values() {
        return new Web3PaySaCardAuthLimit[]{LIMITED, UNLIMITED, DEACTIVATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PaySaCardAuthLimit> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Web3PaySaCardAuthLimit(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Web3PaySaCardAuthLimit[] web3PaySaCardAuthLimitArr$values = $values();
        $VALUES = web3PaySaCardAuthLimitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PaySaCardAuthLimitArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PaySaCardAuthLimit.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static Web3PaySaCardAuthLimit valueOf(String str) {
        return (Web3PaySaCardAuthLimit) Enum.valueOf(Web3PaySaCardAuthLimit.class, str);
    }

    public static Web3PaySaCardAuthLimit[] values() {
        return (Web3PaySaCardAuthLimit[]) $VALUES.clone();
    }
}
