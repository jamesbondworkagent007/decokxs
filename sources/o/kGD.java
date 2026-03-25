package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.market.adapter.OptionExpireItem;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.market.fragment.BaseOptionQuoteFragment$handleTradeResult$1;
import com.okinc.business.market.market.fragment.BaseOptionQuoteFragment$onVisible$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.widget.SortTextView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.trade.model.OptionSourceData;
import com.okinc.widget.data.TradeMenuItemBean;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import o.C57664ymg;
import o.kGD;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kGD extends AbstractC32998moE implements MarketToolDialog.TaskDescription {
    public android.widget.LinearLayout AYXKKw;
    public pWA AhwBna;
    public C42673rap AkhnZx;
    public SortTextView.SortType AuCTel;
    public AbstractC54575xNl DbNXlk;
    public C54651xQg EZpvd;
    public java.lang.String KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public SortTextView.SortType copydefault;
    public final Observer<SourceResp<AbstractC54646xQb>> ejfBZ;
    public java.lang.String fARcdN;
    public java.util.Map<java.lang.String, java.lang.String> fIwbmz;
    public boolean fJNWhG;
    public InterfaceC58217yxC hDKMBd;
    public final C59534zip isConnected;
    public java.lang.String iwGUEr;
    public boolean valueOf;
    public kFL values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public java.util.List<OptionExpireItem> fetchVPNInfo = new java.util.ArrayList();
    public final int djBIcL = qZH.ActionBar.QKudOq;
    public MutableLiveData<SourceResp<AbstractC54646xQb>> gEmmrt = new MutableLiveData<>();

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortTextView.SortType.values().length];
            try {
                iArr[SortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SortTextView.SortType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public kGD() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.setHasStableIds(true);
        this.isConnected = c59534zip;
        this.KWHzl = "";
        SortTextView.SortType sortType = SortTextView.SortType.NONE;
        this.AuCTel = sortType;
        this.copydefault = sortType;
        this.fARcdN = "";
        this.iwGUEr = "";
        this.fIwbmz = C56424yEw.gEmmrt(C56390yDp.OLrzqt("C", C33070mpX.AYXKKw(qZH.PendingIntent.DCJXGO)), C56390yDp.OLrzqt("P", C33070mpX.AYXKKw(qZH.PendingIntent.DXXBbs)));
        this.ejfBZ = new Observer() { // from class: o.kGL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                kGD.EZpvd(this.KWHzl, (SourceResp) obj);
            }
        };
        this.fJNWhG = true;
    }

    public static final /* synthetic */ java.lang.Object copydefault(kGD kgd, boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc, Continuation continuation) {
        kgd.KWHzl(z, interfaceC54581xNr, exc);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C55700xor.marketEnsureOKTradeResume$default(C55629xnZ.EZpvd(this), LifecycleOwnerKt.getLifecycleScope(this), null, new BaseOptionQuoteFragment$onVisible$1(this), 2, null);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.OLrzqt;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        C55629xnZ.EZpvd(this).OLrzqt();
        this.gEmmrt.removeObservers(getViewLifecycleOwner());
        this.gEmmrt.removeObserver(this.ejfBZ);
        C54651xQg c54651xQg = this.EZpvd;
        if (c54651xQg != null) {
            c54651xQg.valueOf();
        }
        AbstractC54575xNl abstractC54575xNl = this.DbNXlk;
        if (abstractC54575xNl == null || (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(abstractC54575xNl);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final void EZpvd(final kGD kgd, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (!Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE) || sourceResp.getData() == null) {
            return;
        }
        java.lang.Object data = sourceResp.getData();
        C54651xQg c54651xQg = data instanceof C54651xQg ? (C54651xQg) data : null;
        kgd.EZpvd = c54651xQg;
        if (c54651xQg != null) {
            c54651xQg.OLrzqt(false);
        }
        C54651xQg c54651xQg2 = kgd.EZpvd;
        if (c54651xQg2 != null) {
            if (!kgd.valueOf) {
                kgd.valueOf = true;
                kgd.EZpvd();
            }
            kgd.copydefault();
            c54651xQg2.copydefault(new Function1() { // from class: o.kGA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kGD.copydefault(this.KWHzl, (java.util.ArrayList) obj);
                }
            });
        }
    }

    public static final Unit copydefault(kGD kgd, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        kgd.AEQbTJ((java.util.ArrayList<MarketDataSource>) arrayList);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.kGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                kGD.OLrzqt(this.EZpvd, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.kGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kGD.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        };
        this.hDKMBd = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.kGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                kGD.AEQbTJ(function1, obj);
            }
        });
    }

    public static final void OLrzqt(kGD kgd, InterfaceC58251yxk interfaceC58251yxk) {
        java.util.List<java.lang.String> listOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        C54651xQg c54651xQg = kgd.EZpvd;
        if (c54651xQg != null) {
            java.lang.String strOLrzqt = kgd.OLrzqt();
            listOLrzqt = c54651xQg.OLrzqt(strOLrzqt != null ? strOLrzqt : "");
        } else {
            listOLrzqt = null;
        }
        if (listOLrzqt != null) {
            interfaceC58251yxk.onNext(listOLrzqt);
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final kGD kgd, final java.util.List list) {
        C27555jxR c27555jxR;
        C27555jxR c27555jxR2;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            kgd.fetchVPNInfo.clear();
            Intrinsics.copydefault(list);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Boolean.valueOf(kgd.fetchVPNInfo.add(new OptionExpireItem(pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf((java.lang.String) it.next())), null, 1, null), false))));
            }
            kFL kfl = kgd.values;
            if (kfl != null) {
                java.util.List<OptionExpireItem> list2 = kgd.fetchVPNInfo;
                Intrinsics.copydefault(list2, "");
                kFL.setData$default(kfl, (java.util.ArrayList) list2, null, 2, null);
            }
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list);
            kgd.KWHzl = str != null ? str : "";
            kgd.copydefault();
            kFL kfl2 = kgd.values;
            if (kfl2 != null) {
                kfl2.AEQbTJ(new Function1() { // from class: o.kGM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return kGD.copydefault(this.copydefault, list, ((java.lang.Integer) obj).intValue());
                    }
                });
            }
            android.widget.LinearLayout linearLayout = kgd.AYXKKw;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C42673rap c42673rap = kgd.AkhnZx;
            if (c42673rap != null && (c27555jxR2 = c42673rap.KWHzl) != null) {
                c27555jxR2.setVisibility(0);
            }
            kgd.KWHzl();
        } else {
            android.widget.LinearLayout linearLayout2 = kgd.AYXKKw;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            C42673rap c42673rap2 = kgd.AkhnZx;
            if (c42673rap2 != null && (c27555jxR = c42673rap2.KWHzl) != null) {
                c27555jxR.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(kGD kgd, java.util.List list, int i) {
        kgd.KWHzl = (java.lang.String) list.get(i);
        kgd.copydefault();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.util.ArrayList<MarketDataSource> arrayList) {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.kGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                kGD.KWHzl(this.copydefault, arrayList, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.kGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kGD.copydefault(this.EZpvd, (java.util.List) obj);
            }
        };
        this.OLrzqt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.kGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                kGD.copydefault(function1, obj);
            }
        });
    }

    public static final void KWHzl(kGD kgd, java.util.ArrayList arrayList, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.util.List<pWA> listOLrzqt = kgd.OLrzqt((java.util.ArrayList<MarketDataSource>) arrayList);
        if (listOLrzqt != null) {
            interfaceC58251yxk.onNext(listOLrzqt);
        }
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(kGD kgd, java.util.List list) {
        kgd.AEQbTJ((java.util.List<pWA>) list);
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(OptionSourceData optionSourceData) {
        java.lang.String tradePriceLimitNum = optionSourceData.getTradePriceLimitNum();
        return C33129mqd.OLrzqt((java.lang.CharSequence) tradePriceLimitNum) ? pTB.formatPercentWithSymbol$default(pTB.OLrzqt((java.lang.Object) tradePriceLimitNum), 0, 0, null, null, 15, null) : "--";
    }

    public final void KWHzl(boolean z, InterfaceC54581xNr interfaceC54581xNr, java.lang.Exception exc) {
        if (!z || interfaceC54581xNr == null) {
            return;
        }
        this.gEmmrt.observe(getViewLifecycleOwner(), this.ejfBZ);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseOptionQuoteFragment$handleTradeResult$1(interfaceC54581xNr, this, null));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C27555jxR c27555jxR;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        Intrinsics.checkNotNullParameter(view, "");
        this.AkhnZx = C42673rap.AEQbTJ(view);
        this.AYXKKw = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.GQzpsZ);
        android.content.Context context = getContext();
        this.values = context != null ? new kFL(context) : null;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        C42673rap c42673rap = this.AkhnZx;
        if (c42673rap != null && (recyclerView4 = c42673rap.djBIcL) != null) {
            recyclerView4.setLayoutManager(linearLayoutManager);
        }
        C42673rap c42673rap2 = this.AkhnZx;
        if (c42673rap2 != null && (recyclerView3 = c42673rap2.djBIcL) != null) {
            recyclerView3.setAdapter(this.values);
        }
        C42673rap c42673rap3 = this.AkhnZx;
        if (c42673rap3 != null && (recyclerView2 = c42673rap3.gEmmrt) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C42673rap c42673rap4 = this.AkhnZx;
        if (c42673rap4 != null && (recyclerView = c42673rap4.gEmmrt) != null) {
            recyclerView.setAdapter(this.isConnected);
        }
        this.isConnected.register(pWA.class, new Application(this, C27550jxM.KWHzl.OLrzqt()));
        C42673rap c42673rap5 = this.AkhnZx;
        if (c42673rap5 != null && (c27555jxR = c42673rap5.KWHzl) != null) {
            c27555jxR.setListener(new Function1() { // from class: o.kGE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kGD.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            }, new Function2() { // from class: o.kGB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return kGD.KWHzl(this.OLrzqt, (SortTextView.SortType) obj, (SortTextView.SortType) obj2);
                }
            });
        }
        this.DbNXlk = new TaskDescription(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            AbstractC54575xNl abstractC54575xNl = this.DbNXlk;
            Intrinsics.copydefault(abstractC54575xNl);
            interfaceC54581xNrOLrzqt.EZpvd(abstractC54575xNl);
        }
        valueOf();
        KWHzl(true);
    }

    public static final Unit EZpvd(kGD kgd, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        kgd.AEQbTJ(java.lang.String.valueOf(tradeMenuItemBean.getData()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final kGD kgd, int i) {
        if (i == 0) {
            Function1<? super TradeMenuItemBean, Unit> function1 = new Function1() { // from class: o.kGF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kGD.EZpvd(this.EZpvd, (TradeMenuItemBean) obj);
                }
            };
            java.util.List<TradeMenuItemBean> listAEQbTJ = kgd.AEQbTJ();
            java.lang.String string = kgd.getString(qZH.PendingIntent.AxsJAYaxsJAY);
            Intrinsics.checkNotNullExpressionValue(string, "");
            kgd.OLrzqt(function1, listAEQbTJ, string);
        } else if (i == 1) {
            Function1<? super TradeMenuItemBean, Unit> function12 = new Function1() { // from class: o.kGJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kGD.AEQbTJ(this.OLrzqt, (TradeMenuItemBean) obj);
                }
            };
            java.util.List<TradeMenuItemBean> listGEmmrt = kgd.gEmmrt();
            java.lang.String string2 = kgd.getString(qZH.PendingIntent.ODWQjV);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            kgd.OLrzqt(function12, listGEmmrt, string2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(kGD kgd, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        kgd.KWHzl(java.lang.String.valueOf(tradeMenuItemBean.getData()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(kGD kgd, SortTextView.SortType sortType, SortTextView.SortType sortType2) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(sortType2, "");
        kgd.AuCTel = sortType;
        kgd.copydefault = sortType2;
        kgd.copydefault();
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends AbstractC54575xNl {
        public TaskDescription(java.lang.String str) {
            super(str, "OPTION");
        }

        @Override // o.AbstractC54575xNl
        public void OLrzqt() {
            C54651xQg c54651xQg = kGD.this.EZpvd;
            if (c54651xQg != null) {
                c54651xQg.valueOf();
            }
            kGD.this.onVisible();
        }
    }

    public final void KWHzl() {
        java.lang.String strAYXKKw;
        C27555jxR c27555jxR;
        java.lang.String strAYXKKw2 = C33129mqd.OLrzqt((java.lang.CharSequence) this.fARcdN) ? this.fARcdN : C33070mpX.AYXKKw(qZH.PendingIntent.dxcTrN);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.iwGUEr)) {
            strAYXKKw = this.fIwbmz.get(this.iwGUEr);
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dNxZaP);
        }
        C42673rap c42673rap = this.AkhnZx;
        if (c42673rap == null || (c27555jxR = c42673rap.KWHzl) == null) {
            return;
        }
        c27555jxR.setData(new java.lang.String[]{strAYXKKw2, strAYXKKw, C33070mpX.AYXKKw(qZH.PendingIntent.fZBcTu), C33070mpX.AYXKKw(qZH.PendingIntent.fFgQHt)});
    }

    private final void AEQbTJ(java.util.List<pWA> list) {
        C33546myW c33546myW;
        C42934rfl c42934rfl;
        android.widget.LinearLayout root;
        C33546myW c33546myW2;
        C42934rfl c42934rfl2;
        android.widget.LinearLayout root2;
        KWHzl(false);
        if (list == null || list.isEmpty()) {
            C42673rap c42673rap = this.AkhnZx;
            if (c42673rap != null && (c42934rfl = c42673rap.EZpvd) != null && (root = c42934rfl.getRoot()) != null) {
                root.setVisibility(0);
            }
            C42673rap c42673rap2 = this.AkhnZx;
            if (c42673rap2 == null || (c33546myW = c42673rap2.valueOf) == null) {
                return;
            }
            c33546myW.setVisibility(8);
            return;
        }
        this.isConnected.setItems(list);
        this.isConnected.notifyDataSetChanged();
        C42673rap c42673rap3 = this.AkhnZx;
        if (c42673rap3 != null && (c42934rfl2 = c42673rap3.EZpvd) != null && (root2 = c42934rfl2.getRoot()) != null) {
            root2.setVisibility(8);
        }
        C42673rap c42673rap4 = this.AkhnZx;
        if (c42673rap4 == null || (c33546myW2 = c42673rap4.valueOf) == null) {
            return;
        }
        c33546myW2.setVisibility(0);
    }

    public final void AEQbTJ(java.lang.String str) {
        this.fARcdN = str;
        KWHzl();
        copydefault();
    }

    public final void KWHzl(java.lang.String str) {
        this.iwGUEr = str;
        KWHzl();
        copydefault();
    }

    public final java.util.List<TradeMenuItemBean> AEQbTJ() {
        java.util.List<java.lang.String> listAEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.dxcTrN);
        java.lang.String str = this.fARcdN;
        arrayList.add(new TradeMenuItemBean(strAYXKKw, str == null || str.length() == 0, "", null, false, null, 56, null));
        C54651xQg c54651xQg = this.EZpvd;
        if (c54651xQg != null && (listAEQbTJ = c54651xQg.AEQbTJ(OLrzqt())) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (java.lang.String str2 : listAEQbTJ) {
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.add(new TradeMenuItemBean(pTB.formatLocalized$default(str2, null, 1, null), Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.fARcdN), str2, null, false, null, 56, null))));
            }
        }
        return arrayList;
    }

    private final java.util.List<TradeMenuItemBean> gEmmrt() {
        java.util.List<java.lang.String> listEZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dNxZaP);
        java.lang.String str = this.iwGUEr;
        arrayList.add(new TradeMenuItemBean(strAYXKKw, str == null || str.length() == 0, "", null, false, null, 56, null));
        C54651xQg c54651xQg = this.EZpvd;
        if (c54651xQg != null && (listEZpvd = c54651xQg.EZpvd(OLrzqt())) != null) {
            for (java.lang.String str2 : listEZpvd) {
                java.lang.String str3 = this.fIwbmz.get(str2);
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new TradeMenuItemBean(str3, Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.iwGUEr), str2, null, false, null, 56, null));
            }
        }
        return arrayList;
    }

    public final void copydefault() {
        java.lang.String str;
        SortTextView.SortType sortType = this.AuCTel;
        int[] iArr = StateListAnimator.copydefault;
        int i = iArr[sortType.ordinal()];
        if (i == 1) {
            str = "price_ascending_sort";
        } else if (i == 2) {
            str = "price_descending_sort";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = iArr[this.copydefault.ordinal()];
            if (i2 == 1) {
                str = "applies_ascending_sort";
            } else if (i2 == 2) {
                str = "applies_descending_sort";
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
        }
        C54651xQg c54651xQg = this.EZpvd;
        if (c54651xQg != null) {
            c54651xQg.djBIcL(str);
        }
        C54651xQg c54651xQg2 = this.EZpvd;
        if (c54651xQg2 != null) {
            java.lang.String strOLrzqt = OLrzqt();
            Intrinsics.copydefault((java.lang.Object) strOLrzqt);
            c54651xQg2.KWHzl(strOLrzqt, this.KWHzl, this.fARcdN, this.iwGUEr);
        }
    }

    public final void OLrzqt(Function1<? super TradeMenuItemBean, Unit> function1, java.util.List<TradeMenuItemBean> list, java.lang.String str) {
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, str, false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "OldOptionQuoteFragmentDialog");
        c57664ymgNewInstance$default.EZpvd(new Dialog(function1));
    }

    public static final class Dialog implements C57664ymg.StateListAnimator {
        public final /* synthetic */ Function1<TradeMenuItemBean, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.widget.data.TradeMenuItemBean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(Function1<? super TradeMenuItemBean, Unit> function1) {
            this.AEQbTJ = function1;
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            this.AEQbTJ.invoke(tradeMenuItemBean);
        }
    }

    public static final class Application extends AbstractC59533zio<pWA, StateListAnimator> {
        public final boolean AEQbTJ;
        public final androidx.fragment.app.Fragment EZpvd;

        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final android.widget.TextView AEQbTJ;
            public final android.widget.TextView EZpvd;
            public final /* synthetic */ Application KWHzl;
            public final android.widget.TextView OLrzqt;
            public final android.widget.TextView copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView copydefault() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Application application, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.KWHzl = application;
                android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.dtVxwd);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(qZH.StateListAnimator.DzCpqu);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.OLrzqt = (android.widget.TextView) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(qZH.StateListAnimator.OxVOHk);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.copydefault = (android.widget.TextView) viewFindViewById4;
            }
        }

        public Application(@NotNull androidx.fragment.app.Fragment fragment, boolean z) {
            Intrinsics.checkNotNullParameter(fragment, "");
            this.EZpvd = fragment;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public long getItemId(@NotNull pWA pwa) {
            Intrinsics.checkNotNullParameter(pwa, "");
            return pwa.KWHzl().hashCode();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.flVtFt, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final pWA pwa) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(pwa, "");
            stateListAnimator.EZpvd().setText(pwa.EZpvd());
            stateListAnimator.OLrzqt().setText(pwa.valueOf());
            stateListAnimator.copydefault().setText(C33129mqd.OLrzqt((java.lang.CharSequence) pwa.AEQbTJ()) ? pwa.AEQbTJ() : "--");
            stateListAnimator.AEQbTJ().setText(pTF.KWHzl.AEQbTJ(pwa.copydefault()));
            android.content.Context context = stateListAnimator.itemView.getContext();
            if (C33129mqd.AEQbTJ(pwa.OLrzqt()) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                stateListAnimator.AEQbTJ().setBackgroundResource(C52761wXj.TaskDescription.HJWChPHhYHK);
                if (this.AEQbTJ) {
                    android.widget.TextView textViewAEQbTJ = stateListAnimator.AEQbTJ();
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    Intrinsics.copydefault(context);
                    textViewAEQbTJ.setTextColor(C33512mxp.tradeFall$default(c33512mxp, context, 0.0f, 2, null));
                    stateListAnimator.AEQbTJ().setBackgroundTintList(android.content.res.ColorStateList.valueOf(c33512mxp.fJNWhG(context, 0.1f)));
                } else {
                    android.widget.TextView textViewAEQbTJ2 = stateListAnimator.AEQbTJ();
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    android.content.Context context2 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    textViewAEQbTJ2.setTextColor(C33512mxp.tradeFallHighlightsContent$default(c33512mxp2, context2, 0.0f, 2, null));
                    android.widget.TextView textViewAEQbTJ3 = stateListAnimator.AEQbTJ();
                    android.content.Context context3 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    textViewAEQbTJ3.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33512mxp.tradeFallHighlightsFill$default(c33512mxp2, context3, 0.0f, 2, null)));
                }
            } else if (C33129mqd.AEQbTJ(pwa.OLrzqt()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                stateListAnimator.AEQbTJ().setBackgroundResource(C52761wXj.TaskDescription.RhjxDW);
                if (this.AEQbTJ) {
                    android.widget.TextView textViewAEQbTJ4 = stateListAnimator.AEQbTJ();
                    C33512mxp c33512mxp3 = C33512mxp.AEQbTJ;
                    Intrinsics.copydefault(context);
                    textViewAEQbTJ4.setTextColor(C33512mxp.tradeRise$default(c33512mxp3, context, 0.0f, 2, null));
                    stateListAnimator.AEQbTJ().setBackgroundTintList(android.content.res.ColorStateList.valueOf(c33512mxp3.zsXlph(context, 0.1f)));
                } else {
                    android.widget.TextView textViewAEQbTJ5 = stateListAnimator.AEQbTJ();
                    C33512mxp c33512mxp4 = C33512mxp.AEQbTJ;
                    android.content.Context context4 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    textViewAEQbTJ5.setTextColor(C33512mxp.tradeRiseHighlightsContent$default(c33512mxp4, context4, 0.0f, 2, null));
                    android.widget.TextView textViewAEQbTJ6 = stateListAnimator.AEQbTJ();
                    android.content.Context context5 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    textViewAEQbTJ6.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33512mxp.tradeRiseHighlightsFill$default(c33512mxp4, context5, 0.0f, 2, null)));
                }
            } else {
                stateListAnimator.AEQbTJ().setBackgroundResource(qZH.Activity.EZpvd);
                if (this.AEQbTJ) {
                    stateListAnimator.AEQbTJ().setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo));
                    stateListAnimator.AEQbTJ().setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33522mxz.OLrzqt(C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo), 0.1f)));
                } else {
                    android.widget.TextView textViewAEQbTJ7 = stateListAnimator.AEQbTJ();
                    int i = C52761wXj.ActionBar.QSBOWP;
                    android.content.Context context6 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    textViewAEQbTJ7.setTextColor(C55366xib.KWHzl(i, context6));
                    android.widget.TextView textViewAEQbTJ8 = stateListAnimator.AEQbTJ();
                    int i2 = C52761wXj.ActionBar.RdAHlO;
                    android.content.Context context7 = stateListAnimator.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    textViewAEQbTJ8.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C55366xib.KWHzl(i2, context7)));
                }
            }
            stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.kGR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    kGD.Application.AEQbTJ(this.OLrzqt, pwa, view);
                }
            });
            stateListAnimator.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.kGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return kGD.Application.EZpvd(this.OLrzqt, pwa, view);
                }
            });
        }

        public static final void AEQbTJ(Application application, pWA pwa, android.view.View view) {
            android.content.Context contextRequireContext = application.EZpvd.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            application.EZpvd(contextRequireContext, pwa.KWHzl(), "OPTION");
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.market.market.dialog.MarketToolDialog.Activity.showAtPosition$default(com.okinc.business.market.market.dialog.MarketToolDialog$Activity, androidx.fragment.app.Fragment, java.lang.String, int, boolean, java.lang.String, boolean, boolean, int, java.lang.Object):void */
        public static final boolean EZpvd(Application application, pWA pwa, android.view.View view) {
            androidx.fragment.app.Fragment fragment = application.EZpvd;
            kGD kgd = fragment instanceof kGD ? (kGD) fragment : null;
            if (kgd != null) {
                kgd.AhwBna = pwa;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            MarketToolDialog.Activity activity = MarketToolDialog.Companion;
            androidx.fragment.app.Fragment fragment2 = application.EZpvd;
            java.lang.String name = Application.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            activity.copydefault(fragment2, name, iArr[1], pwa.djBIcL(), "option_list", (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? false : false);
            return true;
        }

        public final void EZpvd(android.content.Context context, final java.lang.String str, final java.lang.String str2) {
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.kGS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kGD.Application.KWHzl(str, str2, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka != null) {
                oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "page_info", null, null, null, "Discover_Market", null, null, 1772, null);
            }
        }

        public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("deal_name", str, false);
            eventParamsList.put("deal_type", str2, false);
            eventParamsList.put("sub_tab", "derivative", false);
            return Unit.INSTANCE;
        }
    }

    private final java.lang.String OLrzqt() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("name")) == null) ? "" : string;
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        Intrinsics.checkNotNullParameter(action, "");
        pWA pwa = this.AhwBna;
        if (pwa != null) {
            C27858kFy.EZpvd.OLrzqt(this, C38381pWr.KWHzl.OLrzqt(pwa), this.EZpvd, "markets_discover", new Function0() { // from class: o.kGK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kGD.AEQbTJ(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit AEQbTJ(kGD kgd) {
        kgd.copydefault();
        return Unit.INSTANCE;
    }

    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                kGD.this.onInvisible();
            } else if (kGD.this.isVisible()) {
                kGD.this.onVisible();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    private final void valueOf() {
        RecyclerView recyclerView;
        C42673rap c42673rap = this.AkhnZx;
        if (c42673rap == null || (recyclerView = c42673rap.gEmmrt) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Activity());
    }

    private final void KWHzl(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.fJNWhG || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DcMfJKdMCrTj)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.fJNWhG = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public final java.util.List<pWA> OLrzqt(java.util.ArrayList<MarketDataSource> arrayList) {
        if (arrayList == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (MarketDataSource marketDataSource : arrayList) {
            Intrinsics.copydefault(marketDataSource, "");
            OptionSourceData optionSourceData = (OptionSourceData) marketDataSource;
            java.lang.String bizInstId = marketDataSource.getBizInstId();
            java.lang.String stk = optionSourceData.getStk();
            java.lang.String str = this.fIwbmz.get(optionSourceData.getOptType());
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String optionChargePrice$default = xTM.formatOptionChargePrice$default(xTM.AEQbTJ, marketDataSource, false, 2, null);
            java.lang.String strCopydefault = copydefault(optionSourceData);
            java.lang.Boolean boolIsWatching = marketDataSource.isWatching();
            arrayList2.add(new pWA(bizInstId, stk, str2, optionChargePrice$default, strCopydefault, boolIsWatching != null ? boolIsWatching.booleanValue() : false, optionSourceData.getTradePriceLimitNum()));
        }
        return arrayList2;
    }
}
