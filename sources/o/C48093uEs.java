package o;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.exoplayer2.audio.WavUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48093uEs {
    public static final int AEQbTJ;
    public static final Regex AYXKKw;
    public static final Regex AhwBna;
    public static final C48093uEs EZpvd = new C48093uEs();
    public static final Regex KWHzl;
    public static final Regex OLrzqt;
    public static final Regex copydefault;
    public static final Regex djBIcL;
    public static final Regex valueOf;

    private C48093uEs() {
    }

    static {
        RegexOption regexOption = RegexOption.MULTILINE;
        OLrzqt = new Regex("^[ \\t]*(#{1,6})\\s*(.*)$", regexOption);
        valueOf = new Regex("^[ \\t]*>.*", regexOption);
        KWHzl = new Regex("\\*\\*(.*?)\\*\\*");
        copydefault = new Regex("(?<![*_])([*_])(?![\\s*_])([^\\n]+?)(?<![\\s*_])\\1(?![*_])");
        djBIcL = new Regex("(?<!_)__(?=[^ \\t_])(.+?)(?<=[^ \\t_])__(?!_)");
        AhwBna = new Regex("(?<!~)~~(?=[^ \\t~])(.+?)(?<=[^ \\t~])~~(?!~)");
        AYXKKw = new Regex("^[ \\t]*([*+-]|\\d+[.])[ \\t]+", regexOption);
        AEQbTJ = 8;
    }

    public final AnnotatedString copydefault(@NotNull java.lang.String str, long j, long j2, Color color, int i) {
        int i2 = i;
        Intrinsics.checkNotNullParameter(str, "");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(str);
        SpanStyle spanStyle = new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (java.lang.String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null);
        int i3 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
        byte b = 0 == true ? 1 : 0;
        byte b2 = 0 == true ? 1 : 0;
        byte b3 = 0 == true ? 1 : 0;
        byte b4 = 0 == true ? 1 : 0;
        byte b5 = 0 == true ? 1 : 0;
        SpanStyle spanStyle2 = new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) b, (java.lang.String) b2, 0L, (BaselineShift) null, (TextGeometricTransform) (0 == true ? 1 : 0), (androidx.compose.ui.text.intl.LocaleList) (0 == true ? 1 : 0), 0L, (TextDecoration) b3, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) b4, i3, (DefaultConstructorMarker) b5);
        long j3 = 0;
        long j4 = 0;
        FontStyle fontStyle = null;
        FontSynthesis fontSynthesis = null;
        FontFamily fontFamily = null;
        java.lang.String str2 = null;
        long j5 = 0;
        BaselineShift baselineShift = null;
        TextGeometricTransform textGeometricTransform = null;
        androidx.compose.ui.text.intl.LocaleList localeList = null;
        long j6 = 0;
        Shadow shadow = null;
        PlatformSpanStyle platformSpanStyle = null;
        DrawStyle drawStyle = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SpanStyle spanStyle3 = new SpanStyle(j3, j4, FontWeight.Companion.getBold(), fontStyle, fontSynthesis, fontFamily, str2, j5, baselineShift, textGeometricTransform, localeList, j6, (TextDecoration) null, shadow, platformSpanStyle, drawStyle, 65531, defaultConstructorMarker);
        byte b6 = 0 == true ? 1 : 0;
        byte b7 = 0 == true ? 1 : 0;
        byte b8 = 0 == true ? 1 : 0;
        byte b9 = 0 == true ? 1 : 0;
        SpanStyle spanStyle4 = new SpanStyle(0L, 0L, (FontWeight) (0 == true ? 1 : 0), FontStyle.m5016boximpl(FontStyle.Companion.m5023getItalic_LCdwA()), (FontSynthesis) b6, (FontFamily) b7, (java.lang.String) null, 0L, (BaselineShift) (0 == true ? 1 : 0), (TextGeometricTransform) (0 == true ? 1 : 0), (androidx.compose.ui.text.intl.LocaleList) null, 0L, (TextDecoration) (0 == true ? 1 : 0), (Shadow) (0 == true ? 1 : 0), (PlatformSpanStyle) b8, (DrawStyle) null, 65527, (DefaultConstructorMarker) b9);
        TextDecoration.Companion companion = TextDecoration.Companion;
        byte b10 = 0 == true ? 1 : 0;
        byte b11 = 0 == true ? 1 : 0;
        byte b12 = 0 == true ? 1 : 0;
        SpanStyle spanStyle5 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) b10, (FontSynthesis) b11, (FontFamily) (0 == true ? 1 : 0), (java.lang.String) null, 0L, (BaselineShift) null, (TextGeometricTransform) (0 == true ? 1 : 0), (androidx.compose.ui.text.intl.LocaleList) null, 0L, companion.getUnderline(), (Shadow) b12, (PlatformSpanStyle) (0 == true ? 1 : 0), (DrawStyle) null, 61439, (DefaultConstructorMarker) null);
        SpanStyle spanStyle6 = new SpanStyle(j3, j4, (FontWeight) null, fontStyle, fontSynthesis, fontFamily, str2, j5, baselineShift, textGeometricTransform, localeList, j6, companion.getLineThrough(), shadow, platformSpanStyle, drawStyle, 61439, defaultConstructorMarker);
        if (i2 < 0 || str.length() <= i2) {
            i2 = -1;
        }
        java.util.Iterator it = Regex.findAll$default(OLrzqt, str, 0, 2, null).iterator();
        while (it.hasNext()) {
            copydefault(i2, builder, spanStyle, ((MatchResult) it.next()).copydefault());
        }
        java.util.Iterator it2 = Regex.findAll$default(valueOf, str, 0, 2, null).iterator();
        while (it2.hasNext()) {
            copydefault(i2, builder, spanStyle2, ((MatchResult) it2.next()).copydefault());
        }
        java.util.Iterator it3 = Regex.findAll$default(AYXKKw, str, 0, 2, null).iterator();
        while (it3.hasNext()) {
            copydefault(i2, builder, spanStyle3, ((MatchResult) it3.next()).copydefault());
        }
        java.util.Iterator it4 = Regex.findAll$default(KWHzl, str, 0, 2, null).iterator();
        while (it4.hasNext()) {
            copydefault(i2, builder, spanStyle3, ((MatchResult) it4.next()).copydefault());
        }
        java.util.Iterator it5 = Regex.findAll$default(copydefault, str, 0, 2, null).iterator();
        while (it5.hasNext()) {
            copydefault(i2, builder, spanStyle4, ((MatchResult) it5.next()).copydefault());
        }
        java.util.Iterator it6 = Regex.findAll$default(djBIcL, str, 0, 2, null).iterator();
        while (it6.hasNext()) {
            copydefault(i2, builder, spanStyle5, ((MatchResult) it6.next()).copydefault());
        }
        java.util.Iterator it7 = Regex.findAll$default(AhwBna, str, 0, 2, null).iterator();
        while (it7.hasNext()) {
            copydefault(i2, builder, spanStyle6, ((MatchResult) it7.next()).copydefault());
        }
        if (i2 >= 0 && color != null) {
            builder.addStyle(new SpanStyle(color.m3159unboximpl(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (java.lang.String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), i2, str.length());
        }
        return builder.toAnnotatedString();
    }

    public static final void copydefault(int i, AnnotatedString.Builder builder, SpanStyle spanStyle, kotlin.ranges.IntRange intRange) {
        if (i >= 0 && intRange.copydefault() >= i) {
            int iMin = java.lang.Math.min(intRange.copydefault() + 1, i);
            if (intRange.KWHzl() < iMin) {
                builder.addStyle(spanStyle, intRange.KWHzl(), iMin);
                return;
            }
            return;
        }
        builder.addStyle(spanStyle, intRange.KWHzl(), intRange.copydefault() + 1);
    }
}
