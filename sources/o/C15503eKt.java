package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C15503eKt extends AppCompatTextView {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public float AEQbTJ;
    public float AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public java.lang.String AuCTel;
    public Activity DbNXlk;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean djBIcL;
    public java.lang.String ejfBZ;
    public android.graphics.Paint fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public int fetchVPNInfo;
    public java.lang.String gEmmrt;
    public int isConnected;
    public boolean uzCIH;
    public float valueOf;
    public int values;

    /* JADX INFO: renamed from: o.eKt$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Activity {
        void AEQbTJ(float f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoSizeTextTypeFixLengthConfiguration(float f, float f2, int i, int i2, int i3, int i4) {
        this.AYXKKw = f2;
        this.valueOf = f;
        this.AhwBna = i;
        this.values = i3;
        this.isConnected = i2;
        this.AkhnZx = i4;
        this.fetchVPNInfo = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrLeft(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeparator(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldEclip(boolean z) {
        this.uzCIH = z;
    }

    /* JADX INFO: renamed from: o.eKt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eKt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15503eKt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = 12.0f;
        this.AYXKKw = 16.0f;
        this.AhwBna = 2;
        this.values = 20;
        this.isConnected = 10;
        this.AkhnZx = 2;
        this.AEQbTJ = 16.0f;
        this.gEmmrt = "";
        this.ejfBZ = "";
        this.AuCTel = "";
        this.OLrzqt = "";
        this.KWHzl = "";
        this.EZpvd = "...";
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.fARcdN = textPaint;
        Intrinsics.copydefault(textPaint);
        textPaint.set((android.graphics.Paint) getPaint());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15503eKt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15503eKt(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public void setAutoSizeTextTypeFixWithConfiguration(float f, float f2, int i) {
        setAutoSizeTextTypeFixLengthConfiguration(f, f2, i, -1, -1, -1);
        this.fetchVPNInfo = 0;
    }

    public static /* synthetic */ void setText$default(C15503eKt c15503eKt, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setText");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c15503eKt.setText(str, str2, str3, z);
    }

    public final void setText(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
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
        this.gEmmrt = str;
        this.ejfBZ = str2;
        this.AuCTel = str3;
        this.OLrzqt = str;
        this.djBIcL = false;
        this.fIwbmz = false;
        setText(str + str2 + str3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        java.lang.String string;
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.djBIcL = false;
            this.fIwbmz = false;
            if (this.gEmmrt.length() == 0 && this.ejfBZ.length() == 0 && this.AuCTel.length() == 0) {
                string = getText().toString();
            } else {
                string = this.gEmmrt + this.ejfBZ + this.AuCTel;
            }
            KWHzl(this, i, string, string.length());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.lang.String string;
        java.lang.String string2;
        this.fJNWhG = i2 > i3;
        int measuredWidth = getMeasuredWidth();
        java.lang.String str = "";
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        KWHzl(this, measuredWidth, string, i3);
        if (charSequence != null && (string2 = charSequence.toString()) != null) {
            str = string2;
        }
        this.KWHzl = str;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public static /* synthetic */ void adjustTextSize$default(C15503eKt c15503eKt, android.widget.TextView textView, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustTextSize");
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c15503eKt.KWHzl(textView, i, str, i2);
    }

    private final void KWHzl(android.widget.TextView textView, int i, java.lang.String str, int i2) {
        java.util.List listAhwBna;
        this.uzCIH = false;
        if (i > 0) {
            this.AEQbTJ = this.AYXKKw;
            android.graphics.Paint paint = this.fARcdN;
            Intrinsics.copydefault(paint);
            float f = this.AEQbTJ;
            android.content.Context context = getContext();
            java.lang.String str2 = "";
            Intrinsics.checkNotNullExpressionValue(context, "");
            paint.setTextSize(C33052mpF.AhwBna(f, context));
            float paddingLeft = i - getPaddingLeft();
            float paddingRight = getPaddingRight();
            if (this.fetchVPNInfo == 0) {
                while (true) {
                    android.graphics.Paint paint2 = this.fARcdN;
                    Intrinsics.copydefault(paint2);
                    if (paint2.measureText(str) < paddingLeft - paddingRight) {
                        break;
                    }
                    float f2 = this.AEQbTJ - this.AhwBna;
                    this.AEQbTJ = f2;
                    int i3 = (int) f2;
                    float f3 = this.valueOf;
                    if (i3 < ((int) f3)) {
                        this.AEQbTJ = f3;
                        this.uzCIH = true;
                        android.graphics.Paint paint3 = this.fARcdN;
                        Intrinsics.copydefault(paint3);
                        float f4 = this.valueOf;
                        android.content.Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        paint3.setTextSize(C33052mpF.AhwBna(f4, context2));
                        break;
                    }
                    android.graphics.Paint paint4 = this.fARcdN;
                    Intrinsics.copydefault(paint4);
                    float f5 = this.AEQbTJ;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    paint4.setTextSize(C33052mpF.AhwBna(f5, context3));
                }
                if (this.uzCIH && !this.djBIcL && !this.fIwbmz) {
                    java.lang.String str3 = this.AuCTel;
                    if (str3 == null || str3.length() == 0) {
                        if (str == null || (listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{this.ejfBZ}, false, 0, 6, (java.lang.Object) null)) == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        if (listAhwBna.size() < 2) {
                            return;
                        }
                        java.lang.String str4 = (java.lang.String) listAhwBna.get(0);
                        this.gEmmrt = str4;
                        if (str != null) {
                            java.lang.String strSubstring = str.substring(str4.length() + this.ejfBZ.length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            if (strSubstring != null) {
                                str2 = strSubstring;
                            }
                        }
                        this.AuCTel = str2;
                    }
                    if (this.AuCTel.length() < this.OLrzqt.length()) {
                        float paddingLeft2 = (i - getPaddingLeft()) - getPaddingRight();
                        android.graphics.Paint paint5 = this.fARcdN;
                        Intrinsics.copydefault(paint5);
                        OLrzqt(this.gEmmrt, paddingLeft2 - paint5.measureText(this.ejfBZ + this.AuCTel));
                    } else {
                        float paddingLeft3 = (i - getPaddingLeft()) - getPaddingRight();
                        android.graphics.Paint paint6 = this.fARcdN;
                        Intrinsics.copydefault(paint6);
                        KWHzl(this.AuCTel, paddingLeft3 - paint6.measureText(this.gEmmrt + this.ejfBZ));
                    }
                } else if (!Intrinsics.EZpvd((java.lang.Object) getText().toString(), (java.lang.Object) str)) {
                    setText(str);
                }
            } else {
                this.AEQbTJ = copydefault(i2);
            }
            Activity activity = this.DbNXlk;
            if (activity != null) {
                activity.AEQbTJ(this.AEQbTJ);
            }
            textView.setTextSize(this.AEQbTJ);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = true;
        int iAEQbTJ = AEQbTJ(str, 0, str.length() - 1, f);
        if (iAEQbTJ == -1) {
            this.fIwbmz = true;
            return;
        }
        java.lang.String strSubstring = str.substring(0, iAEQbTJ + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String str2 = strSubstring + this.EZpvd;
        this.OLrzqt = str2;
        setText(str2 + this.ejfBZ + this.AuCTel);
    }

    public final void KWHzl(@NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = true;
        int iAEQbTJ = AEQbTJ(str, 0, str.length() - 1, f);
        if (iAEQbTJ == -1) {
            this.fIwbmz = true;
            return;
        }
        java.lang.String strSubstring = str.substring(0, iAEQbTJ + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String str2 = strSubstring + this.EZpvd;
        this.AuCTel = str2;
        setText(this.OLrzqt + this.ejfBZ + str2);
    }

    public final int AEQbTJ(@NotNull java.lang.String str, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int i3 = ((i + i2) + 1) / 2;
            java.lang.String strSubstring = str.substring(0, i3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            android.graphics.Paint paint = this.fARcdN;
            Intrinsics.copydefault(paint);
            if (f >= paint.measureText(strSubstring + this.EZpvd)) {
                i = i3;
            } else {
                i2 = i3 - 1;
            }
        }
        return i2;
    }

    private final float copydefault(int i) {
        float f;
        int i2 = this.values;
        int i3 = this.isConnected;
        int i4 = (i2 - i3) / this.AkhnZx;
        if (i <= i3) {
            f = this.AYXKKw;
        } else {
            if (i <= i2) {
                if (i4 >= 0) {
                    int i5 = 0;
                    while (i > this.isConnected + (this.AkhnZx * i5)) {
                        if (i5 != i4) {
                            i5++;
                        }
                    }
                    f = this.AYXKKw - (i5 * this.AhwBna);
                }
                return this.AEQbTJ;
            }
            f = this.valueOf;
        }
        this.AEQbTJ = f;
        return f;
    }
}
