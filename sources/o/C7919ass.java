package o;

import com.immomo.mls.InitData;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.ass, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7919ass {
    public InterfaceC7915aso AEQbTJ;
    public long AYXKKw;
    public int EZpvd;
    public java.lang.String[] KWHzl;
    public java.lang.String OLrzqt;
    public Globals copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7919ass EZpvd(Globals globals) {
        this.copydefault = globals;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7919ass OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7919ass OLrzqt(InterfaceC7915aso interfaceC7915aso) {
        this.AEQbTJ = interfaceC7915aso;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7919ass copydefault(int i) {
        this.EZpvd = i;
        return this;
    }

    public C7919ass(InitData initData) {
        this.KWHzl = initData.copydefault;
        this.EZpvd = initData.OLrzqt;
        this.AYXKKw = initData.AEQbTJ;
    }
}
