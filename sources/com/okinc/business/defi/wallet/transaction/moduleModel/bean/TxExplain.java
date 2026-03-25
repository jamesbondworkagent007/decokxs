package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TxExplain extends BaseModel<ExplainItem> implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TxExplain> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxExplain> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxExplain createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new TxExplain();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxExplain[] newArray(int i) {
            return new TxExplain[i];
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

    public TxExplain() {
        super("txExplain");
    }

    public static final class ExplainItem implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ExplainItem> CREATOR = new Creator();
        private final String confirmBtnText;
        private final List<Desc> descList;
        private final Image image;
        private transient Integer localImage;
        private final String title;

        public static final class Creator implements Parcelable.Creator<ExplainItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExplainItem createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readInt() == 0 ? null : Desc.CREATOR.createFromParcel(parcel));
                    }
                }
                return new ExplainItem(string, arrayList, parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExplainItem[] newArray(int i) {
                return new ExplainItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain$ExplainItem */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExplainItem copy$default(ExplainItem explainItem, String str, List list, Image image, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = explainItem.confirmBtnText;
            }
            if ((i & 2) != 0) {
                list = explainItem.descList;
            }
            List list2 = list;
            if ((i & 4) != 0) {
                image = explainItem.image;
            }
            Image image2 = image;
            if ((i & 8) != 0) {
                str2 = explainItem.title;
            }
            String str3 = str2;
            if ((i & 16) != 0) {
                num = explainItem.localImage;
            }
            return explainItem.copy(str, list2, image2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.confirmBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Desc> component2() {
            return this.descList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Image component3() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.localImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ExplainItem copy(String str, List<Desc> list, Image image, String str2, @DrawableRes Integer num) {
            return new ExplainItem(str, list, image, str2, num);
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
            if (!(obj instanceof ExplainItem)) {
                return false;
            }
            ExplainItem explainItem = (ExplainItem) obj;
            return Intrinsics.EZpvd((Object) this.confirmBtnText, (Object) explainItem.confirmBtnText) && Intrinsics.EZpvd(this.descList, explainItem.descList) && Intrinsics.EZpvd(this.image, explainItem.image) && Intrinsics.EZpvd((Object) this.title, (Object) explainItem.title) && Intrinsics.EZpvd(this.localImage, explainItem.localImage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getConfirmBtnText() {
            return this.confirmBtnText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Desc> getDescList() {
            return this.descList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Image getImage() {
            return this.image;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getLocalImage() {
            return this.localImage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.confirmBtnText;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<Desc> list = this.descList;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            Image image = this.image;
            int iHashCode3 = image == null ? 0 : image.hashCode();
            String str2 = this.title;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.localImage;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLocalImage(Integer num) {
            this.localImage = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExplainItem(confirmBtnText=" + this.confirmBtnText + ", descList=" + this.descList + ", image=" + this.image + ", title=" + this.title + ", localImage=" + this.localImage + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.confirmBtnText);
            List<Desc> list = this.descList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Desc desc : list) {
                    if (desc == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        desc.writeToParcel(parcel, i);
                    }
                }
            }
            Image image = this.image;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                image.writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            Integer num = this.localImage;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }

        public ExplainItem(String str, List<Desc> list, Image image, String str2, @DrawableRes Integer num) {
            this.confirmBtnText = str;
            this.descList = list;
            this.image = image;
            this.title = str2;
            this.localImage = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.util.List)
  (r9v0 com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain$Image)
  (r10v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain$Desc>, com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain$Image, java.lang.String, java.lang.Integer):void (m)] (LINE:153) call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain.ExplainItem.<init>(java.lang.String, java.util.List, com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain$Image, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ ExplainItem(String str, List list, Image image, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, image, str2, (i & 16) != 0 ? null : num);
        }
    }

    public static final class Desc implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Desc> CREATOR = new Creator();
        private final String desc;
        private final String text;

        public static final class Creator implements Parcelable.Creator<Desc> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Desc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Desc(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Desc[] newArray(int i) {
                return new Desc[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Desc copy$default(Desc desc, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = desc.desc;
            }
            if ((i & 2) != 0) {
                str2 = desc.text;
            }
            return desc.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Desc copy(String str, String str2) {
            return new Desc(str, str2);
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
            if (!(obj instanceof Desc)) {
                return false;
            }
            Desc desc = (Desc) obj;
            return Intrinsics.EZpvd((Object) this.desc, (Object) desc.desc) && Intrinsics.EZpvd((Object) this.text, (Object) desc.text);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDesc() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.desc;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.text;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Desc(desc=" + this.desc + ", text=" + this.text + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.desc);
            parcel.writeString(this.text);
        }

        public Desc(String str, String str2) {
            this.desc = str;
            this.text = str2;
        }
    }

    public static final class Image implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Image> CREATOR = new Creator();
        private final String dark;
        private final String light;

        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Image(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.dark;
            }
            if ((i & 2) != 0) {
                str2 = image.light;
            }
            return image.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.light;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Image copy(String str, String str2) {
            return new Image(str, str2);
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
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.EZpvd((Object) this.dark, (Object) image.dark) && Intrinsics.EZpvd((Object) this.light, (Object) image.light);
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
        public int hashCode() {
            String str = this.dark;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.light;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Image(dark=" + this.dark + ", light=" + this.light + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.dark);
            parcel.writeString(this.light);
        }

        public Image(String str, String str2) {
            this.dark = str;
            this.light = str2;
        }
    }
}
