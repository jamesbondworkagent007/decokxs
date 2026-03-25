package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SubAccountLimitRateUpdateReq {
    private String loanAlloc;
    private String subLoginName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubAccountLimitRateUpdateReq copy$default(SubAccountLimitRateUpdateReq subAccountLimitRateUpdateReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subAccountLimitRateUpdateReq.subLoginName;
        }
        if ((i & 2) != 0) {
            str2 = subAccountLimitRateUpdateReq.loanAlloc;
        }
        return subAccountLimitRateUpdateReq.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.subLoginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountLimitRateUpdateReq copy(String str, String str2) {
        return new SubAccountLimitRateUpdateReq(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountLimitRateUpdateReq)) {
            return false;
        }
        SubAccountLimitRateUpdateReq subAccountLimitRateUpdateReq = (SubAccountLimitRateUpdateReq) obj;
        return Intrinsics.EZpvd((Object) this.subLoginName, (Object) subAccountLimitRateUpdateReq.subLoginName) && Intrinsics.EZpvd((Object) this.loanAlloc, (Object) subAccountLimitRateUpdateReq.loanAlloc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanAlloc() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubLoginName() {
        return this.subLoginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.subLoginName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.loanAlloc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanAlloc(String str) {
        this.loanAlloc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubLoginName(String str) {
        this.subLoginName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountLimitRateUpdateReq(subLoginName=" + this.subLoginName + ", loanAlloc=" + this.loanAlloc + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SubAccountLimitRateUpdateReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubAccountLimitRateUpdateReq> serializer() {
            return SubAccountLimitRateUpdateReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubAccountLimitRateUpdateReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SubAccountLimitRateUpdateReq$$serializer.INSTANCE.getDescriptor());
        }
        this.subLoginName = str;
        this.loanAlloc = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SubAccountLimitRateUpdateReq subAccountLimitRateUpdateReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, subAccountLimitRateUpdateReq.subLoginName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, subAccountLimitRateUpdateReq.loanAlloc);
    }

    public SubAccountLimitRateUpdateReq(String str, String str2) {
        this.subLoginName = str;
        this.loanAlloc = str2;
    }
}
