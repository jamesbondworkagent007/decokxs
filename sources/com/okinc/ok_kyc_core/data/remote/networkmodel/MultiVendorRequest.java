package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MultiVendorRequest {
    private final List<KycImage> images;
    private final String mrz;
    private final String sessionId;
    private final int vendorType;
    private final int verifyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(KycImage$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiVendorRequest copy$default(MultiVendorRequest multiVendorRequest, List list, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = multiVendorRequest.images;
        }
        if ((i3 & 2) != 0) {
            i = multiVendorRequest.vendorType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = multiVendorRequest.verifyType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = multiVendorRequest.sessionId;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = multiVendorRequest.mrz;
        }
        return multiVendorRequest.copy(list, i4, i5, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KycImage> component1() {
        return this.images;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mrz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorRequest copy(@NotNull List<KycImage> list, int i, int i2, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MultiVendorRequest(list, i, i2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiVendorRequest)) {
            return false;
        }
        MultiVendorRequest multiVendorRequest = (MultiVendorRequest) obj;
        return Intrinsics.EZpvd(this.images, multiVendorRequest.images) && this.vendorType == multiVendorRequest.vendorType && this.verifyType == multiVendorRequest.verifyType && Intrinsics.EZpvd((Object) this.sessionId, (Object) multiVendorRequest.sessionId) && Intrinsics.EZpvd((Object) this.mrz, (Object) multiVendorRequest.mrz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KycImage> getImages() {
        return this.images;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMrz() {
        return this.mrz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVerifyType() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.images.hashCode();
        int iHashCode2 = Integer.hashCode(this.vendorType);
        int iHashCode3 = Integer.hashCode(this.verifyType);
        int iHashCode4 = this.sessionId.hashCode();
        String str = this.mrz;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiVendorRequest(images=" + this.images + ", vendorType=" + this.vendorType + ", verifyType=" + this.verifyType + ", sessionId=" + this.sessionId + ", mrz=" + this.mrz + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiVendorRequest> serializer() {
            return MultiVendorRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiVendorRequest(int i, List list, int i2, int i3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, MultiVendorRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.images = list;
        this.vendorType = i2;
        this.verifyType = i3;
        this.sessionId = str;
        if ((i & 16) == 0) {
            this.mrz = null;
        } else {
            this.mrz = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MultiVendorRequest multiVendorRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], multiVendorRequest.images);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, multiVendorRequest.vendorType);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, multiVendorRequest.verifyType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, multiVendorRequest.sessionId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && multiVendorRequest.mrz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, multiVendorRequest.mrz);
    }

    public MultiVendorRequest(@NotNull List<KycImage> list, int i, int i2, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.images = list;
        this.vendorType = i;
        this.verifyType = i2;
        this.sessionId = str;
        this.mrz = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.util.List)
  (r8v0 int)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.KycImage>, int, int, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorRequest.<init>(java.util.List, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MultiVendorRequest(List list, int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, str, (i3 & 16) != 0 ? null : str2);
    }
}
