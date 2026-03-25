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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SubAccountLimitRateBean {
    private String loanAlloc;
    private String userLoginName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubAccountLimitRateBean copy$default(SubAccountLimitRateBean subAccountLimitRateBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subAccountLimitRateBean.userLoginName;
        }
        if ((i & 2) != 0) {
            str2 = subAccountLimitRateBean.loanAlloc;
        }
        return subAccountLimitRateBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userLoginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountLimitRateBean copy(String str, String str2) {
        return new SubAccountLimitRateBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountLimitRateBean)) {
            return false;
        }
        SubAccountLimitRateBean subAccountLimitRateBean = (SubAccountLimitRateBean) obj;
        return Intrinsics.EZpvd((Object) this.userLoginName, (Object) subAccountLimitRateBean.userLoginName) && Intrinsics.EZpvd((Object) this.loanAlloc, (Object) subAccountLimitRateBean.loanAlloc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanAlloc() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserLoginName() {
        return this.userLoginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.userLoginName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.loanAlloc;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoanAlloc(String str) {
        this.loanAlloc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserLoginName(String str) {
        this.userLoginName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountLimitRateBean(userLoginName=" + this.userLoginName + ", loanAlloc=" + this.loanAlloc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SubAccountLimitRateBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubAccountLimitRateBean> serializer() {
            return SubAccountLimitRateBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubAccountLimitRateBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SubAccountLimitRateBean$$serializer.INSTANCE.getDescriptor());
        }
        this.userLoginName = str;
        this.loanAlloc = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SubAccountLimitRateBean subAccountLimitRateBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, subAccountLimitRateBean.userLoginName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, subAccountLimitRateBean.loanAlloc);
    }

    public SubAccountLimitRateBean(String str, String str2) {
        this.userLoginName = str;
        this.loanAlloc = str2;
    }
}
