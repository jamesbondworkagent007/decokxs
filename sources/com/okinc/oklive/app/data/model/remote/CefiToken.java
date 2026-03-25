package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CefiToken {
    public static final int $stable = 0;

    @SerializedName("instId")
    private final String instId;

    @SerializedName("instType")
    private final String instType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CefiToken copy$default(CefiToken cefiToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cefiToken.instId;
        }
        if ((i & 2) != 0) {
            str2 = cefiToken.instType;
        }
        return cefiToken.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CefiToken(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CefiToken)) {
            return false;
        }
        CefiToken cefiToken = (CefiToken) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) cefiToken.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) cefiToken.instType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.instType;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CefiToken(instId=" + this.instId + ", instType=" + this.instType + ")";
    }

    public CefiToken(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
        this.instType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:213) call: com.okinc.oklive.app.data.model.remote.CefiToken.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CefiToken(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
