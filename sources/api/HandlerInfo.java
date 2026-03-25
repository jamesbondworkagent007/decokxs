package api;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes20.dex */
public final class HandlerInfo implements Seq.Proxy {
    private final int refnum;

    public static native int __New();

    public final native boolean getCheckChainId();

    public final native boolean getEncrypted();

    public final native void setCheckChainId(boolean z);

    public final native void setEncrypted(boolean z);

    static {
        Api.touch();
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public HandlerInfo(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public HandlerInfo() {
        int i__New = __New();
        this.refnum = i__New;
        Seq.trackGoRef(i__New, this);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HandlerInfo)) {
            return false;
        }
        HandlerInfo handlerInfo = (HandlerInfo) obj;
        return getEncrypted() == handlerInfo.getEncrypted() && getCheckChainId() == handlerInfo.getCheckChainId();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(getEncrypted()), Boolean.valueOf(getCheckChainId())});
    }

    public String toString() {
        return "HandlerInfo{Encrypted:" + getEncrypted() + ",CheckChainId:" + getCheckChainId() + ",}";
    }
}
