package o;

import com.okinc.oklive.app.common.util.LiveDynamicUtil$loadBytePlusSDK$2;
import com.okinc.oklive.app.common.util.LiveDynamicUtil$loadLiveStreamingPage$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44538sTq {
    public static boolean AEQbTJ;
    public static boolean AYXKKw;
    public static boolean EZpvd;
    public static boolean djBIcL;
    public static boolean gEmmrt;
    public static boolean valueOf;
    public static final C44538sTq copydefault = new C44538sTq();
    public static final java.lang.Object OLrzqt = new java.lang.Object();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return valueOf;
    }

    private C44538sTq() {
    }

    public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("LiveDynamicUtil", "loadBytePlusSDK check");
        if (gEmmrt) {
            return C56443yFo.KWHzl(true);
        }
        boolean zDjBIcL = djBIcL();
        pUU.KWHzl("LiveDynamicUtil", "SDK isDynamic: " + zDjBIcL);
        if (!zDjBIcL) {
            pUU.KWHzl("LiveDynamicUtil", "SDK in base APK, skipping FeatureManager");
            gEmmrt = true;
            return C56443yFo.KWHzl(true);
        }
        if (!AhwBna()) {
            pUU.valueOf("LiveDynamicUtil", "SDK dynamic module not yet installed");
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new LiveDynamicUtil$loadBytePlusSDK$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("LiveDynamicUtil", "loadLiveStreamingPage check");
        if (valueOf) {
            return C56443yFo.KWHzl(true);
        }
        boolean zDbNXlk = DbNXlk();
        pUU.KWHzl("LiveDynamicUtil", "StreamingPage isDynamic: " + zDbNXlk);
        if (!zDbNXlk) {
            pUU.KWHzl("LiveDynamicUtil", "StreamingPage in base APK, skipping FeatureManager");
            valueOf = true;
            return C56443yFo.KWHzl(true);
        }
        if (!valueOf()) {
            pUU.valueOf("LiveDynamicUtil", "StreamingPage dynamic module not yet installed");
        }
        return BuildersKt.withContext(Dispatchers.getMain(), new LiveDynamicUtil$loadLiveStreamingPage$2(context, java.lang.System.currentTimeMillis(), null), continuation);
    }

    public final boolean djBIcL() {
        return C34733nhs.Companion.EZpvd("oklive_dynamic_sdk_impl");
    }

    public final boolean AhwBna() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "oklive_dynamic_sdk_impl");
    }

    public final boolean DbNXlk() {
        return C34733nhs.Companion.EZpvd("oklive_dynamic_streaming_page_impl");
    }

    public final boolean valueOf() {
        return C34733nhs.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), "oklive_dynamic_streaming_page_impl");
    }
}
