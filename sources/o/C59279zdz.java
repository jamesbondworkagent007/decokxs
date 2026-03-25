package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59279zdz extends AbstractC59272zds implements InterfaceC59261zdh {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static boolean copydefault;
    public boolean KWHzl;

    /* JADX INFO: renamed from: o.zdz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zdz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59279zdz(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        super(abstractC59242zdO, abstractC59242zdO2);
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
    }

    public final void gEmmrt() {
        if (!copydefault || this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        C59278zdy.EZpvd(valueOf());
        C59278zdy.EZpvd(AYXKKw());
        Intrinsics.EZpvd(valueOf(), AYXKKw());
        InterfaceC59284zeD.OLrzqt.copydefault(valueOf(), AYXKKw());
    }

    @Override // o.AbstractC59272zds
    public AbstractC59242zdO EZpvd() {
        gEmmrt();
        return valueOf();
    }

    @Override // o.InterfaceC59261zdh
    public boolean KWHzl() {
        return (valueOf().djBIcL().OLrzqt() instanceof InterfaceC56691yOt) && Intrinsics.EZpvd(valueOf().djBIcL(), AYXKKw().djBIcL());
    }

    @Override // o.InterfaceC59261zdh
    public AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        AbstractC59331zey abstractC59331zeyCopydefault;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            abstractC59331zeyCopydefault = abstractC59331zeyAkhnZx;
        } else {
            if (!(abstractC59331zeyAkhnZx instanceof AbstractC59242zdO)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC59242zdO abstractC59242zdO = (AbstractC59242zdO) abstractC59331zeyAkhnZx;
            abstractC59331zeyCopydefault = C59231zdD.copydefault(abstractC59242zdO, abstractC59242zdO.AEQbTJ(true));
        }
        return C59327zeu.copydefault(abstractC59331zeyCopydefault, abstractC59331zeyAkhnZx);
    }

    @Override // o.AbstractC59331zey
    public AbstractC59331zey AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return C59231zdD.copydefault(valueOf().AEQbTJ(c59308zeb), AYXKKw().AEQbTJ(c59308zeb));
    }

    @Override // o.AbstractC59272zds
    public java.lang.String OLrzqt(@NotNull yXX yxx, @NotNull InterfaceC56959yYr interfaceC56959yYr) {
        Intrinsics.checkNotNullParameter(yxx, "");
        Intrinsics.checkNotNullParameter(interfaceC56959yYr, "");
        if (interfaceC56959yYr.djBIcL()) {
            return '(' + yxx.KWHzl(valueOf()) + ".." + yxx.KWHzl(AYXKKw()) + ')';
        }
        return yxx.OLrzqt(yxx.KWHzl(valueOf()), yxx.KWHzl(AYXKKw()), C59336zfC.copydefault((AbstractC59233zdF) this));
    }

    @Override // o.AbstractC59272zds
    public java.lang.String toString() {
        return '(' + valueOf() + ".." + AYXKKw() + ')';
    }

    @Override // o.AbstractC59331zey
    public AbstractC59331zey AEQbTJ(boolean z) {
        return C59231zdD.copydefault(valueOf().AEQbTJ(z), AYXKKw().AEQbTJ(z));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC59272zds KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ = abstractC59287zeG.AEQbTJ(valueOf());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ, "");
        AbstractC59233zdF abstractC59233zdFAEQbTJ2 = abstractC59287zeG.AEQbTJ(AYXKKw());
        Intrinsics.copydefault(abstractC59233zdFAEQbTJ2, "");
        return new C59279zdz((AbstractC59242zdO) abstractC59233zdFAEQbTJ, (AbstractC59242zdO) abstractC59233zdFAEQbTJ2);
    }
}
