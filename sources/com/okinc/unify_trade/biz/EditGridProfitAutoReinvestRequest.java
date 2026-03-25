package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class EditGridProfitAutoReinvestRequest implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final boolean enabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EditGridProfitAutoReinvestRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<EditGridProfitAutoReinvestRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditGridProfitAutoReinvestRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EditGridProfitAutoReinvestRequest(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditGridProfitAutoReinvestRequest[] newArray(int i) {
            return new EditGridProfitAutoReinvestRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditGridProfitAutoReinvestRequest copy$default(EditGridProfitAutoReinvestRequest editGridProfitAutoReinvestRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editGridProfitAutoReinvestRequest.algoId;
        }
        if ((i & 2) != 0) {
            z = editGridProfitAutoReinvestRequest.enabled;
        }
        return editGridProfitAutoReinvestRequest.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditGridProfitAutoReinvestRequest copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EditGridProfitAutoReinvestRequest(str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditGridProfitAutoReinvestRequest)) {
            return false;
        }
        EditGridProfitAutoReinvestRequest editGridProfitAutoReinvestRequest = (EditGridProfitAutoReinvestRequest) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) editGridProfitAutoReinvestRequest.algoId) && this.enabled == editGridProfitAutoReinvestRequest.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.algoId.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditGridProfitAutoReinvestRequest(algoId=" + this.algoId + ", enabled=" + this.enabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeInt(this.enabled ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EditGridProfitAutoReinvestRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditGridProfitAutoReinvestRequest> serializer() {
            return EditGridProfitAutoReinvestRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditGridProfitAutoReinvestRequest(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EditGridProfitAutoReinvestRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.enabled = z;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EditGridProfitAutoReinvestRequest editGridProfitAutoReinvestRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, editGridProfitAutoReinvestRequest.algoId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, editGridProfitAutoReinvestRequest.enabled);
    }

    public EditGridProfitAutoReinvestRequest(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.enabled = z;
    }
}
