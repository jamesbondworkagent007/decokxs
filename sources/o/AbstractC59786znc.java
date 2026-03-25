package o;

import o.InterfaceC59581zjj;
import org.apache.http.HttpException;

/* JADX INFO: renamed from: o.znc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59786znc<T extends InterfaceC59581zjj> implements InterfaceC59807znx<T> {
    public final InterfaceC59770znM EZpvd;
    public final org.apache.http.util.CharArrayBuffer KWHzl;
    public final InterfaceC59808zny copydefault;

    public abstract void copydefault(T t) throws java.io.IOException;

    @java.lang.Deprecated
    public AbstractC59786znc(InterfaceC59808zny interfaceC59808zny, InterfaceC59770znM interfaceC59770znM, InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59808zny, "Session input buffer");
        this.copydefault = interfaceC59808zny;
        this.KWHzl = new org.apache.http.util.CharArrayBuffer(128);
        this.EZpvd = interfaceC59770znM == null ? C59766znI.copydefault : interfaceC59770znM;
    }

    @Override // o.InterfaceC59807znx
    public void KWHzl(T t) throws HttpException, java.io.IOException {
        C59851zoo.AEQbTJ(t, "HTTP message");
        copydefault(t);
        InterfaceC59574zjc interfaceC59574zjcHeaderIterator = t.headerIterator();
        while (interfaceC59574zjcHeaderIterator.hasNext()) {
            this.copydefault.copydefault(this.EZpvd.AEQbTJ(this.KWHzl, interfaceC59574zjcHeaderIterator.OLrzqt()));
        }
        this.KWHzl.clear();
        this.copydefault.copydefault(this.KWHzl);
    }
}
