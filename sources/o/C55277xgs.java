package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.multitype.selection.Selectable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55277xgs extends C43317rmx<RecyclerView.ViewHolder> {
    public final C59534zip KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55277xgs(@NotNull C59534zip c59534zip, @NotNull Selectable.Mode mode) {
        super(c59534zip, mode);
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(mode, "");
        this.KWHzl = c59534zip;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.zip)
  (wrap:com.okinc.multitype.selection.Selectable$Mode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.multitype.selection.Selectable$Mode:0x0004: SGET  A[WRAPPED] (LINE:17) com.okinc.multitype.selection.Selectable.Mode.Single com.okinc.multitype.selection.Selectable$Mode) : (r2v0 com.okinc.multitype.selection.Selectable$Mode))
 A[MD:(o.zip, com.okinc.multitype.selection.Selectable$Mode):void (m)] (LINE:17) call: o.xgs.<init>(o.zip, com.okinc.multitype.selection.Selectable$Mode):void type: THIS */
    public /* synthetic */ C55277xgs(C59534zip c59534zip, Selectable.Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c59534zip, (i & 2) != 0 ? Selectable.Mode.Single : mode);
    }

    @Override // o.C43317rmx, com.okinc.multitype.selection.Selectable
    public boolean KWHzl(int i) {
        C55276xgr c55276xgrEZpvd = EZpvd(i);
        return c55276xgrEZpvd != null ? c55276xgrEZpvd.AYXKKw() : super.KWHzl(i);
    }

    @Override // o.C43317rmx
    public boolean AEQbTJ(int i) {
        boolean zAEQbTJ = super.AEQbTJ(i);
        copydefault(i);
        return zAEQbTJ;
    }

    @Override // o.C43317rmx
    public boolean AEQbTJ(int i, boolean z) {
        boolean zAEQbTJ = super.AEQbTJ(i, z);
        copydefault(i);
        return zAEQbTJ;
    }

    @Override // o.C43317rmx
    public void EZpvd() {
        super.EZpvd();
        valueOf();
    }

    @Override // o.C43317rmx
    public void AEQbTJ() {
        super.AEQbTJ();
        valueOf();
    }

    public final C55276xgr EZpvd(int i) {
        java.lang.Object obj = this.KWHzl.getItems().get(i);
        if (obj instanceof C55276xgr) {
            return (C55276xgr) obj;
        }
        return null;
    }

    public final void copydefault(int i) {
        C55276xgr c55276xgrEZpvd;
        if (OLrzqt() != Selectable.Mode.Multiple || (c55276xgrEZpvd = EZpvd(i)) == null) {
            return;
        }
        c55276xgrEZpvd.copydefault(OLrzqt(i));
    }

    public final void valueOf() {
        java.util.List<?> items = this.KWHzl.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = 0;
        for (java.lang.Object obj : items) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (obj instanceof C55276xgr) {
                ((C55276xgr) obj).copydefault(OLrzqt(i));
            }
            i++;
        }
    }
}
