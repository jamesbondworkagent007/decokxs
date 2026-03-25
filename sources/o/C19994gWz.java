package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19994gWz extends AbstractC31189lpN<gWC, C21554hDr> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21554hDr KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21554hDr c21554hDrOLrzqt = C21554hDr.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21554hDrOLrzqt, "");
        return c21554hDrOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21554hDr c21554hDr, @NotNull gWC gwc) {
        Intrinsics.checkNotNullParameter(c21554hDr, "");
        Intrinsics.checkNotNullParameter(gwc, "");
        gWH gwh = c21554hDr.djBIcL;
        Intrinsics.checkNotNullExpressionValue(gwh, "");
        gwh.setVisibility(gwc.KWHzl().isEmpty() ^ true ? 0 : 8);
        android.view.View view = c21554hDr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(gwc.KWHzl().isEmpty() ^ true ? 0 : 8);
        c21554hDr.djBIcL.setData(gwc.KWHzl());
        C52794wYp c52794wYp = c21554hDr.KWHzl;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L));
        gWH gwh2 = c21554hDr.djBIcL;
        gwh2.setOnClickListener(new ActionBar(gwh2, 1000L));
        AppCompatImageView appCompatImageView = c21554hDr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C22361hds.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.WalletStrategyEmpty);
    }

    /* JADX INFO: renamed from: o.gWz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                gWH gwh = (gWH) this.AEQbTJ;
                gKN gkn = (gKN) C43251rlk.copydefault(gKN.class);
                android.content.Context context = gwh.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                gkn.AEQbTJ(context);
            }
        }
    }

    /* JADX INFO: renamed from: o.gWz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j) {
            this.copydefault = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.copydefault;
                gKN gkn = (gKN) C43251rlk.copydefault(gKN.class);
                android.content.Context context = c52794wYp.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                gkn.AEQbTJ(context);
            }
        }
    }
}
