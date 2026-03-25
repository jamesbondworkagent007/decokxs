package com.okinc.tradingbot.impl.aiBot.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SetUserPopUpRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String strategyType;
    private final String ts;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SetUserPopUpRequest copy$default(SetUserPopUpRequest setUserPopUpRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setUserPopUpRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = setUserPopUpRequest.strategyType;
        }
        if ((i & 4) != 0) {
            str3 = setUserPopUpRequest.ts;
        }
        return setUserPopUpRequest.copy(str, str2, str3);
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
    public final SetUserPopUpRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SetUserPopUpRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetUserPopUpRequest)) {
            return false;
        }
        SetUserPopUpRequest setUserPopUpRequest = (SetUserPopUpRequest) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) setUserPopUpRequest.type) && Intrinsics.EZpvd((Object) this.strategyType, (Object) setUserPopUpRequest.strategyType) && Intrinsics.EZpvd((Object) this.ts, (Object) setUserPopUpRequest.ts);
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
    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.strategyType.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetUserPopUpRequest(type=" + this.type + ", strategyType=" + this.strategyType + ", ts=" + this.ts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.SetUserPopUpRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetUserPopUpRequest> serializer() {
            return SetUserPopUpRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetUserPopUpRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SetUserPopUpRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.strategyType = str2;
        this.ts = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(SetUserPopUpRequest setUserPopUpRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, setUserPopUpRequest.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, setUserPopUpRequest.strategyType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, setUserPopUpRequest.ts);
    }

    public SetUserPopUpRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.strategyType = str2;
        this.ts = str3;
    }
}
