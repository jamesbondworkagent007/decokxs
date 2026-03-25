package o;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C27869kGi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27923kIi extends kIY {
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.kIj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C27923kIi.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kIY
    public Function1<WatchListData, java.lang.Boolean> AuCTel() {
        return new Function1() { // from class: o.kIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C27923kIi.KWHzl((WatchListData) obj));
            }
        };
    }

    @Override // o.kIY
    public boolean fARcdN() {
        return false;
    }

    public final qZP ejfBZ() {
        return (qZP) this.fIwbmz.getValue();
    }

    public static final qZP copydefault(C27923kIi c27923kIi) {
        qZP qzpAEQbTJ = qZP.AEQbTJ(c27923kIi.requireView());
        Intrinsics.checkNotNullExpressionValue(qzpAEQbTJ, "");
        return qzpAEQbTJ;
    }

    @Override // o.kIY
    public void OLrzqt(@NotNull java.util.List<C27869kGi.ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.widget.LinearLayout linearLayout = ejfBZ().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(list.size() != 1 ? 0 : 8);
        super.OLrzqt(list);
    }

    @Override // o.kIY, o.AbstractC27806kEY, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
    }

    public static final boolean KWHzl(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return !Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN");
    }

    @Override // o.kIY, o.AbstractC27806kEY
    public void valueOf() {
        android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) ActivityC46706tcI.class);
        intent.putExtra("type", false);
        intent.putExtra("exclude_ids", "COIN");
        startActivity(intent);
    }
}
