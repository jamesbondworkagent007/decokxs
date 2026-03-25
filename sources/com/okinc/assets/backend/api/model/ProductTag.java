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
public final class ProductTag {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ProductIcon icon;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProductTag copy$default(ProductTag productTag, ProductIcon productIcon, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productIcon = productTag.icon;
        }
        if ((i & 2) != 0) {
            str = productTag.value;
        }
        return productTag.copy(productIcon, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductIcon component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductTag copy(@NotNull ProductIcon productIcon, @NotNull String str) {
        Intrinsics.checkNotNullParameter(productIcon, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ProductTag(productIcon, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTag)) {
            return false;
        }
        ProductTag productTag = (ProductTag) obj;
        return Intrinsics.EZpvd(this.icon, productTag.icon) && Intrinsics.EZpvd((Object) this.value, (Object) productTag.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductIcon getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.icon.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductTag(icon=" + this.icon + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ProductTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductTag> serializer() {
            return ProductTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductTag(int i, ProductIcon productIcon, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ProductTag$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = productIcon;
        this.value = str;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(ProductTag productTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, ProductIcon$$serializer.INSTANCE, productTag.icon);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, productTag.value);
    }

    public ProductTag(@NotNull ProductIcon productIcon, @NotNull String str) {
        Intrinsics.checkNotNullParameter(productIcon, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = productIcon;
        this.value = str;
    }
}
