package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public final class mOF {
    public static boolean EZpvd;
    public static final mOF KWHzl = new mOF();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mOC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mOF.KWHzl();
        }
    });
    public static final int OLrzqt = 8;

    private mOF() {
    }

    public static final pUV KWHzl() {
        return new pUV("PandoraVerify", false, false, false, 14, null);
    }

    public final pUV OLrzqt() {
        return (pUV) AEQbTJ.getValue();
    }

    public final void OLrzqt(boolean z) {
        if (EZpvd) {
            return;
        }
        if (z) {
            EZpvd = true;
            OLrzqt().copydefault("verifyEmbeddedLanguagePack verify pass");
        } else {
            OLrzqt().AEQbTJ("verifyEmbeddedLanguagePack verify fail");
        }
    }
}
