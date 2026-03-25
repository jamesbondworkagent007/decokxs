package com.okinc.crcore.coreapi.net.requestbean.community;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunityLikeRequestBean implements Parcelable {
    public static final int $stable = 0;
    private final String contentId;
    private final boolean isLiked;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CommunityLikeRequestBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommunityLikeRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityLikeRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommunityLikeRequestBean(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityLikeRequestBean[] newArray(int i) {
            return new CommunityLikeRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommunityLikeRequestBean copy$default(CommunityLikeRequestBean communityLikeRequestBean, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communityLikeRequestBean.contentId;
        }
        if ((i & 2) != 0) {
            z = communityLikeRequestBean.isLiked;
        }
        return communityLikeRequestBean.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isLiked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityLikeRequestBean copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CommunityLikeRequestBean(str, z);
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
        if (!(obj instanceof CommunityLikeRequestBean)) {
            return false;
        }
        CommunityLikeRequestBean communityLikeRequestBean = (CommunityLikeRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.contentId, (Object) communityLikeRequestBean.contentId) && this.isLiked == communityLikeRequestBean.isLiked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.contentId.hashCode() * 31) + Boolean.hashCode(this.isLiked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLiked() {
        return this.isLiked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityLikeRequestBean(contentId=" + this.contentId + ", isLiked=" + this.isLiked + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contentId);
        parcel.writeInt(this.isLiked ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.community.CommunityLikeRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityLikeRequestBean> serializer() {
            return CommunityLikeRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityLikeRequestBean(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CommunityLikeRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        this.contentId = str;
        this.isLiked = z;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunityLikeRequestBean communityLikeRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, communityLikeRequestBean.contentId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, communityLikeRequestBean.isLiked);
    }

    public CommunityLikeRequestBean(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentId = str;
        this.isLiked = z;
    }
}
