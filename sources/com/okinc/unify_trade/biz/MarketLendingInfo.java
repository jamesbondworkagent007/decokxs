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
public final class MarketLendingInfo {
    private final String currentPage;
    private final ArrayList<MarketLendingData> list;
    private final String pageLength;
    private final String total;
    private final String totalBorrowing;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(MarketLendingData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.MarketLendingInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketLendingInfo copy$default(MarketLendingInfo marketLendingInfo, String str, ArrayList arrayList, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketLendingInfo.currentPage;
        }
        if ((i & 2) != 0) {
            arrayList = marketLendingInfo.list;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            str2 = marketLendingInfo.pageLength;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = marketLendingInfo.total;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = marketLendingInfo.totalBorrowing;
        }
        return marketLendingInfo.copy(str, arrayList2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<MarketLendingData> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalBorrowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketLendingInfo copy(@NotNull String str, @NotNull ArrayList<MarketLendingData> arrayList, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MarketLendingInfo(str, arrayList, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLendingInfo)) {
            return false;
        }
        MarketLendingInfo marketLendingInfo = (MarketLendingInfo) obj;
        return Intrinsics.EZpvd((Object) this.currentPage, (Object) marketLendingInfo.currentPage) && Intrinsics.EZpvd(this.list, marketLendingInfo.list) && Intrinsics.EZpvd((Object) this.pageLength, (Object) marketLendingInfo.pageLength) && Intrinsics.EZpvd((Object) this.total, (Object) marketLendingInfo.total) && Intrinsics.EZpvd((Object) this.totalBorrowing, (Object) marketLendingInfo.totalBorrowing);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<MarketLendingData> getList() {
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
    public final String getTotalBorrowing() {
        return this.totalBorrowing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.currentPage.hashCode() * 31) + this.list.hashCode()) * 31) + this.pageLength.hashCode()) * 31) + this.total.hashCode()) * 31) + this.totalBorrowing.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketLendingInfo(currentPage=" + this.currentPage + ", list=" + this.list + ", pageLength=" + this.pageLength + ", total=" + this.total + ", totalBorrowing=" + this.totalBorrowing + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MarketLendingInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketLendingInfo> serializer() {
            return MarketLendingInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketLendingInfo(int i, String str, ArrayList arrayList, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i, 29, MarketLendingInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.currentPage = str;
        if ((i & 2) == 0) {
            this.list = new ArrayList<>();
        } else {
            this.list = arrayList;
        }
        this.pageLength = str2;
        this.total = str3;
        this.totalBorrowing = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MarketLendingInfo marketLendingInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, marketLendingInfo.currentPage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(marketLendingInfo.list, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], marketLendingInfo.list);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketLendingInfo.pageLength);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, marketLendingInfo.total);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, marketLendingInfo.totalBorrowing);
    }

    public MarketLendingInfo(@NotNull String str, @NotNull ArrayList<MarketLendingData> arrayList, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.currentPage = str;
        this.list = arrayList;
        this.pageLength = str2;
        this.total = str3;
        this.totalBorrowing = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:246) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.MarketLendingData>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:244) call: com.okinc.unify_trade.biz.MarketLendingInfo.<init>(java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketLendingInfo(String str, ArrayList arrayList, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ArrayList() : arrayList, str2, str3, str4);
    }
}
