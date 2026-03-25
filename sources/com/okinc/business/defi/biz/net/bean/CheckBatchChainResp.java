package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CheckBatchChainResp implements Parcelable {
    private Long chainIndex;
    private Map<String, Boolean> checkResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckBatchChainResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<CheckBatchChainResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckBatchChainResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LinkedHashMap linkedHashMap = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CheckBatchChainResp(lValueOf, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckBatchChainResp[] newArray(int i) {
            return new CheckBatchChainResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckBatchChainResp() {
        this((Long) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.CheckBatchChainResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckBatchChainResp copy$default(CheckBatchChainResp checkBatchChainResp, Long l, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            l = checkBatchChainResp.chainIndex;
        }
        if ((i & 2) != 0) {
            map = checkBatchChainResp.checkResult;
        }
        return checkBatchChainResp.copy(l, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Boolean> component2() {
        return this.checkResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckBatchChainResp copy(Long l, Map<String, Boolean> map) {
        return new CheckBatchChainResp(l, map);
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
        if (!(obj instanceof CheckBatchChainResp)) {
            return false;
        }
        CheckBatchChainResp checkBatchChainResp = (CheckBatchChainResp) obj;
        return Intrinsics.EZpvd(this.chainIndex, checkBatchChainResp.chainIndex) && Intrinsics.EZpvd(this.checkResult, checkBatchChainResp.checkResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Boolean> getCheckResult() {
        return this.checkResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainIndex;
        int iHashCode = l == null ? 0 : l.hashCode();
        Map<String, Boolean> map = this.checkResult;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckResult(Map<String, Boolean> map) {
        this.checkResult = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckBatchChainResp(chainIndex=" + this.chainIndex + ", checkResult=" + this.checkResult + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Map<String, Boolean> map = this.checkResult;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckBatchChainResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckBatchChainResp> serializer() {
            return CheckBatchChainResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckBatchChainResp(int i, Long l, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = l;
        }
        if ((i & 2) == 0) {
            this.checkResult = null;
        } else {
            this.checkResult = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckBatchChainResp checkBatchChainResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || checkBatchChainResp.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, checkBatchChainResp.chainIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && checkBatchChainResp.checkResult == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], checkBatchChainResp.checkResult);
    }

    public CheckBatchChainResp(Long l, Map<String, Boolean> map) {
        this.chainIndex = l;
        this.checkResult = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r3v0 java.util.Map))
 A[MD:(java.lang.Long, java.util.Map<java.lang.String, java.lang.Boolean>):void (m)] (LINE:1550) call: com.okinc.business.defi.biz.net.bean.CheckBatchChainResp.<init>(java.lang.Long, java.util.Map):void type: THIS */
    public /* synthetic */ CheckBatchChainResp(Long l, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : map);
    }
}
