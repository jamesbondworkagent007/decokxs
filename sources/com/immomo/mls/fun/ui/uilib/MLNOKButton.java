package com.immomo.mls.fun.ui.uilib;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.MLNOKButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52794wYp;
import o.C7323ahf;
import o.C7594aml;
import o.C7603amu;
import o.C7829arH;
import o.C7840arS;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7405ajH;
import o.InterfaceC7852are;
import o.InterfaceC7855arh;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaNil;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKButton extends UDView<C7603amu> {
    public final int AYXKKw;
    public final int AhwBna;
    public String AkhnZx;
    public Drawable AuCTel;
    public Drawable AuCTelauCTel;
    public JColor AubY;
    public JColor DbNXlk;
    public final int djBIcL;
    public JColor ejfBZ;
    public JColor fARcdN;
    public String fIwbmz;
    public int fJNWhG;
    public C7603amu fetchVPNInfo;
    public int gEmmrt;
    public InterfaceC7405ajH getFieldNames;
    public JColor getNewProxyInstance;
    public int hDKMBd;
    public JColor isConnected;
    public Drawable iwGUEr;
    public JColor uzCIH;
    public final int valueOf;
    public Drawable values;
    public String wlaJM;
    public JColor zLjUOn;
    public boolean zsXlph;
    public String zuBGHE;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final String[] OLrzqt = {"padding", "setImageForState", "setTitleForState", "setTitleColorForState", "setBackgroundColorForState", "setTitleImageSpace", "setTitleFont", "enabled", "selected", "rightAlignImage", "breakMode", "setContentGravity", "setContentHorizontalAlignment", "setContentVerticalAlignment", "setButtonType", "setButtonSize", "setButtonPill", "startLoading", "stopLoading", "startLoadingWithInterval", "shouldTintImageWithTextColor"};
    public static final String AEQbTJ = MLNOKButton.class.getSimpleName();
    public static final Integer[] KWHzl = {257, 261, 262, 260, 258, 49, 34, 50, 80, 257, 261, 262, 260, 258, 259, 263, 264};
    public static final Integer[] EZpvd = {52, 52, 44, 36, 32, 28, 24, 56, 48};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String AEQbTJ(String str) {
        String str2 = this.wlaJM;
        return (str != null || str2 == null) ? str == null ? "" : str : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void AEQbTJ(JColor jColor, int i) {
        if (i == this.AYXKKw) {
            this.uzCIH = jColor;
            return;
        }
        if (i == this.valueOf) {
            this.ejfBZ = jColor;
        } else if (i == this.AhwBna) {
            this.DbNXlk = jColor;
        } else if (i == this.djBIcL) {
            this.AubY = jColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void OLrzqt(JColor jColor, int i) {
        if (i == this.AYXKKw) {
            this.getNewProxyInstance = jColor;
            return;
        }
        if (i == this.valueOf) {
            this.fARcdN = jColor;
        } else if (i == this.AhwBna) {
            this.isConnected = jColor;
        } else if (i == this.djBIcL) {
            this.zLjUOn = jColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void copydefault(String str, int i) {
        if (i == this.AYXKKw) {
            this.wlaJM = str;
            return;
        }
        if (i == this.valueOf) {
            this.fIwbmz = str;
        } else if (i == this.AhwBna) {
            this.AkhnZx = str;
        } else if (i == this.djBIcL) {
            this.zuBGHE = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drawable EZpvd(Drawable drawable) {
        Drawable drawable2;
        return (drawable != null || (drawable2 = this.iwGUEr) == null) ? drawable : drawable2;
    }

    @InterfaceC60044zuT
    public MLNOKButton(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.valueOf = 1;
        this.AhwBna = 2;
        this.djBIcL = 4;
        this.hDKMBd = this.AYXKKw;
        this.gEmmrt = -1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C7603amu AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C7603amu c7603amu = new C7603amu(contextAubY, this);
        this.fetchVPNInfo = c7603amu;
        c7603amu.setSingleLine(true);
        C7603amu c7603amu2 = this.fetchVPNInfo;
        if (c7603amu2 == null) {
            Intrinsics.gEmmrt("");
            c7603amu2 = null;
        }
        c7603amu2.setEllipsize(TextUtils.TruncateAt.END);
        C7603amu c7603amu3 = this.fetchVPNInfo;
        if (c7603amu3 == null) {
            Intrinsics.gEmmrt("");
            c7603amu3 = null;
        }
        c7603amu3.setBgColor(0);
        C7603amu c7603amu4 = this.fetchVPNInfo;
        if (c7603amu4 == null) {
            Intrinsics.gEmmrt("");
            c7603amu4 = null;
        }
        c7603amu4.setOKDSPill(-1);
        C7603amu c7603amu5 = this.fetchVPNInfo;
        if (c7603amu5 != null) {
            return c7603amu5;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setButtonType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null) {
            int i = luaValue.toInt();
            C7603amu c7603amu = this.fetchVPNInfo;
            if (c7603amu == null) {
                Intrinsics.gEmmrt("");
                c7603amu = null;
            }
            c7603amu.setOKDSType(KWHzl[i].intValue());
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setButtonSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null) {
            int i = luaValue.toInt();
            C7603amu c7603amu = this.fetchVPNInfo;
            if (c7603amu == null) {
                Intrinsics.gEmmrt("");
                c7603amu = null;
            }
            c7603amu.setSingleLine(false);
            C7603amu c7603amu2 = this.fetchVPNInfo;
            if (c7603amu2 == null) {
                Intrinsics.gEmmrt("");
                c7603amu2 = null;
            }
            c7603amu2.setOKDSSize(EZpvd[i].intValue());
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setButtonPill(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null) {
            boolean z = luaValue.toBoolean();
            C7603amu c7603amu = this.fetchVPNInfo;
            if (c7603amu == null) {
                Intrinsics.gEmmrt("");
                c7603amu = null;
            }
            c7603amu.setOKDSPill(z ? -1 : -2);
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] startLoading(LuaValue[] luaValueArr) {
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        C52794wYp.startLoading$default(c7603amu, 0L, 1, null);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] startLoadingWithInterval(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        long jSafeGetLong$default = C7594aml.safeGetLong$default(luaValueArr, 0, 0L, 3, null);
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        c7603amu.OLrzqt(jSafeGetLong$default);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] stopLoading(LuaValue[] luaValueArr) {
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        c7603amu.fIwbmz();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] breakMode(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 1) {
            int i = luaValueArr[0].toInt();
            this.gEmmrt = i;
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
    public LuaValue[] clipToBounds(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        super.clipToBounds(luaValueArr);
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentGravity(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int i = luaValueArr[0].toInt();
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        c7603amu.setButtonGravity(i);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentHorizontalAlignment(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int i = luaValueArr[0].toInt();
        int gravity = f_().getGravity();
        if (i == 0) {
            gravity = 1;
        } else if (i == 1) {
            gravity = 8388611;
        } else if (i == 2) {
            gravity = 8388613;
        }
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        c7603amu.setButtonGravity(f_().getGravity() | gravity);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentVerticalAlignment(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int i = luaValueArr[0].toInt();
        int gravity = f_().getGravity();
        if (i == 0) {
            gravity = 16;
        } else if (i == 1) {
            gravity = 48;
        } else if (i == 2) {
            gravity = 80;
        }
        C7603amu c7603amu = this.fetchVPNInfo;
        if (c7603amu == null) {
            Intrinsics.gEmmrt("");
            c7603amu = null;
        }
        c7603amu.setButtonGravity(f_().getGravity() | gravity);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] padding(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        f_().setPaddingRelative(C7865arr.copydefault(luaValueArr[3].toInt()), C7865arr.copydefault(luaValueArr[0].toInt()), C7865arr.copydefault(luaValueArr[1].toInt()), C7865arr.copydefault(luaValueArr[2].toInt()));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setImageForState(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            Intrinsics.copydefault(luaValue2, "");
            UDImageInfo uDImageInfo = (UDImageInfo) luaValue2;
            KWHzl(uDImageInfo.EZpvd(), this.hDKMBd);
            uDImageInfo.destroy();
        }
        if (luaValueArr.length == 2 && luaValueArr[0] != null && (luaValue = luaValueArr[1]) != null) {
            Intrinsics.copydefault(luaValue);
            int i = luaValue.toInt();
            LuaValue luaValue3 = luaValueArr[0];
            if (luaValue3 instanceof LuaNil) {
                EZpvd((Drawable) null, i);
            } else {
                Intrinsics.copydefault(luaValue3, "");
                UDImageInfo uDImageInfo2 = (UDImageInfo) luaValue3;
                KWHzl(uDImageInfo2.EZpvd(), i);
                uDImageInfo2.destroy();
            }
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] enabled(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return ((C7603amu) this.dHguZz).isEnabled() ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        boolean z = luaValueArr[0].toBoolean();
        ((C7603amu) this.dHguZz).setEnabled(z);
        if (!z) {
            this.hDKMBd = this.AhwBna;
            f_().setClickable(false);
        } else {
            this.hDKMBd = this.AYXKKw;
            f_().setClickable(true);
        }
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleForState(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        Intrinsics.copydefault(luaValue);
        String javaString = luaValue.toJavaString();
        LuaValue luaValue2 = luaValueArr[1];
        Intrinsics.copydefault(luaValue2);
        int i = luaValue2.toInt();
        Intrinsics.copydefault((Object) javaString);
        copydefault(javaString, i);
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleColorForState(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        Intrinsics.copydefault(luaValue, "");
        UDColor uDColor = (UDColor) luaValue;
        LuaValue luaValue2 = luaValueArr[1];
        Intrinsics.copydefault(luaValue2);
        int i = luaValue2.toInt();
        JColor jColorAEQbTJ = uDColor.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(jColorAEQbTJ, "");
        OLrzqt(jColorAEQbTJ, i);
        uDColor.destroy();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setBackgroundColorForState(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        Intrinsics.copydefault(luaValue, "");
        UDColor uDColor = (UDColor) luaValue;
        LuaValue luaValue2 = luaValueArr[1];
        Intrinsics.copydefault(luaValue2);
        int i = luaValue2.toInt();
        JColor jColorAEQbTJ = uDColor.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(jColorAEQbTJ, "");
        AEQbTJ(jColorAEQbTJ, i);
        uDColor.destroy();
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleImageSpace(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        Intrinsics.copydefault(luaValue);
        this.fJNWhG = C7865arr.copydefault(luaValue.toInt());
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleFont(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 2 || luaValueArr[1] == null) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        Intrinsics.copydefault(luaValue);
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        C7829arH c7829arH = C7829arH.KWHzl;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        Typeface typefaceAEQbTJ = c7829arH.AEQbTJ(javaString, contextAubY);
        if (typefaceAEQbTJ != null) {
            f_().setTypeface(typefaceAEQbTJ);
        }
        C7603amu c7603amuF_ = f_();
        LuaValue luaValue2 = luaValueArr[1];
        Intrinsics.copydefault(luaValue2);
        c7603amuF_.setTextSize(2, (float) luaValue2.toDouble());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] selected(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            Intrinsics.copydefault(luaValue);
            this.hDKMBd = luaValue.toBoolean() ? this.djBIcL : this.AYXKKw;
            gEmmrt();
            return null;
        }
        return LuaValue.rBoolean(this.hDKMBd == this.djBIcL);
    }

    @InterfaceC60044zuT
    public final LuaValue[] rightAlignImage(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            Intrinsics.copydefault(luaValue);
            this.zsXlph = luaValue.toBoolean();
            gEmmrt();
            return null;
        }
        return LuaValue.rBoolean(this.zsXlph);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        int i = this.hDKMBd;
        C7603amu c7603amu = null;
        if (i == this.AYXKKw) {
            C7603amu c7603amu2 = this.fetchVPNInfo;
            if (c7603amu2 == null) {
                Intrinsics.gEmmrt("");
                c7603amu2 = null;
            }
            String str = this.wlaJM;
            if (str == null) {
                str = "";
            }
            c7603amu2.setText(str);
            JColor jColor = this.getNewProxyInstance;
            if (jColor != null) {
                C7603amu c7603amu3 = this.fetchVPNInfo;
                if (c7603amu3 == null) {
                    Intrinsics.gEmmrt("");
                    c7603amu3 = null;
                }
                c7603amu3.setTextColor(jColor.getColor(this.globals));
            }
            JColor jColor2 = this.uzCIH;
            if (jColor2 != null) {
                C7603amu c7603amu4 = this.fetchVPNInfo;
                if (c7603amu4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c7603amu = c7603amu4;
                }
                c7603amu.setBgColor(jColor2.getColor(this.globals));
            }
            OLrzqt(this.iwGUEr, this.fJNWhG, this.zsXlph);
            return;
        }
        if (i == this.valueOf) {
            C7603amu c7603amu5 = this.fetchVPNInfo;
            if (c7603amu5 == null) {
                Intrinsics.gEmmrt("");
                c7603amu5 = null;
            }
            c7603amu5.setText(AEQbTJ(this.fIwbmz));
            if (EZpvd(this.fARcdN) != 0) {
                C7603amu c7603amu6 = this.fetchVPNInfo;
                if (c7603amu6 == null) {
                    Intrinsics.gEmmrt("");
                    c7603amu6 = null;
                }
                c7603amu6.setTextColor(EZpvd(this.fARcdN));
            }
            if (OLrzqt(this.ejfBZ) != 0) {
                C7603amu c7603amu7 = this.fetchVPNInfo;
                if (c7603amu7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c7603amu = c7603amu7;
                }
                c7603amu.setBgColor(OLrzqt(this.ejfBZ));
            }
            OLrzqt(EZpvd(this.AuCTel), this.fJNWhG, this.zsXlph);
            return;
        }
        if (i == this.AhwBna) {
            C7603amu c7603amu8 = this.fetchVPNInfo;
            if (c7603amu8 == null) {
                Intrinsics.gEmmrt("");
                c7603amu8 = null;
            }
            c7603amu8.setText(AEQbTJ(this.AkhnZx));
            if (EZpvd(this.isConnected) != 0) {
                C7603amu c7603amu9 = this.fetchVPNInfo;
                if (c7603amu9 == null) {
                    Intrinsics.gEmmrt("");
                    c7603amu9 = null;
                }
                c7603amu9.setTextColor(EZpvd(this.isConnected));
            }
            if (OLrzqt(this.DbNXlk) != 0) {
                C7603amu c7603amu10 = this.fetchVPNInfo;
                if (c7603amu10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c7603amu = c7603amu10;
                }
                c7603amu.setBgColor(OLrzqt(this.DbNXlk));
            }
            OLrzqt(EZpvd(this.values), this.fJNWhG, this.zsXlph);
            return;
        }
        if (i == this.djBIcL) {
            C7603amu c7603amu11 = this.fetchVPNInfo;
            if (c7603amu11 == null) {
                Intrinsics.gEmmrt("");
                c7603amu11 = null;
            }
            c7603amu11.setText(AEQbTJ(this.zuBGHE));
            if (EZpvd(this.zLjUOn) != 0) {
                C7603amu c7603amu12 = this.fetchVPNInfo;
                if (c7603amu12 == null) {
                    Intrinsics.gEmmrt("");
                    c7603amu12 = null;
                }
                c7603amu12.setTextColor(EZpvd(this.zLjUOn));
            }
            if (OLrzqt(this.AubY) != 0) {
                C7603amu c7603amu13 = this.fetchVPNInfo;
                if (c7603amu13 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c7603amu = c7603amu13;
                }
                c7603amu.setBgColor(OLrzqt(this.AubY));
            }
            OLrzqt(EZpvd(this.AuCTelauCTel), this.fJNWhG, this.zsXlph);
        }
    }

    private final int EZpvd(JColor jColor) {
        JColor jColor2;
        if (jColor == null && (jColor2 = this.getNewProxyInstance) != null) {
            Intrinsics.copydefault(jColor2);
            return jColor2.getColor(this.globals);
        }
        if (jColor != null) {
            return jColor.getColor(this.globals);
        }
        return 0;
    }

    private final int OLrzqt(JColor jColor) {
        JColor jColor2;
        if (jColor == null && (jColor2 = this.uzCIH) != null) {
            Intrinsics.copydefault(jColor2);
            return jColor2.getColor(this.globals);
        }
        if (jColor != null) {
            return jColor.getColor(this.globals);
        }
        return 0;
    }

    private final void OLrzqt(Drawable drawable, int i, boolean z) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        C7603amu c7603amu = null;
        if (z) {
            C7603amu c7603amu2 = this.fetchVPNInfo;
            if (c7603amu2 == null) {
                Intrinsics.gEmmrt("");
                c7603amu2 = null;
            }
            c7603amu2.setCompoundDrawablesRelative(null, null, drawable, null);
        } else {
            C7603amu c7603amu3 = this.fetchVPNInfo;
            if (c7603amu3 == null) {
                Intrinsics.gEmmrt("");
                c7603amu3 = null;
            }
            c7603amu3.setCompoundDrawablesRelative(drawable, null, null, null);
        }
        if (i > 0) {
            C7603amu c7603amu4 = this.fetchVPNInfo;
            if (c7603amu4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c7603amu = c7603amu4;
            }
            c7603amu.setCompoundDrawablePadding(i);
        }
    }

    public final void KWHzl(@NotNull final JDImageInfo jDImageInfo, final int i) {
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        if (Intrinsics.EZpvd(Looper.myLooper(), Looper.getMainLooper())) {
            EZpvd(jDImageInfo, i);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: o.ame
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    MLNOKButton.copydefault(this.EZpvd, jDImageInfo, i);
                }
            });
        }
    }

    public static final void copydefault(MLNOKButton mLNOKButton, JDImageInfo jDImageInfo, int i) {
        mLNOKButton.EZpvd(jDImageInfo, i);
    }

    private final void EZpvd(JDImageInfo jDImageInfo, int i) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(interfaceC7855arhAYXKKw, "");
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(contextAubY, jDImageInfo);
            Intrinsics.checkNotNullExpressionValue(drawableKWHzl, "");
            EZpvd(drawableKWHzl, i);
        } else if (!zIsNetUrl && TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            EZpvd((Drawable) null, i);
        } else {
            if (TextUtils.isEmpty(jDImageInfo.getNetUrl())) {
                return;
            }
            interfaceC7855arhAYXKKw.KWHzl(contextAubY, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, new Application(i));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class Application implements InterfaceC7852are {
        public final int copydefault;

        public Application(int i) {
            this.copydefault = i;
        }

        @Override // o.InterfaceC7852are
        public void copydefault(@NotNull Drawable drawable, @NotNull String str) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(str, "");
            MLNOKButton.this.EZpvd(drawable, this.copydefault);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(Drawable drawable, int i) {
        if (i != this.AYXKKw) {
            if (i == this.valueOf) {
                this.AuCTel = drawable;
            } else if (i == this.AhwBna) {
                this.values = drawable;
            } else if (i == this.djBIcL) {
                this.AuCTelauCTel = drawable;
            } else {
                this.iwGUEr = drawable;
            }
        }
        gEmmrt();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        this.getFieldNames = null;
        super.AEQbTJ();
    }

    public static final class TaskDescription implements InterfaceC7405ajH {
        public TaskDescription() {
        }

        @Override // o.InterfaceC7405ajH
        public void EZpvd() {
            MLNOKButton.this.gEmmrt();
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        TaskDescription taskDescription = new TaskDescription();
        this.getFieldNames = taskDescription;
        KWHzl(taskDescription);
        super.copydefault();
    }

    @InterfaceC60044zuT
    public final LuaValue[] shouldTintImageWithTextColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length != 1 || !luaValueArr[0].isBoolean()) {
            return ((C7603amu) this.dHguZz).ejfBZ() ? LuaValue.rTrue() : LuaValue.rFalse();
        }
        ((C7603amu) this.dHguZz).setShouldTintImageWithTextColor(luaValueArr[0].toBoolean());
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.MLNOKButton.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return MLNOKButton.OLrzqt;
        }

        public final Integer[] EZpvd() {
            return MLNOKButton.KWHzl;
        }
    }
}
