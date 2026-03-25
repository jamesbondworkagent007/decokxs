package com.reown.android.pulse.model;

/* JADX INFO: loaded from: classes24.dex */
public final class EventType {
    public static final String ERROR = "ERROR";
    public static final String INIT = "INIT";
    public static final EventType INSTANCE = new EventType();
    public static final String SUCCESS = "SUCCESS";
    public static final String TRACK = "TRACE";

    public static final class Error {
        public static final String AUTHENTICATED_SESSION_APPROVE_PUBLISH_FAILURE = "AUTHENTICATED_SESSION_APPROVE_PUBLISH_FAILURE";
        public static final String AUTHENTICATED_SESSION_EXPIRED = "AUTHENTICATED_SESSION_EXPIRED";
        public static final String CHAINS_CAIP2_COMPLIANT_FAILURE = "CHAINS_CAIP2_COMPLIANT_FAILURE";
        public static final String CHAINS_EVM_COMPLIANT_FAILURE = "CHAINS_EVM_COMPLIANT_FAILURE";
        public static final Error INSTANCE = new Error();
        public static final String INVALID_CACAO = "INVALID_CACAO";
        public static final String MALFORMED_PAIRING_URI = "MALFORMED_PAIRING_URI";
        public static final String MISSING_SESSION_AUTH_REQUEST = "MISSING_SESSION_AUTH_REQUEST";
        public static final String NO_INTERNET_CONNECTION = "NO_INTERNET_CONNECTION";
        public static final String NO_WSS_CONNECTION = "NO_WSS_CONNECTION";
        public static final String OPTIONAL_NAMESPACE_VALIDATION_FAILURE = "OPTIONAL_NAMESPACE_VALIDATION_FAILURE";
        public static final String PAIRING_ALREADY_EXIST = "PAIRING_ALREADY_EXIST";
        public static final String PAIRING_EXPIRED = "PAIRING_EXPIRED";
        public static final String PAIRING_SUBSCRIPTION_FAILURE = "FAILED_TO_SUBSCRIBE_TO_PAIRING_TOPIC";
        public static final String PAIRING_URI_EXPIRED = "PAIRING_URI_EXPIRED";
        public static final String PROPOSAL_EXPIRED = "PROPOSAL_EXPIRED";
        public static final String REQUIRED_NAMESPACE_VALIDATION_FAILURE = "REQUIRED_NAMESPACE_VALIDATION_FAILURE";
        public static final String SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE = "SESSION_APPROVE_NAMESPACE_VALIDATION_FAILURE";
        public static final String SESSION_APPROVE_PUBLISH_FAILURE = "SESSION_APPROVE_PUBLISH_FAILURE";
        public static final String SESSION_AUTH_REQUEST_EXPIRED = "SESSION_AUTH_REQUEST_EXPIRED";
        public static final String SESSION_PROPERTIES_VALIDATION_FAILURE = "SESSION_PROPERTIES_VALIDATION_FAILURE";
        public static final String SESSION_SETTLE_PUBLISH_FAILURE = "SESSION_SETTLE_PUBLISH_FAILURE";
        public static final String SESSION_SUBSCRIPTION_FAILURE = "SESSION_SUBSCRIPTION_FAILURE";
        public static final String SUBSCRIBE_AUTH_SESSION_TOPIC_FAILURE = "SUBSCRIBE_AUTH_SESSION_TOPIC_FAILURE";
    }

    public static final class Track {
        public static final String CLICK_ALL_WALLETS = "CLICK_ALL_WALLETS";
        public static final String CLICK_GET_WALLET = "CLICK_GET_WALLET";
        public static final String CLICK_NETWORKS = "CLICK_NETWORKS";
        public static final String CLICK_NETWORK_HELP = "CLICK_NETWORK_HELP";
        public static final String CLICK_WALLET_HELP = "CLICK_WALLET_HELP";
        public static final String CONNECT_ERROR = "CONNECT_ERROR";
        public static final String CONNECT_SUCCESS = "CONNECT_SUCCESS";
        public static final String DISCONNECT_ERROR = "DISCONNECT_ERROR";
        public static final String DISCONNECT_SUCCESS = "DISCONNECT_SUCCESS";
        public static final Track INSTANCE = new Track();
        public static final String MODAL_CLOSE = "MODAL_CLOSE";
        public static final String MODAL_CREATED = "MODAL_CREATED";
        public static final String MODAL_LOADED = "MODAL_LOADED";
        public static final String MODAL_OPEN = "MODAL_OPEN";
        public static final String SELECT_WALLET = "SELECT_WALLET";
        public static final String SWITCH_NETWORK = "SWITCH_NETWORK";
    }
}
