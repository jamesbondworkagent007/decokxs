package com.okinc.dexkline.market.features.address_tracker.domain;

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
public final class UpdateTrackerRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String addressAlias;
    public final String collectAddress;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateTrackerRequest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateTrackerRequest copy$default(UpdateTrackerRequest updateTrackerRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateTrackerRequest.walletAddress;
        }
        if ((i & 2) != 0) {
            str2 = updateTrackerRequest.collectAddress;
        }
        if ((i & 4) != 0) {
            str3 = updateTrackerRequest.addressAlias;
        }
        return updateTrackerRequest.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateTrackerRequest KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UpdateTrackerRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTrackerRequest)) {
            return false;
        }
        UpdateTrackerRequest updateTrackerRequest = (UpdateTrackerRequest) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) updateTrackerRequest.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) updateTrackerRequest.collectAddress) && Intrinsics.EZpvd((Object) this.addressAlias, (Object) updateTrackerRequest.addressAlias);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + this.addressAlias.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateTrackerRequest(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", addressAlias=" + this.addressAlias + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.address_tracker.domain.UpdateTrackerRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateTrackerRequest> serializer() {
            return UpdateTrackerRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateTrackerRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 2) == 0) {
            this.collectAddress = "";
        } else {
            this.collectAddress = str2;
        }
        if ((i & 4) == 0) {
            this.addressAlias = "";
        } else {
            this.addressAlias = str3;
        }
    }

    public static final /* synthetic */ void AEQbTJ(UpdateTrackerRequest updateTrackerRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) updateTrackerRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, updateTrackerRequest.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) updateTrackerRequest.collectAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, updateTrackerRequest.collectAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) updateTrackerRequest.addressAlias, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, updateTrackerRequest.addressAlias);
    }

    public UpdateTrackerRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.addressAlias = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.dexkline.market.features.address_tracker.domain.UpdateTrackerRequest.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UpdateTrackerRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
