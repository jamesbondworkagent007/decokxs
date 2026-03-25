package com.amplifyframework.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PropertyPathMetadata {
    private final boolean isCollection;
    private final String name;
    private final PropertyPath parent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PropertyPathMetadata copy$default(PropertyPathMetadata propertyPathMetadata, String str, boolean z, PropertyPath propertyPath, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyPathMetadata.name;
        }
        if ((i & 2) != 0) {
            z = propertyPathMetadata.isCollection;
        }
        if ((i & 4) != 0) {
            propertyPath = propertyPathMetadata.parent;
        }
        return propertyPathMetadata.copy(str, z, propertyPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isCollection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PropertyPath component3() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PropertyPathMetadata copy(@NotNull String str, boolean z, PropertyPath propertyPath) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PropertyPathMetadata(str, z, propertyPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyPathMetadata)) {
            return false;
        }
        PropertyPathMetadata propertyPathMetadata = (PropertyPathMetadata) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) propertyPathMetadata.name) && this.isCollection == propertyPathMetadata.isCollection && Intrinsics.EZpvd(this.parent, propertyPathMetadata.parent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PropertyPath getParent() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        boolean z = this.isCollection;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        PropertyPath propertyPath = this.parent;
        return (((iHashCode * 31) + r1) * 31) + (propertyPath == null ? 0 : propertyPath.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCollection() {
        return this.isCollection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PropertyPathMetadata(name=" + this.name + ", isCollection=" + this.isCollection + ", parent=" + this.parent + ")";
    }

    public PropertyPathMetadata(@NotNull String str, boolean z, PropertyPath propertyPath) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.isCollection = z;
        this.parent = propertyPath;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:com.amplifyframework.core.model.PropertyPath:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.core.model.PropertyPath) : (r3v0 com.amplifyframework.core.model.PropertyPath))
 A[MD:(java.lang.String, boolean, com.amplifyframework.core.model.PropertyPath):void (m)] (LINE:43) call: com.amplifyframework.core.model.PropertyPathMetadata.<init>(java.lang.String, boolean, com.amplifyframework.core.model.PropertyPath):void type: THIS */
    public /* synthetic */ PropertyPathMetadata(String str, boolean z, PropertyPath propertyPath, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : propertyPath);
    }
}
