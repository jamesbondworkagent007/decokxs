package aws.smithy.kotlin.runtime.collections.views;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56941yY;
import o.C59280ze;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc, KSrc, KDest] */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MutableMultiMapView$entries$1<KDest, KSrc, VDest, VSrc> extends FunctionReferenceImpl implements Function1<Map.Entry<KSrc, List<VSrc>>, C56941yY<KSrc, KDest, List<VSrc>, List<VDest>>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableMultiMapView$entries$1(Object obj) {
        super(1, obj, C59280ze.class, "fwdEntryView", "fwdEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C56941yY<KSrc, KDest, List<VSrc>, List<VDest>> invoke(@NotNull Map.Entry<KSrc, List<VSrc>> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return ((C59280ze) this.receiver).KWHzl((Map.Entry) entry);
    }
}
