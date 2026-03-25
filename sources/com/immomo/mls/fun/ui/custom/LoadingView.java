package com.immomo.mls.fun.ui.custom;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.immomo.mls.fun.constants.ContentMode;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import java.io.InputStream;
import o.C55113xdn;
import o.C7546alq;
import o.C7823arB;
import o.C7833arL;
import o.C7911ask;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class LoadingView extends UDViewGroup<C7546alq> {
    public static final String[] AEQbTJ = {"contentMode", "setupOKXLiteLoading", "autoMirrored"};
    public C55113xdn OLrzqt;

    @InterfaceC60044zuT
    public LuaValue[] setupOKXLiteLoading(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LoadingView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C7546alq AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        String str;
        LuaValue luaValue;
        C7546alq c7546alq = new C7546alq(AubY(), this);
        c7546alq.setViewLifeCycleCallback(this);
        InputStream inputStreamOLrzqt = null;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            str = "loading_logo";
        } else {
            String javaString = luaValue.toJavaString();
            if (C7911ask.OLrzqt(this.globals)) {
                String str2 = javaString + "_night.json";
                inputStreamOLrzqt = C7823arB.OLrzqt(str2, zuBGHE());
                str = str2;
            } else {
                str = null;
            }
            if (inputStreamOLrzqt == null) {
                str = javaString + ".json";
                inputStreamOLrzqt = C7823arB.OLrzqt(str, zuBGHE());
            }
        }
        C55113xdn c55113xdn = new C55113xdn(AubY());
        this.OLrzqt = c55113xdn;
        c55113xdn.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (inputStreamOLrzqt != null) {
            this.OLrzqt.setAnimation(inputStreamOLrzqt, str);
        }
        this.OLrzqt.loop(true);
        c7546alq.addView(this.OLrzqt, new ViewGroup.LayoutParams(-1, -2));
        return c7546alq;
    }

    @InterfaceC60044zuT
    public LuaValue[] contentMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].isNil()) {
                C7833arL.KWHzl("contentMode is nil. You must use 'ContentMode.XXXX'");
                return null;
            }
            int i = luaValueArr[0].toInt();
            if (i == ContentMode.CENTER) {
                C7833arL.OLrzqt("ContentMode.CENTER is deprecated", this.globals);
            }
            this.OLrzqt.setScaleType(ImageView.ScaleType.values()[i]);
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setGravity(LuaValue[] luaValueArr) {
        super.setGravity(luaValueArr);
        ((C7546alq) this.dHguZz).setLayoutParams(((C7546alq) this.dHguZz).applyLayoutParams(((C7546alq) this.dHguZz).getLayoutParams(), this.hBpjJd));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] autoMirrored(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return null;
        }
        this.OLrzqt.setAutoMirrored(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
        this.OLrzqt.playAnimation();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        super.AEQbTJ();
        C55113xdn c55113xdn = this.OLrzqt;
        if (c55113xdn != null) {
            c55113xdn.cancelAnimation();
        }
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        super.destroy();
    }
}
