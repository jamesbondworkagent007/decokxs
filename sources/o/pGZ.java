package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.db.KlineEventCalendarDatabase;
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$addCalendarEvent$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$clearCalendarEvents$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$deleteCalendarEvent$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$deleteEventById$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$deleteEventByIds$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$getAllEvents$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$getEventCalendarById$1;
import com.okinc.kline.viewmodel.KlineEventCalendarViewModel$insertEventCalendar$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35966oKh;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pGZ extends AndroidViewModel {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(boolean z) {
        return z ? "okx://lite/main" : "okx://app/main";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pGZ(@NotNull final android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = "KlineEventCalendarViewModel";
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pGZ.OLrzqt(application);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pGZ.KWHzl(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.pHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pGZ.EZpvd(application);
            }
        });
    }

    public static final KlineEventCalendarDatabase OLrzqt(android.app.Application application) {
        return KlineEventCalendarDatabase.Companion.OLrzqt(application);
    }

    public final KlineEventCalendarDatabase KWHzl() {
        return (KlineEventCalendarDatabase) this.OLrzqt.getValue();
    }

    public static final mJB KWHzl(pGZ pgz) {
        return pgz.KWHzl().copydefault();
    }

    public final mJB copydefault() {
        return (mJB) this.AEQbTJ.getValue();
    }

    public static final pFV EZpvd(android.app.Application application) {
        return new pFV(application);
    }

    public final pFV OLrzqt() {
        return (pFV) this.EZpvd.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        KlineEventCalendarViewModel$addCalendarEvent$1 klineEventCalendarViewModel$addCalendarEvent$1;
        java.lang.String str4;
        long j2;
        java.lang.Object objInsertCalendarEvent$default;
        pGZ pgz;
        if (continuation instanceof KlineEventCalendarViewModel$addCalendarEvent$1) {
            klineEventCalendarViewModel$addCalendarEvent$1 = (KlineEventCalendarViewModel$addCalendarEvent$1) continuation;
            int i = klineEventCalendarViewModel$addCalendarEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineEventCalendarViewModel$addCalendarEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                klineEventCalendarViewModel$addCalendarEvent$1 = new KlineEventCalendarViewModel$addCalendarEvent$1(this, continuation);
            }
        }
        KlineEventCalendarViewModel$addCalendarEvent$1 klineEventCalendarViewModel$addCalendarEvent$12 = klineEventCalendarViewModel$addCalendarEvent$1;
        java.lang.Object obj = klineEventCalendarViewModel$addCalendarEvent$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineEventCalendarViewModel$addCalendarEvent$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pFV pfvOLrzqt = OLrzqt();
            klineEventCalendarViewModel$addCalendarEvent$12.L$0 = this;
            str4 = str;
            klineEventCalendarViewModel$addCalendarEvent$12.L$1 = str4;
            j2 = j;
            klineEventCalendarViewModel$addCalendarEvent$12.J$0 = j2;
            klineEventCalendarViewModel$addCalendarEvent$12.label = 1;
            objInsertCalendarEvent$default = pFV.insertCalendarEvent$default(pfvOLrzqt, str2, str3, j, 0, klineEventCalendarViewModel$addCalendarEvent$12, 8, null);
            if (objInsertCalendarEvent$default == objCopydefault) {
                return objCopydefault;
            }
            pgz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = klineEventCalendarViewModel$addCalendarEvent$12.J$0;
            java.lang.String str5 = (java.lang.String) klineEventCalendarViewModel$addCalendarEvent$12.L$1;
            pgz = (pGZ) klineEventCalendarViewModel$addCalendarEvent$12.L$0;
            C56391yDq.AEQbTJ(obj);
            j2 = j3;
            objInsertCalendarEvent$default = obj;
            str4 = str5;
        }
        java.lang.Long l = (java.lang.Long) objInsertCalendarEvent$default;
        if (l != null) {
            pgz.KWHzl(str4, l.longValue(), j2);
            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C35966oKh.TaskDescription.values), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            pDD.AEQbTJ();
        } else {
            pUU.copydefault(pgz.copydefault, "addCalendarEvent: eventId 为空");
        }
        return l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        KlineEventCalendarViewModel$deleteCalendarEvent$1 klineEventCalendarViewModel$deleteCalendarEvent$1;
        pGZ pgz;
        if (continuation instanceof KlineEventCalendarViewModel$deleteCalendarEvent$1) {
            klineEventCalendarViewModel$deleteCalendarEvent$1 = (KlineEventCalendarViewModel$deleteCalendarEvent$1) continuation;
            int i = klineEventCalendarViewModel$deleteCalendarEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineEventCalendarViewModel$deleteCalendarEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                klineEventCalendarViewModel$deleteCalendarEvent$1 = new KlineEventCalendarViewModel$deleteCalendarEvent$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = klineEventCalendarViewModel$deleteCalendarEvent$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = klineEventCalendarViewModel$deleteCalendarEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pFV pfvOLrzqt = OLrzqt();
            klineEventCalendarViewModel$deleteCalendarEvent$1.L$0 = this;
            klineEventCalendarViewModel$deleteCalendarEvent$1.L$1 = str;
            klineEventCalendarViewModel$deleteCalendarEvent$1.label = 1;
            objCopydefault = pfvOLrzqt.copydefault(j, klineEventCalendarViewModel$deleteCalendarEvent$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            pgz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) klineEventCalendarViewModel$deleteCalendarEvent$1.L$1;
            pgz = (pGZ) klineEventCalendarViewModel$deleteCalendarEvent$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        if (zBooleanValue) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(C35966oKh.TaskDescription.DbNXlk), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            pgz.copydefault(str);
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public final void EZpvd(@NotNull KlineEventCalendarEntity klineEventCalendarEntity) {
        Intrinsics.checkNotNullParameter(klineEventCalendarEntity, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineEventCalendarViewModel$insertEventCalendar$1(this, klineEventCalendarEntity, null), 3, null);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineEventCalendarViewModel$deleteEventById$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        KlineEventCalendarViewModel$deleteEventByIds$1 klineEventCalendarViewModel$deleteEventByIds$1;
        java.lang.Throwable th;
        pGZ pgz;
        if (continuation instanceof KlineEventCalendarViewModel$deleteEventByIds$1) {
            klineEventCalendarViewModel$deleteEventByIds$1 = (KlineEventCalendarViewModel$deleteEventByIds$1) continuation;
            int i = klineEventCalendarViewModel$deleteEventByIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineEventCalendarViewModel$deleteEventByIds$1.label = i - Integer.MIN_VALUE;
            } else {
                klineEventCalendarViewModel$deleteEventByIds$1 = new KlineEventCalendarViewModel$deleteEventByIds$1(this, continuation);
            }
        }
        java.lang.Object obj = klineEventCalendarViewModel$deleteEventByIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineEventCalendarViewModel$deleteEventByIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                mJB mjbCopydefault = copydefault();
                klineEventCalendarViewModel$deleteEventByIds$1.L$0 = this;
                klineEventCalendarViewModel$deleteEventByIds$1.label = 1;
                if (mjbCopydefault.KWHzl(list, klineEventCalendarViewModel$deleteEventByIds$1) == objCopydefault) {
                    return objCopydefault;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                pgz = this;
                pUU.copydefault(pgz.copydefault, "deleteEventByIds error: " + th.getMessage());
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pgz = (pGZ) klineEventCalendarViewModel$deleteEventByIds$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(pgz.copydefault, "deleteEventByIds error: " + th.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super KlineEventCalendarEntity> continuation) throws java.lang.Throwable {
        KlineEventCalendarViewModel$getEventCalendarById$1 klineEventCalendarViewModel$getEventCalendarById$1;
        pGZ pgz;
        pGZ pgz2;
        KlineEventCalendarEntity klineEventCalendarEntity;
        if (continuation instanceof KlineEventCalendarViewModel$getEventCalendarById$1) {
            klineEventCalendarViewModel$getEventCalendarById$1 = (KlineEventCalendarViewModel$getEventCalendarById$1) continuation;
            int i = klineEventCalendarViewModel$getEventCalendarById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineEventCalendarViewModel$getEventCalendarById$1.label = i - Integer.MIN_VALUE;
            } else {
                klineEventCalendarViewModel$getEventCalendarById$1 = new KlineEventCalendarViewModel$getEventCalendarById$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = klineEventCalendarViewModel$getEventCalendarById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineEventCalendarViewModel$getEventCalendarById$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            try {
                mJB mjbCopydefault = copydefault();
                klineEventCalendarViewModel$getEventCalendarById$1.L$0 = this;
                klineEventCalendarViewModel$getEventCalendarById$1.label = 1;
                objAEQbTJ = mjbCopydefault.AEQbTJ(str, klineEventCalendarViewModel$getEventCalendarById$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                pgz2 = this;
            } catch (java.lang.Throwable th) {
                th = th;
                pgz = this;
                pUU.copydefault(pgz.copydefault, "getEventCalendarById error: " + th.getMessage());
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                klineEventCalendarEntity = (KlineEventCalendarEntity) klineEventCalendarViewModel$getEventCalendarById$1.L$1;
                pgz = (pGZ) klineEventCalendarViewModel$getEventCalendarById$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.copydefault(pgz.copydefault, "getEventCalendarById error: " + th.getMessage());
                }
                if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                    return klineEventCalendarEntity;
                }
                return null;
            }
            pgz2 = (pGZ) klineEventCalendarViewModel$getEventCalendarById$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
            } catch (java.lang.Throwable th3) {
                pgz = pgz2;
                th = th3;
                pUU.copydefault(pgz.copydefault, "getEventCalendarById error: " + th.getMessage());
            }
        }
        KlineEventCalendarEntity klineEventCalendarEntity2 = (KlineEventCalendarEntity) objAEQbTJ;
        if (klineEventCalendarEntity2 != null) {
            pFV pfvOLrzqt = pgz2.OLrzqt();
            long eventId = klineEventCalendarEntity2.getEventId();
            klineEventCalendarViewModel$getEventCalendarById$1.L$0 = pgz2;
            klineEventCalendarViewModel$getEventCalendarById$1.L$1 = klineEventCalendarEntity2;
            klineEventCalendarViewModel$getEventCalendarById$1.label = 2;
            java.lang.Object objKWHzl = pfvOLrzqt.KWHzl(eventId, klineEventCalendarViewModel$getEventCalendarById$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            pgz = pgz2;
            klineEventCalendarEntity = klineEventCalendarEntity2;
            objAEQbTJ = objKWHzl;
            if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super java.util.List<KlineEventCalendarEntity>> continuation) throws java.lang.Throwable {
        KlineEventCalendarViewModel$getAllEvents$1 klineEventCalendarViewModel$getAllEvents$1;
        pGZ pgz;
        if (continuation instanceof KlineEventCalendarViewModel$getAllEvents$1) {
            klineEventCalendarViewModel$getAllEvents$1 = (KlineEventCalendarViewModel$getAllEvents$1) continuation;
            int i = klineEventCalendarViewModel$getAllEvents$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineEventCalendarViewModel$getAllEvents$1.label = i - Integer.MIN_VALUE;
            } else {
                klineEventCalendarViewModel$getAllEvents$1 = new KlineEventCalendarViewModel$getAllEvents$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = klineEventCalendarViewModel$getAllEvents$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineEventCalendarViewModel$getAllEvents$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                mJB mjbCopydefault = copydefault();
                klineEventCalendarViewModel$getAllEvents$1.L$0 = this;
                klineEventCalendarViewModel$getAllEvents$1.label = 1;
                objEZpvd = mjbCopydefault.EZpvd(klineEventCalendarViewModel$getAllEvents$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                pgz = this;
            } catch (java.lang.Throwable th) {
                th = th;
                pgz = this;
                pUU.copydefault(pgz.copydefault, "getAllEvents error: " + th.getMessage());
                return null;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pgz = (pGZ) klineEventCalendarViewModel$getAllEvents$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(pgz.copydefault, "getAllEvents error: " + th.getMessage());
                return null;
            }
        }
        return (java.util.List) objEZpvd;
    }

    public final void KWHzl(java.lang.String str, long j, long j2) {
        if (str.length() > 0) {
            EZpvd(new KlineEventCalendarEntity(str, j, j2, 0L, 0L, 24, null));
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineEventCalendarViewModel$clearCalendarEvents$1(this, null), 3, null);
    }
}
