package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class MoreFunctionModuleInfo implements Parcelable {
    private final List<MoreFunctionInfo> homeModules;
    private final String moduleName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MoreFunctionModuleInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(MoreFunctionInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<MoreFunctionModuleInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoreFunctionModuleInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(MoreFunctionInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new MoreFunctionModuleInfo(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoreFunctionModuleInfo[] newArray(int i) {
            return new MoreFunctionModuleInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MoreFunctionModuleInfo() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MoreFunctionModuleInfo copy$default(MoreFunctionModuleInfo moreFunctionModuleInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = moreFunctionModuleInfo.moduleName;
        }
        if ((i & 2) != 0) {
            list = moreFunctionModuleInfo.homeModules;
        }
        return moreFunctionModuleInfo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MoreFunctionInfo> component2() {
        return this.homeModules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MoreFunctionModuleInfo copy(String str, List<MoreFunctionInfo> list) {
        return new MoreFunctionModuleInfo(str, list);
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
        if (!(obj instanceof MoreFunctionModuleInfo)) {
            return false;
        }
        MoreFunctionModuleInfo moreFunctionModuleInfo = (MoreFunctionModuleInfo) obj;
        return Intrinsics.EZpvd((Object) this.moduleName, (Object) moreFunctionModuleInfo.moduleName) && Intrinsics.EZpvd(this.homeModules, moreFunctionModuleInfo.homeModules);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MoreFunctionInfo> getHomeModules() {
        return this.homeModules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.moduleName;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<MoreFunctionInfo> list = this.homeModules;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MoreFunctionModuleInfo(moduleName=" + this.moduleName + ", homeModules=" + this.homeModules + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.moduleName);
        List<MoreFunctionInfo> list = this.homeModules;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<MoreFunctionInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MoreFunctionModuleInfo> serializer() {
            return MoreFunctionModuleInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MoreFunctionModuleInfo(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.moduleName = null;
        } else {
            this.moduleName = str;
        }
        if ((i & 2) == 0) {
            this.homeModules = null;
        } else {
            this.homeModules = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MoreFunctionModuleInfo moreFunctionModuleInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || moreFunctionModuleInfo.moduleName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, moreFunctionModuleInfo.moduleName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && moreFunctionModuleInfo.homeModules == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], moreFunctionModuleInfo.homeModules);
    }

    public MoreFunctionModuleInfo(String str, List<MoreFunctionInfo> list) {
        this.moduleName = str;
        this.homeModules = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.MoreFunctionInfo>):void (m)] (LINE:757) call: com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MoreFunctionModuleInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
