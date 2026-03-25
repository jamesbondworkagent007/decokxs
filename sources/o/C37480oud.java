package o;

import com.okinc.im.bean.SearchResultData;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37480oud implements InterfaceC35897oHt<SearchResultData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;I)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oHr;Ljava/lang/Object;)V */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(searchResultData, "");
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/oHr;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull SearchResultData searchResultData, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, searchResultData, list);
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.DQzvGN, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC35897oHt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean AEQbTJ(@NotNull SearchResultData searchResultData) {
        Intrinsics.checkNotNullParameter(searchResultData, "");
        return searchResultData instanceof SearchResultData.Divider;
    }

    /* JADX INFO: renamed from: o.oud$StateListAnimator */
    public final class StateListAnimator extends C35895oHr {
        public final /* synthetic */ C37480oud copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37480oud c37480oud, android.view.View view) {
            super(view.getContext(), view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = c37480oud;
        }
    }
}
