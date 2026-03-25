package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FG implements XmlStreamReader {
    public final int EZpvd;
    public final XmlStreamReader.SubtreeStartDepth OLrzqt;
    public final FJ copydefault;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XmlStreamReader.SubtreeStartDepth.values().length];
            try {
                iArr[XmlStreamReader.SubtreeStartDepth.CHILD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[XmlStreamReader.SubtreeStartDepth.CURRENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FG(@NotNull FJ fj, @NotNull XmlStreamReader.SubtreeStartDepth subtreeStartDepth) {
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(fj, "");
        Intrinsics.checkNotNullParameter(subtreeStartDepth, "");
        this.copydefault = fj;
        this.OLrzqt = subtreeStartDepth;
        int i = ActionBar.OLrzqt[subtreeStartDepth.ordinal()];
        if (i == 1) {
            FA faOLrzqt = OLrzqt();
            if (faOLrzqt != null) {
                numValueOf = java.lang.Integer.valueOf(faOLrzqt.copydefault() + 1);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            FA faOLrzqt2 = OLrzqt();
            numValueOf = faOLrzqt2 != null ? java.lang.Integer.valueOf(faOLrzqt2.copydefault()) : null;
        }
        if (numValueOf != null) {
            this.EZpvd = numValueOf.intValue();
            return;
        }
        FK fkKWHzl = this.copydefault.KWHzl.KWHzl();
        int iMax = java.lang.Math.max(0, fkKWHzl.copydefault - 3);
        int iMin = java.lang.Math.min(fkKWHzl.KWHzl - 1, fkKWHzl.copydefault + 3);
        java.lang.String strSubstring = fkKWHzl.EZpvd.substring(iMax, iMin + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new DeserializationException("Unable to determine depth of last node\n" + ("At offset " + fkKWHzl.copydefault + " (showing range " + iMax + '-' + iMin + "):\n" + FH.OLrzqt.replace(strSubstring, "·") + '\n' + (C59449zhJ.copydefault(" ", fkKWHzl.copydefault - iMax) + '^')));
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA AEQbTJ() {
        FA faCopydefault = this.copydefault.copydefault(1);
        if (faCopydefault == null) {
            return null;
        }
        if (this.OLrzqt == XmlStreamReader.SubtreeStartDepth.CHILD && faCopydefault.copydefault() < this.EZpvd) {
            faCopydefault = this.copydefault.copydefault(2);
            if (faCopydefault == null) {
                return null;
            }
            if (faCopydefault.copydefault() >= this.EZpvd) {
                this.copydefault.AEQbTJ();
            }
        }
        if (faCopydefault.copydefault() >= this.EZpvd) {
            return this.copydefault.AEQbTJ();
        }
        return null;
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public FA copydefault(int i) {
        FA faCopydefault = this.copydefault.copydefault(i);
        if (faCopydefault != null && faCopydefault.copydefault() >= this.EZpvd) {
            return faCopydefault;
        }
        return null;
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public void EZpvd() {
        this.copydefault.EZpvd();
    }

    @Override // aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader
    public XmlStreamReader EZpvd(@NotNull XmlStreamReader.SubtreeStartDepth subtreeStartDepth) {
        Intrinsics.checkNotNullParameter(subtreeStartDepth, "");
        return this.copydefault.EZpvd(subtreeStartDepth);
    }
}
