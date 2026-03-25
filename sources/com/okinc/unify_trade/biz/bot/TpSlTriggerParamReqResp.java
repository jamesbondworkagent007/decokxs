package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TpSlTriggerParamReqResp implements Parcelable {
    private final String delaySeconds;
    private final String stopType;
    private final ArrayList<TpSLTriggerItem> triggers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TpSlTriggerParamReqResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(TpSLTriggerItem$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<TpSlTriggerParamReqResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlTriggerParamReqResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TpSLTriggerItem.CREATOR.createFromParcel(parcel));
            }
            return new TpSlTriggerParamReqResp(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TpSlTriggerParamReqResp[] newArray(int i) {
            return new TpSlTriggerParamReqResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TpSlTriggerParamReqResp() {
        this((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TpSlTriggerParamReqResp copy$default(TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tpSlTriggerParamReqResp.stopType;
        }
        if ((i & 2) != 0) {
            str2 = tpSlTriggerParamReqResp.delaySeconds;
        }
        if ((i & 4) != 0) {
            arrayList = tpSlTriggerParamReqResp.triggers;
        }
        return tpSlTriggerParamReqResp.copy(str, str2, arrayList);
    }

    @SerialName("delaySeconds")
    public static /* synthetic */ void getDelaySeconds$annotations() {
    }

    @SerialName("stopType")
    public static /* synthetic */ void getStopType$annotations() {
    }

    @SerialName("triggers")
    public static /* synthetic */ void getTriggers$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TpSLTriggerItem> component3() {
        return this.triggers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp copy(String str, String str2, @NotNull ArrayList<TpSLTriggerItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new TpSlTriggerParamReqResp(str, str2, arrayList);
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
        if (!(obj instanceof TpSlTriggerParamReqResp)) {
            return false;
        }
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = (TpSlTriggerParamReqResp) obj;
        return Intrinsics.EZpvd((Object) this.stopType, (Object) tpSlTriggerParamReqResp.stopType) && Intrinsics.EZpvd((Object) this.delaySeconds, (Object) tpSlTriggerParamReqResp.delaySeconds) && Intrinsics.EZpvd(this.triggers, tpSlTriggerParamReqResp.triggers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelaySeconds() {
        return this.delaySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TpSLTriggerItem> getTriggers() {
        return this.triggers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.stopType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.delaySeconds;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.triggers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TpSlTriggerParamReqResp(stopType=" + this.stopType + ", delaySeconds=" + this.delaySeconds + ", triggers=" + this.triggers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stopType);
        parcel.writeString(this.delaySeconds);
        ArrayList<TpSLTriggerItem> arrayList = this.triggers;
        parcel.writeInt(arrayList.size());
        Iterator<TpSLTriggerItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TpSlTriggerParamReqResp> serializer() {
            return TpSlTriggerParamReqResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TpSlTriggerParamReqResp(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stopType = null;
        } else {
            this.stopType = str;
        }
        if ((i & 2) == 0) {
            this.delaySeconds = null;
        } else {
            this.delaySeconds = str2;
        }
        if ((i & 4) == 0) {
            this.triggers = new ArrayList<>();
        } else {
            this.triggers = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TpSlTriggerParamReqResp tpSlTriggerParamReqResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tpSlTriggerParamReqResp.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tpSlTriggerParamReqResp.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tpSlTriggerParamReqResp.delaySeconds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tpSlTriggerParamReqResp.delaySeconds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(tpSlTriggerParamReqResp.triggers, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], tpSlTriggerParamReqResp.triggers);
    }

    public TpSlTriggerParamReqResp(String str, String str2, @NotNull ArrayList<TpSLTriggerItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.stopType = str;
        this.delaySeconds = str2;
        this.triggers = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:90) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.bot.TpSLTriggerItem>):void (m)] (LINE:84) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ TpSlTriggerParamReqResp(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
