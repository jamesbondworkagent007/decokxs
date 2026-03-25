package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends w {
    public static final h[] b = new h[12];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f454a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(byte[] bArr, boolean z) {
        if (n.a(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        int i = 0;
        if ((bArr[0] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.f454a = z ? o0.a(bArr) : bArr;
        int length = bArr.length;
        while (i < length - 1) {
            byte b2 = bArr[i];
            i++;
            if (b2 != (bArr[i] >> 7)) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f454a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f454a);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 10, this.f454a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof h) {
            return Arrays.equals(this.f454a, ((h) wVar).f454a);
        }
        return false;
    }

    public static h a(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new h(bArr, z);
        }
        if (bArr.length != 0) {
            int i = bArr[0] & UnsignedBytes.MAX_VALUE;
            h[] hVarArr = b;
            if (i >= 12) {
                return new h(bArr, z);
            }
            h hVar = hVarArr[i];
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h(bArr, z);
            hVarArr[i] = hVar2;
            return hVar2;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }
}
