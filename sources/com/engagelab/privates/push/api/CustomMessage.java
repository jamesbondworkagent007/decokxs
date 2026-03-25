package com.engagelab.privates.push.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: loaded from: classes2.dex */
public class CustomMessage implements Parcelable {
    public static final Parcelable.Creator<CustomMessage> CREATOR = new a();
    private String content;
    private String contentType;
    private Bundle extras;
    private String messageId;
    private byte platform;
    private String platformMessageId;
    private String title;

    public static final class a implements Parcelable.Creator<CustomMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomMessage createFromParcel(Parcel parcel) {
            return new CustomMessage(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomMessage[] newArray(int i) {
            return new CustomMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomMessage() {
        this.messageId = null;
        this.platform = (byte) 0;
        this.platformMessageId = null;
        this.title = null;
        this.content = null;
        this.contentType = null;
        this.extras = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Bundle getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPlatformMessageId() {
        return this.platformMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setContent(String str) {
        this.content = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setContentType(String str) {
        this.contentType = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setMessageId(String str) {
        this.messageId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setPlatform(byte b) {
        this.platform = b;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setPlatformMessageId(String str) {
        this.platformMessageId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessage setTitle(String str) {
        this.title = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  messageId=" + this.messageId + ",\n  platform=" + ((int) this.platform) + ",\n  platformMessageId=" + this.platformMessageId + ",\n  title=" + this.title + ",\n  content=" + this.content + ",\n  contentType=" + this.contentType + ",\n  extras=" + MTCommonLog.toLogString(this.extras) + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeByte(this.platform);
        parcel.writeString(this.platformMessageId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.contentType);
        parcel.writeBundle(this.extras);
    }

    public CustomMessage(Parcel parcel) {
        this.messageId = null;
        this.platform = (byte) 0;
        this.platformMessageId = null;
        this.title = null;
        this.content = null;
        this.contentType = null;
        this.extras = null;
        this.messageId = parcel.readString();
        this.platform = parcel.readByte();
        this.platformMessageId = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.contentType = parcel.readString();
        this.extras = parcel.readBundle();
    }
}
