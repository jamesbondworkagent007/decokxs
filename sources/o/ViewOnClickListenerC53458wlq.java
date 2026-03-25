package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.TradeType;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC49433uoU;
import o.InterfaceC49496upe;
import o.InterfaceC54581xNr;
import o.InterfaceC8104awT;
import o.xDM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnClickListenerC53458wlq extends ConstraintLayout implements View.OnClickListener, InterfaceC49433uoU {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public xDM AEQbTJ;
    public boolean AYXKKw;
    public InterfaceC49943uyA AhwBna;
    public final Observer<PositionLiveDataResp> AkhnZx;
    public TradeCloseAvailable DbNXlk;
    public java.util.ArrayList<java.lang.Object> KWHzl;
    public MaxAvailableResp OLrzqt;
    public final AbstractC50995vef copydefault;
    public final InterfaceC56387yDm djBIcL;
    public TacticsData fIwbmz;
    public final TradeLiveData<PositionLiveDataResp> fetchVPNInfo;
    public final java.util.ArrayList<InterfaceC49433uoU.Activity> gEmmrt;
    public java.util.ArrayList<java.lang.Object> isConnected;
    public final InterfaceC56387yDm valueOf;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53458wlq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53458wlq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final void KWHzl(android.widget.CompoundButton compoundButton, boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TacticsData tacticsData, boolean z) {
        this.fIwbmz = tacticsData;
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeCloseAvailable KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MaxAvailableResp OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.String, Unit> copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputPanelView(InterfaceC49943uyA interfaceC49943uyA) {
        this.AhwBna = interfaceC49943uyA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaceOrderClickCallback(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.values = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:71) call: o.wlq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC53458wlq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53458wlq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.DDjgSw, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50995vef abstractC50995vef = (AbstractC50995vef) viewDataBindingInflate;
        this.copydefault = abstractC50995vef;
        this.gEmmrt = new java.util.ArrayList<>();
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wlt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC53458wlq.AhwBna(this.copydefault);
            }
        });
        this.KWHzl = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
        this.fetchVPNInfo = new TradeLiveData<>();
        this.AkhnZx = new Observer() { // from class: o.wlv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ViewOnClickListenerC53458wlq.EZpvd(this.KWHzl, (PositionLiveDataResp) obj);
            }
        };
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC53458wlq.gEmmrt(this.AEQbTJ);
            }
        });
        abstractC50995vef.OLrzqt.setEnabled(false);
        wYK wyk = abstractC50995vef.OLrzqt;
        TacticsData tacticsData = this.fIwbmz;
        wyk.setChecked(Intrinsics.EZpvd((java.lang.Object) (tacticsData != null ? tacticsData.getReduce_only() : null), (java.lang.Object) "true"));
        abstractC50995vef.EZpvd.setAvaShowTransfer(java.lang.Boolean.FALSE);
        abstractC50995vef.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC53458wlq.KWHzl(compoundButton, z);
            }
        });
        abstractC50995vef.KWHzl.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.getFieldNames));
        C55258xgZ c55258xgZ = abstractC50995vef.KWHzl;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, context));
        abstractC50995vef.djBIcL.setOnClickListener(this);
        abstractC50995vef.copydefault.setOnClickListener(this);
        C52794wYp c52794wYp = abstractC50995vef.AEQbTJ;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = abstractC50995vef.DbNXlk;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
    }

    public final C55887xsS AEQbTJ() {
        return (C55887xsS) this.valueOf.getValue();
    }

    public static final C55887xsS AhwBna(ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
        java.lang.String instType;
        java.lang.String tradeQuoteCcy;
        java.lang.String instId;
        TacticsData tacticsData = viewOnClickListenerC53458wlq.fIwbmz;
        java.lang.String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = viewOnClickListenerC53458wlq.fIwbmz;
        if (tacticsData2 != null && (instId = tacticsData2.getInstId()) != null) {
            str = instId;
        }
        C55887xsS c55887xsS = new C55887xsS(instType, str);
        TacticsData tacticsData3 = viewOnClickListenerC53458wlq.fIwbmz;
        if (tacticsData3 == null || (tradeQuoteCcy = tacticsData3.getTradeQuoteCcy()) == null || !java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)).booleanValue()) {
            tradeQuoteCcy = null;
        }
        c55887xsS.gEmmrt(tradeQuoteCcy);
        return c55887xsS;
    }

    public static final void EZpvd(ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq, PositionLiveDataResp positionLiveDataResp) {
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        TradeCloseAvailable tradeCloseAvailable;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(positionLiveDataResp, "");
        TradeCloseAvailable tradeCloseAvailable2 = tradeCloseAvailable;
        TradeCloseAvailable tradeCloseAvailable3 = new TradeCloseAvailable(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        TacticsData tacticsData = viewOnClickListenerC53458wlq.fIwbmz;
        if (tacticsData != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(tacticsData.getInstId());
            if (bizInstrumentValueOf == null) {
                return;
            }
            java.util.List<TradePositionManager.PositionItem> positions = positionLiveDataResp.getPositions();
            if (positions != null) {
                for (TradePositionManager.PositionItem positionItem : positions) {
                    if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentValueOf.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "long")) {
                        tradeCloseAvailable = tradeCloseAvailable2;
                        tradeCloseAvailable.setLongLast(positionItem.getLast());
                        tradeCloseAvailable.setPosLong(C33129mqd.addS$default(tradeCloseAvailable.getPosLong(), positionItem.getPos(), null, null, null, 14, null));
                    } else {
                        tradeCloseAvailable = tradeCloseAvailable2;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentValueOf.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "short")) {
                        tradeCloseAvailable.setShortLast(positionItem.getLast());
                        tradeCloseAvailable.setPosShort(C33129mqd.addS$default(tradeCloseAvailable.getPosShort(), positionItem.getPos(), null, null, null, 14, null));
                    }
                    tradeCloseAvailable2 = tradeCloseAvailable;
                }
            }
            TradeCloseAvailable tradeCloseAvailable4 = tradeCloseAvailable2;
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstFamily(), null, 4, null);
            C53539wnR c53539wnR = viewOnClickListenerC53458wlq.copydefault.gEmmrt;
            if (c54571xNhCreateStrategyTradeConverter$default == null || (strGEmmrt = c54571xNhCreateStrategyTradeConverter$default.gEmmrt(tradeCloseAvailable4.getPosLong())) == null) {
                strGEmmrt = "";
            }
            c53539wnR.setFooterAvaValue(strGEmmrt);
            C53539wnR c53539wnR2 = viewOnClickListenerC53458wlq.copydefault.AYXKKw;
            if (c54571xNhCreateStrategyTradeConverter$default != null && (strGEmmrt2 = c54571xNhCreateStrategyTradeConverter$default.gEmmrt(tradeCloseAvailable4.getPosShort())) != null) {
                str = strGEmmrt2;
            }
            c53539wnR2.setFooterAvaValue(str);
            viewOnClickListenerC53458wlq.DbNXlk = tradeCloseAvailable4;
        }
    }

    private final androidx.fragment.app.FragmentManager AhwBna() {
        return (androidx.fragment.app.FragmentManager) this.djBIcL.getValue();
    }

    public static final androidx.fragment.app.FragmentManager gEmmrt(ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
        return ViewKt.findFragment(viewOnClickListenerC53458wlq).getChildFragmentManager();
    }

    /* JADX INFO: renamed from: o.wlq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wlq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wlq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.wlq$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC53458wlq AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = viewOnClickListenerC53458wlq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            TacticsData tacticsData;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function2<java.lang.String, java.lang.String, Unit> function2Copydefault = this.AEQbTJ.copydefault();
                if (function2Copydefault != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    TacticsData tacticsData2 = this.AEQbTJ.fIwbmz;
                    java.lang.String posSide = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), tacticsData2 != null ? tacticsData2.getInstType() : null) && C56059xvf.EZpvd.DbNXlk() && (tacticsData = this.AEQbTJ.fIwbmz) != null) {
                        posSide = tacticsData.getPosSide();
                    }
                    function2Copydefault.invoke("clickBuy", posSide);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wlq$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ViewOnClickListenerC53458wlq OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = viewOnClickListenerC53458wlq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            TacticsData tacticsData;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function2<java.lang.String, java.lang.String, Unit> function2Copydefault = this.OLrzqt.copydefault();
                if (function2Copydefault != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    TacticsData tacticsData2 = this.OLrzqt.fIwbmz;
                    java.lang.String posSide = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), tacticsData2 != null ? tacticsData2.getInstType() : null) && C56059xvf.EZpvd.DbNXlk() && (tacticsData = this.OLrzqt.fIwbmz) != null) {
                        posSide = tacticsData.getPosSide();
                    }
                    function2Copydefault.invoke("clickSell", posSide);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wlq$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.content.Context context) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.getString(C55688xof.Application.ddhgMB));
                java.lang.String string = this.OLrzqt.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        TacticsData tacticsData;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        xOW newProxyInstance;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        InterfaceC49943uyA interfaceC49943uyA = this.AhwBna;
        if (interfaceC49943uyA != null) {
            interfaceC49943uyA.KWHzl();
        }
        this.copydefault.djBIcL.setVisibility(8);
        this.copydefault.EZpvd.setVisibility(0);
        java.lang.String str = "";
        this.copydefault.EZpvd.setFooterAvaValue("");
        TacticsData tacticsData2 = this.fIwbmz;
        java.lang.String instType = tacticsData2 != null ? tacticsData2.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "MARGIN")) {
            this.copydefault.AkhnZx.setVisibility(0);
            this.copydefault.AkhnZx.setFooterAvaValue("");
        } else {
            this.copydefault.AkhnZx.setVisibility(8);
            this.copydefault.OLrzqt.setVisibility(8);
            this.copydefault.KWHzl.setVisibility(8);
        }
        TacticsData tacticsData3 = this.fIwbmz;
        if (tacticsData3 != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData3.getInstType())) == null) ? null : java.lang.Boolean.valueOf(abstractC54531xLwOLrzqt3.getFieldNames()), java.lang.Boolean.FALSE)) {
                this.copydefault.copydefault.setVisibility(0);
                this.copydefault.AEQbTJ.setVisibility(8);
                this.copydefault.AhwBna.setVisibility(8);
                this.copydefault.gEmmrt.setVisibility(8);
                this.copydefault.DbNXlk.setVisibility(8);
                this.copydefault.valueOf.setVisibility(8);
                this.copydefault.AYXKKw.setVisibility(8);
                return;
            }
        }
        TacticsData tacticsData4 = this.fIwbmz;
        java.lang.String instType2 = tacticsData4 != null ? tacticsData4.getInstType() : null;
        if (instType2 != null) {
            switch (instType2.hashCode()) {
                case -2027980370:
                    if (!instType2.equals("MARGIN")) {
                        return;
                    }
                    tacticsData = this.fIwbmz;
                    if (!Intrinsics.EZpvd((java.lang.Object) (tacticsData == null ? tacticsData.getSide() : null), (java.lang.Object) "buy")) {
                        C53539wnR.setFooterAvaTitle$default(this.copydefault.AkhnZx, getContext().getString(C55688xof.Application.dispatchResult), false, null, 6, null);
                        this.copydefault.AEQbTJ.setVisibility(0);
                        this.copydefault.DbNXlk.setVisibility(8);
                        C52794wYp c52794wYp = this.copydefault.AEQbTJ;
                        java.lang.String string = getContext().getString(C55688xof.Application.setPipParamsSourceRectHint);
                        TacticsData tacticsData5 = this.fIwbmz;
                        if (tacticsData5 != null) {
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(tacticsData5.getInstType())) != null && (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(tacticsData5.getInstId())) != null) {
                                tradeSymbol = bizInstrumentValueOf2.getTradeSymbol();
                            }
                            if (tradeSymbol != null) {
                                str = tradeSymbol;
                            }
                        }
                        c52794wYp.setText(string + " " + str);
                    } else {
                        C53539wnR.setFooterAvaTitle$default(this.copydefault.AkhnZx, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), false, null, 6, null);
                        this.copydefault.AEQbTJ.setVisibility(8);
                        this.copydefault.DbNXlk.setVisibility(0);
                        C52794wYp c52794wYp2 = this.copydefault.DbNXlk;
                        java.lang.String string2 = getContext().getString(C55688xof.Application.addMenuProvider);
                        TacticsData tacticsData6 = this.fIwbmz;
                        if (tacticsData6 != null) {
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt3 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt3.OLrzqt(tacticsData6.getInstType())) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(tacticsData6.getInstId())) != null) {
                                tradeSymbol = bizInstrumentValueOf.getTradeSymbol();
                            }
                            if (tradeSymbol != null) {
                                str = tradeSymbol;
                            }
                        }
                        c52794wYp2.setText(string2 + " " + str);
                    }
                    this.copydefault.AhwBna.setVisibility(8);
                    this.copydefault.gEmmrt.setVisibility(8);
                    this.copydefault.valueOf.setVisibility(8);
                    this.copydefault.AYXKKw.setVisibility(8);
                    return;
                case 2552066:
                    if (!instType2.equals("SPOT")) {
                        return;
                    }
                    tacticsData = this.fIwbmz;
                    if (!Intrinsics.EZpvd((java.lang.Object) (tacticsData == null ? tacticsData.getSide() : null), (java.lang.Object) "buy")) {
                    }
                    this.copydefault.AhwBna.setVisibility(8);
                    this.copydefault.gEmmrt.setVisibility(8);
                    this.copydefault.valueOf.setVisibility(8);
                    this.copydefault.AYXKKw.setVisibility(8);
                    return;
                case 2558355:
                    if (!instType2.equals("SWAP")) {
                        return;
                    }
                    break;
                case 214415088:
                    if (!instType2.equals("FUTURES")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = C54589xNz.EZpvd.OLrzqt();
            java.lang.String strAuCTelauCTel = (interfaceC54581xNrOLrzqt4 == null || (newProxyInstance = interfaceC54581xNrOLrzqt4.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel();
            if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                TacticsData tacticsData7 = this.fIwbmz;
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsData7 != null ? tacticsData7.getSide() : null), (java.lang.Object) "buy")) {
                    this.copydefault.AEQbTJ.setVisibility(0);
                    this.copydefault.AEQbTJ.setText(java.lang.String.valueOf(getContext().getString(C55688xof.Application.setPipParamsSourceRectHint)));
                    this.copydefault.AhwBna.setVisibility(0);
                    C53539wnR.setFooterAvaTitle$default(this.copydefault.AhwBna, getContext().getString(C55688xof.Application.dispatchResult), false, null, 6, null);
                    this.copydefault.AhwBna.setFooterAvaValue("");
                    this.copydefault.gEmmrt.setVisibility(8);
                    this.copydefault.DbNXlk.setVisibility(8);
                    this.copydefault.valueOf.setVisibility(8);
                    this.copydefault.AYXKKw.setVisibility(8);
                    return;
                }
                this.copydefault.DbNXlk.setVisibility(0);
                this.copydefault.DbNXlk.setText(java.lang.String.valueOf(getContext().getString(C55688xof.Application.addMenuProvider)));
                this.copydefault.valueOf.setVisibility(0);
                C53539wnR.setFooterAvaTitle$default(this.copydefault.valueOf, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), false, null, 6, null);
                this.copydefault.valueOf.setFooterAvaValue("");
                this.copydefault.AYXKKw.setVisibility(8);
                this.copydefault.AEQbTJ.setVisibility(8);
                this.copydefault.AhwBna.setVisibility(8);
                this.copydefault.gEmmrt.setVisibility(8);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                TacticsData tacticsData8 = this.fIwbmz;
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsData8 != null ? tacticsData8.getSide() : null), (java.lang.Object) "buy")) {
                    TacticsData tacticsData9 = this.fIwbmz;
                    if (Intrinsics.EZpvd((java.lang.Object) (tacticsData9 != null ? tacticsData9.getPosSide() : null), (java.lang.Object) "long")) {
                        C53539wnR c53539wnR = this.copydefault.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
                        c53539wnR.setVisibility(0);
                        C52794wYp c52794wYp3 = this.copydefault.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                        c52794wYp3.setVisibility(0);
                        this.copydefault.AEQbTJ.setText(getContext().getString(C55688xof.Application.lambdanew0));
                        C53539wnR c53539wnR2 = this.copydefault.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR2, "");
                        c53539wnR2.setVisibility(0);
                        C53539wnR.setFooterAvaTitle$default(this.copydefault.AhwBna, getContext().getString(C55688xof.Application.setPosition), false, null, 6, null);
                        this.copydefault.AhwBna.setFooterAvaValue("");
                        C53539wnR c53539wnR3 = this.copydefault.AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR3, "");
                        c53539wnR3.setVisibility(8);
                    } else {
                        C53539wnR c53539wnR4 = this.copydefault.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR4, "");
                        c53539wnR4.setVisibility(8);
                        C52794wYp c52794wYp4 = this.copydefault.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                        c52794wYp4.setVisibility(0);
                        this.copydefault.AEQbTJ.setText(getContext().getString(C55688xof.Application.getCREATORannotations));
                        C53539wnR c53539wnR5 = this.copydefault.AhwBna;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR5, "");
                        c53539wnR5.setVisibility(8);
                        C53539wnR c53539wnR6 = this.copydefault.AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(c53539wnR6, "");
                        c53539wnR6.setVisibility(0);
                        this.copydefault.AYXKKw.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractSynchronousResult), true, new Function0() { // from class: o.wlr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return ViewOnClickListenerC53458wlq.AYXKKw(this.AEQbTJ);
                            }
                        });
                        this.copydefault.AYXKKw.setFooterAvaValue("");
                    }
                    C52794wYp c52794wYp5 = this.copydefault.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp5, "");
                    c52794wYp5.setVisibility(8);
                    C53539wnR c53539wnR7 = this.copydefault.valueOf;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR7, "");
                    c53539wnR7.setVisibility(8);
                    C53539wnR c53539wnR8 = this.copydefault.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR8, "");
                    c53539wnR8.setVisibility(8);
                    return;
                }
                TacticsData tacticsData10 = this.fIwbmz;
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsData10 != null ? tacticsData10.getPosSide() : null), (java.lang.Object) "short")) {
                    C53539wnR c53539wnR9 = this.copydefault.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR9, "");
                    c53539wnR9.setVisibility(0);
                    C52794wYp c52794wYp6 = this.copydefault.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp6, "");
                    c52794wYp6.setVisibility(0);
                    this.copydefault.DbNXlk.setText(getContext().getString(C55688xof.Application.addOnMultiWindowModeChangedListener));
                    C53539wnR c53539wnR10 = this.copydefault.valueOf;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR10, "");
                    c53539wnR10.setVisibility(0);
                    C53539wnR.setFooterAvaTitle$default(this.copydefault.valueOf, getContext().getString(C55688xof.Application.isDrawerIndicatorEnabled), false, null, 6, null);
                    this.copydefault.valueOf.setFooterAvaValue("");
                    C53539wnR c53539wnR11 = this.copydefault.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR11, "");
                    c53539wnR11.setVisibility(8);
                } else {
                    C53539wnR c53539wnR12 = this.copydefault.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR12, "");
                    c53539wnR12.setVisibility(8);
                    C52794wYp c52794wYp7 = this.copydefault.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp7, "");
                    c52794wYp7.setVisibility(0);
                    this.copydefault.DbNXlk.setText(getContext().getString(C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1));
                    C53539wnR c53539wnR13 = this.copydefault.valueOf;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR13, "");
                    c53539wnR13.setVisibility(8);
                    C53539wnR c53539wnR14 = this.copydefault.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(c53539wnR14, "");
                    c53539wnR14.setVisibility(0);
                    this.copydefault.gEmmrt.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractsCaptureVideo), true, new Function0() { // from class: o.wlp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ViewOnClickListenerC53458wlq.valueOf(this.copydefault);
                        }
                    });
                    this.copydefault.gEmmrt.setFooterAvaValue("");
                }
                C52794wYp c52794wYp8 = this.copydefault.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c52794wYp8, "");
                c52794wYp8.setVisibility(8);
                C53539wnR c53539wnR15 = this.copydefault.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c53539wnR15, "");
                c53539wnR15.setVisibility(8);
                C53539wnR c53539wnR16 = this.copydefault.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c53539wnR16, "");
                c53539wnR16.setVisibility(8);
            }
        }
    }

    public static final Unit AYXKKw(ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
        viewOnClickListenerC53458wlq.values();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq) {
        viewOnClickListenerC53458wlq.values();
        return Unit.INSTANCE;
    }

    private final void values() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticLambda1));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanion), new View.OnClickListener() { // from class: o.wlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC53458wlq.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        isConnected();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        InterfaceC8104awT interfaceC8104awT;
        if (Intrinsics.EZpvd(view, this.copydefault.djBIcL)) {
            android.content.Context context = getContext();
            if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                return;
            }
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            return;
        }
        if (Intrinsics.EZpvd(view, this.copydefault.copydefault)) {
            InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context2, "2", null, 4, null);
        }
    }

    public final java.lang.Boolean EZpvd() {
        TacticsData tacticsData = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) (tacticsData != null ? tacticsData.getInstType() : null), (java.lang.Object) "MARGIN")) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public void OLrzqt(@NotNull final Function1<? super MaxAvailableResp, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xDM xdm = this.AEQbTJ;
        if (xdm != null) {
            InterfaceC49943uyA interfaceC49943uyA = this.AhwBna;
            xDM.ActionBar.refreshOrderPrice$default(xdm, interfaceC49943uyA != null ? interfaceC49943uyA.OLrzqt() : null, false, new Function1() { // from class: o.wln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC53458wlq.copydefault(function1, (MaxAvailableResp) obj);
                }
            }, 2, null);
        }
    }

    public static final Unit copydefault(Function1 function1, MaxAvailableResp maxAvailableResp) {
        function1.invoke(maxAvailableResp);
        return Unit.INSTANCE;
    }

    private final boolean gEmmrt() {
        java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
        TacticsData tacticsData = this.fIwbmz;
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), tacticsData != null ? tacticsData.getInstType() : null) && C56059xvf.EZpvd.DbNXlk()) {
            TacticsData tacticsData2 = this.fIwbmz;
            if (Intrinsics.EZpvd((java.lang.Object) (tacticsData2 != null ? tacticsData2.getSide() : null), (java.lang.Object) "buy")) {
                TacticsData tacticsData3 = this.fIwbmz;
                if (!Intrinsics.EZpvd((java.lang.Object) (tacticsData3 != null ? tacticsData3.getPosSide() : null), (java.lang.Object) "short")) {
                }
                return true;
            }
            TacticsData tacticsData4 = this.fIwbmz;
            if (Intrinsics.EZpvd((java.lang.Object) (tacticsData4 != null ? tacticsData4.getSide() : null), (java.lang.Object) "sell")) {
                TacticsData tacticsData5 = this.fIwbmz;
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsData5 != null ? tacticsData5.getPosSide() : null), (java.lang.Object) "long")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void djBIcL() {
        if (!gEmmrt()) {
            fetchVPNInfo();
        } else if (this.AYXKKw) {
            C54782xVc.AEQbTJ.djBIcL().observeForever(this.AkhnZx);
        } else {
            DbNXlk();
        }
    }

    private final void isConnected() {
        AkhnZx();
        fJNWhG();
    }

    private final void fJNWhG() {
        if (this.AYXKKw) {
            C54782xVc.AEQbTJ.djBIcL().removeObserver(this.AkhnZx);
            return;
        }
        this.fetchVPNInfo.removeObserver(this.AkhnZx);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.isConnected);
        }
        this.isConnected.clear();
    }

    private final void AkhnZx() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.KWHzl);
        }
        this.KWHzl.clear();
    }

    /* JADX INFO: renamed from: o.wlq$Dialog */
    public static final class Dialog extends AbstractC55747xpl {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC55747xpl
        public java.lang.String EZpvd() {
            return "TwapTradeFooterView";
        }

        public Dialog(java.lang.String str) {
            super("ANY", null, null, str, false, 16, null);
        }

        @Override // o.AbstractC55747xpl
        public void EZpvd(java.util.List<TradePositionData> list, java.lang.String str, java.util.List<TradeUserPositionInfo> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            ViewOnClickListenerC53458wlq.this.fetchVPNInfo.setValue(new PositionLiveDataResp(true, xOJ.AEQbTJ.EZpvd(list, list2), null, 4, null));
        }

        @Override // o.AbstractC55747xpl
        public void KWHzl(java.lang.String str, java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(exc, "");
            boolean z = exc instanceof BizApiException;
            ViewOnClickListenerC53458wlq.this.fetchVPNInfo.setValue(new PositionLiveDataResp(false, yDY.AhwBna(), z ? ((BizApiException) exc).getMsg() : exc.getMessage()));
            if (z) {
                C33134mqi.toastWithFailedIcon$default(((BizApiException) exc).getMsg(), 0, 1, (java.lang.Object) null);
            }
        }
    }

    private final void DbNXlk() {
        this.fetchVPNInfo.observeForever(this.AkhnZx);
        Dialog dialog = new Dialog(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        this.isConnected.clear();
        this.isConnected.add(dialog);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.isConnected);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fetchVPNInfo() {
        java.lang.String tdMode;
        java.lang.Boolean boolValueOf;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C56084xwD fieldNames;
        xOW newProxyInstance;
        xOV xovEZpvd;
        TacticsData tacticsData = this.fIwbmz;
        if (tacticsData == null) {
            return;
        }
        java.lang.String strAEQbTJ = AEQbTJ().AEQbTJ("twap");
        pUU.EZpvd("USDRename", "sub Available balance TWAP footer view, instId:" + tacticsData.getInstId() + ", tradeQuoteCcy:" + strAEQbTJ);
        java.lang.String instId = tacticsData.getInstId();
        java.lang.String instType = tacticsData.getInstType();
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstType(), (java.lang.Object) "SPOT")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) {
                tdMode = "cash";
            } else {
                tdMode = tacticsData.getTdMode();
                if (tdMode == null) {
                    tdMode = "";
                }
            }
        } else {
            tdMode = tacticsData.getTdMode();
            if (tdMode == null) {
            }
        }
        java.lang.String str = tdMode;
        if (yDY.gEmmrt("SPOT", "MARGIN").contains(tacticsData.getInstType())) {
            TacticsData tacticsData2 = this.fIwbmz;
            boolValueOf = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) (tacticsData2 != null ? tacticsData2.getSide() : null), (java.lang.Object) "buy"));
        } else {
            boolValueOf = null;
        }
        InterfaceC49943uyA interfaceC49943uyA = this.AhwBna;
        FragmentManager fragmentManager = new FragmentManager(strAEQbTJ, this, instId, instType, str, boolValueOf, interfaceC49943uyA != null ? interfaceC49943uyA.OLrzqt() : null, yDY.gEmmrt("SPOT", "MARGIN").contains(tacticsData.getInstType()) ? EZpvd() : null, Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstType(), (java.lang.Object) "MARGIN") ? AYXKKw() : null, (!yDY.gEmmrt("FUTURES", "SWAP").contains(tacticsData.getInstType()) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw());
        this.KWHzl.clear();
        this.KWHzl.add(fragmentManager);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null) {
            interfaceC54581xNrOLrzqt3.copydefault(this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.wlq$FragmentManager */
    public static final class FragmentManager extends AbstractC55740xpe {
        public final /* synthetic */ ViewOnClickListenerC53458wlq EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(java.lang.String str, ViewOnClickListenerC53458wlq viewOnClickListenerC53458wlq, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.String str5, java.lang.Boolean bool2, java.lang.String str6, java.lang.String str7) {
            super(null, null, str3, str2, str6, str5, str4, bool2, bool, str7, null, null, null, null, null, null, null, null, null, str, 523267, null);
            this.EZpvd = viewOnClickListenerC53458wlq;
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            this.EZpvd.AEQbTJ = xdm;
            this.EZpvd.OLrzqt(maxAvailableResp);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(MaxAvailableResp maxAvailableResp) {
        this.OLrzqt = maxAvailableResp;
        wPL wpl = wPL.KWHzl;
        TacticsData tacticsData = this.fIwbmz;
        this.OLrzqt = wpl.OLrzqt(maxAvailableResp, tacticsData != null ? tacticsData.getInstType() : null, java.lang.Boolean.valueOf(EZpvd(this.fIwbmz)));
        TacticsData tacticsData2 = this.fIwbmz;
        java.lang.String instType = tacticsData2 != null ? tacticsData2.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        copydefault(this.OLrzqt);
                        return;
                    }
                    return;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        KWHzl(this.OLrzqt);
                        return;
                    }
                    return;
                case 2558355:
                    if (!instType.equals("SWAP")) {
                        return;
                    }
                    break;
                case 214415088:
                    if (!instType.equals("FUTURES")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            EZpvd(this.OLrzqt);
        }
    }

    private final void KWHzl(MaxAvailableResp maxAvailableResp) {
        java.lang.String first;
        java.lang.String tradeSymbol;
        kotlin.Pair pairConvertSpotAvaTrade$default;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        TacticsData tacticsData = this.fIwbmz;
        if (tacticsData == null) {
            return;
        }
        java.lang.String str = "--";
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            first = "--";
        } else {
            java.lang.String available = maxAvailableResp.getAvailable();
            C55887xsS c55887xsSAEQbTJ = AEQbTJ();
            if (c55887xsSAEQbTJ != null) {
                TradeType tradeType = Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy") ? TradeType.BUY_OPEN : TradeType.SELL_CLOSE;
                java.lang.Boolean boolEZpvd = EZpvd();
                boolean zBooleanValue = boolEZpvd != null ? boolEZpvd.booleanValue() : false;
                java.lang.String tdMode = tacticsData.getTdMode();
                if (tdMode == null) {
                    return;
                } else {
                    pairOLrzqt = c55887xsSAEQbTJ.OLrzqt(available, tradeType, zBooleanValue, tdMode, AYXKKw(), "twap", maxAvailableResp.getTradeQuoteCcy(), Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy"));
                }
            } else {
                pairOLrzqt = null;
            }
            first = pairOLrzqt != null ? pairOLrzqt.getFirst() : null;
        }
        C53539wnR c53539wnR = this.copydefault.EZpvd;
        TradeType tradeType2 = C49861uwY.Companion.copydefault().get();
        TradeType tradeType3 = TradeType.BUY_OPEN;
        if (tradeType2 == tradeType3) {
            C55887xsS c55887xsSAEQbTJ2 = AEQbTJ();
            if (c55887xsSAEQbTJ2 == null || (tradeSymbol = c55887xsSAEQbTJ2.copydefault("twap")) == null) {
                tradeSymbol = "";
            }
        } else {
            tradeSymbol = tacticsData.getTradeSymbol();
        }
        c53539wnR.setTransferCoin(tradeSymbol);
        this.copydefault.EZpvd.setFooterAvaValue(first);
        wPL wpl = wPL.KWHzl;
        C53539wnR c53539wnR2 = this.copydefault.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        wpl.EZpvd(c53539wnR2, interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null, maxAvailableResp, AhwBna(), java.lang.Boolean.valueOf(EZpvd(tacticsData)));
        if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
            java.lang.String maxSize = maxAvailableResp.getMaxSize();
            if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstType(), (java.lang.Object) "SPOT")) {
                C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                java.lang.String instId = tacticsData.getInstId();
                java.lang.String instType = tacticsData.getInstType();
                if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy")) {
                    tradeType3 = TradeType.SELL_CLOSE;
                }
                pairConvertSpotAvaTrade$default = C54796xVq.convertSpotMaxSizeQuoteCcy$default(c54796xVq, maxSize, instId, instType, tradeType3, maxAvailableResp.getTradeQuoteCcy(), false, 32, null);
            } else {
                C54796xVq c54796xVq2 = C54796xVq.AEQbTJ;
                if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy")) {
                    tradeType3 = TradeType.SELL_CLOSE;
                }
                pairConvertSpotAvaTrade$default = C54796xVq.convertSpotAvaTrade$default(c54796xVq2, tradeType3, maxSize, tacticsData.getInstId(), tacticsData.getInstType(), EZpvd(), false, 32, null);
            }
            str = pairConvertSpotAvaTrade$default != null ? (java.lang.String) pairConvertSpotAvaTrade$default.getFirst() : null;
        }
        this.copydefault.AkhnZx.setFooterAvaValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(MaxAvailableResp maxAvailableResp) {
        java.lang.String first;
        java.lang.String avaCcy$default;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        TacticsData tacticsData = this.fIwbmz;
        if (tacticsData == null) {
            return;
        }
        java.lang.String str = "--";
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            first = "--";
        } else {
            C55887xsS c55887xsSAEQbTJ = AEQbTJ();
            if (c55887xsSAEQbTJ != null) {
                java.lang.String available = maxAvailableResp.getAvailable();
                TradeType tradeType = Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy") ? TradeType.BUY_OPEN : TradeType.SELL_CLOSE;
                java.lang.Boolean boolEZpvd = EZpvd();
                boolean zBooleanValue = boolEZpvd != null ? boolEZpvd.booleanValue() : false;
                java.lang.String tdMode = tacticsData.getTdMode();
                if (tdMode == null) {
                    return;
                } else {
                    pairOLrzqt = c55887xsSAEQbTJ.OLrzqt(available, tradeType, zBooleanValue, tdMode, AYXKKw(), "twap", maxAvailableResp.getTradeQuoteCcy(), Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy"));
                }
            } else {
                pairOLrzqt = null;
            }
            first = pairOLrzqt != null ? pairOLrzqt.getFirst() : null;
        }
        C53539wnR c53539wnR = this.copydefault.EZpvd;
        C55887xsS c55887xsSAEQbTJ2 = AEQbTJ();
        if (c55887xsSAEQbTJ2 == null) {
            avaCcy$default = "";
        } else {
            TradeType tradeType2 = C49861uwY.Companion.copydefault().get();
            if (tradeType2 == null) {
                return;
            }
            java.lang.Boolean boolEZpvd2 = EZpvd();
            boolean zBooleanValue2 = boolEZpvd2 != null ? boolEZpvd2.booleanValue() : false;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            avaCcy$default = C55887xsS.getAvaCcy$default(c55887xsSAEQbTJ2, tradeType2, zBooleanValue2, (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) ? "" : currentMarginMode$default, AYXKKw(), "twap", null, 32, null);
            if (avaCcy$default == null) {
            }
        }
        c53539wnR.setTransferCoin(avaCcy$default);
        this.copydefault.EZpvd.setFooterAvaValue(first);
        if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
            str = (java.lang.String) C54796xVq.convertSpotAvaTrade$default(C54796xVq.AEQbTJ, Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy") ? TradeType.BUY_OPEN : TradeType.SELL_CLOSE, maxAvailableResp.getMaxSize(), tacticsData.getInstId(), tacticsData.getInstType(), EZpvd(), false, 32, null).getFirst();
        }
        this.copydefault.AkhnZx.setFooterAvaValue(str);
    }

    public final boolean EZpvd(TacticsData tacticsData) {
        if (!C56059xvf.EZpvd.fIwbmz()) {
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) (tacticsData != null ? tacticsData.getInstType() : null), (java.lang.Object) "SPOT")) {
            return Intrinsics.EZpvd(tacticsData.isTradeBorrowMode(), java.lang.Boolean.TRUE);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String AYXKKw() {
        TacticsData tacticsData;
        TacticsData tacticsData2 = this.fIwbmz;
        java.lang.String ccy = tacticsData2 != null ? tacticsData2.getCcy() : null;
        if ((ccy == null || ccy.length() == 0) && (tacticsData = this.fIwbmz) != null && Intrinsics.EZpvd((java.lang.Object) tacticsData.getTdMode(), (java.lang.Object) "isolated")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType()) : null;
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.valueOf(tacticsData.getInstId()) : null;
            if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getSide(), (java.lang.Object) "buy")) {
                ccy = bizInstrumentValueOf != null ? bizInstrumentValueOf.getTradeSymbol() : null;
            } else if (bizInstrumentValueOf != null) {
                ccy = bizInstrumentValueOf.getQuoteSymbol();
            }
        }
        if (ccy == null || ccy.length() == 0) {
            return null;
        }
        return ccy;
    }

    private final void EZpvd(MaxAvailableResp maxAvailableResp) {
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        TacticsData tacticsData = this.fIwbmz;
        if (tacticsData != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsData.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(tacticsData.getInstId());
            if (bizInstrumentValueOf == null) {
                return;
            }
            java.lang.String safeString$default2 = "--";
            this.copydefault.EZpvd.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) ? "--" : C54796xVq.AEQbTJ.AEQbTJ(maxAvailableResp.getAvailable(), bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstId()).getFirst());
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(bizInstrumentValueOf.getInstType(), bizInstrumentValueOf.getInstFamily(), null, 4, null);
            if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getBuySize())) {
                safeString$default = "--";
            } else if (c54571xNhCreateStrategyTradeConverter$default == null || (c54536xMLDjBIcL3 = c54571xNhCreateStrategyTradeConverter$default.djBIcL(maxAvailableResp.getBuySize())) == null || (c54536xMLDjBIcL4 = c54536xMLDjBIcL3.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL4.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                safeString$default = "";
            }
            this.copydefault.AhwBna.setFooterAvaValue(safeString$default);
            if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getSellSize()) && (c54571xNhCreateStrategyTradeConverter$default == null || (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(maxAvailableResp.getSellSize())) == null || (c54536xMLDjBIcL2 = c54536xMLDjBIcL.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null)) {
                safeString$default2 = "";
            }
            this.copydefault.valueOf.setFooterAvaValue(safeString$default2);
        }
    }

    public final void EZpvd(boolean z) {
        this.copydefault.AEQbTJ.setEnabled(z);
        this.copydefault.DbNXlk.setEnabled(z);
    }
}
