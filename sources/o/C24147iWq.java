package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsTitleBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24147iWq extends AbstractC27119jpF<iVX.Dialog, iIW> {
    public static final C24147iWq EZpvd = new C24147iWq();

    private C24147iWq() {
        super(InvestOrderDetailsTitleBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIW iiw, @NotNull iVX.Dialog dialog) {
        Intrinsics.checkNotNullParameter(iiw, "");
        Intrinsics.checkNotNullParameter(dialog, "");
        android.content.Context context = iiw.getRoot().getContext();
        iiw.KWHzl.setText(dialog.OLrzqt());
        java.lang.String strAEQbTJ = dialog.AEQbTJ();
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            Intrinsics.copydefault(context);
            iiw.KWHzl.setCompoundDrawablesRelative(null, null, C27569jxf.loadDrawable$default(c27569jxf, context, C52761wXj.TaskDescription.GGlJim, 0, 0, C55298xhM.OLrzqt(14, context), C55298xhM.OLrzqt(14, context), 12, null), null);
            android.widget.TextView textView = iiw.KWHzl;
            textView.setOnClickListener(new Activity(textView, 1000L, context, dialog));
            return;
        }
        iiw.KWHzl.setCompoundDrawablesRelative(null, null, null, null);
        iiw.KWHzl.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: o.iWq$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ iVX.Dialog copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.content.Context context, iVX.Dialog dialog) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = context;
            this.copydefault = dialog;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Intrinsics.copydefault(this.EZpvd);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.EZpvd);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.AEQbTJ());
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.svY, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
