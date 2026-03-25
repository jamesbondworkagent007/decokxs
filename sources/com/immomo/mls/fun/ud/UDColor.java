package com.immomo.mls.fun.ud;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.immomo.mls.fun.ui.custom.JColor;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import o.C55365xia;
import o.C55366xib;
import o.C7322ahe;
import o.C7833arL;
import o.C7858ark;
import o.InterfaceC60044zuT;
import o.InterfaceC8012aug;
import o.wYG;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDColor extends LuaUserdata {
    public static final String[] EZpvd = {"hex", "alpha", "red", "green", "blue", "setHexA", "setDark", "setRGBA", Web3SecurityTrackEvent.VALUE_CLEAR, "setAColor", "setColor", "okBaseColor", "okCoreColor", "setDarkColor", "okThreeOneColor"};
    public static final InterfaceC8012aug<UDColor, Integer> OLrzqt = new InterfaceC8012aug<UDColor, Integer>() { // from class: com.immomo.mls.fun.ud.UDColor.2
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Integer copydefault(UDColor uDColor) {
            return Integer.valueOf(uDColor.KWHzl);
        }
    };
    public double AEQbTJ;
    public int KWHzl;
    public Integer copydefault;
    public Integer gEmmrt;

    public double OLrzqt(double d) {
        if (d > 1.0d) {
            return 1.0d;
        }
        return d < AudioStats.AUDIO_AMPLITUDE_NONE ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
    }

    public int OLrzqt(int i) {
        if (i > 255) {
            return 255;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public LuaValue[] clear(LuaValue[] luaValueArr) {
        this.KWHzl = 0;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.KWHzl = i;
    }

    public UDColor(Globals globals, int i) {
        super(globals, Integer.valueOf(i));
        this.copydefault = null;
        this.gEmmrt = null;
        this.AEQbTJ = -1.0d;
        this.KWHzl = i;
    }

    @InterfaceC60044zuT
    public UDColor(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = -1;
        this.copydefault = null;
        this.gEmmrt = null;
        this.AEQbTJ = -1.0d;
        EZpvd(luaValueArr);
    }

    public final void EZpvd(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            if (luaValueArr.length == 4) {
                this.KWHzl = Color.argb((int) (OLrzqt(luaValueArr[3].toDouble()) * 255.0d), OLrzqt(luaValueArr[0].toInt()), OLrzqt(luaValueArr[1].toInt()), OLrzqt(luaValueArr[2].toInt()));
            } else if (luaValueArr.length == 3) {
                this.KWHzl = Color.argb(255, OLrzqt(luaValueArr[0].toInt()), OLrzqt(luaValueArr[1].toInt()), OLrzqt(luaValueArr[2].toInt()));
            } else if (luaValueArr.length != 0) {
                C7833arL.valueOf("Color only zero or three or four parameters can be used for constructor method", getGlobals());
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] hex(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            int iDjBIcL = djBIcL();
            this.KWHzl = luaValueArr[0].toInt();
            gEmmrt(iDjBIcL);
            return null;
        }
        return LuaValue.rNumber(this.KWHzl);
    }

    public Context EZpvd() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public final void AEQbTJ(int i) {
        int iOLrzqt = OLrzqt();
        this.copydefault = Integer.valueOf(i);
        EZpvd(iOLrzqt);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDark(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 2) {
            return null;
        }
        this.gEmmrt = Integer.valueOf(luaValueArr[0].toInt());
        this.AEQbTJ = luaValueArr[1].toDouble();
        return null;
    }

    public final Integer gEmmrt() {
        Integer num;
        if (this.copydefault == null && (num = this.gEmmrt) != null && this.AEQbTJ != -1.0d) {
            AEQbTJ(num.intValue());
            copydefault(this.AEQbTJ);
        }
        return this.copydefault;
    }

    @InterfaceC60044zuT
    public LuaValue[] alpha(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            gEmmrt((int) (OLrzqt(luaValueArr[0].toDouble()) * 255.0d));
            copydefault(luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(djBIcL() / 255.0f);
    }

    public final void copydefault(double d) {
        EZpvd((int) (OLrzqt(d) * 255.0d));
    }

    @InterfaceC60044zuT
    public LuaValue[] okBaseColor(LuaValue[] luaValueArr) {
        Integer numAEQbTJ;
        if (luaValueArr.length == 1 && (numAEQbTJ = wYG.AEQbTJ(luaValueArr[0].toJavaString())) != null) {
            this.KWHzl = ContextCompat.getColor(EZpvd(), numAEQbTJ.intValue());
            return LuaValue.rBoolean(true);
        }
        return LuaValue.rBoolean(false);
    }

    @InterfaceC60044zuT
    public LuaValue[] okCoreColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 2) {
            String javaString = luaValueArr[0].toJavaString();
            int i = luaValueArr[1].toInt();
            Pair<Integer, Integer> pairKWHzl = wYG.KWHzl(javaString);
            if (pairKWHzl != null) {
                if (i == 1) {
                    this.KWHzl = ContextCompat.getColor(EZpvd(), ((Integer) pairKWHzl.first).intValue());
                } else if (i == 2) {
                    this.KWHzl = ContextCompat.getColor(EZpvd(), ((Integer) pairKWHzl.second).intValue());
                } else {
                    this.KWHzl = ContextCompat.getColor(EZpvd(), ((Integer) pairKWHzl.first).intValue());
                    this.copydefault = Integer.valueOf(ContextCompat.getColor(EZpvd(), ((Integer) pairKWHzl.second).intValue()));
                }
                return LuaValue.rBoolean(true);
            }
            Integer numOLrzqt = wYG.OLrzqt(javaString);
            if (numOLrzqt != null) {
                Context contextEZpvd = EZpvd();
                if (i == 1) {
                    this.KWHzl = C55366xib.KWHzl(numOLrzqt.intValue(), copydefault(contextEZpvd, 16));
                } else if (i == 2) {
                    this.KWHzl = C55366xib.KWHzl(numOLrzqt.intValue(), copydefault(contextEZpvd, 32));
                } else {
                    this.KWHzl = C55366xib.KWHzl(numOLrzqt.intValue(), copydefault(contextEZpvd, 16));
                    this.copydefault = Integer.valueOf(C55366xib.KWHzl(numOLrzqt.intValue(), copydefault(contextEZpvd, 32)));
                }
                return LuaValue.rBoolean(true);
            }
        }
        return LuaValue.rBoolean(false);
    }

    @InterfaceC60044zuT
    public LuaValue[] okThreeOneColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 2) {
            String javaString = luaValueArr[0].toJavaString();
            int i = luaValueArr[1].toInt();
            Integer numGEmmrt = wYG.gEmmrt(javaString);
            Integer numAYXKKw = wYG.AYXKKw(javaString);
            Integer numAhwBna = wYG.AhwBna(javaString);
            Context contextEZpvd = EZpvd();
            if (numGEmmrt != null) {
                if (i == 1) {
                    this.KWHzl = ContextCompat.getColor(copydefault(EZpvd(), 16), numGEmmrt.intValue());
                } else if (i == 2) {
                    this.KWHzl = ContextCompat.getColor(copydefault(EZpvd(), 32), numGEmmrt.intValue());
                } else {
                    this.KWHzl = ContextCompat.getColor(copydefault(EZpvd(), 16), numGEmmrt.intValue());
                    this.copydefault = Integer.valueOf(ContextCompat.getColor(copydefault(EZpvd(), 32), numGEmmrt.intValue()));
                }
                return LuaValue.rBoolean(true);
            }
            if (numAYXKKw != null) {
                this.KWHzl = C55366xib.KWHzl(numAYXKKw.intValue(), copydefault(contextEZpvd, i == 2 ? 32 : 16));
                this.copydefault = Integer.valueOf(C55366xib.KWHzl(numAYXKKw.intValue(), copydefault(contextEZpvd, 32)));
                return LuaValue.rBoolean(true);
            }
            if (numAhwBna != null) {
                this.KWHzl = C55366xib.KWHzl(numAhwBna.intValue(), copydefault(contextEZpvd, i == 2 ? 32 : 16));
                this.copydefault = Integer.valueOf(C55366xib.KWHzl(numAhwBna.intValue(), copydefault(contextEZpvd, 32)));
                return LuaValue.rBoolean(true);
            }
        }
        return LuaValue.rBoolean(false);
    }

    public final Context copydefault(Context context, int i) {
        return (context.getResources().getConfiguration().uiMode & 48) != i ? new C55365xia(context, i) : context;
    }

    @InterfaceC60044zuT
    public LuaValue[] red(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            AYXKKw(OLrzqt(luaValueArr[0].toInt()));
            return null;
        }
        return LuaValue.rNumber(valueOf());
    }

    @InterfaceC60044zuT
    public LuaValue[] green(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            valueOf(OLrzqt(luaValueArr[0].toInt()));
            return null;
        }
        return LuaValue.rNumber(AYXKKw());
    }

    @InterfaceC60044zuT
    public LuaValue[] blue(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            KWHzl(OLrzqt(luaValueArr[0].toInt()));
            return null;
        }
        return LuaValue.rNumber(KWHzl());
    }

    private void gEmmrt(int i) {
        this.KWHzl = Color.argb(i, valueOf(), AYXKKw(), KWHzl());
    }

    public final void EZpvd(int i) {
        Integer num = this.copydefault;
        if (num != null) {
            this.copydefault = Integer.valueOf(Color.argb(i, Color.red(num.intValue()), Color.green(this.copydefault.intValue()), Color.blue(this.copydefault.intValue())));
        }
    }

    public final void AYXKKw(int i) {
        this.KWHzl = Color.argb(djBIcL(), i, AYXKKw(), KWHzl());
    }

    public final void valueOf(int i) {
        this.KWHzl = Color.argb(djBIcL(), valueOf(), i, KWHzl());
    }

    public final void KWHzl(int i) {
        this.KWHzl = Color.argb(djBIcL(), valueOf(), AYXKKw(), i);
    }

    private int djBIcL() {
        int i = this.KWHzl;
        if (i == 0) {
            return 255;
        }
        return Color.alpha(i);
    }

    public final int OLrzqt() {
        Integer num = this.copydefault;
        if (num == null || num.intValue() == 0) {
            return 255;
        }
        return Color.alpha(this.copydefault.intValue());
    }

    public final int valueOf() {
        return Color.red(this.KWHzl);
    }

    public final int AYXKKw() {
        return Color.green(this.KWHzl);
    }

    public final int KWHzl() {
        return Color.blue(this.KWHzl);
    }

    @InterfaceC60044zuT
    public LuaValue[] setHexA(LuaValue[] luaValueArr) {
        this.KWHzl = luaValueArr[0].toInt();
        gEmmrt((int) (OLrzqt(luaValueArr[1].toDouble()) * 255.0d));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setRGBA(LuaValue[] luaValueArr) {
        this.KWHzl = Color.argb((int) (OLrzqt(luaValueArr[3].toDouble()) * 255.0d), OLrzqt(luaValueArr[0].toInt()), OLrzqt(luaValueArr[1].toInt()), OLrzqt(luaValueArr[2].toInt()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAColor(LuaValue[] luaValueArr) {
        String javaString = luaValueArr[0].toJavaString();
        if (javaString == null || javaString.length() == 0) {
            throw new IllegalArgumentException("Unknown color");
        }
        String lowerCase = javaString.trim().toLowerCase();
        if (lowerCase.charAt(0) != '#') {
            return null;
        }
        this.KWHzl = Color.parseColor(lowerCase);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setColor(LuaValue[] luaValueArr) {
        this.KWHzl = C7858ark.copydefault(luaValueArr[0].toJavaString());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDarkColor(LuaValue[] luaValueArr) {
        this.copydefault = Integer.valueOf(C7858ark.copydefault(luaValueArr[0].toJavaString()));
        return null;
    }

    public JColor AEQbTJ() {
        return new JColor(this.KWHzl, gEmmrt());
    }

    public int copydefault() {
        return AEQbTJ().getColor(this.globals);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return C7858ark.AEQbTJ(this.KWHzl) + " " + C7858ark.copydefault(this.KWHzl);
    }
}
