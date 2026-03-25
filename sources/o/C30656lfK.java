package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedAboutInfoBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30656lfK extends AbstractC25436iwg<C30657lfL, hHC> {
    public C30656lfK() {
        super(AdvancedAboutInfoBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHC> c25435iwf, @NotNull C30657lfL c30657lfL) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c30657lfL, "");
        hHC hhc = (hHC) c25435iwf.EZpvd();
        AppCompatTextView appCompatTextView = hhc.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c30657lfL.EZpvd()) ? 0 : 8);
        hhc.KWHzl.setText(c30657lfL.EZpvd());
        AppCompatTextView appCompatTextView2 = hhc.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c30657lfL.OLrzqt()) ? 0 : 8);
        hhc.copydefault.setText(c30657lfL.OLrzqt());
    }
}
