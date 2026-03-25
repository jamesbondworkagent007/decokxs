package com.okinc.buysell.ui.otcagent.depositcard;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OtcAgentDepositCardMessageData {
    public static final int $stable = 0;
    private final String amount;
    private final String currency;
    private final int currencyId;
    private final OtcAgentDepositCardDepositType depositType;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType", OtcAgentDepositCardDepositType.values()), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OtcAgentDepositCardMessageData() {
        this((OtcAgentDepositCardDepositType) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OtcAgentDepositCardMessageData copy$default(OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, OtcAgentDepositCardDepositType otcAgentDepositCardDepositType, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            otcAgentDepositCardDepositType = otcAgentDepositCardMessageData.depositType;
        }
        if ((i2 & 2) != 0) {
            str = otcAgentDepositCardMessageData.amount;
        }
        if ((i2 & 4) != 0) {
            str2 = otcAgentDepositCardMessageData.currency;
        }
        if ((i2 & 8) != 0) {
            i = otcAgentDepositCardMessageData.currencyId;
        }
        return otcAgentDepositCardMessageData.copy(otcAgentDepositCardDepositType, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentDepositCardDepositType component1() {
        return this.depositType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentDepositCardMessageData copy(@NotNull OtcAgentDepositCardDepositType otcAgentDepositCardDepositType, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(otcAgentDepositCardDepositType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OtcAgentDepositCardMessageData(otcAgentDepositCardDepositType, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtcAgentDepositCardMessageData)) {
            return false;
        }
        OtcAgentDepositCardMessageData otcAgentDepositCardMessageData = (OtcAgentDepositCardMessageData) obj;
        return this.depositType == otcAgentDepositCardMessageData.depositType && Intrinsics.EZpvd((Object) this.amount, (Object) otcAgentDepositCardMessageData.amount) && Intrinsics.EZpvd((Object) this.currency, (Object) otcAgentDepositCardMessageData.currency) && this.currencyId == otcAgentDepositCardMessageData.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentDepositCardDepositType getDepositType() {
        return this.depositType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.depositType.hashCode() * 31) + this.amount.hashCode()) * 31) + this.currency.hashCode()) * 31) + Integer.hashCode(this.currencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OtcAgentDepositCardMessageData(depositType=" + this.depositType + ", amount=" + this.amount + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OtcAgentDepositCardMessageData> serializer() {
            return OtcAgentDepositCardMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OtcAgentDepositCardMessageData(int i, OtcAgentDepositCardDepositType otcAgentDepositCardDepositType, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.depositType = (i & 1) == 0 ? OtcAgentDepositCardDepositType.FIAT : otcAgentDepositCardDepositType;
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
        if ((i & 8) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(OtcAgentDepositCardMessageData otcAgentDepositCardMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || otcAgentDepositCardMessageData.depositType != OtcAgentDepositCardDepositType.FIAT) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], otcAgentDepositCardMessageData.depositType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) otcAgentDepositCardMessageData.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, otcAgentDepositCardMessageData.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) otcAgentDepositCardMessageData.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, otcAgentDepositCardMessageData.currency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && otcAgentDepositCardMessageData.currencyId == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, otcAgentDepositCardMessageData.currencyId);
    }

    public OtcAgentDepositCardMessageData(@NotNull OtcAgentDepositCardDepositType otcAgentDepositCardDepositType, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(otcAgentDepositCardDepositType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.depositType = otcAgentDepositCardDepositType;
        this.amount = str;
        this.currency = str2;
        this.currencyId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType:0x0004: SGET  A[WRAPPED] (LINE:9) com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType.FIAT com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType) : (r2v0 com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType, java.lang.String, java.lang.String, int):void (m)] (LINE:8) call: com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardMessageData.<init>(com.okinc.buysell.ui.otcagent.depositcard.OtcAgentDepositCardDepositType, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ OtcAgentDepositCardMessageData(OtcAgentDepositCardDepositType otcAgentDepositCardDepositType, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OtcAgentDepositCardDepositType.FIAT : otcAgentDepositCardDepositType, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
    }
}
