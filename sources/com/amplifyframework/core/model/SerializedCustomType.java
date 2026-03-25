package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class SerializedCustomType {
    private static final Logger LOGGER = Amplify.Logging.logger(CategoryType.DATASTORE, SerializedCustomType.class.getName());
    private final CustomTypeSchema customTypeSchema;
    private Map<String, Object> flatSerializedData;
    private final Map<String, Object> serializedData;

    public interface BuilderSteps {

        public interface BuildStep {
            SerializedCustomType build();
        }

        public interface CustomTypeSchemaStep {
            BuildStep customTypeSchema(@Nullable CustomTypeSchema customTypeSchema);
        }

        public interface SerializedDataStep {
            CustomTypeSchemaStep serializedData(@NonNull Map<String, Object> map);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomTypeSchema getCustomTypeSchema() {
        return this.customTypeSchema;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getSerializedData() {
        return this.serializedData;
    }

    private SerializedCustomType(Map<String, Object> map, CustomTypeSchema customTypeSchema) {
        this.serializedData = map;
        this.customTypeSchema = customTypeSchema;
    }

    public static BuilderSteps.SerializedDataStep builder() {
        return new Builder();
    }

    public static Map<String, Object> parseSerializedData(Map<String, Object> map, String str, SchemaRegistry schemaRegistry) {
        LOGGER.verbose(String.format("parseSerializedData: serializedData=%s, customTypeName=%s", map, str));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, CustomTypeField> entry : schemaRegistry.getCustomTypeSchemaForCustomTypeClass(str).getFields().entrySet()) {
            String key = entry.getKey();
            CustomTypeField value = entry.getValue();
            if (map.containsKey(key)) {
                Object obj = map.get(key);
                if (obj == null) {
                    map2.put(key, null);
                } else {
                    boolean zIsCustomType = value.isCustomType();
                    boolean zIsArray = value.isArray();
                    LOGGER.verbose(String.format("Deserializing field %s: isCustomType=%s, isArray=%s", key, Boolean.valueOf(zIsCustomType), Boolean.valueOf(zIsArray)));
                    if (!zIsCustomType) {
                        map2.put(key, obj);
                    } else if (zIsArray) {
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList();
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(builder().serializedData(parseSerializedData((Map) it.next(), value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                            }
                        }
                        map2.put(key, arrayList);
                    } else {
                        map2.put(key, builder().serializedData(parseSerializedData((Map) obj, value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                    }
                }
            }
        }
        return map2;
    }

    public Map<String, Object> getFlatSerializedData() {
        Map<String, Object> map = this.flatSerializedData;
        if (map != null) {
            return map;
        }
        LOGGER.verbose(String.format("getFlatSerializedData: serializedData=%s", this.serializedData));
        this.flatSerializedData = new HashMap();
        for (Map.Entry<String, Object> entry : this.serializedData.entrySet()) {
            CustomTypeField customTypeField = this.customTypeSchema.getFields().get(entry.getKey());
            if (customTypeField != null) {
                Object value = entry.getValue();
                LOGGER.verbose(String.format("Flattening field %s: isCustomType=%s, isArray=%s", customTypeField.getName(), Boolean.valueOf(customTypeField.isCustomType()), Boolean.valueOf(customTypeField.isArray())));
                if (customTypeField.isCustomType() && value != null) {
                    if (customTypeField.isArray()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((ArrayList) value).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SerializedCustomType) it.next()).getFlatSerializedData());
                        }
                        this.flatSerializedData.put(entry.getKey(), arrayList);
                    } else {
                        this.flatSerializedData.put(entry.getKey(), ((SerializedCustomType) value).getFlatSerializedData());
                    }
                } else {
                    this.flatSerializedData.put(entry.getKey(), value);
                }
            }
        }
        return this.flatSerializedData;
    }

    public Object getValue(ModelField modelField) {
        return this.serializedData.get(modelField.getName());
    }

    public String getCustomTypeName() {
        CustomTypeSchema customTypeSchema = this.customTypeSchema;
        if (customTypeSchema == null) {
            return null;
        }
        return customTypeSchema.getName();
    }

    public String toString() {
        return "SerializedCustomType{serializedData=" + this.serializedData + ", customTypeName=" + getCustomTypeSchema() + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SerializedCustomType.class != obj.getClass()) {
            return false;
        }
        SerializedCustomType serializedCustomType = (SerializedCustomType) obj;
        return ObjectsCompat.equals(this.serializedData, serializedCustomType.serializedData) && ObjectsCompat.equals(this.customTypeSchema, serializedCustomType.customTypeSchema);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.serializedData, this.customTypeSchema);
    }

    public static final class Builder implements BuilderSteps.SerializedDataStep, BuilderSteps.CustomTypeSchemaStep, BuilderSteps.BuildStep {
        private CustomTypeSchema customTypeSchema;
        private final Map<String, Object> serializedData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.CustomTypeSchemaStep
        public BuilderSteps.BuildStep customTypeSchema(@Nullable CustomTypeSchema customTypeSchema) {
            this.customTypeSchema = customTypeSchema;
            return this;
        }

        private Builder() {
            this.serializedData = new HashMap();
        }

        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.SerializedDataStep
        public BuilderSteps.CustomTypeSchemaStep serializedData(@NonNull Map<String, Object> map) {
            Map<String, Object> map2 = this.serializedData;
            Objects.requireNonNull(map);
            map2.putAll(map);
            return this;
        }

        @Override // com.amplifyframework.core.model.SerializedCustomType.BuilderSteps.BuildStep
        public SerializedCustomType build() {
            return new SerializedCustomType(Immutable.of(this.serializedData), this.customTypeSchema);
        }
    }
}
