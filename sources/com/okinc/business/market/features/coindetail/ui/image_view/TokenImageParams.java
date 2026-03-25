package com.okinc.business.market.features.coindetail.ui.image_view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TokenImageParams implements Parcelable {
    public static final Parcelable.Creator<TokenImageParams> CREATOR = new Creator();
    public final boolean EZpvd;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<TokenImageParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenImageParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenImageParams(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenImageParams[] newArray(int i) {
            return new TokenImageParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenImageParams() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenImageParams copy$default(TokenImageParams tokenImageParams, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenImageParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = tokenImageParams.EZpvd;
        }
        return tokenImageParams.AEQbTJ(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenImageParams AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TokenImageParams(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenImageParams)) {
            return false;
        }
        TokenImageParams tokenImageParams = (TokenImageParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenImageParams.OLrzqt) && this.EZpvd == tokenImageParams.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenImageParams(url=" + this.OLrzqt + ", showSearch=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public TokenImageParams(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:19) call: com.okinc.business.market.features.coindetail.ui.image_view.TokenImageParams.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TokenImageParams(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z);
    }
}
