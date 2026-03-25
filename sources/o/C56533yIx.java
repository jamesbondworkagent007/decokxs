package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.yIx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56533yIx {
    public final java.util.ArrayList<java.lang.Object> AEQbTJ;

    public C56533yIx(int i) {
        this.AEQbTJ = new java.util.ArrayList<>(i);
    }

    public void EZpvd(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length > 0) {
                java.util.ArrayList<java.lang.Object> arrayList = this.AEQbTJ;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.AEQbTJ, objArr);
                return;
            }
            return;
        }
        if (obj instanceof java.util.Collection) {
            this.AEQbTJ.addAll((java.util.Collection) obj);
            return;
        }
        if (obj instanceof java.lang.Iterable) {
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                this.AEQbTJ.add(it.next());
            }
            return;
        }
        if (obj instanceof java.util.Iterator) {
            java.util.Iterator it2 = (java.util.Iterator) obj;
            while (it2.hasNext()) {
                this.AEQbTJ.add(it2.next());
            }
        } else {
            throw new java.lang.UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int KWHzl() {
        return this.AEQbTJ.size();
    }

    public void copydefault(java.lang.Object obj) {
        this.AEQbTJ.add(obj);
    }

    public java.lang.Object[] copydefault(java.lang.Object[] objArr) {
        return this.AEQbTJ.toArray(objArr);
    }
}
