package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32794mkM extends C43265rly {
    public final java.lang.String KWHzl = "security/scanner/device";

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC32801mkT.class, C56392yDr.copydefault(new Function0() { // from class: o.mkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32794mkM.EZpvd();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC32807mkZ.class, C56392yDr.copydefault(new Function0() { // from class: o.mkR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32794mkM.AYXKKw();
            }
        }));
    }

    public static final C32802mkU EZpvd() {
        return new C32802mkU();
    }

    public static final C32803mkV AYXKKw() {
        return new C32803mkV();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(new TaskDescription(), C56392yDr.copydefault(new Function0() { // from class: o.mkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32794mkM.AEQbTJ();
            }
        }));
    }

    /* JADX INFO: renamed from: o.mkM$TaskDescription */
    public static final class TaskDescription implements InterfaceC43233rlS {
        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }

        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return C32794mkM.this.KWHzl;
        }

        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return DeeplinkMode.APP;
        }
    }

    public static final C32688miM AEQbTJ() {
        return new C32688miM();
    }
}
