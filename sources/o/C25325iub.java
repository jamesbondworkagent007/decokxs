package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25325iub extends AbstractC24459ieI {
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public hHN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setupListeners(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.OLrzqt = function0;
        this.KWHzl = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25325iub(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25325iub(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25325iub(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void OLrzqt() {
        this.copydefault = hHN.EZpvd(android.view.LayoutInflater.from(getContext()), DbNXlk(), true);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        hHN hhn = this.copydefault;
        if (hhn != null) {
            return hhn.AhwBna;
        }
        return null;
    }

    public final void setupView(@NotNull TaskDescription taskDescription) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        hHN hhn = this.copydefault;
        if (hhn != null) {
            hhn.AEQbTJ.setHelperLabelType(taskDescription.AEQbTJ());
            hhn.AEQbTJ.setTextValue(taskDescription.OLrzqt());
            hhn.AEQbTJ.setTextColor(taskDescription.copydefault());
            C55312xha c55312xhaValueOf = hhn.AEQbTJ.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setUnderlineColor(taskDescription.copydefault());
            }
            hhn.AYXKKw.setText(taskDescription.AhwBna());
            hhn.AYXKKw.setTextColor(taskDescription.djBIcL());
            android.widget.ImageView imageView = hhn.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(taskDescription.KWHzl() ? 0 : 8);
            if (taskDescription.KWHzl()) {
                android.widget.ImageView imageView2 = hhn.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                java.lang.String strAYXKKw = taskDescription.AYXKKw();
                if (strAYXKKw == null) {
                    strAYXKKw = "";
                }
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                    Unit unit = Unit.INSTANCE;
                    drawable = drawableKWHzl;
                } else {
                    drawable = null;
                }
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                    Unit unit2 = Unit.INSTANCE;
                    drawable2 = drawableKWHzl2;
                } else {
                    drawable2 = null;
                }
                C25386ivj.KWHzl(imageView2, strAYXKKw, new C25385ivi(drawable, drawable2, 0.0f, 0, 12, null));
            }
            android.widget.ImageView imageView3 = hhn.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(taskDescription.EZpvd() ? 0 : 8);
            C55258xgZ c55258xgZ = hhn.AEQbTJ;
            c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
            ConstraintLayout constraintLayout = hhn.AhwBna;
            constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.iub$TaskDescription */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final int djBIcL;
        public final java.lang.CharSequence valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @androidx.annotation.ColorInt int i, int i2, @NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorInt int i3, boolean z, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return new TaskDescription(str, i, i2, charSequence, i3, z, str2, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.djBIcL;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && this.AEQbTJ == taskDescription.AEQbTJ && this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd(this.valueOf, taskDescription.valueOf) && this.djBIcL == taskDescription.djBIcL && this.OLrzqt == taskDescription.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskDescription.AhwBna) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode3 = java.lang.Integer.hashCode(this.KWHzl);
            int iHashCode4 = this.valueOf.hashCode();
            int iHashCode5 = java.lang.Integer.hashCode(this.djBIcL);
            int iHashCode6 = java.lang.Boolean.hashCode(this.OLrzqt);
            java.lang.String str = this.AhwBna;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.EZpvd;
            int i = this.AEQbTJ;
            int i2 = this.KWHzl;
            java.lang.CharSequence charSequence = this.valueOf;
            return "MemeOrderInfoItemData(label=" + str + ", labelTextColor=" + i + ", labelType=" + i2 + ", value=" + ((java.lang.Object) charSequence) + ", valueTextColor=" + this.djBIcL + ", shouldShowIconStart=" + this.OLrzqt + ", valueIconStart=" + this.AhwBna + ", shouldShowActionIcon=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @androidx.annotation.ColorInt int i, int i2, @NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorInt int i3, boolean z, java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.EZpvd = str;
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.valueOf = charSequence;
            this.djBIcL = i3;
            this.OLrzqt = z;
            this.AhwBna = str2;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE (wrap:int:0x0006: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:96)) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r11v0 int))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0015: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("--") : (r12v0 java.lang.CharSequence))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: INVOKE (wrap:int:0x0021: SGET  A[WRAPPED] o.wXj.Activity.fdOvFl int) STATIC call: o.ivf.KWHzl(int):int A[MD:(int):int (m), WRAPPED] (LINE:99)) : (r13v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 boolean) : false)
 A[MD:(java.lang.String, int, int, java.lang.CharSequence, int, boolean, java.lang.String, boolean):void (m)] (LINE:94) call: o.iub.TaskDescription.<init>(java.lang.String, int, int, java.lang.CharSequence, int, boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, int i, int i2, java.lang.CharSequence charSequence, int i3, boolean z, java.lang.String str2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.QwvEab) : i, (i4 & 4) != 0 ? 2 : i2, (i4 & 8) != 0 ? "--" : charSequence, (i4 & 16) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : i3, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? null : str2, (i4 & 128) == 0 ? z2 : false);
        }
    }

    /* JADX INFO: renamed from: o.iub$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C25325iub AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25325iub c25325iub) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c25325iub;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.iub$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25325iub OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25325iub c25325iub) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c25325iub;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
