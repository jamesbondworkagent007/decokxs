package com.okinc.auth.impl.passkey;

import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyAuthenticateState;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.PasskeyMlnService;
import java.util.UUID;
import kotlin.Unit;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C5983aGk;
import o.C7322ahe;
import o.InterfaceC8196ayF;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class PasskeyMlnService {
    public static final String LUA_CLASS_NAME = "PasskeyMlnService";
    private Globals globals;
    private ActivityResultLauncher<Unit> startPasskeyLauncher = null;

    public PasskeyMlnService(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void checkPasskey(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1 || !luaValueArr[0].isFunction()) {
            return;
        }
        final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        C5983aGk.EZpvd.OLrzqt(new C5983aGk.Activity() { // from class: o.aFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C5983aGk.Activity
            public final void KWHzl(PasskeyState passkeyState) {
                PasskeyMlnService.lambda$checkPasskey$0(luaFunction, passkeyState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkPasskey$0(LuaFunction luaFunction, PasskeyState passkeyState) {
        int i;
        String message = null;
        if (passkeyState instanceof PasskeyState.Success) {
            i = 0;
        } else if (passkeyState instanceof PasskeyState.Cancel) {
            i = 1;
        } else if (passkeyState instanceof PasskeyState.Fallback) {
            i = 2;
        } else if (passkeyState instanceof PasskeyState.DeviceNotCompatible) {
            i = 3;
        } else if (passkeyState instanceof PasskeyState.NotInWhiteList) {
            i = 4;
        } else if (passkeyState instanceof PasskeyState.AccountHasNoPasskey) {
            i = 5;
        } else if (passkeyState instanceof PasskeyState.RegisterError) {
            message = ((PasskeyState.RegisterError) passkeyState).getMessage();
            i = 6;
        } else if (passkeyState instanceof PasskeyState.AuthenticateError) {
            message = ((PasskeyState.AuthenticateError) passkeyState).getMessage();
            i = 7;
        } else if (passkeyState instanceof PasskeyState.CheckError) {
            message = ((PasskeyState.CheckError) passkeyState).getMessage();
            i = 8;
        } else if (passkeyState instanceof PasskeyState.IsChinaIp) {
            i = 9;
        } else if (passkeyState instanceof PasskeyState.MaximumReached) {
            i = 10;
        } else if (passkeyState instanceof PasskeyState.AccountFrozen) {
            i = 11;
        } else if (passkeyState instanceof PasskeyState.NoValidPasskey) {
            i = 12;
        } else if (passkeyState instanceof PasskeyState.RegisteredAlready) {
            i = 13;
        } else {
            i = passkeyState instanceof PasskeyState.ScreenLockDisabled ? 14 : -1;
        }
        LuaValue luaValueNil = LuaValue.Nil();
        if (i != -1) {
            luaValueNil = LuaNumber.valueOf(i);
        }
        LuaValue luaValueNil2 = LuaValue.Nil();
        if (message != null && !message.isEmpty()) {
            luaValueNil2 = LuaString.copydefault(message);
        }
        luaFunction.invoke(LuaValue.varargsOf(luaValueNil, luaValueNil2));
    }

    public Context getContext(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public void startPasskey(LuaValue[] luaValueArr) {
        ActivityResultLauncher<Unit> activityResultLauncher = this.startPasskeyLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.startPasskeyLauncher = null;
        }
        if ((luaValueArr[0].isFunction() & (luaValueArr.length >= 1)) && (getContext(this.globals) instanceof AbstractActivityC33041mov)) {
            final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) getContext(this.globals);
            InterfaceC8196ayF interfaceC8196ayF = (InterfaceC8196ayF) C43251rlk.OLrzqt(InterfaceC8196ayF.class);
            if (interfaceC8196ayF == null || abstractActivityC33041mov.getActivityResultRegistry() == null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaValue.Nil(), LuaValue.Nil(), LuaValue.Nil()));
                return;
            }
            ActivityResultLauncher<Unit> activityResultLauncherRegister = abstractActivityC33041mov.getActivityResultRegistry().register(UUID.randomUUID().toString(), interfaceC8196ayF.djBIcL(), new ActivityResultCallback() { // from class: o.aFd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    this.OLrzqt.lambda$startPasskey$1(luaFunction, (PasskeyAuthenticateState) obj);
                }
            });
            this.startPasskeyLauncher = activityResultLauncherRegister;
            activityResultLauncherRegister.launch(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPasskey$1(LuaFunction luaFunction, PasskeyAuthenticateState passkeyAuthenticateState) {
        ActivityResultLauncher<Unit> activityResultLauncher = this.startPasskeyLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.startPasskeyLauncher = null;
        }
        handleStartPasskeyResult(passkeyAuthenticateState, luaFunction);
    }

    private void handleStartPasskeyResult(PasskeyAuthenticateState passkeyAuthenticateState, LuaFunction luaFunction) {
        int i;
        String json = null;
        if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Success) {
            PasskeyAuthenticateState.Success success = (PasskeyAuthenticateState.Success) passkeyAuthenticateState;
            PasskeyAuthenticateResponse passkeyAuthenticateResponseOLrzqt = success.OLrzqt();
            if (success != null && passkeyAuthenticateResponseOLrzqt != null) {
                json = new Gson().toJson(passkeyAuthenticateResponseOLrzqt);
            }
            i = 0;
        } else if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Failure) {
            i = 1;
        } else if (passkeyAuthenticateState instanceof PasskeyAuthenticateState.Cancel) {
            i = 2;
        } else {
            i = passkeyAuthenticateState instanceof PasskeyAuthenticateState.NoValidPasskey ? 3 : -1;
        }
        LuaValue luaValueNil = LuaValue.Nil();
        if (i != -1) {
            luaValueNil = LuaNumber.valueOf(i);
        }
        LuaValue luaValueNil2 = LuaValue.Nil();
        LuaValue luaValueNil3 = LuaValue.Nil();
        if (json != null && !json.isEmpty()) {
            luaValueNil3 = LuaString.copydefault(json);
        }
        luaFunction.invoke(LuaValue.varargsOf(luaValueNil, luaValueNil3, luaValueNil2));
    }
}
