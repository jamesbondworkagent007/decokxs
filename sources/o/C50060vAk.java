package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter.ArbTradeViewModel;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50060vAk extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public ArbitragePriceSetting AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC48368uOx copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    public C50060vAk() {
        final Function0 function0 = new Function0() { // from class: o.vAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50060vAk.OLrzqt(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageSetPriceFragment$special$$inlined$viewModels$default$1
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ArbTradeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageSetPriceFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageSetPriceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageSetPriceFragment$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: renamed from: o.vAk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vAk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50060vAk AEQbTJ(ArbitragePriceSetting arbitragePriceSetting) {
            C50060vAk c50060vAk = new C50060vAk();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("priceSetting", arbitragePriceSetting);
            c50060vAk.setArguments(bundle);
            return c50060vAk;
        }
    }

    private final ArbTradeViewModel KWHzl() {
        return (ArbTradeViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelStoreOwner OLrzqt(C50060vAk c50060vAk) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c50060vAk.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = (AbstractC48368uOx) DataBindingUtil.inflate(getCustomLayoutInflater(), C48033uCm.Activity.DLWbHP, constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? (ArbitragePriceSetting) arguments.getParcelable("priceSetting") : null;
        OLrzqt();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity4));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void OLrzqt() {
        C52794wYp c52794wYp;
        AbstractC48368uOx abstractC48368uOx;
        C52794wYp c52794wYp2;
        wYK wyk;
        wYK wyk2;
        AEQbTJ();
        copydefault();
        AbstractC48368uOx abstractC48368uOx2 = this.copydefault;
        if (abstractC48368uOx2 != null && (wyk2 = abstractC48368uOx2.values) != null) {
            wyk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vAj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C50060vAk.AEQbTJ(this.copydefault, compoundButton, z);
                }
            });
        }
        AbstractC48368uOx abstractC48368uOx3 = this.copydefault;
        if (abstractC48368uOx3 != null && (wyk = abstractC48368uOx3.isConnected) != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vAl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C50060vAk.EZpvd(this.EZpvd, compoundButton, z);
                }
            });
        }
        if (!C55697xoo.OLrzqt.isConnected() && (abstractC48368uOx = this.copydefault) != null && (c52794wYp2 = abstractC48368uOx.EZpvd) != null) {
            c52794wYp2.setEnabled(false);
        }
        AbstractC48368uOx abstractC48368uOx4 = this.copydefault;
        if (abstractC48368uOx4 == null || (c52794wYp = abstractC48368uOx4.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.vAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50060vAk.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final void AEQbTJ(C50060vAk c50060vAk, android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C55001xbh c55001xbh;
        wYK wyk;
        wYK wyk2;
        android.widget.TextView textView3;
        C55001xbh c55001xbh2;
        android.widget.TextView textView4;
        AbstractC48368uOx abstractC48368uOx = c50060vAk.copydefault;
        if (abstractC48368uOx != null && (textView4 = abstractC48368uOx.AYXKKw) != null) {
            textView4.setSelected(z);
        }
        AbstractC48368uOx abstractC48368uOx2 = c50060vAk.copydefault;
        if (abstractC48368uOx2 != null && (c55001xbh2 = abstractC48368uOx2.valueOf) != null) {
            c55001xbh2.setEnabled(z);
        }
        AbstractC48368uOx abstractC48368uOx3 = c50060vAk.copydefault;
        if (abstractC48368uOx3 != null && (textView3 = abstractC48368uOx3.AhwBna) != null) {
            textView3.setSelected(z);
        }
        AbstractC48368uOx abstractC48368uOx4 = c50060vAk.copydefault;
        if (abstractC48368uOx4 != null && (wyk2 = abstractC48368uOx4.isConnected) != null) {
            wyk2.setEnabled(z);
        }
        AbstractC48368uOx abstractC48368uOx5 = c50060vAk.copydefault;
        if (abstractC48368uOx5 != null && (c55001xbh = abstractC48368uOx5.AuCTel) != null) {
            c55001xbh.setEnabled(z && abstractC48368uOx5 != null && (wyk = abstractC48368uOx5.isConnected) != null && wyk.isChecked());
        }
        AbstractC48368uOx abstractC48368uOx6 = c50060vAk.copydefault;
        if (abstractC48368uOx6 != null && (textView2 = abstractC48368uOx6.fetchVPNInfo) != null) {
            textView2.setEnabled(z);
        }
        AbstractC48368uOx abstractC48368uOx7 = c50060vAk.copydefault;
        if (abstractC48368uOx7 == null || (textView = abstractC48368uOx7.fIwbmz) == null) {
            return;
        }
        textView.setEnabled(z);
    }

    public static final void EZpvd(C50060vAk c50060vAk, android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.TextView textView;
        C55001xbh c55001xbh;
        wYK wyk;
        android.widget.TextView textView2;
        wYK wyk2;
        AbstractC48368uOx abstractC48368uOx = c50060vAk.copydefault;
        if (abstractC48368uOx == null || (wyk2 = abstractC48368uOx.values) == null || wyk2.isChecked()) {
            AbstractC48368uOx abstractC48368uOx2 = c50060vAk.copydefault;
            if (abstractC48368uOx2 != null && (textView2 = abstractC48368uOx2.fetchVPNInfo) != null) {
                textView2.setSelected(z);
            }
            AbstractC48368uOx abstractC48368uOx3 = c50060vAk.copydefault;
            if (abstractC48368uOx3 != null && (c55001xbh = abstractC48368uOx3.AuCTel) != null) {
                c55001xbh.setEnabled(z && (abstractC48368uOx3 == null || (wyk = abstractC48368uOx3.values) == null || wyk.isChecked()));
            }
            AbstractC48368uOx abstractC48368uOx4 = c50060vAk.copydefault;
            if (abstractC48368uOx4 == null || (textView = abstractC48368uOx4.fIwbmz) == null) {
                return;
            }
            textView.setSelected(z);
        }
    }

    public static final void KWHzl(final C50060vAk c50060vAk, android.view.View view) {
        C55001xbh c55001xbh;
        wYK wyk;
        C55001xbh c55001xbh2;
        wYK wyk2;
        C55001xbh c55001xbh3;
        C55001xbh c55001xbh4;
        AbstractC48368uOx abstractC48368uOx = c50060vAk.copydefault;
        java.lang.String strIsConnected = null;
        int iAhwBna = C33129mqd.AhwBna((abstractC48368uOx == null || (c55001xbh4 = abstractC48368uOx.AEQbTJ) == null) ? null : c55001xbh4.isConnected());
        AbstractC48368uOx abstractC48368uOx2 = c50060vAk.copydefault;
        int iAhwBna2 = C33129mqd.AhwBna((abstractC48368uOx2 == null || (c55001xbh3 = abstractC48368uOx2.DbNXlk) == null) ? null : c55001xbh3.isConnected());
        AbstractC48368uOx abstractC48368uOx3 = c50060vAk.copydefault;
        java.lang.Boolean boolValueOf = (abstractC48368uOx3 == null || (wyk2 = abstractC48368uOx3.values) == null) ? null : java.lang.Boolean.valueOf(wyk2.isChecked());
        AbstractC48368uOx abstractC48368uOx4 = c50060vAk.copydefault;
        int iAhwBna3 = C33129mqd.AhwBna((abstractC48368uOx4 == null || (c55001xbh2 = abstractC48368uOx4.valueOf) == null) ? null : c55001xbh2.isConnected());
        AbstractC48368uOx abstractC48368uOx5 = c50060vAk.copydefault;
        java.lang.Boolean boolValueOf2 = (abstractC48368uOx5 == null || (wyk = abstractC48368uOx5.isConnected) == null) ? null : java.lang.Boolean.valueOf(wyk.isChecked());
        AbstractC48368uOx abstractC48368uOx6 = c50060vAk.copydefault;
        if (abstractC48368uOx6 != null && (c55001xbh = abstractC48368uOx6.AuCTel) != null) {
            strIsConnected = c55001xbh.isConnected();
        }
        java.lang.String strValueOf = java.lang.String.valueOf(strIsConnected);
        ArbitragePriceSetting arbitragePriceSetting = new ArbitragePriceSetting();
        arbitragePriceSetting.setOrdType("arbitrage");
        arbitragePriceSetting.setTakerRange(java.lang.Integer.valueOf(iAhwBna));
        arbitragePriceSetting.setMakerRange(java.lang.Integer.valueOf(iAhwBna2));
        arbitragePriceSetting.setAutomaticTracking(boolValueOf);
        arbitragePriceSetting.setTimeInterval(java.lang.Integer.valueOf(iAhwBna3));
        arbitragePriceSetting.setPauseTracking(boolValueOf2);
        arbitragePriceSetting.setPauseThreshold(strValueOf);
        c50060vAk.KWHzl().OLrzqt(arbitragePriceSetting, new Function2() { // from class: o.vAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50060vAk.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(C50060vAk c50060vAk, boolean z, java.lang.String str) {
        if (z) {
            c50060vAk.dismiss();
        } else {
            C33134mqi.AEQbTJ(str);
        }
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        C55001xbh c55001xbh;
        java.lang.String pauseThreshold;
        C55001xbh c55001xbh2;
        C55001xbh c55001xbh3;
        java.lang.Boolean pauseTracking;
        android.widget.TextView textView7;
        java.lang.Boolean pauseTracking2;
        android.widget.TextView textView8;
        java.lang.Boolean automaticTracking;
        C55001xbh c55001xbh4;
        ArbitragePriceSetting arbitragePriceSetting;
        java.lang.Boolean pauseTracking3;
        java.lang.Boolean automaticTracking2;
        android.widget.TextView textView9;
        java.lang.Boolean pauseTracking4;
        android.widget.TextView textView10;
        java.lang.Boolean automaticTracking3;
        wYK wyk;
        java.lang.Boolean pauseTracking5;
        wYK wyk2;
        java.lang.Boolean automaticTracking4;
        android.widget.TextView textView11;
        java.lang.Boolean automaticTracking5;
        android.widget.TextView textView12;
        java.lang.Boolean automaticTracking6;
        wYK wyk3;
        java.lang.Boolean automaticTracking7;
        C55001xbh c55001xbh5;
        C55001xbh c55001xbh6;
        AbstractC48368uOx abstractC48368uOx = this.copydefault;
        if (abstractC48368uOx != null && (c55001xbh6 = abstractC48368uOx.AEQbTJ) != null) {
            ArbitragePriceSetting arbitragePriceSetting2 = this.AEQbTJ;
            c55001xbh6.setPlainNumericText(java.lang.String.valueOf(arbitragePriceSetting2 != null ? arbitragePriceSetting2.getTakerRange() : null));
        }
        AbstractC48368uOx abstractC48368uOx2 = this.copydefault;
        if (abstractC48368uOx2 != null && (c55001xbh5 = abstractC48368uOx2.DbNXlk) != null) {
            ArbitragePriceSetting arbitragePriceSetting3 = this.AEQbTJ;
            c55001xbh5.setPlainNumericText(java.lang.String.valueOf(arbitragePriceSetting3 != null ? arbitragePriceSetting3.getMakerRange() : null));
        }
        AbstractC48368uOx abstractC48368uOx3 = this.copydefault;
        boolean zBooleanValue = true;
        if (abstractC48368uOx3 != null && (wyk3 = abstractC48368uOx3.values) != null) {
            ArbitragePriceSetting arbitragePriceSetting4 = this.AEQbTJ;
            wyk3.setCheckedIgnoreListener((arbitragePriceSetting4 == null || (automaticTracking7 = arbitragePriceSetting4.getAutomaticTracking()) == null) ? true : automaticTracking7.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx4 = this.copydefault;
        if (abstractC48368uOx4 != null && (textView12 = abstractC48368uOx4.AYXKKw) != null) {
            ArbitragePriceSetting arbitragePriceSetting5 = this.AEQbTJ;
            textView12.setSelected((arbitragePriceSetting5 == null || (automaticTracking6 = arbitragePriceSetting5.getAutomaticTracking()) == null) ? true : automaticTracking6.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx5 = this.copydefault;
        if (abstractC48368uOx5 != null && (textView11 = abstractC48368uOx5.AhwBna) != null) {
            ArbitragePriceSetting arbitragePriceSetting6 = this.AEQbTJ;
            textView11.setSelected((arbitragePriceSetting6 == null || (automaticTracking5 = arbitragePriceSetting6.getAutomaticTracking()) == null) ? true : automaticTracking5.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx6 = this.copydefault;
        if (abstractC48368uOx6 != null && (wyk2 = abstractC48368uOx6.isConnected) != null) {
            ArbitragePriceSetting arbitragePriceSetting7 = this.AEQbTJ;
            wyk2.setEnabled((arbitragePriceSetting7 == null || (automaticTracking4 = arbitragePriceSetting7.getAutomaticTracking()) == null) ? true : automaticTracking4.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx7 = this.copydefault;
        if (abstractC48368uOx7 != null && (wyk = abstractC48368uOx7.isConnected) != null) {
            ArbitragePriceSetting arbitragePriceSetting8 = this.AEQbTJ;
            wyk.setCheckedIgnoreListener((arbitragePriceSetting8 == null || (pauseTracking5 = arbitragePriceSetting8.getPauseTracking()) == null) ? true : pauseTracking5.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx8 = this.copydefault;
        if (abstractC48368uOx8 != null && (textView10 = abstractC48368uOx8.fetchVPNInfo) != null) {
            ArbitragePriceSetting arbitragePriceSetting9 = this.AEQbTJ;
            textView10.setEnabled((arbitragePriceSetting9 == null || (automaticTracking3 = arbitragePriceSetting9.getAutomaticTracking()) == null) ? true : automaticTracking3.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx9 = this.copydefault;
        if (abstractC48368uOx9 != null && (textView9 = abstractC48368uOx9.fetchVPNInfo) != null) {
            ArbitragePriceSetting arbitragePriceSetting10 = this.AEQbTJ;
            textView9.setSelected((arbitragePriceSetting10 == null || (pauseTracking4 = arbitragePriceSetting10.getPauseTracking()) == null) ? true : pauseTracking4.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx10 = this.copydefault;
        if (abstractC48368uOx10 != null && (c55001xbh4 = abstractC48368uOx10.AuCTel) != null) {
            ArbitragePriceSetting arbitragePriceSetting11 = this.AEQbTJ;
            c55001xbh4.setEnabled((arbitragePriceSetting11 == null || (automaticTracking2 = arbitragePriceSetting11.getAutomaticTracking()) == null || automaticTracking2.booleanValue()) && ((arbitragePriceSetting = this.AEQbTJ) == null || (pauseTracking3 = arbitragePriceSetting.getPauseTracking()) == null || pauseTracking3.booleanValue()));
        }
        AbstractC48368uOx abstractC48368uOx11 = this.copydefault;
        if (abstractC48368uOx11 != null && (textView8 = abstractC48368uOx11.fIwbmz) != null) {
            ArbitragePriceSetting arbitragePriceSetting12 = this.AEQbTJ;
            textView8.setEnabled((arbitragePriceSetting12 == null || (automaticTracking = arbitragePriceSetting12.getAutomaticTracking()) == null) ? true : automaticTracking.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx12 = this.copydefault;
        if (abstractC48368uOx12 != null && (textView7 = abstractC48368uOx12.fIwbmz) != null) {
            ArbitragePriceSetting arbitragePriceSetting13 = this.AEQbTJ;
            textView7.setSelected((arbitragePriceSetting13 == null || (pauseTracking2 = arbitragePriceSetting13.getPauseTracking()) == null) ? true : pauseTracking2.booleanValue());
        }
        AbstractC48368uOx abstractC48368uOx13 = this.copydefault;
        if (abstractC48368uOx13 != null && (c55001xbh3 = abstractC48368uOx13.valueOf) != null) {
            ArbitragePriceSetting arbitragePriceSetting14 = this.AEQbTJ;
            if (arbitragePriceSetting14 != null && (pauseTracking = arbitragePriceSetting14.getPauseTracking()) != null) {
                zBooleanValue = pauseTracking.booleanValue();
            }
            c55001xbh3.setSelected(zBooleanValue);
        }
        AbstractC48368uOx abstractC48368uOx14 = this.copydefault;
        if (abstractC48368uOx14 != null && (c55001xbh2 = abstractC48368uOx14.valueOf) != null) {
            ArbitragePriceSetting arbitragePriceSetting15 = this.AEQbTJ;
            c55001xbh2.setPlainNumericText(java.lang.String.valueOf(arbitragePriceSetting15 != null ? arbitragePriceSetting15.getTimeInterval() : null));
        }
        AbstractC48368uOx abstractC48368uOx15 = this.copydefault;
        if (abstractC48368uOx15 != null && (c55001xbh = abstractC48368uOx15.AuCTel) != null) {
            ArbitragePriceSetting arbitragePriceSetting16 = this.AEQbTJ;
            if (arbitragePriceSetting16 == null || (pauseThreshold = arbitragePriceSetting16.getPauseThreshold()) == null) {
                pauseThreshold = "";
            }
            c55001xbh.setPlainNumericText(pauseThreshold);
        }
        AbstractC48368uOx abstractC48368uOx16 = this.copydefault;
        if (abstractC48368uOx16 != null && (textView6 = abstractC48368uOx16.gEmmrt) != null) {
            textView6.setText(C33070mpX.AYXKKw(C55688xof.Application.addOnConfigurationChangedListener) + C33070mpX.AYXKKw(C55688xof.Application.getQueue));
        }
        AbstractC48368uOx abstractC48368uOx17 = this.copydefault;
        if (abstractC48368uOx17 != null && (textView5 = abstractC48368uOx17.fARcdN) != null) {
            textView5.setText(C33070mpX.AYXKKw(C55688xof.Application.lambdanew1) + C33070mpX.AYXKKw(C55688xof.Application.getPlaybackState));
        }
        AbstractC48368uOx abstractC48368uOx18 = this.copydefault;
        if (abstractC48368uOx18 != null && (textView4 = abstractC48368uOx18.fetchVPNInfo) != null) {
            textView4.setText(getString(C55688xof.Application.AnyThread) + ":");
        }
        AbstractC48368uOx abstractC48368uOx19 = this.copydefault;
        if (abstractC48368uOx19 != null && (textView3 = abstractC48368uOx19.AYXKKw) != null) {
            textView3.setText(getString(C55688xof.Application.AnyRes) + ":");
        }
        AbstractC48368uOx abstractC48368uOx20 = this.copydefault;
        if (abstractC48368uOx20 != null && (textView2 = abstractC48368uOx20.KWHzl) != null) {
            textView2.setText(getString(C55688xof.Application.isTransportControlEnabled) + "/" + getString(C55688xof.Application.playFromMediaId) + "±");
        }
        AbstractC48368uOx abstractC48368uOx21 = this.copydefault;
        if (abstractC48368uOx21 == null || (textView = abstractC48368uOx21.AkhnZx) == null) {
            return;
        }
        textView.setText(getString(C55688xof.Application.isTransportControlEnabled) + "/" + getString(C55688xof.Application.playFromMediaId) + "±");
    }

    /* JADX INFO: renamed from: o.vAk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50060vAk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50060vAk c50060vAk) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c50060vAk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity != null) {
                    C33054mpH.OLrzqt(activity, this.OLrzqt.getView());
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public final void AEQbTJ() {
        C55001xbh c55001xbh;
        C55001xbh c55001xbh2;
        C55001xbh c55001xbh3;
        C55001xbh c55001xbh4;
        AbstractC48368uOx abstractC48368uOx = this.copydefault;
        if (abstractC48368uOx != null && (c55001xbh4 = abstractC48368uOx.AEQbTJ) != null) {
            c55001xbh4.setMaxDecimalValue(0);
            c55001xbh4.setShowThousandsSeparator(true);
        }
        AbstractC48368uOx abstractC48368uOx2 = this.copydefault;
        if (abstractC48368uOx2 != null && (c55001xbh3 = abstractC48368uOx2.DbNXlk) != null) {
            c55001xbh3.setMaxDecimalValue(0);
            c55001xbh3.setShowThousandsSeparator(true);
        }
        AbstractC48368uOx abstractC48368uOx3 = this.copydefault;
        if (abstractC48368uOx3 != null && (c55001xbh2 = abstractC48368uOx3.valueOf) != null) {
            c55001xbh2.setMaxDecimalValue(0);
            c55001xbh2.setShowThousandsSeparator(true);
        }
        AbstractC48368uOx abstractC48368uOx4 = this.copydefault;
        if (abstractC48368uOx4 == null || (c55001xbh = abstractC48368uOx4.AuCTel) == null) {
            return;
        }
        c55001xbh.setShowThousandsSeparator(true);
    }
}
