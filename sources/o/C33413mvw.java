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

/* JADX INFO: renamed from: o.mvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33413mvw extends AbstractC43215rlA implements InterfaceC33233msb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mvy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33413mvw.gEmmrt();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mvz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33413mvw.AhwBna();
        }
    });
    public final StateFlow<AbstractC33240msi> copydefault = valueOf().fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33233msb
    public StateFlow<AbstractC33240msi> KWHzl() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.mvw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mvw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final C33458mwo valueOf() {
        return (C33458mwo) this.KWHzl.getValue();
    }

    public static final C33458mwo gEmmrt() {
        return C33458mwo.Companion.KWHzl();
    }

    public final C33452mwi AYXKKw() {
        return (C33452mwi) this.AEQbTJ.getValue();
    }

    public static final C33452mwi AhwBna() {
        return C33452mwi.Companion.KWHzl();
    }

    @Override // o.InterfaceC33233msb
    public androidx.fragment.app.Fragment AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
        pUU.EZpvd("ModeSwitch", "OKLiteAppService: showLiteSubModeChangeDialog, source=" + modeSwitchSourceEnum);
        return AYXKKw().copydefault(fragmentManager, modeSwitchSourceEnum);
    }

    @Override // o.InterfaceC33233msb
    public java.lang.Object KWHzl(@NotNull AbstractC33240msi abstractC33240msi, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("ModeSwitch", "OKLiteAppService: switchLiteSubMode with context, mode=" + abstractC33240msi);
        return valueOf().EZpvd(abstractC33240msi, context, bundle, continuation);
    }

    @Override // o.InterfaceC33233msb
    public java.lang.Object copydefault(@NotNull AbstractC33240msi abstractC33240msi, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        pUU.KWHzl("ModeSwitch", "OKLiteAppService: switchLiteSubMode, mode=" + abstractC33240msi);
        return valueOf().AEQbTJ(abstractC33240msi, continuation);
    }

    @Override // o.InterfaceC33233msb
    public boolean AEQbTJ() {
        boolean zValueOf = valueOf().valueOf();
        pUU.EZpvd("ModeSwitch", "OKLiteAppService: canSwitchLiteSubMode=" + zValueOf);
        return zValueOf;
    }

    @Override // o.InterfaceC33233msb
    public boolean AEQbTJ(@NotNull AbstractC33240msi abstractC33240msi) {
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        boolean zCopydefault = valueOf().copydefault(abstractC33240msi);
        pUU.EZpvd("ModeSwitch", "OKLiteAppService: canSwitchLiteSubMode to " + abstractC33240msi + ContainerUtils.KEY_VALUE_DELIMITER + zCopydefault);
        return zCopydefault;
    }

    @Override // o.InterfaceC33233msb
    public android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return C33373mvI.KWHzl.AEQbTJ(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource.name(), new Function2() { // from class: o.mvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33413mvw.KWHzl(function2, ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(Function2 function2, int i, int i2) {
        function2.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC33233msb
    public boolean EZpvd() {
        return C33367mvC.djBIcL();
    }

    @Override // o.InterfaceC33233msb
    public java.util.List<AbstractC33240msi> copydefault() {
        return valueOf().DbNXlk();
    }
}
