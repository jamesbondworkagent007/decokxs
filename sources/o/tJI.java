package o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage;
import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import com.okinc.planet.biz_performance.data.ChartProfileCopyTrading;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_performance.data.ProfileChartDto;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$handleSettingsActionDeeplink$1;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$1;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$2;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$3;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$4;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initView$1$4$2$3;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$setBindingUserData$1$1;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$x$2;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus;
import com.okinc.planet.biz_userprofile.data.PlanetProfileTierLevels;
import com.okinc.planet.biz_userprofile.data.PlanetTier;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.biz_userprofile.data.PlanetUid;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.data.PlanetUserType;
import com.okinc.planet_api.model.PlanetProfileSettingsActions;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.social_trade_api.data.ChartPeriod;
import com.okinc.web.WebActivity;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC46100tHv;
import o.C46154tJv;
import o.C47501trL;
import o.C52761wXj;
import o.C55284xgz;
import o.InterfaceC46198tLl;
import o.InterfaceC8104awT;
import o.tAN;
import o.tJB;
import o.tJI;
import o.tKJ;
import o.tKS;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tJI extends AbstractActivityC47505trP {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AubY;
    public boolean DbNXlk;
    public ActivityResultLauncher<android.content.Intent> EZpvd;
    public C46237tMx KWHzl;
    public boolean djBIcL;
    public ActivityResultLauncher<android.content.Intent> fetchVPNInfo;
    public float getFieldNames;
    public float getNewProxyInstance;
    public TabLayoutMediator hDKMBd;
    public TabLayout.OnTabSelectedListener iwGUEr;
    public java.lang.String valueOf;
    public java.lang.Float values;
    public java.lang.String fARcdN = "";
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new ContextWrapper(this, "community_user_copy_lead_tab_target", ""));
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new IntentFilter(this, "community_user_center_user_channel", "other"));
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.tKa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.zsXlph(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.tKc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.KWHzl();
        }
    });
    public final InterfaceC56387yDm uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.tKe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.AubY(this.OLrzqt);
        }
    });
    public final C59534zip AEQbTJ = new C59534zip();
    public final java.util.Set<java.lang.Integer> AYXKKw = new LinkedHashSet();
    public ActivityResultLauncher<Unit> AkhnZx = tKR.KWHzl.copydefault(this, new Function0() { // from class: o.tKi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.wlaJM(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tKj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.uzCIH(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.tKf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tJI.zLjUOn(this.KWHzl);
        }
    });
    public final AppBarLayout.OnOffsetChangedListener ejfBZ = new AppBarLayout.OnOffsetChangedListener() { // from class: o.tKh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            tJI.AEQbTJ(this.copydefault, appBarLayout, i);
        }
    };
    public ClipboardManager.OnPrimaryClipChangedListener AhwBna = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: o.tKg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            tJI.iwGUEr(this.KWHzl);
        }
    };

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetTradeTypes.values().length];
            try {
                iArr[PlanetTradeTypes.Swap.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetTradeTypes.Spot.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[FollowStatusV2Enum.values().length];
            try {
                iArr2[FollowStatusV2Enum.FOLLOWING_EACH_OTHER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[FollowStatusV2Enum.I_FOLLOWING_OTHER_PARTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[FollowStatusV2Enum.OTHER_PARTY_FOLLOW_ME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final class ContextWrapper implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.Object AEQbTJ;
        public final /* synthetic */ AppCompatActivity KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(AppCompatActivity appCompatActivity, java.lang.String str, java.lang.Object obj) {
            this.KWHzl = appCompatActivity;
            this.copydefault = str;
            this.AEQbTJ = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle extras = this.KWHzl.getIntent().getExtras();
            java.lang.String str = this.copydefault;
            ?? r2 = this.AEQbTJ;
            if (extras == null || !extras.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(extras.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(extras.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(extras.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(extras.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(extras.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = extras.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = extras.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = extras.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = extras.getParcelableArrayList(str);
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

    public static final class IntentFilter implements Function0<java.lang.String> {
        public final /* synthetic */ AppCompatActivity AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentFilter(AppCompatActivity appCompatActivity, java.lang.String str, java.lang.Object obj) {
            this.AEQbTJ = appCompatActivity;
            this.EZpvd = str;
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.String */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String invoke() {
            java.lang.Object parcelable;
            java.lang.Object obj;
            android.os.Bundle extras = this.AEQbTJ.getIntent().getExtras();
            java.lang.String str = this.EZpvd;
            ?? r2 = this.KWHzl;
            if (extras == null || !extras.containsKey(str)) {
                return r2;
            }
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.String.class);
            if (!Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.List.class)) && !Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.util.ArrayList.class))) {
                if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
                    java.lang.Object objValueOf = java.lang.Integer.valueOf(extras.getInt(str));
                    obj = (java.lang.String) (objValueOf instanceof java.lang.String ? objValueOf : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
                    java.lang.Object objValueOf2 = java.lang.Long.valueOf(extras.getLong(str));
                    obj = (java.lang.String) (objValueOf2 instanceof java.lang.String ? objValueOf2 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Float.TYPE))) {
                    java.lang.Object objValueOf3 = java.lang.Float.valueOf(extras.getFloat(str));
                    obj = (java.lang.String) (objValueOf3 instanceof java.lang.String ? objValueOf3 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Double.TYPE))) {
                    java.lang.Object objValueOf4 = java.lang.Double.valueOf(extras.getDouble(str));
                    obj = (java.lang.String) (objValueOf4 instanceof java.lang.String ? objValueOf4 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Boolean.TYPE))) {
                    java.lang.Object objValueOf5 = java.lang.Boolean.valueOf(extras.getBoolean(str));
                    obj = (java.lang.String) (objValueOf5 instanceof java.lang.String ? objValueOf5 : null);
                } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.String.class))) {
                    parcelable = extras.getString(str);
                    if (parcelable instanceof java.lang.String) {
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = extras.getParcelable(str, java.lang.String.class);
                } else {
                    java.lang.Object parcelable2 = extras.getParcelable(str);
                    obj = (java.lang.String) (parcelable2 instanceof java.lang.String ? parcelable2 : null);
                }
                return obj != null ? r2 : obj;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                java.lang.Iterable parcelableArrayList = extras.getParcelableArrayList(str, android.os.Parcelable.class);
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.lang.Object objAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
                if (objAxsJAYsNCnLh == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                parcelable = (java.lang.String) objAxsJAYsNCnLh;
            } else {
                java.lang.Object parcelableArrayList2 = extras.getParcelableArrayList(str);
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

    public tJI() {
        final Function0 function0 = null;
        this.AubY = new ViewModelLazy(C56524yIo.AEQbTJ(tLX.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0() { // from class: o.tKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tJI.zuBGHE(this.OLrzqt);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tLX getFieldNames() {
        return (tLX) this.AubY.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tLX EZpvd(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new tLX(savedStateHandle, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    public static final ViewModelProvider.Factory zuBGHE(tJI tji) {
        android.content.Intent intent = tji.getIntent();
        return new tRJ(tji, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.EZpvd((SavedStateHandle) obj);
            }
        });
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tJI EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.EZpvd = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC47776twW.Companion.EZpvd(this.EZpvd);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ tJI OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = view2;
            this.OLrzqt = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
            PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                boolean zValues = this.OLrzqt.getFieldNames().values();
                java.lang.String strGEmmrt = this.OLrzqt.getFieldNames().gEmmrt();
                C46189tLc c46189tLcAEQbTJ = this.OLrzqt.getFieldNames().AEQbTJ();
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ((c46189tLcAEQbTJ == null || (planetBasicUserInfoRespEZpvd2 = c46189tLcAEQbTJ.EZpvd()) == null) ? null : planetBasicUserInfoRespEZpvd2.OcIXYQ()), (java.lang.Object) PlanetUserType.TwitterUser.getValue());
                C46189tLc c46189tLcAEQbTJ2 = this.OLrzqt.getFieldNames().AEQbTJ();
                java.lang.String strOcIXYQ = (c46189tLcAEQbTJ2 == null || (planetBasicUserInfoRespEZpvd = c46189tLcAEQbTJ2.EZpvd()) == null) ? null : planetBasicUserInfoRespEZpvd.OcIXYQ();
                boolean z = Intrinsics.EZpvd((java.lang.Object) strOcIXYQ, (java.lang.Object) PlanetUserType.NewsUser.getValue()) || Intrinsics.EZpvd((java.lang.Object) strOcIXYQ, (java.lang.Object) PlanetUserType.TwitterAndNewsUser.getValue());
                C46189tLc c46189tLcAEQbTJ3 = this.OLrzqt.getFieldNames().AEQbTJ();
                java.lang.String strCopydefault = c46189tLcAEQbTJ3 != null ? c46189tLcAEQbTJ3.copydefault() : null;
                tKJ.TaskDescription taskDescription = tKJ.Companion;
                InterfaceC46198tLl interfaceC46198tLlEZpvd = this.OLrzqt.EZpvd();
                tKJ tkjOLrzqt = taskDescription.OLrzqt(Intrinsics.EZpvd(interfaceC46198tLlEZpvd, InterfaceC46198tLl.Activity.OLrzqt) || (interfaceC46198tLlEZpvd instanceof InterfaceC46198tLl.Application), zValues, strGEmmrt, zEZpvd, z, strCopydefault);
                androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(tkjOLrzqt, supportFragmentManager, "PlanetProfileMenu");
            }
        }
    }

    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ C46237tMx AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, android.view.View view2, tJI tji, C46237tMx c46237tMx) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = view2;
            this.copydefault = tji;
            this.AEQbTJ = c46237tMx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new PlanetUserProfileActivity$setBindingUserData$1$1(this.copydefault, this.AEQbTJ, null), 3, null);
            }
        }
    }

    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ tJI AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = view2;
            this.AEQbTJ = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ();
            }
        }
    }

    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ tJI OLrzqt;
        public final /* synthetic */ C46189tLc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(android.view.View view, long j, android.view.View view2, tJI tji, C46189tLc c46189tLc) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = view2;
            this.OLrzqt = tji;
            this.copydefault = c46189tLc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(this.copydefault.AuCTel());
            }
        }
    }

    public static final class ContentResolver implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = view2;
            this.copydefault = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("FeedsProfile_Top_Badge_Click", (TrackChannel[]) null, ClipData.EZpvd, 1, (java.lang.Object) null);
                tKN tknOLrzqt = tKN.Companion.OLrzqt();
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(tknOLrzqt, supportFragmentManager, "OrbiterPlusBottomSheet");
            }
        }
    }

    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ tJI OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(android.view.View view, long j, android.view.View view2, tJI tji, java.lang.String str) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = view2;
            this.OLrzqt = tji;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", this.KWHzl);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.OLrzqt, bundle, null, 4, null);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.copydefault = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.fetchVPNInfo();
            }
        }
    }

    public static final class DialogInterface implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ PlanetTier OLrzqt;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(android.view.View view, long j, android.view.View view2, PlanetTier planetTier, tJI tji) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = view2;
            this.OLrzqt = planetTier;
            this.copydefault = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("FeedsProfile_Top_Badge_Click", (TrackChannel[]) null, Intent.copydefault, 1, (java.lang.Object) null);
                tJB.TaskDescription taskDescription = tJB.Companion;
                PlanetTier planetTier = this.OLrzqt;
                java.lang.String strAEQbTJ = planetTier != null ? planetTier.AEQbTJ() : null;
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                tJB tjbAEQbTJ = taskDescription.AEQbTJ(strAEQbTJ, this.copydefault.getFieldNames().copydefault());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(tjbAEQbTJ, supportFragmentManager, "BadgeDialog");
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = view2;
            this.copydefault = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AkhnZx();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ tJI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.OLrzqt = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                tJI tji = this.OLrzqt;
                C46189tLc c46189tLcAEQbTJ = tji.getFieldNames().AEQbTJ();
                tji.OLrzqt((c46189tLcAEQbTJ == null || (planetBasicUserInfoRespEZpvd = c46189tLcAEQbTJ.EZpvd()) == null) ? null : planetBasicUserInfoRespEZpvd.AubY());
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ tJI AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = view2;
            this.AEQbTJ = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                tKL tkl = new tKL();
                androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(tkl, supportFragmentManager, "PlanetOfficialAccountDialog");
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ tJI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = view2;
            this.copydefault = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Orbit_Twitter_ActivityData_Click", (TrackChannel[]) null, AssistContent.KWHzl, 1, (java.lang.Object) null);
                C46189tLc c46189tLcAEQbTJ = this.copydefault.getFieldNames().AEQbTJ();
                if (c46189tLcAEQbTJ == null) {
                    return;
                }
                tKO tkoCopydefault = tKO.Companion.copydefault(c46189tLcAEQbTJ.EZpvd().DTwDnp(), c46189tLcAEQbTJ.EZpvd().zuBGHE());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46371tRw.AEQbTJ(tkoCopydefault, supportFragmentManager, "PlanetXData");
            }
        }
    }

    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ tJI KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = view2;
            this.KWHzl = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ tJI EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.View view2, tJI tji) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = view2;
            this.EZpvd = tji;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault(false);
            }
        }
    }

    private final java.lang.String uzCIH() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    private final java.lang.String getNewProxyInstance() {
        return (java.lang.String) this.AuCTel.getValue();
    }

    public static final java.lang.String zsXlph(tJI tji) {
        java.lang.String strUzCIH = tji.uzCIH();
        if (Intrinsics.EZpvd((java.lang.Object) strUzCIH, (java.lang.Object) WalletSearchRequest.SEARCH_SOURCE_DISCOVER)) {
            return WalletSearchRequest.SEARCH_SOURCE_DISCOVER;
        }
        return Intrinsics.EZpvd((java.lang.Object) strUzCIH, (java.lang.Object) "marketboard") ? "nmp" : "na";
    }

    public static final C46388tSm KWHzl() {
        return tPF.copydefault.alsFma();
    }

    public final InterfaceC46387tSl djBIcL() {
        return (InterfaceC46387tSl) this.fIwbmz.getValue();
    }

    private final PlanetTradeTypes iwGUEr() {
        return (PlanetTradeTypes) this.uzCIH.getValue();
    }

    public static final PlanetTradeTypes AubY(tJI tji) {
        android.os.Bundle extras;
        java.lang.Object parcelable;
        android.content.Intent intent = tji.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = extras.getParcelable(PlanetTradeTypes.Key, PlanetTradeTypes.class);
        } else {
            java.lang.Object parcelable2 = extras.getParcelable(PlanetTradeTypes.Key);
            parcelable = (PlanetTradeTypes) (parcelable2 instanceof PlanetTradeTypes ? parcelable2 : null);
        }
        return (PlanetTradeTypes) parcelable;
    }

    public final C46237tMx gEmmrt() {
        C46237tMx c46237tMx = this.KWHzl;
        if (c46237tMx != null) {
            return c46237tMx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit wlaJM(tJI tji) {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = tji.fetchVPNInfo;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new android.content.Intent(tji, (java.lang.Class<?>) ActivityC46157tJy.class));
        return Unit.INSTANCE;
    }

    public static final android.view.View uzCIH(tJI tji) {
        return android.view.LayoutInflater.from(tji).inflate(C47501trL.Application.sSMYrx, (android.view.ViewGroup) tji.gEmmrt().getRoot(), false);
    }

    public final android.content.ClipboardManager AhwBna() {
        java.lang.Object systemService = getApplicationContext().getSystemService("clipboard");
        if (systemService instanceof android.content.ClipboardManager) {
            return (android.content.ClipboardManager) systemService;
        }
        return null;
    }

    private final PlanetProfileSettingsActions hDKMBd() {
        return (PlanetProfileSettingsActions) this.fJNWhG.getValue();
    }

    public static final PlanetProfileSettingsActions zLjUOn(tJI tji) {
        java.lang.Object parcelable;
        android.os.Bundle extras = tji.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = extras.getParcelable("community_user_center_user_setting_action", PlanetProfileSettingsActions.class);
        } else {
            java.lang.Object parcelable2 = extras.getParcelable("community_user_center_user_setting_action");
            parcelable = (PlanetProfileSettingsActions) (parcelable2 instanceof PlanetProfileSettingsActions ? parcelable2 : null);
        }
        return (PlanetProfileSettingsActions) parcelable;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static final android.content.Intent KWHzl(java.util.Map<java.lang.String, ? extends java.lang.Object> map, android.content.Context context, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7, final java.lang.String str8, final java.lang.String str9, final java.lang.String str10) {
            java.lang.String json;
            if (map != null) {
                try {
                    json = new Gson().toJson(map);
                } catch (java.lang.Exception e) {
                    pUU.copydefault("PlanetUserProfileActivity", "Failed to serialize extraParams: " + e.getMessage());
                    json = null;
                }
            } else {
                json = null;
            }
            final java.lang.String str11 = json;
            Function1 function1 = new Function1() { // from class: o.tKs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tJI.TaskDescription.OLrzqt(str, str2, str3, str4, str5, str6, str7, str8, str9, str11, str10, (android.content.Intent) obj);
                }
            };
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tJI.class);
            function1.invoke(intent);
            return intent;
        }

        public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "");
            intent.putExtra("community_user_center_user_channel", str);
            intent.putExtra("community_user_center_user_location", str2);
            kotlin.Pair[] pairArr = new kotlin.Pair[9];
            pairArr[0] = C56390yDp.OLrzqt(PlanetTradeTypes.Key, C33129mqd.OLrzqt((java.lang.CharSequence) str3) ? PlanetTradeTypes.Companion.OLrzqt(str3) : null);
            pairArr[1] = C56390yDp.OLrzqt(PlanetUid.Key, PlanetUid.KWHzl(PlanetUid.copydefault(str4 == null ? "" : str4)));
            pairArr[2] = C56390yDp.OLrzqt(PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(PlanetAuthorId.KWHzl(str5 == null ? "" : str5)));
            pairArr[3] = C56390yDp.OLrzqt(PlanetUniqueName.Key, PlanetUniqueName.EZpvd(PlanetUniqueName.AEQbTJ(str6 == null ? "" : str6)));
            pairArr[4] = C56390yDp.OLrzqt("community_user_center_user_setting_action", PlanetProfileSettingsActions.Activity.fromKey$default(PlanetProfileSettingsActions.Companion, str7 != null ? str7 : "", null, null, 6, null));
            pairArr[5] = C56390yDp.OLrzqt("community_user_copy_lead_tab_target", str8);
            pairArr[6] = C56390yDp.OLrzqt("timePeriod", str9);
            pairArr[7] = C56390yDp.OLrzqt("community_user_center_feed_lua_extra_param", str10);
            pairArr[8] = C56390yDp.OLrzqt("community_user_center_success_msg", str11);
            intent.putExtras(BundleKt.bundleOf(pairArr));
            return Unit.INSTANCE;
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str10) {
            Intrinsics.checkNotNullParameter(context, "");
            return KWHzl(map, context, str4, str5, str7, str, str2, str3, str8, str6, str9, str10);
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getEdgeToEdge().AEQbTJ();
        C46237tMx c46237tMxAEQbTJ = C46237tMx.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46237tMxAEQbTJ, "");
        setContentView(c46237tMxAEQbTJ.getRoot());
        this.KWHzl = c46237tMxAEQbTJ;
        KWHzl(false);
        AubY();
        valueOf();
        DbNXlk();
        zsXlph();
        wlaJM();
        zLjUOn();
        AEQbTJ(gEmmrt());
        isConnected();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        android.content.ClipboardManager clipboardManagerAhwBna;
        super.onStart();
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = this.AhwBna;
        if (onPrimaryClipChangedListener == null || (clipboardManagerAhwBna = AhwBna()) == null) {
            return;
        }
        clipboardManagerAhwBna.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
    }

    public final void isConnected() {
        this.fetchVPNInfo = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.tKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                tJI.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
        this.EZpvd = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.tKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                tJI.KWHzl(this.EZpvd, (ActivityResult) obj);
            }
        });
    }

    public static final void copydefault(tJI tji, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = tji.EZpvd;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(new android.content.Intent(tji, (java.lang.Class<?>) ActivityC46148tJp.class));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tJv.ActionBar.newInstance$default(o.tJv$ActionBar, java.lang.String, java.lang.String, int, java.lang.Object):o.tJv */
    public static final void KWHzl(tJI tji, ActivityResult activityResult) {
        java.lang.String stringExtra;
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            if (data != null && data.getBooleanExtra("async_x_result", false)) {
                C55284xgz.Activity activity = C55284xgz.Companion;
                ConstraintLayout constraintLayoutCopydefault = tji.gEmmrt().getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault, "");
                C55284xgz c55284xgzKWHzl = activity.KWHzl(constraintLayoutCopydefault, C33070mpX.AYXKKw(C47501trL.Fragment.hdpuIA));
                if (c55284xgzKWHzl != null) {
                    c55284xgzKWHzl.isConnected(3);
                    c55284xgzKWHzl.hDKMBd();
                }
                C32866mlf.onEvent$default("Twitter_Sync_SuccessfullyToast_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                return;
            }
            android.content.Intent data2 = activityResult.getData();
            switch (data2 != null ? data2.getIntExtra("async_x_code", 0) : 0) {
                case 55013:
                    C46154tJv.ActionBar.newInstance$default(C46154tJv.Companion, "async_x_fail_follow", null, 2, null).show(tji.getSupportFragmentManager(), "LinkXFailDialogFragment");
                    break;
                case 55014:
                    C46154tJv.ActionBar.newInstance$default(C46154tJv.Companion, "async_x_fail_abnormal", null, 2, null).show(tji.getSupportFragmentManager(), "LinkXFailDialogFragment");
                    break;
                default:
                    android.content.Intent data3 = activityResult.getData();
                    if (data3 == null || (stringExtra = data3.getStringExtra("async_x_message")) == null) {
                        stringExtra = "";
                    }
                    C55284xgz.Activity activity2 = C55284xgz.Companion;
                    ConstraintLayout constraintLayoutCopydefault2 = tji.gEmmrt().getRoot();
                    Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault2, "");
                    C55284xgz c55284xgzKWHzl2 = activity2.KWHzl(constraintLayoutCopydefault2, stringExtra);
                    if (c55284xgzKWHzl2 != null) {
                        c55284xgzKWHzl2.isConnected(1);
                        c55284xgzKWHzl2.hDKMBd();
                    }
                    break;
            }
        }
    }

    public final void KWHzl(boolean z, java.lang.String str) {
        pUU.EZpvd(getTAG(), "Received live status change: hasOngoingStream=" + z + ", shareCode=" + str);
        getFieldNames().AEQbTJ(z);
        if (str == null) {
            str = "";
        }
        EZpvd(z, str);
    }

    public final void copydefault(boolean z, final java.lang.String str) {
        int iDp2px$default = C55298xhM.dp2px$default(4.0f, null, 1, null);
        if (z) {
            gEmmrt().QVAiDq.setLiveState(true);
            gEmmrt().QVAiDq.setBackground(null);
            gEmmrt().QVAiDq.setBackgroundTintList(null);
            gEmmrt().QVAiDq.setPadding(0, 0, 0, 0);
            gEmmrt().OcIXYQ.setLiveState(true);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.tKo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tJI.copydefault(this.AEQbTJ, str, view);
                }
            };
            gEmmrt().QVAiDq.setOnClickListener(onClickListener);
            gEmmrt().OcIXYQ.setOnClickListener(onClickListener);
            return;
        }
        gEmmrt().QVAiDq.setLiveState(false);
        gEmmrt().QVAiDq.setBackgroundResource(C52761wXj.TaskDescription.dYepVG);
        gEmmrt().QVAiDq.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.RcXXUw)));
        gEmmrt().QVAiDq.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
        gEmmrt().OcIXYQ.setLiveState(false);
        gEmmrt().QVAiDq.setOnClickListener(null);
        gEmmrt().OcIXYQ.setOnClickListener(null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tRz.safeLaunch$default(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    public static final void copydefault(tJI tji, java.lang.String str, android.view.View view) {
        C46374tRz.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(tji), null, null, new PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1(tji, str, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tUQ.loadSelfAvatar$default(o.tUQ, boolean, int, java.lang.Object):void */
    public final void EZpvd(boolean z, java.lang.String str) {
        copydefault(z, str);
        if (getFieldNames().values()) {
            if (z) {
                gEmmrt().QVAiDq.OLrzqt(false);
                gEmmrt().OcIXYQ.OLrzqt(false);
            } else {
                tUQ.loadSelfAvatar$default(gEmmrt().QVAiDq, false, 1, null);
                tUQ.loadSelfAvatar$default(gEmmrt().OcIXYQ, false, 1, null);
            }
        }
    }

    private final void zsXlph() {
        java.lang.String stringExtra = getIntent().getStringExtra("community_user_center_user_location");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.fARcdN = stringExtra;
        this.valueOf = getIntent().getStringExtra("community_user_center_feed_lua_extra_param");
    }

    public final InterfaceC46198tLl EZpvd() {
        return (InterfaceC46198tLl) CollectionsKt___CollectionsKt.AkhnZx(getFieldNames().AYXKKw(), gEmmrt().zsXlph.getCurrentItem());
    }

    private final void zLjUOn() {
        final C46237tMx c46237tMxGEmmrt = gEmmrt();
        c46237tMxGEmmrt.QOLQEE.setContentDescription("SmartCopyFlowFragmentBackButton");
        ConstraintLayout constraintLayout = c46237tMxGEmmrt.QKVWgx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), C33570myu.OLrzqt(), constraintLayout.getPaddingEnd(), constraintLayout.getPaddingBottom());
        c46237tMxGEmmrt.QOLQEE.post(new java.lang.Runnable() { // from class: o.tJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tJI.OLrzqt(c46237tMxGEmmrt);
            }
        });
        c46237tMxGEmmrt.OLrzqt.setScaleX(1.0f);
        c46237tMxGEmmrt.OLrzqt.setScaleY(1.0f);
        android.widget.ImageView imageView = c46237tMxGEmmrt.OLrzqt;
        imageView.setOnClickListener(new PictureInPictureParams(imageView, 300L, imageView, this));
        C52794wYp c52794wYp = c46237tMxGEmmrt.fZBcTu;
        c52794wYp.setOnClickListener(new ComponentCallbacks2(c52794wYp, 300L, c52794wYp, this));
        c46237tMxGEmmrt.dvKsVJ.setTextViewToCopy(c46237tMxGEmmrt.dxcTrN.KWHzl());
        ViewPager2 viewPager2 = c46237tMxGEmmrt.zsXlph;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        viewPager2.setAdapter(new C47503trN(supportFragmentManager, lifecycle));
        final RecyclerView recyclerView = c46237tMxGEmmrt.AhwBna;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        this.AEQbTJ.register(ProfileChartDto.class, new C46212tLz(new Function0() { // from class: o.tJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tJI.hDKMBd(this.OLrzqt);
            }
        }));
        this.AEQbTJ.register(C46194tLh.class, new C46211tLy(new Function1() { // from class: o.tJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        this.AEQbTJ.register(UserProfileCopyTradingRes.class, new C46210tLx(new Function1() { // from class: o.tJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.AEQbTJ(this.KWHzl, recyclerView, (java.lang.String) obj);
            }
        }));
        recyclerView.addItemDecoration(new VoiceInteractor(recyclerView));
        recyclerView.setAdapter(this.AEQbTJ);
        recyclerView.addOnScrollListener(new SharedElementCallback());
    }

    public static final void OLrzqt(C46237tMx c46237tMx) {
        c46237tMx.AYXKKw.setMinimumHeight(c46237tMx.QOLQEE.getHeight());
    }

    public static final Unit hDKMBd(tJI tji) {
        C32866mlf.onEvent$default("Orbit_PersonalProfile_SlidingModule_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        java.util.Iterator<InterfaceC46198tLl> it = tji.getFieldNames().AYXKKw().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next() instanceof InterfaceC46198tLl.Application) {
                break;
            }
            i++;
        }
        if (i != -1) {
            RecyclerView.Adapter adapter = tji.gEmmrt().zsXlph.getAdapter();
            if (i < (adapter != null ? adapter.getItemCount() : 0)) {
                tji.gEmmrt().zsXlph.setCurrentItem(i, true);
                tji.gEmmrt().AEQbTJ.setExpanded(false, true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "widget_type", "performance", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(tJI tji, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default("Orbit_PersonalProfile_SlidingModule_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("PersonalPage_IM_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(tji), null, null, new PlanetUserProfileActivity$initView$1$4$2$3(tji, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "widget_type", "groups", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(tJI tji, RecyclerView recyclerView, java.lang.String str) {
        BusinessLine businessLine;
        InterfaceC49317umK interfaceC49317umK;
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 65959) {
            if (iHashCode != 2552066) {
                if (iHashCode != 2558355 || !str.equals("SWAP")) {
                    businessLine = null;
                } else if (!Intrinsics.EZpvd((java.lang.Object) tji.fARcdN, (java.lang.Object) "swap_lead_tab")) {
                    businessLine = BusinessLine.Swap;
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("ChartPeriod", ChartPeriod.Days30);
                    tji.setResult(-1, intent);
                    tji.finish();
                    businessLine = null;
                }
            } else if (str.equals("SPOT")) {
                if (!Intrinsics.EZpvd((java.lang.Object) tji.fARcdN, (java.lang.Object) "spot_lead_tab")) {
                    businessLine = BusinessLine.Spot;
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("ChartPeriod", ChartPeriod.Days30);
                    tji.setResult(-1, intent2);
                    tji.finish();
                    businessLine = null;
                }
            }
        } else if (str.equals("BOT")) {
            if (!Intrinsics.EZpvd((java.lang.Object) tji.fARcdN, (java.lang.Object) "SignalLeadTrade")) {
                businessLine = BusinessLine.Bots;
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("ChartPeriod", ChartPeriod.Days30);
                tji.setResult(-1, intent3);
                tji.finish();
                businessLine = null;
            }
        }
        BusinessLine businessLine2 = businessLine;
        if (businessLine2 != null && (interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class)) != null) {
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            interfaceC49317umK.copydefault(context, tji.getFieldNames().AhwBna(), businessLine2, "planet_profile", ChartPeriod.Days30);
        }
        return Unit.INSTANCE;
    }

    public static final class VoiceInteractor extends RecyclerView.ItemDecoration {
        public final /* synthetic */ RecyclerView OLrzqt;

        public VoiceInteractor(RecyclerView recyclerView) {
            this.OLrzqt = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            RecyclerView recyclerView2 = this.OLrzqt;
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.left = recyclerView2.getContext().getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.RJOkX);
            }
        }
    }

    public static final class SharedElementCallback extends RecyclerView.OnScrollListener {
        public SharedElementCallback() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                tJI.this.ejfBZ();
            }
        }
    }

    public final void ejfBZ() {
        RecyclerView.LayoutManager layoutManager = gEmmrt().AhwBna.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (!this.AYXKKw.contains(java.lang.Integer.valueOf(iFindFirstVisibleItemPosition))) {
                java.util.List<?> items = this.AEQbTJ.getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, iFindFirstVisibleItemPosition);
                if (objAkhnZx != null) {
                    if (objAkhnZx instanceof ProfileChartDto) {
                        C32866mlf.onEvent$default("Orbit_PersonalProfile_SlidingModule_View", (TrackChannel[]) null, new Function1() { // from class: o.tKr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return tJI.fetchVPNInfo((EventParamsList) obj);
                            }
                        }, 1, (java.lang.Object) null);
                        this.AYXKKw.add(java.lang.Integer.valueOf(iFindFirstVisibleItemPosition));
                    } else if (objAkhnZx instanceof C46194tLh) {
                        C32866mlf.onEvent$default("Orbit_PersonalProfile_SlidingModule_View", (TrackChannel[]) null, new Function1() { // from class: o.tKq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return tJI.AkhnZx((EventParamsList) obj);
                            }
                        }, 1, (java.lang.Object) null);
                        this.AYXKKw.add(java.lang.Integer.valueOf(iFindFirstVisibleItemPosition));
                    } else if (objAkhnZx instanceof UserProfileCopyTradingRes) {
                        C32866mlf.onEvent$default("Orbit_PersonalProfile_SlidingModule_View", (TrackChannel[]) null, new Function1() { // from class: o.tJJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return tJI.DbNXlk((EventParamsList) obj);
                            }
                        }, 1, (java.lang.Object) null);
                        this.AYXKKw.add(java.lang.Integer.valueOf(iFindFirstVisibleItemPosition));
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "widget_type", "performance", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "widget_type", "groups", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "widget_type", "copy_trading", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        this.hDKMBd = new TabLayoutMediator(gEmmrt().AwvSrB.copydefault(), gEmmrt().zsXlph, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                tJI.AEQbTJ(this.KWHzl, tab, i);
            }
        });
        TabLayout tabLayoutCopydefault = gEmmrt().AwvSrB.copydefault();
        tabLayoutCopydefault.setPadding(0, tabLayoutCopydefault.getPaddingTop(), 0, tabLayoutCopydefault.getPaddingBottom());
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.iwGUEr;
        if (onTabSelectedListener != null) {
            gEmmrt().AwvSrB.copydefault().removeOnTabSelectedListener(onTabSelectedListener);
        }
        this.iwGUEr = new TaskStackBuilder();
        TabLayout tabLayoutCopydefault2 = gEmmrt().AwvSrB.copydefault();
        TabLayout.OnTabSelectedListener onTabSelectedListener2 = this.iwGUEr;
        Intrinsics.copydefault(onTabSelectedListener2, "");
        tabLayoutCopydefault2.addOnTabSelectedListener(onTabSelectedListener2);
        gEmmrt().zsXlph.setUserInputEnabled(getFieldNames().AYXKKw().size() > 1);
        gEmmrt().AwvSrB.setOKDSIndicator(getFieldNames().AYXKKw().size() > 1);
        TabLayoutMediator tabLayoutMediator = this.hDKMBd;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.attach();
        }
    }

    public static final void AEQbTJ(tJI tji, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        InterfaceC46198tLl interfaceC46198tLl = (InterfaceC46198tLl) CollectionsKt___CollectionsKt.AkhnZx(tji.getFieldNames().AYXKKw(), i);
        if (interfaceC46198tLl == null) {
            return;
        }
        java.lang.Integer numAEQbTJ = interfaceC46198tLl.AEQbTJ();
        java.lang.String strAYXKKw = numAEQbTJ != null ? C33070mpX.AYXKKw(numAEQbTJ.intValue()) : null;
        tab.setText(strAYXKKw != null ? strAYXKKw : "");
        if (interfaceC46198tLl.EZpvd()) {
            tab.setIcon(C52761wXj.TaskDescription.unregister);
            tji.KWHzl(tab);
        }
        tab.setContentDescription(interfaceC46198tLl.OLrzqt());
    }

    public static final class TaskStackBuilder implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public TaskStackBuilder() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                tJI.this.KWHzl(tab);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tJI.this.KWHzl(tab);
        }
    }

    public final void EZpvd(float f) {
        this.getNewProxyInstance = f;
        C46237tMx c46237tMx = this.KWHzl;
        if (c46237tMx == null) {
            Intrinsics.gEmmrt("");
            c46237tMx = null;
        }
        c46237tMx.OcIXYQ.setAlpha(this.getNewProxyInstance);
    }

    public final void copydefault(float f) {
        this.getFieldNames = f;
        C46237tMx c46237tMx = this.KWHzl;
        if (c46237tMx == null) {
            Intrinsics.gEmmrt("");
            c46237tMx = null;
        }
        int iCopydefault = (C33070mpX.copydefault(C52761wXj.Activity.EZpvd) & 16777215) | (C56548yJl.EZpvd((int) (this.getFieldNames * 255), 0, 255) << 24);
        c46237tMx.QOLQEE.setStatusBarColor(iCopydefault);
        c46237tMx.QOLQEE.setBackGroundColor(iCopydefault);
    }

    public static final void AEQbTJ(tJI tji, AppBarLayout appBarLayout, int i) {
        float fFloatValue;
        C46237tMx c46237tMxGEmmrt = tji.gEmmrt();
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        int[] iArr = new int[2];
        appBarLayout.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        c46237tMxGEmmrt.QbewEr.getLocationInWindow(iArr2);
        int i2 = iArr2[1] - iArr[1];
        int height = c46237tMxGEmmrt.QbewEr.getHeight() + i2;
        int[] iArr3 = new int[2];
        c46237tMxGEmmrt.dxcTrN.getLocationInWindow(iArr3);
        int i3 = (iArr3[1] - iArr[1]) + ((int) (tji.getResources().getDisplayMetrics().density * 20.0f));
        int height2 = c46237tMxGEmmrt.QOLQEE.getHeight();
        boolean z = i3 <= height2;
        if (tji.values == null && !z && i >= -50) {
            tji.values = java.lang.Float.valueOf(i3);
        }
        java.lang.Float f = tji.values;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = !z ? i3 - i : height2 + 100;
        }
        float f2 = fFloatValue - height2;
        pUU.EZpvd("PlanetUserProfile", "onOffsetChanged: verticalOffset=" + i + ", avatarTopRelativeToAppBar=" + i2 + ", avatarBottomRelativeToAppBar=" + height + ", nameTopRelativeToAppBar=" + i3 + ", currentNameInitialTop=" + fFloatValue + ", storedNameInitialTop=" + tji.values + ", topBarHeight=" + height2 + ", scrollToNameEnterAppBar=" + f2 + ", nameHasEnteredAppBar=" + z + ", totalScrollRange=" + totalScrollRange);
        int i4 = -(height - height2);
        float fKWHzl = 1.0f;
        if (i > i4) {
            if (!z && f2 > 0.0f) {
                fKWHzl = C56548yJl.KWHzl((-i) / f2, 0.0f, 1.0f);
            }
            tji.copydefault(fKWHzl);
            tji.EZpvd(0.0f);
            pUU.EZpvd("PlanetUserProfile", "avatar not yet scrolled out, backgroundProgress=" + fKWHzl + ", verticalOffset=" + i + ", scrollToNameEnterAppBar=" + f2 + ", nameHasEnteredAppBar=" + z);
            return;
        }
        float fCopydefault = C56548yJl.copydefault(i4 - i, 0.0f);
        float f3 = tji.getResources().getDisplayMetrics().density * 50.0f;
        pUU.EZpvd("PlanetUserProfile", "currentScroll=" + fCopydefault + ", maxScroll=" + f3 + ", shortAnimationDistance=" + f3);
        if (f3 <= 0.0f) {
            tji.copydefault(1.0f);
            tji.EZpvd(1.0f);
            pUU.EZpvd("PlanetUserProfile", "maxScroll <= 0, setting content alpha to 1");
            return;
        }
        float fKWHzl2 = C56548yJl.KWHzl(fCopydefault / f3, 0.0f, 1.0f);
        pUU.EZpvd("PlanetUserProfile", "fraction=" + fKWHzl2 + ", progress=" + fKWHzl2 + ", backgroundProgress=1.0, contentProgress=" + fKWHzl2);
        tji.copydefault(1.0f);
        tji.EZpvd(fKWHzl2);
    }

    public static final void iwGUEr(tJI tji) {
        ClipData.Item itemAt;
        android.content.ClipboardManager clipboardManagerAhwBna = tji.AhwBna();
        if (clipboardManagerAhwBna != null) {
            android.content.ClipData primaryClip = clipboardManagerAhwBna.getPrimaryClip();
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) tji.gEmmrt().aKErDB.EZpvd(), (java.lang.CharSequence) java.lang.String.valueOf((primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText()), false, 2, (java.lang.Object) null)) {
                C55326xho.toastWithSuccessfulIcon$default(C47501trL.Fragment.jh, 0, 1, (java.lang.Object) null);
            }
        }
    }

    private final void wlaJM() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetUserProfileActivity$initObserve$1(this, null), 3, null);
        StateFlow<AbstractC46197tLk<C46189tLc>> stateFlowOLrzqt = getFieldNames().OLrzqt();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C46373tRy.AEQbTJ(stateFlowOLrzqt, this, state, new PlanetUserProfileActivity$initObserve$2(this, null));
        C46373tRy.AEQbTJ(getFieldNames().valueOf(), this, state, new PlanetUserProfileActivity$initObserve$3(this, null));
        C46373tRy.AEQbTJ(getFieldNames().isConnected(), this, state, new PlanetUserProfileActivity$initObserve$4(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(PlanetTier planetTier, java.lang.String str, boolean z, boolean z2) {
        java.lang.String strAYXKKw;
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        tLA tla = c46237tMxGEmmrt.AubY;
        Intrinsics.checkNotNullExpressionValue(tla, "");
        int i = 8;
        tla.setVisibility((z && z2) ? 0 : 8);
        tLA tla2 = c46237tMxGEmmrt.AubY;
        Intrinsics.checkNotNullExpressionValue(tla2, "");
        if (tla2.getVisibility() == 0) {
            c46237tMxGEmmrt.AubY.setIcon(C47501trL.ActionBar.zLjUOn);
            c46237tMxGEmmrt.AubY.setText(C33070mpX.AYXKKw(C47501trL.Fragment.vLaW));
            tLA tla3 = c46237tMxGEmmrt.AubY;
            tla3.setOnClickListener(new ContentResolver(tla3, 300L, tla3, this));
        }
        boolean z3 = (planetTier == null || Intrinsics.EZpvd((java.lang.Object) planetTier.AEQbTJ(), (java.lang.Object) PlanetProfileTierLevels.ORDINARY.getValue())) ? false : true;
        tLA tla4 = c46237tMxGEmmrt.uzCIH;
        Intrinsics.checkNotNullExpressionValue(tla4, "");
        tla4.setVisibility((z3 && z) ? 0 : 8);
        if (z3 && z) {
            c46237tMxGEmmrt.uzCIH.setIcon(C47501trL.ActionBar.copydefault);
            if (planetTier.AEQbTJ().length() > 0) {
                strAYXKKw = C33069mpW.copydefault(C47501trL.Fragment.zDUObI, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.LEVEL, planetTier.AEQbTJ())));
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.zDUObI);
            }
            c46237tMxGEmmrt.uzCIH.setText(strAYXKKw);
            tLA tla5 = c46237tMxGEmmrt.uzCIH;
            tla5.setOnClickListener(new DialogInterface(tla5, 300L, tla5, planetTier, this));
        }
        boolean z4 = str == null || str.length() == 0;
        tLA tla6 = c46237tMxGEmmrt.copydefault;
        Intrinsics.checkNotNullExpressionValue(tla6, "");
        tla6.setVisibility(true ^ z4 ? 0 : 8);
        tLA tla7 = c46237tMxGEmmrt.copydefault;
        Intrinsics.checkNotNullExpressionValue(tla7, "");
        if (tla7.getVisibility() == 0) {
            c46237tMxGEmmrt.copydefault.setIcon(C47501trL.ActionBar.OLrzqt);
            c46237tMxGEmmrt.copydefault.setText(C33070mpX.AYXKKw(C47501trL.Fragment.AxsJAYsNCnLh));
            tLA tla8 = c46237tMxGEmmrt.copydefault;
            tla8.setOnClickListener(new Context(tla8, 300L, tla8, this, str));
        }
        android.widget.LinearLayout linearLayout = c46237tMxGEmmrt.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        tLA tla9 = c46237tMxGEmmrt.AubY;
        Intrinsics.checkNotNullExpressionValue(tla9, "");
        if (tla9.getVisibility() == 0) {
            i = 0;
        } else {
            tLA tla10 = c46237tMxGEmmrt.uzCIH;
            Intrinsics.checkNotNullExpressionValue(tla10, "");
            if (tla10.getVisibility() != 0) {
                tLA tla11 = c46237tMxGEmmrt.copydefault;
                Intrinsics.checkNotNullExpressionValue(tla11, "");
                if (tla11.getVisibility() == 0) {
                }
            }
        }
        linearLayout.setVisibility(i);
    }

    public static final class ClipData implements Function1<EventParamsList, Unit> {
        public static final ClipData EZpvd = new ClipData();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("badge_type", "orbiter_plus", true);
        }
    }

    public static final class Intent implements Function1<EventParamsList, Unit> {
        public static final Intent copydefault = new Intent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("badge_type", "lead_trader", true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1049=4] */
    public final void AEQbTJ(java.lang.String str) {
        PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        C46189tLc c46189tLcAEQbTJ = getFieldNames().AEQbTJ();
        boolean z = true;
        boolean z2 = str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) ((c46189tLcAEQbTJ == null || (planetBasicUserInfoRespEZpvd = c46189tLcAEQbTJ.EZpvd()) == null) ? null : planetBasicUserInfoRespEZpvd.OcIXYQ()), (java.lang.Object) PlanetUserType.TwitterUser.getValue());
        android.widget.ImageView imageView = c46237tMxGEmmrt.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z2 ? 0 : 8);
        C46202tLp c46202tLp = c46237tMxGEmmrt.dxcTrN;
        android.widget.ImageView imageView2 = c46237tMxGEmmrt.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        if (imageView2.getVisibility() != 0) {
            android.widget.ImageView imageView3 = c46237tMxGEmmrt.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            if (imageView3.getVisibility() != 0) {
                C55251xgS c55251xgS = c46237tMxGEmmrt.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                if (c55251xgS.getVisibility() != 0) {
                    z = false;
                }
            }
        }
        c46202tLp.setChildVisible(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1060=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(PlanetOfficialStatus planetOfficialStatus) {
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        boolean z = false;
        boolean z2 = planetOfficialStatus == PlanetOfficialStatus.Official;
        android.widget.ImageView imageView = c46237tMxGEmmrt.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z2 ? 0 : 8);
        android.widget.TextView textView = c46237tMxGEmmrt.QUSxYX;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z2 ? 0 : 8);
        C46202tLp c46202tLp = c46237tMxGEmmrt.dxcTrN;
        android.widget.ImageView imageView2 = c46237tMxGEmmrt.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        if (imageView2.getVisibility() == 0) {
            z = true;
        } else {
            android.widget.ImageView imageView3 = c46237tMxGEmmrt.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            if (imageView3.getVisibility() != 0) {
                C55251xgS c55251xgS = c46237tMxGEmmrt.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                if (c55251xgS.getVisibility() == 0) {
                }
            }
        }
        c46202tLp.setChildVisible(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1070=4] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(FollowStatusV2Enum followStatusV2Enum) {
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        boolean zCopydefault = FollowStatusV2Enum.Companion.copydefault(followStatusV2Enum);
        C55251xgS c55251xgS = c46237tMxGEmmrt.DTwDnp;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        boolean z = false;
        c55251xgS.setVisibility(zCopydefault ? 0 : 8);
        C46202tLp c46202tLp = c46237tMxGEmmrt.dxcTrN;
        android.widget.ImageView imageView = c46237tMxGEmmrt.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (imageView.getVisibility() == 0) {
            z = true;
        } else {
            android.widget.ImageView imageView2 = c46237tMxGEmmrt.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            if (imageView2.getVisibility() != 0) {
                C55251xgS c55251xgS2 = c46237tMxGEmmrt.DTwDnp;
                Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                if (c55251xgS2.getVisibility() == 0) {
                }
            }
        }
        c46202tLp.setChildVisible(z);
    }

    public static final Unit AhwBna(tJI tji, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "authorid", tji.getFieldNames().copydefault(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean AuCTel() {
        C46189tLc c46189tLcAEQbTJ = getFieldNames().AEQbTJ();
        if (c46189tLcAEQbTJ == null) {
            return false;
        }
        return c46189tLcAEQbTJ.getFieldNames();
    }

    public final void OLrzqt(C46189tLc c46189tLc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (AuCTel()) {
            ProfileChartDto profileChartDto = (ProfileChartDto) CollectionsKt___CollectionsKt.firstOrNull(c46189tLc.EZpvd().AuCTel());
            if (C33129mqd.KWHzl((java.util.Collection) (profileChartDto != null ? profileChartDto.EZpvd() : null)) && C33129mqd.djBIcL(((ChartProfileDataResp) CollectionsKt___CollectionsKt.AubY(((ProfileChartDto) CollectionsKt___CollectionsKt.AuCTelauCTel(c46189tLc.EZpvd().AuCTel())).EZpvd())).OLrzqt()) != 0.0f) {
                arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(c46189tLc.EZpvd().AuCTel()));
            }
        }
        if (!c46189tLc.getFieldNames() && (!c46189tLc.EZpvd().AYXKKw().isEmpty())) {
            for (UserProfileCopyTradingRes userProfileCopyTradingRes : c46189tLc.EZpvd().AYXKKw()) {
                ChartProfileCopyTrading chartProfileCopyTrading = (ChartProfileCopyTrading) CollectionsKt___CollectionsKt.wlaJM(userProfileCopyTradingRes.gEmmrt());
                if (C33129mqd.djBIcL(chartProfileCopyTrading != null ? chartProfileCopyTrading.KWHzl() : null) != 0.0f) {
                    arrayList.add(userProfileCopyTradingRes);
                }
            }
        }
        if (!c46189tLc.values().isEmpty()) {
            arrayList.add(new C46194tLh(c46189tLc.values()));
        }
        this.AEQbTJ.setItems(arrayList);
        this.AEQbTJ.notifyDataSetChanged();
        RecyclerView recyclerView = gEmmrt().AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
    }

    public final void OLrzqt(C46237tMx c46237tMx, boolean z) {
        ViewPager2 viewPager2 = c46237tMx.zsXlph;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        viewPager2.setVisibility(z ? 8 : 0);
        C46471tVo c46471tVo = c46237tMx.QfsBiF;
        Intrinsics.checkNotNullExpressionValue(c46471tVo, "");
        c46471tVo.setVisibility(z ? 0 : 8);
        if (z) {
            C46471tVo c46471tVo2 = c46237tMx.QfsBiF;
            c46471tVo2.setImage(C47501trL.ActionBar.AuCTelauCTel);
            c46471tVo2.setSubtitle(C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKDCKfqP));
            c46471tVo2.setSubtitleColor(java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getFieldNames().fARcdN();
        if (getFieldNames().values()) {
            EZpvd(getFieldNames().AkhnZx(), getFieldNames().EZpvd());
        }
        gHZMYf();
    }

    public static final class BroadcastReceiver extends ViewPager2.OnPageChangeCallback {
        public BroadcastReceiver() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            pUU.EZpvd(tJI.this.getTAG(), "onPageSelected");
            InterfaceC46198tLl interfaceC46198tLlEZpvd = tJI.this.EZpvd();
            if (Intrinsics.EZpvd(interfaceC46198tLlEZpvd, InterfaceC46198tLl.Activity.OLrzqt)) {
                C32866mlf.onEvent$default("PersonalProfile_Tab_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tKv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return tJI.BroadcastReceiver.KWHzl((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (interfaceC46198tLlEZpvd instanceof InterfaceC46198tLl.Application) {
                C32866mlf.onEvent$default("PersonalProfile_Tab_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tKu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return tJI.BroadcastReceiver.OLrzqt((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            } else if (!(interfaceC46198tLlEZpvd instanceof InterfaceC46198tLl.TaskDescription) && !Intrinsics.EZpvd(interfaceC46198tLlEZpvd, InterfaceC46198tLl.ActionBar.OLrzqt) && interfaceC46198tLlEZpvd != null) {
                throw new NoWhenBranchMatchedException();
            }
        }

        public static final Unit KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("tab", "feed", true);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("tab", "performance", true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.util.List<? extends InterfaceC46198tLl> list) {
        java.lang.String strCopydefault;
        int i;
        TabLayout.Tab tabAt;
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        c46237tMxGEmmrt.zsXlph.registerOnPageChangeCallback(new BroadcastReceiver());
        int currentItem = c46237tMxGEmmrt.zsXlph.getCurrentItem();
        if (currentItem < 0 || currentItem >= getFieldNames().AYXKKw().size()) {
            strCopydefault = null;
        } else {
            InterfaceC46198tLl interfaceC46198tLl = getFieldNames().AYXKKw().get(currentItem);
            Intrinsics.checkNotNullExpressionValue(interfaceC46198tLl, "");
            strCopydefault = interfaceC46198tLl.copydefault();
        }
        java.util.List<AbstractC32996moC> listAEQbTJ = AEQbTJ(list);
        AuCTelauCTel();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fARcdN)) {
            java.lang.String str = this.fARcdN;
            switch (str.hashCode()) {
                case 628275919:
                    if (str.equals("spot_lead_tab")) {
                        java.util.Iterator<InterfaceC46198tLl> it = getFieldNames().AYXKKw().iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(it.next() instanceof InterfaceC46198tLl.Application)) {
                                i++;
                            }
                            break;
                        }
                        i = -1;
                    } else {
                        java.util.Iterator<InterfaceC46198tLl> it2 = getFieldNames().AYXKKw().iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (!android.text.TextUtils.equals(it2.next().copydefault(), this.fARcdN)) {
                                i++;
                            }
                            break;
                        }
                        i = -1;
                    }
                    break;
                case 737642773:
                    if (!str.equals("StrategyLeadTrade")) {
                    }
                    break;
                case 1068040576:
                    if (!str.equals("SignalLeadTrade")) {
                    }
                    break;
                case 1705424222:
                    if (!str.equals("swap_lead_tab")) {
                    }
                    break;
            }
        } else {
            PlanetTradeTypes planetTradeTypesIwGUEr = iwGUEr();
            int i2 = planetTradeTypesIwGUEr == null ? -1 : ActionBar.EZpvd[planetTradeTypesIwGUEr.ordinal()];
            if (i2 == 1) {
                java.util.Iterator<InterfaceC46198tLl> it3 = getFieldNames().AYXKKw().iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (it3.next() instanceof InterfaceC46198tLl.Application) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
            } else if (i2 != 2) {
                if (strCopydefault != null) {
                    java.util.Iterator<InterfaceC46198tLl> it4 = getFieldNames().AYXKKw().iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i3 = -1;
                            break;
                        } else if (Intrinsics.EZpvd((java.lang.Object) it4.next().copydefault(), (java.lang.Object) strCopydefault)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i = i3;
                } else {
                    i = -1;
                }
                if (i < 0) {
                    i = 0;
                }
            } else {
                java.util.Iterator<InterfaceC46198tLl> it5 = getFieldNames().AYXKKw().iterator();
                i = 0;
                while (it5.hasNext()) {
                    if (it5.next() instanceof InterfaceC46198tLl.Application) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
            }
        }
        RecyclerView.Adapter adapter = c46237tMxGEmmrt.zsXlph.getAdapter();
        Intrinsics.copydefault(adapter, "");
        ((C47503trN) adapter).AEQbTJ(listAEQbTJ);
        if (i == -1 || i >= getFieldNames().AYXKKw().size()) {
            return;
        }
        if (getFieldNames().AYXKKw().size() > 1 && c46237tMxGEmmrt.AwvSrB.EZpvd() != null && (tabAt = c46237tMxGEmmrt.AwvSrB.copydefault().getTabAt(c46237tMxGEmmrt.AwvSrB.copydefault().getTabCount() - 1)) != null) {
            tabAt.select();
        }
        c46237tMxGEmmrt.zsXlph.setCurrentItem(i, false);
    }

    public final void KWHzl(TabLayout.Tab tab) {
        android.widget.ImageView imageView;
        int iCopydefault;
        if ((tab != null ? tab.getIcon() : null) == null || (imageView = (android.widget.ImageView) tab.view.findViewById(android.R.id.icon)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = C55298xhM.dp2px$default(18.0f, null, 1, null);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = C55298xhM.dp2px$default(18.0f, null, 1, null);
            imageView.setLayoutParams(layoutParams2);
            if (tab.isSelected()) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DGUQLIdZmdUa);
            }
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final java.util.List<AbstractC32996moC> AEQbTJ(java.util.List<? extends InterfaceC46198tLl> list) {
        java.lang.String strKWHzl;
        AbstractC32996moC abstractC32996moCEZpvd;
        C46189tLc c46189tLcOLrzqt = getFieldNames().OLrzqt().getValue().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        getFieldNames().AYXKKw().clear();
        for (InterfaceC46198tLl interfaceC46198tLl : list) {
            java.lang.String str = "";
            if (Intrinsics.EZpvd(interfaceC46198tLl, InterfaceC46198tLl.Activity.OLrzqt)) {
                getFieldNames().AYXKKw().add(interfaceC46198tLl);
                boolean z = false;
                boolean zAEQbTJ = c46189tLcOLrzqt != null ? c46189tLcOLrzqt.AEQbTJ() : false;
                tJF tjf = new tJF();
                if (c46189tLcOLrzqt != null && (strKWHzl = c46189tLcOLrzqt.KWHzl()) != null) {
                    str = strKWHzl;
                }
                java.lang.String str2 = this.valueOf;
                if (zAEQbTJ && ((tWM) C43251rlk.copydefault(tWM.class)).valueOf()) {
                    z = true;
                }
                arrayList.add(tjf.OLrzqt(str, str2, z));
            } else if (interfaceC46198tLl instanceof InterfaceC46198tLl.Application) {
                getFieldNames().AYXKKw().add(interfaceC46198tLl);
                tAN.StateListAnimator stateListAnimator = tAN.Companion;
                java.lang.String strGEmmrt = getFieldNames().gEmmrt();
                java.lang.String strCopydefault = getFieldNames().copydefault();
                java.lang.String strAhwBna = getFieldNames().AhwBna();
                android.os.Bundle extras = getIntent().getExtras();
                java.lang.String string = extras != null ? extras.getString("timePeriod") : null;
                arrayList.add(stateListAnimator.KWHzl(strGEmmrt, strCopydefault, strAhwBna, string == null ? "" : string, getNewProxyInstance(), uzCIH(), this.fARcdN));
            } else if (interfaceC46198tLl instanceof InterfaceC46198tLl.TaskDescription) {
                getFieldNames().AYXKKw().add(interfaceC46198tLl);
                InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
                if (interfaceC44531sTi != null && (abstractC32996moCEZpvd = interfaceC44531sTi.EZpvd(PlanetUid.OLrzqt(getFieldNames().gEmmrt()), PlanetAuthorId.EZpvd(getFieldNames().copydefault()), new SharedPreferences())) != null) {
                    arrayList.add(abstractC32996moCEZpvd);
                }
            }
        }
        return arrayList;
    }

    public static final class SharedPreferences implements InterfaceC44530sTh {
        public SharedPreferences() {
        }

        @Override // o.InterfaceC44530sTh
        public void copydefault(boolean z, java.lang.String str) {
            tJI.this.KWHzl(z, str);
        }
    }

    public final void AEQbTJ(C46237tMx c46237tMx) {
        C52794wYp c52794wYp = c46237tMx.iwGUEr;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 300L, c52794wYp, this));
        android.widget.ImageView imageView = c46237tMx.djSkpj;
        imageView.setOnClickListener(new Activity(imageView, 300L, imageView, this));
        android.widget.ImageView imageView2 = c46237tMx.UeEOUB;
        imageView2.setOnClickListener(new Application(imageView2, 300L, imageView2, this));
        ConstraintLayout constraintLayout = c46237tMx.fetchVPNInfo;
        constraintLayout.setOnClickListener(new Fragment(constraintLayout, 300L, constraintLayout, this));
        ConstraintLayout constraintLayout2 = c46237tMx.DbNXlk;
        constraintLayout2.setOnClickListener(new Dialog(constraintLayout2, 300L, constraintLayout2, this));
        ConstraintLayout constraintLayout3 = gEmmrt().giSNqX;
        constraintLayout3.setOnClickListener(new PendingIntent(constraintLayout3, 300L, constraintLayout3, this));
        android.widget.ImageView imageView3 = c46237tMx.getNewProxyInstance;
        imageView3.setOnClickListener(new FragmentManager(imageView3, 300L, imageView3, this));
        android.widget.ImageView imageView4 = c46237tMx.hDKMBd;
        imageView4.setOnClickListener(new LoaderManager(imageView4, 300L, imageView4, this));
    }

    public static final class AssistContent implements Function1<EventParamsList, Unit> {
        public static final AssistContent KWHzl = new AssistContent();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }
    }

    public final void values() {
        C46189tLc c46189tLcOLrzqt = getFieldNames().OLrzqt().getValue().OLrzqt();
        if (c46189tLcOLrzqt != null) {
            tKT.OLrzqt.EZpvd(this, c46189tLcOLrzqt, gEmmrt().aKErDB.EZpvd(), getFieldNames().copydefault(), getFieldNames().AhwBna(), getNewProxyInstance(), EZpvd());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tHv.Activity.newIntent$OKPlanet_ok_feature_planet_impl$default(o.tHv$Activity, android.content.Context, com.okinc.planet_api.model.PlanetProfileSettingsActions, int, java.lang.Object):android.content.Intent */
    public final void copydefault() {
        C32866mlf.onEvent$default("app_community_myhomepage_setting_click", (TrackChannel[]) null, new Function1() { // from class: o.tKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        tTP.OLrzqt(new tKS.PictureInPictureParams(getFieldNames().AhwBna(), uzCIH(), null));
        startActivity(ActivityC46100tHv.Activity.newIntent$OKPlanet_ok_feature_planet_impl$default(ActivityC46100tHv.Companion, this, null, 2, null));
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Click", true);
        eventParamsList.put("element_type", "Button", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final boolean z) {
        C32866mlf.onEvent$default("PersonalPage_TwitterLink_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.EZpvd(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetUserProfileActivity$x$2(this, null), 3, null);
        } else {
            ActivityC46184tKy.Companion.AEQbTJ(this);
        }
    }

    public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", z ? "linked" : "link", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        if (getFieldNames().values()) {
            C32866mlf.onEvent$default("PersonalProfile_Followers_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.tKb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tJI.copydefault(this.EZpvd, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C43056riA.AEQbTJ.copydefault(C46369tRu.AEQbTJ(), "market", "/feed/followingList", C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromPage", Scopes.PROFILE), C56390yDp.OLrzqt("tabKey", "Followers")));
        }
    }

    public static final Unit copydefault(tJI tji, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "uniquename", tji.getFieldNames().AhwBna(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "authorid", tji.getFieldNames().copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "uid", tji.getFieldNames().gEmmrt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        if (getFieldNames().values()) {
            C32866mlf.onEvent$default("PersonalProfile_Following_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tJI.gEmmrt(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C43056riA.AEQbTJ.copydefault(C46369tRu.AEQbTJ(), "market", "/feed/followingList", C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromPage", Scopes.PROFILE), C56390yDp.OLrzqt("tabKey", "Following")));
        }
    }

    public static final Unit gEmmrt(tJI tji, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "uniquename", tji.getFieldNames().AhwBna(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "authorid", tji.getFieldNames().copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "uid", tji.getFieldNames().gEmmrt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean AYXKKw() {
        if (!djBIcL().gEmmrt()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), this, null, 2, null);
            return false;
        }
        getFieldNames().ejfBZ();
        return true;
    }

    public final void copydefault(C46189tLc c46189tLc) {
        C46237tMx c46237tMxGEmmrt = gEmmrt();
        android.widget.ImageView imageView = c46237tMxGEmmrt.UeEOUB;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = c46237tMxGEmmrt.djSkpj;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility((c46189tLc.AEQbTJ() && (CreatorCentreSubPage.Companion.OLrzqt().isEmpty() ^ true) && !C46388tSm.Companion.KWHzl().AYXKKw()) ? 0 : 8);
    }

    private final void gHZMYf() {
        C32866mlf.onEvent$default("UserCommunity_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.tJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.valueOf(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(tJI tji, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Click", true);
        eventParamsList.put("element_type", "page", true);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, tji.uzCIH(), true);
        eventParamsList.put("type", tji.getFieldNames().values() ? "0" : "1", false);
        return Unit.INSTANCE;
    }

    public final void copydefault(C46237tMx c46237tMx, C46189tLc c46189tLc) {
        java.lang.String strAYXKKw;
        int i;
        java.lang.String str;
        java.lang.String strCopydefault;
        copydefault(c46189tLc);
        if (c46189tLc.AEQbTJ() && ((tWM) C43251rlk.copydefault(tWM.class)).valueOf()) {
            c46237tMx.getFieldNames.setVisibility(0);
            android.widget.ImageView imageView = c46237tMx.getFieldNames;
            imageView.setOnClickListener(new ComponentCallbacks(imageView, 300L, imageView, this, c46237tMx));
        } else {
            c46237tMx.getFieldNames.setVisibility(8);
        }
        c46237tMx.dxcTrN.setText(C46196tLj.EZpvd.copydefault(c46189tLc));
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c46189tLc.EZpvd().OcIXYQ(), (java.lang.Object) PlanetUserType.TwitterUser.getValue());
        android.widget.ImageView imageView2 = gEmmrt().getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(zEZpvd ? 8 : 0);
        if (Intrinsics.EZpvd((java.lang.Object) c46189tLc.EZpvd().OcIXYQ(), (java.lang.Object) PlanetUserType.NewsUser.getValue()) || Intrinsics.EZpvd((java.lang.Object) c46189tLc.EZpvd().OcIXYQ(), (java.lang.Object) PlanetUserType.TwitterAndNewsUser.getValue()) || (strCopydefault = c46189tLc.copydefault()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            android.widget.TextView textView = c46237tMx.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        } else {
            c46237tMx.ORxRYg.setText(C33069mpW.copydefault(C47501trL.Fragment.sTzBva, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", c46189tLc.copydefault()))));
            android.widget.TextView textView2 = c46237tMx.ORxRYg;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
        }
        if (zEZpvd) {
            java.lang.String strORxRYg = c46189tLc.EZpvd().ORxRYg();
            if (strORxRYg.length() > 0) {
                str = "@" + strORxRYg + " from";
            } else {
                str = "";
            }
            android.widget.LinearLayout linearLayout = gEmmrt().KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(str.length() > 0 ? 0 : 8);
            gEmmrt().RJOkX.setText(str);
            android.widget.LinearLayout linearLayout2 = gEmmrt().KWHzl;
            linearLayout2.setOnClickListener(new ComponentName(linearLayout2, 300L, linearLayout2, this, c46189tLc));
        } else {
            android.widget.LinearLayout linearLayout3 = gEmmrt().KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(8);
        }
        FollowStatusV2Enum followStatusV2EnumValueOf = c46189tLc.valueOf();
        int i2 = followStatusV2EnumValueOf == null ? -1 : ActionBar.OLrzqt[followStatusV2EnumValueOf.ordinal()];
        if (i2 == 1 || i2 == 2) {
            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.aHXSQp);
            i = 260;
        } else {
            i = 259;
            if (i2 == 3) {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.zuWLRA);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.akftKQ);
            }
        }
        c46237tMx.fZBcTu.setText(strAYXKKw);
        c46237tMx.fZBcTu.setContentDescription("SocialUserProfileFollowingButton");
        c46237tMx.fZBcTu.setOKDSType(i);
        boolean z = c46189tLc.AEQbTJ() || !c46189tLc.AYXKKw();
        C52794wYp c52794wYp = c46237tMx.fZBcTu;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(z ? 8 : 0);
        C46189tLc c46189tLcAEQbTJ = getFieldNames().AEQbTJ();
        java.lang.String strAuCTel = c46189tLcAEQbTJ != null ? c46189tLcAEQbTJ.AuCTel() : null;
        boolean z2 = (strAuCTel == null || strAuCTel.length() == 0) && c46189tLc.AEQbTJ() && !djBIcL().AYXKKw();
        C52794wYp c52794wYp2 = c46237tMx.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        tRA.AEQbTJ(c52794wYp2, C52761wXj.TaskDescription.ICustomTabsServiceDefault, 12, java.lang.Integer.valueOf(ContextCompat.getColor(this, C52761wXj.Activity.htlTjW)), 4);
        C52794wYp c52794wYp3 = c46237tMx.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        c52794wYp3.setVisibility(z2 ? 0 : 8);
        c46237tMx.finit.setText(UdMath.formatNumberKmb(c46189tLc.fetchVPNInfo(), 1, 2, 0, 0));
        android.widget.TextView textView3 = gEmmrt().RcXXUw;
        int i3 = C47501trL.LoaderManager.AEQbTJ;
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(c46189tLc.fetchVPNInfo());
        textView3.setText(C33070mpX.EZpvd(i3, intOrNull != null ? intOrNull.intValue() : 0));
        c46237tMx.fJNWhG.setText(UdMath.formatNumberKmb(c46189tLc.AkhnZx(), 1, 2, 0, 0));
        if (zEZpvd) {
            gEmmrt().DbNXlk.setVisibility(8);
            gEmmrt().giSNqX.setVisibility(0);
        } else {
            gEmmrt().DbNXlk.setVisibility(0);
            gEmmrt().giSNqX.setVisibility(8);
        }
        c46237tMx.sSMYrx.setImageResource(zEZpvd ? C47501trL.ActionBar.AEQbTJ : C47501trL.ActionBar.KWHzl);
        tLE tle = c46237tMx.aKErDB;
        Intrinsics.checkNotNullExpressionValue(tle, "");
        tle.setVisibility(c46189tLc.djBIcL() == null ? 8 : 0);
        if (c46189tLc.djBIcL() != null) {
            c46237tMx.aKErDB.setBio(c46189tLc.djBIcL());
        }
        OLrzqt(c46189tLc.EZpvd().AxsJAY(), c46189tLc.gEmmrt(), c46189tLc.AEQbTJ(), c46189tLc.iwGUEr());
        AEQbTJ(c46189tLc.AuCTel());
        copydefault(c46189tLc.fIwbmz());
        KWHzl(c46189tLc.valueOf());
        OLrzqt(c46189tLc);
        fARcdN();
    }

    public final void fARcdN() {
        this.AYXKKw.clear();
        gEmmrt().AhwBna.post(new java.lang.Runnable() { // from class: o.tJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tJI.AuCTelauCTel(this.EZpvd);
            }
        });
    }

    public static final void AuCTelauCTel(tJI tji) {
        int iFindFirstVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager = tji.gEmmrt().AhwBna.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1) {
            return;
        }
        tji.AYXKKw.add(java.lang.Integer.valueOf(iFindFirstVisibleItemPosition));
    }

    public final void fIwbmz() {
        C46189tLc c46189tLcAEQbTJ = getFieldNames().AEQbTJ();
        final java.lang.String str = !FollowStatusV2Enum.Companion.EZpvd(c46189tLcAEQbTJ != null ? c46189tLcAEQbTJ.valueOf() : null) ? "1" : "0";
        if (AYXKKw()) {
            C32866mlf.onEvent$default("CommunityLeaderBoard_Guide_Follow_Click", (TrackChannel[]) null, new Function1() { // from class: o.tJH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tJI.AEQbTJ(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("action_type", "Click", true);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, "homepage", true);
        eventParamsList.put("followtype", str, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C46189tLc c46189tLcAEQbTJ = getFieldNames().AEQbTJ();
        if (c46189tLcAEQbTJ == null || !c46189tLcAEQbTJ.AEQbTJ()) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!FollowStatusV2Enum.Companion.EZpvd(getFieldNames().AEQbTJ() != null ? r0.valueOf() : null)) {
                if (C46388tSm.Companion.KWHzl().AYXKKw()) {
                    tTY.EZpvd.copydefault(tUB.copydefault.EZpvd(), C33070mpX.AYXKKw(C47501trL.Fragment.call));
                    return;
                } else {
                    final tKX tkxOLrzqt = tKX.Companion.OLrzqt();
                    tkxOLrzqt.OLrzqt(this, null, true, new Function0() { // from class: o.tKm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return tJI.AEQbTJ(tkxOLrzqt, this);
                        }
                    });
                    return;
                }
            }
            tTP.OLrzqt(new tKS.VoiceInteractor(getFieldNames().AhwBna(), getNewProxyInstance(), defaultConstructorMarker));
            fJNWhG();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tKX.checkProfileModified$default(o.tKX, androidx.fragment.app.FragmentActivity, com.okinc.planet.biz_onboarding.OrbitEditProfileScenario, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
    public static final Unit AEQbTJ(tKX tkx, final tJI tji) {
        tKX.checkProfileModified$default(tkx, tji, OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl, true, new Function0() { // from class: o.tJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tJI.getNewProxyInstance(this.OLrzqt);
            }
        }, null, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(tJI tji) {
        tTP.OLrzqt(new tKS.LoaderManager(tji.getFieldNames().AhwBna(), tji.getNewProxyInstance(), null));
        tji.fIwbmz();
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        int i = C47501trL.Fragment.registerUser;
        int i2 = C47501trL.Fragment.FQMcgE;
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(getString(i));
        java.lang.String string = getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.tJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tJI.copydefault(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C47501trL.Fragment.DFbvW, new View.OnClickListener() { // from class: o.tJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tJI.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(tJI tji, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        tji.fIwbmz();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void AubY() {
        C55113xdn c55113xdn = gEmmrt().gHZMYf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        tRF.EZpvd(c55113xdn, C47501trL.PendingIntent.gEmmrt);
    }

    public final void DbNXlk() {
        android.os.Bundle extras = getIntent().getExtras();
        final java.lang.String string = extras != null ? extras.getString("community_user_center_success_msg") : null;
        if (string == null || string.length() <= 0) {
            return;
        }
        gEmmrt().getRoot().post(new java.lang.Runnable() { // from class: o.tJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tJI.copydefault(this.KWHzl, string);
            }
        });
    }

    public static final void copydefault(tJI tji, java.lang.String str) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        ConstraintLayout constraintLayoutCopydefault = tji.gEmmrt().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(constraintLayoutCopydefault, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public final void valueOf() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        PlanetProfileSettingsActions planetProfileSettingsActionsHDKMBd = hDKMBd();
        if (planetProfileSettingsActionsHDKMBd == null) {
            return;
        }
        if (planetProfileSettingsActionsHDKMBd instanceof tWT) {
            C46373tRy.KWHzl(getFieldNames().KWHzl(), this, Lifecycle.State.CREATED, new PlanetUserProfileActivity$handleSettingsActionDeeplink$1(this, planetProfileSettingsActionsHDKMBd, null));
        } else if (planetProfileSettingsActionsHDKMBd instanceof tWQ) {
            startActivity(ActivityC46100tHv.Companion.copydefault(this, planetProfileSettingsActionsHDKMBd));
        }
    }

    public final void KWHzl(boolean z) {
        CollapsingToolbarLayout collapsingToolbarLayout = gEmmrt().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(collapsingToolbarLayout, "");
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        if (layoutParams != null) {
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            layoutParams2.setScrollFlags(z ? 3 : 0);
            collapsingToolbarLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        android.content.ClipboardManager clipboardManagerAhwBna;
        super.onStop();
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = this.AhwBna;
        if (onPrimaryClipChangedListener != null && (clipboardManagerAhwBna = AhwBna()) != null) {
            clipboardManagerAhwBna.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
        }
        this.AhwBna = null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        gEmmrt().zsXlph.setAdapter(null);
        gEmmrt().AEQbTJ.removeOnOffsetChangedListener(this.ejfBZ);
        super.onDestroy();
    }

    public final void OLrzqt(java.lang.String str) {
        if (str != null) {
            android.net.Uri uri = android.net.Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
        }
        C32866mlf.onEvent$default("PersonalProfile_Page_Twitter_Click", (TrackChannel[]) null, new Function1() { // from class: o.tKt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tJI.AhwBna(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
