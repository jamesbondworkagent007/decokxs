package o;

import android.view.View;
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
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wil, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53294wil extends AbstractC49945uyC<AbstractC48601uXl, EmptyPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public final int AhwBna = C48033uCm.Activity.Dfm;
    public final InterfaceC56387yDm OLrzqt;
    public SpotDcaAdvancedParams copydefault;

    /* JADX INFO: renamed from: o.wil$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
        return this.AhwBna;
    }

    @Override // o.AbstractC49945uyC
    public boolean AkhnZx() {
        return true;
    }

    public static final /* synthetic */ AbstractC48601uXl KWHzl(C53294wil c53294wil) {
        return c53294wil.values();
    }

    public C53294wil() {
        final Function0 function0 = new Function0() { // from class: o.wiq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53294wil.AYXKKw(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAppendConditionDialog$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SpotDcaManualPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAppendConditionDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAppendConditionDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAppendConditionDialog$special$$inlined$viewModels$default$4
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
        this.AEQbTJ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpotDcaManualPresenter isConnected() {
        return (SpotDcaManualPresenter) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner AYXKKw(C53294wil c53294wil) {
        androidx.fragment.app.Fragment parentFragment = c53294wil.getParentFragment();
        return parentFragment != null ? parentFragment : c53294wil;
    }

    /* JADX INFO: renamed from: o.wil$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wil.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53294wil c53294wil = new C53294wil();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("append_enable", z);
            c53294wil.setArguments(bundle);
            c53294wil.show(fragmentManager, "SpotDcaAppendConditionDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
        fJNWhG();
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.gVEiQJ));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final void ejfBZ() {
        SpotDcaAdvancedParams value = isConnected().valueOf().getValue();
        this.copydefault = value != null ? SpotDcaAdvancedParams.copy$default(value, null, null, null, null, null, null, null, 127, null) : null;
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? arguments.getBoolean("append_enable") : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fJNWhG() {
        BotRangeConfig volMult;
        BotRangeConfig botRangeConfig;
        BotRangeConfig pxStepsMult;
        BotRangeConfig botRangeConfig2;
        StrategyConfigInfo value = isConnected().KWHzl().getValue();
        java.lang.String str = "0.1";
        java.lang.String str2 = "10";
        if ((value != null ? value.getVolMult() : null) == null) {
            volMult = new BotRangeConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 63, (DefaultConstructorMarker) null);
            SpotDcaAdvancedParams spotDcaAdvancedParams = this.copydefault;
            volMult.setDefault(spotDcaAdvancedParams != null ? spotDcaAdvancedParams.AhwBna() : null);
            volMult.setMin("0.1");
            volMult.setMax("10");
        } else {
            volMult = value.getVolMult();
            if (volMult != null) {
                SpotDcaAdvancedParams spotDcaAdvancedParams2 = this.copydefault;
                volMult.setDefault(spotDcaAdvancedParams2 != null ? spotDcaAdvancedParams2.AhwBna() : null);
                java.lang.String min = volMult.getMin();
                if (min == null || min.length() == 0) {
                    min = "0.1";
                }
                volMult.setMin(min);
                java.lang.String max = volMult.getMax();
                if (max == null || max.length() == 0) {
                    max = "10";
                }
                volMult.setMax(max);
            } else {
                botRangeConfig = null;
                C47988uAv c47988uAv = values().OLrzqt;
                c47988uAv.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
                c47988uAv.setMaxDecimal(2);
                C52658wTo c52658wTo = C52658wTo.AEQbTJ;
                Intrinsics.copydefault(c47988uAv);
                c52658wTo.copydefault(c47988uAv, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Function1() { // from class: o.win
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53294wil.AhwBna((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.wir
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53294wil.gEmmrt((java.lang.String) obj);
                    }
                });
                c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wis
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53294wil.OLrzqt(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
                    }
                });
                c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.wip
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53294wil.KWHzl(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
                    }
                });
                C47988uAv.setInputLayoutState$default(c47988uAv, !this.AEQbTJ ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
                if ((value == null ? value.getPxStepsMult() : null) != null) {
                    pxStepsMult = new BotRangeConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 63, (DefaultConstructorMarker) null);
                    SpotDcaAdvancedParams spotDcaAdvancedParams3 = this.copydefault;
                    pxStepsMult.setDefault(spotDcaAdvancedParams3 != null ? spotDcaAdvancedParams3.OLrzqt() : null);
                    pxStepsMult.setMin("0.1");
                    pxStepsMult.setMax("10");
                } else {
                    pxStepsMult = value.getPxStepsMult();
                    if (pxStepsMult != null) {
                        SpotDcaAdvancedParams spotDcaAdvancedParams4 = this.copydefault;
                        pxStepsMult.setDefault(spotDcaAdvancedParams4 != null ? spotDcaAdvancedParams4.OLrzqt() : null);
                        java.lang.String min2 = pxStepsMult.getMin();
                        if (min2 != null && min2.length() != 0) {
                            str = min2;
                        }
                        pxStepsMult.setMin(str);
                        java.lang.String max2 = pxStepsMult.getMax();
                        if (max2 != null && max2.length() != 0) {
                            str2 = max2;
                        }
                        pxStepsMult.setMax(str2);
                    } else {
                        botRangeConfig2 = null;
                        C47988uAv c47988uAv2 = values().copydefault;
                        c47988uAv2.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
                        c47988uAv2.setMaxDecimal(2);
                        Intrinsics.copydefault(c47988uAv2);
                        c52658wTo.copydefault(c47988uAv2, botRangeConfig2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Function1() { // from class: o.wit
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C53294wil.djBIcL((java.lang.String) obj);
                            }
                        }, new Function1() { // from class: o.wiu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C53294wil.valueOf((java.lang.String) obj);
                            }
                        });
                        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.wiv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C53294wil.KWHzl(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
                            }
                        });
                        c47988uAv2.setOnFocusChangeCallback(new Function2() { // from class: o.wix
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C53294wil.EZpvd(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        });
                        C47988uAv.setInputLayoutState$default(c47988uAv2, this.AEQbTJ ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
                    }
                }
                botRangeConfig2 = pxStepsMult;
                C47988uAv c47988uAv22 = values().copydefault;
                c47988uAv22.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
                c47988uAv22.setMaxDecimal(2);
                Intrinsics.copydefault(c47988uAv22);
                c52658wTo.copydefault(c47988uAv22, botRangeConfig2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Function1() { // from class: o.wit
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53294wil.djBIcL((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.wiu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53294wil.valueOf((java.lang.String) obj);
                    }
                });
                c47988uAv22.setOnTextChangeCallback(new Function2() { // from class: o.wiv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53294wil.KWHzl(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
                    }
                });
                c47988uAv22.setOnFocusChangeCallback(new Function2() { // from class: o.wix
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53294wil.EZpvd(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
                    }
                });
                C47988uAv.setInputLayoutState$default(c47988uAv22, this.AEQbTJ ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
            }
        }
        botRangeConfig = volMult;
        C47988uAv c47988uAv3 = values().OLrzqt;
        c47988uAv3.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
        c47988uAv3.setMaxDecimal(2);
        C52658wTo c52658wTo2 = C52658wTo.AEQbTJ;
        Intrinsics.copydefault(c47988uAv3);
        c52658wTo2.copydefault(c47988uAv3, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Function1() { // from class: o.win
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.AhwBna((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.gEmmrt((java.lang.String) obj);
            }
        });
        c47988uAv3.setOnTextChangeCallback(new Function2() { // from class: o.wis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53294wil.OLrzqt(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv3.setOnFocusChangeCallback(new Function2() { // from class: o.wip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53294wil.KWHzl(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C47988uAv.setInputLayoutState$default(c47988uAv3, !this.AEQbTJ ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        if ((value == null ? value.getPxStepsMult() : null) != null) {
        }
        botRangeConfig2 = pxStepsMult;
        C47988uAv c47988uAv222 = values().copydefault;
        c47988uAv222.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult));
        c47988uAv222.setMaxDecimal(2);
        Intrinsics.copydefault(c47988uAv222);
        c52658wTo2.copydefault(c47988uAv222, botRangeConfig2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Function1() { // from class: o.wit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.djBIcL((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.valueOf((java.lang.String) obj);
            }
        });
        c47988uAv222.setOnTextChangeCallback(new Function2() { // from class: o.wiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53294wil.KWHzl(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv222.setOnFocusChangeCallback(new Function2() { // from class: o.wix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53294wil.EZpvd(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C47988uAv.setInputLayoutState$default(c47988uAv222, this.AEQbTJ ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
    }

    public static final java.lang.String AhwBna(java.lang.String str) {
        if (str != null) {
            return C33129mqd.formatS$default(str, 2, java.lang.Boolean.FALSE, null, 4, null);
        }
        return null;
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.OLrzqt(str, 2);
        }
        return null;
    }

    public static final Unit OLrzqt(C53294wil c53294wil, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null && str.length() > 0) {
            c53294wil.EZpvd(c47988uAv);
        } else {
            c47988uAv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53294wil c53294wil, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            c53294wil.AYXKKw("amount_multiplier");
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str != null) {
            return C33129mqd.formatS$default(str, 2, java.lang.Boolean.FALSE, null, 4, null);
        }
        return null;
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.OLrzqt(str, 2);
        }
        return null;
    }

    public static final Unit KWHzl(C53294wil c53294wil, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null && str.length() > 0) {
            c53294wil.EZpvd(c47988uAv);
        } else {
            c47988uAv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53294wil c53294wil, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            c53294wil.AYXKKw("price_multiplier");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wil$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53294wil AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53294wil c53294wil) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c53294wil;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C53294wil c53294wil = this.AEQbTJ;
                C47988uAv c47988uAv = C53294wil.KWHzl(c53294wil).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                if (c53294wil.EZpvd(c47988uAv)) {
                    C53294wil c53294wil2 = this.AEQbTJ;
                    C47988uAv c47988uAv2 = C53294wil.KWHzl(c53294wil2).copydefault;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                    if (c53294wil2.EZpvd(c47988uAv2)) {
                        SpotDcaAdvancedParams spotDcaAdvancedParams = this.AEQbTJ.copydefault;
                        if (spotDcaAdvancedParams != null) {
                            spotDcaAdvancedParams.KWHzl(C53294wil.KWHzl(this.AEQbTJ).OLrzqt.AkhnZx());
                        }
                        SpotDcaAdvancedParams spotDcaAdvancedParams2 = this.AEQbTJ.copydefault;
                        if (spotDcaAdvancedParams2 != null) {
                            spotDcaAdvancedParams2.copydefault(C53294wil.KWHzl(this.AEQbTJ).copydefault.AkhnZx());
                        }
                        SpotDcaAdvancedParams spotDcaAdvancedParams3 = this.AEQbTJ.copydefault;
                        if (spotDcaAdvancedParams3 != null) {
                            this.AEQbTJ.isConnected().AEQbTJ(spotDcaAdvancedParams3);
                        }
                        this.AEQbTJ.copydefault();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wil$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53294wil OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53294wil c53294wil) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c53294wil;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean EZpvd(C47988uAv c47988uAv) {
        if (c47988uAv.isConnected() == InputLayoutState.GREY_UN_CLICKABLE) {
            return true;
        }
        C52658wTo.AEQbTJ.OLrzqt(c47988uAv, c47988uAv.fARcdN());
        return !c47988uAv.getFieldNames();
    }

    private final void fARcdN() {
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        TradeLiveData<java.lang.String> tradeLiveDataFARcdN = isConnected().fARcdN();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataFARcdN.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ = isConnected().ejfBZ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.wio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C53294wil c53294wil, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(c53294wil.isConnected().djBIcL().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = c53294wil.values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        c53294wil.values().KWHzl.setText(str);
        C47988uAv.setInputErrorMsg$default(c53294wil.values().copydefault, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53294wil c53294wil, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd(c53294wil.isConnected().djBIcL().getValue(), java.lang.Boolean.TRUE)) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = c53294wil.values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        c53294wil.values().KWHzl.setText(str);
        C47988uAv.setInputErrorMsg$default(c53294wil.values().copydefault, null, 1, null);
        return Unit.INSTANCE;
    }

    private final void AYXKKw(final java.lang.String str) {
        C32866mlf.onEvent$default("DCABotPlaceOrder_AdvancedSetting_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.wij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53294wil.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "spot_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        values().OLrzqt.AEQbTJ();
        values().copydefault.AEQbTJ();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
