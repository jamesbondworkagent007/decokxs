package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class PopupInfoItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PopupInfoItem> CREATOR = new Creator();
    private final String btnLayout;
    private final DescItem desc;
    private final List<DescListItem> descList;
    private final String evtType;
    private final FeedbackInfo feedbackInfo;
    private final String grayBtnText;
    private final String highlightBtnText;
    private final int id;
    private final ImageItem image;
    private final String title;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<PopupInfoItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupInfoItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            ImageItem imageItemCreateFromParcel = parcel.readInt() == 0 ? null : ImageItem.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            DescItem descItemCreateFromParcel = parcel.readInt() == 0 ? null : DescItem.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(DescListItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new PopupInfoItem(i, string, imageItemCreateFromParcel, string2, descItemCreateFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FeedbackInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupInfoItem[] newArray(int i) {
            return new PopupInfoItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackInfo component10() {
        return this.feedbackInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.btnLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageItem component3() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DescItem component5() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DescListItem> component6() {
        return this.descList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.highlightBtnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.evtType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.grayBtnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupInfoItem copy(int i, @NotNull String str, ImageItem imageItem, String str2, DescItem descItem, List<DescListItem> list, String str3, @NotNull String str4, @NotNull String str5, FeedbackInfo feedbackInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PopupInfoItem(i, str, imageItem, str2, descItem, list, str3, str4, str5, feedbackInfo);
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
        if (!(obj instanceof PopupInfoItem)) {
            return false;
        }
        PopupInfoItem popupInfoItem = (PopupInfoItem) obj;
        return this.id == popupInfoItem.id && Intrinsics.EZpvd((Object) this.btnLayout, (Object) popupInfoItem.btnLayout) && Intrinsics.EZpvd(this.image, popupInfoItem.image) && Intrinsics.EZpvd((Object) this.title, (Object) popupInfoItem.title) && Intrinsics.EZpvd(this.desc, popupInfoItem.desc) && Intrinsics.EZpvd(this.descList, popupInfoItem.descList) && Intrinsics.EZpvd((Object) this.highlightBtnText, (Object) popupInfoItem.highlightBtnText) && Intrinsics.EZpvd((Object) this.evtType, (Object) popupInfoItem.evtType) && Intrinsics.EZpvd((Object) this.grayBtnText, (Object) popupInfoItem.grayBtnText) && Intrinsics.EZpvd(this.feedbackInfo, popupInfoItem.feedbackInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtnLayout() {
        return this.btnLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DescItem getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DescListItem> getDescList() {
        return this.descList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvtType() {
        return this.evtType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeedbackInfo getFeedbackInfo() {
        return this.feedbackInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGrayBtnText() {
        return this.grayBtnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighlightBtnText() {
        return this.highlightBtnText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
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
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = this.btnLayout.hashCode();
        ImageItem imageItem = this.image;
        int iHashCode3 = imageItem == null ? 0 : imageItem.hashCode();
        String str = this.title;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        DescItem descItem = this.desc;
        int iHashCode5 = descItem == null ? 0 : descItem.hashCode();
        List<DescListItem> list = this.descList;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str2 = this.highlightBtnText;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.evtType.hashCode();
        int iHashCode9 = this.grayBtnText.hashCode();
        FeedbackInfo feedbackInfo = this.feedbackInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (feedbackInfo != null ? feedbackInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PopupInfoItem(id=" + this.id + ", btnLayout=" + this.btnLayout + ", image=" + this.image + ", title=" + this.title + ", desc=" + this.desc + ", descList=" + this.descList + ", highlightBtnText=" + this.highlightBtnText + ", evtType=" + this.evtType + ", grayBtnText=" + this.grayBtnText + ", feedbackInfo=" + this.feedbackInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.btnLayout);
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
        List<DescListItem> list = this.descList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DescListItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.highlightBtnText);
        parcel.writeString(this.evtType);
        parcel.writeString(this.grayBtnText);
        FeedbackInfo feedbackInfo = this.feedbackInfo;
        if (feedbackInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedbackInfo.writeToParcel(parcel, i);
        }
    }

    public PopupInfoItem(int i, @NotNull String str, ImageItem imageItem, String str2, DescItem descItem, List<DescListItem> list, String str3, @NotNull String str4, @NotNull String str5, FeedbackInfo feedbackInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = i;
        this.btnLayout = str;
        this.image = imageItem;
        this.title = str2;
        this.desc = descItem;
        this.descList = list;
        this.highlightBtnText = str3;
        this.evtType = str4;
        this.grayBtnText = str5;
        this.feedbackInfo = feedbackInfo;
    }
}
