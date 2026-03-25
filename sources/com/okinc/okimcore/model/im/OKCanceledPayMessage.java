package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.sJU;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKCanceledPayMessage extends BaseOKPayMessage implements sJU<BaseOKPayMessage> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    @Override // com.okinc.okimcore.model.im.OKCustomMessage
    public boolean isSystemMessage() {
        return true;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCanceledPayMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCanceledPayMessage> serializer() {
            return OKCanceledPayMessage$$serializer.INSTANCE;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.okimcore.model.im.OKUserInfo)
  (r4v0 com.okinc.okimcore.model.im.OKMentionedInfo)
  (r5v0 java.lang.String)
  (r6v0 boolean)
  (r7v0 long)
  (r9v0 com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType)
  (r10v0 boolean)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 kotlinx.serialization.json.JsonObject)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Integer)
  (r28v0 java.lang.Integer)
  (r29v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] (LINE:7) call: com.okinc.okimcore.model.im.BaseOKPayMessage.<init>(int, java.lang.String, com.okinc.okimcore.model.im.OKUserInfo, com.okinc.okimcore.model.im.OKMentionedInfo, java.lang.String, boolean, long, com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.internal.SerializationConstructorMarker):void type: SUPER */
    public /* synthetic */ OKCanceledPayMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, str3, str4, str5, str6, str7, jsonObject, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num, num2, serializationConstructorMarker);
    }

    public OKCanceledPayMessage() {
    }
}
