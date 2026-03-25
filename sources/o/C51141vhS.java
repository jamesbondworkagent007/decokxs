package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.StgyCopyPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.MpStgyInfo;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C48033uCm;
import o.C51133vhK;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.vhS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51141vhS extends AbstractC49945uyC<AbstractC48400uQb, StgyCopyPresenter> {
    public java.lang.String AYXKKw;
    public java.lang.String OLrzqt;
    public InterfaceC53558wnk djBIcL;
    public AbstractC51292vkK gEmmrt;
    public boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int KWHzl = C48033uCm.Activity.QDqgQU;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX INFO: renamed from: o.vhS$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.AbstractC49945uyC
    public boolean fetchVPNInfo() {
        return true;
    }

    /* JADX INFO: renamed from: o.vhS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vhS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C51141vhS EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C51141vhS c51141vhS = new C51141vhS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putString("type", str2);
            c51141vhS.setArguments(bundle);
            return c51141vhS;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getString("id") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = arguments2 != null ? arguments2.getString("type") : null;
        zLjUOn();
        iwGUEr();
        fARcdN();
        zsXlph();
        AuCTelauCTel();
        C32866mlf.onEvent$default("CopyBotPlaceOrder_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C51141vhS c51141vhS, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = c51141vhS.AYXKKw;
        EventParamsList.put$default(eventParamsList, "bot_type", str == null ? "" : str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "copy_type", c51141vhS.AubY(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().flVtFt();
    }

    private final void zLjUOn() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String str = this.AYXKKw;
        if (str == null) {
            str = "";
        }
        AbstractC51292vkK abstractC51292vkKKWHzl = new C51290vkI(contextRequireContext, str).KWHzl();
        this.gEmmrt = abstractC51292vkKKWHzl;
        if (abstractC51292vkKKWHzl != null) {
            abstractC51292vkKKWHzl.setQuotePercentListener(new Function1() { // from class: o.vif
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.fetchVPNInfo(this.OLrzqt, (java.lang.String) obj);
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setOnCheckedChangeListener(new Function2() { // from class: o.vie
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C51141vhS.OLrzqt(this.AEQbTJ, (android.widget.CompoundButton) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK2 = this.gEmmrt;
        if (abstractC51292vkK2 != null) {
            abstractC51292vkK2.setAmtChangeListener(new Function1() { // from class: o.vim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.DbNXlk(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK3 = this.gEmmrt;
        if (abstractC51292vkK3 != null) {
            abstractC51292vkK3.setExtraAmtChangeListener(new Function1() { // from class: o.vij
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.values(this.AEQbTJ, (java.lang.String) obj);
                }
            });
        }
        AbstractC51292vkK abstractC51292vkK4 = this.gEmmrt;
        if (abstractC51292vkK4 != null) {
            abstractC51292vkK4.setQuoteContent("");
        }
        fIwbmz();
        AuCTel();
        wlaJM();
        ejfBZ();
        gHZMYf();
        values().djBIcL.addView(this.gEmmrt, new LinearLayout.LayoutParams(-1, -2));
    }

    public static final Unit fetchVPNInfo(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            StgyCopyPresenter stgyCopyPresenterOLrzqt = c51141vhS.OLrzqt();
            java.lang.String value = c51141vhS.OLrzqt().copydefault().getValue();
            abstractC51292vkK.setQuoteContent(stgyCopyPresenterOLrzqt.AEQbTJ(value != null ? value : "", str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51141vhS c51141vhS, android.widget.CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "");
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (c51321vkn != null) {
            if (z) {
                c51321vkn.EZpvd(true);
                MpStgyParam mpStgyParamFJNWhG = c51321vkn.fJNWhG();
                AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
                java.lang.String strOLrzqt = abstractC51292vkK != null ? abstractC51292vkK.OLrzqt() : null;
                mpStgyParamFJNWhG.setSz(strOLrzqt != null ? strOLrzqt : "");
                c51321vkn.EZpvd();
            } else {
                c51321vkn.EZpvd(false);
                MpStgyParam mpStgyParamFJNWhG2 = c51321vkn.fJNWhG();
                AbstractC51292vkK abstractC51292vkK2 = c51141vhS.gEmmrt;
                java.lang.String strOLrzqt2 = abstractC51292vkK2 != null ? abstractC51292vkK2.OLrzqt() : null;
                if (strOLrzqt2 == null) {
                    strOLrzqt2 = "";
                }
                mpStgyParamFJNWhG2.setActualMarginSz(strOLrzqt2);
                MpStgyParam mpStgyParamFJNWhG3 = c51321vkn.fJNWhG();
                AbstractC51292vkK abstractC51292vkK3 = c51141vhS.gEmmrt;
                java.lang.String strKWHzl = abstractC51292vkK3 != null ? abstractC51292vkK3.KWHzl() : null;
                mpStgyParamFJNWhG3.setExtraMarginSz(strKWHzl != null ? strKWHzl : "");
                C51321vkn.updateSz$default(c51321vkn, false, 1, null);
            }
            c51321vkn.aKErDB();
            c51321vkn.copydefault(z);
            AbstractC51292vkK abstractC51292vkK4 = c51141vhS.gEmmrt;
            if (abstractC51292vkK4 != null) {
                abstractC51292vkK4.setTotalInvest(c51321vkn.KWHzl(c51321vkn.fJNWhG().getActualMarginSz(), c51321vkn.fJNWhG().getLever()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String value = c51141vhS.OLrzqt().copydefault().getValue();
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.OLrzqt(c51141vhS.AYXKKw, value);
        }
        AbstractC51292vkK abstractC51292vkK2 = c51141vhS.gEmmrt;
        if (abstractC51292vkK2 != null) {
            abstractC51292vkK2.KWHzl(c51141vhS.AYXKKw, value);
        }
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (c51321vkn != null) {
            AbstractC51292vkK abstractC51292vkK3 = c51141vhS.gEmmrt;
            if (abstractC51292vkK3 != null && abstractC51292vkK3.AYXKKw()) {
                c51321vkn.fJNWhG().setSz(str);
            } else {
                c51321vkn.fJNWhG().setActualMarginSz(str);
                C51321vkn.updateSz$default(c51321vkn, false, 1, null);
            }
            AbstractC51292vkK abstractC51292vkK4 = c51141vhS.gEmmrt;
            if (abstractC51292vkK4 != null) {
                abstractC51292vkK4.setTotalInvest(c51321vkn.KWHzl(c51321vkn.fJNWhG().getActualMarginSz(), c51321vkn.fJNWhG().getLever()));
            }
            AbstractC51292vkK abstractC51292vkK5 = c51141vhS.gEmmrt;
            c51321vkn.copydefault(str, abstractC51292vkK5 != null ? abstractC51292vkK5.AYXKKw() : true);
            AbstractC51292vkK abstractC51292vkK6 = c51141vhS.gEmmrt;
            if (abstractC51292vkK6 != null && abstractC51292vkK6.AYXKKw()) {
                c51321vkn.EZpvd();
            }
        } else {
            AbstractC51317vkj.onAmtChange$default(c51141vhS.OLrzqt().djBIcL(), str, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vhS$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51141vhS KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51141vhS c51141vhS) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c51141vhS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            CopyBotReqParam copyBotReqParamEZpvd;
            xOW newProxyInstance;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AbstractC51292vkK abstractC51292vkK = this.KWHzl.gEmmrt;
                if (abstractC51292vkK == null || (copyBotReqParamEZpvd = abstractC51292vkK.EZpvd()) == null) {
                    return;
                }
                if (!this.KWHzl.copydefault()) {
                    copyBotReqParamEZpvd.setReinvest(false);
                }
                AbstractC51292vkK abstractC51292vkK2 = this.KWHzl.gEmmrt;
                if ((abstractC51292vkK2 == null || abstractC51292vkK2.AEQbTJ()) && this.KWHzl.isConnected()) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                        C51141vhS c51141vhS = this.KWHzl;
                        java.lang.String str = c51141vhS.AYXKKw;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = this.KWHzl.OLrzqt;
                        c51141vhS.OLrzqt(str, copyBotReqParamEZpvd, str2 != null ? str2 : "");
                    } else {
                        pUU.KWHzl("Order", "CopyOrderDialogFragment Order");
                        StgyCopyPresenter stgyCopyPresenterOLrzqt = this.KWHzl.OLrzqt();
                        AbstractC51292vkK abstractC51292vkK3 = this.KWHzl.gEmmrt;
                        stgyCopyPresenterOLrzqt.KWHzl(copyBotReqParamEZpvd, abstractC51292vkK3 != null ? abstractC51292vkK3.AYXKKw() : true);
                    }
                    C32866mlf.onEvent$default("CopyBotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, this.KWHzl.new StateListAnimator(), 1, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vhS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51141vhS EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51141vhS c51141vhS) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c51141vhS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    public static final Unit values(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.KWHzl(c51141vhS.AYXKKw, c51141vhS.OLrzqt().copydefault().getValue());
        }
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (c51321vkn != null) {
            AbstractC51292vkK abstractC51292vkK2 = c51141vhS.gEmmrt;
            c51321vkn.OLrzqt(str, abstractC51292vkK2 != null ? abstractC51292vkK2.AYXKKw() : true);
            AbstractC51292vkK abstractC51292vkK3 = c51141vhS.gEmmrt;
            if (abstractC51292vkK3 != null) {
                abstractC51292vkK3.setTotalInvest(c51321vkn.KWHzl(c51321vkn.fJNWhG().getActualMarginSz(), c51321vkn.fJNWhG().getLever()));
            }
        }
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        android.view.ViewParent viewParent = this.gEmmrt;
        if (viewParent instanceof InterfaceC53558wnk) {
            Intrinsics.copydefault(viewParent, "");
            InterfaceC53558wnk interfaceC53558wnk = (InterfaceC53558wnk) viewParent;
            interfaceC53558wnk.AEQbTJ(new Function1() { // from class: o.vih
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.AuCTel(this.KWHzl, (java.lang.String) obj);
                }
            });
            this.djBIcL = interfaceC53558wnk;
            EZpvd(OLrzqt().getFieldNames(), OLrzqt().iwGUEr());
        }
    }

    public static final Unit AuCTel(C51141vhS c51141vhS, java.lang.String str) {
        pUU.EZpvd("USDRename", "CopyOrderDialogFragment onTradeWith selected: " + str);
        c51141vhS.OLrzqt().djBIcL().fFgQHt().gEmmrt(str);
        c51141vhS.hDKMBd();
        c51141vhS.OLrzqt().giSNqX();
        c51141vhS.OLrzqt().flVtFt();
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        OLrzqt(booleanRef.element);
        values().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vhY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51141vhS.EZpvd(this.OLrzqt, booleanRef, view);
            }
        });
        values().AYXKKw.setLayoutManager(new LinearLayoutManager(getContext()));
        values().AYXKKw.setAdapter(this.copydefault);
        values().AYXKKw.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(12.0f, null, 1, null), 0));
        this.copydefault.register(BotParamColorItemData.class, new C51261vjg());
        this.copydefault.register(BotParamItemData.class, new C51263vji());
        this.copydefault.register(SmartCoinsData.class, new C53186wgj());
        this.copydefault.register(C55848xrg.class, new C51233vjE());
        this.copydefault.register(PriceRangeInfo.class, new C51240vjL());
    }

    public static final void EZpvd(C51141vhS c51141vhS, Ref.BooleanRef booleanRef, android.view.View view) {
        c51141vhS.OLrzqt(booleanRef.element);
        booleanRef.element = !booleanRef.element;
    }

    public final void fIwbmz() {
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK instanceof C51367vlg) {
            Intrinsics.copydefault(abstractC51292vkK, "");
            ((C51367vlg) abstractC51292vkK).EZpvd(OLrzqt().getNewProxyInstance());
        }
    }

    public final void AuCTel() {
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK instanceof C51335vlA) {
            Intrinsics.copydefault(abstractC51292vkK, "");
            final C51335vlA c51335vlA = (C51335vlA) abstractC51292vkK;
            AbstractC51317vkj abstractC51317vkjDjBIcL = OLrzqt().djBIcL();
            C51326vks c51326vks = abstractC51317vkjDjBIcL instanceof C51326vks ? (C51326vks) abstractC51317vkjDjBIcL : null;
            if (c51326vks != null) {
                c51326vks.KWHzl(true);
            }
            c51335vlA.setLockFundChangeCallback(new Function1() { // from class: o.vhP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            c51335vlA.setAmtChangeCallback(new Function1() { // from class: o.vhQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.KWHzl(this.KWHzl, c51335vlA, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit copydefault(C51141vhS c51141vhS, boolean z) {
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51326vks c51326vks = abstractC51317vkjDjBIcL instanceof C51326vks ? (C51326vks) abstractC51317vkjDjBIcL : null;
        if (c51326vks != null) {
            c51326vks.KWHzl(z);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C51141vhS c51141vhS, C51335vlA c51335vlA, java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51326vks c51326vks = abstractC51317vkjDjBIcL instanceof C51326vks ? (C51326vks) abstractC51317vkjDjBIcL : null;
        java.lang.String strCopydefault = c51326vks != null ? c51326vks.copydefault(str) : null;
        c51335vlA.OLrzqt(strCopydefault != null ? strCopydefault : "");
        AbstractC51317vkj abstractC51317vkjDjBIcL2 = c51141vhS.OLrzqt().djBIcL();
        C51326vks c51326vks2 = abstractC51317vkjDjBIcL2 instanceof C51326vks ? (C51326vks) abstractC51317vkjDjBIcL2 : null;
        if (c51326vks2 != null) {
            z = c51326vks2.KWHzl(str);
        }
        c51335vlA.OLrzqt(z);
        c51141vhS.isConnected();
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_dca")) {
            C56111xwe<LiquidatePriceResponse> c56111xweGasjUx = OLrzqt().djBIcL().gasjUx();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c56111xweGasjUx.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vig
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.KWHzl(this.KWHzl, (LiquidatePriceResponse) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(C51141vhS c51141vhS, LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.EZpvd(liquidatePriceResponse);
        }
        return Unit.INSTANCE;
    }

    private final void wlaJM() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_dca")) {
            OLrzqt().djBIcL().AubY().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vic
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.EZpvd(this.copydefault, (BotLeverConfig) obj);
                }
            }));
            OLrzqt().djBIcL().bw_();
        }
    }

    public static final Unit EZpvd(final C51141vhS c51141vhS, BotLeverConfig botLeverConfig) {
        java.lang.String direction;
        if (botLeverConfig == null) {
            return Unit.INSTANCE;
        }
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            java.lang.String str = c51141vhS.AYXKKw;
            java.lang.String strIwGUEr = c51141vhS.OLrzqt().iwGUEr();
            java.lang.String fieldNames = c51141vhS.OLrzqt().getFieldNames();
            MpStgyParam mpStgyParamDNCPSb = c51141vhS.OLrzqt().dNCPSb();
            if (mpStgyParamDNCPSb == null || (direction = mpStgyParamDNCPSb.getDirection()) == null) {
                direction = "";
            }
            abstractC51292vkK.copydefault(str, strIwGUEr, fieldNames, botLeverConfig, direction, new Function1() { // from class: o.vid
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51141vhS.isConnected(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        abstractC51317vkjDjBIcL.KWHzl(str, abstractC51292vkK != null ? abstractC51292vkK.AYXKKw() : true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showConfirmDialog$default(C51141vhS c51141vhS, java.lang.String str, CopyBotReqParam copyBotReqParam, java.lang.String str2, int i, java.lang.Object obj) {
        C51141vhS c51141vhS2;
        java.lang.String str3 = "";
        java.lang.String str4 = (i & 1) != 0 ? "" : str;
        CopyBotReqParam copyBotReqParam2 = (i & 2) != 0 ? new CopyBotReqParam(null, null, null, false, null, null, null, null, false, null, 1023, null) : copyBotReqParam;
        if ((i & 4) != 0) {
            c51141vhS2 = c51141vhS;
        } else {
            c51141vhS2 = c51141vhS;
            str3 = str2;
        }
        c51141vhS2.OLrzqt(str4, copyBotReqParam2, str3);
    }

    public final void OLrzqt(java.lang.String str, CopyBotReqParam copyBotReqParam, java.lang.String str2) {
        new C51133vhK.ActionBar().AEQbTJ(str).EZpvd(copyBotReqParam).copydefault(str2).EZpvd().show(getChildFragmentManager(), C51133vhK.class.getSimpleName());
    }

    private final void gHZMYf() {
        OLrzqt().djBIcL().AhwBna().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.AEQbTJ(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        OLrzqt().djBIcL().gkJEwt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.via
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.OLrzqt(this.AEQbTJ, (AutoEarnStakingQueryConfig) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C51141vhS c51141vhS, StrategyConfigInfo strategyConfigInfo) {
        SlippageControl slippageControl;
        SlippageControl slippageControl2;
        SlippageControl slippageControl3;
        java.lang.String askSlippage;
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.OLrzqt(strategyConfigInfo);
        }
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (c51321vkn != null) {
            MpStgyParam mpStgyParamDNCPSb = c51141vhS.OLrzqt().dNCPSb();
            java.lang.String direction = mpStgyParamDNCPSb != null ? mpStgyParamDNCPSb.getDirection() : null;
            if (direction == null) {
                askSlippage = "";
                c51321vkn.fJNWhG().setOpenPosSlippage(askSlippage);
            } else {
                int iHashCode = direction.hashCode();
                if (iHashCode == 3327612) {
                    if (direction.equals("long")) {
                        if (strategyConfigInfo != null && (slippageControl = strategyConfigInfo.getSlippageControl()) != null) {
                            askSlippage = slippageControl.getAskSlippage();
                        }
                    }
                    c51321vkn.fJNWhG().setOpenPosSlippage(askSlippage);
                } else if (iHashCode == 109413500) {
                    if (direction.equals("short")) {
                        if (strategyConfigInfo != null && (slippageControl2 = strategyConfigInfo.getSlippageControl()) != null) {
                            askSlippage = slippageControl2.getBidSlippage();
                        }
                    }
                    c51321vkn.fJNWhG().setOpenPosSlippage(askSlippage);
                } else {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        if (strategyConfigInfo != null && (slippageControl3 = strategyConfigInfo.getSlippageControl()) != null && (askSlippage = slippageControl3.getAskSlippage()) != null) {
                            SlippageControl slippageControl4 = strategyConfigInfo.getSlippageControl();
                            askSlippage = C33129mqd.EZpvd(askSlippage, slippageControl4 != null ? slippageControl4.getBidSlippage() : null);
                        }
                    }
                    c51321vkn.fJNWhG().setOpenPosSlippage(askSlippage);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51141vhS c51141vhS, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.KWHzl(autoEarnStakingQueryConfig);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getFieldNames() {
        boolean z;
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK instanceof C51335vlA) {
            Intrinsics.copydefault(abstractC51292vkK, "");
            C51335vlA c51335vlA = (C51335vlA) abstractC51292vkK;
            AbstractC51317vkj abstractC51317vkjDjBIcL = OLrzqt().djBIcL();
            C51326vks c51326vks = abstractC51317vkjDjBIcL instanceof C51326vks ? (C51326vks) abstractC51317vkjDjBIcL : null;
            if (c51326vks != null) {
                z = c51326vks.copydefault();
            }
            c51335vlA.copydefault(z);
        }
    }

    public final void hDKMBd() {
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), OLrzqt().getNewProxyInstance(), OLrzqt().uzCIH(), OLrzqt().dvKsVJ());
        }
    }

    public final void OLrzqt(java.lang.String str) {
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setMinInvest(OLrzqt().AEQbTJ(str));
        }
    }

    private final void copydefault(java.lang.String str) {
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setBalance(OLrzqt().copydefault(str));
        }
        AbstractC51292vkK abstractC51292vkK2 = this.gEmmrt;
        if (abstractC51292vkK2 != null) {
            abstractC51292vkK2.OLrzqt(this.AYXKKw, str);
        }
    }

    public final boolean copydefault() {
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_dca");
    }

    public final void uzCIH() {
        java.lang.String strCopydefault;
        java.lang.String profitSharingRatio;
        java.lang.String profitSharingRatio2;
        java.lang.String profitSharingRatio3;
        ConstraintLayout constraintLayoutValueOf;
        AbstractC48400uQb abstractC48400uQbValues = values();
        AbstractC51292vkK abstractC51292vkK = this.gEmmrt;
        C51303vkV c51303vkV = abstractC51292vkK instanceof C51303vkV ? (C51303vkV) abstractC51292vkK : null;
        if (c51303vkV != null && (constraintLayoutValueOf = c51303vkV.valueOf()) != null) {
            constraintLayoutValueOf.setVisibility(copydefault() ? 0 : 8);
        }
        getNewProxyInstance();
        if (OLrzqt().finit() && !Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "contract_dca")) {
            android.widget.LinearLayout linearLayout = abstractC48400uQbValues.AEQbTJ;
            java.lang.String strCopydefault2 = "";
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = abstractC48400uQbValues.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            android.view.View view = abstractC48400uQbValues.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            AppCompatTextView appCompatTextView = abstractC48400uQbValues.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatTextView appCompatTextView2 = abstractC48400uQbValues.copydefault;
            java.lang.String str = this.AYXKKw;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
                strCopydefault = C33070mpX.AYXKKw(C48033uCm.Fragment.zvzmfz);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid")) {
                strCopydefault = C33070mpX.AYXKKw(C48033uCm.Fragment.unregister);
            } else {
                int i = C55688xof.Application.sEcTXd;
                xMR xmr = xMR.copydefault;
                MpStgyParam mpStgyParamDNCPSb = OLrzqt().dNCPSb();
                strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr, (mpStgyParamDNCPSb == null || (profitSharingRatio = mpStgyParamDNCPSb.getProfitSharingRatio()) == null) ? "" : profitSharingRatio, 0, null, 4, null))));
            }
            appCompatTextView2.setText(strCopydefault);
            AppCompatTextView appCompatTextView3 = abstractC48400uQbValues.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("contract_grid", "grid")), this.AYXKKw) ? 0 : 8);
            AppCompatTextView appCompatTextView4 = abstractC48400uQbValues.KWHzl;
            java.lang.String str2 = this.AYXKKw;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_grid")) {
                int i2 = C48033uCm.Fragment.GiPPlLQAswws;
                xMR xmr2 = xMR.copydefault;
                MpStgyParam mpStgyParamDNCPSb2 = OLrzqt().dNCPSb();
                strCopydefault2 = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr2, (mpStgyParamDNCPSb2 == null || (profitSharingRatio3 = mpStgyParamDNCPSb2.getProfitSharingRatio()) == null) ? "" : profitSharingRatio3, 0, null, 4, null))));
            } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "grid")) {
                int i3 = C48033uCm.Fragment.setLocationManually;
                xMR xmr3 = xMR.copydefault;
                MpStgyParam mpStgyParamDNCPSb3 = OLrzqt().dNCPSb();
                strCopydefault2 = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xmr3, (mpStgyParamDNCPSb3 == null || (profitSharingRatio2 = mpStgyParamDNCPSb3.getProfitSharingRatio()) == null) ? "" : profitSharingRatio2, 0, null, 4, null))));
            }
            appCompatTextView4.setText(strCopydefault2);
            return;
        }
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) OLrzqt().OcIXYQ());
    }

    public final void getNewProxyInstance() {
        AppCompatTextView appCompatTextView = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().QbewEr()) ? 0 : 8);
        values().AhwBna.setText(OLrzqt().QbewEr());
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd;
        OLrzqt().KWHzl(str, str2);
        C55887xsS c55887xsSFFgQHt = OLrzqt().djBIcL().fFgQHt();
        InterfaceC53558wnk interfaceC53558wnk = this.djBIcL;
        if (interfaceC53558wnk == null || (strEZpvd = interfaceC53558wnk.EZpvd(this, c55887xsSFFgQHt.AhwBna(), TradeType.BUY_OPEN)) == null) {
            return;
        }
        c55887xsSFFgQHt.gEmmrt(strEZpvd);
    }

    private final void AuCTelauCTel() {
        TradeLiveData<java.util.List<MpStgyInfo>> tradeLiveDataAxsJAY = OLrzqt().AxsJAY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAxsJAY.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<LossInsurance> tradeLiveDataFZBcTu = OLrzqt().djBIcL().fZBcTu();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataFZBcTu.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.EZpvd(this.OLrzqt, (LossInsurance) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweORxRYg = OLrzqt().ORxRYg();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweORxRYg.observe(viewLifecycleOwner3, new Application(new Function1() { // from class: o.vhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweQKVWgx = OLrzqt().QKVWgx();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweQKVWgx.observe(viewLifecycleOwner4, new Application(new Function1() { // from class: o.vhX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<ExtraActualMarginResp> c56111xweFIwbmz = OLrzqt().fIwbmz();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweFIwbmz.observe(viewLifecycleOwner5, new Application(new Function1() { // from class: o.vhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.KWHzl(this.AEQbTJ, (ExtraActualMarginResp) obj);
            }
        }));
        C56111xwe<java.util.List<StrategyResponse>> c56111xweDTwDnp = OLrzqt().DTwDnp();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweDTwDnp.observe(viewLifecycleOwner6, new Application(new Function1() { // from class: o.vhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.EZpvd(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final C51141vhS c51141vhS, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        MpStgyInfo mpStgyInfo = (MpStgyInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (mpStgyInfo != null) {
            c51141vhS.EZpvd(mpStgyInfo.getStgyParam().getInstType(), mpStgyInfo.getStgyParam().getInstId());
        }
        c51141vhS.hDKMBd();
        c51141vhS.OLrzqt().giSNqX();
        c51141vhS.uzCIH();
        c51141vhS.getFieldNames();
        C56111xwe<java.lang.String> c56111xweCopydefault = c51141vhS.OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = c51141vhS.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vhZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51141vhS.AhwBna(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51141vhS, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51141vhS.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51141vhS c51141vhS, LossInsurance lossInsurance) {
        AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
        if (abstractC51292vkK != null) {
            abstractC51292vkK.setBotLossInsuranceTag(lossInsurance != null ? lossInsurance.getVoucherValue() : null, lossInsurance != null ? lossInsurance.getVoucherStatus() : null, lossInsurance != null ? java.lang.Boolean.valueOf(lossInsurance.getEligible()) : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51141vhS.OLrzqt(str);
        c51141vhS.OLrzqt().gasjUx();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C51141vhS c51141vhS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51141vhS.valueOf = false;
        c51141vhS.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51141vhS c51141vhS, ExtraActualMarginResp extraActualMarginResp) {
        Intrinsics.checkNotNullParameter(extraActualMarginResp, "");
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (c51321vkn != null) {
            c51321vkn.fJNWhG().setActualMarginSz(extraActualMarginResp.getActualMarginSz());
            c51321vkn.fJNWhG().setExtraMarginSz(extraActualMarginResp.getExtraMarginSz());
            java.lang.String actualMarginSz = extraActualMarginResp.getActualMarginSz();
            if (actualMarginSz == null) {
                actualMarginSz = "";
            }
            java.lang.String strP_ = c51321vkn.p_(actualMarginSz);
            java.lang.String extraMarginSz = extraActualMarginResp.getExtraMarginSz();
            java.lang.String strP_2 = c51321vkn.p_(extraMarginSz != null ? extraMarginSz : "");
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getExtraMarginSz()) && !C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getActualMarginSz())) {
                AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
                if (abstractC51292vkK != null) {
                    abstractC51292vkK.setActualPlusMarginAmtAvaValue("--");
                }
            } else {
                AbstractC51292vkK abstractC51292vkK2 = c51141vhS.gEmmrt;
                if (abstractC51292vkK2 != null) {
                    abstractC51292vkK2.setActualPlusMarginAmtAvaValue(strP_ + Marker.ANY_NON_NULL_MARKER + strP_2 + " " + c51321vkn.getFieldNames());
                }
            }
            AbstractC51292vkK abstractC51292vkK3 = c51141vhS.gEmmrt;
            if (abstractC51292vkK3 != null) {
                abstractC51292vkK3.setTotalInvest(c51321vkn.KWHzl(c51321vkn.fJNWhG().getActualMarginSz(), c51321vkn.fJNWhG().getLever()));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51141vhS c51141vhS, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        FragmentActivity activity = c51141vhS.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : c51141vhS.AYXKKw, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : ((StrategyResponse) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        c51141vhS.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C51141vhS c51141vhS, androidx.core.util.Pair pair) {
        C56238xyz c56238xyzKWHzl;
        java.lang.String message;
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c51141vhS.OLrzqt().QfsBiF().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        F f = pair.first;
        AbstractC51317vkj abstractC51317vkjDjBIcL = c51141vhS.OLrzqt().djBIcL();
        C51321vkn c51321vkn = abstractC51317vkjDjBIcL instanceof C51321vkn ? (C51321vkn) abstractC51317vkjDjBIcL : null;
        if (Intrinsics.EZpvd((java.lang.Object) f, (java.lang.Object) ((c51321vkn == null || (c56238xyzKWHzl = c51321vkn.KWHzl()) == null) ? null : c56238xyzKWHzl.bB_()))) {
            S s = pair.second;
            if (s instanceof BizApiException) {
                Intrinsics.copydefault(s, "");
                if (Intrinsics.EZpvd((java.lang.Object) ((BizApiException) s).getCode(), (java.lang.Object) "51399")) {
                    c51141vhS.valueOf = true;
                    AbstractC51292vkK abstractC51292vkK = c51141vhS.gEmmrt;
                    if (abstractC51292vkK != null) {
                        S s2 = pair.second;
                        Intrinsics.copydefault(s2, "");
                        abstractC51292vkK.EZpvd(false, C33129mqd.gEmmrt(((BizApiException) s2).getMsg()));
                    }
                }
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c51141vhS.OLrzqt().gHZMYf().bB_())) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51141vhS, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(C51133vhK.class.getSimpleName());
        androidx.fragment.app.DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        dismiss();
    }

    public final void OLrzqt(boolean z) {
        android.graphics.drawable.Drawable drawable = null;
        if (z) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DNMMPQ);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                drawable = drawableKWHzl;
            }
            values().valueOf.setImageDrawable(drawable);
            values().AYXKKw.setVisibility(0);
            values().DbNXlk.setVisibility(0);
            values().fetchVPNInfo.setVisibility(0);
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.DCUTEIddSDPG);
        if (drawableKWHzl2 != null) {
            drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            drawable = drawableKWHzl2;
        }
        values().valueOf.setImageDrawable(drawable);
        values().AYXKKw.setVisibility(8);
        values().DbNXlk.setVisibility(8);
        values().fetchVPNInfo.setVisibility(8);
    }

    public final void zsXlph() {
        values().OLrzqt.setText(OLrzqt().finit() ? C33070mpX.AYXKKw(C55688xof.Application.hfeTOA) : C33070mpX.AYXKKw(C55688xof.Application.dpErvT));
        C52794wYp c52794wYp = values().OLrzqt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vhS$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "create", false, 4, null);
            java.lang.String str = C51141vhS.this.AYXKKw;
            EventParamsList.put$default(eventParamsList, "bot_type", str == null ? "" : str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "copy_type", C51141vhS.this.AubY(), false, 4, null);
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final boolean isConnected() {
        CopyBotReqParam copyBotReqParamEZpvd;
        AbstractC51292vkK abstractC51292vkK;
        AbstractC51292vkK abstractC51292vkK2 = this.gEmmrt;
        if (abstractC51292vkK2 == null || (copyBotReqParamEZpvd = abstractC51292vkK2.EZpvd()) == null) {
            return false;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAEQbTJ = OLrzqt().AEQbTJ(copyBotReqParamEZpvd);
        if (!pairAEQbTJ.getFirst().booleanValue()) {
            AbstractC51292vkK abstractC51292vkK3 = this.gEmmrt;
            if (abstractC51292vkK3 != null) {
                abstractC51292vkK3.EZpvd(false, pairAEQbTJ.getSecond());
            }
        } else if (!this.valueOf && (abstractC51292vkK = this.gEmmrt) != null) {
            AbstractC51292vkK.refreshValidView$default(abstractC51292vkK, true, null, 2, null);
        }
        return pairAEQbTJ.getFirst().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AubY() {
        return OLrzqt().finit() ? "profit_sharing" : "non_profit_sharing";
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
