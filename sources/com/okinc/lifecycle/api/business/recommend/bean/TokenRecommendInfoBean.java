package com.okinc.lifecycle.api.business.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class TokenRecommendInfoBean implements Parcelable {
    public static final int $stable = 0;
    private final TokenRecommendComponent componentType;
    private final TokenRecommendContentStyle contentStyleType;
    private final TokenRecommendTitleAlign titleAlignType;
    private final String token;
    private final String tokenPair;
    private final TokenRecommendTrackBean trackBean;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenRecommendInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent", TokenRecommendComponent.values()), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign", TokenRecommendTitleAlign.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle", TokenRecommendContentStyle.values())};

    public static final class Creator implements Parcelable.Creator<TokenRecommendInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenRecommendInfoBean(TokenRecommendComponent.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), TokenRecommendTrackBean.CREATOR.createFromParcel(parcel), TokenRecommendTitleAlign.CREATOR.createFromParcel(parcel), TokenRecommendContentStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendInfoBean[] newArray(int i) {
            return new TokenRecommendInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenRecommendInfoBean copy$default(TokenRecommendInfoBean tokenRecommendInfoBean, TokenRecommendComponent tokenRecommendComponent, String str, String str2, TokenRecommendTrackBean tokenRecommendTrackBean, TokenRecommendTitleAlign tokenRecommendTitleAlign, TokenRecommendContentStyle tokenRecommendContentStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenRecommendComponent = tokenRecommendInfoBean.componentType;
        }
        if ((i & 2) != 0) {
            str = tokenRecommendInfoBean.tokenPair;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = tokenRecommendInfoBean.token;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            tokenRecommendTrackBean = tokenRecommendInfoBean.trackBean;
        }
        TokenRecommendTrackBean tokenRecommendTrackBean2 = tokenRecommendTrackBean;
        if ((i & 16) != 0) {
            tokenRecommendTitleAlign = tokenRecommendInfoBean.titleAlignType;
        }
        TokenRecommendTitleAlign tokenRecommendTitleAlign2 = tokenRecommendTitleAlign;
        if ((i & 32) != 0) {
            tokenRecommendContentStyle = tokenRecommendInfoBean.contentStyleType;
        }
        return tokenRecommendInfoBean.copy(tokenRecommendComponent, str3, str4, tokenRecommendTrackBean2, tokenRecommendTitleAlign2, tokenRecommendContentStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendComponent component1() {
        return this.componentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendTrackBean component4() {
        return this.trackBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendTitleAlign component5() {
        return this.titleAlignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendContentStyle component6() {
        return this.contentStyleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendInfoBean copy(@NotNull TokenRecommendComponent tokenRecommendComponent, @NotNull String str, @NotNull String str2, @NotNull TokenRecommendTrackBean tokenRecommendTrackBean, @NotNull TokenRecommendTitleAlign tokenRecommendTitleAlign, @NotNull TokenRecommendContentStyle tokenRecommendContentStyle) {
        Intrinsics.checkNotNullParameter(tokenRecommendComponent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTrackBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTitleAlign, "");
        Intrinsics.checkNotNullParameter(tokenRecommendContentStyle, "");
        return new TokenRecommendInfoBean(tokenRecommendComponent, str, str2, tokenRecommendTrackBean, tokenRecommendTitleAlign, tokenRecommendContentStyle);
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
        if (!(obj instanceof TokenRecommendInfoBean)) {
            return false;
        }
        TokenRecommendInfoBean tokenRecommendInfoBean = (TokenRecommendInfoBean) obj;
        return this.componentType == tokenRecommendInfoBean.componentType && Intrinsics.EZpvd((Object) this.tokenPair, (Object) tokenRecommendInfoBean.tokenPair) && Intrinsics.EZpvd((Object) this.token, (Object) tokenRecommendInfoBean.token) && Intrinsics.EZpvd(this.trackBean, tokenRecommendInfoBean.trackBean) && this.titleAlignType == tokenRecommendInfoBean.titleAlignType && this.contentStyleType == tokenRecommendInfoBean.contentStyleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendComponent getComponentType() {
        return this.componentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendContentStyle getContentStyleType() {
        return this.contentStyleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendTitleAlign getTitleAlignType() {
        return this.titleAlignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPair() {
        return this.tokenPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendTrackBean getTrackBean() {
        return this.trackBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.componentType.hashCode() * 31) + this.tokenPair.hashCode()) * 31) + this.token.hashCode()) * 31) + this.trackBean.hashCode()) * 31) + this.titleAlignType.hashCode()) * 31) + this.contentStyleType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenRecommendInfoBean(componentType=" + this.componentType + ", tokenPair=" + this.tokenPair + ", token=" + this.token + ", trackBean=" + this.trackBean + ", titleAlignType=" + this.titleAlignType + ", contentStyleType=" + this.contentStyleType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.componentType.writeToParcel(parcel, i);
        parcel.writeString(this.tokenPair);
        parcel.writeString(this.token);
        this.trackBean.writeToParcel(parcel, i);
        this.titleAlignType.writeToParcel(parcel, i);
        this.contentStyleType.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenRecommendInfoBean> serializer() {
            return TokenRecommendInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenRecommendInfoBean(int i, TokenRecommendComponent tokenRecommendComponent, String str, String str2, TokenRecommendTrackBean tokenRecommendTrackBean, TokenRecommendTitleAlign tokenRecommendTitleAlign, TokenRecommendContentStyle tokenRecommendContentStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TokenRecommendInfoBean$$serializer.INSTANCE.getDescriptor());
        }
        this.componentType = tokenRecommendComponent;
        this.tokenPair = str;
        this.token = str2;
        if ((i & 8) == 0) {
            this.trackBean = new TokenRecommendTrackBean("", "");
        } else {
            this.trackBean = tokenRecommendTrackBean;
        }
        if ((i & 16) == 0) {
            this.titleAlignType = TokenRecommendTitleAlign.ALIGN_CENTER;
        } else {
            this.titleAlignType = tokenRecommendTitleAlign;
        }
        if ((i & 32) == 0) {
            this.contentStyleType = TokenRecommendContentStyle.FIX_SHOW_3;
        } else {
            this.contentStyleType = tokenRecommendContentStyle;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [24=4] */
    public static final /* synthetic */ void write$Self$OKLifecycle_lifecycle_api(TokenRecommendInfoBean tokenRecommendInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], tokenRecommendInfoBean.componentType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenRecommendInfoBean.tokenPair);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenRecommendInfoBean.token);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(tokenRecommendInfoBean.trackBean, new TokenRecommendTrackBean("", ""))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, TokenRecommendTrackBean$$serializer.INSTANCE, tokenRecommendInfoBean.trackBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tokenRecommendInfoBean.titleAlignType != TokenRecommendTitleAlign.ALIGN_CENTER) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], tokenRecommendInfoBean.titleAlignType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && tokenRecommendInfoBean.contentStyleType == TokenRecommendContentStyle.FIX_SHOW_3) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tokenRecommendInfoBean.contentStyleType);
    }

    public TokenRecommendInfoBean(@NotNull TokenRecommendComponent tokenRecommendComponent, @NotNull String str, @NotNull String str2, @NotNull TokenRecommendTrackBean tokenRecommendTrackBean, @NotNull TokenRecommendTitleAlign tokenRecommendTitleAlign, @NotNull TokenRecommendContentStyle tokenRecommendContentStyle) {
        Intrinsics.checkNotNullParameter(tokenRecommendComponent, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTrackBean, "");
        Intrinsics.checkNotNullParameter(tokenRecommendTitleAlign, "");
        Intrinsics.checkNotNullParameter(tokenRecommendContentStyle, "");
        this.componentType = tokenRecommendComponent;
        this.tokenPair = str;
        this.token = str2;
        this.trackBean = tokenRecommendTrackBean;
        this.titleAlignType = tokenRecommendTitleAlign;
        this.contentStyleType = tokenRecommendContentStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean:0x000b: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean:0x0008: CONSTRUCTOR (""), ("") A[MD:(java.lang.String, java.lang.String):void (m), WRAPPED] (LINE:31) call: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR) : (r11v0 com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean))
  (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign:0x0010: SGET  A[WRAPPED] (LINE:32) com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign.ALIGN_CENTER com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign) : (r12v0 com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign))
  (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle:0x0017: SGET  A[WRAPPED] (LINE:33) com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle.FIX_SHOW_3 com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle) : (r13v0 com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle))
 A[MD:(com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent, java.lang.String, java.lang.String, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle):void (m)] (LINE:27) call: com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean.<init>(com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendComponent, java.lang.String, java.lang.String, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTrackBean, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign, com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle):void type: THIS */
    public /* synthetic */ TokenRecommendInfoBean(TokenRecommendComponent tokenRecommendComponent, String str, String str2, TokenRecommendTrackBean tokenRecommendTrackBean, TokenRecommendTitleAlign tokenRecommendTitleAlign, TokenRecommendContentStyle tokenRecommendContentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenRecommendComponent, str, str2, (i & 8) != 0 ? new TokenRecommendTrackBean("", "") : tokenRecommendTrackBean, (i & 16) != 0 ? TokenRecommendTitleAlign.ALIGN_CENTER : tokenRecommendTitleAlign, (i & 32) != 0 ? TokenRecommendContentStyle.FIX_SHOW_3 : tokenRecommendContentStyle);
    }
}
