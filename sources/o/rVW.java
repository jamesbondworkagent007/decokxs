package o;

import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import com.okinc.okapm.common.Lifecycle;
import com.okinc.okapm.internal.memory.MemoryTrackerImpl$recordMemoryWarning$1;
import com.okinc.okapm.internal.memory.MemoryTrackerImpl$submitMemoryEvent$1$1;
import com.okinc.okapm.internal.memory.MemoryTrackerImpl$submitMemoryEvent$2$1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rVW implements rWK {
    public final AtomicLong AEQbTJ;
    public final CoroutineScope AhwBna;
    public final AtomicLong EZpvd;
    public rWC KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final AtomicBoolean copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public rVW() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.rWM
    public void EZpvd(@NotNull rWC rwc) {
        Intrinsics.checkNotNullParameter(rwc, "");
        this.KWHzl = rwc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.djBIcL;
    }

    public rVW(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = coroutineDispatcher;
        this.AhwBna = coroutineScope;
        this.djBIcL = "Monitor.Memory";
        this.EZpvd = new AtomicLong(0L);
        this.AEQbTJ = new AtomicLong(0L);
        this.copydefault = new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rVW(CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        coroutineDispatcher = (i & 1) != 0 ? com.okinc.okapm.Apm.Companion.OLrzqt() : coroutineDispatcher;
        this(coroutineDispatcher, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher)) : coroutineScope);
    }

    @Override // o.rWK
    public void copydefault(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        if (lifecycle == Lifecycle.Background) {
            OLrzqt(AppStartMode.OnLifecycle);
        } else if (this.copydefault.compareAndSet(false, true)) {
            OLrzqt(AppStartMode.OnLaunch);
        }
    }

    @Override // o.rWK
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.AEQbTJ.get();
        if (jCurrentTimeMillis - j >= 2000 && this.AEQbTJ.compareAndSet(j, jCurrentTimeMillis)) {
            C6795aWC.AEQbTJ(KWHzl(), (Function0<Unit>) new Function0() { // from class: o.rVY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rVW.EZpvd(this.OLrzqt, str);
                }
            });
        }
    }

    public static final Unit EZpvd(rVW rvw, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(rvw.AhwBna, null, null, new MemoryTrackerImpl$submitMemoryEvent$1$1(str, rvw, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.rWK
    public void OLrzqt(@NotNull final AppStartMode appStartMode) {
        Intrinsics.checkNotNullParameter(appStartMode, "");
        if (appStartMode != AppStartMode.OnLaunch) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = this.EZpvd.get();
            if (jCurrentTimeMillis - j < 2000 || !this.EZpvd.compareAndSet(j, jCurrentTimeMillis)) {
                return;
            }
        }
        C6795aWC.AEQbTJ(KWHzl(), (Function0<Unit>) new Function0() { // from class: o.rVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVW.AEQbTJ(this.AEQbTJ, appStartMode);
            }
        });
    }

    public static final Unit AEQbTJ(rVW rvw, AppStartMode appStartMode) {
        BuildersKt__Builders_commonKt.launch$default(rvw.AhwBna, null, null, new MemoryTrackerImpl$submitMemoryEvent$2$1(appStartMode, rvw, null), 3, null);
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Apm.TaskDescription taskDescriptionOLrzqt = Apm.TaskDescription.Companion.OLrzqt(Apm.EventGroupType.APP_LIFECYCLE.getValue(), Apm.EventType.APP_MEMORY.getValue(), str, map);
        rWC rwc = this.KWHzl;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
        java.lang.Object objCopydefault = copydefault(str, map, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MemoryTrackerImpl$recordMemoryWarning$1 memoryTrackerImpl$recordMemoryWarning$1;
        rVW rvw;
        java.lang.Double dAuCTel;
        java.lang.Double dAuCTel2;
        java.lang.Float fFIwbmz;
        if (continuation instanceof MemoryTrackerImpl$recordMemoryWarning$1) {
            memoryTrackerImpl$recordMemoryWarning$1 = (MemoryTrackerImpl$recordMemoryWarning$1) continuation;
            int i = memoryTrackerImpl$recordMemoryWarning$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memoryTrackerImpl$recordMemoryWarning$1.label = i - Integer.MIN_VALUE;
            } else {
                memoryTrackerImpl$recordMemoryWarning$1 = new MemoryTrackerImpl$recordMemoryWarning$1(this, continuation);
            }
        }
        java.lang.Object obj = memoryTrackerImpl$recordMemoryWarning$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memoryTrackerImpl$recordMemoryWarning$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String str2 = map.get("java_heap_rate");
            float fFloatValue = (str2 == null || (fFIwbmz = C59443zhD.fIwbmz(str2)) == null) ? 0.0f : fFIwbmz.floatValue();
            if (fFloatValue > 0.8f) {
                java.lang.String str3 = map.get("java_heap_max");
                long jDoubleValue = 0;
                long jDoubleValue2 = (str3 == null || (dAuCTel2 = C59443zhD.AuCTel(str3)) == null) ? 0L : (long) dAuCTel2.doubleValue();
                java.lang.String str4 = map.get("java_heap_used");
                if (str4 != null && (dAuCTel = C59443zhD.AuCTel(str4)) != null) {
                    jDoubleValue = (long) dAuCTel.doubleValue();
                }
                pUU.copydefault();
                pUU.valueOf(KWHzl(), "Used memory reached ~" + fFloatValue + ", current used memory is " + jDoubleValue + "kB, total memory is " + jDoubleValue2 + "kB");
                memoryTrackerImpl$recordMemoryWarning$1.L$0 = this;
                memoryTrackerImpl$recordMemoryWarning$1.L$1 = str;
                memoryTrackerImpl$recordMemoryWarning$1.L$2 = map;
                memoryTrackerImpl$recordMemoryWarning$1.label = 1;
                if (DelayKt.delay(5000L, memoryTrackerImpl$recordMemoryWarning$1) == objCopydefault) {
                    return objCopydefault;
                }
                rvw = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = (java.util.Map) memoryTrackerImpl$recordMemoryWarning$1.L$2;
        str = (java.lang.String) memoryTrackerImpl$recordMemoryWarning$1.L$1;
        rvw = (rVW) memoryTrackerImpl$recordMemoryWarning$1.L$0;
        C56391yDq.AEQbTJ(obj);
        Apm.TaskDescription taskDescriptionOLrzqt = Apm.TaskDescription.Companion.OLrzqt(Apm.EventGroupType.APP_LIFECYCLE.getValue(), Apm.EventType.APP_MEMORY_WARNING.getValue(), str, map);
        rWC rwc = rvw.KWHzl;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
        return Unit.INSTANCE;
    }
}
