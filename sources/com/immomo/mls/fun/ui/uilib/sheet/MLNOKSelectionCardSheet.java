package com.immomo.mls.fun.ui.uilib.sheet;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.sheet.MLNOKSelectionCardSheet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7594aml;
import o.C7684aoV;
import o.C7760aps;
import o.C7766apy;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSelectionCardSheet extends UDView<FrameLayout> {
    public FrameLayout OLrzqt;
    public final C7684aoV copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final String[] AEQbTJ = {"setTitle", "setSubTitle", "setFooter", "setOnFooterClickCallback", "addSelectionItem", "setOnItemClickCallback", "show", "dismiss"};
    public static final String KWHzl = MLNOKSelectionCardSheet.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKSelectionCardSheet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.copydefault = new C7684aoV(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        FrameLayout frameLayout = new FrameLayout(AubY());
        this.OLrzqt = frameLayout;
        frameLayout.setId(View.generateViewId());
        FrameLayout frameLayout2 = this.OLrzqt;
        if (frameLayout2 != null) {
            return frameLayout2;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] show(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7760aps c7760apsEZpvd = C7760aps.Companion.EZpvd(this.copydefault);
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        c7760apsEZpvd.show(((FragmentActivity) contextAubY).getSupportFragmentManager(), KWHzl);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] dismiss(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        FragmentManager supportFragmentManager = ((FragmentActivity) contextAubY).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C7760aps c7760aps = (C7760aps) supportFragmentManager.findFragmentByTag(KWHzl);
        if (c7760aps != null) {
            c7760aps.dismiss();
        }
        C7594aml.AEQbTJ(luaValueArr, 0, (Function1<? super LuaFunction, Unit>) new Function1() { // from class: o.apk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectionCardSheet.OLrzqt((LuaFunction) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        luaFunction.OLrzqt();
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnFooterClickCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.KWHzl(luaValueArr, 0, (Function1<? super LuaValue, Unit>) new Function1() { // from class: o.apm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectionCardSheet.EZpvd(this.EZpvd, (LuaValue) obj);
            }
        });
        return null;
    }

    public static final Unit EZpvd(MLNOKSelectionCardSheet mLNOKSelectionCardSheet, LuaValue luaValue) {
        Intrinsics.checkNotNullParameter(luaValue, "");
        final LuaFunction luaFunction = (LuaFunction) luaValue;
        mLNOKSelectionCardSheet.copydefault.EZpvd(new View.OnClickListener() { // from class: o.aph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKSelectionCardSheet.KWHzl(luaFunction, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(LuaFunction luaFunction, View view) {
        luaFunction.OLrzqt();
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnItemClickCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.KWHzl(luaValueArr, 0, (Function1<? super LuaValue, Unit>) new Function1() { // from class: o.api
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectionCardSheet.OLrzqt(this.KWHzl, (LuaValue) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(MLNOKSelectionCardSheet mLNOKSelectionCardSheet, LuaValue luaValue) {
        Intrinsics.checkNotNullParameter(luaValue, "");
        final LuaFunction luaFunction = (LuaFunction) luaValue;
        mLNOKSelectionCardSheet.copydefault.KWHzl(new AdapterView.OnItemClickListener() { // from class: o.apn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
                MLNOKSelectionCardSheet.OLrzqt(luaFunction, adapterView, view, i, j);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(LuaFunction luaFunction, AdapterView adapterView, View view, int i, long j) {
        luaFunction.EZpvd(i);
    }

    @InterfaceC60044zuT
    public final LuaValue[] addSelectionItem(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        List<C7766apy> listEZpvd = this.copydefault.EZpvd();
        final C7766apy c7766apy = new C7766apy(null, null, null, null, 15, null);
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            c7766apy.AEQbTJ(javaString);
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 != null && luaValue2.isString()) {
            String javaString2 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            c7766apy.EZpvd(javaString2);
        }
        C7594aml.KWHzl(luaValueArr, 2, (Function1<? super LuaValue, Unit>) new Function1() { // from class: o.apo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectionCardSheet.AEQbTJ(c7766apy, (LuaValue) obj);
            }
        });
        C7594aml.KWHzl(luaValueArr, 3, (Function1<? super LuaValue, Unit>) new Function1() { // from class: o.app
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSelectionCardSheet.OLrzqt(c7766apy, (LuaValue) obj);
            }
        });
        listEZpvd.add(c7766apy);
        return null;
    }

    public static final Unit AEQbTJ(C7766apy c7766apy, LuaValue luaValue) {
        Intrinsics.checkNotNullParameter(luaValue, "");
        UDImageInfo uDImageInfo = (UDImageInfo) luaValue;
        c7766apy.OLrzqt(uDImageInfo.EZpvd());
        uDImageInfo.destroy();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C7766apy c7766apy, LuaValue luaValue) {
        Intrinsics.checkNotNullParameter(luaValue, "");
        Object objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) View.class);
        Intrinsics.copydefault(objAEQbTJ, "");
        c7766apy.AEQbTJ((View) objAEQbTJ);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.sheet.MLNOKSelectionCardSheet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] copydefault() {
            return MLNOKSelectionCardSheet.AEQbTJ;
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
        this.copydefault.EZpvd(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSubTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.copydefault.copydefault(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setFooter(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        this.copydefault.KWHzl(javaString);
        return null;
    }
}
