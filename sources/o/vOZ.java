package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.unify_trade.bot.data.GridTipsItemData;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridReserveFundsTipsPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vOZ extends AbstractC49945uyC<AbstractC48614uXy, SpotGridReserveFundsTipsPresenter> {
    public final int KWHzl = C48033uCm.Activity.Dfv;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
    }

    private final void copydefault() {
        this.copydefault.register(GridTipsItemData.class, new vSM());
        values().AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        values().AEQbTJ.setAdapter(this.copydefault);
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) OLrzqt().EZpvd());
    }
}
