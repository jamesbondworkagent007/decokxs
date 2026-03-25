package o;

/* JADX INFO: renamed from: o.zii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59527zii<T> implements InterfaceC59531zim<T> {
    public final AbstractC59533zio<T, ?>[] EZpvd;
    public final InterfaceC59526zih<T> OLrzqt;

    public C59527zii(@androidx.annotation.NonNull InterfaceC59526zih<T> interfaceC59526zih, @androidx.annotation.NonNull AbstractC59533zio<T, ?>[] abstractC59533zioArr) {
        this.OLrzqt = interfaceC59526zih;
        this.EZpvd = abstractC59533zioArr;
    }

    public static <T> C59527zii<T> copydefault(@androidx.annotation.NonNull InterfaceC59526zih<T> interfaceC59526zih, @androidx.annotation.NonNull AbstractC59533zio<T, ?>[] abstractC59533zioArr) {
        return new C59527zii<>(interfaceC59526zih, abstractC59533zioArr);
    }

    @Override // o.InterfaceC59531zim
    public int OLrzqt(int i, @androidx.annotation.NonNull T t) {
        java.lang.Class<? extends AbstractC59533zio<T, ?>> clsEZpvd = this.OLrzqt.EZpvd(i, t);
        int i2 = 0;
        while (true) {
            AbstractC59533zio<T, ?>[] abstractC59533zioArr = this.EZpvd;
            if (i2 < abstractC59533zioArr.length) {
                if (abstractC59533zioArr[i2].getClass().equals(clsEZpvd)) {
                    return i2;
                }
                i2++;
            } else {
                throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("%s is out of your registered binders'(%s) bounds.", clsEZpvd.getName(), java.util.Arrays.toString(this.EZpvd)));
            }
        }
    }
}
