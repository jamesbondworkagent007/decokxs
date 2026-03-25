package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.invest_biz.data.bean.HomeTab;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26450jcZ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int KWHzl(int i) {
        return i != 1 ? i != 3 ? i != 5 ? i != 13 ? C52761wXj.TaskDescription.gdmIOq : C52761wXj.TaskDescription.pause : C25493ixk.StateListAnimator.sSMYrx : C52761wXj.TaskDescription.getUserContextRegisteredStatus : C52761wXj.TaskDescription.fGQ;
    }

    public static final void OLrzqt(@NotNull iHB ihb, @NotNull android.content.Context context, @NotNull java.util.List<HomeTab> list) {
        Intrinsics.checkNotNullParameter(ihb, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        ihb.OLrzqt.OLrzqt.removeAllViews();
        for (HomeTab homeTab : list) {
            android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C25493ixk.Activity.RcXXUw, (android.view.ViewGroup) ihb.OLrzqt.OLrzqt, false);
            ((android.widget.TextView) viewInflate.findViewById(C25493ixk.ActionBar.getSmallIconBitmap)).setText(homeTab.OLrzqt());
            android.view.View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.putInt);
            viewFindViewById.setOnClickListener(new StateListAnimator(viewFindViewById, 1000L, context, homeTab));
            android.view.View viewFindViewById2 = viewInflate.findViewById(C25493ixk.ActionBar.hbZCHz);
            Intrinsics.copydefault(viewFindViewById2, "");
            ((android.widget.ImageView) viewFindViewById2).setImageResource(KWHzl(homeTab.AEQbTJ()));
            ihb.OLrzqt.OLrzqt.addView(viewInflate);
        }
    }

    /* JADX INFO: renamed from: o.jcZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ HomeTab KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.content.Context context, HomeTab homeTab) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = context;
            this.KWHzl = homeTab;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.AEQbTJ;
                android.content.Context context = this.EZpvd;
                android.content.Intent intent = new android.content.Intent(linearLayoutCompat.getContext(), (java.lang.Class<?>) ActivityC24156iWz.class);
                intent.putExtra("aggregate_tab_id", this.KWHzl.AEQbTJ());
                context.startActivity(intent);
            }
        }
    }
}
