package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52835waC extends ConstraintLayout {
    public final AbstractC50813vbI EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52835waC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52835waC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.waC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52835waC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52835waC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = (AbstractC50813vbI) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.DGgkXd, this, true);
        EZpvd();
        OLrzqt();
    }

    private final void EZpvd() {
        Glide.AEQbTJ(getContext()).EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ICustomTabsCallback)).EZpvd((android.widget.ImageView) this.EZpvd.KWHzl);
    }

    private final void OLrzqt() {
        android.widget.ImageView imageView = this.EZpvd.AEQbTJ;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        AppCompatTextView appCompatTextView = this.EZpvd.OLrzqt;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.waC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52835waC EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52835waC c52835waC) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c52835waC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(this.EZpvd), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.extraCallback))), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.waC$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52835waC OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52835waC c52835waC) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c52835waC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C43056riA c43056riA = C43056riA.AEQbTJ;
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("url", C33070mpX.AYXKKw(C55688xof.Application.onPostMessage));
                linkedHashMap.put("theme", "dark");
                Unit unit = Unit.INSTANCE;
                c43056riA.copydefault(context, "okluatradingeco", "/video", C56424yEw.values(linkedHashMap));
            }
        }
    }
}
