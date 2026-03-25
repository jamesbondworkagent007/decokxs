package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okx.paymentapi.service.SupportBanner;
import com.okinc.okx.paymentapi.service.SupportBanner$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class GetBannerResp implements Parcelable {
    private final ArrayList<SupportBanner> supportBanners;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GetBannerResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportBanner$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<GetBannerResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetBannerResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(GetBannerResp.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new GetBannerResp(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetBannerResp[] newArray(int i) {
            return new GetBannerResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetBannerResp() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.data.GetBannerResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetBannerResp copy$default(GetBannerResp getBannerResp, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = getBannerResp.supportBanners;
        }
        return getBannerResp.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SupportBanner> component1() {
        return this.supportBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetBannerResp copy(ArrayList<SupportBanner> arrayList) {
        return new GetBannerResp(arrayList);
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
        return (obj instanceof GetBannerResp) && Intrinsics.EZpvd(this.supportBanners, ((GetBannerResp) obj).supportBanners);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SupportBanner> getSupportBanners() {
        return this.supportBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<SupportBanner> arrayList = this.supportBanners;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetBannerResp(supportBanners=" + this.supportBanners + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<SupportBanner> arrayList = this.supportBanners;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<SupportBanner> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.GetBannerResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetBannerResp> serializer() {
            return GetBannerResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetBannerResp(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportBanners = null;
        } else {
            this.supportBanners = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(GetBannerResp getBannerResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && getBannerResp.supportBanners == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], getBannerResp.supportBanners);
    }

    public GetBannerResp(ArrayList<SupportBanner> arrayList) {
        this.supportBanners = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r1v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.okx.paymentapi.service.SupportBanner>):void (m)] (LINE:37) call: com.okinc.buysell.data.GetBannerResp.<init>(java.util.ArrayList):void type: THIS */
    public /* synthetic */ GetBannerResp(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}
