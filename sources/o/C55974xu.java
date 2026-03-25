package o;

/* JADX INFO: renamed from: o.xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55974xu {
    public static final java.lang.String copydefault(C5173Hn c5173Hn) {
        byte[] bArr = new byte[15];
        byte[] newProxyInstance = C59449zhJ.getNewProxyInstance(":date");
        bArr[0] = (byte) newProxyInstance.length;
        yDT.copyInto$default(newProxyInstance, bArr, 1, 0, 0, 12, (java.lang.Object) null);
        int length = newProxyInstance.length;
        bArr[length + 1] = 8;
        KWHzl(bArr, length + 2, C5172Hm.AEQbTJ(c5173Hn));
        return C5165Hf.AEQbTJ(C58401zB.AEQbTJ(bArr));
    }

    public static final void KWHzl(byte[] bArr, int i, long j) {
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) ((j >>> (i2 * 8)) & 255);
            i2--;
            i++;
        }
    }
}
