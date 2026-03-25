package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class RiskPopupInfo extends BaseModel<RiskPopupInfoItem> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RiskPopupInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RiskPopupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskPopupInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new RiskPopupInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskPopupInfo[] newArray(int i) {
            return new RiskPopupInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public RiskPopupInfo() {
        super("txRiskExplain");
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class RiskPopupInfoItem implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<RiskPopupInfoItem> CREATOR = new Creator();
        private final String confirmBtnText;
        private final DescItem desc;
        private final ImageItem image;
        private final String title;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<RiskPopupInfoItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskPopupInfoItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RiskPopupInfoItem(parcel.readInt() == 0 ? null : ImageItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? DescItem.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskPopupInfoItem[] newArray(int i) {
                return new RiskPopupInfoItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RiskPopupInfoItem copy$default(RiskPopupInfoItem riskPopupInfoItem, ImageItem imageItem, String str, DescItem descItem, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                imageItem = riskPopupInfoItem.image;
            }
            if ((i & 2) != 0) {
                str = riskPopupInfoItem.title;
            }
            if ((i & 4) != 0) {
                descItem = riskPopupInfoItem.desc;
            }
            if ((i & 8) != 0) {
                str2 = riskPopupInfoItem.confirmBtnText;
            }
            return riskPopupInfoItem.copy(imageItem, str, descItem, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem component1() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DescItem component3() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.confirmBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RiskPopupInfoItem copy(ImageItem imageItem, String str, DescItem descItem, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new RiskPopupInfoItem(imageItem, str, descItem, str2);
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
            if (!(obj instanceof RiskPopupInfoItem)) {
                return false;
            }
            RiskPopupInfoItem riskPopupInfoItem = (RiskPopupInfoItem) obj;
            return Intrinsics.EZpvd(this.image, riskPopupInfoItem.image) && Intrinsics.EZpvd((Object) this.title, (Object) riskPopupInfoItem.title) && Intrinsics.EZpvd(this.desc, riskPopupInfoItem.desc) && Intrinsics.EZpvd((Object) this.confirmBtnText, (Object) riskPopupInfoItem.confirmBtnText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getConfirmBtnText() {
            return this.confirmBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DescItem getDesc() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem getImage() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ImageItem imageItem = this.image;
            int iHashCode = imageItem == null ? 0 : imageItem.hashCode();
            String str = this.title;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            DescItem descItem = this.desc;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (descItem != null ? descItem.hashCode() : 0)) * 31) + this.confirmBtnText.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RiskPopupInfoItem(image=" + this.image + ", title=" + this.title + ", desc=" + this.desc + ", confirmBtnText=" + this.confirmBtnText + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ImageItem imageItem = this.image;
            if (imageItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageItem.writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            DescItem descItem = this.desc;
            if (descItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                descItem.writeToParcel(parcel, i);
            }
            parcel.writeString(this.confirmBtnText);
        }

        public RiskPopupInfoItem(ImageItem imageItem, String str, DescItem descItem, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.image = imageItem;
            this.title = str;
            this.desc = descItem;
            this.confirmBtnText = str2;
        }
    }
}
