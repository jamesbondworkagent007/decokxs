package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignalBotSignParamsResult implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<Map<String, String>> actionMaps;
    private final List<Map<String, String>> tvActionMap;
    private final String webhookUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalBotSignParamsResult> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalBotSignParamsResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSignParamsResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    arrayList.add(linkedHashMap);
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    int i7 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    arrayList2.add(linkedHashMap2);
                }
            }
            return new SignalBotSignParamsResult(arrayList, arrayList2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotSignParamsResult[] newArray(int i) {
            return new SignalBotSignParamsResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotSignParamsResult() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SignalBotSignParamsResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalBotSignParamsResult copy$default(SignalBotSignParamsResult signalBotSignParamsResult, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalBotSignParamsResult.actionMaps;
        }
        if ((i & 2) != 0) {
            list2 = signalBotSignParamsResult.tvActionMap;
        }
        if ((i & 4) != 0) {
            str = signalBotSignParamsResult.webhookUrl;
        }
        return signalBotSignParamsResult.copy(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> component1() {
        return this.actionMaps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> component2() {
        return this.tvActionMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.webhookUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotSignParamsResult copy(List<? extends Map<String, String>> list, List<? extends Map<String, String>> list2, String str) {
        return new SignalBotSignParamsResult(list, list2, str);
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
        if (!(obj instanceof SignalBotSignParamsResult)) {
            return false;
        }
        SignalBotSignParamsResult signalBotSignParamsResult = (SignalBotSignParamsResult) obj;
        return Intrinsics.EZpvd(this.actionMaps, signalBotSignParamsResult.actionMaps) && Intrinsics.EZpvd(this.tvActionMap, signalBotSignParamsResult.tvActionMap) && Intrinsics.EZpvd((Object) this.webhookUrl, (Object) signalBotSignParamsResult.webhookUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> getActionMaps() {
        return this.actionMaps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Map<String, String>> getTvActionMap() {
        return this.tvActionMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebhookUrl() {
        return this.webhookUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Map<String, String>> list = this.actionMaps;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<Map<String, String>> list2 = this.tvActionMap;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.webhookUrl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotSignParamsResult(actionMaps=" + this.actionMaps + ", tvActionMap=" + this.tvActionMap + ", webhookUrl=" + this.webhookUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Map<String, String>> list = this.actionMaps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Map<String, String> map : list) {
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
        }
        List<Map<String, String>> list2 = this.tvActionMap;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Map<String, String> map2 : list2) {
                parcel.writeInt(map2.size());
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
        }
        parcel.writeString(this.webhookUrl);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SignalBotSignParamsResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotSignParamsResult> serializer() {
            return SignalBotSignParamsResult$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), new ArrayListSerializer(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), null};
    }

    public /* synthetic */ SignalBotSignParamsResult(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actionMaps = null;
        } else {
            this.actionMaps = list;
        }
        if ((i & 2) == 0) {
            this.tvActionMap = null;
        } else {
            this.tvActionMap = list2;
        }
        if ((i & 4) == 0) {
            this.webhookUrl = null;
        } else {
            this.webhookUrl = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotSignParamsResult signalBotSignParamsResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signalBotSignParamsResult.actionMaps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalBotSignParamsResult.actionMaps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotSignParamsResult.tvActionMap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalBotSignParamsResult.tvActionMap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signalBotSignParamsResult.webhookUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signalBotSignParamsResult.webhookUrl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public SignalBotSignParamsResult(List<? extends Map<String, String>> list, List<? extends Map<String, String>> list2, String str) {
        this.actionMaps = list;
        this.tvActionMap = list2;
        this.webhookUrl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>>, java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>>, java.lang.String):void (m)] (LINE:3847) call: com.okinc.unify_trade.biz.SignalBotSignParamsResult.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SignalBotSignParamsResult(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
