package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeStrategyInfoBean implements Parcelable {
    private String bizType;
    private TradeStrategyInfoLanguageBean contents;
    private String endTimestamp;
    private String eventType;
    private String frequency;
    private ArrayList<String> instIDList;
    private String isNeedLogin;
    private String isSupportNoPrompt;
    private String sid;
    private String startTimestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeStrategyInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<TradeStrategyInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeStrategyInfoBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TradeStrategyInfoLanguageBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeStrategyInfoBean[] newArray(int i) {
            return new TradeStrategyInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeStrategyInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (TradeStrategyInfoLanguageBean) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyInfoLanguageBean component10() {
        return this.contents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isNeedLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isSupportNoPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component7() {
        return this.instIDList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyInfoBean copy(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, String str7, String str8, TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean) {
        return new TradeStrategyInfoBean(str, str2, str3, str4, str5, str6, arrayList, str7, str8, tradeStrategyInfoLanguageBean);
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
        if (!(obj instanceof TradeStrategyInfoBean)) {
            return false;
        }
        TradeStrategyInfoBean tradeStrategyInfoBean = (TradeStrategyInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.sid, (Object) tradeStrategyInfoBean.sid) && Intrinsics.EZpvd((Object) this.eventType, (Object) tradeStrategyInfoBean.eventType) && Intrinsics.EZpvd((Object) this.isNeedLogin, (Object) tradeStrategyInfoBean.isNeedLogin) && Intrinsics.EZpvd((Object) this.frequency, (Object) tradeStrategyInfoBean.frequency) && Intrinsics.EZpvd((Object) this.isSupportNoPrompt, (Object) tradeStrategyInfoBean.isSupportNoPrompt) && Intrinsics.EZpvd((Object) this.bizType, (Object) tradeStrategyInfoBean.bizType) && Intrinsics.EZpvd(this.instIDList, tradeStrategyInfoBean.instIDList) && Intrinsics.EZpvd((Object) this.startTimestamp, (Object) tradeStrategyInfoBean.startTimestamp) && Intrinsics.EZpvd((Object) this.endTimestamp, (Object) tradeStrategyInfoBean.endTimestamp) && Intrinsics.EZpvd(this.contents, tradeStrategyInfoBean.contents);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyInfoLanguageBean getContents() {
        return this.contents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstIDList() {
        return this.instIDList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSid() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sid;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.eventType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.isNeedLogin;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.frequency;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.isSupportNoPrompt;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.bizType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        ArrayList<String> arrayList = this.instIDList;
        int iHashCode7 = arrayList == null ? 0 : arrayList.hashCode();
        String str7 = this.startTimestamp;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.endTimestamp;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean = this.contents;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (tradeStrategyInfoLanguageBean != null ? tradeStrategyInfoLanguageBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNeedLogin() {
        return this.isNeedLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportNoPrompt() {
        return this.isSupportNoPrompt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(String str) {
        this.bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContents(TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean) {
        this.contents = tradeStrategyInfoLanguageBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTimestamp(String str) {
        this.endTimestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventType(String str) {
        this.eventType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrequency(String str) {
        this.frequency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIDList(ArrayList<String> arrayList) {
        this.instIDList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedLogin(String str) {
        this.isNeedLogin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSid(String str) {
        this.sid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTimestamp(String str) {
        this.startTimestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportNoPrompt(String str) {
        this.isSupportNoPrompt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeStrategyInfoBean(sid=" + this.sid + ", eventType=" + this.eventType + ", isNeedLogin=" + this.isNeedLogin + ", frequency=" + this.frequency + ", isSupportNoPrompt=" + this.isSupportNoPrompt + ", bizType=" + this.bizType + ", instIDList=" + this.instIDList + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", contents=" + this.contents + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sid);
        parcel.writeString(this.eventType);
        parcel.writeString(this.isNeedLogin);
        parcel.writeString(this.frequency);
        parcel.writeString(this.isSupportNoPrompt);
        parcel.writeString(this.bizType);
        parcel.writeStringList(this.instIDList);
        parcel.writeString(this.startTimestamp);
        parcel.writeString(this.endTimestamp);
        TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean = this.contents;
        if (tradeStrategyInfoLanguageBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tradeStrategyInfoLanguageBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeStrategyInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeStrategyInfoBean> serializer() {
            return TradeStrategyInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeStrategyInfoBean(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, String str8, TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sid = null;
        } else {
            this.sid = str;
        }
        if ((i & 2) == 0) {
            this.eventType = null;
        } else {
            this.eventType = str2;
        }
        if ((i & 4) == 0) {
            this.isNeedLogin = null;
        } else {
            this.isNeedLogin = str3;
        }
        if ((i & 8) == 0) {
            this.frequency = null;
        } else {
            this.frequency = str4;
        }
        if ((i & 16) == 0) {
            this.isSupportNoPrompt = null;
        } else {
            this.isSupportNoPrompt = str5;
        }
        if ((i & 32) == 0) {
            this.bizType = null;
        } else {
            this.bizType = str6;
        }
        if ((i & 64) == 0) {
            this.instIDList = null;
        } else {
            this.instIDList = arrayList;
        }
        if ((i & 128) == 0) {
            this.startTimestamp = null;
        } else {
            this.startTimestamp = str7;
        }
        if ((i & 256) == 0) {
            this.endTimestamp = null;
        } else {
            this.endTimestamp = str8;
        }
        if ((i & 512) == 0) {
            this.contents = null;
        } else {
            this.contents = tradeStrategyInfoLanguageBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeStrategyInfoBean tradeStrategyInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeStrategyInfoBean.sid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeStrategyInfoBean.sid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeStrategyInfoBean.eventType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeStrategyInfoBean.eventType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeStrategyInfoBean.isNeedLogin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeStrategyInfoBean.isNeedLogin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeStrategyInfoBean.frequency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeStrategyInfoBean.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeStrategyInfoBean.isSupportNoPrompt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeStrategyInfoBean.isSupportNoPrompt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeStrategyInfoBean.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeStrategyInfoBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeStrategyInfoBean.instIDList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], tradeStrategyInfoBean.instIDList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeStrategyInfoBean.startTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeStrategyInfoBean.startTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeStrategyInfoBean.endTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeStrategyInfoBean.endTimestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && tradeStrategyInfoBean.contents == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, TradeStrategyInfoLanguageBean$$serializer.INSTANCE, tradeStrategyInfoBean.contents);
    }

    public TradeStrategyInfoBean(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, String str7, String str8, TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean) {
        this.sid = str;
        this.eventType = str2;
        this.isNeedLogin = str3;
        this.frequency = str4;
        this.isSupportNoPrompt = str5;
        this.bizType = str6;
        this.instIDList = arrayList;
        this.startTimestamp = str7;
        this.endTimestamp = str8;
        this.contents = tradeStrategyInfoLanguageBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r18v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean) : (null com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean):void (m)] (LINE:1116) call: com.okinc.unify_trade.biz.TradeStrategyInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TradeStrategyInfoLanguageBean):void type: THIS */
    public /* synthetic */ TradeStrategyInfoBean(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, String str8, TradeStrategyInfoLanguageBean tradeStrategyInfoLanguageBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : arrayList, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? tradeStrategyInfoLanguageBean : null);
    }
}
