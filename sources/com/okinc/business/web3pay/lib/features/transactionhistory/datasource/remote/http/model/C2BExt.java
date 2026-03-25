package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.okinc.business.web3pay.lib.core.model.UserFundStatus;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class C2BExt {
    public static final int $stable = 0;
    private final String acquireLogo;
    private final String acquireName;
    private final String bidPx;
    private final ExternalFeeInfo externalFeeInfo;
    private final String toTokenAmount;
    private final Integer toTokenDecimal;
    private final String toTokenSymbol;
    private final UserFundStatus userFundStatus;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.UserFundStatus", UserFundStatus.values()), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserFundStatus component5() {
        return this.userFundStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.acquireName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo component8() {
        return this.externalFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2BExt copy(String str, Integer num, String str2, String str3, UserFundStatus userFundStatus, String str4, String str5, ExternalFeeInfo externalFeeInfo) {
        return new C2BExt(str, num, str2, str3, userFundStatus, str4, str5, externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2BExt)) {
            return false;
        }
        C2BExt c2BExt = (C2BExt) obj;
        return Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) c2BExt.toTokenAmount) && Intrinsics.EZpvd(this.toTokenDecimal, c2BExt.toTokenDecimal) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) c2BExt.toTokenSymbol) && Intrinsics.EZpvd((Object) this.bidPx, (Object) c2BExt.bidPx) && this.userFundStatus == c2BExt.userFundStatus && Intrinsics.EZpvd((Object) this.acquireLogo, (Object) c2BExt.acquireLogo) && Intrinsics.EZpvd((Object) this.acquireName, (Object) c2BExt.acquireName) && Intrinsics.EZpvd(this.externalFeeInfo, c2BExt.externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireLogo() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireName() {
        return this.acquireName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo getExternalFeeInfo() {
        return this.externalFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserFundStatus getUserFundStatus() {
        return this.userFundStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.toTokenAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.toTokenDecimal;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.toTokenSymbol;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bidPx;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        UserFundStatus userFundStatus = this.userFundStatus;
        int iHashCode5 = userFundStatus == null ? 0 : userFundStatus.hashCode();
        String str4 = this.acquireLogo;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.acquireName;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        ExternalFeeInfo externalFeeInfo = this.externalFeeInfo;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (externalFeeInfo != null ? externalFeeInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "C2BExt(toTokenAmount=" + this.toTokenAmount + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenSymbol=" + this.toTokenSymbol + ", bidPx=" + this.bidPx + ", userFundStatus=" + this.userFundStatus + ", acquireLogo=" + this.acquireLogo + ", acquireName=" + this.acquireName + ", externalFeeInfo=" + this.externalFeeInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C2BExt> serializer() {
            return C2BExt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ C2BExt(int i, String str, Integer num, String str2, String str3, UserFundStatus userFundStatus, String str4, String str5, ExternalFeeInfo externalFeeInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, C2BExt$$serializer.INSTANCE.getDescriptor());
        }
        this.toTokenAmount = str;
        this.toTokenDecimal = num;
        this.toTokenSymbol = str2;
        this.bidPx = str3;
        this.userFundStatus = userFundStatus;
        this.acquireLogo = str4;
        this.acquireName = str5;
        this.externalFeeInfo = externalFeeInfo;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(C2BExt c2BExt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, c2BExt.toTokenAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, c2BExt.toTokenDecimal);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, c2BExt.toTokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, c2BExt.bidPx);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], c2BExt.userFundStatus);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, c2BExt.acquireLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, c2BExt.acquireName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ExternalFeeInfo$$serializer.INSTANCE, c2BExt.externalFeeInfo);
    }

    public C2BExt(String str, Integer num, String str2, String str3, UserFundStatus userFundStatus, String str4, String str5, ExternalFeeInfo externalFeeInfo) {
        this.toTokenAmount = str;
        this.toTokenDecimal = num;
        this.toTokenSymbol = str2;
        this.bidPx = str3;
        this.userFundStatus = userFundStatus;
        this.acquireLogo = str4;
        this.acquireName = str5;
        this.externalFeeInfo = externalFeeInfo;
    }
}
