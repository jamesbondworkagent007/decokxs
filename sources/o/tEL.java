package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.planet.biz_positions.PlanetProfileCombinedPositionsFragment$initView$2$3;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC46032tFh;
import o.C46043tFs;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC46072tGu;
import o.InterfaceC47502trM;
import o.tKS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tEL extends AbstractC32996moC implements InterfaceC47502trM<C46274tOg> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public tVR AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public TabLayoutMediator AhwBna;
    public boolean EZpvd;
    public final StateListAnimator KWHzl;
    public C46274tOg copydefault;
    public final InterfaceC56387yDm isConnected;
    public final int gEmmrt = C47501trL.Application.DLWbHP;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Activity(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Fragment(this, "page", ""));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C46274tOg OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(C46274tOg c46274tOg) {
        this.copydefault = c46274tOg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public static final class Activity implements Function0<PlanetUniqueName> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.OLrzqt = fragment;
            this.KWHzl = str;
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
            android.os.Bundle arguments = this.OLrzqt.getArguments();
            java.lang.String str = this.KWHzl;
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

    public static final class Fragment implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.copydefault = str;
            this.EZpvd = obj;
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
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.copydefault;
            ?? r2 = this.EZpvd;
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

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroidx/lifecycle/LifecycleOwner;)V */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C46274tOg c46274tOg, @NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC47502trM.Application.KWHzl(this, c46274tOg, lifecycleOwner);
    }

    public void copydefault(@NotNull Function1<? super C46274tOg, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    public tEL() {
        Function0 function0 = new Function0() { // from class: o.tEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tEL.AYXKKw(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_positions.PlanetProfileCombinedPositionsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_positions.PlanetProfileCombinedPositionsFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46055tGd.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_positions.PlanetProfileCombinedPositionsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_positions.PlanetProfileCombinedPositionsFragment$special$$inlined$viewModels$default$4
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
        this.KWHzl = new StateListAnimator();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.tEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tEL.djBIcL(this.copydefault);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final tEL KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            tEL tel = new tEL();
            tel.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str)), C56390yDp.OLrzqt("page", str2)));
            return tel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AhwBna() {
        return ((PlanetUniqueName) this.valueOf.getValue()).EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String KWHzl() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public final C46055tGd copydefault() {
        return (C46055tGd) this.isConnected.getValue();
    }

    public static final ViewModelProvider.Factory AYXKKw(tEL tel) {
        return new tRJ(tel, tel.getArguments(), new Function1() { // from class: o.tER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEL.OLrzqt((SavedStateHandle) obj);
            }
        });
    }

    public static final C46055tGd OLrzqt(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C46055tGd(savedStateHandle, null, null, null, null, 30, null);
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                int position = tab.getPosition();
                if (position == 0) {
                    tTP.OLrzqt(new tKS.AssistContent(tEL.this.AhwBna(), tEL.this.KWHzl(), null));
                } else if (position == 1) {
                    tTP.OLrzqt(new tKS.PendingIntent(tEL.this.AhwBna(), tEL.this.KWHzl(), null));
                }
                tEL.this.EZpvd().setVisibility(position == 0 ? 0 : 8);
            }
        }
    }

    public final wYC EZpvd() {
        return (wYC) this.AYXKKw.getValue();
    }

    public static final wYC djBIcL(tEL tel) {
        android.content.Context contextRequireContext = tel.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        wYC wyc = new wYC(contextRequireContext, null, 0, 6, null);
        wyc.setContentDescription("MarketplaceUserProfileOverviewPositionsHistory");
        wyc.setLayoutParams(new ViewGroup.LayoutParams(C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null)));
        wyc.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DcMfJKfNUfqk));
        wyc.setOnClickListener(new TaskDescription(wyc, 1000L, tel));
        return wyc;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C46274tOg c46274tOgEZpvd = C46274tOg.EZpvd(view);
        Intrinsics.copydefault(c46274tOgEZpvd);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        KWHzl(c46274tOgEZpvd, viewLifecycleOwner);
        EZpvd(c46274tOgEZpvd);
        copydefault(new Function1() { // from class: o.tET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEL.AEQbTJ(this.KWHzl, (C46274tOg) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final tEL tel, C46274tOg c46274tOg) {
        Intrinsics.checkNotNullParameter(c46274tOg, "");
        c46274tOg.KWHzl.setAdapter(new Application(tel, tel));
        c46274tOg.KWHzl.setUserInputEnabled(false);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c46274tOg.AEQbTJ.copydefault(), c46274tOg.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                tEL.EZpvd(this.EZpvd, tab, i);
            }
        });
        tabLayoutMediator.attach();
        tel.AhwBna = tabLayoutMediator;
        c46274tOg.AEQbTJ.KWHzl(false);
        c46274tOg.AEQbTJ.OLrzqt(tel.EZpvd());
        android.widget.LinearLayout linearLayoutKWHzl = c46274tOg.AEQbTJ.KWHzl();
        linearLayoutKWHzl.setPaddingRelative(linearLayoutKWHzl.getPaddingStart(), linearLayoutKWHzl.getPaddingTop(), C55298xhM.px2dp$default(C33070mpX.EZpvd(C52761wXj.StateListAnimator.QUSxYX), (android.content.Context) null, 1, (java.lang.Object) null), linearLayoutKWHzl.getPaddingBottom());
        c46274tOg.AEQbTJ.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) tel.KWHzl);
        ViewPager2 viewPager2 = c46274tOg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        tel.AEQbTJ = new tVR(viewPager2);
        StateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> stateFlowOLrzqt = tel.copydefault().OLrzqt();
        LifecycleOwner viewLifecycleOwner = tel.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C46373tRy.flowAndCollectLatest$default(stateFlowOLrzqt, viewLifecycleOwner, null, new PlanetProfileCombinedPositionsFragment$initView$2$3(c46274tOg, tel, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(tEL tel, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = tel.OLrzqt(i);
        java.lang.String strComponent1 = pairOLrzqt.component1();
        java.lang.String strComponent2 = pairOLrzqt.component2();
        tab.setText(strComponent1);
        tab.setContentDescription(strComponent2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55254xgV c55254xgV;
        TabLayout tabLayoutCopydefault;
        C46274tOg c46274tOgOLrzqt = OLrzqt();
        if (c46274tOgOLrzqt != null && (c55254xgV = c46274tOgOLrzqt.AEQbTJ) != null && (tabLayoutCopydefault = c55254xgV.copydefault()) != null) {
            tabLayoutCopydefault.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.KWHzl);
        }
        TabLayoutMediator tabLayoutMediator = this.AhwBna;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.AhwBna = null;
        tVR tvr = this.AEQbTJ;
        if (tvr != null) {
            tvr.KWHzl();
        }
        this.AEQbTJ = null;
        super.onDestroyView();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ tEL KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, tEL tel) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = tel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                tEL tel = this.KWHzl;
                ActivityC46032tFh.StateListAnimator stateListAnimator = ActivityC46032tFh.Companion;
                android.content.Context contextRequireContext = tel.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                tel.startActivity(stateListAnimator.AEQbTJ(contextRequireContext, this.KWHzl.AhwBna(), true, this.KWHzl.KWHzl()));
            }
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(int i) {
        if (i == 0) {
            return C56390yDp.OLrzqt(C33069mpW.copydefault(C47501trL.Fragment.RkASWs, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "0"))), "MarketplaceUserProfileOverviewTabPositions");
        }
        if (i == 1) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.AxsJAY), "MarketplaceUserProfileOverviewTabRecords");
        }
        return C56390yDp.OLrzqt("", "");
    }

    public final class Application extends FragmentStateAdapter {
        public final /* synthetic */ tEL AEQbTJ;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull tEL tel, androidx.fragment.app.Fragment fragment) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.AEQbTJ = tel;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (i == 0) {
                return C46043tFs.StateListAnimator.m8714newInstanceEPykF4U$default(C46043tFs.Companion, this.AEQbTJ.AhwBna(), true, this.AEQbTJ.KWHzl(), null, 8, null);
            }
            if (i == 1) {
                return tEV.Companion.KWHzl(this.AEQbTJ.AhwBna(), true);
            }
            throw new java.lang.IllegalArgumentException("Invalid position: " + i);
        }
    }
}
