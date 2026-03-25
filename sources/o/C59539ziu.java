package o;

/* JADX INFO: renamed from: o.ziu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59539ziu<T> implements InterfaceC59537zis<T>, InterfaceC59538zit<T> {
    public final C59534zip AEQbTJ;
    public final java.lang.Class<? extends T> EZpvd;
    public AbstractC59533zio<T, ?>[] copydefault;

    public C59539ziu(@androidx.annotation.NonNull C59534zip c59534zip, @androidx.annotation.NonNull java.lang.Class<? extends T> cls) {
        this.EZpvd = cls;
        this.AEQbTJ = c59534zip;
    }

    @Override // o.InterfaceC59537zis
    @java.lang.SafeVarargs
    public final InterfaceC59538zit<T> copydefault(@androidx.annotation.NonNull AbstractC59533zio<T, ?>... abstractC59533zioArr) {
        C59536zir.OLrzqt(abstractC59533zioArr);
        this.copydefault = abstractC59533zioArr;
        return this;
    }

    @Override // o.InterfaceC59538zit
    public void AEQbTJ(@androidx.annotation.NonNull InterfaceC59531zim<T> interfaceC59531zim) {
        C59536zir.OLrzqt(interfaceC59531zim);
        EZpvd(interfaceC59531zim);
    }

    @Override // o.InterfaceC59538zit
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC59526zih<T> interfaceC59526zih) {
        C59536zir.OLrzqt(interfaceC59526zih);
        EZpvd(C59527zii.copydefault(interfaceC59526zih, this.copydefault));
    }

    public final void EZpvd(@androidx.annotation.NonNull InterfaceC59531zim<T> interfaceC59531zim) {
        for (AbstractC59533zio<T, ?> abstractC59533zio : this.copydefault) {
            this.AEQbTJ.register(this.EZpvd, abstractC59533zio, interfaceC59531zim);
        }
    }
}
