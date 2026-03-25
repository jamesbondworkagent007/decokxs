package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationLayout implements Parcelable {
    public static final Parcelable.Creator<NotificationLayout> CREATOR = new a();
    private int contentViewId;
    private int iconResourceId;
    private int iconViewId;
    private int layoutId;
    private int timeViewId;
    private int titleViewId;

    public static final class a implements Parcelable.Creator<NotificationLayout> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationLayout createFromParcel(Parcel parcel) {
            return new NotificationLayout(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationLayout[] newArray(int i) {
            return new NotificationLayout[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NotificationLayout() {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getContentViewId() {
        return this.contentViewId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIconResourceId() {
        return this.iconResourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIconViewId() {
        return this.iconViewId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLayoutId() {
        return this.layoutId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTimeViewId() {
        return this.timeViewId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTitleViewId() {
        return this.titleViewId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setContentViewId(int i) {
        this.contentViewId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setIconResourceId(int i) {
        this.iconResourceId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setIconViewId(int i) {
        this.iconViewId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setLayoutId(int i) {
        this.layoutId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setTimeViewId(int i) {
        this.timeViewId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationLayout setTitleViewId(int i) {
        this.titleViewId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  layoutId=" + this.layoutId + ",\n  iconViewId=" + this.iconViewId + ",\n  titleViewId=" + this.titleViewId + ",\n  contentViewId=" + this.contentViewId + ",\n  timeViewId=" + this.timeViewId + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.layoutId);
        parcel.writeInt(this.iconViewId);
        parcel.writeInt(this.iconResourceId);
        parcel.writeInt(this.titleViewId);
        parcel.writeInt(this.contentViewId);
        parcel.writeInt(this.timeViewId);
    }

    public NotificationLayout(Parcel parcel) {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
        this.layoutId = parcel.readInt();
        this.iconViewId = parcel.readInt();
        this.iconResourceId = parcel.readInt();
        this.titleViewId = parcel.readInt();
        this.contentViewId = parcel.readInt();
        this.timeViewId = parcel.readInt();
    }
}
