package com.engagelab.privates.analysis.constants;

/* JADX INFO: loaded from: classes21.dex */
public interface MTAnalysisConstants {
    public static final int ACCOUNT_ATTRIBUTES_COUNT = 30;
    public static final String ACCOUNT_EXTRA_ATTR = "extra";
    public static final String ACCOUNT_INTERNAL_MAIL = "$email";
    public static final String ACCOUNT_INTERNAL_NAME = "$name";
    public static final String ACCOUNT_INTERNAL_PHONE = "$phone";
    public static final String ACCOUNT_INTERNAL_SEX = "$sex";
    public static final String ACCOUNT_INTERNAL_TIME = "$creation_time";
    public static final String ACCOUNT_SET_ATTR = "set_attr";
    public static final String BROWSE_DURATION = "browse_duration";
    public static final String BROWSE_ID = "browse_content_id";
    public static final String BROWSE_NAME = "browse_name";
    public static final String BROWSE_TYPE = "browse_type";
    public static final int BYTE_COUNT = 256;
    public static final String CALCULATE_ID = "event_id";
    public static final String CALCULATE_VALUE = "event_value";
    public static final String COUNT_ID = "event_id";
    public static final String EVENT_ATTRIBUTES = "attributes";
    public static final int EVENT_COMMON_ATTRIBUTES_COUNT = 50;
    public static final String EVENT_NAME = "event_name";
    public static final int EVENT_SHARE_ATTRIBUTES_COUNT = 10;
    public static final String EXPOSURE_COUNT = "count";
    public static final int EXPOSURE_REPORT_INTERVAL = 15000;
    public static final String EXPOSURE_TAG = "tag";
    public static final String LOGIN_METHOD = "login_method";
    public static final String LOGIN_SUCCESS = "login_success";
    public static final String PURCHASE_CURRENCY = "purchase_currency";
    public static final String PURCHASE_GOODS_ID = "purchase_goods_id";
    public static final String PURCHASE_GOODS_NAME = "purchase_goods_name";
    public static final String PURCHASE_GOODS_TYPE = "purchase_goods_type";
    public static final String PURCHASE_PRICE = "purchase_price";
    public static final String PURCHASE_QUANTITY = "purchase_quantity";
    public static final String PURCHASE_SUCCESS = "purchase_success";
    public static final String REGISTER_METHOD = "register_method";
    public static final String REGISTER_SUCCESS = "register_success";
    public static final String TYPE_ACCOUNT = "identify_account";
    public static final String TYPE_ACTIVE = "active";
    public static final String TYPE_ACTIVE_LAUNCH = "active_launch";
    public static final String TYPE_ACTIVE_TERMINATE = "active_terminate";
    public static final String TYPE_BROWSE = "custom_browse";
    public static final String TYPE_CALCULATE = "custom_calculate";
    public static final String TYPE_COUNT = "custom_counting";
    public static final String TYPE_CRASH = "crash_log";
    public static final String TYPE_EVENT = "custom_event";
    public static final String TYPE_EXPOSURE = "exposure";
    public static final String TYPE_LOGIN = "custom_login";
    public static final String TYPE_MESSAGE_STATE = "msg_status";
    public static final String TYPE_PLATFORM_MESSAGE_STATE = "third_msg_status";
    public static final String TYPE_PURCHASE = "custom_purchase";
    public static final String TYPE_REGISTER = "custom_register";

    public interface Account {
        public static final String KEY_ACCOUNT = "account";
    }

    public interface Event {
        public static final String KEY_EVENT = "event";
    }

    public interface MainWhat {
        public static final int CLEAR_DYNAMIC_PROPERTY = 4104;
        public static final int CLEAR_STATIC_PROPERTY = 4102;
        public static final int INIT = 4001;
        public static final int ON_ACCOUNT = 4003;
        public static final int ON_DRAW_DONE = 4005;
        public static final int ON_EVENT = 4002;
        public static final int ON_REPORT = 4004;
        public static final int SET_DYNAMIC_PROPERTY = 4103;
        public static final int SET_STATIC_PROPERTY = 4101;
    }
}
