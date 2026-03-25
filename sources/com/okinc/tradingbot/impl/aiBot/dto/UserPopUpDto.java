package com.okinc.tradingbot.impl.aiBot.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class UserPopUpDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String strategyType;
    private final String ts;
    private final String type;
    private final boolean whether;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserPopUpDto() {
        this((String) null, (String) null, (String) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserPopUpDto copy$default(UserPopUpDto userPopUpDto, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPopUpDto.type;
        }
        if ((i & 2) != 0) {
            str2 = userPopUpDto.strategyType;
        }
        if ((i & 4) != 0) {
            str3 = userPopUpDto.ts;
        }
        if ((i & 8) != 0) {
            z = userPopUpDto.whether;
        }
        return userPopUpDto.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.whether;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPopUpDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UserPopUpDto(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPopUpDto)) {
            return false;
        }
        UserPopUpDto userPopUpDto = (UserPopUpDto) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) userPopUpDto.type) && Intrinsics.EZpvd((Object) this.strategyType, (Object) userPopUpDto.strategyType) && Intrinsics.EZpvd((Object) this.ts, (Object) userPopUpDto.ts) && this.whether == userPopUpDto.whether;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getWhether() {
        return this.whether;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.strategyType.hashCode()) * 31) + this.ts.hashCode()) * 31) + Boolean.hashCode(this.whether);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserPopUpDto(type=" + this.type + ", strategyType=" + this.strategyType + ", ts=" + this.ts + ", whether=" + this.whether + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.UserPopUpDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserPopUpDto> serializer() {
            return UserPopUpDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserPopUpDto(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str2;
        }
        if ((i & 4) == 0) {
            this.ts = "";
        } else {
            this.ts = str3;
        }
        if ((i & 8) == 0) {
            this.whether = false;
        } else {
            this.whether = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(UserPopUpDto userPopUpDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userPopUpDto.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userPopUpDto.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userPopUpDto.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userPopUpDto.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userPopUpDto.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userPopUpDto.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userPopUpDto.whether) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, userPopUpDto.whether);
        }
    }

    public UserPopUpDto(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.strategyType = str2;
        this.ts = str3;
        this.whether = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:14) call: com.okinc.tradingbot.impl.aiBot.dto.UserPopUpDto.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ UserPopUpDto(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
