package com.reown.sign.common.exceptions;

/* JADX INFO: loaded from: classes24.dex */
public final class MessagesKt {
    public static final String CLIENT_ALREADY_INITIALIZED = "SignClient already initialized";
    public static final String EMPTY_NAMESPACES_MESSAGE = "Session namespaces MUST not be empty";
    public static final String INVALID_CACAO_EXCEPTION = "Invalid Cacao exception";
    public static final String INVALID_EVENT_MESSAGE = "Event name and data fields cannot be empty. ChainId must be CAIP-2 compliant";
    public static final String INVALID_EXTEND_TIME = "Extend time is out of range";
    public static final String INVALID_REQUEST_MESSAGE = "Request topic, method and params fields cannot be empty. ChainId must be CAIP-2 compliant";
    public static final String INVALID_SESSION_PROPERTIES = "Invalid Session Properties requested";
    public static final String INVALID_SIGN_PARAMS_TYPE = "Invalid Sign params type";
    public static final String MISSING_SESSION_AUTHENTICATE_REQUEST = "Missing session authenticate request, expired";
    public static final String NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE = "Accounts must be CAIP-10 compliant";
    public static final String NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE = "Accounts must be defined in matching namespace";
    public static final String NAMESPACE_CHAINS_CAIP_2_MESSAGE = "Chains must be CAIP-2 compliant";
    public static final String NAMESPACE_CHAINS_MISSING_MESSAGE = "Chains must not be empty";
    public static final String NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE = "Chains must not be null";
    public static final String NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE = "Chains must be defined in matching namespace";
    public static final String NAMESPACE_EVENTS_MISSING_MESSAGE = "All events must be approved: not all events are approved";
    public static final String NAMESPACE_KEYS_INVALID_FORMAT = "Invalid namespace id format";
    public static final String NAMESPACE_KEYS_MISSING_MESSAGE = "All required namespaces must be approved";
    public static final String NAMESPACE_METHODS_MISSING_MESSAGE = "All required namespaces must be approved: not all methods are approved";
    public static final String NO_SEQUENCE_FOR_TOPIC_MESSAGE = "Cannot find sequence for given topic: ";
    public static final String SESSION_IS_NOT_ACKNOWLEDGED_MESSAGE = "Session is not acknowledged, topic: ";
    public static final String UNAUTHORIZED_EMIT_MESSAGE = "The emit() was called by the unauthorized peer. Must be called by controller client.";
    public static final String UNAUTHORIZED_EVENT_MESSAGE = "Unauthorized event is not authorized for given chain";
    public static final String UNAUTHORIZED_EXTEND_MESSAGE = "The extend() was called by the unauthorized peer. Must be called by controller client.";
    public static final String UNAUTHORIZED_METHOD_MESSAGE = "Unauthorized method is not authorized for given chain";
    public static final String UNAUTHORIZED_UPDATE_MESSAGE = "The update() was called by the unauthorized peer. Must be called by controller client.";
}
