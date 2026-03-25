package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C14696dqN extends AppCompatTextView {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public float AhwBna;
    public int AkhnZx;
    public java.lang.String AuCTel;
    public int DbNXlk;
    public java.lang.String EZpvd;
    public float KWHzl;
    public final java.lang.String OLrzqt;
    public boolean djBIcL;
    public boolean ejfBZ;
    public int fARcdN;
    public boolean fIwbmz;
    public android.graphics.Paint fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public boolean hDKMBd;
    public int isConnected;
    public java.lang.String iwGUEr;
    public float valueOf;
    public StateListAnimator values;

    /* JADX INFO: renamed from: o.dqN$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(float f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoSizeTextTypeFixLengthConfiguration(float f, float f2, int i, int i2, int i3, int i4) {
        this.AhwBna = f2;
        this.valueOf = f;
        this.gEmmrt = i;
        this.isConnected = i3;
        this.fetchVPNInfo = i2;
        this.AkhnZx = i4;
        this.DbNXlk = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrLeft(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSizeChangedListener(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.values = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeparator(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldEclip(boolean z) {
        this.hDKMBd = z;
    }

    /* JADX INFO: renamed from: o.dqN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14696dqN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = 12.0f;
        this.AhwBna = 16.0f;
        this.gEmmrt = 2;
        this.isConnected = 20;
        this.fetchVPNInfo = 10;
        this.AkhnZx = 2;
        this.KWHzl = 16.0f;
        this.AYXKKw = "";
        this.iwGUEr = "";
        this.AuCTel = "";
        this.AEQbTJ = "";
        this.EZpvd = "";
        this.OLrzqt = "...";
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.fJNWhG = textPaint;
        Intrinsics.copydefault(textPaint);
        textPaint.set((android.graphics.Paint) getPaint());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14696dqN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14696dqN(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public void setAutoSizeTextTypeFixWithConfiguration(float f, float f2, int i) {
        setAutoSizeTextTypeFixLengthConfiguration(f, f2, i, -1, -1, -1);
        this.DbNXlk = 0;
    }

    public static /* synthetic */ boolean setText$default(C14696dqN c14696dqN, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setText");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return c14696dqN.EZpvd(str, str2, str3, z);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                str3 = str;
                str = str3;
            }
        }
        this.AYXKKw = str;
        this.iwGUEr = str2;
        this.AuCTel = str3;
        this.AEQbTJ = str;
        this.djBIcL = false;
        this.ejfBZ = false;
        java.lang.String str4 = str + str2 + str3;
        if (Intrinsics.EZpvd((java.lang.Object) getText(), (java.lang.Object) str4)) {
            return false;
        }
        setText(str4);
        return true;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        java.lang.String string;
        super.layout(i, i2, i3, i4);
        if (getWidth() != this.fARcdN) {
            this.fARcdN = getWidth();
            this.djBIcL = false;
            this.ejfBZ = false;
            if (this.AYXKKw.length() == 0 && this.iwGUEr.length() == 0 && this.AuCTel.length() == 0) {
                string = getText().toString();
            } else {
                string = this.AYXKKw + this.iwGUEr + this.AuCTel;
            }
            copydefault(this, getWidth(), string, string.length());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.lang.String string;
        java.lang.String string2;
        this.fIwbmz = i2 > i3;
        int measuredWidth = getMeasuredWidth();
        java.lang.String str = "";
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        copydefault(this, measuredWidth, string, i3);
        if (charSequence != null && (string2 = charSequence.toString()) != null) {
            str = string2;
        }
        this.EZpvd = str;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public static /* synthetic */ void adjustTextSize$default(C14696dqN c14696dqN, android.widget.TextView textView, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustTextSize");
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c14696dqN.copydefault(textView, i, str, i2);
    }

    public final void copydefault(android.widget.TextView textView, int i, java.lang.String str, int i2) {
        java.util.List listAhwBna;
        this.hDKMBd = false;
        if (i > 0) {
            this.KWHzl = this.AhwBna;
            android.graphics.Paint paint = this.fJNWhG;
            Intrinsics.copydefault(paint);
            float f = this.KWHzl;
            android.content.Context context = getContext();
            java.lang.String str2 = "";
            Intrinsics.checkNotNullExpressionValue(context, "");
            paint.setTextSize(C33052mpF.AhwBna(f, context));
            float paddingStart = i - getPaddingStart();
            float paddingEnd = getPaddingEnd();
            if (this.DbNXlk == 0) {
                while (true) {
                    android.graphics.Paint paint2 = this.fJNWhG;
                    Intrinsics.copydefault(paint2);
                    if (paint2.measureText(str) < paddingStart - paddingEnd) {
                        break;
                    }
                    float f2 = this.KWHzl - this.gEmmrt;
                    this.KWHzl = f2;
                    int i3 = (int) f2;
                    float f3 = this.valueOf;
                    if (i3 < ((int) f3)) {
                        this.KWHzl = f3;
                        this.hDKMBd = true;
                        android.graphics.Paint paint3 = this.fJNWhG;
                        Intrinsics.copydefault(paint3);
                        float f4 = this.valueOf;
                        android.content.Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        paint3.setTextSize(C33052mpF.AhwBna(f4, context2));
                        break;
                    }
                    android.graphics.Paint paint4 = this.fJNWhG;
                    Intrinsics.copydefault(paint4);
                    float f5 = this.KWHzl;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    paint4.setTextSize(C33052mpF.AhwBna(f5, context3));
                }
                if (this.hDKMBd && !this.djBIcL && !this.ejfBZ) {
                    java.lang.String str3 = this.AuCTel;
                    if (str3 == null || str3.length() == 0) {
                        if (str == null || (listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{this.iwGUEr}, false, 0, 6, (java.lang.Object) null)) == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        if (listAhwBna.size() < 2) {
                            return;
                        }
                        java.lang.String str4 = (java.lang.String) listAhwBna.get(0);
                        this.AYXKKw = str4;
                        if (str != null) {
                            java.lang.String strSubstring = str.substring(str4.length() + this.iwGUEr.length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            if (strSubstring != null) {
                                str2 = strSubstring;
                            }
                        }
                        this.AuCTel = str2;
                    }
                    if (this.AuCTel.length() < this.AEQbTJ.length()) {
                        float paddingStart2 = (i - getPaddingStart()) - getPaddingEnd();
                        android.graphics.Paint paint5 = this.fJNWhG;
                        Intrinsics.copydefault(paint5);
                        KWHzl(this.AYXKKw, paddingStart2 - paint5.measureText(this.iwGUEr + this.AuCTel));
                    } else {
                        float paddingStart3 = (i - getPaddingStart()) - getPaddingEnd();
                        android.graphics.Paint paint6 = this.fJNWhG;
                        Intrinsics.copydefault(paint6);
                        EZpvd(this.AuCTel, paddingStart3 - paint6.measureText(this.AYXKKw + this.iwGUEr));
                    }
                } else if (!Intrinsics.EZpvd((java.lang.Object) getText().toString(), (java.lang.Object) str)) {
                    setText(str);
                }
            } else {
                this.KWHzl = copydefault(i2);
            }
            StateListAnimator stateListAnimator = this.values;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(this.KWHzl);
            }
            textView.setTextSize(this.KWHzl);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = true;
        int iAEQbTJ = AEQbTJ(str, 0, str.length() - 1, f);
        if (iAEQbTJ == -1) {
            this.ejfBZ = true;
            return;
        }
        java.lang.String strSubstring = str.substring(0, iAEQbTJ + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String str2 = strSubstring + this.OLrzqt;
        this.AEQbTJ = str2;
        setText(str2 + this.iwGUEr + this.AuCTel);
    }

    public final void EZpvd(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = true;
        int iAEQbTJ = AEQbTJ(str, 0, str.length() - 1, f);
        if (iAEQbTJ == -1) {
            this.ejfBZ = true;
            return;
        }
        java.lang.String strSubstring = str.substring(0, iAEQbTJ + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String str2 = strSubstring + this.OLrzqt;
        this.AuCTel = str2;
        setText(this.AEQbTJ + this.iwGUEr + str2);
    }

    public final int AEQbTJ(@NotNull java.lang.String str, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int i3 = ((i + i2) + 1) / 2;
            java.lang.String strSubstring = str.substring(0, i3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            android.graphics.Paint paint = this.fJNWhG;
            Intrinsics.copydefault(paint);
            if (f >= paint.measureText(strSubstring + this.OLrzqt)) {
                i = i3;
            } else {
                i2 = i3 - 1;
            }
        }
        return i2;
    }

    public final float copydefault(int i) {
        float f;
        int i2 = this.isConnected;
        int i3 = this.fetchVPNInfo;
        int i4 = (i2 - i3) / this.AkhnZx;
        if (i <= i3) {
            f = this.AhwBna;
        } else {
            if (i <= i2) {
                if (i4 >= 0) {
                    int i5 = 0;
                    while (i > this.fetchVPNInfo + (this.AkhnZx * i5)) {
                        if (i5 != i4) {
                            i5++;
                        }
                    }
                    f = this.AhwBna - (i5 * this.gEmmrt);
                }
                return this.KWHzl;
            }
            f = this.valueOf;
        }
        this.KWHzl = f;
        return f;
    }
}
