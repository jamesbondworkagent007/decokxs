package o;

/* JADX INFO: renamed from: o.yyA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58268yyA extends AbstractC58177ywP {
    public final InterfaceC58222yxH EZpvd;

    public C58268yyA(InterfaceC58222yxH interfaceC58222yxH) {
        this.EZpvd = interfaceC58222yxH;
    }

    @Override // o.AbstractC58177ywP
    public void KWHzl(InterfaceC58179ywR interfaceC58179ywR) {
        InterfaceC58217yxC interfaceC58217yxCCopydefault = C58215yxA.copydefault();
        interfaceC58179ywR.onSubscribe(interfaceC58217yxCCopydefault);
        try {
            this.EZpvd.run();
            if (interfaceC58217yxCCopydefault.isDisposed()) {
                return;
            }
            interfaceC58179ywR.onComplete();
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (!interfaceC58217yxCCopydefault.isDisposed()) {
                interfaceC58179ywR.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }
    }
}
