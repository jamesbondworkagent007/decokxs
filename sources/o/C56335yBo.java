package o;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.yBo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56335yBo extends CountDownLatch implements InterfaceC58227yxM<java.lang.Throwable>, InterfaceC58222yxH {
    public java.lang.Throwable AEQbTJ;

    public C56335yBo() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
    @Override // o.InterfaceC58227yxM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void accept(java.lang.Throwable th) {
        this.AEQbTJ = th;
        countDown();
    }

    @Override // o.InterfaceC58222yxH
    public void run() {
        countDown();
    }
}
