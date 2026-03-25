package o;

import aws.smithy.kotlin.runtime.serde.SerializationException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FQ implements InterfaceC5132Fy {
    public final yDQ<FM> EZpvd;
    public final java.lang.StringBuilder KWHzl;
    public final java.util.Map<FA.Application, java.lang.String> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FQ() {
        this(false, 1, null);
    }

    public FQ(boolean z) {
        this.copydefault = z;
        this.KWHzl = new java.lang.StringBuilder();
        this.OLrzqt = new LinkedHashMap();
        this.EZpvd = new yDQ<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:14) call: o.FQ.<init>(boolean):void type: THIS */
    public /* synthetic */ FQ(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // o.InterfaceC5132Fy
    public byte[] KWHzl() {
        return C59449zhJ.getNewProxyInstance(copydefault());
    }

    public java.lang.String copydefault() {
        EZpvd();
        java.lang.String string = this.KWHzl.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC5132Fy
    public InterfaceC5132Fy copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().AEQbTJ(new FA.Application(str, str3), str2);
        return this;
    }

    public void EZpvd() {
        FM fmEZpvd = this.EZpvd.EZpvd();
        while (fmEZpvd != null) {
            OLrzqt(fmEZpvd.AEQbTJ());
            fmEZpvd = this.EZpvd.EZpvd();
        }
    }

    @Override // o.InterfaceC5132Fy
    public InterfaceC5132Fy copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new FA.Application(str, str2));
    }

    public final InterfaceC5132Fy OLrzqt(FA.Application application) {
        FM fmDjBIcL = this.EZpvd.djBIcL();
        if (fmDjBIcL == null) {
            throw new SerializationException("Unexpected end of tag while no tags are open");
        }
        if (!Intrinsics.EZpvd(fmDjBIcL.AEQbTJ(), application)) {
            throw new SerializationException("Tried to end tag " + application + " but expected end of " + fmDjBIcL.AEQbTJ() + " tag");
        }
        if (this.EZpvd.isEmpty()) {
            fmDjBIcL.KWHzl(this.KWHzl);
        }
        return this;
    }

    @Override // o.InterfaceC5132Fy
    public void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.put(str2 == null ? new FA.Application("xmlns", null, 2, null) : new FA.Application(str2, "xmlns"), str);
    }

    public final FM AEQbTJ() {
        if (this.EZpvd.isEmpty()) {
            throw new SerializationException("Attempted to serialize text or attribute without containing tag");
        }
        return this.EZpvd.OLrzqt();
    }

    @Override // o.InterfaceC5132Fy
    public InterfaceC5132Fy KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        FM fmEZpvd = this.EZpvd.EZpvd();
        FM fm = new FM(this.copydefault, (fmEZpvd != null ? fmEZpvd.KWHzl() : -1) + 1, new FA.Application(str, str2), this.OLrzqt);
        this.OLrzqt.clear();
        if (fmEZpvd != null) {
            fmEZpvd.KWHzl(fm);
        }
        this.EZpvd.addLast(fm);
        return this;
    }

    @Override // o.InterfaceC5132Fy
    public InterfaceC5132Fy KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().copydefault(str);
        return this;
    }
}
