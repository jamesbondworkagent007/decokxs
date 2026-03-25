package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ER implements InterfaceC5095En.StateListAnimator, InterfaceC5095En {
    public final /* synthetic */ EL KWHzl;
    public final /* synthetic */ EL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.Activity AEQbTJ(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return this.copydefault.AEQbTJ(c5101Et);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return this.KWHzl.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return this.KWHzl.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.StateListAnimator EZpvd(@NotNull C5098Eq c5098Eq) {
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        return this.copydefault.EZpvd(c5098Eq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5095En
    public InterfaceC5095En.ActionBar KWHzl(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return this.copydefault.KWHzl(c5101Et);
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public java.lang.Integer OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return this.KWHzl.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return this.KWHzl.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        return this.KWHzl.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return this.KWHzl.valueOf();
    }

    public ER(@NotNull EL el) {
        Intrinsics.checkNotNullParameter(el, "");
        this.copydefault = el;
        this.KWHzl = el;
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public void copydefault() {
        throw new DeserializationException("This should not be called during deserialization.");
    }
}
