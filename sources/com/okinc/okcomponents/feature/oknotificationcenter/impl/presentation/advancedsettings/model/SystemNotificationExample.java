package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemNotificationExample implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SystemNotificationExample> CREATOR = new Creator();
    private final String content;
    private final String darkIconLink;
    private final String lightIconLink;
    private final String msgName;
    private final String title;

    public static final class Creator implements Parcelable.Creator<SystemNotificationExample> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemNotificationExample createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SystemNotificationExample(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SystemNotificationExample[] newArray(int i) {
            return new SystemNotificationExample[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SystemNotificationExample() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SystemNotificationExample copy$default(SystemNotificationExample systemNotificationExample, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = systemNotificationExample.msgName;
        }
        if ((i & 2) != 0) {
            str2 = systemNotificationExample.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = systemNotificationExample.content;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = systemNotificationExample.lightIconLink;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = systemNotificationExample.darkIconLink;
        }
        return systemNotificationExample.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.msgName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemNotificationExample copy(String str, String str2, String str3, String str4, String str5) {
        return new SystemNotificationExample(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SystemNotificationExample)) {
            return false;
        }
        SystemNotificationExample systemNotificationExample = (SystemNotificationExample) obj;
        return Intrinsics.EZpvd((Object) this.msgName, (Object) systemNotificationExample.msgName) && Intrinsics.EZpvd((Object) this.title, (Object) systemNotificationExample.title) && Intrinsics.EZpvd((Object) this.content, (Object) systemNotificationExample.content) && Intrinsics.EZpvd((Object) this.lightIconLink, (Object) systemNotificationExample.lightIconLink) && Intrinsics.EZpvd((Object) this.darkIconLink, (Object) systemNotificationExample.darkIconLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconLink() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconLink() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgName() {
        return this.msgName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.msgName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.content;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lightIconLink;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.darkIconLink;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SystemNotificationExample(msgName=" + this.msgName + ", title=" + this.title + ", content=" + this.content + ", lightIconLink=" + this.lightIconLink + ", darkIconLink=" + this.darkIconLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.msgName);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.lightIconLink);
        parcel.writeString(this.darkIconLink);
    }

    public SystemNotificationExample(String str, String str2, String str3, String str4, String str5) {
        this.msgName = str;
        this.title = str2;
        this.content = str3;
        this.lightIconLink = str4;
        this.darkIconLink = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SystemNotificationExample(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
