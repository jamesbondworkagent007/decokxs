package o;

import com.okinc.di.LocalizeDIModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46520tXj extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        interfaceC43253rlm.KWHzl(InterfaceC46557tYt.class, tXZ.class);
        interfaceC43253rlm.EZpvd(InterfaceC46554tYq.class, C56392yDr.copydefault(new Function0() { // from class: o.tXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46520tXj.AhwBna();
            }
        }));
        interfaceC43253rlm.KWHzl(InterfaceC46553tYp.class, tXK.class);
        interfaceC43253rlm.EZpvd(InterfaceC46550tYm.class, C56392yDr.copydefault(new Function0() { // from class: o.tXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46520tXj.valueOf();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC46552tYo.class, C56392yDr.copydefault(new Function0() { // from class: o.tXo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46520tXj.gEmmrt();
            }
        }));
    }

    public static final tXT AhwBna() {
        return new tXT(((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt(), new tXD());
    }

    public static final tXP valueOf() {
        return new tXP();
    }

    public static final tXX gEmmrt() {
        return new tXX();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.tXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46520tXj.OLrzqt();
            }
        }));
    }

    public static final C46549tYl OLrzqt() {
        return new C46549tYl();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        tXF.AEQbTJ(interfaceC43237rlW);
    }
}
