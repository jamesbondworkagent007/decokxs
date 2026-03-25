package com.okinc.captcha.impl.service;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.service.CaptchaMlnService;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.Map;
import java.util.function.Consumer;
import o.AbstractC30369lVv;
import o.C30367lVt;
import o.C30376lWd;
import o.C43251rlk;
import o.C54819xWm;
import o.lWe;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes7.dex */
@LuaClass
public class CaptchaMlnService {
    public static final String LUA_CLASS_NAME = "CaptchaMlnService";

    @LuaBridge
    public void startCaptcha(String str, Boolean bool, final LuaFunction luaFunction) {
        CaptchaScene captchaSceneKWHzl;
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if ((activityAEQbTJ instanceof FragmentActivity) && (captchaSceneKWHzl = CaptchaScene.Companion.KWHzl(str)) != null) {
            C30376lWd.copydefault((lWe) C43251rlk.copydefault(lWe.class), (FragmentActivity) activityAEQbTJ, captchaSceneKWHzl, "lua", null, null, bool.booleanValue() ? SubdomainStrategy.Global.INSTANCE : SubdomainStrategy.Auto.KWHzl, CaptchaVendor.GEETEST).thenAccept(new Consumer() { // from class: o.lWa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    CaptchaMlnService.lambda$startCaptcha$0(luaFunction, (AbstractC30369lVv) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startCaptcha$0(LuaFunction luaFunction, AbstractC30369lVv abstractC30369lVv) {
        if (abstractC30369lVv instanceof AbstractC30369lVv.Activity) {
            Map<String, String> mapAEQbTJ = ((AbstractC30369lVv.Activity) abstractC30369lVv).AEQbTJ();
            luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(mapAEQbTJ != null ? C30367lVt.AEQbTJ(mapAEQbTJ) : "{}"), LuaValue.Nil(), LuaBoolean.AEQbTJ(false)));
        } else if (abstractC30369lVv instanceof AbstractC30369lVv.TaskDescription) {
            String strEZpvd = ((AbstractC30369lVv.TaskDescription) abstractC30369lVv).EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(""), LuaString.copydefault(strEZpvd), LuaBoolean.AEQbTJ(false)));
        }
    }
}
