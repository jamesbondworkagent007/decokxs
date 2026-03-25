package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24254iaP extends android.widget.FrameLayout {
    public hGT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24254iaP(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:30) call: o.iaP.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C24254iaP(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24254iaP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGT hgtEZpvd = hGT.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgtEZpvd, "");
        this.OLrzqt = hgtEZpvd;
    }

    public final void setState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
    }

    public final void setSuccessState() {
        android.widget.LinearLayout linearLayout = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
    }

    public final void setFailedState() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
        int i = C52761wXj.TaskDescription.RKcVTr;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(strAYXKKw, 9, C33070mpX.EZpvd(i, context));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=12] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7.equals("200") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7.equals("202") == false) goto L52;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(java.lang.String str) {
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    updatePending$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.dLBcXg), false, 2, null);
                    return;
                }
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                KWHzl(strAYXKKw, 9, C33070mpX.EZpvd(i, context));
                return;
            case 49:
                if (str.equals("1")) {
                    android.widget.LinearLayout linearLayout = this.OLrzqt.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(8);
                    C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                    c55251xgS.setVisibility(8);
                    return;
                }
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i2 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                KWHzl(strAYXKKw2, 9, C33070mpX.EZpvd(i2, context2));
                return;
            case 1445:
                if (str.equals("-2")) {
                    updateTag$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DKr), 11, null, 4, null);
                    return;
                }
                java.lang.String strAYXKKw22 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i22 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context22 = getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "");
                KWHzl(strAYXKKw22, 9, C33070mpX.EZpvd(i22, context22));
                return;
            case 1446:
                if (str.equals("-3")) {
                    updatePending$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.iflRwn), false, 2, null);
                    return;
                }
                java.lang.String strAYXKKw222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context222, "");
                KWHzl(strAYXKKw222, 9, C33070mpX.EZpvd(i222, context222));
                return;
            case 1447:
                if (str.equals("-4")) {
                    updatePending$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.fhwtiV), false, 2, null);
                    return;
                }
                java.lang.String strAYXKKw2222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i2222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context2222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2222, "");
                KWHzl(strAYXKKw2222, 9, C33070mpX.EZpvd(i2222, context2222));
                return;
            case 1567:
                if (str.equals("10")) {
                    updatePending$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DPHsZd), false, 2, null);
                    return;
                }
                java.lang.String strAYXKKw22222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i22222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context22222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context22222, "");
                KWHzl(strAYXKKw22222, 9, C33070mpX.EZpvd(i22222, context22222));
                return;
            case 1568:
                if (str.equals("11")) {
                    updatePending$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.geLlBI), false, 2, null);
                    return;
                }
                java.lang.String strAYXKKw222222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i222222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context222222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context222222, "");
                KWHzl(strAYXKKw222222, 9, C33070mpX.EZpvd(i222222, context222222));
                return;
            case 1569:
                if (str.equals("12")) {
                    copydefault(C33070mpX.AYXKKw(C23274hvD.Fragment.RvdRAu), false);
                    return;
                }
                java.lang.String strAYXKKw2222222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i2222222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context2222222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2222222, "");
                KWHzl(strAYXKKw2222222, 9, C33070mpX.EZpvd(i2222222, context2222222));
                return;
            case 48625:
                if (str.equals("100")) {
                    updateTag$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.aHXSQp), 11, null, 4, null);
                    return;
                }
                java.lang.String strAYXKKw22222222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i22222222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context22222222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context22222222, "");
                KWHzl(strAYXKKw22222222, 9, C33070mpX.EZpvd(i22222222, context22222222));
                return;
            case 49586:
                break;
            case 49587:
                if (str.equals("201")) {
                    copydefault(C33070mpX.AYXKKw(C23274hvD.Fragment.RSDDiY), true);
                    return;
                }
                java.lang.String strAYXKKw222222222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i222222222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context222222222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context222222222, "");
                KWHzl(strAYXKKw222222222, 9, C33070mpX.EZpvd(i222222222, context222222222));
                return;
            case 49588:
                break;
            default:
                java.lang.String strAYXKKw2222222222 = C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY);
                int i2222222222 = C52761wXj.TaskDescription.RKcVTr;
                android.content.Context context2222222222 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2222222222, "");
                KWHzl(strAYXKKw2222222222, 9, C33070mpX.EZpvd(i2222222222, context2222222222));
                return;
        }
        updateTag$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJK), 12, null, 4, null);
    }

    public static /* synthetic */ void updateTag$default(C24254iaP c24254iaP, java.lang.String str, int i, android.graphics.drawable.Drawable drawable, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            drawable = null;
        }
        c24254iaP.KWHzl(str, i, drawable);
    }

    public final void KWHzl(java.lang.String str, int i, android.graphics.drawable.Drawable drawable) {
        android.widget.LinearLayout linearLayout = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(0);
        this.OLrzqt.OLrzqt.setOKDSStyle(i);
        this.OLrzqt.OLrzqt.setText(str);
        this.OLrzqt.OLrzqt.EZpvd();
        this.OLrzqt.OLrzqt.setTagIcon(drawable);
        this.OLrzqt.OLrzqt.setShowIcon(drawable != null);
    }

    public static /* synthetic */ void updatePending$default(C24254iaP c24254iaP, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c24254iaP.copydefault(str, z);
    }

    public final void copydefault(java.lang.String str, boolean z) {
        android.widget.LinearLayout linearLayout = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.widget.ProgressBar progressBar = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        progressBar.setVisibility(z ? 0 : 8);
        C55251xgS c55251xgS = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        this.OLrzqt.AEQbTJ.setText(str);
    }
}
