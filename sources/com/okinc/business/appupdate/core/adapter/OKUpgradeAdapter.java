package com.okinc.business.appupdate.core.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.business.appupdate.api.IUpdate;
import com.okinc.business.appupdate.debug.UpgradeDBoxExtension;
import com.okinc.business.appupdate.update.AlertContent;
import com.okinc.business.appupdate.update.AppUpToDateFragment;
import com.okinc.business.appupdate.update.AppUpdateConfigResp;
import com.okinc.business.appupdate.update.AppUpdateFragment;
import com.okinc.business.appupdate.update.AppUpdateInfo;
import com.okinc.business.appupdate.update.AppUpdateUtils;
import com.okinc.business.appupdate.update.IUpdate2;
import com.okinc.business.appupdate.update.IUpdateStateChange;
import com.okinc.business.appupdate.update.UpgradeTypeDetail;
import com.okinc.business.appupdate.utils.UpgradeInterceptor;
import com.okinc.business.appupdate.utils.UtilsExtKt;
import com.okinc.core.util.SPUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.AbstractActivityC33041mov;
import o.BtU;
import o.BuB;
import o.C32979mnm;
import o.C33492mxV;
import o.C34703nhO;
import o.C43248rlh;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC33171mrS;
import o.InterfaceC46518tXh;
import o.pUU;
import o.xVY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import uniffi.upgrade.CheckUpgradeInfo;
import uniffi.upgrade.UpgradeCore;

