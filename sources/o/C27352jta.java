package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.BorrowTokenItemBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27352jta extends AbstractC27119jpF<C27367jtp, C23761iIi> {
    public final InterfaceC27287jsO OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27352jta(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(BorrowTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.OLrzqt = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23761iIi c23761iIi, @NotNull C27367jtp c27367jtp) {
        Intrinsics.checkNotNullParameter(c23761iIi, "");
        Intrinsics.checkNotNullParameter(c27367jtp, "");
        c23761iIi.djBIcL.setText(c27367jtp.EZpvd());
        c23761iIi.AYXKKw.setText(c27367jtp.DbNXlk());
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c23761iIi.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27538jxA.KWHzl(context, c23761iIi.OLrzqt, new InvestmentLogoData(C56402yEa.EZpvd(c27367jtp.values()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, c27367jtp.AhwBna(), 14, (DefaultConstructorMarker) null), 32.0f, 16.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.zuBGHE, (96 & 64) != 0 ? 1.0f : 0.0f);
        android.widget.TextView textView = c23761iIi.gEmmrt;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView.setText(c27488jwD.KWHzl(c27367jtp.djBIcL()));
        android.widget.TextView textView2 = c23761iIi.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27367jtp.fetchVPNInfo()) ? 0 : 8);
        c23761iIi.AhwBna.setText(c27488jwD.KWHzl(c27367jtp.isConnected()));
        android.widget.TextView textView3 = c23761iIi.AhwBna;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = textView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context2, c27367jtp.fetchVPNInfo(), 0, 2, null));
        C27127jpN c27127jpN = c23761iIi.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27127jpN, "");
        c27127jpN.setVisibility(c27367jtp.gEmmrt() != null ? 0 : 8);
        if (c27367jtp.gEmmrt() != null) {
            C27127jpN c27127jpN2 = c23761iIi.copydefault;
            Intrinsics.checkNotNullExpressionValue(c27127jpN2, "");
            c27127jpN2.setVisibility(0);
            c23761iIi.copydefault.setHealthRate(c27367jtp.gEmmrt().getLevel(), c27367jtp.gEmmrt().getRate());
        }
        ConstraintLayout root = c23761iIi.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c27367jtp));
    }

    /* JADX INFO: renamed from: o.jta$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C27352jta KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C27367jtp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C27352jta c27352jta, C27367jtp c27367jtp) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c27352jta;
            this.copydefault = c27367jtp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.OLrzqt(C27360jti.OLrzqt(this.copydefault));
            }
        }
    }
}
