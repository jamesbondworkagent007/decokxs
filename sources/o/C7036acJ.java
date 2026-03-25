package o;

import com.google.common.primitives.UnsignedBytes;
import o.C7024abY;
import o.C7035acI;

/* JADX INFO: renamed from: o.acJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7036acJ implements C7024abY.ActionBar {
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public java.nio.ByteBuffer copydefault;

    @Override // o.C7024abY.ActionBar
    public boolean AEQbTJ(byte[] bArr) {
        return bArr[0] == 1;
    }

    public C7036acJ(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7024abY.OLrzqt(byteBuffer, 1970168173, this);
        this.copydefault = byteBuffer;
    }

    public void KWHzl(C7035acI c7035acI) throws java.io.IOException {
        this.OLrzqt = this.copydefault.getInt();
        this.EZpvd = this.copydefault.getInt();
        this.AEQbTJ = this.copydefault.getInt();
        this.KWHzl = this.copydefault.getInt();
        char[] cArrOLrzqt = C7024abY.OLrzqt(this.copydefault, this.copydefault.getChar(), 0);
        byte[] bArr = new byte[this.EZpvd - this.OLrzqt];
        this.copydefault.get(bArr);
        c7035acI.OLrzqt(cArrOLrzqt, bArr);
        char c = this.copydefault.getChar();
        c7035acI.AEQbTJ(c, 3);
        char[] cArrOLrzqt2 = C7024abY.OLrzqt(this.copydefault, c * 3, 0);
        byte[] bArr2 = new byte[this.KWHzl - this.AEQbTJ];
        this.copydefault.get(bArr2);
        c7035acI.EZpvd(cArrOLrzqt2, bArr2);
        int i = this.copydefault.getInt();
        C7035acI.Application[] applicationArr = new C7035acI.Application[i];
        for (int i2 = 0; i2 < i; i2++) {
            C7035acI.Application applicationOLrzqt = OLrzqt();
            if (applicationOLrzqt == null) {
                throw new java.io.IOException("unames.icu read error: Algorithmic names creation error");
            }
            applicationArr[i2] = applicationOLrzqt;
        }
        c7035acI.KWHzl(applicationArr);
    }

    public final C7035acI.Application OLrzqt() throws java.io.IOException {
        C7035acI.Application application = new C7035acI.Application();
        int i = this.copydefault.getInt();
        int i2 = this.copydefault.getInt();
        byte b = this.copydefault.get();
        byte b2 = this.copydefault.get();
        if (!application.OLrzqt(i, i2, b, b2)) {
            return null;
        }
        int i3 = this.copydefault.getChar();
        if (b == 1) {
            application.copydefault(C7024abY.OLrzqt(this.copydefault, b2, 0));
            i3 -= b2 << 1;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        byte b3 = this.copydefault.get();
        while (true) {
            char c = (char) (b3 & UnsignedBytes.MAX_VALUE);
            if (c == 0) {
                break;
            }
            sb.append(c);
            b3 = this.copydefault.get();
        }
        application.copydefault(sb.toString());
        int length = i3 - (sb.length() + 13);
        if (length > 0) {
            byte[] bArr = new byte[length];
            this.copydefault.get(bArr);
            application.OLrzqt(bArr);
        }
        return application;
    }
}
