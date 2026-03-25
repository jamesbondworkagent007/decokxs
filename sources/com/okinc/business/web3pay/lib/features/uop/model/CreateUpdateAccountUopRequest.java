package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.GasToken$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateUpdateAccountUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final GasLimit gasLimit;
    private final GasPrice gasPrice;
    private final GasToken gasToken;
    private final int projectId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateUpdateAccountUopRequest copy$default(CreateUpdateAccountUopRequest createUpdateAccountUopRequest, String str, int i, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createUpdateAccountUopRequest.chainIndex;
        }
        if ((i2 & 2) != 0) {
            i = createUpdateAccountUopRequest.projectId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            gasToken = createUpdateAccountUopRequest.gasToken;
        }
        GasToken gasToken2 = gasToken;
        if ((i2 & 8) != 0) {
            gasLimit = createUpdateAccountUopRequest.gasLimit;
        }
        GasLimit gasLimit2 = gasLimit;
        if ((i2 & 16) != 0) {
            gasPrice = createUpdateAccountUopRequest.gasPrice;
        }
        return createUpdateAccountUopRequest.copy(str, i3, gasToken2, gasLimit2, gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken component3() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component4() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component5() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateUpdateAccountUopRequest copy(@NotNull String str, int i, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CreateUpdateAccountUopRequest(str, i, gasToken, gasLimit, gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateUpdateAccountUopRequest)) {
            return false;
        }
        CreateUpdateAccountUopRequest createUpdateAccountUopRequest = (CreateUpdateAccountUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createUpdateAccountUopRequest.chainIndex) && this.projectId == createUpdateAccountUopRequest.projectId && Intrinsics.EZpvd(this.gasToken, createUpdateAccountUopRequest.gasToken) && Intrinsics.EZpvd(this.gasLimit, createUpdateAccountUopRequest.gasLimit) && Intrinsics.EZpvd(this.gasPrice, createUpdateAccountUopRequest.gasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken getGasToken() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Integer.hashCode(this.projectId);
        GasToken gasToken = this.gasToken;
        int iHashCode3 = gasToken == null ? 0 : gasToken.hashCode();
        GasLimit gasLimit = this.gasLimit;
        int iHashCode4 = gasLimit == null ? 0 : gasLimit.hashCode();
        GasPrice gasPrice = this.gasPrice;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (gasPrice != null ? gasPrice.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateUpdateAccountUopRequest(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", gasToken=" + this.gasToken + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateUpdateAccountUopRequest> serializer() {
            return CreateUpdateAccountUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateUpdateAccountUopRequest(int i, String str, int i2, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreateUpdateAccountUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = i2;
        if ((i & 4) == 0) {
            this.gasToken = null;
        } else {
            this.gasToken = gasToken;
        }
        if ((i & 8) == 0) {
            this.gasLimit = null;
        } else {
            this.gasLimit = gasLimit;
        }
        if ((i & 16) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = gasPrice;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateUpdateAccountUopRequest createUpdateAccountUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createUpdateAccountUopRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createUpdateAccountUopRequest.projectId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createUpdateAccountUopRequest.gasToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, GasToken$$serializer.INSTANCE, createUpdateAccountUopRequest.gasToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || createUpdateAccountUopRequest.gasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, GasLimit$$serializer.INSTANCE, createUpdateAccountUopRequest.gasLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && createUpdateAccountUopRequest.gasPrice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, GasPrice$$serializer.INSTANCE, createUpdateAccountUopRequest.gasPrice);
    }

    public CreateUpdateAccountUopRequest(@NotNull String str, int i, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = str;
        this.projectId = i;
        this.gasToken = gasToken;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (wrap:com.okinc.business.web3pay.lib.core.model.GasToken:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasToken) : (r10v0 com.okinc.business.web3pay.lib.core.model.GasToken))
  (wrap:com.okinc.business.web3pay.lib.core.model.GasLimit:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasLimit) : (r11v0 com.okinc.business.web3pay.lib.core.model.GasLimit))
  (wrap:com.okinc.business.web3pay.lib.core.model.GasPrice:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.GasPrice) : (r12v0 com.okinc.business.web3pay.lib.core.model.GasPrice))
 A[MD:(java.lang.String, int, com.okinc.business.web3pay.lib.core.model.GasToken, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void (m)] (LINE:14) call: com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopRequest.<init>(java.lang.String, int, com.okinc.business.web3pay.lib.core.model.GasToken, com.okinc.business.web3pay.lib.core.model.GasLimit, com.okinc.business.web3pay.lib.core.model.GasPrice):void type: THIS */
    public /* synthetic */ CreateUpdateAccountUopRequest(String str, int i, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : gasToken, (i2 & 8) != 0 ? null : gasLimit, (i2 & 16) != 0 ? null : gasPrice);
    }
}
