package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18985fsj;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18986fsk {
    public static /* synthetic */ java.util.List buildDisplayTags$default(C18988fsm c18988fsm, android.content.Context context, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return KWHzl(c18988fsm, context, i, z);
    }

    public static final java.util.List<C18985fsj> KWHzl(@NotNull C18988fsm c18988fsm, @NotNull android.content.Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Integer numDjBIcL = c18988fsm.djBIcL();
        if (numDjBIcL != null && numDjBIcL.intValue() == 4) {
            C18985fsj.StateListAnimator stateListAnimator = C18985fsj.Companion;
            int i2 = C52761wXj.TaskDescription.zNQIcI;
            int i3 = C52761wXj.Activity.DQzvGN;
            arrayList.add(stateListAnimator.copydefault(context, i2, java.lang.Integer.valueOf(i3), C13754dXa.FragmentManager.OCdtug));
        }
        arrayList.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) C18985fsj.Companion.EZpvd(c18988fsm.valueOf(), z, context), i - arrayList.size()));
        return arrayList;
    }

    public static final java.lang.String copydefault(@NotNull java.util.List<C18985fsj> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String strCopydefault = ((C18985fsj) it.next()).copydefault();
            if (strCopydefault.length() <= 0) {
                strCopydefault = null;
            }
            if (strCopydefault != null) {
                arrayList.add(strCopydefault);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
    }
}
