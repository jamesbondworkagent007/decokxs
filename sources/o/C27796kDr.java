package o;

import android.os.MessageQueue;
import com.okinc.business.market.utils.MarketHomeTabType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27796kDr {
    public java.lang.String OLrzqt = "";
    public MarketHomeTabType AEQbTJ = MarketHomeTabType.FAVORITE;
    public final MessageQueue.IdleHandler copydefault = new MessageQueue.IdleHandler() { // from class: o.kDv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            return C27796kDr.KWHzl(this.AEQbTJ);
        }
    };
    public final java.lang.Runnable KWHzl = new java.lang.Runnable() { // from class: o.kDs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C27796kDr.OLrzqt(this.AEQbTJ);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public static final boolean KWHzl(C27796kDr c27796kDr) {
        c27796kDr.KWHzl();
        return false;
    }

    public boolean copydefault() {
        java.lang.String str = this.OLrzqt;
        return str == null || str.length() == 0;
    }

    public void AEQbTJ(android.view.View view, @NotNull MarketHomeTabType marketHomeTabType) {
        Intrinsics.checkNotNullParameter(marketHomeTabType, "");
        this.AEQbTJ = marketHomeTabType;
        if (view != null) {
            view.post(this.KWHzl);
        }
    }

    public void AEQbTJ() {
        android.os.Looper.myQueue().removeIdleHandler(this.copydefault);
    }

    public static final void OLrzqt(C27796kDr c27796kDr) {
        android.os.Looper.myQueue().removeIdleHandler(c27796kDr.copydefault);
        android.os.Looper.myQueue().addIdleHandler(c27796kDr.copydefault);
    }

    public final void KWHzl() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt)) {
            C27986kKr.AEQbTJ.OLrzqt(C33129mqd.subS$default(C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null), this.OLrzqt, null, null, null, 14, null), this.AEQbTJ);
            this.OLrzqt = "";
        }
    }
}
