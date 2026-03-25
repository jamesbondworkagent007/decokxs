package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.udO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48844udO {
    public static java.lang.String AEQbTJ = "base_sub_";
    public static int EZpvd;

    public static java.lang.String KWHzl() {
        java.lang.String str;
        synchronized (C48844udO.class) {
            int i = EZpvd + 1;
            EZpvd = i;
            if (i == Integer.MAX_VALUE) {
                AEQbTJ += "-";
                EZpvd = 0;
            }
            str = AEQbTJ + EZpvd;
        }
        return str;
    }

    public static void EZpvd() {
        java.lang.System.setProperty("ok.io-android-priority", java.lang.String.valueOf(10));
        java.lang.System.setProperty("ok.io-priority", java.lang.String.valueOf(1));
        yBG.OLrzqt((InterfaceC58229yxO<? super Callable<AbstractC58253yxm>, ? extends AbstractC58253yxm>) new InterfaceC58229yxO() { // from class: o.udP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C48844udO.copydefault((Callable) obj);
            }
        });
    }

    public static /* synthetic */ AbstractC58253yxm copydefault(Callable callable) throws java.lang.Exception {
        return C48839udJ.OLrzqt;
    }

    public static void OLrzqt() {
        yBG.EZpvd((InterfaceC58229yxO<? super AbstractC58253yxm, ? extends AbstractC58253yxm>) new InterfaceC58229yxO() { // from class: o.udL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C48844udO.copydefault((AbstractC58253yxm) obj);
            }
        });
    }

    public static /* synthetic */ AbstractC58253yxm copydefault(AbstractC58253yxm abstractC58253yxm) throws java.lang.Exception {
        return C48839udJ.EZpvd;
    }
}
