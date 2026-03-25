package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.IOkImageButton;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import o.C7323ahf;
import o.C7829arH;
import o.C7840arS;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7405ajH;
import o.InterfaceC7852are;
import o.InterfaceC7855arh;
import org.luaj.vm2.LuaNil;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OkImageButton<U extends TextView & IOkImageButton> extends UDView<U> {
    public static final String[] OLrzqt = {"padding", "setImageForState", "setTitleForState", "setTitleColorForState", "setBackgroundColorForState", "setTitleImageSpace", "setTitleFont", "enabled", "selected", "rightAlignImage", "breakMode", "setContentGravity", "setContentHorizontalAlignment", "setContentVerticalAlignment"};
    public static final String copydefault = OkImageButton.class.getSimpleName();
    public final int AEQbTJ;
    public final int AYXKKw;
    public Drawable AhwBna;
    public int AkhnZx;
    public JColor AuCTel;
    public JColor AuCTelauCTel;
    public Drawable AubY;
    public JColor DbNXlk;
    public final int EZpvd;
    public final int KWHzl;
    public JColor djBIcL;
    public JDImageInfo ejfBZ;
    public int fARcdN;
    public Drawable fIwbmz;
    public InterfaceC7405ajH fJNWhG;
    public String fetchVPNInfo;
    public JColor gEmmrt;
    public JColor getFieldNames;
    public Drawable getNewProxyInstance;
    public JColor hDKMBd;
    public String isConnected;
    public String iwGUEr;
    public boolean uzCIH;
    public int valueOf;
    public JColor values;
    public LuaTextView wlaJM;
    public String zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable AEQbTJ(Drawable drawable) {
        Drawable drawable2;
        return (drawable != null || (drawable2 = this.getNewProxyInstance) == null) ? drawable : drawable2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(JColor jColor, int i) {
        if (i == 0) {
            this.AuCTel = jColor;
            return;
        }
        if (i == 1) {
            this.DbNXlk = jColor;
        } else if (i == 2) {
            this.djBIcL = jColor;
        } else if (i == 4) {
            this.hDKMBd = jColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(JColor jColor, int i) {
        if (i == 0) {
            this.getFieldNames = jColor;
            return;
        }
        if (i == 1) {
            this.values = jColor;
        } else if (i == 2) {
            this.gEmmrt = jColor;
        } else if (i == 4) {
            this.AuCTelauCTel = jColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str, int i) {
        if (i == 0) {
            this.iwGUEr = str;
            return;
        }
        if (i == 1) {
            this.fetchVPNInfo = str;
        } else if (i == 2) {
            this.isConnected = str;
        } else if (i == 4) {
            this.zLjUOn = str;
        }
    }

    @InterfaceC60044zuT
    public OkImageButton(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = 0;
        this.EZpvd = 1;
        this.AEQbTJ = 2;
        this.AYXKKw = 4;
        this.fARcdN = 0;
        this.uzCIH = false;
        this.valueOf = -1;
        this.ejfBZ = null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        LuaTextView luaTextView = new LuaTextView(AubY(), this, luaValueArr);
        this.wlaJM = luaTextView;
        return luaTextView;
    }

    @InterfaceC60044zuT
    public LuaValue[] breakMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int i = luaValueArr[0].toInt();
            this.valueOf = i;
            if (i < 0) {
                f_().setEllipsize(null);
            } else {
                f_().setEllipsize(TextUtils.TruncateAt.values()[i]);
            }
            return null;
        }
        TextUtils.TruncateAt ellipsize = f_().getEllipsize();
        return ellipsize == null ? LuaValue.varargsOf(LuaNumber.valueOf(-1)) : LuaValue.varargsOf(LuaNumber.valueOf(ellipsize.ordinal()));
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] cornerRadius(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            super.cornerRadius(luaValueArr);
            OLrzqt();
            return null;
        }
        return super.cornerRadius(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] clipToBounds(LuaValue[] luaValueArr) {
        super.clipToBounds(luaValueArr);
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContentGravity(LuaValue[] luaValueArr) {
        f_().setGravity(luaValueArr[0].toInt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContentHorizontalAlignment(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        int gravity = f_().getGravity();
        if (i == 0) {
            gravity = 1;
        } else if (i == 1) {
            gravity = 8388611;
        } else if (i == 2) {
            gravity = 8388613;
        }
        f_().setGravity(gravity | f_().getGravity());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setContentVerticalAlignment(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        int gravity = f_().getGravity();
        if (i == 0) {
            gravity = 16;
        } else if (i == 1) {
            gravity = 48;
        } else if (i == 2) {
            gravity = 80;
        }
        f_().setGravity(gravity | f_().getGravity());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] padding(LuaValue[] luaValueArr) {
        f_().setPaddingRelative(C7865arr.copydefault(luaValueArr[3].toInt()), C7865arr.copydefault(luaValueArr[0].toInt()), C7865arr.copydefault(luaValueArr[1].toInt()), C7865arr.copydefault(luaValueArr[2].toInt()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImageForState(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            UDImageInfo uDImageInfo = (UDImageInfo) luaValue2;
            JDImageInfo jDImageInfoEZpvd = uDImageInfo.EZpvd();
            this.ejfBZ = jDImageInfoEZpvd;
            EZpvd(jDImageInfoEZpvd, this.fARcdN);
            uDImageInfo.destroy();
        }
        if (luaValueArr.length == 2 && luaValueArr[0] != null && (luaValue = luaValueArr[1]) != null) {
            int i = luaValue.toInt();
            LuaValue luaValue3 = luaValueArr[0];
            if (luaValue3 instanceof LuaNil) {
                OLrzqt((Drawable) null, i);
            } else {
                UDImageInfo uDImageInfo2 = (UDImageInfo) luaValue3;
                JDImageInfo jDImageInfoEZpvd2 = uDImageInfo2.EZpvd();
                this.ejfBZ = jDImageInfoEZpvd2;
                EZpvd(jDImageInfoEZpvd2, i);
                uDImageInfo2.destroy();
            }
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] enabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return ((TextView) this.dHguZz).isEnabled() ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        boolean z = luaValueArr[0].toBoolean();
        ((TextView) this.dHguZz).setEnabled(z);
        if (!z) {
            this.fARcdN = 2;
            f_().setClickable(false);
        } else {
            this.fARcdN = 0;
            f_().setClickable(true);
        }
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTitleForState(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        copydefault(luaValue.toJavaString(), luaValueArr[1].toInt());
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTitleColorForState(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || (luaValue2 = luaValueArr[1]) == null) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        copydefault(uDColor.AEQbTJ(), luaValue2.toInt());
        uDColor.destroy();
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBackgroundColorForState(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || (luaValue2 = luaValueArr[1]) == null) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        EZpvd(uDColor.AEQbTJ(), luaValue2.toInt());
        uDColor.destroy();
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTitleImageSpace(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.AkhnZx = C7865arr.copydefault(luaValue.toInt());
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTitleFont(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 2 || luaValueArr[1] == null) {
            return null;
        }
        Typeface typefaceAEQbTJ = C7829arH.KWHzl.AEQbTJ(luaValueArr[0].toJavaString(), AubY());
        if (typefaceAEQbTJ != null) {
            f_().setTypeface(typefaceAEQbTJ);
        }
        f_().setTextSize(2, (float) luaValueArr[1].toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] selected(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            if (luaValue.toBoolean()) {
                this.fARcdN = 4;
            } else {
                this.fARcdN = 0;
            }
            OLrzqt();
            return null;
        }
        return LuaValue.rBoolean(this.fARcdN == 4);
    }

    @InterfaceC60044zuT
    public LuaValue[] rightAlignImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.uzCIH = luaValue.toBoolean();
            OLrzqt();
            return null;
        }
        return LuaValue.rBoolean(this.uzCIH);
    }

    public final void OLrzqt() {
        int i = this.fARcdN;
        if (i == 0) {
            if (!TextUtils.isEmpty(this.iwGUEr)) {
                this.wlaJM.setText(this.iwGUEr);
            }
            JColor jColor = this.getFieldNames;
            if (jColor != null) {
                this.wlaJM.setTextColor(jColor.getColor(this.globals));
            }
            JColor jColor2 = this.AuCTel;
            if (jColor2 != null) {
                this.wlaJM.setBackgroundColor(jColor2.getColor(this.globals));
            }
            AEQbTJ(this.getNewProxyInstance, this.AkhnZx, this.uzCIH);
            return;
        }
        if (i == 1) {
            if (!TextUtils.isEmpty(copydefault(this.fetchVPNInfo))) {
                this.wlaJM.setText(copydefault(this.fetchVPNInfo));
            }
            if (EZpvd(this.values) != 0) {
                this.wlaJM.setTextColor(EZpvd(this.values));
            }
            if (copydefault(this.DbNXlk) != 0) {
                this.wlaJM.setBackgroundColor(copydefault(this.DbNXlk));
            }
            AEQbTJ(AEQbTJ(this.fIwbmz), this.AkhnZx, this.uzCIH);
            return;
        }
        if (i == 2) {
            if (!TextUtils.isEmpty(copydefault(this.isConnected))) {
                this.wlaJM.setText(copydefault(this.isConnected));
            }
            if (EZpvd(this.gEmmrt) != 0) {
                this.wlaJM.setTextColor(EZpvd(this.gEmmrt));
            }
            if (copydefault(this.djBIcL) != 0) {
                this.wlaJM.setBackgroundColor(copydefault(this.djBIcL));
            }
            AEQbTJ(AEQbTJ(this.AhwBna), this.AkhnZx, this.uzCIH);
            return;
        }
        if (i == 4) {
            if (!TextUtils.isEmpty(copydefault(this.zLjUOn))) {
                this.wlaJM.setText(copydefault(this.zLjUOn));
            }
            if (EZpvd(this.AuCTelauCTel) != 0) {
                this.wlaJM.setTextColor(EZpvd(this.AuCTelauCTel));
            }
            if (copydefault(this.hDKMBd) != 0) {
                this.wlaJM.setBackgroundColor(copydefault(this.hDKMBd));
            }
            AEQbTJ(AEQbTJ(this.AubY), this.AkhnZx, this.uzCIH);
        }
    }

    private String copydefault(String str) {
        return (!TextUtils.isEmpty(str) || TextUtils.isEmpty(this.iwGUEr)) ? !TextUtils.isEmpty(str) ? str : "" : this.iwGUEr;
    }

    public final int EZpvd(JColor jColor) {
        JColor jColor2;
        if (jColor == null && (jColor2 = this.getFieldNames) != null) {
            return jColor2.getColor(this.globals);
        }
        if (jColor != null) {
            return jColor.getColor(this.globals);
        }
        return 0;
    }

    public final int copydefault(JColor jColor) {
        JColor jColor2;
        if (jColor == null && (jColor2 = this.AuCTel) != null) {
            return jColor2.getColor(this.globals);
        }
        if (jColor != null) {
            return jColor.getColor(this.globals);
        }
        return 0;
    }

    public final void AEQbTJ(Drawable drawable, int i, boolean z) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (!z) {
            this.wlaJM.setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            this.wlaJM.setCompoundDrawablesRelative(null, null, drawable, null);
        }
        if (i > 0) {
            this.wlaJM.setCompoundDrawablePadding(i);
        }
    }

    public void EZpvd(final JDImageInfo jDImageInfo, final int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            KWHzl(jDImageInfo, i);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ui.custom.OkImageButton.2
                @Override // java.lang.Runnable
                public void run() {
                    OkImageButton.this.KWHzl(jDImageInfo, i);
                }
            });
        }
    }

    public final void KWHzl(JDImageInfo jDImageInfo, int i) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            OLrzqt(interfaceC7855arhAYXKKw.KWHzl(contextAubY, jDImageInfo), i);
            return;
        }
        if (!zIsNetUrl && TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            OLrzqt((Drawable) null, i);
        } else {
            if (TextUtils.isEmpty(jDImageInfo.getNetUrl())) {
                return;
            }
            interfaceC7855arhAYXKKw.KWHzl(contextAubY, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, new ActionBar(i));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class ActionBar implements InterfaceC7852are {
        public final int copydefault;

        public ActionBar(int i) {
            this.copydefault = i;
        }

        @Override // o.InterfaceC7852are
        public void copydefault(Drawable drawable, String str) {
            OkImageButton.this.OLrzqt(drawable, this.copydefault);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:3:0x0002  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(Drawable drawable, int i) {
        if (i != 0) {
            if (i == 1) {
                this.fIwbmz = drawable;
            } else if (i == 2) {
                this.AhwBna = drawable;
            } else if (i == 4) {
                this.AubY = drawable;
            } else {
                this.getNewProxyInstance = drawable;
            }
        }
        OLrzqt();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        this.fJNWhG = null;
        super.AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        InterfaceC7405ajH interfaceC7405ajH = new InterfaceC7405ajH() { // from class: com.immomo.mls.fun.ui.custom.OkImageButton.4
            @Override // o.InterfaceC7405ajH
            public void EZpvd() {
                OkImageButton.this.OLrzqt();
            }
        };
        this.fJNWhG = interfaceC7405ajH;
        KWHzl(interfaceC7405ajH);
        super.copydefault();
    }
}
