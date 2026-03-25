package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56745yQt extends AbstractC56740yQo implements yTP {
    public final java.lang.annotation.Annotation KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56745yQt(C56935yXu c56935yXu, @NotNull java.lang.annotation.Annotation annotation) {
        super(c56935yXu, null);
        Intrinsics.checkNotNullParameter(annotation, "");
        this.KWHzl = annotation;
    }

    @Override // o.yTP
    public yTO OLrzqt() {
        return new C56741yQp(this.KWHzl);
    }
}
