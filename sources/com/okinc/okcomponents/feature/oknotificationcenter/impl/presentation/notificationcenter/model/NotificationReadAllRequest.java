package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationReadAllRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<NotificationReadAllRequest> CREATOR = new Creator();
    private final String category;
    private final String categoryType;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<NotificationReadAllRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReadAllRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NotificationReadAllRequest(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReadAllRequest[] newArray(int i) {
            return new NotificationReadAllRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationReadAllRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotificationReadAllRequest copy$default(NotificationReadAllRequest notificationReadAllRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationReadAllRequest.category;
        }
        if ((i & 2) != 0) {
            str2 = notificationReadAllRequest.categoryType;
        }
        return notificationReadAllRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.categoryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationReadAllRequest copy(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new NotificationReadAllRequest(str, str2);
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
        if (!(obj instanceof NotificationReadAllRequest)) {
            return false;
        }
        NotificationReadAllRequest notificationReadAllRequest = (NotificationReadAllRequest) obj;
        return Intrinsics.EZpvd((Object) this.category, (Object) notificationReadAllRequest.category) && Intrinsics.EZpvd((Object) this.categoryType, (Object) notificationReadAllRequest.categoryType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryType() {
        return this.categoryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.category;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.categoryType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationReadAllRequest(category=" + this.category + ", categoryType=" + this.categoryType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.category);
        parcel.writeString(this.categoryType);
    }

    public NotificationReadAllRequest(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.category = str;
        this.categoryType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: INVOKE 
  (wrap:com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType:0x0009: SGET  A[WRAPPED] (LINE:12) com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType.New com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType)
 VIRTUAL call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:12)) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.model.NotificationReadAllRequest.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NotificationReadAllRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? NotificationCategoryType.New.getValue() : str2);
    }
}
