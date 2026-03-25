package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C27329jtD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27329jtD extends C33584mzH {
    public iLQ AEQbTJ;
    public android.content.Context KWHzl;
    public Function1<? super InvestBaseFilterItem, Unit> OLrzqt;
    public final android.os.Handler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem, kotlin.Unit> */
    public final Function1<InvestBaseFilterItem, Unit> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27329jtD(@NotNull android.content.Context context, @NotNull Function1<? super InvestBaseFilterItem, Unit> function1) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = context;
        this.OLrzqt = function1;
        this.copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
        EZpvd();
    }

    public final void EZpvd() {
        iLQ ilq = null;
        iLQ ilq2 = (iLQ) DataBindingUtil.inflate(android.view.LayoutInflater.from(this.KWHzl), C25493ixk.Activity.DQzvGN, null, false);
        this.AEQbTJ = ilq2;
        if (ilq2 == null) {
            Intrinsics.gEmmrt("");
            ilq2 = null;
        }
        RecyclerView recyclerView = ilq2.OLrzqt;
        recyclerView.setHasFixedSize(true);
        C43316rmw c43316rmw = new C43316rmw();
        KWHzl(c43316rmw);
        recyclerView.setAdapter(c43316rmw);
        setFocusable(false);
        AEQbTJ(false);
        iLQ ilq3 = this.AEQbTJ;
        if (ilq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ilq = ilq3;
        }
        setContentView(ilq.getRoot());
    }

    /* JADX INFO: renamed from: o.jtD$StateListAnimator */
    public static final class StateListAnimator extends C43318rmy<InvestBaseFilterItem, iIG> {
        public StateListAnimator(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<iIG> c43312rms, final InvestBaseFilterItem investBaseFilterItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(investBaseFilterItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, investBaseFilterItem);
            ((iIG) c43312rms.OLrzqt()).copydefault.setVisibility(investBaseFilterItem.getIcon().length() == 0 ? 8 : 0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            AppCompatImageView appCompatImageView = ((iIG) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            c27569jxf.AEQbTJ(appCompatImageView, investBaseFilterItem.getIcon(), c27569jxf.AEQbTJ());
            android.view.View view = c43312rms.itemView;
            final C27329jtD c27329jtD = C27329jtD.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.jtG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C27329jtD.StateListAnimator.copydefault(c27329jtD, investBaseFilterItem, view2);
                }
            });
        }

        public static final void copydefault(final C27329jtD c27329jtD, final InvestBaseFilterItem investBaseFilterItem, android.view.View view) {
            c27329jtD.dismiss();
            c27329jtD.copydefault.postDelayed(new java.lang.Runnable() { // from class: o.jtH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C27329jtD.StateListAnimator.AEQbTJ(c27329jtD, investBaseFilterItem);
                }
            }, 200L);
        }

        public static final void AEQbTJ(C27329jtD c27329jtD, InvestBaseFilterItem investBaseFilterItem) {
            c27329jtD.KWHzl().invoke(investBaseFilterItem);
        }
    }

    public final void KWHzl(C43316rmw c43316rmw) {
        c43316rmw.register(InvestBaseFilterItem.class, new StateListAnimator(C25493ixk.Activity.QHmsKR, C25488ixf.OLrzqt));
    }

    public final void OLrzqt(@NotNull android.view.View view, @NotNull java.util.List<? extends InvestBaseFilterItem> list) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        iLQ ilq = this.AEQbTJ;
        if (ilq == null) {
            Intrinsics.gEmmrt("");
            ilq = null;
        }
        RecyclerView.Adapter adapter = ilq.OLrzqt.getAdapter();
        Intrinsics.copydefault(adapter, "");
        ((C43316rmw) adapter).AhwBna(list);
        showAsDropDown(view, 0, 0, 80);
    }
}
