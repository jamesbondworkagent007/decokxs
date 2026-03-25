package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.znC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59760znC implements InterfaceC59575zjd {
    public InterfaceC59517ziY AEQbTJ;
    public C59771znN EZpvd;
    public final InterfaceC59574zjc KWHzl;
    public final InterfaceC59773znP OLrzqt;
    public org.apache.http.util.CharArrayBuffer copydefault;

    public C59760znC(InterfaceC59574zjc interfaceC59574zjc, InterfaceC59773znP interfaceC59773znP) {
        this.AEQbTJ = null;
        this.copydefault = null;
        this.EZpvd = null;
        this.KWHzl = (InterfaceC59574zjc) C59851zoo.AEQbTJ(interfaceC59574zjc, "Header iterator");
        this.OLrzqt = (InterfaceC59773znP) C59851zoo.AEQbTJ(interfaceC59773znP, "Parser");
    }

    public C59760znC(InterfaceC59574zjc interfaceC59574zjc) {
        this(interfaceC59574zjc, C59761znD.EZpvd);
    }

    public final void AEQbTJ() {
        this.EZpvd = null;
        this.copydefault = null;
        while (this.KWHzl.hasNext()) {
            InterfaceC59518ziZ interfaceC59518ziZOLrzqt = this.KWHzl.OLrzqt();
            if (interfaceC59518ziZOLrzqt instanceof InterfaceC59516ziX) {
                InterfaceC59516ziX interfaceC59516ziX = (InterfaceC59516ziX) interfaceC59518ziZOLrzqt;
                org.apache.http.util.CharArrayBuffer buffer = interfaceC59516ziX.getBuffer();
                this.copydefault = buffer;
                C59771znN c59771znN = new C59771znN(0, buffer.length());
                this.EZpvd = c59771znN;
                c59771znN.EZpvd(interfaceC59516ziX.getValuePos());
                return;
            }
            java.lang.String value = interfaceC59518ziZOLrzqt.getValue();
            if (value != null) {
                org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(value.length());
                this.copydefault = charArrayBuffer;
                charArrayBuffer.append(value);
                this.EZpvd = new C59771znN(0, this.copydefault.length());
                return;
            }
        }
    }

    public final void EZpvd() {
        InterfaceC59517ziY interfaceC59517ziYAEQbTJ;
        loop0: while (true) {
            if (!this.KWHzl.hasNext() && this.EZpvd == null) {
                return;
            }
            C59771znN c59771znN = this.EZpvd;
            if (c59771znN == null || c59771znN.copydefault()) {
                AEQbTJ();
            }
            if (this.EZpvd != null) {
                while (!this.EZpvd.copydefault()) {
                    interfaceC59517ziYAEQbTJ = this.OLrzqt.AEQbTJ(this.copydefault, this.EZpvd);
                    if (interfaceC59517ziYAEQbTJ.copydefault().length() != 0 || interfaceC59517ziYAEQbTJ.KWHzl() != null) {
                        break loop0;
                    }
                }
                if (this.EZpvd.copydefault()) {
                    this.EZpvd = null;
                    this.copydefault = null;
                }
            }
        }
        this.AEQbTJ = interfaceC59517ziYAEQbTJ;
    }

    @Override // o.InterfaceC59575zjd, java.util.Iterator
    public boolean hasNext() {
        if (this.AEQbTJ == null) {
            EZpvd();
        }
        return this.AEQbTJ != null;
    }

    @Override // o.InterfaceC59575zjd
    public InterfaceC59517ziY KWHzl() throws NoSuchElementException {
        if (this.AEQbTJ == null) {
            EZpvd();
        }
        InterfaceC59517ziY interfaceC59517ziY = this.AEQbTJ;
        if (interfaceC59517ziY == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        this.AEQbTJ = null;
        return interfaceC59517ziY;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws NoSuchElementException {
        return KWHzl();
    }

    @Override // java.util.Iterator
    public void remove() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }
}
