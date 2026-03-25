package com.okinc.dexkline.market.data.model.smart_money;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SmartMoneyAddressData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String addressAlias;
    public final AddressInfo addressInfo;
    public final String pnl7d;
    public final String roi;
    public final String walletAddress;
    public final String winRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartMoneyAddressData() {
        this((AddressInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartMoneyAddressData copy$default(SmartMoneyAddressData smartMoneyAddressData, AddressInfo addressInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            addressInfo = smartMoneyAddressData.addressInfo;
        }
        if ((i & 2) != 0) {
            str = smartMoneyAddressData.pnl7d;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = smartMoneyAddressData.roi;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = smartMoneyAddressData.walletAddress;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = smartMoneyAddressData.winRate;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = smartMoneyAddressData.addressAlias;
        }
        return smartMoneyAddressData.copydefault(addressInfo, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartMoneyAddressData copydefault(@NotNull AddressInfo addressInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SmartMoneyAddressData(addressInfo, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartMoneyAddressData)) {
            return false;
        }
        SmartMoneyAddressData smartMoneyAddressData = (SmartMoneyAddressData) obj;
        return Intrinsics.EZpvd(this.addressInfo, smartMoneyAddressData.addressInfo) && Intrinsics.EZpvd((Object) this.pnl7d, (Object) smartMoneyAddressData.pnl7d) && Intrinsics.EZpvd((Object) this.roi, (Object) smartMoneyAddressData.roi) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) smartMoneyAddressData.walletAddress) && Intrinsics.EZpvd((Object) this.winRate, (Object) smartMoneyAddressData.winRate) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) smartMoneyAddressData.addressAlias);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.addressInfo.hashCode() * 31) + this.pnl7d.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.winRate.hashCode()) * 31) + this.addressAlias.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartMoneyAddressData(addressInfo=" + this.addressInfo + ", pnl7d=" + this.pnl7d + ", roi=" + this.roi + ", walletAddress=" + this.walletAddress + ", winRate=" + this.winRate + ", addressAlias=" + this.addressAlias + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.smart_money.SmartMoneyAddressData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartMoneyAddressData> serializer() {
            return SmartMoneyAddressData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartMoneyAddressData(int i, AddressInfo addressInfo, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.addressInfo = (i & 1) == 0 ? new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null) : addressInfo;
        if ((i & 2) == 0) {
            this.pnl7d = "";
        } else {
            this.pnl7d = str;
        }
        if ((i & 4) == 0) {
            this.roi = "";
        } else {
            this.roi = str2;
        }
        if ((i & 8) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str3;
        }
        if ((i & 16) == 0) {
            this.winRate = "";
        } else {
            this.winRate = str4;
        }
        if ((i & 32) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str5;
        }
    }

    public static final /* synthetic */ void copydefault(SmartMoneyAddressData smartMoneyAddressData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(smartMoneyAddressData.addressInfo, new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, smartMoneyAddressData.addressInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smartMoneyAddressData.pnl7d, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smartMoneyAddressData.pnl7d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smartMoneyAddressData.roi, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smartMoneyAddressData.roi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smartMoneyAddressData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smartMoneyAddressData.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smartMoneyAddressData.winRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smartMoneyAddressData.winRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) smartMoneyAddressData.addressAlias, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, smartMoneyAddressData.addressAlias);
    }

    public SmartMoneyAddressData(@NotNull AddressInfo addressInfo, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.addressInfo = addressInfo;
        this.pnl7d = str;
        this.roi = str2;
        this.walletAddress = str3;
        this.winRate = str4;
        this.addressAlias = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:com.okinc.dexkline.market.data.model.smart_money.AddressInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.data.model.smart_money.AddressInfo:0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.dexkline.market.data.model.smart_money.AddressInfo.<init>(java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.dexkline.market.data.model.smart_money.AddressInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(com.okinc.dexkline.market.data.model.smart_money.AddressInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.dexkline.market.data.model.smart_money.SmartMoneyAddressData.<init>(com.okinc.dexkline.market.data.model.smart_money.AddressInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartMoneyAddressData(AddressInfo addressInfo, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AddressInfo((String) null, false, (String) null, 7, (DefaultConstructorMarker) null) : addressInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "");
    }
}
