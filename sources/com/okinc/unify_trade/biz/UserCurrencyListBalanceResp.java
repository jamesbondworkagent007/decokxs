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
public final class UserCurrencyListBalanceResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String balance;
    private final String currency;
    private final String currencyId;
    private final boolean entitySupport;
    private final String fullName;
    private final String icon;
    private final boolean online;
    private final String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.entitySupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserCurrencyListBalanceResp copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        return new UserCurrencyListBalanceResp(str, str2, str3, str4, z, str5, str6, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCurrencyListBalanceResp)) {
            return false;
        }
        UserCurrencyListBalanceResp userCurrencyListBalanceResp = (UserCurrencyListBalanceResp) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) userCurrencyListBalanceResp.balance) && Intrinsics.EZpvd((Object) this.valuation, (Object) userCurrencyListBalanceResp.valuation) && Intrinsics.EZpvd((Object) this.currency, (Object) userCurrencyListBalanceResp.currency) && Intrinsics.EZpvd((Object) this.currencyId, (Object) userCurrencyListBalanceResp.currencyId) && this.entitySupport == userCurrencyListBalanceResp.entitySupport && Intrinsics.EZpvd((Object) this.fullName, (Object) userCurrencyListBalanceResp.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) userCurrencyListBalanceResp.icon) && this.online == userCurrencyListBalanceResp.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEntitySupport() {
        return this.entitySupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnline() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.balance;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.valuation;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currencyId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = Boolean.hashCode(this.entitySupport);
        String str5 = this.fullName;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.icon;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.online);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserCurrencyListBalanceResp(balance=" + this.balance + ", valuation=" + this.valuation + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", entitySupport=" + this.entitySupport + ", fullName=" + this.fullName + ", icon=" + this.icon + ", online=" + this.online + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserCurrencyListBalanceResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserCurrencyListBalanceResp> serializer() {
            return UserCurrencyListBalanceResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserCurrencyListBalanceResp(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, UserCurrencyListBalanceResp$$serializer.INSTANCE.getDescriptor());
        }
        this.balance = str;
        this.valuation = str2;
        this.currency = str3;
        this.currencyId = str4;
        this.entitySupport = z;
        this.fullName = str5;
        this.icon = str6;
        this.online = z2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserCurrencyListBalanceResp userCurrencyListBalanceResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, userCurrencyListBalanceResp.balance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, userCurrencyListBalanceResp.valuation);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, userCurrencyListBalanceResp.currency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, userCurrencyListBalanceResp.currencyId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, userCurrencyListBalanceResp.entitySupport);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, userCurrencyListBalanceResp.fullName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, userCurrencyListBalanceResp.icon);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, userCurrencyListBalanceResp.online);
    }

    public UserCurrencyListBalanceResp(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        this.balance = str;
        this.valuation = str2;
        this.currency = str3;
        this.currencyId = str4;
        this.entitySupport = z;
        this.fullName = str5;
        this.icon = str6;
        this.online = z2;
    }
}
