package com.okinc.business.market.features.meme.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PersonalizedInfoWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chain;
    private final String collect;
    private final String sameCarFollowedCount;
    private final String sameCarNumber;
    private final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PersonalizedInfoWsData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PersonalizedInfoWsData copy$default(PersonalizedInfoWsData personalizedInfoWsData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizedInfoWsData.sameCarNumber;
        }
        if ((i & 2) != 0) {
            str2 = personalizedInfoWsData.sameCarFollowedCount;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = personalizedInfoWsData.chain;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = personalizedInfoWsData.tokenContractAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = personalizedInfoWsData.collect;
        }
        return personalizedInfoWsData.copy(str, str6, str7, str8, str5);
    }

    @SerialName("chain")
    public static /* synthetic */ void getChain$annotations() {
    }

    @SerialName("collect")
    public static /* synthetic */ void getCollect$annotations() {
    }

    @SerialName("flwCarCnt")
    public static /* synthetic */ void getSameCarFollowedCount$annotations() {
    }

    @SerialName("carCnt")
    public static /* synthetic */ void getSameCarNumber$annotations() {
    }

    @SerialName("ca")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sameCarNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sameCarFollowedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.collect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalizedInfoWsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PersonalizedInfoWsData(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizedInfoWsData)) {
            return false;
        }
        PersonalizedInfoWsData personalizedInfoWsData = (PersonalizedInfoWsData) obj;
        return Intrinsics.EZpvd((Object) this.sameCarNumber, (Object) personalizedInfoWsData.sameCarNumber) && Intrinsics.EZpvd((Object) this.sameCarFollowedCount, (Object) personalizedInfoWsData.sameCarFollowedCount) && Intrinsics.EZpvd((Object) this.chain, (Object) personalizedInfoWsData.chain) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) personalizedInfoWsData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.collect, (Object) personalizedInfoWsData.collect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollect() {
        return this.collect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSameCarFollowedCount() {
        return this.sameCarFollowedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSameCarNumber() {
        return this.sameCarNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.sameCarNumber.hashCode() * 31) + this.sameCarFollowedCount.hashCode()) * 31) + this.chain.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.collect.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PersonalizedInfoWsData(sameCarNumber=" + this.sameCarNumber + ", sameCarFollowedCount=" + this.sameCarFollowedCount + ", chain=" + this.chain + ", tokenContractAddress=" + this.tokenContractAddress + ", collect=" + this.collect + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PersonalizedInfoWsData> serializer() {
            return PersonalizedInfoWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PersonalizedInfoWsData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sameCarNumber = "";
        } else {
            this.sameCarNumber = str;
        }
        if ((i & 2) == 0) {
            this.sameCarFollowedCount = "";
        } else {
            this.sameCarFollowedCount = str2;
        }
        if ((i & 4) == 0) {
            this.chain = "";
        } else {
            this.chain = str3;
        }
        if ((i & 8) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str4;
        }
        if ((i & 16) == 0) {
            this.collect = "";
        } else {
            this.collect = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PersonalizedInfoWsData personalizedInfoWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) personalizedInfoWsData.sameCarNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, personalizedInfoWsData.sameCarNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) personalizedInfoWsData.sameCarFollowedCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, personalizedInfoWsData.sameCarFollowedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) personalizedInfoWsData.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, personalizedInfoWsData.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) personalizedInfoWsData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, personalizedInfoWsData.tokenContractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) personalizedInfoWsData.collect, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, personalizedInfoWsData.collect);
    }

    public PersonalizedInfoWsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.sameCarNumber = str;
        this.sameCarFollowedCount = str2;
        this.chain = str3;
        this.tokenContractAddress = str4;
        this.collect = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PersonalizedInfoWsData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final boolean isCollected() {
        return Intrinsics.EZpvd((Object) this.collect, (Object) "1");
    }
}
