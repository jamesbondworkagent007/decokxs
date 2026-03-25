package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5489Ts extends AbstractRunnableC5485To {
    public AbstractRunnableC5485To EZpvd;
    public AbstractRunnableC5485To isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractRunnableC5485To
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.EZpvd((java.lang.Object) str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        this.isConnected = abstractRunnableC5485To;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        this.EZpvd = abstractRunnableC5485To;
    }

    public C5489Ts(java.lang.String str) {
        super(str, false, 2, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] (LINE:8) call: o.Ts.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C5489Ts(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final AbstractRunnableC5485To AuCTel() {
        AbstractRunnableC5485To abstractRunnableC5485To = this.EZpvd;
        if (abstractRunnableC5485To == null) {
            Intrinsics.gEmmrt("");
        }
        return abstractRunnableC5485To;
    }

    public final AbstractRunnableC5485To fJNWhG() {
        AbstractRunnableC5485To abstractRunnableC5485To = this.isConnected;
        if (abstractRunnableC5485To == null) {
            Intrinsics.gEmmrt("");
        }
        return abstractRunnableC5485To;
    }

    @Override // o.AbstractRunnableC5485To
    public void KWHzl(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        AbstractRunnableC5485To abstractRunnableC5485To2 = this.EZpvd;
        if (abstractRunnableC5485To2 == null) {
            Intrinsics.gEmmrt("");
        }
        abstractRunnableC5485To2.KWHzl(abstractRunnableC5485To);
    }

    @Override // o.AbstractRunnableC5485To
    public void copydefault(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        AbstractRunnableC5485To abstractRunnableC5485To2 = this.isConnected;
        if (abstractRunnableC5485To2 == null) {
            Intrinsics.gEmmrt("");
        }
        abstractRunnableC5485To2.copydefault(abstractRunnableC5485To);
    }

    @Override // o.AbstractRunnableC5485To
    public void EZpvd(@NotNull AbstractRunnableC5485To abstractRunnableC5485To) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        AbstractRunnableC5485To abstractRunnableC5485To2 = this.isConnected;
        if (abstractRunnableC5485To2 == null) {
            Intrinsics.gEmmrt("");
        }
        abstractRunnableC5485To2.EZpvd(abstractRunnableC5485To);
    }

    @Override // o.AbstractRunnableC5485To
    public void fetchVPNInfo() {
        synchronized (this) {
            AbstractRunnableC5485To abstractRunnableC5485To = this.isConnected;
            if (abstractRunnableC5485To == null) {
                Intrinsics.gEmmrt("");
            }
            abstractRunnableC5485To.fetchVPNInfo();
        }
    }

    @Override // o.AbstractRunnableC5485To
    public void values() {
        super.values();
        AbstractRunnableC5485To abstractRunnableC5485To = this.EZpvd;
        if (abstractRunnableC5485To == null) {
            Intrinsics.gEmmrt("");
        }
        abstractRunnableC5485To.values();
        AbstractRunnableC5485To abstractRunnableC5485To2 = this.isConnected;
        if (abstractRunnableC5485To2 == null) {
            Intrinsics.gEmmrt("");
        }
        abstractRunnableC5485To2.values();
    }

    /* JADX INFO: renamed from: o.Ts$TaskDescription */
    public static final class TaskDescription {
        public AbstractRunnableC5485To AEQbTJ;
        public final Activity AYXKKw;
        public boolean EZpvd;
        public final AbstractRunnableC5485To KWHzl;
        public int OLrzqt;
        public final C5489Ts copydefault;
        public final AbstractRunnableC5485To valueOf;

        public TaskDescription(@NotNull java.lang.String str, @NotNull Activity activity) {
            Intrinsics.EZpvd((java.lang.Object) str, "");
            Intrinsics.EZpvd((java.lang.Object) activity, "");
            this.AYXKKw = activity;
            this.copydefault = new C5489Ts(str, null);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.valueOf = new StateListAnimator(str + "_start(" + jCurrentTimeMillis + ")");
            this.KWHzl = new StateListAnimator(str + "_end(" + jCurrentTimeMillis + ")");
        }

        public final C5489Ts KWHzl() {
            AbstractRunnableC5485To abstractRunnableC5485To = this.AEQbTJ;
            if (abstractRunnableC5485To == null) {
                this.valueOf.KWHzl(this.KWHzl);
            } else if (this.EZpvd) {
                AbstractRunnableC5485To abstractRunnableC5485To2 = this.valueOf;
                if (abstractRunnableC5485To == null) {
                    Intrinsics.KWHzl();
                }
                abstractRunnableC5485To2.KWHzl(abstractRunnableC5485To);
            }
            this.valueOf.EZpvd(this.OLrzqt);
            this.KWHzl.EZpvd(this.OLrzqt);
            this.copydefault.AhwBna(this.valueOf);
            this.copydefault.djBIcL(this.KWHzl);
            return this.copydefault;
        }

        public final TaskDescription KWHzl(java.lang.String str) {
            AbstractRunnableC5485To abstractRunnableC5485ToAEQbTJ = this.AYXKKw.AEQbTJ(str);
            if (abstractRunnableC5485ToAEQbTJ.AYXKKw() > this.OLrzqt) {
                this.OLrzqt = abstractRunnableC5485ToAEQbTJ.AYXKKw();
            }
            return KWHzl(this.AYXKKw.AEQbTJ(str));
        }

        public final TaskDescription KWHzl(AbstractRunnableC5485To abstractRunnableC5485To) {
            AbstractRunnableC5485To abstractRunnableC5485To2;
            if (this.EZpvd && (abstractRunnableC5485To2 = this.AEQbTJ) != null) {
                AbstractRunnableC5485To abstractRunnableC5485To3 = this.valueOf;
                if (abstractRunnableC5485To2 == null) {
                    Intrinsics.KWHzl();
                }
                abstractRunnableC5485To3.KWHzl(abstractRunnableC5485To2);
            }
            this.AEQbTJ = abstractRunnableC5485To;
            this.EZpvd = true;
            if (abstractRunnableC5485To == null) {
                Intrinsics.KWHzl();
            }
            abstractRunnableC5485To.KWHzl(this.KWHzl);
            return this;
        }

        public final TaskDescription copydefault(@NotNull java.lang.String... strArr) {
            Intrinsics.EZpvd((java.lang.Object) strArr, "");
            if (!(strArr.length == 0)) {
                for (java.lang.String str : strArr) {
                    AbstractRunnableC5485To abstractRunnableC5485ToAEQbTJ = this.AYXKKw.AEQbTJ(str);
                    AbstractRunnableC5485To abstractRunnableC5485To = this.AEQbTJ;
                    if (abstractRunnableC5485To == null) {
                        Intrinsics.KWHzl();
                    }
                    abstractRunnableC5485ToAEQbTJ.KWHzl(abstractRunnableC5485To);
                    this.KWHzl.EZpvd(abstractRunnableC5485ToAEQbTJ);
                }
                this.EZpvd = false;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: o.Ts$Activity */
    public static class Activity {
        public final java.util.Map<java.lang.String, AbstractRunnableC5485To> AEQbTJ;
        public final InterfaceC5482Tl KWHzl;

        public Activity(@NotNull InterfaceC5482Tl interfaceC5482Tl) {
            Intrinsics.EZpvd((java.lang.Object) interfaceC5482Tl, "");
            this.AEQbTJ = new LinkedHashMap();
            this.KWHzl = interfaceC5482Tl;
        }

        public final AbstractRunnableC5485To AEQbTJ(java.lang.String str) {
            synchronized (this) {
                AbstractRunnableC5485To abstractRunnableC5485To = this.AEQbTJ.get(str);
                if (abstractRunnableC5485To != null) {
                    return abstractRunnableC5485To;
                }
                InterfaceC5482Tl interfaceC5482Tl = this.KWHzl;
                if (str == null) {
                    Intrinsics.KWHzl();
                }
                AbstractRunnableC5485To abstractRunnableC5485ToOLrzqt = interfaceC5482Tl.OLrzqt(str);
                this.AEQbTJ.put(str, abstractRunnableC5485ToOLrzqt);
                return abstractRunnableC5485ToOLrzqt;
            }
        }
    }

    /* JADX INFO: renamed from: o.Ts$StateListAnimator */
    public static final class StateListAnimator extends AbstractRunnableC5485To {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractRunnableC5485To
        public void AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.EZpvd((java.lang.Object) str, "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(str, false, 2, null);
            Intrinsics.EZpvd((java.lang.Object) str, "");
        }
    }
}
