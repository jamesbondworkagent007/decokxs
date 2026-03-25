package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.LoadedModelReferenceImpl;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelPostProcessingTypeAdapter implements TypeAdapterFactory {
    private final String apiName;
    private final AWSApiSchemaRegistry schemaRegistry;

    public ModelPostProcessingTypeAdapter(String str, @NotNull AWSApiSchemaRegistry aWSApiSchemaRegistry) {
        Intrinsics.checkNotNullParameter(aWSApiSchemaRegistry, "");
        this.apiName = str;
        this.schemaRegistry = aWSApiSchemaRegistry;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <M> TypeAdapter<M> create(@NotNull Gson gson, @NotNull TypeToken<M> typeToken) {
        Intrinsics.checkNotNullParameter(gson, "");
        Intrinsics.checkNotNullParameter(typeToken, "");
        final TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, typeToken);
        return new TypeAdapter<M>() { // from class: com.amplifyframework.api.aws.ModelPostProcessingTypeAdapter.create.1
            @Override // com.google.gson.TypeAdapter
            public void write(@NotNull JsonWriter jsonWriter, M m) throws IOException {
                Intrinsics.checkNotNullParameter(jsonWriter, "");
                delegateAdapter.write(jsonWriter, m);
            }

            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read */
            public M read2(@NotNull JsonReader jsonReader) throws IllegalAccessException, AmplifyException, NoSuchFieldException, IOException {
                Intrinsics.checkNotNullParameter(jsonReader, "");
                M m = delegateAdapter.read2(jsonReader);
                Model model = m instanceof Model ? (Model) m : null;
                if (model != null) {
                    injectLazyValues(model);
                }
                return m;
            }

            public final void injectLazyValues(@NotNull Model model) throws IllegalAccessException, AmplifyException, NoSuchFieldException {
                String str;
                Intrinsics.checkNotNullParameter(model, "");
                String simpleName = model.getClass().getSimpleName();
                ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(model.getClass());
                Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
                Map<String, ModelField> fields = modelSchemaFromModelClass.getFields();
                Intrinsics.checkNotNullExpressionValue(fields, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ModelField> entry : fields.entrySet()) {
                    if (entry.getValue().isModelList() || entry.getValue().isModelReference()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ModelPostProcessingTypeAdapter modelPostProcessingTypeAdapter = this;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Field declaredField = model.getClass().getDeclaredField((String) entry2.getKey());
                    declaredField.setAccessible(true);
                    if (declaredField.get(model) == null) {
                        ModelField modelField = (ModelField) entry2.getValue();
                        if (((ModelField) entry2.getValue()).isModelReference()) {
                            declaredField.set(model, new LoadedModelReferenceImpl(null));
                        } else if (((ModelField) entry2.getValue()).isModelList()) {
                            AWSApiSchemaRegistry aWSApiSchemaRegistry = modelPostProcessingTypeAdapter.schemaRegistry;
                            String targetType = modelField.getTargetType();
                            Intrinsics.checkNotNullExpressionValue(targetType, "");
                            ModelSchema modelSchemaForModelClass = aWSApiSchemaRegistry.getModelSchemaForModelClass(targetType);
                            for (ModelAssociation modelAssociation : modelSchemaForModelClass.getAssociations().values()) {
                                if (Intrinsics.EZpvd((Object) modelAssociation.getAssociatedType(), (Object) simpleName)) {
                                    String[] targetNames = modelAssociation.getTargetNames();
                                    List sortedIdentifiers = ModelPostProcessingTypeAdapterKt.getSortedIdentifiers(model);
                                    Intrinsics.copydefault(targetNames);
                                    ArrayList arrayList2 = new ArrayList(targetNames.length);
                                    int length = targetNames.length;
                                    int i = 0;
                                    int i2 = 0;
                                    while (i < length) {
                                        arrayList2.add(C56390yDp.OLrzqt(targetNames[i], sortedIdentifiers.get(i2)));
                                        i++;
                                        i2++;
                                        simpleName = simpleName;
                                    }
                                    str = simpleName;
                                    Map mapCopydefault = C56424yEw.copydefault(arrayList2);
                                    Class<? extends Model> modelClass = modelSchemaForModelClass.getModelClass();
                                    Intrinsics.checkNotNullExpressionValue(modelClass, "");
                                    declaredField.set(model, new ApiLazyModelList(modelClass, mapCopydefault, modelPostProcessingTypeAdapter.apiName, null, 8, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        str = simpleName;
                    } else {
                        str = simpleName;
                    }
                    arrayList.add(Unit.INSTANCE);
                    simpleName = str;
                }
            }
        };
    }
}
