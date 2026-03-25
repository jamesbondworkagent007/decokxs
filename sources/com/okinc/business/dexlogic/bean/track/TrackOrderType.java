package com.okinc.business.dexlogic.bean.track;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TrackOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackOrderType[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final TrackOrderType SWAP = new TrackOrderType("SWAP", 0, "swap");
    public static final TrackOrderType BRIDGE = new TrackOrderType("BRIDGE", 1, TabTitleInfo.KEY_BRIDGE);
    public static final TrackOrderType LIMIT = new TrackOrderType("LIMIT", 2, "limit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackOrderType[] $values() {
        return new TrackOrderType[]{SWAP, BRIDGE, LIMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private TrackOrderType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        TrackOrderType[] trackOrderTypeArr$values = $values();
        $VALUES = trackOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackOrderTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[MemeStrategyType.values().length];
                try {
                    iArr[MemeStrategyType.BuyNow.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MemeStrategyType.SellNow.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.track.TrackOrderType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String AEQbTJ(@NotNull MemeStrategyType memeStrategyType) {
            Intrinsics.checkNotNullParameter(memeStrategyType, "");
            int i = StateListAnimator.KWHzl[memeStrategyType.ordinal()];
            if (i == 1) {
                return TrackOrderType.SWAP.getType();
            }
            if (i == 2) {
                return TrackOrderType.SWAP.getType();
            }
            return TrackOrderType.SWAP.getType();
        }
    }

    public static TrackOrderType valueOf(String str) {
        return (TrackOrderType) Enum.valueOf(TrackOrderType.class, str);
    }

    public static TrackOrderType[] values() {
        return (TrackOrderType[]) $VALUES.clone();
    }
}
