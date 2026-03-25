package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ProtocolListAssetItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27356jte extends AbstractC27119jpF<C27370jts, C23762iIj> {
    public final InterfaceC27287jsO KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27356jte(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(ProtocolListAssetItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.KWHzl = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23762iIj c23762iIj, @NotNull C27370jts c27370jts) {
        Intrinsics.checkNotNullParameter(c23762iIj, "");
        Intrinsics.checkNotNullParameter(c27370jts, "");
        c23762iIj.AhwBna.setText(c27370jts.gEmmrt());
        android.widget.TextView textView = c23762iIj.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c27370jts.OLrzqt() ? 0 : 8);
        if (c27370jts.OLrzqt()) {
            c23762iIj.valueOf.setText(C27488jwD.copydefault.KWHzl(c27370jts.KWHzl()));
        }
        C55251xgS c55251xgS = c23762iIj.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27370jts.valueOf()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27370jts.valueOf())) {
            c23762iIj.copydefault.setText(c27370jts.valueOf());
        }
        android.widget.TextView textView2 = c23762iIj.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27370jts.DbNXlk()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27370jts.DbNXlk())) {
            c23762iIj.gEmmrt.setText(C27488jwD.copydefault.KWHzl(c27370jts.isConnected()));
            android.widget.TextView textView3 = c23762iIj.gEmmrt;
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context, c27370jts.DbNXlk(), 0, 2, null));
        }
        c23762iIj.AYXKKw.setText(C27488jwD.copydefault.KWHzl(c27370jts.AuCTel()));
        android.widget.LinearLayout root = c23762iIj.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, c27370jts));
        android.widget.TextView textView4 = c23762iIj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(c27370jts.AhwBna() ? 0 : 8);
        if (c27370jts.AhwBna()) {
            c23762iIj.OLrzqt.setText("/" + c27370jts.copydefault());
        }
    }

    /* JADX INFO: renamed from: o.jte$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C27356jte AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C27370jts KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C27356jte c27356jte, C27370jts c27370jts) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c27356jte;
            this.KWHzl = c27370jts;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.OLrzqt(C27355jtd.KWHzl(this.KWHzl));
            }
        }
    }
}
