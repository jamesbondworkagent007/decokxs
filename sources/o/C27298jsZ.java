package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.DualTokenItemBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27298jsZ extends AbstractC27119jpF<C27372jtu, C23758iIf> {
    public final InterfaceC27287jsO EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27298jsZ(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(DualTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.EZpvd = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23758iIf c23758iIf, @NotNull C27372jtu c27372jtu) {
        Intrinsics.checkNotNullParameter(c23758iIf, "");
        Intrinsics.checkNotNullParameter(c27372jtu, "");
        android.content.Context context = c23758iIf.getRoot().getContext();
        c23758iIf.gEmmrt.setText(c27372jtu.EZpvd());
        c23758iIf.AYXKKw.setText(c27372jtu.DbNXlk());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Intrinsics.copydefault(context);
        c27569jxf.EZpvd(context, c23758iIf.AEQbTJ, new InvestLogo(c27372jtu.values(), c27372jtu.AuCTel(), (java.util.List) null, (java.util.List) null, 12, (DefaultConstructorMarker) null), C25493ixk.TaskDescription.OLrzqt, 0.1f);
        android.widget.TextView textView = c23758iIf.djBIcL;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView.setText(c27488jwD.KWHzl(c27372jtu.gEmmrt()));
        android.widget.TextView textView2 = c23758iIf.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27372jtu.fetchVPNInfo()) ? 0 : 8);
        c23758iIf.AhwBna.setText(c27488jwD.KWHzl(c27372jtu.isConnected()));
        android.widget.TextView textView3 = c23758iIf.AhwBna;
        android.content.Context context2 = textView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context2, c27372jtu.fetchVPNInfo(), 0, 2, null));
        android.widget.TextView textView4 = c23758iIf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) c27372jtu.AhwBna()) && C33129mqd.AEQbTJ(c27372jtu.AhwBna(), "0")) ? 0 : 8);
        c23758iIf.EZpvd.setText("/" + c27372jtu.djBIcL());
        ConstraintLayout root = c23758iIf.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c27372jtu));
    }

    /* JADX INFO: renamed from: o.jsZ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27298jsZ AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C27372jtu KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27298jsZ c27298jsZ, C27372jtu c27372jtu) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c27298jsZ;
            this.KWHzl = c27372jtu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.OLrzqt(C27360jti.OLrzqt(this.KWHzl));
            }
        }
    }
}
