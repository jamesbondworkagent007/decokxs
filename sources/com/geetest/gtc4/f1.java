package com.geetest.gtc4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class f1 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f444a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f1(c0 c0Var) {
        this.f444a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.t
    public final InputStream c() {
        return new u1(this.f444a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.i5
    public final w b() throws IOException {
        u1 u1Var = new u1(this.f444a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = u1Var.read(bArr, 0, 4096);
            if (i < 0) {
                return new e1(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            u1 u1Var = new u1(this.f444a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = u1Var.read(bArr, 0, 4096);
                if (i < 0) {
                    return new e1(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            throw new v("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
