package com.okinc.unify_trade.biz.subscribe;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class WsAccountSummaryData {
    private AccountSummaryAccountDetail accountDetails;
    private List<AccountSummaryBalanceDetail> balanceDetails;
    private List<AccountSummaryPositionDetail> positionDetails;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(AccountSummaryBalanceDetail$$serializer.INSTANCE), null, new ArrayListSerializer(AccountSummaryPositionDetail$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WsAccountSummaryData() {
        this((List) null, (AccountSummaryAccountDetail) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsAccountSummaryData copy$default(WsAccountSummaryData wsAccountSummaryData, List list, AccountSummaryAccountDetail accountSummaryAccountDetail, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wsAccountSummaryData.balanceDetails;
        }
        if ((i & 2) != 0) {
            accountSummaryAccountDetail = wsAccountSummaryData.accountDetails;
        }
        if ((i & 4) != 0) {
            list2 = wsAccountSummaryData.positionDetails;
        }
        if ((i & 8) != 0) {
            str = wsAccountSummaryData.type;
        }
        return wsAccountSummaryData.copy(list, accountSummaryAccountDetail, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountSummaryBalanceDetail> component1() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountSummaryAccountDetail component2() {
        return this.accountDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountSummaryPositionDetail> component3() {
        return this.positionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsAccountSummaryData copy(@NotNull List<AccountSummaryBalanceDetail> list, @NotNull AccountSummaryAccountDetail accountSummaryAccountDetail, @NotNull List<AccountSummaryPositionDetail> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(accountSummaryAccountDetail, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WsAccountSummaryData(list, accountSummaryAccountDetail, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsAccountSummaryData)) {
            return false;
        }
        WsAccountSummaryData wsAccountSummaryData = (WsAccountSummaryData) obj;
        return Intrinsics.EZpvd(this.balanceDetails, wsAccountSummaryData.balanceDetails) && Intrinsics.EZpvd(this.accountDetails, wsAccountSummaryData.accountDetails) && Intrinsics.EZpvd(this.positionDetails, wsAccountSummaryData.positionDetails) && Intrinsics.EZpvd((Object) this.type, (Object) wsAccountSummaryData.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountSummaryAccountDetail getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountSummaryBalanceDetail> getBalanceDetails() {
        return this.balanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountSummaryPositionDetail> getPositionDetails() {
        return this.positionDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.balanceDetails.hashCode() * 31) + this.accountDetails.hashCode()) * 31) + this.positionDetails.hashCode()) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountDetails(@NotNull AccountSummaryAccountDetail accountSummaryAccountDetail) {
        Intrinsics.checkNotNullParameter(accountSummaryAccountDetail, "");
        this.accountDetails = accountSummaryAccountDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalanceDetails(@NotNull List<AccountSummaryBalanceDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.balanceDetails = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionDetails(@NotNull List<AccountSummaryPositionDetail> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.positionDetails = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsAccountSummaryData(balanceDetails=" + this.balanceDetails + ", accountDetails=" + this.accountDetails + ", positionDetails=" + this.positionDetails + ", type=" + this.type + ")";
    }

    public /* synthetic */ WsAccountSummaryData(int i, List list, AccountSummaryAccountDetail accountSummaryAccountDetail, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.balanceDetails = (i & 1) == 0 ? yDY.AhwBna() : list;
        this.accountDetails = (i & 2) == 0 ? new AccountSummaryAccountDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : accountSummaryAccountDetail;
        this.positionDetails = (i & 4) == 0 ? yDY.AhwBna() : list2;
        this.type = (i & 8) == 0 ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [7=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(WsAccountSummaryData wsAccountSummaryData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(wsAccountSummaryData.balanceDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], wsAccountSummaryData.balanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(wsAccountSummaryData.accountDetails, new AccountSummaryAccountDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AccountSummaryAccountDetail$$serializer.INSTANCE, wsAccountSummaryData.accountDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(wsAccountSummaryData.positionDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], wsAccountSummaryData.positionDetails);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) wsAccountSummaryData.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsAccountSummaryData.type);
    }

    public WsAccountSummaryData(@NotNull List<AccountSummaryBalanceDetail> list, @NotNull AccountSummaryAccountDetail accountSummaryAccountDetail, @NotNull List<AccountSummaryPositionDetail> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(accountSummaryAccountDetail, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.balanceDetails = list;
        this.accountDetails = accountSummaryAccountDetail;
        this.positionDetails = list2;
        this.type = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r15v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.subscribe.AccountSummaryBalanceDetail>, com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail, java.util.List<com.okinc.unify_trade.biz.subscribe.AccountSummaryPositionDetail>, java.lang.String):void (m)] (LINE:9) call: com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData.<init>(java.util.List, com.okinc.unify_trade.biz.subscribe.AccountSummaryAccountDetail, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ WsAccountSummaryData(List list, AccountSummaryAccountDetail accountSummaryAccountDetail, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? new AccountSummaryAccountDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : accountSummaryAccountDetail, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? "" : str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.WsAccountSummaryData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WsAccountSummaryData> serializer() {
            return WsAccountSummaryData$$serializer.INSTANCE;
        }
    }
}
