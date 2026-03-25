package com.okinc.okassetslite.api.assets_lite_api.common.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class IaActivityResponseV2 {

    @SerializedName("pastActivity")
    private final IaActivityResponse pastActivity;

    @SerializedName("pendingOrder")
    private final IaActivityResponse pendingOrder;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IaActivityResponseV2() {
        this((IaActivityResponse) null, (IaActivityResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IaActivityResponseV2 copy$default(IaActivityResponseV2 iaActivityResponseV2, IaActivityResponse iaActivityResponse, IaActivityResponse iaActivityResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            iaActivityResponse = iaActivityResponseV2.pendingOrder;
        }
        if ((i & 2) != 0) {
            iaActivityResponse2 = iaActivityResponseV2.pastActivity;
        }
        return iaActivityResponseV2.copy(iaActivityResponse, iaActivityResponse2);
    }

    @SerialName("pastActivity")
    public static /* synthetic */ void getPastActivity$annotations() {
    }

    @SerialName("pendingOrder")
    public static /* synthetic */ void getPendingOrder$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponse component1() {
        return this.pendingOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponse component2() {
        return this.pastActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponseV2 copy(IaActivityResponse iaActivityResponse, IaActivityResponse iaActivityResponse2) {
        return new IaActivityResponseV2(iaActivityResponse, iaActivityResponse2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IaActivityResponseV2)) {
            return false;
        }
        IaActivityResponseV2 iaActivityResponseV2 = (IaActivityResponseV2) obj;
        return Intrinsics.EZpvd(this.pendingOrder, iaActivityResponseV2.pendingOrder) && Intrinsics.EZpvd(this.pastActivity, iaActivityResponseV2.pastActivity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponse getPastActivity() {
        return this.pastActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponse getPendingOrder() {
        return this.pendingOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        IaActivityResponse iaActivityResponse = this.pendingOrder;
        int iHashCode = iaActivityResponse == null ? 0 : iaActivityResponse.hashCode();
        IaActivityResponse iaActivityResponse2 = this.pastActivity;
        return (iHashCode * 31) + (iaActivityResponse2 != null ? iaActivityResponse2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IaActivityResponseV2(pendingOrder=" + this.pendingOrder + ", pastActivity=" + this.pastActivity + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponseV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IaActivityResponseV2> serializer() {
            return IaActivityResponseV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IaActivityResponseV2(int i, IaActivityResponse iaActivityResponse, IaActivityResponse iaActivityResponse2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pendingOrder = null;
        } else {
            this.pendingOrder = iaActivityResponse;
        }
        if ((i & 2) == 0) {
            this.pastActivity = null;
        } else {
            this.pastActivity = iaActivityResponse2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(IaActivityResponseV2 iaActivityResponseV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || iaActivityResponseV2.pendingOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IaActivityResponse$$serializer.INSTANCE, iaActivityResponseV2.pendingOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && iaActivityResponseV2.pastActivity == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IaActivityResponse$$serializer.INSTANCE, iaActivityResponseV2.pastActivity);
    }

    public IaActivityResponseV2(IaActivityResponse iaActivityResponse, IaActivityResponse iaActivityResponse2) {
        this.pendingOrder = iaActivityResponse;
        this.pastActivity = iaActivityResponse2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse) : (r2v0 com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse))
  (wrap:com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse) : (r3v0 com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse))
 A[MD:(com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse, com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse):void (m)] (LINE:25) call: com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponseV2.<init>(com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse, com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse):void type: THIS */
    public /* synthetic */ IaActivityResponseV2(IaActivityResponse iaActivityResponse, IaActivityResponse iaActivityResponse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iaActivityResponse, (i & 2) != 0 ? null : iaActivityResponse2);
    }
}
