package o;

import com.okinc.market.search.features.main.root.ui.viewmodel.SearchState;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40083qIs {
    public java.lang.String EZpvd = "";
    public final java.util.HashMap<java.lang.String, java.lang.String> KWHzl = new java.util.HashMap<>();
    public final java.util.ArrayList<Triple<java.lang.String, java.lang.String, java.lang.Boolean>> OLrzqt = new java.util.ArrayList<>();
    public final long AEQbTJ = java.lang.System.currentTimeMillis();
    public SearchState copydefault = SearchState.START;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<Triple<java.lang.String, java.lang.String, java.lang.Boolean>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SearchState searchState) {
        Intrinsics.checkNotNullParameter(searchState, "");
        this.copydefault = searchState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchState copydefault() {
        return this.copydefault;
    }
}
