package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_performance.data.ChartProfileCopyTrading;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46210tLx extends AbstractC43310rmq<UserProfileCopyTradingRes, tOL> {
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46210tLx() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.copydefault;
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
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:25) call: o.tLx.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C46210tLx(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, UserProfileCopyTradingRes userProfileCopyTradingRes) {
        onBindViewHolder((C43312rms<tOL>) c43312rms, userProfileCopyTradingRes);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46210tLx(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tOL> c43312rms, @NotNull UserProfileCopyTradingRes userProfileCopyTradingRes) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(userProfileCopyTradingRes, "");
        super.onBindViewHolder((C43312rms) c43312rms, userProfileCopyTradingRes);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        int itemCount = bindingAdapter != null ? bindingAdapter.getItemCount() : 0;
        ViewGroup.LayoutParams layoutParams = c43312rms.itemView.getLayoutParams();
        if (itemCount == 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = C55298xhM.dp2px$default(230.0f, null, 1, null);
        }
        java.lang.String strOLrzqt = userProfileCopyTradingRes.OLrzqt();
        int iHashCode = strOLrzqt.hashCode();
        if (iHashCode != 65959) {
            if (iHashCode != 2552066) {
                if (iHashCode == 2558355 && strOLrzqt.equals("SWAP")) {
                    ((tOL) c43312rms.OLrzqt()).KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.fmB));
                }
            } else if (strOLrzqt.equals("SPOT")) {
                ((tOL) c43312rms.OLrzqt()).KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.onComplete));
            }
        } else if (strOLrzqt.equals("BOT")) {
            ((tOL) c43312rms.OLrzqt()).KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DMb));
        }
        ((tOL) c43312rms.OLrzqt()).AEQbTJ.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(userProfileCopyTradingRes.djBIcL())), RoundingMode.HALF_UP, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 18, null));
        ((tOL) c43312rms.OLrzqt()).AEQbTJ.setTextColor(C46368tRt.getPercentColor$default(C33129mqd.djBIcL(userProfileCopyTradingRes.djBIcL()), 0, 1, null));
        KWHzl(c43312rms, userProfileCopyTradingRes.gEmmrt());
        android.view.View root = ((tOL) c43312rms.OLrzqt()).getRoot();
        root.setOnClickListener(new StateListAnimator(root, 300L, root, this, userProfileCopyTradingRes));
    }

    public final void KWHzl(@NotNull C43312rms<tOL> c43312rms, @NotNull java.util.List<ChartProfileCopyTrading> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ChartProfileCopyTrading chartProfileCopyTrading : list) {
            arrayList.add(new tVX(C33129mqd.valueOf(java.lang.Long.valueOf(chartProfileCopyTrading.AEQbTJ())), chartProfileCopyTrading.KWHzl()));
        }
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (C33129mqd.djBIcL(((ChartProfileCopyTrading) it.next()).KWHzl()) != 0.0f) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        ((tOL) c43312rms.OLrzqt()).EZpvd.setVisibility(z ? 8 : 0);
        C46496tWm.setData$default(((tOL) c43312rms.OLrzqt()).EZpvd, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: o.tLx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ UserProfileCopyTradingRes KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C46210tLx copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.View view2, C46210tLx c46210tLx, UserProfileCopyTradingRes userProfileCopyTradingRes) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = view2;
            this.copydefault = c46210tLx;
            this.KWHzl = userProfileCopyTradingRes;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1KWHzl = this.copydefault.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(this.KWHzl.OLrzqt());
                }
            }
        }
    }
}
