package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class k extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f469a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f469a = bArr;
        if (!a(0) || !a(1) || !a(2) || !a(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i) {
        byte b;
        byte[] bArr = this.f469a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w g() {
        return new d2(this.f469a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f469a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public int a(boolean z) {
        int length = this.f469a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 24, this.f469a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof k) {
            return Arrays.equals(this.f469a, ((k) wVar).f469a);
        }
        return false;
    }
}
