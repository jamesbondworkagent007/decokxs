package com.okinc.utils.appmanager;

import android.os.SystemClock;
import com.okinc.utils.appmanager.BackgroundRecords;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import o.C54817xWk;

/* JADX INFO: loaded from: classes12.dex */
public final class BackgroundRecords {
    public static final BackgroundRecords INSTANCE = new BackgroundRecords();
    private static final ConcurrentLinkedDeque<C54817xWk> stateEvents = new ConcurrentLinkedDeque<>();
    public static final int $stable = 8;

    private BackgroundRecords() {
    }

    public final void recordEnterForeground() {
        recordStateChange(false);
    }

    public final void recordEnterBackground() {
        recordStateChange(true);
    }

    private final void recordStateChange(boolean z) {
        ConcurrentLinkedDeque<C54817xWk> concurrentLinkedDeque = stateEvents;
        if (concurrentLinkedDeque.size() >= 64) {
            concurrentLinkedDeque.removeFirst();
        }
        concurrentLinkedDeque.add(new C54817xWk(getCurrentTime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearEnterBackgroundRecords$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void clearEnterBackgroundRecords$OKBase_okbase() {
        ConcurrentLinkedDeque<C54817xWk> concurrentLinkedDeque = stateEvents;
        final Function1 function1 = new Function1() { // from class: o.xWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((C54817xWk) obj).KWHzl());
            }
        };
        concurrentLinkedDeque.removeIf(new Predicate() { // from class: o.xWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return BackgroundRecords.clearEnterBackgroundRecords$lambda$1(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearForegroundRecords$lambda$2(C54817xWk c54817xWk) {
        return !c54817xWk.KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearForegroundRecords$lambda$3(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void clearForegroundRecords$OKBase_okbase() {
        ConcurrentLinkedDeque<C54817xWk> concurrentLinkedDeque = stateEvents;
        final Function1 function1 = new Function1() { // from class: o.xWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(BackgroundRecords.clearForegroundRecords$lambda$2((C54817xWk) obj));
            }
        };
        concurrentLinkedDeque.removeIf(new Predicate() { // from class: o.xWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return BackgroundRecords.clearForegroundRecords$lambda$3(function1, obj);
            }
        });
    }

    public final void clearAllRecords$OKBase_okbase() {
        stateEvents.clear();
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    public final boolean existBackgroundInRange(long j, long j2) {
        if (j > j2) {
            return false;
        }
        List<C54817xWk> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(stateEvents);
        if (listAxsJAYsNCnLh.isEmpty() || j < ((C54817xWk) CollectionsKt___CollectionsKt.AuCTelauCTel(listAxsJAYsNCnLh)).copydefault()) {
            return true;
        }
        long jCopydefault = 0;
        boolean zKWHzl = true;
        for (C54817xWk c54817xWk : listAxsJAYsNCnLh) {
            if (zKWHzl && jCopydefault < j2 && j < c54817xWk.copydefault()) {
                return true;
            }
            if (c54817xWk.KWHzl()) {
                long jCopydefault2 = c54817xWk.copydefault();
                if (j <= jCopydefault2 && jCopydefault2 <= j2) {
                    return true;
                }
            }
            zKWHzl = c54817xWk.KWHzl();
            jCopydefault = c54817xWk.copydefault();
        }
        return zKWHzl && jCopydefault <= j2;
    }

    public final boolean hasEnteredBackgroundInRange(long j, long j2) {
        ConcurrentLinkedDeque<C54817xWk> concurrentLinkedDeque = stateEvents;
        if (!(concurrentLinkedDeque instanceof Collection) || !concurrentLinkedDeque.isEmpty()) {
            for (C54817xWk c54817xWk : concurrentLinkedDeque) {
                if (c54817xWk.KWHzl()) {
                    long jCopydefault = c54817xWk.copydefault();
                    if (j <= jCopydefault && jCopydefault <= j2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
