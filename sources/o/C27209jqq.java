package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27209jqq extends ConstraintLayout {
    public iIM OLrzqt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27209jqq(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27209jqq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27209jqq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    private final void KWHzl() {
        this.OLrzqt = iIM.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        iIM iim = this.OLrzqt;
        if (iim == null) {
            Intrinsics.gEmmrt("");
            iim = null;
        }
        iim.AEQbTJ.setText(actionBar.AEQbTJ());
        TextViewCompat.setTextAppearance(iim.AEQbTJ, actionBar.OLrzqt() ? C32113mPz.Dialog.hDKMBd : C52761wXj.LoaderManager.dmfpNf);
        iim.OLrzqt.setText(actionBar.KWHzl());
        if (actionBar.copydefault() != null) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(actionBar.EZpvd());
            if (drawableKWHzl != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iCopydefault = C55298xhM.copydefault(16.0f, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawableKWHzl.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context2));
            }
            iim.AEQbTJ.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
            iim.AEQbTJ.setOnClickListener(actionBar.copydefault());
            return;
        }
        iim.AEQbTJ.setCompoundDrawablesRelative(null, null, null, null);
    }

    public final void setTipInfo(@NotNull InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        iIM iim = this.OLrzqt;
        if (iim == null) {
            Intrinsics.gEmmrt("");
            iim = null;
        }
        int i = C52761wXj.TaskDescription.GGlJim;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        if (drawableEZpvd != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawableEZpvd.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context3));
        }
        iim.AEQbTJ.setCompoundDrawablesRelative(null, null, drawableEZpvd, null);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        android.widget.TextView textView = iim.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c27569jxf.AEQbTJ(context4, null, textView, investTipInfoVo, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: o.jqq$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final View.OnClickListener EZpvd;
        public final int KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, View.OnClickListener onClickListener, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i2 & 2) != 0) {
                str2 = actionBar.OLrzqt;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                i = actionBar.KWHzl;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                onClickListener = actionBar.EZpvd;
            }
            View.OnClickListener onClickListener2 = onClickListener;
            if ((i2 & 16) != 0) {
                z = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(str, str3, i3, onClickListener2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.DrawableRes int i, View.OnClickListener onClickListener, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, str2, i, onClickListener, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View.OnClickListener copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = java.lang.Integer.hashCode(this.KWHzl);
            View.OnClickListener onClickListener = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LabelContainerViewData(label=" + this.copydefault + ", labelValue=" + this.OLrzqt + ", infoDrawable=" + this.KWHzl + ", onClickListener=" + this.EZpvd + ", bold=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.DrawableRes int i, View.OnClickListener onClickListener, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.OLrzqt = str2;
            this.KWHzl = i;
            this.EZpvd = onClickListener;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (r8v0 java.lang.String)
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000b: SGET  A[WRAPPED] o.wXj.TaskDescription.GGlJim int) : (r9v0 int))
  (wrap:android.view.View$OnClickListener:0x0013: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.view.View$OnClickListener) : (r10v0 android.view.View$OnClickListener))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, android.view.View$OnClickListener, boolean):void (m)] (LINE:69) call: o.jqq.ActionBar.<init>(java.lang.String, java.lang.String, int, android.view.View$OnClickListener, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, int i, View.OnClickListener onClickListener, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, str2, (i2 & 4) != 0 ? C52761wXj.TaskDescription.GGlJim : i, (i2 & 8) != 0 ? null : onClickListener, (i2 & 16) != 0 ? false : z);
        }
    }
}
