package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
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
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$setupObservers$1;
import com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$setupObservers$2;
import com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$setupObservers$3;
import com.okinc.im.widgets.bottomsheet.viewmodel.MessageReactionsViewModel;
import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oHY extends oHZ {
    public final C35914oIj AkhnZx;
    public C33908nKh djBIcL;
    public final InterfaceC56387yDm isConnected;
    public final C35915oIk values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;
    public final boolean gEmmrt = true;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oId
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oHY.AYXKKw(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oIe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(oHY.djBIcL(this.OLrzqt));
        }
    });
    public java.util.List<ReactionDetail> fetchVPNInfo = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.List<ReactionDetail> list) {
        this.fetchVPNInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.gEmmrt;
    }

    public oHY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MessageReactionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.widgets.bottomsheet.MessageReactionsBottomSheet$special$$inlined$viewModels$default$5
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
        this.AkhnZx = new C35914oIj(new Function1() { // from class: o.oIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oHY.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        this.values = new C35915oIk(new Function1() { // from class: o.oIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oHY.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final oHY OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.util.List<ReactionDetail> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            oHY ohy = new oHY();
            ohy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_CHANNEL_ID", str), C56390yDp.OLrzqt("KEY_MSG_SEQ", java.lang.Long.valueOf(j))));
            ohy.EZpvd(list);
            return ohy;
        }
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AYXKKw(oHY ohy) {
        android.os.Bundle arguments = ohy.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("KEY_CHANNEL_ID") : null;
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.oHZ.EZpvd()V */
    public final long EZpvd() {
        return ((java.lang.Number) this.AYXKKw.getValue()).longValue();
    }

    public static final long djBIcL(oHY ohy) {
        android.os.Bundle arguments = ohy.getArguments();
        if (arguments != null) {
            return arguments.getLong("KEY_MSG_SEQ");
        }
        return 0L;
    }

    public final MessageReactionsViewModel gEmmrt() {
        return (MessageReactionsViewModel) this.isConnected.getValue();
    }

    public static final Unit AEQbTJ(oHY ohy, int i) {
        ohy.gEmmrt().KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(oHY ohy, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ohy.OLrzqt(str);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        bottomSheetBehavior.setPeekHeight(C55298xhM.copydefault(400.0f, contextRequireContext));
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setFitToContents(true);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        bottomSheetBehavior.setExpandedOffset(C55298xhM.copydefault(100.0f, contextRequireContext2));
        bottomSheetBehavior.setState(4);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C33908nKh.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        valueOf();
    }

    private final void valueOf() {
        C33908nKh c33908nKh = this.djBIcL;
        if (c33908nKh != null) {
            RecyclerView recyclerView = c33908nKh.KWHzl;
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutAnimation(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(this.AkhnZx);
            ViewPager2 viewPager2 = c33908nKh.AEQbTJ;
            android.view.View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView2 = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView2 != null) {
                recyclerView2.setNestedScrollingEnabled(false);
            }
            viewPager2.setAdapter(this.values);
            viewPager2.registerOnPageChangeCallback(new Application());
            ViewCompat.setNestedScrollingEnabled(c33908nKh.KWHzl, false);
        }
        if (!gEmmrt().copydefault() && (!this.fetchVPNInfo.isEmpty())) {
            gEmmrt().EZpvd(this.fetchVPNInfo);
        } else if (gEmmrt().copydefault() && this.fetchVPNInfo.isEmpty()) {
            this.fetchVPNInfo = gEmmrt().AEQbTJ();
        }
        AhwBna();
    }

    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            oHY.this.gEmmrt().KWHzl(i);
        }
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MessageReactionsBottomSheet$setupObservers$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new MessageReactionsBottomSheet$setupObservers$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new MessageReactionsBottomSheet$setupObservers$3(this, null), 3, null);
    }

    public final void copydefault(int i) {
        android.widget.TextView textView;
        C33908nKh c33908nKh = this.djBIcL;
        if (c33908nKh == null || (textView = c33908nKh.OLrzqt) == null) {
            return;
        }
        textView.setText(pTD.KWHzl(this, C35399nuc.Fragment.OLrzqt, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), null, 1, null)))));
    }

    public final void OLrzqt(java.lang.String str) {
        gEmmrt().KWHzl(str);
        RxBus.AEQbTJ(new C35250nrl(new WSSendReactionData(djBIcL(), EZpvd(), C56402yEa.EZpvd(new ReactionAction(str, SendReactionAction.REMOVE)))));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }
}
