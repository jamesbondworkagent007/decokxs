package o;

import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import com.okinc.unify_trade.biz.DexInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qPT {
    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void AEQbTJ(boolean z);

    void AYXKKw(@NotNull java.lang.String str);

    void AhwBna(@NotNull java.lang.String str);

    void AkhnZx(@NotNull java.lang.String str);

    void DbNXlk(@NotNull java.lang.String str);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull NavSearchMode navSearchMode);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    void KWHzl(@NotNull C48915ueg c48915ueg, @NotNull java.lang.String str);

    void OLrzqt(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool);

    void OLrzqt(android.view.View view, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull DexInstrument dexInstrument);

    void copydefault(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument);

    void copydefault(@NotNull android.view.View view, @NotNull java.lang.String str);

    void copydefault(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder);

    void copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void djBIcL(java.lang.String str);

    void fJNWhG();

    void fetchVPNInfo(@NotNull java.lang.String str);

    void gEmmrt(@NotNull java.lang.String str);

    void getFieldNames();

    void hDKMBd();

    void isConnected(@NotNull java.lang.String str);

    void iwGUEr();

    void values(@NotNull java.lang.String str);

    public static final class ActionBar {
        public static /* synthetic */ void trackOptionTokenListFullButtonClick$default(qPT qpt, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackOptionTokenListFullButtonClick");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            qpt.djBIcL(str);
        }
    }
}
