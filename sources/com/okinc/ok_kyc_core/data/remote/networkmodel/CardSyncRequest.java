package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CardSyncRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cardSessionId;
    private final String extMsg;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardSyncRequest copy$default(CardSyncRequest cardSyncRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardSyncRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = cardSyncRequest.cardSessionId;
        }
        if ((i & 4) != 0) {
            str3 = cardSyncRequest.extMsg;
        }
        return cardSyncRequest.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cardSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.extMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardSyncRequest copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CardSyncRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSyncRequest)) {
            return false;
        }
        CardSyncRequest cardSyncRequest = (CardSyncRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) cardSyncRequest.sessionId) && Intrinsics.EZpvd((Object) this.cardSessionId, (Object) cardSyncRequest.cardSessionId) && Intrinsics.EZpvd((Object) this.extMsg, (Object) cardSyncRequest.extMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardSessionId() {
        return this.cardSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtMsg() {
        return this.extMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sessionId.hashCode();
        int iHashCode2 = this.cardSessionId.hashCode();
        String str = this.extMsg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardSyncRequest(sessionId=" + this.sessionId + ", cardSessionId=" + this.cardSessionId + ", extMsg=" + this.extMsg + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardSyncRequest> serializer() {
            return CardSyncRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardSyncRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CardSyncRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.cardSessionId = str2;
        if ((i & 4) == 0) {
            this.extMsg = "";
        } else {
            this.extMsg = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardSyncRequest cardSyncRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cardSyncRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cardSyncRequest.cardSessionId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) cardSyncRequest.extMsg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardSyncRequest.extMsg);
    }

    public CardSyncRequest(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.cardSessionId = str2;
        this.extMsg = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncRequest.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardSyncRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }
}
