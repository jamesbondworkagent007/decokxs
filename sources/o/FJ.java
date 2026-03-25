package o;

import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FJ implements XmlStreamReader {
    public FA EZpvd;
    public final FI KWHzl;
    public final yDQ<FA> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA OLrzqt() {
        return this.EZpvd;
    }

    public FJ(@NotNull FI fi) {
        Intrinsics.checkNotNullParameter(fi, "");
        this.KWHzl = fi;
        this.OLrzqt = new yDQ<>();
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA AEQbTJ() {
        FA faAYXKKw = this.OLrzqt.AYXKKw();
        if (faAYXKKw == null) {
            faAYXKKw = this.KWHzl.EZpvd();
        }
        this.EZpvd = faAYXKKw;
        return faAYXKKw;
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA copydefault(int i) {
        while (i > this.OLrzqt.size() && !this.KWHzl.AEQbTJ()) {
            yDQ<FA> ydq = this.OLrzqt;
            FA faEZpvd = this.KWHzl.EZpvd();
            Intrinsics.copydefault(faEZpvd);
            ydq.addLast(faEZpvd);
        }
        return (FA) FL.copydefault(this.OLrzqt, i - 1);
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public void EZpvd() {
        FA faCopydefault = copydefault(1);
        if (faCopydefault == null) {
            return;
        }
        AEQbTJ(faCopydefault.copydefault(), this, AEQbTJ());
    }

    public static final void AEQbTJ(int i, FJ fj, FA fa) {
        while (fa != null && !(fa instanceof FA.Activity)) {
            if ((fa instanceof FA.StateListAnimator) && ((FA.StateListAnimator) fa).copydefault() == i) {
                return;
            } else {
                fa = fj.AEQbTJ();
            }
        }
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public XmlStreamReader EZpvd(@NotNull XmlStreamReader.SubtreeStartDepth subtreeStartDepth) {
        Intrinsics.checkNotNullParameter(subtreeStartDepth, "");
        if (FE.AEQbTJ(copydefault(1), OLrzqt())) {
            AEQbTJ();
            return new FF(this);
        }
        return new FG(this, subtreeStartDepth);
    }
}
