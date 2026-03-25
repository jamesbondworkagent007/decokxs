package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BI;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54292xD implements BI {
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;

    public C54292xD(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
    }

    @Override // o.BI
    public void copydefault(@NotNull BY<?, ?> by) {
        BI.Activity.KWHzl(this, by);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC5076Du
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super BP<C5036Cg>> continuation) {
        java.lang.String str = (java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault());
        bp.EZpvd().AEQbTJ().OLrzqt("X-Amz-Target", this.OLrzqt + '.' + str);
        bp.EZpvd().AEQbTJ().KWHzl("Content-Type", "application/x-amz-json-" + this.EZpvd);
        if (bp.EZpvd().KWHzl() instanceof zP.StateListAnimator) {
            bp.EZpvd().EZpvd(zP.EZpvd.OLrzqt(C59449zhJ.getNewProxyInstance("{}")));
        }
        return bp;
    }
}
