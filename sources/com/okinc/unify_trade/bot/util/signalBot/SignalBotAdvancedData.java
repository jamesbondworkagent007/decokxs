package com.okinc.unify_trade.bot.util.signalBot;

import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam$$serializer;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SignalBotAdvancedData {
    private boolean allowMultipleEntry;
    private String ratio;
    private ExitSignalOrderAmtParam signalBotOrderStopParam;
    private final EntrySignalOrderAmtParam signalOrderAmtParam;
    private String subOrdType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotAdvancedData() {
        this((String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalBotAdvancedData copy$default(SignalBotAdvancedData signalBotAdvancedData, String str, String str2, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotAdvancedData.subOrdType;
        }
        if ((i & 2) != 0) {
            str2 = signalBotAdvancedData.ratio;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            entrySignalOrderAmtParam = signalBotAdvancedData.signalOrderAmtParam;
        }
        EntrySignalOrderAmtParam entrySignalOrderAmtParam2 = entrySignalOrderAmtParam;
        if ((i & 8) != 0) {
            exitSignalOrderAmtParam = signalBotAdvancedData.signalBotOrderStopParam;
        }
        ExitSignalOrderAmtParam exitSignalOrderAmtParam2 = exitSignalOrderAmtParam;
        if ((i & 16) != 0) {
            z = signalBotAdvancedData.allowMultipleEntry;
        }
        return signalBotAdvancedData.copy(str, str3, entrySignalOrderAmtParam2, exitSignalOrderAmtParam2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam component3() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component4() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotAdvancedData copy(@NotNull String str, String str2, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalBotAdvancedData(str, str2, entrySignalOrderAmtParam, exitSignalOrderAmtParam, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalBotAdvancedData)) {
            return false;
        }
        SignalBotAdvancedData signalBotAdvancedData = (SignalBotAdvancedData) obj;
        return Intrinsics.EZpvd((Object) this.subOrdType, (Object) signalBotAdvancedData.subOrdType) && Intrinsics.EZpvd((Object) this.ratio, (Object) signalBotAdvancedData.ratio) && Intrinsics.EZpvd(this.signalOrderAmtParam, signalBotAdvancedData.signalOrderAmtParam) && Intrinsics.EZpvd(this.signalBotOrderStopParam, signalBotAdvancedData.signalBotOrderStopParam) && this.allowMultipleEntry == signalBotAdvancedData.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowMultipleEntry() {
        return this.allowMultipleEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntrySignalOrderAmtParam getSignalOrderAmtParam() {
        return this.signalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubOrdType() {
        return this.subOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.subOrdType.hashCode();
        String str = this.ratio;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.signalOrderAmtParam;
        int iHashCode3 = entrySignalOrderAmtParam == null ? 0 : entrySignalOrderAmtParam.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (exitSignalOrderAmtParam != null ? exitSignalOrderAmtParam.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowMultipleEntry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowMultipleEntry(boolean z) {
        this.allowMultipleEntry = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(String str) {
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalBotOrderStopParam(ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotAdvancedData(subOrdType=" + this.subOrdType + ", ratio=" + this.ratio + ", signalOrderAmtParam=" + this.signalOrderAmtParam + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ", allowMultipleEntry=" + this.allowMultipleEntry + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotAdvancedData> serializer() {
            return SignalBotAdvancedData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotAdvancedData(int i, String str, String str2, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.subOrdType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.ratio = null;
        } else {
            this.ratio = str2;
        }
        if ((i & 4) == 0) {
            this.signalOrderAmtParam = null;
        } else {
            this.signalOrderAmtParam = entrySignalOrderAmtParam;
        }
        if ((i & 8) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
        if ((i & 16) == 0) {
            this.allowMultipleEntry = true;
        } else {
            this.allowMultipleEntry = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotAdvancedData signalBotAdvancedData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalBotAdvancedData.subOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalBotAdvancedData.subOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotAdvancedData.ratio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signalBotAdvancedData.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signalBotAdvancedData.signalOrderAmtParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, EntrySignalOrderAmtParam$$serializer.INSTANCE, signalBotAdvancedData.signalOrderAmtParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalBotAdvancedData.signalBotOrderStopParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ExitSignalOrderAmtParam$$serializer.INSTANCE, signalBotAdvancedData.signalBotOrderStopParam);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && signalBotAdvancedData.allowMultipleEntry) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, signalBotAdvancedData.allowMultipleEntry);
    }

    public SignalBotAdvancedData(@NotNull String str, String str2, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subOrdType = str;
        this.ratio = str2;
        this.signalOrderAmtParam = entrySignalOrderAmtParam;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        this.allowMultipleEntry = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.EntrySignalOrderAmtParam:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.EntrySignalOrderAmtParam) : (r6v0 com.okinc.unify_trade.biz.EntrySignalOrderAmtParam))
  (wrap:com.okinc.unify_trade.biz.ExitSignalOrderAmtParam:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 com.okinc.unify_trade.biz.ExitSignalOrderAmtParam) : (null com.okinc.unify_trade.biz.ExitSignalOrderAmtParam))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EntrySignalOrderAmtParam, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam, boolean):void (m)] (LINE:195) call: com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.EntrySignalOrderAmtParam, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam, boolean):void type: THIS */
    public /* synthetic */ SignalBotAdvancedData(String str, String str2, EntrySignalOrderAmtParam entrySignalOrderAmtParam, ExitSignalOrderAmtParam exitSignalOrderAmtParam, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : entrySignalOrderAmtParam, (i & 8) == 0 ? exitSignalOrderAmtParam : null, (i & 16) != 0 ? true : z);
    }
}
