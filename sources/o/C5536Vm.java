package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: o.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5536Vm {
    public final AtomicReferenceArray<char[]> AEQbTJ;
    public final AtomicReferenceArray<byte[]> EZpvd;
    public static final int[] copydefault = {8000, 8000, 2000, 2000};
    public static final int[] OLrzqt = {4000, 4000, 200, 200};

    public C5536Vm() {
        this(4, 4);
    }

    public C5536Vm(int i, int i2) {
        this.EZpvd = new AtomicReferenceArray<>(i);
        this.AEQbTJ = new AtomicReferenceArray<>(i2);
    }

    public final byte[] AEQbTJ(int i) {
        return AEQbTJ(i, 0);
    }

    public byte[] AEQbTJ(int i, int i2) {
        int iCopydefault = copydefault(i);
        if (i2 < iCopydefault) {
            i2 = iCopydefault;
        }
        byte[] andSet = this.EZpvd.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? EZpvd(i2) : andSet;
    }

    public void EZpvd(int i, byte[] bArr) {
        this.EZpvd.set(i, bArr);
    }

    public final char[] KWHzl(int i) {
        return copydefault(i, 0);
    }

    public char[] copydefault(int i, int i2) {
        int iGEmmrt = gEmmrt(i);
        if (i2 < iGEmmrt) {
            i2 = iGEmmrt;
        }
        char[] andSet = this.AEQbTJ.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? OLrzqt(i2) : andSet;
    }

    public void KWHzl(int i, char[] cArr) {
        this.AEQbTJ.set(i, cArr);
    }

    public int copydefault(int i) {
        return copydefault[i];
    }

    public int gEmmrt(int i) {
        return OLrzqt[i];
    }

    public byte[] EZpvd(int i) {
        return new byte[i];
    }

    public char[] OLrzqt(int i) {
        return new char[i];
    }
}
