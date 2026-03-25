package o;

import android.os.Build;
import android.view.View;
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
import com.okinc.planet.biz_positions.ProfilePositionsFragment$initView$2$2;
import com.okinc.planet.biz_positions.ProfilePositionsFragment$initView$2$3;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.format.InstId;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC46032tFh;
import o.C47501trL;
import o.C55688xof;
import o.InterfaceC46072tGu;
import o.InterfaceC47502trM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46043tFs extends AbstractC32996moC implements InterfaceC47502trM<tNV> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public tNV AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> AYXKKw;
    public boolean djBIcL;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Application(this, PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.Companion.AEQbTJ())));
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new TaskDescription(this, "page", ""));
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Activity(this, "isSummary", java.lang.Boolean.FALSE));
    public final int gEmmrt = C47501trL.Application.RKDWNf;
    public final InterfaceC56387yDm fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy$default(this, C56524yIo.AEQbTJ(C46055tGd.class), new Function0() { // from class: o.tFA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46043tFs.fARcdN(this.AEQbTJ);
        }
    }, null, new Function0() { // from class: o.tFI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46043tFs.fIwbmz(this.KWHzl);
        }
    }, 4, null);
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tFE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46043tFs.isConnected(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tFG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46043tFs.EZpvd();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tFF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46043tFs.AuCTel(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(tNV tnv) {
        this.AEQbTJ = tnv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public tNV OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.tFs$Activity */
    public static final class Activity implements Function0<java.lang.Boolean> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;
        public final /* synthetic */ java.lang.Object OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.EZpvd = fragment;
            this.AEQbTJ = str;
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
            android.os.Bundle arguments = this.EZpvd.getArguments();
            java.lang.String str = this.AEQbTJ;
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

    /* JADX INFO: renamed from: o.tFs$Application */
    public static final class Application implements Function0<PlanetUniqueName> {
        public final /* synthetic */ java.lang.Object KWHzl;
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.OLrzqt = fragment;
            this.copydefault = str;
            this.KWHzl = obj;
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
            java.lang.String str = this.copydefault;
            ?? r2 = this.KWHzl;
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

    /* JADX INFO: renamed from: o.tFs$TaskDescription */
    public static final class TaskDescription implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.copydefault = fragment;
            this.AEQbTJ = str;
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
            android.os.Bundle arguments = this.copydefault.getArguments();
            java.lang.String str = this.AEQbTJ;
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

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;Landroidx/lifecycle/LifecycleOwner;)V */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull tNV tnv, @NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC47502trM.Application.KWHzl(this, tnv, lifecycleOwner);
    }

    public void OLrzqt(@NotNull Function1<? super tNV, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    /* JADX INFO: renamed from: o.tFs$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tFs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tFs$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: newInstance-EPykF4U$default, reason: not valid java name */
        public static /* synthetic */ C46043tFs m8714newInstanceEPykF4U$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function1 = null;
            }
            return stateListAnimator.OLrzqt(str, z, str2, function1);
        }

        public final C46043tFs OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C46043tFs c46043tFs = new C46043tFs();
            c46043tFs.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("isSummary", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(str)), C56390yDp.OLrzqt("page", str2)));
            c46043tFs.AYXKKw = function1;
            return c46043tFs;
        }
    }

    private final java.lang.String gEmmrt() {
        return ((PlanetUniqueName) this.AkhnZx.getValue()).EZpvd();
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    private final boolean fetchVPNInfo() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    private final C46055tGd valueOf() {
        return (C46055tGd) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelStore fARcdN(C46043tFs c46043tFs) {
        boolean zFetchVPNInfo = c46043tFs.fetchVPNInfo();
        C46043tFs c46043tFsRequireParentFragment = c46043tFs;
        if (zFetchVPNInfo) {
            c46043tFsRequireParentFragment = c46043tFs.requireParentFragment();
        }
        ViewModelStore viewModelStore = c46043tFsRequireParentFragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
        return viewModelStore;
    }

    public static final ViewModelProvider.Factory fIwbmz(C46043tFs c46043tFs) {
        C46043tFs c46043tFsRequireParentFragment = !c46043tFs.fetchVPNInfo() ? c46043tFs : c46043tFs.requireParentFragment();
        Intrinsics.copydefault(c46043tFsRequireParentFragment);
        boolean zFetchVPNInfo = c46043tFs.fetchVPNInfo();
        C46043tFs c46043tFsRequireParentFragment2 = c46043tFs;
        if (zFetchVPNInfo) {
            c46043tFsRequireParentFragment2 = c46043tFs.requireParentFragment();
        }
        return new tRJ(c46043tFsRequireParentFragment, c46043tFsRequireParentFragment2.getArguments(), new Function1() { // from class: o.tFx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46043tFs.KWHzl((SavedStateHandle) obj);
            }
        });
    }

    public static final C46055tGd KWHzl(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C46055tGd(savedStateHandle, null, null, null, null, 30, null);
    }

    public final C46036tFl KWHzl() {
        return (C46036tFl) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.tFs$ActionBar */
    public static final class ActionBar implements Function2<InstId, java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(InstId instId, java.lang.String str) {
            copydefault(instId.OLrzqt(), str);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int iOLrzqt = C46450tUu.copydefault.OLrzqt(str2);
            tTT ttt = tTT.copydefault;
            FragmentActivity fragmentActivityRequireActivity = C46043tFs.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tTT.navigateToTradeDetailPage$default(ttt, fragmentActivityRequireActivity, java.lang.String.valueOf(iOLrzqt), str, null, 8, null);
        }
    }

    public static final C46036tFl isConnected(final C46043tFs c46043tFs) {
        return new C46036tFl(c46043tFs.new ActionBar(), new Function1() { // from class: o.tFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46043tFs.EZpvd(this.EZpvd, (YieldDetails.Activity) obj);
            }
        }, new Function1() { // from class: o.tFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46043tFs.KWHzl(this.KWHzl, (InterfaceC46069tGr) obj);
            }
        }, new Function0() { // from class: o.tFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46043tFs.ejfBZ(this.KWHzl);
            }
        }, new Function2() { // from class: o.tFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C46043tFs.OLrzqt(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function0() { // from class: o.tFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46043tFs.fetchVPNInfo(this.KWHzl);
            }
        }, new Function0() { // from class: o.tFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46043tFs.DbNXlk(this.OLrzqt);
            }
        });
    }

    public static final Unit EZpvd(C46043tFs c46043tFs, YieldDetails.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C46058tGg c46058tGg = new C46058tGg(activity);
        androidx.fragment.app.FragmentManager childFragmentManager = c46043tFs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c46058tGg.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C46043tFs c46043tFs, InterfaceC46069tGr interfaceC46069tGr) {
        Intrinsics.checkNotNullParameter(interfaceC46069tGr, "");
        C46057tGf c46057tGf = new C46057tGf(interfaceC46069tGr);
        androidx.fragment.app.FragmentManager childFragmentManager = c46043tFs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c46057tGf.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C46043tFs c46043tFs) {
        android.content.Context contextRequireContext = c46043tFs.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.hfdhUn), new View.OnClickListener() { // from class: o.tFB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46043tFs.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit OLrzqt(C46043tFs c46043tFs, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C46056tGe c46056tGe = new C46056tGe(str, str2);
        androidx.fragment.app.FragmentManager childFragmentManager = c46043tFs.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c46056tGe.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C46043tFs c46043tFs) {
        android.content.Context contextRequireContext = c46043tFs.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.InterpolatorRes);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.hfdhUn), new View.OnClickListener() { // from class: o.tFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46043tFs.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit DbNXlk(C46043tFs c46043tFs) {
        ActivityC46032tFh.StateListAnimator stateListAnimator = ActivityC46032tFh.Companion;
        android.content.Context contextRequireContext = c46043tFs.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c46043tFs.startActivity(stateListAnimator.AEQbTJ(contextRequireContext, c46043tFs.gEmmrt(), false, c46043tFs.djBIcL()));
        return Unit.INSTANCE;
    }

    public final C46098tHt AYXKKw() {
        return (C46098tHt) this.KWHzl.getValue();
    }

    public static final C46098tHt EZpvd() {
        return new C46098tHt(false, 0, 3, null);
    }

    private final ConcatAdapter AhwBna() {
        return (ConcatAdapter) this.copydefault.getValue();
    }

    public static final ConcatAdapter AuCTel(C46043tFs c46043tFs) {
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{c46043tFs.KWHzl(), c46043tFs.AYXKKw()});
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNV tnvOLrzqt = tNV.OLrzqt(view);
        Intrinsics.copydefault(tnvOLrzqt);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AEQbTJ(tnvOLrzqt, viewLifecycleOwner);
        EZpvd(tnvOLrzqt);
        OLrzqt(new Function1() { // from class: o.tFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46043tFs.OLrzqt(this.copydefault, (tNV) obj);
            }
        });
    }

    public static final Unit OLrzqt(final C46043tFs c46043tFs, tNV tnv) {
        Intrinsics.checkNotNullParameter(tnv, "");
        tUN tun = tnv.EZpvd;
        if (c46043tFs.fetchVPNInfo()) {
            tun.setWrapContent(true);
            tun.setOverScrollMode(2);
        }
        tun.setAdapter(c46043tFs.AhwBna());
        tun.setLayoutManager(new LinearLayoutManager(c46043tFs.requireContext()));
        tun.setItemAnimator(null);
        Flow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu>>> flowEZpvd = c46043tFs.fetchVPNInfo() ? c46043tFs.valueOf().EZpvd() : c46043tFs.valueOf().copydefault();
        LifecycleOwner viewLifecycleOwner = c46043tFs.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C46373tRy.flowAndCollect$default(flowEZpvd, viewLifecycleOwner, null, new ProfilePositionsFragment$initView$2$2(tnv, c46043tFs, null), 2, null);
        StateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> stateFlowOLrzqt = c46043tFs.valueOf().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = c46043tFs.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C46373tRy.flowAndCollectLatest$default(stateFlowOLrzqt, viewLifecycleOwner2, null, new ProfilePositionsFragment$initView$2$3(c46043tFs, null), 2, null);
        C33546myW c33546myW = tnv.copydefault;
        Intrinsics.copydefault(c33546myW);
        C55296xhK.margin$default(c33546myW, null, null, null, java.lang.Float.valueOf(c46043tFs.fetchVPNInfo() ? 0.0f : 24.0f), 7, null);
        c33546myW.djBIcL(!c46043tFs.fetchVPNInfo());
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.tFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C46043tFs.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C46043tFs c46043tFs, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c46043tFs.DbNXlk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C46055tGd c46055tGdValueOf = valueOf();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        c46055tGdValueOf.AEQbTJ(lifecycle);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DbNXlk();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        valueOf().KWHzl();
    }
}
