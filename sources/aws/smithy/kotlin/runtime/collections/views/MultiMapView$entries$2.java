package aws.smithy.kotlin.runtime.collections.views;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56671yO;
import o.C56779yS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc, KSrc, KDest] */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MultiMapView$entries$2<KDest, KSrc, VDest, VSrc> extends FunctionReferenceImpl implements Function1<Map.Entry<? extends KDest, ? extends List<? extends VDest>>, C56671yO<KDest, KSrc, List<? extends VDest>, List<? extends VSrc>>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiMapView$entries$2(Object obj) {
        super(1, obj, C56779yS.class, "revEntryView", "revEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/EntryView;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C56671yO<KDest, KSrc, List<VDest>, List<VSrc>> invoke(@NotNull Map.Entry<? extends KDest, ? extends List<? extends VDest>> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return ((C56779yS) this.receiver).OLrzqt((Map.Entry) entry);
    }
}
