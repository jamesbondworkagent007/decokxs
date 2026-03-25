package o;

import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.TotalAssetItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27366jto extends AbstractC27119jpF<C27326jtA, C23770iIr> {
    public C27366jto() {
        super(TotalAssetItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23770iIr c23770iIr, @NotNull C27326jtA c27326jtA) {
        Intrinsics.checkNotNullParameter(c23770iIr, "");
        Intrinsics.checkNotNullParameter(c27326jtA, "");
        android.widget.TextView textView = c23770iIr.valueOf;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView.setText(c27488jwD.KWHzl(c27326jtA.EZpvd()));
        android.widget.LinearLayout linearLayout = c23770iIr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(c27326jtA.KWHzl() ? 0 : 8);
        if (c27326jtA.KWHzl()) {
            c23770iIr.AhwBna.setText(c27488jwD.KWHzl(c27326jtA.AEQbTJ()));
            android.widget.TextView textView2 = c23770iIr.AhwBna;
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strValueOf = c27326jtA.valueOf();
            textView2.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context, strValueOf == null ? "0" : strValueOf, 0, 2, null));
            c23770iIr.AEQbTJ.setText(c27488jwD.KWHzl(c27326jtA.OLrzqt()));
            android.widget.TextView textView3 = c23770iIr.AEQbTJ;
            android.content.Context context2 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            java.lang.String strCopydefault = c27326jtA.copydefault();
            textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context2, strCopydefault == null ? "0" : strCopydefault, 0, 2, null));
        }
    }
}
