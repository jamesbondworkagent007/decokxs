package com.okinc.uilib.hyperlink.state;

import androidx.annotation.DimenRes;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class HyperlinkSize {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HyperlinkSize[] $VALUES;
    public static final StateListAnimator Companion;
    private final int id;
    private final int lineHeight;
    private final int textSize;
    public static final HyperlinkSize SMALL = new HyperlinkSize("SMALL", 0, 0, C52761wXj.StateListAnimator.gkJEwt, C52761wXj.StateListAnimator.hDKMBd);
    public static final HyperlinkSize MEDIUM = new HyperlinkSize(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1, 1, C52761wXj.StateListAnimator.iZzfmt, C52761wXj.StateListAnimator.getFieldNames);
    public static final HyperlinkSize LARGE = new HyperlinkSize("LARGE", 2, 2, C52761wXj.StateListAnimator.hUfVAv, C52761wXj.StateListAnimator.uzCIH);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HyperlinkSize[] $values() {
        return new HyperlinkSize[]{SMALL, MEDIUM, LARGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HyperlinkSize> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLineHeight$OKUILib_uilib() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextSize$OKUILib_uilib() {
        return this.textSize;
    }

    private HyperlinkSize(String str, @DimenRes int i, @DimenRes int i2, int i3, int i4) {
        this.id = i2;
        this.textSize = i3;
        this.lineHeight = i4;
    }

    static {
        HyperlinkSize[] hyperlinkSizeArr$values = $values();
        $VALUES = hyperlinkSizeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hyperlinkSizeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilib.hyperlink.state.HyperlinkSize.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final HyperlinkSize EZpvd(int i) {
            HyperlinkSize hyperlinkSize;
            HyperlinkSize[] hyperlinkSizeArrValues = HyperlinkSize.values();
            int length = hyperlinkSizeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hyperlinkSize = null;
                    break;
                }
                hyperlinkSize = hyperlinkSizeArrValues[i2];
                if (hyperlinkSize.getId() == i) {
                    break;
                }
                i2++;
            }
            return hyperlinkSize == null ? HyperlinkSize.MEDIUM : hyperlinkSize;
        }
    }

    public static HyperlinkSize valueOf(String str) {
        return (HyperlinkSize) Enum.valueOf(HyperlinkSize.class, str);
    }

    public static HyperlinkSize[] values() {
        return (HyperlinkSize[]) $VALUES.clone();
    }
}
