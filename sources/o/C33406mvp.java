package o;

import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33406mvp extends AbstractC43215rlA implements InterfaceC33237msf {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mvs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33406mvp.AYXKKw();
        }
    });
    public final StateFlow<AbstractC33249msr> OLrzqt = valueOf().AYXKKw();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33406mvp.djBIcL();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33237msf
    public StateFlow<AbstractC33249msr> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.mvp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C33453mwj valueOf() {
        return (C33453mwj) this.AEQbTJ.getValue();
    }

    public static final C33453mwj AYXKKw() {
        return C33453mwj.Companion.OLrzqt();
    }

    public final C33462mws AhwBna() {
        return (C33462mws) this.EZpvd.getValue();
    }

    public static final C33462mws djBIcL() {
        return C33462mws.Companion.OLrzqt();
    }

    @Override // o.InterfaceC33237msf
    public java.lang.Object KWHzl(@NotNull AbstractC33249msr abstractC33249msr, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("ModeSwitch", "OKAppSubModeService: switchProSubMode with context, mode=" + abstractC33249msr);
        return valueOf().KWHzl(abstractC33249msr, context, bundle, continuation);
    }

    @Override // o.InterfaceC33237msf
    public java.lang.Object OLrzqt(@NotNull AbstractC33249msr abstractC33249msr, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("ModeSwitch", "OKAppSubModeService: switchProSubMode, mode=" + abstractC33249msr);
        return valueOf().copydefault(abstractC33249msr, continuation);
    }

    @Override // o.InterfaceC33237msf
    public androidx.fragment.app.Fragment OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        pUU.EZpvd("ModeSwitch", "OKAppSubModeService: showProSubModeChangeDialog, source=" + modeSwitchSourceEnum);
        return AhwBna().copydefault(fragmentManager, modeSwitchSourceEnum);
    }

    @Override // o.InterfaceC33237msf
    public boolean AEQbTJ() {
        boolean zFetchVPNInfo = valueOf().fetchVPNInfo();
        pUU.EZpvd("ModeSwitch", "OKAppSubModeService: canSwitchProSubMode=" + zFetchVPNInfo);
        return zFetchVPNInfo;
    }

    @Override // o.InterfaceC33237msf
    public boolean EZpvd(@NotNull AbstractC33249msr abstractC33249msr) {
        Intrinsics.checkNotNullParameter(abstractC33249msr, "");
        boolean zFetchVPNInfo = valueOf().fetchVPNInfo();
        pUU.EZpvd("ModeSwitch", "OKAppSubModeService: canSwitchProSubMode to " + abstractC33249msr + ContainerUtils.KEY_VALUE_DELIMITER + zFetchVPNInfo);
        return zFetchVPNInfo;
    }

    @Override // o.InterfaceC33237msf
    public android.view.View copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return C33373mvI.KWHzl.AEQbTJ(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource.name(), new Function2() { // from class: o.mvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33406mvp.copydefault(function2, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Unit copydefault(Function2 function2, int i, int i2) {
        function2.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC33237msf
    public boolean copydefault() {
        return C33367mvC.djBIcL();
    }
}
