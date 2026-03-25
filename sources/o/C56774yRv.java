package o;

import java.util.EnumMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56774yRv {
    public final EnumMap<AnnotationQualifierApplicabilityType, C56766yRn> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnumMap<AnnotationQualifierApplicabilityType, C56766yRn> KWHzl() {
        return this.AEQbTJ;
    }

    public C56774yRv(@NotNull EnumMap<AnnotationQualifierApplicabilityType, C56766yRn> enumMap) {
        Intrinsics.checkNotNullParameter(enumMap, "");
        this.AEQbTJ = enumMap;
    }

    public final C56766yRn AEQbTJ(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.AEQbTJ.get(annotationQualifierApplicabilityType);
    }
}
