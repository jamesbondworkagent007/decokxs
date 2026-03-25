package com.immomo.mls.fun.ud;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.ibm.icu.text.DateFormat;
import com.immomo.mls.fun.ud.view.UDView;
import o.C7322ahe;
import o.C7326ahi;
import o.C7352aiH;
import o.C7823arB;
import o.C7857arj;
import o.C7865arr;
import o.C7867art;
import o.InterfaceC60044zuT;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDWindowManager extends JavaUserdata {
    public static final String[] EZpvd = {"cancelable", "width", "height", "x", DateFormat.YEAR, "alpha", "addView", "setContent", "removeAllSubviews", "canEndEditing", "show", "windowLevel", "onTouch", "bgColor", "dismiss", "contentWindowDisAppear", "marginTop", "marginLeft", "setGravity"};
    public boolean AEQbTJ;
    public LuaFunction AYXKKw;
    public float AhwBna;
    public int AkhnZx;
    public LuaFunction DbNXlk;
    public boolean KWHzl;
    public WindowManager.LayoutParams OLrzqt;
    public float copydefault;
    public Integer djBIcL;
    public int fetchVPNInfo;
    public FrameLayout gEmmrt;
    public float isConnected;
    public int valueOf;
    public WindowManager values;

    @InterfaceC60044zuT
    public LuaValue[] canEndEditing(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] windowLevel(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public UDWindowManager(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = false;
        this.AEQbTJ = true;
        this.fetchVPNInfo = 0;
        this.AkhnZx = 0;
        this.AhwBna = -1.0f;
        this.valueOf = 8388659;
        if (luaValueArr != null && luaValueArr.length >= 1) {
            UDRect uDRect = (UDRect) luaValueArr[0];
            C7352aiH c7352aiHEZpvd = uDRect.EZpvd();
            this.isConnected = c7352aiHEZpvd.EZpvd().copydefault();
            this.copydefault = c7352aiHEZpvd.EZpvd().AEQbTJ();
            this.fetchVPNInfo = (int) c7352aiHEZpvd.copydefault().copydefault();
            this.AkhnZx = (int) c7352aiHEZpvd.copydefault().OLrzqt();
            uDRect.destroy();
        }
        this.values = (WindowManager) C7326ahi.OLrzqt().getSystemService("window");
        EZpvd(C7326ahi.OLrzqt());
    }

    public Context OLrzqt() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cancelable(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return this.KWHzl ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        this.KWHzl = luaValueArr[0].toBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] width(LuaValue[] luaValueArr) {
        float f = (float) luaValueArr[0].toDouble();
        if (f == -1.0f || f == -2.0f) {
            this.isConnected = f;
            return null;
        }
        this.isConnected = C7865arr.OLrzqt(C7865arr.copydefault(f));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] height(LuaValue[] luaValueArr) {
        float f = (float) luaValueArr[0].toDouble();
        if (f == -1.0f || f == -2.0f) {
            this.copydefault = f;
            return null;
        }
        this.copydefault = C7865arr.OLrzqt(C7865arr.copydefault(f));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] x(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int iCopydefault = C7865arr.copydefault((float) luaValueArr[0].toDouble());
            this.fetchVPNInfo = iCopydefault;
            WindowManager.LayoutParams layoutParams = this.OLrzqt;
            if (layoutParams == null) {
                return null;
            }
            layoutParams.x = iCopydefault;
            return null;
        }
        return LuaValue.rNumber(C7865arr.AEQbTJ(this.fetchVPNInfo));
    }

    @InterfaceC60044zuT
    public LuaValue[] marginTop(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int iCopydefault = C7865arr.copydefault((float) luaValueArr[0].toDouble());
            this.AkhnZx = iCopydefault;
            WindowManager.LayoutParams layoutParams = this.OLrzqt;
            if (layoutParams == null) {
                return null;
            }
            layoutParams.y = iCopydefault;
            return null;
        }
        return LuaValue.rNumber(C7865arr.AEQbTJ(this.AkhnZx));
    }

    @InterfaceC60044zuT
    public LuaValue[] marginLeft(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int iCopydefault = C7865arr.copydefault((float) luaValueArr[0].toDouble());
            this.fetchVPNInfo = iCopydefault;
            WindowManager.LayoutParams layoutParams = this.OLrzqt;
            if (layoutParams == null) {
                return null;
            }
            layoutParams.x = iCopydefault;
            return null;
        }
        return LuaValue.rNumber(C7865arr.AEQbTJ(this.fetchVPNInfo));
    }

    @InterfaceC60044zuT
    public LuaValue[] setGravity(LuaValue[] luaValueArr) {
        this.valueOf = luaValueArr[0].toInt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] y(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int iCopydefault = C7865arr.copydefault((float) luaValueArr[0].toDouble());
            this.AkhnZx = iCopydefault;
            WindowManager.LayoutParams layoutParams = this.OLrzqt;
            if (layoutParams == null) {
                return null;
            }
            layoutParams.y = iCopydefault;
            return null;
        }
        return LuaValue.rNumber(C7865arr.AEQbTJ(this.AkhnZx));
    }

    @InterfaceC60044zuT
    public LuaValue[] alpha(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 0) {
            this.AhwBna = (float) luaValueArr[0].toDouble();
        }
        return LuaValue.rNumber(this.AhwBna);
    }

    @InterfaceC60044zuT
    public LuaValue[] addView(LuaValue[] luaValueArr) {
        if (this.gEmmrt == null) {
            this.gEmmrt = new FrameLayout(OLrzqt());
        }
        this.gEmmrt.addView(C7823arB.AEQbTJ(((UDView) luaValueArr[0]).f_()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContent(LuaValue[] luaValueArr) {
        UDView uDView = (UDView) luaValueArr[0];
        if (this.gEmmrt == null) {
            this.gEmmrt = new FrameLayout(OLrzqt());
        }
        this.gEmmrt.removeAllViews();
        this.valueOf = uDView.hBpjJd.OLrzqt;
        OLrzqt(uDView);
        this.gEmmrt.addView(C7823arB.AEQbTJ(uDView.f_()));
        return null;
    }

    public final void OLrzqt(UDView uDView) {
        if (uDView.f_().getLayoutParams() != null) {
            this.isConnected = r2.width;
            this.copydefault = r2.height;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] removeAllSubviews(LuaValue[] luaValueArr) {
        FrameLayout frameLayout = this.gEmmrt;
        if (frameLayout == null) {
            return null;
        }
        frameLayout.removeAllViews();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] show(LuaValue[] luaValueArr) {
        if (!Settings.canDrawOverlays(OLrzqt())) {
            OLrzqt(OLrzqt());
            return null;
        }
        if (!this.AEQbTJ) {
            return null;
        }
        copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onTouch(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DbNXlk;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.DbNXlk = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        this.djBIcL = Integer.valueOf(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] dismiss(LuaValue[] luaValueArr) {
        EZpvd();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] contentWindowDisAppear(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AYXKKw = luaValueArr[0].toLuaFunction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EZpvd() {
        try {
            this.values.removeView(this.gEmmrt);
        } catch (Exception unused) {
        }
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
        this.AEQbTJ = true;
    }

    public final void copydefault() {
        if (OLrzqt() == null) {
            return;
        }
        if (this.isConnected == 0.0f) {
            this.isConnected = C7857arj.djBIcL(r0);
        }
        if (this.copydefault == 0.0f) {
            this.copydefault = C7857arj.AhwBna(r0);
        }
        WindowManager.LayoutParams layoutParams = this.OLrzqt;
        layoutParams.width = (int) this.isConnected;
        layoutParams.height = (int) this.copydefault;
        Integer num = this.djBIcL;
        if (num != null) {
            this.gEmmrt.setBackgroundColor(num.intValue());
        }
        float f = this.AhwBna;
        if (f >= 0.0f && f <= 1.0f) {
            this.gEmmrt.setAlpha(f);
        }
        this.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: com.immomo.mls.fun.ud.UDWindowManager.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UDWindowManager.this.KWHzl) {
                    UDWindowManager.this.EZpvd();
                }
            }
        });
        this.gEmmrt.setOnTouchListener(new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.UDWindowManager.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float fAEQbTJ = C7865arr.AEQbTJ(motionEvent.getX());
                float fAEQbTJ2 = C7865arr.AEQbTJ(motionEvent.getY());
                if (UDWindowManager.this.DbNXlk != null) {
                    UDWindowManager.this.DbNXlk.invoke(LuaValue.varargsOf(LuaNumber.copydefault(fAEQbTJ), LuaNumber.copydefault(fAEQbTJ2)));
                }
                return false;
            }
        });
        this.gEmmrt.setLayoutParams(this.OLrzqt);
        try {
            this.values.addView(C7823arB.AEQbTJ(this.gEmmrt), this.OLrzqt);
        } catch (Exception unused) {
        }
        this.AEQbTJ = false;
    }

    public final void EZpvd(Context context) {
        int i = Build.VERSION.SDK_INT;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, i >= 26 ? 2038 : 2003, R.drawable.ic_media_route_connecting_dark_material, -3);
        this.OLrzqt = layoutParams;
        if (i >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        }
        layoutParams.flags = 16777384;
        layoutParams.format = 1;
        layoutParams.gravity = this.valueOf;
    }

    public final void OLrzqt(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return "ContentWindow#(" + hashCode() + ") w:" + this.isConnected + " h:" + this.copydefault + " x:" + this.fetchVPNInfo + " y:" + this.AkhnZx + " alpha:" + this.AhwBna + " cancelable:" + this.KWHzl + " gravity:" + C7867art.AEQbTJ(this.valueOf);
    }
}
