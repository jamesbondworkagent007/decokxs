package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SaCardAuthLimit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SaCardAuthLimit[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final SaCardAuthLimit LIMITED = new SaCardAuthLimit("LIMITED", 0, 1);
    public static final SaCardAuthLimit UNLIMITED = new SaCardAuthLimit("UNLIMITED", 1, 2);
    public static final SaCardAuthLimit DEACTIVATE = new SaCardAuthLimit("DEACTIVATE", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SaCardAuthLimit[] $values() {
        return new SaCardAuthLimit[]{LIMITED, UNLIMITED, DEACTIVATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SaCardAuthLimit> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SaCardAuthLimit(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SaCardAuthLimit[] saCardAuthLimitArr$values = $values();
        $VALUES = saCardAuthLimitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(saCardAuthLimitArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SaCardAuthLimit AEQbTJ(Integer num) {
            for (SaCardAuthLimit saCardAuthLimit : SaCardAuthLimit.values()) {
                int value = saCardAuthLimit.getValue();
                if (num != null && value == num.intValue()) {
                    return saCardAuthLimit;
                }
            }
            return null;
        }
    }

    public static SaCardAuthLimit valueOf(String str) {
        return (SaCardAuthLimit) Enum.valueOf(SaCardAuthLimit.class, str);
    }

    public static SaCardAuthLimit[] values() {
        return (SaCardAuthLimit[]) $VALUES.clone();
    }
}
