package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletDeleteRes implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> failWalletIdList;
    private List<String> successWalletIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletDeleteRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletDeleteRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletDeleteRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletDeleteRes(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletDeleteRes[] newArray(int i) {
            return new WalletDeleteRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletDeleteRes() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletDeleteRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletDeleteRes copy$default(WalletDeleteRes walletDeleteRes, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletDeleteRes.failWalletIdList;
        }
        if ((i & 2) != 0) {
            list2 = walletDeleteRes.successWalletIdList;
        }
        return walletDeleteRes.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.failWalletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.successWalletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletDeleteRes copy(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new WalletDeleteRes(list, list2);
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
        if (!(obj instanceof WalletDeleteRes)) {
            return false;
        }
        WalletDeleteRes walletDeleteRes = (WalletDeleteRes) obj;
        return Intrinsics.EZpvd(this.failWalletIdList, walletDeleteRes.failWalletIdList) && Intrinsics.EZpvd(this.successWalletIdList, walletDeleteRes.successWalletIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFailWalletIdList() {
        return this.failWalletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSuccessWalletIdList() {
        return this.successWalletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.failWalletIdList.hashCode() * 31) + this.successWalletIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailWalletIdList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.failWalletIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccessWalletIdList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.successWalletIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletDeleteRes(failWalletIdList=" + this.failWalletIdList + ", successWalletIdList=" + this.successWalletIdList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.failWalletIdList);
        parcel.writeStringList(this.successWalletIdList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletDeleteRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletDeleteRes> serializer() {
            return WalletDeleteRes$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ WalletDeleteRes(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.failWalletIdList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.successWalletIdList = new ArrayList();
        } else {
            this.successWalletIdList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletDeleteRes walletDeleteRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(walletDeleteRes.failWalletIdList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletDeleteRes.failWalletIdList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(walletDeleteRes.successWalletIdList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletDeleteRes.successWalletIdList);
    }

    public WalletDeleteRes(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.failWalletIdList = list;
        this.successWalletIdList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:586) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:587) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:585) call: com.okinc.business.defi.biz.net.bean.WalletDeleteRes.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ WalletDeleteRes(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
