package com.okinc.mln_ui.ui.okkit;

import java.util.HashMap;
import o.C60039zuO;
import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class UDCommonBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"localizedPluralStringWithParams", "localizedStringWithParams", "localizedString", "walletEnabled", "isHitGray", "appName", "event", "eventWithItems", "monitorEvent", "formatString", "emitSenseBot", "checkHasTomorrowEvent", "toRequestPermission", "addCalendarEvent", "hasCalendarPermission", "checkHasGuessRiseAndFallEvent", "addGuessRiseAndFallCalendarEvent", "stringWithTime", "simpleDateString", "standardDateString", "simpleTimeString", "standardTimeString", "simpleTimeHMString", "simpleTimeYMDHMString", "simpleDateTimeString", "standardDateTimeString", "postEvent", "simpleYearMonthString", "standardYearMonthString", "simpleMonthDayString", "standardMonthDayString", "logDebug", "logError", "logWarning", "logInfo", "getAbTestValue", "generateCropUrl", "formatEquation", "formatAsLtr", "isUseHotLoadPacket", "getMiniAppVersion", "getCurrentMiniAppId", "getCurrentMiniAppVersion", "openTransitionGallery", "openWebViewGallery", "generateCdnUrl", "replaceCdnHost", "formattedStringFromTimestamp", "markPageAsFullDisplayed", "property"};

    public UDCommonBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDCommonBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDCommonBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDCommonBridge getJavaUserdata() {
        return (UDCommonBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] localizedPluralStringWithParams(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).localizedPluralStringWithParams(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] localizedStringWithParams(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).localizedStringWithParams(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] localizedString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).localizedString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] walletEnabled(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).walletEnabled(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isHitGray(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).isHitGray(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] appName(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).appName(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] event(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).event(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] eventWithItems(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).eventWithItems(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] monitorEvent(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).monitorEvent(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).formatString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] emitSenseBot(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).emitSenseBot((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), luaValueArr[2].toInt(), (LuaFunction) (luaValueArr.length > 3 ? luaValueArr[3] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkHasTomorrowEvent(LuaValue[] luaValueArr) throws Throwable {
        ((UDCommonBridge) this.javaUserdata).checkHasTomorrowEvent((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] toRequestPermission(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).toRequestPermission((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addCalendarEvent(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).addCalendarEvent();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] hasCalendarPermission(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).hasCalendarPermission((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkHasGuessRiseAndFallEvent(LuaValue[] luaValueArr) throws Throwable {
        ((UDCommonBridge) this.javaUserdata).checkHasGuessRiseAndFallEvent((luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) ? null : Long.valueOf((long) luaValueArr[0].toDouble()), (LuaFunction) (luaValueArr.length > 1 ? luaValueArr[1] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addGuessRiseAndFallCalendarEvent(LuaValue[] luaValueArr) throws Throwable {
        ((UDCommonBridge) this.javaUserdata).addGuessRiseAndFallCalendarEvent((luaValueArr.length <= 0 || !luaValueArr[0].isNumber()) ? null : Long.valueOf((long) luaValueArr[0].toDouble()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stringWithTime(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).stringWithTime(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleDateString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleDateString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] standardDateString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).standardDateString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleTimeString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleTimeString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] standardTimeString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).standardTimeString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleTimeHMString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleTimeHMString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleTimeYMDHMString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleTimeYMDHMString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleDateTimeString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleDateTimeString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] standardDateTimeString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).standardDateTimeString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] postEvent(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).postEvent(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleYearMonthString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleYearMonthString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] standardYearMonthString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).standardYearMonthString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleMonthDayString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).simpleMonthDayString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] standardMonthDayString(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).standardMonthDayString(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] logDebug(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).logDebug(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] logError(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).logError(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] logWarning(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).logWarning(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] logInfo(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).logInfo(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAbTestValue(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).getAbTestValue(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] generateCropUrl(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).generateCropUrl(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatEquation(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).formatEquation(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatAsLtr(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).formatAsLtr(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isUseHotLoadPacket(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).isUseHotLoadPacket(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getMiniAppVersion(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDCommonBridge) this.javaUserdata).getMiniAppVersion((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentMiniAppId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDCommonBridge) this.javaUserdata).getCurrentMiniAppId()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentMiniAppVersion(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDCommonBridge) this.javaUserdata).getCurrentMiniAppVersion()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openTransitionGallery(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).openTransitionGallery((String[]) C60039zuO.EZpvd((luaValueArr.length <= 0 || !luaValueArr[0].isTable()) ? null : luaValueArr[0].toLuaTable(), String.class), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (Object[]) C60039zuO.EZpvd((luaValueArr.length <= 3 || !luaValueArr[3].isTable()) ? null : luaValueArr[3].toLuaTable(), Object.class), (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (HashMap) C8017aul.AEQbTJ(luaValueArr[4], HashMap.class), (luaValueArr.length <= 5 || !luaValueArr[5].isString()) ? null : luaValueArr[5].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openWebViewGallery(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).openWebViewGallery((String[]) C60039zuO.EZpvd((luaValueArr.length <= 0 || !luaValueArr[0].isTable()) ? null : luaValueArr[0].toLuaTable(), String.class), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : C8017aul.AEQbTJ(luaValueArr[3], Object.class), (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (HashMap) C8017aul.AEQbTJ(luaValueArr[4], HashMap.class), (luaValueArr.length <= 5 || luaValueArr[5].isNil()) ? null : (HashMap) C8017aul.AEQbTJ(luaValueArr[5], HashMap.class), (luaValueArr.length <= 6 || !luaValueArr[6].isString()) ? null : luaValueArr[6].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] generateCdnUrl(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDCommonBridge) this.javaUserdata).generateCdnUrl((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toBoolean())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] replaceCdnHost(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDCommonBridge) this.javaUserdata).replaceCdnHost((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formattedStringFromTimestamp(LuaValue[] luaValueArr) {
        return ((UDCommonBridge) this.javaUserdata).formattedStringFromTimestamp(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] markPageAsFullDisplayed(LuaValue[] luaValueArr) {
        ((UDCommonBridge) this.javaUserdata).markPageAsFullDisplayed((luaValueArr.length <= 0 || !luaValueArr[0].isBoolean()) ? null : Boolean.valueOf(luaValueArr[0].toBoolean()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] property(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((UDCommonBridge) this.javaUserdata).property));
        }
        ((UDCommonBridge) this.javaUserdata).property = luaValueArr[0].toInt();
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return String.valueOf(this.javaUserdata);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        T t = this.javaUserdata;
        if (t != 0) {
            return t.equals(((LuaUserdata) obj).getJavaUserdata());
        }
        return ((LuaUserdata) obj).getJavaUserdata() == null;
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }
}
