package com.immomo.mls.fun.ui.uilib.coachmark;

import android.view.View;
import com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMarkItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52812wZg;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKCoachMarkItem extends LuaUserdata<C52812wZg.StateListAnimator> {
    public static final int $stable = 0;
    public static final String LUA_CLASS_NAME = "OKCoachMarkItem";
    public static final Activity Companion = new Activity(null);
    public static final String[] methods = {"setDirection", "headline", "description", "pointingRectMargins", "pointingRectRadius", "onClickNextCallback", "onClickPrevCallback"};
    public static final String TAG = MLNOKCoachMarkItem.class.getSimpleName();
    public static final Integer[] DIRECTIONS = {1, 3, 0, 2};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC60044zuT
    public MLNOKCoachMarkItem(long j, @NotNull LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.and
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCoachMarkItem.OLrzqt(this.KWHzl, (android.view.View) obj);
            }
        });
    }

    public static final Unit OLrzqt(MLNOKCoachMarkItem mLNOKCoachMarkItem, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        mLNOKCoachMarkItem.copydefault(view);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, o.wZg$StateListAnimator] */
    public final void copydefault(View view) {
        this.javaUserdata = new C52812wZg.StateListAnimator(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] pointingRectMargins(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C52812wZg.StateListAnimator stateListAnimator = (C52812wZg.StateListAnimator) this.javaUserdata;
        stateListAnimator.AEQbTJ(C7594aml.safeGetInt$default(luaValueArr, 0, 0, 2, null));
        stateListAnimator.copydefault(C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null));
        stateListAnimator.OLrzqt(C7594aml.safeGetInt$default(luaValueArr, 2, 0, 2, null));
        stateListAnimator.KWHzl(C7594aml.safeGetInt$default(luaValueArr, 3, 0, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onClickNextCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.anb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCoachMarkItem.EZpvd(this.OLrzqt, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(MLNOKCoachMarkItem mLNOKCoachMarkItem, final LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        ((C52812wZg.StateListAnimator) mLNOKCoachMarkItem.javaUserdata).copydefault(new Function0() { // from class: o.anc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MLNOKCoachMarkItem.copydefault(luaFunction));
            }
        });
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(LuaFunction luaFunction) {
        luaFunction.OLrzqt();
        return false;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onClickPrevCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.ane
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCoachMarkItem.copydefault(this.AEQbTJ, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(MLNOKCoachMarkItem mLNOKCoachMarkItem, final LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        ((C52812wZg.StateListAnimator) mLNOKCoachMarkItem.javaUserdata).KWHzl(new Function0() { // from class: o.anf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MLNOKCoachMarkItem.OLrzqt(luaFunction));
            }
        });
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(LuaFunction luaFunction) {
        luaFunction.OLrzqt();
        return false;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMarkItem.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] AEQbTJ() {
            return MLNOKCoachMarkItem.methods;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] setDirection(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(DIRECTIONS, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C52812wZg.StateListAnimator) this.javaUserdata).EZpvd(num.intValue());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] headline(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C52812wZg.StateListAnimator) this.javaUserdata).AEQbTJ(javaString);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] description(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C52812wZg.StateListAnimator) this.javaUserdata).OLrzqt(javaString);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public final LuaValue[] pointingRectRadius(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        ((C52812wZg.StateListAnimator) this.javaUserdata).AEQbTJ(luaValue.toFloat());
        return null;
    }
}
