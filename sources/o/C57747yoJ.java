package o;

import com.onesignal.OSNotificationAction;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yoJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57747yoJ implements OneSignal.Application {
    public final java.lang.Runnable AEQbTJ;
    public OSNotificationAction EZpvd;
    public C57789yoz KWHzl;
    public final HandlerThreadC57819ypc OLrzqt;
    public boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57789yoz EZpvd() {
        return this.KWHzl;
    }

    public C57747yoJ(C57789yoz c57789yoz, OSNotificationAction oSNotificationAction) {
        this.KWHzl = c57789yoz;
        this.EZpvd = oSNotificationAction;
        HandlerThreadC57819ypc handlerThreadC57819ypcCopydefault = HandlerThreadC57819ypc.copydefault();
        this.OLrzqt = handlerThreadC57819ypcCopydefault;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yoJ.5
            @Override // java.lang.Runnable
            public void run() {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
                C57747yoJ.this.OLrzqt(false);
            }
        };
        this.AEQbTJ = runnable;
        handlerThreadC57819ypcCopydefault.AEQbTJ(5000L, runnable);
    }

    public final void OLrzqt(boolean z) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.AEQbTJ(log_level, "OSNotificationOpenedResult complete called with opened: " + z);
        this.OLrzqt.EZpvd(this.AEQbTJ);
        if (this.copydefault) {
            OneSignal.AEQbTJ(log_level, "OSNotificationOpenedResult already completed");
            return;
        }
        this.copydefault = true;
        if (z) {
            OneSignal.AEQbTJ(this.KWHzl.gEmmrt());
        }
        OneSignal.KWHzl(this);
    }

    @Override // com.onesignal.OneSignal.Application
    public void EZpvd(OneSignal.AppEntryAction appEntryAction) {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + appEntryAction);
        OLrzqt(OneSignal.AppEntryAction.APP_CLOSE.equals(appEntryAction));
    }

    public java.lang.String toString() {
        return "OSNotificationOpenedResult{notification=" + this.KWHzl + ", action=" + this.EZpvd + ", isComplete=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
