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

/* JADX INFO: renamed from: o.pwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39671pwj extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public oPF AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public float KWHzl = 4.0f;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final java.lang.String OLrzqt(int i) {
        switch (i) {
            case 1:
                return "trigger_interaction";
            case 2:
                return "long_press";
            case 3:
                return "modify_order";
            case 4:
                return "add_tp_sl";
            case 5:
                return "close_position";
            case 6:
                return "adjust_price_scale";
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.DTeKQX;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C39671pwj() {
        final Function0 function0 = new Function0() { // from class: o.pwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39671pwj.EZpvd(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.setting.KlineTradingTechItemFragment$special$$inlined$viewModels$default$1
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.setting.KlineTradingTechItemFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.setting.KlineTradingTechItemFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.setting.KlineTradingTechItemFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.pwj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pwj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C39671pwj copydefault(int i, @NotNull KLineTechPic kLineTechPic) {
            Intrinsics.checkNotNullParameter(kLineTechPic, "");
            C39671pwj c39671pwj = new C39671pwj();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("position", i);
            bundle.putParcelable("item", kLineTechPic);
            c39671pwj.setArguments(bundle);
            return c39671pwj;
        }
    }

    private final pCW OLrzqt() {
        return (pCW) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner EZpvd(C39671pwj c39671pwj) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c39671pwj.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C39842pzv c39842pzv;
        NestedScrollView nestedScrollView;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.AEQbTJ = (oPF) viewDataBindingBind;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            KLineTechPic kLineTechPic = (KLineTechPic) arguments.getParcelable("item");
            if (kLineTechPic == null) {
                kLineTechPic = new KLineTechPic();
            }
            int i = arguments.getInt("position");
            this.copydefault = i;
            KWHzl(i, kLineTechPic);
        }
        oPF opf = this.AEQbTJ;
        if (opf != null && (nestedScrollView = opf.KWHzl) != null) {
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: o.pwk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public final void onScrollChange(NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                    C39671pwj.AEQbTJ(this.EZpvd, nestedScrollView2, i2, i3, i4, i5);
                }
            });
        }
        oPF opf2 = this.AEQbTJ;
        if (opf2 != null && (c39842pzv = opf2.copydefault) != null) {
            c39842pzv.setEmotionClick(new Function1() { // from class: o.pwl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39671pwj.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.pwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39671pwj.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C39671pwj c39671pwj, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        NestedScrollView nestedScrollView2;
        android.view.ViewParent parent;
        NestedScrollView nestedScrollView3;
        android.view.ViewParent parent2;
        NestedScrollView nestedScrollView4;
        android.view.ViewParent parent3;
        Intrinsics.checkNotNullParameter(nestedScrollView, "");
        if (i2 <= 0) {
            oPF opf = c39671pwj.AEQbTJ;
            if (opf == null || (nestedScrollView4 = opf.KWHzl) == null || (parent3 = nestedScrollView4.getParent()) == null) {
                return;
            }
            parent3.requestDisallowInterceptTouchEvent(false);
            return;
        }
        android.view.View childAt = nestedScrollView.getChildAt(0);
        if ((childAt != null ? childAt.getHeight() : 0) <= nestedScrollView.getScrollY() + C33129mqd.AhwBna(java.lang.Integer.valueOf(nestedScrollView.getHeight()))) {
            oPF opf2 = c39671pwj.AEQbTJ;
            if (opf2 == null || (nestedScrollView3 = opf2.KWHzl) == null || (parent2 = nestedScrollView3.getParent()) == null) {
                return;
            }
            parent2.requestDisallowInterceptTouchEvent(false);
            return;
        }
        oPF opf3 = c39671pwj.AEQbTJ;
        if (opf3 == null || (nestedScrollView2 = opf3.KWHzl) == null || (parent = nestedScrollView2.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    public static final Unit OLrzqt(final C39671pwj c39671pwj, final boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLineChartGuide_Sheet_HelpfulButton_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pwh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39671pwj.copydefault(z, c39671pwj, (EventParamsList) obj);
            }
        });
        c39671pwj.OLrzqt().KWHzl(z ? OtcExtraKeys.CRYPTO_ORDER_TYPE : "payment_channel");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(boolean z, C39671pwj c39671pwj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "helpful_type", z ? "helpful" : "not_helpful", false, 4, null);
        EventParamsList.put$default(eventParamsList, "guide_serial", c39671pwj.OLrzqt(c39671pwj.copydefault), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C39671pwj c39671pwj) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39671pwj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl(int i, KLineTechPic kLineTechPic) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.ImageView imageView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.ImageView imageView3;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.ImageView imageView4;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.ImageView imageView5;
        android.widget.TextView textView9;
        android.widget.TextView textView10;
        android.widget.ImageView imageView6;
        android.widget.TextView textView11;
        android.widget.TextView textView12;
        switch (i) {
            case 1:
                oPF opf = this.AEQbTJ;
                if (opf != null && (textView2 = opf.AEQbTJ) != null) {
                    textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QsIRgs));
                }
                oPF opf2 = this.AEQbTJ;
                if (opf2 != null && (textView = opf2.gEmmrt) != null) {
                    textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gbIfDn));
                }
                oPF opf3 = this.AEQbTJ;
                if (opf3 != null && (imageView = opf3.OLrzqt) != null) {
                    java.lang.String focus = kLineTechPic.getFocus();
                    pFQ.KWHzl(imageView, focus != null ? focus : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
            case 2:
                oPF opf4 = this.AEQbTJ;
                if (opf4 != null && (textView4 = opf4.AEQbTJ) != null) {
                    textView4.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QfZsXX));
                }
                oPF opf5 = this.AEQbTJ;
                if (opf5 != null && (textView3 = opf5.gEmmrt) != null) {
                    textView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.Dfm));
                }
                oPF opf6 = this.AEQbTJ;
                if (opf6 != null && (imageView2 = opf6.OLrzqt) != null) {
                    java.lang.String popup = kLineTechPic.getPopup();
                    pFQ.KWHzl(imageView2, popup != null ? popup : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
            case 3:
                oPF opf7 = this.AEQbTJ;
                if (opf7 != null && (textView6 = opf7.AEQbTJ) != null) {
                    textView6.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.iLAtSv));
                }
                oPF opf8 = this.AEQbTJ;
                if (opf8 != null && (textView5 = opf8.gEmmrt) != null) {
                    textView5.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DRGLNw));
                }
                oPF opf9 = this.AEQbTJ;
                if (opf9 != null && (imageView3 = opf9.OLrzqt) != null) {
                    java.lang.String drag = kLineTechPic.getDrag();
                    pFQ.KWHzl(imageView3, drag != null ? drag : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
            case 4:
                oPF opf10 = this.AEQbTJ;
                if (opf10 != null && (textView8 = opf10.AEQbTJ) != null) {
                    textView8.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPQdUnVm));
                }
                oPF opf11 = this.AEQbTJ;
                if (opf11 != null && (textView7 = opf11.gEmmrt) != null) {
                    textView7.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.FhERFw));
                }
                oPF opf12 = this.AEQbTJ;
                if (opf12 != null && (imageView4 = opf12.OLrzqt) != null) {
                    java.lang.String tpsl = kLineTechPic.getTpsl();
                    pFQ.KWHzl(imageView4, tpsl != null ? tpsl : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
            case 5:
                oPF opf13 = this.AEQbTJ;
                if (opf13 != null && (textView10 = opf13.AEQbTJ) != null) {
                    textView10.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QOjuYg));
                }
                oPF opf14 = this.AEQbTJ;
                if (opf14 != null && (textView9 = opf14.gEmmrt) != null) {
                    textView9.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.GCXiNH));
                }
                oPF opf15 = this.AEQbTJ;
                if (opf15 != null && (imageView5 = opf15.OLrzqt) != null) {
                    java.lang.String close = kLineTechPic.getClose();
                    pFQ.KWHzl(imageView5, close != null ? close : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
            case 6:
                oPF opf16 = this.AEQbTJ;
                if (opf16 != null && (textView12 = opf16.AEQbTJ) != null) {
                    textView12.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.OzhFjl));
                }
                oPF opf17 = this.AEQbTJ;
                if (opf17 != null && (textView11 = opf17.gEmmrt) != null) {
                    textView11.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.dXcUrg));
                }
                oPF opf18 = this.AEQbTJ;
                if (opf18 != null && (imageView6 = opf18.OLrzqt) != null) {
                    java.lang.String yaxis = kLineTechPic.getYaxis();
                    pFQ.KWHzl(imageView6, yaxis != null ? yaxis : "", C35964oKf.Activity.zuBGHE, this.KWHzl);
                    break;
                }
                break;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }
}
