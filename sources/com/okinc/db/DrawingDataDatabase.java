package com.okinc.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC31950mJy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DrawingDataDatabase extends RoomDatabase {
    public static final Application Companion = new Application(null);
    public static volatile DrawingDataDatabase OLrzqt;

    public abstract InterfaceC31950mJy KWHzl();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.db.DrawingDataDatabase.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final DrawingDataDatabase AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            DrawingDataDatabase drawingDataDatabase = DrawingDataDatabase.OLrzqt;
            if (drawingDataDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    drawingDataDatabase = (DrawingDataDatabase) Room.databaseBuilder(applicationContext, DrawingDataDatabase.class, "klineDrawingData.db").build();
                    Application application = DrawingDataDatabase.Companion;
                    DrawingDataDatabase.OLrzqt = drawingDataDatabase;
                }
            }
            return drawingDataDatabase;
        }
    }
}
