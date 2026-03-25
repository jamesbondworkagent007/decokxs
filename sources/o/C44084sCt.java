package o;

import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44084sCt {
    @yCM
    public C44084sCt() {
    }

    public final java.util.List<FormElementDisplayModel> AEQbTJ(@NotNull java.util.List<FormElementDisplayModel> list, @NotNull java.util.List<FormElementDisplayModel> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return list2.isEmpty() ? list : copydefault(list, list2);
    }

    public final java.util.List<FormElementDisplayModel> copydefault(java.util.List<FormElementDisplayModel> list, java.util.List<FormElementDisplayModel> list2) {
        java.util.Iterator<FormElementDisplayModel> it = list.iterator();
        int iAuCTel = 0;
        while (true) {
            if (!it.hasNext()) {
                iAuCTel = -1;
                break;
            }
            if (it.next().djBIcL() == FormElementViewType.Attachment) {
                break;
            }
            iAuCTel++;
        }
        if (iAuCTel < 0) {
            iAuCTel = yDY.AuCTel(list);
        }
        java.util.List<FormElementDisplayModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        listFJNWhG.addAll(iAuCTel + 1, list2);
        return listFJNWhG;
    }

    public final java.util.List<FormElementDisplayModel> AEQbTJ(@NotNull java.util.List<FormElementDisplayModel> list, @NotNull FormElementDisplayModel formElementDisplayModel) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (FormElementDisplayModel formElementDisplayModel2 : list) {
            if (Intrinsics.EZpvd((java.lang.Object) formElementDisplayModel2.KWHzl(), (java.lang.Object) formElementDisplayModel.KWHzl())) {
                formElementDisplayModel2 = formElementDisplayModel;
            }
            arrayList.add(formElementDisplayModel2);
        }
        return arrayList;
    }
}
