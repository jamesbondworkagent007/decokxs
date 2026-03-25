package com.okinc.business.market.features.meme.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeTabType[] $VALUES;
    public static final StateListAnimator Companion;
    private final String trackKey;
    public static final MemeTabType NEW_PAIR = new MemeTabType("NEW_PAIR", 0, "new_pair");
    public static final MemeTabType FINALIZING = new MemeTabType("FINALIZING", 1, "migrating_soon");
    public static final MemeTabType LAUNCHED = new MemeTabType("LAUNCHED", 2, "migrated");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeTabType[] $values() {
        return new MemeTabType[]{NEW_PAIR, FINALIZING, LAUNCHED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeTabType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackKey() {
        return this.trackKey;
    }

    private MemeTabType(String str, int i, String str2) {
        this.trackKey = str2;
    }

    static {
        MemeTabType[] memeTabTypeArr$values = $values();
        $VALUES = memeTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeTabTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.domain.model.MemeTabType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final MemeTabType AEQbTJ(int i) {
            if (i == 0) {
                return MemeTabType.NEW_PAIR;
            }
            if (i == 1) {
                return MemeTabType.FINALIZING;
            }
            if (i == 2) {
                return MemeTabType.LAUNCHED;
            }
            return MemeTabType.NEW_PAIR;
        }

        public final String copydefault(@NotNull MemeTabType memeTabType) {
            Intrinsics.checkNotNullParameter(memeTabType, "");
            return memeTabType.getTrackKey();
        }
    }

    public static MemeTabType valueOf(String str) {
        return (MemeTabType) Enum.valueOf(MemeTabType.class, str);
    }

    public static MemeTabType[] values() {
        return (MemeTabType[]) $VALUES.clone();
    }
}
