package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class StarkNetSignData {
    public final SignDomainData domain;
    public final String primaryType;
    public final StarkNetSignTypeListData types;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StarkNetSignData() {
        this((StarkNetSignTypeListData) null, (String) null, (SignDomainData) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StarkNetSignData copy$default(StarkNetSignData starkNetSignData, StarkNetSignTypeListData starkNetSignTypeListData, String str, SignDomainData signDomainData, int i, Object obj) {
        if ((i & 1) != 0) {
            starkNetSignTypeListData = starkNetSignData.types;
        }
        if ((i & 2) != 0) {
            str = starkNetSignData.primaryType;
        }
        if ((i & 4) != 0) {
            signDomainData = starkNetSignData.domain;
        }
        return starkNetSignData.copydefault(starkNetSignTypeListData, str, signDomainData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignData copydefault(@NotNull StarkNetSignTypeListData starkNetSignTypeListData, @NotNull String str, @NotNull SignDomainData signDomainData) {
        Intrinsics.checkNotNullParameter(starkNetSignTypeListData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signDomainData, "");
        return new StarkNetSignData(starkNetSignTypeListData, str, signDomainData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarkNetSignData)) {
            return false;
        }
        StarkNetSignData starkNetSignData = (StarkNetSignData) obj;
        return Intrinsics.EZpvd(this.types, starkNetSignData.types) && Intrinsics.EZpvd((Object) this.primaryType, (Object) starkNetSignData.primaryType) && Intrinsics.EZpvd(this.domain, starkNetSignData.domain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.types.hashCode() * 31) + this.primaryType.hashCode()) * 31) + this.domain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarkNetSignData(types=" + this.types + ", primaryType=" + this.primaryType + ", domain=" + this.domain + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.StarkNetSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarkNetSignData> serializer() {
            return StarkNetSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarkNetSignData(int i, StarkNetSignTypeListData starkNetSignTypeListData, String str, SignDomainData signDomainData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            starkNetSignTypeListData = new StarkNetSignTypeListData((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this.types = starkNetSignTypeListData;
        if ((i & 2) == 0) {
            this.primaryType = "";
        } else {
            this.primaryType = str;
        }
        if ((i & 4) == 0) {
            this.domain = new SignDomainData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.domain = signDomainData;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void copydefault(StarkNetSignData starkNetSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, StarkNetSignTypeListData$$serializer.INSTANCE, starkNetSignData.types);
        } else {
            if (!Intrinsics.EZpvd(starkNetSignData.types, new StarkNetSignTypeListData((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) starkNetSignData.primaryType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, starkNetSignData.primaryType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(starkNetSignData.domain, new SignDomainData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, SignDomainData$$serializer.INSTANCE, starkNetSignData.domain);
    }

    public StarkNetSignData(@NotNull StarkNetSignTypeListData starkNetSignTypeListData, @NotNull String str, @NotNull SignDomainData signDomainData) {
        Intrinsics.checkNotNullParameter(starkNetSignTypeListData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signDomainData, "");
        this.types = starkNetSignTypeListData;
        this.primaryType = str;
        this.domain = signDomainData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.StarkNetSignTypeListData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.StarkNetSignTypeListData:0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY])))
 A[MD:(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.business.market.data.model.StarkNetSignTypeListData.<init>(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.market.data.model.StarkNetSignTypeListData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.SignDomainData:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.SignDomainData:0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:33) call: com.okinc.business.market.data.model.SignDomainData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.market.data.model.SignDomainData))
 A[MD:(com.okinc.business.market.data.model.StarkNetSignTypeListData, java.lang.String, com.okinc.business.market.data.model.SignDomainData):void (m)] (LINE:27) call: com.okinc.business.market.data.model.StarkNetSignData.<init>(com.okinc.business.market.data.model.StarkNetSignTypeListData, java.lang.String, com.okinc.business.market.data.model.SignDomainData):void type: THIS */
    public /* synthetic */ StarkNetSignData(StarkNetSignTypeListData starkNetSignTypeListData, String str, SignDomainData signDomainData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new StarkNetSignTypeListData((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : starkNetSignTypeListData, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new SignDomainData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : signDomainData);
    }
}
