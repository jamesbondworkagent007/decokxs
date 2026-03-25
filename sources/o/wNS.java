package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNS extends AbstractC59533zio<DetailsData, wNP> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final wNE EZpvd;

    public wNS(@NotNull wNE wne) {
        Intrinsics.checkNotNullParameter(wne, "");
        this.EZpvd = wne;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wNS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public wNP onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.hbZCHz, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new wNP((uWW) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNP wnp, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(wnp, "");
        Intrinsics.checkNotNullParameter(detailsData, "");
        uWW uwwAEQbTJ = wnp.AEQbTJ();
        if (uwwAEQbTJ.valueOf.getAdapter() == null) {
            uwwAEQbTJ.valueOf.setLayoutManager(new GridLayoutManager(uwwAEQbTJ.getRoot().getContext(), 2));
            uwwAEQbTJ.valueOf.addItemDecoration(new C57584ylF(2, 0, C55298xhM.dp2px$default(16.0f, null, 1, null)));
            C59534zip c59534zip = new C59534zip();
            android.content.Context context = uwwAEQbTJ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, false, 0, false, null, null, null, 254, null));
            uwwAEQbTJ.valueOf.setAdapter(c59534zip);
        }
        uwwAEQbTJ.EZpvd.setText(detailsData.getTvTitle());
        uwwAEQbTJ.copydefault.setText(detailsData.getFondType());
        uwwAEQbTJ.gEmmrt.setText(detailsData.getType());
        uwwAEQbTJ.OLrzqt.setText(detailsData.getTime());
        if (detailsData.getSideColor() != 0) {
            uwwAEQbTJ.gEmmrt.setTextColor(detailsData.getSideColor());
        }
        if (detailsData.getSideBgColor() != 0) {
            uwwAEQbTJ.gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(detailsData.getSideBgColor()));
        }
        java.util.ArrayList<TacticsInsideItemData> subData = detailsData.getSubData();
        if (subData != null) {
            RecyclerView.Adapter adapter = uwwAEQbTJ.valueOf.getAdapter();
            Intrinsics.copydefault(adapter, "");
            C33064mpR.OLrzqt((C59534zip) adapter, subData);
        }
        C52794wYp c52794wYp = uwwAEQbTJ.AhwBna;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, detailsData));
        C52794wYp c52794wYp2 = uwwAEQbTJ.KWHzl;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this, detailsData));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ wNS AEQbTJ;
        public final /* synthetic */ DetailsData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wNS wns, DetailsData detailsData) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = wns;
            this.EZpvd = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.EZpvd(this.EZpvd);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ wNS OLrzqt;
        public final /* synthetic */ DetailsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wNS wns, DetailsData detailsData) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = wns;
            this.copydefault = detailsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.copydefault(this.copydefault);
            }
        }
    }
}
