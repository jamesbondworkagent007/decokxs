package com.okinc.business.dexlogic;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class MemeChainType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeChainType[] $VALUES;
    public static final StateListAnimator Companion;
    private final String value;
    public static final MemeChainType MemeChainTypeSol = new MemeChainType("MemeChainTypeSol", 0, "0");
    public static final MemeChainType MemeChainTypeEVM = new MemeChainType("MemeChainTypeEVM", 1, "1");
    public static final MemeChainType MemeChainTypeOther = new MemeChainType("MemeChainTypeOther", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeChainType[] $values() {
        return new MemeChainType[]{MemeChainTypeSol, MemeChainTypeEVM, MemeChainTypeOther};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeChainType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private MemeChainType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        MemeChainType[] memeChainTypeArr$values = $values();
        $VALUES = memeChainTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeChainTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.MemeChainType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final MemeChainType EZpvd(@NotNull String str) {
            MemeChainType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<MemeChainType> it = MemeChainType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            MemeChainType memeChainType = next;
            return memeChainType == null ? MemeChainType.MemeChainTypeOther : memeChainType;
        }
    }

    public static MemeChainType valueOf(String str) {
        return (MemeChainType) Enum.valueOf(MemeChainType.class, str);
    }

    public static MemeChainType[] values() {
        return (MemeChainType[]) $VALUES.clone();
    }
}
