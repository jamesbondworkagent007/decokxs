package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAddInvestLimitResponse;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.presenter.ContractGridAddInvestPresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53841wtB extends AbstractC49945uyC<AbstractC48394uPw, ContractGridAddInvestPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public android.widget.TextView AEQbTJ;
    public C53539wnR AYXKKw;
    public C55320xhi AhwBna;
    public android.widget.TextView AkhnZx;
    public final int DbNXlk = C48033uCm.Activity.UrRBLY;
    public Function1<? super java.lang.String, ContractGridAddInvestPresenter> KWHzl;
    public wYK OLrzqt;
    public C47988uAv djBIcL;
    public android.widget.TextView fetchVPNInfo;
    public final Function2<C47988uAv, java.lang.String, Unit> gEmmrt;
    public android.widget.LinearLayout isConnected;
    public final Function2<C47988uAv, java.lang.String, Unit> valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.wtB$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.DbNXlk;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ AbstractC48394uPw KWHzl(C53841wtB c53841wtB) {
        return c53841wtB.values();
    }

    public C53841wtB() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridAddInvestmentDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridAddInvestmentDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridAddInvestmentDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridAddInvestmentDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridAddInvestmentDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.gEmmrt = new Function2() { // from class: o.wtC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53841wtB.KWHzl(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.KWHzl = new Function1() { // from class: o.wtH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        };
        this.valueOf = new Function2() { // from class: o.wtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53841wtB.OLrzqt(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    public final C55915xsu copydefault() {
        return (C55915xsu) this.values.getValue();
    }

    public static final Unit KWHzl(C53841wtB c53841wtB, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = c53841wtB.values().AYXKKw;
        c53841wtB.AEQbTJ(str == null ? "" : str);
        c53841wtB.KWHzl(str == null ? "" : str);
        c53841wtB.copydefault(c53841wtB.isConnected());
        if (c53841wtB.ejfBZ()) {
            c53841wtB.OLrzqt().valueOf(str == null ? "" : str);
        } else {
            c53841wtB.OLrzqt().AYXKKw(str == null ? "" : str);
            ContractGridAddInvestPresenter.updateSz$default(c53841wtB.OLrzqt(), false, 1, null);
        }
        java.lang.String strCopydefault = c53841wtB.OLrzqt().copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        c53841wtB.OLrzqt(strCopydefault);
        if (c53841wtB.ejfBZ()) {
            c53841wtB.OLrzqt().OLrzqt(!c53841wtB.OLrzqt().uzCIH());
        }
        if (str == null) {
            str = "";
        }
        c53841wtB.OLrzqt(str);
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean ejfBZ() {
        wYK wyk = this.OLrzqt;
        if (wyk != null) {
            return wyk.isChecked();
        }
        return true;
    }

    public static final ContractGridAddInvestPresenter copydefault(C53841wtB c53841wtB, java.lang.String str) {
        java.lang.String strIsConnected = c53841wtB.isConnected();
        c53841wtB.OLrzqt("contract_grid", strIsConnected);
        c53841wtB.copydefault(strIsConnected);
        ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = c53841wtB.OLrzqt();
        if (contractGridAddInvestPresenterOLrzqt == null) {
            return null;
        }
        if (c53841wtB.ejfBZ()) {
            if (str == null) {
                str = "";
            }
            contractGridAddInvestPresenterOLrzqt.valueOf(str);
        } else {
            contractGridAddInvestPresenterOLrzqt.AYXKKw(str);
            ContractGridAddInvestPresenter.updateSz$default(contractGridAddInvestPresenterOLrzqt, false, 1, null);
        }
        java.lang.String strCopydefault = contractGridAddInvestPresenterOLrzqt.copydefault();
        c53841wtB.OLrzqt(strCopydefault != null ? strCopydefault : "");
        if (!c53841wtB.ejfBZ()) {
            return contractGridAddInvestPresenterOLrzqt;
        }
        ContractGridAddInvestPresenter.getActualExtraMargin$default(contractGridAddInvestPresenterOLrzqt, false, 1, null);
        return contractGridAddInvestPresenterOLrzqt;
    }

    /* JADX INFO: renamed from: o.wtB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C53841wtB KWHzl(@NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("TacticsData", tacticsData);
            C53841wtB c53841wtB = new C53841wtB();
            c53841wtB.setArguments(bundle);
            return c53841wtB;
        }
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = OLrzqt();
        if (contractGridAddInvestPresenterOLrzqt != null) {
            contractGridAddInvestPresenterOLrzqt.djBIcL(str);
            ContractGridAddInvestPresenter.updateSz$default(contractGridAddInvestPresenterOLrzqt, false, 1, null);
        }
    }

    public static final Unit OLrzqt(C53841wtB c53841wtB, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c53841wtB.djBIcL)) {
            if (c53841wtB.OLrzqt() != null) {
                if (str == null) {
                    str = "";
                }
                c53841wtB.copydefault(str, c53841wtB.ejfBZ());
            }
            c53841wtB.copydefault(c53841wtB.isConnected());
        }
        return Unit.INSTANCE;
    }

    private final void djBIcL(java.lang.String str) {
        this.OLrzqt = values().copydefault;
        this.AYXKKw = values().EZpvd;
        this.fetchVPNInfo = values().fIwbmz;
        this.AkhnZx = values().fJNWhG;
        this.isConnected = values().isConnected;
        C47988uAv c47988uAv = values().AhwBna;
        this.djBIcL = c47988uAv;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(this.valueOf);
        }
        this.AhwBna = values().djBIcL;
        wYK wyk = this.OLrzqt;
        if (wyk != null) {
            wyk.setChecked(true);
        }
        C53539wnR c53539wnR = this.AYXKKw;
        if (c53539wnR != null) {
            c53539wnR.setVisibility(0);
        }
        C53539wnR c53539wnR2 = this.AYXKKw;
        if (c53539wnR2 != null) {
            c53539wnR2.setFooterAvaValueGravity(8388613);
        }
        C53539wnR c53539wnR3 = this.AYXKKw;
        if (c53539wnR3 != null) {
            c53539wnR3.setFooterAvaValue("--");
        }
        android.widget.TextView textView = this.fetchVPNInfo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.AkhnZx;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.isConnected;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        C47988uAv c47988uAv2 = this.djBIcL;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputUnit(str);
        }
        C47988uAv c47988uAv3 = this.djBIcL;
        if (c47988uAv3 != null) {
            c47988uAv3.setMaxDecimal(OLrzqt().AkhnZx());
        }
        C47988uAv c47988uAv4 = this.djBIcL;
        if (c47988uAv4 != null) {
            C47988uAv.setInputLabel$default(c47988uAv4, "≥ " + xMR.copydefault.copydefault("0"), null, 2, null);
        }
        final C55320xhi c55320xhi = this.AhwBna;
        if (c55320xhi != null) {
            c55320xhi.gEmmrt();
            C8003auW.copydefault(c55320xhi).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.wtL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C53841wtB.OLrzqt(c55320xhi, obj);
                }
            });
        }
        wYK wyk2 = this.OLrzqt;
        if (wyk2 != null) {
            wyk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wtM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C53841wtB.copydefault(this.OLrzqt, compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.wtB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53841wtB KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53841wtB c53841wtB) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c53841wtB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.wtB$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53841wtB KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53841wtB c53841wtB) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c53841wtB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!this.KWHzl.OLrzqt().isConnected()) {
                    this.KWHzl.fJNWhG();
                    return;
                }
                java.lang.String strAkhnZx = C53841wtB.KWHzl(this.KWHzl).AYXKKw.AkhnZx();
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                    this.KWHzl.fJNWhG();
                }
                if (C53841wtB.KWHzl(this.KWHzl).AYXKKw.getFieldNames()) {
                    C53841wtB.KWHzl(this.KWHzl).AYXKKw.setInputFocus();
                    return;
                }
                if (this.KWHzl.OLrzqt().gEmmrt(strAkhnZx)) {
                    if (this.KWHzl.OLrzqt().KWHzl(C53841wtB.KWHzl(this.KWHzl).AYXKKw.AkhnZx(), this.KWHzl.isConnected())) {
                        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.fERRXa), 0, 1, (java.lang.Object) null);
                        return;
                    }
                    ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = this.KWHzl.OLrzqt();
                    java.lang.String strEjfBZ = this.KWHzl.OLrzqt().ejfBZ();
                    java.lang.String strCopydefault = this.KWHzl.OLrzqt().copydefault();
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    java.lang.String strDjBIcL = this.KWHzl.OLrzqt().djBIcL();
                    if (strDjBIcL == null) {
                        strDjBIcL = "";
                    }
                    java.lang.Boolean boolAEQbTJ = this.KWHzl.OLrzqt().AEQbTJ();
                    contractGridAddInvestPresenterOLrzqt.AEQbTJ(strEjfBZ, strCopydefault, strDjBIcL, boolAEQbTJ != null ? boolAEQbTJ.booleanValue() : true, (this.KWHzl.OLrzqt().uzCIH() && this.KWHzl.OLrzqt().iwGUEr()) ? false : true);
                }
            }
        }
    }

    public static final void OLrzqt(C55320xhi c55320xhi, java.lang.Object obj) {
        android.content.Context context = c55320xhi.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.reset);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DQzvGNdrmXxudrmXxu));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53841wtB.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(C53841wtB c53841wtB, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            C53539wnR c53539wnR = c53841wtB.AYXKKw;
            if (c53539wnR != null) {
                c53539wnR.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = c53841wtB.isConnected;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = c53841wtB.fetchVPNInfo;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            C53539wnR c53539wnR2 = c53841wtB.AYXKKw;
            if (c53539wnR2 != null) {
                c53539wnR2.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = c53841wtB.isConnected;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            android.widget.TextView textView2 = c53841wtB.fetchVPNInfo;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = c53841wtB.OLrzqt();
        if (contractGridAddInvestPresenterOLrzqt != null) {
            if (z) {
                contractGridAddInvestPresenterOLrzqt.AEQbTJ(true);
                C47988uAv c47988uAv = c53841wtB.values().AYXKKw;
                java.lang.String strAkhnZx = c47988uAv != null ? c47988uAv.AkhnZx() : null;
                if (strAkhnZx == null) {
                    strAkhnZx = "";
                }
                contractGridAddInvestPresenterOLrzqt.valueOf(strAkhnZx);
                contractGridAddInvestPresenterOLrzqt.OLrzqt(!c53841wtB.OLrzqt().uzCIH());
            } else {
                contractGridAddInvestPresenterOLrzqt.AEQbTJ(false);
                C47988uAv c47988uAv2 = c53841wtB.values().AYXKKw;
                java.lang.String strAkhnZx2 = c47988uAv2 != null ? c47988uAv2.AkhnZx() : null;
                if (strAkhnZx2 == null) {
                    strAkhnZx2 = "";
                }
                contractGridAddInvestPresenterOLrzqt.AYXKKw(strAkhnZx2);
                C47988uAv c47988uAv3 = c53841wtB.djBIcL;
                java.lang.String strAkhnZx3 = c47988uAv3 != null ? c47988uAv3.AkhnZx() : null;
                if (strAkhnZx3 == null) {
                    strAkhnZx3 = "";
                }
                contractGridAddInvestPresenterOLrzqt.djBIcL(strAkhnZx3);
                ContractGridAddInvestPresenter.updateSz$default(contractGridAddInvestPresenterOLrzqt, false, 1, null);
            }
            c53841wtB.OLrzqt().KWHzl(!c53841wtB.OLrzqt().uzCIH());
            java.lang.String strCopydefault = contractGridAddInvestPresenterOLrzqt.copydefault();
            c53841wtB.OLrzqt(strCopydefault != null ? strCopydefault : "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        wYK wyk = this.OLrzqt;
        if (wyk == null || !wyk.isChecked()) {
            C47988uAv c47988uAv = values().AYXKKw;
            double dAEQbTJ = C33129mqd.AEQbTJ(c47988uAv != null ? c47988uAv.AkhnZx() : null);
            C47988uAv c47988uAv2 = this.djBIcL;
            double dAEQbTJ2 = C33129mqd.AEQbTJ(c47988uAv2 != null ? c47988uAv2.AkhnZx() : null);
            double dAEQbTJ3 = str2 != null ? C33129mqd.AEQbTJ(str2) : AudioStats.AUDIO_AMPLITUDE_NONE;
            android.widget.TextView textView = this.AEQbTJ;
            if (textView != null) {
                textView.setVisibility((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3) ? 8 : 0);
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.AEQbTJ;
        if (textView2 != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || str2 == null) {
                i = 8;
            } else {
                C47988uAv c47988uAv3 = values().AYXKKw;
                if (!C33129mqd.AEQbTJ(c47988uAv3 != null ? c47988uAv3.AkhnZx() : null, str2)) {
                }
            }
            textView2.setVisibility(i);
        }
    }

    public final void copydefault(java.lang.String str) {
        wYK wyk = this.OLrzqt;
        if (wyk == null || !wyk.isChecked()) {
            C47988uAv c47988uAv = values().AYXKKw;
            double dAEQbTJ = C33129mqd.AEQbTJ(c47988uAv != null ? c47988uAv.AkhnZx() : null);
            C47988uAv c47988uAv2 = this.djBIcL;
            double dAEQbTJ2 = C33129mqd.AEQbTJ(c47988uAv2 != null ? c47988uAv2.AkhnZx() : null);
            double dAEQbTJ3 = str != null ? C33129mqd.AEQbTJ(str) : AudioStats.AUDIO_AMPLITUDE_NONE;
            C47988uAv c47988uAv3 = this.djBIcL;
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (c47988uAv3 != null ? c47988uAv3.AkhnZx() : null));
            android.widget.TextView textView = this.fetchVPNInfo;
            if (textView != null) {
                textView.setVisibility(((zOLrzqt ^ true) || dAEQbTJ2 < 0.3d * dAEQbTJ) ? 0 : 8);
            }
            android.widget.TextView textView2 = this.AkhnZx;
            if (textView2 != null) {
                textView2.setVisibility(dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3 ? 8 : 0);
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        contractGridAddInvestPresenterOLrzqt.copydefault(arguments != null ? (TacticsData) arguments.getParcelable("TacticsData") : null);
        hDKMBd();
        fIwbmz();
        getNewProxyInstance();
        fARcdN();
        djBIcL(OLrzqt().DbNXlk());
        getFieldNames();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OLrzqt().KWHzl(!OLrzqt().uzCIH());
        copydefault().AYXKKw();
        copydefault().EZpvd("contract_grid", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : OLrzqt().OLrzqt(), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.GiPPlLQAswws));
        wxq.setDividerVisibility(true);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new TaskDescription(wyf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        copydefault().AYXKKw();
    }

    private final void hDKMBd() {
        OKReminder oKReminder = values().fetchVPNInfo;
        oKReminder.setStyle(2);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.geLlBI);
        if (!(strAYXKKw instanceof java.lang.CharSequence)) {
            strAYXKKw = null;
        }
        oKReminder.setMessage((java.lang.CharSequence) strAYXKKw);
        oKReminder.setCloseIconVisibility(false);
    }

    public final void fIwbmz() {
        values().fARcdN.setText(OLrzqt().valueOf());
        for (TacticsListLabelData tacticsListLabelData : OLrzqt().AuCTel()) {
            android.content.Context context = getContext();
            if (context != null) {
                values().DbNXlk.addView(C52534wOz.KWHzl.copydefault(context, tacticsListLabelData));
            }
        }
    }

    private final void getNewProxyInstance() {
        final C47988uAv c47988uAv = values().AYXKKw;
        c47988uAv.setInputUnit(OLrzqt().DbNXlk());
        c47988uAv.setMaxDecimal(OLrzqt().AkhnZx());
        c47988uAv.setOnTextChangeCallback(this.gEmmrt);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wtN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.OLrzqt(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, C53841wtB c53841wtB, float f) {
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            java.lang.String strCopydefault = c53841wtB.OLrzqt().copydefault(c47988uAv.fJNWhG(), c53841wtB.isConnected());
            C47988uAv.setInputContent$default(c47988uAv, strCopydefault, false, false, 6, null);
            c53841wtB.OLrzqt(strCopydefault);
            c53841wtB.AEQbTJ(strCopydefault);
            c53841wtB.KWHzl(strCopydefault);
            c47988uAv.setOnTextChangeCallback(c53841wtB.gEmmrt);
            Function1<? super java.lang.String, ContractGridAddInvestPresenter> function1 = c53841wtB.KWHzl;
            if (function1 != null) {
                java.lang.String strAkhnZx = c47988uAv.AkhnZx();
                if (strAkhnZx == null) {
                    strAkhnZx = "";
                }
                function1.invoke(strAkhnZx);
            }
        }
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        vKO vko = values().values;
        vko.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        vko.setValue("--");
        C53539wnR c53539wnR = values().gEmmrt;
        c53539wnR.setTransferCoin(OLrzqt().DbNXlk());
        c53539wnR.setFooterAvaValue("--");
    }

    private final void getFieldNames() {
        AuCTel().observe(this, new StateListAnimator(new Function1() { // from class: o.wtQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<ExtraActualMarginResp> c56111xweAhwBna = OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweAhwBna.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wtT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.OLrzqt(this.KWHzl, (ExtraActualMarginResp) obj);
            }
        }));
        TradeLiveData<BotAddInvestLimitResponse> tradeLiveDataGEmmrt = OLrzqt().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wtK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.AEQbTJ(this.OLrzqt, (BotAddInvestLimitResponse) obj);
            }
        }));
        TradeLiveData<java.lang.Object> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner3, new Observer() { // from class: o.wtJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53841wtB.OLrzqt(this.AEQbTJ, obj);
            }
        });
        OLrzqt().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wtI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.copydefault(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wtG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53841wtB.OLrzqt(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C53841wtB c53841wtB, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53841wtB.values().gEmmrt.setFooterAvaValue(c53841wtB.OLrzqt().AEQbTJ(str));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53841wtB c53841wtB, ExtraActualMarginResp extraActualMarginResp) {
        Intrinsics.checkNotNullParameter(extraActualMarginResp, "");
        ContractGridAddInvestPresenter contractGridAddInvestPresenterOLrzqt = c53841wtB.OLrzqt();
        if (contractGridAddInvestPresenterOLrzqt != null) {
            contractGridAddInvestPresenterOLrzqt.AYXKKw(extraActualMarginResp.getActualMarginSz());
            contractGridAddInvestPresenterOLrzqt.djBIcL(extraActualMarginResp.getExtraMarginSz());
            java.lang.String actualMarginSz = extraActualMarginResp.getActualMarginSz();
            if (actualMarginSz == null) {
                actualMarginSz = "";
            }
            java.lang.String strEZpvd = contractGridAddInvestPresenterOLrzqt.EZpvd(actualMarginSz);
            java.lang.String extraMarginSz = extraActualMarginResp.getExtraMarginSz();
            if (extraMarginSz == null) {
                extraMarginSz = "";
            }
            java.lang.String strEZpvd2 = contractGridAddInvestPresenterOLrzqt.EZpvd(extraMarginSz);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getExtraMarginSz()) && !C33129mqd.OLrzqt((java.lang.CharSequence) extraActualMarginResp.getActualMarginSz())) {
                C53539wnR c53539wnR = c53841wtB.AYXKKw;
                if (c53539wnR != null) {
                    c53539wnR.setFooterAvaValue("--");
                }
            } else {
                C53539wnR c53539wnR2 = c53841wtB.AYXKKw;
                if (c53539wnR2 != null) {
                    c53539wnR2.setFooterAvaValue(strEZpvd + Marker.ANY_NON_NULL_MARKER + strEZpvd2 + " " + contractGridAddInvestPresenterOLrzqt.fetchVPNInfo());
                }
            }
            java.lang.String strCopydefault = contractGridAddInvestPresenterOLrzqt.copydefault();
            c53841wtB.OLrzqt(strCopydefault != null ? strCopydefault : "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53841wtB c53841wtB, BotAddInvestLimitResponse botAddInvestLimitResponse) {
        if (c53841wtB.OLrzqt().isConnected()) {
            OKReminder oKReminder = c53841wtB.values().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(8);
            C47988uAv.setInputLabel$default(c53841wtB.values().AYXKKw, c53841wtB.OLrzqt().AYXKKw(), null, 2, null);
            C47988uAv.setInputLayoutState$default(c53841wtB.values().AYXKKw, InputLayoutState.NORMAL, false, 2, null);
            c53841wtB.values().AYXKKw.setPercentEnabled(true);
        } else {
            OKReminder oKReminder2 = c53841wtB.values().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
            oKReminder2.setVisibility(0);
            C47988uAv.setInputLabel$default(c53841wtB.values().AYXKKw, "", null, 2, null);
            C47988uAv.setInputLayoutState$default(c53841wtB.values().AYXKKw, InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
            c53841wtB.values().AYXKKw.setPercentEnabled(false);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C53841wtB c53841wtB, java.lang.Object obj) {
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.unregister, 0, 1, (java.lang.Object) null);
        c53841wtB.fJNWhG();
    }

    public static final Unit copydefault(C53841wtB c53841wtB, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c53841wtB.OLrzqt().EZpvd().bB_())) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE)) {
                AbstractC49945uyC.showLoading$default(c53841wtB, 0L, 1, null);
            } else {
                c53841wtB.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53841wtB c53841wtB, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c53841wtB.OLrzqt().EZpvd().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        values().values.setValue(OLrzqt().OLrzqt(str));
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.String strCopydefault = OLrzqt().copydefault(str);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            values().AYXKKw.setInputErrorMsg(strCopydefault);
        } else {
            values().AYXKKw.copydefault();
        }
    }

    public final void KWHzl(java.lang.String str) {
        android.widget.TextView textView = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(OLrzqt().KWHzl(str, isConnected()) ? 0 : 8);
    }

    public final C56111xwe<java.lang.String> AuCTel() {
        BizInstrument bizInstrumentOLrzqt = OLrzqt().OLrzqt();
        return (bizInstrumentOLrzqt == null || !Intrinsics.EZpvd(bizInstrumentOLrzqt.isNegativeContract(), java.lang.Boolean.TRUE)) ? copydefault().AhwBna() : copydefault().EZpvd();
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final java.lang.String isConnected() {
        java.lang.String value = AuCTel().getValue();
        return value == null ? "" : value;
    }
}
