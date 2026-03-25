package com.immomo.mls.fun.ui.uilib.banner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKAlertBanner;
import com.okinc.uilab.banner.OKAlertBanner;
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
public final class MLNOKAlertBanner extends UDView<OKAlertBanner> {
    public static final Application Companion = new Application(null);
    public static final String[] OLrzqt = {"setType", "setStyle", "setLeadingIconVisibility", "setLeadingIcon", "setTitle", "setMessage", "setPrimaryAction", "setSecondaryAction", "setOnCloseIconCallback", "onClick"};
    public static final Integer[] AEQbTJ = {0, 1, 2, 3, 4};
    public static final Integer[] KWHzl = {-1, 0, 1};
    public static final String EZpvd = MLNOKAlertBanner.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKAlertBanner(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public OKAlertBanner AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new OKAlertBanner(contextAubY, null, 0, 6, null);
    }

    public static final Unit KWHzl(MLNOKAlertBanner mLNOKAlertBanner, int i) {
        ((OKAlertBanner) mLNOKAlertBanner.dHguZz).setType(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.amB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKAlertBanner.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit copydefault(MLNOKAlertBanner mLNOKAlertBanner, int i) {
        ((OKAlertBanner) mLNOKAlertBanner.dHguZz).setStyle(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, KWHzl, 0, new Function1() { // from class: o.amE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKAlertBanner.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLeadingIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.copydefault(luaValueArr, 0, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.amF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKAlertBanner.copydefault(this.OLrzqt, (JDImageInfo) obj);
            }
        });
        return null;
    }

    public static final Unit copydefault(final MLNOKAlertBanner mLNOKAlertBanner, JDImageInfo jDImageInfo) {
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        Context contextAubY = mLNOKAlertBanner.AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C7911ask.OLrzqt(contextAubY, jDImageInfo, new InterfaceC7852are() { // from class: o.amz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7852are
            public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                MLNOKAlertBanner.EZpvd(this.KWHzl, drawable, str);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(MLNOKAlertBanner mLNOKAlertBanner, Drawable drawable, String str) {
        ((OKAlertBanner) mLNOKAlertBanner.dHguZz).setLeadingIcon(drawable);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKAlertBanner) this.dHguZz).setTitle(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMessage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKAlertBanner) this.dHguZz).setMessage(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPrimaryAction(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKAlertBanner) this.dHguZz).setPrimaryAction(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), new Function0() { // from class: o.amy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKAlertBanner.KWHzl(luaValueArr);
            }
        });
        return null;
    }

    public static final Unit KWHzl(LuaValue[] luaValueArr) {
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSecondaryAction(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((OKAlertBanner) this.dHguZz).setSecondaryAction(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), new Function0() { // from class: o.amD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MLNOKAlertBanner.copydefault(luaValueArr);
            }
        });
        return null;
    }

    public static final Unit copydefault(LuaValue[] luaValueArr) {
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnCloseIconCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "setOnCloseIconCallback", new UDView.TaskDescription() { // from class: o.amC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKAlertBanner.EZpvd(this.AEQbTJ, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKAlertBanner mLNOKAlertBanner, final LuaFunction luaFunction) {
        ((OKAlertBanner) mLNOKAlertBanner.dHguZz).OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.amA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKAlertBanner.OLrzqt(luaFunction, view);
            }
        });
    }

    public static final void OLrzqt(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.banner.MLNOKAlertBanner.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] copydefault() {
            return MLNOKAlertBanner.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLeadingIconVisibility(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((OKAlertBanner) this.dHguZz).setLeadingIconVisibility(luaValue.toBoolean());
        return null;
    }
}
