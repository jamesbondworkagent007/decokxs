package o;

import com.okinc.business.invest_biz.ui.screens.home.PointsListItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26506jdc extends AbstractC27118jpE<C26449jcY, C23797iJr> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.jpG, java.lang.Object] */
    @Override // o.AbstractC27118jpE
    public /* synthetic */ void OLrzqt(C27120jpG c27120jpG, C26449jcY c26449jcY) {
        copydefault((C27120jpG<C23797iJr>) c27120jpG, c26449jcY);
    }

    public C26506jdc() {
        super(PointsListItemBinder$1.INSTANCE);
    }

    public void copydefault(@NotNull C27120jpG<C23797iJr> c27120jpG, @NotNull C26449jcY c26449jcY) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(c26449jcY, "");
        KWHzl((C23797iJr) c27120jpG.KWHzl(), c26449jcY);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27118jpE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23797iJr c23797iJr, @NotNull C26449jcY c26449jcY) {
        Intrinsics.checkNotNullParameter(c23797iJr, "");
        Intrinsics.checkNotNullParameter(c26449jcY, "");
        c23797iJr.AEQbTJ.setText(c26449jcY.OLrzqt());
        c23797iJr.KWHzl.setText(c26449jcY.AEQbTJ());
        if (c26449jcY.EZpvd() != null) {
            android.widget.TextView textView = c23797iJr.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            c23797iJr.copydefault.setText(c26449jcY.EZpvd());
        } else if (c26449jcY.KWHzl()) {
            c23797iJr.copydefault.setVisibility(4);
        }
        android.view.View view = c23797iJr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(c26449jcY.copydefault() ^ true ? 0 : 8);
    }
}
