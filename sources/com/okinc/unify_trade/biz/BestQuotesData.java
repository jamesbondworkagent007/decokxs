package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BestQuotesData {
    private String quoteSide;
    private List<BestQuoteItem> quotes;
    private String rfqId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BestQuoteItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BestQuotesData() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BestQuotesData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BestQuotesData copy$default(BestQuotesData bestQuotesData, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bestQuotesData.rfqId;
        }
        if ((i & 2) != 0) {
            str2 = bestQuotesData.quoteSide;
        }
        if ((i & 4) != 0) {
            list = bestQuotesData.quotes;
        }
        return bestQuotesData.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BestQuoteItem> component3() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BestQuotesData copy(String str, String str2, List<BestQuoteItem> list) {
        return new BestQuotesData(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BestQuotesData)) {
            return false;
        }
        BestQuotesData bestQuotesData = (BestQuotesData) obj;
        return Intrinsics.EZpvd((Object) this.rfqId, (Object) bestQuotesData.rfqId) && Intrinsics.EZpvd((Object) this.quoteSide, (Object) bestQuotesData.quoteSide) && Intrinsics.EZpvd(this.quotes, bestQuotesData.quotes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSide() {
        return this.quoteSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BestQuoteItem> getQuotes() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqId() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rfqId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteSide;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<BestQuoteItem> list = this.quotes;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSide(String str) {
        this.quoteSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotes(List<BestQuoteItem> list) {
        this.quotes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRfqId(String str) {
        this.rfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BestQuotesData(rfqId=" + this.rfqId + ", quoteSide=" + this.quoteSide + ", quotes=" + this.quotes + ")";
    }

    public /* synthetic */ BestQuotesData(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rfqId = "";
        } else {
            this.rfqId = str;
        }
        if ((i & 2) == 0) {
            this.quoteSide = "";
        } else {
            this.quoteSide = str2;
        }
        if ((i & 4) == 0) {
            this.quotes = null;
        } else {
            this.quotes = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BestQuotesData bestQuotesData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bestQuotesData.rfqId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bestQuotesData.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bestQuotesData.quoteSide, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bestQuotesData.quoteSide);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && bestQuotesData.quotes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], bestQuotesData.quotes);
    }

    public BestQuotesData(String str, String str2, List<BestQuoteItem> list) {
        this.rfqId = str;
        this.quoteSide = str2;
        this.quotes = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.BestQuoteItem>):void (m)] (LINE:5066) call: com.okinc.unify_trade.biz.BestQuotesData.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BestQuotesData(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list);
    }

    public static final class Companion {

        public static final class Activity extends TypeToken<List<? extends BestQuotesData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BestQuotesData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BestQuotesData> serializer() {
            return BestQuotesData$$serializer.INSTANCE;
        }

        public final List<BestQuotesData> copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new Activity().getType());
                if (list != null && !list.isEmpty()) {
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "BestQuotesData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }

    public final BestQuoteItem getQuote() {
        List<BestQuoteItem> list = this.quotes;
        if (list != null) {
            return (BestQuoteItem) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }
}
