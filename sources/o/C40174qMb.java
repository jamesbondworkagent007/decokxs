package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40174qMb implements InterfaceC40516qYt {
    public final InterfaceC55797xqi AEQbTJ;
    public final SearchTradeBizInfo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40174qMb copy$default(C40174qMb c40174qMb, InterfaceC55797xqi interfaceC55797xqi, SearchTradeBizInfo searchTradeBizInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC55797xqi = c40174qMb.AEQbTJ;
        }
        if ((i & 2) != 0) {
            searchTradeBizInfo = c40174qMb.OLrzqt;
        }
        return c40174qMb.copydefault(interfaceC55797xqi, searchTradeBizInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchTradeBizInfo KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40174qMb copydefault(@NotNull InterfaceC55797xqi interfaceC55797xqi, @NotNull SearchTradeBizInfo searchTradeBizInfo) {
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        Intrinsics.checkNotNullParameter(searchTradeBizInfo, "");
        return new C40174qMb(interfaceC55797xqi, searchTradeBizInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC55797xqi copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40174qMb)) {
            return false;
        }
        C40174qMb c40174qMb = (C40174qMb) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c40174qMb.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c40174qMb.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavSearchHistoryItemVo(rawInstrument=" + this.AEQbTJ + ", rawHistoryPo=" + this.OLrzqt + ")";
    }

    public C40174qMb(@NotNull InterfaceC55797xqi interfaceC55797xqi, @NotNull SearchTradeBizInfo searchTradeBizInfo) {
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        Intrinsics.checkNotNullParameter(searchTradeBizInfo, "");
        this.AEQbTJ = interfaceC55797xqi;
        this.OLrzqt = searchTradeBizInfo;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (!(interfaceC40516qYt instanceof C40174qMb)) {
            return false;
        }
        InterfaceC55797xqi interfaceC55797xqi = this.AEQbTJ;
        if (interfaceC55797xqi instanceof BizInstrument) {
            InterfaceC55797xqi interfaceC55797xqi2 = ((C40174qMb) interfaceC40516qYt).AEQbTJ;
            if (interfaceC55797xqi2 instanceof BizInstrument) {
                return Intrinsics.EZpvd((java.lang.Object) ((BizInstrument) interfaceC55797xqi2).getInstId(), (java.lang.Object) ((BizInstrument) this.AEQbTJ).getInstId());
            }
        }
        if (!(interfaceC55797xqi instanceof DexInstrument)) {
            return false;
        }
        C40174qMb c40174qMb = (C40174qMb) interfaceC40516qYt;
        InterfaceC55797xqi interfaceC55797xqi3 = c40174qMb.AEQbTJ;
        return (interfaceC55797xqi3 instanceof DexInstrument) && Intrinsics.EZpvd((java.lang.Object) ((DexInstrument) interfaceC55797xqi3).getChainId(), (java.lang.Object) ((DexInstrument) this.AEQbTJ).getChainId()) && Intrinsics.EZpvd((java.lang.Object) ((DexInstrument) c40174qMb.AEQbTJ).getTokenContractAddress(), (java.lang.Object) ((DexInstrument) this.AEQbTJ).getTokenContractAddress());
    }
}
