package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SubAccountLimitRateRespData {
    private List<SubAccountLimitRateBean> accountLoanLimitAllocList;
    private String masterAlloc;
    private int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SubAccountLimitRateBean$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SubAccountLimitRateRespData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubAccountLimitRateRespData copy$default(SubAccountLimitRateRespData subAccountLimitRateRespData, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = subAccountLimitRateRespData.accountLoanLimitAllocList;
        }
        if ((i2 & 2) != 0) {
            str = subAccountLimitRateRespData.masterAlloc;
        }
        if ((i2 & 4) != 0) {
            i = subAccountLimitRateRespData.total;
        }
        return subAccountLimitRateRespData.copy(list, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubAccountLimitRateBean> component1() {
        return this.accountLoanLimitAllocList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.masterAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountLimitRateRespData copy(List<SubAccountLimitRateBean> list, String str, int i) {
        return new SubAccountLimitRateRespData(list, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountLimitRateRespData)) {
            return false;
        }
        SubAccountLimitRateRespData subAccountLimitRateRespData = (SubAccountLimitRateRespData) obj;
        return Intrinsics.EZpvd(this.accountLoanLimitAllocList, subAccountLimitRateRespData.accountLoanLimitAllocList) && Intrinsics.EZpvd((Object) this.masterAlloc, (Object) subAccountLimitRateRespData.masterAlloc) && this.total == subAccountLimitRateRespData.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubAccountLimitRateBean> getAccountLoanLimitAllocList() {
        return this.accountLoanLimitAllocList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterAlloc() {
        return this.masterAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SubAccountLimitRateBean> list = this.accountLoanLimitAllocList;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.masterAlloc;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountLoanLimitAllocList(List<SubAccountLimitRateBean> list) {
        this.accountLoanLimitAllocList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterAlloc(String str) {
        this.masterAlloc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(int i) {
        this.total = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountLimitRateRespData(accountLoanLimitAllocList=" + this.accountLoanLimitAllocList + ", masterAlloc=" + this.masterAlloc + ", total=" + this.total + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SubAccountLimitRateRespData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubAccountLimitRateRespData> serializer() {
            return SubAccountLimitRateRespData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubAccountLimitRateRespData(int i, List list, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, SubAccountLimitRateRespData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountLoanLimitAllocList = null;
        } else {
            this.accountLoanLimitAllocList = list;
        }
        this.masterAlloc = str;
        this.total = i2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SubAccountLimitRateRespData subAccountLimitRateRespData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subAccountLimitRateRespData.accountLoanLimitAllocList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], subAccountLimitRateRespData.accountLoanLimitAllocList);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subAccountLimitRateRespData.masterAlloc);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, subAccountLimitRateRespData.total);
    }

    public SubAccountLimitRateRespData(List<SubAccountLimitRateBean> list, String str, int i) {
        this.accountLoanLimitAllocList = list;
        this.masterAlloc = str;
        this.total = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.lang.String)
  (r3v0 int)
 A[MD:(java.util.List<com.okinc.unify_trade.biz.SubAccountLimitRateBean>, java.lang.String, int):void (m)] (LINE:305) call: com.okinc.unify_trade.biz.SubAccountLimitRateRespData.<init>(java.util.List, java.lang.String, int):void type: THIS */
    public /* synthetic */ SubAccountLimitRateRespData(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, str, i);
    }
}
