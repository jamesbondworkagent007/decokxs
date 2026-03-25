package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WebDeskModeConfig implements Parcelable {
    private Integer platform;
    private Integer type;
    private String ua;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WebDeskModeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WebDeskModeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebDeskModeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WebDeskModeConfig(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebDeskModeConfig[] newArray(int i) {
            return new WebDeskModeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WebDeskModeConfig copy$default(WebDeskModeConfig webDeskModeConfig, String str, Integer num, String str2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webDeskModeConfig.url;
        }
        if ((i & 2) != 0) {
            num = webDeskModeConfig.type;
        }
        if ((i & 4) != 0) {
            str2 = webDeskModeConfig.ua;
        }
        if ((i & 8) != 0) {
            num2 = webDeskModeConfig.platform;
        }
        return webDeskModeConfig.copy(str, num, str2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebDeskModeConfig copy(@NotNull String str, Integer num, String str2, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WebDeskModeConfig(str, num, str2, num2);
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
        if (!(obj instanceof WebDeskModeConfig)) {
            return false;
        }
        WebDeskModeConfig webDeskModeConfig = (WebDeskModeConfig) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) webDeskModeConfig.url) && Intrinsics.EZpvd(this.type, webDeskModeConfig.type) && Intrinsics.EZpvd((Object) this.ua, (Object) webDeskModeConfig.ua) && Intrinsics.EZpvd(this.platform, webDeskModeConfig.platform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUa() {
        return this.ua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.url.hashCode();
        Integer num = this.type;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.ua;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num2 = this.platform;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(Integer num) {
        this.platform = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUa(String str) {
        this.ua = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebDeskModeConfig(url=" + this.url + ", type=" + this.type + ", ua=" + this.ua + ", platform=" + this.platform + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.ua);
        Integer num2 = this.platform;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.WebDeskModeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebDeskModeConfig> serializer() {
            return WebDeskModeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WebDeskModeConfig(int i, String str, Integer num, String str2, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WebDeskModeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 4) == 0) {
            this.ua = null;
        } else {
            this.ua = str2;
        }
        if ((i & 8) == 0) {
            this.platform = null;
        } else {
            this.platform = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(WebDeskModeConfig webDeskModeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, webDeskModeConfig.url);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || webDeskModeConfig.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, webDeskModeConfig.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || webDeskModeConfig.ua != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, webDeskModeConfig.ua);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && webDeskModeConfig.platform == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, webDeskModeConfig.platform);
    }

    public WebDeskModeConfig(@NotNull String str, Integer num, String str2, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.type = num;
        this.ua = str2;
        this.platform = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:188) call: com.okinc.business.defi.dapp.net.WebDeskModeConfig.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ WebDeskModeConfig(String str, Integer num, String str2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
