package com.amplifyframework.core.model;

import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.datastore.DataStoreException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SchemaRegistryUtils {
    public static final SchemaRegistryUtils INSTANCE = new SchemaRegistryUtils();

    private SchemaRegistryUtils() {
    }

    public static /* synthetic */ void registerSchemas$default(Map map, Map map2, int i, Object obj) throws DataStoreException.IrRecoverableException {
        if ((i & 2) != 0) {
            map2 = null;
        }
        registerSchemas(map, map2);
    }

    public static final void registerSchema(@NotNull Map<String, ModelSchema> map, @NotNull String str, @NotNull ModelSchema modelSchema) throws DataStoreException.IrRecoverableException {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(modelSchema, "");
        try {
            ModelConfig modelConfig = (ModelConfig) modelSchema.getModelClass().getAnnotation(ModelConfig.class);
            if (modelConfig != null && modelConfig.hasLazySupport()) {
                throw new DataStoreException.IrRecoverableException("Unsupported model type. Lazy model types are not yet supported on DataStore.", "Regenerate models with generatemodelsforlazyloadandcustomselectionset=false.");
            }
        } catch (NullPointerException unused) {
        }
        map.put(str, modelSchema);
    }

    public static final void registerSchemas(@NotNull Map<String, ModelSchema> map, Map<String, ModelSchema> map2) throws DataStoreException.IrRecoverableException {
        Intrinsics.checkNotNullParameter(map, "");
        if (map2 != null) {
            for (Map.Entry<String, ModelSchema> entry : map2.entrySet()) {
                registerSchema(map, entry.getKey(), entry.getValue());
            }
        }
    }
}
