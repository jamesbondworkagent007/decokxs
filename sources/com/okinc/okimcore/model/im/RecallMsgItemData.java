package com.okinc.okimcore.model.im;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RecallMsgItemData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer conversationType;
    private final String messageUid;
    private final String targetId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecallMsgItemData() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecallMsgItemData copy$default(RecallMsgItemData recallMsgItemData, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recallMsgItemData.conversationType;
        }
        if ((i & 2) != 0) {
            str = recallMsgItemData.targetId;
        }
        if ((i & 4) != 0) {
            str2 = recallMsgItemData.messageUid;
        }
        return recallMsgItemData.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.messageUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMsgItemData copy(Integer num, String str, String str2) {
        return new RecallMsgItemData(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMsgItemData)) {
            return false;
        }
        RecallMsgItemData recallMsgItemData = (RecallMsgItemData) obj;
        return Intrinsics.EZpvd(this.conversationType, recallMsgItemData.conversationType) && Intrinsics.EZpvd((Object) this.targetId, (Object) recallMsgItemData.targetId) && Intrinsics.EZpvd((Object) this.messageUid, (Object) recallMsgItemData.messageUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getConversationType() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageUid() {
        return this.messageUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.conversationType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.targetId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.messageUid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.RecallMsgItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecallMsgItemData> serializer() {
            return RecallMsgItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecallMsgItemData(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.conversationType = null;
        } else {
            this.conversationType = num;
        }
        if ((i & 2) == 0) {
            this.targetId = null;
        } else {
            this.targetId = str;
        }
        if ((i & 4) == 0) {
            this.messageUid = null;
        } else {
            this.messageUid = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(RecallMsgItemData recallMsgItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recallMsgItemData.conversationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, recallMsgItemData.conversationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recallMsgItemData.targetId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, recallMsgItemData.targetId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && recallMsgItemData.messageUid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, recallMsgItemData.messageUid);
    }

    public RecallMsgItemData(Integer num, String str, String str2) {
        this.conversationType = num;
        this.targetId = str;
        this.messageUid = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.okimcore.model.im.RecallMsgItemData.<init>(java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecallMsgItemData(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public String toString() {
        Integer num = this.conversationType;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.conversationType;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String str = this.messageUid;
        if (str == null) {
            str = "";
        }
        return "conversationType::" + iIntValue + ",targetId::" + iIntValue2 + ",messageUid::" + str;
    }
}
