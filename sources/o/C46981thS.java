package o;

import android.os.MessageQueue;
import kotlin.jvm.internal.Intrinsics;
import o.C46981thS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46981thS {

    /* JADX INFO: renamed from: o.thS$Application */
    public static final class Application extends C32981mno {
        public final /* synthetic */ android.app.Application OLrzqt;

        public Application(android.app.Application application) {
            this.OLrzqt = application;
        }

        @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            super.onActivityCreated(activity, bundle);
            android.os.MessageQueue messageQueueMyQueue = android.os.Looper.myQueue();
            final android.app.Application application = this.OLrzqt;
            messageQueueMyQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.thY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return C46981thS.Application.KWHzl(application);
                }
            });
            this.OLrzqt.unregisterActivityLifecycleCallbacks(this);
        }

        public static final boolean KWHzl(android.app.Application application) {
            C47004thp c47004thp = C47004thp.EZpvd;
            c47004thp.fetchVPNInfo();
            c47004thp.EZpvd(application);
            return false;
        }
    }

    public final void EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.registerActivityLifecycleCallbacks(new Application(application));
    }
}
