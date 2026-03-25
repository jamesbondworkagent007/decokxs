package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31222lpu extends android.widget.FrameLayout {
    public AppCompatImageView EZpvd;
    public AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31222lpu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31222lpu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.lpu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C31222lpu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31222lpu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    public final void OLrzqt() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.znKlvJ, (android.view.ViewGroup) this, true);
        this.copydefault = (AppCompatImageView) findViewById(C23274hvD.Application.setMediaId);
        this.EZpvd = (AppCompatImageView) findViewById(C23274hvD.Application.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner2);
    }

    public final void copydefault(java.lang.String str) {
        AppCompatImageView appCompatImageView = this.copydefault;
        if (appCompatImageView != null) {
            C25386ivj.KWHzl(appCompatImageView, str);
        }
    }

    public final void EZpvd(java.lang.String str) {
        AppCompatImageView appCompatImageView = this.EZpvd;
        if (appCompatImageView != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(appCompatImageView.getContext()).EZpvd(str);
            android.content.Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C31220lps(context, 1.0f, ContextCompat.getColor(appCompatImageView.getContext(), C52761wXj.Activity.hOMIpD))).copydefault(AbstractC5360Os.copydefault).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(C57406yhn.Activity.QKVWgx).copydefault(C57406yhn.Activity.QKVWgx)).EZpvd((android.widget.ImageView) appCompatImageView);
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(str);
        EZpvd(str2);
    }
}
