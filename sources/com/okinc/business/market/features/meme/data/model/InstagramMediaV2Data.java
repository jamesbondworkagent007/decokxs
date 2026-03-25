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
public final class InstagramMediaV2Data {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String type;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstagramMediaV2Data() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InstagramMediaV2Data copy$default(InstagramMediaV2Data instagramMediaV2Data, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instagramMediaV2Data.url;
        }
        if ((i & 2) != 0) {
            str2 = instagramMediaV2Data.type;
        }
        return instagramMediaV2Data.copy(str, str2);
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstagramMediaV2Data copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InstagramMediaV2Data(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstagramMediaV2Data)) {
            return false;
        }
        InstagramMediaV2Data instagramMediaV2Data = (InstagramMediaV2Data) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) instagramMediaV2Data.url) && Intrinsics.EZpvd((Object) this.type, (Object) instagramMediaV2Data.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.url.hashCode() * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstagramMediaV2Data(url=" + this.url + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstagramMediaV2Data> serializer() {
            return InstagramMediaV2Data$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstagramMediaV2Data(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(InstagramMediaV2Data instagramMediaV2Data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instagramMediaV2Data.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instagramMediaV2Data.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) instagramMediaV2Data.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, instagramMediaV2Data.type);
    }

    public InstagramMediaV2Data(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.url = str;
        this.type = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:109) call: com.okinc.business.market.features.meme.data.model.InstagramMediaV2Data.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InstagramMediaV2Data(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
