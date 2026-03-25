package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C24247iaI extends AppCompatTextView {
    public float AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public java.lang.String AuCTel;
    public android.graphics.Paint DbNXlk;
    public float EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public float djBIcL;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public java.lang.String valueOf;
    public int values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAutoSizeTextTypeFixLengthConfiguration(float f, float f2, int i, int i2, int i3, int i4) {
        this.AYXKKw = f2;
        this.djBIcL = f;
        this.gEmmrt = i;
        this.isConnected = i3;
        this.AkhnZx = i2;
        this.fetchVPNInfo = i4;
        this.values = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCanAdJustSize(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrLeft(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNeedHandleEclipse(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldEclipseHandle(boolean z) {
        this.fIwbmz = z;
    }

    /* JADX INFO: renamed from: o.iaI$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iaI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24247iaI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = 12.0f;
        this.AYXKKw = 24.0f;
        this.gEmmrt = 2;
        this.isConnected = 20;
        this.AkhnZx = 10;
        this.fetchVPNInfo = 2;
        this.EZpvd = 24.0f;
        this.valueOf = "";
        this.AuCTel = "";
        this.fARcdN = "";
        this.AhwBna = 3;
        this.KWHzl = true;
        this.copydefault = "";
        this.OLrzqt = "...";
        copydefault(attributeSet);
    }

    private final void copydefault(android.util.AttributeSet attributeSet) {
        setSingleLine(true);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.DbNXlk = textPaint;
        Intrinsics.copydefault(textPaint);
        textPaint.set((android.graphics.Paint) getPaint());
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.OLrzqt);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.djBIcL = typedArrayObtainStyledAttributes.getFloat(C23274hvD.LoaderManager.AhwBna, 12.0f);
            this.AYXKKw = typedArrayObtainStyledAttributes.getFloat(C23274hvD.LoaderManager.valueOf, 20.0f);
            this.gEmmrt = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.gEmmrt, 2);
            this.AkhnZx = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.djBIcL, 10);
            this.isConnected = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.AYXKKw, 20);
            this.AkhnZx = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.djBIcL, 10);
            this.ejfBZ = typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.KWHzl, false);
            this.values = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.AEQbTJ, 0);
            this.AhwBna = typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.copydefault, 3);
            this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.EZpvd, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24247iaI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24247iaI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public void setAutoSizeTextTypeFixWithConfiguration(float f, float f2, int i) {
        setAutoSizeTextTypeFixLengthConfiguration(f, f2, i, -1, -1, -1);
        this.values = 0;
    }

    public final void setText(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!this.ejfBZ) {
            throw new java.lang.IllegalArgumentException("only need special eclipse handle can call the function");
        }
        this.valueOf = str;
        this.AuCTel = str2;
        this.fARcdN = str3;
        this.copydefault = str;
        setText(str + str2 + str3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.fJNWhG) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.KWHzl || i == i3) {
            return;
        }
        EZpvd(this, i, getText().toString(), getText().length());
    }

    public static /* synthetic */ void adjustTextSize$default(C24247iaI c24247iaI, android.widget.TextView textView, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustTextSize");
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        c24247iaI.EZpvd(textView, i, str, i2);
    }

    private final void EZpvd(android.widget.TextView textView, int i, java.lang.String str, int i2) {
        this.fIwbmz = false;
        if (i > 0) {
            this.EZpvd = this.AYXKKw;
            android.graphics.Paint paint = this.DbNXlk;
            Intrinsics.copydefault(paint);
            float f = this.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            paint.setTextSize(C55298xhM.gEmmrt(f, context));
            float paddingStart = i - getPaddingStart();
            float paddingEnd = getPaddingEnd();
            if (this.values == 0) {
                android.graphics.Paint paint2 = this.DbNXlk;
                Intrinsics.copydefault(paint2);
                float fMeasureText = paint2.measureText(str);
                while (true) {
                    if (fMeasureText + this.AhwBna <= paddingStart - paddingEnd) {
                        break;
                    }
                    android.graphics.Paint paint3 = this.DbNXlk;
                    Intrinsics.copydefault(paint3);
                    fMeasureText = paint3.measureText(str);
                    float f2 = this.EZpvd - this.gEmmrt;
                    this.EZpvd = f2;
                    int i3 = (int) f2;
                    float f3 = this.djBIcL;
                    if (i3 < ((int) f3)) {
                        this.EZpvd = f3;
                        this.fIwbmz = true;
                        android.graphics.Paint paint4 = this.DbNXlk;
                        Intrinsics.copydefault(paint4);
                        float f4 = this.djBIcL;
                        android.content.Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        paint4.setTextSize(C55298xhM.gEmmrt(f4, context2));
                        break;
                    }
                    android.graphics.Paint paint5 = this.DbNXlk;
                    Intrinsics.copydefault(paint5);
                    float f5 = this.EZpvd;
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    paint5.setTextSize(C55298xhM.gEmmrt(f5, context3));
                }
                if (this.ejfBZ && this.fIwbmz) {
                    float paddingStart2 = (i - getPaddingStart()) - getPaddingEnd();
                    android.graphics.Paint paint6 = this.DbNXlk;
                    Intrinsics.copydefault(paint6);
                    EZpvd(this.valueOf, (paddingStart2 - paint6.measureText(this.AuCTel + this.fARcdN)) - ((float) KWHzl()));
                }
            } else {
                this.EZpvd = copydefault(i2);
            }
            textView.setTextSize(this.EZpvd);
        }
    }

    private final int KWHzl() {
        try {
            return getCompoundDrawables()[2].getMinimumWidth() + getCompoundDrawablePadding();
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    private final void EZpvd(java.lang.String str, float f) {
        int iKWHzl = KWHzl(str, 0, str.length() - 1, f);
        if (iKWHzl == -1) {
            return;
        }
        java.lang.String strSubstring = str.substring(0, iKWHzl);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String str2 = strSubstring + this.OLrzqt;
        this.copydefault = str2;
        setText(str2 + this.AuCTel + this.fARcdN);
    }

    public final int KWHzl(@NotNull java.lang.String str, int i, int i2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            int i3 = ((i + i2) + 1) / 2;
            java.lang.String strSubstring = str.substring(0, i3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            android.graphics.Paint paint = this.DbNXlk;
            Intrinsics.copydefault(paint);
            float fMeasureText = f - paint.measureText(strSubstring + this.OLrzqt);
            if (fMeasureText > 1.0f) {
                i = i3;
            } else {
                if (fMeasureText >= 1.0f) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return i;
    }

    private final float copydefault(int i) {
        float f;
        int i2 = this.isConnected;
        int i3 = this.AkhnZx;
        int i4 = (i2 - i3) / this.fetchVPNInfo;
        if (i <= i3) {
            f = this.AYXKKw;
        } else {
            if (i <= i2) {
                if (i4 >= 0) {
                    int i5 = 0;
                    while (i > this.AkhnZx + (this.fetchVPNInfo * i5)) {
                        if (i5 != i4) {
                            i5++;
                        }
                    }
                    f = this.AYXKKw - (i5 * this.gEmmrt);
                }
                return this.EZpvd;
            }
            f = this.djBIcL;
        }
        this.EZpvd = f;
        return f;
    }
}
