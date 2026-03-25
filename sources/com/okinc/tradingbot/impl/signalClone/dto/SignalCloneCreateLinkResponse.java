package com.okinc.tradingbot.impl.signalClone.dto;

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
public final class SignalCloneCreateLinkResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String content;
    public final String deepLink;
    public final String shortLink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalCloneCreateLinkResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalCloneCreateLinkResponse copy$default(SignalCloneCreateLinkResponse signalCloneCreateLinkResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalCloneCreateLinkResponse.content;
        }
        if ((i & 2) != 0) {
            str2 = signalCloneCreateLinkResponse.shortLink;
        }
        if ((i & 4) != 0) {
            str3 = signalCloneCreateLinkResponse.deepLink;
        }
        return signalCloneCreateLinkResponse.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalCloneCreateLinkResponse AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignalCloneCreateLinkResponse(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalCloneCreateLinkResponse)) {
            return false;
        }
        SignalCloneCreateLinkResponse signalCloneCreateLinkResponse = (SignalCloneCreateLinkResponse) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) signalCloneCreateLinkResponse.content) && Intrinsics.EZpvd((Object) this.shortLink, (Object) signalCloneCreateLinkResponse.shortLink) && Intrinsics.EZpvd((Object) this.deepLink, (Object) signalCloneCreateLinkResponse.deepLink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.shortLink.hashCode()) * 31) + this.deepLink.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalCloneCreateLinkResponse(content=" + this.content + ", shortLink=" + this.shortLink + ", deepLink=" + this.deepLink + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalCloneCreateLinkResponse> serializer() {
            return SignalCloneCreateLinkResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalCloneCreateLinkResponse(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.shortLink = "";
        } else {
            this.shortLink = str2;
        }
        if ((i & 4) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalCloneCreateLinkResponse signalCloneCreateLinkResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalCloneCreateLinkResponse.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalCloneCreateLinkResponse.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalCloneCreateLinkResponse.shortLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalCloneCreateLinkResponse.shortLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) signalCloneCreateLinkResponse.deepLink, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, signalCloneCreateLinkResponse.deepLink);
    }

    public SignalCloneCreateLinkResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.content = str;
        this.shortLink = str2;
        this.deepLink = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkResponse.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignalCloneCreateLinkResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
