package com.okinc.components.security.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AppHash implements Parcelable {
    private String md5;
    private String name;
    private String package_name;
    private String risk_type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AppHash> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AppHash> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppHash createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AppHash(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppHash[] newArray(int i) {
            return new AppHash[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppHash copy$default(AppHash appHash, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appHash.md5;
        }
        if ((i & 2) != 0) {
            str2 = appHash.name;
        }
        if ((i & 4) != 0) {
            str3 = appHash.package_name;
        }
        if ((i & 8) != 0) {
            str4 = appHash.risk_type;
        }
        return appHash.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.package_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.risk_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppHash copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AppHash(str, str2, str3, str4);
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
        if (!(obj instanceof AppHash)) {
            return false;
        }
        AppHash appHash = (AppHash) obj;
        return Intrinsics.EZpvd((Object) this.md5, (Object) appHash.md5) && Intrinsics.EZpvd((Object) this.name, (Object) appHash.name) && Intrinsics.EZpvd((Object) this.package_name, (Object) appHash.package_name) && Intrinsics.EZpvd((Object) this.risk_type, (Object) appHash.risk_type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPackage_name() {
        return this.package_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRisk_type() {
        return this.risk_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.md5.hashCode() * 31) + this.name.hashCode()) * 31) + this.package_name.hashCode()) * 31) + this.risk_type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.md5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPackage_name(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.package_name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRisk_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.risk_type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppHash(md5=" + this.md5 + ", name=" + this.name + ", package_name=" + this.package_name + ", risk_type=" + this.risk_type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.md5);
        parcel.writeString(this.name);
        parcel.writeString(this.package_name);
        parcel.writeString(this.risk_type);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.security.scanner.AppHash.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AppHash> serializer() {
            return AppHash$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppHash(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AppHash$$serializer.INSTANCE.getDescriptor());
        }
        this.md5 = str;
        this.name = str2;
        this.package_name = str3;
        if ((i & 8) == 0) {
            this.risk_type = "";
        } else {
            this.risk_type = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSecurity_ok_security_impl(AppHash appHash, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, appHash.md5);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, appHash.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, appHash.package_name);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) appHash.risk_type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, appHash.risk_type);
    }

    public AppHash(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.md5 = str;
        this.name = str2;
        this.package_name = str3;
        this.risk_type = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:68) call: com.okinc.components.security.scanner.AppHash.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AppHash(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
