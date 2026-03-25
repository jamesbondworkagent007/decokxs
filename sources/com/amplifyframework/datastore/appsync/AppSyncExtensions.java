package com.amplifyframework.datastore.appsync;

import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Immutable;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AppSyncExtensions {
    private static final String DATA_KEY = "data";
    private static final String ERROR_INFO_KEY = "errorInfo";
    private static final String ERROR_TYPE_KEY = "errorType";
    private final Map<String, Object> data;
    private final String errorInfo;
    private final AppSyncErrorType errorType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getErrorInfo() {
        return this.errorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AppSyncErrorType getErrorType() {
        return this.errorType;
    }

    public AppSyncExtensions(Map<String, Object> map) {
        this.errorType = AppSyncErrorType.enumerate((String) map.get(ERROR_TYPE_KEY));
        this.errorInfo = (String) map.get(ERROR_INFO_KEY);
        this.data = (Map) map.get("data");
    }

    public AppSyncExtensions(String str, String str2, Map<String, Object> map) {
        this.errorType = AppSyncErrorType.enumerate(str);
        this.errorInfo = str2;
        this.data = map;
    }

    public Map<String, Object> getData() {
        return Immutable.of(this.data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AppSyncExtensions.class != obj.getClass()) {
            return false;
        }
        AppSyncExtensions appSyncExtensions = (AppSyncExtensions) obj;
        return ObjectsCompat.equals(this.errorType, appSyncExtensions.errorType) && ObjectsCompat.equals(this.errorInfo, appSyncExtensions.errorInfo) && ObjectsCompat.equals(this.data, appSyncExtensions.data);
    }

    public int hashCode() {
        int iHashCode = this.errorType.hashCode();
        String str = this.errorInfo;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Map<String, Object> map = this.data;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "AppSyncExtensions{errorType='" + this.errorType + "', errorInfo='" + this.errorInfo + "', data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean isUnauthorizedErrorType() {
        return AppSyncErrorType.UNAUTHORIZED.equals(getErrorType()) || AppSyncErrorType.UNAUTHORIZED_EXCEPTION.equals(getErrorType());
    }

    public enum AppSyncErrorType {
        CONFLICT_UNHANDLED("ConflictUnhandled"),
        OPERATION_DISABLED("OperationDisabled"),
        UNAUTHORIZED_EXCEPTION("UnauthorizedException"),
        UNAUTHORIZED("Unauthorized");

        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getValue() {
            return this.value;
        }

        AppSyncErrorType(String str) {
            this.value = str;
        }

        public static AppSyncErrorType enumerate(@Nullable String str) {
            for (AppSyncErrorType appSyncErrorType : values()) {
                if (appSyncErrorType.getValue().equals(str)) {
                    return appSyncErrorType;
                }
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "AppSyncErrorType{value='" + this.value + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
