package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57211yeD {
    public final int AEQbTJ;
    public final java.util.ArrayList<java.lang.String> AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final androidx.fragment.app.FragmentManager djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> OLrzqt() {
        return this.AhwBna;
    }

    public C57211yeD(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.djBIcL = fragmentManager;
        this.AEQbTJ = i;
        this.copydefault = i2;
        this.KWHzl = i3;
        this.EZpvd = i4;
        this.OLrzqt = i5;
        this.AhwBna = new java.util.ArrayList<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 androidx.fragment.app.FragmentManager)
  (r9v0 int)
  (wrap:int:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Application.OLrzqt int) : (r10v0 int))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000b: SGET  A[WRAPPED] o.wXj.Application.AYXKKw int) : (r11v0 int))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0012: SGET  A[WRAPPED] o.wXj.Application.KWHzl int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0019: SGET  A[WRAPPED] o.wXj.Application.djBIcL int) : (r13v0 int))
 A[MD:(androidx.fragment.app.FragmentManager, int, int, int, int, int):void (m)] (LINE:12) call: o.yeD.<init>(androidx.fragment.app.FragmentManager, int, int, int, int, int):void type: THIS */
    public /* synthetic */ C57211yeD(androidx.fragment.app.FragmentManager fragmentManager, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, i, (i6 & 4) != 0 ? C52761wXj.Application.OLrzqt : i2, (i6 & 8) != 0 ? C52761wXj.Application.AYXKKw : i3, (i6 & 16) != 0 ? C52761wXj.Application.KWHzl : i4, (i6 & 32) != 0 ? C52761wXj.Application.djBIcL : i5);
    }

    public static /* synthetic */ void add$default(C57211yeD c57211yeD, AbstractC57212yeE abstractC57212yeE, AbstractC57212yeE abstractC57212yeE2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        c57211yeD.AEQbTJ(abstractC57212yeE, abstractC57212yeE2, z, z2);
    }

    public final <F extends AbstractC57212yeE> void AEQbTJ(F f, @NotNull F f2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(f2, "");
        java.lang.String name = f2.getClass().getName();
        if (f != null) {
            android.os.Bundle arguments = f2.getArguments();
            if (arguments == null) {
                arguments = new android.os.Bundle();
                f2.setArguments(arguments);
            }
            arguments.putString("lastFragmentTag", f.getClass().getName());
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = this.djBIcL.beginTransaction();
        if (z) {
            fragmentTransactionBeginTransaction.setCustomAnimations(this.copydefault, this.KWHzl, this.EZpvd, this.OLrzqt);
        }
        fragmentTransactionBeginTransaction.add(this.AEQbTJ, f2, name);
        if (z2) {
            this.AhwBna.add(name);
            fragmentTransactionBeginTransaction.addToBackStack(name);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static /* synthetic */ void remove$default(C57211yeD c57211yeD, AbstractC57212yeE abstractC57212yeE, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c57211yeD.EZpvd(abstractC57212yeE, z);
    }

    public final <F extends AbstractC57212yeE> void EZpvd(@NotNull F f, boolean z) {
        Intrinsics.checkNotNullParameter(f, "");
        java.lang.String name = f.getClass().getName();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = this.djBIcL.beginTransaction();
        if (z) {
            fragmentTransactionBeginTransaction.setCustomAnimations(this.copydefault, this.KWHzl, this.EZpvd, this.OLrzqt);
        }
        fragmentTransactionBeginTransaction.remove(f);
        this.AhwBna.remove(name);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final <F extends AbstractC57212yeE> void OLrzqt(@NotNull F f) {
        Intrinsics.checkNotNullParameter(f, "");
        java.lang.String name = f.getClass().getName();
        this.AhwBna.remove(name);
        this.djBIcL.popBackStack(name, 1);
    }

    public final <F extends AbstractC57212yeE> F EZpvd(@NotNull F f) {
        Intrinsics.checkNotNullParameter(f, "");
        java.lang.String name = f.getClass().getName();
        this.AhwBna.remove(name);
        this.djBIcL.popBackStack(name, 1);
        if (this.AhwBna.isEmpty()) {
            return null;
        }
        return (F) this.djBIcL.findFragmentByTag((java.lang.String) CollectionsKt___CollectionsKt.AubY(this.AhwBna));
    }

    public final boolean EZpvd() {
        if (this.AhwBna.size() <= 1) {
            return true;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.djBIcL;
        java.util.ArrayList<java.lang.String> arrayList = this.AhwBna;
        fragmentManager.popBackStack(arrayList.remove(yDY.AuCTel(arrayList)), 1);
        return false;
    }

    public final <F extends AbstractC57212yeE> F EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.djBIcL.findFragmentByTag(str);
        if (fragmentFindFragmentByTag instanceof AbstractC57212yeE) {
            return (F) fragmentFindFragmentByTag;
        }
        return null;
    }

    public final void copydefault() {
        this.AhwBna.clear();
    }
}
