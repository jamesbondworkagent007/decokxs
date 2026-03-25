package com.immomo.mls.fun.ud.notification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.C55097xdX;
import o.C57656ymY;
import o.C7322ahe;
import o.C7323ahf;
import o.C7840arS;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDOkStateNotification {
    public static final String[] AEQbTJ = {"addPrimaryAction", "addSecondaryAction", "show", EopTrackEvent.CLOSE, "title", "message", "setTitleColor", "setTitleFont", "setMessageColor", "setMessageFont", "setIconImage", "setCloseImage", "setMarginLeft", "setMarginRight", "setMarginTop", "setMarginBottom", "setVerticalCenter", "setHorizontalCenter", "setPadding", "setState"};
    public JDImageInfo KWHzl;
    public Globals OLrzqt;
    public C55097xdX copydefault;

    @LuaBridge
    public void setCloseImage(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setHorizontalCenter(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setMarginBottom(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setMarginLeft(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setMarginRight(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setMarginTop(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setMessageFont(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setPadding(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setTitleFont(LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public void setVerticalCenter(LuaValue[] luaValueArr) {
    }

    public UDOkStateNotification(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
        C55097xdX c55097xdX = new C55097xdX(copydefault(globals), null);
        this.copydefault = c55097xdX;
        if (luaValueArr.length > 2) {
            c55097xdX.setState(4);
            this.copydefault.setType(luaValueArr[0].toInt());
            this.copydefault.setTitle(luaValueArr[1].toJavaString());
            this.copydefault.setMessage(luaValueArr[2].toJavaString());
        }
    }

    public Context copydefault(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public void title(LuaValue[] luaValueArr) {
        this.copydefault.setTitle(luaValueArr[0].toJavaString());
    }

    @LuaBridge
    public void message(LuaValue[] luaValueArr) {
        this.copydefault.setMessage(luaValueArr[0].toJavaString());
    }

    @LuaBridge
    public void setState(LuaValue[] luaValueArr) {
        this.copydefault.setState(luaValueArr[0].toInt());
    }

    @LuaBridge
    public void addPrimaryAction(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        this.copydefault.OLrzqt(luaValueArr[0].toJavaString(), new Function0<Unit>() { // from class: com.immomo.mls.fun.ud.notification.UDOkStateNotification.2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                luaFunction.OLrzqt();
                return null;
            }
        });
    }

    @LuaBridge
    public void addSecondaryAction(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        this.copydefault.copydefault(luaValueArr[0].toJavaString(), new Function0<Unit>() { // from class: com.immomo.mls.fun.ud.notification.UDOkStateNotification.5
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public Unit invoke() {
                luaFunction.OLrzqt();
                return null;
            }
        });
    }

    @LuaBridge
    public void close(LuaValue[] luaValueArr) {
        C57656ymY.OLrzqt.valueOf();
    }

    @LuaBridge
    public void setTitleColor(LuaValue[] luaValueArr) {
        this.copydefault.EZpvd().setTextColor(((UDColor) luaValueArr[0]).copydefault());
    }

    @LuaBridge
    public void setMessageColor(LuaValue[] luaValueArr) {
        this.copydefault.KWHzl().setTextColor(((UDColor) luaValueArr[0]).copydefault());
    }

    @LuaBridge
    public void setIconImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null) {
            return;
        }
        UDImageInfo uDImageInfo = (UDImageInfo) luaValue;
        this.KWHzl = uDImageInfo.EZpvd();
        uDImageInfo.destroy();
        this.copydefault.setState(0);
        this.copydefault.AEQbTJ().setVisibility(0);
        OLrzqt(this.KWHzl, this.copydefault.AEQbTJ());
    }

    public void OLrzqt(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            EZpvd(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.notification.UDOkStateNotification.1
                @Override // java.lang.Runnable
                public void run() {
                    UDOkStateNotification.this.EZpvd(jDImageInfo, imageView);
                }
            });
        }
    }

    public final void EZpvd(JDImageInfo jDImageInfo, ImageView imageView) {
        Context contextCopydefault = copydefault(this.OLrzqt);
        if (contextCopydefault == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            KWHzl(C7323ahf.AYXKKw().KWHzl(contextCopydefault, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            KWHzl(null, imageView);
        }
    }

    public final void KWHzl(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    @LuaBridge
    public void addButton(LuaValue[] luaValueArr) {
        this.copydefault.AEQbTJ(((UDView) luaValueArr[0]).f_());
    }

    @LuaBridge
    public void show(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            C57656ymY.OLrzqt.AEQbTJ(this.copydefault, luaValueArr[0].toLong());
        } else {
            C57656ymY.OLrzqt.AEQbTJ(this.copydefault, 5000L);
        }
    }
}
