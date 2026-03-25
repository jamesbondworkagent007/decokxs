package com.okinc.crcore.coreapi.net.responsebean.content;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunitySourceResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final CommunitySourceIconBean icon;
    private final String platform;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CommunitySourceResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommunitySourceResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunitySourceResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommunitySourceResponseBean(parcel.readString(), parcel.readInt() == 0 ? null : CommunitySourceIconBean.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunitySourceResponseBean[] newArray(int i) {
            return new CommunitySourceResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommunitySourceResponseBean copy$default(CommunitySourceResponseBean communitySourceResponseBean, String str, CommunitySourceIconBean communitySourceIconBean, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communitySourceResponseBean.platform;
        }
        if ((i & 2) != 0) {
            communitySourceIconBean = communitySourceResponseBean.icon;
        }
        if ((i & 4) != 0) {
            str2 = communitySourceResponseBean.url;
        }
        return communitySourceResponseBean.copy(str, communitySourceIconBean, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunitySourceIconBean component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunitySourceResponseBean copy(String str, CommunitySourceIconBean communitySourceIconBean, String str2) {
        return new CommunitySourceResponseBean(str, communitySourceIconBean, str2);
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
        if (!(obj instanceof CommunitySourceResponseBean)) {
            return false;
        }
        CommunitySourceResponseBean communitySourceResponseBean = (CommunitySourceResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.platform, (Object) communitySourceResponseBean.platform) && Intrinsics.EZpvd(this.icon, communitySourceResponseBean.icon) && Intrinsics.EZpvd((Object) this.url, (Object) communitySourceResponseBean.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunitySourceIconBean getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.platform;
        int iHashCode = str == null ? 0 : str.hashCode();
        CommunitySourceIconBean communitySourceIconBean = this.icon;
        int iHashCode2 = communitySourceIconBean == null ? 0 : communitySourceIconBean.hashCode();
        String str2 = this.url;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunitySourceResponseBean(platform=" + this.platform + ", icon=" + this.icon + ", url=" + this.url + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.platform);
        CommunitySourceIconBean communitySourceIconBean = this.icon;
        if (communitySourceIconBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            communitySourceIconBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunitySourceResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunitySourceResponseBean> serializer() {
            return CommunitySourceResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunitySourceResponseBean(int i, String str, CommunitySourceIconBean communitySourceIconBean, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CommunitySourceResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.platform = str;
        this.icon = communitySourceIconBean;
        this.url = str2;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunitySourceResponseBean communitySourceResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, communitySourceResponseBean.platform);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CommunitySourceIconBean$$serializer.INSTANCE, communitySourceResponseBean.icon);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, communitySourceResponseBean.url);
    }

    public CommunitySourceResponseBean(String str, CommunitySourceIconBean communitySourceIconBean, String str2) {
        this.platform = str;
        this.icon = communitySourceIconBean;
        this.url = str2;
    }
}
