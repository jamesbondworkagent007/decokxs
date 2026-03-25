package o;

import com.okinc.business.market.features.meme.aped_together.domain.model.KolType;
import com.okinc.business.market.features.tag.domain.TagMeta;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28653keo {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final KolType AhwBna;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final TagMeta gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28653keo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28653keo AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull KolType kolType, TagMeta tagMeta, @NotNull java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(kolType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new C28653keo(str, str2, str3, str4, str5, str6, str7, kolType, tagMeta, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28653keo)) {
            return false;
        }
        C28653keo c28653keo = (C28653keo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28653keo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c28653keo.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c28653keo.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28653keo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c28653keo.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c28653keo.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c28653keo.AYXKKw) && this.AhwBna == c28653keo.AhwBna && Intrinsics.EZpvd(this.gEmmrt, c28653keo.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28653keo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28653keo.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagMeta gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.DbNXlk.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = this.AYXKKw.hashCode();
        int iHashCode8 = this.AhwBna.hashCode();
        TagMeta tagMeta = this.gEmmrt;
        int iHashCode9 = tagMeta == null ? 0 : tagMeta.hashCode();
        int iHashCode10 = this.AEQbTJ.hashCode();
        java.lang.String str = this.copydefault;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApedTogetherUiModel(kolAvatarUrl=" + this.KWHzl + ", walletAddress=" + this.DbNXlk + ", kolName=" + this.djBIcL + ", holdingAmt=" + this.EZpvd + ", holdingChangeRate=" + this.OLrzqt + ", totalPnlAmt=" + this.valueOf + ", totalPnlChangeRate=" + this.AYXKKw + ", kolType=" + this.AhwBna + ", tag=" + this.gEmmrt + ", emoji=" + this.AEQbTJ + ", addressDisplayColorHex=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C28653keo(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull KolType kolType, TagMeta tagMeta, @NotNull java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(kolType, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.KWHzl = str;
        this.DbNXlk = str2;
        this.djBIcL = str3;
        this.EZpvd = str4;
        this.OLrzqt = str5;
        this.valueOf = str6;
        this.AYXKKw = str7;
        this.AhwBna = kolType;
        this.gEmmrt = tagMeta;
        this.AEQbTJ = str8;
        this.copydefault = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.aped_together.domain.model.KolType:?: TERNARY null = ((wrap:int:0x003a: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: SGET  A[WRAPPED] (LINE:19) com.okinc.business.market.features.meme.aped_together.domain.model.KolType.INFLUENCER com.okinc.business.market.features.meme.aped_together.domain.model.KolType) : (r21v0 com.okinc.business.market.features.meme.aped_together.domain.model.KolType))
  (wrap:com.okinc.business.market.features.tag.domain.TagMeta:?: TERNARY null = ((wrap:int:0x0043: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.domain.TagMeta) : (r22v0 com.okinc.business.market.features.tag.domain.TagMeta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r25v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.aped_together.domain.model.KolType, com.okinc.business.market.features.tag.domain.TagMeta, java.lang.String, java.lang.String):void (m)] (LINE:11) call: o.keo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.aped_together.domain.model.KolType, com.okinc.business.market.features.tag.domain.TagMeta, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C28653keo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, KolType kolType, TagMeta tagMeta, java.lang.String str8, java.lang.String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? KolType.INFLUENCER : kolType, (i & 256) != 0 ? null : tagMeta, (i & 512) == 0 ? str8 : "", (i & 1024) == 0 ? str9 : null);
    }
}
