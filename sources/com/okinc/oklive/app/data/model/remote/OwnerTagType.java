package com.okinc.oklive.app.data.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class OwnerTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OwnerTagType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final OwnerTagType OFFICIAL = new OwnerTagType("OFFICIAL", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OwnerTagType[] $values() {
        return new OwnerTagType[]{OFFICIAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OwnerTagType> getEntries() {
        return $ENTRIES;
    }

    private OwnerTagType(String str, int i) {
    }

    static {
        OwnerTagType[] ownerTagTypeArr$values = $values();
        $VALUES = ownerTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ownerTagTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.model.remote.OwnerTagType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final OwnerTagType KWHzl(int i) {
            if (1 > i || i >= 101) {
                return null;
            }
            return OwnerTagType.OFFICIAL;
        }
    }

    public static OwnerTagType valueOf(String str) {
        return (OwnerTagType) Enum.valueOf(OwnerTagType.class, str);
    }

    public static OwnerTagType[] values() {
        return (OwnerTagType[]) $VALUES.clone();
    }
}
