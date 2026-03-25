package com.okinc.okimcore.model.biz;

import com.okinc.okimcore.model.im.RecallMsgItemData;
import com.okinc.okimcore.model.im.RecallMsgItemData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RecallMsgData {
    private final List<RecallMsgItemData> recallMsgItemList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(RecallMsgItemData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecallMsgData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.biz.RecallMsgData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecallMsgData copy$default(RecallMsgData recallMsgData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recallMsgData.recallMsgItemList;
        }
        return recallMsgData.copy(list);
    }

    @SerialName("recall_msg")
    public static /* synthetic */ void getRecallMsgItemList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecallMsgItemData> component1() {
        return this.recallMsgItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMsgData copy(List<RecallMsgItemData> list) {
        return new RecallMsgData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecallMsgData) && Intrinsics.EZpvd(this.recallMsgItemList, ((RecallMsgData) obj).recallMsgItemList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecallMsgItemData> getRecallMsgItemList() {
        return this.recallMsgItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<RecallMsgItemData> list = this.recallMsgItemList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecallMsgData(recallMsgItemList=" + this.recallMsgItemList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.biz.RecallMsgData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecallMsgData> serializer() {
            return RecallMsgData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecallMsgData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.recallMsgItemList = null;
        } else {
            this.recallMsgItemList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(RecallMsgData recallMsgData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && recallMsgData.recallMsgItemList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], recallMsgData.recallMsgItemList);
    }

    public RecallMsgData(List<RecallMsgItemData> list) {
        this.recallMsgItemList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okimcore.model.im.RecallMsgItemData>):void (m)] (LINE:10) call: com.okinc.okimcore.model.biz.RecallMsgData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ RecallMsgData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
