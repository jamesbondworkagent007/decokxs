package com.okinc.okimcore.model.im.inhouseim.ws;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C56390yDp;
import o.C56423yEv;
import o.pUU;
import o.sHW;
import o.sSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSConversationIds extends WSRequest {
    public static final int $stable = 0;
    public final InHouseIMConversationIdsQuery data;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {InHouseIMCommand.Companion.serializer(), null, new ObjectSerializer("com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery", InHouseIMConversationIdsQuery.INSTANCE, new Annotation[0])};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSConversationIds() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSConversationIds copy$default(WSConversationIds wSConversationIds, InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery, int i, Object obj) {
        if ((i & 1) != 0) {
            inHouseIMConversationIdsQuery = wSConversationIds.data;
        }
        return wSConversationIds.copydefault(inHouseIMConversationIdsQuery);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSConversationIds copydefault(@NotNull InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery) {
        Intrinsics.checkNotNullParameter(inHouseIMConversationIdsQuery, "");
        return new WSConversationIds(inHouseIMConversationIdsQuery);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSConversationIds) && Intrinsics.EZpvd(this.data, ((WSConversationIds) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSConversationIds(data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIds.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSConversationIds> serializer() {
            return WSConversationIds$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WSConversationIds(int i, InHouseIMCommand inHouseIMCommand, String str, InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, inHouseIMCommand, str, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSConversationIds$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 4) == 0) {
            this.data = InHouseIMConversationIdsQuery.INSTANCE;
        } else {
            this.data = inHouseIMConversationIdsQuery;
        }
    }

    public static final /* synthetic */ void copydefault(WSConversationIds wSConversationIds, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WSRequest.OLrzqt(wSConversationIds, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(wSConversationIds.data, InHouseIMConversationIdsQuery.INSTANCE)) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], wSConversationIds.data);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery:0x0004: SGET  A[WRAPPED] (LINE:76) com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery.INSTANCE com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery) : (r1v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery))
 A[MD:(com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery):void (m)] (LINE:75) call: com.okinc.okimcore.model.im.inhouseim.ws.WSConversationIds.<init>(com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationIdsQuery):void type: THIS */
    public /* synthetic */ WSConversationIds(InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InHouseIMConversationIdsQuery.INSTANCE : inHouseIMConversationIdsQuery);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WSConversationIds(@NotNull InHouseIMConversationIdsQuery inHouseIMConversationIdsQuery) {
        super(InHouseIMCommand.WSConversationIds);
        Intrinsics.checkNotNullParameter(inHouseIMConversationIdsQuery, "");
        this.data = inHouseIMConversationIdsQuery;
    }

    @Override // o.InterfaceC44448sQe
    public String KWHzl() {
        try {
            return sHW.copydefault().KWHzl().encodeToString(Companion.serializer(), this);
        } catch (Exception e) {
            pUU.copydefault("SafeJson", "encodeToString with multiple parameters error: " + e.getMessage());
            sSR.copydefault("encodeToString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
            return "";
        }
    }
}
