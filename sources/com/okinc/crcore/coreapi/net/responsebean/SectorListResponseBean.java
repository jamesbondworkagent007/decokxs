package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SectorListResponseBean {
    private final String sectorKey;
    private final ArrayList<SectorItemResponseBean> underlyingList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SectorItemResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SectorListResponseBean() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.SectorListResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectorListResponseBean copy$default(SectorListResponseBean sectorListResponseBean, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sectorListResponseBean.sectorKey;
        }
        if ((i & 2) != 0) {
            arrayList = sectorListResponseBean.underlyingList;
        }
        return sectorListResponseBean.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sectorKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SectorItemResponseBean> component2() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SectorListResponseBean copy(@NotNull String str, @NotNull ArrayList<SectorItemResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new SectorListResponseBean(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectorListResponseBean)) {
            return false;
        }
        SectorListResponseBean sectorListResponseBean = (SectorListResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.sectorKey, (Object) sectorListResponseBean.sectorKey) && Intrinsics.EZpvd(this.underlyingList, sectorListResponseBean.underlyingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorKey() {
        return this.sectorKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SectorItemResponseBean> getUnderlyingList() {
        return this.underlyingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sectorKey.hashCode() * 31) + this.underlyingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SectorListResponseBean(sectorKey=" + this.sectorKey + ", underlyingList=" + this.underlyingList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SectorListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SectorListResponseBean> serializer() {
            return SectorListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SectorListResponseBean(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.sectorKey = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.underlyingList = new ArrayList<>();
        } else {
            this.underlyingList = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SectorListResponseBean sectorListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sectorListResponseBean.sectorKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sectorListResponseBean.sectorKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(sectorListResponseBean.underlyingList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], sectorListResponseBean.underlyingList);
    }

    public SectorListResponseBean(@NotNull String str, @NotNull ArrayList<SectorItemResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.sectorKey = str;
        this.underlyingList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.SectorItemResponseBean>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SectorListResponseBean.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SectorListResponseBean(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
