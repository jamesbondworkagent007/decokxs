package com.okinc.components.report.db;

import android.app.Application;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.okinc.base.utils.OkUtils;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.ReportEventDataBase;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58247yxg;
import o.C56392yDr;
import o.C58266yxz;
import o.C59443zhD;
import o.InterfaceC32703mib;
import o.InterfaceC32710mii;
import o.InterfaceC32712mik;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58249yxi;
import o.InterfaceC58251yxk;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReportEventDataBase extends RoomDatabase {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String EZpvd = "okex_report_event";
    public static final InterfaceC56387yDm<ReportEventDataBase> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.miu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportEventDataBase.AEQbTJ();
        }
    });

    public abstract InterfaceC32710mii OLrzqt();

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.report.db.ReportEventDataBase.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ReportEventDataBase copydefault() {
            return (ReportEventDataBase) ReportEventDataBase.AEQbTJ.getValue();
        }

        public final <T> InterfaceC32703mib<T> copydefault(@NotNull Class<? extends T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            if (Intrinsics.EZpvd(cls, EventData.class)) {
                InterfaceC32710mii interfaceC32710miiOLrzqt = copydefault().OLrzqt();
                Intrinsics.copydefault(interfaceC32710miiOLrzqt, "");
                return interfaceC32710miiOLrzqt;
            }
            throw new IllegalArgumentException("entityClazz:" + cls + " is not register in ReportEventDataBase.getDaoByEntity() method");
        }

        public final InterfaceC58217yxC OLrzqt(@NotNull InterfaceC58227yxM<Boolean> interfaceC58227yxM, @NotNull InterfaceC58227yxM<Throwable> interfaceC58227yxM2, @NotNull final InterfaceC32710mii interfaceC32710mii, @NotNull final EventData eventData, @NotNull final String str) {
            Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
            Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
            Intrinsics.checkNotNullParameter(interfaceC32710mii, "");
            Intrinsics.checkNotNullParameter(eventData, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58217yxC interfaceC58217yxCSubscribe = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.mis
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                    ReportEventDataBase.ActionBar.copydefault(interfaceC32710mii, str, eventData, interfaceC58251yxk);
                }
            }).subscribeOn(ReportManager.AEQbTJ.isConnected()).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            return interfaceC58217yxCSubscribe;
        }

        public static final void copydefault(InterfaceC32710mii interfaceC32710mii, String str, EventData eventData, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            EventData eventDataOLrzqt = interfaceC32710mii.OLrzqt(str, EventAction.APP_ENV_RASP.getType());
            pUU.EZpvd("Grafana.Common", "asyncUpdateEnvEvent() \noldData:" + eventDataOLrzqt + " \nnew newData " + eventData);
            if (eventDataOLrzqt != null) {
                eventDataOLrzqt.setAttrs(eventData.getAttrs());
                interfaceC58251yxk.onNext(Boolean.valueOf(interfaceC32710mii.copydefault(eventDataOLrzqt) > 0));
            } else {
                long jKWHzl = interfaceC32710mii.KWHzl(eventData);
                pUU.EZpvd("Grafana.Common", "insert MemoryEvent: " + jKWHzl + " ==>" + eventData);
                interfaceC58251yxk.onNext(Boolean.valueOf(jKWHzl > 0));
            }
            interfaceC58251yxk.onComplete();
        }

        public final InterfaceC58217yxC KWHzl(@NotNull InterfaceC58227yxM<Boolean> interfaceC58227yxM, @NotNull InterfaceC58227yxM<Throwable> interfaceC58227yxM2, @NotNull final InterfaceC32710mii interfaceC32710mii, @NotNull final EventData eventData, @NotNull final String str) {
            Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
            Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
            Intrinsics.checkNotNullParameter(interfaceC32710mii, "");
            Intrinsics.checkNotNullParameter(eventData, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58217yxC interfaceC58217yxCSubscribe = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.miw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                    ReportEventDataBase.ActionBar.KWHzl(interfaceC32710mii, str, eventData, interfaceC58251yxk);
                }
            }).subscribeOn(ReportManager.AEQbTJ.isConnected()).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            return interfaceC58217yxCSubscribe;
        }

        public static final void KWHzl(InterfaceC32710mii interfaceC32710mii, String str, EventData eventData, InterfaceC58251yxk interfaceC58251yxk) {
            Float fFIwbmz;
            Float fFIwbmz2;
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            EventData eventDataOLrzqt = interfaceC32710mii.OLrzqt(str, EventAction.APP_MEMORY.getType());
            pUU.EZpvd("Grafana.Common", "asyncUpdateMemoryEvent() \noldMemoryData:" + eventDataOLrzqt + " \nnew MemoryData " + eventData);
            if (eventDataOLrzqt != null) {
                String str2 = eventDataOLrzqt.getAttrs().get("java_heap_rate");
                float fFloatValue = 0.0f;
                float fFloatValue2 = (str2 == null || (fFIwbmz2 = C59443zhD.fIwbmz(str2)) == null) ? 0.0f : fFIwbmz2.floatValue();
                String str3 = eventData.getAttrs().get("java_heap_rate");
                if (str3 != null && (fFIwbmz = C59443zhD.fIwbmz(str3)) != null) {
                    fFloatValue = fFIwbmz.floatValue();
                }
                if (fFloatValue2 < fFloatValue) {
                    eventDataOLrzqt.setAttrs(eventData.getAttrs());
                    interfaceC58251yxk.onNext(Boolean.valueOf(interfaceC32710mii.copydefault(eventDataOLrzqt) > 0));
                } else {
                    pUU.EZpvd("Grafana.Common", "no need  update MemoryEvent");
                    interfaceC58251yxk.onNext(Boolean.TRUE);
                }
            } else {
                long jKWHzl = interfaceC32710mii.KWHzl(eventData);
                pUU.EZpvd("Grafana.Common", "insert MemoryEvent: " + jKWHzl + " ==>" + eventData);
                interfaceC58251yxk.onNext(Boolean.valueOf(jKWHzl > 0));
            }
            interfaceC58251yxk.onComplete();
        }

        public static final long[] OLrzqt(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (long[]) function1.invoke(obj);
        }

        public final <T extends InterfaceC32712mik> InterfaceC58217yxC copydefault(@NotNull InterfaceC58227yxM<long[]> interfaceC58227yxM, @NotNull InterfaceC58227yxM<Throwable> interfaceC58227yxM2, @NotNull final InterfaceC32703mib<T> interfaceC32703mib, @NotNull T... tArr) {
            Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
            Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
            Intrinsics.checkNotNullParameter(interfaceC32703mib, "");
            Intrinsics.checkNotNullParameter(tArr, "");
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(tArr);
            final Function1 function1 = new Function1() { // from class: o.miq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ReportEventDataBase.ActionBar.AEQbTJ(interfaceC32703mib, (InterfaceC32712mik[]) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.miv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ReportEventDataBase.ActionBar.OLrzqt(function1, obj);
                }
            }).subscribeOn(ReportManager.AEQbTJ.isConnected()).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            return interfaceC58217yxCSubscribe;
        }

        public static final long[] AEQbTJ(InterfaceC32703mib interfaceC32703mib, InterfaceC32712mik[] interfaceC32712mikArr) {
            Intrinsics.checkNotNullParameter(interfaceC32712mikArr, "");
            return interfaceC32703mib.KWHzl(Arrays.copyOf(interfaceC32712mikArr, interfaceC32712mikArr.length));
        }

        public final <T extends InterfaceC32712mik> InterfaceC58217yxC AEQbTJ(@NotNull InterfaceC58227yxM<List<T>> interfaceC58227yxM, @NotNull InterfaceC58227yxM<Throwable> interfaceC58227yxM2, @NotNull final InterfaceC32703mib<T> interfaceC32703mib, final int i) {
            Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
            Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
            Intrinsics.checkNotNullParameter(interfaceC32703mib, "");
            InterfaceC58217yxC interfaceC58217yxCSubscribe = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.mit
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                    ReportEventDataBase.ActionBar.KWHzl(interfaceC32703mib, i, interfaceC58251yxk);
                }
            }).subscribeOn(ReportManager.AEQbTJ.isConnected()).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            return interfaceC58217yxCSubscribe;
        }

        public static final void KWHzl(InterfaceC32703mib interfaceC32703mib, int i, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            interfaceC58251yxk.onNext(ReportEventDataBase.Companion.KWHzl(interfaceC32703mib, i));
            interfaceC58251yxk.onComplete();
        }

        public final <T extends InterfaceC32712mik> List<T> KWHzl(@NotNull InterfaceC32703mib<T> interfaceC32703mib, int i) {
            Intrinsics.checkNotNullParameter(interfaceC32703mib, "");
            try {
                return interfaceC32703mib.EZpvd(i);
            } catch (Exception unused) {
                return yDY.AhwBna();
            }
        }

        public final <T extends InterfaceC32712mik> InterfaceC58217yxC KWHzl(@NotNull InterfaceC58227yxM<Integer> interfaceC58227yxM, @NotNull InterfaceC58227yxM<Throwable> interfaceC58227yxM2, @NotNull final InterfaceC32703mib<T> interfaceC32703mib, @NotNull final T... tArr) {
            Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
            Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
            Intrinsics.checkNotNullParameter(interfaceC32703mib, "");
            Intrinsics.checkNotNullParameter(tArr, "");
            InterfaceC58217yxC interfaceC58217yxCSubscribe = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.mir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                    ReportEventDataBase.ActionBar.KWHzl(interfaceC32703mib, tArr, interfaceC58251yxk);
                }
            }).subscribeOn(ReportManager.AEQbTJ.isConnected()).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
            return interfaceC58217yxCSubscribe;
        }

        public static final void KWHzl(InterfaceC32703mib interfaceC32703mib, InterfaceC32712mik[] interfaceC32712mikArr, InterfaceC58251yxk interfaceC58251yxk) {
            Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
            interfaceC58251yxk.onNext(Integer.valueOf(interfaceC32703mib.AEQbTJ(Arrays.copyOf(interfaceC32712mikArr, interfaceC32712mikArr.length))));
            interfaceC58251yxk.onComplete();
        }
    }

    public static final ReportEventDataBase AEQbTJ() {
        Application applicationAEQbTJ = OkUtils.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(applicationAEQbTJ, "");
        return (ReportEventDataBase) Room.databaseBuilder(applicationAEQbTJ, ReportEventDataBase.class, EZpvd).fallbackToDestructiveMigration().build();
    }

    @Override // androidx.room.RoomDatabase
    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        pUU.KWHzl(EZpvd, "Don't internalInitInvalidationTracker");
    }
}
