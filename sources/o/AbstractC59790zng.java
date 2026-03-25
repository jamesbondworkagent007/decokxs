package o;

import o.InterfaceC59581zjj;
import org.apache.http.HttpException;
import org.apache.http.MessageConstraintException;
import org.apache.http.ProtocolException;

/* JADX INFO: renamed from: o.zng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59790zng<T extends InterfaceC59581zjj> implements InterfaceC59806znw<T> {
    public final InterfaceC59758znA AYXKKw;
    public T AhwBna;
    public final java.util.List<org.apache.http.util.CharArrayBuffer> EZpvd;
    public final InterfaceC59769znL OLrzqt;
    public int djBIcL;
    public final C59549zjD gEmmrt;

    public abstract T OLrzqt(InterfaceC59758znA interfaceC59758znA) throws HttpException, org.apache.http.ParseException, java.io.IOException;

    @java.lang.Deprecated
    public AbstractC59790zng(InterfaceC59758znA interfaceC59758znA, InterfaceC59769znL interfaceC59769znL, InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        this.AYXKKw = interfaceC59758znA;
        this.gEmmrt = C59778znU.EZpvd(interfaceC59779znV);
        this.OLrzqt = interfaceC59769znL == null ? C59765znH.OLrzqt : interfaceC59769znL;
        this.EZpvd = new java.util.ArrayList();
        this.djBIcL = 0;
    }

    public static InterfaceC59518ziZ[] AEQbTJ(InterfaceC59758znA interfaceC59758znA, int i, int i2, InterfaceC59769znL interfaceC59769znL) throws HttpException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (interfaceC59769znL == null) {
            interfaceC59769znL = C59765znH.OLrzqt;
        }
        return copydefault(interfaceC59758znA, i, i2, interfaceC59769znL, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r8 = new o.InterfaceC59518ziZ[r12.size()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r5 >= r12.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r8[r5] = r11.KWHzl(r12.get(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        throw new org.apache.http.ProtocolException(r8.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC59518ziZ[] copydefault(InterfaceC59758znA interfaceC59758znA, int i, int i2, InterfaceC59769znL interfaceC59769znL, java.util.List<org.apache.http.util.CharArrayBuffer> list) throws HttpException, java.io.IOException {
        char cCharAt;
        C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
        C59851zoo.AEQbTJ(interfaceC59769znL, "Line parser");
        C59851zoo.AEQbTJ(list, "Header line list");
        org.apache.http.util.CharArrayBuffer charArrayBuffer = null;
        org.apache.http.util.CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer == null) {
                charArrayBuffer = new org.apache.http.util.CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            int i3 = 0;
            if (interfaceC59758znA.EZpvd(charArrayBuffer) == -1 || charArrayBuffer.length() < 1) {
                break;
            }
            if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == '\t') && charArrayBuffer2 != null) {
                while (i3 < charArrayBuffer.length() && ((cCharAt = charArrayBuffer.charAt(i3)) == ' ' || cCharAt == '\t')) {
                    i3++;
                }
                if (i2 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i3 > i2) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
                charArrayBuffer2.append(' ');
                charArrayBuffer2.append(charArrayBuffer, i3, charArrayBuffer.length() - i3);
            } else {
                list.add(charArrayBuffer);
                charArrayBuffer2 = charArrayBuffer;
                charArrayBuffer = null;
            }
            if (i > 0 && list.size() >= i) {
                throw new MessageConstraintException("Maximum header count exceeded");
            }
        }
    }

    @Override // o.InterfaceC59806znw
    public T KWHzl() throws HttpException, java.io.IOException {
        int i = this.djBIcL;
        if (i == 0) {
            try {
                this.AhwBna = (T) OLrzqt(this.AYXKKw);
                this.djBIcL = 1;
            } catch (org.apache.http.ParseException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        } else if (i != 1) {
            throw new java.lang.IllegalStateException("Inconsistent parser state");
        }
        this.AhwBna.setHeaders(copydefault(this.AYXKKw, this.gEmmrt.OLrzqt(), this.gEmmrt.AEQbTJ(), this.OLrzqt, this.EZpvd));
        T t = this.AhwBna;
        this.AhwBna = null;
        this.EZpvd.clear();
        this.djBIcL = 0;
        return t;
    }
}
