package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import java.lang.ref.SoftReference;
import o.InterfaceC40391qUc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class qUT implements InterfaceC40391qUc<IndexTickersData> {
    public volatile SoftReference<java.util.Map<java.lang.String, IndexTickersData>> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public SoftReference<java.util.Map<java.lang.String, IndexTickersData>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public void OLrzqt(SoftReference<java.util.Map<java.lang.String, IndexTickersData>> softReference) {
        this.AEQbTJ = softReference;
    }

    public java.util.Map<java.lang.String, IndexTickersData> AEQbTJ() {
        return InterfaceC40391qUc.ActionBar.copydefault(this);
    }

    public void AEQbTJ(@NotNull java.util.Map<java.lang.String, IndexTickersData> map) {
        InterfaceC40391qUc.ActionBar.OLrzqt(this, map);
    }

    @yCM
    public qUT() {
    }
}
