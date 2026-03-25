package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.screens.token.DefiRecommendMoreBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26627jfr extends AbstractC27119jpF<C26625jfp, C23805iJz> {
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26627jfr(@NotNull Function0<Unit> function0) {
        super(DefiRecommendMoreBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23805iJz c23805iJz, @NotNull C26625jfp c26625jfp) {
        Intrinsics.checkNotNullParameter(c23805iJz, "");
        Intrinsics.checkNotNullParameter(c26625jfp, "");
        if (c26625jfp.EZpvd()) {
            c23805iJz.AEQbTJ.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.dvKsVJ));
            c23805iJz.EZpvd.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        } else {
            c23805iJz.AEQbTJ.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.dxcTrN));
            c23805iJz.EZpvd.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        }
        android.widget.LinearLayout root = c23805iJz.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this));
    }

    /* JADX INFO: renamed from: o.jfr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C26627jfr AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26627jfr c26627jfr) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c26627jfr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd().invoke();
            }
        }
    }
}
