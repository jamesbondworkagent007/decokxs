package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gBY implements gBW {
    public final InterfaceC14563dnn EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public gBY() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public gBY(@NotNull InterfaceC14563dnn interfaceC14563dnn) {
        Intrinsics.checkNotNullParameter(interfaceC14563dnn, "");
        this.EZpvd = interfaceC14563dnn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.dnn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dnn:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:35) call: o.dnp.<init>():void type: CONSTRUCTOR) : (r1v0 o.dnn))
 A[MD:(o.dnn):void (m)] (LINE:34) call: o.gBY.<init>(o.dnn):void type: THIS */
    public /* synthetic */ gBY(InterfaceC14563dnn interfaceC14563dnn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C14565dnp() : interfaceC14563dnn);
    }

    @Override // o.gBW
    public void OLrzqt(@NotNull java.lang.String str, C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C10854bwM c10854bwMKWHzl3;
        C10854bwM c10854bwMKWHzl4;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer numQbewEr = null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt((c10525bqB == null || (c10854bwMKWHzl4 = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl4.djBIcL());
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt((c10525bqB == null || (c10854bwMKWHzl3 = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl3.values());
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt((c10525bqB == null || (c10854bwMKWHzl2 = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl2.dNCPSb());
        if (c10525bqB != null && (c10854bwMKWHzl = c10525bqB.KWHzl()) != null) {
            numQbewEr = c10854bwMKWHzl.QbewEr();
        }
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(numQbewEr);
        pUU.OLrzqt(">>>track trackButtonClicked buttonName:" + str + " - tokenName:" + strGEmmrt2 + " - protocolId:" + strGEmmrt4 + " - chain:" + strGEmmrt + " - tokenType:" + strGEmmrt3);
        this.EZpvd.KWHzl(C14561dnl.AEQbTJ(C14557dnh.Activity.KWHzl, "COIN_DETAIL_PAGE", str, strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4));
    }
}
