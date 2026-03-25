package o;

import o.C57330ygQ;

/* JADX INFO: renamed from: o.ygU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57334ygU implements InterfaceC57336ygW {
    public android.content.Context EZpvd;
    public C57330ygQ.StateListAnimator KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57336ygW
    public android.content.Context AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.EZpvd = null;
        this.KWHzl = null;
    }

    public AbstractC57334ygU(android.content.Context context, C57330ygQ.StateListAnimator stateListAnimator) {
        this.EZpvd = context;
        this.KWHzl = stateListAnimator;
    }

    @Override // o.InterfaceC57336ygW
    public void OLrzqt(com.okinc.jsbridge.Message message, java.lang.String str) {
        C57330ygQ.StateListAnimator stateListAnimator = this.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(message.success, str);
        }
    }

    @Override // o.InterfaceC57336ygW
    public void copydefault(com.okinc.jsbridge.Message message, java.lang.String str) {
        C57330ygQ.StateListAnimator stateListAnimator = this.KWHzl;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(message.fail, str);
        }
    }
}
