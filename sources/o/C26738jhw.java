package o;

import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.TransactionPointsInfoItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26738jhw extends AbstractC27119jpF<C26693jhD, iLV> {
    public C26738jhw() {
        super(TransactionPointsInfoItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iLV ilv, @NotNull C26693jhD c26693jhD) {
        Intrinsics.checkNotNullParameter(ilv, "");
        Intrinsics.checkNotNullParameter(c26693jhD, "");
        ilv.valueOf.setText(c26693jhD.copydefault());
        ilv.AEQbTJ.setText(c26693jhD.AEQbTJ());
        ilv.EZpvd.setText(" " + c26693jhD.KWHzl());
        android.widget.TextView textView = ilv.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strCopydefault = c26693jhD.copydefault();
        textView.setVisibility((strCopydefault == null || strCopydefault.length() <= 0) ? 8 : 0);
        android.widget.TextView textView2 = ilv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        android.widget.TextView textView3 = ilv.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = ilv.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, c26693jhD.OLrzqt(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
    }
}
