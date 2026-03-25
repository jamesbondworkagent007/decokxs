package com.immomo.mls.fun.ui.uilib;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ui.uilib.MLNOKSnackbar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55284xgz;
import o.C7322ahe;
import o.InterfaceC60037zuM;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class MLNOKSnackbar {
    public C55284xgz OLrzqt;
    public Globals copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public MLNOKSnackbar(Globals globals, @NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        this.copydefault = globals;
        Activity activityKWHzl = KWHzl();
        if (activityKWHzl != null) {
            View viewFindViewById = activityKWHzl.findViewById(R.id.content);
            C55284xgz.Activity activity = C55284xgz.Companion;
            Intrinsics.copydefault(viewFindViewById);
            this.OLrzqt = activity.AEQbTJ(activityKWHzl, viewFindViewById, "");
            if ((!(luaValueArr.length == 0)) && luaValueArr[0].isInt()) {
                int i = luaValueArr[0].toInt();
                C55284xgz c55284xgz = this.OLrzqt;
                if (c55284xgz != null) {
                    c55284xgz.isConnected(i);
                }
            }
        }
    }

    @LuaBridge
    public final void style(int i) {
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz != null) {
            c55284xgz.djBIcL(i);
        }
    }

    @LuaBridge
    public final void descriptionText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz != null) {
            c55284xgz.AEQbTJ(str);
        }
    }

    @LuaBridge
    public final void button(@NotNull String str, @NotNull final LuaFunction luaFunction) {
        C55284xgz c55284xgzEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(luaFunction, "");
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz == null || (c55284xgzEZpvd = c55284xgz.EZpvd(str)) == null) {
            return;
        }
        c55284xgzEZpvd.EZpvd(new View.OnClickListener() { // from class: o.amm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MLNOKSnackbar.KWHzl(luaFunction, view);
            }
        });
    }

    public static final void KWHzl(LuaFunction luaFunction, View view) {
        luaFunction.OLrzqt();
    }

    @LuaBridge
    public final void setCloseAction(final LuaFunction luaFunction) {
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz != null) {
            c55284xgz.AEQbTJ(new View.OnClickListener() { // from class: o.amk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKSnackbar.copydefault(luaFunction, view);
                }
            });
        }
    }

    public static final void copydefault(LuaFunction luaFunction, View view) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    @LuaBridge
    public final void setAnchor(View view) {
        C55284xgz c55284xgz;
        if (view == null || (c55284xgz = this.OLrzqt) == null) {
            return;
        }
        c55284xgz.AEQbTJ(view);
    }

    @LuaBridge
    public final void showSnackbar() {
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz != null) {
            c55284xgz.hDKMBd();
        }
    }

    @LuaBridge
    public final void dismiss() {
        C55284xgz c55284xgz = this.OLrzqt;
        if (c55284xgz != null) {
            c55284xgz.copydefault();
        }
    }

    public final Activity KWHzl() {
        Globals globals = this.copydefault;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.MLNOKSnackbar.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
