package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.InstMarginModeConfigs;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49732uuB;
import o.C49511upt;
import o.C49819uvj;
import o.C49908uxS;
import o.C49922uxg;
import o.C49924uxi;
import o.C49926uxk;
import o.C52761wXj;
import o.C54520xLl;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49924uxi extends ConstraintLayout {
    public Function1<? super android.content.Context, Unit> AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final java.util.ArrayList<Function0<Unit>> DbNXlk;
    public androidx.fragment.app.FragmentManager EZpvd;
    public final AbstractC49605urh KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final long copydefault;
    public boolean djBIcL;
    public View.OnClickListener ejfBZ;
    public View.OnClickListener fARcdN;
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> fIwbmz;
    public Observer<java.lang.String> fJNWhG;
    public final java.util.ArrayList<yHO<java.lang.String, java.lang.Boolean, BizInstrument, Unit>> fetchVPNInfo;
    public Function1<? super android.content.Context, Unit> gEmmrt;
    public boolean getFieldNames;
    public yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final java.util.ArrayList<Function1<java.lang.String, Unit>> isConnected;
    public StateListAnimator iwGUEr;
    public Function1<? super android.content.Context, Unit> uzCIH;
    public boolean valueOf;
    public InterfaceC58217yxC values;
    public AbstractC49896uxG zLjUOn;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.uxi$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49924uxi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49924uxi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC49896uxG AhwBna() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull Function1<? super android.content.Context, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.uzCIH = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.EZpvd = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLeverageRightClickListener(View.OnClickListener onClickListener) {
        this.fARcdN = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMarginModelClickListener(View.OnClickListener onClickListener) {
        this.ejfBZ = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC49605urh valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:96) call: o.uxi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49924uxi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49924uxi(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49511upt.StateListAnimator.sSMYrx, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC49605urh) viewDataBindingInflate;
        this.fIwbmz = yDY.gEmmrt(C56390yDp.OLrzqt("cross", context.getString(C55688xof.Application.gBtXYZ)), C56390yDp.OLrzqt("isolated", context.getString(C55688xof.Application.pauseLocationServices)));
        this.copydefault = 200L;
        this.djBIcL = true;
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.uxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49924uxi.AhwBna(context);
            }
        });
        this.DbNXlk = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
        this.fetchVPNInfo = new java.util.ArrayList<>();
        this.iwGUEr = new StateListAnimator();
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.uxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C49924uxi.gEmmrt(context));
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.uxy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C49924uxi.valueOf(context));
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C49924uxi.KWHzl(context));
            }
        });
        isConnected();
        this.valueOf = true;
    }

    private final C56132xwz getNewProxyInstance() {
        return (C56132xwz) this.hDKMBd.getValue();
    }

    public static final C56132xwz AhwBna(android.content.Context context) {
        try {
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity != null) {
                return (C56132xwz) new ViewModelProvider(appCompatActivity).get(C56132xwz.class);
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("MarginModelAndLeverageView", "Failed to create Activity-level SharedViewModel", e);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull BizInfoConfig bizInfoConfig, boolean z, @NotNull Function1<? super android.content.Context, Unit> function1, @NotNull Function1<? super android.content.Context, Unit> function12, @NotNull yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> yho, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        Intrinsics.checkNotNullParameter(bizInfoConfig, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.getFieldNames = z3;
        this.djBIcL = z2;
        ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStoreOwner);
        java.lang.String strCopydefault = xLX.OLrzqt(bizInfoConfig).copydefault();
        java.lang.reflect.GenericDeclaration genericDeclaration = C49994uyz.class;
        switch (strCopydefault.hashCode()) {
            case -2027980370:
                if (strCopydefault.equals("MARGIN")) {
                    genericDeclaration = C49927uxl.class;
                }
                break;
            case -1956807563:
                if (strCopydefault.equals("OPTION")) {
                    genericDeclaration = C49979uyk.class;
                }
                break;
            case 2552066:
                strCopydefault.equals("SPOT");
                break;
            case 2558355:
                if (strCopydefault.equals("SWAP")) {
                    genericDeclaration = C49944uyB.class;
                }
                break;
            case 214415088:
                if (strCopydefault.equals("FUTURES")) {
                    genericDeclaration = C49925uxj.class;
                }
                break;
        }
        AbstractC49896uxG abstractC49896uxG = (AbstractC49896uxG) viewModelProvider.get(genericDeclaration);
        abstractC49896uxG.KWHzl(bizInfoConfig);
        this.zLjUOn = abstractC49896uxG;
        this.AhwBna = z;
        if (values()) {
            this.KWHzl.KWHzl.setTextColor(getResources().getColor(C52761wXj.Activity.UlJrfe));
        } else {
            this.KWHzl.KWHzl.setTextColor(getResources().getColor(C52761wXj.Activity.fdOvFl));
        }
        if (z) {
            AEQbTJ();
        }
        this.AYXKKw = function1;
        this.gEmmrt = function12;
        this.getNewProxyInstance = yho;
        djBIcL();
    }

    public final void djBIcL() {
        C56126xwt<java.lang.String> c56126xwtIsConnected;
        BizInfoConfig bizInfoConfigEZpvd;
        xLY xlyOLrzqt;
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strCopydefault = null;
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl()), (java.lang.Object) "trade_manual")) {
            java.lang.Object context = getContext();
            LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
            if (lifecycleOwner == null) {
                return;
            }
            AbstractC49896uxG abstractC49896uxG = this.zLjUOn;
            if (abstractC49896uxG != null && (bizInfoConfigEZpvd = abstractC49896uxG.EZpvd()) != null && (xlyOLrzqt = xLX.OLrzqt(bizInfoConfigEZpvd)) != null) {
                strCopydefault = xlyOLrzqt.copydefault();
            }
            if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "SWAP") && this.fJNWhG == null) {
                this.fJNWhG = new Observer() { // from class: o.uxn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(java.lang.Object obj) {
                        C49924uxi.copydefault(this.KWHzl, (java.lang.String) obj);
                    }
                };
                C56132xwz newProxyInstance = getNewProxyInstance();
                if (newProxyInstance == null || (c56126xwtIsConnected = newProxyInstance.isConnected()) == null) {
                    return;
                }
                Observer<java.lang.String> observer = this.fJNWhG;
                Intrinsics.copydefault(observer);
                c56126xwtIsConnected.EZpvd(lifecycleOwner, observer);
            }
        }
    }

    public static final void copydefault(C49924uxi c49924uxi, java.lang.String str) {
        C56126xwt<kotlin.Pair<java.lang.String, android.view.View>> c56126xwtAEQbTJ;
        C56126xwt<kotlin.Pair<java.lang.String, android.view.View>> c56126xwtAEQbTJ2;
        C56132xwz newProxyInstance = c49924uxi.getNewProxyInstance();
        if (newProxyInstance != null && (c56126xwtAEQbTJ2 = newProxyInstance.AEQbTJ()) != null) {
            c56126xwtAEQbTJ2.KWHzl(C56390yDp.OLrzqt("mgnModeView", c49924uxi.KWHzl.KWHzl));
        }
        C56132xwz newProxyInstance2 = c49924uxi.getNewProxyInstance();
        if (newProxyInstance2 == null || (c56126xwtAEQbTJ = newProxyInstance2.AEQbTJ()) == null) {
            return;
        }
        c56126xwtAEQbTJ.KWHzl(C56390yDp.OLrzqt("leverageView", c49924uxi.KWHzl.AEQbTJ));
    }

    public final void AEQbTJ() {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.KWHzl.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
        }
    }

    public final BizInstrument gEmmrt() {
        BizInfoConfig bizInfoConfigEZpvd;
        xLY xlyOLrzqt;
        AbstractC49896uxG abstractC49896uxG = this.zLjUOn;
        if (abstractC49896uxG == null || (bizInfoConfigEZpvd = abstractC49896uxG.EZpvd()) == null || (xlyOLrzqt = xLX.OLrzqt(bizInfoConfigEZpvd)) == null) {
            return null;
        }
        return xlyOLrzqt.EZpvd();
    }

    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.DbNXlk.add(function0);
    }

    public final void KWHzl() {
        this.DbNXlk.clear();
    }

    public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.isConnected.add(function1);
    }

    public final void EZpvd() {
        this.isConnected.clear();
    }

    public final void EZpvd(@NotNull yHO<? super java.lang.String, ? super java.lang.Boolean, ? super BizInstrument, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.fetchVPNInfo.add(yho);
    }

    public final void copydefault() {
        this.fetchVPNInfo.clear();
    }

    /* JADX INFO: renamed from: o.uxi$StateListAnimator */
    public static final class StateListAnimator extends Observable.OnPropertyChangedCallback {
        public StateListAnimator() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C49924uxi.updateMarginCoin$default(C49924uxi.this, null, 1, null);
            C49924uxi.updateLeverage$default(C49924uxi.this, null, 1, null);
        }
    }

    private final int getFieldNames() {
        return ((java.lang.Number) this.AkhnZx.getValue()).intValue();
    }

    public static final int gEmmrt(android.content.Context context) {
        return ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int hDKMBd() {
        return ((java.lang.Number) this.AuCTel.getValue()).intValue();
    }

    public static final int valueOf(android.content.Context context) {
        return C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    private final int fIwbmz() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int KWHzl(android.content.Context context) {
        return C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: o.uxi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void isConnected() {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(this.KWHzl.KWHzl);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.uxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49924uxi.AEQbTJ(this.OLrzqt, obj);
            }
        });
        this.KWHzl.AEQbTJ.setText("--");
        C8003auW.copydefault(this.KWHzl.AEQbTJ).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.uxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49924uxi.KWHzl(this.AEQbTJ, obj);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.unq.reportTrack$default(android.view.View, java.lang.String, java.util.Map, java.lang.Class[], int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.xVt.getTitleByIdAndType$default(o.xVt, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.Object):java.lang.String */
    public static final void AEQbTJ(final C49924uxi c49924uxi, java.lang.Object obj) {
        java.util.List<TradeMenuItemBean> listAhwBna;
        AbstractC49896uxG abstractC49896uxG;
        BizInfoConfig bizInfoConfigEZpvd;
        xLY xlyOLrzqt;
        java.lang.String instType;
        java.lang.String instId;
        C54520xLl c54520xLl = C54520xLl.KWHzl;
        BizInstrument bizInstrumentGEmmrt = c49924uxi.gEmmrt();
        java.lang.String str = (bizInstrumentGEmmrt == null || (instId = bizInstrumentGEmmrt.getInstId()) == null) ? "" : instId;
        BizInstrument bizInstrumentGEmmrt2 = c49924uxi.gEmmrt();
        java.lang.String str2 = (bizInstrumentGEmmrt2 == null || (instType = bizInstrumentGEmmrt2.getInstType()) == null) ? "" : instType;
        java.lang.String strFJNWhG = c49924uxi.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        c54520xLl.AEQbTJ(new C54520xLl.Activity("user", "click", "switch_margin_mode", str, str2, C56423yEv.EZpvd(C56390yDp.OLrzqt("current_margin_mode", strFJNWhG))));
        AppCompatTextView appCompatTextView = c49924uxi.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C49402unq.reportTrack$default(appCompatTextView, "switch_mgn_mode_entrance", null, new java.lang.Class[0], 2, null);
        View.OnClickListener onClickListener = c49924uxi.ejfBZ;
        if (onClickListener != null) {
            onClickListener.onClick(obj instanceof android.view.View ? (android.view.View) obj : null);
        }
        BizInstrument bizInstrumentGEmmrt3 = c49924uxi.gEmmrt();
        if (bizInstrumentGEmmrt3 != null && bizInstrumentGEmmrt3.isPreMarketPair()) {
            BizInstrument bizInstrumentGEmmrt4 = c49924uxi.gEmmrt();
            if (Intrinsics.EZpvd((java.lang.Object) "FUTURES", (java.lang.Object) (bizInstrumentGEmmrt4 != null ? bizInstrumentGEmmrt4.getInstType() : null))) {
                C33134mqi.copydefault(C49511upt.Activity.getPostValueLengthLimit);
                return;
            }
        }
        if (c49924uxi.djBIcL) {
            BizInstrument bizInstrumentGEmmrt5 = c49924uxi.gEmmrt();
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentGEmmrt5 != null ? bizInstrumentGEmmrt5.getInstType() : null), (java.lang.Object) "MARGIN") && C54794xVo.copydefault.EZpvd()) {
                return;
            }
        }
        if (c49924uxi.values() && !c49924uxi.djBIcL) {
            AbstractC49896uxG abstractC49896uxG2 = c49924uxi.zLjUOn;
            BizInstrument bizInstrumentEZpvd = (abstractC49896uxG2 == null || (bizInfoConfigEZpvd = abstractC49896uxG2.EZpvd()) == null || (xlyOLrzqt = xLX.OLrzqt(bizInfoConfigEZpvd)) == null) ? null : xlyOLrzqt.EZpvd();
            java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstId() : null, bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstType() : null, false, false, 12, null);
            android.content.Context context = c49924uxi.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33134mqi.AEQbTJ(C33069mpW.KWHzl(context, C49511upt.Activity.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, titleByIdAndType$default))));
            return;
        }
        AbstractC49896uxG abstractC49896uxG3 = c49924uxi.zLjUOn;
        if (abstractC49896uxG3 == null || (listAhwBna = abstractC49896uxG3.OLrzqt(c49924uxi.fIwbmz, c49924uxi.fJNWhG(), c49924uxi.gEmmrt())) == null) {
            listAhwBna = yDY.AhwBna();
        }
        c49924uxi.copydefault("margin_mode");
        if (listAhwBna.size() >= 2) {
            AbstractC49896uxG abstractC49896uxG4 = c49924uxi.zLjUOn;
            java.lang.String strOLrzqt = (abstractC49896uxG4 == null || !abstractC49896uxG4.AEQbTJ(c49924uxi.gEmmrt()) || (abstractC49896uxG = c49924uxi.zLjUOn) == null) ? null : abstractC49896uxG.OLrzqt();
            C49922uxg.Activity activity = C49922uxg.Companion;
            BizInstrument bizInstrumentGEmmrt6 = c49924uxi.gEmmrt();
            java.lang.String instId2 = bizInstrumentGEmmrt6 != null ? bizInstrumentGEmmrt6.getInstId() : null;
            BizInstrument bizInstrumentGEmmrt7 = c49924uxi.gEmmrt();
            C49922uxg c49922uxgAEQbTJ = activity.AEQbTJ(instId2, bizInstrumentGEmmrt7 != null ? bizInstrumentGEmmrt7.getInstType() : null, strOLrzqt, new yHO() { // from class: o.uxB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return C49924uxi.copydefault(this.OLrzqt, (android.app.Activity) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
                }
            });
            c49922uxgAEQbTJ.EZpvd(new Function1() { // from class: o.uxD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49924uxi.AEQbTJ(this.KWHzl, (TradePositionManager.MarginModeType) obj2);
                }
            });
            c49922uxgAEQbTJ.KWHzl(new Function1() { // from class: o.uxF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49924uxi.KWHzl(this.AEQbTJ, (java.lang.String) obj2);
                }
            });
            androidx.fragment.app.FragmentManager fragmentManager = c49924uxi.EZpvd;
            if (fragmentManager == null) {
                return;
            }
            c49922uxgAEQbTJ.show(fragmentManager, C49922uxg.class.getSimpleName());
        }
    }

    public static final Unit copydefault(C49924uxi c49924uxi, android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> yho = c49924uxi.getNewProxyInstance;
        if (yho != null) {
            yho.invoke(activity, str, str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C49924uxi c49924uxi, final TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        AbstractC49896uxG abstractC49896uxG = c49924uxi.zLjUOn;
        if (abstractC49896uxG != null && abstractC49896uxG.EZpvd(marginModeType)) {
            c49924uxi.KWHzl(new Function0() { // from class: o.uxm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49924uxi.EZpvd(this.OLrzqt, marginModeType);
                }
            });
            return Unit.INSTANCE;
        }
        AbstractC49896uxG abstractC49896uxG2 = c49924uxi.zLjUOn;
        if (abstractC49896uxG2 != null) {
            abstractC49896uxG2.KWHzl(c49924uxi.gEmmrt(), marginModeType);
        }
        c49924uxi.setMgnMode(C49853uwQ.EZpvd(marginModeType), C49853uwQ.AEQbTJ(marginModeType));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C49924uxi c49924uxi, TradePositionManager.MarginModeType marginModeType) {
        c49924uxi.setMgnMode(C49853uwQ.EZpvd(marginModeType), C49853uwQ.AEQbTJ(marginModeType));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49924uxi c49924uxi, java.lang.String str) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC49896uxG abstractC49896uxG = c49924uxi.zLjUOn;
        if (abstractC49896uxG != null) {
            abstractC49896uxG.EZpvd(str);
        }
        BizInstrument bizInstrumentGEmmrt = c49924uxi.gEmmrt();
        SPUtils.put("cross_margin_coin-" + (bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstId() : null), str);
        updateMarginCoin$default(c49924uxi, null, 1, null);
        updateLeverage$default(c49924uxi, null, 1, null);
        java.util.Iterator<T> it = c49924uxi.isConnected.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            AbstractC49896uxG abstractC49896uxG2 = c49924uxi.zLjUOn;
            if (abstractC49896uxG2 == null || (strCopydefault = abstractC49896uxG2.copydefault()) == null) {
                strCopydefault = "";
            }
            function1.invoke(strCopydefault);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C49924uxi c49924uxi, java.lang.Object obj) {
        android.widget.TextView textView = c49924uxi.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C49402unq.reportTrack$default(textView, "switch_lever", null, new java.lang.Class[0], 2, null);
        c49924uxi.copydefault("adjust_leverage");
        View.OnClickListener onClickListener = c49924uxi.fARcdN;
        if (onClickListener != null) {
            onClickListener.onClick(obj instanceof android.view.View ? (android.view.View) obj : null);
        }
        c49924uxi.AYXKKw();
    }

    public final void KWHzl(Function0<Unit> function0) {
        C49916uxa c49916uxaOLrzqt = C49916uxa.Companion.OLrzqt(this.getFieldNames);
        c49916uxaOLrzqt.KWHzl(function0);
        androidx.fragment.app.FragmentManager fragmentManager = this.EZpvd;
        if (fragmentManager == null) {
            return;
        }
        c49916uxaOLrzqt.show(fragmentManager);
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("PlaceOrder_Top_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.uxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49924uxi.copydefault(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C49924uxi c49924uxi, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        BizInstrument bizInstrumentGEmmrt = c49924uxi.gEmmrt();
        EventParamsList.put$default(eventParamsList, "biz_type", (bizInstrumentGEmmrt == null || (instType = bizInstrumentGEmmrt.getInstType()) == null) ? "" : instType, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uuB.StateListAnimator.newInstance$default(o.uuB$StateListAnimator, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.trade.manager.common.position.TradePositionManager$PositionItem, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, kotlin.jvm.functions.Function2, java.lang.Boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):o.uuB */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw() {
        BizInstrument bizInstrumentGEmmrt;
        java.lang.String quoteSymbol;
        C56111xwe<java.lang.String> newProxyInstance;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        java.lang.String str;
        java.lang.String str2;
        androidx.fragment.app.FragmentManager fragmentManager;
        java.lang.String strAYXKKw;
        java.lang.String strAEQbTJ;
        java.lang.String strAEQbTJ2;
        java.lang.String strKWHzl;
        if (!C55697xoo.OLrzqt.isConnected()) {
            Function1<? super android.content.Context, Unit> function1 = this.uzCIH;
            if (function1 != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                function1.invoke(context);
                return;
            }
            return;
        }
        AbstractC49896uxG abstractC49896uxG = this.zLjUOn;
        java.lang.String str3 = null;
        java.lang.String strAEQbTJ3 = abstractC49896uxG != null ? abstractC49896uxG.AEQbTJ() : null;
        if (strAEQbTJ3 == null || strAEQbTJ3.length() == 0) {
            return;
        }
        AbstractC49896uxG abstractC49896uxG2 = this.zLjUOn;
        if (Intrinsics.EZpvd((java.lang.Object) (abstractC49896uxG2 != null ? abstractC49896uxG2.KWHzl() : null), (java.lang.Object) "--") || (bizInstrumentGEmmrt = gEmmrt()) == null) {
            return;
        }
        if (yDY.gEmmrt("SWAP", "FUTURES").contains(bizInstrumentGEmmrt.getInstType())) {
            C54794xVo c54794xVo = C54794xVo.copydefault;
            if (c54794xVo.AEQbTJ() && c54794xVo.AhwBna(gEmmrt())) {
                C49819uvj.ActionBar actionBar = C49819uvj.Companion;
                java.lang.String instId = bizInstrumentGEmmrt.getInstId();
                java.lang.String instType = bizInstrumentGEmmrt.getInstType();
                AbstractC49896uxG abstractC49896uxG3 = this.zLjUOn;
                java.lang.String str4 = (abstractC49896uxG3 == null || (strKWHzl = abstractC49896uxG3.KWHzl()) == null) ? "" : strKWHzl;
                AbstractC49896uxG abstractC49896uxG4 = this.zLjUOn;
                C49819uvj c49819uvjKWHzl = actionBar.KWHzl(instId, instType, str4, (abstractC49896uxG4 == null || (strAEQbTJ2 = abstractC49896uxG4.AEQbTJ()) == null) ? "" : strAEQbTJ2, new Function1() { // from class: o.uxs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49924uxi.EZpvd(this.copydefault, (android.content.Context) obj);
                    }
                }, new Function1() { // from class: o.uxu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49924uxi.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                androidx.fragment.app.FragmentManager fragmentManager2 = this.EZpvd;
                if (fragmentManager2 == null) {
                    return;
                }
                c49819uvjKWHzl.show(fragmentManager2);
                return;
            }
        }
        AbstractC49896uxG abstractC49896uxG5 = this.zLjUOn;
        java.lang.String strOLrzqt = abstractC49896uxG5 != null ? abstractC49896uxG5.OLrzqt() : null;
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "margin_base")) {
            quoteSymbol = bizInstrumentGEmmrt.getTradeSymbol();
        } else {
            quoteSymbol = Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "margin_quote") ? bizInstrumentGEmmrt.getQuoteSymbol() : null;
        }
        if ((quoteSymbol == null || quoteSymbol.length() == 0) && values()) {
            if (C49926uxk.Companion.AEQbTJ() == TradeType.BUY_OPEN) {
                C56132xwz newProxyInstance2 = getNewProxyInstance();
                if (newProxyInstance2 == null || (newProxyInstance = newProxyInstance2.getNewProxyInstance()) == null || (quoteSymbol = newProxyInstance.getValue()) == null) {
                    quoteSymbol = bizInstrumentGEmmrt.getQuoteSymbol();
                }
            } else {
                quoteSymbol = bizInstrumentGEmmrt.getTradeSymbol();
            }
        }
        java.lang.String str5 = quoteSymbol;
        AbstractC49732uuB.StateListAnimator stateListAnimator = AbstractC49732uuB.Companion;
        java.lang.String instId2 = bizInstrumentGEmmrt.getInstId();
        java.lang.String instType2 = bizInstrumentGEmmrt.getInstType();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrumentGEmmrt, 1, null)) == null) {
            return;
        }
        TradeType tradeTypeAEQbTJ = C49926uxk.Companion.AEQbTJ();
        int i = tradeTypeAEQbTJ == null ? -1 : TaskDescription.copydefault[tradeTypeAEQbTJ.ordinal()];
        if (i == 1) {
            str = "buy";
        } else {
            if (i != 2) {
                str2 = "";
                if (yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentGEmmrt.getInstType())) {
                    str3 = C54794xVo.copydefault.AEQbTJ() ? "short" : "net";
                }
                java.lang.String str6 = str3;
                AbstractC49896uxG abstractC49896uxG6 = this.zLjUOn;
                java.lang.String str7 = (abstractC49896uxG6 != null || (strAEQbTJ = abstractC49896uxG6.AEQbTJ()) == null) ? "" : strAEQbTJ;
                xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
                AbstractC49732uuB abstractC49732uuBAEQbTJ = stateListAnimator.AEQbTJ(instId2, instType2, currentMarginMode$default, str2, (24192 & 16) != 0 ? null : str6, (24192 & 32) != 0 ? null : str5, str7, (24192 & 128) != 0 ? null : null, (value != null || (strAYXKKw = value.AYXKKw()) == null) ? "" : strAYXKKw, (24192 & 512) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 2048) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 4096) != 0 ? null : null, (24192 & 8192) != 0 ? null : new Function2() { // from class: o.uxt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C49924uxi.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                    }
                }, (24192 & 16384) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 32768) != 0 ? false : values(), new Function1() { // from class: o.uxr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49924uxi.OLrzqt(this.copydefault, (android.content.Context) obj);
                    }
                }, new Function1() { // from class: o.uxv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49924uxi.AhwBna(this.OLrzqt, (android.content.Context) obj);
                    }
                });
                fragmentManager = this.EZpvd;
                if (fragmentManager != null) {
                    return;
                }
                abstractC49732uuBAEQbTJ.show(fragmentManager, "leverageRight");
                return;
            }
            str = "sell";
        }
        str2 = str;
        if (yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentGEmmrt.getInstType())) {
        }
        java.lang.String str62 = str3;
        AbstractC49896uxG abstractC49896uxG62 = this.zLjUOn;
        if (abstractC49896uxG62 != null) {
        }
        xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
        AbstractC49732uuB abstractC49732uuBAEQbTJ2 = stateListAnimator.AEQbTJ(instId2, instType2, currentMarginMode$default, str2, (24192 & 16) != 0 ? null : str62, (24192 & 32) != 0 ? null : str5, str7, (24192 & 128) != 0 ? null : null, (value2 != null || (strAYXKKw = value2.AYXKKw()) == null) ? "" : strAYXKKw, (24192 & 512) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 2048) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 4096) != 0 ? null : null, (24192 & 8192) != 0 ? null : new Function2() { // from class: o.uxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C49924uxi.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        }, (24192 & 16384) != 0 ? java.lang.Boolean.FALSE : null, (24192 & 32768) != 0 ? false : values(), new Function1() { // from class: o.uxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49924uxi.OLrzqt(this.copydefault, (android.content.Context) obj);
            }
        }, new Function1() { // from class: o.uxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49924uxi.AhwBna(this.OLrzqt, (android.content.Context) obj);
            }
        });
        fragmentManager = this.EZpvd;
        if (fragmentManager != null) {
        }
    }

    public static final Unit EZpvd(C49924uxi c49924uxi, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = c49924uxi.gEmmrt;
        if (function1 != null) {
            function1.invoke(context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49924uxi c49924uxi, boolean z) {
        updateLeverage$default(c49924uxi, null, 1, null);
        java.util.Iterator<T> it = c49924uxi.DbNXlk.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C49924uxi c49924uxi, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        updateLeverage$default(c49924uxi, null, 1, null);
        java.util.Iterator<T> it = c49924uxi.DbNXlk.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49924uxi c49924uxi, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = c49924uxi.AYXKKw;
        if (function1 != null) {
            function1.invoke(context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C49924uxi c49924uxi, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = c49924uxi.gEmmrt;
        if (function1 != null) {
            function1.invoke(context);
        }
        return Unit.INSTANCE;
    }

    public final void setMgnMode(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        MarginModeManager marginModeManagerIsConnected;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null) {
            return;
        }
        int value = MarginModeManager.MarginModeChangedSourceType.USER_SELECT_MARGIN_TYPE.getValue();
        java.lang.String[] strArr = new java.lang.String[1];
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        java.lang.String strWlaJM = null;
        strArr[0] = bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstFamily() : null;
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(strArr);
        java.lang.String[] strArr2 = new java.lang.String[1];
        BizInstrument bizInstrumentGEmmrt2 = gEmmrt();
        strArr2[0] = bizInstrumentGEmmrt2 != null ? bizInstrumentGEmmrt2.getInstType() : null;
        java.util.ArrayList arrayListCopydefault2 = yDY.copydefault(strArr2);
        ActionBar actionBar = new ActionBar(str, str2);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
            strWlaJM = newProxyInstance.wlaJM();
        }
        marginModeManagerIsConnected.EZpvd(java.lang.String.valueOf(value), str, arrayListCopydefault, arrayListCopydefault2, false, actionBar, java.lang.String.valueOf(strWlaJM), gEmmrt());
    }

    /* JADX INFO: renamed from: o.uxi$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<ResponseData<java.util.ArrayList<InstMarginModeConfigs>>> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String OLrzqt;

        public ActionBar(java.lang.String str, java.lang.String str2) {
            this.AEQbTJ = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, ResponseData<java.util.ArrayList<InstMarginModeConfigs>> responseData, java.lang.Exception exc) {
            MarginModeManager marginModeManagerIsConnected;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            MarginModeManager marginModeManagerIsConnected2;
            if (z) {
                BizInstrument bizInstrumentGEmmrt = C49924uxi.this.gEmmrt();
                if (bizInstrumentGEmmrt != null) {
                    C49924uxi c49924uxi = C49924uxi.this;
                    java.lang.String str = this.AEQbTJ;
                    if (!c49924uxi.AhwBna && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt.isConnected()) != null) {
                        marginModeManagerIsConnected2.OLrzqt(bizInstrumentGEmmrt, str);
                    }
                }
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) != null) {
                    marginModeManagerIsConnected.EZpvd(this.AEQbTJ, C49924uxi.this.gEmmrt());
                }
                C49924uxi.this.valueOf().KWHzl.setText(this.OLrzqt);
                java.util.ArrayList arrayList = C49924uxi.this.fetchVPNInfo;
                java.lang.String str2 = this.AEQbTJ;
                C49924uxi c49924uxi2 = C49924uxi.this;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((yHO) it.next()).invoke(str2, java.lang.Boolean.TRUE, c49924uxi2.gEmmrt());
                }
            }
        }
    }

    public static /* synthetic */ void updateUi$default(C49924uxi c49924uxi, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = null;
        }
        c49924uxi.EZpvd(tradeType);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(TradeType tradeType) {
        java.lang.String instType;
        java.lang.String instId;
        if (gEmmrt() == null) {
            C54515xLg c54515xLg = C54515xLg.OLrzqt;
            BizInstrument bizInstrumentGEmmrt = gEmmrt();
            java.lang.String str = "";
            if (bizInstrumentGEmmrt == null || (instType = bizInstrumentGEmmrt.getInstType()) == null) {
                instType = "";
            }
            BizInstrument bizInstrumentGEmmrt2 = gEmmrt();
            if (bizInstrumentGEmmrt2 != null && (instId = bizInstrumentGEmmrt2.getInstId()) != null) {
                str = instId;
            }
            c54515xLg.AEQbTJ("MarginModelAndLeverageView", instType, str);
        } else {
            BizInstrument bizInstrumentGEmmrt3 = gEmmrt();
            java.lang.String instType2 = bizInstrumentGEmmrt3 != null ? bizInstrumentGEmmrt3.getInstType() : null;
            if (instType2 == null || instType2.length() == 0) {
            }
        }
        fARcdN();
        OLrzqt(tradeType);
        AEQbTJ(tradeType);
    }

    public final void fARcdN() {
        java.lang.Object next;
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        java.lang.String instType = bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SPOT")) {
            this.KWHzl.KWHzl.setVisibility(8);
            pUU.KWHzl("MarginModelAndLeverageView", "marginSwitch = " + C49908uxS.Companion.KWHzl());
        } else if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "OPTION")) {
            xOV xovCopydefault = C54794xVo.copydefault.copydefault();
            if (xovCopydefault != null && xovCopydefault.AYXKKw()) {
                this.KWHzl.KWHzl.setVisibility(0);
            } else {
                this.KWHzl.KWHzl.setVisibility(8);
            }
        } else {
            this.KWHzl.KWHzl.setVisibility(0);
        }
        if (this.KWHzl.KWHzl.getVisibility() == 0) {
            AppCompatTextView appCompatTextView = this.KWHzl.KWHzl;
            java.util.Iterator<T> it = this.fIwbmz.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd(((kotlin.Pair) next).getFirst(), (java.lang.Object) fJNWhG())) {
                        break;
                    }
                }
            }
            kotlin.Pair pair = (kotlin.Pair) next;
            appCompatTextView.setText(pair != null ? (java.lang.String) pair.getSecond() : null);
        }
        OLrzqt();
        pUU.KWHzl("MarginModelAndLeverageView", fJNWhG() + " " + ((java.lang.Object) this.KWHzl.KWHzl.getText()));
    }

    private final java.lang.String fJNWhG() {
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null) {
            return null;
        }
        return marginModeManagerIsConnected.AEQbTJ(true, gEmmrt());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVo.isSpotBuySideSupportLoan$default(o.xVo, com.okinc.unify_trade.biz.BizInstrument, java.lang.String, int, java.lang.Object):boolean */
    public final boolean values() {
        C56111xwe<java.lang.String> newProxyInstance;
        C56111xwe<java.lang.String> newProxyInstance2;
        C49926uxk.Application application = C49926uxk.Companion;
        TradeType tradeTypeAEQbTJ = application.AEQbTJ();
        C54794xVo c54794xVo = C54794xVo.copydefault;
        boolean zKWHzl = c54794xVo.KWHzl(gEmmrt());
        C49908uxS.Application application2 = C49908uxS.Companion;
        boolean zKWHzl2 = application2.KWHzl();
        java.lang.String value = null;
        boolean zIsSpotBuySideSupportLoan$default = C54794xVo.isSpotBuySideSupportLoan$default(c54794xVo, gEmmrt(), null, 2, null);
        xOV xovCopydefault = c54794xVo.copydefault();
        boolean z = xovCopydefault != null && xovCopydefault.copydefault();
        C56132xwz newProxyInstance3 = getNewProxyInstance();
        java.lang.String value2 = (newProxyInstance3 == null || (newProxyInstance2 = newProxyInstance3.getNewProxyInstance()) == null) ? null : newProxyInstance2.getValue();
        pUU.KWHzl("MarginModelAndLeverageView", "type=" + tradeTypeAEQbTJ + " mgnMode=" + zKWHzl + " marginOpen=" + zKWHzl2 + " sideLoan=" + zIsSpotBuySideSupportLoan$default + " spotCanShowCrossType=" + z + " tradeQuoteCcy=" + value2 + " autoBorrowEnabled=" + c54794xVo.OLrzqt());
        C49974uyf c49974uyf = C49974uyf.EZpvd;
        AccountMode accountModeCopydefault = c49974uyf.copydefault();
        if (accountModeCopydefault != AccountMode.MULTI && accountModeCopydefault != AccountMode.PM) {
            return false;
        }
        TradeType tradeTypeAEQbTJ2 = application.AEQbTJ();
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        C56132xwz newProxyInstance4 = getNewProxyInstance();
        if (newProxyInstance4 != null && (newProxyInstance = newProxyInstance4.getNewProxyInstance()) != null) {
            value = newProxyInstance.getValue();
        }
        return c49974uyf.KWHzl(accountModeCopydefault, bizInstrumentGEmmrt, tradeTypeAEQbTJ2, value) && application2.KWHzl();
    }

    public final void OLrzqt() {
        if (values()) {
            TextViewCompat.setCompoundDrawableTintList(this.KWHzl.KWHzl, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe)));
            this.KWHzl.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            return;
        }
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        if (bizInstrumentGEmmrt != null && bizInstrumentGEmmrt.isPreMarketPair()) {
            BizInstrument bizInstrumentGEmmrt2 = gEmmrt();
            if (Intrinsics.EZpvd((java.lang.Object) "FUTURES", (java.lang.Object) (bizInstrumentGEmmrt2 != null ? bizInstrumentGEmmrt2.getInstType() : null))) {
                this.KWHzl.KWHzl.setTextColor(getResources().getColor(C52761wXj.Activity.UlJrfe));
                return;
            }
        }
        this.KWHzl.KWHzl.setTextColor(getResources().getColor(C52761wXj.Activity.fdOvFl));
    }

    public static /* synthetic */ void updateMarginCoin$default(C49924uxi c49924uxi, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = null;
        }
        c49924uxi.OLrzqt(tradeType);
    }

    public final void OLrzqt(TradeType tradeType) {
        java.lang.Object next;
        AbstractC49896uxG abstractC49896uxG;
        xOW newProxyInstance;
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstType() : null), (java.lang.Object) "MARGIN")) {
            java.util.Iterator<T> it = this.fIwbmz.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd(((kotlin.Pair) next).getFirst(), (java.lang.Object) fJNWhG())) {
                        break;
                    }
                }
            }
            kotlin.Pair pair = (kotlin.Pair) next;
            java.lang.String str = pair != null ? (java.lang.String) pair.getSecond() : null;
            C54794xVo c54794xVo = C54794xVo.copydefault;
            if (c54794xVo.KWHzl(gEmmrt())) {
                BizInstrument bizInstrumentGEmmrt2 = gEmmrt();
                java.lang.String string = SPUtils.getString("cross_margin_coin-" + (bizInstrumentGEmmrt2 != null ? bizInstrumentGEmmrt2.getInstId() : null), "margin_quote");
                AbstractC49896uxG abstractC49896uxG2 = this.zLjUOn;
                if (abstractC49896uxG2 != null) {
                    abstractC49896uxG2.EZpvd(string);
                }
                if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "margin_base")) {
                    AppCompatTextView appCompatTextView = this.KWHzl.KWHzl;
                    BizInstrument bizInstrumentGEmmrt3 = gEmmrt();
                    appCompatTextView.setText(str + "-" + (bizInstrumentGEmmrt3 != null ? bizInstrumentGEmmrt3.getTradeSymbol() : null));
                } else {
                    AppCompatTextView appCompatTextView2 = this.KWHzl.KWHzl;
                    BizInstrument bizInstrumentGEmmrt4 = gEmmrt();
                    appCompatTextView2.setText(str + "-" + (bizInstrumentGEmmrt4 != null ? bizInstrumentGEmmrt4.getDisplayQuoteSymbol() : null));
                }
                BizInstrument bizInstrumentGEmmrt5 = gEmmrt();
                pUU.KWHzl("MarginModelAndLeverageView", "instId= " + (bizInstrumentGEmmrt5 != null ? bizInstrumentGEmmrt5.getInstId() : null) + " marginModelText= " + str + "  cachedCoin= " + string);
            } else if (c54794xVo.AhwBna(gEmmrt())) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.DbNXlk()) {
                    if (tradeType == null) {
                        tradeType = C49926uxk.Companion.AEQbTJ();
                    }
                    int i = tradeType == null ? -1 : TaskDescription.copydefault[tradeType.ordinal()];
                    if (i == 1) {
                        AbstractC49896uxG abstractC49896uxG3 = this.zLjUOn;
                        if (abstractC49896uxG3 != null) {
                            abstractC49896uxG3.EZpvd("margin_base");
                        }
                    } else if (i == 2 && (abstractC49896uxG = this.zLjUOn) != null) {
                        abstractC49896uxG.EZpvd("margin_quote");
                    }
                } else {
                    BizInstrument bizInstrumentGEmmrt6 = gEmmrt();
                    java.lang.String string2 = SPUtils.getString("cross_margin_coin-" + (bizInstrumentGEmmrt6 != null ? bizInstrumentGEmmrt6.getInstId() : null), "margin_quote");
                    AbstractC49896uxG abstractC49896uxG4 = this.zLjUOn;
                    if (abstractC49896uxG4 != null) {
                        abstractC49896uxG4.EZpvd(string2);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) "margin_base")) {
                        AppCompatTextView appCompatTextView3 = this.KWHzl.KWHzl;
                        BizInstrument bizInstrumentGEmmrt7 = gEmmrt();
                        appCompatTextView3.setText(str + "-" + (bizInstrumentGEmmrt7 != null ? bizInstrumentGEmmrt7.getTradeSymbol() : null));
                    } else {
                        AppCompatTextView appCompatTextView4 = this.KWHzl.KWHzl;
                        BizInstrument bizInstrumentGEmmrt8 = gEmmrt();
                        appCompatTextView4.setText(str + "-" + (bizInstrumentGEmmrt8 != null ? bizInstrumentGEmmrt8.getDisplayQuoteSymbol() : null));
                    }
                }
            }
        } else {
            AbstractC49896uxG abstractC49896uxG5 = this.zLjUOn;
            if (abstractC49896uxG5 != null) {
                abstractC49896uxG5.EZpvd((java.lang.String) null);
            }
        }
        pUU.KWHzl("MarginModelAndLeverageView", java.lang.String.valueOf(this.KWHzl.KWHzl.getText()));
    }

    public static /* synthetic */ void updateLeverage$default(C49924uxi c49924uxi, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = null;
        }
        c49924uxi.AEQbTJ(tradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [688=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(TradeType tradeType) {
        AbstractC49896uxG abstractC49896uxG;
        java.lang.String quoteSymbol;
        C56111xwe<java.lang.String> newProxyInstance;
        java.lang.String str;
        C56084xwD fieldNames;
        java.lang.String str2;
        BizInstrument bizInstrument;
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance2;
        ejfBZ();
        if (values()) {
            android.widget.TextView textView = this.KWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else if (!C54794xVo.copydefault.gEmmrt(gEmmrt()) || ((abstractC49896uxG = this.zLjUOn) != null && abstractC49896uxG.EZpvd(gEmmrt()))) {
            this.KWHzl.AEQbTJ.setVisibility(8);
            return;
        }
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        InterfaceC58217yxC interfaceC58217yxCCopydefault = null;
        java.lang.String marginMode$default = null;
        interfaceC58217yxCCopydefault = null;
        java.lang.String instType = bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        this.KWHzl.AEQbTJ.setVisibility(0);
                        this.KWHzl.AEQbTJ.setTextColor(getFieldNames());
                    }
                    break;
                case -1956807563:
                    if (instType.equals("OPTION")) {
                        this.KWHzl.AEQbTJ.setVisibility(8);
                    }
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        if (C54794xVo.copydefault.EZpvd() && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance2.gHZMYf() && C49908uxS.Companion.KWHzl()) {
                            this.KWHzl.AEQbTJ.setVisibility(0);
                            this.KWHzl.AEQbTJ.setTextColor(getFieldNames());
                        } else {
                            this.KWHzl.AEQbTJ.setVisibility(8);
                        }
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        C54794xVo c54794xVo = C54794xVo.copydefault;
                        if (c54794xVo.AEQbTJ() && c54794xVo.AhwBna(gEmmrt())) {
                            this.KWHzl.AEQbTJ.setVisibility(0);
                            this.KWHzl.AEQbTJ.setTextColor(fIwbmz());
                        } else {
                            this.KWHzl.AEQbTJ.setVisibility(0);
                            this.KWHzl.AEQbTJ.setTextColor(getFieldNames());
                        }
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                    }
                    break;
            }
        }
        BizInstrument bizInstrumentGEmmrt2 = gEmmrt();
        if (bizInstrumentGEmmrt2 == null) {
            return;
        }
        C54794xVo c54794xVo2 = C54794xVo.copydefault;
        if (c54794xVo2.djBIcL(gEmmrt()) || values()) {
            TradeType tradeTypeAEQbTJ = tradeType == null ? C49926uxk.Companion.AEQbTJ() : tradeType;
            int i = tradeTypeAEQbTJ == null ? -1 : TaskDescription.copydefault[tradeTypeAEQbTJ.ordinal()];
            if (i != 1) {
                quoteSymbol = i != 2 ? bizInstrumentGEmmrt2.getQuoteSymbol() : bizInstrumentGEmmrt2.getTradeSymbol();
            } else {
                C56132xwz newProxyInstance3 = getNewProxyInstance();
                if (newProxyInstance3 == null || (newProxyInstance = newProxyInstance3.getNewProxyInstance()) == null || (quoteSymbol = newProxyInstance.getValue()) == null) {
                    quoteSymbol = bizInstrumentGEmmrt2.getQuoteSymbol();
                }
            }
            str = quoteSymbol;
        } else {
            str = null;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (!C55697xoo.OLrzqt.isConnected()) {
            AkhnZx();
            return;
        }
        if (this.djBIcL && c54794xVo2.EZpvd()) {
            BizInstrument bizInstrumentGEmmrt3 = gEmmrt();
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentGEmmrt3 != null ? bizInstrumentGEmmrt3.getInstType() : null), (java.lang.Object) "SPOT")) {
                android.widget.TextView textView2 = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                copydefault(textView2, 1.0f);
                android.widget.TextView textView3 = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                updateMargins$default(this, textView3, 0, null, null, null, 14, null);
                AppCompatTextView appCompatTextView = this.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                copydefault(appCompatTextView, 0.0f);
            }
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (fieldNames = interfaceC54581xNrOLrzqt2.getFieldNames()) != null) {
            java.lang.String instId = bizInstrumentGEmmrt2.getInstId();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt3.isConnected()) == null) {
                str2 = str;
                bizInstrument = bizInstrumentGEmmrt2;
            } else {
                str2 = str;
                bizInstrument = bizInstrumentGEmmrt2;
                marginMode$default = MarginModeManager.getMarginMode$default(marginModeManagerIsConnected, bizInstrumentGEmmrt2.getInstFamily(), bizInstrumentGEmmrt2.getInstType(), null, false, bizInstrument, 12, null);
            }
            interfaceC58217yxCCopydefault = fieldNames.copydefault(instId, marginMode$default, str2, new Application(bizInstrument));
        }
        this.values = interfaceC58217yxCCopydefault;
    }

    /* JADX INFO: renamed from: o.uxi$Application */
    public static final class Application implements InterfaceC55701xos<java.util.List<? extends LeverageInfo>> {
        public final /* synthetic */ BizInstrument KWHzl;

        public Application(BizInstrument bizInstrument) {
            this.KWHzl = bizInstrument;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void EZpvd(boolean z, java.util.List<LeverageInfo> list, java.lang.Exception exc) {
            java.lang.Object next;
            java.lang.Object next2;
            java.lang.String str;
            if (z && list != null && !list.isEmpty()) {
                java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
                BizInstrument bizInstrumentGEmmrt = C49924uxi.this.gEmmrt();
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstType() : null)) {
                    C54794xVo c54794xVo = C54794xVo.copydefault;
                    if (c54794xVo.AEQbTJ() && c54794xVo.AhwBna(C49924uxi.this.gEmmrt())) {
                        java.util.Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((LeverageInfo) next).getPosSide(), (java.lang.Object) "long")) {
                                    break;
                                }
                            }
                        }
                        LeverageInfo leverageInfo = (LeverageInfo) next;
                        java.util.Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            } else {
                                next2 = it2.next();
                                if (Intrinsics.EZpvd((java.lang.Object) ((LeverageInfo) next2).getPosSide(), (java.lang.Object) "short")) {
                                    break;
                                }
                            }
                        }
                        LeverageInfo leverageInfo2 = (LeverageInfo) next2;
                        if (leverageInfo != null) {
                            C49924uxi c49924uxi = C49924uxi.this;
                            java.lang.String strEZpvd = c49924uxi.EZpvd(leverageInfo.getLever());
                            AbstractC49896uxG abstractC49896uxG = c49924uxi.zLjUOn;
                            if (abstractC49896uxG != null) {
                                abstractC49896uxG.KWHzl(strEZpvd);
                            }
                            str = xMR.copydefault.KWHzl(strEZpvd, 0) + "x";
                        } else {
                            str = null;
                        }
                        if (leverageInfo2 != null) {
                            C49924uxi c49924uxi2 = C49924uxi.this;
                            java.lang.String strEZpvd2 = c49924uxi2.EZpvd(leverageInfo2.getLever());
                            AbstractC49896uxG abstractC49896uxG2 = c49924uxi2.zLjUOn;
                            if (abstractC49896uxG2 != null) {
                                abstractC49896uxG2.OLrzqt(strEZpvd2);
                            }
                            str = xMR.copydefault.KWHzl(strEZpvd2, 0) + "x";
                        }
                        android.widget.TextView textView = C49924uxi.this.valueOf().AEQbTJ;
                        java.lang.String str2 = str + "  " + str;
                        java.lang.String[] strArr = {java.lang.String.valueOf(str)};
                        final C49924uxi c49924uxi3 = C49924uxi.this;
                        textView.setText(C33061mpO.setupSpanStyles$default(str2, strArr, 0, null, false, new Function1() { // from class: o.uxC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C49924uxi.Application.KWHzl(c49924uxi3, (java.util.List) obj);
                            }
                        }, 14, null));
                    } else {
                        java.lang.String strEZpvd3 = C49924uxi.this.EZpvd(list.get(0).getLever());
                        C49924uxi c49924uxi4 = C49924uxi.this;
                        AbstractC49896uxG abstractC49896uxG3 = c49924uxi4.zLjUOn;
                        if (abstractC49896uxG3 != null) {
                            abstractC49896uxG3.OLrzqt(strEZpvd3);
                        }
                        AbstractC49896uxG abstractC49896uxG4 = c49924uxi4.zLjUOn;
                        if (abstractC49896uxG4 != null) {
                            abstractC49896uxG4.KWHzl(c49924uxi4.gEmmrt());
                        }
                        java.lang.String strKWHzl = xMR.copydefault.KWHzl(strEZpvd3, 0);
                        if (c49924uxi4.djBIcL && C54794xVo.copydefault.EZpvd()) {
                            BizInstrument bizInstrumentGEmmrt2 = c49924uxi4.gEmmrt();
                            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentGEmmrt2 != null ? bizInstrumentGEmmrt2.getInstType() : null), (java.lang.Object) "SPOT") && !c49924uxi4.AhwBna) {
                                c49924uxi4.valueOf().AEQbTJ.setText(C33069mpW.copydefault(C49511upt.Activity.UeEOUB, C56423yEv.EZpvd(C56390yDp.OLrzqt("leverage", strKWHzl))));
                            }
                            RxBus.KWHzl("trade_balance_refresh");
                        } else {
                            c49924uxi4.valueOf().AEQbTJ.setText(strKWHzl + "x");
                            RxBus.KWHzl("trade_balance_refresh");
                        }
                    }
                }
                if (C49924uxi.this.djBIcL && yDV.valueOf(new java.lang.String[]{"SWAP", "FUTURES"}, this.KWHzl.getInstType())) {
                    C49924uxi.this.valueOf().getRoot().postDelayed(new java.lang.Runnable() { // from class: o.uxE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C49924uxi.Application.OLrzqt();
                        }
                    }, C49924uxi.this.copydefault);
                    return;
                }
                return;
            }
            C49924uxi.this.valueOf().AEQbTJ.setText("--");
        }

        public static final Unit KWHzl(C49924uxi c49924uxi, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(c49924uxi.hDKMBd()));
            return Unit.INSTANCE;
        }

        public static final void OLrzqt() {
            RxBus.KWHzl("MARGIN_LEVER_CHANGE");
        }
    }

    public final void AkhnZx() {
        xMR xmr = xMR.copydefault;
        this.KWHzl.AEQbTJ.setText(xmr.KWHzl("10", 0) + "x");
        java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
        BizInstrument bizInstrumentGEmmrt = gEmmrt();
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), bizInstrumentGEmmrt != null ? bizInstrumentGEmmrt.getInstType() : null)) {
            C54794xVo c54794xVo = C54794xVo.copydefault;
            if (c54794xVo.AEQbTJ() && c54794xVo.AhwBna(gEmmrt())) {
                java.lang.String str = xmr.KWHzl("10", 0) + "x";
                java.lang.String str2 = xmr.KWHzl("10", 0) + "x";
                this.KWHzl.AEQbTJ.setText(C33061mpO.setupSpanStyles$default(str + "  " + str2, new java.lang.String[]{str}, 0, null, false, new C49890uxA(this), 14, null));
                return;
            }
        }
        this.KWHzl.AEQbTJ.setText(xmr.KWHzl("10", 0) + "x");
    }

    public static final Unit AEQbTJ(C49924uxi c49924uxi, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(c49924uxi.hDKMBd()));
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        AbstractC49896uxG abstractC49896uxG = this.zLjUOn;
        if (abstractC49896uxG != null) {
            abstractC49896uxG.KWHzl((java.lang.String) null);
        }
        AbstractC49896uxG abstractC49896uxG2 = this.zLjUOn;
        if (abstractC49896uxG2 != null) {
            abstractC49896uxG2.OLrzqt(null);
        }
        this.KWHzl.AEQbTJ.setText("--");
        android.widget.TextView textView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        copydefault(textView, 0.0f);
        android.widget.TextView textView2 = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        updateMargins$default(this, textView2, java.lang.Integer.valueOf(C55298xhM.OLrzqt(8, context)), null, null, null, 14, null);
        AppCompatTextView appCompatTextView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        copydefault(appCompatTextView, 1.0f);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, 2, java.lang.Boolean.TRUE, RoundingMode.HALF_DOWN);
    }

    public final void AuCTel() {
        C49861uwY.Companion.copydefault().addOnPropertyChangedCallback(this.iwGUEr);
        if (!this.valueOf) {
            updateMarginCoin$default(this, null, 1, null);
            updateLeverage$default(this, null, 1, null);
        }
        this.valueOf = false;
    }

    public final void DbNXlk() {
        C49861uwY.Companion.copydefault().removeOnPropertyChangedCallback(this.iwGUEr);
        InterfaceC58217yxC interfaceC58217yxC = this.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final boolean fetchVPNInfo() {
        AppCompatTextView appCompatTextView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        boolean z = appCompatTextView.getVisibility() == 0;
        android.widget.TextView textView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return z | (textView.getVisibility() == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pUU.KWHzl("MarginModelAndLeverageView", "onDetachedFromWindow: Trade mode TRADE_SWAP_TYPE");
        this.uzCIH = null;
        this.fJNWhG = null;
        this.EZpvd = null;
    }

    public final void copydefault(android.view.View view, float f) {
        if (view.getParent() instanceof android.widget.LinearLayout) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = f;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public static /* synthetic */ void updateMargins$default(C49924uxi c49924uxi, android.view.View view, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i, java.lang.Object obj) {
        c49924uxi.AEQbTJ(view, (i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }

    public final void AEQbTJ(android.view.View view, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (num != null) {
            marginLayoutParams.setMarginStart(num.intValue());
        }
        if (num2 != null) {
            marginLayoutParams.topMargin = num2.intValue();
        }
        if (num3 != null) {
            marginLayoutParams.setMarginEnd(num3.intValue());
        }
        if (num4 != null) {
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
