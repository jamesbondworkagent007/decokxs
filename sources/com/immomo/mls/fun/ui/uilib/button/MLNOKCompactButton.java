package com.immomo.mls.fun.ui.uilib.button;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.button.MLNOKCompactButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.wYB;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKCompactButton extends UDView<wYB> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] KWHzl = {"setImage", "setTitle", "setStyle", "setSize"};
    public static final Integer[] EZpvd = {0, 1, 2, 3};
    public static final Integer[] AEQbTJ = {-3, -5};
    public static final String copydefault = MLNOKCompactButton.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKCompactButton(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public wYB AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new wYB(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, EZpvd, 0, new Function1() { // from class: o.amO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCompactButton.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit EZpvd(MLNOKCompactButton mLNOKCompactButton, int i) {
        ((wYB) mLNOKCompactButton.dHguZz).setStyle(i);
        if (i == 0 || i == 1) {
            ((wYB) mLNOKCompactButton.dHguZz).setTintColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        } else if (i == 2 || i == 3) {
            ((wYB) mLNOKCompactButton.dHguZz).setTintColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW), C33070mpX.copydefault(C52761wXj.Activity.htlTjW), C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.amM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCompactButton.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKCompactButton mLNOKCompactButton, int i) {
        ((wYB) mLNOKCompactButton.dHguZz).setOKDSSize(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeLoadImage$default(luaValueArr, ((wYB) this.dHguZz).OLrzqt(), 0, (Function1) null, 6, (Object) null);
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.button.MLNOKCompactButton.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] KWHzl() {
            return MLNOKCompactButton.KWHzl;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((wYB) this.dHguZz).AEQbTJ().setText(javaString);
        return null;
    }
}
