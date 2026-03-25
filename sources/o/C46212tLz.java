package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_performance.data.ProfileChartDto;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46212tLz extends AbstractC43310rmq<ProfileChartDto, tOL> {
    public final Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46212tLz() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.DaRZkR;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:21) call: o.tLz.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C46212tLz(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C46212tLz(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tOL> c43312rms, @NotNull ProfileChartDto profileChartDto) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(profileChartDto, "");
        super.onBindViewHolder((C43312rms) c43312rms, profileChartDto);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        int itemCount = bindingAdapter != null ? bindingAdapter.getItemCount() : 0;
        ViewGroup.LayoutParams layoutParams = c43312rms.itemView.getLayoutParams();
        if (itemCount == 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = C55298xhM.dp2px$default(230.0f, null, 1, null);
        }
        EZpvd(c43312rms, profileChartDto.EZpvd());
    }

    public final void EZpvd(@NotNull C43312rms<tOL> c43312rms, @NotNull java.util.List<ChartProfileDataResp> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ChartProfileDataResp chartProfileDataResp : list) {
            arrayList.add(new tVX(C33129mqd.valueOf(java.lang.Long.valueOf(chartProfileDataResp.KWHzl())), chartProfileDataResp.OLrzqt()));
        }
        tVX tvx = (tVX) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        boolean z = true;
        if (tvx != null) {
            ((tOL) c43312rms.OLrzqt()).AEQbTJ.setText(pTB.formatICUPercent$default(tvx.KWHzl(), RoundingMode.HALF_UP, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 18, null));
            ((tOL) c43312rms.OLrzqt()).AEQbTJ.setTextColor(C46368tRt.getPercentColor$default(C33129mqd.djBIcL(tvx.KWHzl()), 0, 1, null));
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C33129mqd.djBIcL(((ChartProfileDataResp) it.next()).OLrzqt()) != 0.0f) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ((tOL) c43312rms.OLrzqt()).EZpvd.setVisibility(z ? 8 : 0);
        C46496tWm.setData$default(((tOL) c43312rms.OLrzqt()).EZpvd, arrayList, null, null, 6, null);
        android.view.View root = ((tOL) c43312rms.OLrzqt()).getRoot();
        root.setOnClickListener(new Application(root, 300L, root, this));
    }

    /* JADX INFO: renamed from: o.tLz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C46212tLz KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, C46212tLz c46212tLz) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = view2;
            this.KWHzl = c46212tLz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0<Unit> function0Copydefault = this.KWHzl.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }
}
