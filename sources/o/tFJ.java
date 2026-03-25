package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_positions.EcoSelectionBottomSheetV2;
import com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$adapter$2$1$1;
import com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$initView$1$4;
import com.okinc.planet.biz_positions.ProfilePositionsHistoryViewModel;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C47501trL;
import o.tQX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tFJ extends AbstractC32996moC implements InterfaceC47502trM<tNZ> {
    public boolean AYXKKw;
    public tNZ EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int valueOf = C47501trL.Application.QkdxfA;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Application(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new ActionBar(this, "page", ""));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(tNZ tnz) {
        this.EZpvd = tnz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public tNZ OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public static final class ActionBar implements Function0<java.lang.String> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = fragment;
            this.OLrzqt = str;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.EZpvd.getArguments();
            java.lang.String str = this.OLrzqt;
            ?? r2 = this.KWHzl;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = arguments.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public static final class Application implements Function0<PlanetUniqueName> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = fragment;
            this.copydefault = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetUniqueName */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetUniqueName, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetUniqueName invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.EZpvd.getArguments();
            java.lang.String str = this.copydefault;
            ?? r2 = this.AEQbTJ;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetUniqueName.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (PlanetUniqueName) (objValueOf instanceof PlanetUniqueName ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (PlanetUniqueName) (objValueOf2 instanceof PlanetUniqueName ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (PlanetUniqueName) (objValueOf3 instanceof PlanetUniqueName ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (PlanetUniqueName) (objValueOf4 instanceof PlanetUniqueName ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (PlanetUniqueName) (objValueOf5 instanceof PlanetUniqueName ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    obj = (PlanetUniqueName) (string instanceof PlanetUniqueName ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, PlanetUniqueName.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (PlanetUniqueName) (parcelable2 instanceof PlanetUniqueName ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetUniqueName");
                }
                parcelable = (PlanetUniqueName) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    public tFJ() {
        Function0 function0 = new Function0() { // from class: o.tFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tFJ.DbNXlk(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ProfilePositionsHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_positions.ProfilePositionsHistoryFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tFJ.djBIcL(this.KWHzl);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tFJ.EZpvd();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tFJ.values(this.OLrzqt);
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tFJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final tFJ EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            tFJ tfj = new tFJ();
            tfj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str)), C56390yDp.OLrzqt("page", str2)));
            return tfj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String values() {
        return ((PlanetUniqueName) this.AhwBna.getValue()).EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AkhnZx() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public final ProfilePositionsHistoryViewModel gEmmrt() {
        return (ProfilePositionsHistoryViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelProvider.Factory DbNXlk(tFJ tfj) {
        return new tRJ(tfj, tfj.getArguments(), new Function1() { // from class: o.tFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tFJ.copydefault((SavedStateHandle) obj);
            }
        });
    }

    public static final ProfilePositionsHistoryViewModel copydefault(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new ProfilePositionsHistoryViewModel(savedStateHandle, null, null, 6, null);
    }

    public final C46023tEz AhwBna() {
        return (C46023tEz) this.copydefault.getValue();
    }

    public static final C46023tEz djBIcL(final tFJ tfj) {
        return new C46023tEz(PlanetTradeTypes.Swap, new Function1() { // from class: o.tFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tFJ.KWHzl(this.copydefault, (C46068tGq) obj);
            }
        }, new Function1() { // from class: o.tFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tFJ.EZpvd(this.copydefault, (C46068tGq) obj);
            }
        }, new Function0() { // from class: o.tFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tFJ.AEQbTJ();
            }
        }, true, new Function2() { // from class: o.tFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return tFJ.EZpvd(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.tFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tFJ.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(tFJ tfj, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iOLrzqt = C46450tUu.copydefault.OLrzqt(str2);
        tTT ttt = tTT.copydefault;
        FragmentActivity fragmentActivityRequireActivity = tfj.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        tTT.navigateToTradeDetailPage$default(ttt, fragmentActivityRequireActivity, java.lang.String.valueOf(iOLrzqt), str, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(tFJ tfj, C46068tGq c46068tGq) {
        Intrinsics.checkNotNullParameter(c46068tGq, "");
        YieldDetails yieldDetailsWlaJM = c46068tGq.wlaJM();
        YieldDetails.Activity activity = yieldDetailsWlaJM instanceof YieldDetails.Activity ? (YieldDetails.Activity) yieldDetailsWlaJM : null;
        if (activity != null) {
            C46058tGg c46058tGg = new C46058tGg(activity);
            androidx.fragment.app.FragmentManager childFragmentManager = tfj.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c46058tGg.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(tFJ tfj, C46068tGq c46068tGq) {
        Intrinsics.checkNotNullParameter(c46068tGq, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(tfj), null, null, new ProfilePositionsHistoryFragment$adapter$2$1$1(tfj, c46068tGq, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(tFJ tfj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = tfj.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.OLrzqt(C47501trL.Fragment.hfdhUn, context), new View.OnClickListener() { // from class: o.tFT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tFJ.EZpvd(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C46098tHt AYXKKw() {
        return (C46098tHt) this.OLrzqt.getValue();
    }

    public static final C46098tHt EZpvd() {
        return new C46098tHt(false, 0, 3, null);
    }

    private final ConcatAdapter valueOf() {
        return (ConcatAdapter) this.KWHzl.getValue();
    }

    public static final ConcatAdapter values(tFJ tfj) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{tfj.AhwBna(), tfj.AYXKKw()});
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNZ tnzCopydefault = tNZ.copydefault(view);
        C46478tVv c46478tVv = tnzCopydefault.OLrzqt;
        c46478tVv.setDividerVisibility(false);
        C46478tVv.refreshFilter$default(c46478tVv, null, "ANY", false, 4, null);
        c46478tVv.setOnSelectCallback(new Function2() { // from class: o.tGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return tFJ.copydefault(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        tnzCopydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.tGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                tFJ.KWHzl(this.EZpvd, view2);
            }
        });
        tnzCopydefault.KWHzl.setAdapter(valueOf());
        tnzCopydefault.KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
        C33546myW c33546myW = tnzCopydefault.AEQbTJ;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                tFJ.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.tFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                tFJ.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        StateFlow<AbstractC46197tLk<tQX.TaskDescription<C46068tGq>>> stateFlowCopydefault = gEmmrt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C46373tRy.flowAndCollect$default(stateFlowCopydefault, viewLifecycleOwner, null, new ProfilePositionsHistoryFragment$initView$1$4(this, tnzCopydefault, null), 2, null);
        ProfilePositionsHistoryViewModel.loadData$default(gEmmrt(), false, 1, null);
        EZpvd(tnzCopydefault);
    }

    public static final Unit copydefault(tFJ tfj, java.lang.String str, java.lang.String str2) {
        tfj.gEmmrt().AEQbTJ(str, str2);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final tFJ tfj, android.view.View view) {
        EcoSelectionBottomSheetV2 ecoSelectionBottomSheetV2NewInstance$default = EcoSelectionBottomSheetV2.TaskDescription.newInstance$default(EcoSelectionBottomSheetV2.Companion, tfj.gEmmrt().OLrzqt(), null, false, new Function2() { // from class: o.tFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return tFJ.OLrzqt(this.AEQbTJ, (EcoSelectionBottomSheetV2.Selection) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 6, null);
        androidx.fragment.app.FragmentManager childFragmentManager = tfj.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        ecoSelectionBottomSheetV2NewInstance$default.show(childFragmentManager);
    }

    public static final Unit OLrzqt(tFJ tfj, EcoSelectionBottomSheetV2.Selection selection, int i) {
        Intrinsics.checkNotNullParameter(selection, "");
        ProfilePositionsHistoryViewModel.SortType sortType = (ProfilePositionsHistoryViewModel.SortType) selection.KWHzl();
        if (sortType != null) {
            tfj.gEmmrt().OLrzqt(sortType);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(tFJ tfj, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ProfilePositionsHistoryViewModel.loadData$default(tfj.gEmmrt(), false, 1, null);
    }

    public static final void OLrzqt(tFJ tfj, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        tfj.gEmmrt().KWHzl(true);
    }

    public final void copydefault(C33546myW c33546myW, boolean z) {
        c33546myW.AEQbTJ(z);
        c33546myW.copydefault(z);
    }
}
