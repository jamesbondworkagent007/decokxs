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
public final class ProductIcon {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String darkMode;
    private final String lightMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProductIcon copy$default(ProductIcon productIcon, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productIcon.darkMode;
        }
        if ((i & 2) != 0) {
            str2 = productIcon.lightMode;
        }
        return productIcon.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.darkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lightMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductIcon copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ProductIcon(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductIcon)) {
            return false;
        }
        ProductIcon productIcon = (ProductIcon) obj;
        return Intrinsics.EZpvd((Object) this.darkMode, (Object) productIcon.darkMode) && Intrinsics.EZpvd((Object) this.lightMode, (Object) productIcon.lightMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkMode() {
        return this.darkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightMode() {
        return this.lightMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.darkMode.hashCode() * 31) + this.lightMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductIcon(darkMode=" + this.darkMode + ", lightMode=" + this.lightMode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.ProductIcon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductIcon> serializer() {
            return ProductIcon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductIcon(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ProductIcon$$serializer.INSTANCE.getDescriptor());
        }
        this.darkMode = str;
        this.lightMode = str2;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(ProductIcon productIcon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, productIcon.darkMode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, productIcon.lightMode);
    }

    public ProductIcon(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.darkMode = str;
        this.lightMode = str2;
    }
}
