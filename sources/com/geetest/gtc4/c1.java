package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class c1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f429a;
    public t1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c1(c0 c0Var) {
        this.f429a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.c
    public final InputStream a() {
        t1 t1Var = new t1(this.f429a);
        this.b = t1Var;
        return t1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.i5
    public final w b() throws IOException {
        t1 t1Var = new t1(this.f429a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = t1Var.read(bArr, 0, 4096);
            if (i < 0) {
                return new b1(byteArrayOutputStream.toByteArray(), t1Var.c);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            t1 t1Var = new t1(this.f429a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = t1Var.read(bArr, 0, 4096);
                if (i < 0) {
                    return new b1(byteArrayOutputStream.toByteArray(), t1Var.c);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            throw new v("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.c
    public final int e() {
        return this.b.c;
    }
}
