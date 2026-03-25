package com.okinc.share.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.platforms.SharePlatform;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class ShareH5Bean implements Parcelable {
    public static final Parcelable.Creator<ShareH5Bean> CREATOR = new Parcelable.Creator<ShareH5Bean>() { // from class: com.okinc.share.bean.ShareH5Bean.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareH5Bean createFromParcel(Parcel parcel) {
            return new ShareH5Bean(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareH5Bean[] newArray(int i) {
            return new ShareH5Bean[i];
        }
    };
    public String body;
    public String bottomIconUrl;
    public int drawableId;
    public String emailBody;
    public String emailSubject;
    public Bundle extras;
    public String imagePath;
    public ImagePreviewType imagePreviewType;
    public String imageUrl;
    public boolean isClip;
    public boolean isInnerShareEnable;
    public boolean isShowing;
    public String linkUrl;
    public boolean loopImages;
    public ArrayList<SharePlatform> prependSharePlatforms;
    public ArrayList<SharePlatform> replacedSharePlatforms;
    public String shareFrom;
    public ShareType shareType;
    public String smsBody;
    public String subtitle;
    public String title;
    public String wcMomentBody;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareH5Bean() {
        this.body = "";
        this.imageUrl = "";
        this.linkUrl = "";
        this.title = "";
        this.subtitle = "";
        this.shareFrom = "";
        this.shareType = ShareType.SHARE_IMAGE;
        this.isShowing = true;
        this.isClip = false;
        this.isInnerShareEnable = false;
        this.loopImages = true;
        this.smsBody = "";
        this.emailBody = "";
        this.emailSubject = "";
        this.wcMomentBody = "";
        this.imagePath = "";
        this.imagePreviewType = ImagePreviewType.CENTER_INSIDE;
        this.drawableId = 0;
        this.bottomIconUrl = "";
        this.prependSharePlatforms = new ArrayList<>();
        this.replacedSharePlatforms = new ArrayList<>();
        this.extras = new Bundle();
    }

    public ShareH5Bean(Parcel parcel) {
        this.body = "";
        this.imageUrl = "";
        this.linkUrl = "";
        this.title = "";
        this.subtitle = "";
        this.shareFrom = "";
        this.shareType = ShareType.SHARE_IMAGE;
        this.isShowing = true;
        this.isClip = false;
        this.isInnerShareEnable = false;
        this.loopImages = true;
        this.smsBody = "";
        this.emailBody = "";
        this.emailSubject = "";
        this.wcMomentBody = "";
        this.imagePath = "";
        this.imagePreviewType = ImagePreviewType.CENTER_INSIDE;
        this.drawableId = 0;
        this.bottomIconUrl = "";
        this.prependSharePlatforms = new ArrayList<>();
        this.replacedSharePlatforms = new ArrayList<>();
        this.extras = new Bundle();
        this.body = parcel.readString();
        this.imageUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.title = parcel.readString();
        this.subtitle = parcel.readString();
        this.shareFrom = parcel.readString();
        this.shareType = (ShareType) parcel.readParcelable(ShareType.class.getClassLoader());
        this.isShowing = parcel.readByte() != 0;
        this.isClip = parcel.readByte() != 0;
        this.isInnerShareEnable = parcel.readByte() != 0;
        this.smsBody = parcel.readString();
        this.emailBody = parcel.readString();
        this.emailSubject = parcel.readString();
        this.wcMomentBody = parcel.readString();
        this.imagePath = parcel.readString();
        this.drawableId = parcel.readInt();
        this.bottomIconUrl = parcel.readString();
        this.extras = parcel.readBundle();
        ArrayList<SharePlatform> arrayList = this.prependSharePlatforms;
        SharePlatform.CREATOR creator = SharePlatform.CREATOR;
        parcel.readTypedList(arrayList, creator);
        parcel.readTypedList(this.replacedSharePlatforms, creator);
        parcel.readParcelable(ImagePreviewType.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.body);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.shareFrom);
        parcel.writeParcelable(this.shareType, i);
        parcel.writeByte(this.isShowing ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isClip ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isInnerShareEnable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.smsBody);
        parcel.writeString(this.emailBody);
        parcel.writeString(this.emailSubject);
        parcel.writeString(this.wcMomentBody);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.drawableId);
        parcel.writeString(this.bottomIconUrl);
        parcel.writeBundle(this.extras);
        parcel.writeTypedList(this.prependSharePlatforms);
        parcel.writeTypedList(this.replacedSharePlatforms);
        parcel.writeParcelable(this.imagePreviewType, i);
    }
}
