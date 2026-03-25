package com.okinc.unify_trade.biz.bot;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpotGridPauseResumeWithAmtDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String algoId;
    private final String topUpAmt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotGridPauseResumeWithAmtDto copy$default(SpotGridPauseResumeWithAmtDto spotGridPauseResumeWithAmtDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotGridPauseResumeWithAmtDto.algoId;
        }
        if ((i & 2) != 0) {
            str2 = spotGridPauseResumeWithAmtDto.topUpAmt;
        }
        return spotGridPauseResumeWithAmtDto.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridPauseResumeWithAmtDto copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SpotGridPauseResumeWithAmtDto(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotGridPauseResumeWithAmtDto)) {
            return false;
        }
        SpotGridPauseResumeWithAmtDto spotGridPauseResumeWithAmtDto = (SpotGridPauseResumeWithAmtDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) spotGridPauseResumeWithAmtDto.algoId) && Intrinsics.EZpvd((Object) this.topUpAmt, (Object) spotGridPauseResumeWithAmtDto.topUpAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopUpAmt() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + this.topUpAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotGridPauseResumeWithAmtDto(algoId=" + this.algoId + ", topUpAmt=" + this.topUpAmt + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SpotGridPauseResumeWithAmtDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotGridPauseResumeWithAmtDto> serializer() {
            return SpotGridPauseResumeWithAmtDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotGridPauseResumeWithAmtDto(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SpotGridPauseResumeWithAmtDto$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.topUpAmt = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotGridPauseResumeWithAmtDto spotGridPauseResumeWithAmtDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, spotGridPauseResumeWithAmtDto.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, spotGridPauseResumeWithAmtDto.topUpAmt);
    }

    public SpotGridPauseResumeWithAmtDto(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.algoId = str;
        this.topUpAmt = str2;
    }
}
