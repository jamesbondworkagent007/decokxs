package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gVU extends AbstractC31189lpN<C19983gWo, hCE> {
    public final Function1<C19983gWo, Unit> EZpvd;
    public final InterfaceC19969gWa KWHzl;
    public final Function1<C19983gWo, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.gWo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.gWo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public gVU(@NotNull InterfaceC19969gWa interfaceC19969gWa, Function1<? super C19983gWo, Unit> function1, Function1<? super C19983gWo, Unit> function12) {
        Intrinsics.checkNotNullParameter(interfaceC19969gWa, "");
        this.KWHzl = interfaceC19969gWa;
        this.copydefault = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hCE KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCE hceOLrzqt = hCE.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hceOLrzqt, "");
        return hceOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/lpN$Activity;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC31189lpN<C19983gWo, hCE>.Activity activity, @NotNull C19983gWo c19983gWo) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        super.onBindViewHolder((AbstractC31189lpN<C19983gWo, VB>.Activity) activity, c19983gWo);
        hCE hce = (hCE) activity.KWHzl();
        hce.getRoot().setContentDescription("web3_dex_copytrading_strategy_item_" + activity.getAdapterPosition());
        ConstraintLayout root = hce.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c19983gWo));
        AppCompatImageView appCompatImageView = hce.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C25386ivj.KWHzl(appCompatImageView, null, c19983gWo.AYXKKw(), c19983gWo.AEQbTJ(), 6.0f);
        AppCompatImageView appCompatImageView2 = hce.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        C25386ivj.loadCircleImage$default(appCompatImageView2, c19983gWo.EZpvd(), false, 2, null);
        C55239xgG c55239xgG = hce.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        c55239xgG.setVisibility(c19983gWo.fetchVPNInfo() ^ true ? 0 : 8);
        hce.DbNXlk.setChecked(c19983gWo.djBIcL());
        hce.DbNXlk.setBackgroundResource(C23274hvD.ActionBar.fZBcTu);
        android.view.View view = hce.values;
        view.setOnClickListener(new ActionBar(view, 1000L, this, c19983gWo));
        hce.gEmmrt.setText(C33069mpW.copydefault(C23274hvD.Fragment.FSMca, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, c19983gWo.AhwBna()))));
        hce.AYXKKw.setText(c19983gWo.gEmmrt());
        C19976gWh c19976gWh = hce.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c19976gWh, "");
        c19976gWh.setVisibility(c19983gWo.KWHzl().isEmpty() ^ true ? 0 : 8);
        hce.AhwBna.setData(c19983gWo.KWHzl(), this.KWHzl);
        C19976gWh c19976gWh2 = hce.AhwBna;
        c19976gWh2.setOnClickListener(new TaskDescription(c19976gWh2, 1000L, this, c19983gWo));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19983gWo KWHzl;
        public final /* synthetic */ gVU OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, gVU gvu, C19983gWo c19983gWo) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = gvu;
            this.KWHzl = c19983gWo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.KWHzl);
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ gVU EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C19983gWo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, gVU gvu, C19983gWo c19983gWo) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = gvu;
            this.copydefault = c19983gWo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19983gWo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ gVU OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, gVU gvu, C19983gWo c19983gWo) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = gvu;
            this.EZpvd = c19983gWo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.copydefault;
                if (function1 != null) {
                    function1.invoke(this.EZpvd);
                }
            }
        }
    }
}
