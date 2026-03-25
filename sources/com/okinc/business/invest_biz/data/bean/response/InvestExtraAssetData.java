package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestExtraAssetData implements Parcelable {
    public final List<InvestBaseDefiTokenInfo> assetTokenList;
    public final boolean isSupplied;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestExtraAssetData> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestBaseDefiTokenInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestExtraAssetData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestExtraAssetData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InvestExtraAssetData(string, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestExtraAssetData[] newArray(int i) {
            return new InvestExtraAssetData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestExtraAssetData() {
        this((String) null, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestExtraAssetData copy$default(InvestExtraAssetData investExtraAssetData, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investExtraAssetData.title;
        }
        if ((i & 2) != 0) {
            z = investExtraAssetData.isSupplied;
        }
        if ((i & 4) != 0) {
            list = investExtraAssetData.assetTokenList;
        }
        return investExtraAssetData.AEQbTJ(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestExtraAssetData AEQbTJ(@NotNull String str, boolean z, List<InvestBaseDefiTokenInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestExtraAssetData(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> AEQbTJ() {
        return this.assetTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.title;
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
        if (!(obj instanceof InvestExtraAssetData)) {
            return false;
        }
        InvestExtraAssetData investExtraAssetData = (InvestExtraAssetData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) investExtraAssetData.title) && this.isSupplied == investExtraAssetData.isSupplied && Intrinsics.EZpvd(this.assetTokenList, investExtraAssetData.assetTokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isSupplied);
        List<InvestBaseDefiTokenInfo> list = this.assetTokenList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestExtraAssetData(title=" + this.title + ", isSupplied=" + this.isSupplied + ", assetTokenList=" + this.assetTokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeInt(this.isSupplied ? 1 : 0);
        List<InvestBaseDefiTokenInfo> list = this.assetTokenList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestExtraAssetData> serializer() {
            return InvestExtraAssetData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestExtraAssetData(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isSupplied = true;
        } else {
            this.isSupplied = z;
        }
        if ((i & 4) == 0) {
            this.assetTokenList = null;
        } else {
            this.assetTokenList = list;
        }
    }

    public static final /* synthetic */ void EZpvd(InvestExtraAssetData investExtraAssetData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investExtraAssetData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investExtraAssetData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !investExtraAssetData.isSupplied) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investExtraAssetData.isSupplied);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investExtraAssetData.assetTokenList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investExtraAssetData.assetTokenList);
    }

    public InvestExtraAssetData(@NotNull String str, boolean z, List<InvestBaseDefiTokenInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.isSupplied = z;
        this.assetTokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, boolean, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>):void (m)] (LINE:144) call: com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData.<init>(java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ InvestExtraAssetData(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : list);
    }
}
