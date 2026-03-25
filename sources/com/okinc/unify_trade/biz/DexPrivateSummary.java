package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DexPrivateSummary {
    private String dexPendingOrderNum;
    private String dexTpslPendingOrderNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexPrivateSummary() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexPrivateSummary copy$default(DexPrivateSummary dexPrivateSummary, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexPrivateSummary.dexPendingOrderNum;
        }
        if ((i & 2) != 0) {
            str2 = dexPrivateSummary.dexTpslPendingOrderNum;
        }
        return dexPrivateSummary.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dexPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dexTpslPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPrivateSummary copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexPrivateSummary(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexPrivateSummary)) {
            return false;
        }
        DexPrivateSummary dexPrivateSummary = (DexPrivateSummary) obj;
        return Intrinsics.EZpvd((Object) this.dexPendingOrderNum, (Object) dexPrivateSummary.dexPendingOrderNum) && Intrinsics.EZpvd((Object) this.dexTpslPendingOrderNum, (Object) dexPrivateSummary.dexTpslPendingOrderNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexPendingOrderNum() {
        return this.dexPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexTpslPendingOrderNum() {
        return this.dexTpslPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.dexPendingOrderNum.hashCode() * 31) + this.dexTpslPendingOrderNum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexPendingOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexPendingOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexTpslPendingOrderNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dexTpslPendingOrderNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexPrivateSummary(dexPendingOrderNum=" + this.dexPendingOrderNum + ", dexTpslPendingOrderNum=" + this.dexTpslPendingOrderNum + ")";
    }

    public /* synthetic */ DexPrivateSummary(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.dexPendingOrderNum = "0";
        } else {
            this.dexPendingOrderNum = str;
        }
        if ((i & 2) == 0) {
            this.dexTpslPendingOrderNum = "0";
        } else {
            this.dexTpslPendingOrderNum = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DexPrivateSummary dexPrivateSummary, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexPrivateSummary.dexPendingOrderNum, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexPrivateSummary.dexPendingOrderNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) dexPrivateSummary.dexTpslPendingOrderNum, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexPrivateSummary.dexTpslPendingOrderNum);
    }

    public DexPrivateSummary(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.dexPendingOrderNum = str;
        this.dexTpslPendingOrderNum = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.unify_trade.biz.DexPrivateSummary.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexPrivateSummary(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DexPrivateSummary.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexPrivateSummary> serializer() {
            return DexPrivateSummary$$serializer.INSTANCE;
        }

        public final DexPrivateSummary copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                return (DexPrivateSummary) r0.decodeFromString(DexPrivateSummary.Companion.serializer(), str);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
