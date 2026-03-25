package com.immomo.mls.fun.ui.uilib.dialog;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.dialog.MLNOKDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.ViewOnClickListenerC54939xaY;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKDialog extends UDView<View> {
    public ViewOnClickListenerC54939xaY OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final String[] copydefault = {"addTitleAndMessage", "addTitleAndStyleMessage", "addPrimaryButton", "setSecondaryButton", "setPrimaryTextColor", "setSecondaryTextColor", "setCustomView", "setCustomViewWithTopMargin", "setContentPadding", "show", "dismiss", "cancelable"};
    public static final String KWHzl = MLNOKDialog.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKDialog(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        View view = new View(AubY());
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        this.OLrzqt = new ViewOnClickListenerC54939xaY(contextAubY);
        return view;
    }

    @InterfaceC60044zuT
    public final LuaValue[] addTitleAndMessage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        String strSafeGetJavaString$default2 = C7594aml.safeGetJavaString$default(luaValueArr, 1, null, 2, null);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.EZpvd(strSafeGetJavaString$default, strSafeGetJavaString$default2);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] addTitleAndStyleMessage(@NotNull LuaValue[] luaValueArr) {
        CharSequence charSequenceCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        LuaValue luaValueCopydefault = C7594aml.copydefault(luaValueArr, 1);
        if (luaValueCopydefault == null || !(luaValueCopydefault instanceof UDStyleString)) {
            charSequenceCopydefault = null;
        } else {
            UDStyleString uDStyleString = (UDStyleString) luaValueCopydefault;
            charSequenceCopydefault = uDStyleString.copydefault();
            uDStyleString.destroy();
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.EZpvd(strSafeGetJavaString$default, charSequenceCopydefault);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] addPrimaryButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        final LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
            if (viewOnClickListenerC54939xaY == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY = null;
            }
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) strSafeGetJavaString$default, new View.OnClickListener() { // from class: o.ani
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKDialog.copydefault(luaFunctionEZpvd, view);
                }
            });
        } else {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.OLrzqt;
            if (viewOnClickListenerC54939xaY2 == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY2 = null;
            }
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY2, strSafeGetJavaString$default, (View.OnClickListener) null, 2, (Object) null);
        }
        return null;
    }

    public static final void copydefault(LuaFunction luaFunction, View view) {
        luaFunction.OLrzqt();
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSecondaryButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        final LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
            if (viewOnClickListenerC54939xaY == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY = null;
            }
            viewOnClickListenerC54939xaY.AEQbTJ(strSafeGetJavaString$default, new View.OnClickListener() { // from class: o.anj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKDialog.AEQbTJ(luaFunctionEZpvd, view);
                }
            });
        } else {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.OLrzqt;
            if (viewOnClickListenerC54939xaY2 == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY2 = null;
            }
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY2, strSafeGetJavaString$default, (View.OnClickListener) null, 2, (Object) null);
        }
        return null;
    }

    public static final void AEQbTJ(LuaFunction luaFunction, View view) {
        luaFunction.OLrzqt();
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPrimaryTextColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.ann
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDialog.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit copydefault(MLNOKDialog mLNOKDialog, int i) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = mLNOKDialog.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.OLrzqt(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSecondaryTextColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.ang
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDialog.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(MLNOKDialog mLNOKDialog, int i) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = mLNOKDialog.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCustomView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.ank
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDialog.copydefault(this.EZpvd, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit copydefault(MLNOKDialog mLNOKDialog, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = mLNOKDialog.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.EZpvd(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCustomViewWithTopMargin(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.anh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKDialog.OLrzqt(this.KWHzl, luaValueArr, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKDialog mLNOKDialog, LuaValue[] luaValueArr, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = mLNOKDialog.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.OLrzqt(view, C55298xhM.dpInt$default(C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null), (Context) null, 1, (Object) null));
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentPadding(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.KWHzl(C7594aml.safeGetInt$default(luaValueArr, 0, 0, 2, null), C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null), C7594aml.safeGetInt$default(luaValueArr, 2, 0, 2, null), C7594aml.safeGetInt$default(luaValueArr, 3, 0, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] show(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.show();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY == null) {
            Intrinsics.gEmmrt("");
            viewOnClickListenerC54939xaY = null;
        }
        viewOnClickListenerC54939xaY.dismiss();
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.dialog.MLNOKDialog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] copydefault() {
            return MLNOKDialog.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelable(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
            if (viewOnClickListenerC54939xaY == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY = null;
            }
            viewOnClickListenerC54939xaY.setCancelable(z);
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.OLrzqt;
            if (viewOnClickListenerC54939xaY2 == null) {
                Intrinsics.gEmmrt("");
                viewOnClickListenerC54939xaY2 = null;
            }
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(z);
        }
        return null;
    }
}
