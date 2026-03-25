package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC38513pap extends AbstractC32996moC implements View.OnClickListener, InterfaceC37934pGc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public NestedScrollView AEQbTJ;
    public oZZ EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX INFO: renamed from: o.pap$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public final void KWHzl(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.zsXlph;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
    }

    public ViewOnClickListenerC38513pap() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinInfoProfileFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinInfoProfileFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinInfoProfileFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.pap$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pap.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ViewOnClickListenerC38513pap EZpvd() {
            return new ViewOnClickListenerC38513pap();
        }
    }

    public final android.widget.LinearLayout copydefault() {
        android.view.View view = getView();
        if (view != null) {
            return (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.DCUTEI);
        }
        return null;
    }

    private final C37858pDh AEQbTJ() {
        return (C37858pDh) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = (NestedScrollView) view.findViewById(C35964oKf.StateListAnimator.getInterfaceDescriptor);
        AEQbTJ().ejfBZ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.pao
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38513pap.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC38513pap viewOnClickListenerC38513pap, kotlin.Pair pair) {
        if (pair != null) {
            viewOnClickListenerC38513pap.copydefault((java.lang.String) pair.getFirst());
            if (!Intrinsics.EZpvd(pair.getFirst(), (java.lang.Object) "USDT") && !Intrinsics.EZpvd(pair.getFirst(), (java.lang.Object) "USDK") && C33129mqd.OLrzqt((java.lang.CharSequence) pair.getSecond())) {
                viewOnClickListenerC38513pap.KWHzl((java.lang.String) pair.getSecond());
            }
            NestedScrollView nestedScrollView = viewOnClickListenerC38513pap.AEQbTJ;
            if (nestedScrollView == null) {
                Intrinsics.gEmmrt("");
                nestedScrollView = null;
            }
            nestedScrollView.scrollTo(0, 0);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC38513pap, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
    }

    private final void copydefault(java.lang.String str) {
        if (getChildFragmentManager().findFragmentByTag("javaClass") != null) {
            return;
        }
        oZZ ozz = new oZZ();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("symbol", str);
        ozz.setArguments(bundle);
        this.EZpvd = ozz;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C35964oKf.StateListAnimator.zEHIKV;
        oZZ ozz2 = this.EZpvd;
        Intrinsics.copydefault(ozz2);
        fragmentTransactionBeginTransaction.add(i, ozz2, "javaClass").commitAllowingStateLoss();
    }

    @Override // o.InterfaceC37934pGc
    public java.util.List<android.view.View> OLrzqt() {
        android.widget.LinearLayout linearLayoutCopydefault = copydefault();
        if (linearLayoutCopydefault != null) {
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(linearLayoutCopydefault);
            oZZ ozz = this.EZpvd;
            if (ozz != null) {
                arrayListCopydefault.add(ozz.EZpvd());
                android.view.View viewOLrzqt = ozz.OLrzqt();
                if (viewOLrzqt != null) {
                    arrayListCopydefault.add(viewOLrzqt);
                }
            }
            if (arrayListCopydefault != null) {
                return arrayListCopydefault;
            }
        }
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC37934pGc
    public void KWHzl() {
        oZZ ozz = this.EZpvd;
        if (ozz != null) {
            ozz.AEQbTJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oLF.EZpvd.AEQbTJ();
    }
}
