package aws.smithy.kotlin.runtime.collections.views;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56671yO;
import o.C56833yU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [VDest, VSrc, KSrc, KDest] */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class MapView$entries$1<KDest, KSrc, VDest, VSrc> extends FunctionReferenceImpl implements Function1<Map.Entry<? extends KSrc, ? extends VSrc>, C56671yO<KSrc, KDest, VSrc, VDest>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MapView$entries$1(Object obj) {
        super(1, obj, C56833yU.class, "fwdEntryView", "fwdEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/EntryView;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C56671yO<KSrc, KDest, VSrc, VDest> invoke(@NotNull Map.Entry<? extends KSrc, ? extends VSrc> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return ((C56833yU) this.receiver).OLrzqt(entry);
    }
}
