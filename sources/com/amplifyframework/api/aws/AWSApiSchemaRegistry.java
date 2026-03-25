package com.amplifyframework.api.aws;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSApiSchemaRegistry {
    private final InterfaceC56387yDm modelSchemaMap$delegate = C56392yDr.copydefault(new Function0<Map<String, ModelSchema>>() { // from class: com.amplifyframework.api.aws.AWSApiSchemaRegistry$modelSchemaMap$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ModelSchema> invoke() {
            return ModelProviderLocator.locate().modelSchemas();
        }
    });

    private final Map<String, ModelSchema> getModelSchemaMap() {
        Object value = this.modelSchemaMap$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (Map) value;
    }

    public final ModelSchema getModelSchemaForModelClass(@NotNull String str) throws ApiException {
        Intrinsics.checkNotNullParameter(str, "");
        ModelSchema modelSchema = getModelSchemaMap().get(str);
        if (modelSchema != null) {
            return modelSchema;
        }
        throw new ApiException("Model type of `" + str + "` not found.", "Please regenerate codegen models and verify the class is found in AmplifyModelProvider.");
    }

    public final <T extends Model> ModelSchema getModelSchemaForModelClass(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return getModelSchemaForModelClass(simpleName);
    }
}
