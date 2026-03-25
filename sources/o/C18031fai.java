package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18031fai implements ViewModelProvider.Factory {
    public final C13934dbu AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18031fai() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C18031fai(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:107) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r1v0 o.dbu))
 A[MD:(o.dbu):void (m)] (LINE:106) call: o.fai.<init>(o.dbu):void type: THIS */
    public /* synthetic */ C18031fai(C13934dbu c13934dbu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        if (!Intrinsics.EZpvd(cls, C18028faf.class)) {
            throw new java.lang.IllegalArgumentException("This factory only supports BannerViewModel".toString());
        }
        return new C18028faf(this.AEQbTJ, null, 2, 0 == true ? 1 : 0);
    }
}
