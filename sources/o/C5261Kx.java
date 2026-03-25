package o;

import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import com.amplitude.core.events.IdentifyOperation;
import com.amplitude.core.platform.intercept.IdentifyInterceptor$intercept$1;
import com.amplitude.core.platform.intercept.IdentifyInterceptor$saveIdentifyProperties$1;
import com.amplitude.core.platform.intercept.IdentifyInterceptor$scheduleTransfer$1;
import com.amplitude.core.platform.intercept.IdentifyInterceptor$transferInterceptedIdentify$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5261Kx {
    public final Logger AEQbTJ;
    public final KC AYXKKw;
    public final InterfaceC5263Kz AhwBna;
    public final C5244Kg EZpvd;
    public final AtomicBoolean KWHzl;
    public java.lang.String OLrzqt;
    public final JZ copydefault;
    public final Storage djBIcL;
    public java.lang.String gEmmrt;
    public AtomicBoolean valueOf;

    public C5261Kx(@NotNull Storage storage, @NotNull JZ jz, @NotNull Logger logger, @NotNull C5244Kg c5244Kg, @NotNull KC kc) {
        Intrinsics.checkNotNullParameter(storage, "");
        Intrinsics.checkNotNullParameter(jz, "");
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(kc, "");
        this.djBIcL = storage;
        this.copydefault = jz;
        this.AEQbTJ = logger;
        this.EZpvd = c5244Kg;
        this.AYXKKw = kc;
        this.valueOf = new AtomicBoolean(false);
        this.KWHzl = new AtomicBoolean(false);
        this.AhwBna = InterfaceC5263Kz.Companion.AEQbTJ(storage, logger, jz);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C5242Ke c5242Ke, @NotNull Continuation<? super C5242Ke> continuation) throws java.lang.Throwable {
        IdentifyInterceptor$intercept$1 identifyInterceptor$intercept$1;
        C5261Kx c5261Kx;
        C5261Kx c5261Kx2;
        if (continuation instanceof IdentifyInterceptor$intercept$1) {
            identifyInterceptor$intercept$1 = (IdentifyInterceptor$intercept$1) continuation;
            int i = identifyInterceptor$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$intercept$1 = new IdentifyInterceptor$intercept$1(this, continuation);
            }
        }
        java.lang.Object obj = identifyInterceptor$intercept$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identifyInterceptor$intercept$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.AhwBna == null) {
                return c5242Ke;
            }
            if (copydefault(c5242Ke)) {
                identifyInterceptor$intercept$1.L$0 = this;
                identifyInterceptor$intercept$1.L$1 = c5242Ke;
                identifyInterceptor$intercept$1.label = 1;
                if (copydefault(identifyInterceptor$intercept$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c5261Kx = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    c5261Kx2 = (C5261Kx) identifyInterceptor$intercept$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c5261Kx2.AEQbTJ();
                    return null;
                }
                if (i2 == 3) {
                    c5242Ke = (C5242Ke) identifyInterceptor$intercept$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return c5242Ke;
                }
                if (i2 == 4) {
                    C5242Ke c5242Ke2 = (C5242Ke) identifyInterceptor$intercept$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return c5242Ke2;
                }
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5242Ke c5242Ke3 = (C5242Ke) identifyInterceptor$intercept$1.L$0;
                C56391yDq.AEQbTJ(obj);
                return c5242Ke3;
            }
            c5242Ke = (C5242Ke) identifyInterceptor$intercept$1.L$1;
            c5261Kx = (C5261Kx) identifyInterceptor$intercept$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.String strCopydefault = c5242Ke.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "$identify")) {
            if (c5261Kx.EZpvd(c5242Ke) && !c5261Kx.OLrzqt(c5242Ke)) {
                identifyInterceptor$intercept$1.L$0 = c5261Kx;
                identifyInterceptor$intercept$1.L$1 = null;
                identifyInterceptor$intercept$1.label = 2;
                if (c5261Kx.copydefault(c5242Ke, identifyInterceptor$intercept$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5261Kx2 = c5261Kx;
                c5261Kx2.AEQbTJ();
                return null;
            }
            if (c5261Kx.AEQbTJ(c5242Ke)) {
                identifyInterceptor$intercept$1.L$0 = c5242Ke;
                identifyInterceptor$intercept$1.L$1 = null;
                identifyInterceptor$intercept$1.label = 3;
                if (c5261Kx.OLrzqt(identifyInterceptor$intercept$1) == objCopydefault) {
                    return objCopydefault;
                }
                return c5242Ke;
            }
            identifyInterceptor$intercept$1.L$0 = c5242Ke;
            identifyInterceptor$intercept$1.L$1 = null;
            identifyInterceptor$intercept$1.label = 4;
            return c5261Kx.copydefault(identifyInterceptor$intercept$1) == objCopydefault ? objCopydefault : c5242Ke;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "$groupidentify")) {
            return c5242Ke;
        }
        identifyInterceptor$intercept$1.L$0 = c5242Ke;
        identifyInterceptor$intercept$1.L$1 = null;
        identifyInterceptor$intercept$1.label = 5;
        return c5261Kx.copydefault(identifyInterceptor$intercept$1) == objCopydefault ? objCopydefault : c5242Ke;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        InterfaceC5263Kz interfaceC5263Kz = this.AhwBna;
        Intrinsics.copydefault(interfaceC5263Kz);
        java.lang.Object objOLrzqt = interfaceC5263Kz.OLrzqt(continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IdentifyInterceptor$transferInterceptedIdentify$1 identifyInterceptor$transferInterceptedIdentify$1;
        C5261Kx c5261Kx;
        if (continuation instanceof IdentifyInterceptor$transferInterceptedIdentify$1) {
            identifyInterceptor$transferInterceptedIdentify$1 = (IdentifyInterceptor$transferInterceptedIdentify$1) continuation;
            int i = identifyInterceptor$transferInterceptedIdentify$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$transferInterceptedIdentify$1.label = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$transferInterceptedIdentify$1 = new IdentifyInterceptor$transferInterceptedIdentify$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = identifyInterceptor$transferInterceptedIdentify$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identifyInterceptor$transferInterceptedIdentify$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            identifyInterceptor$transferInterceptedIdentify$1.L$0 = this;
            identifyInterceptor$transferInterceptedIdentify$1.label = 1;
            objKWHzl = KWHzl(identifyInterceptor$transferInterceptedIdentify$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c5261Kx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5261Kx = (C5261Kx) identifyInterceptor$transferInterceptedIdentify$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        C5242Ke c5242Ke = (C5242Ke) objKWHzl;
        if (c5242Ke != null) {
            c5261Kx.AYXKKw.OLrzqt(c5242Ke);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(Continuation<? super C5242Ke> continuation) {
        InterfaceC5263Kz interfaceC5263Kz = this.AhwBna;
        Intrinsics.copydefault(interfaceC5263Kz);
        return interfaceC5263Kz.KWHzl(continuation);
    }

    public final Job AEQbTJ() {
        return BuildersKt__Builders_commonKt.launch$default(this.copydefault.AYXKKw(), this.copydefault.fJNWhG(), null, new IdentifyInterceptor$scheduleTransfer$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(C5242Ke c5242Ke, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IdentifyInterceptor$saveIdentifyProperties$1 identifyInterceptor$saveIdentifyProperties$1;
        java.lang.Exception e;
        C5261Kx c5261Kx;
        if (continuation instanceof IdentifyInterceptor$saveIdentifyProperties$1) {
            identifyInterceptor$saveIdentifyProperties$1 = (IdentifyInterceptor$saveIdentifyProperties$1) continuation;
            int i = identifyInterceptor$saveIdentifyProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identifyInterceptor$saveIdentifyProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                identifyInterceptor$saveIdentifyProperties$1 = new IdentifyInterceptor$saveIdentifyProperties$1(this, continuation);
            }
        }
        java.lang.Object obj = identifyInterceptor$saveIdentifyProperties$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = identifyInterceptor$saveIdentifyProperties$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Storage storage = this.djBIcL;
                identifyInterceptor$saveIdentifyProperties$1.L$0 = this;
                identifyInterceptor$saveIdentifyProperties$1.label = 1;
                if (storage.EZpvd(c5242Ke, (Continuation<? super Unit>) identifyInterceptor$saveIdentifyProperties$1) == objCopydefault) {
                    return objCopydefault;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                c5261Kx = this;
                KY.EZpvd(e, c5261Kx.AEQbTJ, "Error when intercepting identifies");
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5261Kx = (C5261Kx) identifyInterceptor$saveIdentifyProperties$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Exception e3) {
                e = e3;
                KY.EZpvd(e, c5261Kx.AEQbTJ, "Error when intercepting identifies");
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(C5242Ke c5242Ke) {
        return AEQbTJ(c5242Ke, IdentifyOperation.CLEAR_ALL);
    }

    public final boolean EZpvd(C5242Ke c5242Ke) {
        return AEQbTJ(c5242Ke, IdentifyOperation.SET);
    }

    public final boolean AEQbTJ(C5242Ke c5242Ke, IdentifyOperation identifyOperation) {
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt = c5242Ke.OLrzqt();
        return mapOLrzqt != null && mapOLrzqt.size() == 1 && mapOLrzqt.containsKey(identifyOperation.getOperationType());
    }

    public final boolean OLrzqt(C5242Ke c5242Ke) {
        if (c5242Ke.KWHzl() != null) {
            Intrinsics.copydefault(c5242Ke.KWHzl());
            if (!r2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean copydefault(C5242Ke c5242Ke) {
        boolean z;
        if (!this.KWHzl.getAndSet(true)) {
            this.gEmmrt = c5242Ke.RcXXUw();
            this.OLrzqt = c5242Ke.ejfBZ();
            return true;
        }
        if (KWHzl(this.gEmmrt, c5242Ke.RcXXUw())) {
            this.gEmmrt = c5242Ke.RcXXUw();
            z = true;
        } else {
            z = false;
        }
        if (!KWHzl(this.OLrzqt, c5242Ke.ejfBZ())) {
            return z;
        }
        this.OLrzqt = c5242Ke.ejfBZ();
        return true;
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return false;
        }
        return str == null || str2 == null || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2);
    }
}
