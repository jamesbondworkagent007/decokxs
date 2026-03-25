package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KLineTechPic;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39601pvS extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm EZpvd;
    public oPH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd(int i) {
        switch (i) {
            case 0:
                return "basic_chart";
            case 1:
                return "zoom";
            case 2:
                return OtcExtraKeys.ORDER;
            case 3:
                return "cost";
            case 4:
                return "countdown";
            case 5:
                return "tv";
            case 6:
                return "buysell";
            default:
                return "theme";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DcMfJK;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C39601pvS() {
        final Function0 function0 = new Function0() { // from class: o.pvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39601pvS.AEQbTJ(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.setting.KlineTechItemFragment$special$$inlined$viewModels$default$1
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.setting.KlineTechItemFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.setting.KlineTechItemFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.setting.KlineTechItemFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.pvS$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pvS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C39601pvS newInstance$default(Application application, int i, KLineTechPic kLineTechPic, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return application.AEQbTJ(i, kLineTechPic);
        }

        public final C39601pvS AEQbTJ(int i, @NotNull KLineTechPic kLineTechPic) {
            Intrinsics.checkNotNullParameter(kLineTechPic, "");
            C39601pvS c39601pvS = new C39601pvS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("position", i);
            bundle.putParcelable("item", kLineTechPic);
            c39601pvS.setArguments(bundle);
            return c39601pvS;
        }
    }

    private final pCW AEQbTJ() {
        return (pCW) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(C39601pvS c39601pvS) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c39601pvS.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C39842pzv c39842pzv;
        NestedScrollView nestedScrollView;
        C39846pzz c39846pzz;
        C39843pzw c39843pzw;
        C39845pzy c39845pzy;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.copydefault = (oPH) viewDataBindingBind;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            oPH oph = this.copydefault;
            if (oph != null && (textView = oph.djBIcL) != null) {
                textView.setText(pEU.copydefault.EZpvd(arguments.getInt("position")));
            }
            KLineTechPic kLineTechPic = (KLineTechPic) arguments.getParcelable("item");
            if (kLineTechPic == null) {
                kLineTechPic = new KLineTechPic();
            }
            int i = arguments.getInt("position");
            if (1 <= i && i < 7) {
                oPH oph2 = this.copydefault;
                if (oph2 != null) {
                    oph2.KWHzl(true);
                }
                oPH oph3 = this.copydefault;
                if (oph3 != null) {
                    oph3.OLrzqt(false);
                }
                oPH oph4 = this.copydefault;
                if (oph4 != null) {
                    oph4.AEQbTJ(false);
                }
                oPH oph5 = this.copydefault;
                if (oph5 != null && (c39845pzy = oph5.KWHzl) != null) {
                    c39845pzy.setContent(kLineTechPic, arguments.getInt("position"));
                }
            } else if (arguments.getInt("position") == 7) {
                oPH oph6 = this.copydefault;
                if (oph6 != null) {
                    oph6.KWHzl(false);
                }
                oPH oph7 = this.copydefault;
                if (oph7 != null) {
                    oph7.AEQbTJ(true);
                }
                oPH oph8 = this.copydefault;
                if (oph8 != null) {
                    oph8.OLrzqt(false);
                }
                oPH oph9 = this.copydefault;
                if (oph9 != null && (c39843pzw = oph9.AEQbTJ) != null) {
                    c39843pzw.setContent(arguments.getInt("position"));
                }
            } else if (arguments.getInt("position") == 0) {
                oPH oph10 = this.copydefault;
                if (oph10 != null) {
                    oph10.KWHzl(false);
                }
                oPH oph11 = this.copydefault;
                if (oph11 != null) {
                    oph11.AEQbTJ(false);
                }
                oPH oph12 = this.copydefault;
                if (oph12 != null) {
                    oph12.OLrzqt(true);
                }
                oPH oph13 = this.copydefault;
                if (oph13 != null && (c39846pzz = oph13.EZpvd) != null) {
                    c39846pzz.setContent(kLineTechPic);
                }
            } else {
                oPH oph14 = this.copydefault;
                if (oph14 != null) {
                    oph14.KWHzl(false);
                }
                oPH oph15 = this.copydefault;
                if (oph15 != null) {
                    oph15.AEQbTJ(false);
                }
                oPH oph16 = this.copydefault;
                if (oph16 != null) {
                    oph16.OLrzqt(false);
                }
            }
        }
        oPH oph17 = this.copydefault;
        if (oph17 != null && (nestedScrollView = oph17.valueOf) != null) {
            nestedScrollView.setOnScrollChangeListener(new ActionBar());
        }
        oPH oph18 = this.copydefault;
        if (oph18 != null && (c39842pzv = oph18.OLrzqt) != null) {
            c39842pzv.setEmotionClick(new Function1() { // from class: o.pvT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39601pvS.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.pwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39601pvS.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.pvS$ActionBar */
    public static final class ActionBar implements NestedScrollView.OnScrollChangeListener {
        public ActionBar() {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            NestedScrollView nestedScrollView2;
            android.view.ViewParent parent;
            NestedScrollView nestedScrollView3;
            android.view.ViewParent parent2;
            NestedScrollView nestedScrollView4;
            android.view.ViewParent parent3;
            Intrinsics.checkNotNullParameter(nestedScrollView, "");
            if (i2 <= 0) {
                oPH oph = C39601pvS.this.copydefault;
                if (oph == null || (nestedScrollView4 = oph.valueOf) == null || (parent3 = nestedScrollView4.getParent()) == null) {
                    return;
                }
                parent3.requestDisallowInterceptTouchEvent(false);
                return;
            }
            android.view.View childAt = nestedScrollView.getChildAt(0);
            if ((childAt != null ? childAt.getHeight() : 0) <= nestedScrollView.getScrollY() + C33129mqd.AhwBna(java.lang.Integer.valueOf(nestedScrollView.getHeight()))) {
                oPH oph2 = C39601pvS.this.copydefault;
                if (oph2 == null || (nestedScrollView3 = oph2.valueOf) == null || (parent2 = nestedScrollView3.getParent()) == null) {
                    return;
                }
                parent2.requestDisallowInterceptTouchEvent(false);
                return;
            }
            oPH oph3 = C39601pvS.this.copydefault;
            if (oph3 == null || (nestedScrollView2 = oph3.valueOf) == null || (parent = nestedScrollView2.getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public static final Unit AEQbTJ(final C39601pvS c39601pvS, final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLineChartGuide_Sheet_HelpfulButton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39601pvS.KWHzl(z, c39601pvS, (EventParamsList) obj);
            }
        });
        c39601pvS.AEQbTJ().KWHzl(z ? OtcExtraKeys.CRYPTO_ORDER_TYPE : "payment_channel");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z, C39601pvS c39601pvS, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "helpful_type", z ? "helpful" : "not_helpful", false, 4, null);
        android.os.Bundle arguments = c39601pvS.getArguments();
        if (arguments != null) {
            EventParamsList.put$default(eventParamsList, "guide_serial", c39601pvS.EZpvd(arguments.getInt("position")), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C39601pvS c39601pvS) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39601pvS, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }
}
