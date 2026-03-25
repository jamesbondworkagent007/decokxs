package com.okinc.business.defi.wallet.mine.search.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletSearchRequest implements Parcelable {
    public static final String SEARCH_SOURCE_ADDRESS = "address";
    public static final String SEARCH_SOURCE_DISCOVER = "discover";
    public static final String SEARCH_SOURCE_TOKEN = "token";
    private final Long chainIndex;
    private final DiscoverSearchParam discoverSearchParam;
    private final String keyword;
    private final List<String> sources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletSearchRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<WalletSearchRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSearchRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletSearchRequest(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.createStringArrayList(), DiscoverSearchParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletSearchRequest[] newArray(int i) {
            return new WalletSearchRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletSearchRequest copy$default(WalletSearchRequest walletSearchRequest, String str, Long l, List list, DiscoverSearchParam discoverSearchParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSearchRequest.keyword;
        }
        if ((i & 2) != 0) {
            l = walletSearchRequest.chainIndex;
        }
        if ((i & 4) != 0) {
            list = walletSearchRequest.sources;
        }
        if ((i & 8) != 0) {
            discoverSearchParam = walletSearchRequest.discoverSearchParam;
        }
        return walletSearchRequest.copy(str, l, list, discoverSearchParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.sources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscoverSearchParam component4() {
        return this.discoverSearchParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchRequest copy(@NotNull String str, Long l, @NotNull List<String> list, @NotNull DiscoverSearchParam discoverSearchParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(discoverSearchParam, "");
        return new WalletSearchRequest(str, l, list, discoverSearchParam);
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
        if (!(obj instanceof WalletSearchRequest)) {
            return false;
        }
        WalletSearchRequest walletSearchRequest = (WalletSearchRequest) obj;
        return Intrinsics.EZpvd((Object) this.keyword, (Object) walletSearchRequest.keyword) && Intrinsics.EZpvd(this.chainIndex, walletSearchRequest.chainIndex) && Intrinsics.EZpvd(this.sources, walletSearchRequest.sources) && Intrinsics.EZpvd(this.discoverSearchParam, walletSearchRequest.discoverSearchParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscoverSearchParam getDiscoverSearchParam() {
        return this.discoverSearchParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSources() {
        return this.sources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.keyword.hashCode();
        Long l = this.chainIndex;
        return (((((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.sources.hashCode()) * 31) + this.discoverSearchParam.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchRequest(keyword=" + this.keyword + ", chainIndex=" + this.chainIndex + ", sources=" + this.sources + ", discoverSearchParam=" + this.discoverSearchParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.keyword);
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeStringList(this.sources);
        this.discoverSearchParam.writeToParcel(parcel, i);
    }

    public /* synthetic */ WalletSearchRequest(int i, String str, Long l, List list, DiscoverSearchParam discoverSearchParam, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, WalletSearchRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.keyword = str;
        this.chainIndex = l;
        this.sources = list;
        this.discoverSearchParam = discoverSearchParam;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletSearchRequest walletSearchRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, walletSearchRequest.keyword);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, walletSearchRequest.chainIndex);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], walletSearchRequest.sources);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, DiscoverSearchParam$$serializer.INSTANCE, walletSearchRequest.discoverSearchParam);
    }

    public WalletSearchRequest(@NotNull String str, Long l, @NotNull List<String> list, @NotNull DiscoverSearchParam discoverSearchParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(discoverSearchParam, "");
        this.keyword = str;
        this.chainIndex = l;
        this.sources = list;
        this.discoverSearchParam = discoverSearchParam;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WalletSearchRequest> serializer() {
            return WalletSearchRequest$$serializer.INSTANCE;
        }
    }
}
