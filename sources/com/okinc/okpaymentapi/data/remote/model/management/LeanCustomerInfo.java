package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LeanCustomerInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeanCustomerInfo> CREATOR = new Creator();
    private final String accessToken;
    private final String appId;
    private final String customerId;
    private final ArrayList<String> permissionList;

    public static final class Creator implements Parcelable.Creator<LeanCustomerInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeanCustomerInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LeanCustomerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeanCustomerInfo[] newArray(int i) {
            return new LeanCustomerInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeanCustomerInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okpaymentapi.data.remote.model.management.LeanCustomerInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeanCustomerInfo copy$default(LeanCustomerInfo leanCustomerInfo, String str, String str2, String str3, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leanCustomerInfo.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = leanCustomerInfo.appId;
        }
        if ((i & 4) != 0) {
            str3 = leanCustomerInfo.customerId;
        }
        if ((i & 8) != 0) {
            arrayList = leanCustomerInfo.permissionList;
        }
        return leanCustomerInfo.copy(str, str2, str3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.customerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component4() {
        return this.permissionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeanCustomerInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LeanCustomerInfo(str, str2, str3, arrayList);
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
        if (!(obj instanceof LeanCustomerInfo)) {
            return false;
        }
        LeanCustomerInfo leanCustomerInfo = (LeanCustomerInfo) obj;
        return Intrinsics.EZpvd((Object) this.accessToken, (Object) leanCustomerInfo.accessToken) && Intrinsics.EZpvd((Object) this.appId, (Object) leanCustomerInfo.appId) && Intrinsics.EZpvd((Object) this.customerId, (Object) leanCustomerInfo.customerId) && Intrinsics.EZpvd(this.permissionList, leanCustomerInfo.permissionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getPermissionList() {
        return this.permissionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accessToken.hashCode();
        int iHashCode2 = this.appId.hashCode();
        int iHashCode3 = this.customerId.hashCode();
        ArrayList<String> arrayList = this.permissionList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeanCustomerInfo(accessToken=" + this.accessToken + ", appId=" + this.appId + ", customerId=" + this.customerId + ", permissionList=" + this.permissionList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accessToken);
        parcel.writeString(this.appId);
        parcel.writeString(this.customerId);
        parcel.writeStringList(this.permissionList);
    }

    public LeanCustomerInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accessToken = str;
        this.appId = str2;
        this.customerId = str3;
        this.permissionList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0017: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>):void (m)] (LINE:9) call: com.okinc.okpaymentapi.data.remote.model.management.LeanCustomerInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ LeanCustomerInfo(String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new ArrayList() : arrayList);
    }
}
