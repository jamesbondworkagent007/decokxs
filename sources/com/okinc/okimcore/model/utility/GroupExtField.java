package com.okinc.okimcore.model.utility;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupExtField {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupNoticeId;
    private final boolean isAllowMentionedRobot;
    private final boolean isAllowPrivacyChat;
    private final boolean isAllowSendLink;
    private final boolean isCanAddAffiliateMember;
    private final boolean isMute;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupExtField() {
        this(false, false, false, false, false, 0L, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupExtField copy$default(GroupExtField groupExtField, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = groupExtField.isAllowPrivacyChat;
        }
        if ((i & 2) != 0) {
            z2 = groupExtField.isAllowSendLink;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = groupExtField.isAllowMentionedRobot;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = groupExtField.isCanAddAffiliateMember;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = groupExtField.isMute;
        }
        boolean z9 = z5;
        if ((i & 32) != 0) {
            j = groupExtField.groupNoticeId;
        }
        return groupExtField.copy(z, z6, z7, z8, z9, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isAllowPrivacyChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isAllowMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isCanAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupExtField copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        return new GroupExtField(z, z2, z3, z4, z5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupExtField)) {
            return false;
        }
        GroupExtField groupExtField = (GroupExtField) obj;
        return this.isAllowPrivacyChat == groupExtField.isAllowPrivacyChat && this.isAllowSendLink == groupExtField.isAllowSendLink && this.isAllowMentionedRobot == groupExtField.isAllowMentionedRobot && this.isCanAddAffiliateMember == groupExtField.isCanAddAffiliateMember && this.isMute == groupExtField.isMute && this.groupNoticeId == groupExtField.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupNoticeId() {
        return this.groupNoticeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isAllowPrivacyChat) * 31) + Boolean.hashCode(this.isAllowSendLink)) * 31) + Boolean.hashCode(this.isAllowMentionedRobot)) * 31) + Boolean.hashCode(this.isCanAddAffiliateMember)) * 31) + Boolean.hashCode(this.isMute)) * 31) + Long.hashCode(this.groupNoticeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowMentionedRobot() {
        return this.isAllowMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowPrivacyChat() {
        return this.isAllowPrivacyChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowSendLink() {
        return this.isAllowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCanAddAffiliateMember() {
        return this.isCanAddAffiliateMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMute() {
        return this.isMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupExtField(isAllowPrivacyChat=" + this.isAllowPrivacyChat + ", isAllowSendLink=" + this.isAllowSendLink + ", isAllowMentionedRobot=" + this.isAllowMentionedRobot + ", isCanAddAffiliateMember=" + this.isCanAddAffiliateMember + ", isMute=" + this.isMute + ", groupNoticeId=" + this.groupNoticeId + ")";
    }

    public /* synthetic */ GroupExtField(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isAllowPrivacyChat = false;
        } else {
            this.isAllowPrivacyChat = z;
        }
        if ((i & 2) == 0) {
            this.isAllowSendLink = false;
        } else {
            this.isAllowSendLink = z2;
        }
        if ((i & 4) == 0) {
            this.isAllowMentionedRobot = false;
        } else {
            this.isAllowMentionedRobot = z3;
        }
        if ((i & 8) == 0) {
            this.isCanAddAffiliateMember = false;
        } else {
            this.isCanAddAffiliateMember = z4;
        }
        if ((i & 16) == 0) {
            this.isMute = false;
        } else {
            this.isMute = z5;
        }
        if ((i & 32) == 0) {
            this.groupNoticeId = 0L;
        } else {
            this.groupNoticeId = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupExtField groupExtField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupExtField.isAllowPrivacyChat) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, groupExtField.isAllowPrivacyChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupExtField.isAllowSendLink) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, groupExtField.isAllowSendLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupExtField.isAllowMentionedRobot) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, groupExtField.isAllowMentionedRobot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupExtField.isCanAddAffiliateMember) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, groupExtField.isCanAddAffiliateMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupExtField.isMute) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, groupExtField.isMute);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && groupExtField.groupNoticeId == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 5, groupExtField.groupNoticeId);
    }

    public GroupExtField(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        this.isAllowPrivacyChat = z;
        this.isAllowSendLink = z2;
        this.isAllowMentionedRobot = z3;
        this.isCanAddAffiliateMember = z4;
        this.isMute = z5;
        this.groupNoticeId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 boolean) : false)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
 A[MD:(boolean, boolean, boolean, boolean, boolean, long):void (m)] (LINE:11) call: com.okinc.okimcore.model.utility.GroupExtField.<init>(boolean, boolean, boolean, boolean, boolean, long):void type: THIS */
    public /* synthetic */ GroupExtField(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) == 0 ? z5 : false, (i & 32) != 0 ? 0L : j);
    }

    public final String toJson() {
        try {
            return C33489mxS.KWHzl.KWHzl(Companion.serializer(), this);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.GroupExtField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GroupExtField> serializer() {
            return GroupExtField$$serializer.INSTANCE;
        }

        public final GroupExtField KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                try {
                    return (GroupExtField) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) serializer(), str);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final GroupExtField KWHzl(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l) {
            return new GroupExtField(num != null && 1 == num.intValue(), num2 != null && 1 == num2.intValue(), num3 != null && 1 == num3.intValue(), num4 != null && 1 == num4.intValue(), num5 != null && 1 == num5.intValue(), l != null ? l.longValue() : 0L);
        }
    }
}
