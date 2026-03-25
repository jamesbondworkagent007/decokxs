package com.reown.android.pulse.model;

/* JADX INFO: loaded from: classes24.dex */
public final class Trace {
    public static final Trace INSTANCE = new Trace();

    public static final class Pairing {
        public static final String EMIT_SESSION_PROPOSAL = "emit_session_proposal";
        public static final String EMIT_STORED_PAIRING = "emit_inactive_pairing";
        public static final String EXISTING_PAIRING = "existing_pairing";
        public static final Pairing INSTANCE = new Pairing();
        public static final String PAIRING_NOT_EXPIRED = "pairing_not_expired";
        public static final String PAIRING_STARTED = "pairing_started";
        public static final String PAIRING_URI_NOT_EXPIRED = "pairing_uri_not_expired";
        public static final String PAIRING_URI_VALIDATION_SUCCESS = "pairing_uri_validation_success";
        public static final String STORE_NEW_PAIRING = "store_new_pairing";
        public static final String SUBSCRIBE_PAIRING_TOPIC_SUCCESS = "subscribe_pairing_topic_success";
        public static final String SUBSCRIBING_PAIRING_TOPIC = "subscribing_pairing_topic";
    }

    public static final class Session {
        public static final String CREATE_SESSION_TOPIC = "create_session_topic";
        public static final Session INSTANCE = new Session();
        public static final String PROPOSAL_NOT_EXPIRED = "proposal_not_expired";
        public static final String PUBLISHING_SESSION_APPROVE = "publishing_session_approve";
        public static final String PUBLISHING_SESSION_SETTLE = "publishing_session_settle";
        public static final String SESSION_APPROVE_PUBLISH_SUCCESS = "session_approve_publish_success";
        public static final String SESSION_APPROVE_STARTED = "session_approve_started";
        public static final String SESSION_NAMESPACE_VALIDATION_SUCCESS = "session_namespaces_validation_success";
        public static final String SESSION_SETTLE_PUBLISH_SUCCESS = "session_settle_publish_success";
        public static final String STORE_SESSION = "store_session";
        public static final String SUBSCRIBE_SESSION_TOPIC_SUCCESS = "subscribe_session_topic_success";
        public static final String SUBSCRIBING_SESSION_TOPIC = "subscribing_session_topic";
    }

    public static final class SessionAuthenticate {
        public static final String AUTHENTICATED_SESSION_APPROVE_PUBLISH_SUCCESS = "authenticated_session_approve_publish_success";
        public static final String AUTHENTICATED_SESSION_NOT_EXPIRED = "authenticated_session_not_expired";
        public static final String CACAOS_VERIFIED = "cacaos_verified";
        public static final String CHAINS_CAIP2_COMPLIANT = "chains_caip2_compliant";
        public static final String CHAINS_EVM_COMPLIANT = "chains_evm_compliant";
        public static final String CREATE_AUTHENTICATED_SESSION_TOPIC = "create_authenticated_session_topic";
        public static final SessionAuthenticate INSTANCE = new SessionAuthenticate();
        public static final String PUBLISHING_AUTHENTICATED_SESSION_APPROVE = "publishing_authenticated_session_approve";
        public static final String SESSION_AUTHENTICATE_APPROVE_STARTED = "authenticated_session_approve_started";
        public static final String STORE_AUTHENTICATED_SESSION = "store_authenticated_session";
        public static final String SUBSCRIBE_AUTHENTICATED_SESSION_TOPIC_SUCCESS = "subscribe_authenticated_session_topic_success";
        public static final String SUBSCRIBING_AUTHENTICATED_SESSION_TOPIC = "subscribing_authenticated_session_topic";
    }
}
