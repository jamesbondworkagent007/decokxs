package com.immomo.mls.fun.ui.uilib.sheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.MLNOKButton;
import com.immomo.mls.fun.ui.uilib.sheet.MLNOKBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52794wYp;
import o.C7594aml;
import o.C7758apq;
import o.InterfaceC60044zuT;
import o.wYF;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKBottomSheet extends UDView<FrameLayout> {
    public FrameLayout AYXKKw;
    public final C7758apq.StateListAnimator valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final String[] djBIcL = {"useHeaderV2", "headerTypeV2", "titleStyle", "headerType", "title", "subTitleView", "dividerVisible", "titleAlignmentCenter", "backClickListener", "buttonBoxType", "primaryButton", "secondaryButton", "cancelButton", "contentView", "show", "dismiss", "onDismissListener", "draggable", "primaryButtonType", "secondaryButtonType"};
    public static final String OLrzqt = MLNOKBottomSheet.class.getSimpleName();
    public static final Integer[] EZpvd = {0, 1, 2};
    public static final Integer[] gEmmrt = {0, 1, 2, 3};
    public static final Integer[] copydefault = {0, 1, 2, 5, 9};
    public static final Integer[] AEQbTJ = {5, 7, 14, 3, 17, 6, 21, 1};

    @InterfaceC60044zuT
    public MLNOKBottomSheet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.valueOf = new C7758apq.StateListAnimator();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        FrameLayout frameLayout = new FrameLayout(AubY());
        this.AYXKKw = frameLayout;
        frameLayout.setId(View.generateViewId());
        FrameLayout frameLayout2 = this.AYXKKw;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] headerTypeV2(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, EZpvd, 0, new Function1() { // from class: o.apj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.AhwBna(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit AhwBna(MLNOKBottomSheet mLNOKBottomSheet, int i) {
        mLNOKBottomSheet.valueOf.copydefault(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] titleStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, gEmmrt, 0, new Function1() { // from class: o.aoZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.gEmmrt(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit gEmmrt(MLNOKBottomSheet mLNOKBottomSheet, int i) {
        mLNOKBottomSheet.valueOf.KWHzl(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] headerType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, copydefault, 0, new Function1() { // from class: o.apd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.djBIcL(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit djBIcL(MLNOKBottomSheet mLNOKBottomSheet, int i) {
        mLNOKBottomSheet.valueOf.EZpvd(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] title(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.valueOf.KWHzl(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] subTitleView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.valueOf.KWHzl(C7594aml.safeGetView$default(luaValueArr, 0, 1, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dividerVisible(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.valueOf.AEQbTJ(C7594aml.safeGetBoolean$default(luaValueArr, 0, false, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] titleAlignmentCenter(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.valueOf.EZpvd(C7594aml.safeGetBoolean$default(luaValueArr, 0, false, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] backClickListener(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "backClickListener", new UDView.TaskDescription() { // from class: o.aoX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKBottomSheet.djBIcL(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final void djBIcL(MLNOKBottomSheet mLNOKBottomSheet, final LuaFunction luaFunction) {
        mLNOKBottomSheet.valueOf.KWHzl(new View.OnClickListener() { // from class: o.aoU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKBottomSheet.EZpvd(luaFunction, view);
            }
        });
    }

    @InterfaceC60044zuT
    public final LuaValue[] buttonBoxType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.aoS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit copydefault(MLNOKBottomSheet mLNOKBottomSheet, int i) {
        C7758apq.StateListAnimator stateListAnimator = mLNOKBottomSheet.valueOf;
        Context contextAubY = mLNOKBottomSheet.AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        stateListAnimator.OLrzqt(new wYF(contextAubY, null, 2, null));
        wYF wyfKWHzl = mLNOKBottomSheet.valueOf.KWHzl();
        if (wyfKWHzl != null) {
            wyfKWHzl.setType(i);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(MLNOKBottomSheet mLNOKBottomSheet, final LuaFunction luaFunction) {
        C52794wYp c52794wYpCopydefault;
        wYF wyfKWHzl = mLNOKBottomSheet.valueOf.KWHzl();
        if (wyfKWHzl == null || (c52794wYpCopydefault = wyfKWHzl.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.apc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKBottomSheet.valueOf(luaFunction, view);
            }
        });
    }

    public static final void valueOf(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final void AhwBna(MLNOKBottomSheet mLNOKBottomSheet, final LuaFunction luaFunction) {
        C52794wYp c52794wYpAEQbTJ;
        wYF wyfKWHzl = mLNOKBottomSheet.valueOf.KWHzl();
        if (wyfKWHzl == null || (c52794wYpAEQbTJ = wyfKWHzl.AEQbTJ()) == null) {
            return;
        }
        c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.apa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKBottomSheet.AhwBna(luaFunction, view);
            }
        });
    }

    public static final void AhwBna(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final void AYXKKw(MLNOKBottomSheet mLNOKBottomSheet, final LuaFunction luaFunction) {
        C52794wYp c52794wYpOLrzqt;
        wYF wyfKWHzl = mLNOKBottomSheet.valueOf.KWHzl();
        if (wyfKWHzl == null || (c52794wYpOLrzqt = wyfKWHzl.OLrzqt()) == null) {
            return;
        }
        c52794wYpOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.apf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKBottomSheet.AYXKKw(luaFunction, view);
            }
        });
    }

    public static final void AYXKKw(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] contentView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessView$default(luaValueArr, 0, new Function1() { // from class: o.aoY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit KWHzl(MLNOKBottomSheet mLNOKBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        mLNOKBottomSheet.valueOf.copydefault(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] show(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7758apq c7758apq = new C7758apq(this.valueOf);
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        c7758apq.show(((FragmentActivity) contextAubY).getSupportFragmentManager(), OLrzqt);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        FragmentManager supportFragmentManager = ((FragmentActivity) contextAubY).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C7758apq c7758apq = (C7758apq) supportFragmentManager.findFragmentByTag(OLrzqt);
        if (c7758apq != null) {
            c7758apq.dismiss();
        }
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.apb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKBottomSheet.KWHzl((LuaFunction) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        luaFunction.OLrzqt();
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onDismissListener(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onDismissListener", new UDView.TaskDescription() { // from class: o.ape
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKBottomSheet.valueOf(this.EZpvd, luaFunction);
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

    public static final void valueOf(MLNOKBottomSheet mLNOKBottomSheet, final LuaFunction luaFunction) {
        mLNOKBottomSheet.valueOf.AEQbTJ(new Function0() { // from class: o.aoW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKBottomSheet.OLrzqt(luaFunction);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.sheet.MLNOKBottomSheet.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] KWHzl() {
            return MLNOKBottomSheet.djBIcL;
        }

        public final Integer[] AEQbTJ() {
            return MLNOKBottomSheet.AEQbTJ;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] useHeaderV2(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        this.valueOf.copydefault(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] primaryButtonType(@NotNull LuaValue[] luaValueArr) {
        C52794wYp c52794wYpCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        int i = luaValue.toInt();
        wYF wyfKWHzl = this.valueOf.KWHzl();
        if (wyfKWHzl == null || (c52794wYpCopydefault = wyfKWHzl.copydefault()) == null) {
            return null;
        }
        c52794wYpCopydefault.setOKDSType(MLNOKButton.Companion.EZpvd()[i].intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] secondaryButtonType(@NotNull LuaValue[] luaValueArr) {
        C52794wYp c52794wYpAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        int i = luaValue.toInt();
        wYF wyfKWHzl = this.valueOf.KWHzl();
        if (wyfKWHzl == null || (c52794wYpAEQbTJ = wyfKWHzl.AEQbTJ()) == null) {
            return null;
        }
        c52794wYpAEQbTJ.setOKDSType(MLNOKButton.Companion.EZpvd()[i].intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] primaryButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            wYF wyfKWHzl = this.valueOf.KWHzl();
            if (wyfKWHzl != null) {
                wyfKWHzl.setPrimaryText(javaString);
            }
        }
        KWHzl(luaValueArr, 1, "primaryButtonClick", new UDView.TaskDescription() { // from class: o.apl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKBottomSheet.gEmmrt(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] secondaryButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            wYF wyfKWHzl = this.valueOf.KWHzl();
            if (wyfKWHzl != null) {
                wyfKWHzl.setSecondaryText(javaString);
            }
        }
        KWHzl(luaValueArr, 1, "secondaryButtonClick", new UDView.TaskDescription() { // from class: o.aoT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKBottomSheet.AhwBna(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelButton(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            wYF wyfKWHzl = this.valueOf.KWHzl();
            if (wyfKWHzl != null) {
                wyfKWHzl.setCancelText(javaString);
            }
        }
        KWHzl(luaValueArr, 1, "cancelButtonClick", new UDView.TaskDescription() { // from class: o.apg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKBottomSheet.AYXKKw(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] draggable(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        this.valueOf.KWHzl(luaValue.toBoolean());
        return null;
    }
}
