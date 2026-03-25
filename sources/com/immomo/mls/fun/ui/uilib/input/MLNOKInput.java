package com.immomo.mls.fun.ui.uilib.input;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDEditTextFormatter;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.input.MLNOKInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C55258xgZ;
import o.C7343ahz;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKInput extends UDView<C55008xbo> {
    public LuaFunction gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final String[] EZpvd = {"setTitleType", "setSizeType", "showClearButtonWhenEditting", "disabled", "validator", "placeholder", "text", "labelText", "helperView", "errored", "functionView", "helperLabelText", "helperLabelAction", "onlyBottomBorder", "isReadOnly", "setReadOnly", "readOnly", "setFormatter"};
    public static final Integer[] OLrzqt = {0, 1, 2};
    public static final Integer[] KWHzl = {36, 40, 44, 48, 72};
    public static final String AEQbTJ = MLNOKInput.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKInput(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55008xbo AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View viewInflate = LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.isConnected, (ViewGroup) null, false);
        Intrinsics.copydefault(viewInflate, "");
        return (C55008xbo) viewInflate;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, OLrzqt, 0, new Function1() { // from class: o.anu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKInput.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit copydefault(MLNOKInput mLNOKInput, int i) {
        ((C55008xbo) mLNOKInput.dHguZz).setTitleType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSizeType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.OLrzqt(luaValueArr, KWHzl, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.ans
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKInput.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKInput mLNOKInput, int i) {
        ((C55008xbo) mLNOKInput.dHguZz).setSizeType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] validator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.anw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKInput.KWHzl(this.EZpvd, (LuaFunction) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(final MLNOKInput mLNOKInput, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        LuaFunction luaFunction2 = mLNOKInput.gEmmrt;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        mLNOKInput.gEmmrt = luaFunction;
        C55009xbp c55009xbpFIwbmz = ((C55008xbo) mLNOKInput.dHguZz).fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setValidator(new Function1() { // from class: o.anr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNOKInput.KWHzl(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final CharSequence KWHzl(MLNOKInput mLNOKInput, CharSequence charSequence) {
        String strSafeGetJavaString$default;
        LuaFunction luaFunction = mLNOKInput.gEmmrt;
        LuaValue[] luaValueArrInvoke = luaFunction != null ? luaFunction.invoke(LuaValue.rString(String.valueOf(charSequence)), 1) : null;
        return (luaValueArrInvoke == null || (strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArrInvoke, 0, null, 2, null)) == null) ? "" : strSafeGetJavaString$default;
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.anv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKInput.OLrzqt(this.AEQbTJ, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKInput mLNOKInput, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((C55008xbo) mLNOKInput.dHguZz).setSupportingView(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] errored(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rBoolean(((C55008xbo) this.dHguZz).wlaJM() == 2);
    }

    @InterfaceC60044zuT
    public final LuaValue[] functionView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.anq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKInput.copydefault(this.KWHzl, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit copydefault(MLNOKInput mLNOKInput, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55009xbp c55009xbpFIwbmz = ((C55008xbo) mLNOKInput.dHguZz).fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(view);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperLabelAction(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "helperLabelAction", new UDView.TaskDescription() { // from class: o.ant
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKInput.OLrzqt(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKInput mLNOKInput, final LuaFunction luaFunction) {
        View viewIwGUEr = ((C55008xbo) mLNOKInput.dHguZz).iwGUEr();
        if (viewIwGUEr == null || !(viewIwGUEr instanceof C55258xgZ)) {
            return;
        }
        ((C55258xgZ) viewIwGUEr).setOnClickListener(new View.OnClickListener() { // from class: o.anx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKInput.copydefault(luaFunction, view);
            }
        });
    }

    public static final void copydefault(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] isReadOnly(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rBoolean(((C55008xbo) this.dHguZz).wlaJM() == 4);
    }

    public final C55001xbh valueOf() {
        return f_().AkhnZx();
    }

    @InterfaceC60044zuT
    public final LuaValue[] setFormatter(LuaValue[] luaValueArr) {
        C55001xbh c55001xbhValueOf;
        if (luaValueArr != null) {
            if (!(luaValueArr.length == 0)) {
                LuaValue luaValue = luaValueArr[0];
                UDEditTextFormatter uDEditTextFormatter = luaValue instanceof UDEditTextFormatter ? (UDEditTextFormatter) luaValue : null;
                if (uDEditTextFormatter == null || (c55001xbhValueOf = valueOf()) == null) {
                    return null;
                }
                uDEditTextFormatter.AEQbTJ(c55001xbhValueOf);
            }
        }
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        super.destroy();
        LuaFunction luaFunction = this.gEmmrt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.input.MLNOKInput.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] OLrzqt() {
            return MLNOKInput.EZpvd;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] showClearButtonWhenEditting(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C55008xbo) this.dHguZz).zsXlph());
        }
        ((C55008xbo) this.dHguZz).EZpvd(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] disabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C55008xbo) this.dHguZz).wlaJM() == 3);
        }
        ((C55008xbo) this.dHguZz).setState(luaValue.toBoolean() ? 3 : 1);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] placeholder(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55008xbo) this.dHguZz).setHintText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        Editable text;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String string = null;
        if (luaValue == null || !luaValue.isString()) {
            C55001xbh c55001xbhAkhnZx = ((C55008xbo) this.dHguZz).AkhnZx();
            if (c55001xbhAkhnZx != null && (text = c55001xbhAkhnZx.getText()) != null) {
                string = text.toString();
            }
            return LuaValue.rString(string);
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55008xbo) this.dHguZz).setText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] labelText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55008xbo) this.dHguZz).setLabelText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] helperLabelText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55008xbo) this.dHguZz).setLabelText(javaString);
        View viewIwGUEr = ((C55008xbo) this.dHguZz).iwGUEr();
        if (viewIwGUEr == null || !(viewIwGUEr instanceof C55258xgZ)) {
            return null;
        }
        ((C55258xgZ) viewIwGUEr).setHelperLabelType(0);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onlyBottomBorder(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55008xbo) this.dHguZz).setOnlyBottomBorder(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setReadOnly(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        luaValue.toBoolean();
        ((C55008xbo) this.dHguZz).setState(4);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] readOnly(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return isReadOnly(luaValueArr);
        }
        luaValue.toBoolean();
        ((C55008xbo) this.dHguZz).setState(4);
        return null;
    }
}
