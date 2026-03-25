package com.amplifyframework.logging;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.CategoryType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLoggingPlugin extends LoggingPlugin<Void> {
    private static final String AMPLIFY_NAMESPACE = "amplify";
    private final LogLevel defaultLoggerThreshold;

    /* JADX DEBUG: Method merged with bridge method: getEscapeHatch()Ljava/lang/Object; */
    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "AndroidLoggingPlugin";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.14.12";
    }

    public AndroidLoggingPlugin() {
        this(LogLevel.INFO);
    }

    public AndroidLoggingPlugin(@NonNull LogLevel logLevel) {
        this.defaultLoggerThreshold = logLevel;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(@Nullable String str) {
        if (str == null) {
            str = AMPLIFY_NAMESPACE;
        }
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull String str) {
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull CategoryType categoryType, @NonNull String str) {
        return new AndroidLogger(str, this.defaultLoggerThreshold);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        AndroidLogger.setIsEnabled(true);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        AndroidLogger.setIsEnabled(false);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, @NonNull Context context) {
        AndroidLogger.setIsEnabled(readConfigFile(jSONObject));
    }

    private boolean readConfigFile(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("consoleLoggingPlugin").getBoolean("enable");
        } catch (Exception unused) {
            return true;
        }
    }
}
