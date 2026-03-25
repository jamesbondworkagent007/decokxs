package o;

import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.znZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59783znZ implements InterfaceC59837zoa, java.lang.Cloneable {
    public final java.util.List<InterfaceC59580zji> KWHzl = new java.util.ArrayList();
    public final java.util.List<InterfaceC59585zjn> copydefault = new java.util.ArrayList();

    public void AEQbTJ(InterfaceC59580zji interfaceC59580zji) {
        if (interfaceC59580zji == null) {
            return;
        }
        this.KWHzl.add(interfaceC59580zji);
    }

    public void EZpvd(InterfaceC59580zji interfaceC59580zji, int i) {
        if (interfaceC59580zji == null) {
            return;
        }
        this.KWHzl.add(i, interfaceC59580zji);
    }

    public void KWHzl(InterfaceC59585zjn interfaceC59585zjn, int i) {
        if (interfaceC59585zjn == null) {
            return;
        }
        this.copydefault.add(i, interfaceC59585zjn);
    }

    public void copydefault(java.lang.Class<? extends InterfaceC59580zji> cls) {
        java.util.Iterator<InterfaceC59580zji> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    public void KWHzl(java.lang.Class<? extends InterfaceC59585zjn> cls) {
        java.util.Iterator<InterfaceC59585zjn> it = this.copydefault.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    public final void copydefault(InterfaceC59580zji interfaceC59580zji) {
        AEQbTJ(interfaceC59580zji);
    }

    public final void copydefault(InterfaceC59580zji interfaceC59580zji, int i) {
        EZpvd(interfaceC59580zji, i);
    }

    public int EZpvd() {
        return this.KWHzl.size();
    }

    public InterfaceC59580zji KWHzl(int i) {
        if (i < 0 || i >= this.KWHzl.size()) {
            return null;
        }
        return this.KWHzl.get(i);
    }

    public void copydefault() {
        this.KWHzl.clear();
    }

    public void EZpvd(InterfaceC59585zjn interfaceC59585zjn) {
        if (interfaceC59585zjn == null) {
            return;
        }
        this.copydefault.add(interfaceC59585zjn);
    }

    public final void AEQbTJ(InterfaceC59585zjn interfaceC59585zjn) {
        EZpvd(interfaceC59585zjn);
    }

    public final void AEQbTJ(InterfaceC59585zjn interfaceC59585zjn, int i) {
        KWHzl(interfaceC59585zjn, i);
    }

    public int OLrzqt() {
        return this.copydefault.size();
    }

    public InterfaceC59585zjn OLrzqt(int i) {
        if (i < 0 || i >= this.copydefault.size()) {
            return null;
        }
        return this.copydefault.get(i);
    }

    public void KWHzl() {
        this.copydefault.clear();
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        java.util.Iterator<InterfaceC59580zji> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            it.next().process(interfaceC59577zjf, interfaceC59838zob);
        }
    }

    @Override // o.InterfaceC59585zjn
    public void process(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, java.io.IOException {
        java.util.Iterator<InterfaceC59585zjn> it = this.copydefault.iterator();
        while (it.hasNext()) {
            it.next().process(interfaceC59584zjm, interfaceC59838zob);
        }
    }

    public void KWHzl(C59783znZ c59783znZ) {
        c59783znZ.KWHzl.clear();
        c59783znZ.KWHzl.addAll(this.KWHzl);
        c59783znZ.copydefault.clear();
        c59783znZ.copydefault.addAll(this.copydefault);
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        C59783znZ c59783znZ = (C59783znZ) super.clone();
        KWHzl(c59783znZ);
        return c59783znZ;
    }
}
