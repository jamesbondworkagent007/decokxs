package com.okinc.biz.statistics.db;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.okinc.biz.statistics.db.ReportDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C56392yDr;
import o.C6913aYO;
import o.InterfaceC56387yDm;
import o.InterfaceC6905aYG;
import o.InterfaceC6944aYt;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReportDatabase extends RoomDatabase {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String KWHzl = "okex";
    public static final InterfaceC56387yDm<ReportDatabase> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aYR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportDatabase.OLrzqt();
        }
    });

    public abstract InterfaceC6944aYt KWHzl();

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.statistics.db.ReportDatabase.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ReportDatabase AEQbTJ() {
            return (ReportDatabase) ReportDatabase.copydefault.getValue();
        }

        public final <T> InterfaceC6905aYG<T> OLrzqt(@NotNull Class<? extends T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            if (Intrinsics.EZpvd(cls, C6913aYO.class)) {
                InterfaceC6944aYt interfaceC6944aYtKWHzl = AEQbTJ().KWHzl();
                Intrinsics.copydefault(interfaceC6944aYtKWHzl, "");
                return interfaceC6944aYtKWHzl;
            }
            throw new IllegalArgumentException("entityClazz:" + cls + " is not register in ReportDatabase.getDaoByEntity() method");
        }
    }

    public static final ReportDatabase OLrzqt() {
        return (ReportDatabase) Room.databaseBuilder(C43246rlf.OLrzqt.valueOf(), ReportDatabase.class, KWHzl).fallbackToDestructiveMigration().build();
    }

    @Override // androidx.room.RoomDatabase
    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        pUU.KWHzl(KWHzl, "Don't internalInitInvalidationTracker");
    }
}
