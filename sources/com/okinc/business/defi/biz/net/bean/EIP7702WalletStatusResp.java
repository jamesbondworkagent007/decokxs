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
public final class EIP7702WalletStatusResp implements Parcelable {
    private final int status;
    private final List<ChainStatusItem> supportChainList;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EIP7702WalletStatusResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(EIP7702WalletStatusResp$ChainStatusItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EIP7702WalletStatusResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702WalletStatusResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ChainStatusItem.CREATOR.createFromParcel(parcel));
            }
            return new EIP7702WalletStatusResp(string, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702WalletStatusResp[] newArray(int i) {
            return new EIP7702WalletStatusResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EIP7702WalletStatusResp copy$default(EIP7702WalletStatusResp eIP7702WalletStatusResp, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eIP7702WalletStatusResp.walletId;
        }
        if ((i2 & 2) != 0) {
            i = eIP7702WalletStatusResp.status;
        }
        if ((i2 & 4) != 0) {
            list = eIP7702WalletStatusResp.supportChainList;
        }
        return eIP7702WalletStatusResp.copy(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> component3() {
        return this.supportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EIP7702WalletStatusResp copy(@NotNull String str, int i, @NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EIP7702WalletStatusResp(str, i, list);
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
        if (!(obj instanceof EIP7702WalletStatusResp)) {
            return false;
        }
        EIP7702WalletStatusResp eIP7702WalletStatusResp = (EIP7702WalletStatusResp) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) eIP7702WalletStatusResp.walletId) && this.status == eIP7702WalletStatusResp.status && Intrinsics.EZpvd(this.supportChainList, eIP7702WalletStatusResp.supportChainList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> getSupportChainList() {
        return this.supportChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletId.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.supportChainList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EIP7702WalletStatusResp(walletId=" + this.walletId + ", status=" + this.status + ", supportChainList=" + this.supportChainList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeInt(this.status);
        List<ChainStatusItem> list = this.supportChainList;
        parcel.writeInt(list.size());
        Iterator<ChainStatusItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EIP7702WalletStatusResp> serializer() {
            return EIP7702WalletStatusResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EIP7702WalletStatusResp(int i, String str, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, EIP7702WalletStatusResp$$serializer.INSTANCE.getDescriptor());
        }
        this.walletId = str;
        if ((i & 2) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        this.supportChainList = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EIP7702WalletStatusResp eIP7702WalletStatusResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eIP7702WalletStatusResp.walletId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eIP7702WalletStatusResp.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, eIP7702WalletStatusResp.status);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], eIP7702WalletStatusResp.supportChainList);
    }

    public EIP7702WalletStatusResp(@NotNull String str, int i, @NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletId = str;
        this.status = i;
        this.supportChainList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (r3v0 java.util.List)
 A[MD:(java.lang.String, int, java.util.List<com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp$ChainStatusItem>):void (m)] (LINE:1912) call: com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp.<init>(java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ EIP7702WalletStatusResp(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, list);
    }

    @Serializable
    public static final class ChainStatusItem implements Parcelable {
        public static final int $stable = 0;
        private final long chainIndex;
        private final int status;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ChainStatusItem> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChainStatusItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainStatusItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ChainStatusItem(parcel.readLong(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainStatusItem[] newArray(int i) {
                return new ChainStatusItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ChainStatusItem copy$default(ChainStatusItem chainStatusItem, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = chainStatusItem.chainIndex;
            }
            if ((i2 & 2) != 0) {
                i = chainStatusItem.status;
            }
            return chainStatusItem.copy(j, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainStatusItem copy(long j, int i) {
            return new ChainStatusItem(j, i);
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
            if (!(obj instanceof ChainStatusItem)) {
                return false;
            }
            ChainStatusItem chainStatusItem = (ChainStatusItem) obj;
            return this.chainIndex == chainStatusItem.chainIndex && this.status == chainStatusItem.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.chainIndex) * 31) + Integer.hashCode(this.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChainStatusItem(chainIndex=" + this.chainIndex + ", status=" + this.status + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.chainIndex);
            parcel.writeInt(this.status);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp.ChainStatusItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ChainStatusItem> serializer() {
                return EIP7702WalletStatusResp$ChainStatusItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ChainStatusItem(int i, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, EIP7702WalletStatusResp$ChainStatusItem$$serializer.INSTANCE.getDescriptor());
            }
            this.chainIndex = j;
            this.status = i2;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainStatusItem chainStatusItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, chainStatusItem.chainIndex);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, chainStatusItem.status);
        }

        public ChainStatusItem(long j, int i) {
            this.chainIndex = j;
            this.status = i;
        }
    }
}
