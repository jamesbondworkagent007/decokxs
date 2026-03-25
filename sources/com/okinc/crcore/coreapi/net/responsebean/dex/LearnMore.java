package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LearnMore {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String explorer;
    private final String officialWebSite;
    private final String whitePaper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LearnMore() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LearnMore copy$default(LearnMore learnMore, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnMore.explorer;
        }
        if ((i & 2) != 0) {
            str2 = learnMore.officialWebSite;
        }
        if ((i & 4) != 0) {
            str3 = learnMore.whitePaper;
        }
        return learnMore.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.explorer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.officialWebSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.whitePaper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMore copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LearnMore(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnMore)) {
            return false;
        }
        LearnMore learnMore = (LearnMore) obj;
        return Intrinsics.EZpvd((Object) this.explorer, (Object) learnMore.explorer) && Intrinsics.EZpvd((Object) this.officialWebSite, (Object) learnMore.officialWebSite) && Intrinsics.EZpvd((Object) this.whitePaper, (Object) learnMore.whitePaper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorer() {
        return this.explorer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialWebSite() {
        return this.officialWebSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWhitePaper() {
        return this.whitePaper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.explorer.hashCode() * 31) + this.officialWebSite.hashCode()) * 31) + this.whitePaper.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LearnMore(explorer=" + this.explorer + ", officialWebSite=" + this.officialWebSite + ", whitePaper=" + this.whitePaper + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LearnMore> serializer() {
            return LearnMore$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LearnMore(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.explorer = "";
        } else {
            this.explorer = str;
        }
        if ((i & 2) == 0) {
            this.officialWebSite = "";
        } else {
            this.officialWebSite = str2;
        }
        if ((i & 4) == 0) {
            this.whitePaper = "";
        } else {
            this.whitePaper = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LearnMore learnMore, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) learnMore.explorer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, learnMore.explorer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) learnMore.officialWebSite, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, learnMore.officialWebSite);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) learnMore.whitePaper, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, learnMore.whitePaper);
    }

    public LearnMore(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.explorer = str;
        this.officialWebSite = str2;
        this.whitePaper = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:43) call: com.okinc.crcore.coreapi.net.responsebean.dex.LearnMore.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LearnMore(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
