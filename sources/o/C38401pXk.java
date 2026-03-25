package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43033rhe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38401pXk extends pWX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public boolean AYXKKw;
    public C38408pXr AhwBna;
    public pXM djBIcL;

    public final pXM gEmmrt() {
        pXM pxm = this.djBIcL;
        Intrinsics.copydefault(pxm);
        return pxm;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.djBIcL = pXM.EZpvd(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutCopydefault = gEmmrt().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault, "");
        return constraintLayoutCopydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle arguments;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        EZpvd();
        if (this.AYXKKw || (arguments = getArguments()) == null || (string = arguments.getString(FirebaseAnalytics.Param.ITEM_ID)) == null) {
            return;
        }
        copydefault(string);
        this.AYXKKw = true;
    }

    private final void valueOf() {
        this.AhwBna = new C38408pXr(new java.util.ArrayList(), new Function1() { // from class: o.pXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38401pXk.OLrzqt(this.EZpvd, (C38414pXx) obj);
            }
        });
        RecyclerView recyclerView = gEmmrt().AEQbTJ;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        C38408pXr c38408pXr = this.AhwBna;
        if (c38408pXr == null) {
            Intrinsics.gEmmrt("");
            c38408pXr = null;
        }
        recyclerView.setAdapter(c38408pXr);
    }

    public static final Unit OLrzqt(C38401pXk c38401pXk, C38414pXx c38414pXx) {
        Intrinsics.checkNotNullParameter(c38414pXx, "");
        c38401pXk.AEQbTJ(c38414pXx);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rhe.StateListAnimator.gotoAllPriceRemindActivity$default(o.rhe, android.content.Context, com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind, com.okinc.business.market.bean.TokenInfoForAlert, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=16] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ(C38414pXx c38414pXx) {
        java.lang.String strOLrzqt = c38414pXx.OLrzqt();
        int iHashCode = strOLrzqt.hashCode();
        switch (iHashCode) {
            case 49:
                if (strOLrzqt.equals("1")) {
                    OLrzqt("bizNav");
                    break;
                }
                break;
            case 50:
                if (strOLrzqt.equals("2")) {
                    OLrzqt("coinNav");
                    break;
                }
                break;
            case 51:
                if (strOLrzqt.equals("3")) {
                    AEQbTJ("com.okinc.okmarket.home.CardQuoteFragment");
                    break;
                }
                break;
            case 52:
                if (strOLrzqt.equals("4")) {
                    UnifiedPriceRemind unifiedPriceRemind = new UnifiedPriceRemind("BTC/USDT", "SPOT", "BTC-USDT", "", "", "", (java.lang.String) null, 1, 64, (DefaultConstructorMarker) null);
                    android.content.Context contextRequireContext = requireContext();
                    InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
                    if (interfaceC43033rhe != null) {
                        Intrinsics.copydefault(contextRequireContext);
                        InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, contextRequireContext, unifiedPriceRemind, null, 4, null);
                    }
                    break;
                }
                break;
            case 53:
                if (strOLrzqt.equals("5")) {
                    EZpvd("com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesGroupsEditActivity");
                    break;
                }
                break;
            case 54:
                if (strOLrzqt.equals(OrderDetailListItem.SLIP_OUT)) {
                    EZpvd("com.okinc.market.search.features.favorite.ui.FavoriteSearchActivity");
                    break;
                }
                break;
            case 55:
                if (strOLrzqt.equals("7")) {
                    EZpvd("com.okinc.business.market.features.favorites.editing.ui.MarketFavoritesCryptosEditActivity");
                    break;
                }
                break;
            case 56:
                if (strOLrzqt.equals("8")) {
                    AEQbTJ("com.okinc.business.market.market.CrMarketContainerFragment");
                    break;
                }
                break;
            case 57:
                if (strOLrzqt.equals("9")) {
                    android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) ActivityC38400pXj.class);
                    android.content.Context context = getContext();
                    if (context != null) {
                        context.startActivity(intent);
                    }
                    break;
                }
                break;
            default:
                switch (iHashCode) {
                    case 1567:
                        if (strOLrzqt.equals("10")) {
                            djBIcL();
                            break;
                        }
                        break;
                    case 1568:
                        if (strOLrzqt.equals("11")) {
                            AYXKKw();
                            break;
                        }
                        break;
                    case 1569:
                        if (strOLrzqt.equals("12")) {
                            EZpvd("com.okinc.business.premarket.PreMarketLandingActivity");
                            break;
                        }
                        break;
                    case 1570:
                        if (strOLrzqt.equals("13")) {
                            EZpvd("com.okinc.business.premarket.PreMarketLandingListActivity");
                            break;
                        }
                        break;
                    case 1571:
                        if (strOLrzqt.equals("14")) {
                            EZpvd("com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity");
                            break;
                        }
                        break;
                    case 1572:
                        if (strOLrzqt.equals("15")) {
                            EZpvd("com.okinc.market.widget.gallery.GalleryActivity");
                            break;
                        }
                        break;
                    case 1573:
                        if (strOLrzqt.equals("16")) {
                            EZpvd("com.okinc.okmarket.ui.market.edit.EditFavoriteCoinPairsActivity");
                            break;
                        }
                        break;
                }
                break;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            Intrinsics.copydefault(parentFragmentManager);
            InterfaceC43033rhe.StateListAnimator.showNavSearchDialogByBizInstrument$default(interfaceC43033rhe, "", parentFragmentManager, null, str, null, null, new yHO() { // from class: o.pXl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C38401pXk.EZpvd((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, new Function2() { // from class: o.pXm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C38401pXk.AEQbTJ((DexInstrument) obj, (java.lang.String) obj2);
                }
            }, new Function1() { // from class: o.pXq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38401pXk.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            }, 48, null);
        } else {
            pUU.KWHzl("PageHubFragment", "no fragment manager");
        }
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DexInstrument dexInstrument, java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        android.content.Intent intent = new android.content.Intent(contextRequireContext, (java.lang.Class<?>) ActivityC38400pXj.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("debug_fragment", str);
        contextRequireContext.startActivity(intent);
    }

    public final void EZpvd(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(contextRequireContext, str);
        intent.addFlags(268435456);
        contextRequireContext.startActivity(intent);
    }

    public final void AYXKKw() {
        android.content.Context contextRequireContext = requireContext();
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class);
        Intrinsics.copydefault(contextRequireContext);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(InterfaceC43033rhe.StateListAnimator.getMarketSpotAnalysisFragment$default(interfaceC43033rhe, contextRequireContext, null, 2, null).getClass()).gEmmrt();
        if (strGEmmrt == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(contextRequireContext, (java.lang.Class<?>) ActivityC38400pXj.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("debug_fragment", strGEmmrt);
        contextRequireContext.startActivity(intent);
    }

    public final void djBIcL() {
        android.content.Context contextRequireContext = requireContext();
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class);
        Intrinsics.copydefault(contextRequireContext);
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(InterfaceC43033rhe.StateListAnimator.getMarketFuturesAnalysisFragment$default(interfaceC43033rhe, contextRequireContext, null, null, 6, null).getClass()).gEmmrt();
        if (strGEmmrt == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(contextRequireContext, (java.lang.Class<?>) ActivityC38400pXj.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("debug_fragment", strGEmmrt);
        contextRequireContext.startActivity(intent);
    }

    public final void EZpvd() {
        addButtonItem$default(this, "1", "Nav Search Biz", null, 4, null);
        addButtonItem$default(this, "2", "Nav Search Coin", null, 4, null);
        addButtonItem$default(this, "3", "Explore Market", null, 4, null);
        addButtonItem$default(this, "4", "price alert", null, 4, null);
        addButtonItem$default(this, "5", "Fav Detail", null, 4, null);
        addButtonItem$default(this, OrderDetailListItem.SLIP_OUT, "Fav Search", null, 4, null);
        addButtonItem$default(this, "7", "MarketFavoritesCryptosEditActivity", null, 4, null);
        addButtonItem$default(this, "8", "Kline Spot Data", null, 4, null);
        addButtonItem$default(this, "9", "OKMarketFragmentDebugActivity", null, 4, null);
        addButtonItem$default(this, "10", "Futures analysis", null, 4, null);
        addButtonItem$default(this, "11", "Spot analysis", null, 4, null);
        addButtonItem$default(this, "12", "PreMarketLandingActivity", null, 4, null);
        addButtonItem$default(this, "13", "PreMarketLandingListActivity", null, 4, null);
        addButtonItem$default(this, "14", "CryptoWidgetConfigureActivity", null, 4, null);
        addButtonItem$default(this, "15", "GalleryActivity", null, 4, null);
        addButtonItem$default(this, "16", "EditFavoriteCoinPairsActivity", null, 4, null);
    }

    public static /* synthetic */ void addButtonItem$default(C38401pXk c38401pXk, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        c38401pXk.copydefault(str, str2, obj);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C38408pXr c38408pXr = this.AhwBna;
        if (c38408pXr == null) {
            Intrinsics.gEmmrt("");
            c38408pXr = null;
        }
        c38408pXr.EZpvd(new C38414pXx(str, str2, obj));
    }

    public final void copydefault(final java.lang.String str) {
        gEmmrt().AEQbTJ.post(new java.lang.Runnable() { // from class: o.pXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38401pXk.AEQbTJ(this.AEQbTJ, str);
            }
        });
    }

    public static final void AEQbTJ(C38401pXk c38401pXk, java.lang.String str) {
        java.lang.Object next;
        C38408pXr c38408pXr = c38401pXk.AhwBna;
        C38408pXr c38408pXr2 = null;
        if (c38408pXr == null) {
            Intrinsics.gEmmrt("");
            c38408pXr = null;
        }
        java.util.Iterator<T> it = c38408pXr.OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C38414pXx) next).OLrzqt(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        C38414pXx c38414pXx = (C38414pXx) next;
        if (c38414pXx != null) {
            pUU.KWHzl("PageHubFragment", "Auto-clicking item with id: " + str);
            c38401pXk.AEQbTJ(c38414pXx);
            return;
        }
        C38408pXr c38408pXr3 = c38401pXk.AhwBna;
        if (c38408pXr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c38408pXr2 = c38408pXr3;
        }
        java.util.List<C38414pXx> listOLrzqt = c38408pXr2.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C38414pXx) it2.next()).OLrzqt());
        }
        pUU.valueOf("PageHubFragment", "Item with id " + str + " not found. Available items: " + arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    /* JADX INFO: renamed from: o.pXk$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pXk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
