package com.okinc.business.invest_biz.data.models;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DetailOrderParam implements Parcelable {
    private final long chainId;
    private final long investmentId;
    private final int pageNum;
    private final int pageSize;
    private final List<String> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DetailOrderParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DetailOrderParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailOrderParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DetailOrderParam(parcel.readLong(), parcel.readLong(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailOrderParam[] newArray(int i) {
            return new DetailOrderParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetailOrderParam copy(long j, long j2, @NotNull List<String> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DetailOrderParam(j, j2, list, i, i2);
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
        if (!(obj instanceof DetailOrderParam)) {
            return false;
        }
        DetailOrderParam detailOrderParam = (DetailOrderParam) obj;
        return this.chainId == detailOrderParam.chainId && this.investmentId == detailOrderParam.investmentId && Intrinsics.EZpvd(this.walletAddressList, detailOrderParam.walletAddressList) && this.pageSize == detailOrderParam.pageSize && this.pageNum == detailOrderParam.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.chainId) * 31) + Long.hashCode(this.investmentId)) * 31) + this.walletAddressList.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.pageNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DetailOrderParam(chainId=" + this.chainId + ", investmentId=" + this.investmentId + ", walletAddressList=" + this.walletAddressList + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeLong(this.investmentId);
        parcel.writeStringList(this.walletAddressList);
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.pageNum);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.DetailOrderParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DetailOrderParam> serializer() {
            return DetailOrderParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DetailOrderParam(int i, long j, long j2, List list, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, DetailOrderParam$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = j;
        this.investmentId = j2;
        this.walletAddressList = list;
        this.pageSize = i2;
        this.pageNum = i3;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(DetailOrderParam detailOrderParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, detailOrderParam.chainId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, detailOrderParam.investmentId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], detailOrderParam.walletAddressList);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, detailOrderParam.pageSize);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, detailOrderParam.pageNum);
    }

    public DetailOrderParam(long j, long j2, @NotNull List<String> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = j;
        this.investmentId = j2;
        this.walletAddressList = list;
        this.pageSize = i;
        this.pageNum = i2;
    }
}
