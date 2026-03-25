package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCategoryBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationCategoryBean> CREATOR = new Creator();
    private final List<String> featureRestrictionList;
    private final String id;
    private final String localizedMessage;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<NotificationCategoryBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationCategoryBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NotificationCategoryBean(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationCategoryBean[] newArray(int i) {
            return new NotificationCategoryBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationCategoryBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationCategoryBean copy$default(NotificationCategoryBean notificationCategoryBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationCategoryBean.id;
        }
        if ((i & 2) != 0) {
            str2 = notificationCategoryBean.localizedMessage;
        }
        if ((i & 4) != 0) {
            list = notificationCategoryBean.featureRestrictionList;
        }
        return notificationCategoryBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localizedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.featureRestrictionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationCategoryBean copy(String str, String str2, List<String> list) {
        return new NotificationCategoryBean(str, str2, list);
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
        if (!(obj instanceof NotificationCategoryBean)) {
            return false;
        }
        NotificationCategoryBean notificationCategoryBean = (NotificationCategoryBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) notificationCategoryBean.id) && Intrinsics.EZpvd((Object) this.localizedMessage, (Object) notificationCategoryBean.localizedMessage) && Intrinsics.EZpvd(this.featureRestrictionList, notificationCategoryBean.featureRestrictionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFeatureRestrictionList() {
        return this.featureRestrictionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizedMessage() {
        return this.localizedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.localizedMessage;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.featureRestrictionList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationCategoryBean(id=" + this.id + ", localizedMessage=" + this.localizedMessage + ", featureRestrictionList=" + this.featureRestrictionList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.localizedMessage);
        parcel.writeStringList(this.featureRestrictionList);
    }

    public NotificationCategoryBean(String str, String str2, List<String> list) {
        this.id = str;
        this.localizedMessage = str2;
        this.featureRestrictionList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:9) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ NotificationCategoryBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
