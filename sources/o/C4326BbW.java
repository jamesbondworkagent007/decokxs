package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.BbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4326BbW {
    public static final int $stable = 8;
    public byte[] AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public C56396yDv KWHzl;
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public java.lang.String copydefault;
    public short gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 short)
  (r2v0 java.util.Map)
  (r3v0 java.lang.String)
  (r4v0 byte[])
  (r5v0 java.lang.String)
  (r6v0 o.yDv)
  (r7v0 java.lang.String)
 A[MD:(short, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, byte[], java.lang.String, o.yDv, java.lang.String):void (m)] call: o.BbW.<init>(short, java.util.Map, java.lang.String, byte[], java.lang.String, o.yDv, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4326BbW(short s, java.util.Map map, java.lang.String str, byte[] bArr, java.lang.String str2, C56396yDv c56396yDv, java.lang.String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(s, map, str, bArr, str2, c56396yDv, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.BbW */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-_YpbsqE$default, reason: not valid java name */
    public static /* synthetic */ C4326BbW m8231copy_YpbsqE$default(C4326BbW c4326BbW, short s, java.util.Map map, java.lang.String str, byte[] bArr, java.lang.String str2, C56396yDv c56396yDv, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            s = c4326BbW.gEmmrt;
        }
        if ((i & 2) != 0) {
            map = c4326BbW.OLrzqt;
        }
        java.util.Map map2 = map;
        if ((i & 4) != 0) {
            str = c4326BbW.AYXKKw;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            bArr = c4326BbW.AEQbTJ;
        }
        byte[] bArr2 = bArr;
        if ((i & 16) != 0) {
            str2 = c4326BbW.EZpvd;
        }
        java.lang.String str5 = str2;
        if ((i & 32) != 0) {
            c56396yDv = c4326BbW.KWHzl;
        }
        C56396yDv c56396yDv2 = c56396yDv;
        if ((i & 64) != 0) {
            str3 = c4326BbW.copydefault;
        }
        return c4326BbW.EZpvd(s, map2, str4, bArr2, str5, c56396yDv2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4326BbW EZpvd(short s, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str, @NotNull byte[] bArr, java.lang.String str2, C56396yDv c56396yDv, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C4326BbW(s, map, str, bArr, str2, c56396yDv, str3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56396yDv KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final short djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4326BbW)) {
            return false;
        }
        C4326BbW c4326BbW = (C4326BbW) obj;
        return this.gEmmrt == c4326BbW.gEmmrt && Intrinsics.EZpvd(this.OLrzqt, c4326BbW.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c4326BbW.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c4326BbW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4326BbW.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c4326BbW.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c4326BbW.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iOLrzqt = yDB.OLrzqt(this.gEmmrt);
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = java.util.Arrays.hashCode(this.AEQbTJ);
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        C56396yDv c56396yDv = this.KWHzl;
        int iAEQbTJ = c56396yDv == null ? 0 : C56396yDv.AEQbTJ(c56396yDv.OLrzqt());
        java.lang.String str2 = this.copydefault;
        return (((((((((((iOLrzqt * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iAEQbTJ) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Response(status=" + yDB.KWHzl(this.gEmmrt) + ", headers=" + this.OLrzqt + ", url=" + this.AYXKKw + ", bytes=" + java.util.Arrays.toString(this.AEQbTJ) + ", contentType=" + this.EZpvd + ", contentLength=" + this.KWHzl + ", httpVersion=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C4326BbW(short s, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, byte[] bArr, java.lang.String str2, C56396yDv c56396yDv, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.gEmmrt = s;
        this.OLrzqt = map;
        this.AYXKKw = str;
        this.AEQbTJ = bArr;
        this.EZpvd = str2;
        this.KWHzl = c56396yDv;
        this.copydefault = str3;
    }
}
