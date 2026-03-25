package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class UserCurrencyListBalanceReq {
    private final List<Integer> currencyList;
    private final int transferFrom;
    private final String valuationUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.UserCurrencyListBalanceReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserCurrencyListBalanceReq copy$default(UserCurrencyListBalanceReq userCurrencyListBalanceReq, int i, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userCurrencyListBalanceReq.transferFrom;
        }
        if ((i2 & 2) != 0) {
            list = userCurrencyListBalanceReq.currencyList;
        }
        if ((i2 & 4) != 0) {
            str = userCurrencyListBalanceReq.valuationUnit;
        }
        return userCurrencyListBalanceReq.copy(i, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserCurrencyListBalanceReq copy(int i, @NotNull List<Integer> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new UserCurrencyListBalanceReq(i, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCurrencyListBalanceReq)) {
            return false;
        }
        UserCurrencyListBalanceReq userCurrencyListBalanceReq = (UserCurrencyListBalanceReq) obj;
        return this.transferFrom == userCurrencyListBalanceReq.transferFrom && Intrinsics.EZpvd(this.currencyList, userCurrencyListBalanceReq.currencyList) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) userCurrencyListBalanceReq.valuationUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getCurrencyList() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferFrom() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.transferFrom) * 31) + this.currencyList.hashCode()) * 31) + this.valuationUnit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserCurrencyListBalanceReq(transferFrom=" + this.transferFrom + ", currencyList=" + this.currencyList + ", valuationUnit=" + this.valuationUnit + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserCurrencyListBalanceReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserCurrencyListBalanceReq> serializer() {
            return UserCurrencyListBalanceReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserCurrencyListBalanceReq(int i, int i2, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, UserCurrencyListBalanceReq$$serializer.INSTANCE.getDescriptor());
        }
        this.transferFrom = i2;
        this.currencyList = list;
        this.valuationUnit = str;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserCurrencyListBalanceReq userCurrencyListBalanceReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, userCurrencyListBalanceReq.transferFrom);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], userCurrencyListBalanceReq.currencyList);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, userCurrencyListBalanceReq.valuationUnit);
    }

    public UserCurrencyListBalanceReq(int i, @NotNull List<Integer> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.transferFrom = i;
        this.currencyList = list;
        this.valuationUnit = str;
    }
}
