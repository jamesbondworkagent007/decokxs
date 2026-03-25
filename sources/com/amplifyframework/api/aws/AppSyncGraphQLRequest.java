package com.amplifyframework.api.aws;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.SelectionSet;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.api.graphql.Operation;
import com.amplifyframework.api.graphql.OperationType;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.util.Casing;
import com.amplifyframework.util.Immutable;
import com.amplifyframework.util.Wrap;
import com.ibm.icu.text.DateFormat;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AppSyncGraphQLRequest<R> extends GraphQLRequest<R> {
    private final AuthModeStrategyType authModeStrategyType;
    private final AuthorizationType authorizationType;
    private final ModelSchema modelSchema;
    private final Operation operation;
    private final SelectionSet selectionSet;
    private final Map<String, String> variableTypes;
    private final Map<String, Object> variables;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthModeStrategyType getAuthModeStrategyType() {
        return this.authModeStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthorizationType getAuthorizationType() {
        return this.authorizationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModelSchema getModelSchema() {
        return this.modelSchema;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Operation getOperation() {
        return this.operation;
    }

    private AppSyncGraphQLRequest(Builder builder) {
        super(builder.responseType, new GsonVariablesSerializer());
        this.modelSchema = builder.modelSchema;
        this.operation = builder.operation;
        this.selectionSet = builder.selectionSet;
        this.variables = Immutable.of(builder.variables);
        this.variableTypes = Immutable.of(builder.variableTypes);
        this.authorizationType = builder.authorizationType;
        this.authModeStrategyType = builder.authModeStrategyType;
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public Map<String, Object> getVariables() {
        return Immutable.of(this.variables);
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.AppSyncGraphQLRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$graphql$OperationType;

        static {
            int[] iArr = new int[OperationType.values().length];
            $SwitchMap$com$amplifyframework$api$graphql$OperationType = iArr;
            try {
                iArr[OperationType.QUERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$graphql$OperationType[OperationType.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$graphql$OperationType[OperationType.MUTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ModelOperation getAuthRuleOperation() {
        int i = AnonymousClass1.$SwitchMap$com$amplifyframework$api$graphql$OperationType[getOperation().getOperationType().ordinal()];
        if (i == 1 || i == 2) {
            return ModelOperation.READ;
        }
        if (i == 3) {
            return ModelOperation.valueOf(((MutationType) getOperation()).name());
        }
        throw new IllegalArgumentException("Invalid graphql operation type:" + getOperation().getOperationType());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getQuery() {
        String strInParentheses;
        String strInParentheses2;
        if (this.variableTypes.size() > 0) {
            ArrayList<String> arrayList = new ArrayList(this.variableTypes.keySet());
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (String str : arrayList) {
                arrayList2.add("$" + str + ": " + this.variableTypes.get(str));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": $");
                sb.append(str);
                arrayList3.add(sb.toString());
            }
            strInParentheses2 = Wrap.inParentheses(TextUtils.join(", ", arrayList2));
            strInParentheses = Wrap.inParentheses(TextUtils.join(", ", arrayList3));
        } else {
            strInParentheses = "";
            strInParentheses2 = strInParentheses;
        }
        String strCapitalizeFirst = Casing.capitalizeFirst(this.modelSchema.getName());
        String strCapitalizeFirst2 = (this.modelSchema.getPluralName() != null && !this.modelSchema.getPluralName().isEmpty()) ? Casing.capitalizeFirst(this.modelSchema.getPluralName()) : strCapitalizeFirst + DateFormat.SECOND;
        if (QueryType.LIST.equals(this.operation)) {
            strCapitalizeFirst = (this.modelSchema.getListPluralName() == null || this.modelSchema.getListPluralName().isEmpty()) ? strCapitalizeFirst2 : Casing.capitalizeFirst(this.modelSchema.getListPluralName());
        } else if (QueryType.SYNC.equals(this.operation)) {
            if (this.modelSchema.getSyncPluralName() != null && !this.modelSchema.getSyncPluralName().isEmpty()) {
                strCapitalizeFirst = Casing.capitalizeFirst(this.modelSchema.getSyncPluralName());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Casing.CaseType caseType = Casing.CaseType.SCREAMING_SNAKE_CASE;
        sb2.append(Casing.from(caseType).to(Casing.CaseType.CAMEL_CASE).convert(this.operation.toString()));
        sb2.append(strCapitalizeFirst);
        sb2.append(strInParentheses);
        sb2.append(this.selectionSet.toString("  "));
        return this.operation.getOperationType().getName() + " " + Casing.from(caseType).to(Casing.CaseType.PASCAL_CASE).convert(this.operation.toString()) + strCapitalizeFirst + strInParentheses2 + Wrap.inPrettyBraces(sb2.toString(), "", "  ") + "\n";
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AppSyncGraphQLRequest.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        AppSyncGraphQLRequest appSyncGraphQLRequest = (AppSyncGraphQLRequest) obj;
        return ObjectsCompat.equals(this.modelSchema, appSyncGraphQLRequest.modelSchema) && ObjectsCompat.equals(this.operation, appSyncGraphQLRequest.operation) && ObjectsCompat.equals(this.selectionSet, appSyncGraphQLRequest.selectionSet) && ObjectsCompat.equals(this.variables, appSyncGraphQLRequest.variables) && ObjectsCompat.equals(this.variableTypes, appSyncGraphQLRequest.variableTypes);
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public int hashCode() {
        int iHashCode = super.hashCode();
        return ObjectsCompat.hash(Integer.valueOf(iHashCode), this.modelSchema, this.operation, this.selectionSet, this.variables, this.variableTypes);
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest
    public String toString() {
        return "AppSyncGraphQLRequest{modelSchema=" + this.modelSchema + ", operation=" + this.operation + ", selectionSet=" + this.selectionSet + ", variables=" + this.variables + ", variableTypes=" + this.variableTypes + ", responseType=" + getResponseType() + ", variablesSerializer=" + getVariablesSerializer() + AbstractJsonLexerKt.END_OBJ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static final class Builder {
        private AuthModeStrategyType authModeStrategyType;
        private AuthorizationType authorizationType;
        private Class<? extends Model> modelClass;
        private ModelSchema modelSchema;
        private Operation operation;
        private GraphQLRequestOptions requestOptions;
        private Type responseType;
        private SelectionSet selectionSet;
        private final Map<String, String> variableTypes;
        private final Map<String, Object> variables;

        public Builder() {
            this.variables = new HashMap();
            this.variableTypes = new HashMap();
        }

        public <R> Builder(AppSyncGraphQLRequest<R> appSyncGraphQLRequest) {
            this.modelSchema = ((AppSyncGraphQLRequest) appSyncGraphQLRequest).modelSchema;
            this.operation = ((AppSyncGraphQLRequest) appSyncGraphQLRequest).operation;
            this.responseType = appSyncGraphQLRequest.getResponseType();
            this.selectionSet = new SelectionSet(((AppSyncGraphQLRequest) appSyncGraphQLRequest).selectionSet);
            this.variables = new HashMap(((AppSyncGraphQLRequest) appSyncGraphQLRequest).variables);
            this.variableTypes = new HashMap(((AppSyncGraphQLRequest) appSyncGraphQLRequest).variableTypes);
            this.authorizationType = ((AppSyncGraphQLRequest) appSyncGraphQLRequest).authorizationType;
            this.authModeStrategyType = ((AppSyncGraphQLRequest) appSyncGraphQLRequest).authModeStrategyType;
        }

        public Builder modelSchema(@NonNull ModelSchema modelSchema) {
            Objects.requireNonNull(modelSchema);
            this.modelSchema = modelSchema;
            return this;
        }

        public Builder modelClass(@NonNull Class<? extends Model> cls) {
            Objects.requireNonNull(cls);
            this.modelClass = cls;
            return this;
        }

        public Builder operation(@NonNull Operation operation) {
            Objects.requireNonNull(operation);
            this.operation = operation;
            return this;
        }

        public Builder requestOptions(@NonNull GraphQLRequestOptions graphQLRequestOptions) {
            Objects.requireNonNull(graphQLRequestOptions);
            this.requestOptions = graphQLRequestOptions;
            return this;
        }

        public Builder responseType(@NonNull Type type) {
            Objects.requireNonNull(type);
            this.responseType = type;
            return this;
        }

        public Builder selectionSet(@NonNull SelectionSet selectionSet) {
            Objects.requireNonNull(selectionSet);
            this.selectionSet = selectionSet;
            return this;
        }

        public Builder authorizationType(@NonNull AuthorizationType authorizationType) {
            Objects.requireNonNull(authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        public Builder requestAuthorizationStrategyType(@NonNull AuthModeStrategyType authModeStrategyType) {
            Objects.requireNonNull(authModeStrategyType);
            this.authModeStrategyType = authModeStrategyType;
            return this;
        }

        public Builder variable(@NonNull String str, String str2, Object obj) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            this.variables.put(str, obj);
            this.variableTypes.put(str, str2);
            return this;
        }

        public <R> AppSyncGraphQLRequest<R> build() throws AmplifyException {
            Objects.requireNonNull(this.operation);
            Objects.requireNonNull(this.responseType);
            if (this.modelSchema == null) {
                Class<? extends Model> cls = this.modelClass;
                if (cls == null) {
                    throw new AmplifyException("Both modelSchema and modelClass cannot be null", "Sorry, we don't have a suggested fix for this error yet.");
                }
                this.modelSchema = ModelSchema.fromModelClass(cls);
            }
            if (this.selectionSet == null) {
                SelectionSet.Builder builderOperation = SelectionSet.builder().modelSchema(this.modelSchema).modelClass(this.modelClass).operation(this.operation);
                GraphQLRequestOptions graphQLRequestOptions = this.requestOptions;
                Objects.requireNonNull(graphQLRequestOptions);
                this.selectionSet = builderOperation.requestOptions(graphQLRequestOptions).build();
            }
            if (this.authModeStrategyType == null || this.authorizationType != null) {
                this.authModeStrategyType = AuthModeStrategyType.DEFAULT;
            }
            return new AppSyncGraphQLRequest<>(this);
        }
    }
}
