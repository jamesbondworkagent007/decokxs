package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_performance.chart.ProfileChartFragment$initView$1$2;
import com.okinc.planet.biz_performance.chart.ProfileChartFragment$initView$1$3;
import com.okinc.planet.biz_performance.chart.ProfileChartFragment$onCreate$1;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_performance.data.ProfileChartTypeDto;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.widget.chart.profile.ChartProfileNewData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C46388tSm;
import o.C47501trL;
import o.InterfaceC47502trM;
import o.tBK;
import o.tKS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tBd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45920tBd extends AbstractC32996moC implements InterfaceC47502trM<C46277tOj> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AhwBna;
    public java.lang.String AkhnZx;
    public final InterfaceC56387yDm EZpvd;
    public C46277tOj OLrzqt;
    public ProfileChartTypeDto copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public java.lang.Integer gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;
    public final java.util.List<java.lang.Integer> DbNXlk = yDY.gEmmrt(7, 30, 90, 365);
    public final int AYXKKw = C47501trL.Application.OFhtUX;

    /* JADX INFO: renamed from: o.tBd$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProfileChartTypeDto.values().length];
            try {
                iArr[ProfileChartTypeDto.Pnl.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileChartTypeDto.PnlRatio.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C46277tOj OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(C46277tOj c46277tOj) {
        this.OLrzqt = c46277tOj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.tBd$Dialog */
    public static final class Dialog implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.Object EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.copydefault = fragment;
            this.KWHzl = str;
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
            java.lang.String str = this.KWHzl;
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

    /* JADX INFO: renamed from: o.tBd$PendingIntent */
    public static final class PendingIntent implements Function0<PlanetAuthorId> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.AEQbTJ = fragment;
            this.EZpvd = str;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.okinc.planet.biz_userprofile.data.PlanetAuthorId */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.okinc.planet.biz_userprofile.data.PlanetAuthorId, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final PlanetAuthorId invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle arguments = this.AEQbTJ.getArguments();
            java.lang.String str = this.EZpvd;
            ?? r2 = this.KWHzl;
            if (arguments == null || !arguments.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(PlanetAuthorId.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(arguments.getInt(str));
                    obj = (PlanetAuthorId) (objValueOf instanceof PlanetAuthorId ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(arguments.getLong(str));
                    obj = (PlanetAuthorId) (objValueOf2 instanceof PlanetAuthorId ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(arguments.getFloat(str));
                    obj = (PlanetAuthorId) (objValueOf3 instanceof PlanetAuthorId ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(arguments.getDouble(str));
                    obj = (PlanetAuthorId) (objValueOf4 instanceof PlanetAuthorId ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(arguments.getBoolean(str));
                    obj = (PlanetAuthorId) (objValueOf5 instanceof PlanetAuthorId ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    java.lang.Object string = arguments.getString(str);
                    obj = (PlanetAuthorId) (string instanceof PlanetAuthorId ? string : null);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = arguments.getParcelable(str, PlanetAuthorId.class);
                } else {
                    java.lang.Object parcelable2 = arguments.getParcelable(str);
                    obj = (PlanetAuthorId) (parcelable2 instanceof PlanetAuthorId ? parcelable2 : null);
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
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetAuthorId");
                }
                parcelable = (PlanetAuthorId) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = arguments.getParcelableArrayList(str);
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = yDY.AhwBna();
                }
                if (parcelableArrayList2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.okinc.planet.biz_userprofile.data.PlanetAuthorId");
                }
                parcelable = (PlanetAuthorId) parcelableArrayList2;
            }
            obj = parcelable;
            if (obj != null) {
            }
        }
    }

    /* JADX INFO: renamed from: o.tBd$TaskDescription */
    public static final class TaskDescription implements Function0<java.lang.Boolean> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = fragment;
            this.AEQbTJ = str;
            this.copydefault = obj;
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
            java.lang.String str = this.AEQbTJ;
            ?? r2 = this.copydefault;
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

    public void copydefault(@NotNull Function1<? super C46277tOj, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    public C45920tBd() {
        Function0 function0 = new Function0() { // from class: o.tBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.AuCTel(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_performance.chart.ProfileChartFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_performance.chart.ProfileChartFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tBA.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_performance.chart.ProfileChartFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_performance.chart.ProfileChartFragment$special$$inlined$viewModels$default$4
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
        this.djBIcL = C56392yDr.copydefault(new TaskDescription(this, "IN_DATA_RESET_PAGE_KEY", java.lang.Boolean.FALSE));
        this.AkhnZx = "";
        this.EZpvd = C56392yDr.copydefault(new PendingIntent(this, PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(PlanetAuthorId.Companion.OLrzqt())));
        this.isConnected = C56392yDr.copydefault(new Dialog(this, "page", ""));
        this.copydefault = ProfileChartTypeDto.Pnl;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.gEmmrt(this.OLrzqt);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.tBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.KWHzl();
            }
        });
    }

    /* JADX INFO: renamed from: o.tBd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tBd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C45920tBd copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C45920tBd c45920tBd = new C45920tBd();
            c45920tBd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(str)), C56390yDp.OLrzqt("IN_DATA_RESET_PAGE_KEY", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("timePeriod", str2), C56390yDp.OLrzqt("page", str3)));
            return c45920tBd;
        }
    }

    public final tBA AYXKKw() {
        return (tBA) this.values.getValue();
    }

    public static final ViewModelProvider.Factory AuCTel(C45920tBd c45920tBd) {
        return new tRJ(c45920tBd, c45920tBd.getArguments(), new Function1() { // from class: o.tBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.EZpvd((SavedStateHandle) obj);
            }
        });
    }

    public static final tBA EZpvd(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new tBA(savedStateHandle, null, null, null, 14, null);
    }

    public final boolean djBIcL() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public final void OLrzqt(Function1<? super java.lang.String, Unit> function1) {
        java.lang.String strValueOf = valueOf();
        if (strValueOf.length() <= 0) {
            strValueOf = null;
        }
        if (strValueOf != null) {
            function1.invoke(strValueOf);
        }
    }

    public final java.util.List<kotlin.Pair<C54989xbV, Function0<Unit>>> AhwBna() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List gEmmrt(final C45920tBd c45920tBd) {
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        C46277tOj c46277tOjOLrzqt = c45920tBd.OLrzqt();
        pairArr[0] = C56390yDp.OLrzqt(c46277tOjOLrzqt != null ? c46277tOjOLrzqt.AkhnZx : null, new Function0() { // from class: o.tBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.fetchVPNInfo(this.EZpvd);
            }
        });
        C46277tOj c46277tOjOLrzqt2 = c45920tBd.OLrzqt();
        pairArr[1] = C56390yDp.OLrzqt(c46277tOjOLrzqt2 != null ? c46277tOjOLrzqt2.AhwBna : null, new Function0() { // from class: o.tBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.DbNXlk(this.copydefault);
            }
        });
        C46277tOj c46277tOjOLrzqt3 = c45920tBd.OLrzqt();
        pairArr[2] = C56390yDp.OLrzqt(c46277tOjOLrzqt3 != null ? c46277tOjOLrzqt3.values : null, new Function0() { // from class: o.tBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.isConnected(this.KWHzl);
            }
        });
        C46277tOj c46277tOjOLrzqt4 = c45920tBd.OLrzqt();
        pairArr[3] = C56390yDp.OLrzqt(c46277tOjOLrzqt4 != null ? c46277tOjOLrzqt4.isConnected : null, new Function0() { // from class: o.tBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.values(this.OLrzqt);
            }
        });
        C46277tOj c46277tOjOLrzqt5 = c45920tBd.OLrzqt();
        pairArr[4] = C56390yDp.OLrzqt(c46277tOjOLrzqt5 != null ? c46277tOjOLrzqt5.fetchVPNInfo : null, new Function0() { // from class: o.tBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45920tBd.AkhnZx(this.AEQbTJ);
            }
        });
        return yDY.gEmmrt(pairArr);
    }

    public static final Unit fetchVPNInfo(C45920tBd c45920tBd) {
        c45920tBd.OLrzqt(new Function1() { // from class: o.tBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.djBIcL((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tTP.OLrzqt(new tKS.Application(null, str, null));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C45920tBd c45920tBd) {
        c45920tBd.OLrzqt(new Function1() { // from class: o.tBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.gEmmrt((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tTP.OLrzqt(new tKS.FragmentManager(null, str, null));
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C45920tBd c45920tBd) {
        c45920tBd.OLrzqt(new Function1() { // from class: o.tBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.AYXKKw((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tTP.OLrzqt(new tKS.StateListAnimator(null, str, null));
        return Unit.INSTANCE;
    }

    public static final Unit values(C45920tBd c45920tBd) {
        c45920tBd.OLrzqt(new Function1() { // from class: o.tBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.AhwBna((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tTP.OLrzqt(new tKS.TaskDescription(null, str, null));
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C45920tBd c45920tBd) {
        c45920tBd.OLrzqt(new Function1() { // from class: o.tBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.valueOf((java.lang.String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tTP.OLrzqt(new tKS.ActionBar(null, str, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(C45920tBd c45920tBd, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c45920tBd.AEQbTJ(num, z);
    }

    public final void AEQbTJ(java.lang.Integer num, boolean z) {
        java.lang.Object next;
        if (num != null) {
            this.gEmmrt = num;
        }
        if (isResumed() || z) {
            if (!djBIcL() || this.gEmmrt == null) {
                java.util.Iterator<T> it = AhwBna().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C54989xbV c54989xbV = (C54989xbV) ((kotlin.Pair) next).getFirst();
                    if (c54989xbV != null && c54989xbV.isSelected()) {
                        break;
                    }
                }
                kotlin.Pair pair = (kotlin.Pair) next;
                if (pair != null) {
                    C54989xbV c54989xbV2 = (C54989xbV) pair.getFirst();
                    java.lang.Object tag = c54989xbV2 != null ? c54989xbV2.getTag() : null;
                    java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                    AYXKKw().KWHzl(str != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)) : null, this.copydefault, djBIcL(), z);
                    return;
                }
                return;
            }
            tBA tbaAYXKKw = AYXKKw();
            int iCopydefault = copydefault();
            java.lang.Integer num2 = this.gEmmrt;
            tbaAYXKKw.KWHzl(java.lang.Integer.valueOf(java.lang.Math.min(iCopydefault, num2 != null ? num2.intValue() : 0)), this.copydefault, djBIcL(), z);
        }
    }

    /* JADX INFO: renamed from: o.tBd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ kotlin.Pair KWHzl;
        public final /* synthetic */ C45920tBd OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.view.View view2, C45920tBd c45920tBd, kotlin.Pair pair) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = view2;
            this.OLrzqt = c45920tBd;
            this.KWHzl = pair;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                for (kotlin.Pair pair : this.OLrzqt.AhwBna()) {
                    C54989xbV c54989xbV = (C54989xbV) pair.getFirst();
                    if (c54989xbV != null) {
                        c54989xbV.setSelected(Intrinsics.EZpvd(pair, this.KWHzl));
                    }
                }
                ((Function0) this.KWHzl.getSecond()).invoke();
                C45920tBd.refresh$default(this.OLrzqt, null, false, 3, null);
            }
        }
    }

    public final int copydefault() {
        java.lang.Object next;
        java.util.Iterator<T> it = AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C54989xbV c54989xbV = (C54989xbV) ((kotlin.Pair) next).getFirst();
            if (c54989xbV != null && c54989xbV.isSelected()) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) next;
        C54989xbV c54989xbV2 = pair != null ? (C54989xbV) pair.getFirst() : null;
        C46277tOj c46277tOjOLrzqt = OLrzqt();
        if (Intrinsics.EZpvd(c54989xbV2, c46277tOjOLrzqt != null ? c46277tOjOLrzqt.AkhnZx : null)) {
            return 7;
        }
        C46277tOj c46277tOjOLrzqt2 = OLrzqt();
        if (Intrinsics.EZpvd(c54989xbV2, c46277tOjOLrzqt2 != null ? c46277tOjOLrzqt2.AhwBna : null)) {
            return 30;
        }
        C46277tOj c46277tOjOLrzqt3 = OLrzqt();
        if (Intrinsics.EZpvd(c54989xbV2, c46277tOjOLrzqt3 != null ? c46277tOjOLrzqt3.values : null)) {
            return 90;
        }
        C46277tOj c46277tOjOLrzqt4 = OLrzqt();
        return Intrinsics.EZpvd(c54989xbV2, c46277tOjOLrzqt4 != null ? c46277tOjOLrzqt4.isConnected : null) ? 365 : 10000;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (djBIcL()) {
            return;
        }
        C46386tSk c46386tSk = C46386tSk.copydefault;
        C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
        java.lang.String strEZpvd = c46386tSk.EZpvd(taskDescription.KWHzl().copydefault());
        ProfileChartTypeDto profileChartTypeDto = ProfileChartTypeDto.Pnl;
        if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) profileChartTypeDto.toString())) {
            profileChartTypeDto = ProfileChartTypeDto.PnlRatio;
        }
        this.copydefault = profileChartTypeDto;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("timePeriod") : null;
        if (string == null) {
            string = "";
        }
        this.AkhnZx = string;
        if (string.length() == 0 || !this.DbNXlk.contains(java.lang.Integer.valueOf(C33129mqd.AhwBna(this.AkhnZx)))) {
            this.AkhnZx = c46386tSk.AEQbTJ(taskDescription.KWHzl().copydefault());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProfileChartFragment$onCreate$1(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AYXKKw().AEQbTJ().getValue().OLrzqt() == null || this.AhwBna) {
            refresh$default(this, null, this.AhwBna, 1, null);
            this.AhwBna = false;
        }
        if (Intrinsics.EZpvd(AYXKKw().EZpvd().getValue(), tBK.Activity.Companion.copydefault())) {
            AYXKKw().OLrzqt();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd(C46277tOj.OLrzqt(view));
        copydefault(new Function1() { // from class: o.tBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.KWHzl(this.copydefault, (C46277tOj) obj);
            }
        });
        gEmmrt();
    }

    public static final Unit KWHzl(C45920tBd c45920tBd, C46277tOj c46277tOj) {
        C54989xbV c54989xbV;
        Intrinsics.checkNotNullParameter(c46277tOj, "");
        c46277tOj.KWHzl.setCharacterLists(C57862yqS.copydefault());
        tAP tap = c46277tOj.KWHzl;
        C55051xce c55051xce = C55051xce.OLrzqt;
        tap.setTypeface(c55051xce.AEQbTJ());
        c46277tOj.KWHzl.setText("--", false);
        c46277tOj.OLrzqt.setCharacterLists(C57862yqS.copydefault());
        c46277tOj.OLrzqt.setTypeface(c55051xce.AEQbTJ());
        c46277tOj.OLrzqt.setText("--", false);
        java.util.Iterator<T> it = c45920tBd.AhwBna().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair = (kotlin.Pair) next;
                if (c45920tBd.AkhnZx.length() > 0 && c45920tBd.DbNXlk.contains(java.lang.Integer.valueOf(C33129mqd.AhwBna(c45920tBd.AkhnZx))) && (c54989xbV = (C54989xbV) pair.getFirst()) != null) {
                    int iAhwBna = C33129mqd.AhwBna(c45920tBd.AkhnZx);
                    C54989xbV c54989xbV2 = (C54989xbV) pair.getFirst();
                    c54989xbV.setSelected(iAhwBna == C33129mqd.AhwBna(c54989xbV2 != null ? c54989xbV2.getTag() : null));
                }
                C54989xbV c54989xbV3 = (C54989xbV) pair.getFirst();
                if (c54989xbV3 != null) {
                    c54989xbV3.setOnClickListener(new ActionBar(c54989xbV3, 300L, c54989xbV3, c45920tBd, pair));
                }
                i++;
            } else {
                StateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> stateFlowAEQbTJ = c45920tBd.AYXKKw().AEQbTJ();
                LifecycleOwner viewLifecycleOwner = c45920tBd.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.CREATED;
                C46373tRy.AEQbTJ(stateFlowAEQbTJ, viewLifecycleOwner, state, new ProfileChartFragment$initView$1$2(c45920tBd, c46277tOj, null));
                StateFlow<tBK.Activity> stateFlowEZpvd = c45920tBd.AYXKKw().EZpvd();
                LifecycleOwner viewLifecycleOwner2 = c45920tBd.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
                C46373tRy.AEQbTJ(stateFlowEZpvd, viewLifecycleOwner2, state, new ProfileChartFragment$initView$1$3(c46277tOj, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void gEmmrt() {
        final C55249xgQ c55249xgQ;
        C46277tOj c46277tOjOLrzqt = OLrzqt();
        if (c46277tOjOLrzqt == null || (c55249xgQ = c46277tOjOLrzqt.AYXKKw) == null) {
            return;
        }
        int i = 0;
        tRC.KWHzl(c55249xgQ, yDY.gEmmrt(c55249xgQ.newTab().setText(C47501trL.Fragment.zDGrpR).setTag(0), c55249xgQ.newTab().setText(C47501trL.Fragment.Dap).setTag(1)), new Function1() { // from class: o.tBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.OLrzqt(this.AEQbTJ, c55249xgQ, (TabLayout.Tab) obj);
            }
        });
        int i2 = Application.EZpvd[this.copydefault.ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        c55249xgQ.selectTab(c55249xgQ.getTabAt(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C45920tBd c45920tBd, C55249xgQ c55249xgQ, TabLayout.Tab tab) {
        Unit unit;
        tWE twe;
        Intrinsics.checkNotNullParameter(tab, "");
        int position = tab.getPosition();
        if (position == 0) {
            c45920tBd.copydefault = ProfileChartTypeDto.PnlRatio;
            java.lang.String strValueOf = c45920tBd.valueOf();
            if (strValueOf.length() <= 0) {
                strValueOf = null;
            }
            if (strValueOf != null) {
                tTP.OLrzqt(new tKS.Fragment(null, strValueOf, null));
            }
        } else if (position == 1) {
            c45920tBd.copydefault = ProfileChartTypeDto.Pnl;
            java.lang.String strValueOf2 = c45920tBd.valueOf();
            if (strValueOf2.length() <= 0) {
                strValueOf2 = null;
            }
            if (strValueOf2 != null) {
                tTP.OLrzqt(new tKS.Dialog(null, strValueOf2, null));
            }
        }
        java.util.List<ChartProfileDataResp> listCopydefault = c45920tBd.AYXKKw().AEQbTJ().getValue().copydefault();
        if (listCopydefault != null) {
            C46277tOj c46277tOjOLrzqt = c45920tBd.OLrzqt();
            if (c46277tOjOLrzqt == null || (twe = c46277tOjOLrzqt.EZpvd) == null) {
                unit = null;
            } else {
                c45920tBd.AEQbTJ(twe, listCopydefault);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
            }
        } else {
            refresh$default(c45920tBd, null, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final xMW KWHzl() {
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (interfaceC54581xNrEZpvd != null) {
            return interfaceC54581xNrEZpvd.KWHzl();
        }
        return null;
    }

    public final void AEQbTJ(tWE twe, java.util.List<ChartProfileDataResp> list) {
        ValueFormatter activity;
        java.lang.Object next;
        C54989xbV c54989xbV;
        java.lang.Object tag;
        BigDecimal bigDecimalCopydefault;
        boolean z = this.copydefault == ProfileChartTypeDto.PnlRatio;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ChartProfileDataResp chartProfileDataResp : list) {
            long jKWHzl = chartProfileDataResp.KWHzl();
            if (z) {
                bigDecimalCopydefault = chartProfileDataResp.OLrzqt();
            } else {
                bigDecimalCopydefault = chartProfileDataResp.copydefault();
            }
            arrayList.add(new ChartProfileNewData(jKWHzl, bigDecimalCopydefault, chartProfileDataResp.copydefault(), chartProfileDataResp.OLrzqt()));
        }
        java.util.List<ChartProfileNewData> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        if (arrayList.size() == 1) {
            java.util.Iterator<T> it = AhwBna().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C54989xbV c54989xbV2 = (C54989xbV) ((kotlin.Pair) next).getFirst();
                if (c54989xbV2 != null && c54989xbV2.isSelected()) {
                    break;
                }
            }
            kotlin.Pair pair = (kotlin.Pair) next;
            listFJNWhG.add(0, new ChartProfileNewData(((ChartProfileNewData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).OLrzqt() - (((long) (((pair == null || (c54989xbV = (C54989xbV) pair.getFirst()) == null || (tag = c54989xbV.getTag()) == null) ? 365 : C33129mqd.AhwBna(tag)) * RemoteMessageConst.DEFAULT_TTL)) * 1000), C33129mqd.EZpvd(((ChartProfileNewData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).KWHzl()), ((ChartProfileNewData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).EZpvd(), ((ChartProfileNewData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).AEQbTJ()));
        }
        if (z) {
            activity = new C46494tWk();
        } else {
            activity = new Activity();
        }
        twe.KWHzl(listFJNWhG, true, z, activity, ((InterfaceC46554tYq) C43251rlk.copydefault(InterfaceC46554tYq.class)).copydefault(), new Function1() { // from class: o.tBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.copydefault(this.KWHzl, (ChartProfileNewData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.tBd$Activity */
    public static final class Activity extends C46488tWe {
        @Override // o.C46488tWe, com.github.mikephil.charting.formatter.LargeValueFormatter, com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getFormattedValue(float f) {
            return C46367tRs.m8766pnlDollarFormatHYcmJmU$default(PlanetNumericString.AEQbTJ(C33129mqd.gEmmrt(C33129mqd.EZpvd(java.lang.Float.valueOf(f)))), false, 1, null);
        }
    }

    public static final Unit copydefault(C45920tBd c45920tBd, ChartProfileNewData chartProfileNewData) {
        Intrinsics.checkNotNullParameter(chartProfileNewData, "");
        c45920tBd.EZpvd(chartProfileNewData);
        return Unit.INSTANCE;
    }

    public final void EZpvd(InterfaceC46484tWa interfaceC46484tWa) {
        final BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(interfaceC46484tWa.KWHzl());
        copydefault(new Function1() { // from class: o.tBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45920tBd.EZpvd(this.copydefault, bigDecimalEZpvd, (C46277tOj) obj);
            }
        });
    }

    public static final Unit EZpvd(C45920tBd c45920tBd, BigDecimal bigDecimal, C46277tOj c46277tOj) {
        java.lang.Object next;
        C45920tBd c45920tBd2;
        java.lang.Integer numValueOf;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        C54989xbV c54989xbV;
        java.lang.Object tag;
        Intrinsics.checkNotNullParameter(c46277tOj, "");
        java.util.Iterator<T> it = c45920tBd.AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C54989xbV c54989xbV2 = (C54989xbV) ((kotlin.Pair) next).getFirst();
            if (c54989xbV2 != null && c54989xbV2.isSelected()) {
                break;
            }
        }
        kotlin.Pair pair = (kotlin.Pair) next;
        if (pair == null || (c54989xbV = (C54989xbV) pair.getFirst()) == null || (tag = c54989xbV.getTag()) == null) {
            c45920tBd2 = c45920tBd;
            numValueOf = null;
        } else {
            numValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(tag));
            c45920tBd2 = c45920tBd;
        }
        int i = Application.EZpvd[c45920tBd2.copydefault.ordinal()];
        if (i == 1) {
            android.widget.TextView textView = c46277tOj.AEQbTJ;
            if (numValueOf != null && numValueOf.intValue() == 365) {
                strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.v, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "1")));
            } else if (numValueOf == null) {
                strCopydefault = C33070mpX.AYXKKw(C47501trL.Fragment.FSMca);
            } else {
                strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.aeJQwa, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(numValueOf))));
            }
            textView.setText(strCopydefault);
            c46277tOj.KWHzl.setText(C46367tRs.m8766pnlDollarFormatHYcmJmU$default(PlanetNumericString.AEQbTJ(C33129mqd.gEmmrt(C33129mqd.EZpvd(bigDecimal))), false, 1, null));
            c46277tOj.KWHzl.setTextColor(C46368tRt.getPnlTextColor$default(C33129mqd.gEmmrt(bigDecimal.setScale(2, RoundingMode.DOWN)), 0, false, 3, null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            android.widget.TextView textView2 = c46277tOj.AEQbTJ;
            if (numValueOf != null && numValueOf.intValue() == 365) {
                strCopydefault2 = C33069mpW.copydefault(C47501trL.Fragment.fdt, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "1")));
            } else if (numValueOf == null) {
                strCopydefault2 = C33070mpX.AYXKKw(C47501trL.Fragment.setPageName);
            } else {
                strCopydefault2 = C33069mpW.copydefault(C47501trL.Fragment.FQNKFG, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(numValueOf))));
            }
            textView2.setText(strCopydefault2);
            c46277tOj.KWHzl.setText(pTB.formatICUPercent$default(bigDecimal, RoundingMode.HALF_UP, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 18, null));
            c46277tOj.KWHzl.setTextColor(C46368tRt.getPercentColor$default(C33129mqd.djBIcL(bigDecimal), 0, 1, null));
        }
        return Unit.INSTANCE;
    }
}
