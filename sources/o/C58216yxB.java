package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: renamed from: o.yxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58216yxB implements InterfaceC58217yxC, InterfaceC58238yxX {
    public volatile boolean AEQbTJ;
    public C56341yBu<InterfaceC58217yxC> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        if (this.AEQbTJ) {
            return;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
            this.KWHzl = null;
            copydefault(c56341yBu);
        }
    }

    @Override // o.InterfaceC58238yxX
    public boolean AEQbTJ(InterfaceC58217yxC interfaceC58217yxC) {
        C58297yyd.AEQbTJ(interfaceC58217yxC, "disposable is null");
        if (!this.AEQbTJ) {
            synchronized (this) {
                if (!this.AEQbTJ) {
                    C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
                    if (c56341yBu == null) {
                        c56341yBu = new C56341yBu<>();
                        this.KWHzl = c56341yBu;
                    }
                    c56341yBu.EZpvd(interfaceC58217yxC);
                    return true;
                }
            }
        }
        interfaceC58217yxC.dispose();
        return false;
    }

    public boolean OLrzqt(InterfaceC58217yxC... interfaceC58217yxCArr) {
        C58297yyd.AEQbTJ(interfaceC58217yxCArr, "disposables is null");
        if (!this.AEQbTJ) {
            synchronized (this) {
                if (!this.AEQbTJ) {
                    C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
                    if (c56341yBu == null) {
                        c56341yBu = new C56341yBu<>(interfaceC58217yxCArr.length + 1);
                        this.KWHzl = c56341yBu;
                    }
                    for (InterfaceC58217yxC interfaceC58217yxC : interfaceC58217yxCArr) {
                        C58297yyd.AEQbTJ(interfaceC58217yxC, "A Disposable in the disposables array is null");
                        c56341yBu.EZpvd(interfaceC58217yxC);
                    }
                    return true;
                }
            }
        }
        for (InterfaceC58217yxC interfaceC58217yxC2 : interfaceC58217yxCArr) {
            interfaceC58217yxC2.dispose();
        }
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
        C58297yyd.AEQbTJ(interfaceC58217yxC, "disposables is null");
        if (this.AEQbTJ) {
            return false;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return false;
            }
            C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
            if (c56341yBu != null && c56341yBu.copydefault(interfaceC58217yxC)) {
                return true;
            }
            return false;
        }
    }

    public void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return;
            }
            C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
            this.KWHzl = null;
            copydefault(c56341yBu);
        }
    }

    public int KWHzl() {
        if (this.AEQbTJ) {
            return 0;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return 0;
            }
            C56341yBu<InterfaceC58217yxC> c56341yBu = this.KWHzl;
            return c56341yBu != null ? c56341yBu.OLrzqt() : 0;
        }
    }

    public void copydefault(C56341yBu<InterfaceC58217yxC> c56341yBu) {
        if (c56341yBu == null) {
            return;
        }
        java.util.ArrayList arrayList = null;
        for (java.lang.Object obj : c56341yBu.copydefault()) {
            if (obj instanceof InterfaceC58217yxC) {
                try {
                    ((InterfaceC58217yxC) obj).dispose();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th);
                }
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
