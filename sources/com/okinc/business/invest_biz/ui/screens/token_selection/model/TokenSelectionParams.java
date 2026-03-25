package com.okinc.business.invest_biz.ui.screens.token_selection.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TokenSelectionParams implements Parcelable {
    public static final Parcelable.Creator<TokenSelectionParams> CREATOR = new Creator();
    public final long AEQbTJ;
    public final TokenSelectionAction KWHzl;
    public final long OLrzqt;
    public final String copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TokenSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenSelectionParams(parcel.readLong(), parcel.readString(), parcel.readLong(), TokenSelectionAction.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenSelectionParams[] newArray(int i) {
            return new TokenSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenSelectionParams copy$default(TokenSelectionParams tokenSelectionParams, long j, String str, long j2, TokenSelectionAction tokenSelectionAction, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tokenSelectionParams.OLrzqt;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = tokenSelectionParams.copydefault;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = tokenSelectionParams.AEQbTJ;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            tokenSelectionAction = tokenSelectionParams.KWHzl;
        }
        return tokenSelectionParams.AEQbTJ(j3, str2, j4, tokenSelectionAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenSelectionAction AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenSelectionParams AEQbTJ(long j, @NotNull String str, long j2, @NotNull TokenSelectionAction tokenSelectionAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenSelectionAction, "");
        return new TokenSelectionParams(j, str, j2, tokenSelectionAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof TokenSelectionParams)) {
            return false;
        }
        TokenSelectionParams tokenSelectionParams = (TokenSelectionParams) obj;
        return this.OLrzqt == tokenSelectionParams.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenSelectionParams.copydefault) && this.AEQbTJ == tokenSelectionParams.AEQbTJ && this.KWHzl == tokenSelectionParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenSelectionParams(investmentId=" + this.OLrzqt + ", walletId=" + this.copydefault + ", chainId=" + this.AEQbTJ + ", action=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeLong(this.AEQbTJ);
        parcel.writeString(this.KWHzl.name());
    }

    public TokenSelectionParams(long j, @NotNull String str, long j2, @NotNull TokenSelectionAction tokenSelectionAction) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenSelectionAction, "");
        this.OLrzqt = j;
        this.copydefault = str;
        this.AEQbTJ = j2;
        this.KWHzl = tokenSelectionAction;
    }
}
