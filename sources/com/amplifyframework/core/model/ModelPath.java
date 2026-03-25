package com.amplifyframework.core.model;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelException;
import java.lang.reflect.Field;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class ModelPath<ModelType extends Model> implements PropertyContainerPath {
    public static final Companion Companion = new Companion(null);
    private final boolean isCollection;
    private final Class<ModelType> modelType;
    private final String name;
    private final PropertyPath parent;

    public ModelPath(@NotNull String str, boolean z, PropertyPath propertyPath, @NotNull Class<ModelType> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        this.name = str;
        this.isCollection = z;
        this.parent = propertyPath;
        this.modelType = cls;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:com.amplifyframework.core.model.PropertyPath:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.core.model.PropertyPath) : (r3v0 com.amplifyframework.core.model.PropertyPath))
  (r4v0 java.lang.Class)
 A[MD:(java.lang.String, boolean, com.amplifyframework.core.model.PropertyPath, java.lang.Class<ModelType extends com.amplifyframework.core.model.Model>):void (m)] (LINE:77) call: com.amplifyframework.core.model.ModelPath.<init>(java.lang.String, boolean, com.amplifyframework.core.model.PropertyPath, java.lang.Class):void type: THIS */
    public /* synthetic */ ModelPath(String str, boolean z, PropertyPath propertyPath, Class cls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : propertyPath, cls);
    }

    @Override // com.amplifyframework.core.model.PropertyPath
    @InternalAmplifyApi
    public PropertyPathMetadata getMetadata() {
        return new PropertyPathMetadata(this.name, this.isCollection, this.parent);
    }

    @Override // com.amplifyframework.core.model.PropertyContainerPath
    @InternalAmplifyApi
    public Class<Model> getModelType() {
        Class<ModelType> cls = this.modelType;
        Intrinsics.copydefault(cls, "");
        return cls;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.core.model.ModelPath.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @InternalAmplifyApi
        public final <M extends Model, P extends ModelPath<M>> P getRootPath(@NotNull Class<M> cls) throws IllegalAccessException, ModelException.PropertyPathNotFound {
            Intrinsics.checkNotNullParameter(cls, "");
            try {
                Field declaredField = cls.getDeclaredField("rootPath");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                P p = obj instanceof ModelPath ? (P) obj : null;
                if (p != null) {
                    return p;
                }
                String simpleName = cls.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                throw new ModelException.PropertyPathNotFound(simpleName, null, 2, null);
            } catch (NoSuchFieldException unused) {
                String simpleName2 = cls.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "");
                throw new ModelException.PropertyPathNotFound(simpleName2, null, 2, null);
            }
        }
    }
}
