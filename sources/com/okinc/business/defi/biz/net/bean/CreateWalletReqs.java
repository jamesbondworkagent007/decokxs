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
public final class CreateWalletReqs implements Parcelable {
    private String channelId;
    private boolean isDelay;
    private List<CreateWalletReqNew> paramList;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateWalletReqs> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(CreateWalletReqNew$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CreateWalletReqs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateWalletReqs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CreateWalletReqNew.CREATOR.createFromParcel(parcel));
            }
            return new CreateWalletReqs(string, string2, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateWalletReqs[] newArray(int i) {
            return new CreateWalletReqs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.CreateWalletReqs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateWalletReqs copy$default(CreateWalletReqs createWalletReqs, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createWalletReqs.userUniqueId;
        }
        if ((i & 2) != 0) {
            str2 = createWalletReqs.channelId;
        }
        if ((i & 4) != 0) {
            z = createWalletReqs.isDelay;
        }
        if ((i & 8) != 0) {
            list = createWalletReqs.paramList;
        }
        return createWalletReqs.copy(str, str2, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CreateWalletReqNew> component4() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateWalletReqs copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull List<CreateWalletReqNew> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CreateWalletReqs(str, str2, z, list);
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
        if (!(obj instanceof CreateWalletReqs)) {
            return false;
        }
        CreateWalletReqs createWalletReqs = (CreateWalletReqs) obj;
        return Intrinsics.EZpvd((Object) this.userUniqueId, (Object) createWalletReqs.userUniqueId) && Intrinsics.EZpvd((Object) this.channelId, (Object) createWalletReqs.channelId) && this.isDelay == createWalletReqs.isDelay && Intrinsics.EZpvd(this.paramList, createWalletReqs.paramList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CreateWalletReqNew> getParamList() {
        return this.paramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.userUniqueId.hashCode() * 31) + this.channelId.hashCode()) * 31) + Boolean.hashCode(this.isDelay)) * 31) + this.paramList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDelay() {
        return this.isDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelay(boolean z) {
        this.isDelay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParamList(@NotNull List<CreateWalletReqNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.paramList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateWalletReqs(userUniqueId=" + this.userUniqueId + ", channelId=" + this.channelId + ", isDelay=" + this.isDelay + ", paramList=" + this.paramList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userUniqueId);
        parcel.writeString(this.channelId);
        parcel.writeInt(this.isDelay ? 1 : 0);
        List<CreateWalletReqNew> list = this.paramList;
        parcel.writeInt(list.size());
        Iterator<CreateWalletReqNew> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CreateWalletReqs.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateWalletReqs> serializer() {
            return CreateWalletReqs$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateWalletReqs(int i, String str, String str2, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, CreateWalletReqs$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str;
        }
        if ((i & 2) == 0) {
            this.channelId = "";
        } else {
            this.channelId = str2;
        }
        if ((i & 4) == 0) {
            this.isDelay = false;
        } else {
            this.isDelay = z;
        }
        this.paramList = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CreateWalletReqs createWalletReqs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) createWalletReqs.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, createWalletReqs.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) createWalletReqs.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, createWalletReqs.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createWalletReqs.isDelay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, createWalletReqs.isDelay);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], createWalletReqs.paramList);
    }

    public CreateWalletReqs(@NotNull String str, @NotNull String str2, boolean z, @NotNull List<CreateWalletReqNew> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.userUniqueId = str;
        this.channelId = str2;
        this.isDelay = z;
        this.paramList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (r5v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.defi.biz.net.bean.CreateWalletReqNew>):void (m)] (LINE:181) call: com.okinc.business.defi.biz.net.bean.CreateWalletReqs.<init>(java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ CreateWalletReqs(String str, String str2, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, list);
    }
}
