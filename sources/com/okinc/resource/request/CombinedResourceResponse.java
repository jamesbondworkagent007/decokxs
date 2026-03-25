package com.okinc.resource.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CombinedResourceResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private List<DynamicResourceUpdateResp> file;
    private List<MiniAppUpdateResp> miniapp;
    private MlnUpdateResp oklua;
    private List<MiniAppUpdateResp> preDownload;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CombinedResourceResponse() {
        this((MlnUpdateResp) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.resource.request.CombinedResourceResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CombinedResourceResponse copy$default(CombinedResourceResponse combinedResourceResponse, MlnUpdateResp mlnUpdateResp, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            mlnUpdateResp = combinedResourceResponse.oklua;
        }
        if ((i & 2) != 0) {
            list = combinedResourceResponse.file;
        }
        if ((i & 4) != 0) {
            list2 = combinedResourceResponse.miniapp;
        }
        if ((i & 8) != 0) {
            list3 = combinedResourceResponse.preDownload;
        }
        return combinedResourceResponse.copy(mlnUpdateResp, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateResp component1() {
        return this.oklua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DynamicResourceUpdateResp> component2() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MiniAppUpdateResp> component3() {
        return this.miniapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MiniAppUpdateResp> component4() {
        return this.preDownload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CombinedResourceResponse copy(MlnUpdateResp mlnUpdateResp, List<DynamicResourceUpdateResp> list, List<MiniAppUpdateResp> list2, List<MiniAppUpdateResp> list3) {
        return new CombinedResourceResponse(mlnUpdateResp, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedResourceResponse)) {
            return false;
        }
        CombinedResourceResponse combinedResourceResponse = (CombinedResourceResponse) obj;
        return Intrinsics.EZpvd(this.oklua, combinedResourceResponse.oklua) && Intrinsics.EZpvd(this.file, combinedResourceResponse.file) && Intrinsics.EZpvd(this.miniapp, combinedResourceResponse.miniapp) && Intrinsics.EZpvd(this.preDownload, combinedResourceResponse.preDownload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DynamicResourceUpdateResp> getFile() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MiniAppUpdateResp> getMiniapp() {
        return this.miniapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MlnUpdateResp getOklua() {
        return this.oklua;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MiniAppUpdateResp> getPreDownload() {
        return this.preDownload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MlnUpdateResp mlnUpdateResp = this.oklua;
        int iHashCode = mlnUpdateResp == null ? 0 : mlnUpdateResp.hashCode();
        List<DynamicResourceUpdateResp> list = this.file;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<MiniAppUpdateResp> list2 = this.miniapp;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<MiniAppUpdateResp> list3 = this.preDownload;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFile(List<DynamicResourceUpdateResp> list) {
        this.file = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMiniapp(List<MiniAppUpdateResp> list) {
        this.miniapp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOklua(MlnUpdateResp mlnUpdateResp) {
        this.oklua = mlnUpdateResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreDownload(List<MiniAppUpdateResp> list) {
        this.preDownload = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CombinedResourceResponse(oklua=" + this.oklua + ", file=" + this.file + ", miniapp=" + this.miniapp + ", preDownload=" + this.preDownload + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.resource.request.CombinedResourceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedResourceResponse> serializer() {
            return CombinedResourceResponse$$serializer.INSTANCE;
        }
    }

    static {
        MiniAppUpdateResp$$serializer miniAppUpdateResp$$serializer = MiniAppUpdateResp$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(DynamicResourceUpdateResp$$serializer.INSTANCE), new ArrayListSerializer(miniAppUpdateResp$$serializer), new ArrayListSerializer(miniAppUpdateResp$$serializer)};
    }

    public /* synthetic */ CombinedResourceResponse(int i, MlnUpdateResp mlnUpdateResp, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.oklua = null;
        } else {
            this.oklua = mlnUpdateResp;
        }
        if ((i & 2) == 0) {
            this.file = null;
        } else {
            this.file = list;
        }
        if ((i & 4) == 0) {
            this.miniapp = null;
        } else {
            this.miniapp = list2;
        }
        if ((i & 8) == 0) {
            this.preDownload = null;
        } else {
            this.preDownload = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKRuntime_ok_runtime(CombinedResourceResponse combinedResourceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || combinedResourceResponse.oklua != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MlnUpdateResp$$serializer.INSTANCE, combinedResourceResponse.oklua);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || combinedResourceResponse.file != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], combinedResourceResponse.file);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || combinedResourceResponse.miniapp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], combinedResourceResponse.miniapp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && combinedResourceResponse.preDownload == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], combinedResourceResponse.preDownload);
    }

    public CombinedResourceResponse(MlnUpdateResp mlnUpdateResp, List<DynamicResourceUpdateResp> list, List<MiniAppUpdateResp> list2, List<MiniAppUpdateResp> list3) {
        this.oklua = mlnUpdateResp;
        this.file = list;
        this.miniapp = list2;
        this.preDownload = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.resource.request.MlnUpdateResp:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.resource.request.MlnUpdateResp) : (r2v0 com.okinc.resource.request.MlnUpdateResp))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(com.okinc.resource.request.MlnUpdateResp, java.util.List<com.okinc.resource.request.DynamicResourceUpdateResp>, java.util.List<com.okinc.resource.request.MiniAppUpdateResp>, java.util.List<com.okinc.resource.request.MiniAppUpdateResp>):void (m)] (LINE:17) call: com.okinc.resource.request.CombinedResourceResponse.<init>(com.okinc.resource.request.MlnUpdateResp, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ CombinedResourceResponse(MlnUpdateResp mlnUpdateResp, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mlnUpdateResp, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
