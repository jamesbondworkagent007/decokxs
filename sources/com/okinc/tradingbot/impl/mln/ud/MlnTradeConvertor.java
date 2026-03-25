package com.okinc.tradingbot.impl.mln.ud;

import com.okinc.tradingbot.impl.mln.ud.MlnTradeConvertor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC54531xLw;
import o.C51976vxF;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class MlnTradeConvertor extends LuaUserdata<Object> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final String[] KWHzl = {"toTargetFormatted", "targetUnit"};
    public final String AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC54581xNr OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final String valueOf;

    @InterfaceC60044zuT
    public MlnTradeConvertor(long j, LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        super(j, luaValueArr);
        String javaString = null;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(null), 3, null);
        String javaString2 = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.zsXlph(luaValueArr)) == null) ? null : luaValue2.toJavaString();
        this.AEQbTJ = javaString2 == null ? "" : javaString2;
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null) {
            javaString = luaValue.toJavaString();
        }
        this.valueOf = javaString != null ? javaString : "";
        this.OLrzqt = C54589xNz.EZpvd.copydefault();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MlnTradeConvertor.AEQbTJ(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MlnTradeConvertor.valueOf(this.EZpvd);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.mln.ud.MlnTradeConvertor.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] KWHzl() {
            return MlnTradeConvertor.KWHzl;
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.mln.ud.MlnTradeConvertor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MlnTradeConvertor.this.new AnonymousClass1(continuation);
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
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                this.label = 1;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            InterfaceC54581xNr interfaceC54581xNr = MlnTradeConvertor.this.OLrzqt;
            if (interfaceC54581xNr != null) {
                String str = MlnTradeConvertor.this.valueOf;
                this.label = 2;
                obj = interfaceC54581xNr.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final C54571xNh AEQbTJ(MlnTradeConvertor mlnTradeConvertor) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNr = mlnTradeConvertor.OLrzqt;
        if (interfaceC54581xNr == null || (abstractC54531xLwOLrzqt = interfaceC54581xNr.OLrzqt(mlnTradeConvertor.valueOf)) == null) {
            return null;
        }
        return AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, mlnTradeConvertor.AEQbTJ, null, 2, null);
    }

    public final C54571xNh copydefault() {
        return (C54571xNh) this.copydefault.getValue();
    }

    public static final LuaValue[] valueOf(MlnTradeConvertor mlnTradeConvertor) {
        C54571xNh c54571xNhCopydefault = mlnTradeConvertor.copydefault();
        return LuaValue.rString(c54571xNhCopydefault != null ? c54571xNhCopydefault.OLrzqt() : null);
    }

    public final LuaValue[] AEQbTJ() {
        return (LuaValue[]) this.AYXKKw.getValue();
    }

    @InterfaceC60044zuT
    public final LuaValue[] toTargetFormatted(@NotNull LuaValue[] luaValueArr) {
        C54571xNh c54571xNhAhwBna;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String safeString$default = null;
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null) {
            javaString = "";
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        String javaString2 = luaValue2 != null ? luaValue2.toJavaString() : null;
        if (javaString2 == null) {
            javaString2 = "";
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        Integer numValueOf = luaValue3 != null ? Integer.valueOf(luaValue3.toInt()) : null;
        C54571xNh c54571xNhCopydefault = copydefault();
        if (c54571xNhCopydefault != null && (c54571xNhAhwBna = c54571xNhCopydefault.AhwBna(javaString)) != null && (c54536xMLDjBIcL = c54571xNhAhwBna.djBIcL(javaString2)) != null && (c54536xMLAEQbTJ = C51976vxF.AEQbTJ(c54536xMLDjBIcL, numValueOf)) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null);
        }
        LuaValue[] luaValueArrRString = LuaValue.rString(safeString$default);
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
        return luaValueArrRString;
    }

    @InterfaceC60044zuT
    public final LuaValue[] targetUnit(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue[] luaValueArrAEQbTJ = AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(luaValueArrAEQbTJ, "");
        return luaValueArrAEQbTJ;
    }
}
