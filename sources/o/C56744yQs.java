package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56744yQs {
    public static final java.util.List<C56741yQp> EZpvd(@NotNull java.lang.annotation.Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(annotationArr.length);
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            arrayList.add(new C56741yQp(annotation));
        }
        return arrayList;
    }

    public static final C56741yQp KWHzl(@NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull C56933yXs c56933yXs) {
        java.lang.annotation.Annotation annotation;
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (Intrinsics.EZpvd(C56743yQr.AEQbTJ((java.lang.Class<?>) yHE.OLrzqt(yHE.OLrzqt(annotation))).AEQbTJ(), c56933yXs)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C56741yQp(annotation);
        }
        return null;
    }
}
