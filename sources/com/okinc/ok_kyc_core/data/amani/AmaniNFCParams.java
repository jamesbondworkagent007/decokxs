package com.okinc.ok_kyc_core.data.amani;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core.service.EopImageInfo$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AmaniNFCParams implements Parcelable {
    private ArrayList<EopImageInfo> cardImageResult;
    private Long mrzImageId;
    private String sessionId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AmaniNFCParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(EopImageInfo$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<AmaniNFCParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniNFCParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EopImageInfo.CREATOR.createFromParcel(parcel));
            }
            return new AmaniNFCParams(string, lValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaniNFCParams[] newArray(int i) {
            return new AmaniNFCParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AmaniNFCParams() {
        this((String) null, (Long) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.amani.AmaniNFCParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AmaniNFCParams copy$default(AmaniNFCParams amaniNFCParams, String str, Long l, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amaniNFCParams.sessionId;
        }
        if ((i & 2) != 0) {
            l = amaniNFCParams.mrzImageId;
        }
        if ((i & 4) != 0) {
            arrayList = amaniNFCParams.cardImageResult;
        }
        return amaniNFCParams.copy(str, l, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.mrzImageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopImageInfo> component3() {
        return this.cardImageResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmaniNFCParams copy(String str, Long l, @NotNull ArrayList<EopImageInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new AmaniNFCParams(str, l, arrayList);
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
        if (!(obj instanceof AmaniNFCParams)) {
            return false;
        }
        AmaniNFCParams amaniNFCParams = (AmaniNFCParams) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) amaniNFCParams.sessionId) && Intrinsics.EZpvd(this.mrzImageId, amaniNFCParams.mrzImageId) && Intrinsics.EZpvd(this.cardImageResult, amaniNFCParams.cardImageResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EopImageInfo> getCardImageResult() {
        return this.cardImageResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMrzImageId() {
        return this.mrzImageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.mrzImageId;
        return (((iHashCode * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.cardImageResult.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCardImageResult(@NotNull ArrayList<EopImageInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.cardImageResult = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMrzImageId(Long l) {
        this.mrzImageId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AmaniNFCParams(sessionId=" + this.sessionId + ", mrzImageId=" + this.mrzImageId + ", cardImageResult=" + this.cardImageResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sessionId);
        Long l = this.mrzImageId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        ArrayList<EopImageInfo> arrayList = this.cardImageResult;
        parcel.writeInt(arrayList.size());
        Iterator<EopImageInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.amani.AmaniNFCParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AmaniNFCParams> serializer() {
            return AmaniNFCParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AmaniNFCParams(int i, String str, Long l, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.sessionId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.mrzImageId = 0L;
        } else {
            this.mrzImageId = l;
        }
        if ((i & 4) == 0) {
            this.cardImageResult = new ArrayList<>();
        } else {
            this.cardImageResult = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AmaniNFCParams amaniNFCParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) amaniNFCParams.sessionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, amaniNFCParams.sessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = amaniNFCParams.mrzImageId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, amaniNFCParams.mrzImageId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(amaniNFCParams.cardImageResult, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], amaniNFCParams.cardImageResult);
    }

    public AmaniNFCParams(String str, Long l, @NotNull ArrayList<EopImageInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.sessionId = str;
        this.mrzImageId = l;
        this.cardImageResult = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r4v0 java.lang.Long))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:15) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.Long, java.util.ArrayList<com.okinc.ok_kyc_core.service.EopImageInfo>):void (m)] (LINE:12) call: com.okinc.ok_kyc_core.data.amani.AmaniNFCParams.<init>(java.lang.String, java.lang.Long, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AmaniNFCParams(String str, Long l, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
