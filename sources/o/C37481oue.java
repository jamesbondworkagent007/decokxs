package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37481oue implements InterfaceC35897oHt<SearchResultData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nNR nnrOLrzqt = nNR.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nnrOLrzqt, "");
        return new Activity(this, nnrOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
        if ((c35895oHr instanceof Activity) && (searchResultData instanceof SearchResultData.Header)) {
            ((Activity) c35895oHr).EZpvd((SearchResultData.Header) searchResultData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.Header;
    }

    /* JADX INFO: renamed from: o.oue$Activity */
    public final class Activity extends C35895oHr {
        public final nNR KWHzl;
        public final /* synthetic */ C37481oue OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C37481oue c37481oue, nNR nnr) {
            super(nnr.getRoot().getContext(), nnr.getRoot());
            Intrinsics.checkNotNullParameter(nnr, "");
            this.OLrzqt = c37481oue;
            this.KWHzl = nnr;
        }

        public final void EZpvd(@NotNull SearchResultData.Header header) {
            Intrinsics.checkNotNullParameter(header, "");
            this.KWHzl.OLrzqt.setText(header.getTitle());
        }
    }
}
