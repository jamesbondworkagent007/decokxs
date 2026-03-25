package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.lang.ref.SoftReference;
import o.InterfaceC40391qUc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class qUQ implements InterfaceC40391qUc<TickersData> {
    public volatile SoftReference<java.util.Map<java.lang.String, TickersData>> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public SoftReference<java.util.Map<java.lang.String, TickersData>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public void OLrzqt(SoftReference<java.util.Map<java.lang.String, TickersData>> softReference) {
        this.EZpvd = softReference;
    }

    public void KWHzl(@NotNull java.util.Map<java.lang.String, TickersData> map) {
        InterfaceC40391qUc.ActionBar.OLrzqt(this, map);
    }

    public java.util.Map<java.lang.String, TickersData> OLrzqt() {
        return InterfaceC40391qUc.ActionBar.copydefault(this);
    }

    @yCM
    public qUQ() {
    }
}
