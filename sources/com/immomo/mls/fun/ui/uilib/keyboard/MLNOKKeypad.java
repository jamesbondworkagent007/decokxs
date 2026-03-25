package com.immomo.mls.fun.ui.uilib.keyboard;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypad;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55030xcJ;
import o.C55033xcM;
import o.C7594aml;
import o.InterfaceC60044zuT;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKKeypad extends UDView<C55030xcJ> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] AEQbTJ = {"bindLabel"};
    public static final String KWHzl = MLNOKKeypad.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKKeypad(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55030xcJ AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55030xcJ(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] bindLabel(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessView$default(luaValueArr, 0, new Function1() { // from class: o.anF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKKeypad.OLrzqt(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKKeypad mLNOKKeypad, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof C55033xcM) {
            ((C55030xcJ) mLNOKKeypad.dHguZz).setEditable(((C55033xcM) view).KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypad.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] OLrzqt() {
            return MLNOKKeypad.AEQbTJ;
        }
    }
}
