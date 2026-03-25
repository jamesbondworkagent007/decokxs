package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class SchemaRegistry {
    private static SchemaRegistry instance;
    private final Map<String, ModelSchema> modelSchemaMap = new HashMap();
    private final Map<String, CustomTypeSchema> customTypeSchemaMap = new HashMap();

    private SchemaRegistry() {
    }

    public void register(@NonNull Set<Class<? extends Model>> set) throws AmplifyException {
        synchronized (this) {
            for (Class<? extends Model> cls : set) {
                SchemaRegistryUtils.registerSchema(this.modelSchemaMap, cls.getSimpleName(), ModelSchema.fromModelClass(cls));
            }
        }
    }

    public void register(@NonNull Map<String, ModelSchema> map) {
        synchronized (this) {
            SchemaRegistryUtils.registerSchemas(this.modelSchemaMap, map);
        }
    }

    public void register(@NonNull Map<String, ModelSchema> map, @NonNull Map<String, CustomTypeSchema> map2) {
        synchronized (this) {
            SchemaRegistryUtils.registerSchemas(this.modelSchemaMap, map);
            this.customTypeSchemaMap.putAll(map2);
        }
    }

    public void register(@NonNull String str, @NonNull ModelSchema modelSchema) {
        synchronized (this) {
            SchemaRegistryUtils.registerSchema(this.modelSchemaMap, str, modelSchema);
        }
    }

    public void register(@NonNull String str, @NonNull CustomTypeSchema customTypeSchema) {
        synchronized (this) {
            this.customTypeSchemaMap.put(str, customTypeSchema);
        }
    }

    public ModelSchema getModelSchemaForModelClass(@NonNull String str) {
        ModelSchema modelSchema;
        synchronized (this) {
            modelSchema = this.modelSchemaMap.get(str);
        }
        return modelSchema;
    }

    public CustomTypeSchema getCustomTypeSchemaForCustomTypeClass(@NonNull String str) {
        CustomTypeSchema customTypeSchema;
        synchronized (this) {
            customTypeSchema = this.customTypeSchemaMap.get(str);
        }
        return customTypeSchema;
    }

    public <T extends Model> ModelSchema getModelSchemaForModelClass(@NonNull Class<T> cls) {
        ModelSchema modelSchema;
        synchronized (this) {
            modelSchema = this.modelSchemaMap.get(cls.getSimpleName());
        }
        return modelSchema;
    }

    public <T extends Model> ModelSchema getModelSchemaForModelInstance(@NonNull T t) {
        ModelSchema modelSchema;
        synchronized (this) {
            modelSchema = this.modelSchemaMap.get(t.getClass().getSimpleName());
        }
        return modelSchema;
    }

    public Map<String, ModelSchema> getModelSchemaMap() {
        return Immutable.of(this.modelSchemaMap);
    }

    public Map<String, CustomTypeSchema> getCustomTypeSchemaMap() {
        return Immutable.of(this.customTypeSchemaMap);
    }

    public static SchemaRegistry instance() {
        SchemaRegistry schemaRegistry;
        synchronized (SchemaRegistry.class) {
            if (instance == null) {
                instance = new SchemaRegistry();
            }
            schemaRegistry = instance;
        }
        return schemaRegistry;
    }

    public void clear() {
        this.modelSchemaMap.clear();
        this.customTypeSchemaMap.clear();
    }
}
