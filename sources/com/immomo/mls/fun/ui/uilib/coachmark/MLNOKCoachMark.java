package com.immomo.mls.fun.ui.uilib.coachmark;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMark;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52794wYp;
import o.C52812wZg;
import o.C7594aml;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKCoachMark extends UDView<View> {
    public C52812wZg EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static final String[] OLrzqt = {"addItem", "setDismissType", "currentIndex", "didDismissCallback", "closeCallback", "backAction", "nextAction", "show", "dismiss", "setPrimaryButtonText", "doneCallback", "stepGone", "secondaryGone"};
    public static final String copydefault = MLNOKCoachMark.class.getSimpleName();
    public static final Integer[] KWHzl = {0, 1, 2, 3};

    @InterfaceC60044zuT
    public MLNOKCoachMark(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View view = new View(AubY());
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        this.EZpvd = new C52812wZg(contextAubY);
        return view;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDismissType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, KWHzl, 0, new Function1() { // from class: o.amV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCoachMark.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit KWHzl(MLNOKCoachMark mLNOKCoachMark, int i) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.OLrzqt(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] currentIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C52812wZg c52812wZg = this.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        return LuaValue.rNumber(c52812wZg.AYXKKw());
    }

    @InterfaceC60044zuT
    public final LuaValue[] didDismissCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "didDismissCallback", new UDView.TaskDescription() { // from class: o.amS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCoachMark.valueOf(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(MLNOKCoachMark mLNOKCoachMark, final LuaFunction luaFunction) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.KWHzl(new Function0() { // from class: o.amY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKCoachMark.KWHzl(luaFunction);
            }
        });
    }

    @InterfaceC60044zuT
    public final LuaValue[] closeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "closeCallback", new UDView.TaskDescription() { // from class: o.amT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCoachMark.gEmmrt(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(MLNOKCoachMark mLNOKCoachMark, final LuaFunction luaFunction) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.EZpvd(new Function0() { // from class: o.ana
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKCoachMark.OLrzqt(luaFunction);
            }
        });
    }

    public static final void KWHzl(LuaFunction luaFunction, MLNOKCoachMark mLNOKCoachMark, View view) {
        if (luaFunction != null) {
            luaFunction.AEQbTJ(mLNOKCoachMark);
        }
    }

    public static final void djBIcL(final MLNOKCoachMark mLNOKCoachMark, final LuaFunction luaFunction) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
        if (c52794wYpIsConnected != null) {
            c52794wYpIsConnected.setOnClickListener(new View.OnClickListener() { // from class: o.amP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKCoachMark.KWHzl(luaFunction, mLNOKCoachMark, view);
                }
            });
        }
    }

    public static final void AhwBna(final MLNOKCoachMark mLNOKCoachMark, final LuaFunction luaFunction) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.amW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKCoachMark.copydefault(luaFunction, mLNOKCoachMark, view);
                }
            });
        }
    }

    public static final void copydefault(LuaFunction luaFunction, MLNOKCoachMark mLNOKCoachMark, View view) {
        if (luaFunction != null) {
            luaFunction.AEQbTJ(mLNOKCoachMark);
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] show(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C52812wZg c52812wZg = this.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.fARcdN();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C52812wZg c52812wZg = this.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.KWHzl();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] doneCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "doneCallback", new UDView.TaskDescription() { // from class: o.amR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCoachMark.AYXKKw(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void AYXKKw(MLNOKCoachMark mLNOKCoachMark, final LuaFunction luaFunction) {
        C52812wZg c52812wZg = mLNOKCoachMark.EZpvd;
        if (c52812wZg == null) {
            Intrinsics.gEmmrt("");
            c52812wZg = null;
        }
        c52812wZg.AEQbTJ(new Function0() { // from class: o.amX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKCoachMark.gEmmrt(luaFunction);
            }
        });
    }

    public static final Unit gEmmrt(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMark.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] copydefault() {
            return MLNOKCoachMark.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] addItem(@NotNull LuaValue[] luaValueArr) {
        Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) MLNOKCoachMarkItem.class)) != null) {
            MLNOKCoachMarkItem mLNOKCoachMarkItem = (MLNOKCoachMarkItem) objAEQbTJ;
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            C52812wZg.StateListAnimator javaUserdata = mLNOKCoachMarkItem.getJavaUserdata();
            Intrinsics.checkNotNullExpressionValue(javaUserdata, "");
            c52812wZg.AEQbTJ(javaUserdata);
            luaValue.destroy();
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] backAction(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
            if (c52794wYpIsConnected != null) {
                c52794wYpIsConnected.setText(javaString);
            }
        }
        KWHzl(luaValueArr, 1, "backAction", new UDView.TaskDescription() { // from class: o.amZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCoachMark.djBIcL(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] nextAction(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
            if (c52794wYpAkhnZx != null) {
                c52794wYpAkhnZx.setText(javaString);
            }
        }
        KWHzl(luaValueArr, 1, "nextAction", new UDView.TaskDescription() { // from class: o.amU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKCoachMark.AhwBna(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPrimaryButtonText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
            if (c52794wYpIsConnected != null) {
                c52794wYpIsConnected.setText(javaString);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] stepGone(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            TextView textViewValues = c52812wZg.values();
            if (textViewValues != null) {
                textViewValues.setVisibility(z ? 8 : 0);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] secondaryGone(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg == null) {
                Intrinsics.gEmmrt("");
                c52812wZg = null;
            }
            C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
            if (c52794wYpAkhnZx != null) {
                c52794wYpAkhnZx.setVisibility(z ? 8 : 0);
            }
        }
        return null;
    }
}
