package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C49861uwY;
import o.C55688xof;
import o.InterfaceC49433uoU;
import o.InterfaceC49496upe;
import o.InterfaceC8104awT;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.weS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnClickListenerC53063weS extends ConstraintLayout implements View.OnClickListener, InterfaceC49433uoU {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.util.ArrayList<java.lang.Object> AEQbTJ;
    public final AbstractC50927vdQ AYXKKw;
    public C55887xsS AhwBna;
    public TradeCloseAvailable AkhnZx;
    public final Observer<PositionLiveDataResp> AuCTel;
    public boolean DbNXlk;
    public C53539wnR EZpvd;
    public MaxAvailableResp KWHzl;
    public xDM copydefault;
    public C53539wnR djBIcL;
    public Function1<? super java.lang.Boolean, Unit> ejfBZ;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public Function0<? extends AbstractC49896uxG> isConnected;
    public InterfaceC49943uyA valueOf;
    public final java.util.ArrayList<InterfaceC49433uoU.Activity> values;

    /* JADX INFO: renamed from: o.weS$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL_CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53063weS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53063weS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<InterfaceC49433uoU.Activity> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        if (this.DbNXlk) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55887xsS OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.String, Unit> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C53539wnR c53539wnR, @NotNull C53539wnR c53539wnR2) {
        Intrinsics.checkNotNullParameter(c53539wnR, "");
        Intrinsics.checkNotNullParameter(c53539wnR2, "");
        this.EZpvd = c53539wnR;
        this.djBIcL = c53539wnR2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputPanelView(InterfaceC49943uyA interfaceC49943uyA) {
        this.valueOf = interfaceC49943uyA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstManager(C55887xsS c55887xsS) {
        this.AhwBna = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginModelViewModel(Function0<? extends AbstractC49896uxG> function0) {
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaceOrderClickCallback(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.fetchVPNInfo = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefreshCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.ejfBZ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:86) call: o.weS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ ViewOnClickListenerC53063weS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC53063weS(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.sVaiLC, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50927vdQ abstractC50927vdQ = (AbstractC50927vdQ) viewDataBindingInflate;
        this.AYXKKw = abstractC50927vdQ;
        this.values = new java.util.ArrayList<>();
        this.AEQbTJ = new java.util.ArrayList<>();
        this.AuCTel = new Observer() { // from class: o.wfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ViewOnClickListenerC53063weS.copydefault(this.copydefault, (PositionLiveDataResp) obj);
            }
        };
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.weQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC53063weS.EZpvd(context);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        marginLayoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        setLayoutParams(marginLayoutParams);
        abstractC50927vdQ.AYXKKw.setOnClickListener(this);
        abstractC50927vdQ.djBIcL.setOnClickListener(this);
        abstractC50927vdQ.OLrzqt.setOnClickListener(this);
        C52794wYp c52794wYp = abstractC50927vdQ.copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = abstractC50927vdQ.DbNXlk;
        c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
    }

    public static final void copydefault(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, PositionLiveDataResp positionLiveDataResp) {
        BizInstrument bizInstrumentAhwBna;
        java.lang.String strAYXKKw;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        TradeCloseAvailable tradeCloseAvailable;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(positionLiveDataResp, "");
        TradeCloseAvailable tradeCloseAvailable2 = tradeCloseAvailable;
        TradeCloseAvailable tradeCloseAvailable3 = new TradeCloseAvailable(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        C55887xsS c55887xsS = viewOnClickListenerC53063weS.AhwBna;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null);
        java.util.List<TradePositionManager.PositionItem> positions = positionLiveDataResp.getPositions();
        if (positions != null) {
            for (TradePositionManager.PositionItem positionItem : positions) {
                if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "long") && Intrinsics.EZpvd((java.lang.Object) positionItem.getMarginModel(), (java.lang.Object) currentMarginMode$default)) {
                    tradeCloseAvailable = tradeCloseAvailable2;
                    tradeCloseAvailable.setLongLast(positionItem.getLast());
                    tradeCloseAvailable.setPosLong(C33129mqd.addS$default(tradeCloseAvailable.getPosLong(), positionItem.getPos(), null, null, null, 14, null));
                } else {
                    tradeCloseAvailable = tradeCloseAvailable2;
                }
                if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "short") && Intrinsics.EZpvd((java.lang.Object) positionItem.getMarginModel(), (java.lang.Object) currentMarginMode$default)) {
                    tradeCloseAvailable.setShortLast(positionItem.getLast());
                    tradeCloseAvailable.setPosShort(C33129mqd.addS$default(tradeCloseAvailable.getPosShort(), positionItem.getPos(), null, null, null, 14, null));
                }
                tradeCloseAvailable2 = tradeCloseAvailable;
            }
        }
        TradeCloseAvailable tradeCloseAvailable4 = tradeCloseAvailable2;
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(new C55887xsS(bizInstrumentAhwBna.getInstType(), bizInstrumentAhwBna.getInstId()), strAYXKKw, false, 2, null);
        C53539wnR c53539wnR = viewOnClickListenerC53063weS.AYXKKw.gEmmrt;
        if (c54571xNhCreateAmtConvert$default == null || (strGEmmrt = c54571xNhCreateAmtConvert$default.gEmmrt(tradeCloseAvailable4.getPosLong())) == null) {
            strGEmmrt = "";
        }
        c53539wnR.setFooterAvaValue(strGEmmrt);
        C53539wnR c53539wnR2 = viewOnClickListenerC53063weS.AYXKKw.fetchVPNInfo;
        if (c54571xNhCreateAmtConvert$default != null && (strGEmmrt2 = c54571xNhCreateAmtConvert$default.gEmmrt(tradeCloseAvailable4.getPosShort())) != null) {
            str = strGEmmrt2;
        }
        c53539wnR2.setFooterAvaValue(str);
        viewOnClickListenerC53063weS.AkhnZx = tradeCloseAvailable4;
    }

    private final androidx.fragment.app.FragmentManager AuCTel() {
        return (androidx.fragment.app.FragmentManager) this.gEmmrt.getValue();
    }

    public static final androidx.fragment.app.FragmentManager EZpvd(android.content.Context context) {
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            return appCompatActivityCopydefault.getSupportFragmentManager();
        }
        return null;
    }

    public final void KWHzl() {
        C54794xVo c54794xVo = C54794xVo.copydefault;
        C55887xsS c55887xsS = this.AhwBna;
        if (c54794xVo.valueOf(c55887xsS != null ? c55887xsS.AhwBna() : null)) {
            this.AYXKKw.copydefault.setEnabled(false);
            this.AYXKKw.DbNXlk.setEnabled(false);
        } else {
            this.AYXKKw.copydefault.setEnabled(true);
            this.AYXKKw.DbNXlk.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: o.weS$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ViewOnClickListenerC53063weS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = viewOnClickListenerC53063weS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.copydefault("clickBuy");
                Function2<java.lang.String, java.lang.String, Unit> function2Copydefault = this.OLrzqt.copydefault();
                if (function2Copydefault != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    C55887xsS c55887xsSOLrzqt = this.OLrzqt.OLrzqt();
                    java.lang.String str = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsSOLrzqt != null ? c55887xsSOLrzqt.djBIcL() : null) && C56059xvf.EZpvd.DbNXlk()) {
                        TradeType tradeType = C49861uwY.Companion.copydefault().get();
                        int i = tradeType == null ? -1 : Activity.AEQbTJ[tradeType.ordinal()];
                        if (i == 1) {
                            str = "long";
                        } else if (i == 2) {
                            str = "short";
                        }
                    }
                    function2Copydefault.invoke("clickBuy", str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.weS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC53063weS OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = viewOnClickListenerC53063weS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault("clickSell");
                Function2<java.lang.String, java.lang.String, Unit> function2Copydefault = this.OLrzqt.copydefault();
                if (function2Copydefault != null) {
                    java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                    C55887xsS c55887xsSOLrzqt = this.OLrzqt.OLrzqt();
                    java.lang.String str = null;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsSOLrzqt != null ? c55887xsSOLrzqt.djBIcL() : null) && C56059xvf.EZpvd.DbNXlk()) {
                        TradeType tradeType = C49861uwY.Companion.copydefault().get();
                        int i = tradeType == null ? -1 : Activity.AEQbTJ[tradeType.ordinal()];
                        if (i == 1) {
                            str = "short";
                        } else if (i == 2) {
                            str = "long";
                        }
                    }
                    function2Copydefault.invoke("clickSell", str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.weS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.weS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0564  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fIwbmz() {
        int i;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        java.lang.String strGEmmrt;
        Function0<? extends AbstractC49896uxG> function0;
        AbstractC49896uxG abstractC49896uxGInvoke;
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        xOW newProxyInstance2;
        xOV xovEZpvd;
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC49943uyA interfaceC49943uyA = this.valueOf;
        if (interfaceC49943uyA != null) {
            interfaceC49943uyA.KWHzl();
        }
        this.AYXKKw.AEQbTJ.setVisibility(8);
        this.AYXKKw.EZpvd.setVisibility(8);
        if (!C55697xoo.OLrzqt.isConnected()) {
            this.AYXKKw.AYXKKw.setVisibility(0);
            this.AYXKKw.djBIcL.setVisibility(8);
            setAvaView$default(this, 8, null, null, 6, null);
            setMaxSizeView$default(this, 8, null, null, 6, null);
            this.AYXKKw.copydefault.setVisibility(8);
            this.AYXKKw.valueOf.setVisibility(8);
            this.AYXKKw.gEmmrt.setVisibility(8);
            this.AYXKKw.DbNXlk.setVisibility(8);
            this.AYXKKw.AhwBna.setVisibility(8);
            this.AYXKKw.fetchVPNInfo.setVisibility(8);
            this.AYXKKw.OLrzqt.setVisibility(8);
            this.DbNXlk = false;
            return;
        }
        this.AYXKKw.AYXKKw.setVisibility(8);
        setAvaView$default(this, 0, "", null, 4, null);
        C55887xsS c55887xsS = this.AhwBna;
        java.lang.String strDjBIcL = c55887xsS != null ? c55887xsS.djBIcL() : null;
        if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "SPOT")) {
            setMaxSizeView$default(this, 0, "", null, 4, null);
            C55887xsS c55887xsS2 = this.AhwBna;
            BizInstrument bizInstrumentAhwBna = c55887xsS2 != null ? c55887xsS2.AhwBna() : null;
            boolean z = (bizInstrumentAhwBna == null || ((bizInstrumentAhwBna instanceof SpotInstrument) && ((SpotInstrument) bizInstrumentAhwBna).getLevel().length() == 0)) ? false : true;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && (xovEZpvd = newProxyInstance2.EZpvd()) != null && xovEZpvd.OLrzqt()) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt3 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt3.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)), (java.lang.Object) "isolated") && z) {
                    this.DbNXlk = true;
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "MARGIN")) {
            setMaxSizeView$default(this, 0, "", null, 4, null);
            this.DbNXlk = true;
        } else {
            setMaxSizeView$default(this, 8, null, null, 6, null);
            this.DbNXlk = false;
        }
        C55887xsS c55887xsS3 = this.AhwBna;
        if (c55887xsS3 != null && (abstractC54531xLwAEQbTJ = c55887xsS3.AEQbTJ()) != null && !abstractC54531xLwAEQbTJ.getFieldNames()) {
            this.AYXKKw.djBIcL.setVisibility(0);
            this.AYXKKw.copydefault.setVisibility(8);
            this.AYXKKw.valueOf.setVisibility(8);
            this.AYXKKw.gEmmrt.setVisibility(8);
            this.AYXKKw.DbNXlk.setVisibility(8);
            this.AYXKKw.AhwBna.setVisibility(8);
            this.AYXKKw.fetchVPNInfo.setVisibility(8);
            this.AYXKKw.OLrzqt.setVisibility(8);
            return;
        }
        C55887xsS c55887xsS4 = this.AhwBna;
        BizInstrument bizInstrumentAhwBna2 = c55887xsS4 != null ? c55887xsS4.AhwBna() : null;
        java.lang.String strCopydefault = (!Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAhwBna2 != null ? bizInstrumentAhwBna2.getInstType() : null), (java.lang.Object) "MARGIN") || (function0 = this.isConnected) == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
        C49861uwY.ActionBar actionBar = C49861uwY.Companion;
        TradeType tradeType = actionBar.copydefault().get();
        C53466wly c53466wly = C53466wly.AEQbTJ;
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = c53466wly.AEQbTJ(bizInstrumentAhwBna2, strCopydefault, tradeType);
        C55887xsS c55887xsS5 = this.AhwBna;
        java.lang.String str = "";
        if (c53466wly.KWHzl(c55887xsS5 != null ? c55887xsS5.AhwBna() : null, arrayListAEQbTJ, tradeType)) {
            this.AYXKKw.OLrzqt.setVisibility(0);
            C52794wYp c52794wYp = this.AYXKKw.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c53466wly.KWHzl(c52794wYp, arrayListAEQbTJ);
            this.AYXKKw.copydefault.setVisibility(8);
            this.AYXKKw.valueOf.setVisibility(8);
            this.AYXKKw.gEmmrt.setVisibility(8);
            this.AYXKKw.DbNXlk.setVisibility(8);
            this.AYXKKw.AhwBna.setVisibility(8);
            this.AYXKKw.fetchVPNInfo.setVisibility(8);
            C55887xsS c55887xsS6 = this.AhwBna;
            strAuCTelauCTel = c55887xsS6 != null ? c55887xsS6.djBIcL() : null;
            if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "MARGIN")) {
                TradeType tradeType2 = actionBar.copydefault().get();
                i = tradeType2 != null ? Activity.AEQbTJ[tradeType2.ordinal()] : -1;
                if (i == 1) {
                    setMaxSizeView$default(this, null, getContext().getString(C55688xof.Application.dispatchResult), null, 5, null);
                } else if (i == 2) {
                    setMaxSizeView$default(this, null, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), null, 5, null);
                }
            }
            if (arrayListAEQbTJ != null && (strGEmmrt = C33129mqd.gEmmrt(arrayListAEQbTJ)) != null) {
                str = strGEmmrt;
            }
            pUU.KWHzl("SmartIcebergTradeFooterView", "collateralList=" + str);
            return;
        }
        this.AYXKKw.OLrzqt.setVisibility(8);
        C55887xsS c55887xsS7 = this.AhwBna;
        java.lang.String strDjBIcL2 = c55887xsS7 != null ? c55887xsS7.djBIcL() : null;
        if (strDjBIcL2 != null) {
            switch (strDjBIcL2.hashCode()) {
                case -2027980370:
                    if (!strDjBIcL2.equals("MARGIN")) {
                    }
                    TradeType tradeType3 = actionBar.copydefault().get();
                    i = tradeType3 != null ? Activity.AEQbTJ[tradeType3.ordinal()] : -1;
                    if (i != 1) {
                        setMaxSizeView$default(this, null, getContext().getString(C55688xof.Application.dispatchResult), null, 5, null);
                        this.AYXKKw.copydefault.setVisibility(0);
                        this.AYXKKw.DbNXlk.setVisibility(8);
                        C52794wYp c52794wYp2 = this.AYXKKw.copydefault;
                        java.lang.String string = getContext().getString(C55688xof.Application.setPipParamsSourceRectHint);
                        C55887xsS c55887xsS8 = this.AhwBna;
                        if (c55887xsS8 != null && (strOLrzqt = c55887xsS8.OLrzqt()) != null) {
                            str = strOLrzqt;
                        }
                        c52794wYp2.setText(string + " " + str);
                        this.AYXKKw.djBIcL.setVisibility(8);
                    } else if (i == 2) {
                        setMaxSizeView$default(this, null, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), null, 5, null);
                        this.AYXKKw.copydefault.setVisibility(8);
                        C52794wYp c52794wYp3 = this.AYXKKw.DbNXlk;
                        c52794wYp3.setVisibility(0);
                        java.lang.String string2 = c52794wYp3.getContext().getString(C55688xof.Application.addMenuProvider);
                        C55887xsS c55887xsS9 = this.AhwBna;
                        if (c55887xsS9 == null || (strOLrzqt2 = c55887xsS9.OLrzqt()) == null) {
                            strOLrzqt2 = "";
                        }
                        c52794wYp3.setText(string2 + " " + strOLrzqt2);
                        ViewGroup.LayoutParams layoutParams = c52794wYp3.getLayoutParams();
                        Intrinsics.copydefault(layoutParams, "");
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                        c52794wYp3.setLayoutParams(layoutParams2);
                        this.AYXKKw.djBIcL.setVisibility(8);
                    }
                    this.AYXKKw.valueOf.setVisibility(8);
                    this.AYXKKw.gEmmrt.setVisibility(8);
                    this.AYXKKw.AhwBna.setVisibility(8);
                    this.AYXKKw.fetchVPNInfo.setVisibility(8);
                    break;
                case -1956807563:
                    strDjBIcL2.equals("OPTION");
                    break;
                case 2552066:
                    if (!strDjBIcL2.equals("SPOT")) {
                    }
                    TradeType tradeType32 = actionBar.copydefault().get();
                    if (tradeType32 != null) {
                    }
                    if (i != 1) {
                    }
                    this.AYXKKw.valueOf.setVisibility(8);
                    this.AYXKKw.gEmmrt.setVisibility(8);
                    this.AYXKKw.AhwBna.setVisibility(8);
                    this.AYXKKw.fetchVPNInfo.setVisibility(8);
                    break;
                case 2558355:
                    if (!strDjBIcL2.equals("SWAP")) {
                    }
                    interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                        strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                        this.AYXKKw.copydefault.setVisibility(0);
                        this.AYXKKw.copydefault.setText(getContext().getString(C55688xof.Application.setPipParamsSourceRectHint));
                        this.AYXKKw.valueOf.setVisibility(0);
                        C53539wnR.setFooterAvaTitle$default(this.AYXKKw.valueOf, getContext().getString(C55688xof.Application.dispatchResult), false, null, 6, null);
                        this.AYXKKw.valueOf.setFooterAvaValue("");
                        this.AYXKKw.gEmmrt.setVisibility(8);
                        C52794wYp c52794wYp4 = this.AYXKKw.DbNXlk;
                        c52794wYp4.setVisibility(0);
                        c52794wYp4.setText(c52794wYp4.getContext().getString(C55688xof.Application.addMenuProvider));
                        this.AYXKKw.AhwBna.setVisibility(0);
                        C53539wnR.setFooterAvaTitle$default(this.AYXKKw.AhwBna, getContext().getString(C55688xof.Application.ActivityResultRegistryCallbackAndContract), false, null, 6, null);
                        this.AYXKKw.AhwBna.setFooterAvaValue("");
                        this.AYXKKw.fetchVPNInfo.setVisibility(8);
                        this.AYXKKw.djBIcL.setVisibility(8);
                        break;
                    } else if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                        TradeType tradeType4 = actionBar.copydefault().get();
                        i = tradeType4 != null ? Activity.AEQbTJ[tradeType4.ordinal()] : -1;
                        if (i == 1) {
                            this.AYXKKw.copydefault.setVisibility(0);
                            this.AYXKKw.copydefault.setText(getContext().getString(C55688xof.Application.lambdanew0));
                            this.AYXKKw.valueOf.setVisibility(0);
                            C53539wnR.setFooterAvaTitle$default(this.AYXKKw.valueOf, getContext().getString(C55688xof.Application.setPosition), false, null, 6, null);
                            this.AYXKKw.valueOf.setFooterAvaValue("");
                            this.AYXKKw.gEmmrt.setVisibility(8);
                            C52794wYp c52794wYp5 = this.AYXKKw.DbNXlk;
                            c52794wYp5.setVisibility(0);
                            c52794wYp5.setText(c52794wYp5.getContext().getString(C55688xof.Application.addOnMultiWindowModeChangedListener));
                            this.AYXKKw.AhwBna.setVisibility(0);
                            C53539wnR.setFooterAvaTitle$default(this.AYXKKw.AhwBna, getContext().getString(C55688xof.Application.isDrawerIndicatorEnabled), false, null, 6, null);
                            this.AYXKKw.AhwBna.setFooterAvaValue("");
                            this.AYXKKw.fetchVPNInfo.setVisibility(8);
                            this.AYXKKw.djBIcL.setVisibility(8);
                            break;
                        } else if (i == 2) {
                            setAvaView$default(this, 8, null, null, 6, null);
                            this.AYXKKw.copydefault.setVisibility(0);
                            this.AYXKKw.copydefault.setText(getContext().getString(C55688xof.Application.getCREATORannotations));
                            this.AYXKKw.valueOf.setVisibility(8);
                            this.AYXKKw.gEmmrt.setVisibility(0);
                            this.AYXKKw.gEmmrt.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractsCaptureVideo), true, new Function0() { // from class: o.weY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53063weS.valueOf(this.KWHzl);
                                }
                            });
                            this.AYXKKw.gEmmrt.setFooterAvaValue("");
                            C52794wYp c52794wYp6 = this.AYXKKw.DbNXlk;
                            c52794wYp6.setVisibility(0);
                            c52794wYp6.setText(c52794wYp6.getContext().getString(C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1));
                            this.AYXKKw.AhwBna.setVisibility(8);
                            this.AYXKKw.fetchVPNInfo.setVisibility(0);
                            this.AYXKKw.fetchVPNInfo.setFooterAvaTitle(getContext().getString(C55688xof.Application.ActivityResultContractSynchronousResult), true, new Function0() { // from class: o.weW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53063weS.gEmmrt(this.OLrzqt);
                                }
                            });
                            this.AYXKKw.fetchVPNInfo.setFooterAvaValue("");
                            this.AYXKKw.djBIcL.setVisibility(8);
                            this.AYXKKw.EZpvd.setVisibility(0);
                            this.AYXKKw.AEQbTJ.setVisibility(0);
                            this.AYXKKw.EZpvd.setFooterAvaTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry3), true, new Function0() { // from class: o.weV
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53063weS.AhwBna(this.EZpvd);
                                }
                            });
                            this.AYXKKw.AEQbTJ.setFooterAvaTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistry3), true, new Function0() { // from class: o.weX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return ViewOnClickListenerC53063weS.AYXKKw(this.EZpvd);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case 214415088:
                    if (!strDjBIcL2.equals("FUTURES")) {
                    }
                    interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null) {
                        strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                    }
                    break;
            }
        }
    }

    public static final Unit valueOf(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
        viewOnClickListenerC53063weS.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
        viewOnClickListenerC53063weS.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
        viewOnClickListenerC53063weS.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS) {
        viewOnClickListenerC53063weS.AhwBna();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticLambda1));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanion), new View.OnClickListener() { // from class: o.wfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewOnClickListenerC53063weS.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AhwBna() {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporter));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.weR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC53063weS.EZpvd(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY), new View.OnClickListener() { // from class: o.weT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewOnClickListenerC53063weS.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, android.view.View view) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(viewOnClickListenerC53063weS), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticApiModelOutline0))), null, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void setAvaView$default(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, java.lang.Integer num, java.lang.String str, MaxAvailableResp maxAvailableResp, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            maxAvailableResp = null;
        }
        viewOnClickListenerC53063weS.setAvaView(num, str, maxAvailableResp);
    }

    public final void setAvaView(java.lang.Integer num, java.lang.String str, MaxAvailableResp maxAvailableResp) {
        C53539wnR c53539wnR;
        if (this.EZpvd != null) {
            if (num != null) {
                int iIntValue = num.intValue();
                C53539wnR c53539wnR2 = this.EZpvd;
                if (c53539wnR2 != null) {
                    c53539wnR2.setVisibility(iIntValue);
                }
            }
            if (str != null && (c53539wnR = this.EZpvd) != null) {
                c53539wnR.setFooterAvaValue(str);
            }
            wPL wpl = wPL.KWHzl;
            C53539wnR c53539wnR3 = this.EZpvd;
            C55887xsS c55887xsS = this.AhwBna;
            wPL.avaViewAdapterBorrow$default(wpl, c53539wnR3, c55887xsS != null ? c55887xsS.AhwBna() : null, maxAvailableResp, AuCTel(), null, 16, null);
        }
    }

    public static /* synthetic */ void setMaxSizeView$default(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, java.lang.Integer num, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        viewOnClickListenerC53063weS.setMaxSizeView(num, str, str2);
    }

    public final void setMaxSizeView(java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        C53539wnR c53539wnR;
        C53539wnR c53539wnR2;
        if (this.djBIcL != null) {
            if (num != null) {
                int iIntValue = num.intValue();
                C53539wnR c53539wnR3 = this.djBIcL;
                if (c53539wnR3 != null) {
                    c53539wnR3.setVisibility(iIntValue);
                }
            }
            if (str != null && (c53539wnR2 = this.djBIcL) != null) {
                C53539wnR.setFooterAvaTitle$default(c53539wnR2, str, false, null, 6, null);
            }
            if (str2 == null || (c53539wnR = this.djBIcL) == null) {
                return;
            }
            c53539wnR.setFooterAvaValue(str2);
        }
    }

    public final void gEmmrt() {
        isConnected();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        Function0<? extends AbstractC49896uxG> function0;
        AbstractC49896uxG abstractC49896uxGInvoke;
        InterfaceC8104awT interfaceC8104awT;
        if (Intrinsics.EZpvd(view, this.AYXKKw.AYXKKw)) {
            android.content.Context context = getContext();
            if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                return;
            }
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            return;
        }
        if (Intrinsics.EZpvd(view, this.AYXKKw.djBIcL)) {
            InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context2, "2", null, 4, null);
            return;
        }
        if (Intrinsics.EZpvd(view, this.AYXKKw.OLrzqt)) {
            C55887xsS c55887xsS = this.AhwBna;
            BizInstrument bizInstrumentAhwBna = c55887xsS != null ? c55887xsS.AhwBna() : null;
            java.lang.String strCopydefault = (!Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstType() : null), (java.lang.Object) "MARGIN") || (function0 = this.isConnected) == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
            final TradeType tradeType = C49861uwY.Companion.copydefault().get();
            C53466wly c53466wly = C53466wly.AEQbTJ;
            final java.util.ArrayList<java.lang.String> arrayListAEQbTJ = c53466wly.AEQbTJ(bizInstrumentAhwBna, strCopydefault, tradeType);
            android.content.Context context3 = getContext();
            FragmentActivity fragmentActivity = context3 instanceof FragmentActivity ? (FragmentActivity) context3 : null;
            if (fragmentActivity != null) {
                final BizInstrument bizInstrument = bizInstrumentAhwBna;
                final java.lang.String str = strCopydefault;
                c53466wly.EZpvd(fragmentActivity, bizInstrument, str, tradeType, new Function1() { // from class: o.weZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53063weS.copydefault(this.EZpvd, bizInstrument, str, tradeType, arrayListAEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
            c53466wly.OLrzqt(bizInstrumentAhwBna, "SMART_ICEBERG");
        }
    }

    public static final Unit copydefault(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, BizInstrument bizInstrument, java.lang.String str, TradeType tradeType, java.util.ArrayList arrayList, boolean z) {
        if (z) {
            Function1<? super java.lang.Boolean, Unit> function1 = viewOnClickListenerC53063weS.ejfBZ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.FALSE);
            }
            pUU.KWHzl("SmartIcebergTradeFooterView", "updateUi");
        }
        pUU.KWHzl("SmartIcebergTradeFooterView", "openResultCallback-->" + z + " instType:" + (bizInstrument != null ? bizInstrument.getInstType() : null) + " instId:" + (bizInstrument != null ? bizInstrument.getInstId() : null) + " marginSymbol:" + str + " tradType:" + (tradeType != null ? tradeType.name() : null));
        C53466wly.AEQbTJ.KWHzl(bizInstrument, (java.util.ArrayList<java.lang.String>) arrayList, "SMART_ICEBERG");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r0.equals("SPOT") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r0.equals("MARGIN") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r6, (java.lang.Object) "clickBuy") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str) {
        final java.lang.String strDjBIcL;
        final java.lang.String str2;
        xOW newProxyInstance;
        java.lang.String strAuCTelauCTel;
        C55887xsS c55887xsS = this.AhwBna;
        if (c55887xsS == null || (strDjBIcL = c55887xsS.djBIcL()) == null) {
            return;
        }
        TradeType tradeType = C49861uwY.Companion.copydefault().get();
        switch (strDjBIcL.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                strDjBIcL.equals("OPTION");
                str2 = "";
                C32866mlf.onEvent$default("trade_strategy_make_order", (TrackChannel[]) null, new Function1() { // from class: o.wfd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53063weS.EZpvd(str2, strDjBIcL, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                break;
            case 2552066:
                break;
            case 2558355:
                if (strDjBIcL.equals("SWAP")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && (strAuCTelauCTel = newProxyInstance.AuCTelauCTel()) != null) {
                        if (Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode")) {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy" : "sell";
                        } else if (tradeType == TradeType.BUY_OPEN) {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy_long" : "sell_short";
                        } else {
                            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy_short" : "sell_long";
                        }
                    }
                } else {
                    str2 = "";
                }
                C32866mlf.onEvent$default("trade_strategy_make_order", (TrackChannel[]) null, new Function1() { // from class: o.wfd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53063weS.EZpvd(str2, strDjBIcL, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                break;
            case 214415088:
                if (!strDjBIcL.equals("FUTURES")) {
                }
                C32866mlf.onEvent$default("trade_strategy_make_order", (TrackChannel[]) null, new Function1() { // from class: o.wfd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC53063weS.EZpvd(str2, strDjBIcL, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                break;
        }
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("inst_type", str2, true);
        return Unit.INSTANCE;
    }

    public final boolean AYXKKw() {
        java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
        C55887xsS c55887xsS = this.AhwBna;
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsS != null ? c55887xsS.djBIcL() : null) && C56059xvf.EZpvd.DbNXlk() && C49861uwY.Companion.copydefault().get() == TradeType.SELL_CLOSE;
    }

    public final void AkhnZx() {
        if (AYXKKw()) {
            fetchVPNInfo();
            values();
        } else {
            values();
        }
    }

    public final void isConnected() {
        DbNXlk();
        fJNWhG();
    }

    public final void fetchVPNInfo() {
        C54782xVc.AEQbTJ.djBIcL().observeForever(this.AuCTel);
    }

    public final void fJNWhG() {
        C54782xVc.AEQbTJ.djBIcL().removeObserver(this.AuCTel);
    }

    public final void DbNXlk() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.AEQbTJ);
        }
        this.AEQbTJ.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values() {
        BizInstrument bizInstrumentAhwBna;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        java.lang.Boolean boolValueOf;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C56084xwD fieldNames;
        Function0<? extends AbstractC49896uxG> function0;
        AbstractC49896uxG abstractC49896uxGInvoke;
        xOW newProxyInstance;
        xOV xovEZpvd;
        MarginModeManager marginModeManagerIsConnected2;
        C55887xsS c55887xsS = this.AhwBna;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        C55887xsS c55887xsS2 = this.AhwBna;
        java.lang.String strAEQbTJ = c55887xsS2 != null ? c55887xsS2.AEQbTJ("smart_iceberg") : null;
        pUU.EZpvd("USDRename", "sub Available balance smart iceberg, " + bizInstrumentAhwBna.joinCcyRelevantToString() + ", tradeQuoteCcy:" + strAEQbTJ);
        java.lang.String instId = bizInstrumentAhwBna.getInstId();
        java.lang.String instType = bizInstrumentAhwBna.getInstType();
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "SPOT")) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) {
                currentMarginMode$default = "cash";
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt3 == null || (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt3.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected2, false, null, 3, null)) == null) {
                    currentMarginMode$default = "";
                }
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt4 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt4.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) {
            }
        }
        java.lang.String str = currentMarginMode$default;
        if (yDY.gEmmrt("SPOT", "MARGIN").contains(bizInstrumentAhwBna.getInstType())) {
            boolValueOf = java.lang.Boolean.valueOf(C49861uwY.Companion.copydefault().get() == TradeType.BUY_OPEN);
        } else {
            boolValueOf = null;
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        StateListAnimator stateListAnimator = new StateListAnimator(strAEQbTJ, this, bizInstrumentAhwBna, instId, instType, str, boolValueOf, value != null ? value.AYXKKw() : null, yDY.gEmmrt("SPOT", "MARGIN").contains(bizInstrumentAhwBna.getInstType()) ? EZpvd() : null, (!Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "MARGIN") || (function0 = this.isConnected) == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault(), (!yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentAhwBna.getInstType()) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw());
        this.AEQbTJ.clear();
        this.AEQbTJ.add(stateListAnimator);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt5 != null) {
            interfaceC54581xNrOLrzqt5.copydefault(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.weS$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55740xpe {
        public final /* synthetic */ ViewOnClickListenerC53063weS EZpvd;
        public final /* synthetic */ BizInstrument copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(java.lang.String str, ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.String str5, java.lang.Boolean bool2, java.lang.String str6, java.lang.String str7) {
            super(null, null, str3, str2, str6, str5, str4, bool2, bool, str7, null, null, null, null, null, null, null, null, null, str, 523267, null);
            this.EZpvd = viewOnClickListenerC53063weS;
            this.copydefault = bizInstrument;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        @Override // o.AbstractC55740xpe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            this.EZpvd.KWHzl = maxAvailableResp;
            this.EZpvd.copydefault = xdm;
            java.lang.String instType = this.copydefault.getInstType();
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        this.EZpvd.KWHzl(maxAvailableResp);
                    }
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        this.EZpvd.AEQbTJ(maxAvailableResp);
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        this.EZpvd.copydefault(maxAvailableResp);
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                    }
                    break;
            }
            java.util.ArrayList<InterfaceC49433uoU.Activity> arrayListAEQbTJ = this.EZpvd.AEQbTJ();
            ViewOnClickListenerC53063weS viewOnClickListenerC53063weS = this.EZpvd;
            java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
            while (it.hasNext()) {
                ((InterfaceC49433uoU.Activity) it.next()).AEQbTJ(viewOnClickListenerC53063weS.KWHzl == null, maxAvailableResp);
            }
        }
    }

    private final java.lang.String fARcdN() {
        C55887xsS c55887xsS;
        AbstractC49896uxG abstractC49896uxGInvoke;
        Function0<? extends AbstractC49896uxG> function0 = this.isConnected;
        java.lang.String strOLrzqt = (function0 == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "margin_base")) {
            C55887xsS c55887xsS2 = this.AhwBna;
            if (c55887xsS2 != null) {
                return c55887xsS2.OLrzqt();
            }
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "margin_quote") || (c55887xsS = this.AhwBna) == null) {
            return null;
        }
        return c55887xsS.copydefault("smart_iceberg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(MaxAvailableResp maxAvailableResp) {
        BizInstrument bizInstrumentAhwBna;
        TradeType tradeType;
        java.lang.String first;
        java.lang.String str;
        java.lang.String first2;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        boolean z;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String tradeSymbol;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2;
        boolean z2;
        MarginModeManager marginModeManagerIsConnected2;
        C55887xsS c55887xsS = this.AhwBna;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null || (tradeType = C49861uwY.Companion.copydefault().get()) == null) {
            return;
        }
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            first = "--";
        } else {
            java.lang.String available = maxAvailableResp.getAvailable();
            if (!wPL.KWHzl.copydefault(bizInstrumentAhwBna.getInstType())) {
                available = C33129mqd.subS$default(available, maxAvailableResp.getLoanAvailable(), null, null, null, 14, null);
            }
            C55887xsS c55887xsS2 = this.AhwBna;
            if (c55887xsS2 != null) {
                java.lang.Boolean boolEZpvd = EZpvd();
                boolean zBooleanValue = boolEZpvd != null ? boolEZpvd.booleanValue() : false;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                java.lang.String currentMarginMode$default = (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected2, false, null, 3, null);
                java.lang.String str2 = currentMarginMode$default == null ? "" : currentMarginMode$default;
                java.lang.String strFARcdN = fARcdN();
                java.lang.String tradeQuoteCcy = maxAvailableResp.getTradeQuoteCcy();
                int i = Activity.AEQbTJ[tradeType.ordinal()];
                if (i == 1) {
                    z2 = true;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z2 = false;
                }
                pairOLrzqt2 = c55887xsS2.OLrzqt(available, tradeType, zBooleanValue, str2, strFARcdN, "smart_iceberg", tradeQuoteCcy, z2);
            } else {
                pairOLrzqt2 = null;
            }
            first = pairOLrzqt2 != null ? pairOLrzqt2.getFirst() : null;
        }
        C53539wnR c53539wnR = this.EZpvd;
        if (c53539wnR != null) {
            if (tradeType == TradeType.BUY_OPEN) {
                C55887xsS c55887xsS3 = this.AhwBna;
                if (c55887xsS3 == null || (tradeSymbol = c55887xsS3.copydefault("smart_iceberg")) == null) {
                    tradeSymbol = "";
                }
            } else {
                tradeSymbol = bizInstrumentAhwBna.getTradeSymbol();
            }
            c53539wnR.setTransferCoin(tradeSymbol);
        }
        setAvaView$default(this, null, first, maxAvailableResp, 1, null);
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
            str = "--";
        } else {
            java.lang.String maxSize = maxAvailableResp.getMaxSize();
            java.lang.String strSubS$default = !wPL.KWHzl.copydefault(bizInstrumentAhwBna.getInstType()) ? C33129mqd.subS$default(maxSize, maxAvailableResp.getLoanMaxSize(), null, null, null, 14, null) : maxSize;
            C55887xsS c55887xsS4 = this.AhwBna;
            if (c55887xsS4 != null) {
                java.lang.Boolean boolEZpvd2 = EZpvd();
                boolean zBooleanValue2 = boolEZpvd2 != null ? boolEZpvd2.booleanValue() : false;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                java.lang.String currentMarginMode$default2 = (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null);
                if (currentMarginMode$default2 == null) {
                    currentMarginMode$default2 = "";
                }
                java.lang.String strFARcdN2 = fARcdN();
                java.lang.String tradeQuoteCcy2 = maxAvailableResp.getTradeQuoteCcy();
                int i2 = Activity.AEQbTJ[tradeType.ordinal()];
                if (i2 == 1) {
                    z = false;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                first2 = null;
                pairOLrzqt = c55887xsS4.OLrzqt(strSubS$default, tradeType, zBooleanValue2, currentMarginMode$default2, strFARcdN2, "smart_iceberg", tradeQuoteCcy2, z);
            } else {
                first2 = null;
                pairOLrzqt = null;
            }
            if (pairOLrzqt != null) {
                first2 = pairOLrzqt.getFirst();
            }
            str = first2;
        }
        setMaxSizeView$default(this, null, null, str, 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVq.convertSpotAvaTrade$default(o.xVq, com.okinc.biz.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean, int, java.lang.Object):kotlin.Pair */
    public final void KWHzl(MaxAvailableResp maxAvailableResp) {
        java.lang.String first;
        java.lang.String str;
        BizInstrument bizInstrumentAhwBna;
        C53539wnR c53539wnR;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        boolean z;
        MarginModeManager marginModeManagerIsConnected2;
        java.lang.String currentMarginMode$default2;
        C49861uwY.ActionBar actionBar = C49861uwY.Companion;
        TradeType tradeType = actionBar.copydefault().get();
        if (tradeType == null) {
            return;
        }
        java.lang.String str2 = "";
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            first = "--";
        } else {
            C55887xsS c55887xsS = this.AhwBna;
            if (c55887xsS != null) {
                java.lang.String available = maxAvailableResp.getAvailable();
                java.lang.Boolean boolEZpvd = EZpvd();
                boolean zBooleanValue = boolEZpvd != null ? boolEZpvd.booleanValue() : false;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                java.lang.String str3 = (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default2 = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected2, false, null, 3, null)) == null) ? "" : currentMarginMode$default2;
                java.lang.String strFARcdN = fARcdN();
                java.lang.String tradeQuoteCcy = maxAvailableResp.getTradeQuoteCcy();
                java.lang.String str4 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy) ^ true ? tradeQuoteCcy : null;
                int i = Activity.AEQbTJ[tradeType.ordinal()];
                if (i == 1) {
                    z = true;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                pairOLrzqt = c55887xsS.OLrzqt(available, tradeType, zBooleanValue, str3, strFARcdN, "smart_iceberg", str4, z);
            } else {
                pairOLrzqt = null;
            }
            first = pairOLrzqt != null ? pairOLrzqt.getFirst() : null;
        }
        C53539wnR c53539wnR2 = this.EZpvd;
        if (c53539wnR2 != null) {
            C55887xsS c55887xsS2 = this.AhwBna;
            if (c55887xsS2 != null) {
                java.lang.Boolean boolEZpvd2 = EZpvd();
                boolean zBooleanValue2 = boolEZpvd2 != null ? boolEZpvd2.booleanValue() : false;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                c53539wnR = c53539wnR2;
                java.lang.String avaCcy$default = C55887xsS.getAvaCcy$default(c55887xsS2, tradeType, zBooleanValue2, (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) ? "" : currentMarginMode$default, fARcdN(), "smart_iceberg", null, 32, null);
                if (avaCcy$default != null) {
                    str2 = avaCcy$default;
                }
            } else {
                c53539wnR = c53539wnR2;
            }
            c53539wnR.setTransferCoin(str2);
        }
        setAvaView$default(this, null, first, null, 5, null);
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
            str = "--";
        } else {
            C54796xVq c54796xVq = C54796xVq.AEQbTJ;
            TradeType tradeType2 = actionBar.copydefault().get();
            if (tradeType2 == null) {
                return;
            }
            java.lang.String maxSize = maxAvailableResp.getMaxSize();
            C55887xsS c55887xsS3 = this.AhwBna;
            java.lang.String instId = (c55887xsS3 == null || (bizInstrumentAhwBna = c55887xsS3.AhwBna()) == null) ? null : bizInstrumentAhwBna.getInstId();
            Intrinsics.copydefault((java.lang.Object) instId);
            C55887xsS c55887xsS4 = this.AhwBna;
            BizInstrument bizInstrumentAhwBna2 = c55887xsS4 != null ? c55887xsS4.AhwBna() : null;
            Intrinsics.copydefault(bizInstrumentAhwBna2);
            str = (java.lang.String) C54796xVq.convertSpotAvaTrade$default(c54796xVq, tradeType2, maxSize, instId, bizInstrumentAhwBna2.getInstType(), EZpvd(), false, 32, null).getFirst();
        }
        setMaxSizeView$default(this, null, null, str, 3, null);
    }

    public final void copydefault(MaxAvailableResp maxAvailableResp) {
        BizInstrument bizInstrumentAhwBna;
        C55887xsS c55887xsS = this.AhwBna;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        java.lang.String first = "--";
        setAvaView$default(this, null, (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) ? "--" : C54796xVq.AEQbTJ.AEQbTJ(maxAvailableResp.getAvailable(), bizInstrumentAhwBna.getInstType(), bizInstrumentAhwBna.getInstId()).getFirst(), null, 5, null);
        this.AYXKKw.valueOf.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getBuySize())) ? "--" : OLrzqt(this, maxAvailableResp.getBuySize(), null).getFirst());
        this.AYXKKw.AhwBna.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getSellSize())) ? "--" : OLrzqt(this, maxAvailableResp.getSellSize(), null).getFirst());
        this.AYXKKw.AEQbTJ.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getShortAvailablePos())) ? "--" : OLrzqt(this, maxAvailableResp.getShortAvailablePos(), null).getFirst());
        if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getLongAvailablePos())) {
            first = OLrzqt(this, maxAvailableResp.getLongAvailablePos(), null).getFirst();
        }
        this.AYXKKw.EZpvd.setFooterAvaValue(first);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(ViewOnClickListenerC53063weS viewOnClickListenerC53063weS, java.lang.String str, java.lang.String str2) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54571xNh c54571xNhCreateAmtConvert$default;
        java.lang.String str3 = "";
        if (str2 == null) {
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            str2 = value != null ? value.AYXKKw() : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        C55887xsS c55887xsS = viewOnClickListenerC53063weS.AhwBna;
        C54536xML c54536xMLDjBIcL2 = (c55887xsS == null || (c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, str2, false, 2, null)) == null) ? null : c54571xNhCreateAmtConvert$default.djBIcL(str);
        if (c54536xMLDjBIcL2 == null || (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (c54536xMLDjBIcL2 != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) != null) {
            str3 = safeString$default2;
        }
        return new kotlin.Pair<>(safeString$default, str3);
    }

    public final void valueOf() {
        fIwbmz();
        isConnected();
        AkhnZx();
    }
}
