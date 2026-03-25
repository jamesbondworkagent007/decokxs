package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.dexlogic.txs.TxType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalOverviewAddressData {
    public static final int $stable = 0;
    public final String addressAlias;
    public final AddressInfo kolAddressInfo;
    public final String txPrice;
    public final String txTime;
    public final TxType txType;
    public final String txValue;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, TxType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewAddressData() {
        this((AddressInfo) null, (String) null, (String) null, (TxType) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalOverviewAddressData copy$default(SignalOverviewAddressData signalOverviewAddressData, AddressInfo addressInfo, String str, String str2, TxType txType, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            addressInfo = signalOverviewAddressData.kolAddressInfo;
        }
        if ((i & 2) != 0) {
            str = signalOverviewAddressData.txPrice;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = signalOverviewAddressData.txTime;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            txType = signalOverviewAddressData.txType;
        }
        TxType txType2 = txType;
        if ((i & 16) != 0) {
            str3 = signalOverviewAddressData.txValue;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = signalOverviewAddressData.walletAddress;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = signalOverviewAddressData.addressAlias;
        }
        return signalOverviewAddressData.AEQbTJ(addressInfo, str6, str7, txType2, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewAddressData AEQbTJ(@NotNull AddressInfo addressInfo, @NotNull String str, @NotNull String str2, @NotNull TxType txType, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SignalOverviewAddressData(addressInfo, str, str2, txType, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.txValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType AhwBna() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.txPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressInfo OLrzqt() {
        return this.kolAddressInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalOverviewAddressData)) {
            return false;
        }
        SignalOverviewAddressData signalOverviewAddressData = (SignalOverviewAddressData) obj;
        return Intrinsics.EZpvd(this.kolAddressInfo, signalOverviewAddressData.kolAddressInfo) && Intrinsics.EZpvd((Object) this.txPrice, (Object) signalOverviewAddressData.txPrice) && Intrinsics.EZpvd((Object) this.txTime, (Object) signalOverviewAddressData.txTime) && this.txType == signalOverviewAddressData.txType && Intrinsics.EZpvd((Object) this.txValue, (Object) signalOverviewAddressData.txValue) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) signalOverviewAddressData.walletAddress) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) signalOverviewAddressData.addressAlias);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.kolAddressInfo.hashCode() * 31) + this.txPrice.hashCode()) * 31) + this.txTime.hashCode()) * 31) + this.txType.hashCode()) * 31) + this.txValue.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.addressAlias.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewAddressData(kolAddressInfo=" + this.kolAddressInfo + ", txPrice=" + this.txPrice + ", txTime=" + this.txTime + ", txType=" + this.txType + ", txValue=" + this.txValue + ", walletAddress=" + this.walletAddress + ", addressAlias=" + this.addressAlias + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.walletAddress;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalOverviewAddressData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalOverviewAddressData> serializer() {
            return SignalOverviewAddressData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalOverviewAddressData(int i, AddressInfo addressInfo, String str, String str2, TxType txType, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.kolAddressInfo = (i & 1) == 0 ? new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null) : addressInfo;
        if ((i & 2) == 0) {
            this.txPrice = "";
        } else {
            this.txPrice = str;
        }
        if ((i & 4) == 0) {
            this.txTime = "";
        } else {
            this.txTime = str2;
        }
        if ((i & 8) == 0) {
            this.txType = TxType.ALL;
        } else {
            this.txType = txType;
        }
        if ((i & 16) == 0) {
            this.txValue = "";
        } else {
            this.txValue = str3;
        }
        if ((i & 32) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str4;
        }
        if ((i & 64) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str5;
        }
    }

    public static final /* synthetic */ void KWHzl(SignalOverviewAddressData signalOverviewAddressData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalOverviewAddressData.kolAddressInfo, new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, signalOverviewAddressData.kolAddressInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalOverviewAddressData.txPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalOverviewAddressData.txPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signalOverviewAddressData.txTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signalOverviewAddressData.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalOverviewAddressData.txType != TxType.ALL) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], signalOverviewAddressData.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalOverviewAddressData.txValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalOverviewAddressData.txValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalOverviewAddressData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalOverviewAddressData.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) signalOverviewAddressData.addressAlias, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, signalOverviewAddressData.addressAlias);
    }

    public SignalOverviewAddressData(@NotNull AddressInfo addressInfo, @NotNull String str, @NotNull String str2, @NotNull TxType txType, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.kolAddressInfo = addressInfo;
        this.txPrice = str;
        this.txTime = str2;
        this.txType = txType;
        this.txValue = str3;
        this.walletAddress = str4;
        this.addressAlias = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.smart_money.AddressInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.model.smart_money.AddressInfo:0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.business.market.data.model.smart_money.AddressInfo.<init>(java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.market.data.model.smart_money.AddressInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.txs.TxType:0x0025: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.txs.TxType:0x0023: SGET  A[WRAPPED] (LINE:35) com.okinc.business.dexlogic.txs.TxType.ALL com.okinc.business.dexlogic.txs.TxType) : (r10v0 com.okinc.business.dexlogic.txs.TxType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r14v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
 A[MD:(com.okinc.business.market.data.model.smart_money.AddressInfo, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:27) call: com.okinc.business.market.data.model.smart_money.SignalOverviewAddressData.<init>(com.okinc.business.market.data.model.smart_money.AddressInfo, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalOverviewAddressData(AddressInfo addressInfo, String str, String str2, TxType txType, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null) : addressInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? TxType.ALL : txType, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "");
    }
}
