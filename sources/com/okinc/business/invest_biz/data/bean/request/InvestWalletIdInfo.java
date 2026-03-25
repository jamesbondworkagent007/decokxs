package com.okinc.business.invest_biz.data.bean.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestWalletIdInfo implements Parcelable {
    private final String accountId;
    private final List<InvestWalletAddressInfo> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestWalletIdInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestWalletAddressInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<InvestWalletIdInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestWalletIdInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestWalletAddressInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestWalletIdInfo(arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestWalletIdInfo[] newArray(int i) {
            return new InvestWalletIdInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.InvestWalletIdInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestWalletIdInfo copy$default(InvestWalletIdInfo investWalletIdInfo, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investWalletIdInfo.walletAddressList;
        }
        if ((i & 2) != 0) {
            str = investWalletIdInfo.accountId;
        }
        return investWalletIdInfo.copy(list, str);
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    @SerialName("walletAddressList")
    public static /* synthetic */ void getWalletAddressList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> component1() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestWalletIdInfo copy(@NotNull List<InvestWalletAddressInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestWalletIdInfo(list, str);
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
        if (!(obj instanceof InvestWalletIdInfo)) {
            return false;
        }
        InvestWalletIdInfo investWalletIdInfo = (InvestWalletIdInfo) obj;
        return Intrinsics.EZpvd(this.walletAddressList, investWalletIdInfo.walletAddressList) && Intrinsics.EZpvd((Object) this.accountId, (Object) investWalletIdInfo.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletAddressList.hashCode() * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestWalletIdInfo(walletAddressList=" + this.walletAddressList + ", accountId=" + this.accountId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestWalletAddressInfo> list = this.walletAddressList;
        parcel.writeInt(list.size());
        Iterator<InvestWalletAddressInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.accountId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestWalletIdInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestWalletIdInfo> serializer() {
            return InvestWalletIdInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestWalletIdInfo(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvestWalletIdInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddressList = list;
        this.accountId = str;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestWalletIdInfo investWalletIdInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], investWalletIdInfo.walletAddressList);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investWalletIdInfo.accountId);
    }

    public InvestWalletIdInfo(@NotNull List<InvestWalletAddressInfo> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAddressList = list;
        this.accountId = str;
    }
}
