package com.okinc.business.invest_biz.data.bean.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_api.bean.TokenInfo;
import com.okinc.business.invest_api.bean.TokenInfo$$serializer;
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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class WalletTokenInfoListParam implements Parcelable {
    private final List<TokenInfo> tokenInfos;
    private final List<String> walletIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletTokenInfoListParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TokenInfo$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WalletTokenInfoListParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTokenInfoListParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(WalletTokenInfoListParam.class.getClassLoader()));
            }
            return new WalletTokenInfoListParam(arrayList, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletTokenInfoListParam[] newArray(int i) {
            return new WalletTokenInfoListParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.WalletTokenInfoListParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletTokenInfoListParam copy$default(WalletTokenInfoListParam walletTokenInfoListParam, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletTokenInfoListParam.tokenInfos;
        }
        if ((i & 2) != 0) {
            list2 = walletTokenInfoListParam.walletIds;
        }
        return walletTokenInfoListParam.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> component1() {
        return this.tokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.walletIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTokenInfoListParam copy(@NotNull List<TokenInfo> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new WalletTokenInfoListParam(list, list2);
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
        if (!(obj instanceof WalletTokenInfoListParam)) {
            return false;
        }
        WalletTokenInfoListParam walletTokenInfoListParam = (WalletTokenInfoListParam) obj;
        return Intrinsics.EZpvd(this.tokenInfos, walletTokenInfoListParam.tokenInfos) && Intrinsics.EZpvd(this.walletIds, walletTokenInfoListParam.walletIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> getTokenInfos() {
        return this.tokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletIds() {
        return this.walletIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tokenInfos.hashCode() * 31) + this.walletIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTokenInfoListParam(tokenInfos=" + this.tokenInfos + ", walletIds=" + this.walletIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TokenInfo> list = this.tokenInfos;
        parcel.writeInt(list.size());
        Iterator<TokenInfo> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeStringList(this.walletIds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.WalletTokenInfoListParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletTokenInfoListParam> serializer() {
            return WalletTokenInfoListParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletTokenInfoListParam(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WalletTokenInfoListParam$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenInfos = list;
        this.walletIds = list2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(WalletTokenInfoListParam walletTokenInfoListParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletTokenInfoListParam.tokenInfos);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletTokenInfoListParam.walletIds);
    }

    public WalletTokenInfoListParam(@NotNull List<TokenInfo> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.tokenInfos = list;
        this.walletIds = list2;
    }
}
