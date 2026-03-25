package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26664jgb {
    Flow<C26663jga> AEQbTJ();

    void AEQbTJ(@NotNull TokenSelectionParams tokenSelectionParams);

    Flow<java.util.List<C26608jfY>> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str, @NotNull TokenSelectionParams tokenSelectionParams);

    InvestTokenWithAmount copydefault(@NotNull C26608jfY c26608jfY);
}
