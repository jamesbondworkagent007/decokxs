package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AptosSignRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String applicationUrl;
    private final long aptosChainId;
    private final SignData data;
    private final String prefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosSignRequest copy$default(AptosSignRequest aptosSignRequest, SignData signData, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            signData = aptosSignRequest.data;
        }
        if ((i & 2) != 0) {
            str = aptosSignRequest.applicationUrl;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = aptosSignRequest.prefix;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j = aptosSignRequest.aptosChainId;
        }
        return aptosSignRequest.copy(signData, str3, str4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignData component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.applicationUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.aptosChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignRequest copy(SignData signData, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AptosSignRequest(signData, str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignRequest)) {
            return false;
        }
        AptosSignRequest aptosSignRequest = (AptosSignRequest) obj;
        return Intrinsics.EZpvd(this.data, aptosSignRequest.data) && Intrinsics.EZpvd((Object) this.applicationUrl, (Object) aptosSignRequest.applicationUrl) && Intrinsics.EZpvd((Object) this.prefix, (Object) aptosSignRequest.prefix) && this.aptosChainId == aptosSignRequest.aptosChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApplicationUrl() {
        return this.applicationUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAptosChainId() {
        return this.aptosChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SignData signData = this.data;
        return ((((((signData == null ? 0 : signData.hashCode()) * 31) + this.applicationUrl.hashCode()) * 31) + this.prefix.hashCode()) * 31) + Long.hashCode(this.aptosChainId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignRequest(data=" + this.data + ", applicationUrl=" + this.applicationUrl + ", prefix=" + this.prefix + ", aptosChainId=" + this.aptosChainId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosSignRequest> serializer() {
            return AptosSignRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosSignRequest(int i, SignData signData, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, AptosSignRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = signData;
        }
        this.applicationUrl = str;
        this.prefix = str2;
        this.aptosChainId = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AptosSignRequest aptosSignRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aptosSignRequest.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AptosSignRequest$SignData$$serializer.INSTANCE, aptosSignRequest.data);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aptosSignRequest.applicationUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aptosSignRequest.prefix);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, aptosSignRequest.aptosChainId);
    }

    public AptosSignRequest(SignData signData, @NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.data = signData;
        this.applicationUrl = str;
        this.prefix = str2;
        this.aptosChainId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData) : (r7v0 com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData))
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 long)
 A[MD:(com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData, java.lang.String, java.lang.String, long):void (m)] (LINE:28) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.<init>(com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest$SignData, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ AptosSignRequest(SignData signData, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : signData, str, str2, j);
    }

    @Serializable
    public static final class SignData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Boolean address;
        private final Boolean application;
        private final Boolean chainId;
        private final String message;
        private final String nonce;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SignData() {
            this((Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignData copy$default(SignData signData, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = signData.address;
            }
            if ((i & 2) != 0) {
                bool2 = signData.application;
            }
            Boolean bool4 = bool2;
            if ((i & 4) != 0) {
                bool3 = signData.chainId;
            }
            Boolean bool5 = bool3;
            if ((i & 8) != 0) {
                str = signData.message;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = signData.nonce;
            }
            return signData.copy(bool, bool4, bool5, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignData copy(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
            return new SignData(bool, bool2, bool3, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignData)) {
                return false;
            }
            SignData signData = (SignData) obj;
            return Intrinsics.EZpvd(this.address, signData.address) && Intrinsics.EZpvd(this.application, signData.application) && Intrinsics.EZpvd(this.chainId, signData.chainId) && Intrinsics.EZpvd((Object) this.message, (Object) signData.message) && Intrinsics.EZpvd((Object) this.nonce, (Object) signData.nonce);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getApplication() {
            return this.application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.address;
            int iHashCode = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.application;
            int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.chainId;
            int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
            String str = this.message;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.nonce;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignData(address=" + this.address + ", application=" + this.application + ", chainId=" + this.chainId + ", message=" + this.message + ", nonce=" + this.nonce + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.SignData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SignData> serializer() {
                return AptosSignRequest$SignData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SignData(int i, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = bool;
            }
            if ((i & 2) == 0) {
                this.application = null;
            } else {
                this.application = bool2;
            }
            if ((i & 4) == 0) {
                this.chainId = null;
            } else {
                this.chainId = bool3;
            }
            if ((i & 8) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 16) == 0) {
                this.nonce = null;
            } else {
                this.nonce = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignData signData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signData.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, signData.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signData.application != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, signData.application);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signData.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, signData.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signData.message != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signData.message);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && signData.nonce == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signData.nonce);
        }

        public SignData(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
            this.address = bool;
            this.application = bool2;
            this.chainId = bool3;
            this.message = str;
            this.nonce = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest.SignData.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SignData(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
        }
    }

    public final String formatFullMessage(@NotNull String str) {
        String nonce;
        String message;
        Boolean chainId;
        Boolean application;
        Boolean address;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        SignData signData = this.data;
        if (signData != null && (address = signData.getAddress()) != null) {
            if (!address.booleanValue()) {
                address = null;
            }
            if (address != null) {
                address.booleanValue();
                sb.append("\naddress: " + str);
            }
        }
        SignData signData2 = this.data;
        if (signData2 != null && (application = signData2.getApplication()) != null) {
            if (!application.booleanValue()) {
                application = null;
            }
            if (application != null) {
                application.booleanValue();
                sb.append("\napplication: " + this.applicationUrl);
            }
        }
        SignData signData3 = this.data;
        if (signData3 != null && (chainId = signData3.getChainId()) != null) {
            if (!chainId.booleanValue()) {
                chainId = null;
            }
            if (chainId != null) {
                chainId.booleanValue();
                sb.append("\nchainId: " + this.aptosChainId);
            }
        }
        SignData signData4 = this.data;
        if (signData4 != null && (message = signData4.getMessage()) != null) {
            if (!C33129mqd.OLrzqt((CharSequence) message)) {
                message = null;
            }
            if (message != null) {
                sb.append("\nmessage: " + message);
            }
        }
        SignData signData5 = this.data;
        if (signData5 != null && (nonce = signData5.getNonce()) != null) {
            String str2 = C33129mqd.OLrzqt((CharSequence) nonce) ? nonce : null;
            if (str2 != null) {
                sb.append("\nnonce: " + str2);
            }
        }
        return sb.toString();
    }
}
