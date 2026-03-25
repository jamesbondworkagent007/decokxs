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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncWalletReqs implements Parcelable {
    private boolean isDelay;
    private final List<SyncWalletReqNew> paramList;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SyncWalletReqs> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SyncWalletReqNew$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SyncWalletReqs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncWalletReqs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SyncWalletReqNew.CREATOR.createFromParcel(parcel));
            }
            return new SyncWalletReqs(string, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncWalletReqs[] newArray(int i) {
            return new SyncWalletReqs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SyncWalletReqs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncWalletReqs copy$default(SyncWalletReqs syncWalletReqs, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncWalletReqs.userUniqueId;
        }
        if ((i & 2) != 0) {
            z = syncWalletReqs.isDelay;
        }
        if ((i & 4) != 0) {
            list = syncWalletReqs.paramList;
        }
        return syncWalletReqs.copy(str, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SyncWalletReqNew> component3() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncWalletReqs copy(@NotNull String str, boolean z, @NotNull List<SyncWalletReqNew> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SyncWalletReqs(str, z, list);
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
        if (!(obj instanceof SyncWalletReqs)) {
            return false;
        }
        SyncWalletReqs syncWalletReqs = (SyncWalletReqs) obj;
        return Intrinsics.EZpvd((Object) this.userUniqueId, (Object) syncWalletReqs.userUniqueId) && this.isDelay == syncWalletReqs.isDelay && Intrinsics.EZpvd(this.paramList, syncWalletReqs.paramList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SyncWalletReqNew> getParamList() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userUniqueId.hashCode() * 31) + Boolean.hashCode(this.isDelay)) * 31) + this.paramList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDelay() {
        return this.isDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelay(boolean z) {
        this.isDelay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncWalletReqs(userUniqueId=" + this.userUniqueId + ", isDelay=" + this.isDelay + ", paramList=" + this.paramList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userUniqueId);
        parcel.writeInt(this.isDelay ? 1 : 0);
        List<SyncWalletReqNew> list = this.paramList;
        parcel.writeInt(list.size());
        Iterator<SyncWalletReqNew> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncWalletReqs.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncWalletReqs> serializer() {
            return SyncWalletReqs$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncWalletReqs(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, SyncWalletReqs$$serializer.INSTANCE.getDescriptor());
        }
        this.userUniqueId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isDelay = false;
        } else {
            this.isDelay = z;
        }
        this.paramList = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncWalletReqs syncWalletReqs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) syncWalletReqs.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, syncWalletReqs.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || syncWalletReqs.isDelay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, syncWalletReqs.isDelay);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], syncWalletReqs.paramList);
    }

    public SyncWalletReqs(@NotNull String str, boolean z, @NotNull List<SyncWalletReqNew> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.userUniqueId = str;
        this.isDelay = z;
        this.paramList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (r3v0 java.util.List)
 A[MD:(java.lang.String, boolean, java.util.List<com.okinc.business.defi.biz.net.bean.SyncWalletReqNew>):void (m)] (LINE:200) call: com.okinc.business.defi.biz.net.bean.SyncWalletReqs.<init>(java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ SyncWalletReqs(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, list);
    }
}
