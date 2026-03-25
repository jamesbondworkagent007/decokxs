package aws.sdk.kotlin.services.rekognition.waiters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.AbstractC5734aC;
import o.C56406yEe;
import o.C5787aD;
import o.ListAdapter;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WaitersKt$waitUntilProjectVersionRunning$acceptors$1 extends Lambda implements Function1<ListAdapter, Boolean> {
    public static final WaitersKt$waitUntilProjectVersionRunning$acceptors$1 INSTANCE = new WaitersKt$waitUntilProjectVersionRunning$acceptors$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WaitersKt$waitUntilProjectVersionRunning$acceptors$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull ListAdapter listAdapter) {
        boolean z;
        AbstractC5734aC abstractC5734aCFetchVPNInfo;
        Intrinsics.checkNotNullParameter(listAdapter, "");
        List<C5787aD> listAEQbTJ = listAdapter.AEQbTJ();
        ArrayList arrayList = null;
        if (listAEQbTJ == null) {
            listAEQbTJ = null;
        }
        if (listAEQbTJ != null) {
            ArrayList arrayList2 = new ArrayList();
            for (C5787aD c5787aD : listAEQbTJ) {
                C56406yEe.KWHzl(arrayList2, yDY.OLrzqt((c5787aD == null || (abstractC5734aCFetchVPNInfo = c5787aD.fetchVPNInfo()) == null) ? null : abstractC5734aCFetchVPNInfo.AEQbTJ()));
            }
            arrayList = arrayList2;
        }
        Intrinsics.copydefault(arrayList, "");
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.EZpvd(it.next(), (Object) DebugCoroutineInfoImplKt.RUNNING)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
