package com.okinc.oklive.app.ui.player;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface ILivePlayer {

    /* JADX INFO: loaded from: classes24.dex */
    public interface ActionBar {
        void AEQbTJ();

        void EZpvd();

        boolean KWHzl();

        boolean OLrzqt();

        boolean copydefault();

        void djBIcL();

        void valueOf();
    }

    public interface Activity {
        void EZpvd();

        void KWHzl(int i, String str);

        void OLrzqt(int i, int i2);

        void OLrzqt(@NotNull PlayerState playerState);
    }

    boolean AEQbTJ();

    void AYXKKw();

    void AhwBna();

    void OLrzqt(@NotNull String str);

    void djBIcL();

    void valueOf();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PlayerType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PlayerType[] $VALUES;
        public static final PlayerType VE_LIVE_PLAYER = new PlayerType("VE_LIVE_PLAYER", 0);
        public static final PlayerType RECORDING_VIDEO_PLAYER = new PlayerType("RECORDING_VIDEO_PLAYER", 1);
        public static final PlayerType EXO_PLAYER_LIVE = new PlayerType("EXO_PLAYER_LIVE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PlayerType[] $values() {
            return new PlayerType[]{VE_LIVE_PLAYER, RECORDING_VIDEO_PLAYER, EXO_PLAYER_LIVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PlayerType> getEntries() {
            return $ENTRIES;
        }

        private PlayerType(String str, int i) {
        }

        static {
            PlayerType[] playerTypeArr$values = $values();
            $VALUES = playerTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(playerTypeArr$values);
        }

        public static PlayerType valueOf(String str) {
            return (PlayerType) Enum.valueOf(PlayerType.class, str);
        }

        public static PlayerType[] values() {
            return (PlayerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PlayerState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PlayerState[] $VALUES;
        public static final PlayerState IDLE = new PlayerState("IDLE", 0);
        public static final PlayerState PREPARING = new PlayerState("PREPARING", 1);
        public static final PlayerState PLAYING = new PlayerState("PLAYING", 2);
        public static final PlayerState PAUSED = new PlayerState("PAUSED", 3);
        public static final PlayerState ERROR = new PlayerState(EventType.ERROR, 4);
        public static final PlayerState COMPLETED = new PlayerState("COMPLETED", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PlayerState[] $values() {
            return new PlayerState[]{IDLE, PREPARING, PLAYING, PAUSED, ERROR, COMPLETED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PlayerState> getEntries() {
            return $ENTRIES;
        }

        private PlayerState(String str, int i) {
        }

        static {
            PlayerState[] playerStateArr$values = $values();
            $VALUES = playerStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(playerStateArr$values);
        }

        public static PlayerState valueOf(String str) {
            return (PlayerState) Enum.valueOf(PlayerState.class, str);
        }

        public static PlayerState[] values() {
            return (PlayerState[]) $VALUES.clone();
        }
    }
}
