package o;

import com.okinc.okuser.data.User;
import com.okinc.tradingbot.impl.planet.domain.CheckIfBotSupportedUseCase$execute$1;
import com.okinc.tradingbot.impl.planet.domain.CheckIfBotSupportedUseCase$execute$2$2;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.OrderCategory;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@yCR
public final class C53659wpf extends vNH<java.lang.String, java.lang.Boolean> {
    public final CoroutineDispatcher EZpvd;
    public java.lang.String KWHzl;
    public java.util.List<OrderCategory> OLrzqt;
    public final uLO copydefault;
    public final InterfaceC47278tmy djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53659wpf(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uLO ulo, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ulo, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = ulo;
        this.djBIcL = interfaceC47278tmy;
        this.OLrzqt = yDY.AhwBna();
        pUU.EZpvd("CheckIfBotSupportedUseCase", " is init");
    }

    /* JADX INFO: renamed from: o.wpf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53659wpf KWHzl() {
            return ((InterfaceC51009vet) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).fkESqH();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (r7.isEmpty() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114 A[Catch: all -> 0x0177, TryCatch #1 {all -> 0x0177, blocks: (B:64:0x0109, B:67:0x0110, B:69:0x0114, B:70:0x0118), top: B:109:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CheckIfBotSupportedUseCase$execute$1 checkIfBotSupportedUseCase$execute$1;
        java.lang.Throwable th;
        java.lang.String str2;
        PlanetBotMetadata planetBotMetadataKWHzl;
        InterfaceC54581xNr interfaceC54581xNrAEQbTJ;
        C53659wpf c53659wpf;
        PlanetBotMetadata planetBotMetadata;
        C53659wpf c53659wpf2;
        java.lang.Object objKWHzl;
        java.lang.Object objM7377constructorimpl;
        java.lang.String str3;
        InterfaceC54581xNr interfaceC54581xNr;
        java.util.List<OrderCategory> listAhwBna;
        MainCoroutineDispatcher main;
        CheckIfBotSupportedUseCase$execute$2$2 checkIfBotSupportedUseCase$execute$2$2;
        PlanetBotMetadata planetBotMetadata2;
        java.lang.Object objM7377constructorimpl2;
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        if (continuation instanceof CheckIfBotSupportedUseCase$execute$1) {
            checkIfBotSupportedUseCase$execute$1 = (CheckIfBotSupportedUseCase$execute$1) continuation;
            int i = checkIfBotSupportedUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIfBotSupportedUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIfBotSupportedUseCase$execute$1 = new CheckIfBotSupportedUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = checkIfBotSupportedUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkIfBotSupportedUseCase$execute$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Result.Application application = Result.Companion;
                planetBotMetadataKWHzl = PlanetBotMetadata.Companion.KWHzl(str);
                interfaceC54581xNrAEQbTJ = C56066xvm.EZpvd.AEQbTJ();
                if (interfaceC54581xNrAEQbTJ == null) {
                    return C56443yFo.KWHzl(false);
                }
                if (!this.OLrzqt.isEmpty()) {
                    java.lang.String str4 = this.KWHzl;
                    User userOLrzqt = this.djBIcL.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) (userOLrzqt != null ? userOLrzqt.getUid() : null)) && this.KWHzl != null) {
                        xOR xorCopydefault2 = interfaceC54581xNrAEQbTJ.copydefault();
                        java.util.List<OrderCategory> listAEQbTJ2 = xorCopydefault2 != null ? xorCopydefault2.AEQbTJ() : null;
                        if (listAEQbTJ2 == null) {
                            listAEQbTJ2 = yDY.AhwBna();
                        }
                    }
                }
                User userOLrzqt2 = this.djBIcL.OLrzqt();
                this.KWHzl = userOLrzqt2 != null ? userOLrzqt2.getUid() : null;
                try {
                    uLO ulo = this.copydefault;
                    Unit unit = Unit.INSTANCE;
                    checkIfBotSupportedUseCase$execute$1.L$0 = str;
                    checkIfBotSupportedUseCase$execute$1.L$1 = this;
                    checkIfBotSupportedUseCase$execute$1.L$2 = planetBotMetadataKWHzl;
                    checkIfBotSupportedUseCase$execute$1.L$3 = interfaceC54581xNrAEQbTJ;
                    checkIfBotSupportedUseCase$execute$1.L$4 = this;
                    checkIfBotSupportedUseCase$execute$1.label = 1;
                    objKWHzl = ulo.KWHzl(unit, (Continuation) checkIfBotSupportedUseCase$execute$1);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c53659wpf = this;
                    planetBotMetadata = planetBotMetadataKWHzl;
                    c53659wpf2 = c53659wpf;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    InterfaceC54581xNr interfaceC54581xNr2 = interfaceC54581xNrAEQbTJ;
                    str3 = str;
                    interfaceC54581xNr = interfaceC54581xNr2;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    listAhwBna = (java.util.List) objM7377constructorimpl;
                    if (listAhwBna == null) {
                    }
                    c53659wpf2.OLrzqt = listAhwBna;
                    main = Dispatchers.getMain();
                    checkIfBotSupportedUseCase$execute$2$2 = new CheckIfBotSupportedUseCase$execute$2$2(interfaceC54581xNr, c53659wpf, null);
                    checkIfBotSupportedUseCase$execute$1.L$0 = str3;
                    checkIfBotSupportedUseCase$execute$1.L$1 = planetBotMetadata;
                    checkIfBotSupportedUseCase$execute$1.L$2 = interfaceC54581xNr;
                    checkIfBotSupportedUseCase$execute$1.L$3 = null;
                    checkIfBotSupportedUseCase$execute$1.L$4 = null;
                    checkIfBotSupportedUseCase$execute$1.label = 2;
                    if (BuildersKt.withContext(main, checkIfBotSupportedUseCase$execute$2$2, checkIfBotSupportedUseCase$execute$1) != objCopydefault) {
                    }
                }
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c53659wpf = this;
                planetBotMetadata = planetBotMetadataKWHzl;
                c53659wpf2 = c53659wpf;
                objM7377constructorimpl = Result.m7377constructorimpl(((BotCategoryConfig) objKWHzl).getStrategy());
                InterfaceC54581xNr interfaceC54581xNr22 = interfaceC54581xNrAEQbTJ;
                str3 = str;
                interfaceC54581xNr = interfaceC54581xNr22;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                listAhwBna = (java.util.List) objM7377constructorimpl;
                if (listAhwBna == null) {
                }
                c53659wpf2.OLrzqt = listAhwBna;
                main = Dispatchers.getMain();
                checkIfBotSupportedUseCase$execute$2$2 = new CheckIfBotSupportedUseCase$execute$2$2(interfaceC54581xNr, c53659wpf, null);
                checkIfBotSupportedUseCase$execute$1.L$0 = str3;
                checkIfBotSupportedUseCase$execute$1.L$1 = planetBotMetadata;
                checkIfBotSupportedUseCase$execute$1.L$2 = interfaceC54581xNr;
                checkIfBotSupportedUseCase$execute$1.L$3 = null;
                checkIfBotSupportedUseCase$execute$1.L$4 = null;
                checkIfBotSupportedUseCase$execute$1.label = 2;
                if (BuildersKt.withContext(main, checkIfBotSupportedUseCase$execute$2$2, checkIfBotSupportedUseCase$execute$1) != objCopydefault) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                str2 = str;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str = str2;
                java.lang.Boolean bool = (java.lang.Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                pUU.KWHzl("CheckIfBotSupportedUseCase", "Bot " + str + " is supported: " + bool);
                return C56443yFo.KWHzl(bool != null ? bool.booleanValue() : false);
            }
        } else if (i2 == 1) {
            C53659wpf c53659wpf3 = (C53659wpf) checkIfBotSupportedUseCase$execute$1.L$4;
            interfaceC54581xNrAEQbTJ = (InterfaceC54581xNr) checkIfBotSupportedUseCase$execute$1.L$3;
            PlanetBotMetadata planetBotMetadata3 = (PlanetBotMetadata) checkIfBotSupportedUseCase$execute$1.L$2;
            C53659wpf c53659wpf4 = (C53659wpf) checkIfBotSupportedUseCase$execute$1.L$1;
            java.lang.String str5 = (java.lang.String) checkIfBotSupportedUseCase$execute$1.L$0;
            try {
                try {
                    C56391yDq.AEQbTJ(obj);
                    c53659wpf2 = c53659wpf3;
                    str = str5;
                    c53659wpf = c53659wpf4;
                    planetBotMetadata = planetBotMetadata3;
                    objKWHzl = obj;
                    try {
                        objM7377constructorimpl = Result.m7377constructorimpl(((BotCategoryConfig) objKWHzl).getStrategy());
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        try {
                            Result.Application application22 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        } catch (java.lang.Throwable th5) {
                            str2 = str;
                            th = th5;
                            Result.Application application32 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            str = str2;
                            java.lang.Boolean bool2 = (java.lang.Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                            pUU.KWHzl("CheckIfBotSupportedUseCase", "Bot " + str + " is supported: " + bool2);
                            return C56443yFo.KWHzl(bool2 != null ? bool2.booleanValue() : false);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    c53659wpf2 = c53659wpf3;
                    str = str5;
                    c53659wpf = c53659wpf4;
                    planetBotMetadata = planetBotMetadata3;
                    th = th6;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    InterfaceC54581xNr interfaceC54581xNr222 = interfaceC54581xNrAEQbTJ;
                    str3 = str;
                    interfaceC54581xNr = interfaceC54581xNr222;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    }
                    listAhwBna = (java.util.List) objM7377constructorimpl;
                    if (listAhwBna == null) {
                    }
                    c53659wpf2.OLrzqt = listAhwBna;
                    main = Dispatchers.getMain();
                    checkIfBotSupportedUseCase$execute$2$2 = new CheckIfBotSupportedUseCase$execute$2$2(interfaceC54581xNr, c53659wpf, null);
                    checkIfBotSupportedUseCase$execute$1.L$0 = str3;
                    checkIfBotSupportedUseCase$execute$1.L$1 = planetBotMetadata;
                    checkIfBotSupportedUseCase$execute$1.L$2 = interfaceC54581xNr;
                    checkIfBotSupportedUseCase$execute$1.L$3 = null;
                    checkIfBotSupportedUseCase$execute$1.L$4 = null;
                    checkIfBotSupportedUseCase$execute$1.label = 2;
                    if (BuildersKt.withContext(main, checkIfBotSupportedUseCase$execute$2$2, checkIfBotSupportedUseCase$execute$1) != objCopydefault) {
                    }
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                listAhwBna = (java.util.List) objM7377constructorimpl;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                c53659wpf2.OLrzqt = listAhwBna;
                main = Dispatchers.getMain();
                checkIfBotSupportedUseCase$execute$2$2 = new CheckIfBotSupportedUseCase$execute$2$2(interfaceC54581xNr, c53659wpf, null);
                checkIfBotSupportedUseCase$execute$1.L$0 = str3;
                checkIfBotSupportedUseCase$execute$1.L$1 = planetBotMetadata;
                checkIfBotSupportedUseCase$execute$1.L$2 = interfaceC54581xNr;
                checkIfBotSupportedUseCase$execute$1.L$3 = null;
                checkIfBotSupportedUseCase$execute$1.L$4 = null;
                checkIfBotSupportedUseCase$execute$1.label = 2;
                if (BuildersKt.withContext(main, checkIfBotSupportedUseCase$execute$2$2, checkIfBotSupportedUseCase$execute$1) != objCopydefault) {
                    return objCopydefault;
                }
                str2 = str3;
                planetBotMetadata2 = planetBotMetadata;
                interfaceC54581xNrAEQbTJ = interfaceC54581xNr;
                str = str2;
                planetBotMetadataKWHzl = planetBotMetadata2;
                xorCopydefault = interfaceC54581xNrAEQbTJ.copydefault();
                if (xorCopydefault != null) {
                    z = false;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = str3;
                Result.Application application322 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str = str2;
            }
            InterfaceC54581xNr interfaceC54581xNr2222 = interfaceC54581xNrAEQbTJ;
            str3 = str;
            interfaceC54581xNr = interfaceC54581xNr2222;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC54581xNr = (InterfaceC54581xNr) checkIfBotSupportedUseCase$execute$1.L$2;
            planetBotMetadata2 = (PlanetBotMetadata) checkIfBotSupportedUseCase$execute$1.L$1;
            str2 = (java.lang.String) checkIfBotSupportedUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                interfaceC54581xNrAEQbTJ = interfaceC54581xNr;
                str = str2;
                planetBotMetadataKWHzl = planetBotMetadata2;
                xorCopydefault = interfaceC54581xNrAEQbTJ.copydefault();
                if (xorCopydefault != null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null || listAEQbTJ.isEmpty()) {
                    z = false;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                } else {
                    java.util.Iterator<T> it = listAEQbTJ.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) it.next()).getStrategyType(), (java.lang.Object) planetBotMetadataKWHzl.OLrzqt())) {
                            break;
                        }
                    }
                    z = false;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                Result.Application application3222 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                str = str2;
            }
        }
        java.lang.Boolean bool22 = (java.lang.Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
        pUU.KWHzl("CheckIfBotSupportedUseCase", "Bot " + str + " is supported: " + bool22);
        return C56443yFo.KWHzl(bool22 != null ? bool22.booleanValue() : false);
    }
}
