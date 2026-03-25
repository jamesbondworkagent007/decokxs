package org.luaj.vm2;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import o.InterfaceC60044zuT;
import org.luaj.vm2.exception.InvokeError;
import org.luaj.vm2.exception.LuaTypeError;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public abstract class LuaValue {
    public static final int ERR_CLOSE_FILE_ERROR = -301;
    public static final int ERR_CREATE_DIR = -3;
    public static final int ERR_FILE_NOT_FOUND = -404;
    public static final int ERR_FUNCTION_DESTROY = -1;
    public static final int ERR_GLOBAL_DESTROY = -2;
    public static final int ERR_WRITE_FILE_ERROR = -300;
    public static final int LUA_TBOOLEAN = 1;
    public static final int LUA_TFUNCTION = 6;
    public static final int LUA_TLIGHTUSERDATA = 2;
    public static final int LUA_TNIL = 0;
    public static final int LUA_TNONE = -1;
    public static final int LUA_TNUMBER = 3;
    public static final int LUA_TSTRING = 4;
    public static final int LUA_TTABLE = 5;
    public static final int LUA_TTHREAD = 8;
    public static final int LUA_TUSERDATA = 7;
    static final String[] LUA_TYPE_NAME = {"nil", TypedValues.Custom.S_BOOLEAN, "light_userdata", DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "string", "table", "function", "userdata", "thread"};
    private static LuaValue[] _EMPTY;
    private static LuaValue[] _FALSE;
    private static LuaValue[] _NIL;
    private static LuaValue[] _TRUE;
    protected volatile boolean destroyed;

    @InterfaceC60044zuT
    long nativeGlobalKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LuaValue[] empty() {
        if (_EMPTY == null) {
            _EMPTY = new LuaValue[0];
        }
        return _EMPTY;
    }

    public static LuaValue[] varargsOf(LuaValue... luaValueArr) {
        return luaValueArr;
    }

    public void destroy() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDestroyed() {
        return this.destroyed;
    }

    public boolean isInt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public long nativeGlobalKey() {
        return this.nativeGlobalKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean notInGlobalTable() {
        long j = this.nativeGlobalKey;
        return j == 0 || j == -1;
    }

    @InterfaceC60044zuT
    public abstract int type();

    public static LuaValue Nil() {
        return LuaNil.NIL();
    }

    public static LuaValue True() {
        return LuaBoolean.TRUE();
    }

    public static LuaValue False() {
        return LuaBoolean.FALSE();
    }

    public static LuaValue[] rNil() {
        if (_NIL == null) {
            _NIL = new LuaValue[]{LuaNil.NIL()};
        }
        return _NIL;
    }

    public static LuaValue[] rTrue() {
        if (_TRUE == null) {
            _TRUE = new LuaValue[]{LuaBoolean.TRUE()};
        }
        return _TRUE;
    }

    public static LuaValue[] rFalse() {
        if (_FALSE == null) {
            _FALSE = new LuaValue[]{LuaBoolean.FALSE()};
        }
        return _FALSE;
    }

    public static LuaValue[] rBoolean(boolean z) {
        return z ? rTrue() : rFalse();
    }

    public static LuaValue[] rNumber(double d) {
        return varargsOf(LuaNumber.copydefault(d));
    }

    public static LuaValue[] rString(String str) {
        return varargsOf(LuaString.copydefault(str));
    }

    public static void destroyAllParams(LuaValue[] luaValueArr) {
        for (LuaValue luaValue : luaValueArr) {
            luaValue.destroy();
        }
    }

    public static LuaValue[] sub(LuaValue[] luaValueArr, int i) {
        int length = luaValueArr.length - i;
        if (length <= 0) {
            return null;
        }
        LuaValue[] luaValueArr2 = new LuaValue[length];
        System.arraycopy(luaValueArr, i, luaValueArr2, 0, length);
        return luaValueArr2;
    }

    public boolean isNil() {
        return type() == 0;
    }

    public boolean isBoolean() {
        return type() == 1;
    }

    public boolean isNumber() {
        return type() == 3;
    }

    public boolean isString() {
        return type() == 4;
    }

    public boolean isFunction() {
        return type() == 6;
    }

    public boolean isTable() {
        return type() == 5;
    }

    public boolean isUserdata() {
        return type() == 7 || type() == 2;
    }

    public boolean isThread() {
        return type() == 8;
    }

    public boolean toBoolean() {
        typeError(LUA_TYPE_NAME[1]);
        return false;
    }

    public int toInt() {
        typeError(LUA_TYPE_NAME[3]);
        return 0;
    }

    public double toDouble() {
        typeError(LUA_TYPE_NAME[3]);
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public long toLong() {
        return (long) toDouble();
    }

    public float toFloat() {
        return (float) toDouble();
    }

    public String toJavaString() {
        return toString();
    }

    public LuaFunction toLuaFunction() {
        typeError(LUA_TYPE_NAME[6]);
        return null;
    }

    public LuaTable toLuaTable() {
        typeError(LUA_TYPE_NAME[5]);
        return null;
    }

    public LuaUserdata toUserdata() {
        typeError(LUA_TYPE_NAME[7]);
        return null;
    }

    public LuaThread toLuaThread() {
        typeError(LUA_TYPE_NAME[8]);
        return null;
    }

    public void set(int i, LuaValue luaValue) {
        toLuaTable().set(i, luaValue);
    }

    public void set(int i, double d) {
        toLuaTable().set(i, d);
    }

    public void set(int i, boolean z) {
        toLuaTable().set(i, z);
    }

    public void set(int i, String str) {
        toLuaTable().set(i, str);
    }

    public void set(String str, LuaValue luaValue) {
        toLuaTable().set(str, luaValue);
    }

    public void set(String str, double d) {
        toLuaTable().set(str, d);
    }

    public void set(String str, boolean z) {
        toLuaTable().set(str, z);
    }

    public void set(String str, String str2) {
        toLuaTable().set(str, str2);
    }

    public LuaValue get(int i) {
        return toLuaTable().get(i);
    }

    public LuaValue get(String str) {
        return toLuaTable().get(str);
    }

    public LuaTable setMetatable() {
        return setMetatalbe(null);
    }

    public LuaTable setMetatalbe(LuaTable luaTable) {
        return toLuaTable().setMetatalbe(luaTable);
    }

    public LuaTable getMetatable() {
        return toLuaTable().getMetatable();
    }

    public LuaValue[] invoke(LuaValue[] luaValueArr, int i) throws InvokeError {
        return toLuaFunction().invoke(luaValueArr, i);
    }

    public LuaValue[] invoke(LuaValue[] luaValueArr) throws InvokeError {
        return toLuaFunction().invoke(luaValueArr);
    }

    public int dump(String str) {
        return toLuaFunction().dump(str);
    }

    public void typeError(String str) {
        throw new LuaTypeError("This value type is " + LUA_TYPE_NAME[type()] + ", cannot be cast to " + str);
    }

    public String toString() {
        return LUA_TYPE_NAME[type()] + "@" + hashCode();
    }
}
