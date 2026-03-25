package o;

import android.text.style.LeadingMarginSpan;
import com.okinc.uilab.richtext.htmlspanner.spans.FontFamilySpan;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;
import java.util.Objects;

/* JADX INFO: renamed from: o.xfv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55227xfv implements InterfaceC55141xeO {
    public Style EZpvd;
    public C55130xeD KWHzl;
    public int OLrzqt;
    public int copydefault;

    public C55227xfv(C55130xeD c55130xeD, Style style, int i, int i2) {
        this.KWHzl = c55130xeD;
        this.EZpvd = style;
        this.OLrzqt = i;
        this.copydefault = i2;
    }

    @Override // o.InterfaceC55141xeO
    public void KWHzl(C55135xeI c55135xeI, android.text.SpannableStringBuilder spannableStringBuilder) {
        FontFamilySpan fontFamilySpan;
        java.lang.Object c55221xfp;
        if (this.EZpvd.AhwBna() != null || this.EZpvd.djBIcL() != null || this.EZpvd.AYXKKw() != null) {
            FontFamilySpan fontFamilySpanOLrzqt = OLrzqt(spannableStringBuilder, this.OLrzqt, this.copydefault);
            if (this.EZpvd.AhwBna() == null && fontFamilySpanOLrzqt == null) {
                fontFamilySpan = new FontFamilySpan(this.KWHzl);
            } else if (this.EZpvd.AhwBna() != null) {
                fontFamilySpan = new FontFamilySpan(this.EZpvd.AhwBna());
            } else {
                fontFamilySpan = new FontFamilySpan(fontFamilySpanOLrzqt.AEQbTJ());
            }
            if (this.EZpvd.AYXKKw() != null) {
                fontFamilySpan.KWHzl(this.EZpvd.AYXKKw() == Style.FontWeight.BOLD);
            } else if (fontFamilySpanOLrzqt != null) {
                fontFamilySpan.KWHzl(fontFamilySpanOLrzqt.EZpvd());
            }
            if (this.EZpvd.djBIcL() != null) {
                fontFamilySpan.AEQbTJ(this.EZpvd.djBIcL() == Style.FontStyle.ITALIC);
            } else if (fontFamilySpanOLrzqt != null) {
                fontFamilySpan.AEQbTJ(fontFamilySpanOLrzqt.copydefault());
            }
            spannableStringBuilder.setSpan(fontFamilySpan, this.OLrzqt, this.copydefault, 33);
        }
        if (c55135xeI.copydefault() && this.EZpvd.AEQbTJ() != null && this.EZpvd.KWHzl() == null) {
            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.EZpvd.AEQbTJ().intValue()), this.OLrzqt, this.copydefault, 33);
        }
        if (this.EZpvd.KWHzl() != null) {
            spannableStringBuilder.setSpan(new C55223xfr(this.EZpvd, this.OLrzqt, this.copydefault, c55135xeI.copydefault()), this.OLrzqt, this.copydefault, 33);
        }
        if (this.EZpvd.gEmmrt() != null) {
            StyleValue styleValueGEmmrt = this.EZpvd.gEmmrt();
            if (styleValueGEmmrt.copydefault() == StyleValue.Unit.PX) {
                if (styleValueGEmmrt.KWHzl() > 0) {
                    spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(styleValueGEmmrt.KWHzl()), this.OLrzqt, this.copydefault, 33);
                }
            } else if (styleValueGEmmrt.EZpvd() > 0.0f) {
                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(styleValueGEmmrt.EZpvd()), this.OLrzqt, this.copydefault, 33);
            }
        }
        if (c55135xeI.copydefault() && this.EZpvd.OLrzqt() != null) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.EZpvd.OLrzqt().intValue()), this.OLrzqt, this.copydefault, 33);
        }
        if (this.EZpvd.values() != null) {
            int i = AnonymousClass5.OLrzqt[this.EZpvd.values().ordinal()];
            if (i == 1) {
                c55221xfp = new C55221xfp();
            } else if (i == 2) {
                c55221xfp = new C55222xfq();
            } else {
                c55221xfp = i != 3 ? null : new C55224xfs();
            }
            spannableStringBuilder.setSpan(c55221xfp, this.OLrzqt, this.copydefault, 33);
        }
        if (this.EZpvd.isConnected() != null) {
            StyleValue styleValueIsConnected = this.EZpvd.isConnected();
            int i2 = this.OLrzqt;
            while (i2 < this.copydefault && spannableStringBuilder.charAt(i2) == '\n') {
                i2++;
            }
            int iMin = java.lang.Math.min(this.copydefault, i2 + 1);
            Objects.toString(spannableStringBuilder.subSequence(i2, iMin));
            if (styleValueIsConnected.copydefault() == StyleValue.Unit.PX) {
                if (styleValueIsConnected.KWHzl() > 0) {
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(styleValueIsConnected.KWHzl(), 0), i2, iMin, 33);
                }
            } else if (styleValueIsConnected.EZpvd() > 0.0f) {
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) (styleValueIsConnected.EZpvd() * 10.0f), 0), i2, iMin, 33);
            }
        }
        if (this.EZpvd.AkhnZx() != null) {
            StyleValue styleValueAkhnZx = this.EZpvd.AkhnZx();
            if (styleValueAkhnZx.copydefault() == StyleValue.Unit.PX) {
                if (styleValueAkhnZx.KWHzl() > 0) {
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(styleValueAkhnZx.KWHzl()), this.OLrzqt, this.copydefault, 33);
                }
            } else if (styleValueAkhnZx.EZpvd() > 0.0f) {
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) (styleValueAkhnZx.EZpvd() * 10.0f)), this.OLrzqt, this.copydefault, 33);
            }
        }
    }

    /* JADX INFO: renamed from: o.xfv$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[Style.TextAlignment.values().length];
            OLrzqt = iArr;
            try {
                iArr[Style.TextAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[Style.TextAlignment.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[Style.TextAlignment.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public final FontFamilySpan OLrzqt(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        FontFamilySpan[] fontFamilySpanArr = (FontFamilySpan[]) spannableStringBuilder.getSpans(i, i2, FontFamilySpan.class);
        if (fontFamilySpanArr == null || fontFamilySpanArr.length <= 0) {
            return null;
        }
        return fontFamilySpanArr[fontFamilySpanArr.length - 1];
    }
}
