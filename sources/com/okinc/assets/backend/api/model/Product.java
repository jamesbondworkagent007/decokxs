package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class Product {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final double apr;
    private final String aprText;
    private final String buttonText;
    private final String description;
    private final String redirectUrl;
    private final ProductTag tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Product copy$default(Product product, String str, String str2, double d, String str3, ProductTag productTag, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = product.description;
        }
        if ((i & 2) != 0) {
            str2 = product.aprText;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            d = product.apr;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            str3 = product.buttonText;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            productTag = product.tag;
        }
        ProductTag productTag2 = productTag;
        if ((i & 32) != 0) {
            str4 = product.redirectUrl;
        }
        return product.copy(str, str5, d2, str6, productTag2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.aprText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component3() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductTag component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Product copy(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull ProductTag productTag, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(productTag, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new Product(str, str2, d, str3, productTag, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return Intrinsics.EZpvd((Object) this.description, (Object) product.description) && Intrinsics.EZpvd((Object) this.aprText, (Object) product.aprText) && Double.compare(this.apr, product.apr) == 0 && Intrinsics.EZpvd((Object) this.buttonText, (Object) product.buttonText) && Intrinsics.EZpvd(this.tag, product.tag) && Intrinsics.EZpvd((Object) this.redirectUrl, (Object) product.redirectUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getApr() {
        return this.apr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAprText() {
        return this.aprText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductTag getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.description.hashCode() * 31) + this.aprText.hashCode()) * 31) + Double.hashCode(this.apr)) * 31) + this.buttonText.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.redirectUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Product(description=" + this.description + ", aprText=" + this.aprText + ", apr=" + this.apr + ", buttonText=" + this.buttonText + ", tag=" + this.tag + ", redirectUrl=" + this.redirectUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.Product.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Product> serializer() {
            return Product$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Product(int i, String str, String str2, double d, String str3, ProductTag productTag, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, Product$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.aprText = str2;
        this.apr = d;
        this.buttonText = str3;
        this.tag = productTag;
        this.redirectUrl = str4;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(Product product, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, product.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, product.aprText);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 2, product.apr);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, product.buttonText);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, ProductTag$$serializer.INSTANCE, product.tag);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, product.redirectUrl);
    }

    public Product(@NotNull String str, @NotNull String str2, double d, @NotNull String str3, @NotNull ProductTag productTag, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(productTag, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.description = str;
        this.aprText = str2;
        this.apr = d;
        this.buttonText = str3;
        this.tag = productTag;
        this.redirectUrl = str4;
    }
}
