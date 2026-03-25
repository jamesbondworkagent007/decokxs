package o;

import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57779yop {
    public boolean AEQbTJ = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract java.lang.String EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    public abstract void copydefault(OneSignal.TaskStackBuilder taskStackBuilder);

    public java.lang.String toString() {
        return "OSInAppMessagePrompt{key=" + EZpvd() + " prompted=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
    }
}
