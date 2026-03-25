package o;

import com.google.gson.JsonObject;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32864mld {
    public static java.lang.String AYXKKw;
    public static Function0<JsonObject> AhwBna;
    public static Function0<java.lang.Boolean> DbNXlk;
    public static boolean EZpvd;
    public static yHO<? super java.lang.String, ? super java.lang.Boolean, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> fetchVPNInfo;
    public static Function0<JsonObject> valueOf;
    public static java.lang.String values;
    public static final C32864mld OLrzqt = new C32864mld();
    public static Function0<java.lang.String> djBIcL = Activity.copydefault;
    public static Function0<java.lang.String> gEmmrt = TaskDescription.EZpvd;
    public static java.util.Map<AmplitudeName, java.lang.String> copydefault = C56424yEw.KWHzl();
    public static java.util.Map<AmplitudeName, java.lang.String> AEQbTJ = C56424yEw.KWHzl();
    public static Function0<java.lang.Boolean> AkhnZx = new Function0() { // from class: o.mlc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C32864mld.OLrzqt());
        }
    };
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.mld$Activity */
    public static final class Activity implements Function0 {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: o.mld$TaskDescription */
    public static final class TaskDescription implements Function0 {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void invoke() {
            return null;
        }
    }

    public static final boolean OLrzqt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<JsonObject> function0) {
        valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<JsonObject> AYXKKw() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> AhwBna() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Boolean> AkhnZx() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.lang.String, ? super java.lang.Boolean, ? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit>, o.yHO<java.lang.String, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> */
    public final yHO<java.lang.String, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>, Unit> DbNXlk() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<AmplitudeName, java.lang.String> EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.util.Map<AmplitudeName, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AEQbTJ = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<JsonObject> function0) {
        AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.Map<AmplitudeName, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        copydefault = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<AmplitudeName, java.lang.String> copydefault() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.Boolean> function0) {
        DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<JsonObject> djBIcL() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(Function0<java.lang.Boolean> function0) {
        AkhnZx = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.String> gEmmrt() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Boolean> values() {
        return AkhnZx;
    }

    private C32864mld() {
    }

    public final java.lang.String fetchVPNInfo() {
        java.lang.String str = values;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
