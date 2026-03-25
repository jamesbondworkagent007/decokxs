package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42979rgd extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C42915rfS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42979rgd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42979rgd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.rgd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42979rgd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42979rgd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42915rfS c42915rfSCopydefault = C42915rfS.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42915rfSCopydefault, "");
        this.copydefault = c42915rfSCopydefault;
        OLrzqt();
        copydefault();
    }

    /* JADX INFO: renamed from: o.rgd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rgd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final void OLrzqt() {
        setClickable(true);
        setFocusable(true);
        this.copydefault.copydefault.setText("x");
    }

    public final void copydefault() {
        int iCopydefault;
        if (C33512mxp.AEQbTJ.AYXKKw() == 0) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DcMfJK);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        }
        AppCompatImageView appCompatImageView = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        mHE.tint$default(appCompatImageView, iCopydefault, null, 2, null);
        this.copydefault.copydefault.setTextColor(iCopydefault);
        this.copydefault.AEQbTJ.setTextColor(iCopydefault);
    }

    public final void setBoostTag(java.lang.String str, java.lang.Boolean bool) {
        android.view.View root = this.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? 0 : 8);
        this.copydefault.AEQbTJ.setText(pTB.toLocalizationStringWithPrecision$default(C33129mqd.addS$default("1", str == null ? "" : str, null, null, null, 14, null), 1, 2, RoundingMode.FLOOR, null, 8, null));
    }
}
