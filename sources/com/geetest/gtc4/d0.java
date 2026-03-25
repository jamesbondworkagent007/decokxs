package com.geetest.gtc4;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d0 extends w implements i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f434a;
    public final int b;
    public final int c;
    public final f d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0(boolean z, int i, f fVar) {
        this(z ? 1 : 2, 128, i, fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (!(wVar instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) wVar;
        if (this.c != d0Var.c || this.b != d0Var.b) {
            return false;
        }
        if (this.f434a != d0Var.f434a && i() != d0Var.i()) {
            return false;
        }
        w wVarD = this.d.d();
        w wVarD2 = d0Var.d.d();
        if (wVarD == wVarD2) {
            return true;
        }
        if (i()) {
            return wVarD.a(wVarD2);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a(new u(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            d0Var.a(new u(byteArrayOutputStream2), true);
            return Arrays.equals(byteArray, byteArrayOutputStream2.toByteArray());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.i5
    public final w b() {
        return this;
    }

    public abstract z c(w wVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w g() {
        return new p2(this.f434a, this.b, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w h() {
        return new d3(this.f434a, this.b, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean i() {
        int i = this.f434a;
        return i == 1 || i == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return g0.a(this.b, this.c) + this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public d0(int i, int i2, int i3, f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException("invalid tag class: " + i2);
        }
        this.f434a = i;
        this.b = i2;
        this.c = i3;
        this.d = fVar;
    }

    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        int i = this.b;
        return (((i * 7919) ^ this.c) ^ (i() ? 15 : PsExtractor.VIDEO_STREAM_MASK)) ^ this.d.d().hashCode();
    }
}
