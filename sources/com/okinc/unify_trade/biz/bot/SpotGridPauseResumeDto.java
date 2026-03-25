package com.okinc.unify_trade.biz.bot;

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
public final class SpotGridPauseResumeDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String algoId;
    private final String topUpAmt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotGridPauseResumeDto copy$default(SpotGridPauseResumeDto spotGridPauseResumeDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotGridPauseResumeDto.algoId;
        }
        if ((i & 2) != 0) {
            str2 = spotGridPauseResumeDto.topUpAmt;
        }
        return spotGridPauseResumeDto.copy(str, str2);
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
    public final SpotGridPauseResumeDto copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SpotGridPauseResumeDto(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotGridPauseResumeDto)) {
            return false;
        }
        SpotGridPauseResumeDto spotGridPauseResumeDto = (SpotGridPauseResumeDto) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) spotGridPauseResumeDto.algoId) && Intrinsics.EZpvd((Object) this.topUpAmt, (Object) spotGridPauseResumeDto.topUpAmt);
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
        int iHashCode = this.algoId.hashCode();
        String str = this.topUpAmt;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotGridPauseResumeDto(algoId=" + this.algoId + ", topUpAmt=" + this.topUpAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SpotGridPauseResumeDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotGridPauseResumeDto> serializer() {
            return SpotGridPauseResumeDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotGridPauseResumeDto(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SpotGridPauseResumeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        if ((i & 2) == 0) {
            this.topUpAmt = null;
        } else {
            this.topUpAmt = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotGridPauseResumeDto spotGridPauseResumeDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, spotGridPauseResumeDto.algoId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && spotGridPauseResumeDto.topUpAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotGridPauseResumeDto.topUpAmt);
    }

    public SpotGridPauseResumeDto(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.topUpAmt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.unify_trade.biz.bot.SpotGridPauseResumeDto.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotGridPauseResumeDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
