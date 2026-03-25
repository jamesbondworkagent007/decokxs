package o;

import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAY extends qKG {
    public java.util.List<? extends InterfaceC40516qYt> AEQbTJ;
    public java.util.List<? extends InterfaceC40516qYt> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qAY(@NotNull C41421qqW c41421qqW) {
        super(c41421qqW);
        Intrinsics.checkNotNullParameter(c41421qqW, "");
        register(C39890qBo.class, new qAZ());
        register(C40174qMb.class, new qAX());
        register(qWC.class, new qAT());
        this.OLrzqt = yDY.AhwBna();
        this.AEQbTJ = yDY.AhwBna();
    }

    @Override // o.AbstractC40521qYy
    public void EZpvd(java.util.List<? extends InterfaceC40516qYt> list, Function0<Unit> function0) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        this.OLrzqt = list;
        copydefault(function0);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends InterfaceC40516qYt> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        submitListInner$default(this, null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qAY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitListInner$default(qAY qay, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        qay.copydefault((Function0<Unit>) function0);
    }

    public final void copydefault(Function0<Unit> function0) {
        java.util.List<? extends InterfaceC40516qYt> listDjBIcL = this.AEQbTJ;
        if (!listDjBIcL.isEmpty()) {
            listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new C39890qBo(C33070mpX.AYXKKw(qZH.PendingIntent.hfeTOA), true)), (java.lang.Iterable) listDjBIcL);
        }
        java.util.List<? extends InterfaceC40516qYt> listDjBIcL2 = this.OLrzqt;
        if (!listDjBIcL2.isEmpty()) {
            listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new C39890qBo(C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx), false)), (java.lang.Iterable) listDjBIcL2);
        }
        super.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL, (java.lang.Iterable) listDjBIcL2), function0);
    }
}
