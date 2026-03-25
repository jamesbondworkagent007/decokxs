package com.okinc.lifecycle.api.business.recommend.bean;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class TokenRecommendClickItemBean implements Parcelable {
    public static final int $stable = 0;
    private final String fullName;
    private final long tokenId;
    private final String tokenName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenRecommendClickItemBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenRecommendClickItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendClickItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenRecommendClickItemBean(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendClickItemBean[] newArray(int i) {
            return new TokenRecommendClickItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenRecommendClickItemBean copy$default(TokenRecommendClickItemBean tokenRecommendClickItemBean, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tokenRecommendClickItemBean.tokenId;
        }
        if ((i & 2) != 0) {
            str = tokenRecommendClickItemBean.tokenName;
        }
        if ((i & 4) != 0) {
            str2 = tokenRecommendClickItemBean.fullName;
        }
        return tokenRecommendClickItemBean.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendClickItemBean copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TokenRecommendClickItemBean(j, str, str2);
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
        if (!(obj instanceof TokenRecommendClickItemBean)) {
            return false;
        }
        TokenRecommendClickItemBean tokenRecommendClickItemBean = (TokenRecommendClickItemBean) obj;
        return this.tokenId == tokenRecommendClickItemBean.tokenId && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenRecommendClickItemBean.tokenName) && Intrinsics.EZpvd((Object) this.fullName, (Object) tokenRecommendClickItemBean.fullName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.tokenId) * 31) + this.tokenName.hashCode()) * 31) + this.fullName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenRecommendClickItemBean(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", fullName=" + this.fullName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.tokenId);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.fullName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendClickItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenRecommendClickItemBean> serializer() {
            return TokenRecommendClickItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenRecommendClickItemBean(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TokenRecommendClickItemBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenId = j;
        this.tokenName = str;
        this.fullName = str2;
    }

    public static final /* synthetic */ void write$Self$OKLifecycle_lifecycle_api(TokenRecommendClickItemBean tokenRecommendClickItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, tokenRecommendClickItemBean.tokenId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenRecommendClickItemBean.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenRecommendClickItemBean.fullName);
    }

    public TokenRecommendClickItemBean(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenId = j;
        this.tokenName = str;
        this.fullName = str2;
    }
}
