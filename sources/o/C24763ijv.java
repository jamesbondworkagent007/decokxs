package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ijv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24763ijv extends AbstractC24758ijq {
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC24758ijq
    public void OLrzqt(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, final android.app.Activity activity, @NotNull final AbstractC23101hrq abstractC23101hrq, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Intrinsics.copydefault(activity, "");
        OLrzqt((LifecycleOwner) activity, abstractC23101hrq, new Function1() { // from class: o.ijA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24763ijv.AEQbTJ(fragmentManager, activity, abstractC23101hrq, booleanRef, function0, (InterfaceC22335hdS) obj);
            }
        });
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, AbstractC23101hrq abstractC23101hrq, Ref.BooleanRef booleanRef, Function0 function0, InterfaceC22335hdS interfaceC22335hdS) {
        Intrinsics.checkNotNullParameter(interfaceC22335hdS, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new C24744ijc(fragmentManager, activity, abstractC23101hrq, interfaceC22335hdS));
        if (interfaceC22335hdS instanceof CrossChainBridgeRulesData) {
            arrayList.add(new C24672iiJ(fragmentManager, activity, abstractC23101hrq, interfaceC22335hdS));
        }
        arrayList.add(new C24756ijo(fragmentManager, activity, abstractC23101hrq, interfaceC22335hdS));
        arrayList.add(new C24663iiA(fragmentManager, activity, abstractC23101hrq, interfaceC22335hdS));
        arrayList.add(new C24745ijd(fragmentManager, activity, abstractC23101hrq));
        arrayList.add(new C24670iiH(fragmentManager, activity, abstractC23101hrq));
        arrayList.add(new C24749ijh(fragmentManager, activity, abstractC23101hrq));
        arrayList.add(new C24675iiM(fragmentManager, activity, abstractC23101hrq));
        arrayList.add(new C24664iiB(fragmentManager, activity, abstractC23101hrq));
        arrayList.add(new C24676iiN(fragmentManager, activity, abstractC23101hrq));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            boolean zOLrzqt = ((AbstractC24712iix) it.next()).OLrzqt(function0, fragmentManager);
            booleanRef.element = zOLrzqt;
            if (zOLrzqt) {
                break;
            }
        }
        arrayList.clear();
        if (!booleanRef.element) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
