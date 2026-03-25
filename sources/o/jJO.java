package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jJO extends AbstractC40510qYn<C25907jKu, C42876reg> {
    public final android.content.Context OLrzqt;

    public jJO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42876reg AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42876reg c42876regOLrzqt = C42876reg.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42876regOLrzqt, "");
        return c42876regOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42876reg c42876reg, int i, @NotNull C25907jKu c25907jKu) {
        Intrinsics.checkNotNullParameter(c42876reg, "");
        Intrinsics.checkNotNullParameter(c25907jKu, "");
        c42876reg.djBIcL.setText(c25907jKu.EZpvd());
        AppCompatTextView appCompatTextView = c42876reg.KWHzl;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(c25907jKu.AEQbTJ());
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        C38307pTy.Application application = C38307pTy.Companion;
        appCompatTextView.setText(pTB.formatICUPercent$default(bigDecimalEZpvd, roundingMode, application.EZpvd(4), null, java.lang.Double.valueOf(100.0d), null, 20, null));
        c42876reg.copydefault.setText(pTB.formatICUCompact$default(C33129mqd.EZpvd(c25907jKu.OLrzqt()), roundingMode, application.EZpvd(8), DisplaySign.EXCEPT_ZERO, null, 8, null) + " " + c25907jKu.KWHzl());
        AppCompatImageView appCompatImageView = c42876reg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.AEQbTJ(appCompatImageView, c25907jKu.copydefault());
        c42876reg.copydefault.setTextColor(C25906jKt.EZpvd(c25907jKu.OLrzqt(), this.OLrzqt));
    }
}
