package com.okinc.business.defi.dapp.net;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OKCheckLeveldappInfo implements Parcelable {
    private int category;
    private long id;
    private String logo;
    private String name;
    private String shortDescribe;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKCheckLeveldappInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKCheckLeveldappInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKCheckLeveldappInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCheckLeveldappInfo(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKCheckLeveldappInfo[] newArray(int i) {
            return new OKCheckLeveldappInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKCheckLeveldappInfo copy$default(OKCheckLeveldappInfo oKCheckLeveldappInfo, String str, int i, long j, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oKCheckLeveldappInfo.url;
        }
        if ((i2 & 2) != 0) {
            i = oKCheckLeveldappInfo.category;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = oKCheckLeveldappInfo.id;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            str2 = oKCheckLeveldappInfo.logo;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = oKCheckLeveldappInfo.shortDescribe;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = oKCheckLeveldappInfo.name;
        }
        return oKCheckLeveldappInfo.copy(str, i3, j2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCheckLeveldappInfo copy(@NotNull String str, int i, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OKCheckLeveldappInfo(str, i, j, str2, str3, str4);
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
        if (!(obj instanceof OKCheckLeveldappInfo)) {
            return false;
        }
        OKCheckLeveldappInfo oKCheckLeveldappInfo = (OKCheckLeveldappInfo) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) oKCheckLeveldappInfo.url) && this.category == oKCheckLeveldappInfo.category && this.id == oKCheckLeveldappInfo.id && Intrinsics.EZpvd((Object) this.logo, (Object) oKCheckLeveldappInfo.logo) && Intrinsics.EZpvd((Object) this.shortDescribe, (Object) oKCheckLeveldappInfo.shortDescribe) && Intrinsics.EZpvd((Object) this.name, (Object) oKCheckLeveldappInfo.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortDescribe() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + Integer.hashCode(this.category)) * 31) + Long.hashCode(this.id)) * 31) + this.logo.hashCode()) * 31) + this.shortDescribe.hashCode()) * 31) + this.name.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(int i) {
        this.category = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortDescribe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKCheckLeveldappInfo(url=" + this.url + ", category=" + this.category + ", id=" + this.id + ", logo=" + this.logo + ", shortDescribe=" + this.shortDescribe + ", name=" + this.name + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        parcel.writeInt(this.category);
        parcel.writeLong(this.id);
        parcel.writeString(this.logo);
        parcel.writeString(this.shortDescribe);
        parcel.writeString(this.name);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCheckLeveldappInfo> serializer() {
            return OKCheckLeveldappInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKCheckLeveldappInfo(int i, String str, int i2, long j, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, OKCheckLeveldappInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.category = i2;
        if ((i & 4) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 8) == 0) {
            this.logo = "";
        } else {
            this.logo = str2;
        }
        this.shortDescribe = str3;
        if ((i & 32) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(OKCheckLeveldappInfo oKCheckLeveldappInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCheckLeveldappInfo.url);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, oKCheckLeveldappInfo.category);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || oKCheckLeveldappInfo.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, oKCheckLeveldappInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oKCheckLeveldappInfo.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, oKCheckLeveldappInfo.logo);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, oKCheckLeveldappInfo.shortDescribe);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) oKCheckLeveldappInfo.name, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, oKCheckLeveldappInfo.name);
    }

    public OKCheckLeveldappInfo(@NotNull String str, int i, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.url = str;
        this.category = i;
        this.id = j;
        this.logo = str2;
        this.shortDescribe = str3;
        this.name = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 int)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:89) call: com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OKCheckLeveldappInfo(String str, int i, long j, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str2, str3, (i2 & 32) != 0 ? "" : str4);
    }
}
