package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jEL extends kMD<jEP> {
    public final Function1<jEP, Unit> AEQbTJ;
    public final Function1<jEP, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEP, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEP, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jEL(@NotNull Function1<? super jEP, Unit> function1, @NotNull Function1<? super jEP, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.AEQbTJ = function12;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCA hcaKWHzl = hCA.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcaKWHzl, "");
        return hcaKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull jEP jep) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(jep, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hCA hca = viewBindingAEQbTJ instanceof hCA ? (hCA) viewBindingAEQbTJ : null;
        if (hca == null) {
            return;
        }
        android.widget.TextView textView = hca.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, jep.AYXKKw(), jep.AEQbTJ(), C52761wXj.Activity.fdOvFl);
        hca.AYXKKw.setText(jep.values());
        hca.DbNXlk.setText(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, jep.copydefault(), true, null, false, null, null, 30, null));
        AppCompatImageView appCompatImageView = hca.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C25386ivj.loadCircleImage$default(appCompatImageView, jep.valueOf(), false, 2, null);
        hca.gEmmrt.setText(jep.djBIcL());
        android.widget.TextView textView2 = hca.gEmmrt;
        android.content.Context context = hca.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView2.setTextColor(copydefault(context, jep.isConnected()));
        hca.AhwBna.setText(jep.fetchVPNInfo());
        ShapeableImageView shapeableImageView = hca.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C25386ivj.loadWalletProfileImage$default(shapeableImageView, jep.AhwBna(), jep.EZpvd(), jep.KWHzl(), 0.0f, 8, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) jep.DbNXlk())) {
            AppCompatImageView appCompatImageView2 = hca.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            AppCompatImageView appCompatImageView3 = hca.AEQbTJ;
            appCompatImageView3.setOnClickListener(new Activity(appCompatImageView3, 1000L, this, hca, jep));
        } else {
            AppCompatImageView appCompatImageView4 = hca.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
            appCompatImageView4.setVisibility(8);
        }
        if (jep.gEmmrt()) {
            hca.EZpvd.setImageResource(C52761wXj.TaskDescription.addPreRequisiteCollector);
            hca.EZpvd.setColorFilter(hca.getRoot().getContext().getColor(C52761wXj.Activity.gdmIOq));
        } else {
            hca.EZpvd.setImageResource(C52761wXj.TaskDescription.invokespecialhrnhsO);
            hca.EZpvd.setColorFilter(hca.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl));
        }
        ConstraintLayout root = hca.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, jep));
        AppCompatImageView appCompatImageView5 = hca.EZpvd;
        appCompatImageView5.setOnClickListener(new ActionBar(appCompatImageView5, 1000L, this, jep));
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str) {
        java.lang.String message;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            context.startActivity(intent);
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }

    private final int copydefault(android.content.Context context, int i) {
        if (i == -1) {
            return context.getColor(C52761wXj.Activity.ONJgbh);
        }
        if (i == 1) {
            return context.getColor(C52761wXj.Activity.RWIpjU);
        }
        return context.getColor(C52761wXj.Activity.Dmq);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ jEP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jEL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, jEL jel, jEP jep) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = jel;
            this.EZpvd = jep;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.invoke(this.EZpvd);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jEL KWHzl;
        public final /* synthetic */ hCA OLrzqt;
        public final /* synthetic */ jEP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, jEL jel, hCA hca, jEP jep) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = jel;
            this.OLrzqt = hca;
            this.copydefault = jep;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jEL jel = this.KWHzl;
                android.content.Context context = this.OLrzqt.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strDbNXlk = this.copydefault.DbNXlk();
                jel.AEQbTJ(context, strDbNXlk != null ? strDbNXlk : "");
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jEL KWHzl;
        public final /* synthetic */ jEP OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jEL jel, jEP jep) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = jel;
            this.OLrzqt = jep;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.copydefault.invoke(this.OLrzqt);
            }
        }
    }
}
