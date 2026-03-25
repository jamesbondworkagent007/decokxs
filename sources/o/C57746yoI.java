package o;

import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57746yoI {
    public boolean AEQbTJ = false;
    public final HandlerThreadC57819ypc EZpvd;
    public final java.lang.Runnable KWHzl;
    public final C57789yoz OLrzqt;
    public final C57740yoC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57789yoz KWHzl() {
        return this.OLrzqt;
    }

    public C57746yoI(C57740yoC c57740yoC, C57789yoz c57789yoz) {
        this.OLrzqt = c57789yoz;
        this.copydefault = c57740yoC;
        HandlerThreadC57819ypc handlerThreadC57819ypcCopydefault = HandlerThreadC57819ypc.copydefault();
        this.EZpvd = handlerThreadC57819ypcCopydefault;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yoI.5
            @Override // java.lang.Runnable
            public void run() {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
                C57746yoI c57746yoI = C57746yoI.this;
                c57746yoI.EZpvd(c57746yoI.KWHzl());
            }
        };
        this.KWHzl = runnable;
        handlerThreadC57819ypcCopydefault.AEQbTJ(25000L, runnable);
    }

    public void EZpvd(@androidx.annotation.Nullable final C57789yoz c57789yoz) {
        synchronized (this) {
            this.EZpvd.EZpvd(this.KWHzl);
            if (this.AEQbTJ) {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationReceivedEvent already completed");
                return;
            }
            this.AEQbTJ = true;
            if (OLrzqt()) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoI.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C57746yoI.this.OLrzqt(c57789yoz);
                    }
                }, "OS_COMPLETE_NOTIFICATION").start();
            } else {
                OLrzqt(c57789yoz);
            }
        }
    }

    public void AEQbTJ(android.content.Context context, java.lang.String str) {
        synchronized (this) {
            C57692ynH.KWHzl(context, str);
        }
    }

    public final void OLrzqt(@androidx.annotation.Nullable C57789yoz c57789yoz) {
        this.copydefault.AEQbTJ(this.OLrzqt.OLrzqt(), c57789yoz != null ? c57789yoz.OLrzqt() : null);
    }

    public java.lang.String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.AEQbTJ + ", notification=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
    }

    public static boolean OLrzqt() {
        return OSUtils.fIwbmz();
    }
}
