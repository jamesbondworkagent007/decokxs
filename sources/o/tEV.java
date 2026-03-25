package o;

import android.graphics.Paint;
import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_positions.ProfileLatestRecordsFragment$initView$2$1;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.InterfaceC47502trM;
import o.tED;
import o.tEF;
import o.tEH;
import o.tEM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tEV extends AbstractC32996moC implements InterfaceC47502trM<tNO> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public java.lang.String AhwBna;
    public tNO OLrzqt;
    public boolean gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new TaskDescription(this, "isSummary", java.lang.Boolean.FALSE));
    public final int djBIcL = C47501trL.Application.DCJXGO;
    public final InterfaceC56387yDm values = FragmentViewModelLazyKt.createViewModelLazy$default(this, C56524yIo.AEQbTJ(tEM.class), new Function0() { // from class: o.tFb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tEV.fIwbmz(this.OLrzqt);
        }
    }, null, new Function0() { // from class: o.tFa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tEV.ejfBZ(this.EZpvd);
        }
    }, 4, null);
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Application(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final C46099tHu copydefault = new C46099tHu();
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tFe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tEV.DbNXlk(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tFf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tEV.isConnected(this.EZpvd);
        }
    });
    public java.lang.String AYXKKw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public tNO OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(tNO tno) {
        this.OLrzqt = tno;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    public static final class Application implements Function0<PlanetUniqueName> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.AEQbTJ = fragment;
            this.copydefault = str;
            this.EZpvd = obj;
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
            android.os.Bundle arguments = this.AEQbTJ.getArguments();
            java.lang.String str = this.copydefault;
            ?? r2 = this.EZpvd;
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

    public static final class TaskDescription implements Function0<java.lang.Boolean> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.copydefault = str;
            this.OLrzqt = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Boolean invoke() {
            java.lang.Object parcelable;
            java.lang.Object objValueOf;
            android.os.Bundle arguments = this.KWHzl.getArguments();
            java.lang.String str = this.copydefault;
            ?? r2 = this.OLrzqt;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Boolean.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Integer.valueOf(arguments.getInt(str));
                    objValueOf = (java.lang.Boolean) (objValueOf2 instanceof java.lang.Boolean ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Long.valueOf(arguments.getLong(str));
                    objValueOf = (java.lang.Boolean) (objValueOf3 instanceof java.lang.Boolean ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Float.valueOf(arguments.getFloat(str));
                    objValueOf = (java.lang.Boolean) (objValueOf4 instanceof java.lang.Boolean ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Double.valueOf(arguments.getDouble(str));
                    objValueOf = (java.lang.Boolean) (objValueOf5 instanceof java.lang.Boolean ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    objValueOf = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    objValueOf = (java.lang.Boolean) (string instanceof java.lang.Boolean ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, java.lang.Boolean.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    objValueOf = (java.lang.Boolean) (parcelable2 instanceof java.lang.Boolean ? parcelable2 : null);
                }
                return objValueOf != null ? r2 : objValueOf;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = arguments.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                parcelable = (java.lang.Boolean) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                parcelable = (java.lang.Boolean) parcelableArrayList2;
            }
            objValueOf = parcelable;
            if (objValueOf != null) {
            }
        }
    }

    public void AEQbTJ(@NotNull Function1<? super tNO, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroidx/lifecycle/LifecycleOwner;)V */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull tNO tno, @NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC47502trM.Application.KWHzl(this, tno, lifecycleOwner);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final tEV KWHzl(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            tEV tev = new tEV();
            tev.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("isSummary", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str))));
            return tev;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean valueOf() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public final tEM copydefault() {
        return (tEM) this.values.getValue();
    }

    public static final ViewModelStore fIwbmz(tEV tev) {
        ViewModelStore viewModelStore = !tev.valueOf() ? tev.requireActivity().getViewModelStore() : tev.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        return viewModelStore;
    }

    public static final ViewModelProvider.Factory ejfBZ(tEV tev) {
        FragmentActivity fragmentActivityRequireActivity;
        android.os.Bundle arguments;
        if (tev.valueOf()) {
            fragmentActivityRequireActivity = tev;
        } else {
            fragmentActivityRequireActivity = tev.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        }
        if (tev.valueOf()) {
            arguments = tev.getArguments();
        } else {
            android.content.Intent intent = tev.requireActivity().getIntent();
            arguments = intent != null ? intent.getExtras() : null;
        }
        return new tRJ(fragmentActivityRequireActivity, arguments, new Function1() { // from class: o.tFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEV.KWHzl((SavedStateHandle) obj);
            }
        });
    }

    public static final tEM KWHzl(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new tEM(savedStateHandle, null, 2, null);
    }

    private final java.lang.String AhwBna() {
        return ((PlanetUniqueName) this.AkhnZx.getValue()).EZpvd();
    }

    public final tEH AEQbTJ() {
        return (tEH) this.AEQbTJ.getValue();
    }

    public static final tEH DbNXlk(final tEV tev) {
        return new tEH(new Function1() { // from class: o.tEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEV.copydefault(this.KWHzl, (tEF.StateListAnimator) obj);
            }
        }, new Function0() { // from class: o.tEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tEV.values(this.OLrzqt);
            }
        });
    }

    public static final Unit copydefault(tEV tev, tEF.StateListAnimator stateListAnimator) {
        final java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        int iOLrzqt = C46450tUu.copydefault.OLrzqt(stateListAnimator.AhwBna());
        final java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) "SWAP", (java.lang.Object) stateListAnimator.AhwBna())) {
            lowerCase = "perpetual";
        } else {
            lowerCase = stateListAnimator.AhwBna().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        C32866mlf.onEvent$default("app_leaderboard_homepage_trade_record_trade", (TrackChannel[]) null, new Function1() { // from class: o.tEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEV.EZpvd(lowerCase, strCopydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        FragmentActivity activity = tev.getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, ((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class)).OLrzqt() + "?bizType=" + iOLrzqt + "&instId=" + strCopydefault, null, new Function1() { // from class: o.tFd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tEV.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Click", true);
        eventParamsList.put("element_type", "Button", true);
        eventParamsList.put("type", str, false);
        eventParamsList.put("coin", str2, false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit values(tEV tev) {
        android.content.Intent intentKWHzl;
        tED.Application application = tED.Companion;
        android.content.Context context = tev.getContext();
        if (context != null && (intentKWHzl = application.KWHzl(context, tev.AhwBna())) != null) {
            tev.startActivity(intentKWHzl);
        }
        return Unit.INSTANCE;
    }

    private final ConcatAdapter KWHzl() {
        return (ConcatAdapter) this.KWHzl.getValue();
    }

    public static final ConcatAdapter isConnected(tEV tev) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{tev.AEQbTJ(), tev.copydefault});
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        android.widget.FrameLayout root;
        super.onResume();
        tNO tnoOLrzqt = OLrzqt();
        if (tnoOLrzqt == null || (root = tnoOLrzqt.getRoot()) == null) {
            return;
        }
        root.requestLayout();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNO tnoAEQbTJ = tNO.AEQbTJ(view);
        Intrinsics.copydefault(tnoAEQbTJ);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        copydefault(tnoAEQbTJ, viewLifecycleOwner);
        EZpvd(tnoAEQbTJ);
        AEQbTJ(new Function1() { // from class: o.tEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tEV.OLrzqt(this.EZpvd, (tNO) obj);
            }
        });
    }

    public static final Unit OLrzqt(tEV tev, tNO tno) {
        Intrinsics.checkNotNullParameter(tno, "");
        if (tev.valueOf()) {
            tno.OLrzqt.setWrapContent(true);
            tno.OLrzqt.setOverScrollMode(2);
        }
        tno.OLrzqt.setAdapter(tev.KWHzl());
        tno.OLrzqt.setLayoutManager(new LinearLayoutManager(tev.getContext()));
        tno.OLrzqt.setItemAnimator(null);
        if (tno.OLrzqt.getItemDecorationCount() == 0) {
            tno.OLrzqt.addItemDecoration(new ActionBar(C55298xhM.dp2pxFloat$default(4.0f, null, 1, null), C55298xhM.dp2pxFloat$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.zuBGHE)));
        }
        StateFlow<AbstractC46197tLk<tEM.TaskDescription>> stateFlowAEQbTJ = tev.copydefault().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = tev.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C46373tRy.AEQbTJ(stateFlowAEQbTJ, viewLifecycleOwner, Lifecycle.State.CREATED, new ProfileLatestRecordsFragment$initView$2$1(tev, null));
        tev.copydefault().AEQbTJ(tev.AhwBna, tev.AYXKKw, false);
        return Unit.INSTANCE;
    }

    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final float EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final float copydefault;
        public final android.graphics.Paint djBIcL = new android.graphics.Paint(1);
        public final int AEQbTJ = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);

        public ActionBar(float f, float f2, int i, int i2) {
            this.EZpvd = f;
            this.copydefault = f2;
            this.KWHzl = i;
            this.OLrzqt = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.top = C55298xhM.dp2px$default(12.0f, null, 1, null);
            } else if (childAdapterPosition == state.getItemCount() - 1 && (recyclerView.getChildViewHolder(view) instanceof tEH.StateListAnimator)) {
                rect.top = C55298xhM.dp2px$default(-24.0f, null, 1, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            float paddingStart;
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.onDraw(canvas, recyclerView, state);
            boolean z = recyclerView.getLayoutDirection() == 1;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (recyclerView.getChildViewHolder(recyclerView.getChildAt(i)) instanceof tEH.ActionBar) {
                    if (z) {
                        paddingStart = (recyclerView.getWidth() - recyclerView.getPaddingEnd()) - (C55298xhM.dp2pxFloat$default(this.EZpvd, null, 1, null) / 2.0f);
                    } else {
                        paddingStart = recyclerView.getPaddingStart() + (C55298xhM.dp2pxFloat$default(this.EZpvd, null, 1, null) / 2.0f);
                    }
                    float f = paddingStart;
                    float top = r1.getTop() + C55298xhM.dp2pxFloat$default(7.5f, null, 1, null) + (this.EZpvd / 2.0f);
                    android.view.View childAt = recyclerView.getChildAt(i + 1);
                    if ((childAt != null ? recyclerView.getChildViewHolder(childAt) : null) instanceof tEH.ActionBar) {
                        this.djBIcL.setColor(this.OLrzqt);
                        this.djBIcL.setStrokeWidth(this.copydefault);
                        this.djBIcL.setStyle(Paint.Style.FILL);
                        canvas.drawLine(f, this.EZpvd + top, f, (this.EZpvd / 2.0f) + childAt.getTop() + C55298xhM.dp2pxFloat$default(7.5f, null, 1, null), this.djBIcL);
                    }
                    this.djBIcL.setColor(this.AEQbTJ);
                    this.djBIcL.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f, top, this.EZpvd, this.djBIcL);
                    this.djBIcL.setColor(this.KWHzl);
                    this.djBIcL.setStyle(Paint.Style.STROKE);
                    this.djBIcL.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.5f, null, 1, null));
                    canvas.drawCircle(f, top, this.EZpvd, this.djBIcL);
                }
            }
        }
    }

    public final void copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.AhwBna = str;
        this.AYXKKw = str2;
        copydefault().AEQbTJ(str, str2, true);
    }

    public final void AEQbTJ(boolean z) {
        copydefault().AEQbTJ(this.AhwBna, this.AYXKKw, z);
    }
}
