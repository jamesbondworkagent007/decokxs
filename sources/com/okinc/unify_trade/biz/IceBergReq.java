package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class IceBergReq implements Parcelable {
    private String aggressiveness;
    private Boolean isTradeBorrowMode;
    private String leftLevel;
    private String lmtOrderNumber;
    private String pxLimit;
    private String pxSpread;
    private String pxVar;
    private String rightLevel;
    private String sz;
    private String szLimit;
    private String tradeQuoteCcy;
    private ArrayList<AdvancedTriggerSign> triggerParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<IceBergReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(AdvancedTriggerSign$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<IceBergReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IceBergReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AdvancedTriggerSign.CREATOR.createFromParcel(parcel));
                }
            }
            return new IceBergReq(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IceBergReq[] newArray(int i) {
            return new IceBergReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IceBergReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.leftLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.rightLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> component8() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IceBergReq copy(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new IceBergReq(str, str2, str3, str4, str5, str6, str7, arrayList, bool, str8, str9, str10);
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
        if (!(obj instanceof IceBergReq)) {
            return false;
        }
        IceBergReq iceBergReq = (IceBergReq) obj;
        return Intrinsics.EZpvd((Object) this.pxLimit, (Object) iceBergReq.pxLimit) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) iceBergReq.pxSpread) && Intrinsics.EZpvd((Object) this.pxVar, (Object) iceBergReq.pxVar) && Intrinsics.EZpvd((Object) this.szLimit, (Object) iceBergReq.szLimit) && Intrinsics.EZpvd((Object) this.sz, (Object) iceBergReq.sz) && Intrinsics.EZpvd((Object) this.lmtOrderNumber, (Object) iceBergReq.lmtOrderNumber) && Intrinsics.EZpvd((Object) this.aggressiveness, (Object) iceBergReq.aggressiveness) && Intrinsics.EZpvd(this.triggerParams, iceBergReq.triggerParams) && Intrinsics.EZpvd(this.isTradeBorrowMode, iceBergReq.isTradeBorrowMode) && Intrinsics.EZpvd((Object) this.leftLevel, (Object) iceBergReq.leftLevel) && Intrinsics.EZpvd((Object) this.rightLevel, (Object) iceBergReq.rightLevel) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) iceBergReq.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAggressiveness() {
        return this.aggressiveness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeftLevel() {
        return this.leftLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLmtOrderNumber() {
        return this.lmtOrderNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRightLevel() {
        return this.rightLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AdvancedTriggerSign> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pxLimit.hashCode();
        String str = this.pxSpread;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.pxVar;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.szLimit.hashCode();
        int iHashCode5 = this.sz.hashCode();
        String str3 = this.lmtOrderNumber;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.aggressiveness;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        ArrayList<AdvancedTriggerSign> arrayList = this.triggerParams;
        int iHashCode8 = arrayList == null ? 0 : arrayList.hashCode();
        Boolean bool = this.isTradeBorrowMode;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str5 = this.leftLevel;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.rightLevel;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tradeQuoteCcy;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTradeBorrowMode() {
        return this.isTradeBorrowMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggressiveness(String str) {
        this.aggressiveness = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftLevel(String str) {
        this.leftLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLmtOrderNumber(String str) {
        this.lmtOrderNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pxLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxSpread(String str) {
        this.pxSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxVar(String str) {
        this.pxVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightLevel(String str) {
        this.rightLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSzLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.szLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeBorrowMode(Boolean bool) {
        this.isTradeBorrowMode = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(ArrayList<AdvancedTriggerSign> arrayList) {
        this.triggerParams = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IceBergReq(pxLimit=" + this.pxLimit + ", pxSpread=" + this.pxSpread + ", pxVar=" + this.pxVar + ", szLimit=" + this.szLimit + ", sz=" + this.sz + ", lmtOrderNumber=" + this.lmtOrderNumber + ", aggressiveness=" + this.aggressiveness + ", triggerParams=" + this.triggerParams + ", isTradeBorrowMode=" + this.isTradeBorrowMode + ", leftLevel=" + this.leftLevel + ", rightLevel=" + this.rightLevel + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.sz);
        parcel.writeString(this.lmtOrderNumber);
        parcel.writeString(this.aggressiveness);
        ArrayList<AdvancedTriggerSign> arrayList = this.triggerParams;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AdvancedTriggerSign> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isTradeBorrowMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.leftLevel);
        parcel.writeString(this.rightLevel);
        parcel.writeString(this.tradeQuoteCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.IceBergReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IceBergReq> serializer() {
            return IceBergReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IceBergReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, Boolean bool, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str;
        }
        if ((i & 2) == 0) {
            this.pxSpread = null;
        } else {
            this.pxSpread = str2;
        }
        if ((i & 4) == 0) {
            this.pxVar = null;
        } else {
            this.pxVar = str3;
        }
        if ((i & 8) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str4;
        }
        if ((i & 16) == 0) {
            this.sz = "";
        } else {
            this.sz = str5;
        }
        if ((i & 32) == 0) {
            this.lmtOrderNumber = null;
        } else {
            this.lmtOrderNumber = str6;
        }
        if ((i & 64) == 0) {
            this.aggressiveness = null;
        } else {
            this.aggressiveness = str7;
        }
        if ((i & 128) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = arrayList;
        }
        if ((i & 256) == 0) {
            this.isTradeBorrowMode = null;
        } else {
            this.isTradeBorrowMode = bool;
        }
        if ((i & 512) == 0) {
            this.leftLevel = null;
        } else {
            this.leftLevel = str8;
        }
        if ((i & 1024) == 0) {
            this.rightLevel = null;
        } else {
            this.rightLevel = str9;
        }
        if ((i & 2048) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(IceBergReq iceBergReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) iceBergReq.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, iceBergReq.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || iceBergReq.pxSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iceBergReq.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || iceBergReq.pxVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, iceBergReq.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) iceBergReq.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, iceBergReq.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) iceBergReq.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, iceBergReq.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || iceBergReq.lmtOrderNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, iceBergReq.lmtOrderNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || iceBergReq.aggressiveness != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, iceBergReq.aggressiveness);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || iceBergReq.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], iceBergReq.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || iceBergReq.isTradeBorrowMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, iceBergReq.isTradeBorrowMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || iceBergReq.leftLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, iceBergReq.leftLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || iceBergReq.rightLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, iceBergReq.rightLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && iceBergReq.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, iceBergReq.tradeQuoteCcy);
    }

    public IceBergReq(@NotNull String str, String str2, String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, ArrayList<AdvancedTriggerSign> arrayList, Boolean bool, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.pxLimit = str;
        this.pxSpread = str2;
        this.pxVar = str3;
        this.szLimit = str4;
        this.sz = str5;
        this.lmtOrderNumber = str6;
        this.aggressiveness = str7;
        this.triggerParams = arrayList;
        this.isTradeBorrowMode = bool;
        this.leftLevel = str8;
        this.rightLevel = str9;
        this.tradeQuoteCcy = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r21v0 java.util.ArrayList))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.AdvancedTriggerSign>, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:486) call: com.okinc.unify_trade.biz.IceBergReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IceBergReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, Boolean bool, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : arrayList, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) == 0 ? str10 : null);
    }
}
