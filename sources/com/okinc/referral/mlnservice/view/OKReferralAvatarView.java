package com.okinc.referral.mlnservice.view;

import android.graphics.Typeface;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDView;
import java.util.Objects;
import o.C33070mpX;
import o.C48739ubP;
import o.C52761wXj;
import o.C55051xce;
import o.C7810aqp;
import o.C7829arH;
import o.C7865arr;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class OKReferralAvatarView<U extends C7810aqp> extends UDView<U> {
    public C7810aqp KWHzl;
    public static final String[] OLrzqt = {"setImage", "setNameWithoutAdjustsFontSize"};
    public static final String AEQbTJ = OKReferralAvatarView.class.getSimpleName();

    @InterfaceC60044zuT
    public OKReferralAvatarView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public OKReferralAvatarView(Globals globals, @NonNull U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public OKReferralAvatarView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        U u = (U) new C7810aqp(AubY());
        this.KWHzl = u;
        return u;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImage(LuaValue[] luaValueArr) {
        String strSubstring;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.ixgjPv);
        Typeface typefaceValueOf = C55051xce.OLrzqt.valueOf();
        String javaString = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? "" : luaValueArr[1].toJavaString();
        String javaString2 = (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? "" : luaValueArr[2].toJavaString();
        strSubstring = "-";
        if (luaValueArr.length > 3 && luaValueArr[3].isString()) {
            String javaString3 = luaValueArr[3].toJavaString();
            strSubstring = javaString3.isEmpty() ? "-" : javaString3;
            if (strSubstring.trim().length() > 1) {
                strSubstring = strSubstring.trim().substring(0, 1);
            }
        }
        String str = strSubstring;
        if (luaValueArr.length > 4 && luaValueArr[4].isUserdata()) {
            iCopydefault = ((UDColor) luaValueArr[4]).AEQbTJ().getColor(AubY());
        }
        int i = iCopydefault;
        if (luaValueArr.length > 5 && luaValueArr[5].isString()) {
            typefaceValueOf = C7829arH.KWHzl.AEQbTJ(luaValueArr[5].toJavaString(), AubY());
        }
        Typeface typeface = typefaceValueOf;
        if (luaValueArr.length > 6 && luaValueArr[6].isUserdata()) {
            iCopydefault2 = ((UDColor) luaValueArr[6]).AEQbTJ().getColor(AubY());
        }
        f_().setBackgroundDrawable(new C48739ubP(str, i, typeface, iCopydefault2, null));
        if (AubY() == null) {
            return null;
        }
        if (Objects.equals(javaString, "") && Objects.equals(javaString2, "")) {
            return null;
        }
        if (!Objects.equals(javaString, "")) {
            Glide.AEQbTJ(AubY()).EZpvd().copydefault(javaString).gEmmrt().EZpvd((ImageView) f_());
        }
        if (Objects.equals(javaString2, "")) {
            return null;
        }
        Glide.AEQbTJ(AubY()).EZpvd().copydefault(javaString2).gEmmrt().EZpvd((ImageView) f_());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setNameWithoutAdjustsFontSize(LuaValue[] luaValueArr) {
        String strSubstring;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DAIeex);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.ixgjPv);
        int iOLrzqt = C7865arr.OLrzqt(16.0f);
        Typeface typefaceValueOf = C55051xce.OLrzqt.valueOf();
        strSubstring = "-";
        if (luaValueArr.length > 0 && luaValueArr[0].isString()) {
            String javaString = luaValueArr[0].toJavaString();
            strSubstring = javaString.isEmpty() ? "-" : javaString;
            if (strSubstring.trim().length() > 1) {
                strSubstring = strSubstring.trim().substring(0, 1);
            }
        }
        String str = strSubstring;
        if (luaValueArr.length > 1 && luaValueArr[1].isUserdata()) {
            iCopydefault = ((UDColor) luaValueArr[1]).AEQbTJ().getColor(AubY());
        }
        int i = iCopydefault;
        if (luaValueArr.length > 2 && luaValueArr[2].isString()) {
            typefaceValueOf = C7829arH.KWHzl.AEQbTJ(luaValueArr[2].toJavaString(), AubY());
        }
        Typeface typeface = typefaceValueOf;
        if (luaValueArr.length > 3 && luaValueArr[3].isNumber()) {
            iOLrzqt = C7865arr.OLrzqt((float) luaValueArr[3].toDouble());
        }
        if (luaValueArr.length > 4 && luaValueArr[4].isUserdata()) {
            iCopydefault2 = ((UDColor) luaValueArr[4]).AEQbTJ().getColor(AubY());
        }
        f_().setBackgroundDrawable(new C48739ubP(str, i, typeface, iCopydefault2, Float.valueOf(iOLrzqt)));
        return null;
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
