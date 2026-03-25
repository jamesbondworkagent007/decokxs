package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21983hTo extends ConstraintLayout {
    public final C21640hGw OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21983hTo(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.hTo.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C21983hTo(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21983hTo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21640hGw c21640hGwEZpvd = C21640hGw.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21640hGwEZpvd, "");
        this.OLrzqt = c21640hGwEZpvd;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.DbNXlk);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            float dimension = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.AkhnZx, 22.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.fetchVPNInfo, 11.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(C23274hvD.LoaderManager.isConnected, 11.0f);
            KWHzl(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension)));
            copydefault(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension2)));
            OLrzqt(C33129mqd.AhwBna(java.lang.Float.valueOf(dimension3)));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final void KWHzl(int i) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.copydefault.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.OLrzqt.copydefault.setLayoutParams(layoutParams);
    }

    private final void copydefault(int i) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams);
    }

    private final void OLrzqt(int i) {
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.circleRadius = i;
        this.OLrzqt.AEQbTJ.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ void loadLargeImage$default(C21983hTo c21983hTo, java.lang.String str, C25385ivi c25385ivi, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c25385ivi = null;
        }
        c21983hTo.EZpvd(str, c25385ivi);
    }

    public final void EZpvd(@NotNull java.lang.String str, C25385ivi c25385ivi) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        if (c25385ivi == null) {
            int i = C52761wXj.Activity.fZc;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c25385ivi = new C25385ivi(null, null, 0.0f, C25382ivf.copydefault(i, context), 7, null);
        }
        C25386ivj.KWHzl(appCompatImageView, str, c25385ivi);
    }

    public static /* synthetic */ void loadSmallImage$default(C21983hTo c21983hTo, java.lang.String str, C25385ivi c25385ivi, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c25385ivi = null;
        }
        c21983hTo.copydefault(str, c25385ivi);
    }

    public final void copydefault(@NotNull java.lang.String str, C25385ivi c25385ivi) {
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatImageView appCompatImageView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        if (c25385ivi == null) {
            int i = C52761wXj.Activity.fZc;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c25385ivi = new C25385ivi(null, null, 0.0f, C25382ivf.copydefault(i, context), 7, null);
        }
        C25386ivj.KWHzl(appCompatImageView, str, c25385ivi);
    }

    public final AppCompatImageView OLrzqt() {
        AppCompatImageView appCompatImageView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }
}
