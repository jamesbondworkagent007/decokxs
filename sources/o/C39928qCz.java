package o;

import com.okinc.market.search.features.main.recommend.history.data.repository.MainSearchHistoryRepository$addSearchHistory$1;
import com.okinc.market.search.features.main.recommend.history.data.repository.MainSearchHistoryRepository$clearSearchHistory$1;
import com.okinc.market.search.features.main.recommend.history.data.repository.MainSearchHistoryRepository$getSearchHistory$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39928qCz {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qCx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39928qCz.KWHzl(this.EZpvd);
        }
    });
    public final InterfaceC54577xNn KWHzl;

    @yCM
    public C39928qCz(InterfaceC54577xNn interfaceC54577xNn) {
        this.KWHzl = interfaceC54577xNn;
    }

    public final InterfaceC39924qCv AEQbTJ() {
        return (InterfaceC39924qCv) this.EZpvd.getValue();
    }

    public static final InterfaceC39924qCv KWHzl(C39928qCz c39928qCz) {
        InterfaceC54577xNn interfaceC54577xNn = c39928qCz.KWHzl;
        if (interfaceC54577xNn != null && interfaceC54577xNn.EZpvd()) {
            return new C39927qCy(new C39922qCt(), new C39925qCw(), null, 4, null);
        }
        return new qCB(new C39922qCt(), new qCD(), new C39925qCw(), null, null, null, null, 120, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) {
        MainSearchHistoryRepository$getSearchHistory$1 mainSearchHistoryRepository$getSearchHistory$1;
        C39928qCz c39928qCz;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        C39928qCz c39928qCz2;
        InterfaceC54577xNn interfaceC54577xNn;
        java.util.Iterator it;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (continuation instanceof MainSearchHistoryRepository$getSearchHistory$1) {
            mainSearchHistoryRepository$getSearchHistory$1 = (MainSearchHistoryRepository$getSearchHistory$1) continuation;
            int i = mainSearchHistoryRepository$getSearchHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchHistoryRepository$getSearchHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchHistoryRepository$getSearchHistory$1 = new MainSearchHistoryRepository$getSearchHistory$1(this, continuation);
            }
        }
        java.lang.Object obj = mainSearchHistoryRepository$getSearchHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchHistoryRepository$getSearchHistory$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn2 = this.KWHzl;
            if (interfaceC54577xNn2 != null) {
                mainSearchHistoryRepository$getSearchHistory$1.L$0 = this;
                mainSearchHistoryRepository$getSearchHistory$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, mainSearchHistoryRepository$getSearchHistory$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c39928qCz2 = this;
            } else {
                c39928qCz = this;
                interfaceC54577xNn = c39928qCz.KWHzl;
                if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                    interfaceC54581xNrOLrzqt.AxsJAY();
                }
                it = yDY.gEmmrt("SPOT", "MARGIN", "SWAP", "FUTURES", "OPTION").iterator();
                while (it.hasNext()) {
                }
                return c39928qCz.AEQbTJ().EZpvd();
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) mainSearchHistoryRepository$getSearchHistory$1.L$1;
                c39928qCz = (C39928qCz) mainSearchHistoryRepository$getSearchHistory$1.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    InterfaceC54577xNn interfaceC54577xNn3 = c39928qCz.KWHzl;
                    if (interfaceC54577xNn3 != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn3.OLrzqt()) != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt2.djBIcL(str)) != null) {
                        mainSearchHistoryRepository$getSearchHistory$1.L$0 = c39928qCz;
                        mainSearchHistoryRepository$getSearchHistory$1.L$1 = it;
                        mainSearchHistoryRepository$getSearchHistory$1.label = 2;
                        if (C55608xnE.copydefault(abstractC54531xLwDjBIcL, mainSearchHistoryRepository$getSearchHistory$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return c39928qCz.AEQbTJ().EZpvd();
            }
            c39928qCz2 = (C39928qCz) mainSearchHistoryRepository$getSearchHistory$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        c39928qCz = c39928qCz2;
        interfaceC54577xNn = c39928qCz.KWHzl;
        if (interfaceC54577xNn != null) {
            interfaceC54581xNrOLrzqt.AxsJAY();
        }
        it = yDY.gEmmrt("SPOT", "MARGIN", "SWAP", "FUTURES", "OPTION").iterator();
        while (it.hasNext()) {
        }
        return c39928qCz.AEQbTJ().EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MainSearchHistoryRepository$addSearchHistory$1 mainSearchHistoryRepository$addSearchHistory$1;
        C39928qCz c39928qCz;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof MainSearchHistoryRepository$addSearchHistory$1) {
            mainSearchHistoryRepository$addSearchHistory$1 = (MainSearchHistoryRepository$addSearchHistory$1) continuation;
            int i = mainSearchHistoryRepository$addSearchHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchHistoryRepository$addSearchHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchHistoryRepository$addSearchHistory$1 = new MainSearchHistoryRepository$addSearchHistory$1(this, continuation);
            }
        }
        MainSearchHistoryRepository$addSearchHistory$1 mainSearchHistoryRepository$addSearchHistory$12 = mainSearchHistoryRepository$addSearchHistory$1;
        java.lang.Object obj2 = mainSearchHistoryRepository$addSearchHistory$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchHistoryRepository$addSearchHistory$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
            if (interfaceC54577xNn != null) {
                mainSearchHistoryRepository$addSearchHistory$12.L$0 = this;
                mainSearchHistoryRepository$addSearchHistory$12.L$1 = obj;
                mainSearchHistoryRepository$addSearchHistory$12.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, mainSearchHistoryRepository$addSearchHistory$12, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c39928qCz = this;
            } else {
                c39928qCz = this;
                c39928qCz.AEQbTJ().KWHzl(obj);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = mainSearchHistoryRepository$addSearchHistory$12.L$1;
            c39928qCz = (C39928qCz) mainSearchHistoryRepository$addSearchHistory$12.L$0;
            C56391yDq.AEQbTJ(obj2);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj2).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        c39928qCz.AEQbTJ().KWHzl(obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MainSearchHistoryRepository$clearSearchHistory$1 mainSearchHistoryRepository$clearSearchHistory$1;
        C39928qCz c39928qCz;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        if (continuation instanceof MainSearchHistoryRepository$clearSearchHistory$1) {
            mainSearchHistoryRepository$clearSearchHistory$1 = (MainSearchHistoryRepository$clearSearchHistory$1) continuation;
            int i = mainSearchHistoryRepository$clearSearchHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mainSearchHistoryRepository$clearSearchHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                mainSearchHistoryRepository$clearSearchHistory$1 = new MainSearchHistoryRepository$clearSearchHistory$1(this, continuation);
            }
        }
        MainSearchHistoryRepository$clearSearchHistory$1 mainSearchHistoryRepository$clearSearchHistory$12 = mainSearchHistoryRepository$clearSearchHistory$1;
        java.lang.Object obj = mainSearchHistoryRepository$clearSearchHistory$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mainSearchHistoryRepository$clearSearchHistory$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
            if (interfaceC54577xNn != null) {
                mainSearchHistoryRepository$clearSearchHistory$12.L$0 = this;
                mainSearchHistoryRepository$clearSearchHistory$12.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, mainSearchHistoryRepository$clearSearchHistory$12, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c39928qCz = this;
            } else {
                c39928qCz = this;
                c39928qCz.AEQbTJ().AEQbTJ();
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39928qCz = (C39928qCz) mainSearchHistoryRepository$clearSearchHistory$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        c39928qCz.AEQbTJ().AEQbTJ();
        return Unit.INSTANCE;
    }
}
