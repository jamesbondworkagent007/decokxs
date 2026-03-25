package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51245vjQ {
    public final java.util.ArrayList<ProfitInfoItemData> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vjQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C51245vjQ copy$default(C51245vjQ c51245vjQ, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = c51245vjQ.KWHzl;
        }
        return c51245vjQ.AEQbTJ(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C51245vjQ AEQbTJ(@NotNull java.util.ArrayList<ProfitInfoItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new C51245vjQ(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ProfitInfoItemData> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51245vjQ) && Intrinsics.EZpvd(this.KWHzl, ((C51245vjQ) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MpStgyCopyProfitInfoData(lists=" + this.KWHzl + ")";
    }

    public C51245vjQ(@NotNull java.util.ArrayList<ProfitInfoItemData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.KWHzl = arrayList;
    }
}
