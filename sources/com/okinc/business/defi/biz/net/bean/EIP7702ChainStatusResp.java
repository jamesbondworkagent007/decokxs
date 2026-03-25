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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EIP7702ChainStatusResp implements Parcelable {
    private final List<ChainStatusItem> chainList;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EIP7702ChainStatusResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EIP7702ChainStatusResp$ChainStatusItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EIP7702ChainStatusResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702ChainStatusResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChainStatusItem.CREATOR.createFromParcel(parcel));
            }
            return new EIP7702ChainStatusResp(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EIP7702ChainStatusResp[] newArray(int i) {
            return new EIP7702ChainStatusResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EIP7702ChainStatusResp copy$default(EIP7702ChainStatusResp eIP7702ChainStatusResp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eIP7702ChainStatusResp.walletId;
        }
        if ((i & 2) != 0) {
            list = eIP7702ChainStatusResp.chainList;
        }
        return eIP7702ChainStatusResp.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> component2() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EIP7702ChainStatusResp copy(@NotNull String str, @NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EIP7702ChainStatusResp(str, list);
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
        if (!(obj instanceof EIP7702ChainStatusResp)) {
            return false;
        }
        EIP7702ChainStatusResp eIP7702ChainStatusResp = (EIP7702ChainStatusResp) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) eIP7702ChainStatusResp.walletId) && Intrinsics.EZpvd(this.chainList, eIP7702ChainStatusResp.chainList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainStatusItem> getChainList() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletId.hashCode() * 31) + this.chainList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EIP7702ChainStatusResp(walletId=" + this.walletId + ", chainList=" + this.chainList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        List<ChainStatusItem> list = this.chainList;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EIP7702ChainStatusResp> serializer() {
            return EIP7702ChainStatusResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EIP7702ChainStatusResp(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EIP7702ChainStatusResp$$serializer.INSTANCE.getDescriptor());
        }
        this.walletId = str;
        this.chainList = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EIP7702ChainStatusResp eIP7702ChainStatusResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eIP7702ChainStatusResp.walletId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eIP7702ChainStatusResp.chainList);
    }

    public EIP7702ChainStatusResp(@NotNull String str, @NotNull List<ChainStatusItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletId = str;
        this.chainList = list;
    }

    @Serializable
    public static final class ChainStatusItem implements Parcelable {
        public static final int $stable = 0;
        private final long chainIndex;
        private final String contractAddress;
        private final String contractData;
        private final String revokeContractAddress;
        private final String revokeContractData;
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
                return new ChainStatusItem(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
        public final long component1() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.contractData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.revokeContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.revokeContractData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainStatusItem copy(long j, int i, String str, String str2, String str3, String str4) {
            return new ChainStatusItem(j, i, str, str2, str3, str4);
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
            return this.chainIndex == chainStatusItem.chainIndex && this.status == chainStatusItem.status && Intrinsics.EZpvd((Object) this.contractAddress, (Object) chainStatusItem.contractAddress) && Intrinsics.EZpvd((Object) this.contractData, (Object) chainStatusItem.contractData) && Intrinsics.EZpvd((Object) this.revokeContractAddress, (Object) chainStatusItem.revokeContractAddress) && Intrinsics.EZpvd((Object) this.revokeContractData, (Object) chainStatusItem.revokeContractData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContractAddress() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContractData() {
            return this.contractData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRevokeContractAddress() {
            return this.revokeContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRevokeContractData() {
            return this.revokeContractData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.chainIndex);
            int iHashCode2 = Integer.hashCode(this.status);
            String str = this.contractAddress;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.contractData;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.revokeContractAddress;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.revokeContractData;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChainStatusItem(chainIndex=" + this.chainIndex + ", status=" + this.status + ", contractAddress=" + this.contractAddress + ", contractData=" + this.contractData + ", revokeContractAddress=" + this.revokeContractAddress + ", revokeContractData=" + this.revokeContractData + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.chainIndex);
            parcel.writeInt(this.status);
            parcel.writeString(this.contractAddress);
            parcel.writeString(this.contractData);
            parcel.writeString(this.revokeContractAddress);
            parcel.writeString(this.revokeContractData);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp.ChainStatusItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ChainStatusItem> serializer() {
                return EIP7702ChainStatusResp$ChainStatusItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ChainStatusItem(int i, long j, int i2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, EIP7702ChainStatusResp$ChainStatusItem$$serializer.INSTANCE.getDescriptor());
            }
            this.chainIndex = j;
            this.status = i2;
            if ((i & 4) == 0) {
                this.contractAddress = null;
            } else {
                this.contractAddress = str;
            }
            if ((i & 8) == 0) {
                this.contractData = null;
            } else {
                this.contractData = str2;
            }
            if ((i & 16) == 0) {
                this.revokeContractAddress = null;
            } else {
                this.revokeContractAddress = str3;
            }
            if ((i & 32) == 0) {
                this.revokeContractData = null;
            } else {
                this.revokeContractData = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainStatusItem chainStatusItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, chainStatusItem.chainIndex);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, chainStatusItem.status);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || chainStatusItem.contractAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, chainStatusItem.contractAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || chainStatusItem.contractData != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, chainStatusItem.contractData);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || chainStatusItem.revokeContractAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, chainStatusItem.revokeContractAddress);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && chainStatusItem.revokeContractData == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, chainStatusItem.revokeContractData);
        }

        public ChainStatusItem(long j, int i, String str, String str2, String str3, String str4) {
            this.chainIndex = j;
            this.status = i;
            this.contractAddress = str;
            this.contractData = str2;
            this.revokeContractAddress = str3;
            this.revokeContractData = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r11v0 long)
  (r13v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1936) call: com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp.ChainStatusItem.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ChainStatusItem(long j, int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
        }
    }
}
