package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SectorItemResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String instId;
    private final SectorItemParam paramInfo;
    private final String underlyingId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SectorItemResponseBean() {
        this((String) null, (SectorItemParam) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SectorItemResponseBean copy$default(SectorItemResponseBean sectorItemResponseBean, String str, SectorItemParam sectorItemParam, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectorItemResponseBean.instId;
        }
        if ((i & 2) != 0) {
            sectorItemParam = sectorItemResponseBean.paramInfo;
        }
        if ((i & 4) != 0) {
            str2 = sectorItemResponseBean.underlyingId;
        }
        return sectorItemResponseBean.copy(str, sectorItemParam, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SectorItemParam component2() {
        return this.paramInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SectorItemResponseBean copy(@NotNull String str, @NotNull SectorItemParam sectorItemParam, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sectorItemParam, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SectorItemResponseBean(str, sectorItemParam, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectorItemResponseBean)) {
            return false;
        }
        SectorItemResponseBean sectorItemResponseBean = (SectorItemResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) sectorItemResponseBean.instId) && Intrinsics.EZpvd(this.paramInfo, sectorItemResponseBean.paramInfo) && Intrinsics.EZpvd((Object) this.underlyingId, (Object) sectorItemResponseBean.underlyingId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SectorItemParam getParamInfo() {
        return this.paramInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingId() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.instId.hashCode() * 31) + this.paramInfo.hashCode()) * 31) + this.underlyingId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SectorItemResponseBean(instId=" + this.instId + ", paramInfo=" + this.paramInfo + ", underlyingId=" + this.underlyingId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SectorItemResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SectorItemResponseBean> serializer() {
            return SectorItemResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SectorItemResponseBean(int i, String str, SectorItemParam sectorItemParam, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.paramInfo = new SectorItemParam((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.paramInfo = sectorItemParam;
        }
        if ((i & 4) == 0) {
            this.underlyingId = "";
        } else {
            this.underlyingId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SectorItemResponseBean sectorItemResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sectorItemResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sectorItemResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(sectorItemResponseBean.paramInfo, new SectorItemParam((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SectorItemParam$$serializer.INSTANCE, sectorItemResponseBean.paramInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) sectorItemResponseBean.underlyingId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, sectorItemResponseBean.underlyingId);
    }

    public SectorItemResponseBean(@NotNull String str, @NotNull SectorItemParam sectorItemParam, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sectorItemParam, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.instId = str;
        this.paramInfo = sectorItemParam;
        this.underlyingId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.SectorItemParam:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.crcore.coreapi.net.responsebean.SectorItemParam:0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.crcore.coreapi.net.responsebean.SectorItemParam.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.crcore.coreapi.net.responsebean.SectorItemParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.crcore.coreapi.net.responsebean.SectorItemParam, java.lang.String):void (m)] (LINE:18) call: com.okinc.crcore.coreapi.net.responsebean.SectorItemResponseBean.<init>(java.lang.String, com.okinc.crcore.coreapi.net.responsebean.SectorItemParam, java.lang.String):void type: THIS */
    public /* synthetic */ SectorItemResponseBean(String str, SectorItemParam sectorItemParam, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new SectorItemParam((String) null, (String) null, 3, (DefaultConstructorMarker) null) : sectorItemParam, (i & 4) != 0 ? "" : str2);
    }
}
