package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.lkO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30925lkO {
    public static final int copydefault = TokenBase.$stable;
    public final int AEQbTJ;
    public final TokenBase EZpvd;
    public final java.lang.String KWHzl;
    public final MemeStrategyType OLrzqt;
    public final TransactionType valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.okinc.business.dex.api.bean.TokenBase)
  (r2v0 com.okinc.business.dexlogic.bean.TransactionType)
  (r3v0 java.lang.String)
  (r4v0 com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType)
  (r5v0 int)
 A[MD:(com.okinc.business.dex.api.bean.TokenBase, com.okinc.business.dexlogic.bean.TransactionType, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType, int):void (m)] call: o.lkO.<init>(com.okinc.business.dex.api.bean.TokenBase, com.okinc.business.dexlogic.bean.TransactionType, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C30925lkO(TokenBase tokenBase, TransactionType transactionType, java.lang.String str, MemeStrategyType memeStrategyType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenBase, transactionType, str, memeStrategyType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeStrategyType copydefault() {
        return this.OLrzqt;
    }

    public C30925lkO(TokenBase tokenBase, TransactionType transactionType, java.lang.String str, MemeStrategyType memeStrategyType, int i) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeStrategyType, "");
        this.EZpvd = tokenBase;
        this.valueOf = transactionType;
        this.KWHzl = str;
        this.OLrzqt = memeStrategyType;
        this.AEQbTJ = i;
    }
}
