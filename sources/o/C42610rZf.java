package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42610rZf extends C43265rly {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rZp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42610rZf.EZpvd();
        }
    });

    public final InterfaceC42625rZu AEQbTJ() {
        return (InterfaceC42625rZu) this.OLrzqt.getValue();
    }

    public static final InterfaceC42625rZu EZpvd() {
        return (InterfaceC42625rZu) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC42625rZu.class);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
        C46945tgj.AEQbTJ.djBIcL().EZpvd("", AEQbTJ().Dmq());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(rXO.class, C56392yDr.copydefault(new Function0() { // from class: o.rZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42610rZf.KWHzl();
            }
        }));
        interfaceC43253rlm.EZpvd(rXQ.class, C56392yDr.copydefault(new Function0() { // from class: o.rZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42610rZf.valueOf(this.OLrzqt);
            }
        }));
        interfaceC43253rlm.EZpvd(rXT.class, C56392yDr.copydefault(new Function0() { // from class: o.rZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42610rZf.AhwBna(this.KWHzl);
            }
        }));
    }

    public static final C42627rZw KWHzl() {
        return new C42627rZw();
    }

    public static final rZA valueOf(C42610rZf c42610rZf) {
        return c42610rZf.AEQbTJ().call();
    }

    public static final rXT AhwBna(C42610rZf c42610rZf) {
        return c42610rZf.AEQbTJ().DCUTEIddSDPG();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(C42587rYj.KWHzl(), C56392yDr.copydefault(new Function0() { // from class: o.rZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42610rZf.copydefault(this.EZpvd);
            }
        }));
        interfaceC43237rlW.copydefault(C42587rYj.EZpvd(), C56392yDr.copydefault(new Function0() { // from class: o.rZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42610rZf.AYXKKw(this.KWHzl);
            }
        }));
        C42582rYe.EZpvd(interfaceC43237rlW);
    }

    public static final C42583rYf copydefault(C42610rZf c42610rZf) {
        return c42610rZf.AEQbTJ().spnCvw();
    }

    public static final C42583rYf AYXKKw(C42610rZf c42610rZf) {
        return c42610rZf.AEQbTJ().spnCvw();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        super.onLaunchComplete();
        AEQbTJ().zblBkD().AEQbTJ();
    }
}
