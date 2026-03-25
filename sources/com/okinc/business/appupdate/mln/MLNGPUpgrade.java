package com.okinc.business.appupdate.mln;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.appupdate.update.ExternalBrowserOpener;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractActivityC33041mov;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C7594aml;
import o.pUU;
import o.yFA;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class MLNGPUpgrade {
    public static final String LUA_CLASS_NAME = "GPUpgrade";
    private final Globals globals;
    private final LuaValue[] init;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public MLNGPUpgrade(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
        this.init = luaValueArr;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.mln.MLNGPUpgrade.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @LuaBridge
    public final LuaValue[] canOpenLink(@NotNull LuaValue[] luaValueArr) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strSafeGetJavaString$default));
            Context contextAEQbTJ = C7594aml.AEQbTJ(this.globals);
            if (contextAEQbTJ == null || (packageManager = contextAEQbTJ.getPackageManager()) == null) {
                return LuaValue.rBoolean(false);
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listQueryIntentActivities, 10));
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            pUU.KWHzl("MLNGPUpgrade", "resolvedActivities: " + arrayList);
            return LuaValue.rBoolean(!listQueryIntentActivities.isEmpty());
        } catch (Throwable unused) {
            pUU.copydefault("MLNGPUpgrade", "Invalid url: " + strSafeGetJavaString$default);
            return LuaValue.rBoolean(false);
        }
    }

    @LuaBridge
    public final LuaValue[] openExternalBrowser(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null);
        Context contextAEQbTJ = C7594aml.AEQbTJ(this.globals);
        if (contextAEQbTJ == null) {
            return null;
        }
        ExternalBrowserOpener.INSTANCE.open(contextAEQbTJ, strSafeGetJavaString$default, true);
        return null;
    }

    @LuaBridge
    public final LuaValue[] canAccessUrl(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String strSafeGetJavaString$default = C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null);
        LuaFunction luaFunctionEZpvd = C7594aml.EZpvd(luaValueArr, 1);
        Object objAEQbTJ = C7594aml.AEQbTJ(this.globals);
        if (objAEQbTJ instanceof AbstractActivityC33041mov) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) objAEQbTJ), Dispatchers.getIO(), null, new AnonymousClass1(strSafeGetJavaString$default, this, luaFunctionEZpvd, null), 2, null);
        } else if (luaFunctionEZpvd != null) {
            luaFunctionEZpvd.KWHzl(false);
        }
        return null;
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.mln.MLNGPUpgrade$canAccessUrl$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LuaFunction $callback;
        final /* synthetic */ String $url;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MLNGPUpgrade this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, MLNGPUpgrade mLNGPUpgrade, LuaFunction luaFunction, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$url = str;
            this.this$0 = mLNGPUpgrade;
            this.$callback = luaFunction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$url, this.this$0, this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$url;
                MLNGPUpgrade mLNGPUpgrade = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(MLNGPUpgrade.canAccessHost$default(mLNGPUpgrade, Uri.parse(str).getHost(), 0, 2, null)));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = boolKWHzl;
                }
                boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C02451 c02451 = new C02451(this.$callback, zBooleanValue, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c02451, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.appupdate.mln.MLNGPUpgrade$canAccessUrl$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LuaFunction $callback;
            final /* synthetic */ boolean $ret;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02451(LuaFunction luaFunction, boolean z, Continuation<? super C02451> continuation) {
                super(2, continuation);
                this.$callback = luaFunction;
                this.$ret = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02451(this.$callback, this.$ret, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LuaFunction luaFunction = this.$callback;
                    if (luaFunction != null) {
                        luaFunction.KWHzl(this.$ret);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ boolean canAccessHost$default(MLNGPUpgrade mLNGPUpgrade, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3000;
        }
        return mLNGPUpgrade.canAccessHost(str, i);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final boolean canAccessHost(String str, int i) {
        if (str == null) {
            return false;
        }
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, 443);
            Socket socket = new Socket();
            try {
                socket.connect(inetSocketAddress, i);
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(socket, null);
                pUU.KWHzl("MLNGPUpgrade", "canAccess " + str + " true");
                return true;
            } finally {
            }
        } catch (Exception e) {
            pUU.valueOf("MLNGPUpgrade", "canAccess " + str + " e=" + e);
            return false;
        }
    }
}
