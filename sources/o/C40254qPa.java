package o;

import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40254qPa implements qPP {
    public java.lang.String AEQbTJ;
    public NavSearchMode KWHzl = NavSearchMode.BIZ_MODE;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPP
    public java.lang.String AubY() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qPP
    public NavSearchMode AwvSrB() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull NavSearchMode navSearchMode) {
        Intrinsics.checkNotNullParameter(navSearchMode, "");
        this.KWHzl = navSearchMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str, java.lang.String str2) {
        this.copydefault = str;
        this.AEQbTJ = str2;
    }

    @Override // o.qPP
    public kotlin.Pair<java.lang.String, java.lang.String> zLjUOn() {
        return C56390yDp.OLrzqt(this.copydefault, this.AEQbTJ);
    }
}
