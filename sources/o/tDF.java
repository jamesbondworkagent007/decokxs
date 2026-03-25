package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_plugin.future.data.FuturePositionBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tDF extends AbstractC43310rmq<FuturePositionBean, AbstractC46302tPh> {
    public final Function1<FuturePositionBean, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.UscePu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C47499trJ.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_plugin.future.data.FuturePositionBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public tDF(@NotNull Function1<? super FuturePositionBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46302tPh> c43312rms, @NotNull FuturePositionBean futurePositionBean) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(futurePositionBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, futurePositionBean);
        int bindingAdapterPosition = c43312rms.getBindingAdapterPosition();
        AbstractC46302tPh abstractC46302tPh = (AbstractC46302tPh) c43312rms.OLrzqt();
        android.widget.TextView textView = abstractC46302tPh.AYXKKw;
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        textView.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).KWHzl(futurePositionBean.getTradePositionPlanetBean().getPnl(), false));
        android.widget.TextView textView2 = abstractC46302tPh.AYXKKw;
        tBM tbm = tBM.copydefault;
        java.lang.String pnlRiseFall = futurePositionBean.getTradePositionPlanetBean().getPnlRiseFall();
        android.content.Context context = abstractC46302tPh.AYXKKw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView2.setTextColor(tbm.OLrzqt(pnlRiseFall, context, java.lang.Boolean.FALSE));
        abstractC46302tPh.copydefault.setText(futurePositionBean.getTradePositionPlanetBean().getInstName());
        abstractC46302tPh.KWHzl.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).EZpvd(futurePositionBean.getTradePositionPlanetBean().getTag()));
        abstractC46302tPh.AEQbTJ.setText(((InterfaceC49513upv) c43248rlh.AEQbTJ(InterfaceC49513upv.class)).AEQbTJ(futurePositionBean.getTradePositionPlanetBean().getShareType()));
        if (Intrinsics.EZpvd((java.lang.Object) futurePositionBean.getTradePositionPlanetBean().getSide(), (java.lang.Object) "buy")) {
            abstractC46302tPh.AEQbTJ.setOKDSStyle(14);
        } else {
            abstractC46302tPh.AEQbTJ.setOKDSStyle(13);
        }
        android.view.View root = abstractC46302tPh.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, futurePositionBean));
        ViewGroup.LayoutParams layoutParams = abstractC46302tPh.getRoot().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (bindingAdapterPosition == 0) {
                iDp2px$default = C55298xhM.dp2px$default(23.0f, null, 1, null);
            } else {
                iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
            }
            marginLayoutParams.setMarginStart(iDp2px$default);
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
            marginLayoutParams.setMarginEnd(bindingAdapterPosition == (bindingAdapter != null ? bindingAdapter.getItemCount() : 1) - 1 ? C55298xhM.dp2px$default(23.0f, null, 1, null) : 0);
            abstractC46302tPh.getRoot().setLayoutParams(marginLayoutParams);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ tDF AEQbTJ;
        public final /* synthetic */ FuturePositionBean EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, tDF tdf, FuturePositionBean futurePositionBean) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = tdf;
            this.EZpvd = futurePositionBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke(this.EZpvd);
            }
        }
    }
}
