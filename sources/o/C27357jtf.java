package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ProtocolListBorrowItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27357jtf extends AbstractC27119jpF<C27368jtq, C23763iIk> {
    public final InterfaceC27287jsO copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27357jtf(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(ProtocolListBorrowItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.copydefault = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23763iIk c23763iIk, @NotNull C27368jtq c27368jtq) {
        Intrinsics.checkNotNullParameter(c23763iIk, "");
        Intrinsics.checkNotNullParameter(c27368jtq, "");
        c23763iIk.djBIcL.setText(c27368jtq.gEmmrt());
        android.widget.TextView textView = c23763iIk.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27368jtq.EZpvd()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27368jtq.EZpvd())) {
            c23763iIk.AhwBna.setText(C27488jwD.copydefault.KWHzl(c27368jtq.KWHzl()));
        }
        C27127jpN c27127jpN = c23763iIk.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27127jpN, "");
        c27127jpN.setVisibility(c27368jtq.copydefault() != null ? 0 : 8);
        if (c27368jtq.copydefault() != null) {
            c23763iIk.copydefault.setHealthRate(c27368jtq.copydefault().copydefault(), c27368jtq.copydefault().KWHzl());
        }
        android.widget.TextView textView2 = c23763iIk.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27368jtq.DbNXlk()) ? 0 : 8);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c27368jtq.DbNXlk())) {
            c23763iIk.gEmmrt.setText(C27488jwD.copydefault.KWHzl(c27368jtq.isConnected()));
            android.widget.TextView textView3 = c23763iIk.gEmmrt;
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context, c27368jtq.DbNXlk(), 0, 2, null));
        }
        c23763iIk.AYXKKw.setText(C27488jwD.copydefault.KWHzl(c27368jtq.AuCTel()));
        android.widget.LinearLayout root = c23763iIk.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c27368jtq));
    }

    /* JADX INFO: renamed from: o.jtf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27357jtf AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C27368jtq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27357jtf c27357jtf, C27368jtq c27368jtq) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c27357jtf;
            this.OLrzqt = c27368jtq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.OLrzqt(C27355jtd.KWHzl(this.OLrzqt));
            }
        }
    }
}
