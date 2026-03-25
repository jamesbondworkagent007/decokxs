package com.okinc.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mJB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class KlineEventCalendarDatabase extends RoomDatabase {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static volatile KlineEventCalendarDatabase copydefault;

    public abstract mJB copydefault();

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.db.KlineEventCalendarDatabase.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final KlineEventCalendarDatabase OLrzqt(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            KlineEventCalendarDatabase klineEventCalendarDatabase = KlineEventCalendarDatabase.copydefault;
            if (klineEventCalendarDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    klineEventCalendarDatabase = (KlineEventCalendarDatabase) Room.databaseBuilder(applicationContext, KlineEventCalendarDatabase.class, "klineEventCalendar.db").build();
                    TaskDescription taskDescription = KlineEventCalendarDatabase.Companion;
                    KlineEventCalendarDatabase.copydefault = klineEventCalendarDatabase;
                }
            }
            return klineEventCalendarDatabase;
        }
    }
}
