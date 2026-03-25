package com.immomo.mls.fun.ui.sort;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.sort.MLNOKSortBar;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55100xda;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSortBar extends UDView<C55100xda> implements View.OnClickListener {
    public OKSortTextView[] AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final String[] copydefault = {"setColumnText", "setColumnMaxWidth", "setColumnSortType", "disableColumnSort", "setSortTypeChangeListener"};
    public static final OKSortTextView.SortType[] OLrzqt = {OKSortTextView.SortType.NONE, OKSortTextView.SortType.UP, OKSortTextView.SortType.DOWN};
    public static final String KWHzl = MLNOKSortBar.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull OKSortTextView[] oKSortTextViewArr) {
        Intrinsics.checkNotNullParameter(oKSortTextViewArr, "");
        this.AEQbTJ = oKSortTextViewArr;
    }

    @InterfaceC60044zuT
    public MLNOKSortBar(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public final OKSortTextView[] AYXKKw() {
        OKSortTextView[] oKSortTextViewArr = this.AEQbTJ;
        if (oKSortTextViewArr != null) {
            return oKSortTextViewArr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55100xda AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        AEQbTJ(new OKSortTextView[3]);
        int iSafeGetInt$default = C7594aml.safeGetInt$default(luaValueArr, 0, 0, 3, null);
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55100xda c55100xda = new C55100xda(contextAubY, null, 0, 6, null);
        OKSortTextView oKSortTextViewCopydefault = c55100xda.copydefault();
        oKSortTextViewCopydefault.setVisibility(0);
        oKSortTextViewCopydefault.setOnClickListener(this);
        OKSortTextView oKSortTextViewEZpvd = c55100xda.EZpvd();
        oKSortTextViewEZpvd.setVisibility(iSafeGetInt$default >= 2 ? 0 : 8);
        oKSortTextViewEZpvd.setOnClickListener(this);
        OKSortTextView oKSortTextViewAEQbTJ = c55100xda.AEQbTJ();
        oKSortTextViewAEQbTJ.setVisibility(iSafeGetInt$default >= 3 ? 0 : 8);
        oKSortTextViewAEQbTJ.setOnClickListener(this);
        AYXKKw()[0] = c55100xda.copydefault();
        if (iSafeGetInt$default == 2) {
            AYXKKw()[1] = c55100xda.EZpvd();
        } else if (iSafeGetInt$default == 3) {
            AYXKKw()[1] = c55100xda.AEQbTJ();
            AYXKKw()[2] = c55100xda.EZpvd();
        }
        return c55100xda;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OKSortTextView) {
            ((OKSortTextView) view).setNextSortType(true);
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSortTypeChangeListener(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "sortTypeChangeListener", new UDView.TaskDescription() { // from class: o.amd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSortBar.OLrzqt(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void OLrzqt(MLNOKSortBar mLNOKSortBar, final LuaFunction luaFunction) {
        OKSortTextView[] oKSortTextViewArrAYXKKw = mLNOKSortBar.AYXKKw();
        int length = oKSortTextViewArrAYXKKw.length;
        int i = 0;
        final int i2 = 0;
        while (i < length) {
            OKSortTextView oKSortTextView = oKSortTextViewArrAYXKKw[i];
            if (oKSortTextView != null) {
                oKSortTextView.setOnSortTypeChangeListener(new Function2() { // from class: o.amf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return MLNOKSortBar.KWHzl(luaFunction, i2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                    }
                });
            }
            i++;
            i2++;
        }
    }

    public static final Unit KWHzl(LuaFunction luaFunction, int i, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        double dGEmmrt = yDV.gEmmrt(OLrzqt, sortType);
        if (luaFunction != null) {
            luaFunction.AEQbTJ(i, dGEmmrt);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.sort.MLNOKSortBar.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] KWHzl() {
            return MLNOKSortBar.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setColumnText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            OKSortTextView oKSortTextView = (OKSortTextView) yDV.gEmmrt(AYXKKw(), luaValue.toInt());
            if (oKSortTextView != null) {
                oKSortTextView.setText(C7594aml.safeGetJavaString$default(luaValueArr, 1, null, 2, null));
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setColumnMaxWidth(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            int i = luaValue.toInt();
            int iSafeGetInt$default = C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null);
            if (i == 0 || i == 1) {
                ((C55100xda) this.dHguZz).setMaxLeftWith(iSafeGetInt$default);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setColumnSortType(@NotNull LuaValue[] luaValueArr) {
        OKSortTextView oKSortTextView;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            int i = luaValue.toInt();
            int iSafeGetInt$default = C7594aml.safeGetInt$default(luaValueArr, 1, 0, 2, null);
            boolean zSafeGetBoolean$default = C7594aml.safeGetBoolean$default(luaValueArr, 2, false, 2, null);
            OKSortTextView.SortType sortType = (OKSortTextView.SortType) yDV.gEmmrt(OLrzqt, iSafeGetInt$default);
            if (sortType != null && (oKSortTextView = (OKSortTextView) yDV.gEmmrt(AYXKKw(), i)) != null) {
                oKSortTextView.setSortType(sortType, zSafeGetBoolean$default);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] disableColumnSort(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        OKSortTextView oKSortTextView = (OKSortTextView) yDV.gEmmrt(AYXKKw(), luaValue.toInt());
        if (oKSortTextView == null) {
            return null;
        }
        oKSortTextView.setDisableSort();
        return null;
    }
}
