package o;

import java.util.Collections;
import java.util.Map;
import o.C31909mIk;

/* JADX INFO: renamed from: o.mIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C31912mIn {
    public java.util.Map<java.lang.String, java.lang.Integer> copydefault = Collections.synchronizedMap(new java.util.HashMap());
    public final java.util.Map<java.lang.String, C31909mIk> EZpvd = Collections.synchronizedMap(new java.util.HashMap());
    public final java.util.Set<java.lang.String> AEQbTJ = Collections.synchronizedSet(new java.util.HashSet());
    public volatile boolean KWHzl = false;
    public final java.lang.Object OLrzqt = new java.lang.Object();

    public void copydefault(final C31909mIk c31909mIk, final java.lang.String str) {
        if (c31909mIk.valueOf()) {
            c31909mIk.requestLayout();
        }
        this.EZpvd.values().remove(c31909mIk);
        this.EZpvd.put(str, c31909mIk);
        c31909mIk.KWHzl();
        c31909mIk.setDragStateChangeListener(new C31909mIk.Application() { // from class: o.mIn.5
            @Override // o.C31909mIk.Application
            public void copydefault(int i) {
                C31912mIn.this.copydefault.put(str, java.lang.Integer.valueOf(i));
                if (C31912mIn.this.KWHzl) {
                    C31912mIn.this.AEQbTJ(str, c31909mIk);
                }
            }
        });
        if (!this.copydefault.containsKey(str)) {
            this.copydefault.put(str, 0);
            c31909mIk.OLrzqt(false);
        } else {
            int iIntValue = this.copydefault.get(str).intValue();
            if (iIntValue == 0 || iIntValue == 1 || iIntValue == 4) {
                c31909mIk.OLrzqt(false);
            } else {
                c31909mIk.EZpvd(false);
            }
        }
        c31909mIk.setLockDrag(this.AEQbTJ.contains(str));
    }

    public final void AEQbTJ(java.lang.String str, C31909mIk c31909mIk) {
        synchronized (this.OLrzqt) {
            if (copydefault() > 1) {
                for (Map.Entry<java.lang.String, java.lang.Integer> entry : this.copydefault.entrySet()) {
                    if (!entry.getKey().equals(str)) {
                        entry.setValue(0);
                    }
                }
                for (C31909mIk c31909mIk2 : this.EZpvd.values()) {
                    if (c31909mIk2 != c31909mIk) {
                        c31909mIk2.OLrzqt(true);
                    }
                }
            }
        }
    }

    public final int copydefault() {
        java.util.Iterator<java.lang.Integer> it = this.copydefault.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                i++;
            }
        }
        return i;
    }
}
