package com.immomo.mls.fun.java;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import com.immomo.mls.annotation.BridgeType;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C32113mPz;
import o.C33570myu;
import o.C7322ahe;
import o.C7823arB;
import o.C7911ask;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class LuaDialog extends AppCompatDialog {
    public boolean AEQbTJ;
    public boolean AhwBna;
    public InterfaceC7835arN EZpvd;
    public InterfaceC7835arN KWHzl;
    public ViewGroup OLrzqt;
    public View copydefault;
    public Globals djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void dialogAppear(InterfaceC7835arN interfaceC7835arN) {
        this.EZpvd = interfaceC7835arN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void dialogDisAppear(InterfaceC7835arN interfaceC7835arN) {
        this.KWHzl = interfaceC7835arN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge(alias = "cancelable", type = BridgeType.GETTER)
    public boolean getCancelable() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setContent(View view) {
        this.copydefault = view;
    }

    public LuaDialog(Globals globals) {
        super(((C7322ahe) globals.AuCTel()).AEQbTJ, C32113mPz.Dialog.RJOkX);
        this.AhwBna = true;
        this.AEQbTJ = false;
        this.djBIcL = globals;
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setGravity(17);
            window.setDimAmount(0.5f);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.OLrzqt = frameLayout;
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public void EZpvd() {
        if (this.djBIcL.isDestroyed()) {
            dismiss();
            InterfaceC7835arN interfaceC7835arN = this.KWHzl;
            if (interfaceC7835arN != null) {
                interfaceC7835arN.OLrzqt();
            }
            InterfaceC7835arN interfaceC7835arN2 = this.EZpvd;
            if (interfaceC7835arN2 != null) {
                interfaceC7835arN2.OLrzqt();
            }
        }
        this.copydefault = null;
    }

    @Override // android.app.Dialog
    @LuaBridge(alias = "cancelable", type = BridgeType.SETTER)
    public void setCancelable(boolean z) {
        this.AhwBna = z;
        super.setCancelable(z);
        super.setCanceledOnTouchOutside(z);
    }

    @LuaBridge
    public void setDimAmount(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (getWindow() != null) {
            getWindow().setDimAmount(f);
        }
    }

    @LuaBridge
    public void setContentGravity(int i) {
        if (getWindow() != null) {
            getWindow().setGravity(i);
        }
    }

    @Override // android.app.Dialog
    @LuaBridge
    public void show() {
        if (isShowing()) {
            return;
        }
        View view = this.copydefault;
        if (view != null) {
            C7823arB.EZpvd(this.OLrzqt, view);
            if (this.AEQbTJ) {
                KWHzl(0);
            }
            this.OLrzqt.addView(this.copydefault);
        }
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            window.setAttributes(layoutParams);
        }
        InterfaceC7835arN interfaceC7835arN = this.EZpvd;
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(new Object[0]);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    @LuaBridge
    public void dismiss() {
        if (isShowing()) {
            super.dismiss();
            InterfaceC7835arN interfaceC7835arN = this.KWHzl;
            if (interfaceC7835arN != null) {
                interfaceC7835arN.EZpvd(new Object[0]);
            }
        }
    }

    @LuaBridge
    public void autoContentWidth(int i) {
        this.AEQbTJ = true;
        KWHzl(i);
    }

    public final void KWHzl(int i) {
        FrameLayout.LayoutParams layoutParams;
        if (this.copydefault == null) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            layoutParams2.copyFrom(window.getAttributes());
            layoutParams2.width = i > 0 ? C33570myu.EZpvd(getContext(), i) : -1;
            window.setAttributes(layoutParams2);
        }
        if (this.copydefault.getLayoutParams() == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.copydefault.getLayoutParams());
        }
        layoutParams.gravity = 17;
        layoutParams.width = C7911ask.AEQbTJ(getContext(), i);
        this.copydefault.setLayoutParams(layoutParams);
    }
}
