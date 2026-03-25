package com.okinc.unify_trade.biz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class PreQuoteInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String instId;
    private final String modificationTimestamp;
    private final String preQuoteEndTimestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreQuoteInfoData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreQuoteInfoData copy$default(PreQuoteInfoData preQuoteInfoData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preQuoteInfoData.modificationTimestamp;
        }
        if ((i & 2) != 0) {
            str2 = preQuoteInfoData.instId;
        }
        if ((i & 4) != 0) {
            str3 = preQuoteInfoData.preQuoteEndTimestamp;
        }
        return preQuoteInfoData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.modificationTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preQuoteEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreQuoteInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PreQuoteInfoData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreQuoteInfoData)) {
            return false;
        }
        PreQuoteInfoData preQuoteInfoData = (PreQuoteInfoData) obj;
        return Intrinsics.EZpvd((Object) this.modificationTimestamp, (Object) preQuoteInfoData.modificationTimestamp) && Intrinsics.EZpvd((Object) this.instId, (Object) preQuoteInfoData.instId) && Intrinsics.EZpvd((Object) this.preQuoteEndTimestamp, (Object) preQuoteInfoData.preQuoteEndTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModificationTimestamp() {
        return this.modificationTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreQuoteEndTimestamp() {
        return this.preQuoteEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.modificationTimestamp.hashCode() * 31) + this.instId.hashCode()) * 31) + this.preQuoteEndTimestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreQuoteInfoData(modificationTimestamp=" + this.modificationTimestamp + ", instId=" + this.instId + ", preQuoteEndTimestamp=" + this.preQuoteEndTimestamp + ")";
    }

    public /* synthetic */ PreQuoteInfoData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.modificationTimestamp = "";
        } else {
            this.modificationTimestamp = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.preQuoteEndTimestamp = "";
        } else {
            this.preQuoteEndTimestamp = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PreQuoteInfoData preQuoteInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) preQuoteInfoData.modificationTimestamp, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, preQuoteInfoData.modificationTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) preQuoteInfoData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, preQuoteInfoData.instId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) preQuoteInfoData.preQuoteEndTimestamp, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, preQuoteInfoData.preQuoteEndTimestamp);
    }

    public PreQuoteInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.modificationTimestamp = str;
        this.instId = str2;
        this.preQuoteEndTimestamp = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:417) call: com.okinc.unify_trade.biz.PreQuoteInfoData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PreQuoteInfoData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends PreQuoteInfoData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PreQuoteInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreQuoteInfoData> serializer() {
            return PreQuoteInfoData$$serializer.INSTANCE;
        }

        public final List<PreQuoteInfoData> KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<PreQuoteInfoData> list = (List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null) {
                    if (!list.isEmpty()) {
                        return list;
                    }
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "PreQuoteInfoData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}
