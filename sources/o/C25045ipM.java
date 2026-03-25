package o;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ipM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25045ipM extends android.widget.FrameLayout {
    public hBO AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25045ipM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25045ipM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25045ipM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25045ipM(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AEQbTJ() {
        C33603mza c33603mza;
        C31699mAq c31699mAqEZpvd;
        LottieAnimationView lottieAnimationViewCopydefault;
        if (getContext() == null) {
            return;
        }
        hBO hboOLrzqt = hBO.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        this.AEQbTJ = hboOLrzqt;
        if (hboOLrzqt == null || (c33603mza = hboOLrzqt.OLrzqt) == null || (c31699mAqEZpvd = c33603mza.EZpvd()) == null || (lottieAnimationViewCopydefault = c31699mAqEZpvd.copydefault()) == null) {
            return;
        }
        lottieAnimationViewCopydefault.setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    public final C33546myW copydefault() {
        hBO hbo = this.AEQbTJ;
        if (hbo != null) {
            return hbo.copydefault;
        }
        return null;
    }

    public final android.widget.FrameLayout AYXKKw() {
        hBO hbo = this.AEQbTJ;
        if (hbo != null) {
            return hbo.gEmmrt;
        }
        return null;
    }

    public final C25248itD OLrzqt() {
        hBO hbo = this.AEQbTJ;
        if (hbo != null) {
            return hbo.AYXKKw;
        }
        return null;
    }

    public final RecyclerView EZpvd() {
        hBO hbo = this.AEQbTJ;
        if (hbo != null) {
            return hbo.EZpvd;
        }
        return null;
    }

    public final android.view.View KWHzl() {
        hBO hbo = this.AEQbTJ;
        if (hbo != null) {
            return hbo.AEQbTJ;
        }
        return null;
    }
}
