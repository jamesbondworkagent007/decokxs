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
public final class SearchCoinResp implements Parcelable {
    private List<SearchCoinMetaBean> coinInfo;
    private boolean hasNext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchCoinResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SearchCoinMetaBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SearchCoinResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SearchCoinMetaBean.CREATOR.createFromParcel(parcel));
            }
            return new SearchCoinResp(z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchCoinResp[] newArray(int i) {
            return new SearchCoinResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SearchCoinResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCoinResp copy$default(SearchCoinResp searchCoinResp, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchCoinResp.hasNext;
        }
        if ((i & 2) != 0) {
            list = searchCoinResp.coinInfo;
        }
        return searchCoinResp.copy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchCoinMetaBean> component2() {
        return this.coinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchCoinResp copy(boolean z, @NotNull List<SearchCoinMetaBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SearchCoinResp(z, list);
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
        if (!(obj instanceof SearchCoinResp)) {
            return false;
        }
        SearchCoinResp searchCoinResp = (SearchCoinResp) obj;
        return this.hasNext == searchCoinResp.hasNext && Intrinsics.EZpvd(this.coinInfo, searchCoinResp.coinInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchCoinMetaBean> getCoinInfo() {
        return this.coinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.hasNext) * 31) + this.coinInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinInfo(@NotNull List<SearchCoinMetaBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasNext(boolean z) {
        this.hasNext = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchCoinResp(hasNext=" + this.hasNext + ", coinInfo=" + this.coinInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.hasNext ? 1 : 0);
        List<SearchCoinMetaBean> list = this.coinInfo;
        parcel.writeInt(list.size());
        Iterator<SearchCoinMetaBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SearchCoinResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchCoinResp> serializer() {
            return SearchCoinResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchCoinResp(int i, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SearchCoinResp$$serializer.INSTANCE.getDescriptor());
        }
        this.hasNext = z;
        this.coinInfo = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SearchCoinResp searchCoinResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, searchCoinResp.hasNext);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchCoinResp.coinInfo);
    }

    public SearchCoinResp(boolean z, @NotNull List<SearchCoinMetaBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasNext = z;
        this.coinInfo = list;
    }
}
