package com.okinc.auth.impl.passkey;

import android.content.Context;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import java.util.UUID;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C7322ahe;
import o.InterfaceC8197ayG;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class MfaMlnService {
    public static final String LUA_CLASS_NAME = "MfaMlnService";
    private Globals globals;
    private ActivityResultLauncher<String> startMfaForResultLauncher = null;
    private LuaFunction mMfaCallback = null;

    public MfaMlnService(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public Context getContext(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public void __onLuaGc() {
        LuaFunction luaFunction = this.mMfaCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.mMfaCallback = null;
        }
    }

    @LuaBridge
    public void startMFAWithSessionId(LuaValue[] luaValueArr) {
        ActivityResultLauncher<String> activityResultLauncher = this.startMfaForResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.startMfaForResultLauncher = null;
        }
        if (((luaValueArr.length >= 2) & luaValueArr[0].isString() & luaValueArr[1].isFunction()) && (getContext(this.globals) instanceof AbstractActivityC33041mov)) {
            String javaString = luaValueArr[0].toJavaString();
            this.mMfaCallback = luaValueArr[1].toLuaFunction();
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) getContext(this.globals);
            InterfaceC8197ayG interfaceC8197ayG = (InterfaceC8197ayG) C43251rlk.OLrzqt(InterfaceC8197ayG.class);
            if (interfaceC8197ayG == null || abstractActivityC33041mov.getActivityResultRegistry() == null) {
                this.mMfaCallback.invoke(LuaValue.varargsOf(LuaValue.Nil()));
                return;
            }
            ActivityResultLauncher<String> activityResultLauncherRegister = abstractActivityC33041mov.getActivityResultRegistry().register(UUID.randomUUID().toString(), interfaceC8197ayG.copydefault(null), new ActivityResultCallback() { // from class: o.aEX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    this.KWHzl.lambda$startMFAWithSessionId$0((MfaServiceResult) obj);
                }
            });
            this.startMfaForResultLauncher = activityResultLauncherRegister;
            activityResultLauncherRegister.launch(javaString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMFAWithSessionId$0(MfaServiceResult mfaServiceResult) {
        ActivityResultLauncher<String> activityResultLauncher = this.startMfaForResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.startMfaForResultLauncher = null;
        }
        handleMfaResult(mfaServiceResult);
    }

    private void handleMfaResult(MfaServiceResult mfaServiceResult) {
        int i;
        MfaState mfaState = mfaServiceResult.getMfaState();
        if (mfaState instanceof MfaState.Success) {
            i = 0;
        } else if (mfaState instanceof MfaState.Failure) {
            i = 1;
        } else if (mfaState instanceof MfaState.Close) {
            i = 2;
        } else {
            i = mfaState instanceof MfaState.TicketCreated ? 3 : -1;
        }
        LuaValue luaValueNil = LuaValue.Nil();
        if (i != -1) {
            luaValueNil = LuaNumber.valueOf(i);
        }
        LuaFunction luaFunction = this.mMfaCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(luaValueNil));
        }
    }
}
