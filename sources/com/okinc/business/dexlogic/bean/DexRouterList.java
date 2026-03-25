package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexRouterList implements Parcelable {
    private boolean isHeaderLocal;
    private final String percent;
    private final String router;
    private final ArrayList<SubRouter> subRouterList;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexRouterList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SubRouter$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<DexRouterList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouterList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SubRouter.CREATOR.createFromParcel(parcel));
                }
            }
            return new DexRouterList(string, string2, arrayList, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouterList[] newArray(int i) {
            return new DexRouterList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexRouterList() {
        this((String) null, (String) null, (ArrayList) null, false, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dexlogic.bean.DexRouterList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexRouterList copy$default(DexRouterList dexRouterList, String str, String str2, ArrayList arrayList, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dexRouterList.percent;
        }
        if ((i2 & 2) != 0) {
            str2 = dexRouterList.router;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            arrayList = dexRouterList.subRouterList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i2 & 8) != 0) {
            z = dexRouterList.isHeaderLocal;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = dexRouterList.type;
        }
        return dexRouterList.copy(str, str3, arrayList2, z2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubRouter> component3() {
        return this.subRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isHeaderLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRouterList copy(@NotNull String str, @NotNull String str2, ArrayList<SubRouter> arrayList, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexRouterList(str, str2, arrayList, z, i);
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
        if (!(obj instanceof DexRouterList)) {
            return false;
        }
        DexRouterList dexRouterList = (DexRouterList) obj;
        return Intrinsics.EZpvd((Object) this.percent, (Object) dexRouterList.percent) && Intrinsics.EZpvd((Object) this.router, (Object) dexRouterList.router) && Intrinsics.EZpvd(this.subRouterList, dexRouterList.subRouterList) && this.isHeaderLocal == dexRouterList.isHeaderLocal && this.type == dexRouterList.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouter() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubRouter> getSubRouterList() {
        return this.subRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.percent.hashCode();
        int iHashCode2 = this.router.hashCode();
        ArrayList<SubRouter> arrayList = this.subRouterList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Boolean.hashCode(this.isHeaderLocal)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHeaderLocal() {
        return this.isHeaderLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderLocal(boolean z) {
        this.isHeaderLocal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRouterList(percent=" + this.percent + ", router=" + this.router + ", subRouterList=" + this.subRouterList + ", isHeaderLocal=" + this.isHeaderLocal + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.percent);
        parcel.writeString(this.router);
        ArrayList<SubRouter> arrayList = this.subRouterList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<SubRouter> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isHeaderLocal ? 1 : 0);
        parcel.writeInt(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexRouterList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexRouterList> serializer() {
            return DexRouterList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexRouterList(int i, String str, String str2, ArrayList arrayList, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.percent = "";
        } else {
            this.percent = str;
        }
        if ((i & 2) == 0) {
            this.router = "";
        } else {
            this.router = str2;
        }
        if ((i & 4) == 0) {
            this.subRouterList = null;
        } else {
            this.subRouterList = arrayList;
        }
        if ((i & 8) == 0) {
            this.isHeaderLocal = false;
        } else {
            this.isHeaderLocal = z;
        }
        if ((i & 16) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexRouterList dexRouterList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexRouterList.percent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexRouterList.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexRouterList.router, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexRouterList.router);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dexRouterList.subRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], dexRouterList.subRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexRouterList.isHeaderLocal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, dexRouterList.isHeaderLocal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dexRouterList.type == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, dexRouterList.type);
    }

    public DexRouterList(@NotNull String str, @NotNull String str2, ArrayList<SubRouter> arrayList, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.percent = str;
        this.router = str2;
        this.subRouterList = arrayList;
        this.isHeaderLocal = z;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r6v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.dexlogic.bean.SubRouter>, boolean, int):void (m)] (LINE:1633) call: com.okinc.business.dexlogic.bean.DexRouterList.<init>(java.lang.String, java.lang.String, java.util.ArrayList, boolean, int):void type: THIS */
    public /* synthetic */ DexRouterList(String str, String str2, ArrayList arrayList, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : arrayList, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i);
    }
}
