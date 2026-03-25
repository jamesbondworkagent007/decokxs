package com.okinc.business.dex.trade.copytrading.edit.ui.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TokenAmountUnit implements RangeFilterUnit {
    public static final Parcelable.Creator<TokenAmountUnit> CREATOR = new Creator();
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<TokenAmountUnit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAmountUnit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenAmountUnit(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAmountUnit[] newArray(int i) {
            return new TokenAmountUnit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenAmountUnit copy$default(TokenAmountUnit tokenAmountUnit, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenAmountUnit.KWHzl;
        }
        return tokenAmountUnit.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAmountUnit OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TokenAmountUnit(str);
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
        return (obj instanceof TokenAmountUnit) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((TokenAmountUnit) obj).KWHzl);
    }

    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public long getScale() {
        return 1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getUnitValue() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAmountUnit(tokenSymbol=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
    }

    public TokenAmountUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }
}
