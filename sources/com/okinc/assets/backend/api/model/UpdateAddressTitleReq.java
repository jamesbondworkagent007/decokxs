package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class UpdateAddressTitleReq {
    private long addressId;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateAddressTitleReq copy$default(UpdateAddressTitleReq updateAddressTitleReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = updateAddressTitleReq.addressId;
        }
        if ((i & 2) != 0) {
            str = updateAddressTitleReq.title;
        }
        return updateAddressTitleReq.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateAddressTitleReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdateAddressTitleReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAddressTitleReq)) {
            return false;
        }
        UpdateAddressTitleReq updateAddressTitleReq = (UpdateAddressTitleReq) obj;
        return this.addressId == updateAddressTitleReq.addressId && Intrinsics.EZpvd((Object) this.title, (Object) updateAddressTitleReq.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAddressId() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.addressId) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressId(long j) {
        this.addressId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateAddressTitleReq(addressId=" + this.addressId + ", title=" + this.title + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.UpdateAddressTitleReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateAddressTitleReq> serializer() {
            return UpdateAddressTitleReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateAddressTitleReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UpdateAddressTitleReq$$serializer.INSTANCE.getDescriptor());
        }
        this.addressId = j;
        this.title = str;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(UpdateAddressTitleReq updateAddressTitleReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, updateAddressTitleReq.addressId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, updateAddressTitleReq.title);
    }

    public UpdateAddressTitleReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressId = j;
        this.title = str;
    }
}
