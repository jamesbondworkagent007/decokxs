package o;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43261rlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceComponentCallbacks2C43266rlz extends android.content.ComponentCallbacks2, InterfaceC43261rlu {
    public static final Application Companion = Application.KWHzl;

    void attachBaseContext(@NotNull android.content.Context context);

    void create();

    void doOnCreate();

    int getPriority();

    java.util.List<java.lang.String> getSites();

    void init(@NotNull android.content.Context context);

    boolean isCreated();

    boolean isLazyInit();

    void markLaunchComplete();

    boolean needRunOnProcess(@NotNull android.content.Context context, java.lang.String str);

    void onCreate();

    void onLaunchComplete();

    void onTerminate();

    void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF);

    void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW);

    void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf);

    void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm);

    void registerSiteExtension(@NotNull android.content.Context context, @NotNull InterfaceC43309rmp interfaceC43309rmp);

    /* JADX INFO: renamed from: o.rlz$StateListAnimator */
    public static final class StateListAnimator {
        public static boolean AhwBna(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            return false;
        }

        public static java.util.List<java.lang.String> EZpvd(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            return null;
        }

        public static java.lang.Class<? extends InterfaceComponentCallbacks2C43266rlz> KWHzl(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            return null;
        }

        public static int OLrzqt(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            return 50;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void OLrzqt(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, @NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void OLrzqt(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, @NotNull android.content.Context context, @NotNull InterfaceC43309rmp interfaceC43309rmp) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(interfaceC43309rmp, "");
        }

        public static void copydefault(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        }

        public static boolean djBIcL(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            return false;
        }

        public static void gEmmrt(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        }

        public static void valueOf(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        }

        public static void OLrzqt(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, Function2<? super java.lang.String, ? super java.lang.Long, Unit> function2) {
            InterfaceC43261rlu.Application.AEQbTJ(interfaceComponentCallbacks2C43266rlz, function2);
        }

        public static void KWHzl(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            InterfaceComponentCallbacks2C43266rlz.Companion.copydefault().put(interfaceComponentCallbacks2C43266rlz, -1L);
            interfaceComponentCallbacks2C43266rlz.registerService(context, new C43231rlQ(C43248rlh.KWHzl.gEmmrt(), interfaceComponentCallbacks2C43266rlz));
            InterfaceC43216rlB interfaceC43216rlBOLrzqt = C43251rlk.OLrzqt((java.lang.Class<InterfaceC43216rlB>) InterfaceC43298rme.class);
            Intrinsics.copydefault(interfaceC43216rlBOLrzqt, "");
            interfaceComponentCallbacks2C43266rlz.registerExtensions(context, new C43230rlP((InterfaceC43299rmf) interfaceC43216rlBOLrzqt, interfaceComponentCallbacks2C43266rlz));
            InterfaceC43216rlB interfaceC43216rlBOLrzqt2 = C43251rlk.OLrzqt((java.lang.Class<InterfaceC43216rlB>) InterfaceC43219rlE.class);
            Intrinsics.copydefault(interfaceC43216rlBOLrzqt2, "");
            interfaceComponentCallbacks2C43266rlz.registerCustomHandler(context, new C43222rlH((InterfaceC43220rlF) interfaceC43216rlBOLrzqt2, interfaceComponentCallbacks2C43266rlz));
            interfaceComponentCallbacks2C43266rlz.registerDeeplinkHandlers(context, new C43226rlL(C43239rlY.AEQbTJ, interfaceComponentCallbacks2C43266rlz));
            InterfaceC43216rlB interfaceC43216rlBOLrzqt3 = C43251rlk.OLrzqt((java.lang.Class<InterfaceC43216rlB>) InterfaceC43305rml.class);
            Intrinsics.copydefault(interfaceC43216rlBOLrzqt3, "");
            interfaceComponentCallbacks2C43266rlz.registerSiteExtension(context, new C43235rlU((InterfaceC43309rmp) interfaceC43216rlBOLrzqt3, interfaceComponentCallbacks2C43266rlz));
        }

        public static void AEQbTJ(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
            interfaceComponentCallbacks2C43266rlz.onCreate();
        }
    }

    /* JADX INFO: renamed from: o.rlz$Application */
    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();
        public static final java.util.Map<InterfaceComponentCallbacks2C43266rlz, java.lang.Long> copydefault = new LinkedHashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<InterfaceComponentCallbacks2C43266rlz, java.lang.Long> copydefault() {
            return copydefault;
        }

        private Application() {
        }
    }
}
