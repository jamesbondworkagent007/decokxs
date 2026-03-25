package com.okinc.ok_kyc_core.extension.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;
import com.okinc.ok_kyc_core.extension.widget.SimulateEntityHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C41935rAf;
import o.C43662rtX;
import o.C52761wXj;
import o.C55097xdX;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SimulateEntityHeaderView extends LinearLayout {
    public final C41935rAf EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimulateEntityHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimulateEntityHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: com.okinc.ok_kyc_core.extension.widget.SimulateEntityHeaderView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ SimulateEntityHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulateEntityHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C41935rAf c41935rAfCopydefault = C41935rAf.copydefault(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c41935rAfCopydefault, "");
        this.EZpvd = c41935rAfCopydefault;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoginState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LoginState[] $VALUES;
        private final int value;
        public static final LoginState LOGIN = new LoginState("LOGIN", 0, 1);
        public static final LoginState UNLOGIN = new LoginState("UNLOGIN", 1, 0);
        public static final LoginState DEFAULT = new LoginState("DEFAULT", 2, -1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LoginState[] $values() {
            return new LoginState[]{LOGIN, UNLOGIN, DEFAULT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LoginState> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private LoginState(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            LoginState[] loginStateArr$values = $values();
            $VALUES = loginStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(loginStateArr$values);
        }

        public static LoginState valueOf(String str) {
            return (LoginState) Enum.valueOf(LoginState.class, str);
        }

        public static LoginState[] values() {
            return (LoginState[]) $VALUES.clone();
        }
    }

    public final void setTopNotificationContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55097xdX c55097xdX = this.EZpvd.KWHzl;
        c55097xdX.setType(2);
        c55097xdX.setState(5);
        c55097xdX.setMessage(str);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.KWHzl().setTextColor(ContextCompat.getColor(c55097xdX.getContext(), C52761wXj.Activity.iLAtSv));
        c55097xdX.setBackgroundColor(ContextCompat.getColor(c55097xdX.getContext(), C52761wXj.Activity.QfZsXX));
    }

    public final void setLoginStatusCheckListener(@NotNull final Function1<? super LoginState, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd.AEQbTJ.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.rCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
                SimulateEntityHeaderView.setLoginStatusCheckListener$lambda$1(function1, radioGroup, i);
            }
        });
    }

    public static final void setLoginStatusCheckListener$lambda$1(Function1 function1, RadioGroup radioGroup, int i) {
        LoginState loginState;
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == C43662rtX.ActionBar.Th) {
            loginState = LoginState.LOGIN;
        } else if (checkedRadioButtonId == C43662rtX.ActionBar.DTeKQX) {
            loginState = LoginState.UNLOGIN;
        } else {
            loginState = LoginState.DEFAULT;
        }
        function1.invoke(loginState);
    }

    public final boolean AEQbTJ() {
        return this.EZpvd.OLrzqt.isChecked() || this.EZpvd.EZpvd.isChecked();
    }
}
