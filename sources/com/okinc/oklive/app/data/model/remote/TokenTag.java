package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TokenTag {
    public static final int $stable = 0;

    @SerializedName("cedefiToken")
    private final CedefiToken cedefiToken;

    @SerializedName("cefiToken")
    private final CefiToken cefiToken;

    @SerializedName("tokenName")
    private final String tokenName;

    @SerializedName("tokenType")
    private final int tokenType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenTag copy$default(TokenTag tokenTag, int i, CedefiToken cedefiToken, CefiToken cefiToken, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tokenTag.tokenType;
        }
        if ((i2 & 2) != 0) {
            cedefiToken = tokenTag.cedefiToken;
        }
        if ((i2 & 4) != 0) {
            cefiToken = tokenTag.cefiToken;
        }
        if ((i2 & 8) != 0) {
            str = tokenTag.tokenName;
        }
        return tokenTag.copy(i, cedefiToken, cefiToken, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken component2() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken component3() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenTag copy(int i, CedefiToken cedefiToken, CefiToken cefiToken, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TokenTag(i, cedefiToken, cefiToken, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTag)) {
            return false;
        }
        TokenTag tokenTag = (TokenTag) obj;
        return this.tokenType == tokenTag.tokenType && Intrinsics.EZpvd(this.cedefiToken, tokenTag.cedefiToken) && Intrinsics.EZpvd(this.cefiToken, tokenTag.cefiToken) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenTag.tokenName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken getCedefiToken() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken getCefiToken() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.tokenType);
        CedefiToken cedefiToken = this.cedefiToken;
        int iHashCode2 = cedefiToken == null ? 0 : cedefiToken.hashCode();
        CefiToken cefiToken = this.cefiToken;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (cefiToken != null ? cefiToken.hashCode() : 0)) * 31) + this.tokenName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenTag(tokenType=" + this.tokenType + ", cedefiToken=" + this.cedefiToken + ", cefiToken=" + this.cefiToken + ", tokenName=" + this.tokenName + ")";
    }

    public TokenTag(int i, CedefiToken cedefiToken, CefiToken cefiToken, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenType = i;
        this.cedefiToken = cedefiToken;
        this.cefiToken = cefiToken;
        this.tokenName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (wrap:com.okinc.oklive.app.data.model.remote.CedefiToken:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.CedefiToken) : (r3v0 com.okinc.oklive.app.data.model.remote.CedefiToken))
  (wrap:com.okinc.oklive.app.data.model.remote.CefiToken:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.CefiToken) : (r4v0 com.okinc.oklive.app.data.model.remote.CefiToken))
  (r5v0 java.lang.String)
 A[MD:(int, com.okinc.oklive.app.data.model.remote.CedefiToken, com.okinc.oklive.app.data.model.remote.CefiToken, java.lang.String):void (m)] (LINE:321) call: com.okinc.oklive.app.data.model.remote.TokenTag.<init>(int, com.okinc.oklive.app.data.model.remote.CedefiToken, com.okinc.oklive.app.data.model.remote.CefiToken, java.lang.String):void type: THIS */
    public /* synthetic */ TokenTag(int i, CedefiToken cedefiToken, CefiToken cefiToken, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : cedefiToken, (i2 & 4) != 0 ? null : cefiToken, str);
    }
}
