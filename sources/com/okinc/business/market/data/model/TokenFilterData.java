package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TokenFilterData {
    public final List<String> addressList;
    public final String chainId;
    public final String lowerBound;
    public final String tokenAddress;
    public final String type;
    public final String upperBound;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenFilterData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.data.model.TokenFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenFilterData copy$default(TokenFilterData tokenFilterData, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenFilterData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = tokenFilterData.tokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tokenFilterData.type;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tokenFilterData.lowerBound;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tokenFilterData.upperBound;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = tokenFilterData.addressList;
        }
        return tokenFilterData.KWHzl(str, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilterData KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenFilterData(str, str2, str3, str4, str5, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFilterData)) {
            return false;
        }
        TokenFilterData tokenFilterData = (TokenFilterData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenFilterData.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tokenFilterData.tokenAddress) && Intrinsics.EZpvd((Object) this.type, (Object) tokenFilterData.type) && Intrinsics.EZpvd((Object) this.lowerBound, (Object) tokenFilterData.lowerBound) && Intrinsics.EZpvd((Object) this.upperBound, (Object) tokenFilterData.upperBound) && Intrinsics.EZpvd(this.addressList, tokenFilterData.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainId.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.type.hashCode()) * 31) + this.lowerBound.hashCode()) * 31) + this.upperBound.hashCode()) * 31) + this.addressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenFilterData(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", type=" + this.type + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ", addressList=" + this.addressList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TokenFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenFilterData> serializer() {
            return TokenFilterData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenFilterData(int i, String str, String str2, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.lowerBound = "";
        } else {
            this.lowerBound = str4;
        }
        if ((i & 16) == 0) {
            this.upperBound = "";
        } else {
            this.upperBound = str5;
        }
        if ((i & 32) == 0) {
            this.addressList = yDY.AhwBna();
        } else {
            this.addressList = list;
        }
    }

    public static final /* synthetic */ void KWHzl(TokenFilterData tokenFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenFilterData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenFilterData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenFilterData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenFilterData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenFilterData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenFilterData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenFilterData.lowerBound, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenFilterData.lowerBound);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenFilterData.upperBound, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenFilterData.upperBound);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(tokenFilterData.addressList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tokenFilterData.addressList);
    }

    public TokenFilterData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.type = str3;
        this.lowerBound = str4;
        this.upperBound = str5;
        this.addressList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.TokenFilterData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TokenFilterData(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}
