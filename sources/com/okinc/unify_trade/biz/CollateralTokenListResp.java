package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class CollateralTokenListResp implements Parcelable {
    private final List<CollateralTokenDetail> coinDetails;
    private final String recommendGroup;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollateralTokenListResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CollateralTokenDetail$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CollateralTokenListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralTokenListResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CollateralTokenDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CollateralTokenListResp(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollateralTokenListResp[] newArray(int i) {
            return new CollateralTokenListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CollateralTokenListResp() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.CollateralTokenListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollateralTokenListResp copy$default(CollateralTokenListResp collateralTokenListResp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collateralTokenListResp.recommendGroup;
        }
        if ((i & 2) != 0) {
            list = collateralTokenListResp.coinDetails;
        }
        return collateralTokenListResp.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.recommendGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CollateralTokenDetail> component2() {
        return this.coinDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralTokenListResp copy(@NotNull String str, List<CollateralTokenDetail> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CollateralTokenListResp(str, list);
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
        if (!(obj instanceof CollateralTokenListResp)) {
            return false;
        }
        CollateralTokenListResp collateralTokenListResp = (CollateralTokenListResp) obj;
        return Intrinsics.EZpvd((Object) this.recommendGroup, (Object) collateralTokenListResp.recommendGroup) && Intrinsics.EZpvd(this.coinDetails, collateralTokenListResp.coinDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CollateralTokenDetail> getCoinDetails() {
        return this.coinDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendGroup() {
        return this.recommendGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.recommendGroup.hashCode();
        List<CollateralTokenDetail> list = this.coinDetails;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CollateralTokenListResp(recommendGroup=" + this.recommendGroup + ", coinDetails=" + this.coinDetails + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.recommendGroup);
        List<CollateralTokenDetail> list = this.coinDetails;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CollateralTokenDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CollateralTokenListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CollateralTokenListResp> serializer() {
            return CollateralTokenListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CollateralTokenListResp(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.recommendGroup = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.coinDetails = null;
        } else {
            this.coinDetails = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CollateralTokenListResp collateralTokenListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) collateralTokenListResp.recommendGroup, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, collateralTokenListResp.recommendGroup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && collateralTokenListResp.coinDetails == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], collateralTokenListResp.coinDetails);
    }

    public CollateralTokenListResp(@NotNull String str, List<CollateralTokenDetail> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recommendGroup = str;
        this.coinDetails = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CollateralTokenDetail>):void (m)] (LINE:4961) call: com.okinc.unify_trade.biz.CollateralTokenListResp.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CollateralTokenListResp(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
