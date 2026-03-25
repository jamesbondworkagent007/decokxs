package com.okinc.business.market.features.vibes.domain;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C22366hdx;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VibesSortType[] $VALUES;
    public static final Application Companion;
    private final int nameResId;
    private final int tooltipResId;
    private final String trackValue;
    private final int value;
    public static final VibesSortType ENGAGEMENTS = new VibesSortType("ENGAGEMENTS", 0, 1, C22366hdx.StateListAnimator.djSkpj, "engagements", C22366hdx.StateListAnimator.fFgQHt);
    public static final VibesSortType IMPRESSIONS = new VibesSortType("IMPRESSIONS", 1, 2, C22366hdx.StateListAnimator.dNCPSb, "impressions", C22366hdx.StateListAnimator.fZBcTu);
    public static final VibesSortType MENTIONS = new VibesSortType("MENTIONS", 2, 3, C22366hdx.StateListAnimator.finit, "mentions", C22366hdx.StateListAnimator.dxcTrN);
    public static final VibesSortType FIRST_MENTION = new VibesSortType("FIRST_MENTION", 3, 4, C22366hdx.StateListAnimator.RcXXUw, "first_mention", C22366hdx.StateListAnimator.fFgQHt);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VibesSortType[] $values() {
        return new VibesSortType[]{ENGAGEMENTS, IMPRESSIONS, MENTIONS, FIRST_MENTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VibesSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNameResId() {
        return this.nameResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTooltipResId() {
        return this.tooltipResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackValue() {
        return this.trackValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private VibesSortType(String str, int i, int i2, int i3, String str2, int i4) {
        this.value = i2;
        this.nameResId = i3;
        this.trackValue = str2;
        this.tooltipResId = i4;
    }

    static {
        VibesSortType[] vibesSortTypeArr$values = $values();
        $VALUES = vibesSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vibesSortTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.vibes.domain.VibesSortType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final VibesSortType copydefault(@NotNull String str) {
            VibesSortType next;
            Intrinsics.checkNotNullParameter(str, "");
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
            Iterator<VibesSortType> it = VibesSortType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value = next.getValue();
                if (intOrNull != null && value == intOrNull.intValue()) {
                    break;
                }
            }
            VibesSortType vibesSortType = next;
            return vibesSortType == null ? VibesSortType.ENGAGEMENTS : vibesSortType;
        }
    }

    public static VibesSortType valueOf(String str) {
        return (VibesSortType) Enum.valueOf(VibesSortType.class, str);
    }

    public static VibesSortType[] values() {
        return (VibesSortType[]) $VALUES.clone();
    }
}
