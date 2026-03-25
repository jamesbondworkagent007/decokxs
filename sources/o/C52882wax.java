package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.uilab.edit.OKEditText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52882wax extends android.widget.LinearLayout {
    public final AbstractC50810vbF AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52882wax(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52882wax(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.wax.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52882wax(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52882wax(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
        AbstractC50810vbF abstractC50810vbF = (AbstractC50810vbF) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.HJWChPiaHEvk, this, true);
        this.AEQbTJ = abstractC50810vbF;
        abstractC50810vbF.copydefault.setActivated(true);
        abstractC50810vbF.OLrzqt.setActivated(true);
    }

    public final OKEditText EZpvd() {
        OKEditText oKEditText = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        return oKEditText;
    }

    public final OKEditText copydefault() {
        OKEditText oKEditText = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        return oKEditText;
    }

    public static /* synthetic */ void setNameError$default(C52882wax c52882wax, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c52882wax.setNameError(z, str);
    }

    public final void setNameError(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55258xgZ c55258xgZ = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(z ? 0 : 8);
        this.AEQbTJ.EZpvd.setText(str);
    }

    public final void setNameNotifyVisible(boolean z) {
        android.widget.TextView textView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setNameNotifyText$default(C52882wax c52882wax, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c52882wax.setNameNotifyText(str);
    }

    public final void setNameNotifyText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ.setText(str);
    }

    public static /* synthetic */ void setIntroNotifyText$default(C52882wax c52882wax, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c52882wax.setIntroNotifyText(str);
    }

    public final void setIntroNotifyText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.KWHzl.setText(str);
    }
}
