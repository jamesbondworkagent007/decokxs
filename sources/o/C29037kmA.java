package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.overview.domain.MemeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29037kmA extends ConstraintLayout {
    public final hFI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29037kmA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:24) call: o.kmA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29037kmA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29037kmA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hFI hfiEZpvd = hFI.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hfiEZpvd, "");
        this.copydefault = hfiEZpvd;
    }

    private final void OLrzqt(float f) {
        if (f == 0.0f) {
            return;
        }
        hFI hfi = this.copydefault;
        int i = C52761wXj.ActionBar.OBJEWx;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hfi.AEQbTJ.setColorFilter(C25382ivf.copydefault(i, context));
        android.view.ViewTreeObserver viewTreeObserver = hfi.AEQbTJ.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new Activity(hfi, f));
        }
    }

    /* JADX INFO: renamed from: o.kmA$Activity */
    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ hFI AEQbTJ;
        public final /* synthetic */ float KWHzl;

        public Activity(hFI hfi, float f) {
            this.AEQbTJ = hfi;
            this.KWHzl = f;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.ViewTreeObserver viewTreeObserver = this.AEQbTJ.AEQbTJ.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int width = this.AEQbTJ.copydefault.getWidth();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.AEQbTJ.getLayoutParams();
            layoutParams.width = java.lang.Math.max((int) ((width * java.lang.Math.min(this.KWHzl, 100.0f)) / 100), C55298xhM.dp2px$default(2.0f, null, 1, null));
            this.AEQbTJ.AEQbTJ.setLayoutParams(layoutParams);
        }
    }

    public final void setData(@NotNull final MemeInfo memeInfo) {
        Intrinsics.checkNotNullParameter(memeInfo, "");
        OLrzqt(C33129mqd.djBIcL(memeInfo.KWHzl()));
        android.widget.TextView textView = this.copydefault.KWHzl;
        java.lang.Float fKWHzl = memeInfo.KWHzl();
        textView.setText(fKWHzl != null ? pTB.formatICUPercent$default(fKWHzl, null, null, null, null, null, 31, null) : null);
        C25352ivB.setOnDoubleCheckClickListener$default(this.copydefault.AYXKKw, 0L, new Function1() { // from class: o.kmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29037kmA.AEQbTJ(this.KWHzl, memeInfo, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C29037kmA c29037kmA, MemeInfo memeInfo, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c29037kmA.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(C23274hvD.Fragment.getMediaId), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatSearchCallback), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("site", memeInfo.AEQbTJ()))), C23274hvD.Fragment.buildRccMetadata);
        }
        return Unit.INSTANCE;
    }
}
