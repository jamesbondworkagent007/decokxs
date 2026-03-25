package com.okinc.oklive.app.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ModerationMessage {
    private final TargetParticipant targetParticipant;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ModerationMessage copy$default(ModerationMessage moderationMessage, TargetParticipant targetParticipant, int i, Object obj) {
        if ((i & 1) != 0) {
            targetParticipant = moderationMessage.targetParticipant;
        }
        return moderationMessage.copy(targetParticipant);
    }

    @SerialName("targetParticipant")
    public static /* synthetic */ void getTargetParticipant$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetParticipant component1() {
        return this.targetParticipant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModerationMessage copy(@NotNull TargetParticipant targetParticipant) {
        Intrinsics.checkNotNullParameter(targetParticipant, "");
        return new ModerationMessage(targetParticipant);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModerationMessage) && Intrinsics.EZpvd(this.targetParticipant, ((ModerationMessage) obj).targetParticipant);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetParticipant getTargetParticipant() {
        return this.targetParticipant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.targetParticipant.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModerationMessage(targetParticipant=" + this.targetParticipant + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.ModerationMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ModerationMessage> serializer() {
            return ModerationMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ModerationMessage(int i, TargetParticipant targetParticipant, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ModerationMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.targetParticipant = targetParticipant;
    }

    public ModerationMessage(@NotNull TargetParticipant targetParticipant) {
        Intrinsics.checkNotNullParameter(targetParticipant, "");
        this.targetParticipant = targetParticipant;
    }

    @Serializable
    public static final class TargetParticipant {
        private final String avatar;
        private final String moderatorState;
        private final Integer muteStatus;
        private final String nickname;
        private final Integer role;
        private final List<String> tags;
        private final long userUid;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

        @SerialName("avatar")
        public static /* synthetic */ void getAvatar$annotations() {
        }

        @SerialName("moderatorState")
        public static /* synthetic */ void getModeratorState$annotations() {
        }

        @SerialName("muteStatus")
        public static /* synthetic */ void getMuteStatus$annotations() {
        }

        @SerialName("nickname")
        public static /* synthetic */ void getNickname$annotations() {
        }

        @SerialName("role")
        public static /* synthetic */ void getRole$annotations() {
        }

        @SerialName("tags")
        public static /* synthetic */ void getTags$annotations() {
        }

        @SerialName("userUid")
        public static /* synthetic */ void getUserUid$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.userUid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component4() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component5() {
            return this.muteStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component6() {
            return this.role;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.moderatorState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TargetParticipant copy(long j, String str, String str2, List<String> list, Integer num, Integer num2, String str3) {
            return new TargetParticipant(j, str, str2, list, num, num2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetParticipant)) {
                return false;
            }
            TargetParticipant targetParticipant = (TargetParticipant) obj;
            return this.userUid == targetParticipant.userUid && Intrinsics.EZpvd((Object) this.avatar, (Object) targetParticipant.avatar) && Intrinsics.EZpvd((Object) this.nickname, (Object) targetParticipant.nickname) && Intrinsics.EZpvd(this.tags, targetParticipant.tags) && Intrinsics.EZpvd(this.muteStatus, targetParticipant.muteStatus) && Intrinsics.EZpvd(this.role, targetParticipant.role) && Intrinsics.EZpvd((Object) this.moderatorState, (Object) targetParticipant.moderatorState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvatar() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getModeratorState() {
            return this.moderatorState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getMuteStatus() {
            return this.muteStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getRole() {
            return this.role;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getTags() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getUserUid() {
            return this.userUid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.userUid);
            String str = this.avatar;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.nickname;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            List<String> list = this.tags;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            Integer num = this.muteStatus;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            Integer num2 = this.role;
            int iHashCode6 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.moderatorState;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TargetParticipant(userUid=" + this.userUid + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", tags=" + this.tags + ", muteStatus=" + this.muteStatus + ", role=" + this.role + ", moderatorState=" + this.moderatorState + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.ModerationMessage.TargetParticipant.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TargetParticipant> serializer() {
                return ModerationMessage$TargetParticipant$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TargetParticipant(int i, long j, String str, String str2, List list, Integer num, Integer num2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, ModerationMessage$TargetParticipant$$serializer.INSTANCE.getDescriptor());
            }
            this.userUid = j;
            if ((i & 2) == 0) {
                this.avatar = null;
            } else {
                this.avatar = str;
            }
            if ((i & 4) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str2;
            }
            if ((i & 8) == 0) {
                this.tags = null;
            } else {
                this.tags = list;
            }
            if ((i & 16) == 0) {
                this.muteStatus = null;
            } else {
                this.muteStatus = num;
            }
            if ((i & 32) == 0) {
                this.role = null;
            } else {
                this.role = num2;
            }
            if ((i & 64) == 0) {
                this.moderatorState = null;
            } else {
                this.moderatorState = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(TargetParticipant targetParticipant, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeLongElement(serialDescriptor, 0, targetParticipant.userUid);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || targetParticipant.avatar != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, targetParticipant.avatar);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || targetParticipant.nickname != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, targetParticipant.nickname);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || targetParticipant.tags != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], targetParticipant.tags);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || targetParticipant.muteStatus != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, targetParticipant.muteStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || targetParticipant.role != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, targetParticipant.role);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && targetParticipant.moderatorState == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, targetParticipant.moderatorState);
        }

        public TargetParticipant(long j, String str, String str2, List<String> list, Integer num, Integer num2, String str3) {
            this.userUid = j;
            this.avatar = str;
            this.nickname = str2;
            this.tags = list;
            this.muteStatus = num;
            this.role = num2;
            this.moderatorState = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (r12v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:37) call: com.okinc.oklive.app.domain.model.ModerationMessage.TargetParticipant.<init>(long, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
        public /* synthetic */ TargetParticipant(long j, String str, String str2, List list, Integer num, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3);
        }
    }
}
