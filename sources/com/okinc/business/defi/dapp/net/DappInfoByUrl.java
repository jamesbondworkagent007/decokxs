package com.okinc.business.defi.dapp.net;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappInfoByUrl implements Parcelable {
    private boolean aaPromptFlag;
    private ArrayList<Long> chainIdList;
    private String id;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappInfoByUrl> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappInfoByUrl> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInfoByUrl createFromParcel(Parcel parcel) {
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
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList2;
            }
            return new DappInfoByUrl(string, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInfoByUrl[] newArray(int i) {
            return new DappInfoByUrl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.DappInfoByUrl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappInfoByUrl copy$default(DappInfoByUrl dappInfoByUrl, String str, boolean z, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappInfoByUrl.id;
        }
        if ((i & 2) != 0) {
            z = dappInfoByUrl.aaPromptFlag;
        }
        if ((i & 4) != 0) {
            arrayList = dappInfoByUrl.chainIdList;
        }
        return dappInfoByUrl.copy(str, z, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.aaPromptFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> component3() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInfoByUrl copy(@NotNull String str, boolean z, ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DappInfoByUrl(str, z, arrayList);
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
        if (!(obj instanceof DappInfoByUrl)) {
            return false;
        }
        DappInfoByUrl dappInfoByUrl = (DappInfoByUrl) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) dappInfoByUrl.id) && this.aaPromptFlag == dappInfoByUrl.aaPromptFlag && Intrinsics.EZpvd(this.chainIdList, dappInfoByUrl.chainIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAaPromptFlag() {
        return this.aaPromptFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIdList() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Boolean.hashCode(this.aaPromptFlag);
        ArrayList<Long> arrayList = this.chainIdList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaPromptFlag(boolean z) {
        this.aaPromptFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIdList(ArrayList<Long> arrayList) {
        this.chainIdList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappInfoByUrl(id=" + this.id + ", aaPromptFlag=" + this.aaPromptFlag + ", chainIdList=" + this.chainIdList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeInt(this.aaPromptFlag ? 1 : 0);
        ArrayList<Long> arrayList = this.chainIdList;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappInfoByUrl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappInfoByUrl> serializer() {
            return DappInfoByUrl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappInfoByUrl(int i, String str, boolean z, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DappInfoByUrl$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.aaPromptFlag = z;
        if ((i & 4) == 0) {
            this.chainIdList = null;
        } else {
            this.chainIdList = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappInfoByUrl dappInfoByUrl, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dappInfoByUrl.id);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, dappInfoByUrl.aaPromptFlag);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && dappInfoByUrl.chainIdList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], dappInfoByUrl.chainIdList);
    }

    public DappInfoByUrl(@NotNull String str, boolean z, ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.aaPromptFlag = z;
        this.chainIdList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 boolean)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.lang.String, boolean, java.util.ArrayList<java.lang.Long>):void (m)] (LINE:234) call: com.okinc.business.defi.dapp.net.DappInfoByUrl.<init>(java.lang.String, boolean, java.util.ArrayList):void type: THIS */
    public /* synthetic */ DappInfoByUrl(String str, boolean z, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : arrayList);
    }
}
