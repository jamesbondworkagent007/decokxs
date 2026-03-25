package aws.smithy.kotlin.runtime.collections.views;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C56617yM;
import o.C56752yR;
import o.C56779yS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc] */
/* JADX INFO: loaded from: classes21.dex */
public final class MultiMapView$vListDest2Src$1<VDest, VSrc> extends Lambda implements Function1<List<? extends VDest>, C56752yR<VDest, VSrc>> {
    final /* synthetic */ C56779yS<KSrc, KDest, VSrc, VDest> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMapView$vListDest2Src$1(C56779yS<KSrc, KDest, VSrc, VDest> c56779yS) {
        super(1);
        this.this$0 = c56779yS;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C56752yR<VDest, VSrc> invoke(@NotNull List<? extends VDest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56617yM.copydefault(list, this.this$0.EZpvd, this.this$0.gEmmrt);
    }
}
