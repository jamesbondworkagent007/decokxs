package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RangeInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean isDefault;
    private final String offset;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUniv3RangeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3RangeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RangeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUniv3RangeInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RangeInfo[] newArray(int i) {
            return new InvestUniv3RangeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestUniv3RangeInfo copy$default(InvestUniv3RangeInfo investUniv3RangeInfo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investUniv3RangeInfo.type;
        }
        if ((i & 2) != 0) {
            str2 = investUniv3RangeInfo.offset;
        }
        if ((i & 4) != 0) {
            z = investUniv3RangeInfo.isDefault;
        }
        return investUniv3RangeInfo.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RangeInfo copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestUniv3RangeInfo(str, str2, z);
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
        if (!(obj instanceof InvestUniv3RangeInfo)) {
            return false;
        }
        InvestUniv3RangeInfo investUniv3RangeInfo = (InvestUniv3RangeInfo) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) investUniv3RangeInfo.type) && Intrinsics.EZpvd((Object) this.offset, (Object) investUniv3RangeInfo.offset) && this.isDefault == investUniv3RangeInfo.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.offset.hashCode()) * 31) + Boolean.hashCode(this.isDefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RangeInfo(type=" + this.type + ", offset=" + this.offset + ", isDefault=" + this.isDefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.offset);
        parcel.writeInt(this.isDefault ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RangeInfo> serializer() {
            return InvestUniv3RangeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUniv3RangeInfo(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InvestUniv3RangeInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.offset = str2;
        this.isDefault = z;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RangeInfo investUniv3RangeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investUniv3RangeInfo.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investUniv3RangeInfo.offset);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, investUniv3RangeInfo.isDefault);
    }

    public InvestUniv3RangeInfo(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.offset = str2;
        this.isDefault = z;
    }
}
