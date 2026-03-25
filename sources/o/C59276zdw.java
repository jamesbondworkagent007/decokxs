package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59276zdw extends AbstractC59325zes {
    public final boolean EZpvd;
    public final InterfaceC56691yOt[] KWHzl;
    public final InterfaceC59317zek[] OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59325zes
    public boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59317zek[] KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56691yOt[] OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.yOt[])
  (r2v0 o.zek[])
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(o.yOt[], o.zek[], boolean):void (m)] (LINE:113) call: o.zdw.<init>(o.yOt[], o.zek[], boolean):void type: THIS */
    public /* synthetic */ C59276zdw(InterfaceC56691yOt[] interfaceC56691yOtArr, InterfaceC59317zek[] interfaceC59317zekArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC56691yOtArr, interfaceC59317zekArr, (i & 4) != 0 ? false : z);
    }

    public C59276zdw(@NotNull InterfaceC56691yOt[] interfaceC56691yOtArr, @NotNull InterfaceC59317zek[] interfaceC59317zekArr, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOtArr, "");
        Intrinsics.checkNotNullParameter(interfaceC59317zekArr, "");
        this.KWHzl = interfaceC56691yOtArr;
        this.OLrzqt = interfaceC59317zekArr;
        this.EZpvd = z;
        int length = interfaceC56691yOtArr.length;
        int length2 = interfaceC59317zekArr.length;
    }

    @Override // o.AbstractC59325zes
    public boolean EZpvd() {
        return this.OLrzqt.length == 0;
    }

    @Override // o.AbstractC59325zes
    public InterfaceC59317zek copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56691yOt interfaceC56691yOt = interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt ? (InterfaceC56691yOt) interfaceC56663yNsKWHzl : null;
        if (interfaceC56691yOt == null) {
            return null;
        }
        int iAEQbTJ = interfaceC56691yOt.AEQbTJ();
        InterfaceC56691yOt[] interfaceC56691yOtArr = this.KWHzl;
        if (iAEQbTJ >= interfaceC56691yOtArr.length || !Intrinsics.EZpvd(interfaceC56691yOtArr[iAEQbTJ].fJNWhG(), interfaceC56691yOt.fJNWhG())) {
            return null;
        }
        return this.OLrzqt[iAEQbTJ];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59276zdw(@NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull java.util.List<? extends InterfaceC59317zek> list2) {
        this((InterfaceC56691yOt[]) list.toArray(new InterfaceC56691yOt[0]), (InterfaceC59317zek[]) list2.toArray(new InterfaceC59317zek[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
    }
}
