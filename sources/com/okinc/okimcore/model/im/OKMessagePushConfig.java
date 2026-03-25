package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKMessagePushConfig implements Parcelable {
    private String pushContent;
    private String pushData;
    private String pushTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKMessagePushConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OKMessagePushConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMessagePushConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKMessagePushConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMessagePushConfig[] newArray(int i) {
            return new OKMessagePushConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKMessagePushConfig() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKMessagePushConfig copy$default(OKMessagePushConfig oKMessagePushConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKMessagePushConfig.pushTitle;
        }
        if ((i & 2) != 0) {
            str2 = oKMessagePushConfig.pushContent;
        }
        if ((i & 4) != 0) {
            str3 = oKMessagePushConfig.pushData;
        }
        return oKMessagePushConfig.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pushTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pushContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pushData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessagePushConfig copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OKMessagePushConfig(str, str2, str3);
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
        if (!(obj instanceof OKMessagePushConfig)) {
            return false;
        }
        OKMessagePushConfig oKMessagePushConfig = (OKMessagePushConfig) obj;
        return Intrinsics.EZpvd((Object) this.pushTitle, (Object) oKMessagePushConfig.pushTitle) && Intrinsics.EZpvd((Object) this.pushContent, (Object) oKMessagePushConfig.pushContent) && Intrinsics.EZpvd((Object) this.pushData, (Object) oKMessagePushConfig.pushData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushContent() {
        return this.pushContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushData() {
        return this.pushData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushTitle() {
        return this.pushTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pushTitle.hashCode();
        int iHashCode2 = this.pushContent.hashCode();
        String str = this.pushData;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pushContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushData(String str) {
        this.pushData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pushTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKMessagePushConfig(pushTitle=" + this.pushTitle + ", pushContent=" + this.pushContent + ", pushData=" + this.pushData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pushTitle);
        parcel.writeString(this.pushContent);
        parcel.writeString(this.pushData);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMessagePushConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKMessagePushConfig> serializer() {
            return OKMessagePushConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKMessagePushConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pushTitle = "";
        } else {
            this.pushTitle = str;
        }
        if ((i & 2) == 0) {
            this.pushContent = "";
        } else {
            this.pushContent = str2;
        }
        if ((i & 4) == 0) {
            this.pushData = "";
        } else {
            this.pushData = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKMessagePushConfig oKMessagePushConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKMessagePushConfig.pushTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKMessagePushConfig.pushTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKMessagePushConfig.pushContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKMessagePushConfig.pushContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) oKMessagePushConfig.pushData, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, oKMessagePushConfig.pushData);
    }

    public OKMessagePushConfig(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pushTitle = str;
        this.pushContent = str2;
        this.pushData = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.okimcore.model.im.OKMessagePushConfig.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OKMessagePushConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
