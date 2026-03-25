package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49732uuB;
import o.C47978uAl;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC49508upq;
import o.vBA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53441wlZ extends android.widget.LinearLayout implements vBA {
    public C53441wlZ AEQbTJ;
    public InterfaceC50102vBz EZpvd;
    public androidx.fragment.app.FragmentManager KWHzl;
    public vBB OLrzqt;
    public final AbstractC50907vcx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53441wlZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53441wlZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSelectCallback(@NotNull vBB vbb) {
        Intrinsics.checkNotNullParameter(vbb, "");
        this.OLrzqt = vbb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFragmentManger(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = fragmentManager;
    }

    @Override // o.vBA
    public void setInsType(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpponentPriceView(C53441wlZ c53441wlZ) {
        this.AEQbTJ = c53441wlZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPresenter(InterfaceC50102vBz interfaceC50102vBz) {
        this.EZpvd = interfaceC50102vBz;
    }

    @Override // o.vBA
    public void setTradeOrderType(vBP vbp) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.vBA
    public void setUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:51) call: o.wlZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53441wlZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // o.vBA
    public void setInstId(java.lang.String str) {
        vBA.StateListAnimator.KWHzl(this, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53441wlZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OFqMGB, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50907vcx abstractC50907vcx = (AbstractC50907vcx) viewDataBindingInflate;
        this.copydefault = abstractC50907vcx;
        setOrientation(1);
        android.widget.TextView textView = abstractC50907vcx.djBIcL;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        android.widget.LinearLayout linearLayout = abstractC50907vcx.copydefault;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
        android.widget.LinearLayout linearLayout2 = abstractC50907vcx.AEQbTJ;
        linearLayout2.setOnClickListener(new StateListAnimator(linearLayout2, 1000L, this));
        android.widget.LinearLayout linearLayout3 = abstractC50907vcx.EZpvd;
        linearLayout3.setOnClickListener(new Application(linearLayout3, 1000L, this));
    }

    public final void gEmmrt() {
        vBS vbs;
        java.util.List listAhwBna;
        InterfaceC50102vBz interfaceC50102vBz = this.EZpvd;
        if (interfaceC50102vBz instanceof vBS) {
            Intrinsics.copydefault(interfaceC50102vBz, "");
            vbs = (vBS) interfaceC50102vBz;
        } else {
            vbs = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.KWHzl;
        if (fragmentManager == null || vbs == null || fragmentManager == null) {
            return;
        }
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(vbs.gEmmrt().size()), 0)) {
            android.util.ArrayMap<java.lang.String, java.lang.String> arrayMapGEmmrt = vbs.gEmmrt();
            listAhwBna = new java.util.ArrayList(arrayMapGEmmrt.size());
            for (Map.Entry<java.lang.String, java.lang.String> entry : arrayMapGEmmrt.entrySet()) {
                java.lang.String value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                listAhwBna.add(new TradeMenuItemBean(value, Intrinsics.EZpvd((java.lang.Object) vbs.OLrzqt(), (java.lang.Object) entry.getKey()), entry.getKey(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
            }
        } else {
            listAhwBna = yDY.AhwBna();
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, listAhwBna, null, false, null, 0, 30, null);
        if (c47978uAlNewInstance$default != null) {
            c47978uAlNewInstance$default.KWHzl(new TaskDescription(vbs, this));
        }
        if (c47978uAlNewInstance$default != null) {
            c47978uAlNewInstance$default.show(fragmentManager, "bondTypeSelect");
        }
    }

    /* JADX INFO: renamed from: o.wlZ$TaskDescription */
    public static final class TaskDescription implements C47978uAl.StateListAnimator {
        public final /* synthetic */ vBS EZpvd;
        public final /* synthetic */ C53441wlZ copydefault;

        public TaskDescription(vBS vbs, C53441wlZ c53441wlZ) {
            this.EZpvd = vbs;
            this.copydefault = c53441wlZ;
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            vBS vbs = this.EZpvd;
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            vbs.AEQbTJ((java.lang.String) data);
            C53441wlZ c53441wlZAhwBna = this.EZpvd.AhwBna();
            if (c53441wlZAhwBna != null) {
                c53441wlZAhwBna.setMarginMode(tradeMenuItemBean.getTitle(), true);
            }
            vBA vbaEjfBZ = this.EZpvd.ejfBZ();
            if (vbaEjfBZ != null) {
                vbaEjfBZ.setMarginMode(tradeMenuItemBean.getTitle(), true);
            }
            vBB vbb = this.copydefault.OLrzqt;
            if (vbb != null) {
                java.lang.Object data2 = tradeMenuItemBean.getData();
                Intrinsics.copydefault(data2, "");
                vbb.AEQbTJ((java.lang.String) data2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.fragment.app.Fragment] */
    public final void AhwBna() {
        vBS vbs;
        InterfaceC49508upq interfaceC49508upq;
        java.lang.String instType;
        java.lang.String instId;
        InterfaceC50102vBz interfaceC50102vBz = this.EZpvd;
        java.lang.Object instType2 = null;
        if (interfaceC50102vBz instanceof vBS) {
            Intrinsics.copydefault(interfaceC50102vBz, "");
            vbs = (vBS) interfaceC50102vBz;
        } else {
            vbs = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.KWHzl;
        if (fragmentManager == null || vbs == null || fragmentManager == null) {
            return;
        }
        InterfaceC49508upq interfaceC49508upq2 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
        if (interfaceC49508upq2 != null) {
            BizInstrument bizInstrumentKWHzl = vbs.KWHzl();
            java.lang.String str = (bizInstrumentKWHzl == null || (instId = bizInstrumentKWHzl.getInstId()) == null) ? "" : instId;
            BizInstrument bizInstrumentKWHzl2 = vbs.KWHzl();
            java.lang.String str2 = (bizInstrumentKWHzl2 == null || (instType = bizInstrumentKWHzl2.getInstType()) == null) ? "" : instType;
            java.lang.String strFetchVPNInfo = vbs.fetchVPNInfo();
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapValueOf = valueOf();
            BizInstrument bizInstrumentKWHzl3 = vbs.KWHzl();
            if (bizInstrumentKWHzl3 == null || !bizInstrumentKWHzl3.isPreMarketPair()) {
                BizInstrument bizInstrumentKWHzl4 = vbs.KWHzl();
                if (bizInstrumentKWHzl4 != null) {
                    instType2 = bizInstrumentKWHzl4.getInstType();
                }
            } else {
                instType2 = "pre_market";
            }
            instType2 = InterfaceC49508upq.StateListAnimator.getSearchFragment$default(interfaceC49508upq2, str, str2, "bizNav", strFetchVPNInfo, mapValueOf, null, instType2, 32, null);
        }
        ?? r6 = instType2;
        InterfaceC49508upq interfaceC49508upq3 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
        if (interfaceC49508upq3 != null) {
            interfaceC49508upq3.KWHzl(new Function2() { // from class: o.wma
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53441wlZ.OLrzqt(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
        if (r6 == 0 || (interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class)) == null) {
            return;
        }
        InterfaceC49508upq.StateListAnimator.showDialog$default(interfaceC49508upq, r6, fragmentManager, null, 4, null);
    }

    public static final Unit OLrzqt(C53441wlZ c53441wlZ, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        vBB vbb = c53441wlZ.OLrzqt;
        if (vbb != null) {
            vbb.copydefault(str, str2);
        }
        return Unit.INSTANCE;
    }

    private final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> valueOf() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("bizType", yDY.gEmmrt("Watchlist", "SPOT", "SWAP", "FUTURES", "OPTION")));
    }

    public final void AYXKKw() {
        vBS vbs;
        java.lang.String last;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strKWHzl;
        java.lang.String strOLrzqt;
        BizInstrument bizInstrumentKWHzl;
        java.lang.String last2;
        TickersData tickersDataAkhnZx;
        InterfaceC50102vBz interfaceC50102vBz = this.EZpvd;
        java.lang.String quoteSymbol = null;
        if (interfaceC50102vBz instanceof vBS) {
            Intrinsics.copydefault(interfaceC50102vBz, "");
            vbs = (vBS) interfaceC50102vBz;
        } else {
            vbs = null;
        }
        TradePositionManager.PositionItem positionItem = new TradePositionManager.PositionItem();
        if (vbs == null || (tickersDataAkhnZx = vbs.AkhnZx()) == null || (last = tickersDataAkhnZx.getLast()) == null) {
            last = "";
        }
        positionItem.setLast(last);
        androidx.fragment.app.FragmentManager fragmentManager = this.KWHzl;
        if (fragmentManager == null || vbs == null || fragmentManager == null) {
            return;
        }
        AbstractC49732uuB.StateListAnimator stateListAnimator = AbstractC49732uuB.Companion;
        BizInstrument bizInstrumentKWHzl2 = vbs.KWHzl();
        if (bizInstrumentKWHzl2 == null || (instId = bizInstrumentKWHzl2.getInstId()) == null) {
            instId = "";
        }
        BizInstrument bizInstrumentKWHzl3 = vbs.KWHzl();
        if (bizInstrumentKWHzl3 == null || (instType = bizInstrumentKWHzl3.getInstType()) == null) {
            instType = "";
        }
        java.lang.String strDjBIcL = vbs.djBIcL();
        vBP vbpIsConnected = vbs.isConnected();
        if (vbpIsConnected == null || (strKWHzl = vbpIsConnected.KWHzl()) == null) {
            strKWHzl = "buy";
        }
        vBP vbpIsConnected2 = vbs.isConnected();
        if (vbpIsConnected2 == null || (strOLrzqt = vbpIsConnected2.OLrzqt()) == null) {
            strOLrzqt = "net";
        }
        java.lang.String strOLrzqt2 = vbs.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt2, (java.lang.Object) "margin_base")) {
            BizInstrument bizInstrumentKWHzl4 = vbs.KWHzl();
            if (bizInstrumentKWHzl4 != null) {
                quoteSymbol = bizInstrumentKWHzl4.getTradeSymbol();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt2, (java.lang.Object) "margin_quote") && (bizInstrumentKWHzl = vbs.KWHzl()) != null) {
            quoteSymbol = bizInstrumentKWHzl.getQuoteSymbol();
        }
        java.lang.String str = quoteSymbol;
        java.lang.String strAYXKKw = vbs.AYXKKw();
        java.lang.String str2 = strAYXKKw == null ? "" : strAYXKKw;
        TickersData tickersDataAkhnZx2 = vbs.AkhnZx();
        stateListAnimator.AEQbTJ(instId, instType, strDjBIcL, strKWHzl, (24192 & 16) != 0 ? null : strOLrzqt, (24192 & 32) != 0 ? null : str, str2, (24192 & 128) != 0 ? null : positionItem, (tickersDataAkhnZx2 == null || (last2 = tickersDataAkhnZx2.getLast()) == null) ? "" : last2, (24192 & 512) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 2048) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE, (24192 & 4096) != 0 ? null : null, (24192 & 8192) != 0 ? null : new Function2() { // from class: o.wlY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53441wlZ.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        }, (24192 & 16384) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 32768) != 0 ? false : false, new Function1() { // from class: o.wmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53441wlZ.OLrzqt((android.content.Context) obj);
            }
        }, new Function1() { // from class: o.wmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53441wlZ.EZpvd((android.content.Context) obj);
            }
        }).show(fragmentManager, "arbitrageLeverage");
    }

    /* JADX INFO: renamed from: o.wlZ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53441wlZ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53441wlZ c53441wlZ) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c53441wlZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.wlZ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53441wlZ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53441wlZ c53441wlZ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c53441wlZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.wlZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53441wlZ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53441wlZ c53441wlZ) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c53441wlZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.wlZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53441wlZ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53441wlZ c53441wlZ) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c53441wlZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AEQbTJ.fetchVPNInfo()) {
                    return;
                }
                this.AEQbTJ.djBIcL();
            }
        }
    }

    public static final Unit copydefault(C53441wlZ c53441wlZ, boolean z, java.lang.String str) {
        vBB vbb;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && (vbb = c53441wlZ.OLrzqt) != null) {
            vbb.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C53685wqE.copydefault.OLrzqt().EZpvd(context);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            C53685wqE.copydefault.KWHzl().EZpvd(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        InterfaceC50102vBz interfaceC50102vBz = this.EZpvd;
        Intrinsics.copydefault(interfaceC50102vBz, "");
        vBS vbs = (vBS) interfaceC50102vBz;
        androidx.fragment.app.FragmentManager fragmentManager = this.KWHzl;
        if (fragmentManager != null) {
            final C53514wmt c53514wmtOLrzqt = C53514wmt.Companion.OLrzqt(vbs.djBIcL());
            c53514wmtOLrzqt.KWHzl(new Function1() { // from class: o.wlX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53441wlZ.AEQbTJ(c53514wmtOLrzqt, this, (java.lang.String) obj);
                }
            });
            c53514wmtOLrzqt.show(fragmentManager, vbs.valueOf());
        }
    }

    public static final Unit AEQbTJ(C53514wmt c53514wmt, final C53441wlZ c53441wlZ, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated")) {
            android.content.Context context = c53514wmt.getContext();
            if (context != null) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.removeOnTrimMemoryListener));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wme
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C53441wlZ.AEQbTJ(this.OLrzqt, str, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
        } else {
            vBB vbb = c53441wlZ.OLrzqt;
            if (vbb != null) {
                vbb.EZpvd(str);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C53441wlZ c53441wlZ, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        vBB vbb = c53441wlZ.OLrzqt;
        if (vbb != null) {
            vbb.EZpvd(str);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.vBA
    public void setCoinName(java.lang.String str) {
        this.copydefault.djBIcL.setText(str);
    }

    @Override // o.vBA
    public void setMarginNum(java.lang.String str) {
        C55251xgS c55251xgS = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(str != null ? 0 : 8);
        this.copydefault.gEmmrt.setText(str);
        C53441wlZ c53441wlZ = this.AEQbTJ;
        if (c53441wlZ != null) {
            c53441wlZ.copydefault();
        }
    }

    public final void copydefault() {
        android.widget.FrameLayout frameLayout = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C53441wlZ c53441wlZ = this.AEQbTJ;
        frameLayout.setVisibility(((c53441wlZ == null || !c53441wlZ.KWHzl()) && !KWHzl()) ? 8 : 0);
        C53441wlZ c53441wlZ2 = this.AEQbTJ;
        if (c53441wlZ2 != null) {
            android.widget.FrameLayout frameLayout2 = this.copydefault.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            c53441wlZ2.AEQbTJ(frameLayout2.getVisibility() == 0);
        }
    }

    public final boolean KWHzl() {
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() != 0) {
            android.widget.LinearLayout linearLayout2 = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            if (linearLayout2.getVisibility() != 0) {
                android.widget.LinearLayout linearLayout3 = this.copydefault.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                if (linearLayout3.getVisibility() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void AEQbTJ(boolean z) {
        android.widget.FrameLayout frameLayout = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
    }

    @Override // o.vBA
    public void setLeverage(java.lang.String str) {
        if (fetchVPNInfo()) {
            OLrzqt();
            return;
        }
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) {
            this.copydefault.AhwBna.setText(str);
        } else {
            this.copydefault.AhwBna.setText(str + "X");
        }
        copydefault();
    }

    public final java.lang.String EZpvd() {
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout.getVisibility() == 0 ? this.copydefault.AhwBna.getText().toString() : "";
    }

    @Override // o.vBA
    public void setMarginMode(java.lang.String str, boolean z) {
        android.widget.LinearLayout linearLayout = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(str != null ? 0 : 8);
        this.copydefault.fetchVPNInfo.setText(str);
        this.copydefault.fetchVPNInfo.setEnabled(z);
        this.copydefault.copydefault.setEnabled(z);
        copydefault();
        C53441wlZ c53441wlZ = this.AEQbTJ;
        if (c53441wlZ != null) {
            c53441wlZ.copydefault();
        }
    }

    @Override // o.vBA
    public void setCrossType(java.lang.String str, boolean z) {
        android.widget.LinearLayout linearLayout = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(str != null ? 0 : 8);
        this.copydefault.AkhnZx.setText(str);
        this.copydefault.AkhnZx.setEnabled(z);
        this.copydefault.AEQbTJ.setEnabled(z);
        copydefault();
        C53441wlZ c53441wlZ = this.AEQbTJ;
        if (c53441wlZ != null) {
            c53441wlZ.copydefault();
        }
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(fetchVPNInfo() ^ true ? 0 : 8);
    }

    public final java.lang.String AEQbTJ() {
        android.widget.LinearLayout linearLayout = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout.getVisibility() == 0 ? this.copydefault.AkhnZx.getText().toString() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fetchVPNInfo() {
        vBS vbs;
        InterfaceC50102vBz interfaceC50102vBz = this.EZpvd;
        if (interfaceC50102vBz instanceof vBS) {
            Intrinsics.copydefault(interfaceC50102vBz, "");
            vbs = (vBS) interfaceC50102vBz;
        } else {
            vbs = null;
        }
        if (vbs != null) {
            return vbs.DbNXlk().booleanValue();
        }
        return false;
    }
}
