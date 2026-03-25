package com.amplifyframework.logging;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Resources;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryConfiguration;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.util.Environment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class LoggingCategory extends Category<LoggingPlugin<?>> implements LoggingCategoryBehavior {
    private final LoggingPlugin<?> defaultPlugin;

    @Override // com.amplifyframework.core.category.Category
    public boolean configureFromDefaultConfigFile() {
        return false;
    }

    public LoggingCategory() {
        this(Environment.isJUnitTest() ? new JavaLoggingPlugin() : new AndroidLoggingPlugin());
    }

    public LoggingCategory(LoggingPlugin<?> loggingPlugin) {
        this.defaultPlugin = loggingPlugin;
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.LOGGING;
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger forNamespace(@Nullable String str) {
        return logger(str);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull String str) {
        Set<LoggingPlugin<?>> pluginsWithDefault = getPluginsWithDefault();
        ArrayList arrayList = new ArrayList();
        Iterator<LoggingPlugin<?>> it = pluginsWithDefault.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().logger(str));
        }
        return new BroadcastLogger(arrayList);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public Logger logger(@NonNull CategoryType categoryType, @NonNull String str) {
        Set<LoggingPlugin<?>> pluginsWithDefault = getPluginsWithDefault();
        ArrayList arrayList = new ArrayList();
        Iterator<LoggingPlugin<?>> it = pluginsWithDefault.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().logger(categoryType, str));
        }
        return new BroadcastLogger(arrayList);
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void enable() {
        Iterator<LoggingPlugin<?>> it = getPluginsWithDefault().iterator();
        while (it.hasNext()) {
            it.next().enable();
        }
    }

    @Override // com.amplifyframework.logging.LoggingCategoryBehavior
    public void disable() {
        Iterator<LoggingPlugin<?>> it = getPluginsWithDefault().iterator();
        while (it.hasNext()) {
            it.next().disable();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getSelectedPlugin()Lcom/amplifyframework/core/plugin/Plugin; */
    @Override // com.amplifyframework.core.category.Category
    public LoggingPlugin<?> getSelectedPlugin() throws IllegalStateException {
        throw new UnsupportedOperationException("Getting the selected logging plugin is not supported.");
    }

    @Override // com.amplifyframework.core.category.Category
    public void configure(@NonNull CategoryConfiguration categoryConfiguration, @NonNull Context context) throws AmplifyException {
        synchronized (this) {
            super.configure(categoryConfiguration, context);
            JSONObject configFile = readConfigFile(context);
            HashSet hashSet = new HashSet(getPlugins());
            hashSet.add(this.defaultPlugin);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((LoggingPlugin) it.next()).configure(configFile, context);
            }
        }
    }

    private JSONObject readConfigFile(Context context) {
        try {
            return Resources.readJsonResourceFromId(context, Resources.getRawResourceId(context, "amplifyconfiguration_logging"));
        } catch (Exception unused) {
            return null;
        }
    }

    private Set<LoggingPlugin<?>> getPluginsWithDefault() {
        HashSet hashSet = new HashSet(getPlugins());
        hashSet.add(this.defaultPlugin);
        return hashSet;
    }
}
