package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25347iux extends android.widget.LinearLayout {
    public C21616hFz KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25347iux(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25347iux(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25347iux(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void OLrzqt() {
        this.KWHzl = C21616hFz.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
    }

    private final void EZpvd(MevInfoParam mevInfoParam) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        if (!mevInfoParam.AEQbTJ()) {
            C21616hFz c21616hFz = this.KWHzl;
            if (c21616hFz == null || (linearLayoutCompat = c21616hFz.valueOf) == null) {
                return;
            }
            linearLayoutCompat.setVisibility(8);
            return;
        }
        C21616hFz c21616hFz2 = this.KWHzl;
        if (c21616hFz2 != null && (linearLayoutCompat2 = c21616hFz2.valueOf) != null) {
            linearLayoutCompat2.setVisibility(0);
        }
        C21616hFz c21616hFz3 = this.KWHzl;
        if (c21616hFz3 != null) {
            c21616hFz3.EZpvd.setText(mevInfoParam.OLrzqt());
            c21616hFz3.AYXKKw.setText(mevInfoParam.copydefault());
            android.widget.ImageView imageView = c21616hFz3.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadImageWithBorder$default(imageView, mevInfoParam.KWHzl(), null, 2, null);
            android.widget.ImageView imageView2 = c21616hFz3.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25386ivj.loadImageWithBorder$default(imageView2, mevInfoParam.EZpvd(), null, 2, null);
            if (mevInfoParam.djBIcL()) {
                c21616hFz3.copydefault.setImageResource(C52761wXj.TaskDescription.setPageName);
                android.widget.ImageView imageView3 = c21616hFz3.copydefault;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context, C52761wXj.Activity.DcMfJK)));
            } else {
                c21616hFz3.copydefault.setImageResource(C52761wXj.TaskDescription.OijiEz);
                android.widget.ImageView imageView4 = c21616hFz3.copydefault;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                imageView4.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context2, C52761wXj.Activity.DQzvGN)));
            }
            if (mevInfoParam.valueOf()) {
                c21616hFz3.KWHzl.setImageResource(C52761wXj.TaskDescription.setPageName);
                android.widget.ImageView imageView5 = c21616hFz3.KWHzl;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                imageView5.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context3, C52761wXj.Activity.DcMfJK)));
                return;
            }
            c21616hFz3.KWHzl.setImageResource(C52761wXj.TaskDescription.OijiEz);
            android.widget.ImageView imageView6 = c21616hFz3.KWHzl;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            imageView6.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(context4, C52761wXj.Activity.DQzvGN)));
        }
    }

    public final void setData(@NotNull MevInfoParam mevInfoParam) {
        Intrinsics.checkNotNullParameter(mevInfoParam, "");
        setVisibility(0);
        EZpvd(mevInfoParam);
    }
}
