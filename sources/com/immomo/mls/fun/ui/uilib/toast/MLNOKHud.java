package com.immomo.mls.fun.ui.uilib.toast;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ui.uilib.toast.MLNOKHud;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C52761wXj;
import o.C55284xgz;
import o.C55328xhq;
import o.C7322ahe;
import o.InterfaceC60037zuM;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class MLNOKHud {
    public static final String LUA_CLASS_NAME = "OKHUD";
    public static final int TYPE_ERROR = 3;
    public static final int TYPE_LOADING = 0;
    public static final int TYPE_MESSAGE = 1;
    public static final int TYPE_SUCCESS = 2;
    public Globals globals;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.globals = null;
    }

    public MLNOKHud(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public final void showShortTime(int i) {
        KWHzl(i, "", 0);
    }

    @LuaBridge
    public final void showWithTitleShortTime(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(i, str, 0);
    }

    @LuaBridge
    public final void showSnackBarWithTypeDefaultStyle(int i, @NotNull String str) {
        C55284xgz c55284xgzIsConnected;
        C55284xgz c55284xgzDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            View viewFindViewById = activityOLrzqt.findViewById(R.id.content);
            C55284xgz.Activity activity = C55284xgz.Companion;
            Intrinsics.copydefault(viewFindViewById);
            C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(activityOLrzqt, viewFindViewById, str);
            if (c55284xgzAEQbTJ == null || (c55284xgzIsConnected = c55284xgzAEQbTJ.isConnected(i)) == null || (c55284xgzDjBIcL = c55284xgzIsConnected.djBIcL(0)) == null) {
                return;
            }
            c55284xgzDjBIcL.hDKMBd();
        }
    }

    @LuaBridge
    public final void showSnackBarWithTypeOneButtonStyle(int i, @NotNull String str, @NotNull String str2, final LuaValue luaValue) {
        C55284xgz c55284xgzIsConnected;
        C55284xgz c55284xgzDjBIcL;
        C55284xgz c55284xgzEZpvd;
        C55284xgz c55284xgzEZpvd2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            View viewFindViewById = activityOLrzqt.findViewById(R.id.content);
            C55284xgz.Activity activity = C55284xgz.Companion;
            Intrinsics.copydefault(viewFindViewById);
            C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(activityOLrzqt, viewFindViewById, str);
            if (c55284xgzAEQbTJ == null || (c55284xgzIsConnected = c55284xgzAEQbTJ.isConnected(i)) == null || (c55284xgzDjBIcL = c55284xgzIsConnected.djBIcL(1)) == null || (c55284xgzEZpvd = c55284xgzDjBIcL.EZpvd(str2)) == null || (c55284xgzEZpvd2 = c55284xgzEZpvd.EZpvd(new View.OnClickListener() { // from class: o.aqh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MLNOKHud.AEQbTJ(luaValue, view);
                }
            })) == null) {
                return;
            }
            c55284xgzEZpvd2.hDKMBd();
        }
    }

    public static final void AEQbTJ(LuaValue luaValue, View view) {
        if (luaValue == null || !luaValue.isFunction()) {
            return;
        }
        luaValue.invoke(new LuaValue[0]);
    }

    public final void KWHzl(int i, String str, int i2) {
        if (i == 0) {
            C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, str, null, i2, null, 0, 0, 58, null);
            return;
        }
        if (i == 1) {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, i2, (Integer) null, 0, 0, 58, (Object) null);
        } else if (i == 2) {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, ContextCompat.getDrawable(C32979mnm.EZpvd.OLrzqt(), C52761wXj.TaskDescription.FYtjSf), i2, (Integer) null, 0, 0, 56, (Object) null);
        } else {
            if (i != 3) {
                return;
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, str, ContextCompat.getDrawable(C32979mnm.EZpvd.OLrzqt(), C52761wXj.TaskDescription.dPkBzA), i2, (Integer) null, 0, 0, 56, (Object) null);
        }
    }

    public final Activity OLrzqt() {
        Globals globals = this.globals;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.toast.MLNOKHud.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
