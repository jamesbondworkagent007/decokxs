package com.immomo.mls.fun.globals;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDMap;
import com.immomo.mls.fun.ud.UDSafeAreaRect;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.LuaVideoPlayerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C32113mPz;
import o.C33494mxX;
import o.C7326ahi;
import o.C7330ahm;
import o.C7392aiv;
import o.C7467akQ;
import o.C7823arB;
import o.C7834arM;
import o.C7857arj;
import o.C7859arl;
import o.C7865arr;
import o.C7911ask;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDLuaView extends UDViewGroup<C7392aiv> implements C7859arl.StateListAnimator, C7834arM.Activity {
    public static final String[] KWHzl = {"getLuaVersion", "viewAppear", "viewDisappear", "viewWillDisappear", "viewHasDisappear", "backKeyPressed", "sizeChanged", "keyboardShowing", "removeKeyboardCallback", "getExtra", "getLuaSource", "onDestory", "onDestroy", "setPageColor", "setStatusBarStyle", "setNavigationBarColor", "getStatusBarStyle", "stateBarHeight", "statusBarHeight", "navBarHeight", "tabBarHeight", "homeHeight", "homeBarHeight", "canEndEditing", "sizeChangeEnable", "backKeyEnabled", "safeArea", "safeAreaInsetsTop", "safeAreaInsetsBottom", "safeAreaInsetsLeft", "safeAreaInsetsRight", "safeAreaAdapter", "i_keyBoardFrameChangeCallback", "configRefreshJson", "requestedOrientation"};
    public LuaFunction AEQbTJ;
    public C7467akQ AYXKKw;
    public LuaFunction AhwBna;
    public LuaFunction AkhnZx;
    public LuaFunction DbNXlk;
    public UDMap EZpvd;
    public LuaFunction OLrzqt;
    public boolean copydefault;
    public List<LuaFunction> djBIcL;
    public int gEmmrt;
    public LuaFunction isConnected;
    public LuaFunction valueOf;

    @Override // o.C7859arl.StateListAnimator
    public void DbNXlk() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.copydefault;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_keyBoardFrameChangeCallback(LuaValue[] luaValueArr) {
        return null;
    }

    @Override // o.C7859arl.StateListAnimator
    public void isConnected() {
    }

    @Override // o.C7859arl.StateListAnimator
    public void values() {
    }

    @InterfaceC60044zuT
    public UDLuaView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.gEmmrt = -1;
        this.copydefault = true;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7392aiv AEQbTJ(LuaValue[] luaValueArr) {
        return new C7392aiv(AubY(), this);
    }

    @InterfaceC60044zuT
    public LuaValue[] getLuaVersion(LuaValue[] luaValueArr) {
        return LuaValue.rString(C7326ahi.gEmmrt());
    }

    @InterfaceC60044zuT
    public LuaValue[] viewAppear(LuaValue[] luaValueArr) {
        this.valueOf = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] viewDisappear(LuaValue[] luaValueArr) {
        this.DbNXlk = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] viewWillDisappear(LuaValue[] luaValueArr) {
        this.AkhnZx = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] viewHasDisappear(LuaValue[] luaValueArr) {
        this.isConnected = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] backKeyPressed(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] backKeyEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0].isBoolean()) {
            this.copydefault = luaValueArr[0].toBoolean();
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.copydefault));
    }

    @InterfaceC60044zuT
    public LuaValue[] sizeChanged(LuaValue[] luaValueArr) {
        this.AhwBna = luaValueArr[0].toLuaFunction();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] keyboardShowing(LuaValue[] luaValueArr) {
        boolean z = false;
        LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        if (this.djBIcL == null) {
            this.djBIcL = new ArrayList();
        }
        if (luaValueArr.length > 1 && luaValueArr[1].isBoolean()) {
            z = luaValueArr[1].toBoolean();
        }
        if (luaFunction != null && !this.djBIcL.contains(luaFunction)) {
            this.djBIcL.add(luaFunction);
        }
        C7392aiv c7392aiv = (C7392aiv) f_();
        if (c7392aiv != null) {
            if (this.djBIcL.size() > 0) {
                c7392aiv.setKeyboardChangeListener(z);
            } else {
                c7392aiv.djBIcL();
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] removeKeyboardCallback(LuaValue[] luaValueArr) {
        List<LuaFunction> list = this.djBIcL;
        if (list == null) {
            return null;
        }
        list.remove(luaValueArr[0].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getExtra(LuaValue[] luaValueArr) {
        UDMap uDMap = this.EZpvd;
        if (uDMap == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(uDMap);
    }

    @InterfaceC60044zuT
    public LuaValue[] getLuaSource(LuaValue[] luaValueArr) {
        UDMap uDMap = this.EZpvd;
        if (uDMap != null && uDMap.EZpvd() != null) {
            Object obj = this.EZpvd.EZpvd().get("LuaSource");
            if (obj instanceof String) {
                return LuaValue.rString((String) obj);
            }
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] onDestory(LuaValue[] luaValueArr) {
        this.OLrzqt = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onDestroy(LuaValue[] luaValueArr) {
        this.OLrzqt = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPageColor(LuaValue[] luaValueArr) {
        if (fIwbmz() == null) {
            return null;
        }
        int color = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
        luaValueArr[0].destroy();
        valueOf(color);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setStatusBarStyle(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        Activity activityFIwbmz = fIwbmz();
        if (activityFIwbmz == null || i == this.gEmmrt) {
            return null;
        }
        if (i == 0) {
            this.gEmmrt = i;
            C7857arj.KWHzl(false, activityFIwbmz);
            return null;
        }
        if (i != 1) {
            return null;
        }
        this.gEmmrt = i;
        C7857arj.KWHzl(true, activityFIwbmz);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setNavigationBarColor(LuaValue[] luaValueArr) {
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        Activity activityFIwbmz = fIwbmz();
        if (activityFIwbmz == null) {
            return null;
        }
        int color = ContextCompat.getColor(activityFIwbmz, C32113mPz.ActionBar.OcIXYQ);
        if (!TextUtils.isEmpty(javaString2)) {
            color = Color.parseColor(javaString2);
        }
        Boolean boolValueOf = Boolean.valueOf(C7911ask.OLrzqt(this.globals));
        if (!TextUtils.isEmpty(javaString)) {
            if ("dark".equals(javaString)) {
                boolValueOf = Boolean.TRUE;
            } else if ("light".equals(javaString)) {
                boolValueOf = Boolean.FALSE;
            }
        }
        if (!boolValueOf.booleanValue() && Build.VERSION.SDK_INT < 26) {
            C33494mxX.copydefault.OLrzqt(activityFIwbmz, ContextCompat.getColor(activityFIwbmz, C32113mPz.ActionBar.AEQbTJ));
        } else {
            C33494mxX.copydefault.OLrzqt(activityFIwbmz, color);
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getStatusBarStyle(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(this.gEmmrt);
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] stateBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @InterfaceC60044zuT
    public LuaValue[] statusBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C7865arr.AEQbTJ(C7857arj.valueOf(AubY())));
    }

    @InterfaceC60044zuT
    public LuaValue[] navBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C7330ahm.djBIcL);
    }

    @InterfaceC60044zuT
    public LuaValue[] tabBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @InterfaceC60044zuT
    public LuaValue[] homeHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @InterfaceC60044zuT
    public LuaValue[] homeBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C7865arr.AEQbTJ(10.0f));
    }

    @InterfaceC60044zuT
    public LuaValue[] safeArea(LuaValue[] luaValueArr) {
        AhwBna().EZpvd(luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0, this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] safeAreaInsetsTop(LuaValue[] luaValueArr) {
        return AhwBna().KWHzl();
    }

    @InterfaceC60044zuT
    public LuaValue[] safeAreaInsetsBottom(LuaValue[] luaValueArr) {
        return AhwBna().AEQbTJ();
    }

    @InterfaceC60044zuT
    public LuaValue[] safeAreaInsetsLeft(LuaValue[] luaValueArr) {
        return AhwBna().EZpvd();
    }

    @InterfaceC60044zuT
    public LuaValue[] safeAreaInsetsRight(LuaValue[] luaValueArr) {
        return AhwBna().copydefault();
    }

    @InterfaceC60044zuT
    public LuaValue[] safeAreaAdapter(LuaValue[] luaValueArr) {
        UDSafeAreaRect uDSafeAreaRect = luaValueArr.length > 0 ? (UDSafeAreaRect) luaValueArr[0].toUserdata() : null;
        if (uDSafeAreaRect != null) {
            AhwBna().KWHzl(uDSafeAreaRect, this);
        }
        return null;
    }

    public final C7467akQ AhwBna() {
        if (this.AYXKKw == null) {
            this.AYXKKw = new C7467akQ(AubY());
        }
        return this.AYXKKw;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] padding(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArrPadding = super.padding(luaValueArr);
        C7467akQ c7467akQ = this.AYXKKw;
        if (c7467akQ != null) {
            c7467akQ.copydefault(this);
        }
        return luaValueArrPadding;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] sizeChangeEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        ((C7392aiv) f_()).AEQbTJ(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] requestedOrientation(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null) {
            return null;
        }
        int i = luaValue.toInt();
        Activity activityFIwbmz = fIwbmz();
        if (activityFIwbmz == 0) {
            return null;
        }
        if (activityFIwbmz instanceof LuaVideoPlayerView.StateListAnimator) {
            ((LuaVideoPlayerView.StateListAnimator) activityFIwbmz).OLrzqt(i == 0);
        }
        activityFIwbmz.setRequestedOrientation(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] configRefreshJson(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 2) {
            return null;
        }
        C7823arB.copydefault = luaValueArr[0].toJavaString();
        C7823arB.AEQbTJ = luaValueArr[1].toInt();
        C7823arB.EZpvd = luaValueArr[2].toInt();
        return null;
    }

    private Activity fIwbmz() {
        Context contextAubY = AubY();
        if (contextAubY instanceof Activity) {
            return (Activity) contextAubY;
        }
        return null;
    }

    public void EZpvd(Map map) {
        UDMap uDMap = this.EZpvd;
        if (uDMap == null) {
            UDMap uDMap2 = new UDMap(this.globals, map);
            this.EZpvd = uDMap2;
            uDMap2.onJavaRef();
            return;
        }
        uDMap.EZpvd().putAll(map);
    }

    public void OLrzqt() {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void valueOf() {
        LuaFunction luaFunction = this.AkhnZx;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void AYXKKw() {
        LuaFunction luaFunction = this.isConnected;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void EZpvd() {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public boolean KWHzl(int i, int i2) {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction == null) {
            return false;
        }
        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(i)), LuaNumber.copydefault(C7865arr.AEQbTJ(i2))));
        return true;
    }

    public void KWHzl() {
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View] */
    @Override // com.immomo.mls.fun.ud.view.UDView
    public int fetchVPNInfo() {
        ViewGroup.LayoutParams layoutParams;
        ?? F_ = f_();
        if (F_ == 0 || (layoutParams = F_.getLayoutParams()) == null) {
            return 0;
        }
        int i = layoutParams.width;
        if (i >= 0) {
            return i;
        }
        int measuredWidth = F_.getMeasuredWidth();
        return (measuredWidth <= 0 && i == -1 && (F_.getParent() instanceof ViewGroup)) ? ((ViewGroup) F_.getParent()).getMeasuredWidth() : measuredWidth;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public int djBIcL() {
        return AkhnZx();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View] */
    public final int AkhnZx() {
        ViewGroup.LayoutParams layoutParams;
        ?? F_ = f_();
        if (F_ == 0 || (layoutParams = F_.getLayoutParams()) == null) {
            return 0;
        }
        int i = layoutParams.height;
        if (i >= 0) {
            return i;
        }
        int measuredHeight = F_.getMeasuredHeight();
        return (measuredHeight <= 0 && i == -1 && (F_.getParent() instanceof ViewGroup)) ? ((ViewGroup) F_.getParent()).getMeasuredHeight() : measuredHeight;
    }

    @Override // o.C7834arM.Activity
    public void KWHzl(boolean z, int i) {
        List<LuaFunction> list = this.djBIcL;
        if (list == null) {
            return;
        }
        for (LuaFunction luaFunction : list) {
            if (luaFunction != null) {
                LuaValue[] luaValueArr = new LuaValue[2];
                luaValueArr[0] = z ? LuaValue.True() : LuaValue.False();
                luaValueArr[1] = LuaNumber.copydefault(z ? C7865arr.AEQbTJ(i) : AudioStats.AUDIO_AMPLITUDE_NONE);
                luaFunction.invoke(LuaValue.varargsOf(luaValueArr));
            }
        }
    }
}
