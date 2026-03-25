package com.okinc.okimcore.model.utility;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupMemberExtField {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String enNickName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupMemberExtField() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupMemberExtField copy$default(GroupMemberExtField groupMemberExtField, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupMemberExtField.enNickName;
        }
        return groupMemberExtField.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberExtField copy(String str) {
        return new GroupMemberExtField(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupMemberExtField) && Intrinsics.EZpvd((Object) this.enNickName, (Object) ((GroupMemberExtField) obj).enNickName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickName() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.enNickName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupMemberExtField(enNickName=" + this.enNickName + ")";
    }

    public /* synthetic */ GroupMemberExtField(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enNickName = null;
        } else {
            this.enNickName = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupMemberExtField groupMemberExtField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && groupMemberExtField.enNickName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupMemberExtField.enNickName);
    }

    public GroupMemberExtField(String str) {
        this.enNickName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:11) call: com.okinc.okimcore.model.utility.GroupMemberExtField.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ GroupMemberExtField(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String toJson() {
        try {
            return C33489mxS.KWHzl.KWHzl(Companion.serializer(), this);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.GroupMemberExtField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GroupMemberExtField> serializer() {
            return GroupMemberExtField$$serializer.INSTANCE;
        }

        public final GroupMemberExtField AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                try {
                    return (GroupMemberExtField) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) serializer(), str);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final GroupMemberExtField copydefault(String str) {
            return new GroupMemberExtField(str);
        }
    }
}
