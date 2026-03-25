package com.okinc.wallet.mln.service;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.wallet.api.WalletCefiBindingService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C33129mqd;
import o.C33490mxT;
import o.C34703nhO;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C7322ahe;
import o.C7910asj;
import o.InterfaceC54824xWr;
import o.InterfaceC60037zuM;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public final class UDWalletCeFiBindService {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final Globals KWHzl;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.mln.service.UDWalletCeFiBindService.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public UDWalletCeFiBindService(Globals globals, LuaValue[] luaValueArr) {
        this.KWHzl = globals;
    }

    public final android.app.Activity copydefault() {
        Globals globals = this.KWHzl;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }

    @LuaBridge
    public final LuaValue[] goToCeFiBind(@NotNull LuaValue[] luaValueArr) {
        WalletCefiBindingService.FragmentManager fragmentManager;
        WalletCefiBindingService.Source source;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Object objEZpvd = C7910asj.EZpvd(luaValueArr[0]);
        if (objEZpvd == null || (fragmentManager = (WalletCefiBindingService.FragmentManager) C33490mxT.EZpvd(C33490mxT.OLrzqt(objEZpvd), WalletCefiBindingService.FragmentManager.class)) == null) {
            return null;
        }
        if (C34703nhO.copydefault()) {
            source = WalletCefiBindingService.Source.WALLET;
        } else {
            source = WalletCefiBindingService.Source.NATIVE;
        }
        if (copydefault() instanceof AbstractActivityC33041mov) {
            android.app.Activity activityCopydefault = copydefault();
            Intrinsics.copydefault(activityCopydefault, "");
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activityCopydefault;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new AnonymousClass1(abstractActivityC33041mov, fragmentManager, source, null), 3, null);
        }
        return LuaValue.rNil();
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCeFiBindService$goToCeFiBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractActivityC33041mov $baseActivity;
        final /* synthetic */ WalletCefiBindingService.FragmentManager $item;
        final /* synthetic */ WalletCefiBindingService.Source $source;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager, WalletCefiBindingService.Source source, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$baseActivity = abstractActivityC33041mov;
            this.$item = fragmentManager;
            this.$source = source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$baseActivity, this.$item, this.$source, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletCefiBindingService walletCefiBindingService = (WalletCefiBindingService) C43251rlk.copydefault(WalletCefiBindingService.class);
                AbstractActivityC33041mov abstractActivityC33041mov = this.$baseActivity;
                FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                WalletCefiBindingService.FragmentManager fragmentManager = new WalletCefiBindingService.FragmentManager(this.$item.KWHzl(), this.$item.EZpvd(), this.$source, this.$item.AEQbTJ(), null, 16, null);
                this.label = 1;
                if (WalletCefiBindingService.ActionBar.startCefiBindingProcess$default(walletCefiBindingService, abstractActivityC33041mov, supportFragmentManager, fragmentManager, null, null, this, 24, null) == objCopydefault) {
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
    }

    @LuaBridge
    public final LuaValue[] getCeFiBindRequestId() {
        return LuaValue.rString(((WalletCefiBindingService) C43251rlk.copydefault(WalletCefiBindingService.class)).copydefault());
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCeFiBindService$isCeFiBindSupported$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LuaValue[]>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17541(Continuation<? super C17541> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17541(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LuaValue[]> continuation) {
            return ((C17541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletCefiBindingService walletCefiBindingService = (WalletCefiBindingService) C43251rlk.copydefault(WalletCefiBindingService.class);
                this.label = 1;
                obj = walletCefiBindingService.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return LuaValue.rBoolean(((Boolean) obj).booleanValue());
        }
    }

    @LuaBridge
    public final LuaValue[] isCeFiBindSupported() {
        return (LuaValue[]) BuildersKt__BuildersKt.runBlocking$default(null, new C17541(null), 1, null);
    }

    @LuaBridge
    public final LuaValue[] startWalletCeFiBind(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (copydefault() instanceof AbstractActivityC33041mov) {
            android.app.Activity activityCopydefault = copydefault();
            Intrinsics.copydefault(activityCopydefault, "");
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activityCopydefault;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new C17551(luaValueArr, abstractActivityC33041mov, null), 3, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletCeFiBindService$startWalletCeFiBind$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractActivityC33041mov $baseActivity;
        final /* synthetic */ LuaValue[] $values;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17551(LuaValue[] luaValueArr, AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super C17551> continuation) {
            super(2, continuation);
            this.$values = luaValueArr;
            this.$baseActivity = abstractActivityC33041mov;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17551(this.$values, this.$baseActivity, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LuaValue luaValue = this.$values[0];
                String javaString = luaValue != null ? luaValue.toJavaString() : null;
                if (javaString != null) {
                    AbstractActivityC33041mov abstractActivityC33041mov = this.$baseActivity;
                    if (C33129mqd.OLrzqt((CharSequence) javaString)) {
                        InterfaceC54824xWr interfaceC54824xWr = (InterfaceC54824xWr) C43251rlk.copydefault(InterfaceC54824xWr.class);
                        this.label = 1;
                        if (interfaceC54824xWr.EZpvd(javaString, abstractActivityC33041mov, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
