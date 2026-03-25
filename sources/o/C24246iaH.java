package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24246iaH extends ConstraintLayout {
    public Function0<Unit> AEQbTJ;
    public final hGI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24246iaH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnNetworkClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:18) call: o.iaH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C24246iaH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24246iaH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGI hgiOLrzqt = hGI.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgiOLrzqt, "");
        this.OLrzqt = hgiOLrzqt;
        OLrzqt();
    }

    private final void OLrzqt() {
        if (!isInEditMode()) {
            setPadding(getPaddingLeft(), C33570myu.OLrzqt(), getPaddingRight(), getPaddingBottom());
        }
        C25352ivB.setOnDoubleCheckClickListener$default(this.OLrzqt.EZpvd, 0L, new Function1() { // from class: o.iaK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24246iaH.copydefault(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(this.OLrzqt.AEQbTJ, 0L, new Function1() { // from class: o.iaL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24246iaH.EZpvd(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(C24246iaH c24246iaH, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c24246iaH.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24246iaH c24246iaH, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c24246iaH.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            this.OLrzqt.AEQbTJ.setImageResource(C52761wXj.TaskDescription.createSocket);
            AppCompatImageView appCompatImageView = this.OLrzqt.AEQbTJ;
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatImageView.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.copydefault(i, context)));
            return;
        }
        AppCompatImageView appCompatImageView2 = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        C25386ivj.KWHzl(appCompatImageView2, str, new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
        this.OLrzqt.AEQbTJ.setImageTintList(null);
    }
}
