package o;

/* JADX INFO: renamed from: o.zin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59532zin implements InterfaceC59540ziv {
    public final java.util.List<AbstractC59533zio<?, ?>> AEQbTJ;
    public final java.util.List<InterfaceC59531zim<?>> EZpvd;
    public final java.util.List<java.lang.Class<?>> copydefault;

    public C59532zin() {
        this.copydefault = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.EZpvd = new java.util.ArrayList();
    }

    public C59532zin(int i) {
        this.copydefault = new java.util.ArrayList(i);
        this.AEQbTJ = new java.util.ArrayList(i);
        this.EZpvd = new java.util.ArrayList(i);
    }

    @Override // o.InterfaceC59540ziv
    public <T> void KWHzl(@androidx.annotation.NonNull java.lang.Class<? extends T> cls, @androidx.annotation.NonNull AbstractC59533zio<T, ?> abstractC59533zio, @androidx.annotation.NonNull InterfaceC59531zim<T> interfaceC59531zim) {
        C59536zir.OLrzqt(cls);
        C59536zir.OLrzqt(abstractC59533zio);
        C59536zir.OLrzqt(interfaceC59531zim);
        this.copydefault.add(cls);
        this.AEQbTJ.add(abstractC59533zio);
        this.EZpvd.add(interfaceC59531zim);
    }

    @Override // o.InterfaceC59540ziv
    public boolean AEQbTJ(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        C59536zir.OLrzqt(cls);
        boolean z = false;
        while (true) {
            int iIndexOf = this.copydefault.indexOf(cls);
            if (iIndexOf == -1) {
                return z;
            }
            this.copydefault.remove(iIndexOf);
            this.AEQbTJ.remove(iIndexOf).uninstallAdapter();
            this.EZpvd.remove(iIndexOf);
            z = true;
        }
    }

    @Override // o.InterfaceC59540ziv
    public boolean AEQbTJ() {
        boolean z = false;
        if (EZpvd() == 0) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < this.copydefault.size(); i++) {
            hashSet.add(this.copydefault.get(i));
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (AEQbTJ((java.lang.Class) it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.InterfaceC59540ziv
    public int EZpvd() {
        return this.copydefault.size();
    }

    @Override // o.InterfaceC59540ziv
    public int KWHzl(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        C59536zir.OLrzqt(cls);
        int iIndexOf = this.copydefault.indexOf(cls);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        for (int i = 0; i < this.copydefault.size(); i++) {
            if (this.copydefault.get(i).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC59540ziv
    public java.lang.Class<?> KWHzl(int i) {
        return this.copydefault.get(i);
    }

    @Override // o.InterfaceC59540ziv
    public AbstractC59533zio<?, ?> copydefault(int i) {
        return this.AEQbTJ.get(i);
    }

    @Override // o.InterfaceC59540ziv
    public InterfaceC59531zim<?> EZpvd(int i) {
        return this.EZpvd.get(i);
    }
}
