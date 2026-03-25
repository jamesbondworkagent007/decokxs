package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ShortLinkResp implements Parcelable {
    private String fullLink;
    private String shortLink;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShortLinkResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShortLinkResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortLinkResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShortLinkResp(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortLinkResp[] newArray(int i) {
            return new ShortLinkResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShortLinkResp copy$default(ShortLinkResp shortLinkResp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortLinkResp.shortLink;
        }
        if ((i & 2) != 0) {
            str2 = shortLinkResp.fullLink;
        }
        return shortLinkResp.copy(str, str2);
    }

    @SerialName("appendedLink")
    public static /* synthetic */ void getFullLink$annotations() {
    }

    @SerialName("universalLink")
    public static /* synthetic */ void getShortLink$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fullLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShortLinkResp copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ShortLinkResp(str, str2);
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
        if (!(obj instanceof ShortLinkResp)) {
            return false;
        }
        ShortLinkResp shortLinkResp = (ShortLinkResp) obj;
        return Intrinsics.EZpvd((Object) this.shortLink, (Object) shortLinkResp.shortLink) && Intrinsics.EZpvd((Object) this.fullLink, (Object) shortLinkResp.fullLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullLink() {
        return this.fullLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.shortLink.hashCode() * 31) + this.fullLink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shortLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShortLinkResp(shortLink=" + this.shortLink + ", fullLink=" + this.fullLink + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.shortLink);
        parcel.writeString(this.fullLink);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.ShortLinkResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShortLinkResp> serializer() {
            return ShortLinkResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShortLinkResp(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, ShortLinkResp$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.shortLink = "";
        } else {
            this.shortLink = str;
        }
        this.fullLink = str2;
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(ShortLinkResp shortLinkResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) shortLinkResp.shortLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, shortLinkResp.shortLink);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, shortLinkResp.fullLink);
    }

    public ShortLinkResp(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.shortLink = str;
        this.fullLink = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.share.bean.ShortLinkResp.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ShortLinkResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2);
    }
}
