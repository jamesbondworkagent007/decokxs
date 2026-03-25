package com.okinc.okimcore.model.room.inhouseim;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ContractAddressTokenInfo {
    public final String chainLogo;
    public final String contractAddress;
    public final String currentPrice;
    public final List<ConversationIcon> icons;
    public final Boolean isDexListed;
    public final String tokenLogo;
    public final String tokenName;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> AEQbTJ() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAddressTokenInfo EZpvd(String str, String str2, String str3, Boolean bool, String str4, String str5, List<ConversationIcon> list, String str6) {
        return new ContractAddressTokenInfo(str, str2, str3, bool, str4, str5, list, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean djBIcL() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContractAddressTokenInfo)) {
            return false;
        }
        ContractAddressTokenInfo contractAddressTokenInfo = (ContractAddressTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) contractAddressTokenInfo.tokenName) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) contractAddressTokenInfo.contractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) contractAddressTokenInfo.tokenSymbol) && Intrinsics.EZpvd(this.isDexListed, contractAddressTokenInfo.isDexListed) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) contractAddressTokenInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) contractAddressTokenInfo.chainLogo) && Intrinsics.EZpvd(this.icons, contractAddressTokenInfo.icons) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) contractAddressTokenInfo.currentPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.contractAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenSymbol;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isDexListed;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str4 = this.tokenLogo;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.chainLogo;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        List<ConversationIcon> list = this.icons;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        String str6 = this.currentPrice;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractAddressTokenInfo(tokenName=" + this.tokenName + ", contractAddress=" + this.contractAddress + ", tokenSymbol=" + this.tokenSymbol + ", isDexListed=" + this.isDexListed + ", tokenLogo=" + this.tokenLogo + ", chainLogo=" + this.chainLogo + ", icons=" + this.icons + ", currentPrice=" + this.currentPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenLogo;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.ContractAddressTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractAddressTokenInfo> serializer() {
            return ContractAddressTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractAddressTokenInfo(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, ContractAddressTokenInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenName = str;
        this.contractAddress = str2;
        this.tokenSymbol = str3;
        this.isDexListed = bool;
        this.tokenLogo = str4;
        this.chainLogo = str5;
        this.icons = list;
        this.currentPrice = str6;
    }

    public static final /* synthetic */ void OLrzqt(ContractAddressTokenInfo contractAddressTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, contractAddressTokenInfo.tokenName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, contractAddressTokenInfo.contractAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, contractAddressTokenInfo.tokenSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, contractAddressTokenInfo.isDexListed);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, contractAddressTokenInfo.tokenLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, contractAddressTokenInfo.chainLogo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], contractAddressTokenInfo.icons);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, contractAddressTokenInfo.currentPrice);
    }

    public ContractAddressTokenInfo(String str, String str2, String str3, Boolean bool, String str4, String str5, List<ConversationIcon> list, String str6) {
        this.tokenName = str;
        this.contractAddress = str2;
        this.tokenSymbol = str3;
        this.isDexListed = bool;
        this.tokenLogo = str4;
        this.chainLogo = str5;
        this.icons = list;
        this.currentPrice = str6;
    }
}
