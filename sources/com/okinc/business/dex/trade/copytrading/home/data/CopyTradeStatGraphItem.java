package com.okinc.business.dex.trade.copytrading.home.data;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CopyTradeStatGraphItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String realizedPnLUsdValue;
    private final String time;
    private final String totalPnLUsdValue;
    private final String unRealizedPnLUsdValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradeStatGraphItem() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CopyTradeStatGraphItem copy$default(CopyTradeStatGraphItem copyTradeStatGraphItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyTradeStatGraphItem.time;
        }
        if ((i & 2) != 0) {
            str2 = copyTradeStatGraphItem.totalPnLUsdValue;
        }
        if ((i & 4) != 0) {
            str3 = copyTradeStatGraphItem.realizedPnLUsdValue;
        }
        if ((i & 8) != 0) {
            str4 = copyTradeStatGraphItem.unRealizedPnLUsdValue;
        }
        return copyTradeStatGraphItem.copy(str, str2, str3, str4);
    }

    @SerialName("realizedPnLUsdValue")
    public static /* synthetic */ void getRealizedPnLUsdValue$annotations() {
    }

    @SerialName(CrashHianalyticsData.TIME)
    public static /* synthetic */ void getTime$annotations() {
    }

    @SerialName("totalPnlUsdValue")
    public static /* synthetic */ void getTotalPnLUsdValue$annotations() {
    }

    @SerialName("unRealizedPnLUsdValue")
    public static /* synthetic */ void getUnRealizedPnLUsdValue$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.realizedPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.unRealizedPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeStatGraphItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CopyTradeStatGraphItem(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradeStatGraphItem)) {
            return false;
        }
        CopyTradeStatGraphItem copyTradeStatGraphItem = (CopyTradeStatGraphItem) obj;
        return Intrinsics.EZpvd((Object) this.time, (Object) copyTradeStatGraphItem.time) && Intrinsics.EZpvd((Object) this.totalPnLUsdValue, (Object) copyTradeStatGraphItem.totalPnLUsdValue) && Intrinsics.EZpvd((Object) this.realizedPnLUsdValue, (Object) copyTradeStatGraphItem.realizedPnLUsdValue) && Intrinsics.EZpvd((Object) this.unRealizedPnLUsdValue, (Object) copyTradeStatGraphItem.unRealizedPnLUsdValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnLUsdValue() {
        return this.realizedPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnLUsdValue() {
        return this.totalPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnRealizedPnLUsdValue() {
        return this.unRealizedPnLUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.time.hashCode() * 31) + this.totalPnLUsdValue.hashCode()) * 31) + this.realizedPnLUsdValue.hashCode()) * 31) + this.unRealizedPnLUsdValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradeStatGraphItem(time=" + this.time + ", totalPnLUsdValue=" + this.totalPnLUsdValue + ", realizedPnLUsdValue=" + this.realizedPnLUsdValue + ", unRealizedPnLUsdValue=" + this.unRealizedPnLUsdValue + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatGraphItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CopyTradeStatGraphItem> serializer() {
            return CopyTradeStatGraphItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CopyTradeStatGraphItem(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.time = "";
        } else {
            this.time = str;
        }
        if ((i & 2) == 0) {
            this.totalPnLUsdValue = "";
        } else {
            this.totalPnLUsdValue = str2;
        }
        if ((i & 4) == 0) {
            this.realizedPnLUsdValue = "";
        } else {
            this.realizedPnLUsdValue = str3;
        }
        if ((i & 8) == 0) {
            this.unRealizedPnLUsdValue = "";
        } else {
            this.unRealizedPnLUsdValue = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CopyTradeStatGraphItem copyTradeStatGraphItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) copyTradeStatGraphItem.time, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, copyTradeStatGraphItem.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) copyTradeStatGraphItem.totalPnLUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, copyTradeStatGraphItem.totalPnLUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) copyTradeStatGraphItem.realizedPnLUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, copyTradeStatGraphItem.realizedPnLUsdValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) copyTradeStatGraphItem.unRealizedPnLUsdValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, copyTradeStatGraphItem.unRealizedPnLUsdValue);
    }

    public CopyTradeStatGraphItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.time = str;
        this.totalPnLUsdValue = str2;
        this.realizedPnLUsdValue = str3;
        this.unRealizedPnLUsdValue = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:85) call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatGraphItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CopyTradeStatGraphItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
