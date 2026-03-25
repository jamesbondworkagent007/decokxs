package o;

import com.ibm.icu.impl.number.Modifier;
import java.text.Format;

/* JADX INFO: renamed from: o.aeu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7179aeu implements Modifier {
    public final Format.Field AEQbTJ;
    public final Modifier.TaskDescription KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    public C7179aeu(java.lang.String str, Format.Field field, boolean z, Modifier.TaskDescription taskDescription) {
        this.copydefault = str;
        this.AEQbTJ = field;
        this.OLrzqt = z;
        this.KWHzl = taskDescription;
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ(C7020abU c7020abU, int i, int i2) {
        return C7028acB.OLrzqt(this.copydefault, this.AEQbTJ, i, i2, c7020abU);
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int OLrzqt() {
        return C7028acB.copydefault(this.copydefault);
    }

    @Override // com.ibm.icu.impl.number.Modifier
    public int AEQbTJ() {
        return C7028acB.OLrzqt(this.copydefault, true);
    }
}
