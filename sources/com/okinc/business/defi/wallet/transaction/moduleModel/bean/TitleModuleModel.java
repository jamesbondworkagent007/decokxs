package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TitleModuleModel extends BaseModel<TitleModel> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TitleModuleModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TitleModuleModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TitleModuleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new TitleModuleModel();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TitleModuleModel[] newArray(int i) {
            return new TitleModuleModel[i];
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

    public TitleModuleModel() {
        super("txTitle");
    }

    public static final class TitleModel implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<TitleModel> CREATOR = new Creator();
        private final String desc;
        private final String explain;
        private final ImageItem image;
        private final String subTitle;
        private final TitleItem title;
        private final ImageItem topImage;

        public static final class Creator implements Parcelable.Creator<TitleModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TitleModel(parcel.readInt() == 0 ? null : ImageItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageItem.CREATOR.createFromParcel(parcel) : null, TitleItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleModel[] newArray(int i) {
                return new TitleModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TitleModel copy$default(TitleModel titleModel, ImageItem imageItem, ImageItem imageItem2, TitleItem titleItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                imageItem = titleModel.image;
            }
            if ((i & 2) != 0) {
                imageItem2 = titleModel.topImage;
            }
            ImageItem imageItem3 = imageItem2;
            if ((i & 4) != 0) {
                titleItem = titleModel.title;
            }
            TitleItem titleItem2 = titleItem;
            if ((i & 8) != 0) {
                str = titleModel.subTitle;
            }
            String str4 = str;
            if ((i & 16) != 0) {
                str2 = titleModel.desc;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                str3 = titleModel.explain;
            }
            return titleModel.copy(imageItem, imageItem3, titleItem2, str4, str5, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem component1() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem component2() {
            return this.topImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleItem component3() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.subTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.explain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleModel copy(ImageItem imageItem, ImageItem imageItem2, @NotNull TitleItem titleItem, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(titleItem, "");
            return new TitleModel(imageItem, imageItem2, titleItem, str, str2, str3);
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
            if (!(obj instanceof TitleModel)) {
                return false;
            }
            TitleModel titleModel = (TitleModel) obj;
            return Intrinsics.EZpvd(this.image, titleModel.image) && Intrinsics.EZpvd(this.topImage, titleModel.topImage) && Intrinsics.EZpvd(this.title, titleModel.title) && Intrinsics.EZpvd((Object) this.subTitle, (Object) titleModel.subTitle) && Intrinsics.EZpvd((Object) this.desc, (Object) titleModel.desc) && Intrinsics.EZpvd((Object) this.explain, (Object) titleModel.explain);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDesc() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExplain() {
            return this.explain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem getImage() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleItem getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem getTopImage() {
            return this.topImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ImageItem imageItem = this.image;
            int iHashCode = imageItem == null ? 0 : imageItem.hashCode();
            ImageItem imageItem2 = this.topImage;
            int iHashCode2 = imageItem2 == null ? 0 : imageItem2.hashCode();
            int iHashCode3 = this.title.hashCode();
            String str = this.subTitle;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.desc;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.explain;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TitleModel(image=" + this.image + ", topImage=" + this.topImage + ", title=" + this.title + ", subTitle=" + this.subTitle + ", desc=" + this.desc + ", explain=" + this.explain + ")";
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
            ImageItem imageItem2 = this.topImage;
            if (imageItem2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageItem2.writeToParcel(parcel, i);
            }
            this.title.writeToParcel(parcel, i);
            parcel.writeString(this.subTitle);
            parcel.writeString(this.desc);
            parcel.writeString(this.explain);
        }

        public TitleModel(ImageItem imageItem, ImageItem imageItem2, @NotNull TitleItem titleItem, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(titleItem, "");
            this.image = imageItem;
            this.topImage = imageItem2;
            this.title = titleItem;
            this.subTitle = str;
            this.desc = str2;
            this.explain = str3;
        }
    }

    public static final class ImageItem implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ImageItem> CREATOR = new Creator();
        private final String dark;
        private final String light;
        private transient Integer localImage;

        public static final class Creator implements Parcelable.Creator<ImageItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ImageItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageItem[] newArray(int i) {
                return new ImageItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imageItem.light;
            }
            if ((i & 2) != 0) {
                str2 = imageItem.dark;
            }
            if ((i & 4) != 0) {
                num = imageItem.localImage;
            }
            return imageItem.copy(str, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.light;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.localImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ImageItem copy(String str, String str2, @DrawableRes Integer num) {
            return new ImageItem(str, str2, num);
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
            if (!(obj instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) obj;
            return Intrinsics.EZpvd((Object) this.light, (Object) imageItem.light) && Intrinsics.EZpvd((Object) this.dark, (Object) imageItem.dark) && Intrinsics.EZpvd(this.localImage, imageItem.localImage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDark() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLight() {
            return this.light;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getLocalImage() {
            return this.localImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.light;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.dark;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.localImage;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLocalImage(Integer num) {
            this.localImage = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ImageItem(light=" + this.light + ", dark=" + this.dark + ", localImage=" + this.localImage + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.light);
            parcel.writeString(this.dark);
            Integer num = this.localImage;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public ImageItem(String str, String str2, @DrawableRes Integer num) {
            this.light = str;
            this.dark = str2;
            this.localImage = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:196) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel.ImageItem.<init>(java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ ImageItem(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : num);
        }
    }

    public static final class TitleItem implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<TitleItem> CREATOR = new Creator();
        private transient Integer customColor;
        private final Boolean identify;
        private final String text;

        public static final class Creator implements Parcelable.Creator<TitleItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleItem createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TitleItem(string, boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleItem[] newArray(int i) {
                return new TitleItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TitleItem copy$default(TitleItem titleItem, String str, Boolean bool, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleItem.text;
            }
            if ((i & 2) != 0) {
                bool = titleItem.identify;
            }
            if ((i & 4) != 0) {
                num = titleItem.customColor;
            }
            return titleItem.copy(str, bool, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.identify;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.customColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleItem copy(String str, Boolean bool, @ColorRes Integer num) {
            return new TitleItem(str, bool, num);
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
            if (!(obj instanceof TitleItem)) {
                return false;
            }
            TitleItem titleItem = (TitleItem) obj;
            return Intrinsics.EZpvd((Object) this.text, (Object) titleItem.text) && Intrinsics.EZpvd(this.identify, titleItem.identify) && Intrinsics.EZpvd(this.customColor, titleItem.customColor);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCustomColor() {
            return this.customColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getIdentify() {
            return this.identify;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.text;
            int iHashCode = str == null ? 0 : str.hashCode();
            Boolean bool = this.identify;
            int iHashCode2 = bool == null ? 0 : bool.hashCode();
            Integer num = this.customColor;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCustomColor(Integer num) {
            this.customColor = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TitleItem(text=" + this.text + ", identify=" + this.identify + ", customColor=" + this.customColor + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.text);
            Boolean bool = this.identify;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Integer num = this.customColor;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }

        public TitleItem(String str, Boolean bool, @ColorRes Integer num) {
            this.text = str;
            this.identify = bool;
            this.customColor = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:207) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel.TitleItem.<init>(java.lang.String, java.lang.Boolean, java.lang.Integer):void type: THIS */
        public /* synthetic */ TitleItem(String str, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, (i & 4) != 0 ? null : num);
        }
    }
}
