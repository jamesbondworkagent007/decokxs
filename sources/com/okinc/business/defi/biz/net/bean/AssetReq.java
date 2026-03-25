package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AssetReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private ArrayList<String> bch;
    private ArrayList<String> bitcoin;
    private ArrayList<String> dash;
    private ArrayList<String> evm;
    private ArrayList<String> ltc;
    private ArrayList<String> tron;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AssetReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetReq(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetReq[] newArray(int i) {
            return new AssetReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetReq() {
        this((ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.biz.net.bean.AssetReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetReq copy$default(AssetReq assetReq, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = assetReq.evm;
        }
        if ((i & 2) != 0) {
            arrayList2 = assetReq.bitcoin;
        }
        ArrayList arrayList7 = arrayList2;
        if ((i & 4) != 0) {
            arrayList3 = assetReq.tron;
        }
        ArrayList arrayList8 = arrayList3;
        if ((i & 8) != 0) {
            arrayList4 = assetReq.bch;
        }
        ArrayList arrayList9 = arrayList4;
        if ((i & 16) != 0) {
            arrayList5 = assetReq.ltc;
        }
        ArrayList arrayList10 = arrayList5;
        if ((i & 32) != 0) {
            arrayList6 = assetReq.dash;
        }
        return assetReq.copy(arrayList, arrayList7, arrayList8, arrayList9, arrayList10, arrayList6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.evm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.bitcoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component3() {
        return this.tron;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component4() {
        return this.bch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component5() {
        return this.ltc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component6() {
        return this.dash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetReq copy(@NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2, @NotNull ArrayList<String> arrayList3, @NotNull ArrayList<String> arrayList4, @NotNull ArrayList<String> arrayList5, @NotNull ArrayList<String> arrayList6) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(arrayList5, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        return new AssetReq(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
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
        if (!(obj instanceof AssetReq)) {
            return false;
        }
        AssetReq assetReq = (AssetReq) obj;
        return Intrinsics.EZpvd(this.evm, assetReq.evm) && Intrinsics.EZpvd(this.bitcoin, assetReq.bitcoin) && Intrinsics.EZpvd(this.tron, assetReq.tron) && Intrinsics.EZpvd(this.bch, assetReq.bch) && Intrinsics.EZpvd(this.ltc, assetReq.ltc) && Intrinsics.EZpvd(this.dash, assetReq.dash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getBch() {
        return this.bch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getBitcoin() {
        return this.bitcoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getDash() {
        return this.dash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getEvm() {
        return this.evm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getLtc() {
        return this.ltc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTron() {
        return this.tron;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.evm.hashCode() * 31) + this.bitcoin.hashCode()) * 31) + this.tron.hashCode()) * 31) + this.bch.hashCode()) * 31) + this.ltc.hashCode()) * 31) + this.dash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBch(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.bch = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBitcoin(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.bitcoin = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDash(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.dash = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvm(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.evm = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLtc(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.ltc = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTron(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.tron = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetReq(evm=" + this.evm + ", bitcoin=" + this.bitcoin + ", tron=" + this.tron + ", bch=" + this.bch + ", ltc=" + this.ltc + ", dash=" + this.dash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.evm);
        parcel.writeStringList(this.bitcoin);
        parcel.writeStringList(this.tron);
        parcel.writeStringList(this.bch);
        parcel.writeStringList(this.ltc);
        parcel.writeStringList(this.dash);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AssetReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetReq> serializer() {
            return AssetReq$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ AssetReq(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, SerializationConstructorMarker serializationConstructorMarker) {
        this.evm = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.bitcoin = new ArrayList<>();
        } else {
            this.bitcoin = arrayList2;
        }
        if ((i & 4) == 0) {
            this.tron = new ArrayList<>();
        } else {
            this.tron = arrayList3;
        }
        if ((i & 8) == 0) {
            this.bch = new ArrayList<>();
        } else {
            this.bch = arrayList4;
        }
        if ((i & 16) == 0) {
            this.ltc = new ArrayList<>();
        } else {
            this.ltc = arrayList5;
        }
        if ((i & 32) == 0) {
            this.dash = new ArrayList<>();
        } else {
            this.dash = arrayList6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [322=7] */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetReq assetReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(assetReq.evm, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], assetReq.evm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(assetReq.bitcoin, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], assetReq.bitcoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(assetReq.tron, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], assetReq.tron);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(assetReq.bch, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], assetReq.bch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(assetReq.ltc, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], assetReq.ltc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(assetReq.dash, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], assetReq.dash);
    }

    public AssetReq(@NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2, @NotNull ArrayList<String> arrayList3, @NotNull ArrayList<String> arrayList4, @NotNull ArrayList<String> arrayList5, @NotNull ArrayList<String> arrayList6) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        Intrinsics.checkNotNullParameter(arrayList4, "");
        Intrinsics.checkNotNullParameter(arrayList5, "");
        Intrinsics.checkNotNullParameter(arrayList6, "");
        this.evm = arrayList;
        this.bitcoin = arrayList2;
        this.tron = arrayList3;
        this.bch = arrayList4;
        this.ltc = arrayList5;
        this.dash = arrayList6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:326) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x0012: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:327) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x001c: TERNARY null = ((wrap:int:0x0013: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:328) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r7v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x0026: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0023: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:329) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x0030: TERNARY null = ((wrap:int:0x0027: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x002d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:330) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0031: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0037: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:331) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>):void (m)] (LINE:325) call: com.okinc.business.defi.biz.net.bean.AssetReq.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AssetReq(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3, (i & 8) != 0 ? new ArrayList() : arrayList4, (i & 16) != 0 ? new ArrayList() : arrayList5, (i & 32) != 0 ? new ArrayList() : arrayList6);
    }
}
