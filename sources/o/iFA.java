package o;

import com.okinc.business.invest_biz.data.bean.HomeTokensItemData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFA implements iFD {
    public final iYX AEQbTJ;

    @yCM
    public iFA(@NotNull iYX iyx) {
        Intrinsics.checkNotNullParameter(iyx, "");
        this.AEQbTJ = iyx;
    }

    @Override // o.iFD
    public java.lang.Object EZpvd(@NotNull java.util.List<HomeTokensItemData> list, @NotNull Continuation<? super java.util.List<? extends InterfaceC27436jvE>> continuation) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(this.AEQbTJ.EZpvd("0", "", true, "", false));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C27359jth.copydefault((HomeTokensItemData) it.next()));
        }
        listOLrzqt.addAll(arrayList);
        listOLrzqt.add(new C27328jtC(C33070mpX.AYXKKw(C25493ixk.FragmentManager.QDqgQU)));
        listOLrzqt.add(new C27433jvB(C55298xhM.dp2pxFloat$default(20.0f, null, 1, null)));
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
