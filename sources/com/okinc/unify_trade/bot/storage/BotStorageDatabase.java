package com.okinc.unify_trade.bot.storage;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55986xuL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BotStorageDatabase extends RoomDatabase {
    public static volatile BotStorageDatabase AEQbTJ;
    public static final Activity Companion = new Activity(null);

    public abstract InterfaceC55986xuL AEQbTJ();

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.storage.BotStorageDatabase.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final BotStorageDatabase EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            BotStorageDatabase botStorageDatabase = BotStorageDatabase.AEQbTJ;
            if (botStorageDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    botStorageDatabase = (BotStorageDatabase) Room.databaseBuilder(applicationContext, BotStorageDatabase.class, "bot_storage_database").build();
                    Activity activity = BotStorageDatabase.Companion;
                    BotStorageDatabase.AEQbTJ = botStorageDatabase;
                }
            }
            return botStorageDatabase;
        }
    }
}
