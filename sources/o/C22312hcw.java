package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.widget.SimpleNetworkFeeParam;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22312hcw extends android.widget.FrameLayout {
    public SimpleNetworkFeeParam AEQbTJ;
    public hFK KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22312hcw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22312hcw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22312hcw(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setData(@NotNull SimpleNetworkFeeParam simpleNetworkFeeParam) {
        Intrinsics.checkNotNullParameter(simpleNetworkFeeParam, "");
        this.AEQbTJ = simpleNetworkFeeParam;
        hFK hfk = this.KWHzl;
        if (hfk != null) {
            hfk.AEQbTJ.setTitle(simpleNetworkFeeParam.copydefault());
            hfk.KWHzl.setText(simpleNetworkFeeParam.KWHzl().length() == 0 ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, simpleNetworkFeeParam.KWHzl(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        }
    }

    public final void AEQbTJ() {
        hFK hfkAEQbTJ = hFK.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        this.KWHzl = hfkAEQbTJ;
        if (hfkAEQbTJ != null) {
            int iDpInt$default = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            hfkAEQbTJ.AEQbTJ.setPadding(iDpInt$default, hfkAEQbTJ.AEQbTJ.getPaddingTop(), iDpInt$default, hfkAEQbTJ.AEQbTJ.getPaddingBottom());
        }
    }
}
