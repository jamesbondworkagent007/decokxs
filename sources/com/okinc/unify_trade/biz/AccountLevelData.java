package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountLevelData {
    private final String acctLv;
    private List<CollateralCoinConfig> collateralCoinConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CollateralCoinConfig$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountLevelData() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.AccountLevelData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountLevelData copy$default(AccountLevelData accountLevelData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountLevelData.acctLv;
        }
        if ((i & 2) != 0) {
            list = accountLevelData.collateralCoinConfigs;
        }
        return accountLevelData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CollateralCoinConfig> component2() {
        return this.collateralCoinConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountLevelData copy(@NotNull String str, List<CollateralCoinConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AccountLevelData(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountLevelData)) {
            return false;
        }
        AccountLevelData accountLevelData = (AccountLevelData) obj;
        return Intrinsics.EZpvd((Object) this.acctLv, (Object) accountLevelData.acctLv) && Intrinsics.EZpvd(this.collateralCoinConfigs, accountLevelData.collateralCoinConfigs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctLv() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CollateralCoinConfig> getCollateralCoinConfigs() {
        return this.collateralCoinConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.acctLv.hashCode();
        List<CollateralCoinConfig> list = this.collateralCoinConfigs;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollateralCoinConfigs(List<CollateralCoinConfig> list) {
        this.collateralCoinConfigs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountLevelData(acctLv=" + this.acctLv + ", collateralCoinConfigs=" + this.collateralCoinConfigs + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountLevelData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountLevelData> serializer() {
            return AccountLevelData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountLevelData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.acctLv = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.collateralCoinConfigs = null;
        } else {
            this.collateralCoinConfigs = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountLevelData accountLevelData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountLevelData.acctLv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountLevelData.acctLv);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && accountLevelData.collateralCoinConfigs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], accountLevelData.collateralCoinConfigs);
    }

    public AccountLevelData(@NotNull String str, List<CollateralCoinConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.acctLv = str;
        this.collateralCoinConfigs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CollateralCoinConfig>):void (m)] (LINE:114) call: com.okinc.unify_trade.biz.AccountLevelData.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AccountLevelData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
