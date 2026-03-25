package com.okinc.crcore.coreapi.net.responsebean.content;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunityImageResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final int height;
    private final String srcKey;
    private final String url;
    private final int width;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CommunityImageResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommunityImageResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityImageResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommunityImageResponseBean(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityImageResponseBean[] newArray(int i) {
            return new CommunityImageResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommunityImageResponseBean() {
        this((String) null, (String) null, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommunityImageResponseBean copy$default(CommunityImageResponseBean communityImageResponseBean, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = communityImageResponseBean.srcKey;
        }
        if ((i3 & 2) != 0) {
            str2 = communityImageResponseBean.url;
        }
        if ((i3 & 4) != 0) {
            i = communityImageResponseBean.width;
        }
        if ((i3 & 8) != 0) {
            i2 = communityImageResponseBean.height;
        }
        return communityImageResponseBean.copy(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.srcKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityImageResponseBean copy(String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new CommunityImageResponseBean(str, str2, i, i2);
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
        if (!(obj instanceof CommunityImageResponseBean)) {
            return false;
        }
        CommunityImageResponseBean communityImageResponseBean = (CommunityImageResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.srcKey, (Object) communityImageResponseBean.srcKey) && Intrinsics.EZpvd((Object) this.url, (Object) communityImageResponseBean.url) && this.width == communityImageResponseBean.width && this.height == communityImageResponseBean.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSrcKey() {
        return this.srcKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.srcKey;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityImageResponseBean(srcKey=" + this.srcKey + ", url=" + this.url + ", width=" + this.width + ", height=" + this.height + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.srcKey);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityImageResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityImageResponseBean> serializer() {
            return CommunityImageResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityImageResponseBean(int i, String str, String str2, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.srcKey = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.width = 0;
        } else {
            this.width = i2;
        }
        if ((i & 8) == 0) {
            this.height = 0;
        } else {
            this.height = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunityImageResponseBean communityImageResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || communityImageResponseBean.srcKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, communityImageResponseBean.srcKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) communityImageResponseBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, communityImageResponseBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || communityImageResponseBean.width != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, communityImageResponseBean.width);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && communityImageResponseBean.height == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, communityImageResponseBean.height);
    }

    public CommunityImageResponseBean(String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.srcKey = str;
        this.url = str2;
        this.width = i;
        this.height = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.String, java.lang.String, int, int):void (m)] (LINE:13) call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityImageResponseBean.<init>(java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ CommunityImageResponseBean(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
