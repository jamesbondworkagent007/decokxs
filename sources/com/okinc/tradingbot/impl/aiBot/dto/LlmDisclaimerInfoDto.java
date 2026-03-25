package com.okinc.tradingbot.impl.aiBot.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LlmDisclaimerInfoDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String disclaimerContent;
    public final String disclaimerName;
    public final String disclaimerVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LlmDisclaimerInfoDto() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LlmDisclaimerInfoDto copy$default(LlmDisclaimerInfoDto llmDisclaimerInfoDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = llmDisclaimerInfoDto.disclaimerVersion;
        }
        if ((i & 2) != 0) {
            str2 = llmDisclaimerInfoDto.disclaimerName;
        }
        if ((i & 4) != 0) {
            str3 = llmDisclaimerInfoDto.disclaimerContent;
        }
        return llmDisclaimerInfoDto.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LlmDisclaimerInfoDto AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LlmDisclaimerInfoDto(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.disclaimerVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.disclaimerName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.disclaimerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LlmDisclaimerInfoDto)) {
            return false;
        }
        LlmDisclaimerInfoDto llmDisclaimerInfoDto = (LlmDisclaimerInfoDto) obj;
        return Intrinsics.EZpvd((Object) this.disclaimerVersion, (Object) llmDisclaimerInfoDto.disclaimerVersion) && Intrinsics.EZpvd((Object) this.disclaimerName, (Object) llmDisclaimerInfoDto.disclaimerName) && Intrinsics.EZpvd((Object) this.disclaimerContent, (Object) llmDisclaimerInfoDto.disclaimerContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.disclaimerVersion.hashCode() * 31) + this.disclaimerName.hashCode()) * 31) + this.disclaimerContent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LlmDisclaimerInfoDto(disclaimerVersion=" + this.disclaimerVersion + ", disclaimerName=" + this.disclaimerName + ", disclaimerContent=" + this.disclaimerContent + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LlmDisclaimerInfoDto> serializer() {
            return LlmDisclaimerInfoDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LlmDisclaimerInfoDto(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.disclaimerVersion = "";
        } else {
            this.disclaimerVersion = str;
        }
        if ((i & 2) == 0) {
            this.disclaimerName = "";
        } else {
            this.disclaimerName = str2;
        }
        if ((i & 4) == 0) {
            this.disclaimerContent = "";
        } else {
            this.disclaimerContent = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(LlmDisclaimerInfoDto llmDisclaimerInfoDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) llmDisclaimerInfoDto.disclaimerVersion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, llmDisclaimerInfoDto.disclaimerVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) llmDisclaimerInfoDto.disclaimerName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, llmDisclaimerInfoDto.disclaimerName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) llmDisclaimerInfoDto.disclaimerContent, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, llmDisclaimerInfoDto.disclaimerContent);
    }

    public LlmDisclaimerInfoDto(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.disclaimerVersion = str;
        this.disclaimerName = str2;
        this.disclaimerContent = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LlmDisclaimerInfoDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
