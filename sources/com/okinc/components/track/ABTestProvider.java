package com.okinc.components.track;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ABTestProvider {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ABTestProvider[] $VALUES;
    public static final StateListAnimator Companion;
    private final String displayName;
    public static final ABTestProvider SKYLAB = new ABTestProvider("SKYLAB", 0, "skylab");
    public static final ABTestProvider BYTEDANCE = new ABTestProvider("BYTEDANCE", 1, "bytedance");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ABTestProvider[] $values() {
        return new ABTestProvider[]{SKYLAB, BYTEDANCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ABTestProvider> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    private ABTestProvider(String str, int i, String str2) {
        this.displayName = str2;
    }

    static {
        ABTestProvider[] aBTestProviderArr$values = $values();
        $VALUES = aBTestProviderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aBTestProviderArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.ABTestProvider.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static ABTestProvider valueOf(String str) {
        return (ABTestProvider) Enum.valueOf(ABTestProvider.class, str);
    }

    public static ABTestProvider[] values() {
        return (ABTestProvider[]) $VALUES.clone();
    }
}
