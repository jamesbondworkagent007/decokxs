package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.find_ui.data.BigDataTimeIntervalItem;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34832njr extends AbstractC32996moC {
    public android.widget.LinearLayout DbNXlk;
    public android.widget.LinearLayout ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public android.widget.LinearLayout fIwbmz;
    public xOW getFieldNames;
    public C55173xeu iwGUEr;
    public C55113xdn uzCIH;
    public C35144npl values;
    public C54822xWp wlaJM;
    public final int copydefault = 400;
    public final java.lang.String KWHzl = "5m";
    public final java.lang.String OLrzqt = "1m";
    public final java.lang.String EZpvd = "1D";
    public final java.lang.String AEQbTJ = "1H";
    public final java.lang.String AYXKKw = OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
    public final java.lang.String AhwBna = "cont";
    public final java.lang.String djBIcL = "usds";
    public java.util.ArrayList<BigDataTimeIntervalItem> getNewProxyInstance = new java.util.ArrayList<>();
    public MarketCoinInfo AuCTel = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
    public java.lang.String valueOf = "5m";
    public java.lang.String gEmmrt = "";
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String hDKMBd = "";
    public java.lang.String zsXlph = "cont";
    public java.lang.String zLjUOn = "BTC";
    public int isConnected = -1;
    public boolean AkhnZx = true;
    public Observer<MarketCoinInfo> fJNWhG = new Observer() { // from class: o.njp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC34832njr.EZpvd(this.EZpvd, (MarketCoinInfo) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    public abstract void AEQbTJ(java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35144npl AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.AYXKKw;
    }

    public abstract void AuCTelauCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.LinearLayout DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    public abstract void KWHzl(@NotNull android.view.View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<BigDataTimeIntervalItem> isConnected() {
        return this.getNewProxyInstance;
    }

    public abstract void iwGUEr();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.OLrzqt;
    }

    public abstract int wlaJM();

    public AbstractC34832njr() {
        final Function0 function0 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C34859nkR.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.bigdataui.BaseBigDataFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.bigdataui.BaseBigDataFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.bigdataui.BaseBigDataFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final C34859nkR AkhnZx() {
        return (C34859nkR) this.fARcdN.getValue();
    }

    public static final void EZpvd(AbstractC34832njr abstractC34832njr, MarketCoinInfo marketCoinInfo) {
        java.lang.String tradeSymbol;
        java.lang.String displayQuoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        BizInstrument bizInstrumentValueOf2;
        java.lang.String quoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn4;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4;
        AbstractC54531xLw abstractC54531xLwOLrzqt4;
        BizInstrument bizInstrumentValueOf3;
        InterfaceC54577xNn interfaceC54577xNn5;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt5;
        AbstractC54531xLw abstractC54531xLwOLrzqt5;
        BizInstrument bizInstrumentValueOf4;
        InterfaceC54577xNn interfaceC54577xNn6;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt6;
        AbstractC54531xLw abstractC54531xLwOLrzqt6;
        BizInstrument bizInstrumentValueOf5;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        if (Intrinsics.EZpvd((java.lang.Object) abstractC34832njr.AuCTel.getInstrumentId(), (java.lang.Object) marketCoinInfo.getInstrumentId()) && Intrinsics.EZpvd((java.lang.Object) abstractC34832njr.AuCTel.getInstrumentType(), (java.lang.Object) marketCoinInfo.getInstrumentType())) {
            return;
        }
        abstractC34832njr.AuCTel.setInstrumentId(marketCoinInfo.getInstrumentId());
        abstractC34832njr.AuCTel.setInstrumentType(marketCoinInfo.getInstrumentType());
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        abstractC34832njr.AkhnZx = (interfaceC49425uoM == null || (interfaceC54577xNn6 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt6 = interfaceC54577xNn6.OLrzqt()) == null || (abstractC54531xLwOLrzqt6 = interfaceC54581xNrOLrzqt6.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf5 = abstractC54531xLwOLrzqt6.valueOf(marketCoinInfo.getInstrumentId())) == null) ? true : bizInstrumentValueOf5.isPositiveContract();
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM2 == null || (interfaceC54577xNn5 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt5 = interfaceC54577xNn5.OLrzqt()) == null || (abstractC54531xLwOLrzqt5 = interfaceC54581xNrOLrzqt5.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf4 = abstractC54531xLwOLrzqt5.valueOf(marketCoinInfo.getInstrumentId())) == null || (tradeSymbol = bizInstrumentValueOf4.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        abstractC34832njr.gEmmrt = tradeSymbol;
        InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM3 == null || (interfaceC54577xNn4 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt4 = interfaceC54577xNn4.OLrzqt()) == null || (abstractC54531xLwOLrzqt4 = interfaceC54581xNrOLrzqt4.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf3 = abstractC54531xLwOLrzqt4.valueOf(marketCoinInfo.getInstrumentId())) == null || (displayQuoteSymbol = bizInstrumentValueOf3.getDisplayQuoteSymbol()) == null) {
            displayQuoteSymbol = "";
        }
        abstractC34832njr.fetchVPNInfo = displayQuoteSymbol;
        InterfaceC49425uoM interfaceC49425uoM4 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM4 != null && (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM4.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) != null && (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt3.OLrzqt(marketCoinInfo.getInstrumentType())) != null && (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt3.valueOf(marketCoinInfo.getInstrumentId())) != null && (quoteSymbol = bizInstrumentValueOf2.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        abstractC34832njr.hDKMBd = str;
        InterfaceC49425uoM interfaceC49425uoM5 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String strFIwbmz = null;
        java.lang.String instFamily = (interfaceC49425uoM5 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM5.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(marketCoinInfo.getInstrumentType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt2.valueOf(marketCoinInfo.getInstrumentId())) == null) ? null : bizInstrumentValueOf.getInstFamily();
        abstractC34832njr.isConnected = -1;
        if (instFamily != null) {
            InterfaceC49425uoM interfaceC49425uoM6 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM6 != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM6.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfo.getInstrumentType())) != null) {
                strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
            }
            abstractC34832njr.isConnected = C33129mqd.AhwBna(strFIwbmz);
        }
        if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES")) {
            abstractC34832njr.EZpvd(marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType());
        }
        abstractC34832njr.zsXlph();
        abstractC34832njr.AEQbTJ(java.lang.Boolean.TRUE);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        java.lang.String string2;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentValueOf = null;
        this.getFieldNames = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.getNewProxyInstance() : null;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault.djBIcL(str2)) != null) {
            bizInstrumentValueOf = abstractC54531xLwDjBIcL.valueOf(str);
        }
        if (bizInstrumentValueOf != null) {
            boolean zIsPositiveContract = bizInstrumentValueOf.isPositiveContract();
            java.lang.String str5 = "";
            if (zIsPositiveContract) {
                xOW xow = this.getFieldNames;
                if (xow != null) {
                    java.lang.String strIwGUEr = xow.iwGUEr();
                    if (Intrinsics.EZpvd((java.lang.Object) strIwGUEr, (java.lang.Object) "0")) {
                        str4 = this.AYXKKw;
                    } else {
                        str4 = Intrinsics.EZpvd((java.lang.Object) strIwGUEr, (java.lang.Object) "1") ? this.AhwBna : this.djBIcL;
                    }
                    this.zsXlph = str4;
                    java.lang.String strIwGUEr2 = xow.iwGUEr();
                    if (Intrinsics.EZpvd((java.lang.Object) strIwGUEr2, (java.lang.Object) "0")) {
                        str5 = this.gEmmrt;
                    } else if (Intrinsics.EZpvd((java.lang.Object) strIwGUEr2, (java.lang.Object) "1")) {
                        android.content.Context context = getContext();
                        if (context != null && (string2 = context.getString(C55688xof.Application.RgaQzq)) != null) {
                            str5 = string2;
                        }
                    } else {
                        str5 = this.fetchVPNInfo;
                    }
                    this.zLjUOn = str5;
                }
            } else {
                xOW xow2 = this.getFieldNames;
                if (xow2 != null) {
                    java.lang.String strOLrzqt = xow2.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0")) {
                        str3 = this.AYXKKw;
                    } else {
                        str3 = Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "1") ? this.AhwBna : this.djBIcL;
                    }
                    this.zsXlph = str3;
                    java.lang.String strOLrzqt2 = xow2.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt2, (java.lang.Object) "0")) {
                        str5 = this.gEmmrt;
                    } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt2, (java.lang.Object) "1")) {
                        android.content.Context context2 = getContext();
                        if (context2 != null && (string = context2.getString(C55688xof.Application.RgaQzq)) != null) {
                            str5 = string;
                        }
                    } else {
                        str5 = this.fetchVPNInfo;
                    }
                    this.zLjUOn = str5;
                }
            }
            C43296rmc.KWHzl(getTAG(), "getUnitType: unitTitle = " + this.zLjUOn);
        }
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return wlaJM();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.values = (C35144npl) view.findViewById(qZH.StateListAnimator.FSMca);
        this.fIwbmz = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.GPCHlQ);
        this.ejfBZ = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.OzhFjl);
        this.DbNXlk = (android.widget.LinearLayout) view.findViewById(qZH.StateListAnimator.Swccd);
        this.iwGUEr = (C55173xeu) view.findViewById(qZH.StateListAnimator.iWlNch);
        this.uzCIH = (C55113xdn) view.findViewById(qZH.StateListAnimator.ibnZAm);
        KWHzl(view);
        zLjUOn();
        AuCTelauCTel();
        iwGUEr();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            C54822xWp c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
            if (c54822xWp != null) {
                this.wlaJM = c54822xWp;
                C55173xeu c55173xeu = this.iwGUEr;
                if (c55173xeu != null) {
                    c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.njv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            AbstractC34832njr.KWHzl(this.copydefault, view2);
                        }
                    });
                    return;
                }
                return;
            }
        }
        pUU.copydefault("KlineFragment", "Activity is null, cannot init sharedViewModel");
    }

    public static final void KWHzl(AbstractC34832njr abstractC34832njr, android.view.View view) {
        C55173xeu c55173xeu = abstractC34832njr.iwGUEr;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        abstractC34832njr.AEQbTJ(java.lang.Boolean.TRUE);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C54822xWp c54822xWp = this.wlaJM;
        if (c54822xWp == null) {
            Intrinsics.gEmmrt("");
            c54822xWp = null;
        }
        c54822xWp.KWHzl().observe(getViewLifecycleOwner(), this.fJNWhG);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C54822xWp c54822xWp = this.wlaJM;
        if (c54822xWp == null) {
            Intrinsics.gEmmrt("");
            c54822xWp = null;
        }
        c54822xWp.KWHzl().removeObserver(this.fJNWhG);
    }

    public static /* synthetic */ void initData$default(AbstractC34832njr abstractC34832njr, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initData");
        }
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        abstractC34832njr.AEQbTJ(bool);
    }

    public void zLjUOn() {
        this.getNewProxyInstance.clear();
        java.util.ArrayList<BigDataTimeIntervalItem> arrayList = this.getNewProxyInstance;
        arrayList.add(new BigDataTimeIntervalItem(5, "5m", java.lang.Boolean.TRUE));
        arrayList.add(new BigDataTimeIntervalItem(15, "15m", null, 4, null));
        arrayList.add(new BigDataTimeIntervalItem(60, "1H", null, 4, null));
        arrayList.add(new BigDataTimeIntervalItem(PsExtractor.VIDEO_STREAM_MASK, "4H", null, 4, null));
        arrayList.add(new BigDataTimeIntervalItem(1440, "1D", null, 4, null));
        C35144npl c35144npl = this.values;
        if (c35144npl != null) {
            c35144npl.setData(this.getNewProxyInstance);
        }
        C35144npl c35144npl2 = this.values;
        if (c35144npl2 != null) {
            c35144npl2.setTimeSelectCallBack(new Function1() { // from class: o.njz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34832njr.copydefault(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit copydefault(AbstractC34832njr abstractC34832njr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        abstractC34832njr.valueOf = str;
        initData$default(abstractC34832njr, null, 1, null);
        abstractC34832njr.KWHzl();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        if (this instanceof C34791njC) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KLine_TradingData_MoneyDistributionTimeInterval_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.njy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34832njr.AhwBna(this.KWHzl, (EventParamsList) obj);
                }
            });
            return;
        }
        if (this instanceof C34879nkl) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KLine_TradingData_MarginLongShortTimeInterval_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.njx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34832njr.valueOf(this.OLrzqt, (EventParamsList) obj);
                }
            });
        } else if (this instanceof C34881nkn) {
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KLine_TradingData_OpenInterestTimeInterval_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.njw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34832njr.gEmmrt(this.EZpvd, (EventParamsList) obj);
                }
            });
        } else if (this instanceof C34806njR) {
            TrackChannel[] trackChannelArrCopydefault4 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KLine_TradingData_ActiveBuySellTimeInterval_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault4, trackChannelArrCopydefault4.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.njB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC34832njr.djBIcL(this.copydefault, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit AhwBna(AbstractC34832njr abstractC34832njr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("time_interval", abstractC34832njr.valueOf, true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(AbstractC34832njr abstractC34832njr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("time_interval", abstractC34832njr.valueOf, true);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractC34832njr abstractC34832njr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("time_interval", abstractC34832njr.valueOf, true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC34832njr abstractC34832njr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("time_interval", abstractC34832njr.valueOf, true);
        return Unit.INSTANCE;
    }

    public final void zuBGHE() {
        android.widget.LinearLayout linearLayout = this.ejfBZ;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        C55173xeu c55173xeu = this.iwGUEr;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.fIwbmz;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AxsJAY() {
        hDKMBd();
        android.widget.LinearLayout linearLayout = this.fIwbmz;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.DbNXlk;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    public final void getFieldNames() {
        android.widget.LinearLayout linearLayout = this.ejfBZ;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.DbNXlk;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout3 = this.fIwbmz;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    public final void hDKMBd() {
        android.widget.LinearLayout linearLayout = this.ejfBZ;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = this.fIwbmz;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void gHZMYf() {
        android.widget.LinearLayout linearLayout = this.fIwbmz;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void uzCIH() {
        android.widget.LinearLayout linearLayout = this.fIwbmz;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    public final void AwvSrB() {
        C55173xeu c55173xeu = this.iwGUEr;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        C55113xdn c55113xdn = this.uzCIH;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.uzCIH;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.uzCIH;
        if (c55113xdn3 != null) {
            C55113xdn.showLoading$default(c55113xdn3, 0L, 1, null);
        }
    }

    public final void getNewProxyInstance() {
        C55113xdn c55113xdn = this.uzCIH;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.uzCIH;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }

    public java.lang.String OLrzqt(double d, int i) {
        return pTB.formatDownToFixed$default(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), i, null, 2, null);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.nju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC34832njr.AYXKKw(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AYXKKw(AbstractC34832njr abstractC34832njr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_pair", abstractC34832njr.AuCTel.getInstrumentId(), false);
        eventParamsList.put("biz_type", abstractC34832njr.AuCTel.getInstrumentType(), true);
        return Unit.INSTANCE;
    }

    public void zsXlph() {
        this.valueOf = this.KWHzl;
        int i = 0;
        for (java.lang.Object obj : this.getNewProxyInstance) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((BigDataTimeIntervalItem) obj).setSelect(i == 0);
            i++;
        }
        C35144npl c35144npl = this.values;
        if (c35144npl != null) {
            c35144npl.setData(this.getNewProxyInstance);
        }
    }
}
