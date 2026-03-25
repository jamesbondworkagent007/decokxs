package o;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38780pfr extends AbstractC32996moC implements InterfaceC35971oKm {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public oKC AYXKKw;
    public oMQ copydefault;
    public java.lang.Integer gEmmrt;
    public final java.lang.String OLrzqt = "timeInterval";
    public final C43316rmw EZpvd = new C43316rmw();
    public java.util.ArrayList<MarketTypeSelect> AEQbTJ = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35971oKm
    public void OLrzqt(@NotNull oKC okc) {
        Intrinsics.checkNotNullParameter(okc, "");
        this.AYXKKw = okc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.gGvvIC;
    }

    /* JADX INFO: renamed from: o.pfr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38780pfr copydefault(int i) {
            C38780pfr c38780pfr = new C38780pfr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(c38780pfr.OLrzqt, i);
            c38780pfr.setArguments(bundle);
            return c38780pfr;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = (oMQ) DataBindingUtil.bind(view);
        android.os.Bundle arguments = getArguments();
        this.gEmmrt = arguments != null ? java.lang.Integer.valueOf(arguments.getInt(this.OLrzqt)) : null;
        OLrzqt();
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.pfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38780pfr.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C38780pfr c38780pfr) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38780pfr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        this.AEQbTJ.clear();
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pFN.OLrzqt.djBIcL();
        if (interfaceC39509ptgDjBIcL == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null) {
            return;
        }
        for (TimeIntervalItem timeIntervalItem : arrayListAEQbTJ) {
            java.util.ArrayList<MarketTypeSelect> arrayList = this.AEQbTJ;
            java.lang.String displayName = timeIntervalItem.getDisplayName();
            java.lang.Integer num = this.gEmmrt;
            arrayList.add(new MarketTypeSelect(displayName, num != null && num.intValue() == timeIntervalItem.timeInterval, 0, timeIntervalItem));
        }
    }

    public final void EZpvd() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C43316rmw c43316rmw = this.EZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(MarketTypeSelect.class, new C39485ptI(contextRequireContext, new Function1() { // from class: o.pfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38780pfr.copydefault(this.EZpvd, (MarketTypeSelect) obj);
            }
        }, new Function1() { // from class: o.pfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38780pfr.AEQbTJ(this.AEQbTJ, (MarketTypeSelect) obj);
            }
        }));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        oMQ omq = this.copydefault;
        if (omq != null && (recyclerView2 = omq.KWHzl) != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        oMQ omq2 = this.copydefault;
        if (omq2 != null && (recyclerView = omq2.KWHzl) != null) {
            recyclerView.setAdapter(this.EZpvd);
        }
        this.EZpvd.setItems(this.AEQbTJ);
    }

    public static final Unit copydefault(C38780pfr c38780pfr, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        c38780pfr.KWHzl(marketTypeSelect);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C38780pfr c38780pfr, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        oKC okc = c38780pfr.AYXKKw;
        if (okc != null) {
            okc.copydefault(marketTypeSelect);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(MarketTypeSelect marketTypeSelect) {
        int size = this.AEQbTJ.size();
        for (int i = 0; i < size; i++) {
            if (this.AEQbTJ.get(i) instanceof MarketTypeSelect) {
                MarketTypeSelect marketTypeSelect2 = this.AEQbTJ.get(i);
                Intrinsics.copydefault(marketTypeSelect2, "");
                MarketTypeSelect marketTypeSelect3 = marketTypeSelect2;
                if (marketTypeSelect3.getGroup() == marketTypeSelect.getGroup()) {
                    if (Intrinsics.EZpvd((java.lang.Object) marketTypeSelect3.getSelectTypeName(), (java.lang.Object) marketTypeSelect.getSelectTypeName())) {
                        marketTypeSelect3.setSelect(!marketTypeSelect3.isSelect());
                    } else {
                        marketTypeSelect3.setSelect(false);
                    }
                }
            }
        }
        this.EZpvd.notifyDataSetChanged();
    }
}
