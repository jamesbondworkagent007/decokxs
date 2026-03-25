package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class DcaCopyConfirmTipsData implements Parcelable {
    public static final int $stable = 0;
    public final boolean isSpotDca;
    public final String maxSafetyOrds;
    public final boolean reserveFunds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DcaCopyConfirmTipsData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DcaCopyConfirmTipsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaCopyConfirmTipsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaCopyConfirmTipsData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaCopyConfirmTipsData[] newArray(int i) {
            return new DcaCopyConfirmTipsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.isSpotDca;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.maxSafetyOrds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeInt(this.isSpotDca ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.DcaCopyConfirmTipsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaCopyConfirmTipsData> serializer() {
            return DcaCopyConfirmTipsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaCopyConfirmTipsData(int i, String str, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DcaCopyConfirmTipsData$$serializer.INSTANCE.getDescriptor());
        }
        this.maxSafetyOrds = str;
        this.reserveFunds = z;
        this.isSpotDca = z2;
    }

    public static final /* synthetic */ void copydefault(DcaCopyConfirmTipsData dcaCopyConfirmTipsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dcaCopyConfirmTipsData.maxSafetyOrds);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, dcaCopyConfirmTipsData.reserveFunds);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, dcaCopyConfirmTipsData.isSpotDca);
    }

    public DcaCopyConfirmTipsData(@NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
        this.reserveFunds = z;
        this.isSpotDca = z2;
    }
}
