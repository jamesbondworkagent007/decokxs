package o;

import android.graphics.Bitmap;
import o.InterfaceC5341Nz;

/* JADX INFO: loaded from: classes2.dex */
public final class QZ implements InterfaceC5341Nz.Application {
    public final OF KWHzl;
    public final OG copydefault;

    public QZ(OG og, @androidx.annotation.Nullable OF of) {
        this.copydefault = og;
        this.KWHzl = of;
    }

    @Override // o.InterfaceC5341Nz.Application
    public android.graphics.Bitmap EZpvd(int i, int i2, @androidx.annotation.NonNull Bitmap.Config config) {
        return this.copydefault.KWHzl(i, i2, config);
    }

    @Override // o.InterfaceC5341Nz.Application
    public void OLrzqt(@androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        this.copydefault.copydefault(bitmap);
    }

    @Override // o.InterfaceC5341Nz.Application
    public byte[] AEQbTJ(int i) {
        OF of = this.KWHzl;
        if (of == null) {
            return new byte[i];
        }
        return (byte[]) of.EZpvd(i, byte[].class);
    }

    @Override // o.InterfaceC5341Nz.Application
    public void copydefault(@androidx.annotation.NonNull byte[] bArr) {
        OF of = this.KWHzl;
        if (of == null) {
            return;
        }
        of.EZpvd(bArr);
    }

    @Override // o.InterfaceC5341Nz.Application
    public int[] OLrzqt(int i) {
        OF of = this.KWHzl;
        if (of == null) {
            return new int[i];
        }
        return (int[]) of.EZpvd(i, int[].class);
    }

    @Override // o.InterfaceC5341Nz.Application
    public void EZpvd(@androidx.annotation.NonNull int[] iArr) {
        OF of = this.KWHzl;
        if (of == null) {
            return;
        }
        of.EZpvd(iArr);
    }
}
