package com.okinc.wallet.api.bean;

import com.okinc.wallet.api.MpcWalletService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAAndMpcWalletStatus implements java.io.Serializable {
    public static final int $stable = 0;
    private final AAWalletEnableState aaState;
    private final MpcWalletService.MpcWalletAbleStatus mpcState;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.wallet.api.bean.AAWalletEnableState", AAWalletEnableState.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.wallet.api.MpcWalletService.MpcWalletAbleStatus", MpcWalletService.MpcWalletAbleStatus.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAAndMpcWalletStatus() {
        this((AAWalletEnableState) null, (MpcWalletService.MpcWalletAbleStatus) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAAndMpcWalletStatus copy$default(AAAndMpcWalletStatus aAAndMpcWalletStatus, AAWalletEnableState aAWalletEnableState, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            aAWalletEnableState = aAAndMpcWalletStatus.aaState;
        }
        if ((i & 2) != 0) {
            mpcWalletAbleStatus = aAAndMpcWalletStatus.mpcState;
        }
        return aAAndMpcWalletStatus.copy(aAWalletEnableState, mpcWalletAbleStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAWalletEnableState component1() {
        return this.aaState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletService.MpcWalletAbleStatus component2() {
        return this.mpcState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAAndMpcWalletStatus copy(@NotNull AAWalletEnableState aAWalletEnableState, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(aAWalletEnableState, "");
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        return new AAAndMpcWalletStatus(aAWalletEnableState, mpcWalletAbleStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAAndMpcWalletStatus)) {
            return false;
        }
        AAAndMpcWalletStatus aAAndMpcWalletStatus = (AAAndMpcWalletStatus) obj;
        return this.aaState == aAAndMpcWalletStatus.aaState && this.mpcState == aAAndMpcWalletStatus.mpcState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAWalletEnableState getAaState() {
        return this.aaState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletService.MpcWalletAbleStatus getMpcState() {
        return this.mpcState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.aaState.hashCode() * 31) + this.mpcState.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAAndMpcWalletStatus(aaState=" + this.aaState + ", mpcState=" + this.mpcState + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.AAAndMpcWalletStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAAndMpcWalletStatus> serializer() {
            return AAAndMpcWalletStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAAndMpcWalletStatus(int i, AAWalletEnableState aAWalletEnableState, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, SerializationConstructorMarker serializationConstructorMarker) {
        this.aaState = (i & 1) == 0 ? AAWalletEnableState.Normal : aAWalletEnableState;
        if ((i & 2) == 0) {
            this.mpcState = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
        } else {
            this.mpcState = mpcWalletAbleStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(AAAndMpcWalletStatus aAAndMpcWalletStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || aAAndMpcWalletStatus.aaState != AAWalletEnableState.Normal) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], aAAndMpcWalletStatus.aaState);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && aAAndMpcWalletStatus.mpcState == MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], aAAndMpcWalletStatus.mpcState);
    }

    public AAAndMpcWalletStatus(@NotNull AAWalletEnableState aAWalletEnableState, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(aAWalletEnableState, "");
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        this.aaState = aAWalletEnableState;
        this.mpcState = mpcWalletAbleStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.wallet.api.bean.AAWalletEnableState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.wallet.api.bean.AAWalletEnableState:0x0004: SGET  A[WRAPPED] (LINE:34) com.okinc.wallet.api.bean.AAWalletEnableState.Normal com.okinc.wallet.api.bean.AAWalletEnableState) : (r1v0 com.okinc.wallet.api.bean.AAWalletEnableState))
  (wrap:com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus:0x000a: SGET  A[WRAPPED] (LINE:35) com.okinc.wallet.api.MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus) : (r2v0 com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus))
 A[MD:(com.okinc.wallet.api.bean.AAWalletEnableState, com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus):void (m)] (LINE:33) call: com.okinc.wallet.api.bean.AAAndMpcWalletStatus.<init>(com.okinc.wallet.api.bean.AAWalletEnableState, com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus):void type: THIS */
    public /* synthetic */ AAAndMpcWalletStatus(AAWalletEnableState aAWalletEnableState, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AAWalletEnableState.Normal : aAWalletEnableState, (i & 2) != 0 ? MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault : mpcWalletAbleStatus);
    }
}
