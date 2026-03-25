package o;

import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.material.resources.TextAppearance;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.wVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52698wVa {
    public static final TextStyle OLrzqt(@androidx.annotation.StyleRes int i, @androidx.annotation.ColorRes java.lang.Integer num, Composer composer, int i2, int i3) {
        long jM3159unboximpl;
        FontWeight fontWeight;
        FontWeight normal;
        composer.startReplaceableGroup(1628215366);
        int i4 = (i3 & 1) != 0 ? C52761wXj.LoaderManager.OBJEWx : i;
        java.lang.Integer num2 = (i3 & 2) != 0 ? null : num;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628215366, i2, -1, "com.okinc.tradingbot.impl.widget.textAppearance (FontStyle.kt:28)");
        }
        android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        TextAppearance textAppearance = new TextAppearance(context, i4);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, androidx.appcompat.R.styleable.TextAppearance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i4, androidx.appcompat.R.styleable.AppCompatTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings);
        float dimension = typedArrayObtainStyledAttributes2.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_lineHeight, 0.0f);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(androidx.appcompat.R.styleable.TextAppearance_textLocale);
        typedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes2.recycle();
        composer.startReplaceableGroup(1981185478);
        Color colorM3139boximpl = num2 == null ? null : Color.m3139boximpl(ColorResources_androidKt.colorResource(num2.intValue(), composer, 0));
        composer.endReplaceableGroup();
        if (colorM3139boximpl == null) {
            android.content.res.ColorStateList textColor = textAppearance.getTextColor();
            colorM3139boximpl = textColor != null ? Color.m3139boximpl(ColorKt.Color(textColor.getDefaultColor())) : null;
        }
        if (colorM3139boximpl != null) {
            jM3159unboximpl = colorM3139boximpl.m3159unboximpl();
        } else {
            jM3159unboximpl = ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composer, 0);
        }
        int iOLrzqt = C55366xib.OLrzqt(C52761wXj.ActionBar.Dmq, context);
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight normal2 = companion.getNormal();
        FontStyle.Companion companion2 = FontStyle.Companion;
        FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m5002FontYpTlLL0$default(iOLrzqt, normal2, companion2.m5024getNormal_LCdwA(), 0, 8, null), FontKt.m5002FontYpTlLL0$default(C55366xib.OLrzqt(C52761wXj.ActionBar.zblBkD, context), companion.getMedium(), companion2.m5024getNormal_LCdwA(), 0, 8, null), FontKt.m5002FontYpTlLL0$default(C55366xib.OLrzqt(C52761wXj.ActionBar.QwvEab, context), companion.getBold(), companion2.m5024getNormal_LCdwA(), 0, 8, null));
        if (Build.VERSION.SDK_INT >= 28) {
            int weight = textAppearance.getFont(context).getWeight();
            if (weight >= 700) {
                normal = companion.getBold();
            } else if (weight >= 500) {
                normal = companion.getMedium();
            } else {
                normal = companion.getNormal();
            }
            fontWeight = normal;
        } else {
            fontWeight = null;
        }
        long sp = TextUnitKt.getSp(C55298xhM.AhwBna(textAppearance.getTextSize(), context));
        java.lang.Float fValueOf = java.lang.Float.valueOf(textAppearance.letterSpacing);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        long sp2 = fValueOf != null ? TextUnitKt.getSp(C55298xhM.AhwBna(fValueOf.floatValue(), context)) : TextUnit.Companion.m5606getUnspecifiedXSAIIZE();
        androidx.compose.ui.text.intl.LocaleList localeList = string2 != null ? new androidx.compose.ui.text.intl.LocaleList(string2) : null;
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(dimension);
        java.lang.Float f = (fValueOf2.floatValue() == 0.0f) ^ true ? fValueOf2 : null;
        TextStyle textStyle = new TextStyle(jM3159unboximpl, sp, fontWeight, (FontStyle) null, (FontSynthesis) null, FontFamily, string, sp2, (BaselineShift) null, (TextGeometricTransform) null, localeList, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, f != null ? TextUnitKt.getSp(C55298xhM.AhwBna(f.floatValue(), context)) : TextUnit.Companion.m5606getUnspecifiedXSAIIZE(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16644888, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyle;
    }
}
