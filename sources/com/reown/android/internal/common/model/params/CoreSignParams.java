package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.Participant;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class CoreSignParams implements ClientParams {

    @JsonClass(generateAdapter = true)
    public static final class ApprovalParams extends CoreSignParams {
        public final RelayProtocolOptions relay;
        public final String responderPublicKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ApprovalParams copy$default(ApprovalParams approvalParams, RelayProtocolOptions relayProtocolOptions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                relayProtocolOptions = approvalParams.relay;
            }
            if ((i & 2) != 0) {
                str = approvalParams.responderPublicKey;
            }
            return approvalParams.copy(relayProtocolOptions, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelayProtocolOptions component1() {
            return this.relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.responderPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApprovalParams copy(@Json(name = "relay") @NotNull RelayProtocolOptions relayProtocolOptions, @Json(name = "responderPublicKey") @NotNull String str) {
            Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ApprovalParams(relayProtocolOptions, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApprovalParams)) {
                return false;
            }
            ApprovalParams approvalParams = (ApprovalParams) obj;
            return Intrinsics.EZpvd(this.relay, approvalParams.relay) && Intrinsics.EZpvd((Object) this.responderPublicKey, (Object) approvalParams.responderPublicKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelayProtocolOptions getRelay() {
            return this.relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getResponderPublicKey() {
            return this.responderPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.relay.hashCode() * 31) + this.responderPublicKey.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApprovalParams(relay=" + this.relay + ", responderPublicKey=" + this.responderPublicKey + ")";
        }

        public ApprovalParams(@Json(name = "relay") @NotNull RelayProtocolOptions relayProtocolOptions, @Json(name = "responderPublicKey") @NotNull String str) {
            Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.relay = relayProtocolOptions;
            this.responderPublicKey = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionAuthenticateApproveParams extends CoreSignParams {
        public final String appLink;
        public final List<Cacao> cacaos;
        public final Boolean linkMode;
        public final Participant responder;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.params.CoreSignParams$SessionAuthenticateApproveParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionAuthenticateApproveParams copy$default(SessionAuthenticateApproveParams sessionAuthenticateApproveParams, Participant participant, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                participant = sessionAuthenticateApproveParams.responder;
            }
            if ((i & 2) != 0) {
                list = sessionAuthenticateApproveParams.cacaos;
            }
            return sessionAuthenticateApproveParams.copy(participant, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Participant component1() {
            return this.responder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Cacao> component2() {
            return this.cacaos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionAuthenticateApproveParams copy(@Json(name = "responder") @NotNull Participant participant, @Json(name = "cacaos") @NotNull List<Cacao> list) {
            Intrinsics.checkNotNullParameter(participant, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new SessionAuthenticateApproveParams(participant, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionAuthenticateApproveParams)) {
                return false;
            }
            SessionAuthenticateApproveParams sessionAuthenticateApproveParams = (SessionAuthenticateApproveParams) obj;
            return Intrinsics.EZpvd(this.responder, sessionAuthenticateApproveParams.responder) && Intrinsics.EZpvd(this.cacaos, sessionAuthenticateApproveParams.cacaos);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAppLink() {
            return this.appLink;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Cacao> getCacaos() {
            return this.cacaos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getLinkMode() {
            return this.linkMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Participant getResponder() {
            return this.responder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.responder.hashCode() * 31) + this.cacaos.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionAuthenticateApproveParams(responder=" + this.responder + ", cacaos=" + this.cacaos + ")";
        }

        public SessionAuthenticateApproveParams(@Json(name = "responder") @NotNull Participant participant, @Json(name = "cacaos") @NotNull List<Cacao> list) {
            Intrinsics.checkNotNullParameter(participant, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.responder = participant;
            this.cacaos = list;
            Redirect redirect = participant.getMetadata().getRedirect();
            this.linkMode = redirect != null ? Boolean.valueOf(redirect.getLinkMode()) : null;
            Redirect redirect2 = participant.getMetadata().getRedirect();
            this.appLink = redirect2 != null ? redirect2.getUniversal() : null;
        }
    }
}
