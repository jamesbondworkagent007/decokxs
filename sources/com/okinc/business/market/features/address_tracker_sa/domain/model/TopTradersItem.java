package com.okinc.business.market.features.address_tracker_sa.domain.model;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TopTradersItem {
    private final String chainLogo;
    private final String pnl;
    private final String roi;
    private final List<CompactTagData> traderList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopTradersItem() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopTradersItem copy$default(TopTradersItem topTradersItem, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topTradersItem.chainLogo;
        }
        if ((i & 2) != 0) {
            str2 = topTradersItem.pnl;
        }
        if ((i & 4) != 0) {
            str3 = topTradersItem.roi;
        }
        if ((i & 8) != 0) {
            list = topTradersItem.traderList;
        }
        return topTradersItem.copy(str, str2, str3, list);
    }

    @SerialName("chainLogo")
    public static /* synthetic */ void getChainLogo$annotations() {
    }

    @SerialName("pnl")
    public static /* synthetic */ void getPnl$annotations() {
    }

    @SerialName("roi")
    public static /* synthetic */ void getRoi$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getTraderList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component4() {
        return this.traderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopTradersItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TopTradersItem(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopTradersItem)) {
            return false;
        }
        TopTradersItem topTradersItem = (TopTradersItem) obj;
        return Intrinsics.EZpvd((Object) this.chainLogo, (Object) topTradersItem.chainLogo) && Intrinsics.EZpvd((Object) this.pnl, (Object) topTradersItem.pnl) && Intrinsics.EZpvd((Object) this.roi, (Object) topTradersItem.roi) && Intrinsics.EZpvd(this.traderList, topTradersItem.traderList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRoi() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getTraderList() {
        return this.traderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainLogo.hashCode() * 31) + this.pnl.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.traderList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopTradersItem(chainLogo=" + this.chainLogo + ", pnl=" + this.pnl + ", roi=" + this.roi + ", traderList=" + this.traderList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopTradersItem> serializer() {
            return TopTradersItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopTradersItem(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str;
        }
        if ((i & 2) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str2;
        }
        if ((i & 4) == 0) {
            this.roi = "";
        } else {
            this.roi = str3;
        }
        if ((i & 8) == 0) {
            this.traderList = yDY.AhwBna();
        } else {
            this.traderList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TopTradersItem topTradersItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) topTradersItem.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, topTradersItem.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) topTradersItem.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, topTradersItem.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) topTradersItem.roi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, topTradersItem.roi);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(topTradersItem.traderList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], topTradersItem.traderList);
    }

    public TopTradersItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainLogo = str;
        this.pnl = str2;
        this.roi = str3;
        this.traderList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:46)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>):void (m)] (LINE:38) call: com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TopTradersItem(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
