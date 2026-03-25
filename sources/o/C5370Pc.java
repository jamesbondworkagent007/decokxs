package o;

import o.InterfaceC5368Pa;

/* JADX INFO: renamed from: o.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5370Pc extends SD<NH, OC<?>> implements InterfaceC5368Pa {
    public InterfaceC5368Pa.ActionBar AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5368Pa
    public void KWHzl(@androidx.annotation.NonNull InterfaceC5368Pa.ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.InterfaceC5368Pa
    public /* synthetic */ OC KWHzl(@androidx.annotation.NonNull NH nh, @androidx.annotation.Nullable OC oc) {
        return (OC) super.copydefault(nh, oc);
    }

    @Override // o.InterfaceC5368Pa
    public /* synthetic */ OC copydefault(@androidx.annotation.NonNull NH nh) {
        return (OC) super.OLrzqt(nh);
    }

    public C5370Pc(long j) {
        super(j);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // o.SD
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@androidx.annotation.NonNull NH nh, @androidx.annotation.Nullable OC<?> oc) {
        InterfaceC5368Pa.ActionBar actionBar = this.AEQbTJ;
        if (actionBar == null || oc == null) {
            return;
        }
        actionBar.EZpvd(oc);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)I */
    @Override // o.SD
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int KWHzl(@androidx.annotation.Nullable OC<?> oc) {
        if (oc == null) {
            return super.KWHzl((java.lang.Object) null);
        }
        return oc.EZpvd();
    }

    @Override // o.InterfaceC5368Pa
    public void OLrzqt(int i) {
        if (i >= 40) {
            AEQbTJ();
        } else if (i >= 20 || i == 15) {
            EZpvd(OLrzqt() / 2);
        }
    }
}
