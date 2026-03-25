package o;

import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5358Oq implements NH {
    public final java.lang.Class<?> AYXKKw;
    public final java.util.Map<java.lang.Class<?>, NN<?>> AhwBna;
    public final int EZpvd;
    public final java.lang.Object KWHzl;
    public final NM OLrzqt;
    public int copydefault;
    public final java.lang.Class<?> djBIcL;
    public final NH gEmmrt;
    public final int valueOf;

    public C5358Oq(java.lang.Object obj, NH nh, int i, int i2, java.util.Map<java.lang.Class<?>, NN<?>> map, java.lang.Class<?> cls, java.lang.Class<?> cls2, NM nm) {
        this.KWHzl = SE.OLrzqt(obj);
        this.gEmmrt = (NH) SE.copydefault(nh, "Signature must not be null");
        this.valueOf = i;
        this.EZpvd = i2;
        this.AhwBna = (java.util.Map) SE.OLrzqt(map);
        this.AYXKKw = (java.lang.Class) SE.copydefault(cls, "Resource class must not be null");
        this.djBIcL = (java.lang.Class) SE.copydefault(cls2, "Transcode class must not be null");
        this.OLrzqt = (NM) SE.OLrzqt(nm);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5358Oq) {
            C5358Oq c5358Oq = (C5358Oq) obj;
            if (this.KWHzl.equals(c5358Oq.KWHzl) && this.gEmmrt.equals(c5358Oq.gEmmrt) && this.EZpvd == c5358Oq.EZpvd && this.valueOf == c5358Oq.valueOf && this.AhwBna.equals(c5358Oq.AhwBna) && this.AYXKKw.equals(c5358Oq.AYXKKw) && this.djBIcL.equals(c5358Oq.djBIcL) && this.OLrzqt.equals(c5358Oq.OLrzqt)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        if (this.copydefault == 0) {
            int iHashCode = this.KWHzl.hashCode();
            this.copydefault = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf) * 31) + this.EZpvd;
            this.copydefault = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.AhwBna.hashCode();
            this.copydefault = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.AYXKKw.hashCode();
            this.copydefault = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.djBIcL.hashCode();
            this.copydefault = iHashCode5;
            this.copydefault = (iHashCode5 * 31) + this.OLrzqt.hashCode();
        }
        return this.copydefault;
    }

    public java.lang.String toString() {
        return "EngineKey{model=" + this.KWHzl + ", width=" + this.valueOf + ", height=" + this.EZpvd + ", resourceClass=" + this.AYXKKw + ", transcodeClass=" + this.djBIcL + ", signature=" + this.gEmmrt + ", hashCode=" + this.copydefault + ", transformations=" + this.AhwBna + ", options=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        throw new java.lang.UnsupportedOperationException();
    }
}
