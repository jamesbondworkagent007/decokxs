package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14557dnh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17230eyq {
    public final InterfaceC14563dnn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C17230eyq() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C17230eyq(@NotNull InterfaceC14563dnn interfaceC14563dnn) {
        Intrinsics.checkNotNullParameter(interfaceC14563dnn, "");
        this.copydefault = interfaceC14563dnn;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.dnn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dnn:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:14) call: o.dnp.<init>():void type: CONSTRUCTOR) : (r1v0 o.dnn))
 A[MD:(o.dnn):void (m)] (LINE:13) call: o.eyq.<init>(o.dnn):void type: THIS */
    public /* synthetic */ C17230eyq(InterfaceC14563dnn interfaceC14563dnn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C14565dnp() : interfaceC14563dnn);
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (AbstractC12782ctV abstractC12782ctV : list) {
            sb.append(abstractC12782ctV.DbNXlk());
            sb.append(",");
            if (abstractC12782ctV.zLjUOn()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append(",");
        }
        C14557dnh.ActionBar actionBar = C14557dnh.ActionBar.OLrzqt;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(list.size()));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.copydefault.KWHzl(C14566dnq.OLrzqt(actionBar, strGEmmrt, string));
    }
}
