package com.okinc.resource.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CombinedResourceRequestBody {
    private final DynamicResourceUpdateRequestBody file;
    private final MiniAppUpdateRequestBody miniapp;
    private final MlnUpdateRequest oklua;
    private final MlnUpdateRequest preDownload;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CombinedResourceRequestBody() {
        this((MlnUpdateRequest) null, (DynamicResourceUpdateRequestBody) null, (MiniAppUpdateRequestBody) null, (MlnUpdateRequest) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CombinedResourceRequestBody copy$default(CombinedResourceRequestBody combinedResourceRequestBody, MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2, int i, Object obj) {
        if ((i & 1) != 0) {
            mlnUpdateRequest = combinedResourceRequestBody.oklua;
        }
        if ((i & 2) != 0) {
            dynamicResourceUpdateRequestBody = combinedResourceRequestBody.file;
        }
        if ((i & 4) != 0) {
            miniAppUpdateRequestBody = combinedResourceRequestBody.miniapp;
        }
        if ((i & 8) != 0) {
            mlnUpdateRequest2 = combinedResourceRequestBody.preDownload;
        }
        return combinedResourceRequestBody.copy(mlnUpdateRequest, dynamicResourceUpdateRequestBody, miniAppUpdateRequestBody, mlnUpdateRequest2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateRequest component1() {
        return this.oklua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicResourceUpdateRequestBody component2() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniAppUpdateRequestBody component3() {
        return this.miniapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateRequest component4() {
        return this.preDownload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CombinedResourceRequestBody copy(MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2) {
        return new CombinedResourceRequestBody(mlnUpdateRequest, dynamicResourceUpdateRequestBody, miniAppUpdateRequestBody, mlnUpdateRequest2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedResourceRequestBody)) {
            return false;
        }
        CombinedResourceRequestBody combinedResourceRequestBody = (CombinedResourceRequestBody) obj;
        return Intrinsics.EZpvd(this.oklua, combinedResourceRequestBody.oklua) && Intrinsics.EZpvd(this.file, combinedResourceRequestBody.file) && Intrinsics.EZpvd(this.miniapp, combinedResourceRequestBody.miniapp) && Intrinsics.EZpvd(this.preDownload, combinedResourceRequestBody.preDownload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicResourceUpdateRequestBody getFile() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MiniAppUpdateRequestBody getMiniapp() {
        return this.miniapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateRequest getOklua() {
        return this.oklua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateRequest getPreDownload() {
        return this.preDownload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MlnUpdateRequest mlnUpdateRequest = this.oklua;
        int iHashCode = mlnUpdateRequest == null ? 0 : mlnUpdateRequest.hashCode();
        DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody = this.file;
        int iHashCode2 = dynamicResourceUpdateRequestBody == null ? 0 : dynamicResourceUpdateRequestBody.hashCode();
        MiniAppUpdateRequestBody miniAppUpdateRequestBody = this.miniapp;
        int iHashCode3 = miniAppUpdateRequestBody == null ? 0 : miniAppUpdateRequestBody.hashCode();
        MlnUpdateRequest mlnUpdateRequest2 = this.preDownload;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (mlnUpdateRequest2 != null ? mlnUpdateRequest2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CombinedResourceRequestBody(oklua=" + this.oklua + ", file=" + this.file + ", miniapp=" + this.miniapp + ", preDownload=" + this.preDownload + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.resource.request.CombinedResourceRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedResourceRequestBody> serializer() {
            return CombinedResourceRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CombinedResourceRequestBody(int i, MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.oklua = null;
        } else {
            this.oklua = mlnUpdateRequest;
        }
        if ((i & 2) == 0) {
            this.file = null;
        } else {
            this.file = dynamicResourceUpdateRequestBody;
        }
        if ((i & 4) == 0) {
            this.miniapp = null;
        } else {
            this.miniapp = miniAppUpdateRequestBody;
        }
        if ((i & 8) == 0) {
            this.preDownload = null;
        } else {
            this.preDownload = mlnUpdateRequest2;
        }
    }

    public static final /* synthetic */ void write$Self$OKRuntime_ok_runtime(CombinedResourceRequestBody combinedResourceRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || combinedResourceRequestBody.oklua != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MlnUpdateRequest$$serializer.INSTANCE, combinedResourceRequestBody.oklua);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || combinedResourceRequestBody.file != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DynamicResourceUpdateRequestBody$$serializer.INSTANCE, combinedResourceRequestBody.file);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || combinedResourceRequestBody.miniapp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, MiniAppUpdateRequestBody$$serializer.INSTANCE, combinedResourceRequestBody.miniapp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && combinedResourceRequestBody.preDownload == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, MlnUpdateRequest$$serializer.INSTANCE, combinedResourceRequestBody.preDownload);
    }

    public CombinedResourceRequestBody(MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2) {
        this.oklua = mlnUpdateRequest;
        this.file = dynamicResourceUpdateRequestBody;
        this.miniapp = miniAppUpdateRequestBody;
        this.preDownload = mlnUpdateRequest2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.resource.request.MlnUpdateRequest:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.resource.request.MlnUpdateRequest) : (r2v0 com.okinc.resource.request.MlnUpdateRequest))
  (wrap:com.okinc.resource.request.DynamicResourceUpdateRequestBody:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.resource.request.DynamicResourceUpdateRequestBody) : (r3v0 com.okinc.resource.request.DynamicResourceUpdateRequestBody))
  (wrap:com.okinc.resource.request.MiniAppUpdateRequestBody:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.resource.request.MiniAppUpdateRequestBody) : (r4v0 com.okinc.resource.request.MiniAppUpdateRequestBody))
  (wrap:com.okinc.resource.request.MlnUpdateRequest:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.resource.request.MlnUpdateRequest) : (r5v0 com.okinc.resource.request.MlnUpdateRequest))
 A[MD:(com.okinc.resource.request.MlnUpdateRequest, com.okinc.resource.request.DynamicResourceUpdateRequestBody, com.okinc.resource.request.MiniAppUpdateRequestBody, com.okinc.resource.request.MlnUpdateRequest):void (m)] (LINE:8) call: com.okinc.resource.request.CombinedResourceRequestBody.<init>(com.okinc.resource.request.MlnUpdateRequest, com.okinc.resource.request.DynamicResourceUpdateRequestBody, com.okinc.resource.request.MiniAppUpdateRequestBody, com.okinc.resource.request.MlnUpdateRequest):void type: THIS */
    public /* synthetic */ CombinedResourceRequestBody(MlnUpdateRequest mlnUpdateRequest, DynamicResourceUpdateRequestBody dynamicResourceUpdateRequestBody, MiniAppUpdateRequestBody miniAppUpdateRequestBody, MlnUpdateRequest mlnUpdateRequest2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mlnUpdateRequest, (i & 2) != 0 ? null : dynamicResourceUpdateRequestBody, (i & 4) != 0 ? null : miniAppUpdateRequestBody, (i & 8) != 0 ? null : mlnUpdateRequest2);
    }
}
