package com.okinc.account.api.mock;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class MockApiEndpoint implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MockApiEndpoint> CREATOR = new Creator();
    private final String groupName;
    private final String httpMethod;
    private final String urlPath;

    public static final class Creator implements Parcelable.Creator<MockApiEndpoint> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MockApiEndpoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MockApiEndpoint(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MockApiEndpoint[] newArray(int i) {
            return new MockApiEndpoint[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MockApiEndpoint copy$default(MockApiEndpoint mockApiEndpoint, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mockApiEndpoint.groupName;
        }
        if ((i & 2) != 0) {
            str2 = mockApiEndpoint.httpMethod;
        }
        if ((i & 4) != 0) {
            str3 = mockApiEndpoint.urlPath;
        }
        return mockApiEndpoint.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.httpMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.urlPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MockApiEndpoint copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MockApiEndpoint(str, str2, str3);
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
        if (!(obj instanceof MockApiEndpoint)) {
            return false;
        }
        MockApiEndpoint mockApiEndpoint = (MockApiEndpoint) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) mockApiEndpoint.groupName) && Intrinsics.EZpvd((Object) this.httpMethod, (Object) mockApiEndpoint.httpMethod) && Intrinsics.EZpvd((Object) this.urlPath, (Object) mockApiEndpoint.urlPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlPath() {
        return this.urlPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.groupName.hashCode() * 31) + this.httpMethod.hashCode()) * 31) + this.urlPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupName);
        parcel.writeString(this.httpMethod);
        parcel.writeString(this.urlPath);
    }

    public MockApiEndpoint(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.groupName = str;
        this.httpMethod = str2;
        this.urlPath = str3;
    }

    public String toString() {
        return "[" + this.httpMethod + "] " + this.urlPath;
    }
}
