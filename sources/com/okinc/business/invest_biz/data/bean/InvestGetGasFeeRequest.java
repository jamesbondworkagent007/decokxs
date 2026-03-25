package com.okinc.business.invest_biz.data.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestGetGasFeeRequest {
    public final String address;
    public final Long chainId;
    public final String contractAddress;
    public final String inputData;
    public final Long investmentId;
    public final List<ClaimTokenAmount> userClaimTokenAndAmounts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(ClaimTokenAmount$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestGetGasFeeRequest() {
        this((String) null, (Long) null, (String) null, (String) null, (Long) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestGetGasFeeRequest copy$default(InvestGetGasFeeRequest investGetGasFeeRequest, String str, Long l, String str2, String str3, Long l2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investGetGasFeeRequest.address;
        }
        if ((i & 2) != 0) {
            l = investGetGasFeeRequest.chainId;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            str2 = investGetGasFeeRequest.inputData;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = investGetGasFeeRequest.contractAddress;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            l2 = investGetGasFeeRequest.investmentId;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            list = investGetGasFeeRequest.userClaimTokenAndAmounts;
        }
        return investGetGasFeeRequest.KWHzl(str, l3, str4, str5, l4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGetGasFeeRequest KWHzl(String str, Long l, String str2, String str3, Long l2, List<ClaimTokenAmount> list) {
        return new InvestGetGasFeeRequest(str, l, str2, str3, l2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestGetGasFeeRequest)) {
            return false;
        }
        InvestGetGasFeeRequest investGetGasFeeRequest = (InvestGetGasFeeRequest) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) investGetGasFeeRequest.address) && Intrinsics.EZpvd(this.chainId, investGetGasFeeRequest.chainId) && Intrinsics.EZpvd((Object) this.inputData, (Object) investGetGasFeeRequest.inputData) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) investGetGasFeeRequest.contractAddress) && Intrinsics.EZpvd(this.investmentId, investGetGasFeeRequest.investmentId) && Intrinsics.EZpvd(this.userClaimTokenAndAmounts, investGetGasFeeRequest.userClaimTokenAndAmounts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.chainId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.inputData;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contractAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l2 = this.investmentId;
        int iHashCode5 = l2 == null ? 0 : l2.hashCode();
        List<ClaimTokenAmount> list = this.userClaimTokenAndAmounts;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestGetGasFeeRequest(address=" + this.address + ", chainId=" + this.chainId + ", inputData=" + this.inputData + ", contractAddress=" + this.contractAddress + ", investmentId=" + this.investmentId + ", userClaimTokenAndAmounts=" + this.userClaimTokenAndAmounts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestGetGasFeeRequest> serializer() {
            return InvestGetGasFeeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestGetGasFeeRequest(int i, String str, Long l, String str2, String str3, Long l2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = l;
        }
        if ((i & 4) == 0) {
            this.inputData = "";
        } else {
            this.inputData = str2;
        }
        if ((i & 8) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str3;
        }
        if ((i & 16) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = l2;
        }
        if ((i & 32) == 0) {
            this.userClaimTokenAndAmounts = yDY.AhwBna();
        } else {
            this.userClaimTokenAndAmounts = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(InvestGetGasFeeRequest investGetGasFeeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investGetGasFeeRequest.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investGetGasFeeRequest.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l2 = investGetGasFeeRequest.chainId) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investGetGasFeeRequest.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investGetGasFeeRequest.inputData, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investGetGasFeeRequest.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investGetGasFeeRequest.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investGetGasFeeRequest.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (l = investGetGasFeeRequest.investmentId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, investGetGasFeeRequest.investmentId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(investGetGasFeeRequest.userClaimTokenAndAmounts, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investGetGasFeeRequest.userClaimTokenAndAmounts);
    }

    public InvestGetGasFeeRequest(String str, Long l, String str2, String str3, Long l2, List<ClaimTokenAmount> list) {
        this.address = str;
        this.chainId = l;
        this.inputData = str2;
        this.contractAddress = str3;
        this.investmentId = l2;
        this.userClaimTokenAndAmounts = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.Long:0x0013: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r12v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.lang.Long:0x0029: TERNARY null = ((wrap:int:0x0021: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1015)) : (r11v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.util.List<com.okinc.business.invest_biz.data.bean.ClaimTokenAmount>):void (m)] (LINE:1003) call: com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.util.List):void type: THIS */
    public /* synthetic */ InvestGetGasFeeRequest(String str, Long l, String str2, String str3, Long l2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? 0L : l2, (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}
