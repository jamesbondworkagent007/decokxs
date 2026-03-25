package o;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: renamed from: o.yBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56338yBr<T> {
    public java.lang.Object[] AEQbTJ;
    public int EZpvd;
    public final int KWHzl;
    public final java.lang.Object[] OLrzqt;

    /* JADX INFO: renamed from: o.yBr$Application */
    public interface Application<T> extends InterfaceC58239yxY<T> {
        @Override // o.InterfaceC58239yxY
        boolean test(T t);
    }

    public C56338yBr(int i) {
        this.KWHzl = i;
        java.lang.Object[] objArr = new java.lang.Object[i + 1];
        this.OLrzqt = objArr;
        this.AEQbTJ = objArr;
    }

    public void copydefault(T t) {
        int i = this.KWHzl;
        int i2 = this.EZpvd;
        if (i2 == i) {
            java.lang.Object[] objArr = new java.lang.Object[i + 1];
            this.AEQbTJ[i] = objArr;
            this.AEQbTJ = objArr;
            i2 = 0;
        }
        this.AEQbTJ[i2] = t;
        this.EZpvd = i2 + 1;
    }

    public void KWHzl(T t) {
        this.OLrzqt[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(Application<? super T> application) {
        int i = this.KWHzl;
        for (java.lang.Object[] objArr = this.OLrzqt; objArr != null; objArr = (java.lang.Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (application.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean EZpvd(InterfaceC60097zve<? super U> interfaceC60097zve) {
        java.lang.Object[] objArr = this.OLrzqt;
        int i = this.KWHzl;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, interfaceC60097zve)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean OLrzqt(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        java.lang.Object[] objArr = this.OLrzqt;
        int i = this.KWHzl;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, interfaceC58256yxp)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }
}
