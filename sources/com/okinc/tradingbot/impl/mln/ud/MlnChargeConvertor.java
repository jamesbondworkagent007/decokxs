package com.okinc.tradingbot.impl.mln.ud;

import com.okinc.tradingbot.impl.mln.ud.MlnChargeConvertor;
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
import o.C54589xNz;
import o.C56033xvF;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC60044zuT;
import o.xMS;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class MlnChargeConvertor extends LuaUserdata<Object> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final String[] copydefault = {"toQuoteFormatted", "quoteSymbol"};
    public final InterfaceC54581xNr AEQbTJ;
    public final String AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final String djBIcL;
    public final InterfaceC56387yDm valueOf;

    @InterfaceC60044zuT
    public MlnChargeConvertor(long j, LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        super(j, luaValueArr);
        String javaString = null;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(null), 3, null);
        String javaString2 = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.zsXlph(luaValueArr)) == null) ? null : luaValue2.toJavaString();
        this.AhwBna = javaString2 == null ? "" : javaString2;
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null) {
            javaString = luaValue.toJavaString();
        }
        this.djBIcL = javaString != null ? javaString : "";
        this.AEQbTJ = C54589xNz.EZpvd.copydefault();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MlnChargeConvertor.gEmmrt(this.EZpvd);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MlnChargeConvertor.AYXKKw(this.OLrzqt);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MlnChargeConvertor.valueOf(this.AEQbTJ);
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.mln.ud.MlnChargeConvertor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] KWHzl() {
            return MlnChargeConvertor.copydefault;
        }
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.mln.ud.MlnChargeConvertor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MlnChargeConvertor.this.new AnonymousClass1(continuation);
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
            InterfaceC54581xNr interfaceC54581xNr = MlnChargeConvertor.this.AEQbTJ;
            if (interfaceC54581xNr != null) {
                String str = MlnChargeConvertor.this.djBIcL;
                this.label = 2;
                obj = interfaceC54581xNr.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final AbstractC54531xLw AEQbTJ() {
        return (AbstractC54531xLw) this.EZpvd.getValue();
    }

    public static final AbstractC54531xLw gEmmrt(MlnChargeConvertor mlnChargeConvertor) {
        InterfaceC54581xNr interfaceC54581xNr = mlnChargeConvertor.AEQbTJ;
        if (interfaceC54581xNr != null) {
            return interfaceC54581xNr.OLrzqt(mlnChargeConvertor.djBIcL);
        }
        return null;
    }

    public static final xMS AYXKKw(MlnChargeConvertor mlnChargeConvertor) {
        AbstractC54531xLw abstractC54531xLwAEQbTJ = mlnChargeConvertor.AEQbTJ();
        if (abstractC54531xLwAEQbTJ != null) {
            return abstractC54531xLwAEQbTJ.gEmmrt(mlnChargeConvertor.AhwBna);
        }
        return null;
    }

    public final xMS OLrzqt() {
        return (xMS) this.OLrzqt.getValue();
    }

    public static final LuaValue[] valueOf(MlnChargeConvertor mlnChargeConvertor) {
        AbstractC54531xLw abstractC54531xLwAEQbTJ = mlnChargeConvertor.AEQbTJ();
        return LuaValue.rString(C56033xvF.EZpvd(abstractC54531xLwAEQbTJ != null ? abstractC54531xLwAEQbTJ.DbNXlk(mlnChargeConvertor.AhwBna) : null));
    }

    public final LuaValue[] copydefault() {
        return (LuaValue[]) this.valueOf.getValue();
    }

    @InterfaceC60044zuT
    public final LuaValue[] toQuoteFormatted(@NotNull LuaValue[] luaValueArr) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String safeString$default = null;
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null) {
            javaString = "";
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        Integer numValueOf = luaValue2 != null ? Integer.valueOf(luaValue2.toInt()) : null;
        xMS xmsOLrzqt = OLrzqt();
        if (xmsOLrzqt != null && (c54536xMLAYXKKw = xmsOLrzqt.AYXKKw(javaString)) != null && (c54536xMLAEQbTJ = C51976vxF.AEQbTJ(c54536xMLAYXKKw, numValueOf)) != null && (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
        }
        LuaValue[] luaValueArrRString = LuaValue.rString(safeString$default);
        Intrinsics.checkNotNullExpressionValue(luaValueArrRString, "");
        return luaValueArrRString;
    }

    @InterfaceC60044zuT
    public final LuaValue[] quoteSymbol(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue[] luaValueArrCopydefault = copydefault();
        Intrinsics.checkNotNullExpressionValue(luaValueArrCopydefault, "");
        return luaValueArrCopydefault;
    }
}
