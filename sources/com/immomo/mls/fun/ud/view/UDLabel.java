package com.immomo.mls.fun.ud.view;

import android.graphics.BlendMode;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.KotlinUtils;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ui.custom.JColor;
import java.util.List;
import o.C52761wXj;
import o.C7460akJ;
import o.C7535alf;
import o.C7817aqw;
import o.C7829arH;
import o.C7833arL;
import o.C7865arr;
import o.C7870arw;
import o.C7910asj;
import o.C7911ask;
import o.InterfaceC60044zuT;
import o.InterfaceC7405ajH;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDLabel<U extends TextView> extends UDView<U> {
    public static final String[] getFieldNames = {"text", "textHtml", TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.ATTR_TTS_FONT_SIZE, "textColor", "lines", "breakMode", "styleText", "setTextBold", "fontNameSize", "setLineSpacing", "setLineSpacingInDp", "setTextFontStyle", "setAutoFit", "setMaxWidth", "setMaxHeight", "setMinWidth", "setMinHeight", "a_setIncludeFontPadding", "setAutoFontSize", "measureTextHeight", "enableMarquee", "setTypography", "setGradientTextColor", "setGradientBorderColor", "setHighlightColor", "setBlendModeOverlay"};
    public static final int[] iwGUEr = {C52761wXj.LoaderManager.djBIcL, C52761wXj.LoaderManager.AhwBna, C52761wXj.LoaderManager.fetchVPNInfo, C52761wXj.LoaderManager.AkhnZx, C52761wXj.LoaderManager.isConnected, C52761wXj.LoaderManager.values, C52761wXj.LoaderManager.DbNXlk, C52761wXj.LoaderManager.fIwbmz, C52761wXj.LoaderManager.fARcdN, C52761wXj.LoaderManager.AuCTel, C52761wXj.LoaderManager.ejfBZ, C52761wXj.LoaderManager.fJNWhG, C52761wXj.LoaderManager.getNewProxyInstance, C52761wXj.LoaderManager.iwGUEr, C52761wXj.LoaderManager.hDKMBd, C52761wXj.LoaderManager.getFieldNames, C52761wXj.LoaderManager.uzCIH, C52761wXj.LoaderManager.AubY, C52761wXj.LoaderManager.zsXlph, C52761wXj.LoaderManager.wlaJM, C52761wXj.LoaderManager.zblBkD, C52761wXj.LoaderManager.DCUTEIddSDPG, C52761wXj.LoaderManager.DGOPHZ, C52761wXj.LoaderManager.run, C52761wXj.LoaderManager.zLjUOn, C52761wXj.LoaderManager.AwvSrB, C52761wXj.LoaderManager.AxsJAY, C52761wXj.LoaderManager.sSMYrx, C52761wXj.LoaderManager.gHZMYf, C52761wXj.LoaderManager.zuBGHE, C52761wXj.LoaderManager.ORxRYg, C52761wXj.LoaderManager.DTwDnp, C52761wXj.LoaderManager.QOLQEE, C52761wXj.LoaderManager.QKVWgx, C52761wXj.LoaderManager.OcIXYQ, C52761wXj.LoaderManager.QUSxYX, C52761wXj.LoaderManager.OLrzqt, C52761wXj.LoaderManager.EZpvd, C52761wXj.LoaderManager.AEQbTJ, C52761wXj.LoaderManager.AYXKKw};
    public boolean AuCTelauCTel;
    public JColor AubY;
    public UDStyleString AxsJAY;
    public int hDKMBd;
    public InterfaceC7405ajH wlaJM;
    public JColor zLjUOn;
    public int zsXlph;

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] notClip(LuaValue[] luaValueArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UDStyleString valueOf() {
        return this.AxsJAY;
    }

    @InterfaceC60044zuT
    public UDLabel(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.zsXlph = 1;
        this.AuCTelauCTel = false;
        this.hDKMBd = -1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(LuaValue[] luaValueArr) {
        C7535alf c7535alf = new C7535alf(AubY(), this, luaValueArr);
        if (C7911ask.OLrzqt(this.globals)) {
            c7535alf.setTextColor(-1);
        } else {
            c7535alf.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        }
        return c7535alf;
    }

    @InterfaceC60044zuT
    public LuaValue[] text(LuaValue[] luaValueArr) {
        String javaString;
        if (luaValueArr.length == 1) {
            javaString = luaValueArr[0].toJavaString();
            if (luaValueArr[0].isNil()) {
                javaString = "";
            }
        } else {
            javaString = null;
        }
        if (javaString != null) {
            AEQbTJ(javaString);
            return null;
        }
        return LuaValue.varargsOf(LuaString.copydefault(f_().getText().toString()));
    }

    @InterfaceC60044zuT
    public LuaValue[] textHtml(LuaValue[] luaValueArr) {
        String javaString;
        if (luaValueArr.length >= 1) {
            javaString = luaValueArr[0].toJavaString();
            if (luaValueArr[0].isNil()) {
                javaString = "";
            }
        } else {
            javaString = null;
        }
        final LuaFunction luaFunction = (luaValueArr.length < 2 || luaValueArr[1].isNil()) ? null : luaValueArr[1].toLuaFunction();
        if (javaString != null) {
            try {
                f_().setMovementMethod(LinkMovementMethod.getInstance());
                SpannableStringBuilder spannableStringBuilderAEQbTJ = KotlinUtils.copydefault.AEQbTJ(javaString);
                if (luaFunction != null) {
                    for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilderAEQbTJ.getSpans(0, spannableStringBuilderAEQbTJ.length(), URLSpan.class)) {
                        int spanStart = spannableStringBuilderAEQbTJ.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilderAEQbTJ.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilderAEQbTJ.getSpanFlags(uRLSpan);
                        final String url = uRLSpan.getURL();
                        JColor jColor = this.AubY;
                        spannableStringBuilderAEQbTJ.setSpan(new Activity(jColor == null ? AubY().getResources().getColor(C52761wXj.Activity.fdOvFl) : jColor.getColor(this.globals)) { // from class: com.immomo.mls.fun.ud.view.UDLabel.4
                            @Override // android.text.style.ClickableSpan
                            public void onClick(@NonNull View view) {
                                C7870arw.KWHzl("Label link clicked: ", url);
                                luaFunction.invoke(LuaValue.rString(url));
                            }
                        }, spanStart, spanEnd, spanFlags);
                        spannableStringBuilderAEQbTJ.removeSpan(uRLSpan);
                    }
                }
                f_().setText(spannableStringBuilderAEQbTJ);
                return null;
            } catch (Exception unused) {
                f_().setText(javaString);
                return null;
            }
        }
        return LuaValue.varargsOf(LuaString.copydefault(f_().getText().toString()));
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static abstract class Activity extends ClickableSpan {
        public int OLrzqt;

        public Activity(int i) {
            this.OLrzqt = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            int i = this.OLrzqt;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(true);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighlightColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDColor)) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        this.AubY = uDColor.AEQbTJ();
        uDColor.destroy();
        return null;
    }

    public void AEQbTJ(String str) {
        UDStyleString uDStyleString = this.AxsJAY;
        if (uDStyleString != null) {
            uDStyleString.destroy();
        }
        this.AxsJAY = null;
        try {
            if (this.AuCTelauCTel) {
                isConnected();
            } else {
                f_().setText(str);
            }
        } catch (Exception e) {
            C7870arw.copydefault("Label text()  bridge   Exception ", e);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] textAlign(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(f_().getGravity()));
        }
        f_().setGravity(luaValueArr[0].toInt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] measureTextHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(C7460akJ.EZpvd((TextView) this.dHguZz, fetchVPNInfo()))));
    }

    @InterfaceC60044zuT
    public LuaValue[] fontSize(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.KWHzl(f_().getTextSize())));
        }
        f_().setTextSize(2, (float) luaValueArr[0].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] textColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDColor) {
                UDColor uDColor = (UDColor) luaValue;
                this.zLjUOn = uDColor.AEQbTJ();
                UDStyleString uDStyleString = this.AxsJAY;
                if (uDStyleString != null) {
                    uDStyleString.fontColor(luaValueArr);
                    if (this.AuCTelauCTel) {
                        isConnected();
                    } else {
                        f_().setText(this.AxsJAY.copydefault());
                    }
                }
                f_().setTextColor(this.zLjUOn.getColor(this.globals));
                uDColor.destroy();
                return null;
            }
        }
        UDColor uDColor2 = new UDColor(getGlobals(), 0);
        uDColor2.copydefault(f_().getTextColors().getDefaultColor());
        return LuaValue.varargsOf(uDColor2);
    }

    @InterfaceC60044zuT
    public LuaValue[] lines(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int i = luaValueArr[0].toInt();
            if (i == 0 && this.hDKMBd != -1) {
                C7833arL.KWHzl("警告：设置lines为0，breakMode只能表现出CLIPPING模式", this.globals);
            }
            AEQbTJ(i);
            return null;
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        int i2 = this.zsXlph;
        luaValueArr2[0] = i2 == Integer.MAX_VALUE ? LuaNumber.valueOf(0) : LuaNumber.valueOf(i2);
        return LuaValue.varargsOf(luaValueArr2);
    }

    public final void isConnected() {
        f_().setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void AEQbTJ(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.zsXlph = i;
        f_().setSingleLine(false);
        f_().setMaxLines(this.zsXlph);
    }

    @InterfaceC60044zuT
    public LuaValue[] breakMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int i = luaValueArr[0].toInt();
            this.hDKMBd = i;
            if (i < 0) {
                f_().setEllipsize(null);
            } else {
                f_().setEllipsize(TextUtils.TruncateAt.values()[i]);
            }
            return null;
        }
        TextUtils.TruncateAt ellipsize = f_().getEllipsize();
        return ellipsize == null ? LuaValue.varargsOf(LuaNumber.valueOf(-1)) : LuaValue.varargsOf(LuaNumber.valueOf(ellipsize.ordinal()));
    }

    @InterfaceC60044zuT
    public LuaValue[] enableMarquee(LuaValue[] luaValueArr) {
        U uF_ = f_();
        if (!(uF_ instanceof C7535alf)) {
            return null;
        }
        ((C7535alf) uF_).EZpvd();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] styleText(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            UDStyleString uDStyleString = this.AxsJAY;
            if (uDStyleString == null) {
                return LuaValue.rNil();
            }
            return LuaValue.varargsOf(uDStyleString);
        }
        UDStyleString uDStyleString2 = this.AxsJAY;
        if (uDStyleString2 != null) {
            uDStyleString2.destroy();
        }
        UDStyleString uDStyleString3 = (UDStyleString) luaValueArr[0];
        this.AxsJAY = uDStyleString3;
        if (uDStyleString3 != null) {
            this.AuCTelauCTel = uDStyleString3.EZpvd();
        }
        this.AxsJAY.EZpvd((UDView) this);
        if (this.AuCTelauCTel) {
            isConnected();
        }
        f_().setText(this.AxsJAY.copydefault());
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setTextBold(LuaValue[] luaValueArr) {
        f_().setTypeface(f_().getTypeface(), 1);
        EZpvd(UDLabel.class.getSimpleName(), "setTextBold()");
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontNameSize(LuaValue[] luaValueArr) {
        String javaString = luaValueArr[0].toJavaString();
        float f = (float) luaValueArr[1].toDouble();
        Typeface typefaceAEQbTJ = C7829arH.KWHzl.AEQbTJ(javaString, AubY());
        if (typefaceAEQbTJ != null) {
            f_().setTypeface(typefaceAEQbTJ);
        }
        f_().setTextSize(2, f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineSpacing(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(f_().getLineSpacingExtra()));
        }
        f_().setLineSpacing((float) luaValueArr[0].toDouble(), 1.0f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineSpacingInDp(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.copydefault(f_().getLineSpacingExtra()));
        }
        f_().setLineSpacing(C7865arr.copydefault(luaValueArr[0].toFloat()), 1.0f);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTextFontStyle(LuaValue[] luaValueArr) {
        f_().setTypeface(null, luaValueArr[0].toInt());
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setAutoFit(LuaValue[] luaValueArr) {
        this.hBpjJd.values = false;
        if (luaValueArr[0].toBoolean()) {
            ViewGroup.LayoutParams layoutParams = f_().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            } else {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            f_().setLayoutParams(layoutParams);
        }
        EZpvd(UDLabel.class.getSimpleName(), "setAutoFit()");
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] setMaxWidth(LuaValue[] luaValueArr) {
        f_().setMaxWidth(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] setMaxHeight(LuaValue[] luaValueArr) {
        this.zsXlph = Integer.MAX_VALUE;
        f_().setSingleLine(false);
        f_().setMaxHeight(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] setMinWidth(LuaValue[] luaValueArr) {
        f_().setMinWidth(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] setMinHeight(LuaValue[] luaValueArr) {
        this.zsXlph = Integer.MAX_VALUE;
        f_().setSingleLine(false);
        f_().setMinHeight(C7865arr.copydefault((float) luaValueArr[0].toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] a_setIncludeFontPadding(LuaValue[] luaValueArr) {
        f_().setIncludeFontPadding(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        this.wlaJM = null;
        super.AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        InterfaceC7405ajH interfaceC7405ajH = new InterfaceC7405ajH() { // from class: com.immomo.mls.fun.ud.view.UDLabel.2
            /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: U */
            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: U */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.InterfaceC7405ajH
            public void EZpvd() {
                if (UDLabel.this.AuCTelauCTel && UDLabel.this.AxsJAY != null) {
                    UDLabel.this.isConnected();
                } else if (UDLabel.this.AxsJAY != null) {
                    ((TextView) UDLabel.this.f_()).setTextColor(UDLabel.this.AxsJAY.OLrzqt());
                } else if (UDLabel.this.zLjUOn != null) {
                    ((TextView) UDLabel.this.f_()).setTextColor(UDLabel.this.zLjUOn.getColor(UDLabel.this.globals));
                }
            }
        };
        this.wlaJM = interfaceC7405ajH;
        KWHzl(interfaceC7405ajH);
        super.copydefault();
    }

    @InterfaceC60044zuT
    public LuaValue[] setAutoFontSize(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 1) {
            return null;
        }
        TextViewCompat.setAutoSizeTextTypeWithDefaults(f_(), 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(f_(), luaValueArr[0].toInt(), luaValueArr[1].toInt(), 1, 2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTypography(LuaValue[] luaValueArr) {
        int i;
        if (luaValueArr == null || luaValueArr.length < 1 || (i = luaValueArr[0].toInt()) < 0) {
            return null;
        }
        int[] iArr = iwGUEr;
        if (i >= iArr.length) {
            return null;
        }
        f_().setTextAppearance(iArr[i]);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientBorderColor(LuaValue[] luaValueArr) {
        int[] iArrValueOf = valueOf(luaValueArr);
        if (iArrValueOf == null) {
            return null;
        }
        U uF_ = f_();
        if (!(uF_ instanceof C7817aqw)) {
            return null;
        }
        ((C7817aqw) uF_).setGradientStrokeColor(iArrValueOf);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientTextColor(LuaValue[] luaValueArr) {
        U uF_;
        int[] iArrValueOf = valueOf(luaValueArr);
        float[] fArrOLrzqt = OLrzqt(luaValueArr);
        if (iArrValueOf == null || (uF_ = f_()) == null) {
            return null;
        }
        uF_.getPaint().setShader(new LinearGradient(0.0f, 0.0f, f_().getText().length() * f_().getPaint().getTextSize(), 0.0f, iArrValueOf, fArrOLrzqt, Shader.TileMode.CLAMP));
        uF_.invalidate();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBlendModeOverlay(LuaValue[] luaValueArr) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                f_().getPaint().setBlendMode(BlendMode.OVERLAY);
            }
        } catch (Exception unused) {
        }
        return LuaValue.rNil();
    }

    public float[] OLrzqt(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return null;
        }
        List listCopydefault = C7910asj.copydefault(luaValueArr[1].toLuaTable());
        float[] fArr = new float[listCopydefault.size()];
        for (int i = 0; i < listCopydefault.size(); i++) {
            fArr[i] = ((Float) listCopydefault.get(i)).floatValue();
        }
        return fArr;
    }
}
