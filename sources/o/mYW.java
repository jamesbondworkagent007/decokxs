package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.market.common.constants.RangeType;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.CommonTrackData;
import com.okinc.dexkline.market.features.filter.ui.FilterAction;
import com.okinc.dexkline.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.dexkline.market.features.filter.ui.FilterViewModel;
import com.okinc.dexkline.market.features.filter.ui.TypeOptionParams;
import com.okinc.dexkline.market.widget.time_range_selection.TimeSelectionWidget;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C34658ngJ;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mYW extends AbstractC32370mZm {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<java.util.List<java.lang.String>> AEQbTJ;
    public C36064oNy EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public int copydefault;
    public final InterfaceC56387yDm gEmmrt;

    private final void EZpvd(java.util.List<java.lang.String> list) {
    }

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

    public mYW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = 2;
    }

    public final FilterBottomSheetParams OLrzqt() {
        FilterBottomSheetParams filterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (filterBottomSheetParams = (FilterBottomSheetParams) BundleCompat.getParcelable(arguments, "key.filterBottomSheetParams", FilterBottomSheetParams.class)) == null) ? FilterBottomSheetParams.Companion.EZpvd() : filterBottomSheetParams;
    }

    /* JADX DEBUG: Possible override for method o.mZm.EZpvd()V */
    public final FilterViewModel EZpvd() {
        return (FilterViewModel) this.gEmmrt.getValue();
    }

    private final SharedFilterViewModel gEmmrt() {
        return (SharedFilterViewModel) this.KWHzl.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        mUN.collectOnViewLifecycle$default(this, EZpvd().KWHzl(), null, new StateListAnimator(), 2, null);
        mUN.collectOnViewLifecycle$default(this, FlowKt.debounce(this.AEQbTJ, 200L), null, new Activity(), 2, null);
        AYXKKw();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C32363mZf c32363mZf, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            C54946xaf binding = mYW.this.getBinding();
            android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
            wYF wyf = view instanceof wYF ? (wYF) view : null;
            if (wyf == null) {
                return Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(c32363mZf.KWHzl());
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(c32363mZf.copydefault());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) {
            mYW.this.EZpvd().copydefault(list);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (OLrzqt().AkhnZx().length() == 0) {
            return;
        }
        wxq.AYXKKw().setText(OLrzqt().AkhnZx());
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(OLrzqt().isConnected() ? 0 : 8);
        mUO.setOnDoubleCheckClickListener$default(wxq.EZpvd(), 0L, new Function1() { // from class: o.mZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mYW.OLrzqt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(mYW myw, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        myw.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        AppCompatTextView appCompatTextView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C36064oNy c36064oNyAEQbTJ = C36064oNy.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        this.EZpvd = c36064oNyAEQbTJ;
        if (c36064oNyAEQbTJ != null && (appCompatTextView = c36064oNyAEQbTJ.copydefault) != null) {
            appCompatTextView.setVisibility(8);
        }
        TokenFilter tokenFilterOLrzqt = OLrzqt().OLrzqt();
        java.lang.String strIsConnected = tokenFilterOLrzqt != null ? tokenFilterOLrzqt.isConnected() : null;
        EZpvd(strIsConnected != null ? strIsConnected : "");
        KWHzl(OLrzqt().OLrzqt());
        TokenFilter tokenFilterOLrzqt2 = OLrzqt().OLrzqt();
        java.util.List<java.lang.String> listEZpvd = tokenFilterOLrzqt2 != null ? tokenFilterOLrzqt2.EZpvd() : null;
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        EZpvd(listEZpvd);
        TokenFilter tokenFilterOLrzqt3 = OLrzqt().OLrzqt();
        copydefault(tokenFilterOLrzqt3 != null ? tokenFilterOLrzqt3.djBIcL() : null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            TokenFilter tokenFilterOLrzqt = OLrzqt().OLrzqt();
            c52794wYpCopydefault.setVisibility(((tokenFilterOLrzqt == null || (strIsConnected = tokenFilterOLrzqt.isConnected()) == null) ? null : RangeType.Companion.copydefault(strIsConnected)) != RangeType.TIME_CREATE ? 0 : 8);
        }
        wyf.setPrimaryText(C34663ngO.AEQbTJ(OLrzqt().AhwBna(), new Function0() { // from class: o.mZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mYW.gEmmrt(this.AEQbTJ);
            }
        }));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
        }
        wyf.setSecondaryText(C34663ngO.AEQbTJ(OLrzqt().valueOf(), new Function0() { // from class: o.mZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mYW.AYXKKw(this.KWHzl);
            }
        }));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    public static final java.lang.String gEmmrt(mYW myw) {
        java.lang.String string = myw.requireContext().getString(C35964oKf.Fragment.iCPUKe);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String AYXKKw(mYW myw) {
        java.lang.String string = myw.requireContext().getString(C35964oKf.Fragment.DLGVGj);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    private final void EZpvd(java.lang.String str) {
        C34646nfy c34646nfy;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        java.util.List<TypeOptionParams> listDbNXlk = OLrzqt().DbNXlk();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        for (TypeOptionParams typeOptionParams : listDbNXlk) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) typeOptionParams.EZpvd());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C34600nfE(typeOptionParams.AEQbTJ(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        C36064oNy c36064oNy = this.EZpvd;
        if (c36064oNy == null || (c34646nfy = c36064oNy.DbNXlk) == null) {
            return;
        }
        c34646nfy.setSpanCount(3);
        c34646nfy.setCallback(new Dialog());
        c34646nfy.setData(arrayList, str);
        c34646nfy.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
        C36064oNy c36064oNy2 = this.EZpvd;
        if (c36064oNy2 != null && (appCompatTextView2 = c36064oNy2.djBIcL) != null) {
            appCompatTextView2.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
        }
        java.lang.Integer numFetchVPNInfo = OLrzqt().fetchVPNInfo();
        if (numFetchVPNInfo != null) {
            int iIntValue = numFetchVPNInfo.intValue();
            C36064oNy c36064oNy3 = this.EZpvd;
            if (c36064oNy3 == null || (appCompatTextView = c36064oNy3.djBIcL) == null) {
                return;
            }
            appCompatTextView.setText(iIntValue);
        }
    }

    public final /* synthetic */ class Dialog implements InterfaceC34596nfA, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC34596nfA) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, mYW.this, mYW.class, "onTypeChange", "onTypeChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC34596nfA
        public final void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            mYW.this.copydefault(str);
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ mYW EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, mYW myw) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = myw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                mYW myw = this.EZpvd;
                myw.copydefault(myw.EZpvd().KWHzl().getValue().EZpvd(), this.EZpvd.OLrzqt().gEmmrt());
                this.EZpvd.dismissAllowingStateLoss();
                TokenFilter tokenFilterEZpvd = this.EZpvd.EZpvd().KWHzl().getValue().EZpvd();
                java.lang.String strAEQbTJ = this.EZpvd.OLrzqt().values().AEQbTJ();
                boolean z = false;
                boolean z2 = C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.djBIcL().KWHzl()) || C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.djBIcL().copydefault());
                boolean z3 = tokenFilterEZpvd.valueOf() && (C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.AYXKKw().AhwBna()) || C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.AYXKKw().OLrzqt()));
                if (tokenFilterEZpvd.OLrzqt() && (C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.gEmmrt().AhwBna()) || C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilterEZpvd.gEmmrt().OLrzqt()))) {
                    z = true;
                }
                mRG.EZpvd(strAEQbTJ, z2, java.lang.Boolean.valueOf(z3), java.lang.Boolean.valueOf(z), C33129mqd.KWHzl((java.util.Collection) tokenFilterEZpvd.EZpvd()));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ mYW KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, mYW myw) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = myw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                mYW myw = this.KWHzl;
                TokenFilter tokenFilterEZpvd = myw.OLrzqt().EZpvd();
                myw.copydefault(tokenFilterEZpvd.AEQbTJ((15359 & 1) != 0 ? tokenFilterEZpvd.copydefault : null, (15359 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (15359 & 4) != 0 ? tokenFilterEZpvd.DbNXlk : null, (15359 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (15359 & 16) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterEZpvd.valueOf : false, (15359 & 64) != 0 ? tokenFilterEZpvd.djBIcL : false, (15359 & 128) != 0 ? tokenFilterEZpvd.EZpvd : "", (15359 & 256) != 0 ? tokenFilterEZpvd.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterEZpvd.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterEZpvd.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterEZpvd.AkhnZx : null), this.KWHzl.OLrzqt().AYXKKw());
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public final void KWHzl(TokenFilter tokenFilter) {
        AppCompatTextView appCompatTextView;
        C36064oNy c36064oNy = this.EZpvd;
        if (c36064oNy != null && (appCompatTextView = c36064oNy.EZpvd) != null) {
            TokenFilter tokenFilterOLrzqt = OLrzqt().OLrzqt();
            appCompatTextView.setVisibility((tokenFilterOLrzqt == null || !tokenFilterOLrzqt.valueOf()) ? 8 : 0);
        }
        InterfaceC34552neI interfaceC34552neIOLrzqt = OLrzqt(tokenFilter);
        if (interfaceC34552neIOLrzqt != null) {
            interfaceC34552neIOLrzqt.setCallback(new LoaderManager());
            interfaceC34552neIOLrzqt.setSelectionDismissCallback(new Function0() { // from class: o.mZb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mYW.djBIcL(this.copydefault);
                }
            });
            if (tokenFilter != null && tokenFilter.OLrzqt()) {
                interfaceC34552neIOLrzqt.setData(OLrzqt().djBIcL(), tokenFilter.gEmmrt(), OLrzqt().OLrzqt());
            } else {
                interfaceC34552neIOLrzqt.setData(OLrzqt().djBIcL(), tokenFilter != null ? tokenFilter.AYXKKw() : null, OLrzqt().OLrzqt());
            }
        }
    }

    public final /* synthetic */ class LoaderManager implements InterfaceC34548neE, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC34548neE) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, mYW.this, mYW.class, "onPriceRangeSelectionChange", "onPriceRangeSelectionChange(Lcom/okinc/dexkline/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC34548neE
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            mYW.this.KWHzl(priceRangeFilter, z);
        }
    }

    public static final Unit djBIcL(mYW myw) {
        if (myw.OLrzqt().copydefault()) {
            myw.dismissAllowingStateLoss();
            notifyHost$default(myw, myw.EZpvd().KWHzl().getValue().EZpvd(), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(TimeRangeFilter timeRangeFilter) {
        TimeSelectionWidget timeSelectionWidget;
        C36064oNy c36064oNy = this.EZpvd;
        if (c36064oNy == null || (timeSelectionWidget = c36064oNy.AkhnZx) == null) {
            return;
        }
        TokenFilter tokenFilterOLrzqt = OLrzqt().OLrzqt();
        if (tokenFilterOLrzqt != null && tokenFilterOLrzqt.AhwBna()) {
            timeSelectionWidget.setVisibility(0);
            djBIcL();
        }
        timeSelectionWidget.setCallback(new PendingIntent());
        timeSelectionWidget.setData(timeRangeFilter);
    }

    public final /* synthetic */ class PendingIntent implements InterfaceC34610nfO, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC34610nfO) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, mYW.this, mYW.class, "onTimeRangeChange", "onTimeRangeChange(Lcom/okinc/dexkline/market/features/filter/domain/TimeRangeFilter;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC34610nfO
        public final void AEQbTJ(TimeRangeFilter timeRangeFilter) {
            Intrinsics.checkNotNullParameter(timeRangeFilter, "");
            mYW.this.AEQbTJ(timeRangeFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        EZpvd().OLrzqt(str);
    }

    public final void KWHzl(PriceRangeFilter priceRangeFilter, boolean z) {
        EZpvd().KWHzl(priceRangeFilter, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(TimeRangeFilter timeRangeFilter) {
        EZpvd().copydefault(timeRangeFilter);
    }

    public static /* synthetic */ void notifyHost$default(mYW myw, TokenFilter tokenFilter, FilterAction filterAction, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            filterAction = null;
        }
        myw.copydefault(tokenFilter, filterAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TokenFilter tokenFilter, FilterAction filterAction) {
        TokenFilter tokenFilter2;
        java.lang.Object next;
        InterfaceC32365mZh interfaceC32365mZh;
        java.lang.Object next2;
        InterfaceC32365mZh interfaceC32365mZh2;
        if (Intrinsics.EZpvd(tokenFilter, OLrzqt().OLrzqt()) && OLrzqt().AEQbTJ()) {
            return;
        }
        gEmmrt().EZpvd(tokenFilter.AEQbTJ((15359 & 1) != 0 ? tokenFilter.copydefault : null, (15359 & 2) != 0 ? tokenFilter.isConnected : null, (15359 & 4) != 0 ? tokenFilter.DbNXlk : null, (15359 & 8) != 0 ? tokenFilter.AhwBna : null, (15359 & 16) != 0 ? tokenFilter.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilter.valueOf : false, (15359 & 64) != 0 ? tokenFilter.djBIcL : false, (15359 & 128) != 0 ? tokenFilter.EZpvd : "", (15359 & 256) != 0 ? tokenFilter.AYXKKw : false, (15359 & 512) != 0 ? tokenFilter.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilter.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilter.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilter.KWHzl : null, (15359 & 8192) != 0 ? tokenFilter.AkhnZx : null), false);
        if (filterAction != null) {
            C34658ngJ c34658ngJ = C34658ngJ.copydefault;
            java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C34658ngJ.StateListAnimator.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((androidx.fragment.app.Fragment) next2) instanceof InterfaceC32365mZh) {
                        break;
                    }
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next2;
            if (fragment == null) {
                KeyEventDispatcher.Component componentRequireActivity = requireActivity();
                if (!(componentRequireActivity instanceof InterfaceC32365mZh)) {
                    componentRequireActivity = null;
                }
                interfaceC32365mZh2 = (InterfaceC32365mZh) componentRequireActivity;
            } else {
                if (!(fragment instanceof InterfaceC32365mZh)) {
                    fragment = null;
                }
                interfaceC32365mZh2 = (InterfaceC32365mZh) fragment;
            }
            if (interfaceC32365mZh2 != null) {
                tokenFilter2 = tokenFilter;
                interfaceC32365mZh2.EZpvd(filterAction, tokenFilter2);
            } else {
                tokenFilter2 = tokenFilter;
            }
        }
        C34658ngJ c34658ngJ2 = C34658ngJ.copydefault;
        java.util.Iterator it2 = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C34658ngJ.StateListAnimator.EZpvd)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((androidx.fragment.app.Fragment) next) instanceof InterfaceC32365mZh) {
                    break;
                }
            }
        }
        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) next;
        if (fragment2 == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            interfaceC32365mZh = (InterfaceC32365mZh) (fragmentActivityRequireActivity instanceof InterfaceC32365mZh ? fragmentActivityRequireActivity : null);
        } else {
            interfaceC32365mZh = (InterfaceC32365mZh) (fragment2 instanceof InterfaceC32365mZh ? fragment2 : null);
        }
        if (interfaceC32365mZh != null) {
            interfaceC32365mZh.OLrzqt(tokenFilter2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC34552neI OLrzqt(TokenFilter tokenFilter) {
        C34564neU c34564neU;
        C34553neJ c34553neJ;
        C34562neS c34562neS;
        C34629nfh c34629nfh;
        C34551neH c34551neH;
        C34564neU c34564neU2;
        C34553neJ c34553neJ2;
        C34562neS c34562neS2;
        C34629nfh c34629nfh2;
        C34551neH c34551neH2;
        boolean z;
        AppCompatTextView appCompatTextView;
        C36064oNy c36064oNy;
        AppCompatTextView appCompatTextView2;
        C36064oNy c36064oNy2;
        AppCompatTextView appCompatTextView3;
        TimeSelectionWidget timeSelectionWidget;
        C34564neU c34564neU3;
        C34562neS c34562neS3;
        C34629nfh c34629nfh3;
        C34553neJ c34553neJ3;
        C34551neH c34551neH3;
        AppCompatTextView appCompatTextView4;
        C34564neU c34564neU4;
        C34553neJ c34553neJ4;
        C34562neS c34562neS4;
        C34629nfh c34629nfh4;
        C34551neH c34551neH4;
        C34564neU c34564neU5;
        C34553neJ c34553neJ5;
        C34562neS c34562neS5;
        C34629nfh c34629nfh5;
        C34551neH c34551neH5;
        java.lang.String strIsConnected = tokenFilter != null ? tokenFilter.isConnected() : null;
        if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.MARKET_CAP.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.TURNOVER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.LIQUIDITY.getValue()))) {
            C36064oNy c36064oNy3 = this.EZpvd;
            if (c36064oNy3 != null && (c34551neH = c36064oNy3.valueOf) != null) {
                c34551neH.setVisibility(8);
            }
            C36064oNy c36064oNy4 = this.EZpvd;
            if (c36064oNy4 != null && (c34629nfh = c36064oNy4.fetchVPNInfo) != null) {
                c34629nfh.setVisibility(8);
            }
            C36064oNy c36064oNy5 = this.EZpvd;
            if (c36064oNy5 != null && (c34562neS = c36064oNy5.AYXKKw) != null) {
                c34562neS.setVisibility(8);
            }
            C36064oNy c36064oNy6 = this.EZpvd;
            if (c36064oNy6 != null && (c34553neJ = c36064oNy6.gEmmrt) != null) {
                c34553neJ.setVisibility(8);
            }
            C36064oNy c36064oNy7 = this.EZpvd;
            if (c36064oNy7 != null && (c34564neU = c36064oNy7.AhwBna) != null) {
                c34564neU.setVisibility(0);
            }
            C36064oNy c36064oNy8 = this.EZpvd;
            if (c36064oNy8 != null) {
                return c36064oNy8.AhwBna;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.TIME_CREATE.getValue()))) {
            C36064oNy c36064oNy9 = this.EZpvd;
            if (c36064oNy9 != null && (c34551neH5 = c36064oNy9.valueOf) != null) {
                c34551neH5.setVisibility(8);
            }
            C36064oNy c36064oNy10 = this.EZpvd;
            if (c36064oNy10 != null && (c34629nfh5 = c36064oNy10.fetchVPNInfo) != null) {
                c34629nfh5.setVisibility(0);
            }
            C36064oNy c36064oNy11 = this.EZpvd;
            if (c36064oNy11 != null && (c34562neS5 = c36064oNy11.AYXKKw) != null) {
                c34562neS5.setVisibility(8);
            }
            C36064oNy c36064oNy12 = this.EZpvd;
            if (c36064oNy12 != null && (c34553neJ5 = c36064oNy12.gEmmrt) != null) {
                c34553neJ5.setVisibility(8);
            }
            C36064oNy c36064oNy13 = this.EZpvd;
            if (c36064oNy13 != null && (c34564neU5 = c36064oNy13.AhwBna) != null) {
                c34564neU5.setVisibility(8);
            }
            C36064oNy c36064oNy14 = this.EZpvd;
            if (c36064oNy14 != null) {
                return c36064oNy14.fetchVPNInfo;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.TIME_VOLUME.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.CHANGE.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.UNIQUE_TRADER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.HOLDER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.TRANSACTION.getValue()))) {
            C36064oNy c36064oNy15 = this.EZpvd;
            if (c36064oNy15 != null && (c34551neH2 = c36064oNy15.valueOf) != null) {
                c34551neH2.setVisibility(8);
            }
            C36064oNy c36064oNy16 = this.EZpvd;
            if (c36064oNy16 != null && (c34629nfh2 = c36064oNy16.fetchVPNInfo) != null) {
                c34629nfh2.setVisibility(8);
            }
            C36064oNy c36064oNy17 = this.EZpvd;
            if (c36064oNy17 != null && (c34562neS2 = c36064oNy17.AYXKKw) != null) {
                c34562neS2.setVisibility(0);
            }
            C36064oNy c36064oNy18 = this.EZpvd;
            if (c36064oNy18 != null && (c34553neJ2 = c36064oNy18.gEmmrt) != null) {
                c34553neJ2.setVisibility(8);
            }
            C36064oNy c36064oNy19 = this.EZpvd;
            if (c36064oNy19 != null && (c34564neU2 = c36064oNy19.AhwBna) != null) {
                c34564neU2.setVisibility(8);
            }
            C36064oNy c36064oNy20 = this.EZpvd;
            if (c36064oNy20 != null) {
                return c36064oNy20.AYXKKw;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) java.lang.String.valueOf(RangeType.FDV.getValue()))) {
            C36064oNy c36064oNy21 = this.EZpvd;
            if (c36064oNy21 != null && (c34551neH4 = c36064oNy21.valueOf) != null) {
                c34551neH4.setVisibility(8);
            }
            C36064oNy c36064oNy22 = this.EZpvd;
            if (c36064oNy22 != null && (c34629nfh4 = c36064oNy22.fetchVPNInfo) != null) {
                c34629nfh4.setVisibility(8);
            }
            C36064oNy c36064oNy23 = this.EZpvd;
            if (c36064oNy23 != null && (c34562neS4 = c36064oNy23.AYXKKw) != null) {
                c34562neS4.setVisibility(8);
            }
            C36064oNy c36064oNy24 = this.EZpvd;
            if (c36064oNy24 != null && (c34553neJ4 = c36064oNy24.gEmmrt) != null) {
                c34553neJ4.setVisibility(0);
            }
            C36064oNy c36064oNy25 = this.EZpvd;
            if (c36064oNy25 != null && (c34564neU4 = c36064oNy25.AhwBna) != null) {
                c34564neU4.setVisibility(8);
            }
            C36064oNy c36064oNy26 = this.EZpvd;
            if (c36064oNy26 != null) {
                return c36064oNy26.gEmmrt;
            }
            return null;
        }
        boolean zEjfBZ = OLrzqt().ejfBZ();
        C36064oNy c36064oNy27 = this.EZpvd;
        if (c36064oNy27 != null && (appCompatTextView4 = c36064oNy27.copydefault) != null) {
            appCompatTextView4.setVisibility(zEjfBZ ? 0 : 8);
        }
        if (tokenFilter != null) {
            z = tokenFilter.OLrzqt();
        }
        C36064oNy c36064oNy28 = this.EZpvd;
        if (c36064oNy28 != null && (c34551neH3 = c36064oNy28.valueOf) != null) {
            c34551neH3.setVisibility(z ^ true ? 0 : 8);
        }
        C36064oNy c36064oNy29 = this.EZpvd;
        if (c36064oNy29 != null && (c34553neJ3 = c36064oNy29.gEmmrt) != null) {
            c34553neJ3.setVisibility(z ? 0 : 8);
        }
        C36064oNy c36064oNy30 = this.EZpvd;
        if (c36064oNy30 != null && (c34629nfh3 = c36064oNy30.fetchVPNInfo) != null) {
            c34629nfh3.setVisibility(8);
        }
        C36064oNy c36064oNy31 = this.EZpvd;
        if (c36064oNy31 != null && (c34562neS3 = c36064oNy31.AYXKKw) != null) {
            c34562neS3.setVisibility(8);
        }
        C36064oNy c36064oNy32 = this.EZpvd;
        if (c36064oNy32 != null && (c34564neU3 = c36064oNy32.AhwBna) != null) {
            c34564neU3.setVisibility(8);
        }
        C36064oNy c36064oNy33 = this.EZpvd;
        if (c36064oNy33 != null && (timeSelectionWidget = c36064oNy33.AkhnZx) != null) {
            timeSelectionWidget.setVisibility(zEjfBZ ? 0 : 8);
        }
        if (OLrzqt().fIwbmz() && (c36064oNy2 = this.EZpvd) != null && (appCompatTextView3 = c36064oNy2.EZpvd) != null) {
            appCompatTextView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.ggKfIT));
        }
        if (zEjfBZ && (c36064oNy = this.EZpvd) != null && (appCompatTextView2 = c36064oNy.EZpvd) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hrjNmC));
        }
        if (!z) {
            C36064oNy c36064oNy34 = this.EZpvd;
            if (c36064oNy34 != null) {
                return c36064oNy34.valueOf;
            }
            return null;
        }
        C36064oNy c36064oNy35 = this.EZpvd;
        if (c36064oNy35 != null && (appCompatTextView = c36064oNy35.EZpvd) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gwwfep));
        }
        C36064oNy c36064oNy36 = this.EZpvd;
        if (c36064oNy36 != null) {
            return c36064oNy36.gEmmrt;
        }
        return null;
    }

    private final void djBIcL() {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatImageView appCompatImageView;
        C36064oNy c36064oNy = this.EZpvd;
        if (c36064oNy != null && (appCompatImageView = c36064oNy.AEQbTJ) != null) {
            appCompatImageView.setVisibility(0);
        }
        C36064oNy c36064oNy2 = this.EZpvd;
        if (c36064oNy2 == null || (linearLayoutCompat = c36064oNy2.KWHzl) == null) {
            return;
        }
        mUO.setOnDoubleCheckClickListener$default(linearLayoutCompat, 0L, new Function1() { // from class: o.mZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mYW.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(final mYW myw, android.view.View view) {
        boolean z;
        AppCompatTextView appCompatTextView;
        C34553neJ c34553neJ;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        C34553neJ c34553neJ2;
        Intrinsics.checkNotNullParameter(view, "");
        if (myw.EZpvd().KWHzl().getValue().EZpvd().OLrzqt()) {
            C36064oNy c36064oNy = myw.EZpvd;
            z = false;
            if (c36064oNy != null && (c34553neJ2 = c36064oNy.gEmmrt) != null) {
                c34553neJ2.copydefault(false);
            }
            myw.EZpvd().KWHzl(false);
            C36064oNy c36064oNy2 = myw.EZpvd;
            if (c36064oNy2 != null && (appCompatTextView3 = c36064oNy2.EZpvd) != null) {
                appCompatTextView3.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hrjNmC));
            }
        } else {
            C36064oNy c36064oNy3 = myw.EZpvd;
            z = true;
            if (c36064oNy3 != null && (c34553neJ = c36064oNy3.gEmmrt) != null) {
                c34553neJ.copydefault(true);
            }
            myw.EZpvd().KWHzl(true);
            C36064oNy c36064oNy4 = myw.EZpvd;
            if (c36064oNy4 != null && (appCompatTextView = c36064oNy4.EZpvd) != null) {
                appCompatTextView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gwwfep));
            }
        }
        myw.EZpvd().KWHzl(z);
        C36064oNy c36064oNy5 = myw.EZpvd;
        if (c36064oNy5 != null && (appCompatTextView2 = c36064oNy5.EZpvd) != null) {
            appCompatTextView2.post(new java.lang.Runnable() { // from class: o.mZg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    mYW.DbNXlk(this.copydefault);
                }
            });
        }
        myw.KWHzl(myw.EZpvd().KWHzl().getValue().EZpvd());
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(mYW myw) {
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        C36064oNy c36064oNy = myw.EZpvd;
        if (c36064oNy != null && (appCompatTextView = c36064oNy.EZpvd) != null) {
            appCompatTextView.requestLayout();
        }
        C36064oNy c36064oNy2 = myw.EZpvd;
        if (c36064oNy2 == null || (appCompatImageView = c36064oNy2.AEQbTJ) == null) {
            return;
        }
        appCompatImageView.requestLayout();
    }

    private final void AYXKKw() {
        final CommonTrackData commonTrackDataEZpvd = OLrzqt().values().EZpvd();
        java.lang.String strEZpvd = commonTrackDataEZpvd.EZpvd();
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd(strEZpvd, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mYW.copydefault(commonTrackDataEZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(CommonTrackData commonTrackData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, commonTrackData.KWHzl(), commonTrackData.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mYW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final mYW KWHzl(@NotNull FilterBottomSheetParams filterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(filterBottomSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.filterBottomSheetParams", filterBottomSheetParams);
            mYW myw = new mYW();
            myw.setArguments(bundle);
            return myw;
        }
    }
}
