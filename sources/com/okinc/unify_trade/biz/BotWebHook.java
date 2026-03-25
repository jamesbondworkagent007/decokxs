package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotWebHook implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String KEY_ACTION = "action";
    private static final String KEY_BOTID = "botId";
    private static final String KEY_CLOSE_POSITION = "closePosition";
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final String KEY_TOKER = "authToken";
    private static final String START_ACTION = "start";
    private static final String STOP_ACTION = "stop";
    private final List<HashMap<String, String>> triggerParams;
    private final String webhookUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotWebHook> CREATOR = new Creator();

    public static final class Activity extends TypeToken<Map<String, ? extends Object>> {
    }

    public static final class Creator implements Parcelable.Creator<BotWebHook> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotWebHook createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    int i3 = parcel.readInt();
                    HashMap map = new HashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        map.put(parcel.readString(), parcel.readString());
                    }
                    arrayList2.add(map);
                }
                arrayList = arrayList2;
            }
            return new BotWebHook(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotWebHook[] newArray(int i) {
            return new BotWebHook[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotWebHook() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotWebHook */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotWebHook copy$default(BotWebHook botWebHook, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botWebHook.webhookUrl;
        }
        if ((i & 2) != 0) {
            list = botWebHook.triggerParams;
        }
        return botWebHook.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.webhookUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HashMap<String, String>> component2() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotWebHook copy(String str, List<? extends HashMap<String, String>> list) {
        return new BotWebHook(str, list);
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
        if (!(obj instanceof BotWebHook)) {
            return false;
        }
        BotWebHook botWebHook = (BotWebHook) obj;
        return Intrinsics.EZpvd((Object) this.webhookUrl, (Object) botWebHook.webhookUrl) && Intrinsics.EZpvd(this.triggerParams, botWebHook.triggerParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HashMap<String, String>> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebhookUrl() {
        return this.webhookUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.webhookUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<HashMap<String, String>> list = this.triggerParams;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotWebHook(webhookUrl=" + this.webhookUrl + ", triggerParams=" + this.triggerParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.webhookUrl);
        List<HashMap<String, String>> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (HashMap<String, String> map : list) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public /* synthetic */ BotWebHook(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.webhookUrl = null;
        } else {
            this.webhookUrl = str;
        }
        if ((i & 2) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotWebHook botWebHook, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botWebHook.webhookUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botWebHook.webhookUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && botWebHook.triggerParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], botWebHook.triggerParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public BotWebHook(String str, List<? extends HashMap<String, String>> list) {
        this.webhookUrl = str;
        this.triggerParams = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<? extends java.util.HashMap<java.lang.String, java.lang.String>>):void (m)] (LINE:3407) call: com.okinc.unify_trade.biz.BotWebHook.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BotWebHook(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotWebHook.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BotWebHook> serializer() {
            return BotWebHook$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(new HashMapSerializer(stringSerializer, stringSerializer))};
    }

    public final String getStartCondition() {
        return getCondition("start");
    }

    public final String getStopCondition() {
        return getCondition(STOP_ACTION);
    }

    private final String getCondition(String str) {
        List<HashMap<String, String>> list = this.triggerParams;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HashMap map = (HashMap) it.next();
            if (Intrinsics.EZpvd(map.get(KEY_ACTION), (Object) str)) {
                if (map.isEmpty()) {
                    return null;
                }
                String str2 = map.get(KEY_ACTION) != null ? ((Object) "{") + "\"action\":\"" + map.get(KEY_ACTION) + "\"," : "{";
                if (map.get(KEY_BOTID) != null) {
                    str2 = ((Object) str2) + "\"botId\":\"" + map.get(KEY_BOTID) + "\",";
                }
                if (map.get(KEY_CLOSE_POSITION) != null) {
                    str2 = ((Object) str2) + "\"closePosition\":\"" + map.get(KEY_CLOSE_POSITION) + "\",";
                }
                if (map.get(KEY_TIMESTAMP) != null) {
                    str2 = ((Object) str2) + "\"timestamp\":\"" + map.get(KEY_TIMESTAMP) + "\",";
                }
                if (map.get(KEY_TOKER) != null) {
                    str2 = ((Object) str2) + "\"authToken\":\"" + map.get(KEY_TOKER) + "\",";
                }
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.EZpvd(entry.getKey(), (Object) KEY_ACTION) && !Intrinsics.EZpvd(entry.getKey(), (Object) KEY_BOTID) && !Intrinsics.EZpvd(entry.getKey(), (Object) KEY_CLOSE_POSITION) && !Intrinsics.EZpvd(entry.getKey(), (Object) KEY_TIMESTAMP) && !Intrinsics.EZpvd(entry.getKey(), (Object) KEY_TOKER)) {
                        str2 = ((Object) str2) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + entry.getKey() + "\":\"" + entry.getValue() + "\",";
                    }
                }
                String strSubstring = str2.substring(0, str2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                try {
                    return new GsonBuilder().setPrettyPrinting().create().toJson((Map) new Gson().fromJson(((Object) strSubstring) + "}", new Activity().getType()));
                } catch (Exception e) {
                    pUU.KWHzl("JSON PARSE", "BotWebHook-jsonConvert" + e.getMessage());
                    return null;
                }
            }
        }
        return null;
    }
}
