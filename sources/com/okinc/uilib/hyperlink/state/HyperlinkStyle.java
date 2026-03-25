package com.okinc.uilib.hyperlink.state;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class HyperlinkStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HyperlinkStyle[] $VALUES;
    public static final Application Companion;
    private final int id;
    private final int textColorRes;
    public static final HyperlinkStyle PRIMARY = new HyperlinkStyle("PRIMARY", 0, 0, C52761wXj.Activity.svhCHd);
    public static final HyperlinkStyle ACCENT = new HyperlinkStyle("ACCENT", 1, 1, C52761wXj.ActionBar.OcIXYQ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HyperlinkStyle[] $values() {
        return new HyperlinkStyle[]{PRIMARY, ACCENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HyperlinkStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextColorRes$OKUILib_uilib() {
        return this.textColorRes;
    }

    private HyperlinkStyle(String str, int i, int i2, int i3) {
        this.id = i2;
        this.textColorRes = i3;
    }

    static {
        HyperlinkStyle[] hyperlinkStyleArr$values = $values();
        $VALUES = hyperlinkStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hyperlinkStyleArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilib.hyperlink.state.HyperlinkStyle.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final HyperlinkStyle copydefault(int i) {
            HyperlinkStyle hyperlinkStyle;
            HyperlinkStyle[] hyperlinkStyleArrValues = HyperlinkStyle.values();
            int length = hyperlinkStyleArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hyperlinkStyle = null;
                    break;
                }
                hyperlinkStyle = hyperlinkStyleArrValues[i2];
                if (hyperlinkStyle.getId() == i) {
                    break;
                }
                i2++;
            }
            return hyperlinkStyle == null ? HyperlinkStyle.PRIMARY : hyperlinkStyle;
        }
    }

    public static HyperlinkStyle valueOf(String str) {
        return (HyperlinkStyle) Enum.valueOf(HyperlinkStyle.class, str);
    }

    public static HyperlinkStyle[] values() {
        return (HyperlinkStyle[]) $VALUES.clone();
    }
}
