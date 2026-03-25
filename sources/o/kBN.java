package o;

import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.charts.CombinedChart;
import com.okinc.business.market.features.vibes.ui.chart.TrendPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes23.dex */
public final class kBN {
    public final java.util.List<android.view.View> AEQbTJ;
    public final CombinedChart EZpvd;
    public final android.content.Context OLrzqt;
    public android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        this.copydefault = frameLayout;
    }

    public kBN(@NotNull android.content.Context context, @NotNull CombinedChart combinedChart) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(combinedChart, "");
        this.OLrzqt = context;
        this.EZpvd = combinedChart;
        this.AEQbTJ = new java.util.ArrayList();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void KWHzl(@NotNull java.util.List<kAU> list, double d, double d2, @NotNull TrendPosition trendPosition, @NotNull Function1<? super java.util.List<kAU>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trendPosition, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.widget.FrameLayout frameLayout = this.copydefault;
        if (frameLayout == 0) {
            return;
        }
        android.view.View viewCopydefault = null;
        int iDp2px$default = C55298xhM.dp2px$default(20.0f, null, 1, null);
        int iDp2px$default2 = trendPosition == TrendPosition.ABOVE ? (-iDp2px$default) - C55298xhM.dp2px$default(8.0f, null, 1, null) : C55298xhM.dp2px$default(8.0f, null, 1, null);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.OLrzqt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) (d - ((double) (iDp2px$default / 2)));
        layoutParams.topMargin = (int) (d2 + ((double) iDp2px$default2));
        frameLayout2.setLayoutParams(layoutParams);
        if (list.size() == 1) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.OLrzqt);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(iDp2px$default, iDp2px$default));
            C25386ivj.KWHzl(imageView, ((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).EZpvd(), new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.KWHzl), null, 1.0f, C25382ivf.KWHzl(C52761wXj.Activity.QKudOq), 2, null));
            frameLayout2.addView(imageView);
        } else {
            int iAEQbTJ = ((kAU) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).AEQbTJ();
            if (iAEQbTJ > 2) {
                viewCopydefault = kBL.copydefault(this.OLrzqt, Marker.ANY_NON_NULL_MARKER + (iAEQbTJ - 2), true, iDp2px$default, true);
            }
            android.view.View view = viewCopydefault;
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 2);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(((kAU) it.next()).EZpvd());
            }
            float f = iDp2px$default;
            kLW.copydefault(frameLayout2, arrayList, new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.KWHzl), null, 1.0f, C25382ivf.KWHzl(C52761wXj.Activity.QKudOq), 2, null), f / this.OLrzqt.getResources().getDisplayMetrics().density, (f / this.OLrzqt.getResources().getDisplayMetrics().density) * 0.6f, view);
        }
        frameLayout2.setOnClickListener(new StateListAnimator(frameLayout2, 1000L, function1, list));
        frameLayout.addView(frameLayout2);
        this.AEQbTJ.add(frameLayout2);
    }

    public final void AEQbTJ() {
        android.widget.FrameLayout frameLayout = this.copydefault;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final void KWHzl() {
        android.widget.FrameLayout frameLayout = this.copydefault;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void OLrzqt() {
        for (android.view.View view : this.AEQbTJ) {
            android.widget.FrameLayout frameLayout = this.copydefault;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
        }
        this.AEQbTJ.clear();
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.util.List OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, java.util.List list) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = function1;
            this.OLrzqt = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke(this.OLrzqt);
            }
        }
    }
}
