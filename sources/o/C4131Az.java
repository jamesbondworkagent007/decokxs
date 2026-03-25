package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C59462zhW;
import o.InterfaceC4078Ay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4131Az implements InterfaceC4078Ay {
    public final long AEQbTJ;
    public final AD AYXKKw;
    public final FZ AhwBna;
    public final DE EZpvd;
    public final long KWHzl;
    public final long OLrzqt;
    public final int djBIcL;
    public final long gEmmrt;
    public final AC isConnected;
    public final long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FZ AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AC DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DE copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AD gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long valueOf() {
        return this.valueOf;
    }

    public C4131Az(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.valueOf = actionBar.djBIcL();
        this.gEmmrt = actionBar.AhwBna();
        this.KWHzl = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.KWHzl();
        this.OLrzqt = actionBar.copydefault();
        this.djBIcL = actionBar.EZpvd();
        this.AYXKKw = actionBar.gEmmrt();
        this.EZpvd = actionBar.AEQbTJ();
        this.isConnected = actionBar.valueOf();
        this.AhwBna = actionBar.AYXKKw();
    }

    public C4131Az() {
        this(new ActionBar());
    }

    @Override // o.InterfaceC4078Ay
    public Function1<InterfaceC4078Ay.ActionBar, Unit> OLrzqt() {
        return new Function1<InterfaceC4078Ay.ActionBar, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.HttpClientEngineConfigImpl$toBuilderApplicator$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC4078Ay.ActionBar actionBar) {
                invoke2(actionBar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC4078Ay.ActionBar actionBar) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                actionBar.OLrzqt(this.this$0.valueOf());
                actionBar.AEQbTJ(this.this$0.djBIcL());
                actionBar.copydefault(this.this$0.KWHzl());
                actionBar.KWHzl(this.this$0.AEQbTJ());
                actionBar.EZpvd(this.this$0.EZpvd());
                actionBar.AEQbTJ(this.this$0.AYXKKw());
                actionBar.EZpvd(this.this$0.gEmmrt());
                actionBar.AEQbTJ(this.this$0.copydefault());
                actionBar.OLrzqt(this.this$0.DbNXlk());
                actionBar.EZpvd(this.this$0.AhwBna());
            }
        };
    }

    /* JADX INFO: renamed from: o.Az$ActionBar */
    public static class ActionBar implements InterfaceC4078Ay.ActionBar {
        public long AEQbTJ;
        public AD AYXKKw;
        public long AhwBna;
        public DE EZpvd;
        public long KWHzl;
        public long copydefault;
        public FZ djBIcL;
        public long gEmmrt;
        public int valueOf;
        public AC values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public DE AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void AEQbTJ(int i) {
            this.valueOf = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void AEQbTJ(long j) {
            this.AhwBna = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void AEQbTJ(@NotNull DE de) {
            Intrinsics.checkNotNullParameter(de, "");
            this.EZpvd = de;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public FZ AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public long AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public int EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void EZpvd(long j) {
            this.KWHzl = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void EZpvd(@NotNull AD ad) {
            Intrinsics.checkNotNullParameter(ad, "");
            this.AYXKKw = ad;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void EZpvd(@NotNull FZ fz) {
            Intrinsics.checkNotNullParameter(fz, "");
            this.djBIcL = fz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public long KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void KWHzl(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void OLrzqt(long j) {
            this.gEmmrt = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void OLrzqt(@NotNull AC ac) {
            Intrinsics.checkNotNullParameter(ac, "");
            this.values = ac;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public long copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public void copydefault(long j) {
            this.copydefault = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public long djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public AD gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC4078Ay.ActionBar
        public AC valueOf() {
            return this.values;
        }

        public ActionBar() {
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            this.gEmmrt = C59519zia.EZpvd(30, durationUnit);
            this.AhwBna = C59519zia.EZpvd(30, durationUnit);
            this.copydefault = C59519zia.EZpvd(2, durationUnit);
            this.AEQbTJ = C59519zia.EZpvd(10, durationUnit);
            this.KWHzl = C59519zia.EZpvd(60, durationUnit);
            this.valueOf = 128;
            this.AYXKKw = new C3868Au(null, 1, 0 == true ? 1 : 0);
            this.EZpvd = DE.OLrzqt.AEQbTJ();
            this.values = AC.KWHzl.EZpvd();
            this.djBIcL = FZ.AYXKKw.OLrzqt();
        }
    }
}
