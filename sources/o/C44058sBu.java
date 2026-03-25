package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44058sBu {
    public static final ActionBar Companion = new ActionBar(null);

    @yCM
    public C44058sBu() {
    }

    /* JADX INFO: renamed from: o.sBu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sBu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.List<SearchArticleDisplayModel> AEQbTJ() {
        java.lang.Iterable arrayList = SPUtils.getArrayList("KEY_SUPPORT_CENTER_SEARCH_HISTORY_LIST", SearchArticleDisplayModel.class);
        if (arrayList == null) {
            arrayList = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.AhwBna(arrayList, 5);
    }

    public final void EZpvd(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        java.util.List<SearchArticleDisplayModel> listAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((SearchArticleDisplayModel) obj).getSlug(), (java.lang.Object) searchArticleDisplayModel.getSlug())) {
                arrayList.add(obj);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        listFJNWhG.add(0, searchArticleDisplayModel);
        SPUtils.put("KEY_SUPPORT_CENTER_SEARCH_HISTORY_LIST", listFJNWhG);
    }
}
