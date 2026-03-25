package com.okinc.business.defi.biz.constant;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KLineState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KLineState[] $VALUES;
    public static final StateListAnimator Companion;
    public static final KLineState Collapsed = new KLineState("Collapsed", 0);
    public static final KLineState Expanded = new KLineState("Expanded", 1);
    public static final KLineState Unknown = new KLineState("Unknown", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KLineState[] $values() {
        return new KLineState[]{Collapsed, Expanded, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KLineState> getEntries() {
        return $ENTRIES;
    }

    private KLineState(String str, int i) {
    }

    static {
        KLineState[] kLineStateArr$values = $values();
        $VALUES = kLineStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kLineStateArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.KLineState.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static KLineState valueOf(String str) {
        return (KLineState) Enum.valueOf(KLineState.class, str);
    }

    public static KLineState[] values() {
        return (KLineState[]) $VALUES.clone();
    }
}
