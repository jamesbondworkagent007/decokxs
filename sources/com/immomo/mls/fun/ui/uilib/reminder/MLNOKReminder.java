package com.immomo.mls.fun.ui.uilib.reminder;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.reminder.MLNOKReminder;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7594aml;
import o.C7911ask;
import o.InterfaceC60044zuT;
import o.InterfaceC7852are;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKReminder extends UDView<OKReminder> {
    public final Integer[] copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final String[] EZpvd = {"setStyle", "setLeadingIconVisibility", "setTitle", "setMessage", "setMessageWithMoreView", "setPrimaryAction", "setSecondaryAction", "setCloseIconVisibility", "setOnCloseIconCallback", "setBackgroundColor", "setLeadingIcon", "setTitleColor", "setMessageColor"};
    public static final String AEQbTJ = MLNOKReminder.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKReminder(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.copydefault = new Integer[]{0, 1, 2, 3};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public OKReminder AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new OKReminder(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKReminder) this.dHguZz).setTitle(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMessage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKReminder) this.dHguZz).setMessage(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMessageWithMoreView(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKReminder) this.dHguZz).setMessage(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), C7594aml.safeGetJavaString$default(luaValueArr, 1, null, 2, null), new Function0() { // from class: o.aoi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKReminder.copydefault(luaValueArr);
            }
        });
        return null;
    }

    public static final Unit copydefault(LuaValue[] luaValueArr) {
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 2);
        if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPrimaryAction(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKReminder) this.dHguZz).setPrimaryAction(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), new Function0() { // from class: o.aof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKReminder.gEmmrt(luaValueArr);
            }
        });
        return null;
    }

    public static final Unit gEmmrt(LuaValue[] luaValueArr) {
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSecondaryAction(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKReminder) this.dHguZz).setSecondaryAction(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), new Function0() { // from class: o.aog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKReminder.AhwBna(luaValueArr);
            }
        });
        return null;
    }

    public static final Unit AhwBna(LuaValue[] luaValueArr) {
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnCloseIconCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "setOnCloseIconCallback", new UDView.TaskDescription() { // from class: o.aoj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKReminder.OLrzqt(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKReminder mLNOKReminder, final LuaFunction luaFunction) {
        ((OKReminder) mLNOKReminder.dHguZz).setOnCloseIconCallback(new Function0() { // from class: o.aom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKReminder.copydefault(luaFunction);
            }
        });
    }

    public static final Unit copydefault(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setBackgroundColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.aok
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKReminder.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit copydefault(MLNOKReminder mLNOKReminder, int i) {
        ((OKReminder) mLNOKReminder.dHguZz).setReminderBackground(new ColorDrawable(i));
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLeadingIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.copydefault(luaValueArr, 0, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.aon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKReminder.AEQbTJ(this.KWHzl, (JDImageInfo) obj);
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(final MLNOKReminder mLNOKReminder, JDImageInfo jDImageInfo) {
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        Context contextAubY = mLNOKReminder.AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C7911ask.OLrzqt(contextAubY, jDImageInfo, new InterfaceC7852are() { // from class: o.aoh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7852are
            public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                MLNOKReminder.KWHzl(this.AEQbTJ, drawable, str);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(MLNOKReminder mLNOKReminder, Drawable drawable, String str) {
        ((OKReminder) mLNOKReminder.dHguZz).setLeadingIcon(drawable);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.aod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKReminder.AhwBna(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit AhwBna(MLNOKReminder mLNOKReminder, int i) {
        ((OKReminder) mLNOKReminder.dHguZz).EZpvd().DbNXlk.setTextColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMessageColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.aoe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKReminder.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKReminder mLNOKReminder, int i) {
        ((OKReminder) mLNOKReminder.dHguZz).EZpvd().AkhnZx.setTextColor(i);
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.reminder.MLNOKReminder.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] OLrzqt() {
            return MLNOKReminder.EZpvd;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(this.copydefault, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((OKReminder) this.dHguZz).setStyle(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLeadingIconVisibility(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((OKReminder) this.dHguZz).setLeadingIconVisibility(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCloseIconVisibility(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((OKReminder) this.dHguZz).setCloseIconVisibility(luaValue.toBoolean());
        return null;
    }
}
