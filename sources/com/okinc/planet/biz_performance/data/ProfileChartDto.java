package com.okinc.planet.biz_performance.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C46411tTi;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ProfileChartDto implements Parcelable {
    public final boolean dataStatus;
    public final String metricType;
    public final List<ChartProfileDataResp> rates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProfileChartDto> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ChartProfileDataResp$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ProfileChartDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileChartDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChartProfileDataResp.CREATOR.createFromParcel(parcel));
            }
            return new ProfileChartDto(string, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfileChartDto[] newArray(int i) {
            return new ProfileChartDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_performance.data.ProfileChartDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileChartDto copy$default(ProfileChartDto profileChartDto, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileChartDto.metricType;
        }
        if ((i & 2) != 0) {
            z = profileChartDto.dataStatus;
        }
        if ((i & 4) != 0) {
            list = profileChartDto.rates;
        }
        return profileChartDto.KWHzl(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChartProfileDataResp> EZpvd() {
        return this.rates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfileChartDto KWHzl(@NotNull String str, boolean z, @NotNull List<ChartProfileDataResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ProfileChartDto(str, z, list);
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
        if (!(obj instanceof ProfileChartDto)) {
            return false;
        }
        ProfileChartDto profileChartDto = (ProfileChartDto) obj;
        return Intrinsics.EZpvd((Object) this.metricType, (Object) profileChartDto.metricType) && this.dataStatus == profileChartDto.dataStatus && Intrinsics.EZpvd(this.rates, profileChartDto.rates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.metricType.hashCode() * 31) + Boolean.hashCode(this.dataStatus)) * 31) + this.rates.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfileChartDto(metricType=" + this.metricType + ", dataStatus=" + this.dataStatus + ", rates=" + this.rates + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.metricType);
        parcel.writeInt(this.dataStatus ? 1 : 0);
        List<ChartProfileDataResp> list = this.rates;
        parcel.writeInt(list.size());
        Iterator<ChartProfileDataResp> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.ProfileChartDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfileChartDto> serializer() {
            return ProfileChartDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfileChartDto(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ProfileChartDto$$serializer.INSTANCE.getDescriptor());
        }
        this.metricType = str;
        if ((i & 2) == 0) {
            this.dataStatus = false;
        } else {
            this.dataStatus = z;
        }
        if ((i & 4) == 0) {
            this.rates = yDY.AhwBna();
        } else {
            this.rates = list;
        }
    }

    public static final /* synthetic */ void EZpvd(ProfileChartDto profileChartDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, profileChartDto.metricType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || profileChartDto.dataStatus) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, C46411tTi.OLrzqt, Boolean.valueOf(profileChartDto.dataStatus));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(profileChartDto.rates, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], profileChartDto.rates);
    }

    public ProfileChartDto(@NotNull String str, boolean z, @NotNull List<ChartProfileDataResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.metricType = str;
        this.dataStatus = z;
        this.rates = list;
    }
}