/* JADX INFO: loaded from: classes3.dex */
public final class OKUpgradeAdapter implements IUpdate2 {
    private static final String TAG = "OKUpgradeAdapter";
    private final Context context;
    private final IUpdate2 legacyImplementation;
    private AppUpdateConfigResp mCachedUpdateResp;
    private UpgradeCore mUpgradeCore;
    private AtomicBoolean mUpgradeCoreInitialized;
    private final boolean supportOKCore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Gson gson = new GsonBuilder().setLenient().disableHtmlEscaping().create();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean isUsingOKCore() {
        return this.supportOKCore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeCore getUpgradeCore$OKUpgrade_ok_upgrade() {
        return this.mUpgradeCore;
    }

    public OKUpgradeAdapter(@NotNull Context context, @NotNull IUpdate2 iUpdate2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iUpdate2, "");
        this.context = context;
        this.legacyImplementation = iUpdate2;
        this.supportOKCore = z;
        this.mUpgradeCoreInitialized = new AtomicBoolean(false);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.okinc.business.appupdate.update.IUpdate2)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:0x0006: INVOKE 
  (wrap:com.okinc.business.appupdate.update.AppUpdateUtils$Companion:0x0004: SGET  A[WRAPPED] (LINE:59) com.okinc.business.appupdate.update.AppUpdateUtils.Companion com.okinc.business.appupdate.update.AppUpdateUtils$Companion)
 VIRTUAL call: com.okinc.business.appupdate.update.AppUpdateUtils.Companion.isSupportUpgradeUseCore():boolean A[MD:():boolean (m), WRAPPED] (LINE:59)) : (r3v0 boolean))
 A[MD:(android.content.Context, com.okinc.business.appupdate.update.IUpdate2, boolean):void (m)] (LINE:56) call: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter.<init>(android.content.Context, com.okinc.business.appupdate.update.IUpdate2, boolean):void type: THIS */
    public /* synthetic */ OKUpgradeAdapter(Context context, IUpdate2 iUpdate2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iUpdate2, (i & 4) != 0 ? AppUpdateUtils.Companion.isSupportUpgradeUseCore() : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void clearUpgradePopedFlag() {
            SPUtils.remove("OKExHadShowUpdateAlert");
        }
    }

    private final void ensureUpgradeCoreInitialized() {
        if (!isUsingOKCore() || this.mUpgradeCoreInitialized.get()) {
            return;
        }
        this.mUpgradeCore = BuB.initializeUpgradeCore(new UpgradeContextImpl());
        this.mUpgradeCoreInitialized.set(true);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public boolean hasNewVersion() {
        if (!isUsingOKCore()) {
            return this.legacyImplementation.hasNewVersion();
        }
        AppUpdateConfigResp appUpdateConfigResp = this.mCachedUpdateResp;
        if (appUpdateConfigResp != null) {
            return appUpdateConfigResp.hasNewVersion$OKUpgrade_ok_upgrade();
        }
        return false;
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, boolean z, IUpdate.DialogInfo dialogInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        if (isUsingOKCore()) {
            checkUpdateWithCore(abstractActivityC33041mov, z, dialogInfo, new Function0() { // from class: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OKUpgradeAdapter.checkUpdate$lambda$0(abstractActivityC33041mov);
                }
            });
        } else {
            this.legacyImplementation.checkUpdate(abstractActivityC33041mov, z, dialogInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$0(AbstractActivityC33041mov abstractActivityC33041mov) {
        AppUpToDateFragment appUpToDateFragmentNewInstance = AppUpToDateFragment.Companion.newInstance();
        FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        appUpToDateFragmentNewInstance.show(supportFragmentManager, abstractActivityC33041mov.getTAG());
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        checkUpdate(abstractActivityC33041mov, z, null);
    }

    public final void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, IUpdate.DialogInfo dialogInfo, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        pUU.EZpvd(TAG, "checkUpdate(4-params) - shouldUseOKCore: " + isUsingOKCore());
        if (isUsingOKCore()) {
            checkUpdateWithCore(abstractActivityC33041mov, z, dialogInfo, function0);
            return;
        }
        IUpdate2 iUpdate2 = this.legacyImplementation;
        AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
        if (appUpdateUtils != null) {
            appUpdateUtils.checkUpdate$OKUpgrade_ok_upgrade(abstractActivityC33041mov, z, dialogInfo, function0);
        } else {
            iUpdate2.checkUpdate(abstractActivityC33041mov, z, dialogInfo);
        }
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2
    public void addUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.legacyImplementation.addUpdateStateChangeListener((com.okinc.business.appupdate.api.IUpdateStateChange) iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void addUpdateStateChangeListener(@NotNull com.okinc.business.appupdate.api.IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.legacyImplementation.addUpdateStateChangeListener(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2
    public void removeUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.legacyImplementation.removeUpdateStateChangeListener((com.okinc.business.appupdate.api.IUpdateStateChange) iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void removeUpdateStateChangeListener(@NotNull com.okinc.business.appupdate.api.IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        this.legacyImplementation.removeUpdateStateChangeListener(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void onActivityResult(int i, int i2, Intent intent) {
        this.legacyImplementation.onActivityResult(i, i2, intent);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public InterfaceC46518tXh getUpdateManageableContainer(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return this.legacyImplementation.getUpdateManageableContainer(abstractActivityC33041mov, fragmentManager, z);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public Integer getUpdateProgress() {
        return this.legacyImplementation.getUpdateProgress();
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2, com.okinc.business.appupdate.api.IUpdate
    public void startReview(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.legacyImplementation.startReview(activity);
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2, com.okinc.business.appupdate.api.IUpdate
    public void startReviewFlow(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.legacyImplementation.startReviewFlow(activity, function0);
    }

    public final void cancelDownLoad() {
        IUpdate2 iUpdate2 = this.legacyImplementation;
        AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
        if (appUpdateUtils != null) {
            appUpdateUtils.cancelDownLoad();
        }
    }

    public final void updateApp(@NotNull AppUpdateFragment appUpdateFragment, @NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateFragment, "");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "");
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(UpgradeInterceptor.class));
        UpgradeInterceptor upgradeInterceptor = listKWHzl != null ? (UpgradeInterceptor) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        if (upgradeInterceptor != null) {
            FragmentActivity fragmentActivityRequireActivity = appUpdateFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new AnonymousClass1(upgradeInterceptor, appUpdateFragment, this, appUpdateInfo, null), 3, null);
        } else {
            IUpdate2 iUpdate2 = this.legacyImplementation;
            AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
            if (appUpdateUtils != null) {
                appUpdateUtils.updateApp$OKUpgrade_ok_upgrade(appUpdateFragment, appUpdateInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$updateApp$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpgradeInterceptor $interceptor;
        final /* synthetic */ AppUpdateFragment $updateFragment;
        final /* synthetic */ AppUpdateInfo $updateInfo;
        int label;
        final /* synthetic */ OKUpgradeAdapter this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpgradeInterceptor upgradeInterceptor, AppUpdateFragment appUpdateFragment, OKUpgradeAdapter oKUpgradeAdapter, AppUpdateInfo appUpdateInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$interceptor = upgradeInterceptor;
            this.$updateFragment = appUpdateFragment;
            this.this$0 = oKUpgradeAdapter;
            this.$updateInfo = appUpdateInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$interceptor, this.$updateFragment, this.this$0, this.$updateInfo, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                UpgradeInterceptor upgradeInterceptor = this.$interceptor;
                AppUpdateFragment appUpdateFragment = this.$updateFragment;
                OKUpgradeAdapter oKUpgradeAdapter = this.this$0;
                UpgradeCore upgradeCore = oKUpgradeAdapter.mUpgradeCore;
                AppUpdateInfo appUpdateInfo = this.$updateInfo;
                this.label = 1;
                obj = upgradeInterceptor.intercept(appUpdateFragment, oKUpgradeAdapter, upgradeCore, appUpdateInfo, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AppUpdateInfo appUpdateInfo2 = (AppUpdateInfo) obj;
            if (appUpdateInfo2 != null) {
                OKUpgradeAdapter oKUpgradeAdapter2 = this.this$0;
                AppUpdateFragment appUpdateFragment2 = this.$updateFragment;
                pUU.EZpvd(OKUpgradeAdapter.TAG, "intercept result: " + appUpdateInfo2);
                IUpdate2 iUpdate2 = oKUpgradeAdapter2.legacyImplementation;
                AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
                if (appUpdateUtils != null) {
                    appUpdateUtils.updateApp$OKUpgrade_ok_upgrade(appUpdateFragment2, appUpdateInfo2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void manageableCheck(boolean z, @NotNull Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.EZpvd(TAG, "manageableCheck - shouldUseOKCore: " + isUsingOKCore());
        if (isUsingOKCore()) {
            manageableCheckWithCore(z, function2);
        } else {
            delegateToLegacyManageableCheck(z, function2);
        }
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void getLatestVersion(@NotNull Function1<? super String, Unit> function1) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(function1, "");
        if (isUsingOKCore()) {
            AppUpdateConfigResp appUpdateConfigResp = this.mCachedUpdateResp;
            if (appUpdateConfigResp == null || (strValueOf = appUpdateConfigResp.getLatestVersion()) == null) {
                strValueOf = C34703nhO.valueOf(this.context);
            }
            Intrinsics.copydefault((Object) strValueOf);
            function1.invoke(strValueOf);
            return;
        }
        this.legacyImplementation.getLatestVersion(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkUpdateWithCore$default(OKUpgradeAdapter oKUpgradeAdapter, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, IUpdate.DialogInfo dialogInfo, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        oKUpgradeAdapter.checkUpdateWithCore(abstractActivityC33041mov, z, dialogInfo, function0);
    }

    private final void checkUpdateWithCore(final AbstractActivityC33041mov abstractActivityC33041mov, final boolean z, final IUpdate.DialogInfo dialogInfo, final Function0<Unit> function0) {
        pUU.KWHzl(TAG, "Starting OKCore upgrade check");
        if (dialogInfo != null && !hasNewVersion()) {
            pUU.KWHzl(TAG, "will show custom update dialog");
            IUpdate2 iUpdate2 = this.legacyImplementation;
            AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
            if (appUpdateUtils != null) {
                appUpdateUtils.showCustomUpdateDialog(abstractActivityC33041mov, null, dialogInfo, function0);
                return;
            }
            return;
        }
        if (this.legacyImplementation.getUpdateProgress() != null) {
            Integer updateProgress = this.legacyImplementation.getUpdateProgress();
            Intrinsics.copydefault(updateProgress);
            if (updateProgress.intValue() > 0) {
                return;
            }
        }
        manageableCheckWithCore(z, new Function2() { // from class: com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OKUpgradeAdapter.checkUpdateWithCore$lambda$1(abstractActivityC33041mov, this, z, dialogInfo, function0, ((Boolean) obj).booleanValue(), (AppUpdateInfo) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdateWithCore$lambda$1(AbstractActivityC33041mov abstractActivityC33041mov, OKUpgradeAdapter oKUpgradeAdapter, boolean z, IUpdate.DialogInfo dialogInfo, Function0 function0, boolean z2, AppUpdateInfo appUpdateInfo) {
        if (z2) {
            try {
                pUU.KWHzl(TAG, "about to call showUpgradeDialog with activity: " + C56524yIo.AEQbTJ(abstractActivityC33041mov.getClass()).valueOf());
                IUpdate2 iUpdate2 = oKUpgradeAdapter.legacyImplementation;
                AppUpdateUtils appUpdateUtils = iUpdate2 instanceof AppUpdateUtils ? (AppUpdateUtils) iUpdate2 : null;
                if (appUpdateUtils != null) {
                    appUpdateUtils.showSelfUpgradeDialog(abstractActivityC33041mov, z, appUpdateInfo, dialogInfo, function0);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                pUU.AEQbTJ(TAG, "Failed to show upgrade dialog: " + e.getMessage(), e);
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            pUU.KWHzl(TAG, "No update needed");
            if (!z && function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public final CheckUpgradeInfo getUpgradeInfo(boolean z) {
        boolean zIsHarmony = UtilsExtKt.isHarmony();
        boolean z2 = !z;
        return new CheckUpgradeInfo(false, z2, z2, String.valueOf(zIsHarmony), getTestAppVersion(), getChannel(), getUpgradeRequestCustomHeaders());
    }

    private final void manageableCheckWithCore(boolean z, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2) {
        ensureUpgradeCoreInitialized();
        UpgradeCore upgradeCore = this.mUpgradeCore;
        if (upgradeCore == null || BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OKUpgradeAdapter$manageableCheckWithCore$1$1(this, z, upgradeCore, function2, null), 2, null) == null) {
            pUU.valueOf(TAG, "UpgradeCore is not available, delegating to legacy implementation");
            delegateToLegacyManageableCheck(z, function2);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final String getTestAppVersion() {
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) UpgradeDBoxExtension.Companion.getTestVersionStr$OKUpgrade_ok_upgrade()).toString();
        return string.length() == 0 ? "" : string;
    }

    private final String getChannel() {
        String strOLrzqt = xVY.OLrzqt();
        return strOLrzqt == null ? "guanwang" : strOLrzqt;
    }

    private final Map<String, String> getUpgradeRequestCustomHeaders() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("brand", Build.BRAND), C56390yDp.OLrzqt("manufacturer", Build.MANUFACTURER));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppUpdateConfigResp parseUpgradeResponse(String str) {
        AppUpdateConfigResp appUpdateConfigResp;
        AppUpdateConfigResp appUpdateConfigRespIntercept;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    appUpdateConfigResp = new AppUpdateConfigResp();
                    JSONObject jSONObject = new JSONObject(str);
                    appUpdateConfigResp.setLatestVersion(jSONObject.optString("latestVersion", ""));
                    appUpdateConfigResp.setVersionIsLatest(jSONObject.optString("versionIsLatest", "true"));
                    appUpdateConfigResp.setApkMD5(jSONObject.optString("apkMD5", ""));
                    appUpdateConfigResp.setUpgradeType(jSONObject.optString("upgradeType"));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("alertContent");
                    appUpdateConfigResp.setAlertContent(jSONObjectOptJSONObject != null ? (AlertContent) gson.fromJson(jSONObjectOptJSONObject.toString(), AlertContent.class) : null);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("upgradeTypeDetail");
                    appUpdateConfigResp.setUpgradeTypeDetail(jSONObjectOptJSONObject2 != null ? (UpgradeTypeDetail) gson.fromJson(jSONObjectOptJSONObject2.toString(), UpgradeTypeDetail.class) : null);
                }
            } catch (Exception e) {
                pUU.valueOf(TAG, "parse upgradeResponse failed caused : " + e.getMessage());
            }
            appUpdateConfigResp = null;
        } else {
            appUpdateConfigResp = null;
        }
        if (appUpdateConfigResp == null) {
            return null;
        }
        UpgradeDBoxExtension.DebugInterceptor responseInterceptor = UpgradeDBoxExtension.Companion.getResponseInterceptor();
        return (responseInterceptor == null || (appUpdateConfigRespIntercept = responseInterceptor.intercept(appUpdateConfigResp)) == null) ? appUpdateConfigResp : appUpdateConfigRespIntercept;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delegateToLegacyManageableCheck(boolean z, Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2) {
        try {
            pUU.KWHzl(TAG, "Delegating to legacy manageableCheck");
            IUpdate2 iUpdate2 = this.legacyImplementation;
            if (!(iUpdate2 instanceof AppUpdateUtils)) {
                pUU.valueOf(TAG, "Legacy implementation does not support manageableCheck");
            } else {
                ((AppUpdateUtils) iUpdate2).manageableCheck$OKUpgrade_ok_upgrade(z, function2);
            }
        } catch (Exception e) {
            pUU.copydefault(TAG, "Failed to delegate to legacy: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needShowUpdate(boolean z) {
        UpgradeDBoxExtension.DebugConfig debugConfig;
        UpgradeDBoxExtension.DebugInterceptor responseInterceptor = UpgradeDBoxExtension.Companion.getResponseInterceptor();
        if (responseInterceptor == null || (debugConfig = responseInterceptor.getDebugConfig()) == null || !debugConfig.getAlwaysShowDialog()) {
            return z;
        }
        return true;
    }

    public static final class UpgradeContextImpl implements BtU {
        @Override // o.BtU
        public String getAppDisplayMode() {
            return C33492mxV.OLrzqt() ? "darkNight" : MTPushConstants.NotificationTime.KEY_DAYS;
        }

        @Override // o.BtU
        public int getAppMode() {
            return isWeb3Mode() ? 2 : 1;
        }

        @Override // o.BtU
        public String getBundleId() {
            String strKWHzl = C34703nhO.KWHzl(C32979mnm.EZpvd.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            return strKWHzl;
        }

        private final boolean isWeb3Mode() {
            try {
                return ((InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class)).fIwbmz();
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
