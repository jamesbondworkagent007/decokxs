package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
public final class KycImage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String height;
    private final long imageId;
    private final int imageType;
    private final String name;
    private final String width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KycImage copy$default(KycImage kycImage, long j, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = kycImage.imageId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = kycImage.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = kycImage.imageType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = kycImage.width;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = kycImage.height;
        }
        return kycImage.copy(j2, str4, i3, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycImage copy(long j, @NotNull String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new KycImage(j, str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycImage)) {
            return false;
        }
        KycImage kycImage = (KycImage) obj;
        return this.imageId == kycImage.imageId && Intrinsics.EZpvd((Object) this.name, (Object) kycImage.name) && this.imageType == kycImage.imageType && Intrinsics.EZpvd((Object) this.width, (Object) kycImage.width) && Intrinsics.EZpvd((Object) this.height, (Object) kycImage.height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImageType() {
        return this.imageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.imageId);
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = Integer.hashCode(this.imageType);
        String str = this.width;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.height;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KycImage(imageId=" + this.imageId + ", name=" + this.name + ", imageType=" + this.imageType + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.KycImage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KycImage> serializer() {
            return KycImage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KycImage(int i, long j, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, KycImage$$serializer.INSTANCE.getDescriptor());
        }
        this.imageId = j;
        this.name = str;
        this.imageType = i2;
        if ((i & 8) == 0) {
            this.width = null;
        } else {
            this.width = str2;
        }
        if ((i & 16) == 0) {
            this.height = null;
        } else {
            this.height = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(KycImage kycImage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, kycImage.imageId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, kycImage.name);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, kycImage.imageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || kycImage.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kycImage.width);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && kycImage.height == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, kycImage.height);
    }

    public KycImage(long j, @NotNull String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageId = j;
        this.name = str;
        this.imageType = i;
        this.width = str2;
        this.height = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 java.lang.String)
  (r13v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(long, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.ok_kyc_core.data.remote.networkmodel.KycImage.<init>(long, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KycImage(long j, String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }
}
