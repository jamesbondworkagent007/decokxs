package com.okinc.unify_trade.biz.subscribe;

import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradePositionInfo {
    private final String accountName;
    private final String auth;
    private final String main;
    private final List<TradePositionData> positions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradePositionData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradePositionInfo() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.TradePositionInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradePositionInfo copy$default(TradePositionInfo tradePositionInfo, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradePositionInfo.accountName;
        }
        if ((i & 2) != 0) {
            str2 = tradePositionInfo.main;
        }
        if ((i & 4) != 0) {
            str3 = tradePositionInfo.auth;
        }
        if ((i & 8) != 0) {
            list = tradePositionInfo.positions;
        }
        return tradePositionInfo.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.auth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradePositionData> component4() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradePositionInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<TradePositionData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TradePositionInfo(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradePositionInfo)) {
            return false;
        }
        TradePositionInfo tradePositionInfo = (TradePositionInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountName, (Object) tradePositionInfo.accountName) && Intrinsics.EZpvd((Object) this.main, (Object) tradePositionInfo.main) && Intrinsics.EZpvd((Object) this.auth, (Object) tradePositionInfo.auth) && Intrinsics.EZpvd(this.positions, tradePositionInfo.positions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuth() {
        return this.auth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMain() {
        return this.main;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradePositionData> getPositions() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accountName.hashCode() * 31) + this.main.hashCode()) * 31) + this.auth.hashCode()) * 31) + this.positions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradePositionInfo(accountName=" + this.accountName + ", main=" + this.main + ", auth=" + this.auth + ", positions=" + this.positions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradePositionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradePositionInfo> serializer() {
            return TradePositionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradePositionInfo(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str;
        }
        if ((i & 2) == 0) {
            this.main = "";
        } else {
            this.main = str2;
        }
        if ((i & 4) == 0) {
            this.auth = "";
        } else {
            this.auth = str3;
        }
        if ((i & 8) == 0) {
            this.positions = new ArrayList();
        } else {
            this.positions = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradePositionInfo tradePositionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradePositionInfo.accountName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradePositionInfo.accountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradePositionInfo.main, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradePositionInfo.main);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradePositionInfo.auth, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradePositionInfo.auth);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(tradePositionInfo.positions, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], tradePositionInfo.positions);
    }

    public TradePositionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<TradePositionData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountName = str;
        this.main = str2;
        this.auth = str3;
        this.positions = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0017: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:100) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.TradePositionData>):void (m)] (LINE:96) call: com.okinc.unify_trade.biz.subscribe.TradePositionInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TradePositionInfo(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new ArrayList() : list);
    }
}
