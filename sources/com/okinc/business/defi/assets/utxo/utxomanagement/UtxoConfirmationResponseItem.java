package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C10344bmg;
import o.C13754dXa;
import o.C33070mpX;
import o.C33129mqd;
import o.C56403yEb;
import o.InterfaceC9731bbC;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoConfirmationResponseItem implements Parcelable {
    public final List<String> assetUnknown;
    public final String coinAmount;
    public String imageUrl;
    public final List<UtxoConfirmationResponseAssetItem> protocolAssetList;
    public final String txHash;
    public final Integer vout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UtxoConfirmationResponseItem> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(UtxoConfirmationResponseAssetItem$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<UtxoConfirmationResponseItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponseItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UtxoConfirmationResponseAssetItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new UtxoConfirmationResponseItem(string, numValueOf, string2, arrayListCreateStringArrayList, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponseItem[] newArray(int i) {
            return new UtxoConfirmationResponseItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoConfirmationResponseItem() {
        this((String) null, (Integer) null, (String) null, (List) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoConfirmationResponseItem copy$default(UtxoConfirmationResponseItem utxoConfirmationResponseItem, String str, Integer num, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utxoConfirmationResponseItem.txHash;
        }
        if ((i & 2) != 0) {
            num = utxoConfirmationResponseItem.vout;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = utxoConfirmationResponseItem.coinAmount;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = utxoConfirmationResponseItem.assetUnknown;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = utxoConfirmationResponseItem.protocolAssetList;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            str3 = utxoConfirmationResponseItem.imageUrl;
        }
        return utxoConfirmationResponseItem.AEQbTJ(str, num2, str4, list3, list4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationResponseItem AEQbTJ(String str, Integer num, String str2, List<String> list, List<UtxoConfirmationResponseAssetItem> list2, String str3) {
        return new UtxoConfirmationResponseItem(str, num, str2, list, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoConfirmationResponseAssetItem> EZpvd() {
        return this.protocolAssetList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.vout;
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
        if (!(obj instanceof UtxoConfirmationResponseItem)) {
            return false;
        }
        UtxoConfirmationResponseItem utxoConfirmationResponseItem = (UtxoConfirmationResponseItem) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) utxoConfirmationResponseItem.txHash) && Intrinsics.EZpvd(this.vout, utxoConfirmationResponseItem.vout) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) utxoConfirmationResponseItem.coinAmount) && Intrinsics.EZpvd(this.assetUnknown, utxoConfirmationResponseItem.assetUnknown) && Intrinsics.EZpvd(this.protocolAssetList, utxoConfirmationResponseItem.protocolAssetList) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) utxoConfirmationResponseItem.imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txHash;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.vout;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.coinAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.assetUnknown;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<UtxoConfirmationResponseAssetItem> list2 = this.protocolAssetList;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        String str3 = this.imageUrl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoConfirmationResponseItem(txHash=" + this.txHash + ", vout=" + this.vout + ", coinAmount=" + this.coinAmount + ", assetUnknown=" + this.assetUnknown + ", protocolAssetList=" + this.protocolAssetList + ", imageUrl=" + this.imageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        Integer num = this.vout;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.coinAmount);
        parcel.writeStringList(this.assetUnknown);
        List<UtxoConfirmationResponseAssetItem> list = this.protocolAssetList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UtxoConfirmationResponseAssetItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.imageUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoConfirmationResponseItem> serializer() {
            return UtxoConfirmationResponseItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoConfirmationResponseItem(int i, String str, Integer num, String str2, List list, List list2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str;
        }
        if ((i & 2) == 0) {
            this.vout = null;
        } else {
            this.vout = num;
        }
        if ((i & 4) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str2;
        }
        if ((i & 8) == 0) {
            this.assetUnknown = null;
        } else {
            this.assetUnknown = list;
        }
        if ((i & 16) == 0) {
            this.protocolAssetList = null;
        } else {
            this.protocolAssetList = list2;
        }
        if ((i & 32) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str3;
        }
    }

    public static final /* synthetic */ void copydefault(UtxoConfirmationResponseItem utxoConfirmationResponseItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoConfirmationResponseItem.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, utxoConfirmationResponseItem.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || utxoConfirmationResponseItem.vout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, utxoConfirmationResponseItem.vout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoConfirmationResponseItem.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, utxoConfirmationResponseItem.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || utxoConfirmationResponseItem.assetUnknown != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], utxoConfirmationResponseItem.assetUnknown);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || utxoConfirmationResponseItem.protocolAssetList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], utxoConfirmationResponseItem.protocolAssetList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && utxoConfirmationResponseItem.imageUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, utxoConfirmationResponseItem.imageUrl);
    }

    public UtxoConfirmationResponseItem(String str, Integer num, String str2, List<String> list, List<UtxoConfirmationResponseAssetItem> list2, String str3) {
        this.txHash = str;
        this.vout = num;
        this.coinAmount = str2;
        this.assetUnknown = list;
        this.protocolAssetList = list2;
        this.imageUrl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseAssetItem>, java.lang.String):void (m)] (LINE:31) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ UtxoConfirmationResponseItem(String str, Integer num, String str2, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str3);
    }

    public final C10344bmg OLrzqt(boolean z) {
        String str;
        String str2;
        List listAhwBna;
        List<UtxoConfirmationResponseAssetItem> listSubList;
        UtxoConfirmationResponseAssetItem utxoConfirmationResponseAssetItem;
        UtxoConfirmationResponseAssetItem utxoConfirmationResponseAssetItem2;
        String strValueOf;
        String strOLrzqt;
        List<UtxoConfirmationResponseAssetItem> list = this.protocolAssetList;
        if (list == null || (utxoConfirmationResponseAssetItem2 = (UtxoConfirmationResponseAssetItem) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            str = "";
            str2 = str;
        } else {
            if (C33129mqd.OLrzqt((CharSequence) utxoConfirmationResponseAssetItem2.AYXKKw())) {
                strOLrzqt = utxoConfirmationResponseAssetItem2.OLrzqt();
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                strValueOf = utxoConfirmationResponseAssetItem2.AYXKKw();
                if (strValueOf == null) {
                    strValueOf = "";
                }
            } else {
                if (C33129mqd.OLrzqt((CharSequence) utxoConfirmationResponseAssetItem2.AEQbTJ()) && C33129mqd.OLrzqt((CharSequence) utxoConfirmationResponseAssetItem2.EZpvd())) {
                    strValueOf = utxoConfirmationResponseAssetItem2.AEQbTJ() + " " + utxoConfirmationResponseAssetItem2.EZpvd();
                } else {
                    strValueOf = String.valueOf(utxoConfirmationResponseAssetItem2.copydefault());
                }
                strOLrzqt = "";
            }
            str2 = strValueOf;
            str = strOLrzqt;
        }
        String str3 = this.imageUrl;
        String str4 = str3 == null ? "" : str3;
        List<UtxoConfirmationResponseAssetItem> list2 = this.protocolAssetList;
        String strDjBIcL = (list2 == null || (utxoConfirmationResponseAssetItem = (UtxoConfirmationResponseAssetItem) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null) ? null : utxoConfirmationResponseAssetItem.djBIcL();
        String str5 = strDjBIcL == null ? "" : strDjBIcL;
        List<String> list3 = this.assetUnknown;
        String strJoinToString$default = list3 != null ? CollectionsKt___CollectionsKt.joinToString$default(list3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.zDUObI), null, null, 0, null, null, 62, null) : null;
        String str6 = strJoinToString$default == null ? "" : strJoinToString$default;
        List<UtxoConfirmationResponseAssetItem> list4 = this.protocolAssetList;
        if (list4 == null || (listSubList = list4.subList(1, list4.size())) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(((UtxoConfirmationResponseAssetItem) it.next()).valueOf());
            }
            listAhwBna = arrayList;
        }
        return new C10344bmg(str4, str, str2, str5, str6, listAhwBna, z, false, 128, null);
    }

    public final C10344bmg KWHzl(InterfaceC9731bbC interfaceC9731bbC, @NotNull String str) {
        List listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        String strDbNXlk = interfaceC9731bbC != null ? interfaceC9731bbC.DbNXlk() : null;
        String str2 = strDbNXlk == null ? "" : strDbNXlk;
        double d = 10.0f;
        String strDivS$default = C33129mqd.divS$default(this.coinAmount, Float.valueOf((float) Math.pow(d, interfaceC9731bbC != null ? interfaceC9731bbC.valueOf() : 0)), null, null, null, 14, null);
        String strFJNWhG = interfaceC9731bbC != null ? interfaceC9731bbC.fJNWhG() : null;
        String str3 = strFJNWhG == null ? "" : strFJNWhG;
        String strDivS$default2 = C33129mqd.divS$default(C33129mqd.mulS$default(str, this.coinAmount, null, null, null, 14, null), Float.valueOf((float) Math.pow(d, interfaceC9731bbC != null ? interfaceC9731bbC.valueOf() : 0)), null, null, null, 14, null);
        List<String> list = this.assetUnknown;
        String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, C33070mpX.AYXKKw(C13754dXa.FragmentManager.zDUObI), null, null, 0, null, null, 62, null) : null;
        String str4 = strJoinToString$default == null ? "" : strJoinToString$default;
        List<UtxoConfirmationResponseAssetItem> list2 = this.protocolAssetList;
        if (list2 == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UtxoConfirmationResponseAssetItem) it.next()).valueOf());
            }
            listAhwBna = arrayList;
        }
        return new C10344bmg(str2, strDivS$default, str3, strDivS$default2, str4, listAhwBna, false, false, 192, null);
    }
}
