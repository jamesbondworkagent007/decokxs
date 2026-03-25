package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.TooltipKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableField;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.biz.StrategyType;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.order.trade.biz.bean.SimpleBorrowSwitchChangeEvent;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.tradeuilib.order.trade.view.MarginSwitchView$onAttachedToWindow$1;
import com.okinc.tradeuilib.order.trade.view.MarginSwitchView$updateViewMultiPmAccount$2$1$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C49511upt;
import o.C52761wXj;
import o.C54520xLl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49908uxS extends android.widget.FrameLayout {
    public static StateFlow<java.lang.Boolean> AEQbTJ;
    public static final MutableStateFlow<java.lang.Boolean> EZpvd;
    public static final StateFlow<java.lang.Boolean> OLrzqt;
    public static final MutableStateFlow<java.lang.Boolean> copydefault;
    public static final ObservableField<java.lang.Boolean> djBIcL;
    public Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> AYXKKw;
    public boolean AhwBna;
    public BizInstrument AkhnZx;
    public C56132xwz DbNXlk;
    public C49975uyg ejfBZ;
    public boolean fARcdN;
    public ViewModelStoreOwner fetchVPNInfo;
    public final C49611urn gEmmrt;
    public yHO<? super android.content.Context, ? super java.lang.String, ? super java.lang.String, Unit> isConnected;
    public boolean valueOf;
    public View.OnClickListener values;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.uxS$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AccountMode.values().length];
            try {
                iArr[AccountMode.TRADING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AccountMode.FUTURES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountMode.MULTI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountMode.PM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TradeType.SELL_CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49908uxS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49908uxS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickOrder(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49611urn valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:149) call: o.uxS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49908uxS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49908uxS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C49611urn c49611urnCopydefault = C49611urn.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c49611urnCopydefault, "");
        this.gEmmrt = c49611urnCopydefault;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountMode fetchVPNInfo() {
        xOW newProxyInstance;
        AccountMode.StateListAnimator stateListAnimator = AccountMode.Companion;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return stateListAnimator.copydefault((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
    }

    /* JADX INFO: renamed from: o.uxS$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C49908uxS AYXKKw;
        public final /* synthetic */ BizInstrument EZpvd;
        public final /* synthetic */ AccountMode KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C49908uxS c49908uxS, Ref.BooleanRef booleanRef, AccountMode accountMode, BizInstrument bizInstrument) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.AYXKKw = c49908uxS;
            this.copydefault = booleanRef;
            this.KWHzl = accountMode;
            this.EZpvd = bizInstrument;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String instId;
            java.lang.String instType;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C49908uxS c49908uxS = this.AYXKKw;
                C49402unq.copydefault(c49908uxS, "margin_swtch", C56424yEw.gEmmrt(C56390yDp.OLrzqt("isEnabled", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(c49908uxS.fIwbmz()))), C56390yDp.OLrzqt("isAutoBorrow", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(this.copydefault.element)))), new java.lang.Class[0]);
                StateListAnimator stateListAnimatorDbNXlk = this.AYXKKw.DbNXlk();
                Ref.BooleanRef booleanRef = this.copydefault;
                if (!booleanRef.element) {
                    C49908uxS c49908uxS2 = this.AYXKKw;
                    AccountMode accountMode = this.KWHzl;
                    c49908uxS2.EZpvd(accountMode, c49908uxS2.new FragmentManager(accountMode, booleanRef, this.EZpvd));
                    return;
                }
                this.AYXKKw.copydefault(true);
                boolean z = !this.AYXKKw.OLrzqt(this.KWHzl);
                C49908uxS.setMode$default(this.AYXKKw, this.KWHzl, java.lang.Boolean.valueOf(z), false, 4, null);
                C56132xwz c56132xwz = this.AYXKKw.DbNXlk;
                C56132xwz c56132xwz2 = null;
                if (c56132xwz == null) {
                    Intrinsics.gEmmrt("");
                    c56132xwz = null;
                }
                c56132xwz.AhwBna().KWHzl(java.lang.Boolean.valueOf(z));
                RxBus.KWHzl("trade_balance_refresh");
                if (this.AYXKKw.gEmmrt()) {
                    C32866mlf.onEvent$default("KLine_PlaceOrder_Checkbox_Click", (TrackChannel[]) null, PictureInPictureParams.copydefault, 1, (java.lang.Object) null);
                } else {
                    C32866mlf.onEvent$default("PlaceOrder_Trade_Checkbox_Click", (TrackChannel[]) null, TaskStackBuilder.EZpvd, 1, (java.lang.Object) null);
                }
                StateListAnimator stateListAnimatorDbNXlk2 = this.AYXKKw.DbNXlk();
                BizInstrument bizInstrument = this.AYXKKw.AkhnZx;
                if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                    instId = "";
                }
                BizInstrument bizInstrument2 = this.AYXKKw.AkhnZx;
                java.lang.String str = (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) ? "" : instType;
                C56132xwz c56132xwz3 = this.AYXKKw.DbNXlk;
                if (c56132xwz3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c56132xwz2 = c56132xwz3;
                }
                stateListAnimatorDbNXlk2.AEQbTJ(stateListAnimatorDbNXlk, "user", "click", instId, str, c56132xwz2.getNewProxyInstance().getValue());
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C49908uxS OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C49908uxS c49908uxS) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c49908uxS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.fARcdN) {
                    this.OLrzqt.AkhnZx();
                } else {
                    this.OLrzqt.valueOf().EZpvd.performClick();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C49908uxS AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C49908uxS c49908uxS) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c49908uxS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String instType;
            java.lang.String instId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.copydefault;
                StateListAnimator stateListAnimatorDbNXlk = this.AEQbTJ.DbNXlk();
                this.AEQbTJ.copydefault(true);
                C49908uxS c49908uxS = this.AEQbTJ;
                AccountMode accountMode = AccountMode.FUTURES;
                boolean z = !c49908uxS.OLrzqt(accountMode);
                C49908uxS.setMode$default(this.AEQbTJ, accountMode, java.lang.Boolean.valueOf(z), false, 4, null);
                java.lang.String str = z ? "MARGIN" : "SPOT";
                C49908uxS c49908uxS2 = this.AEQbTJ;
                c49908uxS2.copydefault(c49908uxS2.AkhnZx, str);
                C49402unq.copydefault(this.AEQbTJ, "margin_swtch", C56423yEv.EZpvd(C56390yDp.OLrzqt("status", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF)), new java.lang.Class[0]);
                C56132xwz c56132xwz = null;
                C32866mlf.onEvent$default("PlaceOrder_Top_Margin_Click", (TrackChannel[]) null, new Fragment(z), 1, (java.lang.Object) null);
                View.OnClickListener onClickListener = this.AEQbTJ.values;
                if (onClickListener != null) {
                    onClickListener.onClick(constraintLayout);
                }
                StateListAnimator stateListAnimatorDbNXlk2 = this.AEQbTJ.DbNXlk();
                BizInstrument bizInstrument = this.AEQbTJ.AkhnZx;
                java.lang.String str2 = (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) ? "" : instId;
                BizInstrument bizInstrument2 = this.AEQbTJ.AkhnZx;
                java.lang.String str3 = (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) ? "" : instType;
                C56132xwz c56132xwz2 = this.AEQbTJ.DbNXlk;
                if (c56132xwz2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c56132xwz = c56132xwz2;
                }
                stateListAnimatorDbNXlk2.AEQbTJ(stateListAnimatorDbNXlk, "user", "click", str2, str3, c56132xwz.getNewProxyInstance().getValue());
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C49908uxS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C49908uxS c49908uxS) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c49908uxS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.String str = C49926uxk.Companion.AEQbTJ() == TradeType.SELL_CLOSE ? "sell" : "buy";
                yHO yho = this.copydefault.isConnected;
                if (yho != null) {
                    android.content.Context context = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    yho.invoke(context, str, "simple_mode_borrow");
                }
                if (this.copydefault.OLrzqt(AccountMode.TRADING)) {
                    C49975uyg c49975uyg = this.copydefault.ejfBZ;
                    if (c49975uyg == null) {
                        Intrinsics.gEmmrt("");
                        c49975uyg = null;
                    }
                    c49975uyg.EZpvd();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ C49908uxS AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C49905uxP KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C49908uxS c49908uxS, C49905uxP c49905uxP) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c49908uxS;
            this.KWHzl = c49905uxP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String instType;
            java.lang.String instId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StateListAnimator stateListAnimatorDbNXlk = this.AEQbTJ.DbNXlk();
                C49908uxS c49908uxS = this.AEQbTJ;
                AccountMode accountMode = AccountMode.TRADING;
                boolean z = !c49908uxS.OLrzqt(accountMode);
                C49975uyg c49975uyg = this.AEQbTJ.ejfBZ;
                C56132xwz c56132xwz = null;
                if (c49975uyg == null) {
                    Intrinsics.gEmmrt("");
                    c49975uyg = null;
                }
                if (c49975uyg.valueOf()) {
                    C49975uyg c49975uyg2 = this.AEQbTJ.ejfBZ;
                    if (c49975uyg2 == null) {
                        Intrinsics.gEmmrt("");
                        c49975uyg2 = null;
                    }
                    if (!c49975uyg2.AhwBna() && z) {
                        C49908uxS.setMode$default(this.AEQbTJ, accountMode, java.lang.Boolean.FALSE, false, 4, null);
                        this.AEQbTJ.AEQbTJ(accountMode);
                    } else {
                        C49908uxS.setMode$default(this.AEQbTJ, accountMode, java.lang.Boolean.valueOf(z), false, 4, null);
                    }
                    pUU.KWHzl("MarginSwitchView", "checked " + this.AEQbTJ.OLrzqt(accountMode));
                } else {
                    C49908uxS.setMode$default(this.AEQbTJ, accountMode, java.lang.Boolean.FALSE, false, 4, null);
                    this.AEQbTJ.EZpvd(accountMode, this.KWHzl);
                    pUU.KWHzl("MarginSwitchView", "jump to open borrow");
                }
                C49975uyg c49975uyg3 = this.AEQbTJ.ejfBZ;
                if (c49975uyg3 == null) {
                    Intrinsics.gEmmrt("");
                    c49975uyg3 = null;
                }
                c49975uyg3.AEQbTJ(this.AEQbTJ.OLrzqt(accountMode));
                RxBus.AEQbTJ(new SimpleBorrowSwitchChangeEvent());
                StateListAnimator stateListAnimatorDbNXlk2 = this.AEQbTJ.DbNXlk();
                BizInstrument bizInstrument = this.AEQbTJ.AkhnZx;
                java.lang.String str = (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) ? "" : instId;
                BizInstrument bizInstrument2 = this.AEQbTJ.AkhnZx;
                java.lang.String str2 = (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) ? "" : instType;
                C56132xwz c56132xwz2 = this.AEQbTJ.DbNXlk;
                if (c56132xwz2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c56132xwz = c56132xwz2;
                }
                stateListAnimatorDbNXlk2.AEQbTJ(stateListAnimatorDbNXlk, "user", "click", str, str2, c56132xwz.getNewProxyInstance().getValue());
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$Application */
    public static final class Application {

        /* JADX INFO: renamed from: o.uxS$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0980Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AccountMode.values().length];
                try {
                    iArr[AccountMode.TRADING.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[AccountMode.FUTURES.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccountMode.MULTI.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccountMode.PM.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final StateFlow<java.lang.Boolean> AEQbTJ() {
            return C49908uxS.OLrzqt;
        }

        public final StateFlow<java.lang.Boolean> OLrzqt() {
            return C49908uxS.AEQbTJ;
        }

        public final boolean copydefault(AccountMode accountMode) {
            AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
            if (accountMode != accountModeCopydefault) {
                pUU.KWHzl("MarginSwitchView", "isMarginOpen: accountMode " + accountMode + " currAccountMode " + accountModeCopydefault + " mismatch, return false");
                return false;
            }
            int i = accountMode == null ? -1 : C0980Application.copydefault[accountMode.ordinal()];
            if (i == 1 || i == 2) {
                java.lang.Boolean value = AEQbTJ().getValue();
                return value != null ? value.booleanValue() : EZpvd(accountMode);
            }
            if ((i != 3 && i != 4) || !C54794xVo.copydefault.OLrzqt()) {
                return false;
            }
            java.lang.Boolean value2 = AEQbTJ().getValue();
            return value2 != null ? value2.booleanValue() : EZpvd(accountMode);
        }

        public final boolean KWHzl() {
            AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
            if (accountModeCopydefault == AccountMode.MULTI || accountModeCopydefault == AccountMode.PM) {
                return copydefault(accountModeCopydefault);
            }
            return false;
        }

        public final boolean EZpvd(AccountMode accountMode) {
            int i = accountMode == null ? -1 : C0980Application.copydefault[accountMode.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return SPUtils.getBoolean("trade_margin_switch_on_key", false);
            }
            if (i == 3 || i == 4) {
                return SPUtils.getBoolean("trade_spot_borrow_switch_on_key", false);
            }
            return false;
        }

        public final void AEQbTJ(AccountMode accountMode) {
            int i = accountMode == null ? -1 : C0980Application.copydefault[accountMode.ordinal()];
            if (i == 2) {
                SPUtils.put("trade_margin_switch_on_key", java.lang.Boolean.valueOf(Intrinsics.EZpvd(AEQbTJ().getValue(), java.lang.Boolean.TRUE)));
            } else if (i == 3 || i == 4) {
                SPUtils.put("trade_spot_borrow_switch_on_key", java.lang.Boolean.valueOf(Intrinsics.EZpvd(AEQbTJ().getValue(), java.lang.Boolean.TRUE)));
            }
        }
    }

    static {
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        EZpvd = MutableStateFlow;
        OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        copydefault = MutableStateFlow2;
        AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
        djBIcL = new ObservableField<>();
    }

    public final void isConnected() {
        pUU.KWHzl("MarginSwitchView", "resetSwitch");
        EZpvd.setValue(null);
    }

    public final void djBIcL() {
        pUU.KWHzl("MarginSwitchView", "resetAll");
        EZpvd.setValue(null);
        copydefault.setValue(java.lang.Boolean.FALSE);
        AEQbTJ((Function0<Unit>) null);
        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        this.gEmmrt.AEQbTJ.setOnClickListener(null);
        this.gEmmrt.EZpvd.setOnClickListener(null);
    }

    public final void KWHzl(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull C56132xwz c56132xwz) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        Intrinsics.checkNotNullParameter(c56132xwz, "");
        this.fetchVPNInfo = viewModelStoreOwner;
        this.ejfBZ = (C49975uyg) new ViewModelProvider(viewModelStoreOwner).get(C49975uyg.class);
        this.DbNXlk = c56132xwz;
    }

    public static /* synthetic */ void initView$default(C49908uxS c49908uxS, AccountMode accountMode, InterfaceC49899uxJ interfaceC49899uxJ, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initView");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c49908uxS.OLrzqt(accountMode, interfaceC49899uxJ, z);
    }

    public final void OLrzqt(AccountMode accountMode, @NotNull InterfaceC49899uxJ interfaceC49899uxJ, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC49899uxJ, "");
        this.fARcdN = z;
        djBIcL();
        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C49975uyg c49975uyg = null;
        c55251xgS.setPadding(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        AccountMode accountModeFetchVPNInfo = fetchVPNInfo();
        if (accountMode != accountModeFetchVPNInfo) {
            pUU.KWHzl("MarginSwitchView", "initView: accountMode " + accountMode + " currAccountMode " + accountModeFetchVPNInfo + " mismatch, skip initView");
            return;
        }
        C49975uyg c49975uyg2 = this.ejfBZ;
        if (c49975uyg2 == null) {
            Intrinsics.gEmmrt("");
            c49975uyg2 = null;
        }
        c49975uyg2.EZpvd(interfaceC49899uxJ.EZpvd());
        int i = accountMode == null ? -1 : ActionBar.copydefault[accountMode.ordinal()];
        if (i == 1) {
            C49900uxK c49900uxK = interfaceC49899uxJ instanceof C49900uxK ? (C49900uxK) interfaceC49899uxJ : null;
            if (c49900uxK != null) {
                this.AYXKKw = c49900uxK.AEQbTJ();
                this.isConnected = c49900uxK.copydefault();
            }
        } else if (i == 2) {
            C49897uxH c49897uxH = interfaceC49899uxJ instanceof C49897uxH ? (C49897uxH) interfaceC49899uxJ : null;
            if (c49897uxH != null) {
                C49975uyg c49975uyg3 = this.ejfBZ;
                if (c49975uyg3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49975uyg = c49975uyg3;
                }
                c49975uyg.EZpvd(c49897uxH.KWHzl());
            }
        } else if (i == 3 || i == 4) {
            if (interfaceC49899uxJ instanceof C49898uxI) {
            }
        } else {
            pUU.KWHzl("MarginSwitchView", "initView: " + accountMode + " unrecognized, no init performed");
        }
        pUU.KWHzl("MarginSwitchView", "initView: " + accountMode + " init complete");
    }

    public final void KWHzl(AccountMode accountMode, @NotNull InterfaceC49904uxO interfaceC49904uxO) {
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(interfaceC49904uxO, "");
        AccountMode accountModeFetchVPNInfo = fetchVPNInfo();
        if (accountMode != accountModeFetchVPNInfo) {
            pUU.KWHzl("MarginSwitchView", "updateView: accountMode " + accountMode + " currAccountMode " + accountModeFetchVPNInfo + " mismatch, skip updateView");
            return;
        }
        boolean z = this.AhwBna;
        if (z) {
            pUU.KWHzl("MarginSwitchView", "updateView: accountMode " + accountMode + " adapt for quick order " + z);
            values();
        }
        if (accountMode != AccountMode.TRADING) {
            EZpvd(false);
        }
        StateListAnimator stateListAnimatorDbNXlk = DbNXlk();
        C55312xha c55312xhaValueOf = this.gEmmrt.copydefault.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setShowUnderline(this.fARcdN);
        }
        C55258xgZ c55258xgZ = this.gEmmrt.copydefault;
        c55258xgZ.setOnClickListener(new LoaderManager(c55258xgZ, TooltipKt.TooltipDuration, this));
        int i = accountMode == null ? -1 : ActionBar.copydefault[accountMode.ordinal()];
        C56132xwz c56132xwz = null;
        if (i == 1) {
            C49905uxP c49905uxP = interfaceC49904uxO instanceof C49905uxP ? (C49905uxP) interfaceC49904uxO : null;
            if (c49905uxP == null) {
                return;
            } else {
                EZpvd(c49905uxP);
            }
        } else if (i == 2) {
            C49901uxL c49901uxL = interfaceC49904uxO instanceof C49901uxL ? (C49901uxL) interfaceC49904uxO : null;
            if (c49901uxL == null) {
                return;
            } else {
                KWHzl(c49901uxL);
            }
        } else if (i == 3 || i == 4) {
            C49902uxM c49902uxM = interfaceC49904uxO instanceof C49902uxM ? (C49902uxM) interfaceC49904uxO : null;
            if (c49902uxM == null) {
                return;
            } else {
                EZpvd(c49902uxM);
            }
        } else {
            pUU.KWHzl("MarginSwitchView", "updateView: " + accountMode + " unrecognized, no update performed");
        }
        StateListAnimator stateListAnimatorDbNXlk2 = DbNXlk();
        BizInstrument bizInstrument = this.AkhnZx;
        java.lang.String str = (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) ? "" : instId;
        BizInstrument bizInstrument2 = this.AkhnZx;
        java.lang.String str2 = (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) ? "" : instType;
        C56132xwz c56132xwz2 = this.DbNXlk;
        if (c56132xwz2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c56132xwz = c56132xwz2;
        }
        stateListAnimatorDbNXlk2.AEQbTJ(stateListAnimatorDbNXlk, "system", "", str, str2, c56132xwz.getNewProxyInstance().getValue());
        pUU.KWHzl("MarginSwitchView", "updateView: " + accountMode + " update complete");
    }

    public final void AkhnZx() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.AYXKKw);
        java.lang.String strCopydefault = C33069mpW.copydefault(C49511upt.Activity.RJOkX, C56423yEv.EZpvd(C56390yDp.OLrzqt("link", strAYXKKw)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        int length = strAYXKKw.length() + iIndexOf$default;
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, length, 33);
        spannableStringBuilder.setSpan(new Activity(), iIndexOf$default, length, 33);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(spannableStringBuilder);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C49511upt.Activity.valueOf), new View.OnClickListener() { // from class: o.uyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49908uxS.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: renamed from: o.uxS$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = C49908uxS.this.getContext();
            if (context != null) {
                C49953uyK.AEQbTJ(context);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C49905uxP c49905uxP) {
        boolean z;
        boolean z2;
        boolean z3;
        C49778uuv c49778uuv;
        java.lang.String instId;
        C56084xwD fieldNames;
        java.util.ArrayList<java.lang.String> arrayListEZpvd;
        AccountMode accountModeFetchVPNInfo = fetchVPNInfo();
        AccountMode accountMode = AccountMode.TRADING;
        if (accountModeFetchVPNInfo != accountMode) {
            return;
        }
        C49975uyg c49975uyg = this.ejfBZ;
        java.lang.String str = "";
        if (c49975uyg == null) {
            Intrinsics.gEmmrt("");
            c49975uyg = null;
        }
        boolean zValueOf = c49975uyg.valueOf();
        BizInstrument bizInstrumentAEQbTJ = c49905uxP.AEQbTJ();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        boolean z4 = false;
        if (interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.DbNXlk("MARGIN")) {
            z = false;
        } else {
            C49975uyg c49975uyg2 = this.ejfBZ;
            if (c49975uyg2 == null) {
                Intrinsics.gEmmrt("");
                c49975uyg2 = null;
            }
            if (c49975uyg2.gEmmrt()) {
                z = true;
            }
        }
        boolean zCopydefault = C54794xVo.copydefault.copydefault(bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : null);
        C49974uyf c49974uyf = C49974uyf.EZpvd;
        C56132xwz c56132xwz = this.DbNXlk;
        if (c56132xwz == null) {
            Intrinsics.gEmmrt("");
            c56132xwz = null;
        }
        boolean zAEQbTJ = c49974uyf.AEQbTJ(accountMode, bizInstrumentAEQbTJ, c56132xwz.getNewProxyInstance().getValue());
        if (this.AkhnZx == null) {
            z2 = false;
        } else {
            java.lang.String instId2 = bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : null;
            BizInstrument bizInstrument = this.AkhnZx;
            if (Intrinsics.EZpvd((java.lang.Object) instId2, (java.lang.Object) (bizInstrument != null ? bizInstrument.getInstId() : null))) {
                java.lang.String instType = bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstType() : null;
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (!Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null))) {
                }
            }
            z2 = true;
        }
        if (z) {
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstType() : null), (java.lang.Object) "SPOT") && (zCopydefault || zAEQbTJ)) {
                if (zValueOf) {
                    boolean z5 = this.AhwBna;
                    if (!z5) {
                        EZpvd(true);
                    } else {
                        pUU.KWHzl("MarginSwitchView", "updateViewTradingAccount: borrow management btn hidden for quick order " + z5);
                    }
                } else {
                    EZpvd(false);
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null && (fieldNames = interfaceC54581xNrOLrzqt2.getFieldNames()) != null && (arrayListEZpvd = fieldNames.EZpvd()) != null) {
                    if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayListEZpvd), bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getInstId() : null)) {
                        z3 = true;
                    }
                    c49778uuv = C49778uuv.copydefault;
                    if (bizInstrumentAEQbTJ != null) {
                        str = instId;
                    }
                    if (c49778uuv.KWHzl(str)) {
                        z4 = true;
                    }
                    if (!z4) {
                    }
                    AEQbTJ(true);
                    if (!z2) {
                        isConnected();
                        copydefault(!z4);
                        java.lang.Boolean value = OLrzqt.getValue();
                        setMode$default(this, accountMode, java.lang.Boolean.valueOf(value == null ? value.booleanValue() : Companion.EZpvd(accountMode)), false, 4, null);
                        ConstraintLayout constraintLayout = this.gEmmrt.EZpvd;
                        constraintLayout.setOnClickListener(new VoiceInteractor(constraintLayout, TooltipKt.TooltipDuration, this, c49905uxP));
                        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
                        c55251xgS.setOnClickListener(new SharedElementCallback(c55251xgS, 1000L, this));
                        pUU.KWHzl("MarginSwitchView", "enableSpotBorrow: " + zValueOf + " isVisible: " + fARcdN() + " isChecked: " + OLrzqt(accountMode));
                    }
                } else {
                    z3 = false;
                    c49778uuv = C49778uuv.copydefault;
                    if (bizInstrumentAEQbTJ != null && (instId = bizInstrumentAEQbTJ.getInstId()) != null) {
                        str = instId;
                    }
                    if (c49778uuv.KWHzl(str) && z3) {
                        z4 = true;
                    }
                    if (!z4) {
                        AEQbTJ(new Function0() { // from class: o.uxQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C49908uxS.OLrzqt();
                            }
                        });
                    } else {
                        AEQbTJ((Function0<Unit>) null);
                    }
                    AEQbTJ(true);
                    if (!z2 || z4) {
                        isConnected();
                    }
                    copydefault(!z4);
                    java.lang.Boolean value2 = OLrzqt.getValue();
                    setMode$default(this, accountMode, java.lang.Boolean.valueOf(value2 == null ? value2.booleanValue() : Companion.EZpvd(accountMode)), false, 4, null);
                    ConstraintLayout constraintLayout2 = this.gEmmrt.EZpvd;
                    constraintLayout2.setOnClickListener(new VoiceInteractor(constraintLayout2, TooltipKt.TooltipDuration, this, c49905uxP));
                    C55251xgS c55251xgS2 = this.gEmmrt.AEQbTJ;
                    c55251xgS2.setOnClickListener(new SharedElementCallback(c55251xgS2, 1000L, this));
                    pUU.KWHzl("MarginSwitchView", "enableSpotBorrow: " + zValueOf + " isVisible: " + fARcdN() + " isChecked: " + OLrzqt(accountMode));
                }
            }
        } else {
            isConnected();
            AEQbTJ(false);
            pUU.KWHzl("MarginSwitchView", "isVisible: false");
        }
        pUU.KWHzl("MarginSwitchView", "updateView " + bizInstrumentAEQbTJ + " simpleBorrowMode: " + OLrzqt(accountMode));
        this.AkhnZx = bizInstrumentAEQbTJ;
        EZpvd(accountMode);
    }

    public static final Unit OLrzqt() {
        C55326xho.toast$default(C49511upt.Activity.values, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C49901uxL c49901uxL) {
        androidx.fragment.app.Fragment fragmentAYXKKw;
        AccountMode accountModeFetchVPNInfo = fetchVPNInfo();
        AccountMode accountMode = AccountMode.FUTURES;
        if (accountModeFetchVPNInfo != accountMode) {
            return;
        }
        boolean z = this.AhwBna;
        if (z) {
            pUU.KWHzl("MarginSwitchView", "updateViewFuturesAccount: hidden for quick order " + z);
            AEQbTJ(false);
            return;
        }
        BizInstrument bizInstrumentKWHzl = c49901uxL.KWHzl();
        java.lang.String strOLrzqt = c49901uxL.OLrzqt();
        C49975uyg c49975uyg = this.ejfBZ;
        C56132xwz c56132xwz = null;
        if (c49975uyg == null) {
            Intrinsics.gEmmrt("");
            c49975uyg = null;
        }
        boolean zGEmmrt = c49975uyg.gEmmrt();
        copydefault(true);
        if (zGEmmrt && (bizInstrumentKWHzl instanceof SpotInstrument)) {
            boolean z2 = C33129mqd.OLrzqt((java.lang.CharSequence) ((SpotInstrument) bizInstrumentKWHzl).getLevel()) && !(Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(StrategyType.TRIGGER.ordinal()), (java.lang.Object) strOLrzqt) && Intrinsics.EZpvd((java.lang.Object) ((SpotInstrument) bizInstrumentKWHzl).getInstType(), (java.lang.Object) "SPOT"));
            AEQbTJ(z2);
            setMode(accountMode, java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) r7.getInstType(), (java.lang.Object) "SPOT")), false);
            if (fARcdN()) {
                Companion.AEQbTJ(accountMode);
            }
            ConstraintLayout constraintLayout = this.gEmmrt.EZpvd;
            constraintLayout.setOnClickListener(new PendingIntent(constraintLayout, TooltipKt.TooltipDuration, this));
            if (z2) {
                C32866mlf.onEvent$default("PlaceOrder_Top_Margin_View", (TrackChannel[]) null, new Function1() { // from class: o.uyb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49908uxS.copydefault(this.OLrzqt, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
        } else {
            AEQbTJ(false);
            EZpvd.setValue(null);
        }
        AEQbTJ(fARcdN());
        C49975uyg c49975uyg2 = this.ejfBZ;
        if (c49975uyg2 == null) {
            Intrinsics.gEmmrt("");
            c49975uyg2 = null;
        }
        if (c49975uyg2.KWHzl(bizInstrumentKWHzl) && (fragmentAYXKKw = AYXKKw()) != null) {
            C56132xwz c56132xwz2 = this.DbNXlk;
            if (c56132xwz2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c56132xwz = c56132xwz2;
            }
            c56132xwz.fetchVPNInfo().AEQbTJ(fragmentAYXKKw, new Function1() { // from class: o.uya
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49908uxS.KWHzl(this.OLrzqt, (java.lang.String) obj);
                }
            });
        }
        this.AkhnZx = bizInstrumentKWHzl;
    }

    /* JADX INFO: renamed from: o.uxS$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("status", this.EZpvd ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        }
    }

    public static final Unit copydefault(C49908uxS c49908uxS, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", c49908uxS.OLrzqt(AccountMode.FUTURES) ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49908uxS c49908uxS, java.lang.String str) {
        if (c49908uxS.fARcdN()) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(5, c49908uxS.gEmmrt.gEmmrt);
            C56132xwz c56132xwz = c49908uxS.DbNXlk;
            if (c56132xwz == null) {
                Intrinsics.gEmmrt("");
                c56132xwz = null;
            }
            c56132xwz.copydefault().KWHzl(new Triple<>(5, map, str));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C49902uxM c49902uxM) {
        if (fetchVPNInfo() == AccountMode.MULTI || fetchVPNInfo() == AccountMode.PM) {
            final AccountMode accountModeFetchVPNInfo = fetchVPNInfo();
            final BizInstrument bizInstrumentOLrzqt = c49902uxM.OLrzqt();
            java.lang.String strCopydefault = c49902uxM.copydefault();
            C49975uyg c49975uyg = this.ejfBZ;
            java.lang.Boolean boolValueOf = null;
            if (c49975uyg == null) {
                Intrinsics.gEmmrt("");
                c49975uyg = null;
            }
            boolean z = false;
            if (c49975uyg.gEmmrt() && (bizInstrumentOLrzqt instanceof SpotInstrument)) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                C49975uyg c49975uyg2 = this.ejfBZ;
                if (c49975uyg2 == null) {
                    Intrinsics.gEmmrt("");
                    c49975uyg2 = null;
                }
                booleanRef.element = c49975uyg2.djBIcL();
                AEQbTJ(!(Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(StrategyType.TRIGGER.ordinal()), (java.lang.Object) strCopydefault) && Intrinsics.EZpvd((java.lang.Object) ((SpotInstrument) bizInstrumentOLrzqt).getInstType(), (java.lang.Object) "SPOT") && !booleanRef.element) && C55697xoo.OLrzqt.isConnected());
                java.lang.Boolean value = OLrzqt.getValue();
                boolean z2 = booleanRef.element && (value != null ? value.booleanValue() : Companion.EZpvd(accountModeFetchVPNInfo));
                boolean zFARcdN = fARcdN();
                C49974uyf c49974uyf = C49974uyf.EZpvd;
                TradeType tradeTypeAEQbTJ = C49926uxk.Companion.AEQbTJ();
                C56132xwz c56132xwz = this.DbNXlk;
                if (c56132xwz == null) {
                    Intrinsics.gEmmrt("");
                    c56132xwz = null;
                }
                boolean zKWHzl = c49974uyf.KWHzl(accountModeFetchVPNInfo, bizInstrumentOLrzqt, tradeTypeAEQbTJ, c56132xwz.getNewProxyInstance().getValue());
                if (booleanRef.element) {
                    SpotInstrument spotInstrument = (SpotInstrument) bizInstrumentOLrzqt;
                    if (Intrinsics.EZpvd((java.lang.Object) spotInstrument.getInstType(), (java.lang.Object) "SPOT") && !C54794xVo.copydefault.copydefault(spotInstrument.getInstId()) && !zKWHzl) {
                        copydefault(false);
                        AEQbTJ(new Function0() { // from class: o.uyc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C49908uxS.EZpvd(this.EZpvd, accountModeFetchVPNInfo, bizInstrumentOLrzqt);
                            }
                        });
                    } else {
                        copydefault(true);
                        boolValueOf = java.lang.Boolean.valueOf(z2);
                        z = zFARcdN;
                    }
                    setMode(accountModeFetchVPNInfo, boolValueOf, z);
                    ConstraintLayout constraintLayout = this.gEmmrt.EZpvd;
                    constraintLayout.setOnClickListener(new Dialog(constraintLayout, TooltipKt.TooltipDuration, this, booleanRef, accountModeFetchVPNInfo, bizInstrumentOLrzqt));
                }
            } else {
                AEQbTJ(false);
            }
            AEQbTJ(fARcdN());
            this.AkhnZx = bizInstrumentOLrzqt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C49908uxS c49908uxS, AccountMode accountMode, BizInstrument bizInstrument) {
        java.lang.String strAYXKKw;
        java.lang.String displayQuoteSymbol = null;
        if (!c49908uxS.fIwbmz()) {
            C49975uyg c49975uyg = c49908uxS.ejfBZ;
            if (c49975uyg == null) {
                Intrinsics.gEmmrt("");
                c49975uyg = null;
            }
            C56132xwz c56132xwz = c49908uxS.DbNXlk;
            if (c56132xwz == null) {
                Intrinsics.gEmmrt("");
                c56132xwz = null;
            }
            if (!c49975uyg.copydefault(accountMode, bizInstrument, c56132xwz.getNewProxyInstance().getValue())) {
                java.lang.String strCopydefault = C54794xVo.copydefault.copydefault(c49908uxS.AkhnZx);
                BizInstrument bizInstrument2 = c49908uxS.AkhnZx;
                if (bizInstrument2 != null && bizInstrument2.isDisplayTradeReceive() && C49926uxk.Companion.AEQbTJ() == TradeType.BUY_OPEN && C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                    int i = C49511upt.Activity.gasjUx;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    C56132xwz c56132xwz2 = c49908uxS.DbNXlk;
                    if (c56132xwz2 == null) {
                        Intrinsics.gEmmrt("");
                        c56132xwz2 = null;
                    }
                    java.lang.String value = c56132xwz2.getNewProxyInstance().getValue();
                    if (value == null) {
                        BizInstrument bizInstrument3 = c49908uxS.AkhnZx;
                        if (bizInstrument3 != null) {
                            displayQuoteSymbol = bizInstrument3.getDisplayQuoteSymbol();
                        }
                    } else {
                        displayQuoteSymbol = value;
                    }
                    pairArr[0] = C56390yDp.OLrzqt("ccy1", java.lang.String.valueOf(displayQuoteSymbol));
                    pairArr[1] = C56390yDp.OLrzqt("ccy2", strCopydefault);
                    strAYXKKw = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
                } else if (C49926uxk.Companion.AEQbTJ() == TradeType.BUY_OPEN) {
                    strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.DarRvM);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C49511upt.Activity.DCJXGO);
                }
                C55326xho.toast$default(strAYXKKw, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else {
            c49908uxS.AEQbTJ((Function0<Unit>) null);
            c49908uxS.copydefault(true);
            c49908uxS.gEmmrt.EZpvd.performClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uxS$FragmentManager */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class FragmentManager implements Function0<Unit> {
        public final /* synthetic */ AccountMode AEQbTJ;
        public final /* synthetic */ BizInstrument KWHzl;
        public final /* synthetic */ Ref.BooleanRef OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(AccountMode accountMode, Ref.BooleanRef booleanRef, BizInstrument bizInstrument) {
            this.AEQbTJ = accountMode;
            this.OLrzqt = booleanRef;
            this.KWHzl = bizInstrument;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            LifecycleOwner viewLifecycleOwner;
            LifecycleCoroutineScope lifecycleScope;
            C49908uxS.setMode$default(C49908uxS.this, this.AEQbTJ, java.lang.Boolean.TRUE, false, 4, null);
            if (C49908uxS.this.gEmmrt()) {
                androidx.fragment.app.Fragment fragmentAYXKKw = C49908uxS.this.AYXKKw();
                if (fragmentAYXKKw != null && (viewLifecycleOwner = fragmentAYXKKw.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new MarginSwitchView$updateViewMultiPmAccount$2$1$1(this.KWHzl, C49908uxS.this, null), 3, null);
                }
            } else {
                C49908uxS c49908uxS = C49908uxS.this;
                c49908uxS.copydefault(c49908uxS.AkhnZx, "SPOT");
            }
            Ref.BooleanRef booleanRef = this.OLrzqt;
            C49975uyg c49975uyg = C49908uxS.this.ejfBZ;
            if (c49975uyg == null) {
                Intrinsics.gEmmrt("");
                c49975uyg = null;
            }
            booleanRef.element = c49975uyg.djBIcL();
            if (C49908uxS.this.gEmmrt()) {
                C32866mlf.onEvent$default("KLine_order_PopUp_Click", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.uxS.FragmentManager.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        EZpvd(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        EventParamsList.put$default(eventParamsList, "is_enable_success", "enable", false, 4, null);
                    }
                }, 1, (java.lang.Object) null);
            } else {
                C32866mlf.onEvent$default("BasicTrading_Order_PopUp_Click", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.uxS.FragmentManager.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        EventParamsList.put$default(eventParamsList, "is_enable_success", "enable", false, 4, null);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.uxS$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function1<EventParamsList, Unit> {
        public static final PictureInPictureParams copydefault = new PictureInPictureParams();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "check_click", "checked", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.uxS$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function1<EventParamsList, Unit> {
        public static final TaskStackBuilder EZpvd = new TaskStackBuilder();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "check_click", "checked", false, 4, null);
        }
    }

    public final void EZpvd(AccountMode accountMode, Function0<Unit> function0) {
        int i = accountMode == null ? -1 : ActionBar.copydefault[accountMode.ordinal()];
        if (i == 3 || i == 4) {
            pUU.KWHzl("MarginSwitchView", "showOpenAutoLoanDialog: accountMode " + accountMode);
            androidx.fragment.app.FragmentManager fragmentManagerEZpvd = EZpvd();
            if (fragmentManagerEZpvd != null) {
                C49916uxa c49916uxaOLrzqt = C49916uxa.Companion.OLrzqt(this.fARcdN);
                c49916uxaOLrzqt.KWHzl(function0);
                c49916uxaOLrzqt.OLrzqt(new Function0() { // from class: o.uxW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C49908uxS.AkhnZx(this.KWHzl);
                    }
                });
                c49916uxaOLrzqt.show(fragmentManagerEZpvd);
                return;
            }
            return;
        }
        pUU.KWHzl("MarginSwitchView", "showOpenAutoLoanDialog: accountMode " + accountMode + " not multi/pm, skip showOpenAutoLoanDialog");
    }

    public static final Unit AkhnZx(C49908uxS c49908uxS) {
        if (c49908uxS.AhwBna) {
            C32866mlf.onEvent$default("KLine_order_PopUp_Click", (TrackChannel[]) null, new Function1() { // from class: o.uye
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49908uxS.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("BasicTrading_Order_PopUp_Click", (TrackChannel[]) null, new Function1() { // from class: o.uyd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49908uxS.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_enable_success", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_enable_success", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.upV.showSimpleBorrowTradeAgreementDialog$default(o.upV, android.content.Context, android.view.View$OnClickListener, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void AEQbTJ(final AccountMode accountMode) {
        AccountMode accountMode2 = AccountMode.TRADING;
        if (accountMode != accountMode2) {
            pUU.KWHzl("MarginSwitchView", "showSimpleBorrowTradeAgreementDialog: accountMode " + accountMode + " is not " + accountMode2 + ", skip showSimpleBorrowTradeAgreementDialog");
            return;
        }
        final StateListAnimator stateListAnimatorDbNXlk = DbNXlk();
        pUU.KWHzl("MarginSwitchView", "showSimpleBorrowTradeAgreementDialog: accountMode " + accountMode);
        C49487upV c49487upV = C49487upV.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C49487upV.showSimpleBorrowTradeAgreementDialog$default(c49487upV, context, new View.OnClickListener() { // from class: o.uxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49908uxS.copydefault(this.copydefault, view);
            }
        }, new Function0() { // from class: o.uxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49908uxS.OLrzqt(this.copydefault, accountMode, stateListAnimatorDbNXlk);
            }
        }, null, 8, null);
    }

    public static final void copydefault(C49908uxS c49908uxS, android.view.View view) {
        androidx.fragment.app.FragmentManager fragmentManagerEZpvd = c49908uxS.EZpvd();
        if (fragmentManagerEZpvd != null) {
            C49486upU.Companion.OLrzqt().show(fragmentManagerEZpvd);
        }
    }

    public static final Unit OLrzqt(final C49908uxS c49908uxS, final AccountMode accountMode, final StateListAnimator stateListAnimator) {
        C49975uyg c49975uyg = null;
        C32866mlf.onEvent$default("Trade_Action_Borrow_Click", (TrackChannel[]) null, new Function1() { // from class: o.uxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49908uxS.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        androidx.fragment.app.Fragment fragmentAYXKKw = c49908uxS.AYXKKw();
        if (fragmentAYXKKw != null) {
            C49975uyg c49975uyg2 = c49908uxS.ejfBZ;
            if (c49975uyg2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c49975uyg = c49975uyg2;
            }
            c49975uyg.KWHzl(fragmentAYXKKw, "1", new Function0() { // from class: o.uxV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49908uxS.KWHzl(accountMode, c49908uxS, stateListAnimator);
                }
            }, new Function1() { // from class: o.uxY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49908uxS.copydefault((java.lang.String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "accept_contract_type", "autoborrow_checkbox", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AccountMode accountMode, C49908uxS c49908uxS, StateListAnimator stateListAnimator) {
        java.lang.String instType;
        java.lang.String instId;
        pUU.KWHzl("MarginSwitchView", "showSimpleBorrowTradeAgreementDialog: accountMode " + accountMode + "; success callback invoked");
        setMode$default(c49908uxS, AccountMode.TRADING, java.lang.Boolean.TRUE, false, 4, null);
        StateListAnimator stateListAnimatorDbNXlk = c49908uxS.DbNXlk();
        BizInstrument bizInstrument = c49908uxS.AkhnZx;
        java.lang.String str = (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) ? "" : instId;
        BizInstrument bizInstrument2 = c49908uxS.AkhnZx;
        java.lang.String str2 = (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) ? "" : instType;
        C56132xwz c56132xwz = c49908uxS.DbNXlk;
        if (c56132xwz == null) {
            Intrinsics.gEmmrt("");
            c56132xwz = null;
        }
        stateListAnimatorDbNXlk.AEQbTJ(stateListAnimator, "system", "", str, str2, c56132xwz.getNewProxyInstance().getValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(AccountMode accountMode) {
        AccountMode accountMode2 = AccountMode.TRADING;
        if (accountMode != accountMode2) {
            pUU.KWHzl("MarginSwitchView", "disableTradingAccountBorrowIfNeed: accountMode " + accountMode + " is not " + accountMode2 + ", skip disableTradingAccountBorrowIfNeed");
            return;
        }
        TradeType tradeTypeAEQbTJ = C49926uxk.Companion.AEQbTJ();
        C54794xVo c54794xVo = C54794xVo.copydefault;
        BizInstrument bizInstrument = this.AkhnZx;
        boolean zCopydefault = c54794xVo.copydefault(bizInstrument != null ? bizInstrument.getInstId() : null);
        if (tradeTypeAEQbTJ == null || zCopydefault) {
            return;
        }
        C49974uyf c49974uyf = C49974uyf.EZpvd;
        BizInstrument bizInstrument2 = this.AkhnZx;
        C56132xwz c56132xwz = this.DbNXlk;
        final java.lang.String strCopydefault = "";
        if (c56132xwz == null) {
            Intrinsics.gEmmrt("");
            c56132xwz = null;
        }
        if (c49974uyf.KWHzl(accountMode, bizInstrument2, tradeTypeAEQbTJ, c56132xwz.getNewProxyInstance().getValue())) {
            return;
        }
        C49975uyg c49975uyg = this.ejfBZ;
        if (c49975uyg == null) {
            Intrinsics.gEmmrt("");
            c49975uyg = null;
        }
        if (c49975uyg.valueOf()) {
            C49975uyg c49975uyg2 = this.ejfBZ;
            if (c49975uyg2 == null) {
                Intrinsics.gEmmrt("");
                c49975uyg2 = null;
            }
            boolean zValueOf = c49975uyg2.valueOf();
            BizInstrument bizInstrument3 = this.AkhnZx;
            java.lang.String instId = bizInstrument3 != null ? bizInstrument3.getInstId() : null;
            BizInstrument bizInstrument4 = this.AkhnZx;
            java.lang.String instType = bizInstrument4 != null ? bizInstrument4.getInstType() : null;
            C56132xwz c56132xwz2 = this.DbNXlk;
            if (c56132xwz2 == null) {
                Intrinsics.gEmmrt("");
                c56132xwz2 = null;
            }
            pUU.KWHzl("MarginSwitchView", "disableTradingAccountBorrowIfNeed: accountMode " + accountMode + " simpleBorrowEnabled " + zValueOf + "bizInstrument " + instId + " " + instType + " tradeSide " + tradeTypeAEQbTJ + " quoteCcy " + ((java.lang.Object) c56132xwz2.getNewProxyInstance().getValue()) + "; disable borrow");
            copydefault(false);
            setMode$default(this, accountMode, java.lang.Boolean.FALSE, false, 4, null);
            EZpvd(false);
            int i = ActionBar.OLrzqt[tradeTypeAEQbTJ.ordinal()];
            if (i == 1) {
                java.lang.String strCopydefault2 = c54794xVo.copydefault(this.AkhnZx);
                BizInstrument bizInstrument5 = this.AkhnZx;
                if (bizInstrument5 != null && bizInstrument5.isDisplayTradeReceive() && C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault2)) {
                    int i2 = C49511upt.Activity.gasjUx;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    C56132xwz c56132xwz3 = this.DbNXlk;
                    if (c56132xwz3 == null) {
                        Intrinsics.gEmmrt("");
                        c56132xwz3 = null;
                    }
                    java.lang.String value = c56132xwz3.getNewProxyInstance().getValue();
                    if (value == null) {
                        BizInstrument bizInstrument6 = this.AkhnZx;
                        if (bizInstrument6 != null) {
                            displayQuoteSymbol = bizInstrument6.getDisplayQuoteSymbol();
                        }
                    } else {
                        displayQuoteSymbol = value;
                    }
                    pairArr[0] = C56390yDp.OLrzqt("ccy1", java.lang.String.valueOf(displayQuoteSymbol));
                    pairArr[1] = C56390yDp.OLrzqt("ccy2", strCopydefault2);
                    strCopydefault = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr));
                } else {
                    int i3 = C49511upt.Activity.dxcTrN;
                    C56132xwz c56132xwz4 = this.DbNXlk;
                    if (c56132xwz4 == null) {
                        Intrinsics.gEmmrt("");
                        c56132xwz4 = null;
                    }
                    java.lang.String value2 = c56132xwz4.getNewProxyInstance().getValue();
                    if (value2 == null) {
                        BizInstrument bizInstrument7 = this.AkhnZx;
                        if (bizInstrument7 != null) {
                            displayQuoteSymbol = bizInstrument7.getDisplayQuoteSymbol();
                        }
                    } else {
                        displayQuoteSymbol = value2;
                    }
                    strCopydefault = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", java.lang.String.valueOf(displayQuoteSymbol))));
                }
            } else if (i == 2) {
                int i4 = C49511upt.Activity.finit;
                BizInstrument bizInstrument8 = this.AkhnZx;
                strCopydefault = C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", java.lang.String.valueOf(bizInstrument8 != null ? bizInstrument8.getTradeSymbol() : null))));
            }
            pUU.KWHzl("MarginSwitchView", "disableTradingAccountBorrowIfNeed: toast message set " + strCopydefault);
            AEQbTJ(new Function0() { // from class: o.uxT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49908uxS.AEQbTJ(strCopydefault);
                }
            });
        }
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AccountMode accountMode, final InterfaceC49904uxO interfaceC49904uxO) {
        Function2<? super androidx.fragment.app.FragmentManager, ? super Function0<Unit>, Unit> function2;
        if (accountMode != null && ActionBar.copydefault[accountMode.ordinal()] == 1) {
            pUU.KWHzl("MarginSwitchView", "jumpToOpenBorrow: accountMode " + accountMode);
            androidx.fragment.app.FragmentManager fragmentManagerEZpvd = EZpvd();
            if (fragmentManagerEZpvd == null || (function2 = this.AYXKKw) == null) {
                return;
            }
            function2.invoke(fragmentManagerEZpvd, new Function0() { // from class: o.uxZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49908uxS.copydefault(accountMode, this, interfaceC49904uxO);
                }
            });
            return;
        }
        pUU.KWHzl("MarginSwitchView", "jumpToOpenBorrow: accountMode " + accountMode + " is not " + AccountMode.TRADING + "; skip");
    }

    public static final Unit copydefault(AccountMode accountMode, C49908uxS c49908uxS, InterfaceC49904uxO interfaceC49904uxO) {
        pUU.KWHzl("MarginSwitchView", "jumpToOpenBorrow: accountMode " + accountMode + "; callback invoked");
        c49908uxS.KWHzl(accountMode, interfaceC49904uxO);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.valueOf || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!this.valueOf) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 1) {
            return true;
        }
        if (KWHzl(motionEvent.getX(), motionEvent.getY())) {
            this.gEmmrt.AEQbTJ.performClick();
        } else {
            performClick();
        }
        return true;
    }

    public final boolean KWHzl(float f, float f2) {
        if (!AhwBna()) {
            return false;
        }
        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        return f >= c55251xgS.getX() && f <= c55251xgS.getX() + ((float) c55251xgS.getWidth()) && f2 >= c55251xgS.getY() && f2 <= c55251xgS.getY() + ((float) c55251xgS.getHeight());
    }

    private final void AEQbTJ(Function0<Unit> function0) {
        if (function0 != null) {
            pUU.KWHzl("MarginSwitchView", "intercept: enabled");
            this.valueOf = true;
            setOnClickListener(new TaskDescription(this, 1000L, function0));
        } else {
            pUU.KWHzl("MarginSwitchView", "intercept: disabled");
            this.valueOf = false;
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fIwbmz() {
        return this.gEmmrt.KWHzl.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z) {
        int iCopydefault;
        C55320xhi c55320xhiKWHzl;
        if (this.gEmmrt.EZpvd.isEnabled() != z) {
            pUU.KWHzl("MarginSwitchView", "setModeEnabled: " + z + "; accountMode " + fetchVPNInfo());
        }
        this.gEmmrt.EZpvd.setEnabled(z);
        this.gEmmrt.KWHzl.setEnabled(z);
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        C55312xha c55312xhaValueOf = this.gEmmrt.copydefault.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(iCopydefault);
    }

    public final boolean OLrzqt(AccountMode accountMode) {
        java.lang.Boolean value = OLrzqt.getValue();
        return value != null ? value.booleanValue() : Companion.EZpvd(accountMode);
    }

    public static /* synthetic */ void setMode$default(C49908uxS c49908uxS, AccountMode accountMode, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMode");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        c49908uxS.setMode(accountMode, bool, z);
    }

    public final void setMode(AccountMode accountMode, java.lang.Boolean bool, boolean z) {
        MutableStateFlow<java.lang.Boolean> mutableStateFlow = EZpvd;
        if (!Intrinsics.EZpvd(mutableStateFlow.getValue(), bool)) {
            pUU.KWHzl("MarginSwitchView", "setMode: " + accountMode + " " + bool + "; isSave " + z);
        }
        mutableStateFlow.setValue(bool);
        if (z) {
            Companion.AEQbTJ(accountMode);
        }
    }

    private final void EZpvd(boolean z) {
        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        if ((c55251xgS.getVisibility() == 0) != z) {
            pUU.KWHzl("MarginSwitchView", "setSimpleBorrowManagementVisible: " + z + "; accountMode " + fetchVPNInfo());
        }
        C55251xgS c55251xgS2 = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(z ? 0 : 8);
    }

    public final boolean AhwBna() {
        C55251xgS c55251xgS = this.gEmmrt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        return c55251xgS.getVisibility() == 0;
    }

    private final boolean fARcdN() {
        return AEQbTJ.getValue().booleanValue();
    }

    private final void AEQbTJ(boolean z) {
        MutableStateFlow<java.lang.Boolean> mutableStateFlow = copydefault;
        if (mutableStateFlow.getValue().booleanValue() != z) {
            pUU.KWHzl("MarginSwitchView", "setVisible: " + z + "; accountMode " + fetchVPNInfo());
        }
        mutableStateFlow.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o.uxS$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public final BizInstrument AEQbTJ;
        public final java.lang.Boolean EZpvd;
        public final boolean KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, boolean z2, java.lang.Boolean bool, BizInstrument bizInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                z2 = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                bool = stateListAnimator.EZpvd;
            }
            if ((i & 8) != 0) {
                bizInstrument = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(z, z2, bool, bizInstrument);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z, boolean z2, java.lang.Boolean bool, BizInstrument bizInstrument) {
            return new StateListAnimator(z, z2, bool, bizInstrument);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.Boolean bool = this.EZpvd;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            BizInstrument bizInstrument = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bizInstrument != null ? bizInstrument.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SnapShotState(visible=" + this.KWHzl + ", modeEnabled=" + this.copydefault + ", mode=" + this.EZpvd + ", bizInstrument=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(boolean z, boolean z2, java.lang.Boolean bool, BizInstrument bizInstrument) {
            this.KWHzl = z;
            this.copydefault = z2;
            this.EZpvd = bool;
            this.AEQbTJ = bizInstrument;
        }

        public static /* synthetic */ void createUserBehaviorReport$default(StateListAnimator stateListAnimator, StateListAnimator stateListAnimator2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 32) != 0) {
                str5 = null;
            }
            stateListAnimator.AEQbTJ(stateListAnimator2, str, str2, str3, str4, str5);
        }

        public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            if (Intrinsics.EZpvd(this, stateListAnimator)) {
                return;
            }
            C54520xLl c54520xLl = C54520xLl.KWHzl;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("enabled", java.lang.String.valueOf(this.copydefault));
            pairArr[1] = C56390yDp.OLrzqt("on/off", Intrinsics.EZpvd(this.EZpvd, java.lang.Boolean.TRUE) ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            pairArr[2] = C56390yDp.OLrzqt("visible", java.lang.String.valueOf(this.KWHzl));
            java.util.Map mapDjBIcL = C56424yEw.djBIcL(pairArr);
            if (str5 != null) {
                mapDjBIcL.put("trade_with_ccy", str5);
            }
            Unit unit = Unit.INSTANCE;
            c54520xLl.AEQbTJ(new C54520xLl.Activity(str, str2, "margin_switch", str3, str4, mapDjBIcL));
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "user")) {
                C49402unq.clickTrack$default("margin_swtch", C56424yEw.gEmmrt(C56390yDp.OLrzqt("isChecked", java.lang.String.valueOf(this.EZpvd)), C56390yDp.OLrzqt("isVisible", java.lang.String.valueOf(this.KWHzl)), C56390yDp.OLrzqt("enabled", java.lang.String.valueOf(this.copydefault)), C56390yDp.OLrzqt("source", str)), null, 4, null);
            } else {
                C49402unq.statusTrack$default("margin_swtch_state", C56424yEw.gEmmrt(C56390yDp.OLrzqt("isChecked", java.lang.String.valueOf(this.EZpvd)), C56390yDp.OLrzqt("isVisible", java.lang.String.valueOf(this.KWHzl)), C56390yDp.OLrzqt("enabled", java.lang.String.valueOf(this.copydefault)), C56390yDp.OLrzqt("source", str)), null, 4, null);
            }
        }
    }

    public final StateListAnimator DbNXlk() {
        return new StateListAnimator(fARcdN(), fIwbmz(), OLrzqt.getValue(), this.AkhnZx);
    }

    public final void copydefault(BizInstrument bizInstrument, java.lang.String str) {
        java.lang.String strOLrzqt;
        java.lang.String instId;
        xOU xouWlaJM;
        boolean z = !(getContext() instanceof InterfaceC49514upw);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null || (strOLrzqt = xouWlaJM.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        C56132xwz c56132xwz = this.DbNXlk;
        if (c56132xwz == null) {
            Intrinsics.gEmmrt("");
            c56132xwz = null;
        }
        C56126xwt<ParamBuilder> c56126xwtAkhnZx = c56132xwz.AkhnZx();
        ParamBuilder.ActionBar actionBarKWHzl = new ParamBuilder.ActionBar().KWHzl(z);
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        c56126xwtAkhnZx.KWHzl(actionBarKWHzl.copydefault(instId).KWHzl(str).OLrzqt(z ? "" : strOLrzqt).copydefault(true).EZpvd());
    }

    public final <F extends androidx.fragment.app.Fragment> F AYXKKw() {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return (F) ViewKt.findFragment(this);
        }
        pUU.KWHzl("MarginSwitchView", "findFragmentSafe: no lifecycle owner or not at least CREATED");
        return null;
    }

    public final androidx.fragment.app.FragmentManager EZpvd() {
        androidx.fragment.app.Fragment fragmentAYXKKw = AYXKKw();
        androidx.fragment.app.FragmentManager childFragmentManager = fragmentAYXKKw != null ? fragmentAYXKKw.getChildFragmentManager() : null;
        if (childFragmentManager == null) {
            pUU.KWHzl("MarginSwitchView", "findFragmentManager: no fragment manager found");
        }
        return childFragmentManager;
    }

    public final void values() {
        ConstraintLayout root = this.gEmmrt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            root.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new MarginSwitchView$onAttachedToWindow$1(lifecycleOwner, this, null), 3, null);
        } else {
            pUU.KWHzl("MarginSwitchView", "onAttachedToWindow: no lifecycle owner");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.values = null;
        this.AYXKKw = null;
        this.isConnected = null;
    }
}
