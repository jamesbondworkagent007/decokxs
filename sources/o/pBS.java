package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import o.pBS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pBS extends C57662yme {
    public android.widget.ImageView KWHzl;
    public RecyclerView copydefault;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pBU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pBS.OLrzqt();
        }
    });
    public final C59534zip AEQbTJ = new C59534zip(copydefault());

    public final java.util.ArrayList<TradeMenuItemBean> copydefault() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList OLrzqt() {
        TradeMenuItemBean[] tradeMenuItemBeanArr = new TradeMenuItemBean[6];
        java.lang.String str = "3 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz);
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        tradeMenuItemBeanArr[0] = new TradeMenuItemBean(str, priceWindowData.KWHzl() == 3, 3, null, false, null, 56, null);
        tradeMenuItemBeanArr[1] = new TradeMenuItemBean("4 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz), priceWindowData.KWHzl() == 4, 4, null, false, null, 56, null);
        tradeMenuItemBeanArr[2] = new TradeMenuItemBean("5 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz), priceWindowData.KWHzl() == 5, 5, null, false, null, 56, null);
        tradeMenuItemBeanArr[3] = new TradeMenuItemBean("6 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz), priceWindowData.KWHzl() == 6, 6, null, false, null, 56, null);
        tradeMenuItemBeanArr[4] = new TradeMenuItemBean("7 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz), priceWindowData.KWHzl() == 7, 7, null, false, null, 56, null);
        tradeMenuItemBeanArr[5] = new TradeMenuItemBean("8 " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz), priceWindowData.KWHzl() == 8, 8, null, false, null, 56, null);
        return yDY.copydefault(tradeMenuItemBeanArr);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C35964oKf.Application.getNewProxyInstance, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = (RecyclerView) view.findViewById(C35964oKf.StateListAnimator.ICustomTabsServiceStub);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.GcnicV);
        this.KWHzl = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.pBT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    pBS.copydefault(this.EZpvd, view2);
                }
            });
        }
        RecyclerView recyclerView = this.copydefault;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.AEQbTJ);
        }
        this.AEQbTJ.register(TradeMenuItemBean.class, new TaskDescription());
        view.post(new java.lang.Runnable() { // from class: o.pBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                pBS.KWHzl(this.copydefault);
            }
        });
    }

    public static final void copydefault(pBS pbs, android.view.View view) {
        pbs.dismiss();
        androidx.fragment.app.FragmentManager supportFragmentManager = pbs.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new pBW().show(supportFragmentManager, C56524yIo.AEQbTJ(pBW.class).valueOf());
    }

    public static final void KWHzl(pBS pbs) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) pbs, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final class TaskDescription extends AbstractC59533zio<TradeMenuItemBean, StateListAnimator> {

        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final /* synthetic */ TaskDescription EZpvd;
            public final android.widget.TextView KWHzl;
            public final android.widget.ImageView copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView OLrzqt() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.EZpvd = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.OBJEWx);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.KWHzl = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.AuCTelauCTel);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.copydefault = (android.widget.ImageView) viewFindViewById2;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C32113mPz.Fragment.values, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            stateListAnimator.EZpvd().setText(tradeMenuItemBean.getTitle());
            stateListAnimator.OLrzqt().setVisibility(tradeMenuItemBean.isSelect() ? 0 : 4);
            android.view.View view = stateListAnimator.itemView;
            final pBS pbs = pBS.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pBZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    pBS.TaskDescription.AEQbTJ(tradeMenuItemBean, pbs, view2);
                }
            });
        }

        public static final void AEQbTJ(TradeMenuItemBean tradeMenuItemBean, pBS pbs, android.view.View view) {
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            int iIntValue = ((java.lang.Integer) data).intValue();
            if (iIntValue == PriceWindowData.AEQbTJ.KWHzl()) {
                return;
            }
            for (TradeMenuItemBean tradeMenuItemBean2 : pbs.copydefault()) {
                tradeMenuItemBean2.setSelect(Intrinsics.EZpvd(tradeMenuItemBean2, tradeMenuItemBean));
            }
            pbs.AEQbTJ.notifyDataSetChanged();
            PriceWindowData.AEQbTJ.KWHzl(iIntValue);
            pBO.dxcTrN.fIwbmz();
        }
    }
}
