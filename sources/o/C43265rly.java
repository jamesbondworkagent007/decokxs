package o;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceComponentCallbacks2C43266rlz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43265rly implements InterfaceComponentCallbacks2C43266rlz {
    public static final int $stable = 8;
    private android.content.Context context;
    private final /* synthetic */ C43255rlo $$delegate_0 = new C43255rlo();
    private final AtomicBoolean isCreated = new AtomicBoolean(false);
    private final AtomicBoolean isLaunchComplete = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function2<java.lang.String, java.lang.Long, Unit> getCallback() {
        return this.$$delegate_0.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void onTerminate() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43261rlu
    public void setCallback(Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
        this.$$delegate_0.setCallback(function2);
    }

    public java.lang.Class<? extends InterfaceComponentCallbacks2C43266rlz> baseModule() {
        return InterfaceComponentCallbacks2C43266rlz.StateListAnimator.KWHzl(this);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public java.util.List<java.lang.String> getSites() {
        return InterfaceComponentCallbacks2C43266rlz.StateListAnimator.EZpvd(this);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return InterfaceComponentCallbacks2C43266rlz.StateListAnimator.AhwBna(this);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.gEmmrt(this);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this, context, interfaceC43237rlW);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void registerSiteExtension(@NotNull android.content.Context context, @NotNull InterfaceC43309rmp interfaceC43309rmp) {
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.OLrzqt(this, context, interfaceC43309rmp);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public final void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.KWHzl(this, context);
        onInit(context);
    }

    public final android.app.Application getApplication() {
        android.content.Context context = this.context;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (context instanceof android.app.Application) {
            return (android.app.Application) context;
        }
        if (applicationContext instanceof android.app.Application) {
            return (android.app.Application) applicationContext;
        }
        throw new java.lang.RuntimeException("Must init IMC with application reference.");
    }

    public final void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public final void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public final void registerComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        getApplication().registerComponentCallbacks(componentCallbacks);
    }

    public final void unregisterComponentCallbacks(android.content.ComponentCallbacks componentCallbacks) {
        getApplication().unregisterComponentCallbacks(componentCallbacks);
    }

    public final void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        getApplication().registerOnProvideAssistDataListener(onProvideAssistDataListener);
    }

    public final void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
        getApplication().unregisterOnProvideAssistDataListener(onProvideAssistDataListener);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean needRunOnProcess(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        return C43308rmo.EZpvd(context, str);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public final void doOnCreate() {
        java.lang.Class<? extends InterfaceComponentCallbacks2C43266rlz> clsBaseModule = baseModule();
        if (clsBaseModule != null) {
            C43246rlf.OLrzqt.OLrzqt(clsBaseModule.getName()).doOnCreate();
        }
        if (!isLazyInit() || this.isCreated.get()) {
            return;
        }
        android.content.Context context = this.context;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        if (C43308rmo.KWHzl(context)) {
            synchronized (getClass()) {
                if (!this.isCreated.get()) {
                    create();
                    this.isCreated.set(true);
                    InterfaceC43264rlx logger$default = C43248rlh.getLogger$default(C43248rlh.KWHzl, null, 1, null);
                    java.lang.String simpleName = getClass().getSimpleName();
                    C43246rlf c43246rlf = C43246rlf.OLrzqt;
                    logger$default.AEQbTJ("AbsModule", simpleName + " lazy onCreate in UIProcess:" + c43246rlf.gEmmrt());
                    if (this.isLaunchComplete.get()) {
                        onLaunchComplete();
                        C43251rlk.logger$default(null, 1, null).KWHzl("Module", getClass().getSimpleName() + " lazy onLaunchComplete in UIProcess:" + c43246rlf.gEmmrt());
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public void markLaunchComplete() {
        this.isLaunchComplete.set(true);
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public final void create() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        InterfaceComponentCallbacks2C43266rlz.StateListAnimator.AEQbTJ(this);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        Function2<java.lang.String, java.lang.Long, Unit> callback = getCallback();
        if (callback != null) {
            java.lang.String name = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            callback.invoke(name, java.lang.Long.valueOf(jCurrentTimeMillis2));
        }
        InterfaceComponentCallbacks2C43266rlz.Companion.copydefault().put(this, java.lang.Long.valueOf(jCurrentTimeMillis2));
    }

    @Override // o.InterfaceComponentCallbacks2C43266rlz
    public boolean isCreated() {
        return this.isCreated.get();
    }
}
