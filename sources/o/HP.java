package o;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes14.dex */
public class HP extends HT<HP> {
    public final LinkedList<C5211Iz> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C5211Iz> EZpvd() {
        return this.EZpvd;
    }

    public HP() {
        super(null);
        this.EZpvd = new LinkedList<>();
    }

    public HP copydefault(C5211Iz c5211Iz) {
        this.EZpvd.add(c5211Iz);
        return this;
    }

    public HP AEQbTJ(byte[] bArr) {
        copydefault(KWHzl(bArr));
        return this;
    }

    public HW<HP> copydefault() {
        C5205It c5205It = new C5205It();
        copydefault(c5205It);
        return new HW<>(this, c5205It);
    }
}
