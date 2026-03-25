package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6795aWC {
    public static final Regex copydefault = new Regex("MemFree:\\s*(\\d+)\\s*kB");
    public static final Regex EZpvd = new Regex("CmaTotal:\\s*(\\d+)\\s*kB");
    public static final Regex OLrzqt = new Regex("MemTotal:\\s*(\\d+)\\s*kB");
    public static final Regex KWHzl = new Regex("MemAvailable:\\s*(\\d+)\\s*kB");
    public static final Regex AhwBna = new Regex("VmSize:\\s*(\\d+)\\s*kB");
    public static final Regex AEQbTJ = new Regex("VmRSS:\\s*(\\d+)\\s*kB");
    public static final Regex djBIcL = new Regex("Threads:\\s*(\\d+)\\s*");

    public static /* synthetic */ void forEachLineQuietly$default(java.io.File file, java.nio.charset.Charset charset, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        KWHzl(file, charset, function1);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void KWHzl(java.io.File file, java.nio.charset.Charset charset, Function1<? super java.lang.String, Unit> function1) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), charset));
            try {
                yFK.AEQbTJ(bufferedReader, function1);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(bufferedReader, null);
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("Monitor.Device", "forEachLineQuietly: " + thM7380exceptionOrNullimpl);
        }
    }

    public static final long KWHzl(Regex regex, java.lang.String str) {
        java.util.List<java.lang.String> listOLrzqt;
        java.lang.String str2;
        java.lang.Long fieldNames;
        MatchResult matchResultMatchEntire = regex.matchEntire(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString());
        if (matchResultMatchEntire == null || (listOLrzqt = matchResultMatchEntire.OLrzqt()) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listOLrzqt, 1)) == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str2)) == null) {
            return 0L;
        }
        return fieldNames.longValue();
    }

    public static /* synthetic */ void tryPass$default(java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tryPass";
        }
        AEQbTJ(str, (Function0<Unit>) function0);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        try {
            function0.invoke();
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ(str, th);
        }
    }
}
