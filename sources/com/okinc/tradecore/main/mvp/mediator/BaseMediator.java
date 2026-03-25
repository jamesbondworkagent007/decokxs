package com.okinc.tradecore.main.mvp.mediator;

import android.app.Application;
import android.view.View;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradecore.main.mvp.home.EventTrade;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49498upg;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseMediator extends AbsPresenter implements InterfaceC49498upg {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseMediator() {
        this((Application) null, (SavedStateHandle) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49498upg
    public Object AEQbTJ(@NotNull EventTrade eventTrade, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(eventTrade, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        return null;
    }

    public void AEQbTJ() {
    }

    public void KWHzl() {
    }

    public void OLrzqt() {
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49498upg
    public void onEvent(@NotNull EventTrade eventTrade) {
        Intrinsics.checkNotNullParameter(eventTrade, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:android.app.Application:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:android.app.Application:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: android.app.Application.<init>():void type: CONSTRUCTOR) : (r1v0 android.app.Application))
  (wrap:androidx.lifecycle.SavedStateHandle:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.lifecycle.SavedStateHandle:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: androidx.lifecycle.SavedStateHandle.<init>():void type: CONSTRUCTOR) : (r2v0 androidx.lifecycle.SavedStateHandle))
 A[MD:(android.app.Application, androidx.lifecycle.SavedStateHandle):void (m)] (LINE:13) call: com.okinc.tradecore.main.mvp.mediator.BaseMediator.<init>(android.app.Application, androidx.lifecycle.SavedStateHandle):void type: THIS */
    public /* synthetic */ BaseMediator(Application application, SavedStateHandle savedStateHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Application() : application, (i & 2) != 0 ? new SavedStateHandle() : savedStateHandle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMediator(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseMediator(@NotNull View view, InterfaceC49498upg interfaceC49498upg, Application application, SavedStateHandle savedStateHandle) {
        this(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.copydefault(application);
        Intrinsics.copydefault(savedStateHandle);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
