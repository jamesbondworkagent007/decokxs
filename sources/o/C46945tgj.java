package o;

import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import com.okinc.okpush.sdk.OKPushManager$init$1;
import com.okinc.okpush.sdk.OKPushManager$initPushOnBackground$2;
import com.okinc.okpush.sdk.init.PushInitManager;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C46945tgj;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46945tgj {
    public static final C46945tgj AEQbTJ = new C46945tgj();
    public static final InterfaceC56387yDm EZpvd;
    public static final InterfaceC56387yDm OLrzqt;
    public static final int copydefault;

    private C46945tgj() {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        OLrzqt = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.tgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46945tgj.KWHzl();
            }
        });
        EZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.tgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46945tgj.AEQbTJ();
            }
        });
        copydefault = 8;
    }

    public final CoroutineExceptionHandler OLrzqt() {
        return (CoroutineExceptionHandler) OLrzqt.getValue();
    }

    public final CoroutineScope AYXKKw() {
        return (CoroutineScope) EZpvd.getValue();
    }

    public static final CoroutineScope AEQbTJ() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()).plus(AEQbTJ.OLrzqt()));
    }

    /* JADX INFO: renamed from: o.tgj$StateListAnimator */
    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.copydefault("OKPushManager", "Push init error: " + th.getMessage());
        }
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(AYXKKw(), null, null, new OKPushManager$init$1(context, null), 3, null);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_home_page_created");
        final java.lang.Object obj = new java.lang.Object();
        abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<java.lang.String>(obj) { // from class: com.okinc.okpush.sdk.OKPushManager$init$2
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                pUU.KWHzl("OKPushManager", "onEvent, EVENT_HOME_PAGE_CREATED");
                C46945tgj.AEQbTJ.valueOf();
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ2 = RxBus.AEQbTJ("event_first_activity_created");
        final java.lang.Object obj2 = new java.lang.Object();
        abstractC58185ywXAEQbTJ2.subscribe(new RxBus.EventCallback<java.lang.String>(obj2) { // from class: com.okinc.okpush.sdk.OKPushManager$init$3
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                pUU.KWHzl("OKPushManager", "PushLifecycleListener received firstActivity create");
                C46945tgj c46945tgj = C46945tgj.AEQbTJ;
                c46945tgj.AhwBna().copydefault();
                c46945tgj.AhwBna().OLrzqt("BIND_FROM_INIT");
            }
        });
    }

    /* JADX INFO: renamed from: o.tgj$Activity */
    public static final class Activity implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                if (activityAEQbTJ.isFinishing() || activityAEQbTJ.isDestroyed()) {
                    C46945tgj.AEQbTJ.valueOf();
                } else {
                    ActivityCompat.requestPermissions(activityAEQbTJ, C33625mzw.OLrzqt, 223);
                }
            }
        }
    }

    public final java.lang.Object KWHzl(android.content.Context context, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OKPushManager$initPushOnBackground$2(context, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void valueOf() {
        if (Build.VERSION.SDK_INT < 33 || KWHzl(C32979mnm.EZpvd.OLrzqt())) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new Activity(), 1000L);
    }

    public final boolean KWHzl(android.content.Context context) {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "");
        return notificationManagerCompatFrom.areNotificationsEnabled();
    }

    public final InterfaceC46958tgw AhwBna() {
        return PushInitManager.OLrzqt;
    }

    public final InterfaceC46951tgp djBIcL() {
        return C46954tgs.OLrzqt;
    }

    public static final CoroutineExceptionHandler KWHzl() {
        return new StateListAnimator(CoroutineExceptionHandler.Key);
    }
}
