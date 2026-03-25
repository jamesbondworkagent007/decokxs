package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f516a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(ByteArrayOutputStream byteArrayOutputStream) {
        this.f516a = byteArrayOutputStream;
    }

    public static int a(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k2 a() {
        return new k2(this.f516a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y2 b() {
        return new y2(this.f516a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void a(int i, int i2) throws IOException {
        if (i2 < 31) {
            this.f516a.write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        this.f516a.write(bArr, i4, 6 - i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void b(int i) throws IOException {
        if (i < 128) {
            this.f516a.write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                this.f516a.write(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public final void a(boolean z, int i) throws IOException {
        if (z) {
            this.f516a.write(i);
        }
    }

    public void a(f[] fVarArr) {
        for (f fVar : fVarArr) {
            fVar.d().a(this, true);
        }
    }

    public final void a(boolean z, int i, byte[] bArr) throws IOException {
        a(z, i);
        b(bArr.length);
        this.f516a.write(bArr, 0, bArr.length);
    }

    public final void a(boolean z, int i, f[] fVarArr) throws IOException {
        a(z, i);
        this.f516a.write(128);
        a(fVarArr);
        this.f516a.write(0);
        this.f516a.write(0);
    }

    public void a(w[] wVarArr) {
        for (w wVar : wVarArr) {
            wVar.a(this, true);
        }
    }
}
