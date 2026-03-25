package o;

import o.AbstractC5334Ns;

/* JADX INFO: renamed from: o.Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5334Ns<CHILD extends AbstractC5334Ns<CHILD, TranscodeType>, TranscodeType> implements java.lang.Cloneable {
    public InterfaceC5463Sr<? super TranscodeType> EZpvd = C5459Sn.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5463Sr<? super TranscodeType> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof AbstractC5334Ns) {
            return SI.AEQbTJ(this.EZpvd, ((AbstractC5334Ns) obj).EZpvd);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC5463Sr<? super TranscodeType> interfaceC5463Sr = this.EZpvd;
        if (interfaceC5463Sr != null) {
            return interfaceC5463Sr.hashCode();
        }
        return 0;
    }
}
