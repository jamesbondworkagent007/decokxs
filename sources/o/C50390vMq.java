package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.ProductItemResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50390vMq extends AbstractC59533zio<ProductItemResp, Application> {
    public final Function1<ProductItemResp, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.ProductItemResp, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50390vMq(@NotNull Function1<? super ProductItemResp, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.DuR, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new Application((AbstractC50774vaW) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull ProductItemResp productItemResp) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(productItemResp, "");
        AbstractC50774vaW abstractC50774vaWAEQbTJ = application.AEQbTJ();
        android.widget.TextView textView = abstractC50774vaWAEQbTJ.EZpvd;
        xMR xmr = xMR.copydefault;
        textView.setText(xmr.copydefault(productItemResp.getStrike()));
        abstractC50774vaWAEQbTJ.OLrzqt.setText(C55861xrt.OLrzqt.EZpvd(productItemResp.getTerm()));
        abstractC50774vaWAEQbTJ.AEQbTJ.setText(xMR.formatPercentWithSymbol$default(xmr, productItemResp.getAnnualYieldPercentage(), 0, 0, null, 14, null));
        abstractC50774vaWAEQbTJ.AEQbTJ.setTextColor(C56033xvF.OLrzqt((java.lang.Object) productItemResp.getAnnualYieldPercentage()));
        android.view.View view = application.itemView;
        view.setOnClickListener(new Activity(view, 1000L, this, productItemResp));
    }

    /* JADX INFO: renamed from: o.vMq$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC50774vaW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50774vaW AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC50774vaW abstractC50774vaW) {
            super(abstractC50774vaW.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50774vaW, "");
            this.copydefault = abstractC50774vaW;
        }
    }

    /* JADX INFO: renamed from: o.vMq$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50390vMq AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ProductItemResp KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50390vMq c50390vMq, ProductItemResp productItemResp) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c50390vMq;
            this.KWHzl = productItemResp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke(this.KWHzl);
            }
        }
    }
}
