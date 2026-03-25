package com.amplifyframework.devmenu;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingPlugin;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PersistentLogStoragePlugin extends LoggingPlugin<Void> {
    private static final String AMPLIFY_NAMESPACE = "amplify";
    private final Map<String, PersistentLogger> loggers = new HashMap();

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
    public String getVersion() {
        return "2.14.12";
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
        PersistentLogger persistentLogger = this.loggers.get(str);
        if (persistentLogger != null) {
            return persistentLogger;
        }
        PersistentLogger persistentLogger2 = new PersistentLogger(str);
        this.loggers.put(str, persistentLogger2);
        return persistentLogger2;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull CategoryType categoryType, @NonNull String str) {
        return logger(str);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        PersistentLogger.setIsEnabled(true);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        PersistentLogger.setIsEnabled(false);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return PersistentLogStoragePlugin.class.getSimpleName();
    }

    public List<LogEntry> getLogs() {
        ArrayList arrayList = new ArrayList();
        Iterator<PersistentLogger> it = this.loggers.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getLogs());
        }
        Collections.sort(arrayList);
        return Immutable.of(arrayList);
    }
}
