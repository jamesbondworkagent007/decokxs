package com.immomo.mls.fun.lt;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import androidx.appcompat.app.AppCompatDialog;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C7322ahe;
import o.C7343ahz;
import o.InterfaceC7835arN;
import o.pUU;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SILoading {
    public static final String LUA_CLASS_NAME = "Loading";
    public Globals globals;
    public Dialog mDialog;
    public InterfaceC7835arN mOnCancelCallBack;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setOnCancelCallBack(InterfaceC7835arN interfaceC7835arN) {
        this.mOnCancelCallBack = interfaceC7835arN;
    }

    public SILoading(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public void KWHzl() {
        InterfaceC7835arN interfaceC7835arN = this.mOnCancelCallBack;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.OLrzqt();
        }
        this.globals = null;
    }

    public Context OLrzqt() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public final void EZpvd() {
        Context contextOLrzqt;
        if (this.mDialog == null && (contextOLrzqt = OLrzqt()) != null) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(contextOLrzqt);
            this.mDialog = appCompatDialog;
            appCompatDialog.setCanceledOnTouchOutside(false);
            this.mDialog.requestWindowFeature(1);
            this.mDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.immomo.mls.fun.lt.SILoading.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    InterfaceC7835arN interfaceC7835arN = SILoading.this.mOnCancelCallBack;
                    if (interfaceC7835arN != null) {
                        interfaceC7835arN.EZpvd(new Object[0]);
                    }
                }
            });
            this.mDialog.setContentView(C7343ahz.Activity.hDKMBd);
        }
    }

    @LuaBridge
    public void show() {
        try {
            EZpvd();
            this.mDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @LuaBridge(alias = OtpEventTracker.OTP_EVENT_VALUE_CANCEL)
    public void setCanceledOnTouchOutside(boolean z) {
        EZpvd();
        this.mDialog.setCanceledOnTouchOutside(z);
    }

    @LuaBridge
    public void hide() {
        try {
            this.mDialog.dismiss();
        } catch (Exception e) {
            pUU.copydefault("mln", Log.getStackTraceString(e));
        }
    }
}
