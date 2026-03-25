package com.immomo.mls.fun.ui.uilib.resultpage;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.resultpage.MLNOKResultPage;
import com.immomo.mls.fun.ui.uilib.sheet.MLNOKBottomSheet;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52794wYp;
import o.C55178xez;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKResultPage extends UDView<C55178xez> {
    public static final Application Companion = new Application(null);
    public static final String[] KWHzl = {"type", "status", "titleText", "subTitleText", "bottomView", "advancedView", "onCloseListener", "buttonBoxType", "primaryButtonText", "primaryButtonClick", "secondaryButtonText", "secondaryButtonClick", "cancelButtonText", "cancelButtonClick"};
    public static final Integer[] copydefault = {0, 1, 2, 3, 4, 5, 6, 7};
    public static final Integer[] EZpvd = {1, 0};
    public static final String AEQbTJ = MLNOKResultPage.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKResultPage(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55178xez AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55178xez(contextAubY, null, 2, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] type(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, EZpvd, 0, new Function1() { // from class: o.aow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKResultPage.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKResultPage mLNOKResultPage, int i) {
        ((C55178xez) mLNOKResultPage.dHguZz).setType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] status(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, copydefault, 0, new Function1() { // from class: o.aol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKResultPage.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit AEQbTJ(MLNOKResultPage mLNOKResultPage, int i) {
        ((C55178xez) mLNOKResultPage.dHguZz).setStatus(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] bottomView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.aot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKResultPage.KWHzl(this.copydefault, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(MLNOKResultPage mLNOKResultPage, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((C55178xez) mLNOKResultPage.dHguZz).setOptionalView(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] advancedView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.aov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKResultPage.AEQbTJ(this.KWHzl, (android.view.View) obj);
            }
        });
        return null;
    }

    public static final Unit AEQbTJ(MLNOKResultPage mLNOKResultPage, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((C55178xez) mLNOKResultPage.dHguZz).setAdvancedView(view);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] onCloseListener(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, EopTrackEvent.CLOSE, new UDView.TaskDescription() { // from class: o.aop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKResultPage.AYXKKw(this.KWHzl, luaFunction);
            }
        });
        return null;
    }

    public static final void AYXKKw(MLNOKResultPage mLNOKResultPage, final LuaFunction luaFunction) {
        ((C55178xez) mLNOKResultPage.dHguZz).AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.aoq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKResultPage.djBIcL(luaFunction, view);
            }
        });
    }

    public static final void djBIcL(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] primaryButtonClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "primaryButtonClick", new UDView.TaskDescription() { // from class: o.aos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKResultPage.AhwBna(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void AhwBna(MLNOKResultPage mLNOKResultPage, final LuaFunction luaFunction) {
        C52794wYp c52794wYpCopydefault = ((C55178xez) mLNOKResultPage.dHguZz).OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.aor
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKResultPage.AhwBna(luaFunction, view);
                }
            });
        }
    }

    public static final void AhwBna(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] secondaryButtonClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "secondaryButtonClick", new UDView.TaskDescription() { // from class: o.aoo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKResultPage.valueOf(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void AYXKKw(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final void valueOf(MLNOKResultPage mLNOKResultPage, final LuaFunction luaFunction) {
        C52794wYp c52794wYpAEQbTJ = ((C55178xez) mLNOKResultPage.dHguZz).OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.aoA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKResultPage.AYXKKw(luaFunction, view);
                }
            });
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelButtonClick(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "cancelButtonClick", new UDView.TaskDescription() { // from class: o.aou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKResultPage.copydefault(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void KWHzl(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final void copydefault(MLNOKResultPage mLNOKResultPage, final LuaFunction luaFunction) {
        C52794wYp c52794wYpOLrzqt = ((C55178xez) mLNOKResultPage.dHguZz).OLrzqt().OLrzqt();
        if (c52794wYpOLrzqt != null) {
            c52794wYpOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.aox
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKResultPage.KWHzl(luaFunction, view);
                }
            });
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.resultpage.MLNOKResultPage.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] OLrzqt() {
            return MLNOKResultPage.KWHzl;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] titleText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55178xez) this.dHguZz).setTitleText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] subTitleText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55178xez) this.dHguZz).setSubTitleText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] buttonBoxType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(MLNOKBottomSheet.Companion.AEQbTJ(), luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55178xez) this.dHguZz).OLrzqt().setType(num.intValue());
        C52794wYp c52794wYpAEQbTJ = ((C55178xez) this.dHguZz).OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ == null) {
            return null;
        }
        c52794wYpAEQbTJ.setOKDSType(260);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] primaryButtonText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55178xez) this.dHguZz).OLrzqt().setPrimaryText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] secondaryButtonText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55178xez) this.dHguZz).OLrzqt().setSecondaryText(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] cancelButtonText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((C55178xez) this.dHguZz).OLrzqt().setCancelText(javaString);
        return null;
    }
}
