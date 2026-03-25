package com.okinc.uilab.util;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.core.content.ContextCompat;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52762wXk;
import o.C55296xhK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpanUtils {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final String copydefault = System.getProperty("line.separator");
    public CharSequence AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public Bitmap AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public Shader AwvSrB;
    public int AxsJAY;
    public float DTwDnp;
    public String DbNXlk;
    public int EZpvd;
    public int OLrzqt;
    public float ORxRYg;
    public float OcIXYQ;
    public int QKVWgx;
    public int QOLQEE;
    public BlurMaskFilter.Blur QUSxYX;
    public int QVAiDq;
    public Object[] QbewEr;
    public SerializableSpannableStringBuilder QfsBiF;
    public int RJOkX;
    public final int RcXXUw;
    public final int UeEOUB;
    public int aKErDB;
    public final int dNCPSb;
    public float djBIcL;
    public TextView djSkpj;
    public float dvKsVJ;
    public int dxcTrN;
    public Drawable ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public String fZBcTu;
    public ClickableSpan fetchVPNInfo;
    public Typeface finit;
    public Layout.Alignment gEmmrt;
    public int gHZMYf;
    public boolean getFieldNames;
    public boolean getNewProxyInstance;
    public Uri hDKMBd;
    public int isConnected;
    public boolean iwGUEr;
    public int sSMYrx;
    public boolean uzCIH;
    public int valueOf;
    public int values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public int zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpanUtils EZpvd(int i) {
        this.dxcTrN = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.isConnected = 33;
        this.fARcdN = -16777217;
        this.valueOf = -16777217;
        this.zsXlph = -1;
        this.sSMYrx = -16777217;
        this.AkhnZx = -1;
        this.AYXKKw = -16777217;
        this.fIwbmz = -1;
        this.zuBGHE = -1.0f;
        this.dvKsVJ = -1.0f;
        this.AubY = false;
        this.wlaJM = false;
        this.AuCTelauCTel = false;
        this.zLjUOn = false;
        this.getNewProxyInstance = false;
        this.iwGUEr = false;
        this.uzCIH = false;
        this.DbNXlk = null;
        this.finit = null;
        this.gEmmrt = null;
        this.dxcTrN = -1;
        this.fetchVPNInfo = null;
        this.fZBcTu = null;
        this.djBIcL = -1.0f;
        this.AwvSrB = null;
        this.DTwDnp = -1.0f;
        this.QbewEr = null;
        this.AuCTel = null;
        this.ejfBZ = null;
        this.hDKMBd = null;
        this.fJNWhG = -1;
        this.RJOkX = -1;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.util.SpanUtils.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final SpanUtils EZpvd(TextView textView) {
            return new SpanUtils(textView);
        }
    }

    public SpanUtils() {
        this.dNCPSb = 1;
        this.RcXXUw = 2;
        this.QfsBiF = SerializableSpannableStringBuilder.INSTANCE.invoke();
        this.AEQbTJ = "";
        this.aKErDB = -1;
        KWHzl();
    }

    public SpanUtils(TextView textView) {
        this();
        this.djSkpj = textView;
    }

    public static /* synthetic */ SpanUtils setVerticalAlign$default(SpanUtils spanUtils, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return spanUtils.EZpvd(i);
    }

    public final SpanUtils AEQbTJ(@NotNull ClickableSpan clickableSpan) {
        Intrinsics.checkNotNullParameter(clickableSpan, "");
        AEQbTJ();
        this.fetchVPNInfo = clickableSpan;
        return this;
    }

    public final void AEQbTJ() {
        TextView textView = this.djSkpj;
        if (textView != null) {
            Intrinsics.copydefault(textView);
            if (textView.getMovementMethod() == null) {
                TextView textView2 = this.djSkpj;
                Intrinsics.copydefault(textView2);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final SpanUtils KWHzl(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AEQbTJ(this.UeEOUB);
        this.AEQbTJ = charSequence;
        return this;
    }

    public static /* synthetic */ SpanUtils appendImage$default(SpanUtils spanUtils, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return spanUtils.EZpvd(bitmap, i);
    }

    public final SpanUtils EZpvd(@NotNull Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        AEQbTJ(this.dNCPSb);
        this.AuCTel = bitmap;
        this.EZpvd = i;
        return this;
    }

    public static /* synthetic */ SpanUtils appendImage$default(SpanUtils spanUtils, Drawable drawable, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return spanUtils.EZpvd(drawable, i);
    }

    public final SpanUtils EZpvd(@NotNull Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "");
        AEQbTJ(this.dNCPSb);
        this.ejfBZ = drawable;
        this.EZpvd = i;
        return this;
    }

    public static /* synthetic */ SpanUtils appendImage$default(SpanUtils spanUtils, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return spanUtils.AEQbTJ(uri, i);
    }

    public final SpanUtils AEQbTJ(@NotNull Uri uri, int i) {
        Intrinsics.checkNotNullParameter(uri, "");
        AEQbTJ(this.dNCPSb);
        this.hDKMBd = uri;
        this.EZpvd = i;
        return this;
    }

    public static /* synthetic */ SpanUtils appendImage$default(SpanUtils spanUtils, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return spanUtils.OLrzqt(i, i2);
    }

    public final SpanUtils OLrzqt(@DrawableRes int i, int i2) {
        AEQbTJ(this.dNCPSb);
        this.fJNWhG = i;
        this.EZpvd = i2;
        return this;
    }

    public static /* synthetic */ SpanUtils appendSpace$default(SpanUtils spanUtils, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return spanUtils.KWHzl(i, i2);
    }

    public final SpanUtils KWHzl(@IntRange(from = 0) int i, @ColorInt int i2) {
        AEQbTJ(this.RcXXUw);
        this.RJOkX = i;
        this.QKVWgx = i2;
        return this;
    }

    public final void AEQbTJ(int i) {
        OLrzqt();
        this.aKErDB = i;
    }

    public final SpannableStringBuilder EZpvd() {
        OLrzqt();
        TextView textView = this.djSkpj;
        if (textView != null) {
            Intrinsics.copydefault(textView);
            textView.setText(this.QfsBiF);
        }
        this.getFieldNames = true;
        return this.QfsBiF;
    }

    public final void OLrzqt() {
        if (this.getFieldNames) {
            return;
        }
        int i = this.aKErDB;
        if (i == this.UeEOUB) {
            copydefault();
        } else if (i == this.dNCPSb) {
            valueOf();
        } else if (i == this.RcXXUw) {
            gEmmrt();
        }
        KWHzl();
    }

    public final void copydefault() {
        if (this.AEQbTJ.length() == 0) {
            return;
        }
        int length = this.QfsBiF.length();
        if (length == 0 && this.zsXlph != -1) {
            this.QfsBiF.append((CharSequence) Character.toString((char) 2)).append((CharSequence) "\n").setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.QfsBiF.append(this.AEQbTJ);
        int length2 = this.QfsBiF.length();
        if (this.dxcTrN != -1) {
            this.QfsBiF.setSpan(new Fragment(this.dxcTrN, this.fARcdN), length, length2, this.isConnected);
        }
        if (this.fARcdN != -16777217) {
            this.QfsBiF.setSpan(new ForegroundColorSpan(this.fARcdN), length, length2, this.isConnected);
        }
        if (this.valueOf != -16777217) {
            this.QfsBiF.setSpan(new BackgroundColorSpan(this.valueOf), length, length2, this.isConnected);
        }
        if (this.AkhnZx != -1) {
            this.QfsBiF.setSpan(new LeadingMarginSpan.Standard(this.AkhnZx, this.AxsJAY), length, length2, this.isConnected);
        }
        if (this.sSMYrx != -16777217) {
            this.QfsBiF.setSpan(new PendingIntent(this.sSMYrx, this.QVAiDq, this.gHZMYf), length, length2, this.isConnected);
        }
        if (this.AYXKKw != -16777217) {
            this.QfsBiF.setSpan(new TaskDescription(this.AYXKKw, this.values, this.AhwBna), length, length2, this.isConnected);
        }
        if (this.fIwbmz != -1) {
            this.QfsBiF.setSpan(new AbsoluteSizeSpan(this.fIwbmz, false), length, length2, this.isConnected);
        }
        if (this.zuBGHE != -1.0f) {
            this.QfsBiF.setSpan(new RelativeSizeSpan(this.zuBGHE), length, length2, this.isConnected);
        }
        if (this.dvKsVJ != -1.0f) {
            this.QfsBiF.setSpan(new ScaleXSpan(this.dvKsVJ), length, length2, this.isConnected);
        }
        if (this.zsXlph != -1) {
            this.QfsBiF.setSpan(new StateListAnimator(this.zsXlph, this.OLrzqt), length, length2, this.isConnected);
        }
        if (this.AubY) {
            this.QfsBiF.setSpan(new StrikethroughSpan(), length, length2, this.isConnected);
        }
        if (this.wlaJM) {
            this.QfsBiF.setSpan(new UnderlineSpan(), length, length2, this.isConnected);
        }
        if (this.AuCTelauCTel) {
            this.QfsBiF.setSpan(new SuperscriptSpan(), length, length2, this.isConnected);
        }
        if (this.zLjUOn) {
            this.QfsBiF.setSpan(new SubscriptSpan(), length, length2, this.isConnected);
        }
        if (this.getNewProxyInstance) {
            this.QfsBiF.setSpan(new StyleSpan(1), length, length2, this.isConnected);
        }
        if (this.iwGUEr) {
            this.QfsBiF.setSpan(new StyleSpan(2), length, length2, this.isConnected);
        }
        if (this.uzCIH) {
            this.QfsBiF.setSpan(new StyleSpan(3), length, length2, this.isConnected);
        }
        if (this.DbNXlk != null) {
            this.QfsBiF.setSpan(new TypefaceSpan(this.DbNXlk), length, length2, this.isConnected);
        }
        Typeface typeface = this.finit;
        if (typeface != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder = this.QfsBiF;
            Intrinsics.copydefault(typeface);
            serializableSpannableStringBuilder.setSpan(new CustomTypefaceSpan(typeface), length, length2, this.isConnected);
        }
        Layout.Alignment alignment = this.gEmmrt;
        if (alignment != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder2 = this.QfsBiF;
            Intrinsics.copydefault(alignment);
            serializableSpannableStringBuilder2.setSpan(new AlignmentSpan.Standard(alignment), length, length2, this.isConnected);
        }
        ClickableSpan clickableSpan = this.fetchVPNInfo;
        if (clickableSpan != null) {
            this.QfsBiF.setSpan(clickableSpan, length, length2, this.isConnected);
        }
        if (this.fZBcTu != null) {
            this.QfsBiF.setSpan(new URLSpan(this.fZBcTu), length, length2, this.isConnected);
        }
        if (this.djBIcL != -1.0f) {
            this.QfsBiF.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.djBIcL, this.QUSxYX)), length, length2, this.isConnected);
        }
        Shader shader = this.AwvSrB;
        if (shader != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder3 = this.QfsBiF;
            Intrinsics.copydefault(shader);
            serializableSpannableStringBuilder3.setSpan(new Dialog(shader), length, length2, this.isConnected);
        }
        if (this.DTwDnp != -1.0f) {
            this.QfsBiF.setSpan(new LoaderManager(this.DTwDnp, this.ORxRYg, this.OcIXYQ, this.QOLQEE), length, length2, this.isConnected);
        }
        Object[] objArr = this.QbewEr;
        if (objArr != null) {
            Intrinsics.copydefault(objArr);
            for (Object obj : objArr) {
                this.QfsBiF.setSpan(obj, length, length2, this.isConnected);
            }
        }
    }

    public final void valueOf() {
        int length = this.QfsBiF.length();
        this.AEQbTJ = "<img>";
        copydefault();
        int length2 = this.QfsBiF.length();
        Bitmap bitmap = this.AuCTel;
        if (bitmap != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder = this.QfsBiF;
            Intrinsics.copydefault(bitmap);
            serializableSpannableStringBuilder.setSpan(new Activity(bitmap, this.EZpvd), length, length2, this.isConnected);
            return;
        }
        Drawable drawable = this.ejfBZ;
        if (drawable != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder2 = this.QfsBiF;
            Intrinsics.copydefault(drawable);
            serializableSpannableStringBuilder2.setSpan(new Activity(drawable, this.EZpvd), length, length2, this.isConnected);
            return;
        }
        Uri uri = this.hDKMBd;
        if (uri != null) {
            SerializableSpannableStringBuilder serializableSpannableStringBuilder3 = this.QfsBiF;
            Intrinsics.copydefault(uri);
            serializableSpannableStringBuilder3.setSpan(new Activity(uri, this.EZpvd), length, length2, this.isConnected);
        } else if (this.fJNWhG != -1) {
            this.QfsBiF.setSpan(new Activity(this.fJNWhG, this.EZpvd), length, length2, this.isConnected);
        }
    }

    public final void gEmmrt() {
        int length = this.QfsBiF.length();
        this.AEQbTJ = "< >";
        copydefault();
        this.QfsBiF.setSpan(new FragmentManager(this.RJOkX, this.QKVWgx), length, this.QfsBiF.length(), this.isConnected);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fragment extends ReplacementSpan {
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public Fragment() {
            int i = 0;
            this(i, i, 3, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-16777217 int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:1000) call: com.okinc.uilab.util.SpanUtils.Fragment.<init>(int, int):void type: THIS */
        public /* synthetic */ Fragment(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? -16777217 : i2);
        }

        public Fragment(int i, int i2) {
            this.copydefault = i;
            this.KWHzl = i2;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return (int) paint.measureText(charSequence.subSequence(i, i2).toString());
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(paint, "");
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int color = paint.getColor();
            paint.setColor(this.KWHzl);
            canvas.drawText(charSequenceSubSequence.toString(), f, i4 - (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2)), paint);
            paint.setColor(color);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator implements LineHeightSpan {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static Paint.FontMetricsInt copydefault;
        public final int KWHzl;
        public final int OLrzqt;

        public StateListAnimator(int i, int i2) {
            this.OLrzqt = i;
            this.KWHzl = i2;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(@NotNull CharSequence charSequence, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(fontMetricsInt, "");
            Paint.FontMetricsInt fontMetricsInt2 = copydefault;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                copydefault = fontMetricsInt3;
                Intrinsics.copydefault(fontMetricsInt3);
                fontMetricsInt3.top = fontMetricsInt.top;
                Paint.FontMetricsInt fontMetricsInt4 = copydefault;
                Intrinsics.copydefault(fontMetricsInt4);
                fontMetricsInt4.ascent = fontMetricsInt.ascent;
                Paint.FontMetricsInt fontMetricsInt5 = copydefault;
                Intrinsics.copydefault(fontMetricsInt5);
                fontMetricsInt5.descent = fontMetricsInt.descent;
                Paint.FontMetricsInt fontMetricsInt6 = copydefault;
                Intrinsics.copydefault(fontMetricsInt6);
                fontMetricsInt6.bottom = fontMetricsInt.bottom;
                Paint.FontMetricsInt fontMetricsInt7 = copydefault;
                Intrinsics.copydefault(fontMetricsInt7);
                fontMetricsInt7.leading = fontMetricsInt.leading;
            } else {
                Intrinsics.copydefault(fontMetricsInt2);
                fontMetricsInt.top = fontMetricsInt2.top;
                Paint.FontMetricsInt fontMetricsInt8 = copydefault;
                Intrinsics.copydefault(fontMetricsInt8);
                fontMetricsInt.ascent = fontMetricsInt8.ascent;
                Paint.FontMetricsInt fontMetricsInt9 = copydefault;
                Intrinsics.copydefault(fontMetricsInt9);
                fontMetricsInt.descent = fontMetricsInt9.descent;
                Paint.FontMetricsInt fontMetricsInt10 = copydefault;
                Intrinsics.copydefault(fontMetricsInt10);
                fontMetricsInt.bottom = fontMetricsInt10.bottom;
                Paint.FontMetricsInt fontMetricsInt11 = copydefault;
                Intrinsics.copydefault(fontMetricsInt11);
                fontMetricsInt.leading = fontMetricsInt11.leading;
            }
            int i5 = this.OLrzqt;
            int i6 = fontMetricsInt.descent;
            int i7 = fontMetricsInt.ascent;
            int i8 = i5 - (((i4 + i6) - i7) - i3);
            if (i8 > 0) {
                int i9 = this.KWHzl;
                if (i9 == 2) {
                    int i10 = i8 / 2;
                    fontMetricsInt.descent = i6 + i10;
                    fontMetricsInt.ascent = i7 - i10;
                } else if (i9 == 3) {
                    fontMetricsInt.descent = i6 + i8;
                } else {
                    fontMetricsInt.ascent = i7 - i8;
                }
            }
            int i11 = fontMetricsInt.bottom;
            int i12 = fontMetricsInt.top;
            int i13 = i5 - (((i4 + i11) - i12) - i3);
            if (i13 > 0) {
                int i14 = this.KWHzl;
                if (i14 == 2) {
                    int i15 = i13 / 2;
                    fontMetricsInt.bottom = i11 + i15;
                    fontMetricsInt.top = i12 - i15;
                } else if (i14 == 3) {
                    fontMetricsInt.bottom = i11 + i13;
                } else {
                    fontMetricsInt.top = i12 - i13;
                }
            }
            if (i2 == ((Spanned) charSequence).getSpanEnd(this)) {
                copydefault = null;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.util.SpanUtils.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FragmentManager extends ReplacementSpan {
        public final Paint KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return this.OLrzqt;
        }

        public FragmentManager(int i, int i2) {
            this.OLrzqt = i;
            Paint paint = new Paint();
            this.KWHzl = paint;
            paint.setColor(i2);
            paint.setStyle(Paint.Style.FILL);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(paint, "");
            canvas.drawRect(f, i3, f + this.OLrzqt, i5, this.KWHzl);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class PendingIntent implements LeadingMarginSpan {
        public final int AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            return this.EZpvd + this.AEQbTJ;
        }

        public PendingIntent(int i, int i2, int i3) {
            this.KWHzl = i;
            this.EZpvd = i2;
            this.AEQbTJ = i3;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i, int i2, int i3, int i4, int i5, @NotNull CharSequence charSequence, int i6, int i7, boolean z, @NotNull Layout layout) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(layout, "");
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.KWHzl);
            canvas.drawRect(i, i3, i + (this.EZpvd * i2), i5, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription implements LeadingMarginSpan {
        public final int AEQbTJ;
        public final int KWHzl;
        public final int OLrzqt;
        public Path copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z) {
            return (this.OLrzqt * 2) + this.KWHzl;
        }

        public TaskDescription(int i, int i2, int i3) {
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.KWHzl = i3;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i, int i2, int i3, int i4, int i5, @NotNull CharSequence charSequence, int i6, int i7, boolean z, @NotNull Layout layout) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(layout, "");
            if (((Spanned) charSequence).getSpanStart(this) == i6) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.AEQbTJ);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.copydefault == null) {
                        Path path = new Path();
                        this.copydefault = path;
                        Intrinsics.copydefault(path);
                        path.addCircle(0.0f, 0.0f, this.OLrzqt, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i + (i2 * this.OLrzqt), (i3 + i5) / 2.0f);
                    Path path2 = this.copydefault;
                    Intrinsics.copydefault(path2);
                    canvas.drawPath(path2, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i + (i2 * r10), (i3 + i5) / 2.0f, this.OLrzqt, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class CustomTypefaceSpan extends TypefaceSpan {
        public final Typeface EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomTypefaceSpan(@NotNull Typeface typeface) {
            super("");
            Intrinsics.checkNotNullParameter(typeface, "");
            this.EZpvd = typeface;
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            EZpvd(textPaint, this.EZpvd);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            EZpvd(textPaint, this.EZpvd);
        }

        public final void EZpvd(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 != null ? typeface2.getStyle() : 0) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }
    }

    public static final class Activity extends ActionBar {
        public Uri AEQbTJ;
        public Drawable KWHzl;
        public int valueOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Bitmap bitmap, int i) {
            super(i);
            Intrinsics.checkNotNullParameter(bitmap, "");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C52762wXk.AEQbTJ().getResources(), bitmap);
            this.KWHzl = bitmapDrawable;
            int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
            Drawable drawable = this.KWHzl;
            bitmapDrawable.setBounds(0, 0, intrinsicWidth, drawable != null ? drawable.getIntrinsicHeight() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Drawable drawable, int i) {
            super(i);
            Intrinsics.checkNotNullParameter(drawable, "");
            this.KWHzl = drawable;
            Intrinsics.copydefault(drawable);
            Drawable drawable2 = this.KWHzl;
            Intrinsics.copydefault(drawable2);
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable3 = this.KWHzl;
            Intrinsics.copydefault(drawable3);
            drawable.setBounds(0, 0, intrinsicWidth, drawable3.getIntrinsicHeight());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Uri uri, int i) {
            super(i);
            Intrinsics.checkNotNullParameter(uri, "");
            this.AEQbTJ = uri;
        }

        public Activity(@DrawableRes int i, int i2) {
            super(i2);
            this.valueOf = i;
        }

        @Override // com.okinc.uilab.util.SpanUtils.ActionBar
        public Drawable copydefault() {
            BitmapDrawable bitmapDrawable;
            InputStream inputStreamOpenInputStream;
            Drawable drawable = this.KWHzl;
            if (drawable != null) {
                return drawable;
            }
            if (this.AEQbTJ != null) {
                try {
                    ContentResolver contentResolver = C52762wXk.AEQbTJ().getContentResolver();
                    if (contentResolver != null) {
                        Uri uri = this.AEQbTJ;
                        Intrinsics.copydefault(uri);
                        inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    } else {
                        inputStreamOpenInputStream = null;
                    }
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(C52762wXk.AEQbTJ().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                            Unit unit = Unit.INSTANCE;
                        }
                        return bitmapDrawable2;
                    } catch (Exception unused) {
                        bitmapDrawable = bitmapDrawable2;
                        Objects.toString(this.AEQbTJ);
                        return bitmapDrawable;
                    }
                } catch (Exception unused2) {
                    bitmapDrawable = null;
                }
            } else {
                try {
                    Drawable drawable2 = ContextCompat.getDrawable(C52762wXk.AEQbTJ(), this.valueOf);
                    try {
                        Intrinsics.copydefault(drawable2);
                        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                        Unit unit2 = Unit.INSTANCE;
                        return drawable2;
                    } catch (Exception unused3) {
                        return drawable2;
                    }
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
    }

    public static abstract class ActionBar extends ReplacementSpan {
        public static final Application Companion = new Application(null);
        public static final int EZpvd = 8;
        public WeakReference<Drawable> OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0, 1, null);
        }

        public abstract Drawable copydefault();

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:1323) call: com.okinc.uilab.util.SpanUtils.ActionBar.<init>(int):void type: THIS */
        public /* synthetic */ ActionBar(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i);
        }

        public ActionBar(int i) {
            this.copydefault = i;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            int i3;
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Drawable drawableAEQbTJ = AEQbTJ();
            Intrinsics.copydefault(drawableAEQbTJ);
            Rect bounds = drawableAEQbTJ.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "");
            if (fontMetricsInt != null && (i3 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i4 = this.copydefault;
                if (i4 == 2) {
                    int i5 = i3 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i5;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i5;
                } else if (i4 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else {
                    int i6 = -bounds.height();
                    int i7 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i6 + i7;
                    fontMetricsInt.bottom = i7;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Drawable drawableAEQbTJ = AEQbTJ();
            Intrinsics.copydefault(drawableAEQbTJ);
            Rect bounds = drawableAEQbTJ.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "");
            canvas.save();
            if (bounds.height() < i5 - i3) {
                int i6 = this.copydefault;
                if (i6 == 1) {
                    i3 = i4 - drawableAEQbTJ.getBounds().height();
                } else if (i6 == 2) {
                    i3 = ((i5 + i3) - bounds.height()) / 2;
                } else if (i6 != 3) {
                    i3 = i5 - bounds.height();
                }
                canvas.translate(f, i3);
            } else {
                canvas.translate(f, i3);
            }
            drawableAEQbTJ.draw(canvas);
            canvas.restore();
        }

        public final Drawable AEQbTJ() {
            WeakReference<Drawable> weakReference = this.OLrzqt;
            Drawable drawableCopydefault = weakReference != null ? weakReference.get() : null;
            if (drawableCopydefault == null) {
                drawableCopydefault = copydefault();
                this.OLrzqt = new WeakReference<>(drawableCopydefault);
            }
            Drawable drawableCopydefault2 = copydefault();
            if (drawableCopydefault2 != null) {
                drawableCopydefault2.setLayoutDirection(C55296xhK.AEQbTJ(C52762wXk.AEQbTJ()));
            }
            return drawableCopydefault;
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.util.SpanUtils.ActionBar.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Dialog extends CharacterStyle implements UpdateAppearance {
        public final Shader KWHzl;

        public Dialog(@NotNull Shader shader) {
            Intrinsics.checkNotNullParameter(shader, "");
            this.KWHzl = shader;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setShader(this.KWHzl);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class LoaderManager extends CharacterStyle implements UpdateAppearance {
        public final float AEQbTJ;
        public final int KWHzl;
        public final float OLrzqt;
        public final float copydefault;

        public LoaderManager(float f, float f2, float f3, int i) {
            this.AEQbTJ = f;
            this.OLrzqt = f2;
            this.copydefault = f3;
            this.KWHzl = i;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setShadowLayer(this.AEQbTJ, this.OLrzqt, this.copydefault, this.KWHzl);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SerializableSpannableStringBuilder extends SpannableStringBuilder implements Serializable {
        public static final SerializableSpannableStringBuilder INSTANCE = new SerializableSpannableStringBuilder();
        private static final long serialVersionUID = 4909567650765875771L;

        public final SerializableSpannableStringBuilder invoke() {
            return this;
        }

        private SerializableSpannableStringBuilder() {
        }

        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
        public final char charAt(int i) {
            return get(i);
        }

        public char get(int i) {
            return super.charAt(i);
        }

        public int getLength() {
            return super.length();
        }

        @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
        public final int length() {
            return getLength();
        }
    }
}
