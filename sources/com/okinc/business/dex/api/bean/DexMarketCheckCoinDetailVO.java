package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexMarketCheckCoinDetailVO implements Parcelable {
    private final List<DexTokenBaseInfo> dexTokenBaseInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexMarketCheckCoinDetailVO> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DexTokenBaseInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DexMarketCheckCoinDetailVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckCoinDetailVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DexTokenBaseInfo.CREATOR.createFromParcel(parcel));
            }
            return new DexMarketCheckCoinDetailVO(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckCoinDetailVO[] newArray(int i) {
            return new DexMarketCheckCoinDetailVO[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexMarketCheckCoinDetailVO copy$default(DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexMarketCheckCoinDetailVO.dexTokenBaseInfoList;
        }
        return dexMarketCheckCoinDetailVO.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexTokenBaseInfo> component1() {
        return this.dexTokenBaseInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMarketCheckCoinDetailVO copy(@NotNull List<DexTokenBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DexMarketCheckCoinDetailVO(list);
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
        return (obj instanceof DexMarketCheckCoinDetailVO) && Intrinsics.EZpvd(this.dexTokenBaseInfoList, ((DexMarketCheckCoinDetailVO) obj).dexTokenBaseInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexTokenBaseInfo> getDexTokenBaseInfoList() {
        return this.dexTokenBaseInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.dexTokenBaseInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMarketCheckCoinDetailVO(dexTokenBaseInfoList=" + this.dexTokenBaseInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DexTokenBaseInfo> list = this.dexTokenBaseInfoList;
        parcel.writeInt(list.size());
        Iterator<DexTokenBaseInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMarketCheckCoinDetailVO> serializer() {
            return DexMarketCheckCoinDetailVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMarketCheckCoinDetailVO(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DexMarketCheckCoinDetailVO$$serializer.INSTANCE.getDescriptor());
        }
        this.dexTokenBaseInfoList = list;
    }

    public DexMarketCheckCoinDetailVO(@NotNull List<DexTokenBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dexTokenBaseInfoList = list;
    }
}
