package o;

import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RF {
    public boolean OLrzqt;
    public final java.util.Set<RV> copydefault = Collections.newSetFromMap(new WeakHashMap());
    public final java.util.Set<RV> KWHzl = new java.util.HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.OLrzqt;
    }

    public void KWHzl(@androidx.annotation.NonNull RV rv) {
        this.copydefault.add(rv);
        if (!this.OLrzqt) {
            rv.OLrzqt();
        } else {
            rv.KWHzl();
            this.KWHzl.add(rv);
        }
    }

    public boolean AEQbTJ(@androidx.annotation.Nullable RV rv) {
        boolean z = true;
        if (rv == null) {
            return true;
        }
        boolean zRemove = this.copydefault.remove(rv);
        if (!this.KWHzl.remove(rv) && !zRemove) {
            z = false;
        }
        if (z) {
            rv.KWHzl();
        }
        return z;
    }

    public void AEQbTJ() {
        this.OLrzqt = true;
        for (RV rv : SI.AEQbTJ(this.copydefault)) {
            if (rv.gEmmrt()) {
                rv.DbNXlk();
                this.KWHzl.add(rv);
            }
        }
    }

    public void OLrzqt() {
        this.OLrzqt = true;
        for (RV rv : SI.AEQbTJ(this.copydefault)) {
            if (rv.gEmmrt() || rv.valueOf()) {
                rv.KWHzl();
                this.KWHzl.add(rv);
            }
        }
    }

    public void valueOf() {
        this.OLrzqt = false;
        for (RV rv : SI.AEQbTJ(this.copydefault)) {
            if (!rv.valueOf() && !rv.gEmmrt()) {
                rv.OLrzqt();
            }
        }
        this.KWHzl.clear();
    }

    public void EZpvd() {
        java.util.Iterator it = SI.AEQbTJ(this.copydefault).iterator();
        while (it.hasNext()) {
            AEQbTJ((RV) it.next());
        }
        this.KWHzl.clear();
    }

    public void KWHzl() {
        for (RV rv : SI.AEQbTJ(this.copydefault)) {
            if (!rv.valueOf() && !rv.EZpvd()) {
                rv.KWHzl();
                if (!this.OLrzqt) {
                    rv.OLrzqt();
                } else {
                    this.KWHzl.add(rv);
                }
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "{numRequests=" + this.copydefault.size() + ", isPaused=" + this.OLrzqt + "}";
    }
}
