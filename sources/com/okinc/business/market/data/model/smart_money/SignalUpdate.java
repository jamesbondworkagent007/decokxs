package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.common.TokenInfo$$serializer;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalUpdate {
    public final Content content;
    public final Type type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.smart_money.SignalUpdate.Type", Type.values(), new String[]{"signalActivity", "signalOverview"}, new Annotation[][]{null, null}, null), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalUpdate copy$default(SignalUpdate signalUpdate, Type type, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            type = signalUpdate.type;
        }
        if ((i & 2) != 0) {
            content = signalUpdate.content;
        }
        return signalUpdate.OLrzqt(type, content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Content OLrzqt() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalUpdate OLrzqt(@NotNull Type type, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(content, "");
        return new SignalUpdate(type, content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Type copydefault() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalUpdate)) {
            return false;
        }
        SignalUpdate signalUpdate = (SignalUpdate) obj;
        return this.type == signalUpdate.type && Intrinsics.EZpvd(this.content, signalUpdate.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalUpdate(type=" + this.type + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalUpdate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalUpdate> serializer() {
            return SignalUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalUpdate(int i, Type type, Content content, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SignalUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.type = type;
        this.content = content;
    }

    public static final /* synthetic */ void AEQbTJ(SignalUpdate signalUpdate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], signalUpdate.type);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SignalUpdate$Content$$serializer.INSTANCE, signalUpdate.content);
    }

    public SignalUpdate(@NotNull Type type, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(content, "");
        this.type = type;
        this.content = content;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @SerialName("signalActivity")
        public static final Type ACTIVITY = new Type("ACTIVITY", 0);

        @SerialName("signalOverview")
        public static final Type OVERVIEW = new Type("OVERVIEW", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ACTIVITY, OVERVIEW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Serializable
    public static final class Content {
        public final List<SignalData> activityList;
        public final List<SignalOverview> overviewList;
        public final Map<String, TokenInfo> tokenInfoMap;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SignalData$$serializer.INSTANCE), new ArrayListSerializer(SignalOverview$$serializer.INSTANCE), new LinkedHashMapSerializer(StringSerializer.INSTANCE, TokenInfo$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Content() {
            this((List) null, (List) null, (Map) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.smart_money.SignalUpdate$Content */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, List list2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.activityList;
            }
            if ((i & 2) != 0) {
                list2 = content.overviewList;
            }
            if ((i & 4) != 0) {
                map = content.tokenInfoMap;
            }
            return content.KWHzl(list, list2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, TokenInfo> EZpvd() {
            return this.tokenInfoMap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Content KWHzl(@NotNull List<SignalData> list, @NotNull List<SignalOverview> list2, @NotNull Map<String, TokenInfo> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new Content(list, list2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SignalOverview> OLrzqt() {
            return this.overviewList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SignalData> copydefault() {
            return this.activityList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.EZpvd(this.activityList, content.activityList) && Intrinsics.EZpvd(this.overviewList, content.overviewList) && Intrinsics.EZpvd(this.tokenInfoMap, content.tokenInfoMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.activityList.hashCode() * 31) + this.overviewList.hashCode()) * 31) + this.tokenInfoMap.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Content(activityList=" + this.activityList + ", overviewList=" + this.overviewList + ", tokenInfoMap=" + this.tokenInfoMap + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalUpdate.Content.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Content> serializer() {
                return SignalUpdate$Content$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Content(int i, List list, List list2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            this.activityList = (i & 1) == 0 ? yDY.AhwBna() : list;
            if ((i & 2) == 0) {
                this.overviewList = yDY.AhwBna();
            } else {
                this.overviewList = list2;
            }
            if ((i & 4) == 0) {
                this.tokenInfoMap = C56424yEw.KWHzl();
            } else {
                this.tokenInfoMap = map;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [95=4] */
        public static final /* synthetic */ void AEQbTJ(Content content, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(content.activityList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], content.activityList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(content.overviewList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], content.overviewList);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(content.tokenInfoMap, C56424yEw.KWHzl())) {
                return;
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], content.tokenInfoMap);
        }

        public Content(@NotNull List<SignalData> list, @NotNull List<SignalOverview> list2, @NotNull Map<String, TokenInfo> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.activityList = list;
            this.overviewList = list2;
            this.tokenInfoMap = map;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:98)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:100)) : (r2v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0014: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:102)) : (r3v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.market.data.model.smart_money.SignalData>, java.util.List<com.okinc.business.market.data.model.smart_money.SignalOverview>, java.util.Map<java.lang.String, com.okinc.business.market.data.model.common.TokenInfo>):void (m)] (LINE:96) call: com.okinc.business.market.data.model.smart_money.SignalUpdate.Content.<init>(java.util.List, java.util.List, java.util.Map):void type: THIS */
        public /* synthetic */ Content(List list, List list2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? C56424yEw.KWHzl() : map);
        }
    }
}
