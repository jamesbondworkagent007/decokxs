package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MarketLendingHistory {
    private final String currentPage;
    private final ArrayList<LendingHistoryRecordData> list;
    private final String pageLength;
    private final String total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(LendingHistoryRecordData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.MarketLendingHistory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketLendingHistory copy$default(MarketLendingHistory marketLendingHistory, String str, String str2, String str3, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketLendingHistory.currentPage;
        }
        if ((i & 2) != 0) {
            str2 = marketLendingHistory.pageLength;
        }
        if ((i & 4) != 0) {
            str3 = marketLendingHistory.total;
        }
        if ((i & 8) != 0) {
            arrayList = marketLendingHistory.list;
        }
        return marketLendingHistory.copy(str, str2, str3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LendingHistoryRecordData> component4() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketLendingHistory copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<LendingHistoryRecordData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new MarketLendingHistory(str, str2, str3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLendingHistory)) {
            return false;
        }
        MarketLendingHistory marketLendingHistory = (MarketLendingHistory) obj;
        return Intrinsics.EZpvd((Object) this.currentPage, (Object) marketLendingHistory.currentPage) && Intrinsics.EZpvd((Object) this.pageLength, (Object) marketLendingHistory.pageLength) && Intrinsics.EZpvd((Object) this.total, (Object) marketLendingHistory.total) && Intrinsics.EZpvd(this.list, marketLendingHistory.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<LendingHistoryRecordData> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.currentPage.hashCode() * 31) + this.pageLength.hashCode()) * 31) + this.total.hashCode()) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketLendingHistory(currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", list=" + this.list + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarketLendingHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketLendingHistory> serializer() {
            return MarketLendingHistory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketLendingHistory(int i, String str, String str2, String str3, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MarketLendingHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.currentPage = str;
        this.pageLength = str2;
        this.total = str3;
        if ((i & 8) == 0) {
            this.list = new ArrayList<>();
        } else {
            this.list = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarketLendingHistory marketLendingHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, marketLendingHistory.currentPage);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, marketLendingHistory.pageLength);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketLendingHistory.total);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(marketLendingHistory.list, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], marketLendingHistory.list);
    }

    public MarketLendingHistory(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<LendingHistoryRecordData> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.currentPage = str;
        this.pageLength = str2;
        this.total = str3;
        this.list = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:275) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.LendingHistoryRecordData>):void (m)] (LINE:271) call: com.okinc.unify_trade.biz.MarketLendingHistory.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ MarketLendingHistory(String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? new ArrayList() : arrayList);
    }
}
