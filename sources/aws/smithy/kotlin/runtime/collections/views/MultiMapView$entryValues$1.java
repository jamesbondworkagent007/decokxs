package aws.smithy.kotlin.runtime.collections.views;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C56779yS;
import o.C58214yx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc, KSrc, KDest] */
/* JADX INFO: loaded from: classes21.dex */
public final class MultiMapView$entryValues$1<KDest, KSrc, VDest, VSrc> extends Lambda implements Function1<Map.Entry<? extends KSrc, ? extends VSrc>, C58214yx<KDest, VDest>> {
    final /* synthetic */ C56779yS<KSrc, KDest, VSrc, VDest> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMapView$entryValues$1(C56779yS<KSrc, KDest, VSrc, VDest> c56779yS) {
        super(1);
        this.this$0 = c56779yS;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C58214yx<KDest, VDest> invoke(@NotNull Map.Entry<? extends KSrc, ? extends VSrc> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return new C58214yx<>(this.this$0.copydefault.invoke(entry.getKey()), this.this$0.gEmmrt.invoke(entry.getValue()));
    }
}
