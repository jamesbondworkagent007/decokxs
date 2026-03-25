package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tLV extends android.widget.FrameLayout {
    public final int[] OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.tLV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tLV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tLV(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tLT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tLV.OLrzqt(context, this);
            }
        });
        this.OLrzqt = new int[]{C33070mpX.copydefault(C47501trL.Activity.copydefault), C33070mpX.copydefault(C47501trL.Activity.KWHzl)};
    }

    public final tOS copydefault() {
        return (tOS) this.copydefault.getValue();
    }

    public static final tOS OLrzqt(android.content.Context context, tLV tlv) {
        tOS tosKWHzl = tOS.KWHzl(android.view.LayoutInflater.from(context), tlv, true);
        Intrinsics.checkNotNullExpressionValue(tosKWHzl, "");
        return tosKWHzl;
    }

    public final void setTitle(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        tOS tosCopydefault = copydefault();
        tosCopydefault.valueOf.setText(taskDescription.OLrzqt());
        if (taskDescription.EZpvd()) {
            android.widget.LinearLayout linearLayout = tosCopydefault.values;
            android.widget.TextView textView = tosCopydefault.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            linearLayout.setBackground(new Activity(textView.getVisibility() == 0));
            android.widget.TextView textView2 = tosCopydefault.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            KWHzl(textView2);
            tosCopydefault.valueOf.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
            android.widget.TextView textView3 = tosCopydefault.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            KWHzl(textView3);
            tosCopydefault.AhwBna.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
        } else {
            android.widget.LinearLayout linearLayout2 = tosCopydefault.values;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setPadding(0, 0, 0, 0);
            android.widget.LinearLayout linearLayout3 = tosCopydefault.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            if (linearLayout3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            tosCopydefault.valueOf.setTextColor(C33070mpX.copydefault(taskDescription.AEQbTJ()));
            android.view.View view = tosCopydefault.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            android.widget.TextView textView4 = tosCopydefault.isConnected;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
        }
        java.lang.String strKWHzl = taskDescription.KWHzl();
        if (strKWHzl != null) {
            android.widget.TextView textView5 = tosCopydefault.AhwBna;
            Intrinsics.copydefault(textView5);
            textView5.setVisibility(0);
            textView5.setText(strKWHzl);
            textView5.setTextColor(C33070mpX.copydefault(taskDescription.copydefault()));
        }
    }

    public final void AEQbTJ() {
        copydefault().DbNXlk.setVisibility(8);
        copydefault().copydefault.setVisibility(0);
    }

    public final void OLrzqt() {
        copydefault().DbNXlk.setVisibility(0);
        copydefault().copydefault.setVisibility(8);
    }

    public final void setTimestamp(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().djBIcL.setText(tRL.EZpvd(str, false, false));
    }

    private final void KWHzl(android.widget.TextView textView) {
        textView.getPaint().setShader(copydefault(textView.getPaint().measureText(textView.getText().toString()), textView.getTextSize()));
    }

    public final LinearGradient copydefault(float f, float f2) {
        return new LinearGradient(0.0f, 0.0f, f, f2, this.OLrzqt, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static final class TaskDescription {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public boolean OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i3 & 2) != 0) {
                str2 = taskDescription.EZpvd;
            }
            java.lang.String str3 = str2;
            if ((i3 & 4) != 0) {
                i = taskDescription.AEQbTJ;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = taskDescription.KWHzl;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(str, str3, i4, i5, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes int i, @androidx.annotation.ColorRes int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, str2, i, i2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.AEQbTJ == taskDescription.AEQbTJ && this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HeaderTitleParam(name=" + this.copydefault + ", roleLabel=" + this.EZpvd + ", nameColor=" + this.AEQbTJ + ", roleLabelColor=" + this.KWHzl + ", isVipVersion=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes int i, @androidx.annotation.ColorRes int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.EZpvd = str2;
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.Activity.zblBkD int) : (r9v0 int))
  (wrap:int:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0011: SGET  A[WRAPPED] o.wXj.Activity.aUsmxb int) : (r10v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, int, boolean):void (m)] (LINE:137) call: o.tLV.TaskDescription.<init>(java.lang.String, java.lang.String, int, int, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? C52761wXj.Activity.zblBkD : i, (i3 & 8) != 0 ? C52761wXj.Activity.aUsmxb : i2, (i3 & 16) != 0 ? false : z);
        }
    }

    public final class Activity extends android.graphics.drawable.Drawable {
        public final android.graphics.Paint EZpvd;
        public final float KWHzl;
        public final float OLrzqt;
        public final boolean copydefault;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public Activity(boolean z) {
            this.copydefault = z;
            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(1.0f, null, 1, null);
            this.OLrzqt = fDp2pxFloat$default;
            this.KWHzl = fDp2pxFloat$default / 2;
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(fDp2pxFloat$default);
            this.EZpvd = paint;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NotNull android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            float f = this.KWHzl;
            RectF rectF = new RectF(f, f, getBounds().width() - this.KWHzl, getBounds().height() - this.KWHzl);
            this.EZpvd.setShader(tLV.this.copydefault(C33129mqd.djBIcL(java.lang.Integer.valueOf(getBounds().width())), 0.0f));
            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(this.copydefault ? 36.0f : 22.0f, null, 1, null);
            canvas.drawRoundRect(rectF, fDp2pxFloat$default, fDp2pxFloat$default, this.EZpvd);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.EZpvd.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.EZpvd.setColorFilter(colorFilter);
        }
    }
}
