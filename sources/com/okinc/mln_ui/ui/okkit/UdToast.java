package com.okinc.mln_ui.ui.okkit;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C33622mzt;
import o.C52761wXj;
import o.C57604ylZ;
import o.C7322ahe;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UdToast {
    public static final double DURATION_DIVIDER = 2.0d;
    public static final String LUA_CLASS_NAME = "Toast";
    public Globals globals;
    public C33622mzt loadingDialog;

    @LuaBridge
    public int property;

    public final int OLrzqt(double d) {
        return d > 2.0d ? 1 : 0;
    }

    public UdToast(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public Context KWHzl(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public void showToast(String str) {
        C57604ylZ.OLrzqt.OLrzqt(str, null, 1, 17, 0, 0);
    }

    @LuaBridge
    public void showToastWithTime(String str, double d) {
        C57604ylZ.OLrzqt.OLrzqt(str, null, OLrzqt(d), 17, 0, 0);
    }

    @LuaBridge
    public void showToastAtBottom(String str) {
        C57604ylZ.OLrzqt.OLrzqt(str, null, 1, null, 0, 0);
    }

    @LuaBridge
    public void showToastWithTimeAtBottom(String str, double d) {
        C57604ylZ.OLrzqt.OLrzqt(str, null, OLrzqt(d), null, 0, 0);
    }

    @LuaBridge
    public void showSuccess(String str) {
        C57604ylZ.OLrzqt.OLrzqt(str, KWHzl(this.globals).getDrawable(C52761wXj.TaskDescription.FYtjSf), 1, null, 0, 0);
    }

    @LuaBridge
    public void showSuccessWithTime(String str, double d) {
        C57604ylZ.OLrzqt.OLrzqt(str, KWHzl(this.globals).getDrawable(C52761wXj.TaskDescription.FYtjSf), OLrzqt(d), null, 0, 0);
    }

    @LuaBridge
    public void showError(String str) {
        C57604ylZ.OLrzqt.OLrzqt(str, KWHzl(this.globals).getDrawable(C52761wXj.TaskDescription.dPkBzA), 1, null, 0, 0);
    }

    @LuaBridge
    public void showErrorWithTime(String str, double d) {
        Toast.makeText(KWHzl(this.globals), str, OLrzqt(d)).show();
        C57604ylZ.OLrzqt.OLrzqt(str, KWHzl(this.globals).getDrawable(C52761wXj.TaskDescription.dPkBzA), OLrzqt(d), null, 0, 0);
    }

    @LuaBridge
    public void showLoading() {
        C33622mzt c33622mzt = new C33622mzt();
        this.loadingDialog = c33622mzt;
        c33622mzt.OLrzqt(KWHzl(this.globals), true, false, false, 0L, "");
    }

    @LuaBridge
    public void hidenLoading() {
        C33622mzt c33622mzt = this.loadingDialog;
        if (c33622mzt != null) {
            c33622mzt.copydefault();
        }
    }
}
