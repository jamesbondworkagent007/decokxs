package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.yxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58237yxW implements InterfaceC58217yxC, InterfaceC58238yxX {
    public volatile boolean KWHzl;
    public java.util.List<InterfaceC58217yxC> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        if (this.KWHzl) {
            return;
        }
        synchronized (this) {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            java.util.List<InterfaceC58217yxC> list = this.OLrzqt;
            this.OLrzqt = null;
            AEQbTJ(list);
        }
    }

    @Override // o.InterfaceC58238yxX
    public boolean AEQbTJ(InterfaceC58217yxC interfaceC58217yxC) {
        C58297yyd.AEQbTJ(interfaceC58217yxC, "d is null");
        if (!this.KWHzl) {
            synchronized (this) {
                if (!this.KWHzl) {
                    java.util.List linkedList = this.OLrzqt;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.OLrzqt = linkedList;
                    }
                    linkedList.add(interfaceC58217yxC);
                    return true;
                }
            }
        }
        interfaceC58217yxC.dispose();
        return false;
    }

    @Override // o.InterfaceC58238yxX
    public boolean EZpvd(InterfaceC58217yxC interfaceC58217yxC) {
        if (!OLrzqt(interfaceC58217yxC)) {
            return false;
        }
        interfaceC58217yxC.dispose();
        return true;
    }

    @Override // o.InterfaceC58238yxX
    public boolean OLrzqt(InterfaceC58217yxC interfaceC58217yxC) {
        C58297yyd.AEQbTJ(interfaceC58217yxC, "Disposable item is null");
        if (this.KWHzl) {
            return false;
        }
        synchronized (this) {
            if (this.KWHzl) {
                return false;
            }
            java.util.List<InterfaceC58217yxC> list = this.OLrzqt;
            if (list != null && list.remove(interfaceC58217yxC)) {
                return true;
            }
            return false;
        }
    }

    public void AEQbTJ(java.util.List<InterfaceC58217yxC> list) {
        if (list == null) {
            return;
        }
        java.util.Iterator<InterfaceC58217yxC> it = list.iterator();
        java.util.ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw ExceptionHelper.AEQbTJ((java.lang.Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }
}
