package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PosAttachAlgoData implements Parcelable {
    private String attachAlgoOrdNum;
    private ArrayList<AttachAlgoOrderData> attachAlgoOrds;
    private String attachMoveAlgoOrdNum;
    private ArrayList<AttachMoveAlgoOrderData> attachMoveAlgoOrds;
    private ArrayList<CloseOrderAlgoData> closeOrderAlgo;
    private String closeOrderAlgoNum;
    private String posId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PosAttachAlgoData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(AttachAlgoOrderData$$serializer.INSTANCE), new ArrayListSerializer(AttachMoveAlgoOrderData$$serializer.INSTANCE), new ArrayListSerializer(CloseOrderAlgoData$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PosAttachAlgoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PosAttachAlgoData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AttachAlgoOrderData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AttachMoveAlgoOrderData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(CloseOrderAlgoData.CREATOR.createFromParcel(parcel));
                }
            }
            return new PosAttachAlgoData(string, string2, string3, string4, arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PosAttachAlgoData[] newArray(int i) {
            return new PosAttachAlgoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PosAttachAlgoData() {
        this((String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, 127, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachAlgoOrdNum() {
        return this.attachAlgoOrdNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AttachAlgoOrderData> getAttachAlgoOrds() {
        return this.attachAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachMoveAlgoOrdNum() {
        return this.attachMoveAlgoOrdNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AttachMoveAlgoOrderData> getAttachMoveAlgoOrds() {
        return this.attachMoveAlgoOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CloseOrderAlgoData> getCloseOrderAlgo() {
        return this.closeOrderAlgo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseOrderAlgoNum() {
        return this.closeOrderAlgoNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrdNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.attachAlgoOrdNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoOrds(ArrayList<AttachAlgoOrderData> arrayList) {
        this.attachAlgoOrds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachMoveAlgoOrdNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.attachMoveAlgoOrdNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachMoveAlgoOrds(ArrayList<AttachMoveAlgoOrderData> arrayList) {
        this.attachMoveAlgoOrds = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseOrderAlgo(ArrayList<CloseOrderAlgoData> arrayList) {
        this.closeOrderAlgo = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseOrderAlgoNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.closeOrderAlgoNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.posId);
        parcel.writeString(this.attachAlgoOrdNum);
        parcel.writeString(this.attachMoveAlgoOrdNum);
        parcel.writeString(this.closeOrderAlgoNum);
        ArrayList<AttachAlgoOrderData> arrayList = this.attachAlgoOrds;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AttachAlgoOrderData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<AttachMoveAlgoOrderData> arrayList2 = this.attachMoveAlgoOrds;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<AttachMoveAlgoOrderData> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<CloseOrderAlgoData> arrayList3 = this.closeOrderAlgo;
        if (arrayList3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList3.size());
        Iterator<CloseOrderAlgoData> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.PosAttachAlgoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PosAttachAlgoData> serializer() {
            return PosAttachAlgoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PosAttachAlgoData(int i, String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.posId = "";
        } else {
            this.posId = str;
        }
        if ((i & 2) == 0) {
            this.attachAlgoOrdNum = "";
        } else {
            this.attachAlgoOrdNum = str2;
        }
        if ((i & 4) == 0) {
            this.attachMoveAlgoOrdNum = "";
        } else {
            this.attachMoveAlgoOrdNum = str3;
        }
        if ((i & 8) == 0) {
            this.closeOrderAlgoNum = "";
        } else {
            this.closeOrderAlgoNum = str4;
        }
        if ((i & 16) == 0) {
            this.attachAlgoOrds = null;
        } else {
            this.attachAlgoOrds = arrayList;
        }
        if ((i & 32) == 0) {
            this.attachMoveAlgoOrds = null;
        } else {
            this.attachMoveAlgoOrds = arrayList2;
        }
        if ((i & 64) == 0) {
            this.closeOrderAlgo = null;
        } else {
            this.closeOrderAlgo = arrayList3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PosAttachAlgoData posAttachAlgoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) posAttachAlgoData.posId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, posAttachAlgoData.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) posAttachAlgoData.attachAlgoOrdNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, posAttachAlgoData.attachAlgoOrdNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) posAttachAlgoData.attachMoveAlgoOrdNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, posAttachAlgoData.attachMoveAlgoOrdNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) posAttachAlgoData.closeOrderAlgoNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, posAttachAlgoData.closeOrderAlgoNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || posAttachAlgoData.attachAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], posAttachAlgoData.attachAlgoOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || posAttachAlgoData.attachMoveAlgoOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], posAttachAlgoData.attachMoveAlgoOrds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && posAttachAlgoData.closeOrderAlgo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], posAttachAlgoData.closeOrderAlgo);
    }

    public PosAttachAlgoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, ArrayList<AttachAlgoOrderData> arrayList, ArrayList<AttachMoveAlgoOrderData> arrayList2, ArrayList<CloseOrderAlgoData> arrayList3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.posId = str;
        this.attachAlgoOrdNum = str2;
        this.attachMoveAlgoOrdNum = str3;
        this.closeOrderAlgoNum = str4;
        this.attachAlgoOrds = arrayList;
        this.attachMoveAlgoOrds = arrayList2;
        this.closeOrderAlgo = arrayList3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r10v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r11v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r12v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.AttachAlgoOrderData>, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.AttachMoveAlgoOrderData>, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.CloseOrderAlgoData>):void (m)] (LINE:13) call: com.okinc.unify_trade.biz.subscribe.PosAttachAlgoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ PosAttachAlgoData(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : arrayList2, (i & 64) != 0 ? null : arrayList3);
    }
}
