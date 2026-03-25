package o;

import com.okinc.business.defi.biz.database.wallet.dao.PasswordDao;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cPU {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final PasswordDao AEQbTJ;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cPU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ cPU getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.OLrzqt(context);
        }

        public final cPU OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AuCTel();
        }
    }

    public cPU(@NotNull PasswordDao passwordDao) {
        Intrinsics.checkNotNullParameter(passwordDao, "");
        this.AEQbTJ = passwordDao;
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.AEQbTJ(this.copydefault, str, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit AEQbTJ(cPU cpu, java.lang.String str, boolean z) {
        cpu.AEQbTJ.OLrzqt(str, z);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.EZpvd(this.OLrzqt, str, str2, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit EZpvd(cPU cpu, java.lang.String str, java.lang.String str2, boolean z) {
        cpu.AEQbTJ.EZpvd(str, str2, z);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.djBIcL(this.OLrzqt, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit djBIcL(cPU cpu, java.lang.String str) {
        cpu.AEQbTJ.AYXKKw(str);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.gEmmrt(this.EZpvd, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit gEmmrt(cPU cpu, java.lang.String str) {
        cpu.AEQbTJ.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.lang.Boolean> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.valueOf(this.copydefault, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Boolean valueOf(cPU cpu, java.lang.String str) {
        boolean zKWHzl;
        try {
            zKWHzl = cpu.AEQbTJ.KWHzl(str);
        } catch (java.lang.Throwable unused) {
            zKWHzl = false;
        }
        return java.lang.Boolean.valueOf(zKWHzl);
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.gEmmrt(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.String gEmmrt(cPU cpu) {
        return cpu.AEQbTJ.AEQbTJ();
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.AYXKKw(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.String AYXKKw(cPU cpu, java.lang.String str) {
        return cpu.AEQbTJ.copydefault(str);
    }

    public final AbstractC58260yxt<java.lang.Boolean> KWHzl() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.djBIcL(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Boolean djBIcL(cPU cpu) {
        return java.lang.Boolean.valueOf(cpu.AEQbTJ.AYXKKw());
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.AhwBna(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Boolean AhwBna(cPU cpu) {
        return java.lang.Boolean.valueOf(cpu.AEQbTJ.djBIcL());
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.valueOf(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.String valueOf(cPU cpu) {
        return cpu.AEQbTJ.copydefault();
    }

    public final AbstractC58260yxt<java.lang.Long> EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.AhwBna(this.copydefault, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long AhwBna(cPU cpu, java.lang.String str) {
        return java.lang.Long.valueOf(cpu.AEQbTJ.gEmmrt(str));
    }

    public final AbstractC58260yxt<java.lang.Integer> AYXKKw() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPU.AYXKKw(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AYXKKw(cPU cpu) {
        return java.lang.Integer.valueOf(cpu.AEQbTJ.AhwBna());
    }

    public final boolean AEQbTJ() {
        return this.AEQbTJ.gEmmrt();
    }
}
