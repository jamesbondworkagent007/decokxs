package o;

/* JADX INFO: renamed from: o.ahS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7310ahS implements InterfaceC7292ahA {
    @Override // o.InterfaceC7292ahA
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.KWHzl(str, str2);
        } else {
            pUU.KWHzl(str, java.lang.String.format(str2, objArr));
        }
    }

    @Override // o.InterfaceC7292ahA
    public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.EZpvd(str, str2);
        } else {
            pUU.EZpvd(str, java.lang.String.format(str2, objArr));
        }
    }

    @Override // o.InterfaceC7292ahA
    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.valueOf(str, str2);
        } else {
            pUU.valueOf(str, java.lang.String.format(str2, objArr));
        }
    }

    @Override // o.InterfaceC7292ahA
    public void OLrzqt(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.OLrzqt(str, str2, th);
        } else {
            pUU.OLrzqt(str, java.lang.String.format(str2, objArr), th);
        }
    }

    @Override // o.InterfaceC7292ahA
    public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.copydefault(str, str2);
        } else {
            AEQbTJ(str, null, str2, objArr);
        }
    }

    @Override // o.InterfaceC7292ahA
    public void AEQbTJ(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            pUU.AEQbTJ(str, str2, th);
        } else {
            pUU.AEQbTJ(str, java.lang.String.format(str2, objArr), th);
        }
    }
}
