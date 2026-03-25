package com.okinc.market.alert.database;

import android.app.Application;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.okinc.market.alert.database.MarketAlertDataBase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C56392yDr;
import o.InterfaceC38367pWd;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MarketAlertDataBase extends RoomDatabase {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final InterfaceC56387yDm<MarketAlertDataBase> KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pWq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarketAlertDataBase.OLrzqt();
        }
    });

    public abstract InterfaceC38367pWd copydefault();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.alert.database.MarketAlertDataBase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final MarketAlertDataBase EZpvd() {
            return (MarketAlertDataBase) MarketAlertDataBase.KWHzl.getValue();
        }

        public static /* synthetic */ MarketAlertDataBase instance$default(StateListAnimator stateListAnimator, Application application, int i, Object obj) {
            if ((i & 1) != 0) {
                application = C43246rlf.OLrzqt.valueOf();
            }
            return stateListAnimator.EZpvd(application);
        }

        public final MarketAlertDataBase EZpvd(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            return EZpvd();
        }
    }

    public static final MarketAlertDataBase OLrzqt() {
        return (MarketAlertDataBase) Room.databaseBuilder(C43246rlf.OLrzqt.valueOf(), MarketAlertDataBase.class, "market_alert_db_2").build();
    }
}
