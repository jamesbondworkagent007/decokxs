package aws.smithy.kotlin.runtime.collections.views;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56860yV;
import o.C56941yY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc, KSrc, KDest] */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MutableMapView$entries$2<KDest, KSrc, VDest, VSrc> extends FunctionReferenceImpl implements Function1<Map.Entry<KDest, VDest>, C56941yY<KDest, KSrc, VDest, VSrc>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableMapView$entries$2(Object obj) {
        super(1, obj, C56860yV.class, "revEntryView", "revEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C56941yY<KDest, KSrc, VDest, VSrc> invoke(@NotNull Map.Entry<KDest, VDest> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return ((C56860yV) this.receiver).EZpvd(entry);
    }
}
