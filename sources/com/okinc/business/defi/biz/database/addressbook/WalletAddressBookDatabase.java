package com.okinc.business.defi.biz.database.addressbook;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.cGO;
import o.cGT;
import o.cGW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WalletAddressBookDatabase extends RoomDatabase {
    public static volatile WalletAddressBookDatabase EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Activity KWHzl = new Activity();

    public abstract cGW EZpvd();

    public abstract cGT KWHzl();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final WalletAddressBookDatabase copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            WalletAddressBookDatabase walletAddressBookDatabase = WalletAddressBookDatabase.EZpvd;
            if (walletAddressBookDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    walletAddressBookDatabase = (WalletAddressBookDatabase) Room.databaseBuilder(applicationContext, WalletAddressBookDatabase.class, "wallet_address_book.db").addMigrations(WalletAddressBookDatabase.KWHzl).addCallback(new TaskDescription()).build();
                    StateListAnimator stateListAnimator = WalletAddressBookDatabase.Companion;
                    WalletAddressBookDatabase.EZpvd = walletAddressBookDatabase;
                }
            }
            return walletAddressBookDatabase;
        }

        public static final class TaskDescription extends RoomDatabase.Callback {
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
                super.onOpen(supportSQLiteDatabase);
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL("UPDATE address_book SET address = REPLACE(address, 'ronin:', '0x') WHERE address LIKE '%ronin:%' AND chainNames LIKE '%Ronin,%'");
                    supportSQLiteDatabase.execSQL("UPDATE send_coin_record SET address = REPLACE(address, 'ronin:', '0x') WHERE address LIKE '%ronin:%' AND chainName = 'Ronin'");
                    supportSQLiteDatabase.setTransactionSuccessful();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public static final class Activity extends cGO {
        public Activity() {
            super(1, 2);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE address_book ADD COLUMN `smartContract` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE send_coin_record ADD COLUMN `smartContract` INTEGER NOT NULL DEFAULT 0");
        }
    }
}
