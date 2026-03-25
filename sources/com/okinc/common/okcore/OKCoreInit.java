package com.okinc.common.okcore;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import com.okinc.common.okcore.OKCoreInit;
import com.okinc.common.okcore.analytics.OKCoreAnalyticsImpl;
import com.okinc.common.okcore.callback.OKCorePanicHandlerImpl;
import com.okinc.common.okcore.net.websocket.OKCoreWsFactoryImpl;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.bean.AppLocale;
import com.okinc.localization2.bean.LocalizeEvent;
import com.sun.jna.Callback;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AXY;
import o.BfX;
import o.BgU;
import o.BzK;
import o.C2338AHx;
import o.C2348AIh;
import o.C2775AYt;
import o.C32518mfB;
import o.C32519mfC;
import o.C32521mfE;
import o.C32522mfF;
import o.C32523mfG;
import o.C32527mfK;
import o.C32529mfM;
import o.C32530mfN;
import o.C32534mfR;
import o.C32537mfU;
import o.C32542mfZ;
import o.C32603mgh;
import o.C32605mgj;
import o.C32979mnm;
import o.C3567AoQ;
import o.C3599Aow;
import o.C4298Bav;
import o.C4491Bga;
import o.C4513Bgw;
import o.C4832Bsr;
import o.C56391yDq;
import o.C56442yFn;
import o.C58113yvE;
import o.C59467zhb;
import o.C60173zxj;
import o.InterfaceC47230tmC;
import o.InterfaceC5017Bzn;
import o.pUU;
import o.pUX;
import o.yDV;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OKCoreInit {
    private static final String TAG = "OKCore-Init";
    public static final OKCoreInit INSTANCE = new OKCoreInit();
    private static AtomicBoolean mOKCoreInitialized = new AtomicBoolean(false);
    public static final int $stable = 8;

    private OKCoreInit() {
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        checkWhetherOKCoreEnabled(application);
    }

    public final boolean isOKCoreInitialized() {
        return mOKCoreInitialized.get();
    }

    public final void initJNA(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        hookJNALogger();
        initUnexceptedCallback();
        logNativeLibraryDiagnostics(application);
        hookJNALibraries();
        System.loadLibrary("OKCore");
    }

    private final void checkWhetherOKCoreEnabled(Application application) {
        synchronized (this) {
            if (!mOKCoreInitialized.get()) {
                try {
                    pUU.KWHzl(TAG, "Initializing OKCore...");
                    BgU.registerPathProvider(new C32605mgj(application));
                    C32518mfB c32518mfB = new C32518mfB();
                    C3567AoQ.registerAppSupport(c32518mfB);
                    BfX.registerPlatformLogger(new C32530mfN());
                    C4513Bgw.registerPanicHandler(new OKCorePanicHandlerImpl());
                    C4832Bsr.registerSharedPreferences(new C32603mgh());
                    C3599Aow.registerAnalytics(new OKCoreAnalyticsImpl());
                    C4491Bga.okcoreLaunchInit();
                    C4298Bav.registerOkxRequestFactory(new C32537mfU());
                    C4298Bav.registerLegacyDownloadFactory(new C32542mfZ());
                    C4298Bav.registerPlatformDohManager(new C32529mfM());
                    C2338AHx.registerAppInfo(new C32521mfE());
                    C2338AHx.registerDeviceInfo(new C32522mfF());
                    registerUserLocalDataSource(application);
                    C4298Bav.registerOkxWsFactory(new OKCoreWsFactoryImpl());
                    C2348AIh.registerAbtestFactory(new C32523mfG());
                    C2775AYt.registerLanguageFactory(new C32527mfK());
                    C32519mfC c32519mfC = new C32519mfC();
                    ABTestManager aBTestManager = ABTestManager.AEQbTJ;
                    aBTestManager.KWHzl(c32519mfC, AmplitudeName.CEFI);
                    aBTestManager.KWHzl(c32519mfC, AmplitudeName.WEB3);
                    registerLanguageChange();
                    C32534mfR c32534mfR = C32534mfR.AEQbTJ;
                    c32534mfR.OLrzqt();
                    C4298Bav.initNetworkStateChangeWatcher(c32534mfR.EZpvd());
                    c32518mfB.copydefault();
                    mOKCoreInitialized.set(true);
                    pUU.KWHzl(TAG, "OKCore initialized successfully");
                } catch (Throwable th) {
                    pUU.AEQbTJ(TAG, "OKCore initialization failed", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.common.okcore.OKCoreInit$registerLanguageChange$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
                Flow<LocalizeEvent> flowAEQbTJ = ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).gkJEwt().AEQbTJ();
                FlowCollector<? super LocalizeEvent> flowCollector = new FlowCollector() { // from class: com.okinc.common.okcore.OKCoreInit.registerLanguageChange.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(LocalizeEvent localizeEvent, Continuation<? super Unit> continuation) {
                        String languageCode;
                        String market;
                        String displayName;
                        LocalizeEvent.ActionBar actionBar = localizeEvent instanceof LocalizeEvent.ActionBar ? (LocalizeEvent.ActionBar) localizeEvent : null;
                        if (actionBar == null) {
                            return Unit.INSTANCE;
                        }
                        AppLocale appLocaleAEQbTJ = actionBar.AEQbTJ();
                        if (appLocaleAEQbTJ == null || (languageCode = appLocaleAEQbTJ.getLanguageCode()) == null) {
                            languageCode = "";
                        }
                        AppLocale appLocaleAEQbTJ2 = actionBar.AEQbTJ();
                        if (appLocaleAEQbTJ2 == null || (market = appLocaleAEQbTJ2.getMarket()) == null) {
                            market = "";
                        }
                        AppLocale appLocaleAEQbTJ3 = actionBar.AEQbTJ();
                        if (appLocaleAEQbTJ3 == null || (displayName = appLocaleAEQbTJ3.getDisplayName()) == null) {
                            displayName = "";
                        }
                        C2775AYt.languageDidChanged(new AXY(languageCode, market, displayName, ""), new AXY(actionBar.KWHzl().getLanguageCode(), actionBar.KWHzl().getMarket(), actionBar.KWHzl().getDisplayName(), ""));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void registerLanguageChange() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void registerUserLocalDataSource(Application application) {
        Object objCopydefault = C58113yvE.copydefault(application, InterfaceC47230tmC.class);
        Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
        InterfaceC5017Bzn interfaceC5017BznZLAIeZ = ((InterfaceC47230tmC) objCopydefault).zLAIeZ();
        BzK.registerNativeUserStorage(interfaceC5017BznZLAIeZ);
        pUU.KWHzl("UserManager", "[OKLauncher] register user local datasource, coreUserLocalDataSource=" + interfaceC5017BznZLAIeZ);
    }

    private final void hookJNALogger() {
        Logger logger = Logger.getLogger("");
        Handler[] handlers = logger.getHandlers();
        Intrinsics.checkNotNullExpressionValue(handlers, "");
        for (Handler handler : handlers) {
            logger.removeHandler(handler);
        }
        logger.addHandler(new StateListAnimator());
        System.setProperty("jna.debug_load", "true");
        System.setProperty("jna.debug_load.jna", "true");
        logger.setUseParentHandlers(false);
    }

    public static final class StateListAnimator extends Handler {
        @Override // java.util.logging.Handler
        public void close() {
        }

        @Override // java.util.logging.Handler
        public void flush() {
        }

        @Override // java.util.logging.Handler
        public void publish(LogRecord logRecord) {
            if (logRecord == null || !yDV.valueOf(new String[]{Native.class.getName(), NativeLibrary.class.getName()}, logRecord.getLoggerName())) {
                return;
            }
            Level level = logRecord.getLevel();
            if (Intrinsics.EZpvd(level, Level.FINE) || Intrinsics.EZpvd(level, Level.INFO)) {
                Throwable thrown = logRecord.getThrown();
                if (thrown != null) {
                    String message = logRecord.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "");
                    pUU.KWHzl(OKCoreInit.TAG, message, thrown);
                    return;
                } else {
                    String message2 = logRecord.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message2, "");
                    pUU.KWHzl(OKCoreInit.TAG, message2);
                    return;
                }
            }
            if (Intrinsics.EZpvd(level, Level.WARNING)) {
                Throwable thrown2 = logRecord.getThrown();
                if (thrown2 != null) {
                    String message3 = logRecord.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message3, "");
                    pUU.OLrzqt(OKCoreInit.TAG, message3, thrown2);
                } else {
                    String message4 = logRecord.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message4, "");
                    pUU.valueOf(OKCoreInit.TAG, message4);
                }
            }
        }
    }

    private final void logNativeLibraryDiagnostics(Application application) {
        try {
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            pUU.KWHzl(TAG, "=== Native Library Diagnostics ===");
            pUU.KWHzl(TAG, "nativeLibraryDir: " + str);
            pUU.KWHzl(TAG, "sourceDir: " + applicationInfo.sourceDir);
            String[] strArr = applicationInfo.splitSourceDirs;
            pUU.KWHzl(TAG, "splitSourceDirs: " + (strArr != null ? yDV.joinToString$default(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) : null));
            pUU.KWHzl(TAG, "extractNativeLibs: " + ((applicationInfo.flags & 268435456) != 0));
            pUU.KWHzl(TAG, "LD_LIBRARY_PATH: " + System.getenv("LD_LIBRARY_PATH"));
            File file = new File(str);
            pUU.KWHzl(TAG, "nativeDir exists=" + file.exists() + ", isDir=" + file.isDirectory() + ", canRead=" + file.canRead());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                pUU.copydefault(TAG, "nativeDir is empty or not accessible");
            } else {
                for (File file2 : fileArrListFiles) {
                    pUU.KWHzl(TAG, "  " + file2.getName() + " (" + (file2.length() / ((long) 1024)) + "KB)");
                }
            }
            File file3 = new File(str, "libOKCore.so");
            pUU.KWHzl(TAG, "libOKCore.so exists=" + file3.exists() + ", size=" + (file3.length() / ((long) 1024)) + "KB, canRead=" + file3.canRead());
            String name = application.getClassLoader().getClass().getName();
            StringBuilder sb = new StringBuilder();
            sb.append("classLoader: ");
            sb.append(name);
            pUU.KWHzl(TAG, sb.toString());
            pUU.KWHzl(TAG, "=== End Diagnostics ===");
        } catch (Throwable th) {
            pUU.AEQbTJ(TAG, "Failed to log native library diagnostics", th);
        }
    }

    private final void initUnexceptedCallback() {
        C60173zxj.setUnExceptionReport(new Function1() { // from class: o.mfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKCoreInit.initUnexceptedCallback$lambda$2((java.lang.Throwable) obj);
            }
        });
        Native.setCallbackExceptionHandler(new Callback.UncaughtExceptionHandler() { // from class: com.okinc.common.okcore.OKCoreInit$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public final void uncaughtException(Callback callback, Throwable th) {
                OKCoreInit.initUnexceptedCallback$lambda$4(callback, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initUnexceptedCallback$lambda$2(Throwable th) throws Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnexceptedCallback$lambda$4(Callback callback, Throwable th) {
        String str = "JNA: Callback " + callback + " threw the following exception";
        pUU.AEQbTJ("OKCoreNativeCrash", str, th);
        pUX pux = pUX.OLrzqt;
        pux.KWHzl(str);
        OKCorePanicHandlerImpl.OKCoreCrashException oKCoreCrashException = new OKCorePanicHandlerImpl.OKCoreCrashException(str);
        oKCoreCrashException.initCause(th);
        pux.AEQbTJ(oKCoreCrashException);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void printLoadedSo(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File("/proc/self/maps")), Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Iterator it = C59467zhb.DbNXlk(yFK.KWHzl(bufferedReader), new Function1() { // from class: o.mfz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(OKCoreInit.printLoadedSo$lambda$7$lambda$5(str, (java.lang.String) obj));
                }
            }).iterator();
            while (it.hasNext()) {
                pUU.AEQbTJ("SO_PATH: " + ((String) it.next()));
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(bufferedReader, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean printLoadedSo$lambda$7$lambda$5(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null);
    }

    private final void hookJNALibraries() {
        C60173zxj.setBeforeRegister(new Function2() { // from class: o.mfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OKCoreInit.hookJNALibraries$lambda$8((java.lang.String) obj, (java.lang.Class) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hookJNALibraries$lambda$8(String str, Class cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        ClassLoader classLoader = cls.getClassLoader();
        ClassLoader parent = classLoader != null ? classLoader.getParent() : null;
        pUU.KWHzl(TAG, "CurrentClassLoader: " + classLoader + "\nParent: " + parent + "\nSo path: " + System.mapLibraryName(str));
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder();
        sb.append("Native.register in ");
        sb.append(canonicalName);
        pUU.KWHzl(TAG, sb.toString());
        INSTANCE.printLoadedSo(str);
        try {
            Field declaredField = NativeLibrary.class.getDeclaredField("libraries");
            declaredField.setAccessible(true);
            pUU.KWHzl(TAG, "Origin libraries content: " + declaredField.get(null));
        } catch (Throwable th) {
            pUU.AEQbTJ(TAG, "Hook libraries failed", th);
        }
        return Unit.INSTANCE;
    }
}
