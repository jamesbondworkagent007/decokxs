package o;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.KLineNewCoinFragment$initCoinAuction$1$1$1;
import com.okinc.kline.ui.KLineNewCoinFragment$initPreQuote$1$1$1;
import com.okinc.kline.ui.KLineNewCoinFragment$updateMarketCoin$2;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradelite.bean.TradeLoadingMode;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CallAuctionInfoData;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.PreQuoteInfoData;
import com.okinc.unify_trade.biz.SystemTimeData;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.constants.MarketTypeEnum;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.InterfaceC39563puh;
import o.InterfaceC54581xNr;
import o.pXL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pcC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38580pcC extends oYA {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int RdAHlO = 8;
    public int DCUTEIdCUTEI;
    public C55173xeu DCUTEIddSDPG;
    public C39837pzq DGOPHZ;
    public android.view.View DGUQLI;
    public android.widget.ImageView DLWbHP;
    public InterfaceC58217yxC DWgRXt;
    public C33546myW KDccX;
    public InterfaceC58217yxC ODXsMY;
    public android.widget.ImageView OFhtUX;
    public android.widget.ImageView OJuSTm;
    public InterfaceC39501ptY OxVOHk;
    public android.widget.LinearLayout QCjLjM;
    public android.widget.ImageView QSLkRj;
    public android.widget.ImageView QVsKAR;
    public android.widget.LinearLayout QwvEab;
    public AbstractC55757xpv USBtdM;
    public boolean UlJrfe;
    public InterfaceC58217yxC aUsmxb;
    public InterfaceC58217yxC call;
    public android.widget.LinearLayout dUDNAs;
    public C39798pzD fERRXa;
    public android.widget.HorizontalScrollView fHqPtx;
    public pXL fdOvFl;
    public C39816pzV fjfviF;
    public BizInstrument gwTjWJ;
    public BizInstrument hBpjJd;
    public android.view.View hCLrkq;
    public boolean hrNTAI;
    public C38908piM htlTjW;
    public AbstractC55759xpx igXuih;
    public android.widget.LinearLayout ixgjPv;
    public TabLayout spnCvw;
    public int DcqEDu = Color.parseColor("#F9F9F9");
    public int UrRBLY = Color.parseColor("#000000");
    public MarketTopInfo DBxZfM = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 16777215, null);
    public java.lang.String dHguZz = "ONLINING";
    public java.lang.String OHqIaq = "";
    public java.lang.String WS = "";
    public java.lang.String DGOPHZDGOPHZ = "";
    public java.lang.String run = "";
    public java.lang.String Dmq = "0";
    public java.util.ArrayList<WatchListData> zblBkD = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.oYA
    public boolean ODWQjV() {
        return true;
    }

    @Override // o.oYA
    public void accept() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC39501ptY interfaceC39501ptY) {
        Intrinsics.checkNotNullParameter(interfaceC39501ptY, "");
        this.OxVOHk = interfaceC39501ptY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.finit;
    }

    /* JADX INFO: renamed from: o.pcC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pcC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38580pcC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull InterfaceC39502ptZ interfaceC39502ptZ) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(interfaceC39502ptZ, "");
            C38580pcC c38580pcC = new C38580pcC();
            c38580pcC.OLrzqt(interfaceC39502ptZ);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcExtraKeys.MODE, str);
            bundle.putString(oLT.gEmmrt(), str2);
            bundle.putString(oLT.valueOf(), str3);
            bundle.putString("bizStatus", str4);
            bundle.putString(RemoteMessageConst.Notification.ICON, str5);
            bundle.putString("onlineTime", str6);
            bundle.putString("type", str7);
            bundle.putString("noticeUrl", str8);
            c38580pcC.setArguments(bundle);
            return c38580pcC;
        }
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KLineNewCoinFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        C39798pzD c39798pzD = this.fERRXa;
        if (c39798pzD != null) {
            c39798pzD.KWHzl(this.hrNTAI);
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(50L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.copydefault(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pcQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38580pcC.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.pcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.AYXKKw((java.lang.Throwable) obj);
            }
        };
        this.aUsmxb = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38580pcC.values(function12, obj);
            }
        });
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C38580pcC c38580pcC, java.lang.Long l) {
        java.lang.String str = c38580pcC.Dmq;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            c38580pcC.OFhtUX();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            c38580pcC.QVsKAR();
        } else {
            checkPreQuoteState$default(c38580pcC, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.oYA, o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.DWgRXt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C39837pzq c39837pzq = this.DGOPHZ;
        if (c39837pzq != null) {
            c39837pzq.OLrzqt();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.aUsmxb;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        aUsmxb();
        dUDNAs();
    }

    @Override // o.oYA, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C39837pzq c39837pzq = this.DGOPHZ;
        if (c39837pzq != null) {
            c39837pzq.OLrzqt();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.DWgRXt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.ODXsMY;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.call;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    @Override // o.oYA, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String safeString$default;
        java.lang.String tradeSymbol;
        java.lang.String quoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo2;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        AEQbTJ(arguments != null ? arguments.getString(oLT.gEmmrt()) : null);
        android.os.Bundle arguments2 = getArguments();
        AhwBna(arguments2 != null ? arguments2.getString(oLT.valueOf()) : null);
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str2 = "ONLINING";
        if (arguments3 != null && (string = arguments3.getString("bizStatus", "ONLINING")) != null) {
            str2 = string;
        }
        this.dHguZz = str2;
        android.os.Bundle arguments4 = getArguments();
        this.OHqIaq = C33129mqd.gEmmrt(arguments4 != null ? arguments4.getString(RemoteMessageConst.Notification.ICON, "") : null);
        android.os.Bundle arguments5 = getArguments();
        this.WS = C33129mqd.gEmmrt(arguments5 != null ? arguments5.getString("onlineTime", "") : null);
        android.os.Bundle arguments6 = getArguments();
        this.DGOPHZDGOPHZ = C33129mqd.gEmmrt(arguments6 != null ? arguments6.getString("type", "") : null);
        android.os.Bundle arguments7 = getArguments();
        this.run = C33129mqd.gEmmrt(arguments7 != null ? arguments7.getString("noticeUrl", "") : null);
        android.os.Bundle arguments8 = getArguments();
        this.Dmq = C33129mqd.gEmmrt(arguments8 != null ? arguments8.getString(OtcExtraKeys.MODE, "") : null);
        if (OcIXYQ() != null && ORxRYg() != null) {
            java.lang.String strOcIXYQ = OcIXYQ();
            Intrinsics.copydefault((java.lang.Object) strOcIXYQ);
            java.lang.String strORxRYg = ORxRYg();
            Intrinsics.copydefault((java.lang.Object) strORxRYg);
            copydefault(new MarketCoinInfo(strOcIXYQ, strORxRYg, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        }
        AEQbTJ(new C39562pug(this, QbewEr(), false, false, 12, null));
        this.QwvEab = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.dYepVG);
        this.DCUTEIddSDPG = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.sWlOSi);
        this.fdOvFl = (pXL) view.findViewById(C35964oKf.StateListAnimator.SaJVGb);
        copydefault((C39810pzP) view.findViewById(C35964oKf.StateListAnimator.SUwuXE));
        this.DGUQLI = view.findViewById(C35964oKf.StateListAnimator.unregisterMediaButtonEventReceiver);
        this.fjfviF = (C39816pzV) view.findViewById(C35964oKf.StateListAnimator.SFHvfSaKzXkR);
        this.dUDNAs = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.fJk);
        this.ixgjPv = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.UkvvWh);
        this.DGOPHZ = (C39837pzq) view.findViewById(C35964oKf.StateListAnimator.sJqpAA);
        this.spnCvw = (TabLayout) view.findViewById(C35964oKf.StateListAnimator.DdI);
        this.fERRXa = (C39798pzD) view.findViewById(C35964oKf.StateListAnimator.hTAtCx);
        this.QSLkRj = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.pause);
        this.OFhtUX = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.RLmrWm);
        this.QVsKAR = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.sElUiK);
        this.DLWbHP = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.sILrnl);
        this.OJuSTm = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.resume);
        this.fHqPtx = (android.widget.HorizontalScrollView) view.findViewById(C35964oKf.StateListAnimator.getActiveNotifications);
        this.KDccX = (C33546myW) view.findViewById(C35964oKf.StateListAnimator.getSessionToken);
        this.QCjLjM = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.HJWChPiaHEvk);
        if (QbewEr() != null) {
            QSLkRj();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
                android.view.View view2 = this.DGUQLI;
                if (view2 != null) {
                    view2.setBackgroundColor(this.UrRBLY);
                }
                if (fetchVPNInfo() != null && (interfaceC39502ptZFetchVPNInfo2 = fetchVPNInfo()) != null) {
                    interfaceC39502ptZFetchVPNInfo2.AkhnZx(true);
                }
            } else {
                if (fetchVPNInfo() != null && (interfaceC39502ptZFetchVPNInfo = fetchVPNInfo()) != null) {
                    interfaceC39502ptZFetchVPNInfo.AkhnZx(false);
                }
                android.view.View view3 = this.DGUQLI;
                if (view3 != null) {
                    view3.setBackgroundColor(this.DcqEDu);
                }
            }
        }
        C33546myW c33546myW = this.KDccX;
        if (c33546myW != null) {
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.pcV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C38580pcC.AEQbTJ(this.EZpvd, interfaceC57934yrl);
                }
            });
        }
        C55173xeu c55173xeu = this.DCUTEIddSDPG;
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.pcX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C38580pcC.EZpvd(this.EZpvd, view4);
                }
            });
        }
        java.lang.String str3 = this.Dmq;
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "0")) {
            QCjLjM();
        } else if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "1")) {
            OxVOHk();
        } else {
            OJuSTm();
        }
        this.DBxZfM.setTPriceNoTh("0");
        this.DBxZfM.setTPrice(pDM.EZpvd(AudioStats.AUDIO_AMPLITUDE_NONE, 4));
        MarketTopInfo marketTopInfo = this.DBxZfM;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw("0.0000")) == null || (c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd("4")) == null || (c54536xMLAkhnZx = c54536xMLEZpvd.AkhnZx()) == null || (c54536xMLAEQbTJ = c54536xMLAkhnZx.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
            safeString$default = "";
        }
        marketTopInfo.setTLocalPrice(safeString$default);
        this.DBxZfM.setTIncrease(pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE)), 0, null, 3, null));
        MarketTopInfo marketTopInfo2 = this.DBxZfM;
        marketTopInfo2.setT24HighPrice(marketTopInfo2.getTPrice());
        MarketTopInfo marketTopInfo3 = this.DBxZfM;
        marketTopInfo3.setT24LowPrice(marketTopInfo3.getTPrice());
        MarketTopInfo marketTopInfo4 = this.DBxZfM;
        java.lang.String tPrice = marketTopInfo4.getTPrice();
        BizInstrument bizInstrument = this.gwTjWJ;
        if (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        marketTopInfo4.setT24Volume(new kotlin.Pair<>(tPrice, tradeSymbol));
        MarketTopInfo marketTopInfo5 = this.DBxZfM;
        java.lang.String tPrice2 = marketTopInfo5.getTPrice();
        BizInstrument bizInstrument2 = this.gwTjWJ;
        if (bizInstrument2 != null && (quoteSymbol = bizInstrument2.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        marketTopInfo5.setT24Turnover(new kotlin.Pair<>(tPrice2, str));
    }

    public static final void AEQbTJ(C38580pcC c38580pcC, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (c38580pcC.QbewEr() != null) {
            c38580pcC.onResume();
        }
    }

    public static final void EZpvd(C38580pcC c38580pcC, android.view.View view) {
        if (c38580pcC.QbewEr() != null) {
            android.widget.LinearLayout linearLayout = c38580pcC.QwvEab;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            FragmentActivity activity = c38580pcC.getActivity();
            if (activity != null) {
                ((ActivityC38834pgs) activity).fetchVPNInfo();
            }
            c38580pcC.onResume();
        }
    }

    public final void QCjLjM() {
        BizInstrument minSuggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        this.gwTjWJ = minSuggestedInstrument$default;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("NEW_COIN_ONLINE_STATUS_UPDATE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.pcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pcK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38580pcC.DbNXlk(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("NEW_CONTRACT_ONLINE_STATUS_UPDATE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ2, this);
        final Function1 function12 = new Function1() { // from class: o.pcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pcO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38580pcC.AhwBna(function12, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C38580pcC c38580pcC, java.lang.String str) {
        c38580pcC.OFhtUX();
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C38580pcC c38580pcC, java.lang.String str) {
        c38580pcC.OFhtUX();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OxVOHk() {
        BizInstrument minSuggestedInstrument$default;
        android.view.View view;
        C39810pzP c39810pzPDjSkpj = djSkpj();
        if (c39810pzPDjSkpj != null) {
            c39810pzPDjSkpj.setVisibility(8);
        }
        C39837pzq c39837pzq = this.DGOPHZ;
        if (c39837pzq != null) {
            c39837pzq.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.ixgjPv;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        this.gwTjWJ = minSuggestedInstrument$default;
        android.content.Context contextEjfBZ = ejfBZ();
        if (contextEjfBZ != null) {
            java.lang.Object objCopydefault = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).copydefault(contextEjfBZ, new Function0() { // from class: o.pcJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38580pcC.isConnected(this.AEQbTJ);
                }
            });
            view = objCopydefault instanceof android.view.View ? (android.view.View) objCopydefault : null;
        }
        this.hCLrkq = view;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
        android.view.View view2 = this.hCLrkq;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout2 = this.dUDNAs;
            if (linearLayout2 != null) {
                linearLayout2.addView(view2);
            }
        }
    }

    public static final Unit isConnected(C38580pcC c38580pcC) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38580pcC), null, null, new KLineNewCoinFragment$initCoinAuction$1$1$1(c38580pcC, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OJuSTm() {
        BizInstrument minSuggestedInstrument$default;
        android.view.View view;
        C39810pzP c39810pzPDjSkpj = djSkpj();
        if (c39810pzPDjSkpj != null) {
            c39810pzPDjSkpj.setVisibility(8);
        }
        C39837pzq c39837pzq = this.DGOPHZ;
        if (c39837pzq != null) {
            c39837pzq.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.ixgjPv;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        this.gwTjWJ = minSuggestedInstrument$default;
        android.content.Context contextEjfBZ = ejfBZ();
        if (contextEjfBZ != null) {
            java.lang.Object objEZpvd = ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).EZpvd(contextEjfBZ, new Function0() { // from class: o.pcz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38580pcC.AkhnZx(this.EZpvd);
                }
            });
            view = objEZpvd instanceof android.view.View ? (android.view.View) objEZpvd : null;
        }
        this.hCLrkq = view;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
        android.view.View view2 = this.hCLrkq;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout2 = this.dUDNAs;
            if (linearLayout2 != null) {
                linearLayout2.addView(view2);
            }
        }
    }

    public static final Unit AkhnZx(C38580pcC c38580pcC) {
        pUU.KWHzl(c38580pcC.getTAG(), "PreQuote CountDown finished callback from Trade");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c38580pcC), null, null, new KLineNewCoinFragment$initPreQuote$1$1$1(c38580pcC, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void OFhtUX() {
        java.lang.String str;
        BizInstrument minSuggestedInstrument$default;
        java.lang.String icon;
        java.lang.String onlineTime;
        java.lang.String noticeUrlCn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        str = "";
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        this.hBpjJd = minSuggestedInstrument$default;
        if (minSuggestedInstrument$default != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.DWgRXt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (minSuggestedInstrument$default.getCountDownInfo() == null) {
                InterfaceC39501ptY interfaceC39501ptY = this.OxVOHk;
                if (interfaceC39501ptY != null) {
                    java.lang.String strOcIXYQ = OcIXYQ();
                    if (strOcIXYQ == null) {
                        strOcIXYQ = "";
                    }
                    java.lang.String strORxRYg2 = ORxRYg();
                    interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg2 != null ? strORxRYg2 : "");
                    return;
                }
                return;
            }
            CountDownInfo countDownInfo = minSuggestedInstrument$default.getCountDownInfo();
            if (countDownInfo == null || (icon = countDownInfo.getIcon()) == null) {
                icon = "";
            }
            this.OHqIaq = icon;
            CountDownInfo countDownInfo2 = minSuggestedInstrument$default.getCountDownInfo();
            if (countDownInfo2 == null || (onlineTime = countDownInfo2.getOnlineTime()) == null) {
                onlineTime = "";
            }
            this.WS = onlineTime;
            CountDownInfo countDownInfo3 = minSuggestedInstrument$default.getCountDownInfo();
            Intrinsics.copydefault(countDownInfo3);
            this.DGOPHZDGOPHZ = countDownInfo3.getType();
            CountDownInfo countDownInfo4 = minSuggestedInstrument$default.getCountDownInfo();
            if (countDownInfo4 != null && (noticeUrlCn = countDownInfo4.getNoticeUrlCn()) != null) {
                str = noticeUrlCn;
            }
            this.run = str;
            copydefault(minSuggestedInstrument$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void QVsKAR() {
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.ODXsMY;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.ODXsMY = C33527myD.subscribeOnIO$default(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getMarketCallAuctionDetails(strOcIXYQ), new Function1() { // from class: o.pcT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38580pcC.KWHzl((java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pcW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38580pcC.KWHzl(this.AEQbTJ, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.pcC$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<SystemTimeData> {
        public final /* synthetic */ C38580pcC AEQbTJ;
        public final /* synthetic */ CallAuctionInfoData OLrzqt;

        public TaskDescription(CallAuctionInfoData callAuctionInfoData, C38580pcC c38580pcC) {
            this.OLrzqt = callAuctionInfoData;
            this.AEQbTJ = c38580pcC;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, SystemTimeData systemTimeData, java.lang.Exception exc) {
            java.lang.String tradeSymbol;
            java.lang.String strOLrzqt;
            CallAuctionInfoData callAuctionInfoData = this.OLrzqt;
            C38580pcC c38580pcC = this.AEQbTJ;
            if (systemTimeData != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) TradeLoadingMode.CALL_AUCTION, (java.lang.Object) callAuctionInfoData.getState()) || systemTimeData.getTs().compareTo(callAuctionInfoData.getAuctionEndTime()) >= 0) {
                    InterfaceC39501ptY interfaceC39501ptY = c38580pcC.OxVOHk;
                    if (interfaceC39501ptY != null) {
                        java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
                        if (strOcIXYQ == null) {
                            strOcIXYQ = "";
                        }
                        java.lang.String strORxRYg = c38580pcC.ORxRYg();
                        interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg != null ? strORxRYg : "");
                        return;
                    }
                    return;
                }
                BizInstrument bizInstrument = c38580pcC.gwTjWJ;
                java.lang.String str = (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null || (strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol)) == null) ? "" : strOLrzqt;
                C48914uef c48914uef = C48914uef.EZpvd;
                MarketCoinInfo marketCoinInfoQbewEr = c38580pcC.QbewEr();
                java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                MarketCoinInfo marketCoinInfoQbewEr2 = c38580pcC.QbewEr();
                java.lang.String titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null, false, false, null, false, false, 124, null);
                KeyEvent.Callback callback = c38580pcC.hCLrkq;
                InterfaceC49438uoZ interfaceC49438uoZ = callback instanceof InterfaceC49438uoZ ? (InterfaceC49438uoZ) callback : null;
                if (interfaceC49438uoZ != null) {
                    interfaceC49438uoZ.EZpvd(C33129mqd.valueOf(systemTimeData.getTs()), callAuctionInfoData, titleByIdAndType$default, str, "normal");
                }
                c38580pcC.UlJrfe();
            }
        }
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Objects.toString(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void checkPreQuoteState$default(C38580pcC c38580pcC, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c38580pcC.AkhnZx(z);
    }

    public final void AkhnZx(final boolean z) {
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ != null) {
            InterfaceC58217yxC interfaceC58217yxC = this.call;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.call = C33527myD.subscribeOnIO$default(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getPreQuoteDetails(strOcIXYQ), new Function1() { // from class: o.pcG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38580pcC.AEQbTJ(this.EZpvd, z, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pcI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38580pcC.OLrzqt(this.copydefault, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.pcC$Application */
    public static final class Application implements InterfaceC55701xos<SystemTimeData> {
        public final /* synthetic */ PreQuoteInfoData AEQbTJ;
        public final /* synthetic */ C38580pcC copydefault;

        public Application(PreQuoteInfoData preQuoteInfoData, C38580pcC c38580pcC) {
            this.AEQbTJ = preQuoteInfoData;
            this.copydefault = c38580pcC;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, SystemTimeData systemTimeData, java.lang.Exception exc) {
            java.lang.String tradeSymbol;
            java.lang.String strOLrzqt;
            PreQuoteInfoData preQuoteInfoData = this.AEQbTJ;
            C38580pcC c38580pcC = this.copydefault;
            if (systemTimeData != null) {
                if (systemTimeData.getTs().compareTo(preQuoteInfoData.getPreQuoteEndTimestamp()) < 0) {
                    BizInstrument bizInstrument = c38580pcC.gwTjWJ;
                    java.lang.String str = (bizInstrument == null || (tradeSymbol = bizInstrument.getTradeSymbol()) == null || (strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol)) == null) ? "" : strOLrzqt;
                    C48914uef c48914uef = C48914uef.EZpvd;
                    MarketCoinInfo marketCoinInfoQbewEr = c38580pcC.QbewEr();
                    java.lang.String instrumentId = marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null;
                    MarketCoinInfo marketCoinInfoQbewEr2 = c38580pcC.QbewEr();
                    java.lang.String titleByIdAndType$default = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId, marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null, false, false, null, false, false, 124, null);
                    KeyEvent.Callback callback = c38580pcC.hCLrkq;
                    InterfaceC49437uoY interfaceC49437uoY = callback instanceof InterfaceC49437uoY ? (InterfaceC49437uoY) callback : null;
                    if (interfaceC49437uoY != null) {
                        interfaceC49437uoY.AEQbTJ(C33129mqd.valueOf(systemTimeData.getTs()), preQuoteInfoData, titleByIdAndType$default, str, "normal");
                    }
                    c38580pcC.USBtdM();
                    return;
                }
                InterfaceC39501ptY interfaceC39501ptY = c38580pcC.OxVOHk;
                if (interfaceC39501ptY != null) {
                    java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
                    if (strOcIXYQ == null) {
                        strOcIXYQ = "";
                    }
                    java.lang.String strORxRYg = c38580pcC.ORxRYg();
                    interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg != null ? strORxRYg : "");
                }
            }
        }
    }

    public static final Unit AEQbTJ(C38580pcC c38580pcC, boolean z, java.lang.Throwable th) {
        InterfaceC39501ptY interfaceC39501ptY;
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(c38580pcC.getTAG(), "CountDown Finish: " + z + ", getPreQuoteDetails 接口数据报错：" + th);
        if (z && (interfaceC39501ptY = c38580pcC.OxVOHk) != null) {
            java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            java.lang.String strORxRYg = c38580pcC.ORxRYg();
            interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg != null ? strORxRYg : "");
        }
        return Unit.INSTANCE;
    }

    private final void aUsmxb() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55757xpv abstractC55757xpv = this.USBtdM;
        if (abstractC55757xpv == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55757xpv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UlJrfe() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String instId;
        aUsmxb();
        pUU.KWHzl("AuctionPresenter", "订阅推送---call auction");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String str = "";
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            java.lang.String strORxRYg = ORxRYg();
            BizInstrument minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strORxRYg == null ? "" : strORxRYg, OcIXYQ(), null, null, 12, null);
            if (minSuggestedInstrument$default != null && (instId = minSuggestedInstrument$default.getInstId()) != null) {
                str = instId;
            }
        }
        this.USBtdM = new Fragment(strGEmmrt, str);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            AbstractC55757xpv abstractC55757xpv = this.USBtdM;
            Intrinsics.copydefault(abstractC55757xpv);
            interfaceC54581xNrOLrzqt2.copydefault(yDY.copydefault(abstractC55757xpv));
        }
    }

    /* JADX INFO: renamed from: o.pcC$Fragment */
    public static final class Fragment extends AbstractC55757xpv {
        public Fragment(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(CallAuctionInfoData callAuctionInfoData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(callAuctionInfoData, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("AuctionPresenter", "CallAuctionBizInfoListener---" + callAuctionInfoData);
            KeyEvent.Callback callback = C38580pcC.this.hCLrkq;
            InterfaceC49438uoZ interfaceC49438uoZ = callback instanceof InterfaceC49438uoZ ? (InterfaceC49438uoZ) callback : null;
            if (interfaceC49438uoZ != null) {
                interfaceC49438uoZ.copydefault(callAuctionInfoData, "normal");
            }
        }
    }

    private final void dUDNAs() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55759xpx abstractC55759xpx = this.igXuih;
        if (abstractC55759xpx == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55759xpx));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void USBtdM() {
        dUDNAs();
        pUU.KWHzl("PreQuotePresenter", "订阅推送---call auction");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String strOcIXYQ = OcIXYQ();
        if (strOcIXYQ == null) {
            strOcIXYQ = "";
        }
        FragmentManager fragmentManager = new FragmentManager(strGEmmrt, strOcIXYQ);
        this.igXuih = fragmentManager;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(fragmentManager));
        }
    }

    /* JADX INFO: renamed from: o.pcC$FragmentManager */
    public static final class FragmentManager extends AbstractC55759xpx {
        public FragmentManager(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(PreQuoteInfoData preQuoteInfoData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(preQuoteInfoData, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("PreQuotePresenter", "PreQuoteBizInfoListener---" + preQuoteInfoData);
            KeyEvent.Callback callback = C38580pcC.this.hCLrkq;
            InterfaceC49437uoY interfaceC49437uoY = callback instanceof InterfaceC49437uoY ? (InterfaceC49437uoY) callback : null;
            if (interfaceC49437uoY != null) {
                interfaceC49437uoY.KWHzl(preQuoteInfoData, "normal");
            }
        }
    }

    public final void copydefault(BizInstrument bizInstrument) {
        android.widget.LinearLayout linearLayout;
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            android.view.View view = this.hCLrkq;
            if (view != null && (linearLayout = this.dUDNAs) != null) {
                linearLayout.removeView(view);
            }
            C39810pzP c39810pzPDjSkpj = djSkpj();
            if (c39810pzPDjSkpj != null) {
                CountDownInfo countDownInfo = bizInstrument.getCountDownInfo();
                c39810pzPDjSkpj.setVisibility((countDownInfo != null ? countDownInfo.getNextStage() : null) == MarketTypeEnum.TRADING ? 0 : 8);
            }
            C39837pzq c39837pzq = this.DGOPHZ;
            if (c39837pzq != null) {
                c39837pzq.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout2 = this.ixgjPv;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            C39837pzq c39837pzq2 = this.DGOPHZ;
            if (c39837pzq2 != null) {
                c39837pzq2.setImg(this.OHqIaq);
            }
            C39837pzq c39837pzq3 = this.DGOPHZ;
            if (c39837pzq3 != null) {
                c39837pzq3.setTitle(C48914uef.getTitleByIdAndType$default(C48914uef.EZpvd, marketCoinInfoQbewEr.getInstrumentId(), marketCoinInfoQbewEr.getInstrumentType(), false, false, null, false, false, 124, null));
            }
            C39837pzq c39837pzq4 = this.DGOPHZ;
            if (c39837pzq4 != null) {
                c39837pzq4.setClickSkill(this.run);
            }
            KWHzl(this.WS, this.DGOPHZDGOPHZ);
        }
    }

    private final void KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        BizInstrument minSuggestedInstrument$default;
        CountDownInfo countDownInfo;
        java.lang.String strAYXKKw;
        long jValueOf = C33129mqd.valueOf(str) - java.lang.System.currentTimeMillis();
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "0")) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "1")) {
                C39837pzq c39837pzq = this.DGOPHZ;
                if (c39837pzq != null) {
                    c39837pzq.EZpvd();
                }
                C39837pzq c39837pzq2 = this.DGOPHZ;
                if (c39837pzq2 != null) {
                    c39837pzq2.setRemindText(1);
                    return;
                }
                return;
            }
            C39837pzq c39837pzq3 = this.DGOPHZ;
            if (c39837pzq3 != null) {
                c39837pzq3.EZpvd();
            }
            C39837pzq c39837pzq4 = this.DGOPHZ;
            if (c39837pzq4 != null) {
                c39837pzq4.setRemindText(2);
                return;
            }
            return;
        }
        str3 = "";
        if (jValueOf < 0) {
            InterfaceC39501ptY interfaceC39501ptY = this.OxVOHk;
            if (interfaceC39501ptY != null) {
                java.lang.String strOcIXYQ = OcIXYQ();
                if (strOcIXYQ == null) {
                    strOcIXYQ = "";
                }
                java.lang.String strORxRYg = ORxRYg();
                interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg != null ? strORxRYg : "");
                return;
            }
            return;
        }
        C39837pzq c39837pzq5 = this.DGOPHZ;
        if (c39837pzq5 != null) {
            c39837pzq5.KWHzl();
        }
        C39837pzq c39837pzq6 = this.DGOPHZ;
        if (c39837pzq6 != null) {
            c39837pzq6.KWHzl(jValueOf / ((long) 1000), new Function0() { // from class: o.pcM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C38580pcC.fJNWhG(this.OLrzqt);
                }
            });
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg2 = ORxRYg();
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg2 == null ? "" : strORxRYg2, OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        C39837pzq c39837pzq7 = this.DGOPHZ;
        if (c39837pzq7 != null) {
            if (minSuggestedInstrument$default != null && (countDownInfo = minSuggestedInstrument$default.getCountDownInfo()) != null && (strAYXKKw = C33070mpX.AYXKKw(C37938pGg.OLrzqt(countDownInfo))) != null) {
                str3 = strAYXKKw;
            }
            c39837pzq7.setContent(str3);
        }
    }

    public static final Unit fJNWhG(final C38580pcC c38580pcC) {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgTimer, "");
        AbstractC58247yxg abstractC58247yxgObserveOn = C58156yvv.copydefault(abstractC58247yxgTimer, c38580pcC).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pcH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.AEQbTJ(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        c38580pcC.DWgRXt = abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.pcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38580pcC.AkhnZx(function1, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C38580pcC c38580pcC, java.lang.Long l) {
        BizInstrument minSuggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            java.lang.String strORxRYg = c38580pcC.ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            minSuggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, strORxRYg, c38580pcC.OcIXYQ(), null, null, 12, null);
        } else {
            minSuggestedInstrument$default = null;
        }
        c38580pcC.hBpjJd = minSuggestedInstrument$default;
        if (minSuggestedInstrument$default != null) {
            if (minSuggestedInstrument$default.getCountDownInfo() != null) {
                CountDownInfo countDownInfo = minSuggestedInstrument$default.getCountDownInfo();
                Intrinsics.copydefault(countDownInfo);
                java.lang.String onlineTime = countDownInfo.getOnlineTime();
                CountDownInfo countDownInfo2 = minSuggestedInstrument$default.getCountDownInfo();
                Intrinsics.copydefault(countDownInfo2);
                c38580pcC.KWHzl(onlineTime, countDownInfo2.getType());
            } else {
                InterfaceC39501ptY interfaceC39501ptY = c38580pcC.OxVOHk;
                if (interfaceC39501ptY != null) {
                    java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
                    if (strOcIXYQ == null) {
                        strOcIXYQ = "";
                    }
                    java.lang.String strORxRYg2 = c38580pcC.ORxRYg();
                    interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg2 != null ? strORxRYg2 : "");
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void QSLkRj() {
        pXL pxl = this.fdOvFl;
        if (pxl != null) {
            pxl.setOnScrollChanged(new pXL.StateListAnimator() { // from class: o.pcE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.pXL.StateListAnimator
                public final void copydefault(java.lang.Boolean bool) {
                    C38580pcC.AEQbTJ(this.EZpvd, bool);
                }
            });
        }
        pXL pxl2 = this.fdOvFl;
        if (pxl2 != null) {
            pxl2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.pcF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    C38580pcC.KWHzl(this.copydefault, view, i, i2, i3, i4);
                }
            });
        }
        QwvEab();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof ActivityC38834pgs) {
                ((ActivityC38834pgs) activity).OLrzqt();
            } else if (activity instanceof ActivityC38952pjD) {
                ((ActivityC38952pjD) activity).KWHzl();
            }
        }
    }

    public static final void AEQbTJ(C38580pcC c38580pcC, java.lang.Boolean bool) {
        if (c38580pcC.isConnected() == null || bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC39499ptW interfaceC39499ptWIsConnected = c38580pcC.isConnected();
        if (interfaceC39499ptWIsConnected != null) {
            interfaceC39499ptWIsConnected.AEQbTJ(zBooleanValue);
        }
    }

    public static final void KWHzl(C38580pcC c38580pcC, android.view.View view, int i, int i2, int i3, int i4) {
        C38685peB c38685peBValueOf;
        c38580pcC.DCUTEIdCUTEI = i2;
        FragmentActivity activity = c38580pcC.getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs == null || (c38685peBValueOf = activityC38834pgs.valueOf()) == null) {
            return;
        }
        c38685peBValueOf.KWHzl(i2);
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void gEmmrt(java.lang.String str) {
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
        if (fetchVPNInfo() == null || (interfaceC39502ptZFetchVPNInfo = fetchVPNInfo()) == null) {
            return;
        }
        interfaceC39502ptZFetchVPNInfo.gEmmrt(str);
    }

    @Override // o.oYA, o.InterfaceC39502ptZ
    public void AYXKKw(@NotNull java.lang.String str) {
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
        Intrinsics.checkNotNullParameter(str, "");
        if (fetchVPNInfo() == null || (interfaceC39502ptZFetchVPNInfo = fetchVPNInfo()) == null) {
            return;
        }
        interfaceC39502ptZFetchVPNInfo.AYXKKw(str);
    }

    private final void QwvEab() {
        if (QbewEr() == null) {
            return;
        }
        TabLayout tabLayout = this.spnCvw;
        if (tabLayout != null) {
            tabLayout.removeAllTabs();
        }
        C39798pzD c39798pzD = this.fERRXa;
        if (c39798pzD != null) {
            c39798pzD.removeAllViews();
        }
        if (QbewEr() != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.htlTjW = new C38908piM(childFragmentManager);
            TabLayout tabLayout2 = this.spnCvw;
            if (tabLayout2 != null) {
                tabLayout2.setupWithViewPager(this.fERRXa);
            }
            C39798pzD c39798pzD2 = this.fERRXa;
            if (c39798pzD2 != null) {
                c39798pzD2.setAdapter(this.htlTjW);
            }
            C39798pzD c39798pzD3 = this.fERRXa;
            if (c39798pzD3 != null) {
                C38908piM c38908piM = this.htlTjW;
                java.lang.Integer numValueOf = c38908piM != null ? java.lang.Integer.valueOf(c38908piM.getCount()) : null;
                Intrinsics.copydefault(numValueOf);
                c39798pzD3.setOffscreenPageLimit(numValueOf.intValue());
            }
        }
        TabLayout tabLayout3 = this.spnCvw;
        if (tabLayout3 != null) {
            tabLayout3.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
        }
        C39798pzD c39798pzD4 = this.fERRXa;
        if (c39798pzD4 != null) {
            c39798pzD4.addOnPageChangeListener(new Dialog());
        }
    }

    /* JADX INFO: renamed from: o.pcC$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strValueOf = java.lang.String.valueOf(tab != null ? tab.getText() : null);
            C38580pcC c38580pcC = C38580pcC.this;
            c38580pcC.hrNTAI = Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) c38580pcC.getResources().getString(C35964oKf.Fragment.AxsJAYaxsJAY));
            C39798pzD c39798pzD = C38580pcC.this.fERRXa;
            if (c39798pzD != null) {
                c39798pzD.KWHzl(C38580pcC.this.hrNTAI);
            }
        }
    }

    /* JADX INFO: renamed from: o.pcC$Dialog */
    public static final class Dialog implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public Dialog() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageSelected(int i) {
            boolean z;
            C38580pcC c38580pcC = C38580pcC.this;
            MarketCoinInfo marketCoinInfoQbewEr = c38580pcC.QbewEr();
            if (Intrinsics.EZpvd((java.lang.Object) "SPOT", (java.lang.Object) (marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null))) {
                z = i == 1;
            } else {
                MarketCoinInfo marketCoinInfoQbewEr2 = C38580pcC.this.QbewEr();
                if (!Intrinsics.EZpvd((java.lang.Object) "MARGIN", (java.lang.Object) (marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null))) {
                    MarketCoinInfo marketCoinInfoQbewEr3 = C38580pcC.this.QbewEr();
                    if (!Intrinsics.EZpvd((java.lang.Object) "FUTURES", (java.lang.Object) (marketCoinInfoQbewEr3 != null ? marketCoinInfoQbewEr3.getInstrumentType() : null))) {
                        MarketCoinInfo marketCoinInfoQbewEr4 = C38580pcC.this.QbewEr();
                        if (Intrinsics.EZpvd((java.lang.Object) "SWAP", (java.lang.Object) (marketCoinInfoQbewEr4 != null ? marketCoinInfoQbewEr4.getInstrumentType() : null))) {
                        }
                    }
                }
            }
            c38580pcC.hrNTAI = z;
            C39798pzD c39798pzD = C38580pcC.this.fERRXa;
            if (c39798pzD != null) {
                c39798pzD.KWHzl(C38580pcC.this.hrNTAI);
            }
            if (i == 0) {
                C38580pcC.this.AkhnZx(OtcExtraKeys.ORDER);
                return;
            }
            if (i == 1) {
                MarketCoinInfo marketCoinInfoQbewEr5 = C38580pcC.this.QbewEr();
                if (Intrinsics.EZpvd((java.lang.Object) "OPTION", (java.lang.Object) (marketCoinInfoQbewEr5 != null ? marketCoinInfoQbewEr5.getInstrumentType() : null))) {
                    C38580pcC.this.AkhnZx(ExtJson.BRC20TYPE_TRADE);
                    return;
                } else {
                    C38580pcC.this.AkhnZx("depth");
                    return;
                }
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C38580pcC.this.AkhnZx("info");
            } else {
                MarketCoinInfo marketCoinInfoQbewEr6 = C38580pcC.this.QbewEr();
                if (Intrinsics.EZpvd((java.lang.Object) "OPTION", (java.lang.Object) (marketCoinInfoQbewEr6 != null ? marketCoinInfoQbewEr6.getInstrumentType() : null))) {
                    C38580pcC.this.AkhnZx("info");
                } else {
                    C38580pcC.this.AkhnZx(ExtJson.BRC20TYPE_TRADE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx(final java.lang.String str) {
        C32869mli.onNewOKexEventWithParams$default("app_tab_enter", null, new Function1() { // from class: o.pcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38580pcC.OLrzqt(str, this, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(java.lang.String str, C38580pcC c38580pcC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page_id", "page_k", false);
        eventParamsList.put("sub_tab", str, false);
        java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
        if (strOcIXYQ != null) {
            eventParamsList.put("coin_name", strOcIXYQ, false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C33546myW c33546myW = this.KDccX;
        if (c33546myW != null) {
            c33546myW.AEQbTJ();
        }
    }

    @Override // o.oYA
    public void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            DarRvM();
            C38908piM c38908piM = this.htlTjW;
            if (c38908piM != null) {
                c38908piM.OLrzqt(marketCoinInfoQbewEr, true, Intrinsics.EZpvd((java.lang.Object) this.dHguZz, (java.lang.Object) "MARKET_MAKING") || !Intrinsics.EZpvd((java.lang.Object) this.Dmq, (java.lang.Object) "0"));
            }
            if (Intrinsics.EZpvd((java.lang.Object) this.dHguZz, (java.lang.Object) "MARKET_MAKING")) {
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb = dNCPSb();
                if (stateListAnimatorDNCPSb != null) {
                    stateListAnimatorDNCPSb.AEQbTJ(abstractC54531xLw);
                }
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb2 = dNCPSb();
                if (stateListAnimatorDNCPSb2 != null) {
                    stateListAnimatorDNCPSb2.AEQbTJ(marketCoinInfoQbewEr);
                }
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb3 = dNCPSb();
                if (stateListAnimatorDNCPSb3 != null) {
                    stateListAnimatorDNCPSb3.KWHzl("TYPE_KLINE");
                }
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb4 = dNCPSb();
                if (stateListAnimatorDNCPSb4 != null) {
                    stateListAnimatorDNCPSb4.AEQbTJ(this);
                }
            } else {
                AEQbTJ(this.DBxZfM);
            }
            android.widget.LinearLayout linearLayout = this.QCjLjM;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    @Override // o.oYA
    public void hUfVAv() {
        C39816pzV c39816pzV = this.fjfviF;
        if (c39816pzV != null) {
            c39816pzV.setData();
        }
    }

    @Override // o.InterfaceC36340oYd
    public void KWHzl(java.lang.String str) {
        isAdded();
    }

    @Override // o.oYA
    public void DarRvM() {
        C38685peB c38685peBValueOf;
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null && (c38685peBValueOf = activityC38834pgs.valueOf()) != null) {
            c38685peBValueOf.zLjUOn();
        }
        OLrzqt();
        MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) (marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null))) {
            TabLayout tabLayout = this.spnCvw;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
                return;
            }
            return;
        }
        TabLayout tabLayout2 = this.spnCvw;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
    }

    public final void OLrzqt() {
        java.util.ArrayList arrayList;
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
        pWP pwp;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        C56131xwy c56131xwyFetchVPNInfo2;
        java.lang.Object obj = null;
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) == null || (c56131xwyFetchVPNInfo2 = interfaceC54581xNrOLrzqt3.fetchVPNInfo()) == null) {
                return;
            }
            c56131xwyFetchVPNInfo2.OLrzqt(new Activity());
            return;
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.util.ArrayList<WatchListBean> arrayListAEQbTJ = (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt2.fetchVPNInfo()) == null) ? null : c56131xwyFetchVPNInfo.AEQbTJ();
        if (arrayListAEQbTJ != null) {
            java.util.ArrayList<WatchListBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((WatchListBean) obj2).getInstType(), (java.lang.Object) "COIN")) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (WatchListBean watchListBean : arrayList2) {
                if (Intrinsics.EZpvd((java.lang.Object) watchListBean.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    pwp = (interfaceC49425uoM3 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListBean.getInstId(), watchListBean.getAlias(), 2, null)) == null) ? null : new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                } else {
                    pwp = new pWP(watchListBean.getInstId(), watchListBean.getInstType(), null, null, null, 28, null);
                }
                arrayList.add(pwp);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                pWP pwp2 = (pWP) next;
                java.lang.String strAEQbTJ = pwp2 != null ? pwp2.AEQbTJ() : null;
                MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
                if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) (marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentId() : null))) {
                    java.lang.String strKWHzl = pwp2 != null ? pwp2.KWHzl() : null;
                    MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
                    if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentType() : null))) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (pWP) obj;
        }
        this.UlJrfe = obj != null;
        if (fetchVPNInfo() == null || (interfaceC39502ptZFetchVPNInfo = fetchVPNInfo()) == null) {
            return;
        }
        interfaceC39502ptZFetchVPNInfo.KWHzl(0, this.UlJrfe);
    }

    /* JADX INFO: renamed from: o.pcC$Activity */
    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            java.lang.Object obj;
            InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
            pWP pwp;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            BizInstrument suggestedInstrument$default;
            if (!z || list == null) {
                return;
            }
            C38580pcC.this.zblBkD.clear();
            C38580pcC.this.zblBkD.addAll(list);
            C38580pcC c38580pcC = C38580pcC.this;
            java.util.ArrayList<WatchListData> arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String instType = ((WatchListData) next).getInstType();
                MarketCoinInfo marketCoinInfoQbewEr = c38580pcC.QbewEr();
                if (Intrinsics.EZpvd(instType, marketCoinInfoQbewEr != null ? marketCoinInfoQbewEr.getInstrumentType() : null)) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (WatchListData watchListData : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    pwp = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListData.getInstId(), watchListData.getAlias(), 2, null)) == null) ? null : new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                } else {
                    pwp = new pWP(watchListData.getInstId(), watchListData.getInstType(), null, null, null, 28, null);
                }
                arrayList2.add(pwp);
            }
            C38580pcC c38580pcC2 = C38580pcC.this;
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                pWP pwp2 = (pWP) next2;
                java.lang.String strAEQbTJ = pwp2 != null ? pwp2.AEQbTJ() : null;
                MarketCoinInfo marketCoinInfoQbewEr2 = c38580pcC2.QbewEr();
                if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) (marketCoinInfoQbewEr2 != null ? marketCoinInfoQbewEr2.getInstrumentId() : null))) {
                    java.lang.String strKWHzl = pwp2 != null ? pwp2.KWHzl() : null;
                    MarketCoinInfo marketCoinInfoQbewEr3 = c38580pcC2.QbewEr();
                    if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (marketCoinInfoQbewEr3 != null ? marketCoinInfoQbewEr3.getInstrumentType() : null))) {
                        obj = next2;
                        break;
                    }
                }
            }
            c38580pcC2.UlJrfe = obj != null;
            if (C38580pcC.this.fetchVPNInfo() == null || (interfaceC39502ptZFetchVPNInfo = C38580pcC.this.fetchVPNInfo()) == null) {
                return;
            }
            interfaceC39502ptZFetchVPNInfo.KWHzl(0, C38580pcC.this.UlJrfe);
        }
    }

    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        C39810pzP c39810pzPDjSkpj = djSkpj();
        if (c39810pzPDjSkpj != null) {
            c39810pzPDjSkpj.setData(marketTopInfo, true);
        }
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo = fetchVPNInfo();
        if (interfaceC39502ptZFetchVPNInfo != null) {
            interfaceC39502ptZFetchVPNInfo.AEQbTJ(marketTopInfo);
            interfaceC39502ptZFetchVPNInfo.dUDNAs();
        }
    }

    @Override // o.oYA, o.InterfaceC39563puh.Application
    public void gwTjWJ() {
        android.widget.LinearLayout linearLayout = this.QwvEab;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    @Override // o.oYA
    public void EZpvd(@NotNull MarketCoinInfo marketCoinInfo) {
        InterfaceC39502ptZ interfaceC39502ptZFetchVPNInfo;
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        super.EZpvd(marketCoinInfo);
        C39810pzP c39810pzPDjSkpj = djSkpj();
        if (c39810pzPDjSkpj != null) {
            c39810pzPDjSkpj.setPriceTypeAndInstType("TYPE_KLINE", marketCoinInfo.getInstrumentId(), marketCoinInfo.getInstrumentType(), (8 & 8) != 0 ? false : true, (8 & 16) != 0 ? false : false);
        }
        if (fetchVPNInfo() == null || (interfaceC39502ptZFetchVPNInfo = fetchVPNInfo()) == null) {
            return;
        }
        interfaceC39502ptZFetchVPNInfo.EZpvd(marketCoinInfo);
    }

    @Override // o.oYA
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        InterfaceC39499ptW interfaceC39499ptWIsConnected;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (str == null || str2 == null) {
            return;
        }
        AEQbTJ(str);
        AhwBna(str2);
        copydefault(new MarketCoinInfo(str, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null));
        final MarketCoinInfo marketCoinInfoQbewEr = QbewEr();
        if (marketCoinInfoQbewEr != null) {
            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class);
            TradeKey tradeKey = TradeKey.MANAGER;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(tradeKey)).copydefault();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfoQbewEr.getInstrumentType(), marketCoinInfoQbewEr.getInstrumentId(), null, null, 12, null) : null;
            this.hBpjJd = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null && (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(tradeKey)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(marketCoinInfoQbewEr.getInstrumentType())) != null) {
                abstractC54531xLwOLrzqt.AEQbTJ(minSuggestedInstrument$default, new Function1() { // from class: o.pcP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C38580pcC.OLrzqt(this.EZpvd, marketCoinInfoQbewEr, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
        if (isVisibled()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KLineNewCoinFragment$updateMarketCoin$2(this, null), 3, null);
            MarketCoinInfo marketCoinInfoQbewEr2 = QbewEr();
            Intrinsics.copydefault(marketCoinInfoQbewEr2);
            EZpvd(marketCoinInfoQbewEr2);
            if (isConnected() == null || (interfaceC39499ptWIsConnected = isConnected()) == null) {
                return;
            }
            interfaceC39499ptWIsConnected.EZpvd(QbewEr());
        }
    }

    public static final Unit OLrzqt(C38580pcC c38580pcC, MarketCoinInfo marketCoinInfo, boolean z) {
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
            BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null) : null;
            c38580pcC.hBpjJd = minSuggestedInstrument$default;
            if (minSuggestedInstrument$default != null) {
                minSuggestedInstrument$default.getBizContinuousStatus();
            }
        }
        InterfaceC39501ptY interfaceC39501ptY = c38580pcC.OxVOHk;
        if (interfaceC39501ptY != null) {
            java.lang.String strOcIXYQ = c38580pcC.OcIXYQ();
            if (strOcIXYQ == null) {
                strOcIXYQ = "";
            }
            java.lang.String strORxRYg = c38580pcC.ORxRYg();
            interfaceC39501ptY.copydefault(strOcIXYQ, strORxRYg != null ? strORxRYg : "");
        }
        return Unit.INSTANCE;
    }

    @Override // o.oYA, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C39810pzP c39810pzPDjSkpj = djSkpj();
        if (c39810pzPDjSkpj != null) {
            c39810pzPDjSkpj.AEQbTJ();
        }
    }

    public static final Unit KWHzl(C38580pcC c38580pcC, ResponseData responseData) {
        java.util.List list;
        C56130xwx c56130xwxAYXKKw;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null) {
            CallAuctionInfoData callAuctionInfoData = (CallAuctionInfoData) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            if (callAuctionInfoData == null) {
                callAuctionInfoData = new CallAuctionInfoData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (DefaultConstructorMarker) null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c56130xwxAYXKKw = interfaceC54581xNrOLrzqt.AYXKKw()) != null) {
                c56130xwxAYXKKw.EZpvd(new TaskDescription(callAuctionInfoData, c38580pcC));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38580pcC c38580pcC, ResponseData responseData) {
        java.util.List list;
        C56130xwx c56130xwxAYXKKw;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null) {
            PreQuoteInfoData preQuoteInfoData = (PreQuoteInfoData) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
            if (preQuoteInfoData == null) {
                preQuoteInfoData = new PreQuoteInfoData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c56130xwxAYXKKw = interfaceC54581xNrOLrzqt.AYXKKw()) != null) {
                c56130xwxAYXKKw.EZpvd(new Application(preQuoteInfoData, c38580pcC));
            }
        }
        return Unit.INSTANCE;
    }
}
