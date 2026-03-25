package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.AddressTrackerFilterViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheetParams;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.ui.NetworkOptionParams;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28026kMd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25747jEw extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public hEN OLrzqt;
    public int copydefault;
    public final InterfaceC56387yDm gEmmrt;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.copydefault = i;
    }

    public C25747jEw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressTrackerFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = C23272hvB.KWHzl.OLrzqt().getSymbol();
        this.copydefault = 2;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheet$special$$inlined$activityViewModels$default$3
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

    public final TrackerFilterBottomSheetParams AEQbTJ() {
        TrackerFilterBottomSheetParams trackerFilterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (trackerFilterBottomSheetParams = (TrackerFilterBottomSheetParams) BundleCompat.getParcelable(arguments, "key.trackerFilterBottomSheetParams", TrackerFilterBottomSheetParams.class)) == null) ? TrackerFilterBottomSheetParams.Companion.OLrzqt() : trackerFilterBottomSheetParams;
    }

    public final AddressTrackerFilterViewModel OLrzqt() {
        return (AddressTrackerFilterViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackerViewModel EZpvd() {
        return (TrackerViewModel) this.EZpvd.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().KWHzl(), null, new PictureInPictureParams(), 2, null);
    }

    /* JADX INFO: renamed from: o.jEw$PictureInPictureParams */
    public static final class PictureInPictureParams<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C25748jEx c25748jEx, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            C54946xaf binding = C25747jEw.this.getBinding();
            android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
            wYF wyf = view instanceof wYF ? (wYF) view : null;
            if (wyf == null) {
                return Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(c25748jEx.OLrzqt());
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(c25748jEx.KWHzl());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.notifyNotificationWithChannel));
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = hEN.copydefault(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        TrackerTxnListFilter trackerTxnListFilterAEQbTJ = AEQbTJ().AEQbTJ();
        if (trackerTxnListFilterAEQbTJ == null) {
            trackerTxnListFilterAEQbTJ = AEQbTJ().copydefault();
        }
        if (trackerTxnListFilterAEQbTJ.gEmmrt()) {
            EZpvd(trackerTxnListFilterAEQbTJ.AYXKKw());
        } else {
            hEN hen = this.OLrzqt;
            if (hen != null && (linearLayout = hen.AkhnZx) != null) {
                linearLayout.setVisibility(8);
            }
        }
        EZpvd(trackerTxnListFilterAEQbTJ);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        java.lang.String string = requireContext().getString(C23274hvD.Fragment.dpErvT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wyf.setPrimaryText(string);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(80);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new LoaderManager(c52794wYpCopydefault2, 1000L, this));
        }
        java.lang.String string2 = requireContext().getString(C23274hvD.Fragment.sanrWj);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        wyf.setSecondaryText(string2);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new SharedElementCallback(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public final void EZpvd(java.lang.String str) {
        C28055kNf c28055kNf;
        android.widget.LinearLayout linearLayout;
        java.util.List<TypeOptionParams> listAYXKKw = AEQbTJ().AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        for (TypeOptionParams typeOptionParams : listAYXKKw) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) typeOptionParams.OLrzqt());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C28060kNk(typeOptionParams.copydefault(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        hEN hen = this.OLrzqt;
        if (hen != null && (linearLayout = hen.AkhnZx) != null) {
            linearLayout.setVisibility(0);
        }
        hEN hen2 = this.OLrzqt;
        if (hen2 == null || (c28055kNf = hen2.fIwbmz) == null) {
            return;
        }
        c28055kNf.setSpanCount(3);
        c28055kNf.setCallback(new Dialog());
        c28055kNf.setData(arrayList, str);
    }

    /* JADX INFO: renamed from: o.jEw$Dialog */
    public final /* synthetic */ class Dialog implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C25747jEw.this, C25747jEw.class, "onTypeChange", "onTypeChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C25747jEw.this.OLrzqt(str);
        }
    }

    public final void EZpvd(TrackerTxnListFilter trackerTxnListFilter) {
        hEN hen = this.OLrzqt;
        if (hen != null) {
            C28055kNf c28055kNf = hen.fARcdN;
            c28055kNf.setSpanCount(2);
            c28055kNf.setCallback(new StateListAnimator());
            java.util.List<NetworkOptionParams> listKWHzl = AEQbTJ().KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            for (NetworkOptionParams networkOptionParams : listKWHzl) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(c28055kNf.getContext(), C52761wXj.LoaderManager.zuBGHE);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) networkOptionParams.AEQbTJ());
                spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
                arrayList.add(new C28060kNk(networkOptionParams.KWHzl(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
            }
            c28055kNf.setData(arrayList, trackerTxnListFilter.valueOf());
            if (trackerTxnListFilter.gEmmrt()) {
                android.widget.LinearLayout linearLayout = hen.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                C28024kMb c28024kMb = hen.fJNWhG;
                c28024kMb.EZpvd().setSpanCount(3);
                c28024kMb.setCallback(new ActionBar());
                InterfaceC28026kMd.TaskDescription.setData$default(c28024kMb, AEQbTJ().EZpvd(), trackerTxnListFilter.AhwBna(), null, 4, null);
                Intrinsics.copydefault(c28024kMb);
            } else {
                android.widget.LinearLayout linearLayout2 = hen.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
            }
            if (trackerTxnListFilter.gEmmrt()) {
                android.widget.LinearLayout linearLayout3 = hen.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(8);
            } else {
                android.widget.LinearLayout linearLayout4 = hen.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(0);
                C28034kMl c28034kMl = hen.isConnected;
                c28034kMl.setCallback(new Application());
                InterfaceC28026kMd.TaskDescription.setData$default(c28034kMl, yDY.AhwBna(), trackerTxnListFilter.OLrzqt(), null, 4, null);
                c28034kMl.EZpvd(false);
                Intrinsics.copydefault(c28034kMl);
            }
            C28034kMl c28034kMl2 = hen.values;
            c28034kMl2.setCallback(new Activity());
            InterfaceC28026kMd.TaskDescription.setData$default(c28034kMl2, yDY.AhwBna(), trackerTxnListFilter.KWHzl(), null, 4, null);
            c28034kMl2.EZpvd(false);
            hen.valueOf.setText(C33069mpW.copydefault(C23274hvD.Fragment.emit, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", this.AEQbTJ))));
            C28029kMg c28029kMg = hen.ejfBZ;
            c28029kMg.setCallback(new Fragment());
            InterfaceC28026kMd.TaskDescription.setData$default(c28029kMg, yDY.AhwBna(), trackerTxnListFilter.EZpvd(), null, 4, null);
            c28029kMg.AEQbTJ(true);
            hen.KWHzl.setText(C33069mpW.copydefault(C23274hvD.Fragment.trackPipAnimationHintView, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", this.AEQbTJ))));
            C28029kMg c28029kMg2 = hen.fetchVPNInfo;
            c28029kMg2.setCallback(new PendingIntent());
            InterfaceC28026kMd.TaskDescription.setData$default(c28029kMg2, yDY.AhwBna(), trackerTxnListFilter.copydefault(), null, 4, null);
            c28029kMg2.AEQbTJ(true);
            hen.AhwBna.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.Cancellable));
            C28034kMl c28034kMl3 = hen.AuCTel;
            c28034kMl3.setCallback(new FragmentManager());
            InterfaceC28026kMd.TaskDescription.setData$default(c28034kMl3, yDY.AhwBna(), trackerTxnListFilter.djBIcL(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.jEw$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C25747jEw.this, C25747jEw.class, "onNetworkChange", "onNetworkChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C25747jEw.this.AEQbTJ(str);
        }
    }

    /* JADX INFO: renamed from: o.jEw$ActionBar */
    public final /* synthetic */ class ActionBar implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onVolumeRangeSelectionChange", "onVolumeRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.OLrzqt(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.jEw$Application */
    public final /* synthetic */ class Application implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onBuyAddressSelectionChange", "onBuyAddressSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.valueOf(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.jEw$Activity */
    public final /* synthetic */ class Activity implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onHolderRangeSelectionChange", "onHolderRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.copydefault(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.jEw$Fragment */
    public final /* synthetic */ class Fragment implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onMarketCapRangeSelectionChange", "onMarketCapRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.AEQbTJ(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.jEw$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25747jEw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C25747jEw c25747jEw) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c25747jEw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object next;
            java.lang.String strAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TrackerTxnListFilter trackerTxnListFilterAEQbTJ = this.copydefault.OLrzqt().KWHzl().getValue().AEQbTJ();
                this.copydefault.EZpvd().EZpvd(trackerTxnListFilterAEQbTJ);
                jBN jbn = jBN.copydefault;
                java.util.Iterator<T> it = this.copydefault.AEQbTJ().KWHzl().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((NetworkOptionParams) next).KWHzl(), (java.lang.Object) trackerTxnListFilterAEQbTJ.valueOf())) {
                            break;
                        }
                    }
                }
                NetworkOptionParams networkOptionParams = (NetworkOptionParams) next;
                if (networkOptionParams == null || (strAEQbTJ = networkOptionParams.AEQbTJ()) == null) {
                    strAEQbTJ = "all";
                }
                jbn.AEQbTJ(trackerTxnListFilterAEQbTJ, strAEQbTJ);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.jEw$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C25747jEw EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C25747jEw c25747jEw) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c25747jEw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.FILTER_RESET, null, null, false, 14, null);
                this.EZpvd.EZpvd().EZpvd(this.EZpvd.AEQbTJ().copydefault());
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.jEw$PendingIntent */
    public final /* synthetic */ class PendingIntent implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onLiquidityRangeSelectionChange", "onLiquidityRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.EZpvd(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.jEw$FragmentManager */
    public final /* synthetic */ class FragmentManager implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C25747jEw.this, C25747jEw.class, "onTokenAgeRangeSelectionChange", "onTokenAgeRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C25747jEw.this.KWHzl(priceRangeFilter, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        OLrzqt().EZpvd(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        OLrzqt().KWHzl(str);
    }

    public final void OLrzqt(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().AhwBna(priceRangeFilter, z);
    }

    public final void copydefault(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().AEQbTJ(priceRangeFilter, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().EZpvd(priceRangeFilter, z);
    }

    public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().copydefault(priceRangeFilter, z);
    }

    public final void EZpvd(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().OLrzqt(priceRangeFilter, z);
    }

    public final void KWHzl(PriceRangeFilter priceRangeFilter, boolean z) {
        OLrzqt().KWHzl(priceRangeFilter, z);
    }

    /* JADX INFO: renamed from: o.jEw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jEw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C25747jEw OLrzqt(@NotNull TrackerFilterBottomSheetParams trackerFilterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(trackerFilterBottomSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trackerFilterBottomSheetParams", trackerFilterBottomSheetParams);
            C25747jEw c25747jEw = new C25747jEw();
            c25747jEw.setArguments(bundle);
            return c25747jEw;
        }
    }
}
