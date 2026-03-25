package com.okinc.mln_ui.ui.okkit;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.ibm.icu.text.DateFormat;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.view.gallery.image.GalleryImageSource;
import com.okinc.components.track.ABTestManager;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C33069mpW;
import o.C33070mpX;
import o.C33518mxv;
import o.C35202nqq;
import o.C43047rhs;
import o.C43084ric;
import o.C43148rjn;
import o.C43154rjt;
import o.C43156rjv;
import o.C43157rjw;
import o.C43160rjz;
import o.C43246rlf;
import o.C55297xhL;
import o.C7322ahe;
import o.C7326ahi;
import o.C7328ahk;
import o.C7594aml;
import o.C7788aqT;
import o.C7827arF;
import o.C7865arr;
import o.C7910asj;
import o.C7916asp;
import o.pSC;
import o.pTA;
import o.pTF;
import o.pUU;
import o.rVN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDCommonBridge {
    public static final String LOG_TAG = "MLN_LOG";
    public static final String LUA_CLASS_NAME = "OKCommonBridge";
    public static final String SHARE_INVITER_REWARD = "share_inviter_reward";
    public static final String STRING = "string";
    public Globals globals;
    public Context mContext;
    public String mPackageName;
    public Resources mResources;

    @LuaBridge
    public int property;

    @LuaBridge
    public void emitSenseBot(String str, String str2, int i, LuaFunction luaFunction) {
    }

    @LuaBridge
    public LuaValue[] logDebug(LuaValue[] luaValueArr) {
        return null;
    }

    public UDCommonBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.mContext = null;
        this.mResources = null;
        this.mPackageName = "com.okinc.okex";
        this.globals = globals;
        Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        this.mContext = applicationValueOf;
        this.mResources = applicationValueOf.getResources();
        this.mPackageName = this.mContext.getPackageName();
    }

    public Context AEQbTJ(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] localizedPluralStringWithParams(LuaValue[] luaValueArr) {
        Map<Object, ? extends Object> mapAEQbTJ;
        if (luaValueArr == null || (luaValueArr.length != 2 && luaValueArr.length != 3)) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        int i = luaValueArr[1].toInt();
        if (luaValueArr.length == 3) {
            LuaValue luaValue = luaValueArr[2];
            mapAEQbTJ = luaValue instanceof LuaTable ? C7910asj.AEQbTJ((LuaTable) luaValue) : null;
        }
        String strKWHzl = pSC.AEQbTJ.KWHzl(javaString, i, mapAEQbTJ);
        return strKWHzl == null ? LuaValue.rNil() : LuaValue.rString(strKWHzl);
    }

    @LuaBridge
    public LuaValue[] localizedStringWithParams(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString;
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            try {
                javaString = OLrzqt(luaValue2.toJavaString());
            } catch (Exception unused) {
                javaString = luaValueArr[0].toJavaString();
            }
            return javaString == null ? LuaValue.rNil() : LuaValue.rString(javaString);
        }
        String strOLrzqt = null;
        if (luaValueArr == null || luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        try {
            strOLrzqt = OLrzqt(luaValue.toJavaString());
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strOLrzqt)) {
            return LuaValue.rNil();
        }
        LuaValue luaValue3 = luaValueArr[1];
        if (luaValue3 instanceof LuaTable) {
            Map mapAEQbTJ = C7910asj.AEQbTJ((LuaTable) luaValue3);
            luaValueArr[1].destroy();
            strOLrzqt = C33069mpW.OLrzqt(strOLrzqt, mapAEQbTJ);
        }
        return strOLrzqt == null ? LuaValue.rNil() : LuaValue.rString(strOLrzqt);
    }

    public final String OLrzqt(String str) {
        int identifier;
        String strKWHzl = pSC.AEQbTJ.KWHzl(str, new Object[0]);
        return (!TextUtils.isEmpty(strKWHzl) || (identifier = this.mResources.getIdentifier(str, "string", this.mPackageName)) <= 0) ? strKWHzl : C33070mpX.AYXKKw(identifier);
    }

    @LuaBridge
    public LuaValue[] localizedString(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String string;
        LuaValue luaValue2;
        String javaString;
        int identifier;
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            try {
                String javaString2 = luaValue2.toJavaString();
                javaString = pSC.AEQbTJ.KWHzl(javaString2, new Object[0]);
                if (TextUtils.isEmpty(javaString) && (identifier = this.mResources.getIdentifier(javaString2, "string", this.mPackageName)) > 0) {
                    javaString = this.mResources.getString(identifier);
                }
            } catch (Exception unused) {
                javaString = luaValueArr[0].toJavaString();
            }
            if (javaString == null) {
                return LuaValue.rNil();
            }
            return LuaValue.rString(javaString);
        }
        String strKWHzl = null;
        if (luaValueArr == null || luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        try {
            String javaString3 = luaValue.toJavaString();
            strKWHzl = pSC.AEQbTJ.KWHzl(javaString3, new Object[0]);
            if (TextUtils.isEmpty(strKWHzl)) {
                LuaValue luaValue3 = luaValueArr[1];
                if (luaValue3 instanceof LuaTable) {
                    List listCopydefault = C7910asj.copydefault((LuaTable) luaValue3);
                    int identifier2 = this.mResources.getIdentifier(javaString3, "string", this.mPackageName);
                    luaValueArr[1].destroy();
                    string = this.mResources.getString(identifier2, listCopydefault.toArray());
                } else {
                    string = this.mResources.getString(this.mResources.getIdentifier(javaString3, "string", this.mPackageName));
                }
            } else {
                LuaValue luaValue4 = luaValueArr[1];
                if (luaValue4 instanceof LuaTable) {
                    List listCopydefault2 = C7910asj.copydefault((LuaTable) luaValue4);
                    luaValueArr[1].destroy();
                    string = String.format(strKWHzl, listCopydefault2.toArray());
                } else {
                    string = String.format(strKWHzl, luaValue4.toJavaString());
                }
            }
        } catch (Exception unused2) {
            string = strKWHzl;
        }
        if (string == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(string);
    }

    @LuaBridge
    public LuaValue[] walletEnabled(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(true);
    }

    @LuaBridge
    public LuaValue[] isHitGray(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            if (C35202nqq.OLrzqt.AEQbTJ(luaValue.toJavaString())) {
                return LuaValue.rBoolean(true);
            }
            return LuaValue.rBoolean(false);
        }
        return LuaValue.rBoolean(false);
    }

    @LuaBridge
    public LuaValue[] appName(LuaValue[] luaValueArr) {
        return LuaValue.rString(C43246rlf.OLrzqt.valueOf().getString(C43084ric.Activity.EZpvd));
    }

    @LuaBridge
    public void event(LuaValue[] luaValueArr) {
        C43154rjt.OLrzqt.OLrzqt(luaValueArr[0].toJavaString());
    }

    @LuaBridge
    public void eventWithItems(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length != 2 || luaValueArr[0] == null || (luaValue = luaValueArr[1]) == null) {
            return;
        }
        C43154rjt.OLrzqt.copydefault(luaValueArr[0].toJavaString(), (HashMap<String, HashMap<String, Object>>) C7916asp.OLrzqt((LuaTable) luaValue));
    }

    @LuaBridge
    public void monitorEvent(LuaValue[] luaValueArr) {
        Globals globals;
        C7322ahe c7322ahe;
        C7328ahk c7328ahk;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        if (luaValueArr == null || luaValueArr.length == 0) {
            return;
        }
        LuaValue luaValue4 = luaValueArr[0];
        String javaString = "";
        String javaString2 = luaValue4 != null ? luaValue4.toJavaString() : "";
        HashMap map = (luaValueArr.length <= 1 || (luaValue3 = luaValueArr[1]) == null) ? null : (HashMap) C7916asp.OLrzqt((LuaTable) luaValue3);
        String javaString3 = (luaValueArr.length <= 2 || (luaValue2 = luaValueArr[2]) == null) ? "" : luaValue2.toJavaString();
        if (luaValueArr.length > 3 && (luaValue = luaValueArr[3]) != null) {
            javaString = luaValue.toJavaString();
        }
        if (TextUtils.isEmpty(javaString2) || (globals = this.globals) == null || (c7322ahe = (C7322ahe) globals.AuCTel()) == null || (c7328ahk = c7322ahe.copydefault) == null) {
            return;
        }
        c7328ahk.EZpvd(javaString2, javaString3, javaString, map);
    }

    @LuaBridge
    public LuaValue[] formatString(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null) {
            return LuaValue.varargsOf(LuaValue.rString(String.format(luaValue.toJavaString().replaceAll("%@", "%s"), C7910asj.copydefault((LuaTable) luaValueArr[1]).toArray())));
        }
        return LuaValue.rString(String.format("", ""));
    }

    @LuaBridge
    public void checkHasTomorrowEvent(LuaFunction luaFunction) throws Throwable {
        if (luaFunction != null) {
            C43157rjw.copydefault.copydefault(AEQbTJ(this.globals), luaFunction);
        }
    }

    @LuaBridge
    public void toRequestPermission(LuaFunction luaFunction) {
        C43157rjw.copydefault.KWHzl(AEQbTJ(this.globals), luaFunction);
    }

    @LuaBridge
    public void addCalendarEvent() {
        C43157rjw.copydefault.AEQbTJ(AEQbTJ(this.globals));
    }

    @LuaBridge
    public void hasCalendarPermission(LuaFunction luaFunction) {
        C43157rjw.copydefault.OLrzqt(AEQbTJ(this.globals), luaFunction);
    }

    @LuaBridge
    public void checkHasGuessRiseAndFallEvent(Long l, LuaFunction luaFunction) throws Throwable {
        C43157rjw.copydefault.EZpvd(AEQbTJ(this.globals), l.longValue(), luaFunction);
    }

    @LuaBridge
    public void addGuessRiseAndFallCalendarEvent(Long l) throws Throwable {
        C43157rjw.copydefault.OLrzqt(AEQbTJ(this.globals), l.longValue());
    }

    @LuaBridge
    public LuaValue[] stringWithTime(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 5) {
            Long lValueOf = Long.valueOf(KWHzl(luaValueArr[0]).longValue() * 1000);
            int iAEQbTJ = AEQbTJ(luaValueArr[1]);
            int iAEQbTJ2 = AEQbTJ(luaValueArr[2]);
            int iAEQbTJ3 = AEQbTJ(luaValueArr[3]);
            int iAEQbTJ4 = AEQbTJ(luaValueArr[4]);
            if (lValueOf != null && lValueOf.longValue() >= 0 && iAEQbTJ >= 0 && iAEQbTJ2 >= 0 && iAEQbTJ3 >= 0 && iAEQbTJ4 >= 0) {
                return LuaValue.rString(pTA.KWHzl(new Date(lValueOf.longValue()), iAEQbTJ, iAEQbTJ2, iAEQbTJ3, iAEQbTJ4));
            }
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] simpleDateString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.AEQbTJ(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] standardDateString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.KWHzl(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] simpleTimeString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] standardTimeString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.AYXKKw(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] simpleTimeHMString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.EZpvd(new Date(lOLrzqt.longValue()), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, Locale.getDefault()));
    }

    @LuaBridge
    public LuaValue[] simpleTimeYMDHMString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, Locale.getDefault()));
    }

    @LuaBridge
    public LuaValue[] simpleDateTimeString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.EZpvd(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] standardDateTimeString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.OLrzqt(new Date(lOLrzqt.longValue())));
    }

    @LuaBridge
    public LuaValue[] postEvent(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        RxBus.KWHzl(luaValueArr[0].toJavaString());
        return null;
    }

    @LuaBridge
    public LuaValue[] simpleYearMonthString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE_YM));
    }

    @LuaBridge
    public LuaValue[] standardYearMonthString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_STANDARD_YM));
    }

    @LuaBridge
    public LuaValue[] simpleMonthDayString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE_MD));
    }

    @LuaBridge
    public LuaValue[] standardMonthDayString(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_STANDARD_MD));
    }

    @LuaBridge
    public LuaValue[] logError(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        pUU.copydefault(LOG_TAG, luaValueArr[0].toJavaString());
        return null;
    }

    @LuaBridge
    public LuaValue[] logWarning(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        pUU.valueOf(LOG_TAG, luaValueArr[0].toJavaString());
        return null;
    }

    @LuaBridge
    public LuaValue[] logInfo(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        pUU.KWHzl(LOG_TAG, luaValueArr[0].toJavaString());
        return null;
    }

    public final Long OLrzqt(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        return Long.valueOf(KWHzl(luaValueArr[0]).longValue() * 1000);
    }

    public final Long KWHzl(LuaValue luaValue) {
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        return Long.valueOf(luaValue.toLong());
    }

    public final int AEQbTJ(LuaValue luaValue) {
        if (luaValue == null || !luaValue.isNumber()) {
            return -1;
        }
        return luaValue.toInt();
    }

    @LuaBridge
    public LuaValue[] getAbTestValue(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            return LuaValue.rString(ABTestManager.AEQbTJ.OLrzqt(luaValue.toJavaString()));
        }
        return LuaValue.rString("");
    }

    @LuaBridge
    public LuaValue[] generateCropUrl(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 4) {
            int i = 0;
            String javaString = luaValueArr[0].toJavaString();
            String javaString2 = luaValueArr[1].toJavaString();
            int i2 = luaValueArr[2].toInt();
            int i3 = luaValueArr[3].toInt();
            String str = "lfit";
            if (i2 <= 0) {
                i2 = 0;
                javaString2 = "lfit";
            }
            if (i3 > 0) {
                i = i3;
                str = javaString2;
            }
            return LuaValue.rString(C55297xhL.KWHzl(javaString, str, C7865arr.copydefault(i2), C7865arr.copydefault(i)));
        }
        return LuaValue.rString("");
    }

    @LuaBridge
    public LuaValue[] formatEquation(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            return LuaValue.rString(pTF.KWHzl.EZpvd(luaValue.toJavaString()));
        }
        return LuaValue.rString("");
    }

    @LuaBridge
    public LuaValue[] formatAsLtr(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            return LuaValue.rString(pTF.KWHzl.AEQbTJ(luaValue.toJavaString()));
        }
        return LuaValue.rString("");
    }

    @LuaBridge
    public LuaValue[] isUseHotLoadPacket(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (C7788aqT.AEQbTJ().values()) {
            return LuaValue.rBoolean(true);
        }
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null && !TextUtils.isEmpty(luaValue.toJavaString())) {
            return LuaValue.rBoolean(C43047rhs.AEQbTJ.OLrzqt().EZpvd(luaValueArr[0].toJavaString()));
        }
        return LuaValue.rBoolean(C7788aqT.AEQbTJ().values());
    }

    @LuaBridge
    public String getMiniAppVersion(String str) {
        if ("oklua".equals(str)) {
            return C7326ahi.gEmmrt();
        }
        return C43047rhs.AEQbTJ.valueOf(str).OLrzqt();
    }

    @LuaBridge
    public String getCurrentMiniAppId() {
        String strCopydefault = C7594aml.copydefault(this.globals);
        return "universal".equals(strCopydefault) ? "oklua" : strCopydefault;
    }

    @LuaBridge
    public String getCurrentMiniAppVersion() {
        return getMiniAppVersion(getCurrentMiniAppId());
    }

    @LuaBridge
    public void openTransitionGallery(String[] strArr, int i, String str, Object[] objArr, HashMap<String, Object> map, String str2) {
        FragmentActivity fragmentActivityAEQbTJ = C43148rjn.AEQbTJ(this.globals);
        if (fragmentActivityAEQbTJ == null) {
            return;
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        Object[] objArr2 = objArr;
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str3 : strArr) {
                if (str3 != null) {
                    String strTrim = str3.trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
            }
        }
        int iMax = Math.max(arrayList.size(), objArr2.length);
        if (iMax == 0) {
            return;
        }
        ArrayList<GalleryImageSource> arrayList2 = new ArrayList<>(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            if (i2 < arrayList.size()) {
                arrayList2.add(GalleryImageSource.Companion.copydefault((String) arrayList.get(i2)));
            } else {
                arrayList2.add(GalleryImageSource.Companion.copydefault(""));
            }
        }
        int iMax2 = Math.max(0, Math.min(i, iMax - 1));
        if (TextUtils.isEmpty(str)) {
            str = "mln";
        }
        C43160rjz.KWHzl.EZpvd(fragmentActivityAEQbTJ, str, arrayList2, iMax2, objArr2, map);
    }

    @LuaBridge
    public void openWebViewGallery(String[] strArr, int i, String str, Object obj, HashMap<String, Object> map, HashMap<String, Object> map2, String str2) {
        FragmentActivity fragmentActivity = (FragmentActivity) AEQbTJ(this.globals);
        if (fragmentActivity == null || strArr == null || strArr.length == 0) {
            return;
        }
        int length = strArr.length;
        RectF[] rectFArr = new RectF[length];
        try {
            float fEZpvd = C33518mxv.EZpvd(fragmentActivity, EZpvd(map.get("x")));
            float fEZpvd2 = C33518mxv.EZpvd(fragmentActivity, EZpvd(map.get(DateFormat.YEAR)));
            rectFArr[Math.max(0, Math.min(i, length - 1))] = new RectF(fEZpvd, fEZpvd2, C33518mxv.EZpvd(fragmentActivity, EZpvd(map.get("width"))) + fEZpvd, C33518mxv.EZpvd(fragmentActivity, EZpvd(map.get("height"))) + fEZpvd2);
        } catch (Throwable unused) {
        }
        ArrayList<GalleryImageSource> arrayList = new ArrayList<>(strArr.length);
        for (String str3 : strArr) {
            arrayList.add(GalleryImageSource.Companion.copydefault(str3));
        }
        C43160rjz.KWHzl.KWHzl(fragmentActivity, str, arrayList, i, rectFArr, map2);
    }

    public static float EZpvd(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Throwable unused) {
            }
        }
        return 0.0f;
    }

    @LuaBridge
    public String generateCdnUrl(String str, boolean z) {
        return C7827arF.EZpvd(str, AEQbTJ(this.globals), z);
    }

    @LuaBridge
    public String replaceCdnHost(String str) {
        return C7827arF.EZpvd(str);
    }

    @LuaBridge
    public LuaValue[] formattedStringFromTimestamp(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length >= 6) {
            Long lKWHzl = KWHzl(luaValueArr[0]);
            if (lKWHzl == null) {
                return LuaValue.rNil();
            }
            String strAEQbTJ = C43156rjv.AEQbTJ(lKWHzl.longValue(), luaValueArr[1].toBoolean(), AEQbTJ(luaValueArr[2]), AEQbTJ(luaValueArr[3]), AEQbTJ(luaValueArr[4]), AEQbTJ(luaValueArr[5]), (luaValueArr.length < 7 || (luaValue = luaValueArr[6]) == null || TextUtils.isEmpty(luaValue.toJavaString())) ? null : luaValueArr[6].toJavaString());
            if (strAEQbTJ != null) {
                return LuaValue.rString(strAEQbTJ);
            }
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public void markPageAsFullDisplayed(Boolean bool) {
        String strOLrzqt = C43148rjn.OLrzqt(this.globals);
        FragmentActivity fragmentActivityAEQbTJ = C43148rjn.AEQbTJ(this.globals);
        if (fragmentActivityAEQbTJ == null) {
            return;
        }
        pUU.EZpvd("Monitor.APM", "Lua.TTFD[" + bool + "]=" + strOLrzqt + "->" + fragmentActivityAEQbTJ);
        rVN.AEQbTJ(fragmentActivityAEQbTJ, bool.booleanValue(), strOLrzqt);
    }
}
