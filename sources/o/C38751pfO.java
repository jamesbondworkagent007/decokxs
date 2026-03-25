package o;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.ui.view.model.MarketDealItem;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38751pfO extends RecyclerView.Adapter<StateListAnimator> {
    public final int AYXKKw;
    public final C37851pDa AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final FragmentActivity OLrzqt;
    public final int copydefault;
    public final CopyOnWriteArrayList<MarketDealItem> djBIcL;
    public MarketDealItem gEmmrt;
    public final WeakReference<FragmentActivity> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<MarketDealItem> AEQbTJ() {
        return this.djBIcL;
    }

    public C38751pfO(@NotNull FragmentActivity fragmentActivity, @NotNull C37851pDa c37851pDa) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(c37851pDa, "");
        this.OLrzqt = fragmentActivity;
        this.AhwBna = c37851pDa;
        this.copydefault = ContextCompat.getColor(fragmentActivity, C32113mPz.ActionBar.zLjUOn);
        this.EZpvd = ContextCompat.getColor(fragmentActivity, C32113mPz.ActionBar.hDKMBd);
        this.AYXKKw = ContextCompat.getColor(fragmentActivity, C32113mPz.ActionBar.iwGUEr);
        this.KWHzl = ContextCompat.getColor(fragmentActivity, C32113mPz.ActionBar.uzCIH);
        this.djBIcL = new CopyOnWriteArrayList<>();
        this.valueOf = new WeakReference<>(fragmentActivity);
    }

    /* JADX INFO: renamed from: o.pfO$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(this.OLrzqt).inflate(C35964oKf.Application.igXuih, viewGroup, false);
        viewInflate.setMinimumHeight(C33518mxv.EZpvd(this.OLrzqt, C33129mqd.djBIcL(18)));
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt = this.djBIcL.get(i);
        if (SPUtils.getBoolean("chart_theme", true)) {
            stateListAnimator.copydefault().AYXKKw = this.copydefault;
            stateListAnimator.copydefault().AuCTel = this.KWHzl;
        } else {
            stateListAnimator.copydefault().AYXKKw = this.EZpvd;
            stateListAnimator.copydefault().AuCTel = this.AYXKKw;
        }
        C39809pzO c39809pzOCopydefault = stateListAnimator.copydefault();
        MarketDealItem marketDealItem = this.gEmmrt;
        if (marketDealItem == null) {
            Intrinsics.gEmmrt("");
            marketDealItem = null;
        }
        c39809pzOCopydefault.setData(marketDealItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.djBIcL.size();
    }

    /* JADX INFO: renamed from: o.pfO$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C39809pzO EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C39809pzO copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.YqksP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (C39809pzO) viewFindViewById;
        }
    }

    public final void EZpvd() {
        this.djBIcL.clear();
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (C33129mqd.AEQbTJ(str) < 0.001d) {
            return pTB.formatDownToFixed$default(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)))), 8, null, 2, null);
        }
        return pTB.formatICUCompact$default(new BigDecimal(str), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(3), null, null, 12, null);
    }

    public final void copydefault() {
        CopyOnWriteArrayList<MarketDealItem> copyOnWriteArrayListCopydefault = this.AhwBna.copydefault();
        if (copyOnWriteArrayListCopydefault != null) {
            int i = 0;
            for (java.lang.Object obj : copyOnWriteArrayListCopydefault) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                MarketDealItem marketDealItem = (MarketDealItem) obj;
                if (i < 25) {
                    MarketDealItem marketDealItem2 = new MarketDealItem(null, null, null, null, 0L, 31, null);
                    this.gEmmrt = marketDealItem2;
                    marketDealItem2.setPrice(marketDealItem.getPrice());
                    MarketDealItem marketDealItem3 = this.gEmmrt;
                    if (marketDealItem3 == null) {
                        Intrinsics.gEmmrt("");
                        marketDealItem3 = null;
                    }
                    marketDealItem3.setAmount(OLrzqt(marketDealItem.getAmount()));
                    MarketDealItem marketDealItem4 = this.gEmmrt;
                    if (marketDealItem4 == null) {
                        Intrinsics.gEmmrt("");
                        marketDealItem4 = null;
                    }
                    marketDealItem4.setSide(marketDealItem.getSide());
                    MarketDealItem marketDealItem5 = this.gEmmrt;
                    if (marketDealItem5 == null) {
                        Intrinsics.gEmmrt("");
                        marketDealItem5 = null;
                    }
                    marketDealItem5.setCreatedDate(marketDealItem.getCreatedDate());
                    if (this.djBIcL.size() == 25) {
                        this.djBIcL.remove(24);
                    }
                    CopyOnWriteArrayList<MarketDealItem> copyOnWriteArrayList = this.djBIcL;
                    MarketDealItem marketDealItem6 = this.gEmmrt;
                    if (marketDealItem6 == null) {
                        Intrinsics.gEmmrt("");
                        marketDealItem6 = null;
                    }
                    copyOnWriteArrayList.add(i, marketDealItem6);
                }
                i++;
            }
        }
        FragmentActivity fragmentActivity = this.valueOf.get();
        if (fragmentActivity != null && (fragmentActivity instanceof ActivityC38834pgs)) {
            androidx.fragment.app.Fragment fragmentAYXKKw = ((ActivityC38834pgs) fragmentActivity).AYXKKw();
            C55427xjj c55427xjj = fragmentAYXKKw instanceof C55427xjj ? (C55427xjj) fragmentAYXKKw : null;
            if (c55427xjj == null || !c55427xjj.AuCTel()) {
                notifyDataSetChanged();
            }
        }
        if (fragmentActivity == null || !(fragmentActivity instanceof ActivityC38952pjD) || ((ActivityC38952pjD) fragmentActivity).EZpvd()) {
            return;
        }
        notifyDataSetChanged();
    }

    public final void KWHzl(@NotNull java.util.List<xOA> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            xOA xoa = (xOA) obj;
            MarketDealItem marketDealItem = new MarketDealItem(null, null, null, null, 0L, 31, null);
            this.gEmmrt = marketDealItem;
            marketDealItem.setPrice(xoa.EZpvd());
            MarketDealItem marketDealItem2 = this.gEmmrt;
            if (marketDealItem2 == null) {
                Intrinsics.gEmmrt("");
                marketDealItem2 = null;
            }
            marketDealItem2.setAmount(OLrzqt(xoa.copydefault()));
            MarketDealItem marketDealItem3 = this.gEmmrt;
            if (marketDealItem3 == null) {
                Intrinsics.gEmmrt("");
                marketDealItem3 = null;
            }
            marketDealItem3.setSide(xoa.OLrzqt());
            MarketDealItem marketDealItem4 = this.gEmmrt;
            if (marketDealItem4 == null) {
                Intrinsics.gEmmrt("");
                marketDealItem4 = null;
            }
            marketDealItem4.setCreatedDate(C33129mqd.valueOf(xoa.KWHzl()));
            boolean z = false;
            for (MarketDealItem marketDealItem5 : this.djBIcL) {
                java.lang.String price = marketDealItem5.getPrice();
                MarketDealItem marketDealItem6 = this.gEmmrt;
                if (marketDealItem6 == null) {
                    Intrinsics.gEmmrt("");
                    marketDealItem6 = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) price, (java.lang.Object) marketDealItem6.getPrice())) {
                    java.lang.String amount = marketDealItem5.getAmount();
                    MarketDealItem marketDealItem7 = this.gEmmrt;
                    if (marketDealItem7 == null) {
                        Intrinsics.gEmmrt("");
                        marketDealItem7 = null;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) amount, (java.lang.Object) marketDealItem7.getAmount())) {
                        java.lang.String side = marketDealItem5.getSide();
                        MarketDealItem marketDealItem8 = this.gEmmrt;
                        if (marketDealItem8 == null) {
                            Intrinsics.gEmmrt("");
                            marketDealItem8 = null;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) marketDealItem8.getSide())) {
                            long createdDate = marketDealItem5.getCreatedDate();
                            MarketDealItem marketDealItem9 = this.gEmmrt;
                            if (marketDealItem9 == null) {
                                Intrinsics.gEmmrt("");
                                marketDealItem9 = null;
                            }
                            if (createdDate == marketDealItem9.getCreatedDate()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (java.lang.Object obj2 : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            xOA xoa2 = (xOA) obj2;
            if (i < 25) {
                MarketDealItem marketDealItem10 = new MarketDealItem(null, null, null, null, 0L, 31, null);
                this.gEmmrt = marketDealItem10;
                marketDealItem10.setPrice(xoa2.EZpvd());
                MarketDealItem marketDealItem11 = this.gEmmrt;
                if (marketDealItem11 == null) {
                    Intrinsics.gEmmrt("");
                    marketDealItem11 = null;
                }
                marketDealItem11.setAmount(OLrzqt(xoa2.copydefault()));
                MarketDealItem marketDealItem12 = this.gEmmrt;
                if (marketDealItem12 == null) {
                    Intrinsics.gEmmrt("");
                    marketDealItem12 = null;
                }
                marketDealItem12.setSide(xoa2.OLrzqt());
                MarketDealItem marketDealItem13 = this.gEmmrt;
                if (marketDealItem13 == null) {
                    Intrinsics.gEmmrt("");
                    marketDealItem13 = null;
                }
                marketDealItem13.setCreatedDate(C33129mqd.valueOf(xoa2.KWHzl()));
                if (this.djBIcL.size() == 25) {
                    this.djBIcL.remove(24);
                }
                CopyOnWriteArrayList<MarketDealItem> copyOnWriteArrayList = this.djBIcL;
                MarketDealItem marketDealItem14 = this.gEmmrt;
                if (marketDealItem14 == null) {
                    Intrinsics.gEmmrt("");
                    marketDealItem14 = null;
                }
                copyOnWriteArrayList.add(i, marketDealItem14);
            }
            i++;
        }
        FragmentActivity fragmentActivity = this.valueOf.get();
        if (fragmentActivity != null && (fragmentActivity instanceof ActivityC38834pgs)) {
            androidx.fragment.app.Fragment fragmentAYXKKw = ((ActivityC38834pgs) fragmentActivity).AYXKKw();
            C55427xjj c55427xjj = fragmentAYXKKw instanceof C55427xjj ? (C55427xjj) fragmentAYXKKw : null;
            if (c55427xjj == null || !c55427xjj.AuCTel()) {
                notifyDataSetChanged();
            }
        }
        if (fragmentActivity == null || !(fragmentActivity instanceof ActivityC38952pjD) || ((ActivityC38952pjD) fragmentActivity).EZpvd()) {
            return;
        }
        notifyDataSetChanged();
    }
}
