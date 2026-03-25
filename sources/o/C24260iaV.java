package o;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24260iaV {
    public final JsonObject AEQbTJ;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24260iaV() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24260iaV copy$default(C24260iaV c24260iaV, JsonObject jsonObject, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonObject = c24260iaV.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c24260iaV.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c24260iaV.OLrzqt;
        }
        return c24260iaV.EZpvd(jsonObject, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24260iaV EZpvd(JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C24260iaV(jsonObject, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24260iaV)) {
            return false;
        }
        C24260iaV c24260iaV = (C24260iaV) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c24260iaV.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c24260iaV.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c24260iaV.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JsonObject jsonObject = this.AEQbTJ;
        return ((((jsonObject == null ? 0 : jsonObject.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BridgeRedeemSignedData(walletTxData=" + this.AEQbTJ + ", transactionHash=" + this.copydefault + ", nonce=" + this.OLrzqt + ")";
    }

    public C24260iaV(JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = jsonObject;
        this.copydefault = str;
        this.OLrzqt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r2v0 com.google.gson.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(com.google.gson.JsonObject, java.lang.String, java.lang.String):void (m)] (LINE:176) call: o.iaV.<init>(com.google.gson.JsonObject, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C24260iaV(JsonObject jsonObject, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonObject, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
