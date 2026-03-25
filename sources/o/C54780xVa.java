package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54780xVa {
    public final java.lang.String AEQbTJ;
    public final AbstractC54531xLw EZpvd;
    public java.util.ArrayList<C54429xIb> KWHzl;
    public java.util.ArrayList<C54429xIb> OLrzqt;
    public final BizInstrument copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.ArrayList<C54429xIb> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C54429xIb> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C54429xIb> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.ArrayList<C54429xIb> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.KWHzl = arrayList;
    }

    public C54780xVa(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.djBIcL = str2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        this.copydefault = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        this.EZpvd = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt(str2) : null;
        this.KWHzl = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.ArrayList<>();
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        java.lang.String sheetDig;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.EZpvd == null || this.copydefault == null) {
            return;
        }
        java.lang.String str2 = this.djBIcL;
        int iHashCode = str2.hashCode();
        if (iHashCode == -1956807563 ? str2.equals("OPTION") : !(iHashCode == 2558355 ? !str2.equals("SWAP") : !(iHashCode == 214415088 && str2.equals("FUTURES")))) {
            java.lang.String strGEmmrt = this.EZpvd.gEmmrt(this.copydefault);
            if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "2")) {
                EZpvd(str, new Function1() { // from class: o.xUZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C54780xVa.KWHzl(this.AEQbTJ, (C54429xIb) obj);
                    }
                });
                return;
            }
            final java.lang.String str3 = "0";
            if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
                EZpvd(str, new Function1() { // from class: o.xVb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C54780xVa.AEQbTJ(this.AEQbTJ, (C54429xIb) obj);
                    }
                });
                return;
            }
            IdxConfig idxConfigAkhnZx = this.EZpvd.AkhnZx(this.copydefault.getInstFamily());
            if (idxConfigAkhnZx != null && (sheetDig = idxConfigAkhnZx.getSheetDig()) != null) {
                str3 = sheetDig;
            }
            EZpvd(str, new Function1() { // from class: o.xVf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54780xVa.EZpvd(str3, (C54429xIb) obj);
                }
            });
            return;
        }
        EZpvd(str, new Function1() { // from class: o.xVd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54780xVa.OLrzqt((C54429xIb) obj);
            }
        });
    }

    public static final java.lang.String KWHzl(C54780xVa c54780xVa, C54429xIb c54429xIb) {
        Intrinsics.checkNotNullParameter(c54429xIb, "");
        return C54790xVk.Companion.OLrzqt(C33129mqd.AEQbTJ(AbstractC54531xLw.createTradeConverterWithIndex$default(c54780xVa.EZpvd, c54780xVa.copydefault.getInstFamily(), null, 2, null).AhwBna(C33129mqd.OLrzqt(java.lang.Double.valueOf(c54429xIb.copydefault()))).copydefault(C33129mqd.OLrzqt(java.lang.Double.valueOf(c54429xIb.AEQbTJ())))), 2);
    }

    public static final java.lang.String AEQbTJ(C54780xVa c54780xVa, C54429xIb c54429xIb) {
        Intrinsics.checkNotNullParameter(c54429xIb, "");
        return C54790xVk.Companion.OLrzqt(C33129mqd.AEQbTJ(AbstractC54531xLw.createTradeConverterWithIndex$default(c54780xVa.EZpvd, c54780xVa.copydefault.getInstFamily(), null, 2, null).AhwBna(c54780xVa.EZpvd.gEmmrt(c54780xVa.copydefault.getInstFamily()).EZpvd(C33129mqd.gEmmrt(java.lang.Double.valueOf(c54429xIb.copydefault())))).copydefault(C33129mqd.OLrzqt(java.lang.Double.valueOf(c54429xIb.AEQbTJ())))), (!Intrinsics.EZpvd((java.lang.Object) c54780xVa.djBIcL, (java.lang.Object) "OPTION") && Intrinsics.EZpvd((java.lang.Object) c54780xVa.EZpvd.copydefault(c54780xVa.copydefault), (java.lang.Object) "linear")) ? 2 : 3);
    }

    public static final java.lang.String EZpvd(java.lang.String str, C54429xIb c54429xIb) {
        Intrinsics.checkNotNullParameter(c54429xIb, "");
        return C54790xVk.Companion.OLrzqt(c54429xIb.AEQbTJ(), C33129mqd.AhwBna(str));
    }

    public static final java.lang.String OLrzqt(C54429xIb c54429xIb) {
        Intrinsics.checkNotNullParameter(c54429xIb, "");
        return C54790xVk.Companion.OLrzqt(c54429xIb.AEQbTJ(), 3);
    }

    public final void EZpvd(java.lang.String str, Function1<? super C54429xIb, java.lang.String> function1) {
        if (this.EZpvd == null || this.copydefault == null) {
            return;
        }
        for (C54429xIb c54429xIb : this.KWHzl) {
            c54429xIb.OLrzqt(C54536xML.toSafeString$default(this.EZpvd.gEmmrt(this.copydefault.getInstFamily()).KWHzl(C33129mqd.OLrzqt(java.lang.Double.valueOf(c54429xIb.copydefault()))).AuCTel().AEQbTJ(true).EZpvd(java.lang.String.valueOf(C54803xVx.digitFormat$default(str, 0, 1, null))), false, 1, null));
            c54429xIb.KWHzl(pTB.formatRoundToFixed$default(C33129mqd.EZpvd(c54429xIb.EZpvd()), C54803xVx.digitFormat$default(str, 0, 1, null), null, 2, null));
            c54429xIb.EZpvd(function1.invoke(c54429xIb));
        }
        for (C54429xIb c54429xIb2 : this.OLrzqt) {
            c54429xIb2.OLrzqt(C54536xML.toSafeString$default(this.EZpvd.gEmmrt(this.copydefault.getInstFamily()).KWHzl(C33129mqd.OLrzqt(java.lang.Double.valueOf(c54429xIb2.copydefault()))).copydefault().AEQbTJ(true).EZpvd(java.lang.String.valueOf(C54803xVx.digitFormat$default(str, 0, 1, null))), false, 1, null));
            c54429xIb2.KWHzl(pTB.formatRoundToFixed$default(C33129mqd.EZpvd(c54429xIb2.EZpvd()), C54803xVx.digitFormat$default(str, 0, 1, null), null, 2, null));
            c54429xIb2.EZpvd(function1.invoke(c54429xIb2));
        }
    }
}
