package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$onCreateContent$1$4;
import com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$onCreateContent$2;
import com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.C55770xqH;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes11.dex */
public final class wQD extends AbstractC52579wQq {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final boolean djBIcL = true;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public uST values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.djBIcL;
    }

    public wQD() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbReducePosViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.view.SmartArbReducePosBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQD.AYXKKw(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQD.gEmmrt(this.copydefault);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQD.AhwBna(this.KWHzl);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wQD.djBIcL(this.OLrzqt);
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wQD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            wQD wqd = new wQD();
            wqd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DATA_PARAM", tacticsData)));
            java.lang.String simpleName = wQD.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            C49662usl.EZpvd(wqd, fragmentManager, simpleName);
        }
    }

    public final SmartArbReducePosViewModel valueOf() {
        return (SmartArbReducePosViewModel) this.fetchVPNInfo.getValue();
    }

    public static final TacticsData AYXKKw(wQD wqd) {
        TacticsData tacticsData;
        android.os.Bundle arguments = wqd.getArguments();
        return (arguments == null || (tacticsData = (TacticsData) arguments.getParcelable("DATA_PARAM")) == null) ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
    }

    private final TacticsData isConnected() {
        return (TacticsData) this.gEmmrt.getValue();
    }

    private final BizInstrument fetchVPNInfo() {
        return (BizInstrument) this.AYXKKw.getValue();
    }

    public static final BizInstrument gEmmrt(wQD wqd) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, wqd.isConnected().getInstType(), wqd.isConnected().getInstId(), null, null, 12, null);
        }
        return null;
    }

    public static final java.lang.String AhwBna(wQD wqd) {
        C55770xqH.ActionBar actionBar = C55770xqH.ActionBar.OLrzqt;
        BizInstrument bizInstrumentFetchVPNInfo = wqd.fetchVPNInfo();
        java.lang.String strKWHzl = actionBar.KWHzl(bizInstrumentFetchVPNInfo != null ? bizInstrumentFetchVPNInfo.getInstFamily() : null);
        return strKWHzl == null ? "" : strKWHzl;
    }

    /* JADX DEBUG: Possible override for method o.wQq.OLrzqt()V */
    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.AkhnZx.getValue();
    }

    public static final java.lang.String djBIcL(wQD wqd) {
        BizInstrument bizInstrumentFetchVPNInfo = wqd.fetchVPNInfo();
        java.lang.String tradeSymbol = bizInstrumentFetchVPNInfo != null ? bizInstrumentFetchVPNInfo.getTradeSymbol() : null;
        return tradeSymbol == null ? "" : tradeSymbol;
    }

    private final java.lang.String values() {
        return (java.lang.String) this.valueOf.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.pause));
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.aUsmxb);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uST ustKWHzl = uST.KWHzl(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        final C47988uAv c47988uAv = ustKWHzl.AhwBna;
        C47988uAv.setInputLabel$default(c47988uAv, "0.01-100", null, 2, null);
        c47988uAv.setInputUnit("%");
        c47988uAv.setInputUnitBolded(true);
        c47988uAv.setMaxDecimal(2);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wQD.AEQbTJ(c47988uAv, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setDelayed(240L);
        c47988uAv.copydefault(new Activity(ustKWHzl, c47988uAv, this));
        c47988uAv.setMOnPercentCallback(new Function1() { // from class: o.wQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wQD.KWHzl(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
        C55258xgZ c55258xgZ = ustKWHzl.AEQbTJ;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this, ustKWHzl));
        boolean zIsSmartArbitrageWithStaking = isConnected().isSmartArbitrageWithStaking();
        LinearLayoutCompat linearLayoutCompat = ustKWHzl.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(zIsSmartArbitrageWithStaking ? 0 : 8);
        ustKWHzl.ejfBZ.setText(C33069mpW.copydefault(C48033uCm.Fragment.GiPPlL, C56424yEw.gEmmrt(C56390yDp.OLrzqt("stakeCcy", OLrzqt()), C56390yDp.OLrzqt("quoteCcy", values()))));
        C55258xgZ c55258xgZ2 = ustKWHzl.fetchVPNInfo;
        c55258xgZ2.setOnClickListener(new Dialog(c55258xgZ2, 1000L, this, ustKWHzl));
        android.widget.TextView textView = ustKWHzl.gEmmrt;
        if (zIsSmartArbitrageWithStaking) {
            strAYXKKw = C33069mpW.copydefault(C48033uCm.Fragment.config, C56424yEw.gEmmrt(C56390yDp.OLrzqt("stakeCcy", OLrzqt()), C56390yDp.OLrzqt("quoteCcy", values())));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OmJATG);
        }
        textView.setText(strAYXKKw);
        ustKWHzl.KWHzl.setText("--");
        ustKWHzl.valueOf.setText("--");
        ustKWHzl.EZpvd.setText("--");
        ustKWHzl.OLrzqt.setText("--");
        C52692wUv.flowAndCollect$default(valueOf().EZpvd(), this, null, new SmartArbReducePosBottomSheet$onCreateContent$1$4(ustKWHzl, this, zIsSmartArbitrageWithStaking, null), 2, null);
        this.values = ustKWHzl;
        C52692wUv.flowAndCollect$default(valueOf().KWHzl(), this, null, new SmartArbReducePosBottomSheet$onCreateContent$2(this, null), 2, null);
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, wQD wqd, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        Intrinsics.copydefault(c47988uAv);
        wqd.EZpvd(c47988uAv);
        return Unit.INSTANCE;
    }

    public static final class Activity extends uBF {
        public final /* synthetic */ C47988uAv EZpvd;
        public final /* synthetic */ uST KWHzl;
        public final /* synthetic */ wQD copydefault;

        public Activity(uST ust, C47988uAv c47988uAv, wQD wqd) {
            this.KWHzl = ust;
            this.EZpvd = c47988uAv;
            this.copydefault = wqd;
        }

        @Override // o.uBH, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String strAkhnZx = this.KWHzl.AhwBna.AkhnZx();
            if (this.EZpvd.getFieldNames() || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx))) {
                return;
            }
            this.copydefault.valueOf().KWHzl(strAkhnZx);
        }
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, wQD wqd, float f) {
        C47988uAv.setInputContentIgnoreCallback$default(c47988uAv, C33129mqd.OLrzqt((java.lang.Object) java.lang.Float.valueOf(f), (java.lang.Object) 0) ? "" : java.lang.String.valueOf(f * 100), false, false, 6, null);
        Intrinsics.copydefault(c47988uAv);
        wqd.EZpvd(c47988uAv);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ uST KWHzl;
        public final /* synthetic */ wQD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wQD wqd, uST ust) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = wqd;
            this.KWHzl = ust;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(this.KWHzl.AEQbTJ.AkhnZx());
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.RihMUf);
                viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.DLWbHP, new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ uST KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ wQD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, wQD wqd, uST ust) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = wqd;
            this.KWHzl = ust;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(this.KWHzl.fetchVPNInfo.AkhnZx());
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.QMuEJi);
                viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.DLWbHP, new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j) {
            this.EZpvd = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ wQD OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, wQD wqd) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = wqd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wQD EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, wQD wqd) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = wqd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C47988uAv c47988uAv;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                uST ust = this.EZpvd.values;
                if (ust == null || (c47988uAv = ust.AhwBna) == null) {
                    this.EZpvd.dismiss();
                    return;
                }
                java.lang.String strAkhnZx = c47988uAv.AkhnZx();
                if (!c47988uAv.getFieldNames() && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                    this.EZpvd.valueOf().AEQbTJ(strAkhnZx);
                } else {
                    c47988uAv.setInputFocus();
                }
            }
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return C56033xvF.getBotPnl$default(isConnected().getInstId(), isConnected().getInstType(), str, null, true, false, "4", false, null, null, null, 1960, null);
    }

    public static /* synthetic */ java.lang.String formatBasePrice$default(wQD wqd, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return wqd.copydefault(str, z, z2);
    }

    public final java.lang.String copydefault(java.lang.String str, boolean z, boolean z2) {
        return C56033xvF.fmtBotValueBySymbol$default(z ? OLrzqt() : values(), str, null, z2, null, false, null, null, null, null, null, 2036, null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0);
        boolean z2 = !z || C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0);
        if (zOLrzqt && z2) {
            return "";
        }
        java.lang.String basePrice$default = formatBasePrice$default(this, str, false, false, 6, null);
        java.lang.String basePrice$default2 = formatBasePrice$default(this, str2, true, false, 4, null);
        if (z2) {
            return basePrice$default;
        }
        if (zOLrzqt) {
            return basePrice$default2;
        }
        return basePrice$default2 + Marker.ANY_NON_NULL_MARKER + basePrice$default;
    }

    public final void OLrzqt(uST ust) {
        LinearLayoutCompat linearLayoutCompat = ust.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ust.valueOf.setCompoundDrawablesWithIntrinsicBounds(0, 0, linearLayoutCompat.getVisibility() == 0 ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call, 0);
    }

    public final android.text.SpannableStringBuilder KWHzl(java.lang.String str) {
        java.lang.Object styleSpan;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.copydefault(C48033uCm.Fragment.hgxRZI, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", OLrzqt()))));
        java.lang.String strCopydefault = copydefault(str, true, false);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, "{amount}", 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return spannableStringBuilder;
        }
        android.text.SpannableStringBuilder spannableStringBuilderReplace = spannableStringBuilder.replace(iIndexOf$default, iIndexOf$default + 8, (java.lang.CharSequence) strCopydefault);
        int length = strCopydefault.length();
        android.graphics.Typeface typefaceAEQbTJ = C55051xce.OLrzqt.AEQbTJ();
        if (Build.VERSION.SDK_INT >= 28 && typefaceAEQbTJ != null) {
            styleSpan = C7368aiX.copydefault(typefaceAEQbTJ);
        } else {
            styleSpan = new android.text.style.StyleSpan(1);
        }
        spannableStringBuilderReplace.setSpan(styleSpan, iIndexOf$default, length + iIndexOf$default, 33);
        Intrinsics.copydefault(spannableStringBuilderReplace);
        return spannableStringBuilderReplace;
    }

    public final void EZpvd(C47988uAv c47988uAv) {
        c47988uAv.copydefault();
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (C33129mqd.gEmmrt(strAkhnZx, java.lang.Double.valueOf(0.01d)) || C33129mqd.AEQbTJ(strAkhnZx, 100)) {
                c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C48033uCm.Fragment.zzJhsT, C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", pTB.formatICUPercent$default(java.lang.Double.valueOf(0.01d), null, null, null, null, null, 31, null)), C56390yDp.OLrzqt("max", pTB.formatICUPercent$default(100, null, null, null, null, null, 31, null)))));
                uST ust = this.values;
                if (ust != null) {
                    KWHzl(ust);
                }
            }
        }
    }

    public final void KWHzl(uST ust) {
        ust.KWHzl.setText("--");
        android.widget.TextView textView = ust.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = ust.valueOf;
        textView2.setText("--");
        textView2.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textView2.setOnClickListener(new FragmentManager(textView2, 1000L));
        LinearLayoutCompat linearLayoutCompat = ust.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(8);
        ust.EZpvd.setText("--");
        LinearLayoutCompat linearLayoutCompat2 = ust.isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(8);
        ust.OLrzqt.setText("--");
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(259);
            c52794wYpCopydefault.setOnClickListener(new PendingIntent(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new LoaderManager(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C47988uAv c47988uAv;
        uST ust = this.values;
        if (ust != null && (c47988uAv = ust.AhwBna) != null) {
            c47988uAv.setOnTextChangeCallback(null);
            c47988uAv.setMOnPercentCallback(null);
            c47988uAv.EZpvd();
        }
        this.values = null;
        super.onDestroyView();
    }
}
