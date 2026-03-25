package com.immomo.mls.fun.ud;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.view.UDLabel;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.JColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.C7320ahc;
import o.C7322ahe;
import o.C7323ahf;
import o.C7326ahi;
import o.C7350aiF;
import o.C7367aiW;
import o.C7368aiX;
import o.C7535alf;
import o.C7785aqQ;
import o.C7786aqR;
import o.C7865arr;
import o.C7870arw;
import o.C7942atO;
import o.InterfaceC60044zuT;
import o.InterfaceC7304ahM;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDStyleString extends JavaUserdata implements C7786aqR.Application {
    public static final String[] EZpvd = {"fontName", TtmlNode.ATTR_TTS_FONT_SIZE, TtmlNode.ATTR_TTS_FONT_WEIGHT, TtmlNode.ATTR_TTS_FONT_STYLE, "fontColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, TtmlNode.UNDERLINE, RequestParameters.SUBRESOURCE_APPEND, "calculateSize", "setFontNameForRange", "setFontSizeForRange", "setFontStyleForRange", "setFontColorForRange", "setBackgroundColorForRange", "setUnderlineForRange", "setClickableUnderlineForRange", "showAsImage", "setHighlight", "setText", "imageAlign", "strikethrough", "setStrikethroughForRange"};
    public boolean AEQbTJ;
    public C7786aqR AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public StyleSpan AuCTel;
    public StaticLayout DbNXlk;
    public final TextPaint KWHzl;
    public BackgroundColorSpan OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public SpannableStringBuilder ejfBZ;
    public AbsoluteSizeSpan fARcdN;
    public int fIwbmz;
    public UDView fJNWhG;
    public UDSize fetchVPNInfo;
    public ForegroundColorSpan gEmmrt;
    public int getFieldNames;
    public C7942atO getNewProxyInstance;
    public UnderlineSpan hDKMBd;
    public HashMap isConnected;
    public TypefaceSpan uzCIH;
    public C7350aiF valueOf;
    public List<StyleSpan> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(UDView uDView) {
        this.fJNWhG = uDView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CharSequence copydefault() {
        return this.ejfBZ;
    }

    @InterfaceC60044zuT
    public UDStyleString(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = new TextPaint(1);
        this.AkhnZx = -1;
        this.AEQbTJ = false;
        this.copydefault = false;
        this.isConnected = new HashMap();
        this.fIwbmz = 0;
        this.djBIcL = false;
        this.AhwBna = true;
        if (luaValueArr != null && luaValueArr.length >= 1) {
            this.ejfBZ = SpannableStringBuilder.valueOf(luaValueArr[0].toJavaString());
        } else {
            this.ejfBZ = SpannableStringBuilder.valueOf("");
        }
        KWHzl();
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighlight(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 4) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        boolean z = luaValue != null;
        boolean z2 = luaValueArr[1] != null;
        if (!(luaValueArr[3] != null) || !(z & z2 & (luaValueArr[2] != null))) {
            return null;
        }
        this.djBIcL = true;
        UDColor uDColor = (UDColor) luaValue;
        JColor jColorAEQbTJ = uDColor.AEQbTJ();
        uDColor.destroy();
        final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        int i = luaValueArr[2].toInt() - 1;
        int i2 = luaValueArr[3].toInt() + i;
        this.ejfBZ.append((CharSequence) "\u200b");
        this.ejfBZ.setSpan(new ClickableSpan() { // from class: com.immomo.mls.fun.ud.UDStyleString.4
            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                LuaFunction luaFunction2 = luaFunction;
                if (luaFunction2 != null) {
                    luaFunction2.invoke(null);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                if (UDStyleString.this.AhwBna) {
                    super.updateDrawState(textPaint);
                } else {
                    textPaint.setUnderlineText(false);
                    textPaint.clearShadowLayer();
                }
            }
        }, i, i2, 33);
        this.ejfBZ.setSpan(new ForegroundColorSpan(jColorAEQbTJ.getColor(this.globals)), i, i2, 33);
        return null;
    }

    public final void KWHzl() {
        this.KWHzl.setTextSize(C7865arr.OLrzqt(14.0f));
    }

    public static Object KWHzl(Object obj) {
        if (obj instanceof AbsoluteSizeSpan) {
            return new AbsoluteSizeSpan(((AbsoluteSizeSpan) obj).getSize());
        }
        if (obj instanceof C7942atO) {
            return new C7942atO(((C7942atO) obj).OLrzqt());
        }
        if (obj instanceof TypefaceSpan) {
            return new TypefaceSpan(((TypefaceSpan) obj).getFamily());
        }
        if (obj instanceof StyleSpan) {
            return new StyleSpan(((StyleSpan) obj).getStyle());
        }
        if (obj instanceof ForegroundColorSpan) {
            return new ForegroundColorSpan(((ForegroundColorSpan) obj).getForegroundColor());
        }
        if (obj instanceof BackgroundColorSpan) {
            return new BackgroundColorSpan(((BackgroundColorSpan) obj).getBackgroundColor());
        }
        return obj instanceof UnderlineSpan ? new UnderlineSpan() : obj;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontName(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            TypefaceSpan typefaceSpan = this.uzCIH;
            return typefaceSpan == null ? LuaValue.rNil() : LuaValue.rString(typefaceSpan.getFamily());
        }
        Object obj = this.uzCIH;
        if (obj != null) {
            OLrzqt(obj);
        }
        String javaString = luaValueArr[0].toJavaString();
        InterfaceC7304ahM interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ();
        if (interfaceC7304ahMEjfBZ == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        C7367aiW.EZpvd();
        TypefaceSpan typefaceSpanCopydefault = C7368aiX.copydefault(interfaceC7304ahMEjfBZ.KWHzl(javaString));
        this.uzCIH = typefaceSpanCopydefault;
        EZpvd(typefaceSpanCopydefault);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontSize(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return this.fARcdN == null ? LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE) : LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.KWHzl(r6.getSize())));
        }
        Object obj = this.fARcdN;
        if (obj != null) {
            OLrzqt(obj);
        }
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(C7865arr.OLrzqt((float) luaValueArr[0].toDouble()));
        this.fARcdN = absoluteSizeSpan;
        EZpvd(absoluteSizeSpan);
        this.AEQbTJ = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontWeight(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 0) {
            Object obj = this.getNewProxyInstance;
            if (obj != null) {
                OLrzqt(obj);
            }
            this.getFieldNames = luaValueArr[0].toInt();
            C7942atO c7942atO = new C7942atO(this.getFieldNames);
            this.getNewProxyInstance = c7942atO;
            EZpvd(c7942atO);
            return null;
        }
        return LuaValue.rNumber(this.getFieldNames);
    }

    @InterfaceC60044zuT
    public LuaValue[] fontStyle(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            if (this.AuCTel == null) {
                return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            return LuaValue.rNumber(r3.getStyle());
        }
        Object obj = this.AuCTel;
        if (obj != null) {
            OLrzqt(obj);
        }
        OLrzqt(this.ejfBZ);
        StyleSpan styleSpan = new StyleSpan(luaValueArr[0].toInt());
        this.AuCTel = styleSpan;
        EZpvd(styleSpan);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fontColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return this.gEmmrt == null ? LuaValue.rNil() : LuaValue.varargsOf(new UDColor(this.globals, this.gEmmrt.getForegroundColor()));
        }
        Object obj = this.gEmmrt;
        if (obj != null) {
            OLrzqt(obj);
        }
        JColor jColorAEQbTJ = ((UDColor) luaValueArr[0]).AEQbTJ();
        luaValueArr[0].destroy();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(jColorAEQbTJ.getColor(this.globals));
        this.gEmmrt = foregroundColorSpan;
        EZpvd(foregroundColorSpan);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] backgroundColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return this.OLrzqt == null ? LuaValue.rNil() : LuaValue.varargsOf(new UDColor(this.globals, this.OLrzqt.getBackgroundColor()));
        }
        Object obj = this.OLrzqt;
        if (obj != null) {
            OLrzqt(obj);
        }
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        this.OLrzqt = backgroundColorSpan;
        EZpvd(backgroundColorSpan);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] underline(LuaValue[] luaValueArr) {
        Object obj;
        if (luaValueArr.length != 0) {
            int i = luaValueArr[0].toInt();
            if (i > 0 && this.hDKMBd == null) {
                UnderlineSpan underlineSpan = new UnderlineSpan();
                this.hDKMBd = underlineSpan;
                EZpvd(underlineSpan);
            } else if (i <= 0 && (obj = this.hDKMBd) != null) {
                OLrzqt(obj);
                this.hDKMBd = null;
            }
            this.AhwBna = i != 0;
            return null;
        }
        return LuaValue.rNumber(this.hDKMBd != null ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] append(LuaValue[] luaValueArr) {
        SpannableStringBuilder spannableStringBuilder = ((UDStyleString) luaValueArr[0]).ejfBZ;
        LuaValue luaValue = (LuaValue) this.isConnected.get(spannableStringBuilder);
        if (OLrzqt((CharSequence) spannableStringBuilder) && luaValue == luaValueArr[0]) {
            UDStyleString uDStyleString = (UDStyleString) luaValue;
            if (uDStyleString.valueOf != null) {
                this.AYXKKw = new C7786aqR(((C7322ahe) this.globals.AuCTel()).AEQbTJ, spannableStringBuilder.toString(), uDStyleString.valueOf, this, this.fIwbmz);
                this.ejfBZ.append((CharSequence) spannableStringBuilder);
                int length = spannableStringBuilder.toString().length();
                SpannableStringBuilder spannableStringBuilder2 = this.ejfBZ;
                spannableStringBuilder2.setSpan(this.AYXKKw, spannableStringBuilder2.length() - length, this.ejfBZ.length(), 33);
            }
        } else {
            this.ejfBZ.append((CharSequence) spannableStringBuilder);
        }
        if (spannableStringBuilder != null) {
            this.isConnected.put(spannableStringBuilder, luaValueArr[0]);
        }
        this.copydefault = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] calculateSize(LuaValue[] luaValueArr) {
        int iCopydefault = C7865arr.copydefault((float) luaValueArr[0].toDouble());
        if (iCopydefault < 0) {
            if (C7326ahi.EZpvd) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("max width must be more than 0");
                if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                    throw illegalArgumentException;
                }
            }
            if (this.fetchVPNInfo == null) {
                UDSize uDSize = new UDSize(this.globals, new C7350aiF());
                this.fetchVPNInfo = uDSize;
                uDSize.onJavaRef();
            }
            return LuaValue.varargsOf(this.fetchVPNInfo);
        }
        if (this.DbNXlk != null && this.AkhnZx == iCopydefault && !this.copydefault && !this.AEQbTJ) {
            return LuaValue.varargsOf(this.fetchVPNInfo);
        }
        if (this.fetchVPNInfo == null) {
            UDSize uDSize2 = new UDSize(this.globals, new C7350aiF());
            this.fetchVPNInfo = uDSize2;
            uDSize2.onJavaRef();
        }
        this.AkhnZx = iCopydefault;
        this.copydefault = false;
        this.AEQbTJ = false;
        if (this.fARcdN != null) {
            this.KWHzl.setTextSize(r1.getSize());
        }
        StaticLayout staticLayout = new StaticLayout(this.ejfBZ, this.KWHzl, iCopydefault, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        this.DbNXlk = staticLayout;
        int lineCount = staticLayout.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            float lineWidth = this.DbNXlk.getLineWidth(i);
            if (f < lineWidth) {
                f = lineWidth;
            }
        }
        int iCeil = (int) Math.ceil(C7865arr.AEQbTJ(f));
        int iCeil2 = (int) Math.ceil(C7865arr.AEQbTJ(this.DbNXlk.getHeight()));
        this.fetchVPNInfo.AEQbTJ(iCeil);
        this.fetchVPNInfo.KWHzl(iCeil2);
        return LuaValue.varargsOf(this.fetchVPNInfo);
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontNameForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[1]);
        try {
            int i = luaValueArr[1].toInt() - 1;
            this.ejfBZ.setSpan(new TypefaceSpan(luaValueArr[0].toJavaString()), i, (luaValueArr[2].toInt() - 1) + i, 33);
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontSizeForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[1]);
        try {
            this.ejfBZ.setSpan(new AbsoluteSizeSpan(C7865arr.OLrzqt((float) luaValueArr[0].toDouble())), luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() + luaValueArr[1].toInt()) - 1, 33);
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontStyleForRange(LuaValue[] luaValueArr) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        EZpvd(luaValueArr[1]);
        try {
            int i = luaValueArr[1].toInt() - 1;
            int i2 = luaValueArr[2].toInt() + i;
            if (i > 0) {
                spannableStringBuilder = (SpannableStringBuilder) this.ejfBZ.subSequence(0, i);
                OLrzqt(spannableStringBuilder);
            } else {
                spannableStringBuilder = null;
            }
            SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) this.ejfBZ.subSequence(i, i2);
            OLrzqt(spannableStringBuilder3);
            StyleSpan styleSpan = new StyleSpan(luaValueArr[0].toInt());
            spannableStringBuilder3.setSpan(styleSpan, 0, spannableStringBuilder3.length(), 33);
            AEQbTJ();
            this.values.add(styleSpan);
            if (i2 < this.ejfBZ.length()) {
                SpannableStringBuilder spannableStringBuilder4 = this.ejfBZ;
                spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder4.subSequence(i2, spannableStringBuilder4.length());
                OLrzqt(spannableStringBuilder2);
            } else {
                spannableStringBuilder2 = null;
            }
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
            if (spannableStringBuilder != null) {
                spannableStringBuilderValueOf.append((CharSequence) spannableStringBuilder);
                int iMax = 0;
                int iMin = i;
                for (Object obj : this.ejfBZ.getSpans(0, i, Object.class)) {
                    int spanStart = this.ejfBZ.getSpanStart(obj);
                    int spanEnd = this.ejfBZ.getSpanEnd(obj);
                    if (spanEnd >= i) {
                        spanEnd = i;
                    }
                    iMin = Math.min(iMin, spanStart);
                    iMax = Math.max(iMax, spanEnd);
                    spannableStringBuilderValueOf.setSpan(KWHzl(obj), spanStart, spanEnd, 33);
                }
            }
            spannableStringBuilderValueOf.append((CharSequence) spannableStringBuilder3);
            if (spannableStringBuilder2 != null) {
                spannableStringBuilderValueOf.append((CharSequence) spannableStringBuilder2);
                SpannableStringBuilder spannableStringBuilder5 = this.ejfBZ;
                for (Object obj2 : spannableStringBuilder5.getSpans(i2, spannableStringBuilder5.length(), Object.class)) {
                    int spanStart2 = this.ejfBZ.getSpanStart(obj2);
                    int spanEnd2 = this.ejfBZ.getSpanEnd(obj2);
                    if (spanStart2 <= i2) {
                        spanStart2 = i2;
                    }
                    spannableStringBuilderValueOf.setSpan(KWHzl(obj2), spanStart2, spanEnd2, 33);
                }
            }
            this.ejfBZ = spannableStringBuilderValueOf;
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontColorForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[1]);
        try {
            this.ejfBZ.setSpan(new ForegroundColorSpan(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals)), luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() + luaValueArr[1].toInt()) - 1, 33);
            luaValueArr[0].destroy();
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setBackgroundColorForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[1]);
        try {
            int i = luaValueArr[1].toInt() - 1;
            int i2 = (luaValueArr[2].toInt() + luaValueArr[1].toInt()) - 1;
            ((SpannableStringBuilder) this.ejfBZ.subSequence(i, i2)).clearSpans();
            this.ejfBZ.setSpan(new BackgroundColorSpan(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals)), i, i2, 33);
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setUnderlineForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[1]);
        int i = luaValueArr[0].toInt();
        int i2 = luaValueArr[1].toInt() - 1;
        int i3 = (luaValueArr[2].toInt() + luaValueArr[1].toInt()) - 1;
        final LuaFunction luaFunction = luaValueArr.length >= 4 ? luaValueArr[3].toLuaFunction() : null;
        if (i > 0) {
            if (luaFunction != null) {
                try {
                    this.ejfBZ.setSpan(new ClickableSpan() { // from class: com.immomo.mls.fun.ud.UDStyleString.1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(@NonNull TextPaint textPaint) {
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(@NonNull View view) {
                            luaFunction.invoke(null);
                        }
                    }, i2, i3, 33);
                } catch (IndexOutOfBoundsException e) {
                    C7870arw.AEQbTJ(e, new Object[0]);
                }
            }
            this.ejfBZ.setSpan(new UnderlineSpan(), i2, i3, 33);
        } else {
            UnderlineSpan underlineSpan = this.hDKMBd;
            if (underlineSpan != null) {
                OLrzqt(underlineSpan);
                this.hDKMBd = null;
                this.ejfBZ.setSpan(new UnderlineSpan(), i3, this.ejfBZ.length(), 33);
                this.ejfBZ.setSpan(new UnderlineSpan(), 0, i2, 33);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setClickableUnderlineForRange(LuaValue[] luaValueArr) {
        return setUnderlineForRange(luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] strikethrough(LuaValue[] luaValueArr) {
        this.ejfBZ.setSpan(new ClickableSpan() { // from class: com.immomo.mls.fun.ud.UDStyleString.2
            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFlags(17);
            }
        }, 0, this.ejfBZ.length(), 33);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setStrikethroughForRange(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[0]);
        try {
            this.ejfBZ.setSpan(new ClickableSpan() { // from class: com.immomo.mls.fun.ud.UDStyleString.3
                @Override // android.text.style.ClickableSpan
                public void onClick(@NonNull View view) {
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(@NonNull TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setFlags(17);
                }
            }, luaValueArr[0].toInt() - 1, (luaValueArr[0].toInt() + luaValueArr[1].toInt()) - 1, 33);
            return null;
        } catch (IndexOutOfBoundsException e) {
            C7870arw.AEQbTJ(e, new Object[0]);
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] showAsImage(LuaValue[] luaValueArr) {
        this.valueOf = ((UDSize) luaValueArr[0]).AEQbTJ();
        EZpvd((Object) this.AYXKKw);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setText(LuaValue[] luaValueArr) {
        this.ejfBZ.clear();
        this.ejfBZ.append((CharSequence) luaValueArr[0].toJavaString());
        this.copydefault = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] imageAlign(LuaValue[] luaValueArr) {
        this.fIwbmz = luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0;
        return null;
    }

    @Override // o.C7786aqR.Application
    public void EZpvd(C7785aqQ c7785aqQ) {
        if (c7785aqQ != null) {
            EZpvd((Object) c7785aqQ);
            gEmmrt();
        }
    }

    public final void gEmmrt() {
        UDView uDView = this.fJNWhG;
        if (uDView != null) {
            uDView.f_().invalidate();
            UDView uDView2 = this.fJNWhG;
            if (uDView2 instanceof UDLabel) {
                ((C7535alf) uDView2.f_()).setText(((C7535alf) this.fJNWhG.f_()).getText());
            }
        }
    }

    public int OLrzqt() {
        ForegroundColorSpan foregroundColorSpan = this.gEmmrt;
        if (foregroundColorSpan != null) {
            return foregroundColorSpan.getForegroundColor();
        }
        return -1;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        SpannableStringBuilder spannableStringBuilder = this.ejfBZ;
        return spannableStringBuilder != null ? spannableStringBuilder.toString() : "";
    }

    public final void EZpvd(Object obj) {
        SpannableStringBuilder spannableStringBuilder = this.ejfBZ;
        spannableStringBuilder.setSpan(obj, 0, spannableStringBuilder.length(), 33);
    }

    public final void OLrzqt(Object obj) {
        this.ejfBZ.removeSpan(obj);
    }

    public final boolean OLrzqt(CharSequence charSequence) {
        return charSequence != null && (charSequence.toString().endsWith("jpg") || charSequence.toString().endsWith("png"));
    }

    public final void EZpvd(LuaValue luaValue) {
        if (luaValue.toInt() <= 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("StyleString forRange(), start position cannot below equal zero");
            if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                throw illegalArgumentException;
            }
        }
    }

    public final void AEQbTJ() {
        if (this.values == null) {
            this.values = new ArrayList();
        }
    }

    public final void OLrzqt(SpannableStringBuilder spannableStringBuilder) {
        List<StyleSpan> list = this.values;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<StyleSpan> it = this.values.iterator();
        while (it.hasNext()) {
            spannableStringBuilder.removeSpan(it.next());
        }
        this.values.clear();
    }
}
