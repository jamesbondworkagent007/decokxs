package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CardAuthRequest implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.CardAuthRequest.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CardAuthRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getTokenCoinTypeNo();

    private CardAuthRequest() {
    }

    public static final class CardAuthRequestLimited extends CardAuthRequest {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CardAuthRequestLimited> CREATOR = new Creator();
        private final String limit;
        private final String tokenCoinTypeNo;

        public static final class Creator implements Parcelable.Creator<CardAuthRequestLimited> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestLimited createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CardAuthRequestLimited(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestLimited[] newArray(int i) {
                return new CardAuthRequestLimited[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CardAuthRequestLimited copy$default(CardAuthRequestLimited cardAuthRequestLimited, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardAuthRequestLimited.tokenCoinTypeNo;
            }
            if ((i & 2) != 0) {
                str2 = cardAuthRequestLimited.limit;
            }
            return cardAuthRequestLimited.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.limit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthRequestLimited copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CardAuthRequestLimited(str, str2);
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
            if (!(obj instanceof CardAuthRequestLimited)) {
                return false;
            }
            CardAuthRequestLimited cardAuthRequestLimited = (CardAuthRequestLimited) obj;
            return Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) cardAuthRequestLimited.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.limit, (Object) cardAuthRequestLimited.limit);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLimit() {
            return this.limit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.web3pay.api.model.CardAuthRequest
        public String getTokenCoinTypeNo() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.tokenCoinTypeNo.hashCode() * 31) + this.limit.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CardAuthRequestLimited(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", limit=" + this.limit + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenCoinTypeNo);
            parcel.writeString(this.limit);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardAuthRequestLimited(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.tokenCoinTypeNo = str;
            this.limit = str2;
        }
    }

    public static final class CardAuthRequestUnlimited extends CardAuthRequest {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CardAuthRequestUnlimited> CREATOR = new Creator();
        private final String tokenCoinTypeNo;

        public static final class Creator implements Parcelable.Creator<CardAuthRequestUnlimited> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestUnlimited createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CardAuthRequestUnlimited(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestUnlimited[] newArray(int i) {
                return new CardAuthRequestUnlimited[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CardAuthRequestUnlimited copy$default(CardAuthRequestUnlimited cardAuthRequestUnlimited, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardAuthRequestUnlimited.tokenCoinTypeNo;
            }
            return cardAuthRequestUnlimited.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthRequestUnlimited copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CardAuthRequestUnlimited(str);
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
            return (obj instanceof CardAuthRequestUnlimited) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) ((CardAuthRequestUnlimited) obj).tokenCoinTypeNo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.web3pay.api.model.CardAuthRequest
        public String getTokenCoinTypeNo() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.tokenCoinTypeNo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CardAuthRequestUnlimited(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenCoinTypeNo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardAuthRequestUnlimited(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenCoinTypeNo = str;
        }
    }

    public static final class CardAuthRequestDeactivate extends CardAuthRequest {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CardAuthRequestDeactivate> CREATOR = new Creator();
        private final String tokenCoinTypeNo;

        public static final class Creator implements Parcelable.Creator<CardAuthRequestDeactivate> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestDeactivate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CardAuthRequestDeactivate(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardAuthRequestDeactivate[] newArray(int i) {
                return new CardAuthRequestDeactivate[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CardAuthRequestDeactivate copy$default(CardAuthRequestDeactivate cardAuthRequestDeactivate, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardAuthRequestDeactivate.tokenCoinTypeNo;
            }
            return cardAuthRequestDeactivate.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardAuthRequestDeactivate copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CardAuthRequestDeactivate(str);
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
            return (obj instanceof CardAuthRequestDeactivate) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) ((CardAuthRequestDeactivate) obj).tokenCoinTypeNo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.web3pay.api.model.CardAuthRequest
        public String getTokenCoinTypeNo() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.tokenCoinTypeNo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CardAuthRequestDeactivate(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenCoinTypeNo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardAuthRequestDeactivate(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenCoinTypeNo = str;
        }
    }
}
