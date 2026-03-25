package o;

import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56959yYr {
    void AEQbTJ(boolean z);

    void AYXKKw(boolean z);

    void AhwBna(boolean z);

    boolean AkhnZx();

    java.util.Set<C56933yXs> DbNXlk();

    AnnotationArgumentsRenderingPolicy EZpvd();

    void EZpvd(@NotNull java.util.Set<C56933yXs> set);

    void EZpvd(@NotNull yXY yxy);

    void EZpvd(boolean z);

    void KWHzl(boolean z);

    void OLrzqt(@NotNull java.util.Set<? extends DescriptorRendererModifier> set);

    void OLrzqt(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void OLrzqt(@NotNull RenderingFormat renderingFormat);

    void OLrzqt(boolean z);

    void copydefault(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void copydefault(boolean z);

    void djBIcL(boolean z);

    boolean djBIcL();

    /* JADX INFO: renamed from: o.yYr$Application */
    public static final class Application {
        public static boolean EZpvd(@NotNull InterfaceC56959yYr interfaceC56959yYr) {
            return interfaceC56959yYr.EZpvd().getIncludeAnnotationArguments();
        }

        public static boolean AEQbTJ(@NotNull InterfaceC56959yYr interfaceC56959yYr) {
            return interfaceC56959yYr.EZpvd().getIncludeEmptyAnnotationArguments();
        }
    }
}
