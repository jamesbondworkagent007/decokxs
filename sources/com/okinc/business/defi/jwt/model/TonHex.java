package com.okinc.business.defi.jwt.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonHex {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final String payload;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonHex copy$default(TonHex tonHex, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonHex.payload;
        }
        if ((i & 2) != 0) {
            str2 = tonHex.url;
        }
        if ((i & 4) != 0) {
            str3 = tonHex.name;
        }
        return tonHex.copy(str, str2, str3);
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonHex copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TonHex(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonHex)) {
            return false;
        }
        TonHex tonHex = (TonHex) obj;
        return Intrinsics.EZpvd((Object) this.payload, (Object) tonHex.payload) && Intrinsics.EZpvd((Object) this.url, (Object) tonHex.url) && Intrinsics.EZpvd((Object) this.name, (Object) tonHex.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.payload.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonHex(payload=" + this.payload + ", url=" + this.url + ", name=" + this.name + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jwt.model.TonHex.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonHex> serializer() {
            return TonHex$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonHex(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TonHex$$serializer.INSTANCE.getDescriptor());
        }
        this.payload = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.name = "ton_proof";
        } else {
            this.name = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonHex tonHex, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonHex.payload);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonHex.url);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) tonHex.name, (Object) "ton_proof")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonHex.name);
    }

    public TonHex(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.payload = str;
        this.url = str2;
        this.name = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("ton_proof") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.jwt.model.TonHex.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TonHex(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "ton_proof" : str3);
    }
}
