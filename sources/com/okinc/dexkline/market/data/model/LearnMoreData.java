package com.okinc.dexkline.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class LearnMoreData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String explorer;
    public final String officialWebSite;
    public final String whitePaper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LearnMoreData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LearnMoreData copy$default(LearnMoreData learnMoreData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnMoreData.officialWebSite;
        }
        if ((i & 2) != 0) {
            str2 = learnMoreData.whitePaper;
        }
        if ((i & 4) != 0) {
            str3 = learnMoreData.explorer;
        }
        return learnMoreData.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.whitePaper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnMoreData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LearnMoreData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnMoreData)) {
            return false;
        }
        LearnMoreData learnMoreData = (LearnMoreData) obj;
        return Intrinsics.EZpvd((Object) this.officialWebSite, (Object) learnMoreData.officialWebSite) && Intrinsics.EZpvd((Object) this.whitePaper, (Object) learnMoreData.whitePaper) && Intrinsics.EZpvd((Object) this.explorer, (Object) learnMoreData.explorer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.officialWebSite.hashCode() * 31) + this.whitePaper.hashCode()) * 31) + this.explorer.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LearnMoreData(officialWebSite=" + this.officialWebSite + ", whitePaper=" + this.whitePaper + ", explorer=" + this.explorer + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.LearnMoreData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LearnMoreData> serializer() {
            return LearnMoreData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LearnMoreData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.officialWebSite = "";
        } else {
            this.officialWebSite = str;
        }
        if ((i & 2) == 0) {
            this.whitePaper = "";
        } else {
            this.whitePaper = str2;
        }
        if ((i & 4) == 0) {
            this.explorer = "";
        } else {
            this.explorer = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(LearnMoreData learnMoreData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) learnMoreData.officialWebSite, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, learnMoreData.officialWebSite);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) learnMoreData.whitePaper, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, learnMoreData.whitePaper);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) learnMoreData.explorer, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, learnMoreData.explorer);
    }

    public LearnMoreData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.officialWebSite = str;
        this.whitePaper = str2;
        this.explorer = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:105) call: com.okinc.dexkline.market.data.model.LearnMoreData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LearnMoreData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
