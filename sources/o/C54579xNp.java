package o;

import com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel;
import com.okinc.unify_trade.trade.core.config.TradeInit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54579xNp implements InterfaceC54572xNi {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final C54614xOx KWHzl;

    public C54579xNp(@NotNull C54614xOx c54614xOx) {
        Intrinsics.checkNotNullParameter(c54614xOx, "");
        this.KWHzl = c54614xOx;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xNo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54579xNp.AEQbTJ(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54579xNp.OLrzqt(this.KWHzl);
            }
        });
    }

    public final C54593xOc AEQbTJ() {
        return (C54593xOc) this.EZpvd.getValue();
    }

    public static final C54593xOc AEQbTJ(C54579xNp c54579xNp) {
        xNW xnwAEQbTJ = c54579xNp.KWHzl.AEQbTJ(TradeInit.Fragment.KWHzl);
        C54593xOc c54593xOc = xnwAEQbTJ instanceof C54593xOc ? (C54593xOc) xnwAEQbTJ : null;
        if (c54593xOc != null) {
            return c54593xOc;
        }
        throw new java.lang.IllegalStateException("DEX chains provider not initialized. This is a programming error!");
    }

    public final C54598xOh copydefault() {
        return (C54598xOh) this.AEQbTJ.getValue();
    }

    public static final C54598xOh OLrzqt(C54579xNp c54579xNp) {
        xNW xnwAEQbTJ = c54579xNp.KWHzl.AEQbTJ(TradeInit.PictureInPictureParams.OLrzqt);
        C54598xOh c54598xOh = xnwAEQbTJ instanceof C54598xOh ? (C54598xOh) xnwAEQbTJ : null;
        if (c54598xOh != null) {
            return c54598xOh;
        }
        throw new java.lang.IllegalStateException("DEX wallet provider not initialized. This is a programming error!");
    }

    @Override // o.InterfaceC54572xNi
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault().OLrzqt(str);
    }

    @Override // o.InterfaceC54572xNi
    public boolean EZpvd() {
        return copydefault().copydefault();
    }

    @Override // o.InterfaceC54572xNi
    public OKTDexChainInfoModel OLrzqt() {
        return AEQbTJ().OLrzqt();
    }

    @Override // o.InterfaceC54572xNi
    public java.lang.String KWHzl() {
        return copydefault().AEQbTJ();
    }
}
