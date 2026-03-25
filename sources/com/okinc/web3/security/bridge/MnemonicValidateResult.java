package com.okinc.web3.security.bridge;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MnemonicValidateResult {
    private String language;
    private int type;
    private boolean validate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MnemonicValidateResult() {
        this((String) null, false, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MnemonicValidateResult copy$default(MnemonicValidateResult mnemonicValidateResult, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mnemonicValidateResult.language;
        }
        if ((i2 & 2) != 0) {
            z = mnemonicValidateResult.validate;
        }
        if ((i2 & 4) != 0) {
            i = mnemonicValidateResult.type;
        }
        return mnemonicValidateResult.copy(str, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.validate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MnemonicValidateResult copy(@NotNull String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MnemonicValidateResult(str, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MnemonicValidateResult)) {
            return false;
        }
        MnemonicValidateResult mnemonicValidateResult = (MnemonicValidateResult) obj;
        return Intrinsics.EZpvd((Object) this.language, (Object) mnemonicValidateResult.language) && this.validate == mnemonicValidateResult.validate && this.type == mnemonicValidateResult.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValidate() {
        return this.validate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.language.hashCode() * 31) + Boolean.hashCode(this.validate)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidate(boolean z) {
        this.validate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MnemonicValidateResult(language=" + this.language + ", validate=" + this.validate + ", type=" + this.type + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.bridge.MnemonicValidateResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MnemonicValidateResult> serializer() {
            return MnemonicValidateResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MnemonicValidateResult(int i, String str, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.language = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.validate = false;
        } else {
            this.validate = z;
        }
        if ((i & 4) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWeb3Security_web3_security_lib(MnemonicValidateResult mnemonicValidateResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) mnemonicValidateResult.language, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, mnemonicValidateResult.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mnemonicValidateResult.validate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, mnemonicValidateResult.validate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mnemonicValidateResult.type == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, mnemonicValidateResult.type);
    }

    public MnemonicValidateResult(@NotNull String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
        this.validate = z;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, boolean, int):void (m)] (LINE:15) call: com.okinc.web3.security.bridge.MnemonicValidateResult.<init>(java.lang.String, boolean, int):void type: THIS */
    public /* synthetic */ MnemonicValidateResult(String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i);
    }
}
