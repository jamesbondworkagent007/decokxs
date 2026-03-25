package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_api.bean.DeFiApyItemInfoData;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C24078iUb extends RecyclerView.Adapter<C24087iUk> {
    public final Activity EZpvd;
    public final java.util.List<DeFiApyItemInfoData> copydefault;

    /* JADX INFO: renamed from: o.iUb$Activity */
    public interface Activity {
        void AEQbTJ(@NotNull DeFiApyItemInfoData deFiApyItemInfoData);
    }

    public C24078iUb(@NotNull java.util.List<DeFiApyItemInfoData> list, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = list;
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C24087iUk onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23774iIv c23774iIvAEQbTJ = C23774iIv.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23774iIvAEQbTJ, "");
        return new C24087iUk(c23774iIvAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C24087iUk c24087iUk, int i) {
        Intrinsics.checkNotNullParameter(c24087iUk, "");
        DeFiApyItemInfoData deFiApyItemInfoData = this.copydefault.get(i);
        C23774iIv c23774iIvCopydefault = c24087iUk.copydefault();
        ConstraintLayout root = c23774iIvCopydefault.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, deFiApyItemInfoData));
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = c24087iUk.copydefault().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27212jqt c27212jqt = c24087iUk.copydefault().EZpvd;
        java.lang.String chainImageUrl = deFiApyItemInfoData.getChainImageUrl();
        if (chainImageUrl == null) {
            chainImageUrl = "";
        }
        c27538jxA.KWHzl(context, c27212jqt, new InvestmentLogoData(C56402yEa.EZpvd(chainImageUrl), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 32.0f, 16.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : C52761wXj.Activity.zuBGHE, (96 & 64) != 0 ? 1.0f : 0.0f);
        c23774iIvCopydefault.AYXKKw.setText(deFiApyItemInfoData.getNetName());
        c23774iIvCopydefault.KWHzl.setText(C27492jwH.OLrzqt.KWHzl(deFiApyItemInfoData.getMinApy(), deFiApyItemInfoData.getMaxApy()));
        android.widget.TextView textView = c23774iIvCopydefault.KWHzl;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = c23774iIvCopydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null));
        android.widget.TextView textView2 = c23774iIvCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) deFiApyItemInfoData.getDisplayCountStr())) {
            c23774iIvCopydefault.AEQbTJ.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fFgQHt), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", deFiApyItemInfoData.getDisplayCountStr()))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX INFO: renamed from: o.iUb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ DeFiApyItemInfoData AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C24078iUb KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24078iUb c24078iUb, DeFiApyItemInfoData deFiApyItemInfoData) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c24078iUb;
            this.AEQbTJ = deFiApyItemInfoData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd.AEQbTJ(this.AEQbTJ);
            }
        }
    }
}
