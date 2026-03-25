package com.okinc.uilib.hyperlink.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class HyperlinkFontWeight {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HyperlinkFontWeight[] $VALUES;
    public static final StateListAnimator Companion;
    private final int fontWeight;
    private final int id;
    public static final HyperlinkFontWeight REGULAR = new HyperlinkFontWeight("REGULAR", 0, 0, 400);
    public static final HyperlinkFontWeight MEDIUM = new HyperlinkFontWeight(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1, 1, 500);
    public static final HyperlinkFontWeight BOLD = new HyperlinkFontWeight("BOLD", 2, 2, TypedValues.TransitionType.TYPE_DURATION);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HyperlinkFontWeight[] $values() {
        return new HyperlinkFontWeight[]{REGULAR, MEDIUM, BOLD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HyperlinkFontWeight> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFontWeight$OKUILib_uilib() {
        return this.fontWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId$OKUILib_uilib() {
        return this.id;
    }

    private HyperlinkFontWeight(String str, int i, int i2, int i3) {
        this.id = i2;
        this.fontWeight = i3;
    }

    static {
        HyperlinkFontWeight[] hyperlinkFontWeightArr$values = $values();
        $VALUES = hyperlinkFontWeightArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hyperlinkFontWeightArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilib.hyperlink.state.HyperlinkFontWeight.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final HyperlinkFontWeight AEQbTJ(int i) {
            HyperlinkFontWeight hyperlinkFontWeight;
            HyperlinkFontWeight[] hyperlinkFontWeightArrValues = HyperlinkFontWeight.values();
            int length = hyperlinkFontWeightArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hyperlinkFontWeight = null;
                    break;
                }
                hyperlinkFontWeight = hyperlinkFontWeightArrValues[i2];
                if (hyperlinkFontWeight.getId$OKUILib_uilib() == i) {
                    break;
                }
                i2++;
            }
            return hyperlinkFontWeight == null ? HyperlinkFontWeight.MEDIUM : hyperlinkFontWeight;
        }
    }

    public static HyperlinkFontWeight valueOf(String str) {
        return (HyperlinkFontWeight) Enum.valueOf(HyperlinkFontWeight.class, str);
    }

    public static HyperlinkFontWeight[] values() {
        return (HyperlinkFontWeight[]) $VALUES.clone();
    }
}
