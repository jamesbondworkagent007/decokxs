package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformTextFullTranslationData extends OkPlatformUIStructureTextData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Map<String, String> content;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformTextFullTranslationData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformTextFullTranslationData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformTextFullTranslationData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new OkPlatformTextFullTranslationData(linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformTextFullTranslationData[] newArray(int i) {
            return new OkPlatformTextFullTranslationData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkPlatformTextFullTranslationData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextFullTranslationData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OkPlatformTextFullTranslationData copy$default(OkPlatformTextFullTranslationData okPlatformTextFullTranslationData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = okPlatformTextFullTranslationData.content;
        }
        return okPlatformTextFullTranslationData.copy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformTextFullTranslationData copy(Map<String, String> map) {
        return new OkPlatformTextFullTranslationData(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OkPlatformTextFullTranslationData) && Intrinsics.EZpvd(this.content, ((OkPlatformTextFullTranslationData) obj).content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Map<String, String> map = this.content;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkPlatformTextFullTranslationData(content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Map<String, String> map = this.content;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextFullTranslationData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformTextFullTranslationData> serializer() {
            return OkPlatformTextFullTranslationData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ OkPlatformTextFullTranslationData(int i, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, serializationConstructorMarker);
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformTextFullTranslationData okPlatformTextFullTranslationData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OkPlatformUIStructureTextData.write$Self(okPlatformTextFullTranslationData, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && okPlatformTextFullTranslationData.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], okPlatformTextFullTranslationData.content);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:11) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformTextFullTranslationData.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ OkPlatformTextFullTranslationData(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    public OkPlatformTextFullTranslationData(Map<String, String> map) {
        this.content = map;
    }
}
