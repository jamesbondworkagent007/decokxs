package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.bean.SelectedNetworkData;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$observeViewModelState$1;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$observeViewModelState$2;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$observeViewModelState$3;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$observeViewModelState$4;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C16096edV;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18082fbg extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public C16517elS KWHzl;
    public boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.fbg$Activity */
    /* JADX INFO: loaded from: classes5.dex */
    public interface Activity {
        void copydefault(@NotNull SelectedNetworkData selectedNetworkData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DGUQLIekVPG;
    }

    public C18082fbg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C16096edV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.fbl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18082fbg.valueOf(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18013faQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.OLrzqt = true;
    }

    public final C16096edV KWHzl() {
        return (C16096edV) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C18013faQ EZpvd() {
        return (C18013faQ) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C18082fbg c18082fbg) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c18082fbg.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: o.fbg$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fbg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C18082fbg KWHzl(long j, boolean z) {
            C18082fbg c18082fbg = new C18082fbg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("chain_id", j);
            bundle.putBoolean("showTotalAsset", z);
            c18082fbg.setArguments(bundle);
            return c18082fbg;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OKAnchorSelection oKAnchorSelection;
        C55230xfy c55230xfyDjBIcL;
        OKAnchorSelection oKAnchorSelection2;
        C55173xeu c55173xeuCopydefault;
        OKAnchorSelection oKAnchorSelection3;
        C55230xfy c55230xfyDjBIcL2;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = view.getContext();
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getBoolean("showTotalAsset", true) : true;
        C16517elS c16517elSOLrzqt = C16517elS.OLrzqt(view);
        this.KWHzl = c16517elSOLrzqt;
        if (c16517elSOLrzqt != null && (oKAnchorSelection3 = c16517elSOLrzqt.KWHzl) != null && (c55230xfyDjBIcL2 = oKAnchorSelection3.djBIcL()) != null && (oKEditTextKWHzl = c55230xfyDjBIcL2.KWHzl()) != null) {
            oKEditTextKWHzl.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        }
        C16517elS c16517elS = this.KWHzl;
        if (c16517elS != null && (oKAnchorSelection2 = c16517elS.KWHzl) != null && (c55173xeuCopydefault = oKAnchorSelection2.copydefault()) != null) {
            java.lang.String string = context.getString(C13754dXa.FragmentManager.trackPipAnimationHintViewpositionInWindow);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuCopydefault.setSubTitle((java.lang.CharSequence) string);
            Intrinsics.copydefault(context);
            c55173xeuCopydefault.setPadding(C55298xhM.OLrzqt(32, context), C55298xhM.OLrzqt(24, context), C55298xhM.OLrzqt(32, context), C55298xhM.OLrzqt(24, context));
            ViewGroup.LayoutParams layoutParams = c55173xeuCopydefault.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C55298xhM.OLrzqt(56, context);
                marginLayoutParams.bottomMargin = C55298xhM.OLrzqt(80, context);
                c55173xeuCopydefault.setLayoutParams(marginLayoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C16517elS c16517elS2 = this.KWHzl;
        if (c16517elS2 != null && (oKAnchorSelection = c16517elS2.KWHzl) != null && (c55230xfyDjBIcL = oKAnchorSelection.djBIcL()) != null) {
            c55230xfyDjBIcL.setCursorStyleWeb3();
        }
        copydefault();
        OLrzqt();
    }

    public final void copydefault() {
        final OKAnchorSelection oKAnchorSelection;
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final C17403fEa c17403fEa = new C17403fEa(ContextCompat.getColor(context, C52761wXj.Activity.fkESqH));
        C16517elS c16517elS = this.KWHzl;
        if (c16517elS == null || (oKAnchorSelection = c16517elS.KWHzl) == null) {
            return;
        }
        C55230xfy c55230xfyDjBIcL = oKAnchorSelection.djBIcL();
        ViewGroup.LayoutParams layoutParams = c55230xfyDjBIcL.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.OLrzqt(16, context);
            marginLayoutParams.setMarginStart(C55298xhM.OLrzqt(24, context));
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(24, context));
            c55230xfyDjBIcL.setLayoutParams(marginLayoutParams);
            oKAnchorSelection.setSuspensionTitleBackgroundColor(ContextCompat.getColor(context, C52761wXj.Activity.copydefault));
            oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.fbk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C18082fbg.KWHzl(context, this, c17403fEa, oKAnchorSelection, (C55043xcW) obj, obj2);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(android.content.Context context, final C18082fbg c18082fbg, C17403fEa c17403fEa, OKAnchorSelection oKAnchorSelection, C55043xcW c55043xcW, java.lang.Object obj) {
        java.lang.String strKWHzl;
        java.lang.String str;
        java.lang.String string;
        android.widget.ImageView imageView;
        java.lang.String strAEQbTJ = "";
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final SelectedNetworkData selectedNetworkData = (SelectedNetworkData) obj;
        android.view.View view = c55043xcW.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setPaddingRelative(C55298xhM.OLrzqt(8, context), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        android.widget.TextView textView = (android.widget.TextView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
        if (textView != null) {
            textView.setText(c18082fbg.KWHzl().copydefault(c17403fEa, selectedNetworkData.EZpvd()));
        }
        int i = C13754dXa.ActionBar.DPHOMC;
        if (selectedNetworkData.AkhnZx()) {
            strKWHzl = C13821dZn.EZpvd.OLrzqt(C54880xYt.formatValuationFromAsset$default(selectedNetworkData.gEmmrt(), null, false, C14455dll.KWHzl.copydefault(selectedNetworkData.gEmmrt()), false, 11, null));
        } else {
            strKWHzl = C13821dZn.EZpvd.KWHzl(C54880xYt.formatValuationFromAsset$default(selectedNetworkData.gEmmrt(), null, false, C14455dll.KWHzl.copydefault(selectedNetworkData.gEmmrt()), false, 11, null));
        }
        c55043xcW.EZpvd(i, strKWHzl);
        if (!selectedNetworkData.values()) {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, false);
            c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, true);
            android.widget.Button button = (android.widget.Button) c55043xcW.EZpvd(C13754dXa.ActionBar.setMediaUri);
            if (button != null) {
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(c18082fbg.KWHzl().copydefault() ? C55298xhM.OLrzqt(24, context) : 0);
                    button.setLayoutParams(marginLayoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: o.fbe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C18082fbg.EZpvd(this.KWHzl, selectedNetworkData, view2);
                    }
                });
            }
        } else {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, false);
        }
        if (selectedNetworkData.DbNXlk() && selectedNetworkData.values()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
            if (imageView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(c18082fbg.KWHzl().copydefault() ? C55298xhM.OLrzqt(24, context) : 0);
                    imageView2.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            if (imageView2 != null) {
                imageView2.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.OJuSTm)));
            }
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, true);
        } else {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, false);
        }
        if (selectedNetworkData.AkhnZx()) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView3 != null) {
                Glide.KWHzl(imageView3).OLrzqt(java.lang.Integer.valueOf(selectedNetworkData.OLrzqt())).EZpvd(imageView3);
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) selectedNetworkData.AEQbTJ())) {
                strAEQbTJ = selectedNetworkData.AEQbTJ();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(selectedNetworkData.AYXKKw());
                java.lang.String strOLrzqt = (chWlaJM == null || (string = chWlaJM.toString()) == null) ? null : C9700baY.OLrzqt(string);
                if (strOLrzqt != null) {
                    str = strOLrzqt;
                }
                imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
                if (imageView != null) {
                    C14725dqq.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 0, false, 60, null);
                }
            }
            str = strAEQbTJ;
            imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView != null) {
            }
        }
        if (c18082fbg.OLrzqt && !selectedNetworkData.isConnected()) {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.DPHOMC, true);
            android.view.View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) (viewEZpvd != null ? viewEZpvd.getLayoutParams() : null);
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = C55298xhM.KWHzl(15.0f, context);
            }
            if (viewEZpvd != null) {
                viewEZpvd.setLayoutParams(marginLayoutParams3);
            }
        } else {
            android.view.View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.DPHOMC);
            if (viewEZpvd2 != null) {
                viewEZpvd2.setVisibility(8);
            }
            android.view.View viewEZpvd3 = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) (viewEZpvd3 != null ? viewEZpvd3.getLayoutParams() : null);
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = C55298xhM.KWHzl(25.0f, context);
            }
            if (viewEZpvd3 != null) {
                viewEZpvd3.setLayoutParams(marginLayoutParams4);
            }
        }
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C18082fbg.AEQbTJ(selectedNetworkData, c18082fbg, view2);
            }
        });
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.fbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C18082fbg.EZpvd(this.EZpvd, (java.lang.CharSequence) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C18082fbg c18082fbg, SelectedNetworkData selectedNetworkData, android.view.View view) {
        c18082fbg.copydefault(selectedNetworkData);
    }

    public static final void AEQbTJ(SelectedNetworkData selectedNetworkData, C18082fbg c18082fbg, android.view.View view) {
        if (selectedNetworkData.values()) {
            c18082fbg.EZpvd(selectedNetworkData);
        } else {
            c18082fbg.copydefault(selectedNetworkData);
        }
    }

    public static final Unit EZpvd(C18082fbg c18082fbg, java.lang.CharSequence charSequence) {
        c18082fbg.KWHzl().KWHzl(charSequence);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ChooseNetworkFragment$observeViewModelState$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new ChooseNetworkFragment$observeViewModelState$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new ChooseNetworkFragment$observeViewModelState$3(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new ChooseNetworkFragment$observeViewModelState$4(this, null), 3, null);
    }

    public final void copydefault(final SelectedNetworkData selectedNetworkData) {
        C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(selectedNetworkData.copydefault());
        c9930beqEZpvd.copydefault(new Function1() { // from class: o.fbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18082fbg.KWHzl(this.EZpvd, selectedNetworkData, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c9930beqEZpvd.show(getParentFragmentManager(), "ChainUpdateBottomSubFragment");
    }

    public static final Unit KWHzl(C18082fbg c18082fbg, SelectedNetworkData selectedNetworkData, boolean z) {
        if (z) {
            c18082fbg.EZpvd().AEQbTJ();
            c18082fbg.EZpvd(selectedNetworkData);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(SelectedNetworkData selectedNetworkData) {
        KeyEventDispatcher.Component activity = getActivity();
        Activity activity2 = activity instanceof Activity ? (Activity) activity : null;
        if (activity2 != null) {
            activity2.copydefault(selectedNetworkData);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        OKAnchorSelection oKAnchorSelection;
        Intrinsics.checkNotNullParameter(str, "");
        C16517elS c16517elS = this.KWHzl;
        if (c16517elS == null || (oKAnchorSelection = c16517elS.KWHzl) == null) {
            return;
        }
        oKAnchorSelection.djBIcL().KWHzl().setText("");
        KWHzl().KWHzl("");
        C16096edV.Activity activityKWHzl = KWHzl().KWHzl(str);
        if (activityKWHzl == null) {
            return;
        }
        int iCopydefault = oKAnchorSelection.copydefault(activityKWHzl.EZpvd());
        int iKWHzl = activityKWHzl.KWHzl();
        RecyclerView recyclerViewAYXKKw = oKAnchorSelection.AYXKKw();
        RecyclerView.LayoutManager layoutManager = recyclerViewAYXKKw.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        final int i = iCopydefault + iKWHzl;
        recyclerViewAYXKKw.post(new java.lang.Runnable() { // from class: o.fbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18082fbg.AEQbTJ(linearLayoutManager, i);
            }
        });
    }

    public static final void AEQbTJ(LinearLayoutManager linearLayoutManager, int i) {
        linearLayoutManager.scrollToPositionWithOffset(i, C55298xhM.dp2px$default(40.0f, null, 1, null));
    }
}
