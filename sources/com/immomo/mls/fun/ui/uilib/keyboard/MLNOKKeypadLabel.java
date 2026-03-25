package com.immomo.mls.fun.ui.uilib.keyboard;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypadLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55033xcM;
import o.C59454zhO;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKKeypadLabel extends UDView<C55033xcM> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] copydefault = {"plainNumericText", "formatter", "maxDecimalValue", "maxIntegerLength"};
    public static final String KWHzl = MLNOKKeypadLabel.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKKeypadLabel(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55033xcM AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55033xcM c55033xcM = new C55033xcM(contextAubY, null, 2, null);
        c55033xcM.setOnTextWillChange(new Function2() { // from class: o.anL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MLNOKKeypadLabel.AEQbTJ((C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        });
        return c55033xcM;
    }

    public static final Unit AEQbTJ(C55033xcM c55033xcM, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        c55033xcM.setTextByAnimation(charSequence);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] formatter(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "formatter", new UDView.TaskDescription() { // from class: o.anN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKKeypadLabel.KWHzl(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void KWHzl(MLNOKKeypadLabel mLNOKKeypadLabel, final LuaFunction luaFunction) {
        ((C55033xcM) mLNOKKeypadLabel.dHguZz).setOnTextWillChange(new Function2() { // from class: o.anK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MLNOKKeypadLabel.OLrzqt(luaFunction, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        });
    }

    public static final Unit OLrzqt(LuaFunction luaFunction, C55033xcM c55033xcM, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (luaFunction != null) {
            LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.rString(charSequence.toString()), 1);
            Intrinsics.copydefault(luaValueArrInvoke);
            charSequence = C7594aml.safeGetJavaString$default(luaValueArrInvoke, 0, null, 3, null);
        }
        c55033xcM.setTextByAnimation(charSequence);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypadLabel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] EZpvd() {
            return MLNOKKeypadLabel.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] plainNumericText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            String strValueOf = ((C55033xcM) this.dHguZz).valueOf();
            if (StringsKt__StringsKt.startsWith$default((CharSequence) strValueOf, '.', false, 2, (Object) null)) {
                strValueOf = "0" + strValueOf;
            } else if (StringsKt__StringsKt.endsWith$default((CharSequence) strValueOf, '.', false, 2, (Object) null)) {
                strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
            }
            return LuaValue.rString(strValueOf);
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55033xcM) this.dHguZz).setPlainNumericText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] maxDecimalValue(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return LuaValue.rNumber(((C55033xcM) this.dHguZz).OLrzqt());
        }
        ((C55033xcM) this.dHguZz).setMaxDecimalValue(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] maxIntegerLength(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return LuaValue.rNumber(((C55033xcM) this.dHguZz).AYXKKw());
        }
        ((C55033xcM) this.dHguZz).setMaxIntegerLength(luaValue.toInt());
        return null;
    }
}
