package com.engagelab.privates.push.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationMessage implements Parcelable {
    public static final Parcelable.Creator<NotificationMessage> CREATOR = new a();
    public static final int NOTIFICATION_STYLE_BIG_PICTURE = 3;
    public static final int NOTIFICATION_STYLE_BIG_TEXT = 1;
    public static final int NOTIFICATION_STYLE_INBOX = 2;
    private int badge;
    private String bigPicture;
    private String bigText;
    private int builderId;
    private String category;
    private String channelId;
    private String content;
    private int defaults;
    private Bundle extras;
    private int importance;
    private String[] inbox;
    private String intentSsl;
    private String intentUri;
    private String largeIcon;
    private String messageId;
    private int notificationId;
    private String overrideMessageId;
    private byte platform;
    private String platformMessageId;
    private int priority;
    private String smallIcon;
    private String sound;
    private int style;
    private String title;

    public static final class a implements Parcelable.Creator<NotificationMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationMessage createFromParcel(Parcel parcel) {
            return new NotificationMessage(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationMessage[] newArray(int i) {
            return new NotificationMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NotificationMessage() {
        this.messageId = "";
        this.overrideMessageId = "";
        this.platform = (byte) 0;
        this.platformMessageId = "";
        this.notificationId = 0;
        this.smallIcon = "";
        this.largeIcon = "";
        this.title = "";
        this.content = "";
        this.extras = null;
        this.style = 0;
        this.bigText = "";
        this.inbox = null;
        this.bigPicture = "";
        this.priority = 0;
        this.importance = -1;
        this.defaults = -1;
        this.sound = "";
        this.channelId = "";
        this.intentUri = "";
        this.intentSsl = "";
        this.badge = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBadge() {
        return this.badge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBigPicture() {
        return this.bigPicture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBigText() {
        return this.bigText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBuilderId() {
        return this.builderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDefaults() {
        return this.defaults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Bundle getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getImportance() {
        return this.importance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getInbox() {
        return this.inbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIntentSsl() {
        return this.intentSsl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIntentUri() {
        return this.intentUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLargeIcon() {
        return this.largeIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNotificationId() {
        return this.notificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOverrideMessageId() {
        return this.overrideMessageId;
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
    public int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSmallIcon() {
        return this.smallIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSound() {
        return this.sound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setBadge(int i) {
        this.badge = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setBigPicture(String str) {
        this.bigPicture = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setBigText(String str) {
        this.bigText = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setBuilderId(int i) {
        this.builderId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setCategory(String str) {
        this.category = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setContent(String str) {
        this.content = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setDefaults(int i) {
        this.defaults = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setImportance(int i) {
        this.importance = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setInbox(String[] strArr) {
        this.inbox = strArr;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setIntentSsl(String str) {
        this.intentSsl = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setIntentUri(String str) {
        this.intentUri = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setLargeIcon(String str) {
        this.largeIcon = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setMessageId(String str) {
        this.messageId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setNotificationId(int i) {
        this.notificationId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setOverrideMessageId(String str) {
        this.overrideMessageId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setPlatform(byte b) {
        this.platform = b;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setPlatformMessageId(String str) {
        this.platformMessageId = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setPriority(int i) {
        this.priority = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setSmallIcon(String str) {
        this.smallIcon = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setSound(String str) {
        this.sound = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setStyle(int i) {
        this.style = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationMessage setTitle(String str) {
        this.title = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  messageId=" + this.messageId + ",\n  overrideMessageId=" + this.overrideMessageId + ",\n  platform=" + ((int) this.platform) + ",\n  platformMessageId='" + this.platformMessageId + ",\n  notificationId=" + this.notificationId + ",\n  smallIcon=" + this.smallIcon + ",\n  largeIcon=" + this.largeIcon + ",\n  title=" + this.title + ",\n  content=" + this.content + ",\n  extras=" + MTCommonLog.toLogString(this.extras) + ",\n  layoutId=" + this.builderId + ",\n  style=" + this.style + ",\n  bigText=" + this.bigText + ",\n  inbox=" + Arrays.toString(this.inbox) + ",\n  bigPicture=" + this.bigPicture + ",\n  priority=" + this.priority + ",\n  importance=" + this.importance + ",\n  defaults=" + this.defaults + ",\n  category=" + this.category + ",\n  sound=" + this.sound + ",\n  channelId=" + this.channelId + ",\n  intentUri=" + this.intentUri + ",\n  intentSsl=" + this.intentSsl + ",\n  badge=" + this.badge + ",\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeString(this.overrideMessageId);
        parcel.writeByte(this.platform);
        parcel.writeString(this.platformMessageId);
        parcel.writeInt(this.notificationId);
        parcel.writeString(this.smallIcon);
        parcel.writeString(this.largeIcon);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeBundle(this.extras);
        parcel.writeInt(this.builderId);
        parcel.writeInt(this.style);
        parcel.writeString(this.bigText);
        parcel.writeStringArray(this.inbox);
        parcel.writeString(this.bigPicture);
        parcel.writeInt(this.priority);
        parcel.writeInt(this.importance);
        parcel.writeInt(this.defaults);
        parcel.writeString(this.category);
        parcel.writeString(this.sound);
        parcel.writeString(this.channelId);
        parcel.writeString(this.intentUri);
        parcel.writeString(this.intentSsl);
        parcel.writeInt(this.badge);
    }

    public NotificationMessage(Parcel parcel) {
        this.messageId = "";
        this.overrideMessageId = "";
        this.platform = (byte) 0;
        this.platformMessageId = "";
        this.notificationId = 0;
        this.smallIcon = "";
        this.largeIcon = "";
        this.title = "";
        this.content = "";
        this.extras = null;
        this.style = 0;
        this.bigText = "";
        this.inbox = null;
        this.bigPicture = "";
        this.priority = 0;
        this.importance = -1;
        this.defaults = -1;
        this.sound = "";
        this.channelId = "";
        this.intentUri = "";
        this.intentSsl = "";
        this.badge = 0;
        this.messageId = parcel.readString();
        this.overrideMessageId = parcel.readString();
        this.platform = parcel.readByte();
        this.platformMessageId = parcel.readString();
        this.notificationId = parcel.readInt();
        this.smallIcon = parcel.readString();
        this.largeIcon = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.extras = parcel.readBundle();
        this.builderId = parcel.readInt();
        this.style = parcel.readInt();
        this.bigText = parcel.readString();
        this.inbox = parcel.createStringArray();
        this.bigPicture = parcel.readString();
        this.priority = parcel.readInt();
        this.importance = parcel.readInt();
        this.defaults = parcel.readInt();
        this.category = parcel.readString();
        this.sound = parcel.readString();
        this.channelId = parcel.readString();
        this.intentUri = parcel.readString();
        this.intentSsl = parcel.readString();
        this.badge = parcel.readInt();
    }
}
