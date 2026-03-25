package com.okinc.crcore.coreapi.net.responsebean;

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
public final class PMSProduct {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String darkIconLink;
    private final String deepLink;
    private final String lightIconLink;
    private final String productId;
    private final String productType;
    private final String riskLevel;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PMSProduct copy$default(PMSProduct pMSProduct, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pMSProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = pMSProduct.productType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = pMSProduct.title;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = pMSProduct.riskLevel;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = pMSProduct.lightIconLink;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = pMSProduct.darkIconLink;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = pMSProduct.deepLink;
        }
        return pMSProduct.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PMSProduct copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PMSProduct(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMSProduct)) {
            return false;
        }
        PMSProduct pMSProduct = (PMSProduct) obj;
        return Intrinsics.EZpvd((Object) this.productId, (Object) pMSProduct.productId) && Intrinsics.EZpvd((Object) this.productType, (Object) pMSProduct.productType) && Intrinsics.EZpvd((Object) this.title, (Object) pMSProduct.title) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) pMSProduct.riskLevel) && Intrinsics.EZpvd((Object) this.lightIconLink, (Object) pMSProduct.lightIconLink) && Intrinsics.EZpvd((Object) this.darkIconLink, (Object) pMSProduct.darkIconLink) && Intrinsics.EZpvd((Object) this.deepLink, (Object) pMSProduct.deepLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconLink() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconLink() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.productId.hashCode() * 31) + this.productType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.lightIconLink.hashCode()) * 31) + this.darkIconLink.hashCode()) * 31) + this.deepLink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PMSProduct(productId=" + this.productId + ", productType=" + this.productType + ", title=" + this.title + ", riskLevel=" + this.riskLevel + ", lightIconLink=" + this.lightIconLink + ", darkIconLink=" + this.darkIconLink + ", deepLink=" + this.deepLink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PMSProduct.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PMSProduct> serializer() {
            return PMSProduct$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PMSProduct(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, PMSProduct$$serializer.INSTANCE.getDescriptor());
        }
        this.productId = str;
        this.productType = str2;
        this.title = str3;
        this.riskLevel = str4;
        this.lightIconLink = str5;
        this.darkIconLink = str6;
        this.deepLink = str7;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PMSProduct pMSProduct, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pMSProduct.productId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pMSProduct.productType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pMSProduct.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pMSProduct.riskLevel);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, pMSProduct.lightIconLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, pMSProduct.darkIconLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, pMSProduct.deepLink);
    }

    public PMSProduct(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.productId = str;
        this.productType = str2;
        this.title = str3;
        this.riskLevel = str4;
        this.lightIconLink = str5;
        this.darkIconLink = str6;
        this.deepLink = str7;
    }
}
