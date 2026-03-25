package com.okinc.dexkline.trade.features.home.ui.cefi.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class NeedApprove {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NeedApprove[] $VALUES;
    public static final StateListAnimator Companion;
    private final String value;
    public static final NeedApprove YES = new NeedApprove("YES", 0, "1");
    public static final NeedApprove NO = new NeedApprove("NO", 1, "0");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NeedApprove[] $values() {
        return new NeedApprove[]{YES, NO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NeedApprove> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private NeedApprove(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        NeedApprove[] needApproveArr$values = $values();
        $VALUES = needApproveArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(needApproveArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static NeedApprove valueOf(String str) {
        return (NeedApprove) Enum.valueOf(NeedApprove.class, str);
    }

    public static NeedApprove[] values() {
        return (NeedApprove[]) $VALUES.clone();
    }
}
