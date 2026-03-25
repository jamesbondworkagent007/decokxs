package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.SingleTokenItemBinder$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27358jtg extends AbstractC27119jpF<C27377jtz, C23764iIl> {
    public final InterfaceC27287jsO copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27358jtg(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(SingleTokenItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.copydefault = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull C23764iIl c23764iIl, @NotNull C27377jtz c27377jtz) {
        Intrinsics.checkNotNullParameter(c23764iIl, "");
        Intrinsics.checkNotNullParameter(c27377jtz, "");
        c23764iIl.valueOf.setText(c27377jtz.EZpvd());
        c23764iIl.djBIcL.setText(c27377jtz.DbNXlk());
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c23764iIl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27538jxA.KWHzl(context, c23764iIl.AEQbTJ, new InvestmentLogoData(C56402yEa.EZpvd(c27377jtz.AhwBna()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, c27377jtz.djBIcL(), 14, (DefaultConstructorMarker) null), 32.0f, 16.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.zuBGHE, (96 & 64) != 0 ? 1.0f : 0.0f);
        android.widget.TextView textView = c23764iIl.KWHzl;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView.setText(c27488jwD.KWHzl(c27377jtz.gEmmrt()));
        android.widget.TextView textView2 = c23764iIl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c27377jtz.fetchVPNInfo()) ? 0 : 8);
        c23764iIl.OLrzqt.setText(c27488jwD.KWHzl(c27377jtz.isConnected()));
        android.widget.TextView textView3 = c23764iIl.OLrzqt;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context2 = textView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView3.setTextColor(C27569jxf.getAssetColor$default(c27569jxf, context2, c27377jtz.fetchVPNInfo(), 0, 2, null));
        ConstraintLayout root = c23764iIl.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c27377jtz));
    }

    /* JADX INFO: renamed from: o.jtg$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C27377jtz OLrzqt;
        public final /* synthetic */ C27358jtg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C27358jtg c27358jtg, C27377jtz c27377jtz) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c27358jtg;
            this.OLrzqt = c27377jtz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault.OLrzqt(C27360jti.OLrzqt(this.OLrzqt));
            }
        }
    }
}
