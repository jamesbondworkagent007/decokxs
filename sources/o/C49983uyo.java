package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeuilib.order.trade.biz.bean.SimpleBorrowSwitchChangeEvent;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49983uyo extends android.widget.LinearLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> AEQbTJ;
    public BizInstrument AYXKKw;
    public yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, Unit> AhwBna;
    public final AbstractC49608urk EZpvd;
    public androidx.fragment.app.FragmentManager KWHzl;
    public boolean OLrzqt;
    public TradeType djBIcL;
    public C56132xwz gEmmrt;
    public C49992uyx valueOf;

    /* JADX INFO: renamed from: o.uyo$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public final /* synthetic */ class StateListAnimator {
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
    public C49983uyo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49983uyo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbacks(Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> function2, yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        this.AEQbTJ = function2;
        this.AhwBna = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.KWHzl = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickOrder(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: o.uyo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49983uyo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C49983uyo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC49608urk abstractC49608urkKWHzl = AbstractC49608urk.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC49608urkKWHzl, "");
        this.EZpvd = abstractC49608urkKWHzl;
        C56132xwz c56132xwz = null;
        ViewModelStoreOwner viewModelStoreOwner = context instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) context : null;
        this.valueOf = viewModelStoreOwner != null ? (C49992uyx) new ViewModelProvider(viewModelStoreOwner).get(C49992uyx.class) : null;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = fragmentActivity.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            c56132xwz = (C56132xwz) new ViewModelProvider(fragmentActivity, defaultViewModelProviderFactory).get(C56132xwz.class);
        }
        this.gEmmrt = c56132xwz;
    }

    /* JADX INFO: renamed from: o.uyo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uyo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean KWHzl(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return false;
            }
            return ((C49992uyx) new ViewModelProvider(fragmentActivity).get(C49992uyx.class)).AEQbTJ();
        }

        public final C49992uyx AEQbTJ(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return null;
            }
            return (C49992uyx) new ViewModelProvider(fragmentActivity).get(C49992uyx.class);
        }
    }

    public final void OLrzqt() {
        C49992uyx c49992uyx = this.valueOf;
        if (c49992uyx != null) {
            c49992uyx.OLrzqt();
        }
        pUU.KWHzl("SimpleBorrowSwitchView", "reset data");
    }

    public static /* synthetic */ void updateView$default(C49983uyo c49983uyo, BizInstrument bizInstrument, TradeType tradeType, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tradeType = null;
        }
        c49983uyo.EZpvd(bizInstrument, tradeType, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(BizInstrument bizInstrument, TradeType tradeType, java.lang.Boolean bool) {
        boolean z;
        java.lang.String strAYXKKw;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C56084xwD fieldNames;
        java.util.ArrayList<java.lang.String> arrayListEZpvd;
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        boolean z2 = false;
        boolean z3 = interfaceC54581xNrOLrzqt2 != null && interfaceC54581xNrOLrzqt2.DbNXlk("MARGIN") && Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        boolean z4 = (interfaceC54581xNrOLrzqt3 == null || (newProxyInstance = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) == null || !newProxyInstance.copydefault()) ? false : true;
        if (this.AYXKKw == null) {
            z = false;
        } else {
            java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
            BizInstrument bizInstrument2 = this.AYXKKw;
            if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstId() : null))) {
                java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
                BizInstrument bizInstrument3 = this.AYXKKw;
                if (!Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null))) {
                }
            }
            z = true;
        }
        if (z3) {
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
                C54794xVo c54794xVo = C54794xVo.copydefault;
                if ((c54794xVo.copydefault(bizInstrument.getInstId()) || AEQbTJ(bizInstrument)) && c54794xVo.AhwBna()) {
                    AbstractC49608urk abstractC49608urk = this.EZpvd;
                    wYK wyk = abstractC49608urk.AEQbTJ;
                    if (!z4) {
                        android.widget.TextView textView = abstractC49608urk.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        textView.setVisibility(8);
                        strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.RlQdEF);
                    } else {
                        if (!this.OLrzqt) {
                            android.widget.TextView textView2 = abstractC49608urk.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(textView2, "");
                            textView2.setVisibility(0);
                        }
                        strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.uzCIH);
                    }
                    wyk.setText(strAYXKKw);
                    boolean z5 = (!C49778uuv.copydefault.KWHzl(bizInstrument.getInstId()) || (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null || (arrayListEZpvd = fieldNames.EZpvd()) == null || arrayListEZpvd.contains(bizInstrument.getInstId())) ? false : true;
                    if (z5) {
                        this.EZpvd.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.uyn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C49983uyo.OLrzqt(view);
                            }
                        });
                    } else {
                        this.EZpvd.OLrzqt.setOnClickListener(null);
                        this.EZpvd.OLrzqt.setClickable(false);
                    }
                    this.EZpvd.AEQbTJ.setOnCheckedChangeListener(null);
                    setVisibility(0);
                    if (z || z5) {
                        OLrzqt();
                    }
                    this.EZpvd.AEQbTJ.setEnabled(!z5);
                    wYK wyk2 = this.EZpvd.AEQbTJ;
                    C49992uyx c49992uyx = this.valueOf;
                    wyk2.setChecked(c49992uyx != null && c49992uyx.AEQbTJ());
                    C49992uyx c49992uyx2 = this.valueOf;
                    if (c49992uyx2 != null) {
                        c49992uyx2.KWHzl(this.EZpvd.AEQbTJ.isChecked());
                    }
                    this.EZpvd.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.uyr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z6) {
                            C49983uyo.AEQbTJ(this.EZpvd, compoundButton, z6);
                        }
                    });
                    android.widget.TextView textView3 = this.EZpvd.EZpvd;
                    textView3.setOnClickListener(new Application(textView3, 1000L, this));
                    KWHzl();
                    boolean z6 = getVisibility() == 0;
                    pUU.KWHzl("SimpleBorrowSwitchView", "enableSpotBorrow:" + z4 + " isVisible: " + z6 + " isChecked: " + this.EZpvd.AEQbTJ.isChecked() + " isLeadOpen:" + z5);
                }
            }
        } else {
            setVisibility(8);
            OLrzqt();
            pUU.KWHzl("SimpleBorrowSwitchView", "isVisible: false");
        }
        C49992uyx c49992uyx3 = this.valueOf;
        if (c49992uyx3 != null && c49992uyx3.AEQbTJ()) {
            z2 = true;
        }
        pUU.KWHzl("SimpleBorrowSwitchView", "updateView " + bizInstrument + " simpleBorrowMode: " + z2);
        this.AYXKKw = bizInstrument;
        this.djBIcL = tradeType;
        AEQbTJ();
    }

    public static final void OLrzqt(android.view.View view) {
        C55326xho.toast$default(C49511upt.Activity.values, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final void AEQbTJ(final C49983uyo c49983uyo, android.widget.CompoundButton compoundButton, final boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        final xOW newProxyInstance = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.getNewProxyInstance() : null;
        if (newProxyInstance != null && !newProxyInstance.copydefault()) {
            c49983uyo.EZpvd.AEQbTJ.setCheckedIgnoreListener(false);
            c49983uyo.copydefault();
            pUU.KWHzl("SimpleBorrowSwitchView", "jump to open borrow");
        } else {
            if (newProxyInstance != null && !newProxyInstance.UeEOUB() && z) {
                c49983uyo.EZpvd.AEQbTJ.setCheckedIgnoreListener(false);
                C49487upV c49487upV = C49487upV.KWHzl;
                android.content.Context context = c49983uyo.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C49487upV.showSimpleBorrowTradeAgreementDialog$default(c49487upV, context, new View.OnClickListener() { // from class: o.uyy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C49983uyo.OLrzqt(this.copydefault, view);
                    }
                }, new Function0() { // from class: o.uyv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49983uyo.OLrzqt(this.OLrzqt, z, newProxyInstance);
                    }
                }, null, 8, null);
            } else {
                c49983uyo.EZpvd.AEQbTJ.setChecked(z);
                C49992uyx c49992uyx = c49983uyo.valueOf;
                if (c49992uyx != null) {
                    c49992uyx.KWHzl(z);
                }
            }
            pUU.KWHzl("SimpleBorrowSwitchView", "checked  " + z);
        }
        c49983uyo.OLrzqt(z);
        RxBus.AEQbTJ(new SimpleBorrowSwitchChangeEvent());
    }

    public static final void OLrzqt(C49983uyo c49983uyo, android.view.View view) {
        C49486upU c49486upUOLrzqt = C49486upU.Companion.OLrzqt();
        androidx.fragment.app.FragmentManager childFragmentManager = ViewKt.findFragment(c49983uyo).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c49486upUOLrzqt.show(childFragmentManager);
    }

    public static final Unit OLrzqt(final C49983uyo c49983uyo, final boolean z, final xOW xow) {
        C32866mlf.onEvent$default("Trade_Action_Borrow_Click", (TrackChannel[]) null, new Function1() { // from class: o.uyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49983uyo.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C49487upV.KWHzl.KWHzl(ViewKt.findFragment(c49983uyo), new Function1() { // from class: o.uyt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49983uyo.copydefault(this.OLrzqt, z, xow, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.uys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49983uyo.OLrzqt((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "accept_contract_type", "autoborrow_checkbox", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C49983uyo c49983uyo, boolean z, xOW xow, boolean z2) {
        if (z2) {
            C49992uyx c49992uyx = c49983uyo.valueOf;
            if (c49992uyx != null) {
                c49992uyx.KWHzl(z);
            }
            xow.r_("1");
            c49983uyo.EZpvd.AEQbTJ.setCheckedIgnoreListener(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uyo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C49983uyo KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C49983uyo c49983uyo) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c49983uyo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strCopydefault;
            C56111xwe<java.lang.String> newProxyInstance;
            java.lang.String value;
            C56111xwe<java.lang.String> newProxyInstance2;
            java.lang.String value2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TradeType tradeType = this.KWHzl.djBIcL;
                int i = tradeType == null ? -1 : StateListAnimator.AEQbTJ[tradeType.ordinal()];
                if (i == 1) {
                    java.lang.String strCopydefault2 = C54794xVo.copydefault.copydefault(this.KWHzl.AYXKKw);
                    BizInstrument bizInstrument = this.KWHzl.AYXKKw;
                    if (bizInstrument == null || !bizInstrument.isDisplayTradeReceive() || !C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault2)) {
                        int i2 = C49511upt.Activity.dxcTrN;
                        C56132xwz c56132xwz = this.KWHzl.gEmmrt;
                        if (c56132xwz == null || (newProxyInstance = c56132xwz.getNewProxyInstance()) == null || (value = newProxyInstance.getValue()) == null) {
                            BizInstrument bizInstrument2 = this.KWHzl.AYXKKw;
                            if (bizInstrument2 != null) {
                                displayQuoteSymbol = bizInstrument2.getDisplayQuoteSymbol();
                            }
                        } else {
                            displayQuoteSymbol = value;
                        }
                        strCopydefault = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", java.lang.String.valueOf(displayQuoteSymbol))));
                    } else {
                        int i3 = C49511upt.Activity.gasjUx;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        C56132xwz c56132xwz2 = this.KWHzl.gEmmrt;
                        if (c56132xwz2 == null || (newProxyInstance2 = c56132xwz2.getNewProxyInstance()) == null || (value2 = newProxyInstance2.getValue()) == null) {
                            BizInstrument bizInstrument3 = this.KWHzl.AYXKKw;
                            if (bizInstrument3 != null) {
                                displayQuoteSymbol = bizInstrument3.getDisplayQuoteSymbol();
                            }
                        } else {
                            displayQuoteSymbol = value2;
                        }
                        pairArr[0] = C56390yDp.OLrzqt("ccy1", java.lang.String.valueOf(displayQuoteSymbol));
                        pairArr[1] = C56390yDp.OLrzqt("ccy2", strCopydefault2);
                        strCopydefault = C33069mpW.copydefault(i3, C56424yEw.gEmmrt(pairArr));
                    }
                } else if (i != 2) {
                    strCopydefault = "";
                } else {
                    int i4 = C49511upt.Activity.finit;
                    BizInstrument bizInstrument4 = this.KWHzl.AYXKKw;
                    strCopydefault = C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", java.lang.String.valueOf(bizInstrument4 != null ? bizInstrument4.getTradeSymbol() : null))));
                }
                java.lang.String str = strCopydefault;
                if (str.length() > 0) {
                    C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uyo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C49983uyo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C49983uyo c49983uyo) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c49983uyo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    java.lang.String str = this.OLrzqt.djBIcL == TradeType.SELL_CLOSE ? "sell" : "buy";
                    yHO yho = this.OLrzqt.AhwBna;
                    if (yho != null) {
                        yho.invoke(context, str, "simple_mode_borrow");
                    }
                }
                if (this.OLrzqt.EZpvd.AEQbTJ.isChecked()) {
                    this.OLrzqt.EZpvd();
                }
            }
        }
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(BizInstrument bizInstrument) {
        return copydefault(bizInstrument, TradeType.BUY_OPEN) || copydefault(bizInstrument, TradeType.SELL_CLOSE);
    }

    public final void AEQbTJ() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        if (this.djBIcL != null) {
            C54794xVo c54794xVo = C54794xVo.copydefault;
            BizInstrument bizInstrument = this.AYXKKw;
            if (c54794xVo.copydefault(bizInstrument != null ? bizInstrument.getInstId() : null) || copydefault(this.AYXKKw, this.djBIcL) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.copydefault()) {
                return;
            }
            AbstractC49608urk abstractC49608urk = this.EZpvd;
            abstractC49608urk.AEQbTJ.setEnabled(false);
            abstractC49608urk.AEQbTJ.setChecked(false);
            android.widget.TextView textView = abstractC49608urk.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            abstractC49608urk.AEQbTJ.setOnCheckedChangeListener(null);
            android.view.View view = abstractC49608urk.OLrzqt;
            view.setOnClickListener(new Activity(view, 1000L, this));
        }
    }

    public final boolean copydefault(BizInstrument bizInstrument, TradeType tradeType) {
        C56111xwe<java.lang.String> newProxyInstance;
        java.lang.String value = null;
        if (tradeType == TradeType.BUY_OPEN) {
            C54794xVo c54794xVo = C54794xVo.copydefault;
            C56132xwz c56132xwz = this.gEmmrt;
            if (c56132xwz != null && (newProxyInstance = c56132xwz.getNewProxyInstance()) != null) {
                value = newProxyInstance.getValue();
            }
            return c54794xVo.AEQbTJ(bizInstrument, value);
        }
        return C54794xVo.isSpotSellSideSupportLoan$default(C54794xVo.copydefault, bizInstrument, null, 2, null);
    }

    public final void KWHzl() {
        post(new java.lang.Runnable() { // from class: o.uyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49983uyo.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AYXKKw(C49983uyo c49983uyo) {
        ViewGroup.LayoutParams layoutParams = c49983uyo.EZpvd.OLrzqt.getLayoutParams();
        layoutParams.width = c49983uyo.EZpvd.AEQbTJ.getMeasuredWidth();
        layoutParams.height = c49983uyo.EZpvd.AEQbTJ.getMeasuredHeight();
        c49983uyo.EZpvd.OLrzqt.setLayoutParams(layoutParams);
    }

    public final void copydefault() {
        Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = ViewKt.findFragment(this).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            function2.invoke(childFragmentManager, new Function0() { // from class: o.uyu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49983uyo.gEmmrt(this.EZpvd);
                }
            });
        }
    }

    public static final Unit gEmmrt(C49983uyo c49983uyo) {
        c49983uyo.EZpvd.AEQbTJ.setChecked(true);
        c49983uyo.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C49511upt.Activity.uzCIH));
        android.widget.TextView textView = c49983uyo.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        c49983uyo.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void setTradeSide(TradeType tradeType, java.lang.Boolean bool) {
        if (this.djBIcL != tradeType) {
            this.djBIcL = tradeType;
            EZpvd(this.AYXKKw, tradeType, bool);
        }
    }

    public final void OLrzqt(final boolean z) {
        C32866mlf.onEvent$default("PlaceOrder_Panel_Autoborrow_Click", (TrackChannel[]) null, new Function1() { // from class: o.uyp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49983uyo.EZpvd(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("Trade_Borrow_Manage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
        this.AhwBna = null;
    }
}
