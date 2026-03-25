package com.immomo.mls.fun.ud.view;

import android.text.TextUtils;
import java.util.Locale;
import o.C38303pTu;
import o.C55001xbh;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.pTB;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDEditTextFormatter extends LuaUserdata {
    public static final String FORMAT_TYPE_DECIMAL = "Decimal";
    public static final String FORMAT_TYPE_NORMAL = "Normal";
    public static final String FORMAT_TYPE_NUMBER = "Number";
    public static final String LUA_CLASS_NAME = "OKInputFormatter";
    public static final String[] methods = {"setFormatType", "maxLength", "shouldGroup", "totalMaxLength", "percentify", "dotString", "groupingSeparator"};
    public TaskDescription config;
    public String mFormatType;
    public int mMaxLength;
    public boolean mShouldGroup;
    public int mTotalMaxLength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.mTotalMaxLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.mFormatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.mShouldGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.mMaxLength;
    }

    @InterfaceC60044zuT
    public UDEditTextFormatter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.mFormatType = "Normal";
        this.mMaxLength = 1000;
        this.mShouldGroup = false;
        this.mTotalMaxLength = 10000;
        if (luaValueArr != null) {
            if (luaValueArr.length == 2) {
                this.mFormatType = luaValueArr[0].toJavaString();
                this.mMaxLength = luaValueArr[1].toInt();
            } else if (luaValueArr.length == 3) {
                this.mFormatType = "Decimal";
                TaskDescription taskDescription = new TaskDescription();
                this.config = taskDescription;
                taskDescription.OLrzqt = C7594aml.KWHzl(luaValueArr, 0, Integer.MAX_VALUE);
                this.config.KWHzl = C7594aml.KWHzl(luaValueArr, 1, Integer.MAX_VALUE);
                this.config.copydefault = C7594aml.KWHzl(luaValueArr, 2, Integer.MAX_VALUE);
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setFormatType(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        this.mFormatType = luaValueArr[0].toJavaString();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] maxLength(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        this.mMaxLength = luaValueArr[0].toInt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] shouldGroup(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        this.mShouldGroup = luaValueArr[0].toBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] totalMaxLength(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        this.mTotalMaxLength = luaValueArr[0].toInt();
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] percentify(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        return LuaValue.varargsOf(LuaString.copydefault(pTB.OLrzqt(luaValueArr[0].toJavaString())));
    }

    @InterfaceC60044zuT
    public LuaValue[] dotString(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(C38303pTu.EZpvd(Locale.getDefault())));
    }

    @InterfaceC60044zuT
    public LuaValue[] groupingSeparator(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(C38303pTu.AEQbTJ(Locale.getDefault())));
    }

    public void AEQbTJ(C55001xbh c55001xbh) {
        if (TextUtils.equals("Normal", KWHzl())) {
            c55001xbh.setMaxInputLength(copydefault());
            TaskDescription taskDescription = this.config;
            if (taskDescription != null) {
                taskDescription.KWHzl(c55001xbh);
            }
            c55001xbh.AuCTel();
            return;
        }
        if (TextUtils.equals("Number", KWHzl())) {
            c55001xbh.setShowThousandsSeparator(OLrzqt());
            c55001xbh.setMaxDecimalValue(0);
            c55001xbh.setMaxInputLength(EZpvd());
            TaskDescription taskDescription2 = this.config;
            if (taskDescription2 != null) {
                taskDescription2.copydefault = 0;
                taskDescription2.KWHzl(c55001xbh);
                return;
            }
            return;
        }
        if (TextUtils.equals("Decimal", KWHzl())) {
            c55001xbh.setShowThousandsSeparator(OLrzqt());
            c55001xbh.setMaxDecimalValue(copydefault());
            c55001xbh.setMaxInputLength(EZpvd());
            TaskDescription taskDescription3 = this.config;
            if (taskDescription3 != null) {
                taskDescription3.KWHzl(c55001xbh);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class TaskDescription {
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;

        private TaskDescription() {
        }

        public void KWHzl(C55001xbh c55001xbh) {
            c55001xbh.OLrzqt(this.OLrzqt, this.KWHzl, this.copydefault);
        }
    }
}
