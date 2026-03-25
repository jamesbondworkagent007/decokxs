package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class cTQ implements Function1 {
    public static int AEQbTJ;
    public static int AhwBna;
    public final /* synthetic */ java.lang.String EZpvd;
    public final /* synthetic */ java.lang.String KWHzl;
    public final /* synthetic */ Ref.ObjectRef OLrzqt;
    public final /* synthetic */ cTR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ cTQ(cTR ctr, java.lang.String str, java.lang.String str2, Ref.ObjectRef objectRef) {
        this.copydefault = ctr;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = objectRef;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cTR.AEQbTJ(o.cTR, java.lang.String, java.lang.String, kotlin.jvm.internal.Ref$ObjectRef, o.ctV):o.yxu */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return cTR.copydefault(this.copydefault, this.EZpvd, this.KWHzl, this.OLrzqt, (AbstractC12782ctV) obj);
    }

    public static int OLrzqt() {
        int i = AEQbTJ;
        int i2 = i % 9603375;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return AhwBna;
        }
        int iMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
        AhwBna = iMaxMemory;
        return iMaxMemory;
    }
}
