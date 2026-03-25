package com.okinc.wallet.mln.service;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.wallet.mln.service.UDDexMarketManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C43248rlh;
import o.C54819xWm;
import o.gKN;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class UDDexMarketManager {
    public Globals AEQbTJ;

    public UDDexMarketManager(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.AEQbTJ = globals;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INSTANCE_OF]}, finally: {[INSTANCE_OF, CHECK_CAST, INVOKE, IF] complete} */
    @LuaBridge
    public void updateTrackerAlias(LuaValue[] luaValueArr) {
        pUU.EZpvd("UDDexMarketManager", "updateTrackerAlias: start");
        if (luaValueArr == null || luaValueArr.length < 3) {
            pUU.copydefault("UDDexMarketManager", "updateTrackerAlias: Invalid parameters");
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        LuaFunction luaFunction = luaValueArr[2].toLuaFunction();
        if (javaString == null || javaString.isEmpty()) {
            pUU.copydefault("UDDexMarketManager", "updateTrackerAlias: collectAddress is null or empty");
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaValue.rString("")));
                return;
            }
            return;
        }
        String str = javaString2 == null ? "" : javaString2;
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        try {
            try {
                if (activityAEQbTJ instanceof FragmentActivity) {
                    if (activityAEQbTJ instanceof AbstractActivityC33041mov) {
                        ((AbstractActivityC33041mov) activityAEQbTJ).showLoadingWithLogo();
                    }
                    ((gKN) C43248rlh.KWHzl.AEQbTJ(gKN.class)).AEQbTJ(activityAEQbTJ, ((FragmentActivity) activityAEQbTJ).getSupportFragmentManager(), javaString, str, new AnonymousClass2(luaFunction), new Continuation<Unit>() { // from class: com.okinc.wallet.mln.service.UDDexMarketManager.4
                        @Override // kotlin.coroutines.Continuation
                        public CoroutineContext getContext() {
                            return Dispatchers.getMain();
                        }

                        @Override // kotlin.coroutines.Continuation
                        public void resumeWith(@NotNull Object obj) {
                            pUU.KWHzl("UDDexMarketManager", "updateTrackerAlias completed successfully， result=" + obj);
                        }
                    });
                } else if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(LuaValue.rString("")));
                }
                if (!(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
                    return;
                }
            } catch (Exception e) {
                pUU.AEQbTJ("UDDexMarketManager", "updateTrackerAlias: Parameter parsing failed", e);
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.varargsOf(LuaValue.rString("")));
                }
                if (!(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
                    return;
                }
            }
            ((AbstractActivityC33041mov) activityAEQbTJ).dismissLoadingWithLogo();
        } catch (Throwable th) {
            if (activityAEQbTJ instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) activityAEQbTJ).dismissLoadingWithLogo();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDDexMarketManager$2, reason: invalid class name */
    public class AnonymousClass2 implements Function1<String, Unit> {
        public final /* synthetic */ LuaFunction OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass2(LuaFunction luaFunction) {
            this.OLrzqt = luaFunction;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Unit invoke(final String str) {
            Handler handler = new Handler(Looper.getMainLooper());
            final LuaFunction luaFunction = this.OLrzqt;
            handler.post(new Runnable() { // from class: o.yds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDDexMarketManager.AnonymousClass2.EZpvd(luaFunction, str);
                }
            });
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void EZpvd(LuaFunction luaFunction, String str) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaValue.rString(str)));
            }
        }
    }
}
