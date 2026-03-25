package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5110Fc;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EP implements InterfaceC5095En.StateListAnimator, InterfaceC5095En {
    public final /* synthetic */ EL AEQbTJ;
    public final /* synthetic */ EL EZpvd;
    public final C5098Eq KWHzl;
    public final EU copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.Activity AEQbTJ(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return this.EZpvd.AEQbTJ(c5101Et);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return this.AEQbTJ.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return this.AEQbTJ.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.StateListAnimator EZpvd(@NotNull C5098Eq c5098Eq) {
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        return this.EZpvd.EZpvd(c5098Eq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.ActionBar KWHzl(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return this.EZpvd.KWHzl(c5101Et);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return this.AEQbTJ.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return this.AEQbTJ.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        return this.AEQbTJ.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return this.AEQbTJ.valueOf();
    }

    public EP(@NotNull EU eu, @NotNull C5098Eq c5098Eq, @NotNull EL el) {
        Intrinsics.checkNotNullParameter(eu, "");
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        Intrinsics.checkNotNullParameter(el, "");
        this.copydefault = eu;
        this.KWHzl = c5098Eq;
        this.EZpvd = el;
        this.AEQbTJ = el;
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public java.lang.Integer OLrzqt() {
        AbstractC5110Fc abstractC5110FcValueOf = this.copydefault.valueOf();
        java.lang.Integer numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        java.lang.Object obj = null;
        if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.PendingIntent.AEQbTJ)) {
            if (!Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.TaskDescription.EZpvd)) {
                if (Intrinsics.EZpvd(abstractC5110FcValueOf, AbstractC5110Fc.FragmentManager.KWHzl)) {
                    AbstractC5110Fc abstractC5110FcAEQbTJ = this.copydefault.AEQbTJ();
                    if (abstractC5110FcAEQbTJ.getClass() == AbstractC5110Fc.FragmentManager.class) {
                    } else {
                        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.FragmentManager.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ.getClass()));
                    }
                } else {
                    AbstractC5110Fc abstractC5110FcAEQbTJ2 = this.copydefault.AEQbTJ();
                    if (abstractC5110FcAEQbTJ2.getClass() == AbstractC5110Fc.LoaderManager.class) {
                        java.lang.String strAEQbTJ = ((AbstractC5110Fc.LoaderManager) abstractC5110FcAEQbTJ2).AEQbTJ();
                        java.util.Iterator<T> it = this.KWHzl.OLrzqt().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) EQ.KWHzl((C5101Et) next), (java.lang.Object) strAEQbTJ)) {
                                obj = next;
                                break;
                            }
                        }
                        C5101Et c5101Et = (C5101Et) obj;
                        if (this.KWHzl.AEQbTJ().contains(new EM(strAEQbTJ))) {
                            this.copydefault.DbNXlk();
                            return OLrzqt();
                        }
                        numValueOf = java.lang.Integer.valueOf(c5101Et != null ? c5101Et.copydefault() : -1);
                    } else {
                        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.LoaderManager.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ2.getClass()));
                    }
                }
            }
        } else {
            AbstractC5110Fc abstractC5110FcAEQbTJ3 = this.copydefault.AEQbTJ();
            if (abstractC5110FcAEQbTJ3.getClass() == AbstractC5110Fc.PendingIntent.class) {
            } else {
                throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.PendingIntent.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ3.getClass()));
            }
        }
        if (numValueOf == null || !Intrinsics.EZpvd(this.copydefault.valueOf(), AbstractC5110Fc.FragmentManager.KWHzl)) {
            return numValueOf;
        }
        AbstractC5110Fc abstractC5110FcAEQbTJ4 = this.copydefault.AEQbTJ();
        if (abstractC5110FcAEQbTJ4.getClass() == AbstractC5110Fc.FragmentManager.class) {
            return OLrzqt();
        }
        throw new DeserializationException("expected " + C56524yIo.AEQbTJ(AbstractC5110Fc.FragmentManager.class) + "; found " + C56524yIo.AEQbTJ(abstractC5110FcAEQbTJ4.getClass()));
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public void copydefault() {
        this.copydefault.DbNXlk();
    }
}
