package com.okinc.share.mln;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.share.mln.bean.LuaShareFooterType;
import com.okinc.share.view.FootViewTheme;
import com.reown.android.pulse.model.ConnectionMethod;
import java.util.Map;
import o.AbstractC49356umx;
import o.C48931uew;
import o.C49046uhE;
import o.C49352umt;
import o.C55326xho;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class OKShareFooterView<U extends AbstractC49356umx> extends UDView<U> {
    public static final String[] EZpvd = new String[0];

    @InterfaceC60044zuT
    public OKShareFooterView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public OKShareFooterView(Globals globals, @NonNull U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public OKShareFooterView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        FootViewTheme footViewThemeValueOf;
        if (luaValueArr.length == 0) {
            return (U) OLrzqt();
        }
        try {
            Map<String, ? extends Object> mapAEQbTJ = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
            C49046uhE c49046uhE = C49046uhE.EZpvd;
            LuaShareFooterType luaShareFooterTypeValueOf = LuaShareFooterType.CREATOR.valueOf(((Integer) c49046uhE.KWHzl(mapAEQbTJ, "footerType")).intValue());
            String str = (String) c49046uhE.KWHzl(mapAEQbTJ, "shareFrom");
            Boolean bool = (Boolean) c49046uhE.KWHzl(mapAEQbTJ, "enableLogo");
            U u = (U) OLrzqt();
            if (LuaShareFooterType.CUSTOM == luaShareFooterTypeValueOf) {
                String str2 = (String) c49046uhE.KWHzl(mapAEQbTJ, "title");
                String str3 = (String) c49046uhE.KWHzl(mapAEQbTJ, "subtitle");
                String str4 = (String) c49046uhE.KWHzl(mapAEQbTJ, ConnectionMethod.QR_CODE);
                if (str2 != null) {
                    u.setTitle(str2);
                }
                if (str3 != null) {
                    u.setSubTitle(str3);
                }
                if (str4 != null) {
                    u.setQRCode(str4);
                }
            }
            if (bool != null && !bool.booleanValue()) {
                u.setIcon(null);
            }
            if (!TextUtils.isEmpty(str)) {
                u.setFrom(str);
            }
            Integer num = (Integer) c49046uhE.KWHzl(mapAEQbTJ, "footerTheme");
            if (num != null && (footViewThemeValueOf = FootViewTheme.CREATOR.valueOf(num.intValue())) != null) {
                u.setTheme(footViewThemeValueOf);
            }
            return u;
        } catch (Exception e) {
            e.printStackTrace();
            C55326xho.OLrzqt("OKShareFooterView.newView()->occur error:" + e.getMessage());
            return (U) OLrzqt();
        }
    }

    public final AbstractC49356umx OLrzqt() {
        return (C49352umt) LayoutInflater.from(AubY()).inflate(C48931uew.Application.AubY, (ViewGroup) null);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        super.AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
    }
}
