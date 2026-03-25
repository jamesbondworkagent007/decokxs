package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SettingWatchList {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String alias;
    private final String chainId;
    private final String expTime;
    private final String instId;
    private final String instType;
    private final String operator;
    private final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SettingWatchList copy$default(SettingWatchList settingWatchList, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingWatchList.operator;
        }
        if ((i & 2) != 0) {
            str2 = settingWatchList.instId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = settingWatchList.instType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = settingWatchList.alias;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = settingWatchList.expTime;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = settingWatchList.chainId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = settingWatchList.tokenContractAddress;
        }
        return settingWatchList.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.operator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingWatchList copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SettingWatchList(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingWatchList)) {
            return false;
        }
        SettingWatchList settingWatchList = (SettingWatchList) obj;
        return Intrinsics.EZpvd((Object) this.operator, (Object) settingWatchList.operator) && Intrinsics.EZpvd((Object) this.instId, (Object) settingWatchList.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) settingWatchList.instType) && Intrinsics.EZpvd((Object) this.alias, (Object) settingWatchList.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) settingWatchList.expTime) && Intrinsics.EZpvd((Object) this.chainId, (Object) settingWatchList.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) settingWatchList.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.operator.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.instType.hashCode();
        String str = this.alias;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.expTime;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenContractAddress;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SettingWatchList(operator=" + this.operator + ", instId=" + this.instId + ", instType=" + this.instType + ", alias=" + this.alias + ", expTime=" + this.expTime + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.SettingWatchList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SettingWatchList> serializer() {
            return SettingWatchList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SettingWatchList(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (24 != (i & 24)) {
            PluginExceptionsKt.throwMissingFieldException(i, 24, SettingWatchList$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.operator = "";
        } else {
            this.operator = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.instType = "";
        } else {
            this.instType = str3;
        }
        this.alias = str4;
        this.expTime = str5;
        if ((i & 32) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str6;
        }
        if ((i & 64) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SettingWatchList settingWatchList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) settingWatchList.operator, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, settingWatchList.operator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) settingWatchList.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, settingWatchList.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) settingWatchList.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, settingWatchList.instType);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, settingWatchList.alias);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, settingWatchList.expTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) settingWatchList.chainId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, settingWatchList.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) settingWatchList.tokenContractAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, settingWatchList.tokenContractAddress);
    }

    public SettingWatchList(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.operator = str;
        this.instId = str2;
        this.instType = str3;
        this.alias = str4;
        this.expTime = str5;
        this.chainId = str6;
        this.tokenContractAddress = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:57) call: com.okinc.unify_trade.biz.subscribe.SettingWatchList.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SettingWatchList(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
