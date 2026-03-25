package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.okinc.business.market.widget.asset_card.DexAssetContentBlock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28016kLu extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28016kLu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28016kLu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: o.kLu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28016kLu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28016kLu(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28016kLu.EZpvd(context, this);
            }
        });
    }

    private final hEF KWHzl() {
        return (hEF) this.EZpvd.getValue();
    }

    public static final hEF EZpvd(android.content.Context context, C28016kLu c28016kLu) {
        return hEF.EZpvd(android.view.LayoutInflater.from(context), c28016kLu, true);
    }

    public final void setData(@NotNull DexAssetContentBlock.ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "");
        hEF hefKWHzl = KWHzl();
        hefKWHzl.copydefault.setColorFilter(progressBar.KWHzl());
        android.view.ViewTreeObserver viewTreeObserver = hefKWHzl.copydefault.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new Activity(hefKWHzl, progressBar));
        }
    }

    /* JADX INFO: renamed from: o.kLu$Activity */
    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ DexAssetContentBlock.ProgressBar OLrzqt;
        public final /* synthetic */ hEF copydefault;

        public Activity(hEF hef, DexAssetContentBlock.ProgressBar progressBar) {
            this.copydefault = hef;
            this.OLrzqt = progressBar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.ViewTreeObserver viewTreeObserver = this.copydefault.copydefault.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int width = this.copydefault.KWHzl.getWidth();
            float fAEQbTJ = this.OLrzqt.EZpvd() != 0.0f ? this.OLrzqt.AEQbTJ() / this.OLrzqt.EZpvd() : 0.0f;
            ViewGroup.LayoutParams layoutParams = this.copydefault.copydefault.getLayoutParams();
            layoutParams.width = (int) (width * fAEQbTJ);
            this.copydefault.copydefault.setLayoutParams(layoutParams);
        }
    }
}
