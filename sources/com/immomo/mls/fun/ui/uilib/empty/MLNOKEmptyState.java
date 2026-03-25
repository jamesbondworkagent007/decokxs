package com.immomo.mls.fun.ui.uilib.empty;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.uilib.empty.MLNOKEmptyState;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55173xeu;
import o.C55298xhM;
import o.C7546alq;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKEmptyState extends UDViewGroup<C7546alq<?>> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static final String[] OLrzqt = {"emptyImage", "header", "content", "button", "verticalMargins"};
    public static final String copydefault = MLNOKEmptyState.class.getSimpleName();
    public C55173xeu AEQbTJ;
    public final Integer[] KWHzl;

    @InterfaceC60044zuT
    public MLNOKEmptyState(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C7546alq<?> AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        this.AEQbTJ = new C55173xeu(contextAubY, null, 0, 6, null);
        C7546alq<?> c7546alq = new C7546alq<>(AubY(), this);
        C55173xeu c55173xeu = this.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = (int) C55298xhM.dp$default(96, (Context) null, 1, (Object) null);
        marginLayoutParams.bottomMargin = (int) C55298xhM.dp$default(16, (Context) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        c7546alq.addView(c55173xeu, marginLayoutParams);
        return c7546alq;
    }

    @InterfaceC60044zuT
    public final LuaValue[] verticalMargins(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        float fSafeGetFloat$default = C7594aml.safeGetFloat$default(luaValueArr, 0, 0.0f, 2, null);
        float fSafeGetFloat$default2 = C7594aml.safeGetFloat$default(luaValueArr, 1, 0.0f, 2, null);
        C55173xeu c55173xeu = this.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C55298xhM.dpInt$default(fSafeGetFloat$default, (Context) null, 1, (Object) null);
            marginLayoutParams.bottomMargin = C55298xhM.dpInt$default(fSafeGetFloat$default2, (Context) null, 1, (Object) null);
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] header(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55173xeu c55173xeu = this.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        c55173xeu.setTitle(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] content(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55173xeu c55173xeu = this.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        c55173xeu.setSubTitle((CharSequence) C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] button(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55173xeu c55173xeu = this.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        c55173xeu.setRetry(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        KWHzl(luaValueArr, 1, "buttonClick", new UDView.TaskDescription() { // from class: o.anp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKEmptyState.EZpvd(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKEmptyState mLNOKEmptyState, final LuaFunction luaFunction) {
        C55173xeu c55173xeu = mLNOKEmptyState.AEQbTJ;
        if (c55173xeu == null) {
            Intrinsics.gEmmrt("");
            c55173xeu = null;
        }
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.anm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKEmptyState.OLrzqt(luaFunction, view);
            }
        });
    }

    public static final void OLrzqt(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.empty.MLNOKEmptyState.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return MLNOKEmptyState.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] emptyImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            Integer num = (Integer) yDV.gEmmrt(this.KWHzl, luaValue.toInt());
            if (num != null) {
                int iIntValue = num.intValue();
                C55173xeu c55173xeu = this.AEQbTJ;
                if (c55173xeu == null) {
                    Intrinsics.gEmmrt("");
                    c55173xeu = null;
                }
                c55173xeu.setEmptyTypeImage(iIntValue);
            }
        }
        return null;
    }
}
