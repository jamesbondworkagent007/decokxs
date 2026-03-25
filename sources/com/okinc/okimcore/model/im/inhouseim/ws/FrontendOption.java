package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FrontendOption {
    public final Boolean enableAppPushNotification;
    public final Boolean includeInUnreadCount;
    public final Boolean includeSender;
    public final Integer visibility;
    public final VisibilityStrategy visibilityStrategy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FrontendOption() {
        this((Boolean) null, (Integer) null, (VisibilityStrategy) null, (Boolean) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FrontendOption copy$default(FrontendOption frontendOption, Boolean bool, Integer num, VisibilityStrategy visibilityStrategy, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = frontendOption.includeSender;
        }
        if ((i & 2) != 0) {
            num = frontendOption.visibility;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            visibilityStrategy = frontendOption.visibilityStrategy;
        }
        VisibilityStrategy visibilityStrategy2 = visibilityStrategy;
        if ((i & 8) != 0) {
            bool2 = frontendOption.includeInUnreadCount;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            bool3 = frontendOption.enableAppPushNotification;
        }
        return frontendOption.EZpvd(bool, num2, visibilityStrategy2, bool4, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean AEQbTJ() {
        return this.includeInUnreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendOption EZpvd(Boolean bool, Integer num, VisibilityStrategy visibilityStrategy, Boolean bool2, Boolean bool3) {
        return new FrontendOption(bool, num, visibilityStrategy, bool2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean EZpvd() {
        return this.enableAppPushNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VisibilityStrategy KWHzl() {
        return this.visibilityStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.visibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean copydefault() {
        return this.includeSender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrontendOption)) {
            return false;
        }
        FrontendOption frontendOption = (FrontendOption) obj;
        return Intrinsics.EZpvd(this.includeSender, frontendOption.includeSender) && Intrinsics.EZpvd(this.visibility, frontendOption.visibility) && Intrinsics.EZpvd(this.visibilityStrategy, frontendOption.visibilityStrategy) && Intrinsics.EZpvd(this.includeInUnreadCount, frontendOption.includeInUnreadCount) && Intrinsics.EZpvd(this.enableAppPushNotification, frontendOption.enableAppPushNotification);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.includeSender;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Integer num = this.visibility;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        VisibilityStrategy visibilityStrategy = this.visibilityStrategy;
        int iHashCode3 = visibilityStrategy == null ? 0 : visibilityStrategy.hashCode();
        Boolean bool2 = this.includeInUnreadCount;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.enableAppPushNotification;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FrontendOption(includeSender=" + this.includeSender + ", visibility=" + this.visibility + ", visibilityStrategy=" + this.visibilityStrategy + ", includeInUnreadCount=" + this.includeInUnreadCount + ", enableAppPushNotification=" + this.enableAppPushNotification + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FrontendOption> serializer() {
            return FrontendOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FrontendOption(int i, Boolean bool, Integer num, VisibilityStrategy visibilityStrategy, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.includeSender = null;
        } else {
            this.includeSender = bool;
        }
        if ((i & 2) == 0) {
            this.visibility = null;
        } else {
            this.visibility = num;
        }
        if ((i & 4) == 0) {
            this.visibilityStrategy = null;
        } else {
            this.visibilityStrategy = visibilityStrategy;
        }
        if ((i & 8) == 0) {
            this.includeInUnreadCount = null;
        } else {
            this.includeInUnreadCount = bool2;
        }
        if ((i & 16) == 0) {
            this.enableAppPushNotification = null;
        } else {
            this.enableAppPushNotification = bool3;
        }
    }

    public static final /* synthetic */ void AEQbTJ(FrontendOption frontendOption, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || frontendOption.includeSender != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, frontendOption.includeSender);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || frontendOption.visibility != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, frontendOption.visibility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || frontendOption.visibilityStrategy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, FrontendOption$VisibilityStrategy$$serializer.INSTANCE, frontendOption.visibilityStrategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || frontendOption.includeInUnreadCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, frontendOption.includeInUnreadCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && frontendOption.enableAppPushNotification == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, frontendOption.enableAppPushNotification);
    }

    public FrontendOption(Boolean bool, Integer num, VisibilityStrategy visibilityStrategy, Boolean bool2, Boolean bool3) {
        this.includeSender = bool;
        this.visibility = num;
        this.visibilityStrategy = visibilityStrategy;
        this.includeInUnreadCount = bool2;
        this.enableAppPushNotification = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy) : (r7v0 com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Integer, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:7) call: com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption.<init>(java.lang.Boolean, java.lang.Integer, com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ FrontendOption(Boolean bool, Integer num, VisibilityStrategy visibilityStrategy, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : visibilityStrategy, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
    }

    @Serializable
    public static final class VisibilityStrategy {
        public final List<String> whiteListUserIds;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VisibilityStrategy() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption$VisibilityStrategy */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VisibilityStrategy copy$default(VisibilityStrategy visibilityStrategy, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = visibilityStrategy.whiteListUserIds;
            }
            return visibilityStrategy.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VisibilityStrategy KWHzl(List<String> list) {
            return new VisibilityStrategy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> copydefault() {
            return this.whiteListUserIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VisibilityStrategy) && Intrinsics.EZpvd(this.whiteListUserIds, ((VisibilityStrategy) obj).whiteListUserIds);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<String> list = this.whiteListUserIds;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VisibilityStrategy(whiteListUserIds=" + this.whiteListUserIds + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption.VisibilityStrategy.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<VisibilityStrategy> serializer() {
                return FrontendOption$VisibilityStrategy$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ VisibilityStrategy(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.whiteListUserIds = null;
            } else {
                this.whiteListUserIds = list;
            }
        }

        public static final /* synthetic */ void OLrzqt(VisibilityStrategy visibilityStrategy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && visibilityStrategy.whiteListUserIds == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], visibilityStrategy.whiteListUserIds);
        }

        public VisibilityStrategy(List<String> list) {
            this.whiteListUserIds = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>):void (m)] (LINE:15) call: com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption.VisibilityStrategy.<init>(java.util.List):void type: THIS */
        public /* synthetic */ VisibilityStrategy(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }
}
