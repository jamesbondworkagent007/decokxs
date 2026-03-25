package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59265zdl extends AbstractC59267zdn implements InterfaceC59261zdh, InterfaceC59373zfn {
    public static final ActionBar copydefault = new ActionBar(null);
    public final AbstractC59242zdO AEQbTJ;
    public final boolean KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.zdO), (r2v0 boolean) A[MD:(o.zdO, boolean):void (m)] call: o.zdl.<init>(o.zdO, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59265zdl(AbstractC59242zdO abstractC59242zdO, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC59242zdO, z);
    }

    @Override // o.AbstractC59267zdn, o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59242zdO AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59267zdn
    public AbstractC59242zdO EZpvd() {
        return this.AEQbTJ;
    }

    public C59265zdl(AbstractC59242zdO abstractC59242zdO, boolean z) {
        this.AEQbTJ = abstractC59242zdO;
        this.KWHzl = z;
    }

    /* JADX INFO: renamed from: o.zdl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zdl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C59265zdl makeDefinitelyNotNull$default(ActionBar actionBar, AbstractC59331zey abstractC59331zey, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return actionBar.copydefault(abstractC59331zey, z, z2);
        }

        public final C59265zdl copydefault(@NotNull AbstractC59331zey abstractC59331zey, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(abstractC59331zey, "");
            if (abstractC59331zey instanceof C59265zdl) {
                return (C59265zdl) abstractC59331zey;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2 && !OLrzqt(abstractC59331zey, z)) {
                return null;
            }
            if (abstractC59331zey instanceof AbstractC59272zds) {
                AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zey;
                Intrinsics.EZpvd(abstractC59272zds.valueOf().djBIcL(), abstractC59272zds.AYXKKw().djBIcL());
            }
            return new C59265zdl(C59278zdy.KWHzl(abstractC59331zey).AEQbTJ(false), z, defaultConstructorMarker);
        }

        public final boolean OLrzqt(AbstractC59331zey abstractC59331zey, boolean z) {
            if (!copydefault(abstractC59331zey)) {
                return false;
            }
            if (abstractC59331zey instanceof C59249zdV) {
                return C59322zep.valueOf(abstractC59331zey);
            }
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59331zey.djBIcL().OLrzqt();
            yPR ypr = interfaceC56663yNsKWHzl instanceof yPR ? (yPR) interfaceC56663yNsKWHzl : null;
            if (ypr != null && !ypr.AuCTel()) {
                return true;
            }
            if (z && (abstractC59331zey.djBIcL().OLrzqt() instanceof InterfaceC56691yOt)) {
                return C59322zep.valueOf(abstractC59331zey);
            }
            return !C59299zeS.AEQbTJ.AEQbTJ(abstractC59331zey);
        }

        public final boolean copydefault(AbstractC59331zey abstractC59331zey) {
            return (abstractC59331zey.djBIcL() instanceof InterfaceC59297zeQ) || (abstractC59331zey.djBIcL().OLrzqt() instanceof InterfaceC56691yOt) || (abstractC59331zey instanceof C59288zeH) || (abstractC59331zey instanceof C59249zdV);
        }
    }

    @Override // o.InterfaceC59261zdh
    public boolean KWHzl() {
        return (EZpvd().djBIcL() instanceof InterfaceC59297zeQ) || (EZpvd().djBIcL().OLrzqt() instanceof InterfaceC56691yOt);
    }

    @Override // o.InterfaceC59261zdh
    public AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return C59245zdR.copydefault(abstractC59233zdF.AkhnZx(), this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new C59265zdl(EZpvd().AEQbTJ(c59308zeb), this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        return z ? EZpvd().AEQbTJ(z) : this;
    }

    @Override // o.AbstractC59242zdO
    public java.lang.String toString() {
        return EZpvd() + " & Any";
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zdO;)Lo/zdn; */
    @Override // o.AbstractC59267zdn
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C59265zdl KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        return new C59265zdl(abstractC59242zdO, this.KWHzl);
    }
}
