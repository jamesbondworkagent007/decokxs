package com.amplifyframework.logging;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.CategoryType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaLoggingPlugin extends LoggingPlugin<Void> {
    private static final String AMPLIFY_NAMESPACE = "amplify";
    private final LogLevel defaultLoggerThreshold;

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, @NonNull Context context) {
    }

    /* JADX DEBUG: Method merged with bridge method: getEscapeHatch()Ljava/lang/Object; */
    @Override // com.amplifyframework.core.plugin.Plugin
    public Void getEscapeHatch() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return "JavaLoggingPlugin";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.14.12";
    }

    public JavaLoggingPlugin() {
        this(LogLevel.INFO);
    }

    public JavaLoggingPlugin(@NonNull LogLevel logLevel) {
        this.defaultLoggerThreshold = logLevel;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(@Nullable String str) {
        if (str == null) {
            str = AMPLIFY_NAMESPACE;
        }
        return logger(str);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull String str) {
        return new JavaLogger(str, this.defaultLoggerThreshold);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull CategoryType categoryType, @NonNull String str) {
        return logger(str);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        JavaLogger.setIsEnabled(true);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        JavaLogger.setIsEnabled(false);
    }
}
