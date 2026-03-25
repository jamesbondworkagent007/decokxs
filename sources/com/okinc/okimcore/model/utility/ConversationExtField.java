package com.okinc.okimcore.model.utility;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33489mxS;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ConversationExtField {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String enName;
    private final Integer messageListTab;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationExtField() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConversationExtField copy$default(ConversationExtField conversationExtField, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationExtField.enName;
        }
        if ((i & 2) != 0) {
            num = conversationExtField.messageListTab;
        }
        return conversationExtField.copy(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.messageListTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationExtField copy(String str, Integer num) {
        return new ConversationExtField(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationExtField)) {
            return false;
        }
        ConversationExtField conversationExtField = (ConversationExtField) obj;
        return Intrinsics.EZpvd((Object) this.enName, (Object) conversationExtField.enName) && Intrinsics.EZpvd(this.messageListTab, conversationExtField.messageListTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnName() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMessageListTab() {
        return this.messageListTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.enName;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.messageListTab;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConversationExtField(enName=" + this.enName + ", messageListTab=" + this.messageListTab + ")";
    }

    public /* synthetic */ ConversationExtField(int i, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enName = null;
        } else {
            this.enName = str;
        }
        if ((i & 2) == 0) {
            this.messageListTab = null;
        } else {
            this.messageListTab = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ConversationExtField conversationExtField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || conversationExtField.enName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, conversationExtField.enName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && conversationExtField.messageListTab == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, conversationExtField.messageListTab);
    }

    public ConversationExtField(String str, Integer num) {
        this.enName = str;
        this.messageListTab = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.okimcore.model.utility.ConversationExtField.<init>(java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ ConversationExtField(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    public final String toJson() {
        try {
            return C33489mxS.KWHzl.KWHzl(Companion.serializer(), this);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.ConversationExtField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConversationExtField> serializer() {
            return ConversationExtField$$serializer.INSTANCE;
        }
    }
}
