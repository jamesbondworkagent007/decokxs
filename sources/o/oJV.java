package o;

import com.okinc.di.LocalizeDIContainer;
import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oJV {
    public static long OLrzqt;
    public static Function0<Unit> djBIcL;
    public static yHT<? super LanguageUnit, ? super java.lang.Integer, ? super java.lang.String, ? super Continuation<? super AppLanguagesChangeResult>, ? extends java.lang.Object> fetchVPNInfo;
    public static Function0<Unit> gEmmrt;
    public static final oJV AEQbTJ = new oJV();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oJR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oJV.djBIcL();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oJU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(oJV.AhwBna());
        }
    });
    public static Function0<java.lang.Boolean> valueOf = new Function0() { // from class: o.oJW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(oJV.valueOf());
        }
    };
    public static final CoroutineExceptionHandler KWHzl = new TaskDescription(CoroutineExceptionHandler.Key);
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.oJY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oJV.OLrzqt();
        }
    });
    public static final int copydefault = 8;

    public static final boolean valueOf() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(long j) {
        OLrzqt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineExceptionHandler AYXKKw() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AkhnZx() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(yHT<? super LanguageUnit, ? super java.lang.Integer, ? super java.lang.String, ? super Continuation<? super AppLanguagesChangeResult>, ? extends java.lang.Object> yht) {
        fetchVPNInfo = yht;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> fetchVPNInfo() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Boolean> isConnected() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long values() {
        return OLrzqt;
    }

    private oJV() {
    }

    public final Json DbNXlk() {
        return (Json) AhwBna.getValue();
    }

    public static final Json djBIcL() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.oJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oJV.AEQbTJ((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) AYXKKw.getValue()).booleanValue();
    }

    public static final boolean AhwBna() {
        boolean zKWHzl = LocalizeDIContainer.INSTANCE.getLanguageUsageRepo().KWHzl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("isFirstInstall, result:");
        boolean z = !zKWHzl;
        sb.append(z);
        pUU.KWHzl("LocalizationConfig", sb.toString());
        return z;
    }

    public final CoroutineScope gEmmrt() {
        return (CoroutineScope) EZpvd.getValue();
    }

    public static final CoroutineScope OLrzqt() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()).plus(KWHzl));
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Throwable th) {
            pUU.OLrzqt("LocalizationConfig", "catch coroutine exception.", th);
        }
    }
}
