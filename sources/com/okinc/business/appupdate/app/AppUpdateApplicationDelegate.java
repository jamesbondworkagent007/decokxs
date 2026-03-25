package com.okinc.business.appupdate.app;

import android.content.Context;
import androidx.collection.ArraySetKt;
import com.okinc.business.appupdate.UpgradeJsHandler;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.appupdate.debug.UpgradeDBoxExtension;
import com.okinc.business.appupdate.debug.UpgradePreviewDBoxExtension;
import com.okinc.business.appupdate.impl.AppUpdateServiceImpl;
import com.okinc.business.appupdate.impl.AppUpdateServiceImplKt;
import com.okinc.business.appupdate.impl.UpgradeDependencyExtensionImpl;
import com.okinc.business.appupdate.mln.MLNUpgradeRegister;
import com.okinc.business.appupdate.update.RequireUpgradeHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C43265rly;
import o.C56392yDr;
import o.C57337ygX;
import o.C7381aik;
import o.InterfaceC33209msD;
import o.InterfaceC43220rlF;
import o.InterfaceC43253rlm;
import o.InterfaceC43299rmf;
import o.mMP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateApplicationDelegate extends C43265rly {
    public static final int $stable = 8;
    private final RequireUpgradeHandler requireUpgradeHandler = new RequireUpgradeHandler();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 460;
    }

    @Override // o.C43265rly
    public void onInit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        this.requireUpgradeHandler.init();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(AppUpdateService.class, C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateApplicationDelegate.registerService$lambda$0();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppUpdateServiceImpl registerService$lambda$0() {
        return new AppUpdateServiceImpl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        super.registerCustomHandler(context, interfaceC43220rlF);
        C57337ygX.OLrzqt(interfaceC43220rlF, "request", ArraySetKt.arraySetOf(UpgradeJsHandler.METHOD_OPEN_SYSTEM_SETTINGS, UpgradeJsHandler.METHOD_CHECK_APP_UPDATE), C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateApplicationDelegate.registerCustomHandler$lambda$1();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpgradeJsHandler registerCustomHandler$lambda$1() {
        return new UpgradeJsHandler();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateApplicationDelegate.registerExtensions$lambda$2();
            }
        }));
        interfaceC43299rmf.EZpvd(mMP.class, C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateApplicationDelegate.registerExtensions$lambda$3();
            }
        }));
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(AnonymousClass3.INSTANCE));
        interfaceC43299rmf.EZpvd(InterfaceC33209msD.class, C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateApplicationDelegate.registerExtensions$lambda$4();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpgradeDBoxExtension registerExtensions$lambda$2() {
        return new UpgradeDBoxExtension();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpgradePreviewDBoxExtension registerExtensions$lambda$3() {
        return new UpgradePreviewDBoxExtension();
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.app.AppUpdateApplicationDelegate$registerExtensions$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<MLNUpgradeRegister> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
            super(0, MLNUpgradeRegister.class, "<init>", "<init>()V", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MLNUpgradeRegister invoke() {
            return new MLNUpgradeRegister();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpgradeDependencyExtensionImpl registerExtensions$lambda$4() {
        return new UpgradeDependencyExtensionImpl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        AppUpdateServiceImplKt.getAppUpdateService().cancelDownLoad();
    }
}
