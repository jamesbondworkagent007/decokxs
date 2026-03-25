package com.okinc.wallet.core.sign.utxo;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BRC20InscriptionData {
    private String body;
    private String contentType;
    private String destination;
    private Boolean isHex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIsHex() {
        return this.isHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.body = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestination(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.destination = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsHex(Boolean bool) {
        this.isHex = bool;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.BRC20InscriptionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BRC20InscriptionData> serializer() {
            return BRC20InscriptionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BRC20InscriptionData(int i, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BRC20InscriptionData$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = str;
        this.body = str2;
        this.destination = str3;
        if ((i & 8) == 0) {
            this.isHex = Boolean.FALSE;
        } else {
            this.isHex = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(BRC20InscriptionData bRC20InscriptionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bRC20InscriptionData.contentType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bRC20InscriptionData.body);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bRC20InscriptionData.destination);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(bRC20InscriptionData.isHex, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bRC20InscriptionData.isHex);
    }

    public BRC20InscriptionData(@NotNull String str, @NotNull String str2, @NotNull String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.contentType = str;
        this.body = str2;
        this.destination = str3;
        this.isHex = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:31) call: com.okinc.wallet.core.sign.utxo.BRC20InscriptionData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ BRC20InscriptionData(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
